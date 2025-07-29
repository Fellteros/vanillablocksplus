package net.fellter.vanillablocksplus.custom_blocks.concrete_powder;

import net.fellter.vanillablocksplus.custom_blocks.falling.FallingTrapdoorBlock;

import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class ConcretePowderTrapdoorBlock extends FallingTrapdoorBlock implements Falling {
    private final BlockState hardenedState;

    public ConcretePowderTrapdoorBlock(BlockSetType type, AbstractBlock.Settings settings, Block hardened) {
        super(type, settings);
        this.hardenedState = hardened.getDefaultState();
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (shouldHarden(world, pos, currentStateInPos) && pos != null) {
            world.setBlockState(pos, this.hardenedState
                    .with(FACING, world.getBlockState(pos).get(FACING))
                    .with(POWERED, world.getBlockState(pos).get(POWERED))
                    .with(OPEN, world.getBlockState(pos).get(OPEN))
                    .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED)), Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World blockView = ctx.getWorld();
        BlockState placementState = super.getPlacementState(ctx);
        if (shouldHarden(blockView, blockPos, blockView.getBlockState(blockPos))) {
            if (placementState != null) {
                return this.hardenedState
                        .with(FACING, placementState.get(FACING))
                        .with(POWERED, placementState.get(POWERED))
                        .with(OPEN, placementState.get(OPEN))
                        .with(WATERLOGGED, placementState.get(WATERLOGGED));
            }
        }
        return super.getPlacementState(ctx);
    }


    private static boolean shouldHarden(BlockView world, BlockPos pos, BlockState state) {
        return hardensIn(state) || hardensOnAnySide(world, pos);
    }

    private static boolean hardensOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction direction : Direction.values()) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction == Direction.DOWN && !hardensIn(blockState)) continue;
            mutable.set(pos, direction);
            blockState = world.getBlockState(mutable);
            if (!hardensIn(blockState) || blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    private static boolean hardensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (hardensOnAnySide(world, pos)) {
            return this.hardenedState
                    .with(FACING, world.getBlockState(pos).get(FACING))
                    .with(POWERED, world.getBlockState(pos).get(POWERED))
                    .with(OPEN, world.getBlockState(pos).get(OPEN))
                    .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED));
        }
        tickView.scheduleBlockTick(pos, this, this.getFallDelay());
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }




    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canFallThrough(world.getBlockState(pos.down())) || pos.getY() < world.getBottomY()) {
            return;
        }
        FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
        this.configureFallingBlockEntity(fallingBlockEntity);
    }


    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.FIRE) || state.isLiquid() || state.isReplaceable();
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0 && canFallThrough(world.getBlockState(pos.down()))) {
            ParticleUtil.spawnParticle(world, pos, random, new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state));
        }
    }
}

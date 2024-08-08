package net.fellter.vanillablocksplus.custom_blocks.concrete_powder;

import net.fellter.vanillablocksplus.custom_blocks.falling.FallingFenceBlock;
import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Map;

public class ConcretePowderFenceBlock extends FallingFenceBlock implements LandingBlock {
    private final BlockState hardenedState;

    public ConcretePowderFenceBlock(Settings settings, Block hardened) {
        super(settings);
        this.hardenedState = hardened.getDefaultState();
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        FluidState fluidState = world.getFluidState(pos);
        BlockState state = fallingBlockState;
        for (Map.Entry<Direction, BooleanProperty> entry : HorizontalConnectingBlock.FACING_PROPERTIES.entrySet()) {
            Direction direction = entry.getKey();
            BooleanProperty property = entry.getValue();

            BlockPos neighborBlockPos = pos.offset(direction);
            BlockState neighborBlockState = world.getBlockState(neighborBlockPos);
            boolean isSideSolidFullSquare = neighborBlockState.isSideSolidFullSquare(world, neighborBlockPos, direction);
            state = state.with(property, this.canConnect(neighborBlockState, isSideSolidFullSquare, direction));
        }

        world.setBlockState(pos, state);

        if (shouldHarden(world, pos, state)) {
            world.setBlockState(pos, this.hardenedState
                    .with(EAST, world.getBlockState(pos).get(EAST))
                    .with(SOUTH, world.getBlockState(pos).get(SOUTH))
                    .with(NORTH, world.getBlockState(pos).get(NORTH))
                    .with(WEST, world.getBlockState(pos).get(WEST))
                    .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED)));
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
                        .with(EAST, placementState.get(EAST))
                        .with(SOUTH, placementState.get(SOUTH))
                        .with(NORTH, placementState.get(NORTH))
                        .with(WEST, placementState.get(WEST))
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
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (hardensOnAnySide(world, pos)) {
            return this.hardenedState
                    .with(EAST, world.getBlockState(pos).get(EAST))
                    .with(WEST, world.getBlockState(pos).get(WEST))
                    .with(NORTH, world.getBlockState(pos).get(NORTH))
                    .with(SOUTH, world.getBlockState(pos).get(SOUTH))
                    .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED));
        }
        world.scheduleBlockTick(pos, this, this.getFallDelay());
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
    }


    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canFallThrough(world.getBlockState(pos.down())) || pos.getY() < world.getBottomY()) {
            return;
        }
        FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
        this.configureFallingBlockEntity(fallingBlockEntity);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
    }

    protected int getFallDelay() {
        return 2;
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

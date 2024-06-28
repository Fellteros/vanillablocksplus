package net.fellter.vanillablocksplus.custom_blocks.falling;

import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Map;

public class FallingFenceBlock extends FenceBlock implements LandingBlock {
    public FallingFenceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
        if (pos != null) {
            world.setBlockState(pos, this.getDefaultState()
                            .with(WEST, world.getBlockState(pos).get(WEST))
                            .with(EAST, world.getBlockState(pos).get(EAST))
                            .with(SOUTH, world.getBlockState(pos).get(SOUTH))
                            .with(NORTH, world.getBlockState(pos).get(NORTH))
                            .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED)),
                    FallingFenceBlock.NOTIFY_ALL);
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canFallThrough(world.getBlockState(pos.down())) || pos.getY() < world.getBottomY()) {
            return;
        }
        FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
        this.configureFallingBlockEntity(fallingBlockEntity);
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
        world.setBlockState(pos, state.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER));
    }

    protected void configureFallingBlockEntity(FallingBlockEntity fallingBlockEntity) {
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

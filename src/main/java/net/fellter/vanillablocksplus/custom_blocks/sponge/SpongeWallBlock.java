package net.fellter.vanillablocksplus.custom_blocks.sponge;

import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

public class SpongeWallBlock extends WallBlock {
    private static final Direction[] field_43257 = Direction.values();

    public SpongeWallBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.update(world, pos);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
            world.setBlockState(pos, ModBlocks.WET_SPONGE_WALL.getDefaultState()
                            .with(UP, world.getBlockState(pos).get(UP))
                            .with(NORTH_SHAPE, world.getBlockState(pos).get(NORTH_SHAPE))
                            .with(EAST_SHAPE, world.getBlockState(pos).get(EAST_SHAPE))
                            .with(WEST_SHAPE, world.getBlockState(pos).get(WEST_SHAPE))
                            .with(NORTH_SHAPE, world.getBlockState(pos).get(NORTH_SHAPE))
                            .with(SOUTH_SHAPE, world.getBlockState(pos).get(SOUTH_SHAPE)),
                    Block.NOTIFY_LISTENERS);
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(Blocks.WATER.getDefaultState()));
        }
    }

    private boolean absorbWater(World world, BlockPos pos) {
        return BlockPos.iterateRecursively(pos, 6, 65, (currentPos, queuer) -> {
            for (Direction direction : field_43257) {
                queuer.accept(currentPos.offset(direction));
            }
        }, currentPos -> {
            FluidDrainable fluidDrainable;
            if (currentPos.equals(pos)) {
                return true;
            }
            BlockState blockState = world.getBlockState(currentPos);
            FluidState fluidState = world.getFluidState(currentPos);
            if (!fluidState.isIn(FluidTags.WATER)) {
                return false;
            }
            Block block = blockState.getBlock();
            if (block instanceof FluidDrainable && !((FluidDrainable) block).tryDrainFluid(null, world, currentPos, blockState).isEmpty()) {
                return true;
            }
            if (blockState.getBlock() instanceof FluidBlock) {
                world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
            } else if (blockState.isOf(Blocks.KELP) || blockState.isOf(Blocks.KELP_PLANT) || blockState.isOf(Blocks.SEAGRASS) || blockState.isOf(Blocks.TALL_SEAGRASS)) {
                BlockEntity blockEntity = blockState.hasBlockEntity() ? world.getBlockEntity(currentPos) : null;
                SpongeBlock.dropStacks(blockState, world, currentPos, blockEntity);
                world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
            } else {
                return false;
            }
            return true;
        }) > 1;
    }
}

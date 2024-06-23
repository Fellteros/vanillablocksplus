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

public class SpongeFenceGateBlock extends FenceGateBlock {
    private static final Direction[] field_43257 = Direction.values();

    public SpongeFenceGateBlock(Settings settings, WoodType type) {
        super(settings, type);
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
            world.setBlockState(pos, ModBlocks.WET_SPONGE_FENCE_GATE.getDefaultState()
                            .with(FACING, world.getBlockState(pos).get(FACING))
                            .with(OPEN, world.getBlockState(pos).get(OPEN))
                            .with(POWERED, world.getBlockState(pos).get(POWERED))
                            .with(IN_WALL, world.getBlockState(pos).get(IN_WALL)),
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
            if (currentPos.equals(pos)) {
                return true;
            }
            BlockState blockState = world.getBlockState(currentPos);
            FluidState fluidState = world.getFluidState(currentPos);
            if (!fluidState.isIn(FluidTags.WATER)) {
                return false;
            }
            Block block = blockState.getBlock();
            if (block instanceof FluidDrainable && !((FluidDrainable) block).tryDrainFluid(world, currentPos, blockState).isEmpty()) {
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

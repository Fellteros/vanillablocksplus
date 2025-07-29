package net.fellter.vanillablocksplus.custom_blocks.sponge;

import org.jetbrains.annotations.Nullable;

import net.fellter.vanillablocksplus.block.ModBlocks2;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.block.WireOrientation;

public class SpongeTrapdoorBlock extends TrapdoorBlock {
    private static final Direction[] field_43257 = Direction.values();

    public SpongeTrapdoorBlock(BlockSetType type, AbstractBlock.Settings settings) {
        super(type, settings);
    }


    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.update(world, pos);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, @Nullable WireOrientation wireOrientation, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, sourceBlock, wireOrientation, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
            world.setBlockState(pos, ModBlocks2.WET_SPONGE_TRAPDOOR.getDefaultState()
                            .with(POWERED, world.getBlockState(pos).get(POWERED))
                            .with(HALF, world.getBlockState(pos).get(HALF))
                            .with(OPEN, world.getBlockState(pos).get(OPEN))
                            .with(FACING, world.getBlockState(pos).get(FACING)),
                    Block.NOTIFY_LISTENERS);
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(Blocks.WATER.getDefaultState()));
        }
    }

    private boolean absorbWater(World world, BlockPos pos) {
        return BlockPos.iterateRecursively(pos, 6, 65, (currentPos, queuer) -> {

            for (Direction direction : DIRECTIONS) {
                queuer.accept(currentPos.offset(direction));
            }

        }, (currentPos) -> {
            if (currentPos.equals(pos)) {
                return BlockPos.IterationState.ACCEPT;
            } else {
                BlockState blockState = world.getBlockState(currentPos);
                FluidState fluidState = world.getFluidState(currentPos);
                if (!fluidState.isIn(FluidTags.WATER)) {
                    return BlockPos.IterationState.SKIP;
                } else {
                    Block block = blockState.getBlock();
                    if (block instanceof FluidDrainable fluidDrainable) {
                        if (!fluidDrainable.tryDrainFluid(null, world, currentPos, blockState).isEmpty()) {
                            return BlockPos.IterationState.ACCEPT;
                        }
                    }

                    if (blockState.getBlock() instanceof FluidBlock) {
                        world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 3);
                    } else {
                        if (!blockState.isOf(Blocks.KELP) && !blockState.isOf(Blocks.KELP_PLANT) && !blockState.isOf(Blocks.SEAGRASS) && !blockState.isOf(Blocks.TALL_SEAGRASS)) {
                            return BlockPos.IterationState.SKIP;
                        }

                        BlockEntity blockEntity = blockState.hasBlockEntity() ? world.getBlockEntity(currentPos) : null;
                        dropStacks(blockState, world, currentPos, blockEntity);
                        world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 3);
                    }

                    return BlockPos.IterationState.ACCEPT;
                }
            }
        }) > 1;
    }
}

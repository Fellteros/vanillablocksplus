package net.fellter.vanillablocksplus.custom_blocks.concrete_powder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class ConcretePowderFenceBlock extends FenceBlock {
    private final BlockState hardenedState;

    public ConcretePowderFenceBlock(Settings settings, Block hardened) {
        super(settings);
        this.hardenedState = hardened.getDefaultState();
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
            return this.hardenedState;
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
}

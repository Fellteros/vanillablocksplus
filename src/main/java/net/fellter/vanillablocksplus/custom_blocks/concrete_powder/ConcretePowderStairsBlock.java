package net.fellter.vanillablocksplus.custom_blocks.concrete_powder;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class ConcretePowderStairsBlock extends StairsBlock {
    private final BlockState hardenedState;

    public ConcretePowderStairsBlock(BlockState baseBlockState, Settings settings, Block hardened) {
        super(baseBlockState, settings);
        this.hardenedState = hardened.getDefaultState();
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getSide();
        BlockPos blockPos = ctx.getBlockPos();
        World blockView = ctx.getWorld();
        BlockState placementState = super.getPlacementState(ctx);
        if (shouldHarden(blockView, blockPos, blockView.getBlockState(blockPos))) {
            if (placementState != null) {
                return this.hardenedState
                        .with(WATERLOGGED, placementState.get(WATERLOGGED))
                        .with(FACING, ctx.getHorizontalPlayerFacing())
                        .with(HALF, direction == Direction.DOWN || direction != Direction.UP && ctx.getHitPos().y - (double)blockPos.getY() > 0.5 ? BlockHalf.TOP : BlockHalf.BOTTOM)
                        .with(SHAPE, placementState.get(SHAPE));
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

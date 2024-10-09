package net.fellter.vanillablocksplus.custom_blocks.glass;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GlassSlabBlock extends SlabBlock {
    public GlassSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }


    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.getBlock() instanceof GlassSlabBlock && isInvisibleToSlab(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassStairsBlock && isInvisibleToStairs(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassTrapdoorBlock && isInvisibleToTrapdoor(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassDoorBlock && isInvisibleToDoor(stateFrom, direction)) {
            return true;
        }

        return stateFrom.getBlock() instanceof TransparentBlock;
    }

    //DONE
    private boolean isInvisibleToStairs(BlockState state, BlockState stateFrom, Direction direction) {
        SlabType type = state.get(TYPE);
        Direction facingFrom = stateFrom.get(StairsBlock.FACING);
        BlockHalf halfFrom = stateFrom.get(StairsBlock.HALF);
        StairShape shapeFrom = stateFrom.get(StairsBlock.SHAPE);

        if ((direction != Direction.UP && type == SlabType.BOTTOM && halfFrom == BlockHalf.BOTTOM) ||
                (direction != Direction.DOWN && type == SlabType.TOP && halfFrom == BlockHalf.TOP) ||
                (direction == Direction.UP && halfFrom == BlockHalf.BOTTOM && type == SlabType.TOP) ||
                (direction == Direction.UP && halfFrom == BlockHalf.BOTTOM && type == SlabType.DOUBLE) ||
                (direction == Direction.DOWN && halfFrom == BlockHalf.TOP && type == SlabType.DOUBLE) ||
                (direction == Direction.DOWN && halfFrom == BlockHalf.TOP && type == SlabType.BOTTOM)) return true;

        return type == SlabType.DOUBLE && ((direction == facingFrom.getOpposite()) ||
                (direction == facingFrom.rotateYCounterclockwise() && shapeFrom == StairShape.INNER_RIGHT) ||
                (direction == facingFrom.rotateYClockwise() && shapeFrom == StairShape.INNER_LEFT));
    }

    //DONE
    private boolean isInvisibleToSlab(BlockState state, BlockState stateFrom, Direction direction) {
        SlabType type = state.get(TYPE);
        SlabType typeFrom = stateFrom.get(TYPE);

        return (direction == Direction.UP && type == SlabType.TOP && typeFrom == SlabType.BOTTOM) ||
                (direction == Direction.UP && type == SlabType.TOP && typeFrom == SlabType.DOUBLE) ||
                (direction == Direction.UP && type == SlabType.DOUBLE && typeFrom == SlabType.DOUBLE) ||
                (direction == Direction.UP && type == SlabType.DOUBLE && typeFrom == SlabType.BOTTOM) ||
                (direction == Direction.DOWN && type == SlabType.BOTTOM && typeFrom == SlabType.TOP) ||
                (direction == Direction.DOWN && type == SlabType.BOTTOM && typeFrom == SlabType.DOUBLE) ||
                (direction == Direction.DOWN && type == SlabType.DOUBLE && typeFrom == SlabType.DOUBLE) ||
                (direction == Direction.DOWN && type == SlabType.DOUBLE && typeFrom == SlabType.TOP) ||
                (direction.getAxis().isHorizontal() && (type == typeFrom || typeFrom == SlabType.DOUBLE));
    }

    //DONE
    private boolean isInvisibleToTrapdoor(BlockState state, BlockState stateFrom, Direction direction) {
        SlabType type = state.get(TYPE);
        Boolean openFrom = stateFrom.get(TrapdoorBlock.OPEN);
        BlockHalf halfFrom = stateFrom.get(TrapdoorBlock.HALF);
        Direction facingFrom = stateFrom.get(TrapdoorBlock.FACING);

        if (!openFrom && ((direction == Direction.DOWN && type == SlabType.BOTTOM && halfFrom == BlockHalf.TOP) ||
                (direction == Direction.UP && type == SlabType.TOP && halfFrom == BlockHalf.BOTTOM) ||
                (direction == Direction.DOWN && type == SlabType.DOUBLE && halfFrom == BlockHalf.TOP) ||
                (direction == Direction.UP && type == SlabType.DOUBLE && halfFrom == BlockHalf.BOTTOM))) return true;

        return openFrom && direction == facingFrom;
    }

    //DONE
    private boolean isInvisibleToDoor(BlockState stateFrom, Direction direction) {
        Direction facingFrom = stateFrom.get(DoorBlock.FACING);
        Boolean openFrom = stateFrom.get(DoorBlock.OPEN);
        DoorHinge hingeFrom = stateFrom.get(DoorBlock.HINGE);

        return (facingFrom == direction && !openFrom) ||
                (facingFrom == direction.rotateYCounterclockwise() && hingeFrom == DoorHinge.LEFT && openFrom) ||
                (facingFrom == direction.rotateYClockwise() && hingeFrom == DoorHinge.RIGHT && openFrom);
    }
}

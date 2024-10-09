package net.fellter.vanillablocksplus.custom_blocks.glass;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.structure.StrongholdGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GlassTrapdoorBlock extends TrapdoorBlock {
    public GlassTrapdoorBlock(BlockSetType type, AbstractBlock.Settings settings) {
        super(type, settings);
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

        if (stateFrom.getBlock() instanceof GlassDoorBlock && isInvisibleToDoor(state, stateFrom, direction)) {
            return true;
        }

        return stateFrom.getBlock() instanceof TransparentBlock;
    }

    //DONE
    private boolean isInvisibleToSlab(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        BlockHalf half = state.get(HALF);
        SlabType typeFrom = stateFrom.get(SlabBlock.TYPE);

        return (direction == Direction.UP && half == BlockHalf.TOP && (typeFrom == SlabType.BOTTOM || typeFrom == SlabType.DOUBLE) && !open) ||
                (direction == Direction.DOWN && half == BlockHalf.BOTTOM && (typeFrom == SlabType.TOP || typeFrom == SlabType.DOUBLE) && !open) ||
                (direction == facing.getOpposite() && open && typeFrom == SlabType.DOUBLE);
    }

    //DONE
    private boolean isInvisibleToStairs(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        Direction facingFrom = stateFrom.get(StairsBlock.FACING);
        StairShape shapeFrom = stateFrom.get(StairsBlock.SHAPE);

        return direction == facing.getOpposite() && open &&
                ((facing == facingFrom && (shapeFrom == StairShape.STRAIGHT || shapeFrom == StairShape.INNER_LEFT || shapeFrom == StairShape.INNER_RIGHT)) ||
                        (facingFrom == facing.rotateYClockwise() && shapeFrom == StairShape.INNER_LEFT) ||
                        (facingFrom == facing.rotateYCounterclockwise() && shapeFrom == StairShape.INNER_RIGHT));

    }

    //DONE
    private boolean isInvisibleToTrapdoor(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        BlockHalf half = state.get(HALF);
        Direction facingFrom = stateFrom.get(FACING);
        Boolean openFrom = stateFrom.get(OPEN);
        BlockHalf halfFrom = stateFrom.get(HALF);

        if ((direction == Direction.UP && facing == facingFrom && open && openFrom) ||
                (direction == Direction.DOWN && facing == facingFrom && open && openFrom)) return true;

        if (!open && !openFrom && ((direction == Direction.UP && half == BlockHalf.TOP && halfFrom == BlockHalf.BOTTOM) ||
                (direction == Direction.DOWN && half == BlockHalf.BOTTOM && halfFrom == BlockHalf.TOP))) return true;

        return open && openFrom && (direction == facing.getOpposite() && facingFrom == facing.getOpposite());
    }

    //DONE
    private boolean isInvisibleToDoor(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        Direction facingFrom = stateFrom.get(DoorBlock.FACING);
        DoorHinge hingeFrom = stateFrom.get(DoorBlock.HINGE);
        Boolean openFrom = stateFrom.get(DoorBlock.OPEN);

        return direction == facing.getOpposite() && open && (facingFrom == facing.getOpposite() && !openFrom) ||
                (facingFrom == facing.rotateYCounterclockwise() && hingeFrom == DoorHinge.RIGHT && openFrom) ||
                (facingFrom == facing.rotateYClockwise() && hingeFrom == DoorHinge.LEFT && openFrom);
    }
}

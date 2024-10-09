package net.fellter.vanillablocksplus.custom_blocks.glass;

import net.minecraft.block.*;
import net.minecraft.block.enums.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GlassDoorBlock extends DoorBlock {
    public GlassDoorBlock(BlockSetType blockSetType, Settings settings) {
        super(blockSetType, settings);
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

    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.getBlock() instanceof GlassSlabBlock && isInvisibleToSlab(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassStairsBlock && isInvisibleToStairs(state, stateFrom)) {
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
        DoorHinge hinge = state.get(HINGE);
        SlabType typeFrom = stateFrom.get(SlabBlock.TYPE);

        return typeFrom == SlabType.DOUBLE && ((facing == direction.getOpposite() && !open) ||
                (facing == direction.rotateYClockwise() && hinge == DoorHinge.LEFT && open) ||
                (facing == direction.rotateYCounterclockwise() && hinge == DoorHinge.RIGHT && open));
    }

    //DONE
    private boolean isInvisibleToStairs(BlockState state, BlockState stateFrom) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        Direction facingFrom = stateFrom.get(StairsBlock.FACING);
        StairShape shapeFrom = stateFrom.get(StairsBlock.SHAPE);

        if (facing == facingFrom && !open && ((shapeFrom == StairShape.STRAIGHT) || (shapeFrom == StairShape.INNER_LEFT) || (shapeFrom == StairShape.INNER_RIGHT))) return true;

        return (facingFrom == facing.rotateYClockwise() && shapeFrom == StairShape.INNER_LEFT && !open) ||
                (facingFrom == facing.rotateYCounterclockwise() && shapeFrom == StairShape.INNER_RIGHT && !open);
    }

    //DONE
    private boolean isInvisibleToTrapdoor(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        DoorHinge hinge = state.get(HINGE);
        Direction facingFrom = stateFrom.get(TrapdoorBlock.FACING);
        Boolean openFrom = stateFrom.get(OPEN);

        return openFrom && ((direction == facing.getOpposite() && facingFrom == facing.getOpposite() && !open) ||
                (direction == facing.rotateYClockwise() && facingFrom == facing.rotateYClockwise() && hinge == DoorHinge.RIGHT && open) ||
                (direction == facing.rotateYCounterclockwise() && facingFrom == facing.rotateYCounterclockwise() && hinge == DoorHinge.LEFT && open));
    }

    //DONE
    private boolean isInvisibleToDoor(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Boolean open = state.get(OPEN);
        DoorHinge hinge = state.get(HINGE);
        Direction facingFrom = stateFrom.get(DoorBlock.FACING);
        Boolean openFrom = stateFrom.get(DoorBlock.OPEN);
        DoorHinge hingeFrom = stateFrom.get(DoorBlock.HINGE);

        return (facingFrom == facing.getOpposite() && !open && !openFrom) ||
                (direction == facing.rotateYClockwise() && facingFrom == facing.rotateYClockwise() && hinge == DoorHinge.RIGHT && open && !openFrom) ||
                (direction == facing.rotateYCounterclockwise() && facingFrom == facing.rotateYCounterclockwise() && hinge == DoorHinge.LEFT && open && !openFrom) ||
                (direction == facing.getOpposite() && facingFrom == facing.rotateYCounterclockwise() && hingeFrom == DoorHinge.RIGHT && !open && openFrom) ||
                (direction == facing.getOpposite() && facingFrom == facing.rotateYClockwise() && hingeFrom == DoorHinge.LEFT && !open && openFrom);
    }
}

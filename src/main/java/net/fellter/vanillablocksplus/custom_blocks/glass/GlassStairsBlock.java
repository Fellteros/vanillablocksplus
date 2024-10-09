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

import static net.minecraft.block.enums.StairShape.*;

public class GlassStairsBlock extends StairsBlock {

    public GlassStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
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
    private boolean isInvisibleToTrapdoor(BlockState state, BlockState stateFrom, Direction direction) {
        Boolean openFrom = stateFrom.get(TrapdoorBlock.OPEN);
        BlockHalf halfFrom = stateFrom.get(TrapdoorBlock.HALF);
        Direction facingFrom = stateFrom.get(TrapdoorBlock.FACING);
        Direction facing = state.get(FACING);

        return (direction == Direction.UP && halfFrom == BlockHalf.BOTTOM && !openFrom) ||
                (direction == Direction.DOWN && halfFrom == BlockHalf.TOP && !openFrom) ||
                (direction == facing && facingFrom == facing && openFrom) ||
                (direction == facing.getOpposite() && facingFrom == facing.getOpposite() && openFrom) ||
                (direction == facing.rotateYClockwise() && facingFrom == facing.rotateYClockwise() && openFrom) ||
                (direction == facing.rotateYCounterclockwise() && facingFrom == facing.rotateYCounterclockwise() && openFrom);
    }

    //DONE
    private boolean isInvisibleToSlab(BlockState state, BlockState stateFrom, Direction direction) {


        BlockHalf half = state.get(StairsBlock.HALF);
        Direction facing = state.get(StairsBlock.FACING);
        StairShape shape = state.get(StairsBlock.SHAPE);
        SlabType slabType = stateFrom.get(SlabBlock.TYPE);

        if (direction == Direction.UP) return slabType != SlabType.TOP;
        if (direction == Direction.DOWN) return slabType != SlabType.BOTTOM;
        if (slabType == SlabType.DOUBLE) return true;

        if ((direction == facing.getOpposite() && (shape == STRAIGHT || shape == OUTER_LEFT || shape == OUTER_RIGHT))
        || ((direction == facing && shape == OUTER_LEFT) || (facing == direction.getOpposite().rotateYClockwise() && shape == OUTER_LEFT))
        || ((direction == facing && shape == OUTER_RIGHT) || (facing == direction.getOpposite().rotateYCounterclockwise() && shape == OUTER_RIGHT))) {
            switch (half) {
                case TOP -> {
                    return slabType == SlabType.TOP;
                }
                case BOTTOM -> {
                    return slabType == SlabType.BOTTOM;
                }
            }
        }
        return false;
    }

    //DONE
    private boolean isInvisibleToStairs(BlockState state, BlockState stateFrom, Direction direction) {
        BlockHalf half = state.get(StairsBlock.HALF);
        Direction facing = state.get(StairsBlock.FACING);
        StairShape shape = state.get(StairsBlock.SHAPE);
        BlockHalf halfFrom = stateFrom.get(StairsBlock.HALF);
        Direction facingFrom = stateFrom.get(StairsBlock.FACING);
        StairShape shapeFrom = stateFrom.get(StairsBlock.SHAPE);

        if (direction == Direction.UP) {
            switch (half) {
                case BOTTOM -> {
                    switch (halfFrom) {
                        case BOTTOM -> {
                            return true;
                        }
                        case TOP -> {
                            switch (shape) {
                                case STRAIGHT -> {
                                    if ((shapeFrom == STRAIGHT || shapeFrom == INNER_LEFT || shapeFrom == INNER_RIGHT) && facingFrom == facing) return true;
                                }
                                case INNER_LEFT -> {
                                    if ((shapeFrom == INNER_LEFT && facing == facingFrom) || (shapeFrom == INNER_RIGHT && facing == facingFrom.rotateYClockwise())) return true;
                                }
                                case INNER_RIGHT -> {
                                    if ((shapeFrom == INNER_RIGHT && facing == facingFrom) || (shapeFrom == INNER_LEFT && facing == facingFrom.rotateYCounterclockwise())) return true;
                                }
                                case OUTER_LEFT -> {
                                    if ((shapeFrom == OUTER_LEFT && facing == facingFrom) || (shapeFrom == OUTER_RIGHT && facing == facingFrom.rotateYClockwise())) return true;
                                }
                                case OUTER_RIGHT -> {
                                    if ((shapeFrom == OUTER_RIGHT && facing == facingFrom) || (shapeFrom == OUTER_LEFT && facing == facingFrom.rotateYCounterclockwise())) return true;
                                }
                            }
                        }
                    }
                }
                case TOP -> {
                    switch (halfFrom) {
                        case TOP -> {
                            return false;
                        }
                        case BOTTOM -> {
                            return true;
                        }
                    }
                }
            }
        }
        if (direction == Direction.DOWN) {
            switch (half) {
                case TOP -> {
                    switch (halfFrom) {
                        case BOTTOM -> {
                            switch (shape) {
                                case STRAIGHT -> {
                                    if ((shapeFrom == STRAIGHT || shapeFrom == INNER_LEFT || shapeFrom == INNER_RIGHT) && facingFrom == facing) return true;
                                }
                                case INNER_LEFT -> {
                                    if ((shapeFrom == INNER_LEFT && facing == facingFrom) || (shapeFrom == INNER_RIGHT && facing == facingFrom.rotateYClockwise())) return true;
                                }
                                case INNER_RIGHT -> {
                                    if ((shapeFrom == INNER_RIGHT && facing == facingFrom) || (shapeFrom == INNER_LEFT && facing == facingFrom.rotateYCounterclockwise())) return true;
                                }
                                case OUTER_LEFT -> {
                                    if ((shapeFrom == OUTER_LEFT && facing == facingFrom) || (shapeFrom == OUTER_RIGHT && facing == facingFrom.rotateYClockwise())) return true;
                                }
                                case OUTER_RIGHT -> {
                                    if ((shapeFrom == OUTER_RIGHT && facing == facingFrom) || (shapeFrom == OUTER_LEFT && facing == facingFrom.rotateYCounterclockwise())) return true;
                                }
                            }
                        }
                        case TOP -> {
                            return true;
                        }
                    }
                }
                case BOTTOM -> {
                    switch (halfFrom) {
                        case BOTTOM -> {
                            return false;
                        }
                        case TOP -> {
                            return true;
                        }
                    }
                }
            }
        }

        //CREDIT -> https://github.com/Wurst-Imperium/Mo-Glass/blob/master/src/main/java/net/wurstclient/glass/GlassStairsBlock.java

        // other stairs rear
        if(facingFrom == direction.getOpposite()
                && shapeFrom != OUTER_LEFT
                && shapeFrom != OUTER_RIGHT)
            return true;

        // other curved stairs fully covered side
        if(facingFrom.rotateYCounterclockwise() == direction
                && shapeFrom == INNER_RIGHT)
            return true;
        if(facingFrom.rotateYClockwise() == direction
                && shapeFrom == INNER_LEFT)
            return true;

        // rear
        if(direction == facing && half == halfFrom)
        {
            if(facingFrom == facing.rotateYCounterclockwise()
                    && shape == OUTER_LEFT
                    && shapeFrom != OUTER_RIGHT)
                return true;

            if(facingFrom == facing.rotateYClockwise()
                    && shape == OUTER_RIGHT
                    && shapeFrom != OUTER_LEFT)
                return true;
        }

        // front
        if(direction == facing.getOpposite() && half == halfFrom)
        {
            if(facingFrom == facing.rotateYCounterclockwise()
                    && shapeFrom != OUTER_LEFT)
                return true;

            if(facingFrom == facing.rotateYClockwise()
                    && shapeFrom != OUTER_RIGHT)
                return true;

            if(facingFrom == facing.getOpposite())
                return true;
        }

        // left
        if(direction == facing.rotateYCounterclockwise() && half == halfFrom)
        {
            if(facingFrom == direction && shape != INNER_LEFT
                    && shapeFrom == INNER_RIGHT)
                return true;

            if(facingFrom == facing && shapeFrom != OUTER_LEFT)
                return true;

            if(facingFrom == facing.rotateYClockwise()
                    && shapeFrom == OUTER_LEFT
                    && shape != INNER_LEFT)
                return true;

            if(facingFrom == facing.getOpposite()
                    && shape == OUTER_RIGHT)
                return true;
        }

        // right
        if(direction == facing.rotateYClockwise() && half == halfFrom)
        {
            if(facingFrom == direction && shape != INNER_RIGHT
                    && shapeFrom == INNER_LEFT)
                return true;

            if(facingFrom == facing && shapeFrom != OUTER_RIGHT)
                return true;

            if(facingFrom == facing.rotateYCounterclockwise()
                    && shapeFrom == OUTER_RIGHT
                    && shape != INNER_RIGHT)
                return true;

            return facingFrom == facing.getOpposite()
                    && shape == OUTER_LEFT;
        }

        return false;
    }

    //DONE
    private boolean isInvisibleToDoor(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        Direction facingFrom = stateFrom.get(DoorBlock.FACING);
        DoorHinge hingeFrom = stateFrom.get(DoorBlock.HINGE);
        Boolean openFrom = stateFrom.get(DoorBlock.OPEN);

        if (direction == facing &&
                ((facingFrom == facing && !openFrom) ||
                (facingFrom == facing.rotateYCounterclockwise() && hingeFrom == DoorHinge.LEFT && openFrom) ||
                (facingFrom == facing.rotateYClockwise() && hingeFrom == DoorHinge.RIGHT && openFrom))) return true;
        if (direction == facing.getOpposite() &&
                ((facingFrom == facing.getOpposite() && !openFrom) ||
                (facingFrom == facing.rotateYCounterclockwise() && hingeFrom == DoorHinge.RIGHT && openFrom) ||
                (facingFrom == facing.rotateYClockwise() && hingeFrom == DoorHinge.LEFT && openFrom))) return true;
        if (direction == facing.rotateYClockwise() &&
                ((facingFrom == facing.rotateYClockwise() && !openFrom) ||
                (facingFrom == facing && hingeFrom == DoorHinge.LEFT && openFrom) ||
                (facingFrom == facing.getOpposite() && hingeFrom == DoorHinge.RIGHT && openFrom))) return true;
        return direction == facing.rotateYCounterclockwise() &&
                ((facingFrom == facing.rotateYCounterclockwise() && !openFrom) ||
                        (facingFrom == facing && hingeFrom == DoorHinge.RIGHT && openFrom) ||
                        (facingFrom == facing.getOpposite() && hingeFrom == DoorHinge.LEFT && openFrom));
    }

}

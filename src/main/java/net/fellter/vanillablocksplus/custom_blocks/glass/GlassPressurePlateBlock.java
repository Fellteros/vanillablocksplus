package net.fellter.vanillablocksplus.custom_blocks.glass;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GlassPressurePlateBlock extends PressurePlateBlock {
    public GlassPressurePlateBlock(BlockSetType type, AbstractBlock.Settings settings) {
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

        if (stateFrom.getBlock() instanceof GlassSlabBlock && isInvisibleToSlab(stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassStairsBlock && isInvisibleToStairs(stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassTrapdoorBlock && isInvisibleToTrapdoor(stateFrom, direction)) {
            return true;
        }

        return stateFrom.getBlock() instanceof TransparentBlock;
    }

    //DONE
    private boolean isInvisibleToSlab(BlockState stateFrom, Direction direction) {
        SlabType typeFrom = stateFrom.get(SlabBlock.TYPE);

        return direction == Direction.DOWN && (typeFrom == SlabType.TOP || typeFrom == SlabType.DOUBLE);
    }

    //DONE
    private boolean isInvisibleToStairs(BlockState stateFrom, Direction direction) {
        BlockHalf halfFrom = stateFrom.get(StairsBlock.HALF);

        return direction == Direction.DOWN && halfFrom == BlockHalf.TOP;
    }

    //DONE
    private boolean isInvisibleToTrapdoor(BlockState stateFrom, Direction direction) {
        BlockHalf halfFrom = stateFrom.get(TrapdoorBlock.HALF);
        Boolean openFrom = stateFrom.get(TrapdoorBlock.OPEN);

        return direction == Direction.DOWN && halfFrom == BlockHalf.TOP && !openFrom;
    }
}

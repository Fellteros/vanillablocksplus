package net.fellter.vanillablocksplus.custom_blocks.glass;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.EmptyBlockView;

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
    public boolean isTransparent(BlockState state) {
        return true;
    }

    @Override
    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.getBlock() instanceof GlassSlabBlock && isInvisible(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassStairsBlock && isInvisible(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassTrapdoorBlock && isInvisible(state, stateFrom, direction)) {
            return true;
        }

        if (stateFrom.getBlock() instanceof GlassDoorBlock && isInvisible(state, stateFrom, direction)) {
            return true;
        }

        return stateFrom.getBlock() instanceof TransparentBlock;
    }

    protected boolean isInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        VoxelShape stateCullingShape = state.getOutlineShape(EmptyBlockView.INSTANCE, BlockPos.ORIGIN);
        VoxelShape stateFromCullingShape = stateFrom.getOutlineShape(EmptyBlockView.INSTANCE, BlockPos.ORIGIN);
        return VoxelShapes.isSideCovered(stateCullingShape, stateFromCullingShape, direction);
    }
}

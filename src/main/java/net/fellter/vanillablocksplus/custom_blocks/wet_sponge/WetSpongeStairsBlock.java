package net.fellter.vanillablocksplus.custom_blocks.wet_sponge;

import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.fellter.vanillablocksplus.util.Util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.attribute.EnvironmentAttributes;

public class WetSpongeStairsBlock extends StairsBlock {
    public WetSpongeStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (world.getEnvironmentAttributes().getAttributeValue(EnvironmentAttributes.WATER_EVAPORATES_GAMEPLAY, pos)) {
            world.setBlockState(pos, ModBlocks2.SPONGE_STAIRS.getDefaultState()
                            .with(FACING, world.getBlockState(pos).get(FACING))
                            .with(HALF, world.getBlockState(pos).get(HALF))
                            .with(SHAPE, world.getBlockState(pos).get(SHAPE)),
                    Block.NOTIFY_ALL);
            world.syncWorldEvent(WorldEvents.WET_SPONGE_DRIES_OUT, pos, 0);
            world.playSound(null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0f, (1.0f + world.getRandom().nextFloat() * 0.2f) * 0.7f);
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        Direction direction = Direction.random(random);
        if (direction == Direction.UP) {
            return;
        }
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        if (state.isOpaque() && blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
            return;
        }
        Util.addParticleClient(state.getOutlineShape(world, pos).getBoundingBoxes(), world, pos, ParticleTypes.DRIPPING_WATER, 0, 0, 0, 0.05);
    }
}

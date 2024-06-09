package net.fellter.vanillablocksplus.custom_blocks.sand;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.LandingBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class FallingTrapdoorBlock extends TrapdoorBlock implements LandingBlock {
    public FallingTrapdoorBlock(Settings settings, BlockSetType blockSetType) {
        super(settings, blockSetType);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canFallThrough(world.getBlockState(pos.down())) || pos.getY() < world.getBottomY()) {
            return;
        }
        FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
        this.configureFallingBlockEntity(fallingBlockEntity);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
    }

    protected int getFallDelay() {
        return 2;
    }

    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.FIRE) || state.isLiquid() || state.isReplaceable();
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0 && canFallThrough(world.getBlockState(pos.down()))) {
            ParticleUtil.spawnParticle(world, pos, random, new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state));
        }
    }
}

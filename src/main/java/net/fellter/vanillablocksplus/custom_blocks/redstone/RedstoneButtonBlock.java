package net.fellter.vanillablocksplus.custom_blocks.redstone;

import net.minecraft.block.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class RedstoneButtonBlock extends ButtonBlock {
    public RedstoneButtonBlock(BlockSetType blockSetType, int pressTicks, AbstractBlock.Settings settings) {
        super(blockSetType, pressTicks, settings);
    }

    public static final BooleanProperty LIT = Properties.LIT;

    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        light(state, world, pos);
        super.onBlockBreakStart(state, world, pos, player);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects()) {
            light(state, world, pos);
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    private static void light(BlockState state, World world, BlockPos pos) {
        spawnParticles(world, pos);
        if (!state.get(LIT)) {
            world.setBlockState(pos, state.with(LIT, true), Block.NOTIFY_ALL);
        }
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return state.get(LIT);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            world.setBlockState(pos, state.with(LIT, false), Block.NOTIFY_ALL);
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            spawnParticles(world, pos);
        }
    }

    private static void spawnParticles(World world, BlockPos pos) {
        Random random = world.random;
        for (Direction direction : Direction.values()) {
            BlockPos blockPos = pos.offset(direction);
            if (world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) continue;
            Direction.Axis axis = direction.getAxis();
            double e = axis == Direction.Axis.X ? 0.1 * (double)direction.getOffsetX() : (double)random.nextFloat();
            double f = axis == Direction.Axis.Y ? 0.1 * (double)direction.getOffsetY() : (double)random.nextFloat();
            double g = axis == Direction.Axis.Z ? 0.1 * (double)direction.getOffsetZ() : (double)random.nextFloat();
            world.addParticle(DustParticleEffect.DEFAULT, (double)pos.getX() + e, (double)pos.getY() + f, (double)pos.getZ() + g, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, POWERED, FACE, FACING);
    }
}

package net.fellter.vanillablocksplus.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.FoliageColors;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ModRegistries {
    public static class FlammableBlocksRegistry {
            public static void registerFlammables() {
                //oak
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_BUTTON, 5, 5);
                //str oak
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_OAK_WOOD_BUTTON, 5, 5);
                //spruce
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_BUTTON, 5, 5);
                //str spruce
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_SPRUCE_WOOD_BUTTON, 5, 5);
                //birch
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_BUTTON, 5, 5);
                //str birch
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BIRCH_WOOD_BUTTON, 5, 5);
                //JUNGLE
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_BUTTON, 5, 5);
                //str JUNGLE
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_JUNGLE_WOOD_BUTTON, 5, 5);
                //ACACIA
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WOOD_BUTTON, 5, 5);
                //str ACACIA
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_ACACIA_WOOD_BUTTON, 5, 5);
                //DARK_OAK
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_BUTTON, 5, 5);
                //str DARK_OAK
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_DARK_OAK_WOOD_BUTTON, 5, 5);
                //MANGROVE
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_BUTTON, 5, 5);
                //str MANGROVE
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_MANGROVE_WOOD_BUTTON, 5, 5);
                //CHERRY
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_BUTTON, 5, 5);
                //str CHERRY
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CHERRY_WOOD_BUTTON, 5, 5);
                //bamboo
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_BLOCK_BUTTON, 5, 5);
                //str bamboo
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_BAMBOO_BLOCK_BUTTON, 5, 5);
                //crimson
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_HYPHAE_BUTTON, 5, 5);
                //str crimson
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_CRIMSON_HYPHAE_BUTTON, 5, 5);
                //warped
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_HYPHAE_BUTTON, 5, 5);
                //str warped
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_STAIRS, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_SLAB, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_DOOR, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_FENCE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE, 5, 5);
                FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STR_WARPED_HYPHAE_BUTTON, 5, 5);
            }
    }

    @Environment(EnvType.CLIENT)
    public static class FoliageBlocksRegistry {
        public static void registerFoliage() {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                        if (world == null || pos == null) {
                            return FoliageColors.DEFAULT;
                        }
                        return BiomeColors.getGrassColor(world, pos);
                    },
                    ModBlocks.GRASS_SLAB,
                    ModBlocks.GRASS_BUTTON,
                    ModBlocks.GRASS_FENCE,
                    ModBlocks.GRASS_STAIRS,
                    ModBlocks.GRASS_WALL,
                    ModBlocks.GRASS_FENCE_GATE,
                    ModBlocks.GRASS_DOOR,
                    ModBlocks.GRASS_TRAPDOOR,
                    ModBlocks.GRASS_PRESSURE_PLATE);

            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                        if (world == null || pos == null) {
                            return FoliageColors.DEFAULT;
                        }
                        return BiomeColors.getFoliageColor(world, pos);
                    },
                    ModBlocks2.OAK_LEAVES_SLAB,
                    ModBlocks2.OAK_LEAVES_BUTTON,
                    ModBlocks2.OAK_LEAVES_FENCE,
                    ModBlocks2.OAK_LEAVES_STAIRS,
                    ModBlocks2.OAK_LEAVES_WALL,
                    ModBlocks2.OAK_LEAVES_FENCE_GATE,
                    ModBlocks2.OAK_LEAVES_DOOR,
                    ModBlocks2.OAK_LEAVES_TRAPDOOR,
                    ModBlocks2.OAK_LEAVES_PRESSURE_PLATE,
                    ModBlocks2.SPRUCE_LEAVES_SLAB,
                    ModBlocks2.SPRUCE_LEAVES_BUTTON,
                    ModBlocks2.SPRUCE_LEAVES_FENCE,
                    ModBlocks2.SPRUCE_LEAVES_STAIRS,
                    ModBlocks2.SPRUCE_LEAVES_WALL,
                    ModBlocks2.SPRUCE_LEAVES_FENCE_GATE,
                    ModBlocks2.SPRUCE_LEAVES_DOOR,
                    ModBlocks2.SPRUCE_LEAVES_TRAPDOOR,
                    ModBlocks2.SPRUCE_LEAVES_PRESSURE_PLATE,
                    ModBlocks2.BIRCH_LEAVES_SLAB,
                    ModBlocks2.BIRCH_LEAVES_BUTTON,
                    ModBlocks2.BIRCH_LEAVES_FENCE,
                    ModBlocks2.BIRCH_LEAVES_STAIRS,
                    ModBlocks2.BIRCH_LEAVES_WALL,
                    ModBlocks2.BIRCH_LEAVES_FENCE_GATE,
                    ModBlocks2.BIRCH_LEAVES_DOOR,
                    ModBlocks2.BIRCH_LEAVES_TRAPDOOR,
                    ModBlocks2.BIRCH_LEAVES_PRESSURE_PLATE,
                    ModBlocks2.JUNGLE_LEAVES_SLAB,
                    ModBlocks2.JUNGLE_LEAVES_BUTTON,
                    ModBlocks2.JUNGLE_LEAVES_FENCE,
                    ModBlocks2.JUNGLE_LEAVES_STAIRS,
                    ModBlocks2.JUNGLE_LEAVES_WALL,
                    ModBlocks2.JUNGLE_LEAVES_FENCE_GATE,
                    ModBlocks2.JUNGLE_LEAVES_DOOR,
                    ModBlocks2.JUNGLE_LEAVES_TRAPDOOR,
                    ModBlocks2.JUNGLE_LEAVES_PRESSURE_PLATE,
                    ModBlocks2.ACACIA_LEAVES_SLAB,
                    ModBlocks2.ACACIA_LEAVES_BUTTON,
                    ModBlocks2.ACACIA_LEAVES_FENCE,
                    ModBlocks2.ACACIA_LEAVES_STAIRS,
                    ModBlocks2.ACACIA_LEAVES_WALL,
                    ModBlocks2.ACACIA_LEAVES_FENCE_GATE,
                    ModBlocks2.ACACIA_LEAVES_DOOR,
                    ModBlocks2.ACACIA_LEAVES_TRAPDOOR,
                    ModBlocks2.ACACIA_LEAVES_PRESSURE_PLATE,
                    ModBlocks2.DARK_OAK_LEAVES_SLAB,
                    ModBlocks2.DARK_OAK_LEAVES_BUTTON,
                    ModBlocks2.DARK_OAK_LEAVES_FENCE,
                    ModBlocks2.DARK_OAK_LEAVES_STAIRS,
                    ModBlocks2.DARK_OAK_LEAVES_WALL,
                    ModBlocks2.DARK_OAK_LEAVES_FENCE_GATE,
                    ModBlocks2.DARK_OAK_LEAVES_DOOR,
                    ModBlocks2.DARK_OAK_LEAVES_TRAPDOOR,
                    ModBlocks2.DARK_OAK_LEAVES_PRESSURE_PLATE,
                    ModBlocks2.MANGROVE_LEAVES_SLAB,
                    ModBlocks2.MANGROVE_LEAVES_BUTTON,
                    ModBlocks2.MANGROVE_LEAVES_FENCE,
                    ModBlocks2.MANGROVE_LEAVES_STAIRS,
                    ModBlocks2.MANGROVE_LEAVES_WALL,
                    ModBlocks2.MANGROVE_LEAVES_FENCE_GATE,
                    ModBlocks2.MANGROVE_LEAVES_DOOR,
                    ModBlocks2.MANGROVE_LEAVES_TRAPDOOR,
                    ModBlocks2.MANGROVE_LEAVES_PRESSURE_PLATE);

        }
    }

    public static class FuelRegistry {
        public static void registerFuels() {
            FuelRegistryEvents.BUILD.register((builder, context) -> builder.add(ModBlocks.COAL_BUTTON, context.baseSmeltTime())
                    .add(ModBlocks.COAL_FENCE_GATE, context.baseSmeltTime())
                    .add(ModBlocks.COAL_FENCE, context.baseSmeltTime())
                    .add(ModBlocks.COAL_DOOR, context.baseSmeltTime())
                    .add(ModBlocks.COAL_PRESSURE_PLATE, context.baseSmeltTime())
                    .add(ModBlocks.COAL_TRAPDOOR, context.baseSmeltTime())
                    .add(ModBlocks.COAL_SLAB, context.baseSmeltTime())
                    .add(ModBlocks.COAL_STAIRS, context.baseSmeltTime())
                    .add(ModBlocks.COAL_WALL, context.baseSmeltTime()));
        }
    }

    public static class OxidizableBlockRegistry implements Oxidizable {


        public static void registerOxidizables() {
            //copper
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.EXPOSED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WEATHERED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.OXIDIZED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.EXPOSED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.OXIDIZED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.EXPOSED_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WEATHERED_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.OXIDIZED_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_FENCE, ModBlocks.EXPOSED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE, ModBlocks.WEATHERED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE, ModBlocks.OXIDIZED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.EXPOSED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WEATHERED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.EXPOSED_COPPER_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WEATHERED_COPPER_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.OXIDIZED_COPPER_BUTTON);

            //cut copper
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.EXPOSED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WEATHERED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.OXIDIZED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_FENCE, ModBlocks.EXPOSED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE, ModBlocks.WEATHERED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE, ModBlocks.OXIDIZED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_FENCE_GATE, ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_DOOR, ModBlocks.EXPOSED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_DOOR, ModBlocks.WEATHERED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_DOOR, ModBlocks.OXIDIZED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_TRAPDOOR, ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_PRESSURE_PLATE, ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_BUTTON, ModBlocks.EXPOSED_CUT_COPPER_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_BUTTON, ModBlocks.WEATHERED_CUT_COPPER_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_BUTTON, ModBlocks.OXIDIZED_CUT_COPPER_BUTTON);

            //chiseled_copper
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_STAIRS, ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS, ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS, ModBlocks2.OXIDIZED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_SLAB, ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB, ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB, ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_WALL, ModBlocks2.EXPOSED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_WALL, ModBlocks2.WEATHERED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_WALL, ModBlocks2.OXIDIZED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE, ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE, ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE, ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE_GATE, ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_DOOR, ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR, ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR, ModBlocks2.OXIDIZED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_TRAPDOOR, ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.OXIDIZED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_BUTTON, ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON, ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON, ModBlocks2.OXIDIZED_CHISELED_COPPER_BUTTON);

            //copper_grate
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_STAIRS, ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS, ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS, ModBlocks2.OXIDIZED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_SLAB, ModBlocks2.EXPOSED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_SLAB, ModBlocks2.WEATHERED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_SLAB, ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_WALL, ModBlocks2.EXPOSED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_WALL, ModBlocks2.WEATHERED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_WALL, ModBlocks2.OXIDIZED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_FENCE, ModBlocks2.EXPOSED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE, ModBlocks2.WEATHERED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE, ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_FENCE_GATE, ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE, ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_DOOR, ModBlocks2.EXPOSED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_DOOR, ModBlocks2.WEATHERED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_DOOR, ModBlocks2.OXIDIZED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_TRAPDOOR, ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR, ModBlocks2.OXIDIZED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_BUTTON, ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON, ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON);
            OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON, ModBlocks2.OXIDIZED_COPPER_GRATE_BUTTON);

            //wax copper
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.WAXED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.WAXED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE, ModBlocks.WAXED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.WAXED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.WAXED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WAXED_EXPOSED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.WAXED_WEATHERED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.WAXED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_FENCE, ModBlocks.WAXED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_DOOR, ModBlocks.WAXED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_BUTTON, ModBlocks.WAXED_CUT_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_DOOR, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_DOOR, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON);

            //wax copper
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_DOOR, ModBlocks2.WAXED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_SLAB, ModBlocks2.WAXED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_WALL, ModBlocks2.WAXED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE, ModBlocks2.WAXED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_CHISELED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_WALL, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_WALL, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_DOOR, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_WALL, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_STAIRS, ModBlocks2.WAXED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_DOOR, ModBlocks2.WAXED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_SLAB, ModBlocks2.WAXED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_WALL, ModBlocks2.WAXED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_FENCE, ModBlocks2.WAXED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_BUTTON, ModBlocks2.WAXED_COPPER_GRATE_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_DOOR, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_SLAB, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_WALL, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_DOOR, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_SLAB, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_WALL, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_BUTTON);

            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_STAIRS, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_DOOR, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_DOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_WALL, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_WALL);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
            OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_BUTTON, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_BUTTON);




        }

        @Override
        public OxidationLevel getDegradationLevel() {
            return null;
        }
    }

    public static class TransparentBlocksRegistry {

       public static void registerTransparentBlocks() {
           BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                   ModBlocks.GRASS_BUTTON,
                   ModBlocks.GRASS_FENCE,
                   ModBlocks.GRASS_SLAB,
                   ModBlocks.GRASS_STAIRS,
                   ModBlocks.GRASS_WALL,
                   ModBlocks.GRASS_FENCE_GATE,
                   ModBlocks.GRASS_DOOR,
                   ModBlocks.GRASS_TRAPDOOR,
                   ModBlocks.GRASS_PRESSURE_PLATE,
                   ModBlocks2.OAK_LEAVES_BUTTON,
                   ModBlocks2.OAK_LEAVES_FENCE,
                   ModBlocks2.OAK_LEAVES_SLAB,
                   ModBlocks2.OAK_LEAVES_STAIRS,
                   ModBlocks2.OAK_LEAVES_WALL,
                   ModBlocks2.OAK_LEAVES_FENCE_GATE,
                   ModBlocks2.OAK_LEAVES_DOOR,
                   ModBlocks2.OAK_LEAVES_TRAPDOOR,
                   ModBlocks2.OAK_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.SPRUCE_LEAVES_BUTTON,
                   ModBlocks2.SPRUCE_LEAVES_FENCE,
                   ModBlocks2.SPRUCE_LEAVES_SLAB,
                   ModBlocks2.SPRUCE_LEAVES_STAIRS,
                   ModBlocks2.SPRUCE_LEAVES_WALL,
                   ModBlocks2.SPRUCE_LEAVES_FENCE_GATE,
                   ModBlocks2.SPRUCE_LEAVES_DOOR,
                   ModBlocks2.SPRUCE_LEAVES_TRAPDOOR,
                   ModBlocks2.SPRUCE_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.BIRCH_LEAVES_BUTTON,
                   ModBlocks2.BIRCH_LEAVES_FENCE,
                   ModBlocks2.BIRCH_LEAVES_SLAB,
                   ModBlocks2.BIRCH_LEAVES_STAIRS,
                   ModBlocks2.BIRCH_LEAVES_WALL,
                   ModBlocks2.BIRCH_LEAVES_FENCE_GATE,
                   ModBlocks2.BIRCH_LEAVES_DOOR,
                   ModBlocks2.BIRCH_LEAVES_TRAPDOOR,
                   ModBlocks2.BIRCH_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.JUNGLE_LEAVES_BUTTON,
                   ModBlocks2.JUNGLE_LEAVES_FENCE,
                   ModBlocks2.JUNGLE_LEAVES_SLAB,
                   ModBlocks2.JUNGLE_LEAVES_STAIRS,
                   ModBlocks2.JUNGLE_LEAVES_WALL,
                   ModBlocks2.JUNGLE_LEAVES_FENCE_GATE,
                   ModBlocks2.JUNGLE_LEAVES_DOOR,
                   ModBlocks2.JUNGLE_LEAVES_TRAPDOOR,
                   ModBlocks2.JUNGLE_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.ACACIA_LEAVES_BUTTON,
                   ModBlocks2.ACACIA_LEAVES_FENCE,
                   ModBlocks2.ACACIA_LEAVES_SLAB,
                   ModBlocks2.ACACIA_LEAVES_STAIRS,
                   ModBlocks2.ACACIA_LEAVES_WALL,
                   ModBlocks2.ACACIA_LEAVES_FENCE_GATE,
                   ModBlocks2.ACACIA_LEAVES_DOOR,
                   ModBlocks2.ACACIA_LEAVES_TRAPDOOR,
                   ModBlocks2.ACACIA_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.DARK_OAK_LEAVES_BUTTON,
                   ModBlocks2.DARK_OAK_LEAVES_FENCE,
                   ModBlocks2.DARK_OAK_LEAVES_SLAB,
                   ModBlocks2.DARK_OAK_LEAVES_STAIRS,
                   ModBlocks2.DARK_OAK_LEAVES_WALL,
                   ModBlocks2.DARK_OAK_LEAVES_FENCE_GATE,
                   ModBlocks2.DARK_OAK_LEAVES_DOOR,
                   ModBlocks2.DARK_OAK_LEAVES_TRAPDOOR,
                   ModBlocks2.DARK_OAK_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.MANGROVE_LEAVES_BUTTON,
                   ModBlocks2.MANGROVE_LEAVES_FENCE,
                   ModBlocks2.MANGROVE_LEAVES_SLAB,
                   ModBlocks2.MANGROVE_LEAVES_STAIRS,
                   ModBlocks2.MANGROVE_LEAVES_WALL,
                   ModBlocks2.MANGROVE_LEAVES_FENCE_GATE,
                   ModBlocks2.MANGROVE_LEAVES_DOOR,
                   ModBlocks2.MANGROVE_LEAVES_TRAPDOOR,
                   ModBlocks2.MANGROVE_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.CHERRY_LEAVES_BUTTON,
                   ModBlocks2.CHERRY_LEAVES_FENCE,
                   ModBlocks2.CHERRY_LEAVES_SLAB,
                   ModBlocks2.CHERRY_LEAVES_STAIRS,
                   ModBlocks2.CHERRY_LEAVES_WALL,
                   ModBlocks2.CHERRY_LEAVES_FENCE_GATE,
                   ModBlocks2.CHERRY_LEAVES_DOOR,
                   ModBlocks2.CHERRY_LEAVES_TRAPDOOR,
                   ModBlocks2.CHERRY_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.AZALEA_LEAVES_BUTTON,
                   ModBlocks2.AZALEA_LEAVES_FENCE,
                   ModBlocks2.AZALEA_LEAVES_SLAB,
                   ModBlocks2.AZALEA_LEAVES_STAIRS,
                   ModBlocks2.AZALEA_LEAVES_WALL,
                   ModBlocks2.AZALEA_LEAVES_FENCE_GATE,
                   ModBlocks2.AZALEA_LEAVES_DOOR,
                   ModBlocks2.AZALEA_LEAVES_TRAPDOOR,
                   ModBlocks2.AZALEA_LEAVES_PRESSURE_PLATE,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_BUTTON,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_FENCE,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_SLAB,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_STAIRS,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_WALL,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_FENCE_GATE,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_DOOR,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_TRAPDOOR,
                   ModBlocks2.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE,

                   ModBlocks2.COPPER_GRATE_BUTTON,
                   ModBlocks2.COPPER_GRATE_FENCE,
                   ModBlocks2.COPPER_GRATE_SLAB,
                   ModBlocks2.COPPER_GRATE_STAIRS,
                   ModBlocks2.COPPER_GRATE_WALL,
                   ModBlocks2.COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.COPPER_GRATE_DOOR,
                   ModBlocks2.COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON,
                   ModBlocks2.EXPOSED_COPPER_GRATE_FENCE,
                   ModBlocks2.EXPOSED_COPPER_GRATE_SLAB,
                   ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS,
                   ModBlocks2.EXPOSED_COPPER_GRATE_WALL,
                   ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.EXPOSED_COPPER_GRATE_DOOR,
                   ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON,
                   ModBlocks2.WEATHERED_COPPER_GRATE_FENCE,
                   ModBlocks2.WEATHERED_COPPER_GRATE_SLAB,
                   ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS,
                   ModBlocks2.WEATHERED_COPPER_GRATE_WALL,
                   ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.WEATHERED_COPPER_GRATE_DOOR,
                   ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_BUTTON,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_STAIRS,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_WALL,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_DOOR,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.WAXED_COPPER_GRATE_BUTTON,
                   ModBlocks2.WAXED_COPPER_GRATE_FENCE,
                   ModBlocks2.WAXED_COPPER_GRATE_SLAB,
                   ModBlocks2.WAXED_COPPER_GRATE_STAIRS,
                   ModBlocks2.WAXED_COPPER_GRATE_WALL,
                   ModBlocks2.WAXED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.WAXED_COPPER_GRATE_DOOR,
                   ModBlocks2.WAXED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.WAXED_COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_BUTTON,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_STAIRS,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_WALL,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_DOOR,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_BUTTON,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_STAIRS,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_WALL,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_DOOR,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_BUTTON,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_STAIRS,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_WALL,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_DOOR,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR,
                   ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);

           BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                   ModBlocks.ICE_BUTTON,
                   ModBlocks.ICE_FENCE,
                   ModBlocks.ICE_FENCE_GATE,
                   ModBlocks.ICE_SLAB,
                   ModBlocks.ICE_STAIRS,
                   ModBlocks.ICE_PRESSURE_PLATE,
                   ModBlocks.ICE_WALL,
                   ModBlocks.ICE_TRAPDOOR,
                   ModBlocks.ICE_DOOR,
                   ModBlocks.PACKED_ICE_BUTTON,
                   ModBlocks.PACKED_ICE_FENCE,
                   ModBlocks.PACKED_ICE_FENCE_GATE,
                   ModBlocks.PACKED_ICE_SLAB,
                   ModBlocks.PACKED_ICE_STAIRS,
                   ModBlocks.PACKED_ICE_PRESSURE_PLATE,
                   ModBlocks.PACKED_ICE_WALL,
                   ModBlocks.PACKED_ICE_TRAPDOOR,
                   ModBlocks.PACKED_ICE_DOOR,
                   ModBlocks.BLUE_ICE_BUTTON,
                   ModBlocks.BLUE_ICE_FENCE,
                   ModBlocks.BLUE_ICE_FENCE_GATE,
                   ModBlocks.BLUE_ICE_SLAB,
                   ModBlocks.BLUE_ICE_STAIRS,
                   ModBlocks.BLUE_ICE_PRESSURE_PLATE,
                   ModBlocks.BLUE_ICE_WALL,
                   ModBlocks.BLUE_ICE_TRAPDOOR,
                   ModBlocks.BLUE_ICE_DOOR,
                   ModBlocks2.SLIME_BUTTON,
                   ModBlocks2.SLIME_FENCE,
                   ModBlocks2.SLIME_FENCE_GATE,
                   ModBlocks2.SLIME_SLAB,
                   ModBlocks2.SLIME_STAIRS,
                   ModBlocks2.SLIME_PRESSURE_PLATE,
                   ModBlocks2.SLIME_WALL,
                   ModBlocks2.SLIME_TRAPDOOR,
                   ModBlocks2.SLIME_DOOR,
                   ModBlocks2.HONEY_BUTTON,
                   ModBlocks2.HONEY_FENCE,
                   ModBlocks2.HONEY_FENCE_GATE,
                   ModBlocks2.HONEY_SLAB,
                   ModBlocks2.HONEY_STAIRS,
                   ModBlocks2.HONEY_PRESSURE_PLATE,
                   ModBlocks2.HONEY_WALL,
                   ModBlocks2.HONEY_TRAPDOOR,
                   ModBlocks2.HONEY_DOOR,

                   ModBlocks.WHITE_STAINED_GLASS_STAIRS,
                   ModBlocks.WHITE_STAINED_GLASS_SLAB,
                   ModBlocks.WHITE_STAINED_GLASS_BUTTON,
                   ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.WHITE_STAINED_GLASS_FENCE,
                   ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.WHITE_STAINED_GLASS_DOOR,
                   ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.WHITE_STAINED_GLASS_WALL,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL,
                   ModBlocks.GRAY_STAINED_GLASS_STAIRS,
                   ModBlocks.GRAY_STAINED_GLASS_SLAB,
                   ModBlocks.GRAY_STAINED_GLASS_BUTTON,
                   ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.GRAY_STAINED_GLASS_FENCE,
                   ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.GRAY_STAINED_GLASS_DOOR,
                   ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.GRAY_STAINED_GLASS_WALL,
                   ModBlocks.BLACK_STAINED_GLASS_STAIRS,
                   ModBlocks.BLACK_STAINED_GLASS_SLAB,
                   ModBlocks.BLACK_STAINED_GLASS_BUTTON,
                   ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.BLACK_STAINED_GLASS_FENCE,
                   ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.BLACK_STAINED_GLASS_DOOR,
                   ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.BLACK_STAINED_GLASS_WALL,
                   ModBlocks.BROWN_STAINED_GLASS_STAIRS,
                   ModBlocks.BROWN_STAINED_GLASS_SLAB,
                   ModBlocks.BROWN_STAINED_GLASS_BUTTON,
                   ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.BROWN_STAINED_GLASS_FENCE,
                   ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.BROWN_STAINED_GLASS_DOOR,
                   ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.BROWN_STAINED_GLASS_WALL,
                   ModBlocks.RED_STAINED_GLASS_STAIRS,
                   ModBlocks.RED_STAINED_GLASS_SLAB,
                   ModBlocks.RED_STAINED_GLASS_BUTTON,
                   ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.RED_STAINED_GLASS_FENCE,
                   ModBlocks.RED_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.RED_STAINED_GLASS_DOOR,
                   ModBlocks.RED_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.RED_STAINED_GLASS_WALL,
                   ModBlocks.ORANGE_STAINED_GLASS_STAIRS,
                   ModBlocks.ORANGE_STAINED_GLASS_SLAB,
                   ModBlocks.ORANGE_STAINED_GLASS_BUTTON,
                   ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.ORANGE_STAINED_GLASS_FENCE,
                   ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.ORANGE_STAINED_GLASS_DOOR,
                   ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.ORANGE_STAINED_GLASS_WALL,
                   ModBlocks.YELLOW_STAINED_GLASS_STAIRS,
                   ModBlocks.YELLOW_STAINED_GLASS_SLAB,
                   ModBlocks.YELLOW_STAINED_GLASS_BUTTON,
                   ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.YELLOW_STAINED_GLASS_FENCE,
                   ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.YELLOW_STAINED_GLASS_DOOR,
                   ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.YELLOW_STAINED_GLASS_WALL,
                   ModBlocks.LIME_STAINED_GLASS_STAIRS,
                   ModBlocks.LIME_STAINED_GLASS_SLAB,
                   ModBlocks.LIME_STAINED_GLASS_BUTTON,
                   ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.LIME_STAINED_GLASS_FENCE,
                   ModBlocks.LIME_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.LIME_STAINED_GLASS_DOOR,
                   ModBlocks.LIME_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.LIME_STAINED_GLASS_WALL,
                   ModBlocks.GREEN_STAINED_GLASS_STAIRS,
                   ModBlocks.GREEN_STAINED_GLASS_SLAB,
                   ModBlocks.GREEN_STAINED_GLASS_BUTTON,
                   ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.GREEN_STAINED_GLASS_FENCE,
                   ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.GREEN_STAINED_GLASS_DOOR,
                   ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.GREEN_STAINED_GLASS_WALL,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL,
                   ModBlocks.BLUE_STAINED_GLASS_STAIRS,
                   ModBlocks.BLUE_STAINED_GLASS_SLAB,
                   ModBlocks.BLUE_STAINED_GLASS_BUTTON,
                   ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.BLUE_STAINED_GLASS_FENCE,
                   ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.BLUE_STAINED_GLASS_DOOR,
                   ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.BLUE_STAINED_GLASS_WALL,
                   ModBlocks.CYAN_STAINED_GLASS_STAIRS,
                   ModBlocks.CYAN_STAINED_GLASS_SLAB,
                   ModBlocks.CYAN_STAINED_GLASS_BUTTON,
                   ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.CYAN_STAINED_GLASS_FENCE,
                   ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.CYAN_STAINED_GLASS_DOOR,
                   ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.CYAN_STAINED_GLASS_WALL,
                   ModBlocks.PURPLE_STAINED_GLASS_STAIRS,
                   ModBlocks.PURPLE_STAINED_GLASS_SLAB,
                   ModBlocks.PURPLE_STAINED_GLASS_BUTTON,
                   ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.PURPLE_STAINED_GLASS_FENCE,
                   ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.PURPLE_STAINED_GLASS_DOOR,
                   ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.PURPLE_STAINED_GLASS_WALL,
                   ModBlocks.MAGENTA_STAINED_GLASS_STAIRS,
                   ModBlocks.MAGENTA_STAINED_GLASS_SLAB,
                   ModBlocks.MAGENTA_STAINED_GLASS_BUTTON,
                   ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.MAGENTA_STAINED_GLASS_FENCE,
                   ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.MAGENTA_STAINED_GLASS_DOOR,
                   ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.MAGENTA_STAINED_GLASS_WALL,
                   ModBlocks.PINK_STAINED_GLASS_STAIRS,
                   ModBlocks.PINK_STAINED_GLASS_SLAB,
                   ModBlocks.PINK_STAINED_GLASS_BUTTON,
                   ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE,
                   ModBlocks.PINK_STAINED_GLASS_FENCE,
                   ModBlocks.PINK_STAINED_GLASS_FENCE_GATE,
                   ModBlocks.PINK_STAINED_GLASS_DOOR,
                   ModBlocks.PINK_STAINED_GLASS_TRAPDOOR,
                   ModBlocks.PINK_STAINED_GLASS_WALL);
       }
    }

    public static class VBPStrippableBlocksRegistry {


        private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(VBPStrippableBlocksRegistry.class);

        private VBPStrippableBlocksRegistry() {
        }

        public static void register(Block input, Block stripped) {
            Block old = getRegistry().put(input, stripped);

            if (old != null) {
                LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", input, old, stripped);
            }
        }

        @SuppressWarnings("unstable")
        private static Map<Block, Block> getRegistry() {
            return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
        }

        public static void registerStrippables() {
            //oak
            register(ModBlocks.OAK_WOOD_BUTTON, ModBlocks.STR_OAK_WOOD_BUTTON);
            register(ModBlocks.OAK_WOOD_FENCE, ModBlocks.STR_OAK_WOOD_FENCE);
            register(ModBlocks.OAK_WOOD_SLAB, ModBlocks.STR_OAK_WOOD_SLAB);
            register(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STR_OAK_WOOD_STAIRS);
            register(ModBlocks.OAK_WOOD_FENCE_GATE, ModBlocks.STR_OAK_WOOD_FENCE_GATE);
            register(ModBlocks.OAK_WOOD_DOOR, ModBlocks.STR_OAK_WOOD_DOOR);
            register(ModBlocks.OAK_WOOD_TRAPDOOR, ModBlocks.STR_OAK_WOOD_TRAPDOOR);
            register(ModBlocks.OAK_WOOD_PRESSURE_PLATE, ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE);
            register(ModBlocks.OAK_WOOD_WALL, ModBlocks.STR_OAK_WOOD_WALL);
            //oak
            register(ModBlocks2.OAK_LOG_BUTTON, ModBlocks2.STR_OAK_LOG_BUTTON);
            register(ModBlocks2.OAK_LOG_FENCE, ModBlocks2.STR_OAK_LOG_FENCE);
            register(ModBlocks2.OAK_LOG_SLAB, ModBlocks2.STR_OAK_LOG_SLAB);
            register(ModBlocks2.OAK_LOG_STAIRS, ModBlocks2.STR_OAK_LOG_STAIRS);
            register(ModBlocks2.OAK_LOG_FENCE_GATE, ModBlocks2.STR_OAK_LOG_FENCE_GATE);
            register(ModBlocks2.OAK_LOG_DOOR, ModBlocks2.STR_OAK_LOG_DOOR);
            register(ModBlocks2.OAK_LOG_TRAPDOOR, ModBlocks2.STR_OAK_LOG_TRAPDOOR);
            register(ModBlocks2.OAK_LOG_PRESSURE_PLATE, ModBlocks2.STR_OAK_LOG_PRESSURE_PLATE);
            register(ModBlocks2.OAK_LOG_WALL, ModBlocks2.STR_OAK_LOG_WALL);
            //spruce
            register(ModBlocks.SPRUCE_WOOD_BUTTON, ModBlocks.STR_SPRUCE_WOOD_BUTTON);
            register(ModBlocks.SPRUCE_WOOD_FENCE, ModBlocks.STR_SPRUCE_WOOD_FENCE);
            register(ModBlocks.SPRUCE_WOOD_SLAB, ModBlocks.STR_SPRUCE_WOOD_SLAB);
            register(ModBlocks.SPRUCE_WOOD_STAIRS, ModBlocks.STR_SPRUCE_WOOD_STAIRS);
            register(ModBlocks.SPRUCE_WOOD_FENCE_GATE, ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE);
            register(ModBlocks.SPRUCE_WOOD_DOOR, ModBlocks.STR_SPRUCE_WOOD_DOOR);
            register(ModBlocks.SPRUCE_WOOD_TRAPDOOR, ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
            register(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE);
            register(ModBlocks.SPRUCE_WOOD_WALL, ModBlocks.STR_SPRUCE_WOOD_WALL);
            //spruce
            register(ModBlocks2.SPRUCE_LOG_BUTTON, ModBlocks2.STR_SPRUCE_LOG_BUTTON);
            register(ModBlocks2.SPRUCE_LOG_FENCE, ModBlocks2.STR_SPRUCE_LOG_FENCE);
            register(ModBlocks2.SPRUCE_LOG_SLAB, ModBlocks2.STR_SPRUCE_LOG_SLAB);
            register(ModBlocks2.SPRUCE_LOG_STAIRS, ModBlocks2.STR_SPRUCE_LOG_STAIRS);
            register(ModBlocks2.SPRUCE_LOG_FENCE_GATE, ModBlocks2.STR_SPRUCE_LOG_FENCE_GATE);
            register(ModBlocks2.SPRUCE_LOG_DOOR, ModBlocks2.STR_SPRUCE_LOG_DOOR);
            register(ModBlocks2.SPRUCE_LOG_TRAPDOOR, ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR);
            register(ModBlocks2.SPRUCE_LOG_PRESSURE_PLATE, ModBlocks2.STR_SPRUCE_LOG_PRESSURE_PLATE);
            register(ModBlocks2.SPRUCE_LOG_WALL, ModBlocks2.STR_SPRUCE_LOG_WALL);
            //birch
            register(ModBlocks.BIRCH_WOOD_BUTTON, ModBlocks.STR_BIRCH_WOOD_BUTTON);
            register(ModBlocks.BIRCH_WOOD_FENCE, ModBlocks.STR_BIRCH_WOOD_FENCE);
            register(ModBlocks.BIRCH_WOOD_SLAB, ModBlocks.STR_BIRCH_WOOD_SLAB);
            register(ModBlocks.BIRCH_WOOD_STAIRS, ModBlocks.STR_BIRCH_WOOD_STAIRS);
            register(ModBlocks.BIRCH_WOOD_FENCE_GATE, ModBlocks.STR_BIRCH_WOOD_FENCE_GATE);
            register(ModBlocks.BIRCH_WOOD_DOOR, ModBlocks.STR_BIRCH_WOOD_DOOR);
            register(ModBlocks.BIRCH_WOOD_TRAPDOOR, ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
            register(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE);
            register(ModBlocks.BIRCH_WOOD_WALL, ModBlocks.STR_BIRCH_WOOD_WALL);
            //birch
            register(ModBlocks2.BIRCH_LOG_BUTTON, ModBlocks2.STR_BIRCH_LOG_BUTTON);
            register(ModBlocks2.BIRCH_LOG_FENCE, ModBlocks2.STR_BIRCH_LOG_FENCE);
            register(ModBlocks2.BIRCH_LOG_SLAB, ModBlocks2.STR_BIRCH_LOG_SLAB);
            register(ModBlocks2.BIRCH_LOG_STAIRS, ModBlocks2.STR_BIRCH_LOG_STAIRS);
            register(ModBlocks2.BIRCH_LOG_FENCE_GATE, ModBlocks2.STR_BIRCH_LOG_FENCE_GATE);
            register(ModBlocks2.BIRCH_LOG_DOOR, ModBlocks2.STR_BIRCH_LOG_DOOR);
            register(ModBlocks2.BIRCH_LOG_TRAPDOOR, ModBlocks2.STR_BIRCH_LOG_TRAPDOOR);
            register(ModBlocks2.BIRCH_LOG_PRESSURE_PLATE, ModBlocks2.STR_BIRCH_LOG_PRESSURE_PLATE);
            register(ModBlocks2.BIRCH_LOG_WALL, ModBlocks2.STR_BIRCH_LOG_WALL);
            //jungle
            register(ModBlocks.JUNGLE_WOOD_BUTTON, ModBlocks.STR_JUNGLE_WOOD_BUTTON);
            register(ModBlocks.JUNGLE_WOOD_FENCE, ModBlocks.STR_JUNGLE_WOOD_FENCE);
            register(ModBlocks.JUNGLE_WOOD_SLAB, ModBlocks.STR_JUNGLE_WOOD_SLAB);
            register(ModBlocks.JUNGLE_WOOD_STAIRS, ModBlocks.STR_JUNGLE_WOOD_STAIRS);
            register(ModBlocks.JUNGLE_WOOD_FENCE_GATE, ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE);
            register(ModBlocks.JUNGLE_WOOD_DOOR, ModBlocks.STR_JUNGLE_WOOD_DOOR);
            register(ModBlocks.JUNGLE_WOOD_TRAPDOOR, ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
            register(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE);
            register(ModBlocks.JUNGLE_WOOD_WALL, ModBlocks.STR_JUNGLE_WOOD_WALL);
            //jungle
            register(ModBlocks2.JUNGLE_LOG_BUTTON, ModBlocks2.STR_JUNGLE_LOG_BUTTON);
            register(ModBlocks2.JUNGLE_LOG_FENCE, ModBlocks2.STR_JUNGLE_LOG_FENCE);
            register(ModBlocks2.JUNGLE_LOG_SLAB, ModBlocks2.STR_JUNGLE_LOG_SLAB);
            register(ModBlocks2.JUNGLE_LOG_STAIRS, ModBlocks2.STR_JUNGLE_LOG_STAIRS);
            register(ModBlocks2.JUNGLE_LOG_FENCE_GATE, ModBlocks2.STR_JUNGLE_LOG_FENCE_GATE);
            register(ModBlocks2.JUNGLE_LOG_DOOR, ModBlocks2.STR_JUNGLE_LOG_DOOR);
            register(ModBlocks2.JUNGLE_LOG_TRAPDOOR, ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR);
            register(ModBlocks2.JUNGLE_LOG_PRESSURE_PLATE, ModBlocks2.STR_JUNGLE_LOG_PRESSURE_PLATE);
            register(ModBlocks2.JUNGLE_LOG_WALL, ModBlocks2.STR_JUNGLE_LOG_WALL);
            //acacia
            register(ModBlocks.ACACIA_WOOD_BUTTON, ModBlocks.STR_ACACIA_WOOD_BUTTON);
            register(ModBlocks.ACACIA_WOOD_FENCE, ModBlocks.STR_ACACIA_WOOD_FENCE);
            register(ModBlocks.ACACIA_WOOD_SLAB, ModBlocks.STR_ACACIA_WOOD_SLAB);
            register(ModBlocks.ACACIA_WOOD_STAIRS, ModBlocks.STR_ACACIA_WOOD_STAIRS);
            register(ModBlocks.ACACIA_WOOD_FENCE_GATE, ModBlocks.STR_ACACIA_WOOD_FENCE_GATE);
            register(ModBlocks.ACACIA_WOOD_DOOR, ModBlocks.STR_ACACIA_WOOD_DOOR);
            register(ModBlocks.ACACIA_WOOD_TRAPDOOR, ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
            register(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE);
            register(ModBlocks.ACACIA_WOOD_WALL, ModBlocks.STR_ACACIA_WOOD_WALL);
            //acacia
            register(ModBlocks2.ACACIA_LOG_BUTTON, ModBlocks2.STR_ACACIA_LOG_BUTTON);
            register(ModBlocks2.ACACIA_LOG_FENCE, ModBlocks2.STR_ACACIA_LOG_FENCE);
            register(ModBlocks2.ACACIA_LOG_SLAB, ModBlocks2.STR_ACACIA_LOG_SLAB);
            register(ModBlocks2.ACACIA_LOG_STAIRS, ModBlocks2.STR_ACACIA_LOG_STAIRS);
            register(ModBlocks2.ACACIA_LOG_FENCE_GATE, ModBlocks2.STR_ACACIA_LOG_FENCE_GATE);
            register(ModBlocks2.ACACIA_LOG_DOOR, ModBlocks2.STR_ACACIA_LOG_DOOR);
            register(ModBlocks2.ACACIA_LOG_TRAPDOOR, ModBlocks2.STR_ACACIA_LOG_TRAPDOOR);
            register(ModBlocks2.ACACIA_LOG_PRESSURE_PLATE, ModBlocks2.STR_ACACIA_LOG_PRESSURE_PLATE);
            register(ModBlocks2.ACACIA_LOG_WALL, ModBlocks2.STR_ACACIA_LOG_WALL);
            //dark_oak
            register(ModBlocks.DARK_OAK_WOOD_BUTTON, ModBlocks.STR_DARK_OAK_WOOD_BUTTON);
            register(ModBlocks.DARK_OAK_WOOD_FENCE, ModBlocks.STR_DARK_OAK_WOOD_FENCE);
            register(ModBlocks.DARK_OAK_WOOD_SLAB, ModBlocks.STR_DARK_OAK_WOOD_SLAB);
            register(ModBlocks.DARK_OAK_WOOD_STAIRS, ModBlocks.STR_DARK_OAK_WOOD_STAIRS);
            register(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE);
            register(ModBlocks.DARK_OAK_WOOD_DOOR, ModBlocks.STR_DARK_OAK_WOOD_DOOR);
            register(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
            register(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE);
            register(ModBlocks.DARK_OAK_WOOD_WALL, ModBlocks.STR_DARK_OAK_WOOD_WALL);
            //dark_oak
            register(ModBlocks2.DARK_OAK_LOG_BUTTON, ModBlocks2.STR_DARK_OAK_LOG_BUTTON);
            register(ModBlocks2.DARK_OAK_LOG_FENCE, ModBlocks2.STR_DARK_OAK_LOG_FENCE);
            register(ModBlocks2.DARK_OAK_LOG_SLAB, ModBlocks2.STR_DARK_OAK_LOG_SLAB);
            register(ModBlocks2.DARK_OAK_LOG_STAIRS, ModBlocks2.STR_DARK_OAK_LOG_STAIRS);
            register(ModBlocks2.DARK_OAK_LOG_FENCE_GATE, ModBlocks2.STR_DARK_OAK_LOG_FENCE_GATE);
            register(ModBlocks2.DARK_OAK_LOG_DOOR, ModBlocks2.STR_DARK_OAK_LOG_DOOR);
            register(ModBlocks2.DARK_OAK_LOG_TRAPDOOR, ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR);
            register(ModBlocks2.DARK_OAK_LOG_PRESSURE_PLATE, ModBlocks2.STR_DARK_OAK_LOG_PRESSURE_PLATE);
            register(ModBlocks2.DARK_OAK_LOG_WALL, ModBlocks2.STR_DARK_OAK_LOG_WALL);
            //mangrove
            register(ModBlocks.MANGROVE_WOOD_BUTTON, ModBlocks.STR_MANGROVE_WOOD_BUTTON);
            register(ModBlocks.MANGROVE_WOOD_FENCE, ModBlocks.STR_MANGROVE_WOOD_FENCE);
            register(ModBlocks.MANGROVE_WOOD_SLAB, ModBlocks.STR_MANGROVE_WOOD_SLAB);
            register(ModBlocks.MANGROVE_WOOD_STAIRS, ModBlocks.STR_MANGROVE_WOOD_STAIRS);
            register(ModBlocks.MANGROVE_WOOD_FENCE_GATE, ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE);
            register(ModBlocks.MANGROVE_WOOD_DOOR, ModBlocks.STR_MANGROVE_WOOD_DOOR);
            register(ModBlocks.MANGROVE_WOOD_TRAPDOOR, ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
            register(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE);
            register(ModBlocks.MANGROVE_WOOD_WALL, ModBlocks.STR_MANGROVE_WOOD_WALL);
            //mangrove
            register(ModBlocks2.MANGROVE_LOG_BUTTON, ModBlocks2.STR_MANGROVE_LOG_BUTTON);
            register(ModBlocks2.MANGROVE_LOG_FENCE, ModBlocks2.STR_MANGROVE_LOG_FENCE);
            register(ModBlocks2.MANGROVE_LOG_SLAB, ModBlocks2.STR_MANGROVE_LOG_SLAB);
            register(ModBlocks2.MANGROVE_LOG_STAIRS, ModBlocks2.STR_MANGROVE_LOG_STAIRS);
            register(ModBlocks2.MANGROVE_LOG_FENCE_GATE, ModBlocks2.STR_MANGROVE_LOG_FENCE_GATE);
            register(ModBlocks2.MANGROVE_LOG_DOOR, ModBlocks2.STR_MANGROVE_LOG_DOOR);
            register(ModBlocks2.MANGROVE_LOG_TRAPDOOR, ModBlocks2.STR_MANGROVE_LOG_TRAPDOOR);
            register(ModBlocks2.MANGROVE_LOG_PRESSURE_PLATE, ModBlocks2.STR_MANGROVE_LOG_PRESSURE_PLATE);
            register(ModBlocks2.MANGROVE_LOG_WALL, ModBlocks2.STR_MANGROVE_LOG_WALL);
            //cherry
            register(ModBlocks.CHERRY_WOOD_BUTTON, ModBlocks.STR_CHERRY_WOOD_BUTTON);
            register(ModBlocks.CHERRY_WOOD_FENCE, ModBlocks.STR_CHERRY_WOOD_FENCE);
            register(ModBlocks.CHERRY_WOOD_SLAB, ModBlocks.STR_CHERRY_WOOD_SLAB);
            register(ModBlocks.CHERRY_WOOD_STAIRS, ModBlocks.STR_CHERRY_WOOD_STAIRS);
            register(ModBlocks.CHERRY_WOOD_FENCE_GATE, ModBlocks.STR_CHERRY_WOOD_FENCE_GATE);
            register(ModBlocks.CHERRY_WOOD_DOOR, ModBlocks.STR_CHERRY_WOOD_DOOR);
            register(ModBlocks.CHERRY_WOOD_TRAPDOOR, ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
            register(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE);
            register(ModBlocks.CHERRY_WOOD_WALL, ModBlocks.STR_CHERRY_WOOD_WALL);
            //cherry
            register(ModBlocks2.CHERRY_LOG_BUTTON, ModBlocks2.STR_CHERRY_LOG_BUTTON);
            register(ModBlocks2.CHERRY_LOG_FENCE, ModBlocks2.STR_CHERRY_LOG_FENCE);
            register(ModBlocks2.CHERRY_LOG_SLAB, ModBlocks2.STR_CHERRY_LOG_SLAB);
            register(ModBlocks2.CHERRY_LOG_STAIRS, ModBlocks2.STR_CHERRY_LOG_STAIRS);
            register(ModBlocks2.CHERRY_LOG_FENCE_GATE, ModBlocks2.STR_CHERRY_LOG_FENCE_GATE);
            register(ModBlocks2.CHERRY_LOG_DOOR, ModBlocks2.STR_CHERRY_LOG_DOOR);
            register(ModBlocks2.CHERRY_LOG_TRAPDOOR, ModBlocks2.STR_CHERRY_LOG_TRAPDOOR);
            register(ModBlocks2.CHERRY_LOG_PRESSURE_PLATE, ModBlocks2.STR_CHERRY_LOG_PRESSURE_PLATE);
            register(ModBlocks2.CHERRY_LOG_WALL, ModBlocks2.STR_CHERRY_LOG_WALL);
            //pale_oak
            register(ModBlocks.PALE_OAK_WOOD_BUTTON, ModBlocks.STR_PALE_OAK_WOOD_BUTTON);
            register(ModBlocks.PALE_OAK_WOOD_FENCE, ModBlocks.STR_PALE_OAK_WOOD_FENCE);
            register(ModBlocks.PALE_OAK_WOOD_SLAB, ModBlocks.STR_PALE_OAK_WOOD_SLAB);
            register(ModBlocks.PALE_OAK_WOOD_STAIRS, ModBlocks.STR_PALE_OAK_WOOD_STAIRS);
            register(ModBlocks.PALE_OAK_WOOD_FENCE_GATE, ModBlocks.STR_PALE_OAK_WOOD_FENCE_GATE);
            register(ModBlocks.PALE_OAK_WOOD_DOOR, ModBlocks.STR_PALE_OAK_WOOD_DOOR);
            register(ModBlocks.PALE_OAK_WOOD_TRAPDOOR, ModBlocks.STR_PALE_OAK_WOOD_TRAPDOOR);
            register(ModBlocks.PALE_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STR_PALE_OAK_WOOD_PRESSURE_PLATE);
            register(ModBlocks.PALE_OAK_WOOD_WALL, ModBlocks.STR_PALE_OAK_WOOD_WALL);
            //pale_oak
            register(ModBlocks2.PALE_OAK_LOG_BUTTON, ModBlocks2.STR_PALE_OAK_LOG_BUTTON);
            register(ModBlocks2.PALE_OAK_LOG_FENCE, ModBlocks2.STR_PALE_OAK_LOG_FENCE);
            register(ModBlocks2.PALE_OAK_LOG_SLAB, ModBlocks2.STR_PALE_OAK_LOG_SLAB);
            register(ModBlocks2.PALE_OAK_LOG_STAIRS, ModBlocks2.STR_PALE_OAK_LOG_STAIRS);
            register(ModBlocks2.PALE_OAK_LOG_FENCE_GATE, ModBlocks2.STR_PALE_OAK_LOG_FENCE_GATE);
            register(ModBlocks2.PALE_OAK_LOG_DOOR, ModBlocks2.STR_PALE_OAK_LOG_DOOR);
            register(ModBlocks2.PALE_OAK_LOG_TRAPDOOR, ModBlocks2.STR_PALE_OAK_LOG_TRAPDOOR);
            register(ModBlocks2.PALE_OAK_LOG_PRESSURE_PLATE, ModBlocks2.STR_PALE_OAK_LOG_PRESSURE_PLATE);
            register(ModBlocks2.PALE_OAK_LOG_WALL, ModBlocks2.STR_PALE_OAK_LOG_WALL);
            //cherry
            register(ModBlocks.BAMBOO_BLOCK_BUTTON, ModBlocks.STR_BAMBOO_BLOCK_BUTTON);
            register(ModBlocks.BAMBOO_BLOCK_FENCE, ModBlocks.STR_BAMBOO_BLOCK_FENCE);
            register(ModBlocks.BAMBOO_BLOCK_SLAB, ModBlocks.STR_BAMBOO_BLOCK_SLAB);
            register(ModBlocks.BAMBOO_BLOCK_STAIRS, ModBlocks.STR_BAMBOO_BLOCK_STAIRS);
            register(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE);
            register(ModBlocks.BAMBOO_BLOCK_DOOR, ModBlocks.STR_BAMBOO_BLOCK_DOOR);
            register(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
            register(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE);
            register(ModBlocks.BAMBOO_BLOCK_WALL, ModBlocks.STR_BAMBOO_BLOCK_WALL);
            //cherry
            register(ModBlocks.CRIMSON_HYPHAE_BUTTON, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON);
            register(ModBlocks.CRIMSON_HYPHAE_FENCE, ModBlocks.STR_CRIMSON_HYPHAE_FENCE);
            register(ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STR_CRIMSON_HYPHAE_SLAB);
            register(ModBlocks.CRIMSON_HYPHAE_STAIRS, ModBlocks.STR_CRIMSON_HYPHAE_STAIRS);
            register(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE);
            register(ModBlocks.CRIMSON_HYPHAE_DOOR, ModBlocks.STR_CRIMSON_HYPHAE_DOOR);
            register(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
            register(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE);
            register(ModBlocks.CRIMSON_HYPHAE_WALL, ModBlocks.STR_CRIMSON_HYPHAE_WALL);
            //cherry
            register(ModBlocks2.CRIMSON_STEM_BUTTON, ModBlocks2.STR_CRIMSON_STEM_BUTTON);
            register(ModBlocks2.CRIMSON_STEM_FENCE, ModBlocks2.STR_CRIMSON_STEM_FENCE);
            register(ModBlocks2.CRIMSON_STEM_SLAB, ModBlocks2.STR_CRIMSON_STEM_SLAB);
            register(ModBlocks2.CRIMSON_STEM_STAIRS, ModBlocks2.STR_CRIMSON_STEM_STAIRS);
            register(ModBlocks2.CRIMSON_STEM_FENCE_GATE, ModBlocks2.STR_CRIMSON_STEM_FENCE_GATE);
            register(ModBlocks2.CRIMSON_STEM_DOOR, ModBlocks2.STR_CRIMSON_STEM_DOOR);
            register(ModBlocks2.CRIMSON_STEM_TRAPDOOR, ModBlocks2.STR_CRIMSON_STEM_TRAPDOOR);
            register(ModBlocks2.CRIMSON_STEM_PRESSURE_PLATE, ModBlocks2.STR_CRIMSON_STEM_PRESSURE_PLATE);
            register(ModBlocks2.CRIMSON_STEM_WALL, ModBlocks2.STR_CRIMSON_STEM_WALL);
            //cherry
            register(ModBlocks.WARPED_HYPHAE_BUTTON, ModBlocks.STR_WARPED_HYPHAE_BUTTON);
            register(ModBlocks.WARPED_HYPHAE_FENCE, ModBlocks.STR_WARPED_HYPHAE_FENCE);
            register(ModBlocks.WARPED_HYPHAE_SLAB, ModBlocks.STR_WARPED_HYPHAE_SLAB);
            register(ModBlocks.WARPED_HYPHAE_STAIRS, ModBlocks.STR_WARPED_HYPHAE_STAIRS);
            register(ModBlocks.WARPED_HYPHAE_FENCE_GATE, ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE);
            register(ModBlocks.WARPED_HYPHAE_DOOR, ModBlocks.STR_WARPED_HYPHAE_DOOR);
            register(ModBlocks.WARPED_HYPHAE_TRAPDOOR, ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
            register(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE);
            register(ModBlocks.WARPED_HYPHAE_WALL, ModBlocks.STR_WARPED_HYPHAE_WALL);
            //cherry
            register(ModBlocks2.WARPED_STEM_BUTTON, ModBlocks2.STR_WARPED_STEM_BUTTON);
            register(ModBlocks2.WARPED_STEM_FENCE, ModBlocks2.STR_WARPED_STEM_FENCE);
            register(ModBlocks2.WARPED_STEM_SLAB, ModBlocks2.STR_WARPED_STEM_SLAB);
            register(ModBlocks2.WARPED_STEM_STAIRS, ModBlocks2.STR_WARPED_STEM_STAIRS);
            register(ModBlocks2.WARPED_STEM_FENCE_GATE, ModBlocks2.STR_WARPED_STEM_FENCE_GATE);
            register(ModBlocks2.WARPED_STEM_DOOR, ModBlocks2.STR_WARPED_STEM_DOOR);
            register(ModBlocks2.WARPED_STEM_TRAPDOOR, ModBlocks2.STR_WARPED_STEM_TRAPDOOR);
            register(ModBlocks2.WARPED_STEM_PRESSURE_PLATE, ModBlocks2.STR_WARPED_STEM_PRESSURE_PLATE);
            register(ModBlocks2.WARPED_STEM_WALL, ModBlocks2.STR_WARPED_STEM_WALL);
        }
    }
}

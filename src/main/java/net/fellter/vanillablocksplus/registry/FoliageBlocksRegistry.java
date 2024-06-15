package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;

public class FoliageBlocksRegistry {
    public static void foliageBlocksMethod() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                    if (world == null || pos == null) {
                        return FoliageColors.getDefaultColor();
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
                        return FoliageColors.getDefaultColor();
                    }
                    return BiomeColors.getFoliageColor(world, pos);
                },
                ModBlocks.OAK_LEAVES_SLAB,
                ModBlocks.OAK_LEAVES_BUTTON,
                ModBlocks.OAK_LEAVES_FENCE,
                ModBlocks.OAK_LEAVES_STAIRS,
                ModBlocks.OAK_LEAVES_WALL,
                ModBlocks.OAK_LEAVES_FENCE_GATE,
                ModBlocks.OAK_LEAVES_DOOR,
                ModBlocks.OAK_LEAVES_TRAPDOOR,
                ModBlocks.OAK_LEAVES_PRESSURE_PLATE,
                ModBlocks.SPRUCE_LEAVES_SLAB,
                ModBlocks.SPRUCE_LEAVES_BUTTON,
                ModBlocks.SPRUCE_LEAVES_FENCE,
                ModBlocks.SPRUCE_LEAVES_STAIRS,
                ModBlocks.SPRUCE_LEAVES_WALL,
                ModBlocks.SPRUCE_LEAVES_FENCE_GATE,
                ModBlocks.SPRUCE_LEAVES_DOOR,
                ModBlocks.SPRUCE_LEAVES_TRAPDOOR,
                ModBlocks.SPRUCE_LEAVES_PRESSURE_PLATE);

        ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> FoliageColors.getDefaultColor()),
                ModBlocks.GRASS_SLAB,
                ModBlocks.GRASS_BUTTON,
                ModBlocks.GRASS_FENCE,
                ModBlocks.GRASS_STAIRS,
                ModBlocks.GRASS_WALL,
                ModBlocks.GRASS_FENCE_GATE,
                ModBlocks.GRASS_TRAPDOOR,
                ModBlocks.GRASS_PRESSURE_PLATE,
                ModBlocks.OAK_LEAVES_SLAB,
                ModBlocks.OAK_LEAVES_BUTTON,
                ModBlocks.OAK_LEAVES_FENCE,
                ModBlocks.OAK_LEAVES_STAIRS,
                ModBlocks.OAK_LEAVES_WALL,
                ModBlocks.OAK_LEAVES_FENCE_GATE,
                ModBlocks.OAK_LEAVES_DOOR,
                ModBlocks.OAK_LEAVES_TRAPDOOR,
                ModBlocks.OAK_LEAVES_PRESSURE_PLATE,
                ModBlocks.SPRUCE_LEAVES_SLAB,
                ModBlocks.SPRUCE_LEAVES_BUTTON,
                ModBlocks.SPRUCE_LEAVES_FENCE,
                ModBlocks.SPRUCE_LEAVES_STAIRS,
                ModBlocks.SPRUCE_LEAVES_WALL,
                ModBlocks.SPRUCE_LEAVES_FENCE_GATE,
                ModBlocks.SPRUCE_LEAVES_DOOR,
                ModBlocks.SPRUCE_LEAVES_TRAPDOOR,
                ModBlocks.SPRUCE_LEAVES_PRESSURE_PLATE);

    }
}

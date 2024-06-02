package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;

public class GrassBlocksRegistry {
    public static void grassBlocksMethod() {
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

        ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> FoliageColors.getDefaultColor()),
                ModBlocks.GRASS_SLAB,
                ModBlocks.GRASS_BUTTON,
                ModBlocks.GRASS_FENCE,
                ModBlocks.GRASS_STAIRS,
                ModBlocks.GRASS_WALL,
                ModBlocks.GRASS_FENCE_GATE,
                ModBlocks.GRASS_TRAPDOOR,
                ModBlocks.GRASS_PRESSURE_PLATE);
    }
}

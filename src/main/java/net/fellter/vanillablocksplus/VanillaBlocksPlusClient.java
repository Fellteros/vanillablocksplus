package net.fellter.vanillablocksplus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.registry.GrassBlocksRegistry;
import net.fellter.vanillablocksplus.registry.TransparentBlocksRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.data.client.TexturedModel;

public class VanillaBlocksPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        TransparentBlocksRegistry.translucentBlocksMethod();
        GrassBlocksRegistry.grassBlocksMethod();

    }
}


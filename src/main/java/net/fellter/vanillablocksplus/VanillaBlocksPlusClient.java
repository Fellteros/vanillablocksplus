package net.fellter.vanillablocksplus;

import net.fellter.vanillablocksplus.registry.ModRegistries;

import net.fabricmc.api.ClientModInitializer;

public class VanillaBlocksPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModRegistries.TransparentBlocksRegistry.registerTransparentBlocks();
        ModRegistries.FoliageBlocksRegistry.registerFoliage();

    }
}


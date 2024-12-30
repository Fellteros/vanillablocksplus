package net.fellter.vanillablocksplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillablocksplus.registry.ModRegistries;

public class VanillaBlocksPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModRegistries.TransparentBlocksRegistry.registerTransparentBlocks();
        ModRegistries.FoliageBlocksRegistry.registerFoliage();

    }
}


package net.fellter.vanillablocksplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillablocksplus.registry.FoliageBlocksRegistry;
import net.fellter.vanillablocksplus.registry.TransparentBlocksRegistry;

public class VanillaBlocksPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        TransparentBlocksRegistry.translucentBlocksMethod();
        FoliageBlocksRegistry.foliageBlocksMethod();

    }
}


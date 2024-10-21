package net.fellter.vanillablocksplus.registry;

import net.fellter.vanillablocksplus.block.ModBlocks;

public class FuelRegistry {

    public static void registerFuel() {
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_BUTTON, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_FENCE_GATE, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_FENCE, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_DOOR, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_PRESSURE_PLATE, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_TRAPDOOR, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_SLAB, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_STAIRS, 200);
        net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE
                .add(ModBlocks.COAL_WALL, 200);
    }
}

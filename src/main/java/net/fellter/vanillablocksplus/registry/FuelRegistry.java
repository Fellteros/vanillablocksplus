package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fellter.vanillablocksplus.block.ModBlocks;

public class FuelRegistry {
    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModBlocks.COAL_BUTTON, context.baseSmeltTime())
                    .add(ModBlocks.COAL_FENCE_GATE, context.baseSmeltTime())
                    .add(ModBlocks.COAL_FENCE, context.baseSmeltTime())
                    .add(ModBlocks.COAL_DOOR, context.baseSmeltTime())
                    .add(ModBlocks.COAL_PRESSURE_PLATE, context.baseSmeltTime())
                    .add(ModBlocks.COAL_TRAPDOOR, context.baseSmeltTime())
                    .add(ModBlocks.COAL_SLAB, context.baseSmeltTime())
                    .add(ModBlocks.COAL_STAIRS, context.baseSmeltTime())
                    .add(ModBlocks.COAL_WALL, context.baseSmeltTime())
            ;
        });
    }
}

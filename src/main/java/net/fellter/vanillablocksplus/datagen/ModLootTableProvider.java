package net.fellter.vanillablocksplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillablocksplus.VanillaBlocksPlus;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        Registries.BLOCK.forEach(block -> {
            if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaBlocksPlus.MOD_ID) && block.getLootTableKey().isPresent()) {
                if (block instanceof DoorBlock) {
                    addDrop(block, doorDrops(block));
                } else if (block instanceof SlabBlock) {
                    addDrop(block, slabDrops(block));
                } else {
                    addDrop(block);
                }
            }
        });
    }
}

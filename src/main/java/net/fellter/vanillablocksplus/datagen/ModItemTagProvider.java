package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.INGREDIENTS)
                .add(ModItems.COAL_BIT)
                .add(ModItems.DIAMOND_DUST)
                .add(ModItems.NETHERITE_BIT)
                .add(ModItems.EMERALD_FRAGMENT)
                .add(ModItems.GOLD_BIT)
                .add(ModItems.IRON_BIT)
                .add(ModItems.LAPIS_BIT)
                .add(ModItems.REDSTONE_SHARD);

    }
}

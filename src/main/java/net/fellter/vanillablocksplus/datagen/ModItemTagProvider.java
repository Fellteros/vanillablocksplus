package net.fellter.vanillablocksplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.util.ModTags;

import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {
		getTagBuilder(ModTags.Items.INGREDIENTS)
				.add(Registries.ITEM.getId(ModItems.COAL_BIT))
				.add(Registries.ITEM.getId(ModItems.DIAMOND_DUST))
				.add(Registries.ITEM.getId(ModItems.NETHERITE_BIT))
				.add(Registries.ITEM.getId(ModItems.EMERALD_FRAGMENT))
				.add(Registries.ITEM.getId(ModItems.GOLD_BIT))
				.add(Registries.ITEM.getId(ModItems.IRON_BIT))
				.add(Registries.ITEM.getId(ModItems.LAPIS_BIT))
				.add(Registries.ITEM.getId(ModItems.REDSTONE_SHARD));

	}
}

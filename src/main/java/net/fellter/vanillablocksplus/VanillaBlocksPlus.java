package net.fellter.vanillablocksplus;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.item.ModItemGroups;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.registry.FlammableBlocksRegistry;
import net.fellter.vanillablocksplus.registry.OxidizableBlockRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaBlocksPlus implements ModInitializer {

	public static final String MOD_ID = "vanillablocksplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		FlammableBlocksRegistry.registerFlammables();
		OxidizableBlockRegistry.registerOxidizables();



	}
}
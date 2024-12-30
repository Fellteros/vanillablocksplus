package net.fellter.vanillablocksplus;

import net.fabricmc.api.ModInitializer;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.fellter.vanillablocksplus.item.ModItemGroups;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.registry.*;
import net.minecraft.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaBlocksPlus implements ModInitializer {

	public static final String MOD_ID = "vanillablocksplus";
    public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Blocks");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModBlocks2.registerModBlocks2();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModRegistries.FlammableBlocksRegistry.registerFlammables();
		ModRegistries.OxidizableBlockRegistry.registerOxidizables();
		ModRegistries.VBPStrippableBlocksRegistry.registerStrippables();
		ModRegistries.FuelRegistry.registerFuels();

		LOGGER.info("Initialized Vanilla+ Blocks");


	}
}
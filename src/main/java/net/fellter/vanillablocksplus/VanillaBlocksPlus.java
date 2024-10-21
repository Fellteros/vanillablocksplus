package net.fellter.vanillablocksplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.fellter.vanillablocksplus.item.ModItemGroups;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.registry.FlammableBlocksRegistry;
import net.fellter.vanillablocksplus.registry.FuelRegistry;
import net.fellter.vanillablocksplus.registry.OxidizableBlockRegistry;
import net.fellter.vanillablocksplus.registry.StrippableBlocksRegistry;
import net.minecraft.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaBlocksPlus implements ModInitializer {

	public static final String MOD_ID = "vanillablocksplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModBlocks2.registerModBlocks2();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		FlammableBlocksRegistry.registerFlammables();
		OxidizableBlockRegistry.registerOxidizables();
		StrippableBlocksRegistry.registerStrippables();
		FuelRegistry.registerFuel();




	}
}
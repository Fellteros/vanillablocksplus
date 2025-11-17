package net.fellter.vanillablocksplus;

import java.util.Objects;

import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.fellter.vanillablocksplus.item.ModItemGroups;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.registry.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.registry.Registry;

import net.fabricmc.api.ModInitializer;

public class VanillaBlocksPlus implements ModInitializer {

	public static final String MOD_ID = "vanillablocksplus";
    public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Blocks");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModBlocks2.registerModBlocks2();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModRegistries.registerFlammables();
		ModRegistries.registerOxidizables();
		ModRegistries.registerStrippables();
		ModRegistries.registerFuels();

		LOGGER.info("Initialized Vanilla+ Blocks");
	}

	public static <T> boolean isNamespaced(T value, Registry<T> registry) {
		if (registry.getId(value) == null) {
			return false;
		} else {
			return Objects.equals(registry.getId(value).getNamespace(), MOD_ID);
		}
	}
}
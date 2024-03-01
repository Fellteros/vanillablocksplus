package net.fellter.vanillablocksplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VBP_TITLE = registerItem("vbp_title", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VanillaBlocksPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Items for " + VanillaBlocksPlus.MOD_ID);

    }
}

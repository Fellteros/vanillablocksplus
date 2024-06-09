package net.fellter.vanillablocksplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VBP_TITLE = registerItem("vbp_title", new Item(new FabricItemSettings()));

    //ingredients
    public static final Item COAL_BIT = registerItem("coal_bit", new Item(new FabricItemSettings()));
    public static final Item IRON_BIT = registerItem("iron_bit", new Item(new FabricItemSettings()));
    public static final Item GOLD_BIT = registerItem("gold_bit", new Item(new FabricItemSettings()));
    public static final Item REDSTONE_SHARD = registerItem("redstone_shard", new Item(new FabricItemSettings()));
    public static final Item EMERALD_FRAGMENT = registerItem("emerald_fragment", new Item(new FabricItemSettings()));
    public static final Item LAPIS_BIT = registerItem("lapis_bit", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_BIT = registerItem("netherite_bit", new Item(new FabricItemSettings()));
    public static final Item COPPER_BIT = registerItem("copper_bit", new Item(new FabricItemSettings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VanillaBlocksPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Items for " + VanillaBlocksPlus.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::addItemsToIngredientsTab);
    }
}

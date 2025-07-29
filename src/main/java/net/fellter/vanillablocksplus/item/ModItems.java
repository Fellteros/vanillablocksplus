package net.fellter.vanillablocksplus.item;

import java.util.function.Function;

import net.fellter.vanillablocksplus.VanillaBlocksPlus;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VBP_TITLE = registerItem("vbp_title", Item::new);

    //ingredients
    public static final Item COAL_BIT = registerItem("coal_bit", Item::new);
    public static final Item IRON_BIT = registerItem("iron_bit", Item::new);
    public static final Item GOLD_BIT = registerItem("gold_bit", Item::new);
    public static final Item REDSTONE_SHARD = registerItem("redstone_shard", Item::new);
    public static final Item EMERALD_FRAGMENT = registerItem("emerald_fragment", Item::new);
    public static final Item LAPIS_BIT = registerItem("lapis_bit", Item::new);
    public static final Item DIAMOND_DUST = registerItem("diamond_dust", Item::new);
    public static final Item NETHERITE_BIT = registerItem("netherite_bit", Item::new);
    public static final Item COPPER_BIT = registerItem("copper_bit", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name))));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name));
    }

    public static void registerModItems() {
    }


}

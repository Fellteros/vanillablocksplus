package net.fellter.vanillablocksplus.util;

import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> INGREDIENTS = createTag("v_ingredients");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name));
        }
    }
}

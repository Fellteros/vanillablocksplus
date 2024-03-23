package net.fellter.vanillablocksplus.util;

import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> STRIPPABLE_BLOCKS = createTag("strippable_blocks");
        public static final TagKey<Block> STRIPPED_BLOCKS = createTag("stripped_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(VanillaBlocksPlus.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> INGREDIENTS = createTag("v_ingredients");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(VanillaBlocksPlus.MOD_ID, name));
        }
    }
}

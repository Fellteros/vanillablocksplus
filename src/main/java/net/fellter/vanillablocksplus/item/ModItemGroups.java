package net.fellter.vanillablocksplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VBP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaBlocksPlus.MOD_ID, "vbp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vanillablocksplus"))
                    .icon(() -> new ItemStack(ModItems.VBP_TITLE)).entries((displayContext, entries) -> {

                        //oak
                        entries.add(ModBlocks.OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.OAK_WOOD_SLAB);
                        entries.add(ModBlocks.OAK_WOOD_FENCE);
                        entries.add(ModBlocks.OAK_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.OAK_WOOD_DOOR);
                        entries.add(ModBlocks.OAK_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.OAK_WOOD_BUTTON);
                        //str oak
                        entries.add(ModBlocks.STR_OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.STR_OAK_WOOD_FENCE);
                        entries.add(ModBlocks.STR_OAK_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_OAK_WOOD_DOOR);
                        entries.add(ModBlocks.STR_OAK_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_OAK_WOOD_BUTTON);
                        //spruce
                        entries.add(ModBlocks.SPRUCE_WOOD_STAIRS);
                        entries.add(ModBlocks.SPRUCE_WOOD_SLAB);
                        entries.add(ModBlocks.SPRUCE_WOOD_FENCE);
                        entries.add(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.SPRUCE_WOOD_DOOR);
                        entries.add(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.SPRUCE_WOOD_BUTTON);
                        //str spruce
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_SLAB);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_FENCE);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_DOOR);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_SPRUCE_WOOD_BUTTON);
                        //birch
                        entries.add(ModBlocks.BIRCH_WOOD_STAIRS);
                        entries.add(ModBlocks.BIRCH_WOOD_SLAB);
                        entries.add(ModBlocks.BIRCH_WOOD_FENCE);
                        entries.add(ModBlocks.BIRCH_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.BIRCH_WOOD_DOOR);
                        entries.add(ModBlocks.BIRCH_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.BIRCH_WOOD_BUTTON);
                        //str birch
                        entries.add(ModBlocks.STR_BIRCH_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_SLAB);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_FENCE);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_DOOR);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_BIRCH_WOOD_BUTTON);
                        //jungle
                        entries.add(ModBlocks.JUNGLE_WOOD_STAIRS);
                        entries.add(ModBlocks.JUNGLE_WOOD_SLAB);
                        entries.add(ModBlocks.JUNGLE_WOOD_FENCE);
                        entries.add(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.JUNGLE_WOOD_DOOR);
                        entries.add(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.JUNGLE_WOOD_BUTTON);
                        //str jungle
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_SLAB);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_FENCE);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_DOOR);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_JUNGLE_WOOD_BUTTON);
                        //acacia
                        entries.add(ModBlocks.ACACIA_WOOD_STAIRS);
                        entries.add(ModBlocks.ACACIA_WOOD_SLAB);
                        entries.add(ModBlocks.ACACIA_WOOD_FENCE);
                        entries.add(ModBlocks.ACACIA_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.ACACIA_WOOD_DOOR);
                        entries.add(ModBlocks.ACACIA_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.ACACIA_WOOD_BUTTON);
                        //str acacia
                        entries.add(ModBlocks.STR_ACACIA_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_SLAB);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_FENCE);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_DOOR);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_ACACIA_WOOD_BUTTON);
                        //dark oak
                        entries.add(ModBlocks.DARK_OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.DARK_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.DARK_OAK_WOOD_FENCE);
                        entries.add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.DARK_OAK_WOOD_DOOR);
                        entries.add(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.DARK_OAK_WOOD_BUTTON);
                        //str dark oak
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_SLAB);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_FENCE);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_DOOR);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_DARK_OAK_WOOD_BUTTON);
                        //mangrove
                        entries.add(ModBlocks.MANGROVE_WOOD_STAIRS);
                        entries.add(ModBlocks.MANGROVE_WOOD_SLAB);
                        entries.add(ModBlocks.MANGROVE_WOOD_FENCE);
                        entries.add(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.MANGROVE_WOOD_DOOR);
                        entries.add(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.MANGROVE_WOOD_BUTTON);
                        //str mangrove
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_SLAB);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_FENCE);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_DOOR);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_MANGROVE_WOOD_BUTTON);
                        //cherry
                        entries.add(ModBlocks.CHERRY_WOOD_STAIRS);
                        entries.add(ModBlocks.CHERRY_WOOD_SLAB);
                        entries.add(ModBlocks.CHERRY_WOOD_FENCE);
                        entries.add(ModBlocks.CHERRY_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.CHERRY_WOOD_DOOR);
                        entries.add(ModBlocks.CHERRY_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHERRY_WOOD_BUTTON);
                        //str cherry
                        entries.add(ModBlocks.STR_CHERRY_WOOD_STAIRS);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_SLAB);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_FENCE);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_DOOR);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_CHERRY_WOOD_BUTTON);
                        //bamboo
                        entries.add(ModBlocks.BAMBOO_BLOCK_STAIRS);
                        entries.add(ModBlocks.BAMBOO_BLOCK_SLAB);
                        entries.add(ModBlocks.BAMBOO_BLOCK_FENCE);
                        entries.add(ModBlocks.BAMBOO_BLOCK_FENCE_GATE);
                        entries.add(ModBlocks.BAMBOO_BLOCK_DOOR);
                        entries.add(ModBlocks.BAMBOO_BLOCK_TRAPDOOR);
                        entries.add(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BAMBOO_BLOCK_BUTTON);
                        //str bamboo
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_STAIRS);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_SLAB);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_FENCE);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_DOOR);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_BAMBOO_BLOCK_BUTTON);
                        //crimson hyphae
                        entries.add(ModBlocks.CRIMSON_HYPHAE_STAIRS);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_SLAB);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_FENCE);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_DOOR);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRIMSON_HYPHAE_BUTTON);
                        //str crimson hyphae
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_SLAB);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_DOOR);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_CRIMSON_HYPHAE_BUTTON);
                        //warped hyphae
                        entries.add(ModBlocks.WARPED_HYPHAE_STAIRS);
                        entries.add(ModBlocks.WARPED_HYPHAE_SLAB);
                        entries.add(ModBlocks.WARPED_HYPHAE_FENCE);
                        entries.add(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
                        entries.add(ModBlocks.WARPED_HYPHAE_DOOR);
                        entries.add(ModBlocks.WARPED_HYPHAE_TRAPDOOR);
                        entries.add(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WARPED_HYPHAE_BUTTON);
                        //str warped hyphae
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_STAIRS);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_SLAB);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_FENCE);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_DOOR);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE);
                        entries.add(ModBlocks.STR_WARPED_HYPHAE_BUTTON);
                        //stone
                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(ModBlocks.STONE_FENCE);
                        entries.add(ModBlocks.STONE_FENCE_GATE);
                        entries.add(ModBlocks.STONE_DOOR);
                        entries.add(ModBlocks.STONE_TRAPDOOR);
                        //cobblestone
                        entries.add(ModBlocks.COBBLESTONE_FENCE);
                        entries.add(ModBlocks.COBBLESTONE_FENCE_GATE);
                        entries.add(ModBlocks.COBBLESTONE_DOOR);
                        entries.add(ModBlocks.COBBLESTONE_TRAPDOOR);
                        //mossy cobblestone
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_FENCE);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_DOOR);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
                        //smooth stone
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_STONE_WALL);
                        entries.add(ModBlocks.SMOOTH_STONE_FENCE);
                        entries.add(ModBlocks.SMOOTH_STONE_FENCE_GATE);
                        entries.add(ModBlocks.SMOOTH_STONE_DOOR);
                        entries.add(ModBlocks.SMOOTH_STONE_TRAPDOOR);
                        entries.add(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_STONE_BUTTON);
                        //stone bricks
                        entries.add(ModBlocks.STONE_BRICKS_FENCE);
                        entries.add(ModBlocks.STONE_BRICKS_FENCE_GATE);
                        entries.add(ModBlocks.STONE_BRICKS_DOOR);
                        entries.add(ModBlocks.STONE_BRICKS_TRAPDOOR);
                        entries.add(ModBlocks.STONE_BRICKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.STONE_BRICKS_BUTTON);
                        //cracked stone bricks
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_FENCE);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_DOOR);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_BUTTON);
                        //granite
                        entries.add(ModBlocks.GRANITE_FENCE);
                        entries.add(ModBlocks.GRANITE_FENCE_GATE);
                        entries.add(ModBlocks.GRANITE_DOOR);
                        entries.add(ModBlocks.GRANITE_TRAPDOOR);
                        entries.add(ModBlocks.GRANITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRANITE_BUTTON);

                    }).build());

    public static void registerItemGroups() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Item Groups for " + VanillaBlocksPlus.MOD_ID);
    }
}

package net.fellter.vanillablocksplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.fellter.vanillablocksplus.block.ModBlocks;
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
                        //polished granite
                        entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_GRANITE_FENCE);
                        entries.add(ModBlocks.POLISHED_GRANITE_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_GRANITE_DOOR);
                        entries.add(ModBlocks.POLISHED_GRANITE_TRAPDOOR);
                        entries.add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_GRANITE_BUTTON);
                        //diorite
                        entries.add(ModBlocks.DIORITE_FENCE);
                        entries.add(ModBlocks.DIORITE_FENCE_GATE);
                        entries.add(ModBlocks.DIORITE_DOOR);
                        entries.add(ModBlocks.DIORITE_TRAPDOOR);
                        entries.add(ModBlocks.DIORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DIORITE_BUTTON);
                        //polished diorite
                        entries.add(ModBlocks.POLISHED_DIORITE_WALL);
                        entries.add(ModBlocks.POLISHED_DIORITE_FENCE);
                        entries.add(ModBlocks.POLISHED_DIORITE_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_DIORITE_DOOR);
                        entries.add(ModBlocks.POLISHED_DIORITE_TRAPDOOR);
                        entries.add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_DIORITE_BUTTON);
                        //andesite
                        entries.add(ModBlocks.ANDESITE_FENCE);
                        entries.add(ModBlocks.ANDESITE_FENCE_GATE);
                        entries.add(ModBlocks.ANDESITE_DOOR);
                        entries.add(ModBlocks.ANDESITE_TRAPDOOR);
                        entries.add(ModBlocks.ANDESITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ANDESITE_BUTTON);
                        //polished andesite
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_FENCE);
                        entries.add(ModBlocks.POLISHED_ANDESITE_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_ANDESITE_DOOR);
                        entries.add(ModBlocks.POLISHED_ANDESITE_TRAPDOOR);
                        entries.add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_ANDESITE_BUTTON);
                        //deepslate
                        entries.add(ModBlocks.DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.DEEPSLATE_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_WALL);
                        entries.add(ModBlocks.DEEPSLATE_FENCE);
                        entries.add(ModBlocks.DEEPSLATE_FENCE_GATE);
                        entries.add(ModBlocks.DEEPSLATE_DOOR);
                        entries.add(ModBlocks.DEEPSLATE_TRAPDOOR);
                        entries.add(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPSLATE_BUTTON);
                        //cobbled deepslate
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_FENCE);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_DOOR);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
                        //chiseled deepslate
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_WALL);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_FENCE);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_DOOR);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHISELED_DEEPSLATE_BUTTON);
                        //polished deepslate
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_FENCE);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_DOOR);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
                        //deepslate bricks
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_FENCE);
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE);
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_DOOR);
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR);
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPSLATE_BRICKS_BUTTON);
                        //cracked deepslate bricks
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON);
                        //deepslate tiles
                        entries.add(ModBlocks.DEEPSLATE_TILES_FENCE);
                        entries.add(ModBlocks.DEEPSLATE_TILES_FENCE_GATE);
                        entries.add(ModBlocks.DEEPSLATE_TILES_DOOR);
                        entries.add(ModBlocks.DEEPSLATE_TILES_TRAPDOOR);
                        entries.add(ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPSLATE_TILES_BUTTON);
                        //cracked deepslate tiles
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON);
                        //bricks
                        entries.add(ModBlocks.BRICK_FENCE);
                        entries.add(ModBlocks.BRICK_FENCE_GATE);
                        entries.add(ModBlocks.BRICK_DOOR);
                        entries.add(ModBlocks.BRICK_TRAPDOOR);
                        entries.add(ModBlocks.BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BRICK_BUTTON);
                        //packed mud
                        entries.add(ModBlocks.PACKED_MUD_STAIRS);
                        entries.add(ModBlocks.PACKED_MUD_SLAB);
                        entries.add(ModBlocks.PACKED_MUD_WALL);
                        entries.add(ModBlocks.PACKED_MUD_FENCE);
                        entries.add(ModBlocks.PACKED_MUD_FENCE_GATE);
                        entries.add(ModBlocks.PACKED_MUD_DOOR);
                        entries.add(ModBlocks.PACKED_MUD_TRAPDOOR);
                        entries.add(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
                        entries.add(ModBlocks.PACKED_MUD_BUTTON);
                        //mud bricks
                        entries.add(ModBlocks.MUD_BRICK_FENCE);
                        entries.add(ModBlocks.MUD_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.MUD_BRICK_DOOR);
                        entries.add(ModBlocks.MUD_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.MUD_BRICK_BUTTON);
                        //sandstone
                        entries.add(ModBlocks.SANDSTONE_FENCE);
                        entries.add(ModBlocks.SANDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.SANDSTONE_DOOR);
                        entries.add(ModBlocks.SANDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SANDSTONE_BUTTON);
                        //smooth sandstone
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_FENCE);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_DOOR);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_BUTTON);
                        //cut sandstone
                        entries.add(ModBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_SANDSTONE_FENCE);
                        entries.add(ModBlocks.CUT_SANDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.CUT_SANDSTONE_DOOR);
                        entries.add(ModBlocks.CUT_SANDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUT_SANDSTONE_BUTTON);
                        //red sandstone
                        entries.add(ModBlocks.RED_SANDSTONE_FENCE);
                        entries.add(ModBlocks.RED_SANDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.RED_SANDSTONE_DOOR);
                        entries.add(ModBlocks.RED_SANDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_SANDSTONE_BUTTON);
                        //red smooth sandstone
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON);
                        //red cut sandstone
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_FENCE);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_DOOR);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_BUTTON);
                        //sea lantern
                        entries.add(ModBlocks.SEA_LANTERN_STAIRS);
                        entries.add(ModBlocks.SEA_LANTERN_SLAB);
                        entries.add(ModBlocks.SEA_LANTERN_WALL);
                        entries.add(ModBlocks.SEA_LANTERN_FENCE);
                        entries.add(ModBlocks.SEA_LANTERN_FENCE_GATE);
                        entries.add(ModBlocks.SEA_LANTERN_DOOR);
                        entries.add(ModBlocks.SEA_LANTERN_TRAPDOOR);
                        entries.add(ModBlocks.SEA_LANTERN_PRESSURE_PLATE);
                        entries.add(ModBlocks.SEA_LANTERN_BUTTON);
                        //prismarine
                        entries.add(ModBlocks.PRISMARINE_FENCE);
                        entries.add(ModBlocks.PRISMARINE_FENCE_GATE);
                        entries.add(ModBlocks.PRISMARINE_DOOR);
                        entries.add(ModBlocks.PRISMARINE_TRAPDOOR);
                        entries.add(ModBlocks.PRISMARINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PRISMARINE_BUTTON);
                        //prismarine brick
                        entries.add(ModBlocks.PRISMARINE_BRICK_WALL);
                        entries.add(ModBlocks.PRISMARINE_BRICK_FENCE);
                        entries.add(ModBlocks.PRISMARINE_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.PRISMARINE_BRICK_DOOR);
                        entries.add(ModBlocks.PRISMARINE_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.PRISMARINE_BRICK_BUTTON);
                        //dark prismarine
                        entries.add(ModBlocks.DARK_PRISMARINE_WALL);
                        entries.add(ModBlocks.DARK_PRISMARINE_FENCE);
                        entries.add(ModBlocks.DARK_PRISMARINE_FENCE_GATE);
                        entries.add(ModBlocks.DARK_PRISMARINE_DOOR);
                        entries.add(ModBlocks.DARK_PRISMARINE_TRAPDOOR);
                        entries.add(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DARK_PRISMARINE_BUTTON);
                        //netherrack
                        entries.add(ModBlocks.NETHERRACK_STAIRS);
                        entries.add(ModBlocks.NETHERRACK_SLAB);
                        entries.add(ModBlocks.NETHERRACK_WALL);
                        entries.add(ModBlocks.NETHERRACK_FENCE);
                        entries.add(ModBlocks.NETHERRACK_FENCE_GATE);
                        entries.add(ModBlocks.NETHERRACK_DOOR);
                        entries.add(ModBlocks.NETHERRACK_TRAPDOOR);
                        entries.add(ModBlocks.NETHERRACK_PRESSURE_PLATE);
                        entries.add(ModBlocks.NETHERRACK_BUTTON);
                        //nether bricks
                        entries.add(ModBlocks.NETHER_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.NETHER_BRICK_DOOR);
                        entries.add(ModBlocks.NETHER_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.NETHER_BRICK_BUTTON);
                        //cracked nether bricks
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_FENCE);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_DOOR);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_BUTTON);
                        //red nether bricks
                        entries.add(ModBlocks.RED_NETHER_BRICK_FENCE);
                        entries.add(ModBlocks.RED_NETHER_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.RED_NETHER_BRICK_DOOR);
                        entries.add(ModBlocks.RED_NETHER_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_NETHER_BRICK_BUTTON);
                        //basalt
                        entries.add(ModBlocks.BASALT_STAIRS);
                        entries.add(ModBlocks.BASALT_SLAB);
                        entries.add(ModBlocks.BASALT_WALL);
                        entries.add(ModBlocks.BASALT_FENCE);
                        entries.add(ModBlocks.BASALT_FENCE_GATE);
                        entries.add(ModBlocks.BASALT_DOOR);
                        entries.add(ModBlocks.BASALT_TRAPDOOR);
                        entries.add(ModBlocks.BASALT_PRESSURE_PLATE);
                        entries.add(ModBlocks.BASALT_BUTTON);
                        //smooth basalt
                        entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
                        entries.add(ModBlocks.SMOOTH_BASALT_WALL);
                        entries.add(ModBlocks.SMOOTH_BASALT_FENCE);
                        entries.add(ModBlocks.SMOOTH_BASALT_FENCE_GATE);
                        entries.add(ModBlocks.SMOOTH_BASALT_DOOR);
                        entries.add(ModBlocks.SMOOTH_BASALT_TRAPDOOR);
                        entries.add(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_BASALT_BUTTON);
                        //polished basalt
                        entries.add(ModBlocks.POLISHED_BASALT_STAIRS);
                        entries.add(ModBlocks.POLISHED_BASALT_SLAB);
                        entries.add(ModBlocks.POLISHED_BASALT_WALL);
                        entries.add(ModBlocks.POLISHED_BASALT_FENCE);
                        entries.add(ModBlocks.POLISHED_BASALT_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_BASALT_DOOR);
                        entries.add(ModBlocks.POLISHED_BASALT_TRAPDOOR);
                        entries.add(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_BASALT_BUTTON);
                        //blackstone
                        entries.add(ModBlocks.BLACKSTONE_FENCE);
                        entries.add(ModBlocks.BLACKSTONE_FENCE_GATE);
                        entries.add(ModBlocks.BLACKSTONE_DOOR);
                        entries.add(ModBlocks.BLACKSTONE_TRAPDOOR);
                        entries.add(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACKSTONE_BUTTON);
                        //gilded blackstone
                        entries.add(ModBlocks.GILDED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_WALL);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_FENCE);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_DOOR);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_BUTTON);
                        //polished blackstone
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_FENCE);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_DOOR);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR);
                        //polished blackstone brick
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON);
                        //cracked polished blackstone bricks
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON);
                        //end stone
                        entries.add(ModBlocks.END_STONE_STAIRS);
                        entries.add(ModBlocks.END_STONE_SLAB);
                        entries.add(ModBlocks.END_STONE_WALL);
                        entries.add(ModBlocks.END_STONE_FENCE);
                        entries.add(ModBlocks.END_STONE_FENCE_GATE);
                        entries.add(ModBlocks.END_STONE_DOOR);
                        entries.add(ModBlocks.END_STONE_TRAPDOOR);
                        entries.add(ModBlocks.END_STONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.END_STONE_BUTTON);
                        //end stone brick
                        entries.add(ModBlocks.END_STONE_BRICK_FENCE);
                        entries.add(ModBlocks.END_STONE_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.END_STONE_BRICK_DOOR);
                        entries.add(ModBlocks.END_STONE_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.END_STONE_BRICK_BUTTON);
                        //purpur
                        entries.add(ModBlocks.PURPUR_WALL);
                        entries.add(ModBlocks.PURPUR_FENCE);
                        entries.add(ModBlocks.PURPUR_FENCE_GATE);
                        entries.add(ModBlocks.PURPUR_DOOR);
                        entries.add(ModBlocks.PURPUR_TRAPDOOR);
                        entries.add(ModBlocks.PURPUR_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPUR_BUTTON);
                        //coal
                        entries.add(ModBlocks.COAL_STAIRS);
                        entries.add(ModBlocks.COAL_SLAB);
                        entries.add(ModBlocks.COAL_WALL);
                        entries.add(ModBlocks.COAL_FENCE);
                        entries.add(ModBlocks.COAL_FENCE_GATE);
                        entries.add(ModBlocks.COAL_DOOR);
                        entries.add(ModBlocks.COAL_TRAPDOOR);
                        entries.add(ModBlocks.COAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.COAL_BUTTON);
                        //iron
                        entries.add(ModBlocks.IRON_STAIRS);
                        entries.add(ModBlocks.IRON_SLAB);
                        entries.add(ModBlocks.IRON_WALL);
                        entries.add(ModBlocks.IRON_FENCE);
                        entries.add(ModBlocks.IRON_FENCE_GATE);
                        entries.add(ModBlocks.IRON_BUTTON);
                        //gold
                        entries.add(ModBlocks.GOLD_STAIRS);
                        entries.add(ModBlocks.GOLD_SLAB);
                        entries.add(ModBlocks.GOLD_WALL);
                        entries.add(ModBlocks.GOLD_FENCE);
                        entries.add(ModBlocks.GOLD_FENCE_GATE);
                        entries.add(ModBlocks.GOLD_DOOR);
                        entries.add(ModBlocks.GOLD_TRAPDOOR);
                        entries.add(ModBlocks.GOLD_BUTTON);
                        //redstone
                        entries.add(ModBlocks.REDSTONE_STAIRS);
                        entries.add(ModBlocks.REDSTONE_SLAB);
                        entries.add(ModBlocks.REDSTONE_WALL);
                        entries.add(ModBlocks.REDSTONE_FENCE);
                        entries.add(ModBlocks.REDSTONE_FENCE_GATE);
                        entries.add(ModBlocks.REDSTONE_DOOR);
                        entries.add(ModBlocks.REDSTONE_TRAPDOOR);
                        entries.add(ModBlocks.REDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.REDSTONE_BUTTON);
                        //emerald
                        entries.add(ModBlocks.EMERALD_STAIRS);
                        entries.add(ModBlocks.EMERALD_SLAB);
                        entries.add(ModBlocks.EMERALD_WALL);
                        entries.add(ModBlocks.EMERALD_FENCE);
                        entries.add(ModBlocks.EMERALD_FENCE_GATE);
                        entries.add(ModBlocks.EMERALD_DOOR);
                        entries.add(ModBlocks.EMERALD_TRAPDOOR);
                        entries.add(ModBlocks.EMERALD_PRESSURE_PLATE);
                        entries.add(ModBlocks.EMERALD_BUTTON);
                        //lapis
                        entries.add(ModBlocks.LAPIS_STAIRS);
                        entries.add(ModBlocks.LAPIS_SLAB);
                        entries.add(ModBlocks.LAPIS_WALL);
                        entries.add(ModBlocks.LAPIS_FENCE);
                        entries.add(ModBlocks.LAPIS_FENCE_GATE);
                        entries.add(ModBlocks.LAPIS_DOOR);
                        entries.add(ModBlocks.LAPIS_TRAPDOOR);
                        entries.add(ModBlocks.LAPIS_PRESSURE_PLATE);
                        entries.add(ModBlocks.LAPIS_BUTTON);
                        //diamond
                        entries.add(ModBlocks.DIAMOND_STAIRS);
                        entries.add(ModBlocks.DIAMOND_SLAB);
                        entries.add(ModBlocks.DIAMOND_WALL);
                        entries.add(ModBlocks.DIAMOND_FENCE);
                        entries.add(ModBlocks.DIAMOND_FENCE_GATE);
                        entries.add(ModBlocks.DIAMOND_DOOR);
                        entries.add(ModBlocks.DIAMOND_TRAPDOOR);
                        entries.add(ModBlocks.DIAMOND_PRESSURE_PLATE);
                        entries.add(ModBlocks.DIAMOND_BUTTON);
                        //netherite
                        entries.add(ModBlocks.NETHERITE_STAIRS);
                        entries.add(ModBlocks.NETHERITE_SLAB);
                        entries.add(ModBlocks.NETHERITE_WALL);
                        entries.add(ModBlocks.NETHERITE_FENCE);
                        entries.add(ModBlocks.NETHERITE_FENCE_GATE);
                        entries.add(ModBlocks.NETHERITE_DOOR);
                        entries.add(ModBlocks.NETHERITE_TRAPDOOR);
                        entries.add(ModBlocks.NETHERITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.NETHERITE_BUTTON);
                        //quartz
                        entries.add(ModBlocks.QUARTZ_WALL);
                        entries.add(ModBlocks.QUARTZ_FENCE);
                        entries.add(ModBlocks.QUARTZ_FENCE_GATE);
                        entries.add(ModBlocks.QUARTZ_DOOR);
                        entries.add(ModBlocks.QUARTZ_TRAPDOOR);
                        entries.add(ModBlocks.QUARTZ_PRESSURE_PLATE);
                        entries.add(ModBlocks.QUARTZ_BUTTON);
                        //quartz brick
                        entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(ModBlocks.QUARTZ_BRICK_WALL);
                        entries.add(ModBlocks.QUARTZ_BRICK_FENCE);
                        entries.add(ModBlocks.QUARTZ_BRICK_FENCE_GATE);
                        entries.add(ModBlocks.QUARTZ_BRICK_DOOR);
                        entries.add(ModBlocks.QUARTZ_BRICK_TRAPDOOR);
                        entries.add(ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.QUARTZ_BRICK_BUTTON);
                        //smooth quartz
                        entries.add(ModBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_FENCE);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_FENCE_GATE);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_DOOR);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_BUTTON);
                        //amethyst
                        entries.add(ModBlocks.AMETHYST_STAIRS);
                        entries.add(ModBlocks.AMETHYST_SLAB);
                        entries.add(ModBlocks.AMETHYST_WALL);
                        entries.add(ModBlocks.AMETHYST_FENCE);
                        entries.add(ModBlocks.AMETHYST_FENCE_GATE);
                        entries.add(ModBlocks.AMETHYST_DOOR);
                        entries.add(ModBlocks.AMETHYST_TRAPDOOR);
                        entries.add(ModBlocks.AMETHYST_PRESSURE_PLATE);
                        entries.add(ModBlocks.AMETHYST_BUTTON);
                        //copper
                        entries.add(ModBlocks.COPPER_STAIRS);
                        entries.add(ModBlocks.COPPER_SLAB);
                        entries.add(ModBlocks.COPPER_WALL);
                        entries.add(ModBlocks.COPPER_FENCE);
                        entries.add(ModBlocks.COPPER_FENCE_GATE);
                        entries.add(ModBlocks.COPPER_DOOR);
                        entries.add(ModBlocks.COPPER_TRAPDOOR);
                        entries.add(ModBlocks.COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.COPPER_BUTTON);
                        //cut copper
                        entries.add(ModBlocks.CUT_COPPER_WALL);
                        entries.add(ModBlocks.CUT_COPPER_FENCE);
                        entries.add(ModBlocks.CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.CUT_COPPER_DOOR);
                        entries.add(ModBlocks.CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUT_COPPER_BUTTON);
                        //exposed_copper
                        entries.add(ModBlocks.EXPOSED_COPPER_STAIRS);
                        entries.add(ModBlocks.EXPOSED_COPPER_SLAB);
                        entries.add(ModBlocks.EXPOSED_COPPER_WALL);
                        entries.add(ModBlocks.EXPOSED_COPPER_FENCE);
                        entries.add(ModBlocks.EXPOSED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.EXPOSED_COPPER_DOOR);
                        entries.add(ModBlocks.EXPOSED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.EXPOSED_COPPER_BUTTON);
                        //exposed_cut_copper
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_BUTTON);
                        //weathered_copper
                        entries.add(ModBlocks.WEATHERED_COPPER_STAIRS);
                        entries.add(ModBlocks.WEATHERED_COPPER_SLAB);
                        entries.add(ModBlocks.WEATHERED_COPPER_WALL);
                        entries.add(ModBlocks.WEATHERED_COPPER_FENCE);
                        entries.add(ModBlocks.WEATHERED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WEATHERED_COPPER_DOOR);
                        entries.add(ModBlocks.WEATHERED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WEATHERED_COPPER_BUTTON);
                        //weathered_cut_copper
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_BUTTON);
                        //oxidized_copper
                        entries.add(ModBlocks.OXIDIZED_COPPER_STAIRS);
                        entries.add(ModBlocks.OXIDIZED_COPPER_SLAB);
                        entries.add(ModBlocks.OXIDIZED_COPPER_WALL);
                        entries.add(ModBlocks.OXIDIZED_COPPER_FENCE);
                        entries.add(ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.OXIDIZED_COPPER_DOOR);
                        entries.add(ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.OXIDIZED_COPPER_BUTTON);
                        //oxidized_cut_copper
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON);
                        //waxed_copper
                        entries.add(ModBlocks.WAXED_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_COPPER_BUTTON);
                        //waxed_cut copper
                        entries.add(ModBlocks.WAXED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_BUTTON);
                        //waxed_exposed_copper
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
                        //waxed_exposed_cut_copper
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON);
                        //waxed_weathered_copper
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
                        //waxed_weathered_cut_copper
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON);
                        //waxed_oxidized_copper
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
                        //waxed_oxidized_cut_copper
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON);
                        //white_wool
                        entries.add(ModBlocks.WHITE_WOOL_STAIRS);
                        entries.add(ModBlocks.WHITE_WOOL_SLAB);
                        entries.add(ModBlocks.WHITE_WOOL_WALL);
                        entries.add(ModBlocks.WHITE_WOOL_FENCE);
                        entries.add(ModBlocks.WHITE_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.WHITE_WOOL_DOOR);
                        entries.add(ModBlocks.WHITE_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.WHITE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_WOOL_BUTTON);
                        //light_gray_wool
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_DOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_BUTTON);
                        //gray_wool
                        entries.add(ModBlocks.GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.GRAY_WOOL_WALL);
                        entries.add(ModBlocks.GRAY_WOOL_FENCE);
                        entries.add(ModBlocks.GRAY_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_WOOL_DOOR);
                        entries.add(ModBlocks.GRAY_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.GRAY_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_WOOL_BUTTON);
                        //black_wool
                        entries.add(ModBlocks.BLACK_WOOL_STAIRS);
                        entries.add(ModBlocks.BLACK_WOOL_SLAB);
                        entries.add(ModBlocks.BLACK_WOOL_WALL);
                        entries.add(ModBlocks.BLACK_WOOL_FENCE);
                        entries.add(ModBlocks.BLACK_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_WOOL_DOOR);
                        entries.add(ModBlocks.BLACK_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.BLACK_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_WOOL_BUTTON);
                        //brown_wool
                        entries.add(ModBlocks.BROWN_WOOL_STAIRS);
                        entries.add(ModBlocks.BROWN_WOOL_SLAB);
                        entries.add(ModBlocks.BROWN_WOOL_WALL);
                        entries.add(ModBlocks.BROWN_WOOL_FENCE);
                        entries.add(ModBlocks.BROWN_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.BROWN_WOOL_DOOR);
                        entries.add(ModBlocks.BROWN_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.BROWN_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_WOOL_BUTTON);
                        //red_wool
                        entries.add(ModBlocks.RED_WOOL_STAIRS);
                        entries.add(ModBlocks.RED_WOOL_SLAB);
                        entries.add(ModBlocks.RED_WOOL_WALL);
                        entries.add(ModBlocks.RED_WOOL_FENCE);
                        entries.add(ModBlocks.RED_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.RED_WOOL_DOOR);
                        entries.add(ModBlocks.RED_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.RED_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_WOOL_BUTTON);
                        //orange_wool
                        entries.add(ModBlocks.ORANGE_WOOL_STAIRS);
                        entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                        entries.add(ModBlocks.ORANGE_WOOL_WALL);
                        entries.add(ModBlocks.ORANGE_WOOL_FENCE);
                        entries.add(ModBlocks.ORANGE_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.ORANGE_WOOL_DOOR);
                        entries.add(ModBlocks.ORANGE_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_WOOL_BUTTON);
                        //yellow_wool
                        entries.add(ModBlocks.YELLOW_WOOL_STAIRS);
                        entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                        entries.add(ModBlocks.YELLOW_WOOL_WALL);
                        entries.add(ModBlocks.YELLOW_WOOL_FENCE);
                        entries.add(ModBlocks.YELLOW_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.YELLOW_WOOL_DOOR);
                        entries.add(ModBlocks.YELLOW_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_WOOL_BUTTON);
                        //lime_wool
                        entries.add(ModBlocks.LIME_WOOL_STAIRS);
                        entries.add(ModBlocks.LIME_WOOL_SLAB);
                        entries.add(ModBlocks.LIME_WOOL_WALL);
                        entries.add(ModBlocks.LIME_WOOL_FENCE);
                        entries.add(ModBlocks.LIME_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.LIME_WOOL_DOOR);
                        entries.add(ModBlocks.LIME_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.LIME_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_WOOL_BUTTON);
                        //green_wool
                        entries.add(ModBlocks.GREEN_WOOL_STAIRS);
                        entries.add(ModBlocks.GREEN_WOOL_SLAB);
                        entries.add(ModBlocks.GREEN_WOOL_WALL);
                        entries.add(ModBlocks.GREEN_WOOL_FENCE);
                        entries.add(ModBlocks.GREEN_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.GREEN_WOOL_DOOR);
                        entries.add(ModBlocks.GREEN_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.GREEN_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_WOOL_BUTTON);
                        //cyan_wool
                        entries.add(ModBlocks.CYAN_WOOL_STAIRS);
                        entries.add(ModBlocks.CYAN_WOOL_SLAB);
                        entries.add(ModBlocks.CYAN_WOOL_WALL);
                        entries.add(ModBlocks.CYAN_WOOL_FENCE);
                        entries.add(ModBlocks.CYAN_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.CYAN_WOOL_DOOR);
                        entries.add(ModBlocks.CYAN_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.CYAN_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_WOOL_BUTTON);
                        //light_blue_wool
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_DOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_BUTTON);
                        //blue_wool
                        entries.add(ModBlocks.BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.BLUE_WOOL_WALL);
                        entries.add(ModBlocks.BLUE_WOOL_FENCE);
                        entries.add(ModBlocks.BLUE_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.BLUE_WOOL_DOOR);
                        entries.add(ModBlocks.BLUE_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.BLUE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_WOOL_BUTTON);
                        //purple_wool
                        entries.add(ModBlocks.PURPLE_WOOL_STAIRS);
                        entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                        entries.add(ModBlocks.PURPLE_WOOL_WALL);
                        entries.add(ModBlocks.PURPLE_WOOL_FENCE);
                        entries.add(ModBlocks.PURPLE_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.PURPLE_WOOL_DOOR);
                        entries.add(ModBlocks.PURPLE_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_WOOL_BUTTON);
                        //magenta_wool
                        entries.add(ModBlocks.MAGENTA_WOOL_STAIRS);
                        entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                        entries.add(ModBlocks.MAGENTA_WOOL_WALL);
                        entries.add(ModBlocks.MAGENTA_WOOL_FENCE);
                        entries.add(ModBlocks.MAGENTA_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.MAGENTA_WOOL_DOOR);
                        entries.add(ModBlocks.MAGENTA_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_WOOL_BUTTON);
                        //pink_wool
                        entries.add(ModBlocks.PINK_WOOL_STAIRS);
                        entries.add(ModBlocks.PINK_WOOL_SLAB);
                        entries.add(ModBlocks.PINK_WOOL_WALL);
                        entries.add(ModBlocks.PINK_WOOL_FENCE);
                        entries.add(ModBlocks.PINK_WOOL_FENCE_GATE);
                        entries.add(ModBlocks.PINK_WOOL_DOOR);
                        entries.add(ModBlocks.PINK_WOOL_TRAPDOOR);
                        entries.add(ModBlocks.PINK_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_WOOL_BUTTON);
                        //terracotta
                        entries.add(ModBlocks.TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.TERRACOTTA_SLAB);
                        entries.add(ModBlocks.TERRACOTTA_WALL);
                        entries.add(ModBlocks.TERRACOTTA_FENCE);
                        entries.add(ModBlocks.TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.TERRACOTTA_DOOR);
                        entries.add(ModBlocks.TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.TERRACOTTA_BUTTON);
                        //white_terracotta
                        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_BUTTON);
                        //light_gray_terracotta
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);
                        //gray_terracotta
                        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_WALL);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_BUTTON);
                        //black_terracotta
                        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_BUTTON);
                        //brown_terracotta
                        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_BUTTON);
                        //red_terracotta
                        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.RED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.RED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.RED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.RED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_TERRACOTTA_BUTTON);
                        //orange_terracotta
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_BUTTON);
                        //yellow_terracotta
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_WALL);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_BUTTON);
                        //lime_terracotta
                        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIME_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.LIME_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.LIME_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.LIME_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_TERRACOTTA_BUTTON);
                        //green_terracotta
                        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_WALL);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_BUTTON);
                        //cyan_terracotta
                        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_WALL);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_BUTTON);
                        //light_blue_terracotta
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);
                        //blue_terracotta
                        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_BUTTON);
                        //purple_terracotta
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_BUTTON);
                        //magenta_terracotta
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_WALL);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);
                        //pink_terracotta
                        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_TERRACOTTA_WALL);
                        entries.add(ModBlocks.PINK_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.PINK_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.PINK_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.PINK_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_TERRACOTTA_BUTTON);
                        //white_concrete
                        entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
                        entries.add(ModBlocks.WHITE_CONCRETE_WALL);
                        entries.add(ModBlocks.WHITE_CONCRETE_FENCE);
                        entries.add(ModBlocks.WHITE_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_DOOR);
                        entries.add(ModBlocks.WHITE_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_BUTTON);
                        //light_gray_concrete
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
                        //gray_concrete
                        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_WALL);
                        entries.add(ModBlocks.GRAY_CONCRETE_FENCE);
                        entries.add(ModBlocks.GRAY_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_DOOR);
                        entries.add(ModBlocks.GRAY_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_BUTTON);
                        //black_concrete
                        entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_WALL);
                        entries.add(ModBlocks.BLACK_CONCRETE_FENCE);
                        entries.add(ModBlocks.BLACK_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_DOOR);
                        entries.add(ModBlocks.BLACK_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_BUTTON);
                        //brown_concrete
                        entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_WALL);
                        entries.add(ModBlocks.BROWN_CONCRETE_FENCE);
                        entries.add(ModBlocks.BROWN_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_DOOR);
                        entries.add(ModBlocks.BROWN_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_BUTTON);
                        //red_concrete
                        entries.add(ModBlocks.RED_CONCRETE_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_WALL);
                        entries.add(ModBlocks.RED_CONCRETE_FENCE);
                        entries.add(ModBlocks.RED_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.RED_CONCRETE_DOOR);
                        entries.add(ModBlocks.RED_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_CONCRETE_BUTTON);
                        //orange_concrete
                        entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_WALL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_FENCE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_DOOR);
                        entries.add(ModBlocks.ORANGE_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_BUTTON);
                        //yellow_concrete
                        entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_WALL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_FENCE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_DOOR);
                        entries.add(ModBlocks.YELLOW_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_BUTTON);
                        //lime_concrete
                        entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_WALL);
                        entries.add(ModBlocks.LIME_CONCRETE_FENCE);
                        entries.add(ModBlocks.LIME_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.LIME_CONCRETE_DOOR);
                        entries.add(ModBlocks.LIME_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_CONCRETE_BUTTON);
                        //green_concrete
                        entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_WALL);
                        entries.add(ModBlocks.GREEN_CONCRETE_FENCE);
                        entries.add(ModBlocks.GREEN_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_DOOR);
                        entries.add(ModBlocks.GREEN_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_BUTTON);
                        //cyan_concrete
                        entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_WALL);
                        entries.add(ModBlocks.CYAN_CONCRETE_FENCE);
                        entries.add(ModBlocks.CYAN_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_DOOR);
                        entries.add(ModBlocks.CYAN_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_BUTTON);
                        //light_blue_concrete
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
                        //blue_concrete
                        entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_WALL);
                        entries.add(ModBlocks.BLUE_CONCRETE_FENCE);
                        entries.add(ModBlocks.BLUE_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_DOOR);
                        entries.add(ModBlocks.BLUE_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_BUTTON);
                        //purple_concrete
                        entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_WALL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_FENCE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_DOOR);
                        entries.add(ModBlocks.PURPLE_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_BUTTON);
                        //magenta_concrete
                        entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_WALL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_FENCE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_DOOR);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_BUTTON);
                        //pink_concrete
                        entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_WALL);
                        entries.add(ModBlocks.PINK_CONCRETE_FENCE);
                        entries.add(ModBlocks.PINK_CONCRETE_FENCE_GATE);
                        entries.add(ModBlocks.PINK_CONCRETE_DOOR);
                        entries.add(ModBlocks.PINK_CONCRETE_TRAPDOOR);
                        entries.add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_CONCRETE_BUTTON);
                        //white_concrete_powder
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_POWDER_BUTTON);
                        //light_gray_concrete_powder
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON);
                        //gray_concrete_powder
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_POWDER_BUTTON);
                        //black_concrete_powder
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_POWDER_BUTTON);
                        //brown_concrete_powder
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_POWDER_BUTTON);
                        //red_concrete_powder
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_CONCRETE_POWDER_BUTTON);
                        //orange_concrete_powder
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_POWDER_BUTTON);
                        //yellow_concrete_powder
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_POWDER_BUTTON);
                        //lime_concrete_powder
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_CONCRETE_POWDER_BUTTON);
                        //green_concrete_powder
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_POWDER_BUTTON);
                        //cyan_concrete_powder
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_POWDER_BUTTON);
                        //light_blue_concrete_powder
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON);
                        //blue_concrete_powder
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_POWDER_BUTTON);
                        //purple_concrete_powder
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_POWDER_BUTTON);
                        //magenta_concrete_powder
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_POWDER_BUTTON);
                        //pink_concrete_powder
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_WALL);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_FENCE);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_FENCE_GATE);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_DOOR);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_CONCRETE_POWDER_BUTTON);
                        //white_glazed_terracotta
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON);
                        //light_gray_glazed_terracotta
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON);
                        //gray_glazed_terracotta
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON);
                        //black_glazed_terracotta
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON);
                        //brown_glazed_terracotta
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON);
                        //red_glazed_terracotta
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON);
                        //orange_glazed_terracotta
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON);
                        //yellow_glazed_terracotta
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON);
                        //lime_glazed_terracotta
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON);
                        //green_glazed_terracotta
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON);
                        //cyan_glazed_terracotta
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON);
                        //light_blue_glazed_terracotta
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON);
                        //blue_glazed_terracotta
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON);
                        //purple_glazed_terracotta
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON);
                        //magenta_glazed_terracotta
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON);
                        //pink_glazed_terracotta
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON);
                        //glass
//                        entries.add(ModBlocks.GLASS_STAIRS);
//                        entries.add(ModBlocks.GLASS_SLAB);
//                        entries.add(ModBlocks.GLASS_WALL);
//                        entries.add(ModBlocks.GLASS_FENCE);
//                        entries.add(ModBlocks.GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.GLASS_DOOR);
//                        entries.add(ModBlocks.GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.GLASS_BUTTON);
//                        //white_stained_glass
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.WHITE_STAINED_GLASS_BUTTON);
//                        //light_gray_stained_glass
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON);
//                        //gray_stained_glass
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.GRAY_STAINED_GLASS_BUTTON);
//                        //black_stained_glass
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.BLACK_STAINED_GLASS_BUTTON);
//                        //brown_stained_glass
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.BROWN_STAINED_GLASS_BUTTON);
//                        //red_stained_glass
//                        entries.add(ModBlocks.RED_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.RED_STAINED_GLASS_BUTTON);
//                        //orange_stained_glass
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.ORANGE_STAINED_GLASS_BUTTON);
//                        //yellow_stained_glass
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.YELLOW_STAINED_GLASS_BUTTON);
//                        //lime_stained_glass
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.LIME_STAINED_GLASS_BUTTON);
//                        //green_stained_glass
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.GREEN_STAINED_GLASS_BUTTON);
//                        //cyan_stained_glass
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.CYAN_STAINED_GLASS_BUTTON);
//                        //light_blue_stained_glass
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON);
//                        //blue_stained_glass
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.BLUE_STAINED_GLASS_BUTTON);
//                        //purple_stained_glass
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.PURPLE_STAINED_GLASS_BUTTON);
//                        //magenta_stained_glass
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.MAGENTA_STAINED_GLASS_BUTTON);
//                        //pink_stained_glass
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_STAIRS);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_SLAB);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_WALL);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_FENCE);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_DOOR);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE);
//                        entries.add(ModBlocks.PINK_STAINED_GLASS_BUTTON);

















                    }).build());



    public static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {
                        //ingredients
                        entries.add(ModItems.COAL_BIT);
                        entries.add(ModItems.IRON_BIT);
                        entries.add(ModItems.GOLD_BIT);
                        entries.add(ModItems.REDSTONE_SHARD);
                        entries.add(ModItems.EMERALD_FRAGMENT);
                        entries.add(ModItems.LAPIS_BIT);
                        entries.add(ModItems.DIAMOND_SHARD);
                        entries.add(ModItems.NETHERITE_BIT);
                        entries.add(ModItems.COPPER_BIT);
    }

    public static void registerItemGroups() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Item Groups for " + VanillaBlocksPlus.MOD_ID);
    }
}

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















                        //ingredients
                        entries.add(ModItems.COAL_BIT);
                        entries.add(ModItems.IRON_BIT);
                        entries.add(ModItems.GOLD_BIT);
                        entries.add(ModItems.REDSTONE_SHARD);
                        entries.add(ModItems.EMERALD_FRAGMENT);
                        entries.add(ModItems.LAPIS_BIT);
                        entries.add(ModItems.DIAMOND_SHARD);
                        entries.add(ModItems.NETHERITE_BIT);

                    }).build());

    public static void registerItemGroups() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Item Groups for " + VanillaBlocksPlus.MOD_ID);
    }
}

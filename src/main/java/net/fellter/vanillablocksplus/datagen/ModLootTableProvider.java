package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //oak
        addDrop(ModBlocks.OAK_WOOD_MOD);
        addDrop(ModBlocks.OAK_WOOD_STAIRS);
        addDrop(ModBlocks.OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.OAK_WOOD_BUTTON);
        addDrop(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.OAK_WOOD_FENCE);
        addDrop(ModBlocks.OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.OAK_WOOD_DOOR, doorDrops(ModBlocks.OAK_WOOD_DOOR));
        addDrop(ModBlocks.OAK_WOOD_SLAB, slabDrops(ModBlocks.OAK_WOOD_SLAB));
        //str oak
        addDrop(ModBlocks.STR_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.STR_OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_OAK_WOOD_BUTTON);
        addDrop(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_OAK_WOOD_FENCE);
        addDrop(ModBlocks.STR_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_OAK_WOOD_DOOR, doorDrops(ModBlocks.STR_OAK_WOOD_DOOR));
        addDrop(ModBlocks.STR_OAK_WOOD_SLAB, slabDrops(ModBlocks.STR_OAK_WOOD_SLAB));
        //spruce
        addDrop(ModBlocks.SPRUCE_WOOD_STAIRS);
        addDrop(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.SPRUCE_WOOD_BUTTON);
        addDrop(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.SPRUCE_WOOD_FENCE);
        addDrop(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.SPRUCE_WOOD_DOOR, doorDrops(ModBlocks.SPRUCE_WOOD_DOOR));
        addDrop(ModBlocks.SPRUCE_WOOD_SLAB, slabDrops(ModBlocks.SPRUCE_WOOD_SLAB));
        //str spruce
        addDrop(ModBlocks.STR_SPRUCE_WOOD_STAIRS);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_BUTTON);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_FENCE);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_DOOR, doorDrops(ModBlocks.STR_SPRUCE_WOOD_DOOR));
        addDrop(ModBlocks.STR_SPRUCE_WOOD_SLAB, slabDrops(ModBlocks.STR_SPRUCE_WOOD_SLAB));
        //birch
        addDrop(ModBlocks.BIRCH_WOOD_STAIRS);
        addDrop(ModBlocks.BIRCH_WOOD_TRAPDOOR);
        addDrop(ModBlocks.BIRCH_WOOD_BUTTON);
        addDrop(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.BIRCH_WOOD_FENCE);
        addDrop(ModBlocks.BIRCH_WOOD_FENCE_GATE);
        addDrop(ModBlocks.BIRCH_WOOD_DOOR, doorDrops(ModBlocks.BIRCH_WOOD_DOOR));
        addDrop(ModBlocks.BIRCH_WOOD_SLAB, slabDrops(ModBlocks.BIRCH_WOOD_SLAB));
        //str birch
        addDrop(ModBlocks.STR_BIRCH_WOOD_STAIRS);
        addDrop(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_BIRCH_WOOD_BUTTON);
        addDrop(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_BIRCH_WOOD_FENCE);
        addDrop(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_BIRCH_WOOD_DOOR, doorDrops(ModBlocks.STR_BIRCH_WOOD_DOOR));
        addDrop(ModBlocks.STR_BIRCH_WOOD_SLAB, slabDrops(ModBlocks.STR_BIRCH_WOOD_SLAB));
        //jungle
        addDrop(ModBlocks.JUNGLE_WOOD_STAIRS);
        addDrop(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.JUNGLE_WOOD_BUTTON);
        addDrop(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.JUNGLE_WOOD_FENCE);
        addDrop(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.JUNGLE_WOOD_DOOR, doorDrops(ModBlocks.JUNGLE_WOOD_DOOR));
        addDrop(ModBlocks.JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.JUNGLE_WOOD_SLAB));
        //str jungle
        addDrop(ModBlocks.STR_JUNGLE_WOOD_STAIRS);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_BUTTON);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_FENCE);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_DOOR, doorDrops(ModBlocks.STR_JUNGLE_WOOD_DOOR));
        addDrop(ModBlocks.STR_JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.STR_JUNGLE_WOOD_SLAB));
        //acacia
        addDrop(ModBlocks.ACACIA_WOOD_STAIRS);
        addDrop(ModBlocks.ACACIA_WOOD_TRAPDOOR);
        addDrop(ModBlocks.ACACIA_WOOD_BUTTON);
        addDrop(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.ACACIA_WOOD_FENCE);
        addDrop(ModBlocks.ACACIA_WOOD_FENCE_GATE);
        addDrop(ModBlocks.ACACIA_WOOD_DOOR, doorDrops(ModBlocks.ACACIA_WOOD_DOOR));
        addDrop(ModBlocks.ACACIA_WOOD_SLAB, slabDrops(ModBlocks.ACACIA_WOOD_SLAB));
        //str acacia
        addDrop(ModBlocks.STR_ACACIA_WOOD_STAIRS);
        addDrop(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_ACACIA_WOOD_BUTTON);
        addDrop(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_ACACIA_WOOD_FENCE);
        addDrop(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_ACACIA_WOOD_DOOR, doorDrops(ModBlocks.STR_ACACIA_WOOD_DOOR));
        addDrop(ModBlocks.STR_ACACIA_WOOD_SLAB, slabDrops(ModBlocks.STR_ACACIA_WOOD_SLAB));
        //dark oak
        addDrop(ModBlocks.DARK_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.DARK_OAK_WOOD_BUTTON);
        addDrop(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE);
        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.DARK_OAK_WOOD_DOOR, doorDrops(ModBlocks.DARK_OAK_WOOD_DOOR));
        addDrop(ModBlocks.DARK_OAK_WOOD_SLAB, slabDrops(ModBlocks.DARK_OAK_WOOD_SLAB));
        //str dark oak
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_BUTTON);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_FENCE);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_DOOR, doorDrops(ModBlocks.STR_DARK_OAK_WOOD_DOOR));
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_SLAB, slabDrops(ModBlocks.STR_DARK_OAK_WOOD_SLAB));
        //mangrove
        addDrop(ModBlocks.MANGROVE_WOOD_STAIRS);
        addDrop(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.MANGROVE_WOOD_BUTTON);
        addDrop(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.MANGROVE_WOOD_FENCE);
        addDrop(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.MANGROVE_WOOD_DOOR, doorDrops(ModBlocks.MANGROVE_WOOD_DOOR));
        addDrop(ModBlocks.MANGROVE_WOOD_SLAB, slabDrops(ModBlocks.MANGROVE_WOOD_SLAB));
        //str mangrove
        addDrop(ModBlocks.STR_MANGROVE_WOOD_STAIRS);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_BUTTON);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_FENCE);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_DOOR, doorDrops(ModBlocks.STR_MANGROVE_WOOD_DOOR));
        addDrop(ModBlocks.STR_MANGROVE_WOOD_SLAB, slabDrops(ModBlocks.STR_MANGROVE_WOOD_SLAB));
        //cherry
        addDrop(ModBlocks.CHERRY_WOOD_STAIRS);
        addDrop(ModBlocks.CHERRY_WOOD_TRAPDOOR);
        addDrop(ModBlocks.CHERRY_WOOD_BUTTON);
        addDrop(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.CHERRY_WOOD_FENCE);
        addDrop(ModBlocks.CHERRY_WOOD_FENCE_GATE);
        addDrop(ModBlocks.CHERRY_WOOD_DOOR, doorDrops(ModBlocks.CHERRY_WOOD_DOOR));
        addDrop(ModBlocks.CHERRY_WOOD_SLAB, slabDrops(ModBlocks.CHERRY_WOOD_SLAB));
        //cherry
        addDrop(ModBlocks.STR_CHERRY_WOOD_STAIRS);
        addDrop(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_CHERRY_WOOD_BUTTON);
        addDrop(ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_CHERRY_WOOD_FENCE);
        addDrop(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_CHERRY_WOOD_DOOR, doorDrops(ModBlocks.STR_CHERRY_WOOD_DOOR));
        addDrop(ModBlocks.STR_CHERRY_WOOD_SLAB, slabDrops(ModBlocks.STR_CHERRY_WOOD_SLAB));
        //bamboo
        addDrop(ModBlocks.BAMBOO_BLOCK_STAIRS);
        addDrop(ModBlocks.BAMBOO_BLOCK_TRAPDOOR);
        addDrop(ModBlocks.BAMBOO_BLOCK_BUTTON);
        addDrop(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE);
        addDrop(ModBlocks.BAMBOO_BLOCK_FENCE);
        addDrop(ModBlocks.BAMBOO_BLOCK_FENCE_GATE);
        addDrop(ModBlocks.BAMBOO_BLOCK_DOOR, doorDrops(ModBlocks.BAMBOO_BLOCK_DOOR));
        addDrop(ModBlocks.BAMBOO_BLOCK_SLAB, slabDrops(ModBlocks.BAMBOO_BLOCK_SLAB));
        //str bamboo
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_STAIRS);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_BUTTON);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_FENCE);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_DOOR, doorDrops(ModBlocks.STR_BAMBOO_BLOCK_DOOR));
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_SLAB, slabDrops(ModBlocks.STR_BAMBOO_BLOCK_SLAB));
        //crimson hyphae
        addDrop(ModBlocks.CRIMSON_HYPHAE_STAIRS);
        addDrop(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.CRIMSON_HYPHAE_BUTTON);
        addDrop(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.CRIMSON_HYPHAE_FENCE);
        addDrop(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.CRIMSON_HYPHAE_DOOR, doorDrops(ModBlocks.CRIMSON_HYPHAE_DOOR));
        addDrop(ModBlocks.CRIMSON_HYPHAE_SLAB, slabDrops(ModBlocks.CRIMSON_HYPHAE_SLAB));
        //str crimson hyphae
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_BUTTON);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_FENCE);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, doorDrops(ModBlocks.STR_CRIMSON_HYPHAE_DOOR));
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_SLAB, slabDrops(ModBlocks.STR_CRIMSON_HYPHAE_SLAB));
        //warped hyphae
        addDrop(ModBlocks.WARPED_HYPHAE_STAIRS);
        addDrop(ModBlocks.WARPED_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.WARPED_HYPHAE_BUTTON);
        addDrop(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.WARPED_HYPHAE_FENCE);
        addDrop(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.WARPED_HYPHAE_DOOR, doorDrops(ModBlocks.WARPED_HYPHAE_DOOR));
        addDrop(ModBlocks.WARPED_HYPHAE_SLAB, slabDrops(ModBlocks.WARPED_HYPHAE_SLAB));
        //str warped hyphae
        addDrop(ModBlocks.STR_WARPED_HYPHAE_STAIRS);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_BUTTON);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_FENCE);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_DOOR, doorDrops(ModBlocks.STR_WARPED_HYPHAE_DOOR));
        addDrop(ModBlocks.STR_WARPED_HYPHAE_SLAB, slabDrops(ModBlocks.STR_WARPED_HYPHAE_SLAB));
        //stone
        addDrop(ModBlocks.STONE_TRAPDOOR);
        addDrop(ModBlocks.STONE_FENCE);
        addDrop(ModBlocks.STONE_FENCE_GATE);
        addDrop(ModBlocks.STONE_DOOR, doorDrops(ModBlocks.STONE_DOOR));
        //cobblestone
        addDrop(ModBlocks.COBBLESTONE_TRAPDOOR);
        addDrop(ModBlocks.COBBLESTONE_FENCE);
        addDrop(ModBlocks.COBBLESTONE_FENCE_GATE);
        addDrop(ModBlocks.COBBLESTONE_DOOR, doorDrops(ModBlocks.COBBLESTONE_DOOR));
        //mossy cobblestone
        addDrop(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_FENCE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_DOOR, doorDrops(ModBlocks.MOSSY_COBBLESTONE_DOOR));
        //smooth stone
        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_STONE_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_FENCE_GATE);
        addDrop(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_STONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_STONE_DOOR, doorDrops(ModBlocks.SMOOTH_STONE_DOOR));
        //stone bricks
        addDrop(ModBlocks.STONE_BRICKS_TRAPDOOR);
        addDrop(ModBlocks.STONE_BRICKS_FENCE);
        addDrop(ModBlocks.STONE_BRICKS_FENCE_GATE);
        addDrop(ModBlocks.STONE_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.STONE_BRICKS_BUTTON);
        addDrop(ModBlocks.STONE_BRICKS_DOOR, doorDrops(ModBlocks.STONE_BRICKS_DOOR));
        //cracked stone bricks
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_BUTTON);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_FENCE);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE);
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_DOOR, doorDrops(ModBlocks.CRACKED_STONE_BRICKS_DOOR));
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_STONE_BRICKS_WALL);
        //granite
        addDrop(ModBlocks.GRANITE_TRAPDOOR);
        addDrop(ModBlocks.GRANITE_BUTTON);
        addDrop(ModBlocks.GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRANITE_FENCE);
        addDrop(ModBlocks.GRANITE_FENCE_GATE);
        addDrop(ModBlocks.GRANITE_DOOR, doorDrops(ModBlocks.GRANITE_DOOR));
        //polished granite
        addDrop(ModBlocks.POLISHED_GRANITE_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_GRANITE_BUTTON);
        addDrop(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_GRANITE_FENCE);
        addDrop(ModBlocks.POLISHED_GRANITE_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_GRANITE_DOOR, doorDrops(ModBlocks.POLISHED_GRANITE_DOOR));
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        //diorite
        addDrop(ModBlocks.DIORITE_TRAPDOOR);
        addDrop(ModBlocks.DIORITE_BUTTON);
        addDrop(ModBlocks.DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.DIORITE_FENCE);
        addDrop(ModBlocks.DIORITE_FENCE_GATE);
        addDrop(ModBlocks.DIORITE_DOOR, doorDrops(ModBlocks.DIORITE_DOOR));
        //polished diorite
        addDrop(ModBlocks.POLISHED_DIORITE_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_DIORITE_BUTTON);
        addDrop(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DIORITE_FENCE);
        addDrop(ModBlocks.POLISHED_DIORITE_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_DIORITE_DOOR, doorDrops(ModBlocks.POLISHED_DIORITE_DOOR));
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        //andesite
        addDrop(ModBlocks.ANDESITE_TRAPDOOR);
        addDrop(ModBlocks.ANDESITE_BUTTON);
        addDrop(ModBlocks.ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.ANDESITE_FENCE);
        addDrop(ModBlocks.ANDESITE_FENCE_GATE);
        addDrop(ModBlocks.ANDESITE_DOOR, doorDrops(ModBlocks.ANDESITE_DOOR));
        //polished andesite
        addDrop(ModBlocks.POLISHED_ANDESITE_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_ANDESITE_BUTTON);
        addDrop(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_ANDESITE_FENCE);
        addDrop(ModBlocks.POLISHED_ANDESITE_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_ANDESITE_DOOR, doorDrops(ModBlocks.POLISHED_ANDESITE_DOOR));
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        //deepslate
        addDrop(ModBlocks.DEEPSLATE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_DOOR, doorDrops(ModBlocks.DEEPSLATE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_SLAB, slabDrops(ModBlocks.DEEPSLATE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_WALL);
        //cobbled deepslate
        addDrop(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_FENCE);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_DOOR, doorDrops(ModBlocks.COBBLED_DEEPSLATE_DOOR));
        //chiseled deepslate
        addDrop(ModBlocks.CHISELED_DEEPSLATE_STAIRS);
        addDrop(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR);
        addDrop(ModBlocks.CHISELED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.CHISELED_DEEPSLATE_FENCE);
        addDrop(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE);
        addDrop(ModBlocks.CHISELED_DEEPSLATE_DOOR, doorDrops(ModBlocks.CHISELED_DEEPSLATE_DOOR));
        addDrop(ModBlocks.CHISELED_DEEPSLATE_SLAB, slabDrops(ModBlocks.CHISELED_DEEPSLATE_SLAB));
        addDrop(ModBlocks.CHISELED_DEEPSLATE_WALL);
        //polished deepslate
        addDrop(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_FENCE);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_DOOR, doorDrops(ModBlocks.POLISHED_DEEPSLATE_DOOR));
        //deepslate bricks
        addDrop(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_BRICKS_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_BRICKS_FENCE);
        addDrop(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_BRICKS_DOOR, doorDrops(ModBlocks.DEEPSLATE_BRICKS_DOOR));
        //cracked deepslate bricks
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR, doorDrops(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL);
        //deepslate tiles
        addDrop(ModBlocks.DEEPSLATE_TILES_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_TILES_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_TILES_FENCE);
        addDrop(ModBlocks.DEEPSLATE_TILES_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_TILES_DOOR, doorDrops(ModBlocks.DEEPSLATE_TILES_DOOR));
        //cracked deepslate tiles
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR, doorDrops(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL);
        //bricks
        addDrop(ModBlocks.BRICK_TRAPDOOR);
        addDrop(ModBlocks.BRICK_BUTTON);
        addDrop(ModBlocks.BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.BRICK_FENCE);
        addDrop(ModBlocks.BRICK_FENCE_GATE);
        addDrop(ModBlocks.BRICK_DOOR, doorDrops(ModBlocks.BRICK_DOOR));
        //packed mud
        addDrop(ModBlocks.PACKED_MUD_STAIRS);
        addDrop(ModBlocks.PACKED_MUD_TRAPDOOR);
        addDrop(ModBlocks.PACKED_MUD_BUTTON);
        addDrop(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
        addDrop(ModBlocks.PACKED_MUD_FENCE);
        addDrop(ModBlocks.PACKED_MUD_FENCE_GATE);
        addDrop(ModBlocks.PACKED_MUD_DOOR, doorDrops(ModBlocks.PACKED_MUD_DOOR));
        addDrop(ModBlocks.PACKED_MUD_SLAB, slabDrops(ModBlocks.PACKED_MUD_SLAB));
        addDrop(ModBlocks.PACKED_MUD_WALL);
        //mud bricks
        addDrop(ModBlocks.MUD_BRICK_TRAPDOOR);
        addDrop(ModBlocks.MUD_BRICK_BUTTON);
        addDrop(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.MUD_BRICK_FENCE);
        addDrop(ModBlocks.MUD_BRICK_FENCE_GATE);
        addDrop(ModBlocks.MUD_BRICK_DOOR, doorDrops(ModBlocks.MUD_BRICK_DOOR));
        //sandstone
        addDrop(ModBlocks.SANDSTONE_TRAPDOOR);
        addDrop(ModBlocks.SANDSTONE_BUTTON);
        addDrop(ModBlocks.SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SANDSTONE_FENCE);
        addDrop(ModBlocks.SANDSTONE_FENCE_GATE);
        addDrop(ModBlocks.SANDSTONE_DOOR, doorDrops(ModBlocks.SANDSTONE_DOOR));
        //smooth sandstone
        addDrop(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_FENCE);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_DOOR, doorDrops(ModBlocks.SMOOTH_SANDSTONE_DOOR));
        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        //cut sandstone
        addDrop(ModBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_SANDSTONE_TRAPDOOR);
        addDrop(ModBlocks.CUT_SANDSTONE_BUTTON);
        addDrop(ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_SANDSTONE_FENCE);
        addDrop(ModBlocks.CUT_SANDSTONE_FENCE_GATE);
        addDrop(ModBlocks.CUT_SANDSTONE_DOOR, doorDrops(ModBlocks.CUT_SANDSTONE_DOOR));
        addDrop(ModBlocks.CUT_SANDSTONE_WALL);
        //red sandstone
        addDrop(ModBlocks.RED_SANDSTONE_TRAPDOOR);
        addDrop(ModBlocks.RED_SANDSTONE_BUTTON);
        addDrop(ModBlocks.RED_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_SANDSTONE_FENCE);
        addDrop(ModBlocks.RED_SANDSTONE_FENCE_GATE);
        addDrop(ModBlocks.RED_SANDSTONE_DOOR, doorDrops(ModBlocks.RED_SANDSTONE_DOOR));
        //red smooth sandstone
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR, doorDrops(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR));
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        //red cut sandstone
        addDrop(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_BUTTON);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_FENCE);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_DOOR, doorDrops(ModBlocks.CUT_RED_SANDSTONE_DOOR));
        addDrop(ModBlocks.CUT_RED_SANDSTONE_WALL);
        //sea lantern
        addDrop(ModBlocks.SEA_LANTERN_STAIRS);
        addDrop(ModBlocks.SEA_LANTERN_TRAPDOOR);
        addDrop(ModBlocks.SEA_LANTERN_BUTTON);
        addDrop(ModBlocks.SEA_LANTERN_PRESSURE_PLATE);
        addDrop(ModBlocks.SEA_LANTERN_FENCE);
        addDrop(ModBlocks.SEA_LANTERN_FENCE_GATE);
        addDrop(ModBlocks.SEA_LANTERN_DOOR, doorDrops(ModBlocks.SEA_LANTERN_DOOR));
        addDrop(ModBlocks.SEA_LANTERN_SLAB, slabDrops(ModBlocks.SEA_LANTERN_SLAB));
        addDrop(ModBlocks.SEA_LANTERN_WALL);
        //prismarine
        addDrop(ModBlocks.PRISMARINE_TRAPDOOR);
        addDrop(ModBlocks.PRISMARINE_BUTTON);
        addDrop(ModBlocks.PRISMARINE_PRESSURE_PLATE);
        addDrop(ModBlocks.PRISMARINE_FENCE);
        addDrop(ModBlocks.PRISMARINE_FENCE_GATE);
        addDrop(ModBlocks.PRISMARINE_DOOR, doorDrops(ModBlocks.PRISMARINE_DOOR));
        //prismarine brick
        addDrop(ModBlocks.PRISMARINE_BRICK_WALL);
        addDrop(ModBlocks.PRISMARINE_BRICK_TRAPDOOR);
        addDrop(ModBlocks.PRISMARINE_BRICK_BUTTON);
        addDrop(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.PRISMARINE_BRICK_FENCE);
        addDrop(ModBlocks.PRISMARINE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.PRISMARINE_BRICK_DOOR, doorDrops(ModBlocks.PRISMARINE_BRICK_DOOR));
        //dark prismarine
        addDrop(ModBlocks.DARK_PRISMARINE_WALL);
        addDrop(ModBlocks.DARK_PRISMARINE_TRAPDOOR);
        addDrop(ModBlocks.DARK_PRISMARINE_BUTTON);
        addDrop(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_PRISMARINE_FENCE);
        addDrop(ModBlocks.DARK_PRISMARINE_FENCE_GATE);
        addDrop(ModBlocks.DARK_PRISMARINE_DOOR, doorDrops(ModBlocks.DARK_PRISMARINE_DOOR));
        //netherrack
        addDrop(ModBlocks.NETHERRACK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_TRAPDOOR);
        addDrop(ModBlocks.NETHERRACK_BUTTON);
        addDrop(ModBlocks.NETHERRACK_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHERRACK_FENCE);
        addDrop(ModBlocks.NETHERRACK_FENCE_GATE);
        addDrop(ModBlocks.NETHERRACK_DOOR, doorDrops(ModBlocks.NETHERRACK_DOOR));
        addDrop(ModBlocks.NETHERRACK_SLAB, slabDrops(ModBlocks.NETHERRACK_SLAB));
        addDrop(ModBlocks.NETHERRACK_WALL);

        //nether bricks
        addDrop(ModBlocks.NETHER_BRICK_TRAPDOOR);
        addDrop(ModBlocks.NETHER_BRICK_BUTTON);
        addDrop(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHER_BRICK_FENCE_GATE);
        addDrop(ModBlocks.NETHER_BRICK_DOOR, doorDrops(ModBlocks.NETHER_BRICK_DOOR));

        //cracked nether bricks
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_FENCE);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_DOOR, doorDrops(ModBlocks.CRACKED_NETHER_BRICK_DOOR));
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_NETHER_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_WALL);

        //red nether bricks
        addDrop(ModBlocks.RED_NETHER_BRICK_TRAPDOOR);
        addDrop(ModBlocks.RED_NETHER_BRICK_BUTTON);
        addDrop(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_NETHER_BRICK_FENCE);
        addDrop(ModBlocks.RED_NETHER_BRICK_FENCE_GATE);
        addDrop(ModBlocks.RED_NETHER_BRICK_DOOR, doorDrops(ModBlocks.RED_NETHER_BRICK_DOOR));

        //basalt
        addDrop(ModBlocks.BASALT_STAIRS);
        addDrop(ModBlocks.BASALT_TRAPDOOR);
        addDrop(ModBlocks.BASALT_BUTTON);
        addDrop(ModBlocks.BASALT_PRESSURE_PLATE);
        addDrop(ModBlocks.BASALT_FENCE);
        addDrop(ModBlocks.BASALT_FENCE_GATE);
        addDrop(ModBlocks.BASALT_DOOR, doorDrops(ModBlocks.BASALT_DOOR));
        addDrop(ModBlocks.BASALT_SLAB, slabDrops(ModBlocks.BASALT_SLAB));
        addDrop(ModBlocks.BASALT_WALL);

        //smooth basalt
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_BASALT_BUTTON);
        addDrop(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_BASALT_FENCE);
        addDrop(ModBlocks.SMOOTH_BASALT_FENCE_GATE);
        addDrop(ModBlocks.SMOOTH_BASALT_DOOR, doorDrops(ModBlocks.SMOOTH_BASALT_DOOR));
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);

        //polished basalt
        addDrop(ModBlocks.POLISHED_BASALT_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_BASALT_BUTTON);
        addDrop(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_BASALT_FENCE);
        addDrop(ModBlocks.POLISHED_BASALT_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_BASALT_DOOR, doorDrops(ModBlocks.POLISHED_BASALT_DOOR));
        addDrop(ModBlocks.POLISHED_BASALT_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_SLAB));
        addDrop(ModBlocks.POLISHED_BASALT_WALL);

        //blackstone
        addDrop(ModBlocks.BLACKSTONE_TRAPDOOR);
        addDrop(ModBlocks.BLACKSTONE_BUTTON);
        addDrop(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACKSTONE_FENCE);
        addDrop(ModBlocks.BLACKSTONE_FENCE_GATE);
        addDrop(ModBlocks.BLACKSTONE_DOOR, doorDrops(ModBlocks.BLACKSTONE_DOOR));

        //gilded blackstone
        addDrop(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR);
        addDrop(ModBlocks.GILDED_BLACKSTONE_BUTTON);
        addDrop(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.GILDED_BLACKSTONE_FENCE);
        addDrop(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE);
        addDrop(ModBlocks.GILDED_BLACKSTONE_DOOR, doorDrops(ModBlocks.GILDED_BLACKSTONE_DOOR));
        addDrop(ModBlocks.GILDED_BLACKSTONE_SLAB, slabDrops(ModBlocks.GILDED_BLACKSTONE_SLAB));
        addDrop(ModBlocks.GILDED_BLACKSTONE_WALL);

        //polished blackstone
        addDrop(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_FENCE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_DOOR, doorDrops(ModBlocks.POLISHED_BLACKSTONE_DOOR));

        //polished blackstone brick
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR, doorDrops(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR));

        //cracked polished blackstone brick
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR, doorDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR));
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        //end stone
        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_TRAPDOOR);
        addDrop(ModBlocks.END_STONE_BUTTON);
        addDrop(ModBlocks.END_STONE_PRESSURE_PLATE);
        addDrop(ModBlocks.END_STONE_FENCE);
        addDrop(ModBlocks.END_STONE_FENCE_GATE);
        addDrop(ModBlocks.END_STONE_DOOR, doorDrops(ModBlocks.END_STONE_DOOR));
        addDrop(ModBlocks.END_STONE_SLAB, slabDrops(ModBlocks.END_STONE_SLAB));
        addDrop(ModBlocks.END_STONE_WALL);

        //end stone bricks
        addDrop(ModBlocks.END_STONE_BRICK_TRAPDOOR);
        addDrop(ModBlocks.END_STONE_BRICK_BUTTON);
        addDrop(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.END_STONE_BRICK_FENCE);
        addDrop(ModBlocks.END_STONE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.END_STONE_BRICK_DOOR, doorDrops(ModBlocks.END_STONE_BRICK_DOOR));

        //purpur block
        addDrop(ModBlocks.PURPUR_TRAPDOOR);
        addDrop(ModBlocks.PURPUR_BUTTON);
        addDrop(ModBlocks.PURPUR_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPUR_FENCE);
        addDrop(ModBlocks.PURPUR_FENCE_GATE);
        addDrop(ModBlocks.PURPUR_DOOR, doorDrops(ModBlocks.PURPUR_DOOR));
        addDrop(ModBlocks.PURPUR_WALL);

        //coal
        addDrop(ModBlocks.COAL_STAIRS);
        addDrop(ModBlocks.COAL_TRAPDOOR);
        addDrop(ModBlocks.COAL_BUTTON);
        addDrop(ModBlocks.COAL_PRESSURE_PLATE);
        addDrop(ModBlocks.COAL_FENCE);
        addDrop(ModBlocks.COAL_FENCE_GATE);
        addDrop(ModBlocks.COAL_DOOR, doorDrops(ModBlocks.COAL_DOOR));
        addDrop(ModBlocks.COAL_SLAB, slabDrops(ModBlocks.COAL_SLAB));
        addDrop(ModBlocks.COAL_WALL);

        //iron
        addDrop(ModBlocks.IRON_STAIRS);
        addDrop(ModBlocks.IRON_BUTTON);
        addDrop(ModBlocks.IRON_FENCE);
        addDrop(ModBlocks.IRON_FENCE_GATE);
        addDrop(ModBlocks.IRON_SLAB, slabDrops(ModBlocks.IRON_SLAB));
        addDrop(ModBlocks.IRON_WALL);

        //gold
        addDrop(ModBlocks.GOLD_STAIRS);
        addDrop(ModBlocks.GOLD_TRAPDOOR);
        addDrop(ModBlocks.GOLD_BUTTON);
        addDrop(ModBlocks.GOLD_FENCE);
        addDrop(ModBlocks.GOLD_FENCE_GATE);
        addDrop(ModBlocks.GOLD_DOOR, doorDrops(ModBlocks.GOLD_DOOR));
        addDrop(ModBlocks.GOLD_SLAB, slabDrops(ModBlocks.GOLD_SLAB));
        addDrop(ModBlocks.GOLD_WALL);

        //redstone
        addDrop(ModBlocks.REDSTONE_STAIRS);
        addDrop(ModBlocks.REDSTONE_TRAPDOOR);
        addDrop(ModBlocks.REDSTONE_BUTTON);
        addDrop(ModBlocks.REDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.REDSTONE_FENCE);
        addDrop(ModBlocks.REDSTONE_FENCE_GATE);
        addDrop(ModBlocks.REDSTONE_DOOR, doorDrops(ModBlocks.REDSTONE_DOOR));
        addDrop(ModBlocks.REDSTONE_SLAB, slabDrops(ModBlocks.REDSTONE_SLAB));
        addDrop(ModBlocks.REDSTONE_WALL);

        //emerald
        addDrop(ModBlocks.EMERALD_STAIRS);
        addDrop(ModBlocks.EMERALD_TRAPDOOR);
        addDrop(ModBlocks.EMERALD_BUTTON);
        addDrop(ModBlocks.EMERALD_PRESSURE_PLATE);
        addDrop(ModBlocks.EMERALD_FENCE);
        addDrop(ModBlocks.EMERALD_FENCE_GATE);
        addDrop(ModBlocks.EMERALD_DOOR, doorDrops(ModBlocks.EMERALD_DOOR));
        addDrop(ModBlocks.EMERALD_SLAB, slabDrops(ModBlocks.EMERALD_SLAB));
        addDrop(ModBlocks.EMERALD_WALL);

        //lapis
        addDrop(ModBlocks.LAPIS_STAIRS);
        addDrop(ModBlocks.LAPIS_TRAPDOOR);
        addDrop(ModBlocks.LAPIS_BUTTON);
        addDrop(ModBlocks.LAPIS_PRESSURE_PLATE);
        addDrop(ModBlocks.LAPIS_FENCE);
        addDrop(ModBlocks.LAPIS_FENCE_GATE);
        addDrop(ModBlocks.LAPIS_DOOR, doorDrops(ModBlocks.LAPIS_DOOR));
        addDrop(ModBlocks.LAPIS_SLAB, slabDrops(ModBlocks.LAPIS_SLAB));
        addDrop(ModBlocks.LAPIS_WALL);

        //diamond
        addDrop(ModBlocks.DIAMOND_STAIRS);
        addDrop(ModBlocks.DIAMOND_TRAPDOOR);
        addDrop(ModBlocks.DIAMOND_BUTTON);
        addDrop(ModBlocks.DIAMOND_PRESSURE_PLATE);
        addDrop(ModBlocks.DIAMOND_FENCE);
        addDrop(ModBlocks.DIAMOND_FENCE_GATE);
        addDrop(ModBlocks.DIAMOND_DOOR, doorDrops(ModBlocks.DIAMOND_DOOR));
        addDrop(ModBlocks.DIAMOND_SLAB, slabDrops(ModBlocks.DIAMOND_SLAB));
        addDrop(ModBlocks.DIAMOND_WALL);

        //netherite
        addDrop(ModBlocks.NETHERITE_STAIRS);
        addDrop(ModBlocks.NETHERITE_TRAPDOOR);
        addDrop(ModBlocks.NETHERITE_BUTTON);
        addDrop(ModBlocks.NETHERITE_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHERITE_FENCE);
        addDrop(ModBlocks.NETHERITE_FENCE_GATE);
        addDrop(ModBlocks.NETHERITE_DOOR, doorDrops(ModBlocks.NETHERITE_DOOR));
        addDrop(ModBlocks.NETHERITE_SLAB, slabDrops(ModBlocks.NETHERITE_SLAB));
        addDrop(ModBlocks.NETHERITE_WALL);

        //quartz
        addDrop(ModBlocks.QUARTZ_TRAPDOOR);
        addDrop(ModBlocks.QUARTZ_BUTTON);
        addDrop(ModBlocks.QUARTZ_PRESSURE_PLATE);
        addDrop(ModBlocks.QUARTZ_FENCE);
        addDrop(ModBlocks.QUARTZ_FENCE_GATE);
        addDrop(ModBlocks.QUARTZ_DOOR, doorDrops(ModBlocks.QUARTZ_DOOR));
        addDrop(ModBlocks.QUARTZ_WALL);

        //quartz_brick
        addDrop(ModBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(ModBlocks.QUARTZ_BRICK_TRAPDOOR);
        addDrop(ModBlocks.QUARTZ_BRICK_BUTTON);
        addDrop(ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.QUARTZ_BRICK_FENCE);
        addDrop(ModBlocks.QUARTZ_BRICK_FENCE_GATE);
        addDrop(ModBlocks.QUARTZ_BRICK_DOOR, doorDrops(ModBlocks.QUARTZ_BRICK_DOOR));
        addDrop(ModBlocks.QUARTZ_BRICK_SLAB, slabDrops(ModBlocks.QUARTZ_BRICK_SLAB));
        addDrop(ModBlocks.QUARTZ_BRICK_WALL);

        //smooth_quartz
        addDrop(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_QUARTZ_BUTTON);
        addDrop(ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_QUARTZ_FENCE);
        addDrop(ModBlocks.SMOOTH_QUARTZ_FENCE_GATE);
        addDrop(ModBlocks.SMOOTH_QUARTZ_DOOR, doorDrops(ModBlocks.SMOOTH_QUARTZ_DOOR));
        addDrop(ModBlocks.SMOOTH_QUARTZ_WALL);

        //amethyst
        addDrop(ModBlocks.AMETHYST_STAIRS);
        addDrop(ModBlocks.AMETHYST_TRAPDOOR);
        addDrop(ModBlocks.AMETHYST_BUTTON);
        addDrop(ModBlocks.AMETHYST_PRESSURE_PLATE);
        addDrop(ModBlocks.AMETHYST_FENCE);
        addDrop(ModBlocks.AMETHYST_FENCE_GATE);
        addDrop(ModBlocks.AMETHYST_DOOR, doorDrops(ModBlocks.AMETHYST_DOOR));
        addDrop(ModBlocks.AMETHYST_SLAB, slabDrops(ModBlocks.AMETHYST_SLAB));
        addDrop(ModBlocks.AMETHYST_WALL);

        //copper
        addDrop(ModBlocks.COPPER_STAIRS);
        addDrop(ModBlocks.COPPER_TRAPDOOR);
        addDrop(ModBlocks.COPPER_BUTTON);
        addDrop(ModBlocks.COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.COPPER_FENCE);
        addDrop(ModBlocks.COPPER_FENCE_GATE);
        addDrop(ModBlocks.COPPER_DOOR, doorDrops(ModBlocks.COPPER_DOOR));
        addDrop(ModBlocks.COPPER_SLAB, slabDrops(ModBlocks.COPPER_SLAB));
        addDrop(ModBlocks.COPPER_WALL);

        //exposed_copper
        addDrop(ModBlocks.EXPOSED_COPPER_STAIRS);
        addDrop(ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.EXPOSED_COPPER_BUTTON);
        addDrop(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.EXPOSED_COPPER_FENCE);
        addDrop(ModBlocks.EXPOSED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.EXPOSED_COPPER_DOOR, doorDrops(ModBlocks.EXPOSED_COPPER_DOOR));
        addDrop(ModBlocks.EXPOSED_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_COPPER_SLAB));
        addDrop(ModBlocks.EXPOSED_COPPER_WALL);

        //weathered_copper
        addDrop(ModBlocks.WEATHERED_COPPER_STAIRS);
        addDrop(ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WEATHERED_COPPER_BUTTON);
        addDrop(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WEATHERED_COPPER_FENCE);
        addDrop(ModBlocks.WEATHERED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WEATHERED_COPPER_DOOR, doorDrops(ModBlocks.WEATHERED_COPPER_DOOR));
        addDrop(ModBlocks.WEATHERED_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_COPPER_WALL);

        //oxidized_copper
        addDrop(ModBlocks.OXIDIZED_COPPER_STAIRS);
        addDrop(ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.OXIDIZED_COPPER_BUTTON);
        addDrop(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.OXIDIZED_COPPER_FENCE);
        addDrop(ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.OXIDIZED_COPPER_DOOR, doorDrops(ModBlocks.OXIDIZED_COPPER_DOOR));
        addDrop(ModBlocks.OXIDIZED_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_COPPER_WALL);

        //cut copper
        addDrop(ModBlocks.CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.CUT_COPPER_BUTTON);
        addDrop(ModBlocks.CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_COPPER_FENCE);
        addDrop(ModBlocks.CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.CUT_COPPER_DOOR, doorDrops(ModBlocks.COPPER_DOOR));
        addDrop(ModBlocks.CUT_COPPER_WALL);

        //cut exposed_copper
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_BUTTON);
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_FENCE);
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_DOOR, doorDrops(ModBlocks.EXPOSED_CUT_COPPER_DOOR));
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_WALL);

        //cut weathered_copper
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_BUTTON);
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_FENCE);
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_DOOR, doorDrops(ModBlocks.WEATHERED_CUT_COPPER_DOOR));
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_WALL);

        //cut oxidized_copper
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON);
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_FENCE);
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, doorDrops(ModBlocks.OXIDIZED_CUT_COPPER_DOOR));
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_WALL);

        //waxed copper
        addDrop(ModBlocks.WAXED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_COPPER_WALL);

        //waxed exposed_copper
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_EXPOSED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_WALL);

        //waxed weathered_copper
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_WEATHERED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_WALL);

        //waxed oxidized_copper
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_WALL);

        //waxed cut copper
        addDrop(ModBlocks.CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.CUT_COPPER_BUTTON);
        addDrop(ModBlocks.CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_COPPER_FENCE);
        addDrop(ModBlocks.CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.CUT_COPPER_DOOR, doorDrops(ModBlocks.WAXED_COPPER_DOOR));
        addDrop(ModBlocks.CUT_COPPER_WALL);

        //waxed cut exposed_copper
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR, doorDrops(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);

        //waxed cut weathered_copper
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR, doorDrops(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);

        //waxed cut oxidized_copper
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR, doorDrops(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);

        //terracotta
        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.TERRACOTTA_BUTTON);
        addDrop(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.TERRACOTTA_FENCE);
        addDrop(ModBlocks.TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.TERRACOTTA_DOOR, doorDrops(ModBlocks.TERRACOTTA_DOOR));
        addDrop(ModBlocks.TERRACOTTA_SLAB, slabDrops(ModBlocks.TERRACOTTA_SLAB));
        addDrop(ModBlocks.TERRACOTTA_WALL);

        //white terracotta
        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.WHITE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.WHITE_TERRACOTTA_DOOR, doorDrops(ModBlocks.WHITE_TERRACOTTA_DOOR));
        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_TERRACOTTA_WALL);

        //light_gray_terracotta
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        //gray_terracotta
        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.GRAY_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_TERRACOTTA_FENCE);
        addDrop(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.GRAY_TERRACOTTA_DOOR, doorDrops(ModBlocks.GRAY_TERRACOTTA_DOOR));
        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_TERRACOTTA_WALL);

        //black_terracotta
        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.BLACK_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.BLACK_TERRACOTTA_DOOR, doorDrops(ModBlocks.BLACK_TERRACOTTA_DOOR));
        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_TERRACOTTA_WALL);

        //brown_terracotta
        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.BROWN_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.BROWN_TERRACOTTA_DOOR, doorDrops(ModBlocks.BROWN_TERRACOTTA_DOOR));
        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_TERRACOTTA_WALL);

        //red_terracotta
        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.RED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.RED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.RED_TERRACOTTA_DOOR, doorDrops(ModBlocks.RED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.RED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_TERRACOTTA_WALL);

        //orange_terracotta
        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_DOOR, doorDrops(ModBlocks.ORANGE_TERRACOTTA_DOOR));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_WALL);

        //yellow_terracotta
        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_FENCE);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_DOOR, doorDrops(ModBlocks.YELLOW_TERRACOTTA_DOOR));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_WALL);

        //lime_terracotta
        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.LIME_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIME_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.LIME_TERRACOTTA_DOOR, doorDrops(ModBlocks.LIME_TERRACOTTA_DOOR));
        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_TERRACOTTA_WALL);

        //green_terracotta
        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.GREEN_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_TERRACOTTA_FENCE);
        addDrop(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.GREEN_TERRACOTTA_DOOR, doorDrops(ModBlocks.GREEN_TERRACOTTA_DOOR));
        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_TERRACOTTA_WALL);

        //cyan_terracotta
        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.CYAN_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_TERRACOTTA_FENCE);
        addDrop(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.CYAN_TERRACOTTA_DOOR, doorDrops(ModBlocks.CYAN_TERRACOTTA_DOOR));
        addDrop(ModBlocks.CYAN_TERRACOTTA_SLAB, slabDrops(ModBlocks.CYAN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.CYAN_TERRACOTTA_WALL);

        //blue_terracotta
        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.BLUE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.BLUE_TERRACOTTA_DOOR, doorDrops(ModBlocks.BLUE_TERRACOTTA_DOOR));
        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_TERRACOTTA_WALL);

        //light_blue_terracotta
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR, doorDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        //purple_terracotta
        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_FENCE);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_DOOR, doorDrops(ModBlocks.PURPLE_TERRACOTTA_DOOR));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_WALL);

        //magenta_terracotta
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_FENCE);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_DOOR, doorDrops(ModBlocks.MAGENTA_TERRACOTTA_DOOR));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_WALL);

        //pink_terracotta
        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.PINK_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_TERRACOTTA_FENCE);
        addDrop(ModBlocks.PINK_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.PINK_TERRACOTTA_DOOR, doorDrops(ModBlocks.PINK_TERRACOTTA_DOOR));
        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_TERRACOTTA_WALL);

        //white concrete
        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.WHITE_CONCRETE_BUTTON);
        addDrop(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_CONCRETE_FENCE);
        addDrop(ModBlocks.WHITE_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.WHITE_CONCRETE_DOOR, doorDrops(ModBlocks.WHITE_CONCRETE_DOOR));
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_WALL);

        //light_gray_concrete
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        //gray_concrete
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.GRAY_CONCRETE_BUTTON);
        addDrop(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_CONCRETE_FENCE);
        addDrop(ModBlocks.GRAY_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.GRAY_CONCRETE_DOOR, doorDrops(ModBlocks.GRAY_CONCRETE_DOOR));
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_WALL);

        //black_concrete
        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.BLACK_CONCRETE_BUTTON);
        addDrop(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_CONCRETE_FENCE);
        addDrop(ModBlocks.BLACK_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.BLACK_CONCRETE_DOOR, doorDrops(ModBlocks.BLACK_CONCRETE_DOOR));
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_WALL);

        //brown_concrete
        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.BROWN_CONCRETE_BUTTON);
        addDrop(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_CONCRETE_FENCE);
        addDrop(ModBlocks.BROWN_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.BROWN_CONCRETE_DOOR, doorDrops(ModBlocks.BROWN_CONCRETE_DOOR));
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_WALL);

        //red_concrete
        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.RED_CONCRETE_BUTTON);
        addDrop(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_CONCRETE_FENCE);
        addDrop(ModBlocks.RED_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.RED_CONCRETE_DOOR, doorDrops(ModBlocks.RED_CONCRETE_DOOR));
        addDrop(ModBlocks.RED_CONCRETE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_WALL);

        //orange_concrete
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_CONCRETE_BUTTON);
        addDrop(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_FENCE);
        addDrop(ModBlocks.ORANGE_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_DOOR, doorDrops(ModBlocks.ORANGE_CONCRETE_DOOR));
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_WALL);

        //yellow_concrete
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_CONCRETE_BUTTON);
        addDrop(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_FENCE);
        addDrop(ModBlocks.YELLOW_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_DOOR, doorDrops(ModBlocks.YELLOW_CONCRETE_DOOR));
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_WALL);

        //lime_concrete
        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.LIME_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_CONCRETE_FENCE);
        addDrop(ModBlocks.LIME_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.LIME_CONCRETE_DOOR, doorDrops(ModBlocks.LIME_CONCRETE_DOOR));
        addDrop(ModBlocks.LIME_CONCRETE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_WALL);

        //green_concrete
        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.GREEN_CONCRETE_BUTTON);
        addDrop(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_CONCRETE_FENCE);
        addDrop(ModBlocks.GREEN_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.GREEN_CONCRETE_DOOR, doorDrops(ModBlocks.GREEN_CONCRETE_DOOR));
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_WALL);

        //cyan_concrete
        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.CYAN_CONCRETE_BUTTON);
        addDrop(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_CONCRETE_FENCE);
        addDrop(ModBlocks.CYAN_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.CYAN_CONCRETE_DOOR, doorDrops(ModBlocks.CYAN_CONCRETE_DOOR));
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_WALL);

        //blue_concrete
        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.BLUE_CONCRETE_BUTTON);
        addDrop(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_CONCRETE_FENCE);
        addDrop(ModBlocks.BLUE_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.BLUE_CONCRETE_DOOR, doorDrops(ModBlocks.BLUE_CONCRETE_DOOR));
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_WALL);

        //light_blue_concrete
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR, doorDrops(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        //purple_concrete
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.PURPLE_CONCRETE_BUTTON);
        addDrop(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_FENCE);
        addDrop(ModBlocks.PURPLE_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_DOOR, doorDrops(ModBlocks.PURPLE_CONCRETE_DOOR));
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_WALL);

        //magenta_concrete
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        addDrop(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_FENCE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_DOOR, doorDrops(ModBlocks.MAGENTA_CONCRETE_DOOR));
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_WALL);

        //pink_concrete
        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_TRAPDOOR);
        addDrop(ModBlocks.PINK_CONCRETE_BUTTON);
        addDrop(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_CONCRETE_FENCE);
        addDrop(ModBlocks.PINK_CONCRETE_FENCE_GATE);
        addDrop(ModBlocks.PINK_CONCRETE_DOOR, doorDrops(ModBlocks.PINK_CONCRETE_DOOR));
        addDrop(ModBlocks.PINK_CONCRETE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_WALL);

        //white concrete_powder
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.WHITE_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_POWDER_WALL);

        //light_gray_concrete_powder
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL);

        //gray_concrete_powder
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.GRAY_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_POWDER_WALL);

        //black_concrete_powder
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.BLACK_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_POWDER_WALL);

        //brown_concrete_powder
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.BROWN_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_POWDER_WALL);

        //red_concrete_powder
        addDrop(ModBlocks.RED_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.RED_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.RED_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.RED_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.RED_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.RED_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.RED_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.RED_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_POWDER_WALL);

        //orange_concrete_powder
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_POWDER_WALL);

        //yellow_concrete_powder
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_POWDER_WALL);

        //lime_concrete_powder
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.LIME_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_POWDER_WALL);

        //green_concrete_powder
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.GREEN_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_POWDER_WALL);

        //cyan_concrete_powder
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.CYAN_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_POWDER_WALL);

        //blue_concrete_powder
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.BLUE_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_POWDER_WALL);

        //light_blue_concrete_powder
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL);

        //purple_concrete_powder
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_POWDER_WALL);

        //magenta_concrete_powder
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_POWDER_WALL);

        //pink_concrete_powder
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR);
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_BUTTON);
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_FENCE);
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_FENCE_GATE);
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_DOOR, doorDrops(ModBlocks.PINK_CONCRETE_POWDER_DOOR));
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_POWDER_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_POWDER_WALL);

        //white glazed_terracotta
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

        //light_gray_glazed_terracotta
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

        //gray_glazed_terracotta
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

        //black_glazed_terracotta
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

        //brown_glazed_terracotta
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

        //red_glazed_terracotta
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

        //orange_glazed_terracotta
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

        //yellow_glazed_terracotta
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

        //lime_glazed_terracotta
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

        //green_glazed_terracotta
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

        //cyan_glazed_terracotta
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

        //blue_glazed_terracotta
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

        //light_blue_glazed_terracotta
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

        //purple_glazed_terracotta
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

        //magenta_glazed_terracotta
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

        //pink_glazed_terracotta
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR, doorDrops(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR));
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public LootTable.Builder moreOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this
                .applyExplosionDecay(drop, ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

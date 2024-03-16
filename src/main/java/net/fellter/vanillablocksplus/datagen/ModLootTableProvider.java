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


    }
    public LootTable.Builder moreOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this
                .applyExplosionDecay(drop, ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

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


    }
    public LootTable.Builder moreOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this
                .applyExplosionDecay(drop, ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

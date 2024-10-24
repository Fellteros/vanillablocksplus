package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //oak
        addDrop(ModBlocks.OAK_WOOD_STAIRS);
        addDrop(ModBlocks.OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.OAK_WOOD_BUTTON);
        addDrop(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.OAK_WOOD_FENCE);
        addDrop(ModBlocks.OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.OAK_WOOD_DOOR, doorDrops(ModBlocks.OAK_WOOD_DOOR));
        addDrop(ModBlocks.OAK_WOOD_SLAB, slabDrops(ModBlocks.OAK_WOOD_SLAB));
        //oak
        addDrop(ModBlocks2.OAK_LOG_STAIRS);
        addDrop(ModBlocks2.OAK_LOG_TRAPDOOR);
        addDrop(ModBlocks2.OAK_LOG_BUTTON);
        addDrop(ModBlocks2.OAK_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.OAK_LOG_FENCE);
        addDrop(ModBlocks2.OAK_LOG_FENCE_GATE);
        addDrop(ModBlocks2.OAK_LOG_DOOR, doorDrops(ModBlocks2.OAK_LOG_DOOR));
        addDrop(ModBlocks2.OAK_LOG_SLAB, slabDrops(ModBlocks2.OAK_LOG_SLAB));
        //str oak
        addDrop(ModBlocks.STR_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.STR_OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_OAK_WOOD_BUTTON);
        addDrop(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_OAK_WOOD_FENCE);
        addDrop(ModBlocks.STR_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_OAK_WOOD_DOOR, doorDrops(ModBlocks.STR_OAK_WOOD_DOOR));
        addDrop(ModBlocks.STR_OAK_WOOD_SLAB, slabDrops(ModBlocks.STR_OAK_WOOD_SLAB));
        //str_oak
        addDrop(ModBlocks2.STR_OAK_LOG_STAIRS);
        addDrop(ModBlocks2.STR_OAK_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_OAK_LOG_BUTTON);
        addDrop(ModBlocks2.STR_OAK_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_OAK_LOG_FENCE);
        addDrop(ModBlocks2.STR_OAK_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_OAK_LOG_DOOR, doorDrops(ModBlocks2.STR_OAK_LOG_DOOR));
        addDrop(ModBlocks2.STR_OAK_LOG_SLAB, slabDrops(ModBlocks2.STR_OAK_LOG_SLAB));
        //spruce
        addDrop(ModBlocks.SPRUCE_WOOD_STAIRS);
        addDrop(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.SPRUCE_WOOD_BUTTON);
        addDrop(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.SPRUCE_WOOD_FENCE);
        addDrop(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.SPRUCE_WOOD_DOOR, doorDrops(ModBlocks.SPRUCE_WOOD_DOOR));
        addDrop(ModBlocks.SPRUCE_WOOD_SLAB, slabDrops(ModBlocks.SPRUCE_WOOD_SLAB));
        //spruce
        addDrop(ModBlocks2.SPRUCE_LOG_STAIRS);
        addDrop(ModBlocks2.SPRUCE_LOG_TRAPDOOR);
        addDrop(ModBlocks2.SPRUCE_LOG_BUTTON);
        addDrop(ModBlocks2.SPRUCE_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.SPRUCE_LOG_FENCE);
        addDrop(ModBlocks2.SPRUCE_LOG_FENCE_GATE);
        addDrop(ModBlocks2.SPRUCE_LOG_DOOR, doorDrops(ModBlocks2.SPRUCE_LOG_DOOR));
        addDrop(ModBlocks2.SPRUCE_LOG_SLAB, slabDrops(ModBlocks2.SPRUCE_LOG_SLAB));
        //str spruce
        addDrop(ModBlocks.STR_SPRUCE_WOOD_STAIRS);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_BUTTON);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_FENCE);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_DOOR, doorDrops(ModBlocks.STR_SPRUCE_WOOD_DOOR));
        addDrop(ModBlocks.STR_SPRUCE_WOOD_SLAB, slabDrops(ModBlocks.STR_SPRUCE_WOOD_SLAB));
        //str_spruce
        addDrop(ModBlocks2.STR_SPRUCE_LOG_STAIRS);
        addDrop(ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_SPRUCE_LOG_BUTTON);
        addDrop(ModBlocks2.STR_SPRUCE_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_SPRUCE_LOG_FENCE);
        addDrop(ModBlocks2.STR_SPRUCE_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_SPRUCE_LOG_DOOR, doorDrops(ModBlocks2.STR_SPRUCE_LOG_DOOR));
        addDrop(ModBlocks2.STR_SPRUCE_LOG_SLAB, slabDrops(ModBlocks2.STR_SPRUCE_LOG_SLAB));
        //birch
        addDrop(ModBlocks.BIRCH_WOOD_STAIRS);
        addDrop(ModBlocks.BIRCH_WOOD_TRAPDOOR);
        addDrop(ModBlocks.BIRCH_WOOD_BUTTON);
        addDrop(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.BIRCH_WOOD_FENCE);
        addDrop(ModBlocks.BIRCH_WOOD_FENCE_GATE);
        addDrop(ModBlocks.BIRCH_WOOD_DOOR, doorDrops(ModBlocks.BIRCH_WOOD_DOOR));
        addDrop(ModBlocks.BIRCH_WOOD_SLAB, slabDrops(ModBlocks.BIRCH_WOOD_SLAB));
        //birch
        addDrop(ModBlocks2.BIRCH_LOG_STAIRS);
        addDrop(ModBlocks2.BIRCH_LOG_TRAPDOOR);
        addDrop(ModBlocks2.BIRCH_LOG_BUTTON);
        addDrop(ModBlocks2.BIRCH_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.BIRCH_LOG_FENCE);
        addDrop(ModBlocks2.BIRCH_LOG_FENCE_GATE);
        addDrop(ModBlocks2.BIRCH_LOG_DOOR, doorDrops(ModBlocks2.BIRCH_LOG_DOOR));
        addDrop(ModBlocks2.BIRCH_LOG_SLAB, slabDrops(ModBlocks2.BIRCH_LOG_SLAB));
        //str birch
        addDrop(ModBlocks.STR_BIRCH_WOOD_STAIRS);
        addDrop(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_BIRCH_WOOD_BUTTON);
        addDrop(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_BIRCH_WOOD_FENCE);
        addDrop(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_BIRCH_WOOD_DOOR, doorDrops(ModBlocks.STR_BIRCH_WOOD_DOOR));
        addDrop(ModBlocks.STR_BIRCH_WOOD_SLAB, slabDrops(ModBlocks.STR_BIRCH_WOOD_SLAB));
        //str_birch
        addDrop(ModBlocks2.STR_BIRCH_LOG_STAIRS);
        addDrop(ModBlocks2.STR_BIRCH_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_BIRCH_LOG_BUTTON);
        addDrop(ModBlocks2.STR_BIRCH_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_BIRCH_LOG_FENCE);
        addDrop(ModBlocks2.STR_BIRCH_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_BIRCH_LOG_DOOR, doorDrops(ModBlocks2.STR_BIRCH_LOG_DOOR));
        addDrop(ModBlocks2.STR_BIRCH_LOG_SLAB, slabDrops(ModBlocks2.STR_BIRCH_LOG_SLAB));
        //jungle
        addDrop(ModBlocks.JUNGLE_WOOD_STAIRS);
        addDrop(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.JUNGLE_WOOD_BUTTON);
        addDrop(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.JUNGLE_WOOD_FENCE);
        addDrop(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.JUNGLE_WOOD_DOOR, doorDrops(ModBlocks.JUNGLE_WOOD_DOOR));
        addDrop(ModBlocks.JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.JUNGLE_WOOD_SLAB));
        //jungle
        addDrop(ModBlocks2.JUNGLE_LOG_STAIRS);
        addDrop(ModBlocks2.JUNGLE_LOG_TRAPDOOR);
        addDrop(ModBlocks2.JUNGLE_LOG_BUTTON);
        addDrop(ModBlocks2.JUNGLE_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.JUNGLE_LOG_FENCE);
        addDrop(ModBlocks2.JUNGLE_LOG_FENCE_GATE);
        addDrop(ModBlocks2.JUNGLE_LOG_DOOR, doorDrops(ModBlocks2.JUNGLE_LOG_DOOR));
        addDrop(ModBlocks2.JUNGLE_LOG_SLAB, slabDrops(ModBlocks2.JUNGLE_LOG_SLAB));
        //str jungle
        addDrop(ModBlocks.STR_JUNGLE_WOOD_STAIRS);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_BUTTON);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_FENCE);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_DOOR, doorDrops(ModBlocks.STR_JUNGLE_WOOD_DOOR));
        addDrop(ModBlocks.STR_JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.STR_JUNGLE_WOOD_SLAB));
        //str_jungle
        addDrop(ModBlocks2.STR_JUNGLE_LOG_STAIRS);
        addDrop(ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_JUNGLE_LOG_BUTTON);
        addDrop(ModBlocks2.STR_JUNGLE_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_JUNGLE_LOG_FENCE);
        addDrop(ModBlocks2.STR_JUNGLE_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_JUNGLE_LOG_DOOR, doorDrops(ModBlocks2.STR_JUNGLE_LOG_DOOR));
        addDrop(ModBlocks2.STR_JUNGLE_LOG_SLAB, slabDrops(ModBlocks2.STR_JUNGLE_LOG_SLAB));
        //acacia
        addDrop(ModBlocks.ACACIA_WOOD_STAIRS);
        addDrop(ModBlocks.ACACIA_WOOD_TRAPDOOR);
        addDrop(ModBlocks.ACACIA_WOOD_BUTTON);
        addDrop(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.ACACIA_WOOD_FENCE);
        addDrop(ModBlocks.ACACIA_WOOD_FENCE_GATE);
        addDrop(ModBlocks.ACACIA_WOOD_DOOR, doorDrops(ModBlocks.ACACIA_WOOD_DOOR));
        addDrop(ModBlocks.ACACIA_WOOD_SLAB, slabDrops(ModBlocks.ACACIA_WOOD_SLAB));
        //acacia
        addDrop(ModBlocks2.ACACIA_LOG_STAIRS);
        addDrop(ModBlocks2.ACACIA_LOG_TRAPDOOR);
        addDrop(ModBlocks2.ACACIA_LOG_BUTTON);
        addDrop(ModBlocks2.ACACIA_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.ACACIA_LOG_FENCE);
        addDrop(ModBlocks2.ACACIA_LOG_FENCE_GATE);
        addDrop(ModBlocks2.ACACIA_LOG_DOOR, doorDrops(ModBlocks2.ACACIA_LOG_DOOR));
        addDrop(ModBlocks2.ACACIA_LOG_SLAB, slabDrops(ModBlocks2.ACACIA_LOG_SLAB));
        //str acacia
        addDrop(ModBlocks.STR_ACACIA_WOOD_STAIRS);
        addDrop(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_ACACIA_WOOD_BUTTON);
        addDrop(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_ACACIA_WOOD_FENCE);
        addDrop(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_ACACIA_WOOD_DOOR, doorDrops(ModBlocks.STR_ACACIA_WOOD_DOOR));
        addDrop(ModBlocks.STR_ACACIA_WOOD_SLAB, slabDrops(ModBlocks.STR_ACACIA_WOOD_SLAB));
        //str_acacia
        addDrop(ModBlocks2.STR_ACACIA_LOG_STAIRS);
        addDrop(ModBlocks2.STR_ACACIA_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_ACACIA_LOG_BUTTON);
        addDrop(ModBlocks2.STR_ACACIA_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_ACACIA_LOG_FENCE);
        addDrop(ModBlocks2.STR_ACACIA_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_ACACIA_LOG_DOOR, doorDrops(ModBlocks2.STR_ACACIA_LOG_DOOR));
        addDrop(ModBlocks2.STR_ACACIA_LOG_SLAB, slabDrops(ModBlocks2.STR_ACACIA_LOG_SLAB));
        //dark oak
        addDrop(ModBlocks.DARK_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.DARK_OAK_WOOD_BUTTON);
        addDrop(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE);
        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.DARK_OAK_WOOD_DOOR, doorDrops(ModBlocks.DARK_OAK_WOOD_DOOR));
        addDrop(ModBlocks.DARK_OAK_WOOD_SLAB, slabDrops(ModBlocks.DARK_OAK_WOOD_SLAB));
        //dark_oak
        addDrop(ModBlocks2.DARK_OAK_LOG_STAIRS);
        addDrop(ModBlocks2.DARK_OAK_LOG_TRAPDOOR);
        addDrop(ModBlocks2.DARK_OAK_LOG_BUTTON);
        addDrop(ModBlocks2.DARK_OAK_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.DARK_OAK_LOG_FENCE);
        addDrop(ModBlocks2.DARK_OAK_LOG_FENCE_GATE);
        addDrop(ModBlocks2.DARK_OAK_LOG_DOOR, doorDrops(ModBlocks2.DARK_OAK_LOG_DOOR));
        addDrop(ModBlocks2.DARK_OAK_LOG_SLAB, slabDrops(ModBlocks2.DARK_OAK_LOG_SLAB));
        //str dark oak
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_BUTTON);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_FENCE);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_DOOR, doorDrops(ModBlocks.STR_DARK_OAK_WOOD_DOOR));
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_SLAB, slabDrops(ModBlocks.STR_DARK_OAK_WOOD_SLAB));
        //str_dark_oak
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_STAIRS);
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_BUTTON);
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_FENCE);
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_DOOR, doorDrops(ModBlocks2.STR_DARK_OAK_LOG_DOOR));
        addDrop(ModBlocks2.STR_DARK_OAK_LOG_SLAB, slabDrops(ModBlocks2.STR_DARK_OAK_LOG_SLAB));
        //mangrove
        addDrop(ModBlocks.MANGROVE_WOOD_STAIRS);
        addDrop(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.MANGROVE_WOOD_BUTTON);
        addDrop(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.MANGROVE_WOOD_FENCE);
        addDrop(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.MANGROVE_WOOD_DOOR, doorDrops(ModBlocks.MANGROVE_WOOD_DOOR));
        addDrop(ModBlocks.MANGROVE_WOOD_SLAB, slabDrops(ModBlocks.MANGROVE_WOOD_SLAB));
        //mangrove
        addDrop(ModBlocks2.MANGROVE_LOG_STAIRS);
        addDrop(ModBlocks2.MANGROVE_LOG_TRAPDOOR);
        addDrop(ModBlocks2.MANGROVE_LOG_BUTTON);
        addDrop(ModBlocks2.MANGROVE_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.MANGROVE_LOG_FENCE);
        addDrop(ModBlocks2.MANGROVE_LOG_FENCE_GATE);
        addDrop(ModBlocks2.MANGROVE_LOG_DOOR, doorDrops(ModBlocks2.MANGROVE_LOG_DOOR));
        addDrop(ModBlocks2.MANGROVE_LOG_SLAB, slabDrops(ModBlocks2.MANGROVE_LOG_SLAB));
        //str mangrove
        addDrop(ModBlocks.STR_MANGROVE_WOOD_STAIRS);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_BUTTON);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_FENCE);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_DOOR, doorDrops(ModBlocks.STR_MANGROVE_WOOD_DOOR));
        addDrop(ModBlocks.STR_MANGROVE_WOOD_SLAB, slabDrops(ModBlocks.STR_MANGROVE_WOOD_SLAB));
        //str_mangrove
        addDrop(ModBlocks2.STR_MANGROVE_LOG_STAIRS);
        addDrop(ModBlocks2.STR_MANGROVE_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_MANGROVE_LOG_BUTTON);
        addDrop(ModBlocks2.STR_MANGROVE_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_MANGROVE_LOG_FENCE);
        addDrop(ModBlocks2.STR_MANGROVE_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_MANGROVE_LOG_DOOR, doorDrops(ModBlocks2.STR_MANGROVE_LOG_DOOR));
        addDrop(ModBlocks2.STR_MANGROVE_LOG_SLAB, slabDrops(ModBlocks2.STR_MANGROVE_LOG_SLAB));
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
        addDrop(ModBlocks2.CHERRY_LOG_STAIRS);
        addDrop(ModBlocks2.CHERRY_LOG_TRAPDOOR);
        addDrop(ModBlocks2.CHERRY_LOG_BUTTON);
        addDrop(ModBlocks2.CHERRY_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.CHERRY_LOG_FENCE);
        addDrop(ModBlocks2.CHERRY_LOG_FENCE_GATE);
        addDrop(ModBlocks2.CHERRY_LOG_DOOR, doorDrops(ModBlocks2.CHERRY_LOG_DOOR));
        addDrop(ModBlocks2.CHERRY_LOG_SLAB, slabDrops(ModBlocks2.CHERRY_LOG_SLAB));
        //cherry
        addDrop(ModBlocks.STR_CHERRY_WOOD_STAIRS);
        addDrop(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
        addDrop(ModBlocks.STR_CHERRY_WOOD_BUTTON);
        addDrop(ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_CHERRY_WOOD_FENCE);
        addDrop(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE);
        addDrop(ModBlocks.STR_CHERRY_WOOD_DOOR, doorDrops(ModBlocks.STR_CHERRY_WOOD_DOOR));
        addDrop(ModBlocks.STR_CHERRY_WOOD_SLAB, slabDrops(ModBlocks.STR_CHERRY_WOOD_SLAB));
        //str_cherry
        addDrop(ModBlocks2.STR_CHERRY_LOG_STAIRS);
        addDrop(ModBlocks2.STR_CHERRY_LOG_TRAPDOOR);
        addDrop(ModBlocks2.STR_CHERRY_LOG_BUTTON);
        addDrop(ModBlocks2.STR_CHERRY_LOG_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_CHERRY_LOG_FENCE);
        addDrop(ModBlocks2.STR_CHERRY_LOG_FENCE_GATE);
        addDrop(ModBlocks2.STR_CHERRY_LOG_DOOR, doorDrops(ModBlocks2.STR_CHERRY_LOG_DOOR));
        addDrop(ModBlocks2.STR_CHERRY_LOG_SLAB, slabDrops(ModBlocks2.STR_CHERRY_LOG_SLAB));
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
        //crimson
        addDrop(ModBlocks2.CRIMSON_STEM_STAIRS);
        addDrop(ModBlocks2.CRIMSON_STEM_TRAPDOOR);
        addDrop(ModBlocks2.CRIMSON_STEM_BUTTON);
        addDrop(ModBlocks2.CRIMSON_STEM_PRESSURE_PLATE);
        addDrop(ModBlocks2.CRIMSON_STEM_FENCE);
        addDrop(ModBlocks2.CRIMSON_STEM_FENCE_GATE);
        addDrop(ModBlocks2.CRIMSON_STEM_DOOR, doorDrops(ModBlocks2.CRIMSON_STEM_DOOR));
        addDrop(ModBlocks2.CRIMSON_STEM_SLAB, slabDrops(ModBlocks2.CRIMSON_STEM_SLAB));
        //str crimson hyphae
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_BUTTON);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_FENCE);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, doorDrops(ModBlocks.STR_CRIMSON_HYPHAE_DOOR));
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_SLAB, slabDrops(ModBlocks.STR_CRIMSON_HYPHAE_SLAB));
        //str_crimson
        addDrop(ModBlocks2.STR_CRIMSON_STEM_STAIRS);
        addDrop(ModBlocks2.STR_CRIMSON_STEM_TRAPDOOR);
        addDrop(ModBlocks2.STR_CRIMSON_STEM_BUTTON);
        addDrop(ModBlocks2.STR_CRIMSON_STEM_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_CRIMSON_STEM_FENCE);
        addDrop(ModBlocks2.STR_CRIMSON_STEM_FENCE_GATE);
        addDrop(ModBlocks2.STR_CRIMSON_STEM_DOOR, doorDrops(ModBlocks2.STR_CRIMSON_STEM_DOOR));
        addDrop(ModBlocks2.STR_CRIMSON_STEM_SLAB, slabDrops(ModBlocks2.STR_CRIMSON_STEM_SLAB));
        //warped hyphae
        addDrop(ModBlocks.WARPED_HYPHAE_STAIRS);
        addDrop(ModBlocks.WARPED_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.WARPED_HYPHAE_BUTTON);
        addDrop(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.WARPED_HYPHAE_FENCE);
        addDrop(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.WARPED_HYPHAE_DOOR, doorDrops(ModBlocks.WARPED_HYPHAE_DOOR));
        addDrop(ModBlocks.WARPED_HYPHAE_SLAB, slabDrops(ModBlocks.WARPED_HYPHAE_SLAB));
        //warped
        addDrop(ModBlocks2.WARPED_STEM_STAIRS);
        addDrop(ModBlocks2.WARPED_STEM_TRAPDOOR);
        addDrop(ModBlocks2.WARPED_STEM_BUTTON);
        addDrop(ModBlocks2.WARPED_STEM_PRESSURE_PLATE);
        addDrop(ModBlocks2.WARPED_STEM_FENCE);
        addDrop(ModBlocks2.WARPED_STEM_FENCE_GATE);
        addDrop(ModBlocks2.WARPED_STEM_DOOR, doorDrops(ModBlocks2.WARPED_STEM_DOOR));
        addDrop(ModBlocks2.WARPED_STEM_SLAB, slabDrops(ModBlocks2.WARPED_STEM_SLAB));
        //str warped hyphae
        addDrop(ModBlocks.STR_WARPED_HYPHAE_STAIRS);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_BUTTON);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_FENCE);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_DOOR, doorDrops(ModBlocks.STR_WARPED_HYPHAE_DOOR));
        addDrop(ModBlocks.STR_WARPED_HYPHAE_SLAB, slabDrops(ModBlocks.STR_WARPED_HYPHAE_SLAB));
        //str_warped
        addDrop(ModBlocks2.STR_WARPED_STEM_STAIRS);
        addDrop(ModBlocks2.STR_WARPED_STEM_TRAPDOOR);
        addDrop(ModBlocks2.STR_WARPED_STEM_BUTTON);
        addDrop(ModBlocks2.STR_WARPED_STEM_PRESSURE_PLATE);
        addDrop(ModBlocks2.STR_WARPED_STEM_FENCE);
        addDrop(ModBlocks2.STR_WARPED_STEM_FENCE_GATE);
        addDrop(ModBlocks2.STR_WARPED_STEM_DOOR, doorDrops(ModBlocks2.STR_WARPED_STEM_DOOR));
        addDrop(ModBlocks2.STR_WARPED_STEM_SLAB, slabDrops(ModBlocks2.STR_WARPED_STEM_SLAB));
        //stone
        addDrop(ModBlocks.STONE_TRAPDOOR);
        addDrop(ModBlocks.STONE_FENCE);
        addDrop(ModBlocks.STONE_FENCE_GATE);
        addDrop(ModBlocks.STONE_DOOR, doorDrops(ModBlocks.STONE_DOOR));
        //cobblestone
        addDrop(ModBlocks.COBBLESTONE_TRAPDOOR);
        addDrop(ModBlocks.COBBLESTONE_FENCE);
        addDrop(ModBlocks.COBBLESTONE_FENCE_GATE);
        addDrop(ModBlocks.COBBLESTONE_BUTTON);
        addDrop(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
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
        addDrop(ModBlocks.COPPER_BUTTON);
        addDrop(ModBlocks.COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.COPPER_FENCE);
        addDrop(ModBlocks.COPPER_FENCE_GATE);
        addDrop(ModBlocks.COPPER_SLAB, slabDrops(ModBlocks.COPPER_SLAB));
        addDrop(ModBlocks.COPPER_WALL);

        //exposed_copper
        addDrop(ModBlocks.EXPOSED_COPPER_STAIRS);
        addDrop(ModBlocks.EXPOSED_COPPER_BUTTON);
        addDrop(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.EXPOSED_COPPER_FENCE);
        addDrop(ModBlocks.EXPOSED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.EXPOSED_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_COPPER_SLAB));
        addDrop(ModBlocks.EXPOSED_COPPER_WALL);

        //weathered_copper
        addDrop(ModBlocks.WEATHERED_COPPER_STAIRS);
        addDrop(ModBlocks.WEATHERED_COPPER_BUTTON);
        addDrop(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WEATHERED_COPPER_FENCE);
        addDrop(ModBlocks.WEATHERED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WEATHERED_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_COPPER_WALL);

        //oxidized_copper
        addDrop(ModBlocks.OXIDIZED_COPPER_STAIRS);
        addDrop(ModBlocks.OXIDIZED_COPPER_BUTTON);
        addDrop(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.OXIDIZED_COPPER_FENCE);
        addDrop(ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.OXIDIZED_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_COPPER_WALL);

        //cut copper
        addDrop(ModBlocks.CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.CUT_COPPER_BUTTON);
        addDrop(ModBlocks.CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_COPPER_FENCE);
        addDrop(ModBlocks.CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.CUT_COPPER_DOOR, doorDrops(ModBlocks.CUT_COPPER_DOOR));
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
        addDrop(ModBlocks.WAXED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_COPPER_WALL);

        //waxed exposed_copper
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_WALL);

        //waxed weathered_copper
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_WALL);

        //waxed oxidized_copper
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_WALL);

        //waxed cut copper
        addDrop(ModBlocks.CUT_COPPER_TRAPDOOR);
        addDrop(ModBlocks.CUT_COPPER_BUTTON);
        addDrop(ModBlocks.CUT_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_COPPER_FENCE);
        addDrop(ModBlocks.CUT_COPPER_FENCE_GATE);
        addDrop(ModBlocks.CUT_COPPER_DOOR, doorDrops(ModBlocks.WAXED_CUT_COPPER_DOOR));
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

        //white_stained_glass
        addDrop(ModBlocks.WHITE_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.WHITE_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.WHITE_STAINED_GLASS_DOOR, doorDrops(ModBlocks.WHITE_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.WHITE_STAINED_GLASS_SLAB, slabDrops(ModBlocks.WHITE_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.WHITE_STAINED_GLASS_WALL);

        //light_gray_stained_glass
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);

        //gray_stained_glass
        addDrop(ModBlocks.GRAY_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.GRAY_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.GRAY_STAINED_GLASS_DOOR, doorDrops(ModBlocks.GRAY_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.GRAY_STAINED_GLASS_SLAB, slabDrops(ModBlocks.GRAY_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.GRAY_STAINED_GLASS_WALL);

        //black_stained_glass
        addDrop(ModBlocks.BLACK_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.BLACK_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.BLACK_STAINED_GLASS_DOOR, doorDrops(ModBlocks.BLACK_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.BLACK_STAINED_GLASS_SLAB, slabDrops(ModBlocks.BLACK_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.BLACK_STAINED_GLASS_WALL);

        //red_stained_glass
        addDrop(ModBlocks.RED_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.RED_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.RED_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.RED_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.RED_STAINED_GLASS_DOOR, doorDrops(ModBlocks.RED_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.RED_STAINED_GLASS_SLAB, slabDrops(ModBlocks.RED_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.RED_STAINED_GLASS_WALL);

        //orange_stained_glass
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_DOOR, doorDrops(ModBlocks.ORANGE_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_SLAB, slabDrops(ModBlocks.ORANGE_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.ORANGE_STAINED_GLASS_WALL);

        //yellow_stained_glass
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_DOOR, doorDrops(ModBlocks.YELLOW_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_SLAB, slabDrops(ModBlocks.YELLOW_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.YELLOW_STAINED_GLASS_WALL);

        //lime_stained_glass
        addDrop(ModBlocks.LIME_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.LIME_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.LIME_STAINED_GLASS_DOOR, doorDrops(ModBlocks.LIME_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.LIME_STAINED_GLASS_SLAB, slabDrops(ModBlocks.LIME_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.LIME_STAINED_GLASS_WALL);

        //green_stained_glass
        addDrop(ModBlocks.GREEN_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.GREEN_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.GREEN_STAINED_GLASS_DOOR, doorDrops(ModBlocks.GREEN_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.GREEN_STAINED_GLASS_SLAB, slabDrops(ModBlocks.GREEN_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.GREEN_STAINED_GLASS_WALL);

        //cyan_stained_glass
        addDrop(ModBlocks.CYAN_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.CYAN_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.CYAN_STAINED_GLASS_DOOR, doorDrops(ModBlocks.CYAN_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.CYAN_STAINED_GLASS_SLAB, slabDrops(ModBlocks.CYAN_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.CYAN_STAINED_GLASS_WALL);

        //blue_stained_glass
        addDrop(ModBlocks.BLUE_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.BLUE_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.BLUE_STAINED_GLASS_DOOR, doorDrops(ModBlocks.BLUE_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.BLUE_STAINED_GLASS_SLAB, slabDrops(ModBlocks.BLUE_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.BLUE_STAINED_GLASS_WALL);

        //light_blue_stained_glass
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR, doorDrops(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);

        //purple_stained_glass
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_DOOR, doorDrops(ModBlocks.PURPLE_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_SLAB, slabDrops(ModBlocks.PURPLE_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.PURPLE_STAINED_GLASS_WALL);

        //magenta_stained_glass
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_DOOR, doorDrops(ModBlocks.MAGENTA_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_SLAB, slabDrops(ModBlocks.MAGENTA_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.MAGENTA_STAINED_GLASS_WALL);

        //pink_stained_glass
        addDrop(ModBlocks.PINK_STAINED_GLASS_STAIRS);
        addDrop(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR);
        addDrop(ModBlocks.PINK_STAINED_GLASS_BUTTON);
        addDrop(ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_STAINED_GLASS_FENCE);
        addDrop(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE);
        addDrop(ModBlocks.PINK_STAINED_GLASS_DOOR, doorDrops(ModBlocks.PINK_STAINED_GLASS_DOOR));
        addDrop(ModBlocks.PINK_STAINED_GLASS_SLAB, slabDrops(ModBlocks.PINK_STAINED_GLASS_SLAB));
        addDrop(ModBlocks.PINK_STAINED_GLASS_WALL);

        //grass
        addDrop(ModBlocks.GRASS_STAIRS);
        addDrop(ModBlocks.GRASS_TRAPDOOR);
        addDrop(ModBlocks.GRASS_BUTTON);
        addDrop(ModBlocks.GRASS_PRESSURE_PLATE);
        addDrop(ModBlocks.GRASS_FENCE);
        addDrop(ModBlocks.GRASS_FENCE_GATE);
        addDrop(ModBlocks.GRASS_DOOR, doorDrops(ModBlocks.GRASS_DOOR));
        addDrop(ModBlocks.GRASS_SLAB, slabDrops(ModBlocks.GRASS_SLAB));
        addDrop(ModBlocks.GRASS_WALL);

        //podzol
        addDrop(ModBlocks.PODZOL_STAIRS);
        addDrop(ModBlocks.PODZOL_TRAPDOOR);
        addDrop(ModBlocks.PODZOL_BUTTON);
        addDrop(ModBlocks.PODZOL_PRESSURE_PLATE);
        addDrop(ModBlocks.PODZOL_FENCE);
        addDrop(ModBlocks.PODZOL_FENCE_GATE);
        addDrop(ModBlocks.PODZOL_DOOR, doorDrops(ModBlocks.PODZOL_DOOR));
        addDrop(ModBlocks.PODZOL_SLAB, slabDrops(ModBlocks.PODZOL_SLAB));
        addDrop(ModBlocks.PODZOL_WALL);

        //dirt
        addDrop(ModBlocks.DIRT_STAIRS);
        addDrop(ModBlocks.DIRT_TRAPDOOR);
        addDrop(ModBlocks.DIRT_BUTTON);
        addDrop(ModBlocks.DIRT_PRESSURE_PLATE);
        addDrop(ModBlocks.DIRT_FENCE);
        addDrop(ModBlocks.DIRT_FENCE_GATE);
        addDrop(ModBlocks.DIRT_DOOR, doorDrops(ModBlocks.DIRT_DOOR));
        addDrop(ModBlocks.DIRT_SLAB, slabDrops(ModBlocks.DIRT_SLAB));
        addDrop(ModBlocks.DIRT_WALL);

        //mycelium
        addDrop(ModBlocks.MYCELIUM_STAIRS);
        addDrop(ModBlocks.MYCELIUM_TRAPDOOR);
        addDrop(ModBlocks.MYCELIUM_BUTTON);
        addDrop(ModBlocks.MYCELIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.MYCELIUM_FENCE);
        addDrop(ModBlocks.MYCELIUM_FENCE_GATE);
        addDrop(ModBlocks.MYCELIUM_DOOR, doorDrops(ModBlocks.MYCELIUM_DOOR));
        addDrop(ModBlocks.MYCELIUM_SLAB, slabDrops(ModBlocks.MYCELIUM_SLAB));
        addDrop(ModBlocks.MYCELIUM_WALL);

        //dirt_path
        addDrop(ModBlocks.DIRT_PATH_STAIRS);
        addDrop(ModBlocks.DIRT_PATH_TRAPDOOR);
        addDrop(ModBlocks.DIRT_PATH_BUTTON);
        addDrop(ModBlocks.DIRT_PATH_PRESSURE_PLATE);
        addDrop(ModBlocks.DIRT_PATH_FENCE);
        addDrop(ModBlocks.DIRT_PATH_FENCE_GATE);
        addDrop(ModBlocks.DIRT_PATH_DOOR, doorDrops(ModBlocks.DIRT_PATH_DOOR));
        addDrop(ModBlocks.DIRT_PATH_SLAB, slabDrops(ModBlocks.DIRT_PATH_SLAB));
        addDrop(ModBlocks.DIRT_PATH_WALL);

        //coarse_dirt
        addDrop(ModBlocks.COARSE_DIRT_STAIRS);
        addDrop(ModBlocks.COARSE_DIRT_TRAPDOOR);
        addDrop(ModBlocks.COARSE_DIRT_BUTTON);
        addDrop(ModBlocks.COARSE_DIRT_PRESSURE_PLATE);
        addDrop(ModBlocks.COARSE_DIRT_FENCE);
        addDrop(ModBlocks.COARSE_DIRT_FENCE_GATE);
        addDrop(ModBlocks.COARSE_DIRT_DOOR, doorDrops(ModBlocks.COARSE_DIRT_DOOR));
        addDrop(ModBlocks.COARSE_DIRT_SLAB, slabDrops(ModBlocks.COARSE_DIRT_SLAB));
        addDrop(ModBlocks.COARSE_DIRT_WALL);

        //farmland
        addDrop(ModBlocks.FARMLAND_STAIRS);
        addDrop(ModBlocks.FARMLAND_TRAPDOOR);
        addDrop(ModBlocks.FARMLAND_BUTTON);
        addDrop(ModBlocks.FARMLAND_PRESSURE_PLATE);
        addDrop(ModBlocks.FARMLAND_FENCE);
        addDrop(ModBlocks.FARMLAND_FENCE_GATE);
        addDrop(ModBlocks.FARMLAND_DOOR, doorDrops(ModBlocks.FARMLAND_DOOR));
        addDrop(ModBlocks.FARMLAND_SLAB, slabDrops(ModBlocks.FARMLAND_SLAB));
        addDrop(ModBlocks.FARMLAND_WALL);

        //rooted_dirt
        addDrop(ModBlocks.ROOTED_DIRT_STAIRS);
        addDrop(ModBlocks.ROOTED_DIRT_TRAPDOOR);
        addDrop(ModBlocks.ROOTED_DIRT_BUTTON);
        addDrop(ModBlocks.ROOTED_DIRT_PRESSURE_PLATE);
        addDrop(ModBlocks.ROOTED_DIRT_FENCE);
        addDrop(ModBlocks.ROOTED_DIRT_FENCE_GATE);
        addDrop(ModBlocks.ROOTED_DIRT_DOOR, doorDrops(ModBlocks.ROOTED_DIRT_DOOR));
        addDrop(ModBlocks.ROOTED_DIRT_SLAB, slabDrops(ModBlocks.ROOTED_DIRT_SLAB));
        addDrop(ModBlocks.ROOTED_DIRT_WALL);

        //mud
        addDrop(ModBlocks.MUD_STAIRS);
        addDrop(ModBlocks.MUD_TRAPDOOR);
        addDrop(ModBlocks.MUD_BUTTON);
        addDrop(ModBlocks.MUD_PRESSURE_PLATE);
        addDrop(ModBlocks.MUD_FENCE);
        addDrop(ModBlocks.MUD_FENCE_GATE);
        addDrop(ModBlocks.MUD_DOOR, doorDrops(ModBlocks.MUD_DOOR));
        addDrop(ModBlocks.MUD_SLAB, slabDrops(ModBlocks.MUD_SLAB));
        addDrop(ModBlocks.MUD_WALL);

        //clay
        addDrop(ModBlocks.CLAY_STAIRS);
        addDrop(ModBlocks.CLAY_TRAPDOOR);
        addDrop(ModBlocks.CLAY_BUTTON);
        addDrop(ModBlocks.CLAY_PRESSURE_PLATE);
        addDrop(ModBlocks.CLAY_FENCE);
        addDrop(ModBlocks.CLAY_FENCE_GATE);
        addDrop(ModBlocks.CLAY_DOOR, doorDrops(ModBlocks.CLAY_DOOR));
        addDrop(ModBlocks.CLAY_SLAB, slabDrops(ModBlocks.CLAY_SLAB));
        addDrop(ModBlocks.CLAY_WALL);

        //sand
        addDrop(ModBlocks.SAND_STAIRS);
        addDrop(ModBlocks.SAND_TRAPDOOR);
        addDrop(ModBlocks.SAND_BUTTON);
        addDrop(ModBlocks.SAND_PRESSURE_PLATE);
        addDrop(ModBlocks.SAND_FENCE);
        addDrop(ModBlocks.SAND_FENCE_GATE);
        addDrop(ModBlocks.SAND_DOOR, doorDrops(ModBlocks.SAND_DOOR));
        addDrop(ModBlocks.SAND_SLAB, slabDrops(ModBlocks.SAND_SLAB));
        addDrop(ModBlocks.SAND_WALL);

        //gravel
        addDrop(ModBlocks.GRAVEL_STAIRS);
        addDrop(ModBlocks.GRAVEL_TRAPDOOR);
        addDrop(ModBlocks.GRAVEL_BUTTON);
        addDrop(ModBlocks.GRAVEL_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAVEL_FENCE);
        addDrop(ModBlocks.GRAVEL_FENCE_GATE);
        addDrop(ModBlocks.GRAVEL_DOOR, doorDrops(ModBlocks.GRAVEL_DOOR));
        addDrop(ModBlocks.GRAVEL_SLAB, slabDrops(ModBlocks.GRAVEL_SLAB));
        addDrop(ModBlocks.GRAVEL_WALL);

        //red_sand
        addDrop(ModBlocks.RED_SAND_STAIRS);
        addDrop(ModBlocks.RED_SAND_TRAPDOOR);
        addDrop(ModBlocks.RED_SAND_BUTTON);
        addDrop(ModBlocks.RED_SAND_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_SAND_FENCE);
        addDrop(ModBlocks.RED_SAND_FENCE_GATE);
        addDrop(ModBlocks.RED_SAND_DOOR, doorDrops(ModBlocks.RED_SAND_DOOR));
        addDrop(ModBlocks.RED_SAND_SLAB, slabDrops(ModBlocks.RED_SAND_SLAB));
        addDrop(ModBlocks.RED_SAND_WALL);

        //ice
        addDrop(ModBlocks.ICE_STAIRS);
        addDrop(ModBlocks.ICE_TRAPDOOR);
        addDrop(ModBlocks.ICE_BUTTON);
        addDrop(ModBlocks.ICE_PRESSURE_PLATE);
        addDrop(ModBlocks.ICE_FENCE);
        addDrop(ModBlocks.ICE_FENCE_GATE);
        addDrop(ModBlocks.ICE_DOOR, doorDrops(ModBlocks.ICE_DOOR));
        addDrop(ModBlocks.ICE_SLAB, slabDrops(ModBlocks.ICE_SLAB));
        addDrop(ModBlocks.ICE_WALL);

        //packed_ice
        addDrop(ModBlocks.PACKED_ICE_STAIRS);
        addDrop(ModBlocks.PACKED_ICE_TRAPDOOR);
        addDrop(ModBlocks.PACKED_ICE_BUTTON);
        addDrop(ModBlocks.PACKED_ICE_PRESSURE_PLATE);
        addDrop(ModBlocks.PACKED_ICE_FENCE);
        addDrop(ModBlocks.PACKED_ICE_FENCE_GATE);
        addDrop(ModBlocks.PACKED_ICE_DOOR, doorDrops(ModBlocks.PACKED_ICE_DOOR));
        addDrop(ModBlocks.PACKED_ICE_SLAB, slabDrops(ModBlocks.PACKED_ICE_SLAB));
        addDrop(ModBlocks.PACKED_ICE_WALL);

        //blue_ice
        addDrop(ModBlocks.BLUE_ICE_STAIRS);
        addDrop(ModBlocks.BLUE_ICE_TRAPDOOR);
        addDrop(ModBlocks.BLUE_ICE_BUTTON);
        addDrop(ModBlocks.BLUE_ICE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_ICE_FENCE);
        addDrop(ModBlocks.BLUE_ICE_FENCE_GATE);
        addDrop(ModBlocks.BLUE_ICE_DOOR, doorDrops(ModBlocks.BLUE_ICE_DOOR));
        addDrop(ModBlocks.BLUE_ICE_SLAB, slabDrops(ModBlocks.BLUE_ICE_SLAB));
        addDrop(ModBlocks.BLUE_ICE_WALL);

        //snow
        addDrop(ModBlocks.SNOW_STAIRS);
        addDrop(ModBlocks.SNOW_TRAPDOOR);
        addDrop(ModBlocks.SNOW_BUTTON);
        addDrop(ModBlocks.SNOW_PRESSURE_PLATE);
        addDrop(ModBlocks.SNOW_FENCE);
        addDrop(ModBlocks.SNOW_FENCE_GATE);
        addDrop(ModBlocks.SNOW_DOOR, doorDrops(ModBlocks.SNOW_DOOR));
        addDrop(ModBlocks.SNOW_SLAB, slabDrops(ModBlocks.SNOW_SLAB));
        addDrop(ModBlocks.SNOW_WALL);

        //moss
        addDrop(ModBlocks.MOSS_STAIRS);
        addDrop(ModBlocks.MOSS_TRAPDOOR);
        addDrop(ModBlocks.MOSS_BUTTON);
        addDrop(ModBlocks.MOSS_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSS_FENCE);
        addDrop(ModBlocks.MOSS_FENCE_GATE);
        addDrop(ModBlocks.MOSS_DOOR, doorDrops(ModBlocks.MOSS_DOOR));
        addDrop(ModBlocks.MOSS_SLAB, slabDrops(ModBlocks.MOSS_SLAB));
        addDrop(ModBlocks.MOSS_WALL);

        //calcite
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.CALCITE_TRAPDOOR);
        addDrop(ModBlocks.CALCITE_BUTTON);
        addDrop(ModBlocks.CALCITE_PRESSURE_PLATE);
        addDrop(ModBlocks.CALCITE_FENCE);
        addDrop(ModBlocks.CALCITE_FENCE_GATE);
        addDrop(ModBlocks.CALCITE_DOOR, doorDrops(ModBlocks.CALCITE_DOOR));
        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.CALCITE_WALL);

        //tuff
        addDrop(ModBlocks.TUFF_TRAPDOOR);
        addDrop(ModBlocks.TUFF_BUTTON);
        addDrop(ModBlocks.TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks.TUFF_FENCE);
        addDrop(ModBlocks.TUFF_FENCE_GATE);
        addDrop(ModBlocks.TUFF_DOOR, doorDrops(ModBlocks.TUFF_DOOR));

        //dripstone
        addDrop(ModBlocks.DRIPSTONE_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_TRAPDOOR);
        addDrop(ModBlocks.DRIPSTONE_BUTTON);
        addDrop(ModBlocks.DRIPSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.DRIPSTONE_FENCE);
        addDrop(ModBlocks.DRIPSTONE_FENCE_GATE);
        addDrop(ModBlocks.DRIPSTONE_DOOR, doorDrops(ModBlocks.DRIPSTONE_DOOR));
        addDrop(ModBlocks.DRIPSTONE_SLAB, slabDrops(ModBlocks.DRIPSTONE_SLAB));
        addDrop(ModBlocks.DRIPSTONE_WALL);

        //magma
        addDrop(ModBlocks.MAGMA_STAIRS);
        addDrop(ModBlocks.MAGMA_TRAPDOOR);
        addDrop(ModBlocks.MAGMA_BUTTON);
        addDrop(ModBlocks.MAGMA_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGMA_FENCE);
        addDrop(ModBlocks.MAGMA_FENCE_GATE);
        addDrop(ModBlocks.MAGMA_DOOR, doorDrops(ModBlocks.MAGMA_DOOR));
        addDrop(ModBlocks.MAGMA_SLAB, slabDrops(ModBlocks.MAGMA_SLAB));
        addDrop(ModBlocks.MAGMA_WALL);

        //obsidian
        addDrop(ModBlocks.OBSIDIAN_STAIRS);
        addDrop(ModBlocks.OBSIDIAN_TRAPDOOR);
        addDrop(ModBlocks.OBSIDIAN_BUTTON);
        addDrop(ModBlocks.OBSIDIAN_PRESSURE_PLATE);
        addDrop(ModBlocks.OBSIDIAN_FENCE);
        addDrop(ModBlocks.OBSIDIAN_FENCE_GATE);
        addDrop(ModBlocks.OBSIDIAN_DOOR, doorDrops(ModBlocks.OBSIDIAN_DOOR));
        addDrop(ModBlocks.OBSIDIAN_SLAB, slabDrops(ModBlocks.OBSIDIAN_SLAB));
        addDrop(ModBlocks.OBSIDIAN_WALL);

        //crying_obsidian
        addDrop(ModBlocks.CRYING_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.CRYING_OBSIDIAN_TRAPDOOR);
        addDrop(ModBlocks.CRYING_OBSIDIAN_BUTTON);
        addDrop(ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE);
        addDrop(ModBlocks.CRYING_OBSIDIAN_FENCE);
        addDrop(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE);
        addDrop(ModBlocks.CRYING_OBSIDIAN_DOOR, doorDrops(ModBlocks.CRYING_OBSIDIAN_DOOR));
        addDrop(ModBlocks.CRYING_OBSIDIAN_SLAB, slabDrops(ModBlocks.CRYING_OBSIDIAN_SLAB));
        addDrop(ModBlocks.CRYING_OBSIDIAN_WALL);

        //crimson_nylium
        addDrop(ModBlocks.CRIMSON_NYLIUM_STAIRS);
        addDrop(ModBlocks.CRIMSON_NYLIUM_TRAPDOOR);
        addDrop(ModBlocks.CRIMSON_NYLIUM_BUTTON);
        addDrop(ModBlocks.CRIMSON_NYLIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.CRIMSON_NYLIUM_FENCE);
        addDrop(ModBlocks.CRIMSON_NYLIUM_FENCE_GATE);
        addDrop(ModBlocks.CRIMSON_NYLIUM_DOOR, doorDrops(ModBlocks.CRIMSON_NYLIUM_DOOR));
        addDrop(ModBlocks.CRIMSON_NYLIUM_SLAB, slabDrops(ModBlocks.CRIMSON_NYLIUM_SLAB));
        addDrop(ModBlocks.CRIMSON_NYLIUM_WALL);

        //warped_nylium
        addDrop(ModBlocks.WARPED_NYLIUM_STAIRS);
        addDrop(ModBlocks.WARPED_NYLIUM_TRAPDOOR);
        addDrop(ModBlocks.WARPED_NYLIUM_BUTTON);
        addDrop(ModBlocks.WARPED_NYLIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.WARPED_NYLIUM_FENCE);
        addDrop(ModBlocks.WARPED_NYLIUM_FENCE_GATE);
        addDrop(ModBlocks.WARPED_NYLIUM_DOOR, doorDrops(ModBlocks.WARPED_NYLIUM_DOOR));
        addDrop(ModBlocks.WARPED_NYLIUM_SLAB, slabDrops(ModBlocks.WARPED_NYLIUM_SLAB));
        addDrop(ModBlocks.WARPED_NYLIUM_WALL);

        //soul_sand
        addDrop(ModBlocks.SOUL_SAND_STAIRS);
        addDrop(ModBlocks.SOUL_SAND_TRAPDOOR);
        addDrop(ModBlocks.SOUL_SAND_BUTTON);
        addDrop(ModBlocks.SOUL_SAND_PRESSURE_PLATE);
        addDrop(ModBlocks.SOUL_SAND_FENCE);
        addDrop(ModBlocks.SOUL_SAND_FENCE_GATE);
        addDrop(ModBlocks.SOUL_SAND_DOOR, doorDrops(ModBlocks.SOUL_SAND_DOOR));
        addDrop(ModBlocks.SOUL_SAND_SLAB, slabDrops(ModBlocks.SOUL_SAND_SLAB));
        addDrop(ModBlocks.SOUL_SAND_WALL);

        //soul_soil
        addDrop(ModBlocks.SOUL_SOIL_STAIRS);
        addDrop(ModBlocks.SOUL_SOIL_TRAPDOOR);
        addDrop(ModBlocks.SOUL_SOIL_BUTTON);
        addDrop(ModBlocks.SOUL_SOIL_PRESSURE_PLATE);
        addDrop(ModBlocks.SOUL_SOIL_FENCE);
        addDrop(ModBlocks.SOUL_SOIL_FENCE_GATE);
        addDrop(ModBlocks.SOUL_SOIL_DOOR, doorDrops(ModBlocks.SOUL_SOIL_DOOR));
        addDrop(ModBlocks.SOUL_SOIL_SLAB, slabDrops(ModBlocks.SOUL_SOIL_SLAB));
        addDrop(ModBlocks.SOUL_SOIL_WALL);

        //bone
        addDrop(ModBlocks.BONE_STAIRS);
        addDrop(ModBlocks.BONE_TRAPDOOR);
        addDrop(ModBlocks.BONE_BUTTON);
        addDrop(ModBlocks.BONE_PRESSURE_PLATE);
        addDrop(ModBlocks.BONE_FENCE);
        addDrop(ModBlocks.BONE_FENCE_GATE);
        addDrop(ModBlocks.BONE_DOOR, doorDrops(ModBlocks.BONE_DOOR));
        addDrop(ModBlocks.BONE_SLAB, slabDrops(ModBlocks.BONE_SLAB));
        addDrop(ModBlocks.BONE_WALL);

        //coal_ore
        addDrop(ModBlocks.COAL_ORE_STAIRS);
        addDrop(ModBlocks.COAL_ORE_TRAPDOOR);
        addDrop(ModBlocks.COAL_ORE_BUTTON);
        addDrop(ModBlocks.COAL_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.COAL_ORE_FENCE);
        addDrop(ModBlocks.COAL_ORE_FENCE_GATE);
        addDrop(ModBlocks.COAL_ORE_DOOR, doorDrops(ModBlocks.COAL_ORE_DOOR));
        addDrop(ModBlocks.COAL_ORE_SLAB, slabDrops(ModBlocks.COAL_ORE_SLAB));
        addDrop(ModBlocks.COAL_ORE_WALL);

        //deepslate_coal_ore
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_COAL_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_COAL_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_COAL_ORE_WALL);

        //iron_ore
        addDrop(ModBlocks.IRON_ORE_STAIRS);
        addDrop(ModBlocks.IRON_ORE_TRAPDOOR);
        addDrop(ModBlocks.IRON_ORE_BUTTON);
        addDrop(ModBlocks.IRON_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.IRON_ORE_FENCE);
        addDrop(ModBlocks.IRON_ORE_FENCE_GATE);
        addDrop(ModBlocks.IRON_ORE_DOOR, doorDrops(ModBlocks.IRON_ORE_DOOR));
        addDrop(ModBlocks.IRON_ORE_SLAB, slabDrops(ModBlocks.IRON_ORE_SLAB));
        addDrop(ModBlocks.IRON_ORE_WALL);

        //deepslate_iron_ore
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_IRON_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_IRON_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_IRON_ORE_WALL);

        //copper_ore
        addDrop(ModBlocks.COPPER_ORE_STAIRS);
        addDrop(ModBlocks.COPPER_ORE_TRAPDOOR);
        addDrop(ModBlocks.COPPER_ORE_BUTTON);
        addDrop(ModBlocks.COPPER_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.COPPER_ORE_FENCE);
        addDrop(ModBlocks.COPPER_ORE_FENCE_GATE);
        addDrop(ModBlocks.COPPER_ORE_DOOR, doorDrops(ModBlocks.COPPER_ORE_DOOR));
        addDrop(ModBlocks.COPPER_ORE_SLAB, slabDrops(ModBlocks.COPPER_ORE_SLAB));
        addDrop(ModBlocks.COPPER_ORE_WALL);

        //deepslate_copper_ore
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_COPPER_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_COPPER_ORE_WALL);

        //gold_ore
        addDrop(ModBlocks.GOLD_ORE_STAIRS);
        addDrop(ModBlocks.GOLD_ORE_TRAPDOOR);
        addDrop(ModBlocks.GOLD_ORE_BUTTON);
        addDrop(ModBlocks.GOLD_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.GOLD_ORE_FENCE);
        addDrop(ModBlocks.GOLD_ORE_FENCE_GATE);
        addDrop(ModBlocks.GOLD_ORE_DOOR, doorDrops(ModBlocks.GOLD_ORE_DOOR));
        addDrop(ModBlocks.GOLD_ORE_SLAB, slabDrops(ModBlocks.GOLD_ORE_SLAB));
        addDrop(ModBlocks.GOLD_ORE_WALL);

        //deepslate_gold_ore
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_GOLD_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_GOLD_ORE_WALL);

        //redstone_ore
        addDrop(ModBlocks.REDSTONE_ORE_STAIRS);
        addDrop(ModBlocks.REDSTONE_ORE_TRAPDOOR);
        addDrop(ModBlocks.REDSTONE_ORE_BUTTON);
        addDrop(ModBlocks.REDSTONE_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.REDSTONE_ORE_FENCE);
        addDrop(ModBlocks.REDSTONE_ORE_FENCE_GATE);
        addDrop(ModBlocks.REDSTONE_ORE_DOOR, doorDrops(ModBlocks.REDSTONE_ORE_DOOR));
        addDrop(ModBlocks.REDSTONE_ORE_SLAB, slabDrops(ModBlocks.REDSTONE_ORE_SLAB));
        addDrop(ModBlocks.REDSTONE_ORE_WALL);

        //deepslate_redstone_ore
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_REDSTONE_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_ORE_WALL);

        //emerald_ore
        addDrop(ModBlocks.EMERALD_ORE_STAIRS);
        addDrop(ModBlocks.EMERALD_ORE_TRAPDOOR);
        addDrop(ModBlocks.EMERALD_ORE_BUTTON);
        addDrop(ModBlocks.EMERALD_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.EMERALD_ORE_FENCE);
        addDrop(ModBlocks.EMERALD_ORE_FENCE_GATE);
        addDrop(ModBlocks.EMERALD_ORE_DOOR, doorDrops(ModBlocks.EMERALD_ORE_DOOR));
        addDrop(ModBlocks.EMERALD_ORE_SLAB, slabDrops(ModBlocks.EMERALD_ORE_SLAB));
        addDrop(ModBlocks.EMERALD_ORE_WALL);

        //deepslate_emerald_ore
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_EMERALD_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_EMERALD_ORE_WALL);

        //lapis_ore
        addDrop(ModBlocks.LAPIS_ORE_STAIRS);
        addDrop(ModBlocks.LAPIS_ORE_TRAPDOOR);
        addDrop(ModBlocks.LAPIS_ORE_BUTTON);
        addDrop(ModBlocks.LAPIS_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.LAPIS_ORE_FENCE);
        addDrop(ModBlocks.LAPIS_ORE_FENCE_GATE);
        addDrop(ModBlocks.LAPIS_ORE_DOOR, doorDrops(ModBlocks.LAPIS_ORE_DOOR));
        addDrop(ModBlocks.LAPIS_ORE_SLAB, slabDrops(ModBlocks.LAPIS_ORE_SLAB));
        addDrop(ModBlocks.LAPIS_ORE_WALL);

        //deepslate_lapis_ore
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_LAPIS_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_LAPIS_ORE_WALL);

        //diamond_ore
        addDrop(ModBlocks.DIAMOND_ORE_STAIRS);
        addDrop(ModBlocks.DIAMOND_ORE_TRAPDOOR);
        addDrop(ModBlocks.DIAMOND_ORE_BUTTON);
        addDrop(ModBlocks.DIAMOND_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DIAMOND_ORE_FENCE);
        addDrop(ModBlocks.DIAMOND_ORE_FENCE_GATE);
        addDrop(ModBlocks.DIAMOND_ORE_DOOR, doorDrops(ModBlocks.DIAMOND_ORE_DOOR));
        addDrop(ModBlocks.DIAMOND_ORE_SLAB, slabDrops(ModBlocks.DIAMOND_ORE_SLAB));
        addDrop(ModBlocks.DIAMOND_ORE_WALL);

        //deepslate_diamond_ore
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_TRAPDOOR);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE_GATE);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_DOOR, doorDrops(ModBlocks.DEEPSLATE_DIAMOND_ORE_DOOR));
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, slabDrops(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_ORE_WALL);

        //nether_gold_ore
        addDrop(ModBlocks.NETHER_GOLD_ORE_STAIRS);
        addDrop(ModBlocks.NETHER_GOLD_ORE_TRAPDOOR);
        addDrop(ModBlocks.NETHER_GOLD_ORE_BUTTON);
        addDrop(ModBlocks.NETHER_GOLD_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHER_GOLD_ORE_FENCE);
        addDrop(ModBlocks.NETHER_GOLD_ORE_FENCE_GATE);
        addDrop(ModBlocks.NETHER_GOLD_ORE_DOOR, doorDrops(ModBlocks.NETHER_GOLD_ORE_DOOR));
        addDrop(ModBlocks.NETHER_GOLD_ORE_SLAB, slabDrops(ModBlocks.NETHER_GOLD_ORE_SLAB));
        addDrop(ModBlocks.NETHER_GOLD_ORE_WALL);

        //nether_quartz_ore
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_STAIRS);
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_TRAPDOOR);
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_BUTTON);
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_FENCE);
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_FENCE_GATE);
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_DOOR, doorDrops(ModBlocks.NETHER_QUARTZ_ORE_DOOR));
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_SLAB, slabDrops(ModBlocks.NETHER_QUARTZ_ORE_SLAB));
        addDrop(ModBlocks.NETHER_QUARTZ_ORE_WALL);

        //ancient_debris
        addDrop(ModBlocks.ANCIENT_DEBRIS_STAIRS);
        addDrop(ModBlocks.ANCIENT_DEBRIS_TRAPDOOR);
        addDrop(ModBlocks.ANCIENT_DEBRIS_BUTTON);
        addDrop(ModBlocks.ANCIENT_DEBRIS_PRESSURE_PLATE);
        addDrop(ModBlocks.ANCIENT_DEBRIS_FENCE);
        addDrop(ModBlocks.ANCIENT_DEBRIS_FENCE_GATE);
        addDrop(ModBlocks.ANCIENT_DEBRIS_DOOR, doorDrops(ModBlocks.ANCIENT_DEBRIS_DOOR));
        addDrop(ModBlocks.ANCIENT_DEBRIS_SLAB, slabDrops(ModBlocks.ANCIENT_DEBRIS_SLAB));
        addDrop(ModBlocks.ANCIENT_DEBRIS_WALL);

        //raw_iron_block
        addDrop(ModBlocks.RAW_IRON_STAIRS);
        addDrop(ModBlocks.RAW_IRON_TRAPDOOR);
        addDrop(ModBlocks.RAW_IRON_BUTTON);
        addDrop(ModBlocks.RAW_IRON_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_IRON_FENCE);
        addDrop(ModBlocks.RAW_IRON_FENCE_GATE);
        addDrop(ModBlocks.RAW_IRON_DOOR, doorDrops(ModBlocks.RAW_IRON_DOOR));
        addDrop(ModBlocks.RAW_IRON_SLAB, slabDrops(ModBlocks.RAW_IRON_SLAB));
        addDrop(ModBlocks.RAW_IRON_WALL);

        //raw_copper_block
        addDrop(ModBlocks.RAW_COPPER_STAIRS);
        addDrop(ModBlocks.RAW_COPPER_TRAPDOOR);
        addDrop(ModBlocks.RAW_COPPER_BUTTON);
        addDrop(ModBlocks.RAW_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_COPPER_FENCE);
        addDrop(ModBlocks.RAW_COPPER_FENCE_GATE);
        addDrop(ModBlocks.RAW_COPPER_DOOR, doorDrops(ModBlocks.RAW_COPPER_DOOR));
        addDrop(ModBlocks.RAW_COPPER_SLAB, slabDrops(ModBlocks.RAW_COPPER_SLAB));
        addDrop(ModBlocks.RAW_COPPER_WALL);

        //raw_gold_block
        addDrop(ModBlocks.RAW_GOLD_STAIRS);
        addDrop(ModBlocks.RAW_GOLD_TRAPDOOR);
        addDrop(ModBlocks.RAW_GOLD_BUTTON);
        addDrop(ModBlocks.RAW_GOLD_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_GOLD_FENCE);
        addDrop(ModBlocks.RAW_GOLD_FENCE_GATE);
        addDrop(ModBlocks.RAW_GOLD_DOOR, doorDrops(ModBlocks.RAW_GOLD_DOOR));
        addDrop(ModBlocks.RAW_GOLD_SLAB, slabDrops(ModBlocks.RAW_GOLD_SLAB));
        addDrop(ModBlocks.RAW_GOLD_WALL);

        //glowstone_block
        addDrop(ModBlocks.GLOWSTONE_STAIRS);
        addDrop(ModBlocks.GLOWSTONE_TRAPDOOR);
        addDrop(ModBlocks.GLOWSTONE_BUTTON);
        addDrop(ModBlocks.GLOWSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.GLOWSTONE_FENCE);
        addDrop(ModBlocks.GLOWSTONE_FENCE_GATE);
        addDrop(ModBlocks.GLOWSTONE_DOOR, doorDrops(ModBlocks.GLOWSTONE_DOOR));
        addDrop(ModBlocks.GLOWSTONE_SLAB, slabDrops(ModBlocks.GLOWSTONE_SLAB));
        addDrop(ModBlocks.GLOWSTONE_WALL);

        //oak_leaves_block
        addDrop(ModBlocks.OAK_LEAVES_STAIRS);
        addDrop(ModBlocks.OAK_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.OAK_LEAVES_BUTTON);
        addDrop(ModBlocks.OAK_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.OAK_LEAVES_FENCE);
        addDrop(ModBlocks.OAK_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.OAK_LEAVES_DOOR, doorDrops(ModBlocks.OAK_LEAVES_DOOR));
        addDrop(ModBlocks.OAK_LEAVES_SLAB, slabDrops(ModBlocks.OAK_LEAVES_SLAB));
        addDrop(ModBlocks.OAK_LEAVES_WALL);

        //spruce_leaves_block
        addDrop(ModBlocks.SPRUCE_LEAVES_STAIRS);
        addDrop(ModBlocks.SPRUCE_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.SPRUCE_LEAVES_BUTTON);
        addDrop(ModBlocks.SPRUCE_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.SPRUCE_LEAVES_FENCE);
        addDrop(ModBlocks.SPRUCE_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.SPRUCE_LEAVES_DOOR, doorDrops(ModBlocks.SPRUCE_LEAVES_DOOR));
        addDrop(ModBlocks.SPRUCE_LEAVES_SLAB, slabDrops(ModBlocks.SPRUCE_LEAVES_SLAB));
        addDrop(ModBlocks.SPRUCE_LEAVES_WALL);

        //birch_leaves_block
        addDrop(ModBlocks.BIRCH_LEAVES_STAIRS);
        addDrop(ModBlocks.BIRCH_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.BIRCH_LEAVES_BUTTON);
        addDrop(ModBlocks.BIRCH_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.BIRCH_LEAVES_FENCE);
        addDrop(ModBlocks.BIRCH_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.BIRCH_LEAVES_DOOR, doorDrops(ModBlocks.BIRCH_LEAVES_DOOR));
        addDrop(ModBlocks.BIRCH_LEAVES_SLAB, slabDrops(ModBlocks.BIRCH_LEAVES_SLAB));
        addDrop(ModBlocks.BIRCH_LEAVES_WALL);

        //jungle_leaves_block
        addDrop(ModBlocks.JUNGLE_LEAVES_STAIRS);
        addDrop(ModBlocks.JUNGLE_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.JUNGLE_LEAVES_BUTTON);
        addDrop(ModBlocks.JUNGLE_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.JUNGLE_LEAVES_FENCE);
        addDrop(ModBlocks.JUNGLE_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.JUNGLE_LEAVES_DOOR, doorDrops(ModBlocks.JUNGLE_LEAVES_DOOR));
        addDrop(ModBlocks.JUNGLE_LEAVES_SLAB, slabDrops(ModBlocks.JUNGLE_LEAVES_SLAB));
        addDrop(ModBlocks.JUNGLE_LEAVES_WALL);

        //acacia_leaves_block
        addDrop(ModBlocks.ACACIA_LEAVES_STAIRS);
        addDrop(ModBlocks.ACACIA_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.ACACIA_LEAVES_BUTTON);
        addDrop(ModBlocks.ACACIA_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.ACACIA_LEAVES_FENCE);
        addDrop(ModBlocks.ACACIA_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.ACACIA_LEAVES_DOOR, doorDrops(ModBlocks.ACACIA_LEAVES_DOOR));
        addDrop(ModBlocks.ACACIA_LEAVES_SLAB, slabDrops(ModBlocks.ACACIA_LEAVES_SLAB));
        addDrop(ModBlocks.ACACIA_LEAVES_WALL);

        //dark_oak_leaves_block
        addDrop(ModBlocks.DARK_OAK_LEAVES_STAIRS);
        addDrop(ModBlocks.DARK_OAK_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.DARK_OAK_LEAVES_BUTTON);
        addDrop(ModBlocks.DARK_OAK_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_OAK_LEAVES_FENCE);
        addDrop(ModBlocks.DARK_OAK_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.DARK_OAK_LEAVES_DOOR, doorDrops(ModBlocks.DARK_OAK_LEAVES_DOOR));
        addDrop(ModBlocks.DARK_OAK_LEAVES_SLAB, slabDrops(ModBlocks.DARK_OAK_LEAVES_SLAB));
        addDrop(ModBlocks.DARK_OAK_LEAVES_WALL);

        //mangrove_leaves_block
        addDrop(ModBlocks.MANGROVE_LEAVES_STAIRS);
        addDrop(ModBlocks.MANGROVE_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.MANGROVE_LEAVES_BUTTON);
        addDrop(ModBlocks.MANGROVE_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.MANGROVE_LEAVES_FENCE);
        addDrop(ModBlocks.MANGROVE_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.MANGROVE_LEAVES_DOOR, doorDrops(ModBlocks.MANGROVE_LEAVES_DOOR));
        addDrop(ModBlocks.MANGROVE_LEAVES_SLAB, slabDrops(ModBlocks.MANGROVE_LEAVES_SLAB));
        addDrop(ModBlocks.MANGROVE_LEAVES_WALL);

        //cherry_leaves_block
        addDrop(ModBlocks.CHERRY_LEAVES_STAIRS);
        addDrop(ModBlocks.CHERRY_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.CHERRY_LEAVES_BUTTON);
        addDrop(ModBlocks.CHERRY_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.CHERRY_LEAVES_FENCE);
        addDrop(ModBlocks.CHERRY_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.CHERRY_LEAVES_DOOR, doorDrops(ModBlocks.CHERRY_LEAVES_DOOR));
        addDrop(ModBlocks.CHERRY_LEAVES_SLAB, slabDrops(ModBlocks.CHERRY_LEAVES_SLAB));
        addDrop(ModBlocks.CHERRY_LEAVES_WALL);

        //azalea_leaves_block
        addDrop(ModBlocks.AZALEA_LEAVES_STAIRS);
        addDrop(ModBlocks.AZALEA_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.AZALEA_LEAVES_BUTTON);
        addDrop(ModBlocks.AZALEA_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.AZALEA_LEAVES_FENCE);
        addDrop(ModBlocks.AZALEA_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.AZALEA_LEAVES_DOOR, doorDrops(ModBlocks.AZALEA_LEAVES_DOOR));
        addDrop(ModBlocks.AZALEA_LEAVES_SLAB, slabDrops(ModBlocks.AZALEA_LEAVES_SLAB));
        addDrop(ModBlocks.AZALEA_LEAVES_WALL);

        //flowering_azalea_leaves_block
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_STAIRS);
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_TRAPDOOR);
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_BUTTON);
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE);
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE);
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE_GATE);
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_DOOR, doorDrops(ModBlocks.FLOWERING_AZALEA_LEAVES_DOOR));
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB, slabDrops(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB));
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAVES_WALL);

        //brown_mushroom_block
        addDrop(ModBlocks.BROWN_MUSHROOM_STAIRS);
        addDrop(ModBlocks.BROWN_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.BROWN_MUSHROOM_BUTTON);
        addDrop(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_MUSHROOM_FENCE);
        addDrop(ModBlocks.BROWN_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.BROWN_MUSHROOM_DOOR, doorDrops(ModBlocks.BROWN_MUSHROOM_DOOR));
        addDrop(ModBlocks.BROWN_MUSHROOM_SLAB, slabDrops(ModBlocks.BROWN_MUSHROOM_SLAB));
        addDrop(ModBlocks.BROWN_MUSHROOM_WALL);

        //red_mushroom_block
        addDrop(ModBlocks.RED_MUSHROOM_STAIRS);
        addDrop(ModBlocks.RED_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.RED_MUSHROOM_BUTTON);
        addDrop(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_MUSHROOM_FENCE);
        addDrop(ModBlocks.RED_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.RED_MUSHROOM_DOOR, doorDrops(ModBlocks.RED_MUSHROOM_DOOR));
        addDrop(ModBlocks.RED_MUSHROOM_SLAB, slabDrops(ModBlocks.RED_MUSHROOM_SLAB));
        addDrop(ModBlocks.RED_MUSHROOM_WALL);

        //nether_wart_block
        addDrop(ModBlocks.NETHER_WART_STAIRS);
        addDrop(ModBlocks.NETHER_WART_TRAPDOOR);
        addDrop(ModBlocks.NETHER_WART_BUTTON);
        addDrop(ModBlocks.NETHER_WART_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHER_WART_FENCE);
        addDrop(ModBlocks.NETHER_WART_FENCE_GATE);
        addDrop(ModBlocks.NETHER_WART_DOOR, doorDrops(ModBlocks.NETHER_WART_DOOR));
        addDrop(ModBlocks.NETHER_WART_SLAB, slabDrops(ModBlocks.NETHER_WART_SLAB));
        addDrop(ModBlocks.NETHER_WART_WALL);

        //warped_wart_block
        addDrop(ModBlocks.WARPED_WART_STAIRS);
        addDrop(ModBlocks.WARPED_WART_TRAPDOOR);
        addDrop(ModBlocks.WARPED_WART_BUTTON);
        addDrop(ModBlocks.WARPED_WART_PRESSURE_PLATE);
        addDrop(ModBlocks.WARPED_WART_FENCE);
        addDrop(ModBlocks.WARPED_WART_FENCE_GATE);
        addDrop(ModBlocks.WARPED_WART_DOOR, doorDrops(ModBlocks.WARPED_WART_DOOR));
        addDrop(ModBlocks.WARPED_WART_SLAB, slabDrops(ModBlocks.WARPED_WART_SLAB));
        addDrop(ModBlocks.WARPED_WART_WALL);

        //shroomlight_block
        addDrop(ModBlocks.SHROOMLIGHT_STAIRS);
        addDrop(ModBlocks.SHROOMLIGHT_TRAPDOOR);
        addDrop(ModBlocks.SHROOMLIGHT_BUTTON);
        addDrop(ModBlocks.SHROOMLIGHT_PRESSURE_PLATE);
        addDrop(ModBlocks.SHROOMLIGHT_FENCE);
        addDrop(ModBlocks.SHROOMLIGHT_FENCE_GATE);
        addDrop(ModBlocks.SHROOMLIGHT_DOOR, doorDrops(ModBlocks.SHROOMLIGHT_DOOR));
        addDrop(ModBlocks.SHROOMLIGHT_SLAB, slabDrops(ModBlocks.SHROOMLIGHT_SLAB));
        addDrop(ModBlocks.SHROOMLIGHT_WALL);

        //dried_kelp_block
        addDrop(ModBlocks.DRIED_KELP_STAIRS);
        addDrop(ModBlocks.DRIED_KELP_TRAPDOOR);
        addDrop(ModBlocks.DRIED_KELP_BUTTON);
        addDrop(ModBlocks.DRIED_KELP_PRESSURE_PLATE);
        addDrop(ModBlocks.DRIED_KELP_FENCE);
        addDrop(ModBlocks.DRIED_KELP_FENCE_GATE);
        addDrop(ModBlocks.DRIED_KELP_DOOR, doorDrops(ModBlocks.DRIED_KELP_DOOR));
        addDrop(ModBlocks.DRIED_KELP_SLAB, slabDrops(ModBlocks.DRIED_KELP_SLAB));
        addDrop(ModBlocks.DRIED_KELP_WALL);

        //TUBE_CORAL_block
        addDrop(ModBlocks.TUBE_CORAL_STAIRS);
        addDrop(ModBlocks.TUBE_CORAL_TRAPDOOR);
        addDrop(ModBlocks.TUBE_CORAL_BUTTON);
        addDrop(ModBlocks.TUBE_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.TUBE_CORAL_FENCE);
        addDrop(ModBlocks.TUBE_CORAL_FENCE_GATE);
        addDrop(ModBlocks.TUBE_CORAL_DOOR, doorDrops(ModBlocks.TUBE_CORAL_DOOR));
        addDrop(ModBlocks.TUBE_CORAL_SLAB, slabDrops(ModBlocks.TUBE_CORAL_SLAB));
        addDrop(ModBlocks.TUBE_CORAL_WALL);

        //DEAD_TUBE_CORAL_block
        addDrop(ModBlocks.DEAD_TUBE_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_TRAPDOOR);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_BUTTON);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_FENCE);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_FENCE_GATE);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_DOOR, doorDrops(ModBlocks.DEAD_TUBE_CORAL_DOOR));
        addDrop(ModBlocks.DEAD_TUBE_CORAL_SLAB, slabDrops(ModBlocks.DEAD_TUBE_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_TUBE_CORAL_WALL);

        //BRAIN_CORAL_block
        addDrop(ModBlocks.BRAIN_CORAL_STAIRS);
        addDrop(ModBlocks.BRAIN_CORAL_TRAPDOOR);
        addDrop(ModBlocks.BRAIN_CORAL_BUTTON);
        addDrop(ModBlocks.BRAIN_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BRAIN_CORAL_FENCE);
        addDrop(ModBlocks.BRAIN_CORAL_FENCE_GATE);
        addDrop(ModBlocks.BRAIN_CORAL_DOOR, doorDrops(ModBlocks.BRAIN_CORAL_DOOR));
        addDrop(ModBlocks.BRAIN_CORAL_SLAB, slabDrops(ModBlocks.BRAIN_CORAL_SLAB));
        addDrop(ModBlocks.BRAIN_CORAL_WALL);

        //DEAD_BRAIN_CORAL_block
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_TRAPDOOR);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_BUTTON);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_FENCE);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_FENCE_GATE);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_DOOR, doorDrops(ModBlocks.DEAD_BRAIN_CORAL_DOOR));
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_SLAB, slabDrops(ModBlocks.DEAD_BRAIN_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_WALL);

        //BUBBLE_CORAL_block
        addDrop(ModBlocks.BUBBLE_CORAL_STAIRS);
        addDrop(ModBlocks.BUBBLE_CORAL_TRAPDOOR);
        addDrop(ModBlocks.BUBBLE_CORAL_BUTTON);
        addDrop(ModBlocks.BUBBLE_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BUBBLE_CORAL_FENCE);
        addDrop(ModBlocks.BUBBLE_CORAL_FENCE_GATE);
        addDrop(ModBlocks.BUBBLE_CORAL_DOOR, doorDrops(ModBlocks.BUBBLE_CORAL_DOOR));
        addDrop(ModBlocks.BUBBLE_CORAL_SLAB, slabDrops(ModBlocks.BUBBLE_CORAL_SLAB));
        addDrop(ModBlocks.BUBBLE_CORAL_WALL);

        //DEAD_BUBBLE_CORAL_block
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_TRAPDOOR);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_BUTTON);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_FENCE);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_FENCE_GATE);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_DOOR, doorDrops(ModBlocks.DEAD_BUBBLE_CORAL_DOOR));
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_SLAB, slabDrops(ModBlocks.DEAD_BUBBLE_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_WALL);

        //FIRE_CORAL_block
        addDrop(ModBlocks.FIRE_CORAL_STAIRS);
        addDrop(ModBlocks.FIRE_CORAL_TRAPDOOR);
        addDrop(ModBlocks.FIRE_CORAL_BUTTON);
        addDrop(ModBlocks.FIRE_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.FIRE_CORAL_FENCE);
        addDrop(ModBlocks.FIRE_CORAL_FENCE_GATE);
        addDrop(ModBlocks.FIRE_CORAL_DOOR, doorDrops(ModBlocks.FIRE_CORAL_DOOR));
        addDrop(ModBlocks.FIRE_CORAL_SLAB, slabDrops(ModBlocks.FIRE_CORAL_SLAB));
        addDrop(ModBlocks.FIRE_CORAL_WALL);

        //DEAD_FIRE_CORAL_block
        addDrop(ModBlocks.DEAD_FIRE_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_TRAPDOOR);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_BUTTON);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_FENCE);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_FENCE_GATE);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_DOOR, doorDrops(ModBlocks.DEAD_FIRE_CORAL_DOOR));
        addDrop(ModBlocks.DEAD_FIRE_CORAL_SLAB, slabDrops(ModBlocks.DEAD_FIRE_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_FIRE_CORAL_WALL);

        //HORN_CORAL_block
        addDrop(ModBlocks.HORN_CORAL_STAIRS);
        addDrop(ModBlocks.HORN_CORAL_TRAPDOOR);
        addDrop(ModBlocks.HORN_CORAL_BUTTON);
        addDrop(ModBlocks.HORN_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.HORN_CORAL_FENCE);
        addDrop(ModBlocks.HORN_CORAL_FENCE_GATE);
        addDrop(ModBlocks.HORN_CORAL_DOOR, doorDrops(ModBlocks.HORN_CORAL_DOOR));
        addDrop(ModBlocks.HORN_CORAL_SLAB, slabDrops(ModBlocks.HORN_CORAL_SLAB));
        addDrop(ModBlocks.HORN_CORAL_WALL);

        //DEAD_HORN_CORAL_block
        addDrop(ModBlocks.DEAD_HORN_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_HORN_CORAL_TRAPDOOR);
        addDrop(ModBlocks.DEAD_HORN_CORAL_BUTTON);
        addDrop(ModBlocks.DEAD_HORN_CORAL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEAD_HORN_CORAL_FENCE);
        addDrop(ModBlocks.DEAD_HORN_CORAL_FENCE_GATE);
        addDrop(ModBlocks.DEAD_HORN_CORAL_DOOR, doorDrops(ModBlocks.DEAD_HORN_CORAL_DOOR));
        addDrop(ModBlocks.DEAD_HORN_CORAL_SLAB, slabDrops(ModBlocks.DEAD_HORN_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_HORN_CORAL_WALL);

        //sponge_block
        addDrop(ModBlocks.SPONGE_STAIRS);
        addDrop(ModBlocks.SPONGE_TRAPDOOR);
        addDrop(ModBlocks.SPONGE_BUTTON);
        addDrop(ModBlocks.SPONGE_PRESSURE_PLATE);
        addDrop(ModBlocks.SPONGE_FENCE);
        addDrop(ModBlocks.SPONGE_FENCE_GATE);
        addDrop(ModBlocks.SPONGE_DOOR, doorDrops(ModBlocks.SPONGE_DOOR));
        addDrop(ModBlocks.SPONGE_SLAB, slabDrops(ModBlocks.SPONGE_SLAB));
        addDrop(ModBlocks.SPONGE_WALL);

        //wet_sponge_block
        addDrop(ModBlocks.WET_SPONGE_STAIRS);
        addDrop(ModBlocks.WET_SPONGE_TRAPDOOR);
        addDrop(ModBlocks.WET_SPONGE_BUTTON);
        addDrop(ModBlocks.WET_SPONGE_PRESSURE_PLATE);
        addDrop(ModBlocks.WET_SPONGE_FENCE);
        addDrop(ModBlocks.WET_SPONGE_FENCE_GATE);
        addDrop(ModBlocks.WET_SPONGE_DOOR, doorDrops(ModBlocks.WET_SPONGE_DOOR));
        addDrop(ModBlocks.WET_SPONGE_SLAB, slabDrops(ModBlocks.WET_SPONGE_SLAB));
        addDrop(ModBlocks.WET_SPONGE_WALL);

        //melon_block
        addDrop(ModBlocks.MELON_STAIRS);
        addDrop(ModBlocks.MELON_TRAPDOOR);
        addDrop(ModBlocks.MELON_BUTTON);
        addDrop(ModBlocks.MELON_PRESSURE_PLATE);
        addDrop(ModBlocks.MELON_FENCE);
        addDrop(ModBlocks.MELON_FENCE_GATE);
        addDrop(ModBlocks.MELON_DOOR, doorDrops(ModBlocks.MELON_DOOR));
        addDrop(ModBlocks.MELON_SLAB, slabDrops(ModBlocks.MELON_SLAB));
        addDrop(ModBlocks.MELON_WALL);

        //pumpkin_block
        addDrop(ModBlocks.PUMPKIN_STAIRS);
        addDrop(ModBlocks.PUMPKIN_TRAPDOOR);
        addDrop(ModBlocks.PUMPKIN_BUTTON);
        addDrop(ModBlocks.PUMPKIN_PRESSURE_PLATE);
        addDrop(ModBlocks.PUMPKIN_FENCE);
        addDrop(ModBlocks.PUMPKIN_FENCE_GATE);
        addDrop(ModBlocks.PUMPKIN_DOOR, doorDrops(ModBlocks.PUMPKIN_DOOR));
        addDrop(ModBlocks.PUMPKIN_SLAB, slabDrops(ModBlocks.PUMPKIN_SLAB));
        addDrop(ModBlocks.PUMPKIN_WALL);

        //hay_block_block
        addDrop(ModBlocks.HAY_BLOCK_STAIRS);
        addDrop(ModBlocks.HAY_BLOCK_TRAPDOOR);
        addDrop(ModBlocks.HAY_BLOCK_BUTTON);
        addDrop(ModBlocks.HAY_BLOCK_PRESSURE_PLATE);
        addDrop(ModBlocks.HAY_BLOCK_FENCE);
        addDrop(ModBlocks.HAY_BLOCK_FENCE_GATE);
        addDrop(ModBlocks.HAY_BLOCK_DOOR, doorDrops(ModBlocks.HAY_BLOCK_DOOR));
        addDrop(ModBlocks.HAY_BLOCK_SLAB, slabDrops(ModBlocks.HAY_BLOCK_SLAB));
        addDrop(ModBlocks.HAY_BLOCK_WALL);

        //honeycomb_block
        addDrop(ModBlocks.HONEYCOMB_STAIRS);
        addDrop(ModBlocks.HONEYCOMB_TRAPDOOR);
        addDrop(ModBlocks.HONEYCOMB_BUTTON);
        addDrop(ModBlocks.HONEYCOMB_PRESSURE_PLATE);
        addDrop(ModBlocks.HONEYCOMB_FENCE);
        addDrop(ModBlocks.HONEYCOMB_FENCE_GATE);
        addDrop(ModBlocks.HONEYCOMB_DOOR, doorDrops(ModBlocks.HONEYCOMB_DOOR));
        addDrop(ModBlocks.HONEYCOMB_SLAB, slabDrops(ModBlocks.HONEYCOMB_SLAB));
        addDrop(ModBlocks.HONEYCOMB_WALL);

        //SLIME_block
        addDrop(ModBlocks.SLIME_STAIRS);
        addDrop(ModBlocks.SLIME_TRAPDOOR);
        addDrop(ModBlocks.SLIME_BUTTON);
        addDrop(ModBlocks.SLIME_PRESSURE_PLATE);
        addDrop(ModBlocks.SLIME_FENCE);
        addDrop(ModBlocks.SLIME_FENCE_GATE);
        addDrop(ModBlocks.SLIME_DOOR, doorDrops(ModBlocks.SLIME_DOOR));
        addDrop(ModBlocks.SLIME_SLAB, slabDrops(ModBlocks.SLIME_SLAB));
        addDrop(ModBlocks.SLIME_WALL);

        //HONEY_block
        addDrop(ModBlocks.HONEY_STAIRS);
        addDrop(ModBlocks.HONEY_TRAPDOOR);
        addDrop(ModBlocks.HONEY_BUTTON);
        addDrop(ModBlocks.HONEY_PRESSURE_PLATE);
        addDrop(ModBlocks.HONEY_FENCE);
        addDrop(ModBlocks.HONEY_FENCE_GATE);
        addDrop(ModBlocks.HONEY_DOOR, doorDrops(ModBlocks.HONEY_DOOR));
        addDrop(ModBlocks.HONEY_SLAB, slabDrops(ModBlocks.HONEY_SLAB));
        addDrop(ModBlocks.HONEY_WALL);

        //OCHRE_FROGLIGHT_block
        addDrop(ModBlocks.OCHRE_FROGLIGHT_STAIRS);
        addDrop(ModBlocks.OCHRE_FROGLIGHT_TRAPDOOR);
        addDrop(ModBlocks.OCHRE_FROGLIGHT_BUTTON);
        addDrop(ModBlocks.OCHRE_FROGLIGHT_PRESSURE_PLATE);
        addDrop(ModBlocks.OCHRE_FROGLIGHT_FENCE);
        addDrop(ModBlocks.OCHRE_FROGLIGHT_FENCE_GATE);
        addDrop(ModBlocks.OCHRE_FROGLIGHT_DOOR, doorDrops(ModBlocks.OCHRE_FROGLIGHT_DOOR));
        addDrop(ModBlocks.OCHRE_FROGLIGHT_SLAB, slabDrops(ModBlocks.OCHRE_FROGLIGHT_SLAB));
        addDrop(ModBlocks.OCHRE_FROGLIGHT_WALL);

        //VERDANT_FROGLIGHT_block
        addDrop(ModBlocks.VERDANT_FROGLIGHT_STAIRS);
        addDrop(ModBlocks.VERDANT_FROGLIGHT_TRAPDOOR);
        addDrop(ModBlocks.VERDANT_FROGLIGHT_BUTTON);
        addDrop(ModBlocks.VERDANT_FROGLIGHT_PRESSURE_PLATE);
        addDrop(ModBlocks.VERDANT_FROGLIGHT_FENCE);
        addDrop(ModBlocks.VERDANT_FROGLIGHT_FENCE_GATE);
        addDrop(ModBlocks.VERDANT_FROGLIGHT_DOOR, doorDrops(ModBlocks.VERDANT_FROGLIGHT_DOOR));
        addDrop(ModBlocks.VERDANT_FROGLIGHT_SLAB, slabDrops(ModBlocks.VERDANT_FROGLIGHT_SLAB));
        addDrop(ModBlocks.VERDANT_FROGLIGHT_WALL);

        //PEARLESCENT_FROGLIGHT_block
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_STAIRS);
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_TRAPDOOR);
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_BUTTON);
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_PRESSURE_PLATE);
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_FENCE);
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_FENCE_GATE);
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_DOOR, doorDrops(ModBlocks.PEARLESCENT_FROGLIGHT_DOOR));
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_SLAB, slabDrops(ModBlocks.PEARLESCENT_FROGLIGHT_SLAB));
        addDrop(ModBlocks.PEARLESCENT_FROGLIGHT_WALL);

        //SCULK_block
        addDrop(ModBlocks.SCULK_STAIRS);
        addDrop(ModBlocks.SCULK_TRAPDOOR);
        addDrop(ModBlocks.SCULK_BUTTON);
        addDrop(ModBlocks.SCULK_PRESSURE_PLATE);
        addDrop(ModBlocks.SCULK_FENCE);
        addDrop(ModBlocks.SCULK_FENCE_GATE);
        addDrop(ModBlocks.SCULK_DOOR, doorDrops(ModBlocks.SCULK_DOOR));
        addDrop(ModBlocks.SCULK_SLAB, slabDrops(ModBlocks.SCULK_SLAB));
        addDrop(ModBlocks.SCULK_WALL);

        //BEDROCK_block
        addDrop(ModBlocks.BEDROCK_STAIRS);
        addDrop(ModBlocks.BEDROCK_TRAPDOOR);
        addDrop(ModBlocks.BEDROCK_BUTTON);
        addDrop(ModBlocks.BEDROCK_PRESSURE_PLATE);
        addDrop(ModBlocks.BEDROCK_FENCE);
        addDrop(ModBlocks.BEDROCK_FENCE_GATE);
        addDrop(ModBlocks.BEDROCK_DOOR, doorDrops(ModBlocks.BEDROCK_DOOR));
        addDrop(ModBlocks.BEDROCK_SLAB, slabDrops(ModBlocks.BEDROCK_SLAB));
        addDrop(ModBlocks.BEDROCK_WALL);

        //target_block
        addDrop(ModBlocks.TARGET_STAIRS);
        addDrop(ModBlocks.TARGET_TRAPDOOR);
        addDrop(ModBlocks.TARGET_BUTTON);
        addDrop(ModBlocks.TARGET_PRESSURE_PLATE);
        addDrop(ModBlocks.TARGET_FENCE);
        addDrop(ModBlocks.TARGET_FENCE_GATE);
        addDrop(ModBlocks.TARGET_DOOR, doorDrops(ModBlocks.TARGET_DOOR));
        addDrop(ModBlocks.TARGET_SLAB, slabDrops(ModBlocks.TARGET_SLAB));
        addDrop(ModBlocks.TARGET_WALL);

        //chiseled_copper_block
        addDrop(ModBlocks.CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.CHISELED_COPPER_DOOR, doorDrops(ModBlocks.CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.CHISELED_COPPER_SLAB, slabDrops(ModBlocks.CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.CHISELED_COPPER_WALL);

        //exposed_chiseled_copper_block
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.EXPOSED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.EXPOSED_CHISELED_COPPER_WALL);

        //weathered_chiseled_copper_block
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.WEATHERED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_CHISELED_COPPER_WALL);

        //oxidized_chiseled_copper_block
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.OXIDIZED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_CHISELED_COPPER_WALL);

        //copper_grate_block
        addDrop(ModBlocks.COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.COPPER_GRATE_FENCE);
        addDrop(ModBlocks.COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.COPPER_GRATE_DOOR, doorDrops(ModBlocks.COPPER_GRATE_DOOR));
        addDrop(ModBlocks.COPPER_GRATE_SLAB, slabDrops(ModBlocks.COPPER_GRATE_SLAB));
        addDrop(ModBlocks.COPPER_GRATE_WALL);

        //exposed_copper_grate_block
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.EXPOSED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.EXPOSED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.EXPOSED_COPPER_GRATE_WALL);

        //weathered_copper_grate_block
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.WEATHERED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.WEATHERED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.WEATHERED_COPPER_GRATE_WALL);

        //oxidized_copper_grate_block
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.OXIDIZED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.OXIDIZED_COPPER_GRATE_WALL);

        //waxed_chiseled_copper_block
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_CHISELED_COPPER_WALL);

        //waxed_exposed_chiseled_copper_block
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL);

        //waxed_weathered_chiseled_copper_block
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL);

        //waxed_oxidized_chiseled_copper_block
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR);
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_BUTTON);
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_FENCE);
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_DOOR, doorDrops(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_DOOR));
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL);

        //waxed_copper_grate_block
        addDrop(ModBlocks.WAXED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.WAXED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.WAXED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.WAXED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.WAXED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.WAXED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.WAXED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.WAXED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.WAXED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.WAXED_COPPER_GRATE_WALL);

        //waxed_exposed_copper_grate_block
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL);

        //waxed_weathered_copper_grate_block
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL);

        //waxed_oxidized_copper_grate_block
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_BUTTON);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_FENCE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_DOOR, doorDrops(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_DOOR));
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL);

        //chiseled_tuff
        addDrop(ModBlocks2.CHISELED_TUFF_STAIRS);
        addDrop(ModBlocks2.CHISELED_TUFF_TRAPDOOR);
        addDrop(ModBlocks2.CHISELED_TUFF_BUTTON);
        addDrop(ModBlocks2.CHISELED_TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks2.CHISELED_TUFF_FENCE);
        addDrop(ModBlocks2.CHISELED_TUFF_FENCE_GATE);
        addDrop(ModBlocks2.CHISELED_TUFF_DOOR, doorDrops(ModBlocks2.CHISELED_TUFF_DOOR));
        addDrop(ModBlocks2.CHISELED_TUFF_SLAB, slabDrops(ModBlocks2.CHISELED_TUFF_SLAB));
        addDrop(ModBlocks2.CHISELED_TUFF_WALL);

        //polished_tuff
        addDrop(ModBlocks2.POLISHED_TUFF_TRAPDOOR);
        addDrop(ModBlocks2.POLISHED_TUFF_BUTTON);
        addDrop(ModBlocks2.POLISHED_TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks2.POLISHED_TUFF_FENCE);
        addDrop(ModBlocks2.POLISHED_TUFF_FENCE_GATE);
        addDrop(ModBlocks2.POLISHED_TUFF_DOOR, doorDrops(ModBlocks2.POLISHED_TUFF_DOOR));

        //tuff_bricks
        addDrop(ModBlocks2.TUFF_BRICKS_TRAPDOOR);
        addDrop(ModBlocks2.TUFF_BRICKS_BUTTON);
        addDrop(ModBlocks2.TUFF_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks2.TUFF_BRICKS_FENCE);
        addDrop(ModBlocks2.TUFF_BRICKS_FENCE_GATE);
        addDrop(ModBlocks2.TUFF_BRICKS_DOOR, doorDrops(ModBlocks2.TUFF_BRICKS_DOOR));

        //plank_walls
        addDrop(ModBlocks.OAK_WALL);
        addDrop(ModBlocks.SPRUCE_WALL);
        addDrop(ModBlocks.BIRCH_WALL);
        addDrop(ModBlocks.JUNGLE_WALL);
        addDrop(ModBlocks.ACACIA_WALL);
        addDrop(ModBlocks.DARK_OAK_WALL);
        addDrop(ModBlocks.MANGROVE_WALL);
        addDrop(ModBlocks.CHERRY_WALL);
        addDrop(ModBlocks.BAMBOO_WALL);
        addDrop(ModBlocks.CRIMSON_WALL);
        addDrop(ModBlocks.WARPED_WALL);
        addDrop(ModBlocks.OAK_WOOD_WALL);
        addDrop(ModBlocks.SPRUCE_WOOD_WALL);
        addDrop(ModBlocks.BIRCH_WOOD_WALL);
        addDrop(ModBlocks.JUNGLE_WOOD_WALL);
        addDrop(ModBlocks.ACACIA_WOOD_WALL);
        addDrop(ModBlocks.DARK_OAK_WOOD_WALL);
        addDrop(ModBlocks.MANGROVE_WOOD_WALL);
        addDrop(ModBlocks.CHERRY_WOOD_WALL);
        addDrop(ModBlocks.BAMBOO_BLOCK_WALL);
        addDrop(ModBlocks.CRIMSON_HYPHAE_WALL);
        addDrop(ModBlocks.WARPED_HYPHAE_WALL);
        addDrop(ModBlocks.STR_OAK_WOOD_WALL);
        addDrop(ModBlocks.STR_SPRUCE_WOOD_WALL);
        addDrop(ModBlocks.STR_BIRCH_WOOD_WALL);
        addDrop(ModBlocks.STR_JUNGLE_WOOD_WALL);
        addDrop(ModBlocks.STR_ACACIA_WOOD_WALL);
        addDrop(ModBlocks.STR_DARK_OAK_WOOD_WALL);
        addDrop(ModBlocks.STR_MANGROVE_WOOD_WALL);
        addDrop(ModBlocks.STR_CHERRY_WOOD_WALL);
        addDrop(ModBlocks.STR_BAMBOO_BLOCK_WALL);
        addDrop(ModBlocks.STR_CRIMSON_HYPHAE_WALL);
        addDrop(ModBlocks.STR_WARPED_HYPHAE_WALL);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

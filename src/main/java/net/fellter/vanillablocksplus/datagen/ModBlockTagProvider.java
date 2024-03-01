package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
     public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                //stone
                .add(ModBlocks.STONE_DOOR)
                .add(ModBlocks.STONE_TRAPDOOR)
                .add(ModBlocks.STONE_FENCE_GATE)
                .add(ModBlocks.STONE_FENCE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                //oak
                .add(ModBlocks.OAK_WOOD_MOD)
                .add(ModBlocks.OAK_WOOD_STAIRS)
                .add(ModBlocks.OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.OAK_WOOD_FENCE)
                .add(ModBlocks.OAK_WOOD_BUTTON)
                .add(ModBlocks.OAK_WOOD_DOOR)
                .add(ModBlocks.OAK_WOOD_SLAB)
                .add(ModBlocks.OAK_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.OAK_WOOD_TRAPDOOR)
                //str oak
                .add(ModBlocks.STR_OAK_WOOD_STAIRS)
                .add(ModBlocks.STR_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_OAK_WOOD_FENCE)
                .add(ModBlocks.STR_OAK_WOOD_BUTTON)
                .add(ModBlocks.STR_OAK_WOOD_DOOR)
                .add(ModBlocks.STR_OAK_WOOD_SLAB)
                .add(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.STR_OAK_WOOD_TRAPDOOR)
                //spruce
                .add(ModBlocks.SPRUCE_WOOD_STAIRS)
                .add(ModBlocks.SPRUCE_WOOD_FENCE_GATE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE)
                .add(ModBlocks.SPRUCE_WOOD_BUTTON)
                .add(ModBlocks.SPRUCE_WOOD_DOOR)
                .add(ModBlocks.SPRUCE_WOOD_SLAB)
                .add(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.SPRUCE_WOOD_TRAPDOOR)
                //str spruce
                .add(ModBlocks.STR_SPRUCE_WOOD_STAIRS)
                .add(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_SPRUCE_WOOD_FENCE)
                .add(ModBlocks.STR_SPRUCE_WOOD_BUTTON)
                .add(ModBlocks.STR_SPRUCE_WOOD_DOOR)
                .add(ModBlocks.STR_SPRUCE_WOOD_SLAB)
                .add(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR)
                //birch
                .add(ModBlocks.BIRCH_WOOD_STAIRS)
                .add(ModBlocks.BIRCH_WOOD_SLAB)
                .add(ModBlocks.BIRCH_WOOD_FENCE)
                .add(ModBlocks.BIRCH_WOOD_FENCE_GATE)
                .add(ModBlocks.BIRCH_WOOD_DOOR)
                .add(ModBlocks.BIRCH_WOOD_TRAPDOOR)
                .add(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.BIRCH_WOOD_BUTTON)
                //str birch
                .add(ModBlocks.STR_BIRCH_WOOD_STAIRS)
                .add(ModBlocks.STR_BIRCH_WOOD_SLAB)
                .add(ModBlocks.STR_BIRCH_WOOD_FENCE)
                .add(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_BIRCH_WOOD_DOOR)
                .add(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR)
                .add(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.STR_BIRCH_WOOD_BUTTON)
                //jungle
                .add(ModBlocks.JUNGLE_WOOD_STAIRS)
                .add(ModBlocks.JUNGLE_WOOD_SLAB)
                .add(ModBlocks.JUNGLE_WOOD_FENCE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE_GATE)
                .add(ModBlocks.JUNGLE_WOOD_DOOR)
                .add(ModBlocks.JUNGLE_WOOD_TRAPDOOR)
                .add(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.JUNGLE_WOOD_BUTTON)
                //str jungle
                .add(ModBlocks.STR_JUNGLE_WOOD_STAIRS)
                .add(ModBlocks.STR_JUNGLE_WOOD_SLAB)
                .add(ModBlocks.STR_JUNGLE_WOOD_FENCE)
                .add(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_JUNGLE_WOOD_DOOR)
                .add(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR)
                .add(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.STR_JUNGLE_WOOD_BUTTON)
                //acacia
                .add(ModBlocks.ACACIA_WOOD_STAIRS)
                .add(ModBlocks.ACACIA_WOOD_SLAB)
                .add(ModBlocks.ACACIA_WOOD_FENCE)
                .add(ModBlocks.ACACIA_WOOD_FENCE_GATE)
                .add(ModBlocks.ACACIA_WOOD_DOOR)
                .add(ModBlocks.ACACIA_WOOD_TRAPDOOR)
                .add(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.ACACIA_WOOD_BUTTON)
                //str acacia
                .add(ModBlocks.STR_ACACIA_WOOD_STAIRS)
                .add(ModBlocks.STR_ACACIA_WOOD_SLAB)
                .add(ModBlocks.STR_ACACIA_WOOD_FENCE)
                .add(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_ACACIA_WOOD_DOOR)
                .add(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR)
                .add(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.STR_ACACIA_WOOD_BUTTON)
                //dark oak
                .add(ModBlocks.DARK_OAK_WOOD_STAIRS)
                .add(ModBlocks.DARK_OAK_WOOD_SLAB)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.DARK_OAK_WOOD_DOOR)
                .add(ModBlocks.DARK_OAK_WOOD_TRAPDOOR)
                .add(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.DARK_OAK_WOOD_BUTTON)
                //mangrove
                .add(ModBlocks.MANGROVE_WOOD_STAIRS)
                .add(ModBlocks.MANGROVE_WOOD_SLAB)
                .add(ModBlocks.MANGROVE_WOOD_FENCE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE_GATE)
                .add(ModBlocks.MANGROVE_WOOD_DOOR)
                .add(ModBlocks.MANGROVE_WOOD_TRAPDOOR)
                .add(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.MANGROVE_WOOD_BUTTON)
                //str mangrove
                .add(ModBlocks.STR_MANGROVE_WOOD_STAIRS)
                .add(ModBlocks.STR_MANGROVE_WOOD_SLAB)
                .add(ModBlocks.STR_MANGROVE_WOOD_FENCE)
                .add(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_MANGROVE_WOOD_DOOR)
                .add(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR)
                .add(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.STR_MANGROVE_WOOD_BUTTON)
                //cherry
                .add(ModBlocks.CHERRY_WOOD_STAIRS)
                .add(ModBlocks.CHERRY_WOOD_SLAB)
                .add(ModBlocks.CHERRY_WOOD_FENCE)
                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE)
                .add(ModBlocks.CHERRY_WOOD_DOOR)
                .add(ModBlocks.CHERRY_WOOD_TRAPDOOR)
                .add(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.CHERRY_WOOD_BUTTON)
                //str cherry
                .add(ModBlocks.CHERRY_WOOD_STAIRS)
                .add(ModBlocks.CHERRY_WOOD_SLAB)
                .add(ModBlocks.CHERRY_WOOD_FENCE)
                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE)
                .add(ModBlocks.CHERRY_WOOD_DOOR)
                .add(ModBlocks.CHERRY_WOOD_TRAPDOOR)
                .add(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE)
                .add(ModBlocks.CHERRY_WOOD_BUTTON)
                //bamboo
                .add(ModBlocks.BAMBOO_BLOCK_STAIRS)
                .add(ModBlocks.BAMBOO_BLOCK_SLAB)
                .add(ModBlocks.BAMBOO_BLOCK_FENCE)
                .add(ModBlocks.BAMBOO_BLOCK_FENCE_GATE)
                .add(ModBlocks.BAMBOO_BLOCK_DOOR)
                .add(ModBlocks.BAMBOO_BLOCK_TRAPDOOR)
                .add(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE)
                .add(ModBlocks.BAMBOO_BLOCK_BUTTON)
                //str bamboo
                .add(ModBlocks.STR_BAMBOO_BLOCK_STAIRS)
                .add(ModBlocks.STR_BAMBOO_BLOCK_SLAB)
                .add(ModBlocks.STR_BAMBOO_BLOCK_FENCE)
                .add(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE)
                .add(ModBlocks.STR_BAMBOO_BLOCK_DOOR)
                .add(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR)
                .add(ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE)
                .add(ModBlocks.STR_BAMBOO_BLOCK_BUTTON)
                //crimson hyphae
                .add(ModBlocks.CRIMSON_HYPHAE_STAIRS)
                .add(ModBlocks.CRIMSON_HYPHAE_SLAB)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE)
                .add(ModBlocks.CRIMSON_HYPHAE_DOOR)
                .add(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR)
                .add(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE)
                .add(ModBlocks.CRIMSON_HYPHAE_BUTTON)
                //str crimson hyphae
                .add(ModBlocks.CRIMSON_HYPHAE_STAIRS)
                .add(ModBlocks.CRIMSON_HYPHAE_SLAB)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE)
                .add(ModBlocks.CRIMSON_HYPHAE_DOOR)
                .add(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR)
                .add(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE)
                .add(ModBlocks.CRIMSON_HYPHAE_BUTTON)
                //warped hyphae
                .add(ModBlocks.WARPED_HYPHAE_STAIRS)
                .add(ModBlocks.WARPED_HYPHAE_SLAB)
                .add(ModBlocks.WARPED_HYPHAE_FENCE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE_GATE)
                .add(ModBlocks.WARPED_HYPHAE_DOOR)
                .add(ModBlocks.WARPED_HYPHAE_TRAPDOOR)
                .add(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE)
                .add(ModBlocks.WARPED_HYPHAE_BUTTON)
                //str warped hyphae
                .add(ModBlocks.STR_WARPED_HYPHAE_STAIRS)
                .add(ModBlocks.STR_WARPED_HYPHAE_SLAB)
                .add(ModBlocks.STR_WARPED_HYPHAE_FENCE)
                .add(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE)
                .add(ModBlocks.STR_WARPED_HYPHAE_DOOR)
                .add(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR)
                .add(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE)
                .add(ModBlocks.STR_WARPED_HYPHAE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.OAK_WOOD_FENCE)
                .add(ModBlocks.STR_OAK_WOOD_FENCE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE)
                .add(ModBlocks.STR_SPRUCE_WOOD_FENCE)
                .add(ModBlocks.BIRCH_WOOD_FENCE)
                .add(ModBlocks.STR_BIRCH_WOOD_FENCE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE)
                .add(ModBlocks.STR_JUNGLE_WOOD_FENCE)
                .add(ModBlocks.ACACIA_WOOD_FENCE)
                .add(ModBlocks.STR_ACACIA_WOOD_FENCE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.STR_DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE)
                .add(ModBlocks.STR_MANGROVE_WOOD_FENCE)
                .add(ModBlocks.CHERRY_WOOD_FENCE)
                .add(ModBlocks.STR_CHERRY_WOOD_FENCE)
                .add(ModBlocks.BAMBOO_BLOCK_FENCE)
                .add(ModBlocks.STR_BAMBOO_BLOCK_FENCE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE)
                .add(ModBlocks.STR_WARPED_HYPHAE_FENCE)
                .add(ModBlocks.STONE_FENCE);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.OAK_WOOD_FENCE)
                .add(ModBlocks.STR_OAK_WOOD_FENCE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE)
                .add(ModBlocks.STR_SPRUCE_WOOD_FENCE)
                .add(ModBlocks.BIRCH_WOOD_FENCE)
                .add(ModBlocks.STR_BIRCH_WOOD_FENCE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE)
                .add(ModBlocks.STR_JUNGLE_WOOD_FENCE)
                .add(ModBlocks.ACACIA_WOOD_FENCE)
                .add(ModBlocks.STR_ACACIA_WOOD_FENCE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.STR_DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE)
                .add(ModBlocks.STR_MANGROVE_WOOD_FENCE)
                .add(ModBlocks.CHERRY_WOOD_FENCE)
                .add(ModBlocks.STR_CHERRY_WOOD_FENCE)
                .add(ModBlocks.BAMBOO_BLOCK_FENCE)
                .add(ModBlocks.STR_BAMBOO_BLOCK_FENCE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE)
                .add(ModBlocks.STR_WARPED_HYPHAE_FENCE)
                .add(ModBlocks.STONE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE)
                .add(ModBlocks.BIRCH_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE)
                .add(ModBlocks.ACACIA_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE)
                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE)
                .add(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE)
                .add(ModBlocks.BAMBOO_BLOCK_FENCE_GATE)
                .add(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE)
                .add(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE_GATE)
                .add(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE)
                .add(ModBlocks.STONE_FENCE_GATE);






        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));




    }
}
package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.util.ModRecipes;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;


import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        //oak
        ModRecipes.StairsRecipe(ModBlocks.OAK_WOOD_STAIRS, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_SLAB, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.OAK_WOOD_DOOR, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.OAK_WOOD_FENCE, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.OAK_WOOD_FENCE_GATE, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.OAK_WOOD_PRESSURE_PLATE, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.OAK_WOOD_TRAPDOOR, (Blocks.OAK_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_BUTTON, Blocks.OAK_WOOD).offerTo(exporter);

        //str oak
        ModRecipes.StairsRecipe(ModBlocks.STR_OAK_WOOD_STAIRS, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_SLAB, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_OAK_WOOD_DOOR, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_OAK_WOOD_FENCE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_BUTTON, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);

        //spruce
        ModRecipes.StairsRecipe(ModBlocks.SPRUCE_WOOD_STAIRS, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_SLAB, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.SPRUCE_WOOD_DOOR, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.SPRUCE_WOOD_FENCE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.SPRUCE_WOOD_FENCE_GATE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SPRUCE_WOOD_TRAPDOOR, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_BUTTON, Blocks.SPRUCE_WOOD).offerTo(exporter);

        //str spruce
        ModRecipes.StairsRecipe(ModBlocks.STR_SPRUCE_WOOD_STAIRS, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_SLAB, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_SPRUCE_WOOD_DOOR, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_BUTTON, Blocks.STRIPPED_SPRUCE_WOOD).offerTo(exporter);

        //birch
        ModRecipes.StairsRecipe(ModBlocks.BIRCH_WOOD_STAIRS, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_SLAB, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.BIRCH_WOOD_DOOR, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.BIRCH_WOOD_FENCE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.BIRCH_WOOD_FENCE_GATE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BIRCH_WOOD_TRAPDOOR, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_BUTTON, Blocks.BIRCH_WOOD).offerTo(exporter);

        //str birch
        ModRecipes.StairsRecipe(ModBlocks.STR_BIRCH_WOOD_STAIRS, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_SLAB, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_BIRCH_WOOD_DOOR, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_BUTTON, Blocks.STRIPPED_BIRCH_WOOD).offerTo(exporter);

        //jungle
        ModRecipes.StairsRecipe(ModBlocks.JUNGLE_WOOD_STAIRS, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_SLAB, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.JUNGLE_WOOD_DOOR, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.JUNGLE_WOOD_FENCE, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.JUNGLE_WOOD_FENCE_GATE, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.JUNGLE_WOOD_TRAPDOOR, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_BUTTON, Blocks.JUNGLE_WOOD).offerTo(exporter);

        //str jungle
        ModRecipes.StairsRecipe(ModBlocks.STR_JUNGLE_WOOD_STAIRS, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_SLAB, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_JUNGLE_WOOD_DOOR, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_BUTTON, Blocks.STRIPPED_JUNGLE_WOOD).offerTo(exporter);

        //acacia
        ModRecipes.StairsRecipe(ModBlocks.ACACIA_WOOD_STAIRS, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_SLAB, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.ACACIA_WOOD_DOOR, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.ACACIA_WOOD_FENCE, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.ACACIA_WOOD_FENCE_GATE, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ACACIA_WOOD_TRAPDOOR, (Blocks.ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_BUTTON, Blocks.ACACIA_WOOD).offerTo(exporter);

        //str acacia
        ModRecipes.StairsRecipe(ModBlocks.STR_ACACIA_WOOD_STAIRS, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_SLAB, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_ACACIA_WOOD_DOOR, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_BUTTON, Blocks.STRIPPED_ACACIA_WOOD).offerTo(exporter);

        //dark oak
        ModRecipes.StairsRecipe(ModBlocks.DARK_OAK_WOOD_STAIRS, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_SLAB, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.DARK_OAK_WOOD_DOOR, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.DARK_OAK_WOOD_FENCE, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_BUTTON, Blocks.DARK_OAK_WOOD).offerTo(exporter);

        //str dark oak
        ModRecipes.StairsRecipe(ModBlocks.STR_DARK_OAK_WOOD_STAIRS, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_SLAB, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_DOOR, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_BUTTON, Blocks.STRIPPED_DARK_OAK_WOOD).offerTo(exporter);

        //mangrove
        ModRecipes.StairsRecipe(ModBlocks.MANGROVE_WOOD_STAIRS, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_SLAB, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.MANGROVE_WOOD_DOOR, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.MANGROVE_WOOD_FENCE, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.MANGROVE_WOOD_FENCE_GATE, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MANGROVE_WOOD_TRAPDOOR, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_BUTTON, Blocks.MANGROVE_WOOD).offerTo(exporter);

        //str mangrove
        ModRecipes.StairsRecipe(ModBlocks.STR_MANGROVE_WOOD_STAIRS, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_SLAB, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_MANGROVE_WOOD_DOOR, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_BUTTON, Blocks.STRIPPED_MANGROVE_WOOD).offerTo(exporter);

        //cherry
        ModRecipes.StairsRecipe(ModBlocks.CHERRY_WOOD_STAIRS, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_SLAB, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.CHERRY_WOOD_DOOR, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.CHERRY_WOOD_FENCE, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.CHERRY_WOOD_FENCE_GATE, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CHERRY_WOOD_TRAPDOOR, (Blocks.CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_BUTTON, Blocks.CHERRY_WOOD).offerTo(exporter);

        //str cherry
        ModRecipes.StairsRecipe(ModBlocks.STR_CHERRY_WOOD_STAIRS, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_SLAB, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_CHERRY_WOOD_DOOR, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_BUTTON, Blocks.STRIPPED_CHERRY_WOOD).offerTo(exporter);

        //bamboo
        ModRecipes.StairsRecipe(ModBlocks.BAMBOO_BLOCK_STAIRS, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_SLAB, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.BAMBOO_BLOCK_DOOR, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.BAMBOO_BLOCK_FENCE, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_BUTTON, Blocks.BAMBOO_BLOCK).offerTo(exporter);

        //bamboo
        ModRecipes.StairsRecipe(ModBlocks.STR_BAMBOO_BLOCK_STAIRS, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_SLAB, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_DOOR, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, Blocks.STRIPPED_BAMBOO_BLOCK).offerTo(exporter);

        //crimson hyphae
        ModRecipes.StairsRecipe(ModBlocks.CRIMSON_HYPHAE_STAIRS, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_SLAB, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.CRIMSON_HYPHAE_DOOR, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_BUTTON, Blocks.CRIMSON_HYPHAE).offerTo(exporter);

        //str crimson hyphae
        ModRecipes.StairsRecipe(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_SLAB, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON, Blocks.STRIPPED_CRIMSON_HYPHAE).offerTo(exporter);

        //warped hyphae
        ModRecipes.StairsRecipe(ModBlocks.WARPED_HYPHAE_STAIRS, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_SLAB, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.WARPED_HYPHAE_DOOR, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.WARPED_HYPHAE_FENCE, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.WARPED_HYPHAE_FENCE_GATE, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WARPED_HYPHAE_TRAPDOOR, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_BUTTON, Blocks.WARPED_HYPHAE).offerTo(exporter);

        //str warped hyphae
        ModRecipes.StairsRecipe(ModBlocks.STR_WARPED_HYPHAE_STAIRS, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_SLAB, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.STR_WARPED_HYPHAE_DOOR, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.FenceGateRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_BUTTON, Blocks.STRIPPED_WARPED_HYPHAE).offerTo(exporter);

        //stone
        ModRecipes.DoorRecipe(ModBlocks.STONE_DOOR, (Blocks.STONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.STONE_FENCE, (Blocks.STONE), (Blocks.STONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.STONE_FENCE_GATE, (Blocks.STONE), (Blocks.STONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STONE_TRAPDOOR, (Blocks.STONE_SLAB)).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, (Blocks.STONE)).offerTo(exporter);

        //cobblestone
        ModRecipes.DoorRecipe(ModBlocks.COBBLESTONE_DOOR, (Blocks.COBBLESTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COBBLESTONE_FENCE, (Blocks.COBBLESTONE), (Blocks.COBBLESTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COBBLESTONE_FENCE_GATE, (Blocks.COBBLESTONE), (Blocks.COBBLESTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COBBLESTONE_TRAPDOOR, (Blocks.COBBLESTONE_SLAB)).offerTo(exporter);


        //mossy cobblestone
        ModRecipes.DoorRecipe(ModBlocks.MOSSY_COBBLESTONE_DOOR, (Blocks.MOSSY_COBBLESTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE, (Blocks.MOSSY_COBBLESTONE), (Blocks.MOSSY_COBBLESTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE, (Blocks.MOSSY_COBBLESTONE), (Blocks.MOSSY_COBBLESTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR, (Blocks.MOSSY_COBBLESTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, (Blocks.MOSSY_COBBLESTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_BUTTON, Blocks.MOSSY_COBBLESTONE, 1).offerTo(exporter);

        //smooth stone
        ModRecipes.StairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, (Blocks.SMOOTH_STONE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.SMOOTH_STONE_DOOR, (Blocks.SMOOTH_STONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SMOOTH_STONE_FENCE, (Blocks.SMOOTH_STONE), (Blocks.SMOOTH_STONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SMOOTH_STONE_FENCE_GATE, (Blocks.SMOOTH_STONE), (Blocks.SMOOTH_STONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SMOOTH_STONE_TRAPDOOR, (Blocks.SMOOTH_STONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, (Blocks.SMOOTH_STONE)).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, (Blocks.SMOOTH_STONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BUTTON, Blocks.SMOOTH_STONE, 1).offerTo(exporter);

        //stone bricks
        ModRecipes.DoorRecipe(ModBlocks.STONE_BRICKS_DOOR, (Blocks.STONE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.STONE_BRICKS_FENCE, (Blocks.STONE_BRICKS), (Blocks.STONE_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.STONE_BRICKS_FENCE_GATE, (Blocks.STONE_BRICKS), (Blocks.STONE_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.STONE_BRICKS_TRAPDOOR, (Blocks.STONE_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_PRESSURE_PLATE, (Blocks.STONE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_BUTTON, Blocks.STONE_BRICKS, 1).offerTo(exporter);

        //cracked stone bricks
        ModRecipes.DoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_DOOR, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_SLAB, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE, (Blocks.CRACKED_STONE_BRICKS), (ModBlocks.CRACKED_STONE_BRICKS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE, (Blocks.CRACKED_STONE_BRICKS), (ModBlocks.CRACKED_STONE_BRICKS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR, (ModBlocks.CRACKED_STONE_BRICKS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_BUTTON, Blocks.CRACKED_STONE_BRICKS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_WALL, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);

        //granite
        ModRecipes.DoorRecipe(ModBlocks.GRANITE_DOOR, (Blocks.GRANITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRANITE_FENCE, (Blocks.GRANITE), (Blocks.GRANITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRANITE_FENCE_GATE, (Blocks.GRANITE), (Blocks.GRANITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRANITE_TRAPDOOR, (Blocks.GRANITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_PRESSURE_PLATE, (Blocks.GRANITE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BUTTON, Blocks.GRANITE, 1).offerTo(exporter);

        //polished granite
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_GRANITE_DOOR, (Blocks.POLISHED_GRANITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_GRANITE_FENCE, (Blocks.POLISHED_GRANITE), (Blocks.POLISHED_GRANITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_GRANITE_FENCE_GATE, (Blocks.POLISHED_GRANITE), (Blocks.POLISHED_GRANITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_GRANITE_TRAPDOOR, (Blocks.POLISHED_GRANITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, (Blocks.POLISHED_GRANITE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, (Blocks.POLISHED_GRANITE)).offerTo(exporter);

        //diorite
        ModRecipes.DoorRecipe(ModBlocks.DIORITE_DOOR, (Blocks.DIORITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DIORITE_FENCE, (Blocks.DIORITE), (Blocks.DIORITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DIORITE_FENCE_GATE, (Blocks.DIORITE), (Blocks.DIORITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DIORITE_TRAPDOOR, (Blocks.DIORITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_PRESSURE_PLATE, (Blocks.DIORITE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BUTTON, Blocks.DIORITE, 1).offerTo(exporter);

        //polished diorite
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_DIORITE_DOOR, (Blocks.POLISHED_DIORITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_DIORITE_FENCE, (Blocks.POLISHED_DIORITE), (Blocks.POLISHED_DIORITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_DIORITE_FENCE_GATE, (Blocks.POLISHED_DIORITE), (Blocks.POLISHED_DIORITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_DIORITE_TRAPDOOR, (Blocks.POLISHED_DIORITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, (Blocks.POLISHED_DIORITE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, (Blocks.POLISHED_DIORITE)).offerTo(exporter);

        //andesite
        ModRecipes.DoorRecipe(ModBlocks.ANDESITE_DOOR, (Blocks.ANDESITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ANDESITE_FENCE, (Blocks.ANDESITE), (Blocks.ANDESITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ANDESITE_FENCE_GATE, (Blocks.ANDESITE), (Blocks.ANDESITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ANDESITE_TRAPDOOR, (Blocks.ANDESITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_PRESSURE_PLATE, (Blocks.ANDESITE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE, 1).offerTo(exporter);

        //polished andesite
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_ANDESITE_DOOR, (Blocks.POLISHED_ANDESITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_ANDESITE_FENCE, (Blocks.POLISHED_ANDESITE), (Blocks.POLISHED_ANDESITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_ANDESITE_FENCE_GATE, (Blocks.POLISHED_ANDESITE), (Blocks.POLISHED_ANDESITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_ANDESITE_TRAPDOOR, (Blocks.POLISHED_ANDESITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, (Blocks.POLISHED_ANDESITE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, (Blocks.POLISHED_ANDESITE)).offerTo(exporter);

        //deepslate
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_DOOR, (Blocks.DEEPSLATE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_SLAB, (Blocks.DEEPSLATE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_STAIRS, (Blocks.DEEPSLATE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_FENCE, (Blocks.DEEPSLATE), (ModBlocks.DEEPSLATE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_FENCE_GATE, (Blocks.DEEPSLATE), (ModBlocks.DEEPSLATE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_TRAPDOOR, (ModBlocks.DEEPSLATE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_PRESSURE_PLATE, (Blocks.DEEPSLATE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, (Blocks.DEEPSLATE)).offerTo(exporter);

        //cobbled deepslate
        ModRecipes.DoorRecipe(ModBlocks.COBBLED_DEEPSLATE_DOOR, (Blocks.COBBLED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE, (Blocks.COBBLED_DEEPSLATE), (Blocks.COBBLED_DEEPSLATE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE, (Blocks.COBBLED_DEEPSLATE), (Blocks.COBBLED_DEEPSLATE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR, (Blocks.COBBLED_DEEPSLATE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, (Blocks.COBBLED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE, 1).offerTo(exporter);

        //chiseled deepslate
        ModRecipes.DoorRecipe(ModBlocks.CHISELED_DEEPSLATE_DOOR, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_SLAB, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CHISELED_DEEPSLATE_STAIRS, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE, (Blocks.CHISELED_DEEPSLATE), (ModBlocks.CHISELED_DEEPSLATE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE, (Blocks.CHISELED_DEEPSLATE), (ModBlocks.CHISELED_DEEPSLATE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR, (ModBlocks.CHISELED_DEEPSLATE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_BUTTON, Blocks.CHISELED_DEEPSLATE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_WALL, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);

        //polished deepslate
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_DEEPSLATE_DOOR, (Blocks.POLISHED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE, (Blocks.POLISHED_DEEPSLATE), (Blocks.POLISHED_DEEPSLATE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE, (Blocks.POLISHED_DEEPSLATE), (Blocks.POLISHED_DEEPSLATE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR, (Blocks.POLISHED_DEEPSLATE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, (Blocks.POLISHED_DEEPSLATE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE, 1).offerTo(exporter);

        //deepslate bricks
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_BRICKS_DOOR, (Blocks.DEEPSLATE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE, (Blocks.DEEPSLATE_BRICKS), (Blocks.DEEPSLATE_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE, (Blocks.DEEPSLATE_BRICKS), (Blocks.DEEPSLATE_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR, (Blocks.DEEPSLATE_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE, (Blocks.DEEPSLATE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_BUTTON, Blocks.DEEPSLATE_BRICKS, 1).offerTo(exporter);

        //cracked deepslate bricks
        ModRecipes.DoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE, (Blocks.CRACKED_DEEPSLATE_BRICKS), (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE, (Blocks.CRACKED_DEEPSLATE_BRICKS), (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR, (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON, Blocks.CRACKED_DEEPSLATE_BRICKS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);

        //deepslate bricks
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_TILES_DOOR, (Blocks.DEEPSLATE_TILES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_TILES_FENCE, (Blocks.DEEPSLATE_TILES), (Blocks.DEEPSLATE_TILE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_TILES_FENCE_GATE, (Blocks.DEEPSLATE_TILES), (Blocks.DEEPSLATE_TILE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_TILES_TRAPDOOR, (Blocks.DEEPSLATE_TILE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE, (Blocks.DEEPSLATE_TILES)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_BUTTON, Blocks.DEEPSLATE_TILES, 1).offerTo(exporter);

        //cracked deepslate tiles
        ModRecipes.DoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE, (Blocks.CRACKED_DEEPSLATE_TILES), (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE, (Blocks.CRACKED_DEEPSLATE_TILES), (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR, (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON, Blocks.CRACKED_DEEPSLATE_TILES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_WALL, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);

        //bricks
        ModRecipes.DoorRecipe(ModBlocks.BRICK_DOOR, (Blocks.BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BRICK_FENCE, (Blocks.BRICKS), (Blocks.BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BRICK_FENCE_GATE, (Blocks.BRICKS), (Blocks.BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BRICK_TRAPDOOR, (Blocks.BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_PRESSURE_PLATE, (Blocks.BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_BUTTON, Blocks.BRICKS, 1).offerTo(exporter);

        //packed mud
        ModRecipes.DoorRecipe(ModBlocks.PACKED_MUD_DOOR, (Blocks.PACKED_MUD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_SLAB, (Blocks.PACKED_MUD)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PACKED_MUD_STAIRS, (Blocks.PACKED_MUD)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PACKED_MUD_FENCE, (Blocks.PACKED_MUD), (ModBlocks.PACKED_MUD_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PACKED_MUD_FENCE_GATE, (Blocks.PACKED_MUD), (ModBlocks.PACKED_MUD_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PACKED_MUD_TRAPDOOR, (ModBlocks.PACKED_MUD_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_PRESSURE_PLATE, (Blocks.PACKED_MUD)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_BUTTON, Blocks.PACKED_MUD, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, (Blocks.PACKED_MUD)).offerTo(exporter);

        //mud bricks
        ModRecipes.DoorRecipe(ModBlocks.MUD_BRICK_DOOR, (Blocks.MUD_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MUD_BRICK_FENCE, (Blocks.MUD_BRICKS), (Blocks.MUD_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MUD_BRICK_FENCE_GATE, (Blocks.MUD_BRICKS), (Blocks.MUD_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MUD_BRICK_TRAPDOOR, (Blocks.MUD_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_PRESSURE_PLATE, (Blocks.MUD_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_BUTTON, Blocks.MUD_BRICKS, 1).offerTo(exporter);

        //sandstone
        ModRecipes.DoorRecipe(ModBlocks.SANDSTONE_DOOR, (Blocks.SANDSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SANDSTONE_FENCE, (Blocks.SANDSTONE), (Blocks.SANDSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SANDSTONE_FENCE_GATE, (Blocks.SANDSTONE), (Blocks.SANDSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SANDSTONE_TRAPDOOR, (Blocks.SANDSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_PRESSURE_PLATE, (Blocks.SANDSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BUTTON, Blocks.SANDSTONE, 1).offerTo(exporter);

        //smooth sandstone
        ModRecipes.DoorRecipe(ModBlocks.SMOOTH_SANDSTONE_DOOR, (Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE, (Blocks.SMOOTH_SANDSTONE), (Blocks.SMOOTH_SANDSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE, (Blocks.SMOOTH_SANDSTONE), (Blocks.SMOOTH_SANDSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR, (Blocks.SMOOTH_SANDSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, (Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_BUTTON, Blocks.SMOOTH_SANDSTONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, (Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);

        //cut sandstone
        ModRecipes.StairsRecipe(ModBlocks.CUT_SANDSTONE_STAIRS, (Blocks.CUT_SANDSTONE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.CUT_SANDSTONE_DOOR, (Blocks.CUT_SANDSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CUT_SANDSTONE_FENCE, (Blocks.CUT_SANDSTONE), (Blocks.CUT_SANDSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CUT_SANDSTONE_FENCE_GATE, (Blocks.CUT_SANDSTONE), (Blocks.CUT_SANDSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CUT_SANDSTONE_TRAPDOOR, (Blocks.CUT_SANDSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE, (Blocks.CUT_SANDSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_BUTTON, Blocks.CUT_SANDSTONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, (Blocks.CUT_SANDSTONE)).offerTo(exporter);

        //red sandstone
        ModRecipes.DoorRecipe(ModBlocks.RED_SANDSTONE_DOOR, (Blocks.RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_SANDSTONE_FENCE, (Blocks.RED_SANDSTONE), (Blocks.RED_SANDSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_SANDSTONE_FENCE_GATE, (Blocks.RED_SANDSTONE), (Blocks.RED_SANDSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_SANDSTONE_TRAPDOOR, (Blocks.RED_SANDSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, (Blocks.RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BUTTON, Blocks.RED_SANDSTONE, 1).offerTo(exporter);

        //red smooth sandstone
        ModRecipes.DoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR, (Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE, (Blocks.SMOOTH_RED_SANDSTONE), (Blocks.SMOOTH_RED_SANDSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE, (Blocks.SMOOTH_RED_SANDSTONE), (Blocks.SMOOTH_RED_SANDSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR, (Blocks.SMOOTH_RED_SANDSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, (Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON, Blocks.SMOOTH_RED_SANDSTONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, (Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);

        //red cut sandstone
        ModRecipes.StairsRecipe(ModBlocks.CUT_RED_SANDSTONE_STAIRS, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.DoorRecipe(ModBlocks.CUT_RED_SANDSTONE_DOOR, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE, (Blocks.CUT_RED_SANDSTONE), (Blocks.CUT_RED_SANDSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE, (Blocks.CUT_RED_SANDSTONE), (Blocks.CUT_RED_SANDSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR, (Blocks.CUT_RED_SANDSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_BUTTON, Blocks.CUT_RED_SANDSTONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);

        //sea lantern
        ModRecipes.DoorRecipe(ModBlocks.SEA_LANTERN_DOOR, (Blocks.SEA_LANTERN)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_SLAB, (Blocks.SEA_LANTERN)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SEA_LANTERN_STAIRS, (Blocks.SEA_LANTERN)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SEA_LANTERN_FENCE, (Blocks.SEA_LANTERN), (ModBlocks.SEA_LANTERN_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SEA_LANTERN_FENCE_GATE, (Blocks.SEA_LANTERN), (ModBlocks.SEA_LANTERN_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SEA_LANTERN_TRAPDOOR, (ModBlocks.SEA_LANTERN_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_PRESSURE_PLATE, (Blocks.SEA_LANTERN)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_BUTTON, Blocks.SEA_LANTERN, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_WALL, (Blocks.SEA_LANTERN)).offerTo(exporter);

        //prismarine
        ModRecipes.DoorRecipe(ModBlocks.PRISMARINE_DOOR, (Blocks.PRISMARINE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PRISMARINE_FENCE, (Blocks.PRISMARINE), (Blocks.PRISMARINE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PRISMARINE_FENCE_GATE, (Blocks.PRISMARINE), (Blocks.PRISMARINE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PRISMARINE_TRAPDOOR, (Blocks.PRISMARINE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_PRESSURE_PLATE, (Blocks.PRISMARINE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BUTTON, Blocks.PRISMARINE, 1).offerTo(exporter);

        //prismarine bricks
        ModRecipes.DoorRecipe(ModBlocks.PRISMARINE_BRICK_DOOR, (Blocks.PRISMARINE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PRISMARINE_BRICK_FENCE, (Blocks.PRISMARINE_BRICKS), (Blocks.PRISMARINE_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PRISMARINE_BRICK_FENCE_GATE, (Blocks.PRISMARINE_BRICKS), (Blocks.PRISMARINE_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PRISMARINE_BRICK_TRAPDOOR, (Blocks.PRISMARINE_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE, (Blocks.PRISMARINE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_BUTTON, Blocks.PRISMARINE_BRICKS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, (Blocks.PRISMARINE_BRICKS)).offerTo(exporter);

        //prismarine
        ModRecipes.DoorRecipe(ModBlocks.DARK_PRISMARINE_DOOR, (Blocks.DARK_PRISMARINE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DARK_PRISMARINE_FENCE, (Blocks.DARK_PRISMARINE), (Blocks.DARK_PRISMARINE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DARK_PRISMARINE_FENCE_GATE, (Blocks.DARK_PRISMARINE), (Blocks.DARK_PRISMARINE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DARK_PRISMARINE_TRAPDOOR, (Blocks.DARK_PRISMARINE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE, (Blocks.DARK_PRISMARINE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_BUTTON, Blocks.DARK_PRISMARINE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, (Blocks.DARK_PRISMARINE)).offerTo(exporter);

        //netherrack
        ModRecipes.DoorRecipe(ModBlocks.NETHERRACK_DOOR, (Blocks.NETHERRACK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_SLAB, (Blocks.NETHERRACK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.NETHERRACK_STAIRS, (Blocks.NETHERRACK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.NETHERRACK_FENCE, (Blocks.NETHERRACK), (ModBlocks.NETHERRACK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.NETHERRACK_FENCE_GATE, (Blocks.NETHERRACK), (ModBlocks.NETHERRACK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.NETHERRACK_TRAPDOOR, (ModBlocks.NETHERRACK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_PRESSURE_PLATE, (Blocks.NETHERRACK)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BUTTON, Blocks.NETHERRACK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, (Blocks.NETHERRACK)).offerTo(exporter);

        //nether bricks
        ModRecipes.DoorRecipe(ModBlocks.NETHER_BRICK_DOOR, (Blocks.NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.NETHER_BRICK_FENCE_GATE, (Blocks.NETHER_BRICKS), (Blocks.NETHER_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.NETHER_BRICK_TRAPDOOR, (Blocks.NETHER_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_PRESSURE_PLATE, (Blocks.NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_BUTTON, Blocks.NETHER_BRICKS, 1).offerTo(exporter);

        //cracked nether bricks
        ModRecipes.DoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_DOOR, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE, (Blocks.CRACKED_NETHER_BRICKS), (ModBlocks.CRACKED_NETHER_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, (Blocks.CRACKED_NETHER_BRICKS), (ModBlocks.CRACKED_NETHER_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR, (ModBlocks.CRACKED_NETHER_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_BUTTON, Blocks.CRACKED_NETHER_BRICKS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);

        //red nether bricks
        ModRecipes.DoorRecipe(ModBlocks.RED_NETHER_BRICK_DOOR, (Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_NETHER_BRICK_FENCE, (Blocks.RED_NETHER_BRICKS), (Blocks.RED_NETHER_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_NETHER_BRICK_FENCE_GATE, (Blocks.RED_NETHER_BRICKS), (Blocks.RED_NETHER_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_NETHER_BRICK_TRAPDOOR, (Blocks.RED_NETHER_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE, (Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_BUTTON, Blocks.RED_NETHER_BRICKS, 1).offerTo(exporter);

        //basalt
        ModRecipes.DoorRecipe(ModBlocks.BASALT_DOOR, (Blocks.BASALT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_SLAB, (Blocks.BASALT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BASALT_STAIRS, (Blocks.BASALT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BASALT_FENCE, (Blocks.BASALT), (ModBlocks.BASALT_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BASALT_FENCE_GATE, (Blocks.BASALT), (ModBlocks.BASALT_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BASALT_TRAPDOOR, (ModBlocks.BASALT_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_PRESSURE_PLATE, (Blocks.BASALT)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_BUTTON, Blocks.BASALT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_WALL, (Blocks.BASALT)).offerTo(exporter);

        //smooth basalt
        ModRecipes.DoorRecipe(ModBlocks.SMOOTH_BASALT_DOOR, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_SLAB, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SMOOTH_BASALT_FENCE, (Blocks.SMOOTH_BASALT), (ModBlocks.SMOOTH_BASALT_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SMOOTH_BASALT_FENCE_GATE, (Blocks.SMOOTH_BASALT), (ModBlocks.SMOOTH_BASALT_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SMOOTH_BASALT_TRAPDOOR, (ModBlocks.SMOOTH_BASALT_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_BUTTON, Blocks.SMOOTH_BASALT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, (Blocks.SMOOTH_BASALT)).offerTo(exporter);

        //polished_basalt
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_BASALT_DOOR, (Blocks.POLISHED_BASALT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_SLAB, (Blocks.POLISHED_BASALT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.POLISHED_BASALT_STAIRS, (Blocks.POLISHED_BASALT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_BASALT_FENCE, (Blocks.POLISHED_BASALT), (ModBlocks.POLISHED_BASALT_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_BASALT_FENCE_GATE, (Blocks.POLISHED_BASALT), (ModBlocks.POLISHED_BASALT_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_BASALT_TRAPDOOR, (ModBlocks.POLISHED_BASALT_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_PRESSURE_PLATE, (Blocks.POLISHED_BASALT)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_BUTTON, Blocks.POLISHED_BASALT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_WALL, (Blocks.POLISHED_BASALT)).offerTo(exporter);

        //blackstone
        ModRecipes.DoorRecipe(ModBlocks.BLACKSTONE_DOOR, (Blocks.BLACKSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACKSTONE_FENCE, (Blocks.BLACKSTONE), (Blocks.BLACKSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACKSTONE_FENCE_GATE, (Blocks.BLACKSTONE), (Blocks.BLACKSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACKSTONE_TRAPDOOR, (Blocks.BLACKSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_PRESSURE_PLATE, (Blocks.BLACKSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE, 1).offerTo(exporter);

        //gilded_blackstone
        ModRecipes.DoorRecipe(ModBlocks.GILDED_BLACKSTONE_DOOR, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_SLAB, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GILDED_BLACKSTONE_STAIRS, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GILDED_BLACKSTONE_FENCE, (Blocks.GILDED_BLACKSTONE), (ModBlocks.GILDED_BLACKSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE, (Blocks.GILDED_BLACKSTONE), (ModBlocks.GILDED_BLACKSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR, (ModBlocks.GILDED_BLACKSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_BUTTON, Blocks.GILDED_BLACKSTONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_WALL, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);

        //polished blackstone
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_BLACKSTONE_DOOR, (Blocks.POLISHED_BLACKSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_BLACKSTONE_FENCE, (Blocks.POLISHED_BLACKSTONE), (Blocks.POLISHED_BLACKSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE, (Blocks.POLISHED_BLACKSTONE), (Blocks.POLISHED_BLACKSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR, (Blocks.POLISHED_BLACKSTONE_SLAB)).offerTo(exporter);

        //polished blackstone brick
        ModRecipes.DoorRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR, (Blocks.POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE, (Blocks.POLISHED_BLACKSTONE_BRICKS), (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE, (Blocks.POLISHED_BLACKSTONE_BRICKS), (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR, (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE, (Blocks.POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON, Blocks.POLISHED_BLACKSTONE_BRICKS, 1).offerTo(exporter);
        
        //cracked_polished_blackstone_bricks
        ModRecipes.DoorRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR, (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
        
        //end_stone
        ModRecipes.DoorRecipe(ModBlocks.END_STONE_DOOR, (Blocks.END_STONE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_SLAB, (Blocks.END_STONE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.END_STONE_STAIRS, (Blocks.END_STONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.END_STONE_FENCE, (Blocks.END_STONE), (ModBlocks.END_STONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.END_STONE_FENCE_GATE, (Blocks.END_STONE), (ModBlocks.END_STONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.END_STONE_TRAPDOOR, (ModBlocks.END_STONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_PRESSURE_PLATE, (Blocks.END_STONE)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BUTTON, Blocks.END_STONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, (Blocks.END_STONE)).offerTo(exporter);
        
        //end_stone brick
        ModRecipes.DoorRecipe(ModBlocks.END_STONE_BRICK_DOOR, (Blocks.END_STONE_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.END_STONE_BRICK_FENCE, (Blocks.END_STONE_BRICKS), (Blocks.END_STONE_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.END_STONE_BRICK_FENCE_GATE, (Blocks.END_STONE_BRICKS), (Blocks.END_STONE_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.END_STONE_BRICK_TRAPDOOR, (Blocks.END_STONE_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BRICK_PRESSURE_PLATE, (Blocks.END_STONE_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BRICK_BUTTON, Blocks.END_STONE_BRICKS, 1).offerTo(exporter);

        //purpur 
        ModRecipes.DoorRecipe(ModBlocks.PURPUR_DOOR, (Blocks.PURPUR_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPUR_FENCE, (Blocks.PURPUR_BLOCK), (Blocks.PURPUR_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPUR_FENCE_GATE, (Blocks.PURPUR_BLOCK), (Blocks.PURPUR_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPUR_TRAPDOOR, (Blocks.PURPUR_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_PRESSURE_PLATE, (Blocks.PURPUR_BLOCK)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_BUTTON, Blocks.PURPUR_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, (Blocks.PURPUR_BLOCK)).offerTo(exporter);

        //coal_block
        ModRecipes.DoorRecipe(ModBlocks.COAL_DOOR, (ModItems.COAL_BIT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_SLAB, (ModItems.COAL_BIT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.COAL_STAIRS, (ModItems.COAL_BIT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COAL_FENCE, (ModItems.COAL_BIT), (Items.COAL), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COAL_FENCE_GATE, (ModItems.COAL_BIT), (Items.COAL), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COAL_TRAPDOOR, (ModItems.COAL_BIT)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_PRESSURE_PLATE, (ModItems.COAL_BIT)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_BUTTON, ModItems.COAL_BIT).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_WALL, (Items.COAL)).offerTo(exporter);

        //iron_block
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_SLAB, (ModItems.IRON_BIT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.IRON_STAIRS, (ModItems.IRON_BIT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.IRON_FENCE, (ModItems.IRON_BIT), (Items.IRON_INGOT), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.IRON_FENCE_GATE, (ModItems.IRON_BIT), (Items.IRON_INGOT), 1).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_BUTTON, ModItems.IRON_BIT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_WALL, (Items.COAL)).offerTo(exporter);

        //gold_block
        ModRecipes.DoorRecipe(ModBlocks.GOLD_DOOR, (ModItems.GOLD_BIT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_SLAB, (ModItems.GOLD_BIT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GOLD_STAIRS, (ModItems.GOLD_BIT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GOLD_FENCE, (ModItems.GOLD_BIT), (Items.GOLD_INGOT), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GOLD_FENCE_GATE, (ModItems.GOLD_BIT), (Items.GOLD_INGOT), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GOLD_TRAPDOOR, (ModItems.GOLD_BIT)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BUTTON, ModItems.GOLD_BIT).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_WALL, (Items.GOLD_INGOT)).offerTo(exporter);

        //redstone_block
        ModRecipes.DoorRecipe(ModBlocks.REDSTONE_DOOR, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_SLAB, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.REDSTONE_STAIRS, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.REDSTONE_FENCE, (ModItems.REDSTONE_SHARD), (Items.REDSTONE), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.REDSTONE_FENCE_GATE, (ModItems.REDSTONE_SHARD), (Items.REDSTONE), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.REDSTONE_TRAPDOOR, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_PRESSURE_PLATE, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_BUTTON, ModItems.REDSTONE_SHARD, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_WALL, (Items.REDSTONE)).offerTo(exporter);

        //emerald_block
        ModRecipes.DoorRecipe(ModBlocks.EMERALD_DOOR, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_SLAB, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.EMERALD_STAIRS, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.EMERALD_FENCE, (ModItems.EMERALD_FRAGMENT), (Items.EMERALD), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.EMERALD_FENCE_GATE, (ModItems.EMERALD_FRAGMENT), (Items.EMERALD), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.EMERALD_TRAPDOOR, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_PRESSURE_PLATE, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_BUTTON, ModItems.EMERALD_FRAGMENT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_WALL, (Items.EMERALD)).offerTo(exporter);

        //lapis_block
        ModRecipes.DoorRecipe(ModBlocks.LAPIS_DOOR, (ModItems.LAPIS_BIT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_SLAB, (ModItems.LAPIS_BIT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LAPIS_STAIRS, (ModItems.LAPIS_BIT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LAPIS_FENCE, (ModItems.LAPIS_BIT), (Items.LAPIS_LAZULI), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LAPIS_FENCE_GATE, (ModItems.LAPIS_BIT), (Items.LAPIS_LAZULI), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LAPIS_TRAPDOOR, (ModItems.LAPIS_BIT)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_PRESSURE_PLATE, (ModItems.LAPIS_BIT)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_BUTTON, ModItems.LAPIS_BIT).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_WALL, (Items.LAPIS_LAZULI)).offerTo(exporter);

        //diamond_block
        ModRecipes.DoorRecipe(ModBlocks.DIAMOND_DOOR, (ModItems.DIAMOND_DUST)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_SLAB, (ModItems.DIAMOND_DUST)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DIAMOND_STAIRS, (ModItems.DIAMOND_DUST)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DIAMOND_FENCE, (ModItems.DIAMOND_DUST), (Items.DIAMOND), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DIAMOND_FENCE_GATE, (ModItems.DIAMOND_DUST), (Items.DIAMOND), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DIAMOND_TRAPDOOR, (ModItems.DIAMOND_DUST)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_PRESSURE_PLATE, (ModItems.DIAMOND_DUST)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_BUTTON, ModItems.DIAMOND_DUST, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_WALL, (Items.DIAMOND)).offerTo(exporter);

        //netherite_block
        ModRecipes.DoorRecipe(ModBlocks.NETHERITE_DOOR, (ModItems.NETHERITE_BIT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_SLAB, (ModItems.NETHERITE_BIT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.NETHERITE_STAIRS, (ModItems.NETHERITE_BIT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.NETHERITE_FENCE, (ModItems.NETHERITE_BIT), (Items.NETHERITE_INGOT), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.NETHERITE_FENCE_GATE, (ModItems.NETHERITE_BIT), (Items.NETHERITE_INGOT), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.NETHERITE_TRAPDOOR, (ModItems.NETHERITE_BIT)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_PRESSURE_PLATE, (ModItems.NETHERITE_BIT)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_BUTTON, ModItems.NETHERITE_BIT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_WALL, (Items.NETHERITE_INGOT)).offerTo(exporter);

        //quartz
        ModRecipes.DoorRecipe(ModBlocks.QUARTZ_DOOR, (Blocks.QUARTZ_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.QUARTZ_FENCE, (Blocks.QUARTZ_BLOCK), (Blocks.QUARTZ_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.QUARTZ_FENCE_GATE, (Blocks.QUARTZ_BLOCK), (Blocks.QUARTZ_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.QUARTZ_TRAPDOOR, (Blocks.QUARTZ_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_PRESSURE_PLATE, (Blocks.QUARTZ_BLOCK)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BUTTON, Blocks.QUARTZ_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, (Blocks.QUARTZ_BLOCK)).offerTo(exporter);

        //quartz brick
        ModRecipes.DoorRecipe(ModBlocks.QUARTZ_BRICK_DOOR, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_SLAB, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.QUARTZ_BRICK_STAIRS, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.QUARTZ_BRICK_FENCE, (Blocks.QUARTZ_BRICKS), (ModBlocks.QUARTZ_BRICK_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.QUARTZ_BRICK_FENCE_GATE, (Blocks.QUARTZ_BRICKS), (ModBlocks.QUARTZ_BRICK_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.QUARTZ_BRICK_TRAPDOOR, (ModBlocks.QUARTZ_BRICK_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_BUTTON, Blocks.QUARTZ_BRICKS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);

        //smooth_quartz
        ModRecipes.DoorRecipe(ModBlocks.SMOOTH_QUARTZ_DOOR, (Blocks.SMOOTH_QUARTZ)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SMOOTH_QUARTZ_FENCE, (Blocks.SMOOTH_QUARTZ), (Blocks.SMOOTH_QUARTZ_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SMOOTH_QUARTZ_FENCE_GATE, (Blocks.SMOOTH_QUARTZ), (Blocks.SMOOTH_QUARTZ_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR, (Blocks.SMOOTH_QUARTZ_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE, (Blocks.SMOOTH_QUARTZ)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_BUTTON, Blocks.SMOOTH_QUARTZ, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, (Blocks.SMOOTH_QUARTZ)).offerTo(exporter);

        //amethyst
        ModRecipes.DoorRecipe(ModBlocks.AMETHYST_DOOR, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_SLAB, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.AMETHYST_STAIRS, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.AMETHYST_FENCE, (Blocks.AMETHYST_BLOCK), (ModBlocks.AMETHYST_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.AMETHYST_FENCE_GATE, (Blocks.AMETHYST_BLOCK), (ModBlocks.AMETHYST_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.AMETHYST_TRAPDOOR, (ModBlocks.AMETHYST_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_PRESSURE_PLATE, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_BUTTON, Blocks.AMETHYST_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_WALL, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);



        //copper
        ModRecipes.DoorRecipe(ModBlocks.COPPER_DOOR, (ModItems.COPPER_BIT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_SLAB, (ModItems.COPPER_BIT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.COPPER_STAIRS, (ModItems.COPPER_BIT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COPPER_FENCE, (Items.COPPER_INGOT), (ModItems.COPPER_BIT), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COPPER_FENCE_GATE, (Items.COPPER_INGOT), (ModItems.COPPER_BIT), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COPPER_TRAPDOOR, (Items.COPPER_INGOT)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_PRESSURE_PLATE, (ModItems.COPPER_BIT)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_BUTTON, ModItems.COPPER_BIT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_WALL, (ModItems.COPPER_BIT)).offerTo(exporter);


        //exposed_copper
        ModRecipes.DoorRecipe(ModBlocks.EXPOSED_COPPER_DOOR, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_SLAB, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.EXPOSED_COPPER_STAIRS, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.EXPOSED_COPPER_FENCE, (Blocks.EXPOSED_COPPER), (ModBlocks.EXPOSED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.EXPOSED_COPPER_FENCE_GATE, (Blocks.EXPOSED_COPPER), (ModBlocks.EXPOSED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.EXPOSED_COPPER_TRAPDOOR, (ModBlocks.EXPOSED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_WALL, (Blocks.EXPOSED_COPPER)).offerTo(exporter);

        //weathered_copper
        ModRecipes.DoorRecipe(ModBlocks.WEATHERED_COPPER_DOOR, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_SLAB, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WEATHERED_COPPER_STAIRS, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WEATHERED_COPPER_FENCE, (Blocks.WEATHERED_COPPER), (ModBlocks.WEATHERED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WEATHERED_COPPER_FENCE_GATE, (Blocks.WEATHERED_COPPER), (ModBlocks.WEATHERED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WEATHERED_COPPER_TRAPDOOR, (ModBlocks.WEATHERED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_WALL, (Blocks.WEATHERED_COPPER)).offerTo(exporter);

        //oxidized_copper
        ModRecipes.DoorRecipe(ModBlocks.OXIDIZED_COPPER_DOOR, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_SLAB, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.OXIDIZED_COPPER_STAIRS, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.OXIDIZED_COPPER_FENCE, (Blocks.OXIDIZED_COPPER), (ModBlocks.OXIDIZED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, (Blocks.OXIDIZED_COPPER), (ModBlocks.OXIDIZED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.OXIDIZED_COPPER_TRAPDOOR, (ModBlocks.OXIDIZED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_WALL, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);

        //cut copper
        ModRecipes.DoorRecipe(ModBlocks.CUT_COPPER_DOOR, (Blocks.CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CUT_COPPER_FENCE, (Blocks.CUT_COPPER), (Blocks.CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CUT_COPPER_FENCE_GATE, (Blocks.CUT_COPPER), (Blocks.CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CUT_COPPER_TRAPDOOR, (Blocks.CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_PRESSURE_PLATE, (Blocks.CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_BUTTON, Blocks.CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_WALL, (Blocks.CUT_COPPER)).offerTo(exporter);


        //cut exposed_copper
        ModRecipes.DoorRecipe(ModBlocks.EXPOSED_CUT_COPPER_DOOR, (Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE, (Blocks.EXPOSED_CUT_COPPER), (Blocks.EXPOSED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, (Blocks.EXPOSED_CUT_COPPER), (Blocks.EXPOSED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, (Blocks.EXPOSED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, (Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_BUTTON, Blocks.EXPOSED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_WALL, (Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);

        //cut weathered_copper
        ModRecipes.DoorRecipe(ModBlocks.WEATHERED_CUT_COPPER_DOOR, (Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE, (Blocks.WEATHERED_CUT_COPPER), (Blocks.WEATHERED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, (Blocks.WEATHERED_CUT_COPPER), (Blocks.WEATHERED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, (Blocks.WEATHERED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_BUTTON, Blocks.WEATHERED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_WALL, (Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);

        //cut oxidized_copper
        ModRecipes.DoorRecipe(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, (Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, (Blocks.OXIDIZED_CUT_COPPER), (Blocks.OXIDIZED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, (Blocks.OXIDIZED_CUT_COPPER), (Blocks.OXIDIZED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR, (Blocks.OXIDIZED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE, (Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_BUTTON, Blocks.OXIDIZED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_WALL, (Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);


        //waxed copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_COPPER_DOOR, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_SLAB, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WAXED_COPPER_STAIRS, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_COPPER_FENCE, (Blocks.WAXED_COPPER_BLOCK), (ModBlocks.WAXED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_COPPER_FENCE_GATE, (Blocks.WAXED_COPPER_BLOCK), (ModBlocks.WAXED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_COPPER_TRAPDOOR, (ModBlocks.WAXED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_BUTTON, Blocks.WAXED_COPPER_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_WALL, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);

        //waxed exposed_copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_EXPOSED_COPPER_DOOR, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_SLAB, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_EXPOSED_COPPER_FENCE, (Blocks.WAXED_EXPOSED_COPPER), (ModBlocks.WAXED_EXPOSED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_COPPER), (ModBlocks.WAXED_EXPOSED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR, (ModBlocks.WAXED_EXPOSED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON, Blocks.WAXED_EXPOSED_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_WALL, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);

        //waxed weathered_copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_WEATHERED_COPPER_DOOR, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_SLAB, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_WEATHERED_COPPER_FENCE, (Blocks.WAXED_WEATHERED_COPPER), (ModBlocks.WAXED_WEATHERED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_COPPER), (ModBlocks.WAXED_WEATHERED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR, (ModBlocks.WAXED_WEATHERED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON, Blocks.WAXED_WEATHERED_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_WALL, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);

        //waxed oxidized_copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_COPPER), (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_COPPER), (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_WALL, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);

        //waxed cut copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_CUT_COPPER_DOOR, (Blocks.WAXED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_CUT_COPPER_FENCE, (Blocks.WAXED_CUT_COPPER), (Blocks.WAXED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_CUT_COPPER), (Blocks.WAXED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_BUTTON, Blocks.WAXED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_WALL, (Blocks.WAXED_CUT_COPPER)).offerTo(exporter);

        //waxed cut exposed_copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR, (Blocks.WAXED_EXPOSED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE, (Blocks.WAXED_EXPOSED_CUT_COPPER), (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_CUT_COPPER), (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_EXPOSED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON, Blocks.WAXED_EXPOSED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL, (Blocks.WAXED_EXPOSED_CUT_COPPER)).offerTo(exporter);

        //waxed cut weathered_copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR, (Blocks.WAXED_WEATHERED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE, (Blocks.WAXED_WEATHERED_CUT_COPPER), (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_CUT_COPPER), (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_WEATHERED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON, Blocks.WAXED_WEATHERED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL, (Blocks.WAXED_WEATHERED_CUT_COPPER)).offerTo(exporter);

        //waxed cut oxidized_copper
        ModRecipes.DoorRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR, (Blocks.WAXED_OXIDIZED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_CUT_COPPER), (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_CUT_COPPER), (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_OXIDIZED_CUT_COPPER)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_CUT_COPPER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL, (Blocks.WAXED_OXIDIZED_CUT_COPPER)).offerTo(exporter);

        //white_wool
        ModRecipes.DoorRecipe(ModBlocks.WHITE_WOOL_DOOR, (Blocks.WHITE_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_SLAB, (Blocks.WHITE_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WHITE_WOOL_STAIRS, (Blocks.WHITE_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WHITE_WOOL_FENCE, (Blocks.WHITE_WOOL), (ModBlocks.WHITE_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WHITE_WOOL_FENCE_GATE, (Blocks.WHITE_WOOL), (ModBlocks.WHITE_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WHITE_WOOL_TRAPDOOR, (ModBlocks.WHITE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_PRESSURE_PLATE, (ModBlocks.WHITE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_BUTTON, Blocks.WHITE_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_WALL, (Blocks.WHITE_WOOL)).offerTo(exporter);

        //light_gray_wool
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_GRAY_WOOL_DOOR, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE, (Blocks.LIGHT_GRAY_WOOL), (ModBlocks.LIGHT_GRAY_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE, (Blocks.LIGHT_GRAY_WOOL), (ModBlocks.LIGHT_GRAY_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR, (ModBlocks.LIGHT_GRAY_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_BUTTON, Blocks.LIGHT_GRAY_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_WALL, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);

        //gray_wool
        ModRecipes.DoorRecipe(ModBlocks.GRAY_WOOL_DOOR, (Blocks.GRAY_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_SLAB, (Blocks.GRAY_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAY_WOOL_STAIRS, (Blocks.GRAY_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAY_WOOL_FENCE, (Blocks.GRAY_WOOL), (ModBlocks.GRAY_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAY_WOOL_FENCE_GATE, (Blocks.GRAY_WOOL), (ModBlocks.GRAY_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAY_WOOL_TRAPDOOR, (ModBlocks.GRAY_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_PRESSURE_PLATE, (ModBlocks.GRAY_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_BUTTON, Blocks.GRAY_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_WALL, (Blocks.GRAY_WOOL)).offerTo(exporter);

        //black_wool
        ModRecipes.DoorRecipe(ModBlocks.BLACK_WOOL_DOOR, (Blocks.BLACK_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_SLAB, (Blocks.BLACK_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLACK_WOOL_STAIRS, (Blocks.BLACK_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACK_WOOL_FENCE, (Blocks.BLACK_WOOL), (ModBlocks.BLACK_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACK_WOOL_FENCE_GATE, (Blocks.BLACK_WOOL), (ModBlocks.BLACK_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACK_WOOL_TRAPDOOR, (ModBlocks.BLACK_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_PRESSURE_PLATE, (ModBlocks.BLACK_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_BUTTON, Blocks.BLACK_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_WALL, (Blocks.BLACK_WOOL)).offerTo(exporter);

        //brown_wool
        ModRecipes.DoorRecipe(ModBlocks.BROWN_WOOL_DOOR, (Blocks.BROWN_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_SLAB, (Blocks.BROWN_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BROWN_WOOL_STAIRS, (Blocks.BROWN_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BROWN_WOOL_FENCE, (Blocks.BROWN_WOOL), (ModBlocks.BROWN_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BROWN_WOOL_FENCE_GATE, (Blocks.BROWN_WOOL), (ModBlocks.BROWN_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BROWN_WOOL_TRAPDOOR, (ModBlocks.BROWN_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_PRESSURE_PLATE, (ModBlocks.BROWN_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_BUTTON, Blocks.BROWN_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_WALL, (Blocks.BROWN_WOOL)).offerTo(exporter);

        //red_wool
        ModRecipes.DoorRecipe(ModBlocks.RED_WOOL_DOOR, (Blocks.RED_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_SLAB, (Blocks.RED_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_WOOL_STAIRS, (Blocks.RED_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_WOOL_FENCE, (Blocks.RED_WOOL), (ModBlocks.RED_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_WOOL_FENCE_GATE, (Blocks.RED_WOOL), (ModBlocks.RED_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_WOOL_TRAPDOOR, (ModBlocks.RED_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_PRESSURE_PLATE, (ModBlocks.RED_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_BUTTON, Blocks.RED_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_WALL, (Blocks.RED_WOOL)).offerTo(exporter);

        //orange_wool
        ModRecipes.DoorRecipe(ModBlocks.ORANGE_WOOL_DOOR, (Blocks.ORANGE_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_SLAB, (Blocks.ORANGE_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ORANGE_WOOL_STAIRS, (Blocks.ORANGE_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ORANGE_WOOL_FENCE, (Blocks.ORANGE_WOOL), (ModBlocks.ORANGE_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ORANGE_WOOL_FENCE_GATE, (Blocks.ORANGE_WOOL), (ModBlocks.ORANGE_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ORANGE_WOOL_TRAPDOOR, (ModBlocks.ORANGE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_PRESSURE_PLATE, (ModBlocks.ORANGE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_BUTTON, Blocks.ORANGE_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_WALL, (Blocks.ORANGE_WOOL)).offerTo(exporter);

        //yellow_wool
        ModRecipes.DoorRecipe(ModBlocks.YELLOW_WOOL_DOOR, (Blocks.YELLOW_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_SLAB, (Blocks.YELLOW_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.YELLOW_WOOL_STAIRS, (Blocks.YELLOW_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.YELLOW_WOOL_FENCE, (Blocks.YELLOW_WOOL), (ModBlocks.YELLOW_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.YELLOW_WOOL_FENCE_GATE, (Blocks.YELLOW_WOOL), (ModBlocks.YELLOW_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.YELLOW_WOOL_TRAPDOOR, (ModBlocks.YELLOW_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_PRESSURE_PLATE, (ModBlocks.YELLOW_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_BUTTON, Blocks.YELLOW_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_WALL, (Blocks.YELLOW_WOOL)).offerTo(exporter);

        //lime_wool
        ModRecipes.DoorRecipe(ModBlocks.LIME_WOOL_DOOR, (Blocks.LIME_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_SLAB, (Blocks.LIME_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIME_WOOL_STAIRS, (Blocks.LIME_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIME_WOOL_FENCE, (Blocks.LIME_WOOL), (ModBlocks.LIME_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIME_WOOL_FENCE_GATE, (Blocks.LIME_WOOL), (ModBlocks.LIME_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIME_WOOL_TRAPDOOR, (ModBlocks.LIME_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_PRESSURE_PLATE, (ModBlocks.LIME_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_BUTTON, Blocks.LIME_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_WALL, (Blocks.LIME_WOOL)).offerTo(exporter);

        //green_wool
        ModRecipes.DoorRecipe(ModBlocks.GREEN_WOOL_DOOR, (Blocks.GREEN_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_SLAB, (Blocks.GREEN_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GREEN_WOOL_STAIRS, (Blocks.GREEN_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GREEN_WOOL_FENCE, (Blocks.GREEN_WOOL), (ModBlocks.GREEN_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GREEN_WOOL_FENCE_GATE, (Blocks.GREEN_WOOL), (ModBlocks.GREEN_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GREEN_WOOL_TRAPDOOR, (ModBlocks.GREEN_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_PRESSURE_PLATE, (ModBlocks.GREEN_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_BUTTON, Blocks.GREEN_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_WALL, (Blocks.GREEN_WOOL)).offerTo(exporter);

        //cyan_wool
        ModRecipes.DoorRecipe(ModBlocks.CYAN_WOOL_DOOR, (Blocks.CYAN_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_SLAB, (Blocks.CYAN_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CYAN_WOOL_STAIRS, (Blocks.CYAN_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CYAN_WOOL_FENCE, (Blocks.CYAN_WOOL), (ModBlocks.CYAN_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CYAN_WOOL_FENCE_GATE, (Blocks.CYAN_WOOL), (ModBlocks.CYAN_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CYAN_WOOL_TRAPDOOR, (ModBlocks.CYAN_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_PRESSURE_PLATE, (ModBlocks.CYAN_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_BUTTON, Blocks.CYAN_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_WALL, (Blocks.CYAN_WOOL)).offerTo(exporter);

        //blue_wool
        ModRecipes.DoorRecipe(ModBlocks.BLUE_WOOL_DOOR, (Blocks.BLUE_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_SLAB, (Blocks.BLUE_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_WOOL_STAIRS, (Blocks.BLUE_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_WOOL_FENCE, (Blocks.BLUE_WOOL), (ModBlocks.BLUE_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_WOOL_FENCE_GATE, (Blocks.BLUE_WOOL), (ModBlocks.BLUE_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_WOOL_TRAPDOOR, (ModBlocks.BLUE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_PRESSURE_PLATE, (ModBlocks.BLUE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_BUTTON, Blocks.BLUE_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_WALL, (Blocks.BLUE_WOOL)).offerTo(exporter);

        //light_blue_wool
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_BLUE_WOOL_DOOR, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE, (Blocks.LIGHT_BLUE_WOOL), (ModBlocks.LIGHT_BLUE_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE, (Blocks.LIGHT_BLUE_WOOL), (ModBlocks.LIGHT_BLUE_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR, (ModBlocks.LIGHT_BLUE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_BUTTON, Blocks.LIGHT_BLUE_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_WALL, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);

        //purple_wool
        ModRecipes.DoorRecipe(ModBlocks.PURPLE_WOOL_DOOR, (Blocks.PURPLE_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_SLAB, (Blocks.PURPLE_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PURPLE_WOOL_STAIRS, (Blocks.PURPLE_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPLE_WOOL_FENCE, (Blocks.PURPLE_WOOL), (ModBlocks.PURPLE_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPLE_WOOL_FENCE_GATE, (Blocks.PURPLE_WOOL), (ModBlocks.PURPLE_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPLE_WOOL_TRAPDOOR, (ModBlocks.PURPLE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_PRESSURE_PLATE, (ModBlocks.PURPLE_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_BUTTON, Blocks.PURPLE_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_WALL, (Blocks.PURPLE_WOOL)).offerTo(exporter);

        //magenta_wool
        ModRecipes.DoorRecipe(ModBlocks.MAGENTA_WOOL_DOOR, (Blocks.MAGENTA_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_SLAB, (Blocks.MAGENTA_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGENTA_WOOL_STAIRS, (Blocks.MAGENTA_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGENTA_WOOL_FENCE, (Blocks.MAGENTA_WOOL), (ModBlocks.MAGENTA_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGENTA_WOOL_FENCE_GATE, (Blocks.MAGENTA_WOOL), (ModBlocks.MAGENTA_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGENTA_WOOL_TRAPDOOR, (ModBlocks.MAGENTA_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE, (ModBlocks.MAGENTA_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_BUTTON, Blocks.MAGENTA_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_WALL, (Blocks.MAGENTA_WOOL)).offerTo(exporter);

        //pink_wool
        ModRecipes.DoorRecipe(ModBlocks.PINK_WOOL_DOOR, (Blocks.PINK_WOOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_SLAB, (Blocks.PINK_WOOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PINK_WOOL_STAIRS, (Blocks.PINK_WOOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PINK_WOOL_FENCE, (Blocks.PINK_WOOL), (ModBlocks.PINK_WOOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PINK_WOOL_FENCE_GATE, (Blocks.PINK_WOOL), (ModBlocks.PINK_WOOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PINK_WOOL_TRAPDOOR, (ModBlocks.PINK_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_PRESSURE_PLATE, (ModBlocks.PINK_WOOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_BUTTON, Blocks.PINK_WOOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_WALL, (Blocks.PINK_WOOL)).offerTo(exporter);

        //terracotta
        ModRecipes.DoorRecipe(ModBlocks.TERRACOTTA_DOOR, (Blocks.TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_SLAB, (Blocks.TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.TERRACOTTA_STAIRS, (Blocks.TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.TERRACOTTA_FENCE, (Blocks.TERRACOTTA), (ModBlocks.TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.TERRACOTTA_FENCE_GATE, (Blocks.TERRACOTTA), (ModBlocks.TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.TERRACOTTA_TRAPDOOR, (ModBlocks.TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_PRESSURE_PLATE, (ModBlocks.TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_BUTTON, Blocks.TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, (Blocks.TERRACOTTA)).offerTo(exporter);

        //white_terracotta
        ModRecipes.DoorRecipe(ModBlocks.WHITE_TERRACOTTA_DOOR, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_SLAB, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WHITE_TERRACOTTA_STAIRS, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE, (Blocks.WHITE_TERRACOTTA), (ModBlocks.WHITE_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE, (Blocks.WHITE_TERRACOTTA), (ModBlocks.WHITE_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR, (ModBlocks.WHITE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.WHITE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_BUTTON, Blocks.WHITE_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_WALL, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);

        //light_gray_terracotta
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE, (Blocks.LIGHT_GRAY_TERRACOTTA), (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_GRAY_TERRACOTTA), (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON, Blocks.LIGHT_GRAY_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);

        //gray_terracotta
        ModRecipes.DoorRecipe(ModBlocks.GRAY_TERRACOTTA_DOOR, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_SLAB, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAY_TERRACOTTA_STAIRS, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE, (Blocks.GRAY_TERRACOTTA), (ModBlocks.GRAY_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE, (Blocks.GRAY_TERRACOTTA), (ModBlocks.GRAY_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR, (ModBlocks.GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_BUTTON, Blocks.GRAY_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_WALL, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);

        //black_terracotta
        ModRecipes.DoorRecipe(ModBlocks.BLACK_TERRACOTTA_DOOR, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_SLAB, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLACK_TERRACOTTA_STAIRS, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE, (Blocks.BLACK_TERRACOTTA), (ModBlocks.BLACK_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE, (Blocks.BLACK_TERRACOTTA), (ModBlocks.BLACK_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR, (ModBlocks.BLACK_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLACK_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_BUTTON, Blocks.BLACK_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_WALL, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);

        //brown_terracotta
        ModRecipes.DoorRecipe(ModBlocks.BROWN_TERRACOTTA_DOOR, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_SLAB, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BROWN_TERRACOTTA_STAIRS, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE, (Blocks.BROWN_TERRACOTTA), (ModBlocks.BROWN_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE, (Blocks.BROWN_TERRACOTTA), (ModBlocks.BROWN_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR, (ModBlocks.BROWN_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BROWN_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_BUTTON, Blocks.BROWN_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_WALL, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);

        //red_terracotta
        ModRecipes.DoorRecipe(ModBlocks.RED_TERRACOTTA_DOOR, (Blocks.RED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_SLAB, (Blocks.RED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_TERRACOTTA_STAIRS, (Blocks.RED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_TERRACOTTA_FENCE, (Blocks.RED_TERRACOTTA), (ModBlocks.RED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_TERRACOTTA_FENCE_GATE, (Blocks.RED_TERRACOTTA), (ModBlocks.RED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_TERRACOTTA_TRAPDOOR, (ModBlocks.RED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.RED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_BUTTON, Blocks.RED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_WALL, (Blocks.RED_TERRACOTTA)).offerTo(exporter);

        //orange_terracotta
        ModRecipes.DoorRecipe(ModBlocks.ORANGE_TERRACOTTA_DOOR, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_SLAB, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ORANGE_TERRACOTTA_STAIRS, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE, (Blocks.ORANGE_TERRACOTTA), (ModBlocks.ORANGE_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE, (Blocks.ORANGE_TERRACOTTA), (ModBlocks.ORANGE_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR, (ModBlocks.ORANGE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.ORANGE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_BUTTON, Blocks.ORANGE_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_WALL, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);

        //yellow_terracotta
        ModRecipes.DoorRecipe(ModBlocks.YELLOW_TERRACOTTA_DOOR, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_SLAB, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.YELLOW_TERRACOTTA_STAIRS, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE, (Blocks.YELLOW_TERRACOTTA), (ModBlocks.YELLOW_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE, (Blocks.YELLOW_TERRACOTTA), (ModBlocks.YELLOW_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR, (ModBlocks.YELLOW_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.YELLOW_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_BUTTON, Blocks.YELLOW_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_WALL, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);

        //lime_terracotta
        ModRecipes.DoorRecipe(ModBlocks.LIME_TERRACOTTA_DOOR, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_SLAB, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIME_TERRACOTTA_STAIRS, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIME_TERRACOTTA_FENCE, (Blocks.LIME_TERRACOTTA), (ModBlocks.LIME_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIME_TERRACOTTA_FENCE_GATE, (Blocks.LIME_TERRACOTTA), (ModBlocks.LIME_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIME_TERRACOTTA_TRAPDOOR, (ModBlocks.LIME_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIME_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_BUTTON, Blocks.LIME_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_WALL, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);

        //green_terracotta
        ModRecipes.DoorRecipe(ModBlocks.GREEN_TERRACOTTA_DOOR, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_SLAB, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GREEN_TERRACOTTA_STAIRS, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE, (Blocks.GREEN_TERRACOTTA), (ModBlocks.GREEN_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE, (Blocks.GREEN_TERRACOTTA), (ModBlocks.GREEN_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR, (ModBlocks.GREEN_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GREEN_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_BUTTON, Blocks.GREEN_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_WALL, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);

        //cyan_terracotta
        ModRecipes.DoorRecipe(ModBlocks.CYAN_TERRACOTTA_DOOR, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_SLAB, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CYAN_TERRACOTTA_STAIRS, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE, (Blocks.CYAN_TERRACOTTA), (ModBlocks.CYAN_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE, (Blocks.CYAN_TERRACOTTA), (ModBlocks.CYAN_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR, (ModBlocks.CYAN_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.CYAN_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_BUTTON, Blocks.CYAN_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_WALL, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);

        //blue_terracotta
        ModRecipes.DoorRecipe(ModBlocks.BLUE_TERRACOTTA_DOOR, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_SLAB, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_TERRACOTTA_STAIRS, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE, (Blocks.BLUE_TERRACOTTA), (ModBlocks.BLUE_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE, (Blocks.BLUE_TERRACOTTA), (ModBlocks.BLUE_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR, (ModBlocks.BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_BUTTON, Blocks.BLUE_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_WALL, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);

        //light_blue_terracotta
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE, (Blocks.LIGHT_BLUE_TERRACOTTA), (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_BLUE_TERRACOTTA), (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON, Blocks.LIGHT_BLUE_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);

        //purple_terracotta
        ModRecipes.DoorRecipe(ModBlocks.PURPLE_TERRACOTTA_DOOR, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_SLAB, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PURPLE_TERRACOTTA_STAIRS, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE, (Blocks.PURPLE_TERRACOTTA), (ModBlocks.PURPLE_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE, (Blocks.PURPLE_TERRACOTTA), (ModBlocks.PURPLE_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR, (ModBlocks.PURPLE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PURPLE_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_BUTTON, Blocks.PURPLE_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_WALL, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);

        //magenta_terracotta
        ModRecipes.DoorRecipe(ModBlocks.MAGENTA_TERRACOTTA_DOOR, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE, (Blocks.MAGENTA_TERRACOTTA), (ModBlocks.MAGENTA_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE, (Blocks.MAGENTA_TERRACOTTA), (ModBlocks.MAGENTA_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR, (ModBlocks.MAGENTA_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.MAGENTA_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_BUTTON, Blocks.MAGENTA_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_WALL, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);

        //pink_terracotta
        ModRecipes.DoorRecipe(ModBlocks.PINK_TERRACOTTA_DOOR, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_SLAB, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PINK_TERRACOTTA_STAIRS, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PINK_TERRACOTTA_FENCE, (Blocks.PINK_TERRACOTTA), (ModBlocks.PINK_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PINK_TERRACOTTA_FENCE_GATE, (Blocks.PINK_TERRACOTTA), (ModBlocks.PINK_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PINK_TERRACOTTA_TRAPDOOR, (ModBlocks.PINK_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PINK_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_BUTTON, Blocks.PINK_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_WALL, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);

        //white_concrete
        ModRecipes.DoorRecipe(ModBlocks.WHITE_CONCRETE_DOOR, (Blocks.WHITE_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_SLAB, (Blocks.WHITE_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WHITE_CONCRETE_STAIRS, (Blocks.WHITE_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WHITE_CONCRETE_FENCE, (Blocks.WHITE_CONCRETE), (ModBlocks.WHITE_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WHITE_CONCRETE_FENCE_GATE, (Blocks.WHITE_CONCRETE), (ModBlocks.WHITE_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WHITE_CONCRETE_TRAPDOOR, (ModBlocks.WHITE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, (ModBlocks.WHITE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_WALL, (Blocks.WHITE_CONCRETE)).offerTo(exporter);

        //light_gray_concrete
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, (Blocks.LIGHT_GRAY_CONCRETE), (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, (Blocks.LIGHT_GRAY_CONCRETE), (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR, (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);

        //gray_concrete
        ModRecipes.DoorRecipe(ModBlocks.GRAY_CONCRETE_DOOR, (Blocks.GRAY_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_SLAB, (Blocks.GRAY_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAY_CONCRETE_STAIRS, (Blocks.GRAY_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAY_CONCRETE_FENCE, (Blocks.GRAY_CONCRETE), (ModBlocks.GRAY_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAY_CONCRETE_FENCE_GATE, (Blocks.GRAY_CONCRETE), (ModBlocks.GRAY_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAY_CONCRETE_TRAPDOOR, (ModBlocks.GRAY_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, (ModBlocks.GRAY_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_WALL, (Blocks.GRAY_CONCRETE)).offerTo(exporter);

        //black_concrete
        ModRecipes.DoorRecipe(ModBlocks.BLACK_CONCRETE_DOOR, (Blocks.BLACK_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_SLAB, (Blocks.BLACK_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLACK_CONCRETE_STAIRS, (Blocks.BLACK_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACK_CONCRETE_FENCE, (Blocks.BLACK_CONCRETE), (ModBlocks.BLACK_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACK_CONCRETE_FENCE_GATE, (Blocks.BLACK_CONCRETE), (ModBlocks.BLACK_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACK_CONCRETE_TRAPDOOR, (ModBlocks.BLACK_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, (ModBlocks.BLACK_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_WALL, (Blocks.BLACK_CONCRETE)).offerTo(exporter);

        //brown_concrete
        ModRecipes.DoorRecipe(ModBlocks.BROWN_CONCRETE_DOOR, (Blocks.BROWN_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_SLAB, (Blocks.BROWN_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BROWN_CONCRETE_STAIRS, (Blocks.BROWN_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BROWN_CONCRETE_FENCE, (Blocks.BROWN_CONCRETE), (ModBlocks.BROWN_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BROWN_CONCRETE_FENCE_GATE, (Blocks.BROWN_CONCRETE), (ModBlocks.BROWN_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BROWN_CONCRETE_TRAPDOOR, (ModBlocks.BROWN_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, (ModBlocks.BROWN_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_WALL, (Blocks.BROWN_CONCRETE)).offerTo(exporter);

        //red_concrete
        ModRecipes.DoorRecipe(ModBlocks.RED_CONCRETE_DOOR, (Blocks.RED_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_SLAB, (Blocks.RED_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_CONCRETE_STAIRS, (Blocks.RED_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_CONCRETE_FENCE, (Blocks.RED_CONCRETE), (ModBlocks.RED_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_CONCRETE_FENCE_GATE, (Blocks.RED_CONCRETE), (ModBlocks.RED_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_CONCRETE_TRAPDOOR, (ModBlocks.RED_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, (ModBlocks.RED_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_WALL, (Blocks.RED_CONCRETE)).offerTo(exporter);

        //orange_concrete
        ModRecipes.DoorRecipe(ModBlocks.ORANGE_CONCRETE_DOOR, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_SLAB, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ORANGE_CONCRETE_STAIRS, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ORANGE_CONCRETE_FENCE, (Blocks.ORANGE_CONCRETE), (ModBlocks.ORANGE_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ORANGE_CONCRETE_FENCE_GATE, (Blocks.ORANGE_CONCRETE), (ModBlocks.ORANGE_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ORANGE_CONCRETE_TRAPDOOR, (ModBlocks.ORANGE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, (ModBlocks.ORANGE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_WALL, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);

        //yellow_concrete
        ModRecipes.DoorRecipe(ModBlocks.YELLOW_CONCRETE_DOOR, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_SLAB, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.YELLOW_CONCRETE_STAIRS, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.YELLOW_CONCRETE_FENCE, (Blocks.YELLOW_CONCRETE), (ModBlocks.YELLOW_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.YELLOW_CONCRETE_FENCE_GATE, (Blocks.YELLOW_CONCRETE), (ModBlocks.YELLOW_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.YELLOW_CONCRETE_TRAPDOOR, (ModBlocks.YELLOW_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, (ModBlocks.YELLOW_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_WALL, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);

        //lime_concrete
        ModRecipes.DoorRecipe(ModBlocks.LIME_CONCRETE_DOOR, (Blocks.LIME_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_SLAB, (Blocks.LIME_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIME_CONCRETE_STAIRS, (Blocks.LIME_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIME_CONCRETE_FENCE, (Blocks.LIME_CONCRETE), (ModBlocks.LIME_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIME_CONCRETE_FENCE_GATE, (Blocks.LIME_CONCRETE), (ModBlocks.LIME_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIME_CONCRETE_TRAPDOOR, (ModBlocks.LIME_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIME_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_WALL, (Blocks.LIME_CONCRETE)).offerTo(exporter);

        //green_concrete
        ModRecipes.DoorRecipe(ModBlocks.GREEN_CONCRETE_DOOR, (Blocks.GREEN_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_SLAB, (Blocks.GREEN_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GREEN_CONCRETE_STAIRS, (Blocks.GREEN_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GREEN_CONCRETE_FENCE, (Blocks.GREEN_CONCRETE), (ModBlocks.GREEN_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GREEN_CONCRETE_FENCE_GATE, (Blocks.GREEN_CONCRETE), (ModBlocks.GREEN_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GREEN_CONCRETE_TRAPDOOR, (ModBlocks.GREEN_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, (ModBlocks.GREEN_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_WALL, (Blocks.GREEN_CONCRETE)).offerTo(exporter);

        //cyan_concrete
        ModRecipes.DoorRecipe(ModBlocks.CYAN_CONCRETE_DOOR, (Blocks.CYAN_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_SLAB, (Blocks.CYAN_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CYAN_CONCRETE_STAIRS, (Blocks.CYAN_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CYAN_CONCRETE_FENCE, (Blocks.CYAN_CONCRETE), (ModBlocks.CYAN_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CYAN_CONCRETE_FENCE_GATE, (Blocks.CYAN_CONCRETE), (ModBlocks.CYAN_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CYAN_CONCRETE_TRAPDOOR, (ModBlocks.CYAN_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, (ModBlocks.CYAN_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_WALL, (Blocks.CYAN_CONCRETE)).offerTo(exporter);

        //blue_concrete
        ModRecipes.DoorRecipe(ModBlocks.BLUE_CONCRETE_DOOR, (Blocks.BLUE_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_SLAB, (Blocks.BLUE_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_CONCRETE_STAIRS, (Blocks.BLUE_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_CONCRETE_FENCE, (Blocks.BLUE_CONCRETE), (ModBlocks.BLUE_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_CONCRETE_FENCE_GATE, (Blocks.BLUE_CONCRETE), (ModBlocks.BLUE_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_CONCRETE_TRAPDOOR, (ModBlocks.BLUE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, (ModBlocks.BLUE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_WALL, (Blocks.BLUE_CONCRETE)).offerTo(exporter);

        //light_blue_concrete
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, (Blocks.LIGHT_BLUE_CONCRETE), (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, (Blocks.LIGHT_BLUE_CONCRETE), (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR, (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);

        //purple_concrete
        ModRecipes.DoorRecipe(ModBlocks.PURPLE_CONCRETE_DOOR, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_SLAB, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PURPLE_CONCRETE_STAIRS, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPLE_CONCRETE_FENCE, (Blocks.PURPLE_CONCRETE), (ModBlocks.PURPLE_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPLE_CONCRETE_FENCE_GATE, (Blocks.PURPLE_CONCRETE), (ModBlocks.PURPLE_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPLE_CONCRETE_TRAPDOOR, (ModBlocks.PURPLE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, (ModBlocks.PURPLE_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_WALL, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);

        //magenta_concrete
        ModRecipes.DoorRecipe(ModBlocks.MAGENTA_CONCRETE_DOOR, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_SLAB, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGENTA_CONCRETE_STAIRS, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGENTA_CONCRETE_FENCE, (Blocks.MAGENTA_CONCRETE), (ModBlocks.MAGENTA_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, (Blocks.MAGENTA_CONCRETE), (ModBlocks.MAGENTA_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR, (ModBlocks.MAGENTA_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, (ModBlocks.MAGENTA_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_WALL, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);

        //pink_concrete
        ModRecipes.DoorRecipe(ModBlocks.PINK_CONCRETE_DOOR, (Blocks.PINK_CONCRETE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_SLAB, (Blocks.PINK_CONCRETE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PINK_CONCRETE_STAIRS, (Blocks.PINK_CONCRETE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PINK_CONCRETE_FENCE, (Blocks.PINK_CONCRETE), (ModBlocks.PINK_CONCRETE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PINK_CONCRETE_FENCE_GATE, (Blocks.PINK_CONCRETE), (ModBlocks.PINK_CONCRETE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PINK_CONCRETE_TRAPDOOR, (ModBlocks.PINK_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, (ModBlocks.PINK_CONCRETE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_WALL, (Blocks.PINK_CONCRETE)).offerTo(exporter);

        //white_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.WHITE_CONCRETE_POWDER_DOOR, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_SLAB, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WHITE_CONCRETE_POWDER_STAIRS, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WHITE_CONCRETE_POWDER_FENCE, (Blocks.WHITE_CONCRETE_POWDER), (ModBlocks.WHITE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WHITE_CONCRETE_POWDER_FENCE_GATE, (Blocks.WHITE_CONCRETE_POWDER), (ModBlocks.WHITE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.WHITE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.WHITE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_BUTTON, Blocks.WHITE_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_WALL, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);

        //light_gray_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE, (Blocks.LIGHT_GRAY_CONCRETE_POWDER), (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIGHT_GRAY_CONCRETE_POWDER), (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON, Blocks.LIGHT_GRAY_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);

        //gray_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.GRAY_CONCRETE_POWDER_DOOR, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_SLAB, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAY_CONCRETE_POWDER_STAIRS, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAY_CONCRETE_POWDER_FENCE, (Blocks.GRAY_CONCRETE_POWDER), (ModBlocks.GRAY_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAY_CONCRETE_POWDER_FENCE_GATE, (Blocks.GRAY_CONCRETE_POWDER), (ModBlocks.GRAY_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_BUTTON, Blocks.GRAY_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_WALL, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);

        //black_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.BLACK_CONCRETE_POWDER_DOOR, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_SLAB, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLACK_CONCRETE_POWDER_STAIRS, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACK_CONCRETE_POWDER_FENCE, (Blocks.BLACK_CONCRETE_POWDER), (ModBlocks.BLACK_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACK_CONCRETE_POWDER_FENCE_GATE, (Blocks.BLACK_CONCRETE_POWDER), (ModBlocks.BLACK_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BLACK_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BLACK_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_BUTTON, Blocks.BLACK_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_WALL, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);

        //brown_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.BROWN_CONCRETE_POWDER_DOOR, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_SLAB, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BROWN_CONCRETE_POWDER_STAIRS, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BROWN_CONCRETE_POWDER_FENCE, (Blocks.BROWN_CONCRETE_POWDER), (ModBlocks.BROWN_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BROWN_CONCRETE_POWDER_FENCE_GATE, (Blocks.BROWN_CONCRETE_POWDER), (ModBlocks.BROWN_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BROWN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BROWN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_BUTTON, Blocks.BROWN_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_WALL, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);

        //red_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.RED_CONCRETE_POWDER_DOOR, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_SLAB, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_CONCRETE_POWDER_STAIRS, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_CONCRETE_POWDER_FENCE, (Blocks.RED_CONCRETE_POWDER), (ModBlocks.RED_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_CONCRETE_POWDER_FENCE_GATE, (Blocks.RED_CONCRETE_POWDER), (ModBlocks.RED_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.RED_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.RED_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_BUTTON, Blocks.RED_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_WALL, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);

        //orange_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_SLAB, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_STAIRS, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE, (Blocks.ORANGE_CONCRETE_POWDER), (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE_GATE, (Blocks.ORANGE_CONCRETE_POWDER), (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_BUTTON, Blocks.ORANGE_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_WALL, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);

        //yellow_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_SLAB, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_STAIRS, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE, (Blocks.YELLOW_CONCRETE_POWDER), (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE_GATE, (Blocks.YELLOW_CONCRETE_POWDER), (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_BUTTON, Blocks.YELLOW_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_WALL, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);

        //lime_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.LIME_CONCRETE_POWDER_DOOR, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_SLAB, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIME_CONCRETE_POWDER_STAIRS, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIME_CONCRETE_POWDER_FENCE, (Blocks.LIME_CONCRETE_POWDER), (ModBlocks.LIME_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIME_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIME_CONCRETE_POWDER), (ModBlocks.LIME_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIME_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIME_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_BUTTON, Blocks.LIME_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_WALL, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);

        //green_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.GREEN_CONCRETE_POWDER_DOOR, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_SLAB, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GREEN_CONCRETE_POWDER_STAIRS, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GREEN_CONCRETE_POWDER_FENCE, (Blocks.GREEN_CONCRETE_POWDER), (ModBlocks.GREEN_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GREEN_CONCRETE_POWDER_FENCE_GATE, (Blocks.GREEN_CONCRETE_POWDER), (ModBlocks.GREEN_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.GREEN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.GREEN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_BUTTON, Blocks.GREEN_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_WALL, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);

        //cyan_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.CYAN_CONCRETE_POWDER_DOOR, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_SLAB, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CYAN_CONCRETE_POWDER_STAIRS, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CYAN_CONCRETE_POWDER_FENCE, (Blocks.CYAN_CONCRETE_POWDER), (ModBlocks.CYAN_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CYAN_CONCRETE_POWDER_FENCE_GATE, (Blocks.CYAN_CONCRETE_POWDER), (ModBlocks.CYAN_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.CYAN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.CYAN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_BUTTON, Blocks.CYAN_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_WALL, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);

        //blue_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.BLUE_CONCRETE_POWDER_DOOR, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_SLAB, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_CONCRETE_POWDER_STAIRS, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_CONCRETE_POWDER_FENCE, (Blocks.BLUE_CONCRETE_POWDER), (ModBlocks.BLUE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_CONCRETE_POWDER_FENCE_GATE, (Blocks.BLUE_CONCRETE_POWDER), (ModBlocks.BLUE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_BUTTON, Blocks.BLUE_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_WALL, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);

        //light_blue_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE, (Blocks.LIGHT_BLUE_CONCRETE_POWDER), (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIGHT_BLUE_CONCRETE_POWDER), (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON, Blocks.LIGHT_BLUE_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);

        //purple_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_SLAB, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_STAIRS, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE, (Blocks.PURPLE_CONCRETE_POWDER), (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE_GATE, (Blocks.PURPLE_CONCRETE_POWDER), (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_BUTTON, Blocks.PURPLE_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_WALL, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);

        //magenta_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_STAIRS, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE, (Blocks.MAGENTA_CONCRETE_POWDER), (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE_GATE, (Blocks.MAGENTA_CONCRETE_POWDER), (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_BUTTON, Blocks.MAGENTA_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_WALL, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);

        //pink_concrete_powder
        ModRecipes.DoorRecipe(ModBlocks.PINK_CONCRETE_POWDER_DOOR, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_SLAB, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PINK_CONCRETE_POWDER_STAIRS, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PINK_CONCRETE_POWDER_FENCE, (Blocks.PINK_CONCRETE_POWDER), (ModBlocks.PINK_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PINK_CONCRETE_POWDER_FENCE_GATE, (Blocks.PINK_CONCRETE_POWDER), (ModBlocks.PINK_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.PINK_CONCRETE_POWDER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_PRESSURE_PLATE, ModBlocks.PINK_CONCRETE_POWDER_SLAB).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_BUTTON, Blocks.PINK_CONCRETE_POWDER, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_WALL, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);

        //white_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE, (Blocks.WHITE_GLAZED_TERRACOTTA), (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.WHITE_GLAZED_TERRACOTTA), (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON, Blocks.WHITE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);

        //light_gray_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);

        //gray_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE, (Blocks.GRAY_GLAZED_TERRACOTTA), (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.GRAY_GLAZED_TERRACOTTA), (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON, Blocks.GRAY_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);

        //black_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE, (Blocks.BLACK_GLAZED_TERRACOTTA), (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BLACK_GLAZED_TERRACOTTA), (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON, Blocks.BLACK_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);

        //brown_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE, (Blocks.BROWN_GLAZED_TERRACOTTA), (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BROWN_GLAZED_TERRACOTTA), (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON, Blocks.BROWN_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);

        //red_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE, (Blocks.RED_GLAZED_TERRACOTTA), (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.RED_GLAZED_TERRACOTTA), (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON, Blocks.RED_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);

        //orange_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE, (Blocks.ORANGE_GLAZED_TERRACOTTA), (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.ORANGE_GLAZED_TERRACOTTA), (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON, Blocks.ORANGE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);

        //yellow_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE, (Blocks.YELLOW_GLAZED_TERRACOTTA), (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.YELLOW_GLAZED_TERRACOTTA), (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON, Blocks.YELLOW_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);

        //lime_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE, (Blocks.LIME_GLAZED_TERRACOTTA), (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIME_GLAZED_TERRACOTTA), (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON, Blocks.LIME_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);

        //green_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE, (Blocks.GREEN_GLAZED_TERRACOTTA), (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.GREEN_GLAZED_TERRACOTTA), (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON, Blocks.GREEN_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);

        //cyan_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE, (Blocks.CYAN_GLAZED_TERRACOTTA), (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.CYAN_GLAZED_TERRACOTTA), (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON, Blocks.CYAN_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);

        //blue_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE, (Blocks.BLUE_GLAZED_TERRACOTTA), (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BLUE_GLAZED_TERRACOTTA), (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON, Blocks.BLUE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);

        //light_blue_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);

        //purple_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE, (Blocks.PURPLE_GLAZED_TERRACOTTA), (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.PURPLE_GLAZED_TERRACOTTA), (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON, Blocks.PURPLE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);

        //magenta_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE, (Blocks.MAGENTA_GLAZED_TERRACOTTA), (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.MAGENTA_GLAZED_TERRACOTTA), (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON, Blocks.MAGENTA_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);

        //pink_glazed_terracotta
        ModRecipes.DoorRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE, (Blocks.PINK_GLAZED_TERRACOTTA), (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.PINK_GLAZED_TERRACOTTA), (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON, Blocks.PINK_GLAZED_TERRACOTTA, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);

        //white_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.WHITE_STAINED_GLASS_DOOR, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_SLAB, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WHITE_STAINED_GLASS_STAIRS, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE, (Blocks.WHITE_STAINED_GLASS), (ModBlocks.WHITE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE, (Blocks.WHITE_STAINED_GLASS), (ModBlocks.WHITE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR, (ModBlocks.WHITE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.WHITE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_BUTTON, Blocks.WHITE_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_WALL, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);

        //light_gray_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, (Blocks.LIGHT_GRAY_STAINED_GLASS), (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, (Blocks.LIGHT_GRAY_STAINED_GLASS), (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, Blocks.LIGHT_GRAY_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);

        //gray_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.GRAY_STAINED_GLASS_DOOR, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_SLAB, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAY_STAINED_GLASS_STAIRS, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE, (Blocks.GRAY_STAINED_GLASS), (ModBlocks.GRAY_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE, (Blocks.GRAY_STAINED_GLASS), (ModBlocks.GRAY_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR, (ModBlocks.GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_BUTTON, Blocks.GRAY_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_WALL, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);

        //black_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.BLACK_STAINED_GLASS_DOOR, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_SLAB, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLACK_STAINED_GLASS_STAIRS, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE, (Blocks.BLACK_STAINED_GLASS), (ModBlocks.BLACK_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE, (Blocks.BLACK_STAINED_GLASS), (ModBlocks.BLACK_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR, (ModBlocks.BLACK_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BLACK_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_BUTTON, Blocks.BLACK_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_WALL, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);

        //brown_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.BROWN_STAINED_GLASS_DOOR, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_SLAB, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BROWN_STAINED_GLASS_STAIRS, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE, (Blocks.BROWN_STAINED_GLASS), (ModBlocks.BROWN_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE, (Blocks.BROWN_STAINED_GLASS), (ModBlocks.BROWN_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR, (ModBlocks.BROWN_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BROWN_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_BUTTON, Blocks.BROWN_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_WALL, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);

        //red_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.RED_STAINED_GLASS_DOOR, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_SLAB, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_STAINED_GLASS_STAIRS, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_STAINED_GLASS_FENCE, (Blocks.RED_STAINED_GLASS), (ModBlocks.RED_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_STAINED_GLASS_FENCE_GATE, (Blocks.RED_STAINED_GLASS), (ModBlocks.RED_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_STAINED_GLASS_TRAPDOOR, (ModBlocks.RED_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.RED_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_BUTTON, Blocks.RED_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_WALL, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);

        //orange_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.ORANGE_STAINED_GLASS_DOOR, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_SLAB, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ORANGE_STAINED_GLASS_STAIRS, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE, (Blocks.ORANGE_STAINED_GLASS), (ModBlocks.ORANGE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, (Blocks.ORANGE_STAINED_GLASS), (ModBlocks.ORANGE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR, (ModBlocks.ORANGE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.ORANGE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_BUTTON, Blocks.ORANGE_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_WALL, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);

        //yellow_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.YELLOW_STAINED_GLASS_DOOR, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_SLAB, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.YELLOW_STAINED_GLASS_STAIRS, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE, (Blocks.YELLOW_STAINED_GLASS), (ModBlocks.YELLOW_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, (Blocks.YELLOW_STAINED_GLASS), (ModBlocks.YELLOW_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR, (ModBlocks.YELLOW_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.YELLOW_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_BUTTON, Blocks.YELLOW_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_WALL, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);

        //lime_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.LIME_STAINED_GLASS_DOOR, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_SLAB, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIME_STAINED_GLASS_STAIRS, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE, (Blocks.LIME_STAINED_GLASS), (ModBlocks.LIME_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE, (Blocks.LIME_STAINED_GLASS), (ModBlocks.LIME_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIME_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIME_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_BUTTON, Blocks.LIME_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_WALL, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);

        //green_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.GREEN_STAINED_GLASS_DOOR, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_SLAB, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GREEN_STAINED_GLASS_STAIRS, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE, (Blocks.GREEN_STAINED_GLASS), (ModBlocks.GREEN_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE, (Blocks.GREEN_STAINED_GLASS), (ModBlocks.GREEN_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR, (ModBlocks.GREEN_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.GREEN_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_BUTTON, Blocks.GREEN_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_WALL, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);

        //cyan_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.CYAN_STAINED_GLASS_DOOR, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_SLAB, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CYAN_STAINED_GLASS_STAIRS, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE, (Blocks.CYAN_STAINED_GLASS), (ModBlocks.CYAN_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE, (Blocks.CYAN_STAINED_GLASS), (ModBlocks.CYAN_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR, (ModBlocks.CYAN_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.CYAN_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_BUTTON, Blocks.CYAN_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_WALL, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);

        //blue_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.BLUE_STAINED_GLASS_DOOR, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_SLAB, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_STAINED_GLASS_STAIRS, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE, (Blocks.BLUE_STAINED_GLASS), (ModBlocks.BLUE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE, (Blocks.BLUE_STAINED_GLASS), (ModBlocks.BLUE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR, (ModBlocks.BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_BUTTON, Blocks.BLUE_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_WALL, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);

        //light_blue_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, (Blocks.LIGHT_BLUE_STAINED_GLASS), (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, (Blocks.LIGHT_BLUE_STAINED_GLASS), (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, Blocks.LIGHT_BLUE_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);

        //purple_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.PURPLE_STAINED_GLASS_DOOR, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_SLAB, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PURPLE_STAINED_GLASS_STAIRS, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE, (Blocks.PURPLE_STAINED_GLASS), (ModBlocks.PURPLE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, (Blocks.PURPLE_STAINED_GLASS), (ModBlocks.PURPLE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR, (ModBlocks.PURPLE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.PURPLE_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_BUTTON, Blocks.PURPLE_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_WALL, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);

        //magenta_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.MAGENTA_STAINED_GLASS_DOOR, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_SLAB, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE, (Blocks.MAGENTA_STAINED_GLASS), (ModBlocks.MAGENTA_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, (Blocks.MAGENTA_STAINED_GLASS), (ModBlocks.MAGENTA_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR, (ModBlocks.MAGENTA_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.MAGENTA_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_BUTTON, Blocks.MAGENTA_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_WALL, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);

        //pink_stained_glass
        ModRecipes.DoorRecipe(ModBlocks.PINK_STAINED_GLASS_DOOR, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_SLAB, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PINK_STAINED_GLASS_STAIRS, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE, (Blocks.PINK_STAINED_GLASS), (ModBlocks.PINK_STAINED_GLASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE, (Blocks.PINK_STAINED_GLASS), (ModBlocks.PINK_STAINED_GLASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR, (ModBlocks.PINK_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.PINK_STAINED_GLASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_BUTTON, Blocks.PINK_STAINED_GLASS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_WALL, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);

        //grass_block
        ModRecipes.DoorRecipe(ModBlocks.GRASS_DOOR, (Blocks.GRASS_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_SLAB, (Blocks.GRASS_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRASS_STAIRS, (Blocks.GRASS_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRASS_FENCE, (Blocks.GRASS_BLOCK), (ModBlocks.GRASS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRASS_FENCE_GATE, (Blocks.GRASS_BLOCK), (ModBlocks.GRASS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRASS_TRAPDOOR, (ModBlocks.GRASS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_PRESSURE_PLATE, (ModBlocks.GRASS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_BUTTON, Blocks.GRASS_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_WALL, (Blocks.GRASS_BLOCK)).offerTo(exporter);

        //podzol
        ModRecipes.DoorRecipe(ModBlocks.PODZOL_DOOR, (Blocks.PODZOL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_SLAB, (Blocks.PODZOL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PODZOL_STAIRS, (Blocks.PODZOL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PODZOL_FENCE, (Blocks.PODZOL), (ModBlocks.PODZOL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PODZOL_FENCE_GATE, (Blocks.PODZOL), (ModBlocks.PODZOL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PODZOL_TRAPDOOR, (ModBlocks.PODZOL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_PRESSURE_PLATE, (ModBlocks.PODZOL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_BUTTON, Blocks.PODZOL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_WALL, (Blocks.PODZOL)).offerTo(exporter);

        //dirt
        ModRecipes.DoorRecipe(ModBlocks.DIRT_DOOR, (Blocks.DIRT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_SLAB, (Blocks.DIRT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DIRT_STAIRS, (Blocks.DIRT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DIRT_FENCE, (Blocks.DIRT), (ModBlocks.DIRT_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DIRT_FENCE_GATE, (Blocks.DIRT), (ModBlocks.DIRT_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DIRT_TRAPDOOR, (ModBlocks.DIRT_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PRESSURE_PLATE, (ModBlocks.DIRT_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_BUTTON, Blocks.DIRT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_WALL, (Blocks.DIRT)).offerTo(exporter);

        //mycelium
        ModRecipes.DoorRecipe(ModBlocks.MYCELIUM_DOOR, (Blocks.MYCELIUM)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_SLAB, (Blocks.MYCELIUM)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MYCELIUM_STAIRS, (Blocks.MYCELIUM)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MYCELIUM_FENCE, (Blocks.MYCELIUM), (ModBlocks.MYCELIUM_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MYCELIUM_FENCE_GATE, (Blocks.MYCELIUM), (ModBlocks.MYCELIUM_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MYCELIUM_TRAPDOOR, (ModBlocks.MYCELIUM_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_PRESSURE_PLATE, (ModBlocks.MYCELIUM_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_BUTTON, Blocks.MYCELIUM, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_WALL, (Blocks.MYCELIUM)).offerTo(exporter);

        //dirt_path
        ModRecipes.DoorRecipe(ModBlocks.DIRT_PATH_DOOR, (Blocks.DIRT_PATH)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_SLAB, (Blocks.DIRT_PATH)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DIRT_PATH_STAIRS, (Blocks.DIRT_PATH)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DIRT_PATH_FENCE, (Blocks.DIRT_PATH), (ModBlocks.DIRT_PATH_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DIRT_PATH_FENCE_GATE, (Blocks.DIRT_PATH), (ModBlocks.DIRT_PATH_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DIRT_PATH_TRAPDOOR, (ModBlocks.DIRT_PATH_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_PRESSURE_PLATE, (ModBlocks.DIRT_PATH_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_BUTTON, Blocks.DIRT_PATH, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_WALL, (Blocks.DIRT_PATH)).offerTo(exporter);

        //coarse_dirt
        ModRecipes.DoorRecipe(ModBlocks.COARSE_DIRT_DOOR, (Blocks.COARSE_DIRT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_SLAB, (Blocks.COARSE_DIRT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.COARSE_DIRT_STAIRS, (Blocks.COARSE_DIRT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COARSE_DIRT_FENCE, (Blocks.COARSE_DIRT), (ModBlocks.COARSE_DIRT_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COARSE_DIRT_FENCE_GATE, (Blocks.COARSE_DIRT), (ModBlocks.COARSE_DIRT_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COARSE_DIRT_TRAPDOOR, (ModBlocks.COARSE_DIRT_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_PRESSURE_PLATE, (ModBlocks.COARSE_DIRT_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_BUTTON, Blocks.COARSE_DIRT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_WALL, (Blocks.COARSE_DIRT)).offerTo(exporter);

        //farmland
        ModRecipes.DoorRecipe(ModBlocks.FARMLAND_DOOR, (Blocks.FARMLAND)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_SLAB, (Blocks.FARMLAND)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.FARMLAND_STAIRS, (Blocks.FARMLAND)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.FARMLAND_FENCE, (Blocks.FARMLAND), (ModBlocks.FARMLAND_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.FARMLAND_FENCE_GATE, (Blocks.FARMLAND), (ModBlocks.FARMLAND_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.FARMLAND_TRAPDOOR, (ModBlocks.FARMLAND_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_PRESSURE_PLATE, (ModBlocks.FARMLAND_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_BUTTON, Blocks.FARMLAND, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_WALL, (Blocks.FARMLAND)).offerTo(exporter);

        //rooted_dirt
        ModRecipes.DoorRecipe(ModBlocks.ROOTED_DIRT_DOOR, (Blocks.ROOTED_DIRT)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_SLAB, (Blocks.ROOTED_DIRT)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ROOTED_DIRT_STAIRS, (Blocks.ROOTED_DIRT)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ROOTED_DIRT_FENCE, (Blocks.ROOTED_DIRT), (ModBlocks.ROOTED_DIRT_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ROOTED_DIRT_FENCE_GATE, (Blocks.ROOTED_DIRT), (ModBlocks.ROOTED_DIRT_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ROOTED_DIRT_TRAPDOOR, (ModBlocks.ROOTED_DIRT_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_PRESSURE_PLATE, (ModBlocks.ROOTED_DIRT_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_BUTTON, Blocks.ROOTED_DIRT, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_WALL, (Blocks.ROOTED_DIRT)).offerTo(exporter);

        //mud
        ModRecipes.DoorRecipe(ModBlocks.MUD_DOOR, (Blocks.MUD)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_SLAB, (Blocks.MUD)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MUD_STAIRS, (Blocks.MUD)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MUD_FENCE, (Blocks.MUD), (ModBlocks.MUD_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MUD_FENCE_GATE, (Blocks.MUD), (ModBlocks.MUD_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MUD_TRAPDOOR, (ModBlocks.MUD_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_PRESSURE_PLATE, (ModBlocks.MUD_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BUTTON, Blocks.MUD, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_WALL, (Blocks.MUD)).offerTo(exporter);

        //clay
        ModRecipes.DoorRecipe(ModBlocks.CLAY_DOOR, (Blocks.CLAY)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_SLAB, (Blocks.CLAY)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CLAY_STAIRS, (Blocks.CLAY)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CLAY_FENCE, (Blocks.CLAY), (ModBlocks.CLAY_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CLAY_FENCE_GATE, (Blocks.CLAY), (ModBlocks.CLAY_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CLAY_TRAPDOOR, (ModBlocks.CLAY_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_PRESSURE_PLATE, (ModBlocks.CLAY_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_BUTTON, Blocks.CLAY, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_WALL, (Blocks.CLAY)).offerTo(exporter);

        //sand
        ModRecipes.DoorRecipe(ModBlocks.SAND_DOOR, (Blocks.SAND)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_SLAB, (Blocks.SAND)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SAND_STAIRS, (Blocks.SAND)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SAND_FENCE, (Blocks.SAND), (ModBlocks.SAND_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SAND_FENCE_GATE, (Blocks.SAND), (ModBlocks.SAND_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SAND_TRAPDOOR, (ModBlocks.SAND_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_PRESSURE_PLATE, (ModBlocks.SAND_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_BUTTON, Blocks.SAND, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_WALL, (Blocks.SAND)).offerTo(exporter);

        //gravel
        ModRecipes.DoorRecipe(ModBlocks.GRAVEL_DOOR, (Blocks.GRAVEL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_SLAB, (Blocks.GRAVEL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GRAVEL_STAIRS, (Blocks.GRAVEL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GRAVEL_FENCE, (Blocks.GRAVEL), (ModBlocks.GRAVEL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GRAVEL_FENCE_GATE, (Blocks.GRAVEL), (ModBlocks.GRAVEL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GRAVEL_TRAPDOOR, (ModBlocks.GRAVEL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_PRESSURE_PLATE, (ModBlocks.GRAVEL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_BUTTON, Blocks.GRAVEL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_WALL, (Blocks.GRAVEL)).offerTo(exporter);

        //red_sand
        ModRecipes.DoorRecipe(ModBlocks.RED_SAND_DOOR, (Blocks.RED_SAND)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_SLAB, (Blocks.RED_SAND)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RED_SAND_STAIRS, (Blocks.RED_SAND)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RED_SAND_FENCE, (Blocks.RED_SAND), (ModBlocks.RED_SAND_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RED_SAND_FENCE_GATE, (Blocks.RED_SAND), (ModBlocks.RED_SAND_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RED_SAND_TRAPDOOR, (ModBlocks.RED_SAND_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_PRESSURE_PLATE, (ModBlocks.RED_SAND_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_BUTTON, Blocks.RED_SAND, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_WALL, (Blocks.RED_SAND)).offerTo(exporter);

        //ice
        ModRecipes.DoorRecipe(ModBlocks.ICE_DOOR, (Blocks.ICE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_SLAB, (Blocks.ICE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ICE_STAIRS, (Blocks.ICE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ICE_FENCE, (Blocks.ICE), (ModBlocks.ICE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ICE_FENCE_GATE, (Blocks.ICE), (ModBlocks.ICE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ICE_TRAPDOOR, (ModBlocks.ICE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_PRESSURE_PLATE, (ModBlocks.ICE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_BUTTON, Blocks.ICE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_WALL, (Blocks.ICE)).offerTo(exporter);

        //packed_ice
        ModRecipes.DoorRecipe(ModBlocks.PACKED_ICE_DOOR, (Blocks.PACKED_ICE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_SLAB, (Blocks.PACKED_ICE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.PACKED_ICE_STAIRS, (Blocks.PACKED_ICE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.PACKED_ICE_FENCE, (Blocks.PACKED_ICE), (ModBlocks.PACKED_ICE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.PACKED_ICE_FENCE_GATE, (Blocks.PACKED_ICE), (ModBlocks.PACKED_ICE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.PACKED_ICE_TRAPDOOR, (ModBlocks.PACKED_ICE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_PRESSURE_PLATE, (ModBlocks.PACKED_ICE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_BUTTON, Blocks.PACKED_ICE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_WALL, (Blocks.PACKED_ICE)).offerTo(exporter);

        //blue_ice
        ModRecipes.DoorRecipe(ModBlocks.BLUE_ICE_DOOR, (Blocks.BLUE_ICE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_SLAB, (Blocks.BLUE_ICE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BLUE_ICE_STAIRS, (Blocks.BLUE_ICE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BLUE_ICE_FENCE, (Blocks.BLUE_ICE), (ModBlocks.BLUE_ICE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BLUE_ICE_FENCE_GATE, (Blocks.BLUE_ICE), (ModBlocks.BLUE_ICE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BLUE_ICE_TRAPDOOR, (ModBlocks.BLUE_ICE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_PRESSURE_PLATE, (ModBlocks.BLUE_ICE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_BUTTON, Blocks.BLUE_ICE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_WALL, (Blocks.BLUE_ICE)).offerTo(exporter);

        //snow_block
        ModRecipes.DoorRecipe(ModBlocks.SNOW_DOOR, (Blocks.SNOW_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_SLAB, (Blocks.SNOW_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SNOW_STAIRS, (Blocks.SNOW_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SNOW_FENCE, (Blocks.SNOW_BLOCK), (ModBlocks.SNOW_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SNOW_FENCE_GATE, (Blocks.SNOW_BLOCK), (ModBlocks.SNOW_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SNOW_TRAPDOOR, (ModBlocks.SNOW_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_PRESSURE_PLATE, (ModBlocks.SNOW_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_BUTTON, Blocks.SNOW_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_WALL, (Blocks.SNOW_BLOCK)).offerTo(exporter);

        //moss_block
        ModRecipes.DoorRecipe(ModBlocks.MOSS_DOOR, (Blocks.MOSS_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_SLAB, (Blocks.MOSS_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MOSS_STAIRS, (Blocks.MOSS_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MOSS_FENCE, (Blocks.MOSS_BLOCK), (ModBlocks.MOSS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MOSS_FENCE_GATE, (Blocks.MOSS_BLOCK), (ModBlocks.MOSS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MOSS_TRAPDOOR, (ModBlocks.MOSS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_PRESSURE_PLATE, (ModBlocks.MOSS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_BUTTON, Blocks.MOSS_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_WALL, (Blocks.MOSS_BLOCK)).offerTo(exporter);

        //calcite
        ModRecipes.DoorRecipe(ModBlocks.CALCITE_DOOR, (Blocks.CALCITE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_SLAB, (Blocks.CALCITE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CALCITE_STAIRS, (Blocks.CALCITE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CALCITE_FENCE, (Blocks.CALCITE), (ModBlocks.CALCITE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CALCITE_FENCE_GATE, (Blocks.CALCITE), (ModBlocks.CALCITE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CALCITE_TRAPDOOR, (ModBlocks.CALCITE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_PRESSURE_PLATE, (ModBlocks.CALCITE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BUTTON, Blocks.CALCITE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, (Blocks.CALCITE)).offerTo(exporter);

        //tuff
        ModRecipes.DoorRecipe(ModBlocks.TUFF_DOOR, (Blocks.TUFF)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.TUFF_SLAB, (Blocks.TUFF)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.TUFF_STAIRS, (Blocks.TUFF)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.TUFF_FENCE, (Blocks.TUFF), (ModBlocks.TUFF_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.TUFF_FENCE_GATE, (Blocks.TUFF), (ModBlocks.TUFF_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.TUFF_TRAPDOOR, (ModBlocks.TUFF_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.TUFF_PRESSURE_PLATE, (ModBlocks.TUFF_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.TUFF_BUTTON, Blocks.TUFF, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.TUFF_WALL, (Blocks.TUFF)).offerTo(exporter);

        //dripstone_block
        ModRecipes.DoorRecipe(ModBlocks.DRIPSTONE_DOOR, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_SLAB, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DRIPSTONE_STAIRS, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DRIPSTONE_FENCE, (Blocks.DRIPSTONE_BLOCK), (ModBlocks.DRIPSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DRIPSTONE_FENCE_GATE, (Blocks.DRIPSTONE_BLOCK), (ModBlocks.DRIPSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DRIPSTONE_TRAPDOOR, (ModBlocks.DRIPSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_PRESSURE_PLATE, (ModBlocks.DRIPSTONE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BUTTON, Blocks.DRIPSTONE_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_WALL, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);

        //magma_block
        ModRecipes.DoorRecipe(ModBlocks.MAGMA_DOOR, (Blocks.MAGMA_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_SLAB, (Blocks.MAGMA_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MAGMA_STAIRS, (Blocks.MAGMA_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MAGMA_FENCE, (Blocks.MAGMA_BLOCK), (ModBlocks.MAGMA_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MAGMA_FENCE_GATE, (Blocks.MAGMA_BLOCK), (ModBlocks.MAGMA_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MAGMA_TRAPDOOR, (ModBlocks.MAGMA_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_PRESSURE_PLATE, (ModBlocks.MAGMA_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_BUTTON, Blocks.MAGMA_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_WALL, (Blocks.MAGMA_BLOCK)).offerTo(exporter);

        //obsidian
        ModRecipes.DoorRecipe(ModBlocks.OBSIDIAN_DOOR, (Blocks.OBSIDIAN)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_SLAB, (Blocks.OBSIDIAN)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.OBSIDIAN_STAIRS, (Blocks.OBSIDIAN)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.OBSIDIAN_FENCE, (Blocks.OBSIDIAN), (ModBlocks.OBSIDIAN_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.OBSIDIAN_FENCE_GATE, (Blocks.OBSIDIAN), (ModBlocks.OBSIDIAN_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.OBSIDIAN_TRAPDOOR, (ModBlocks.OBSIDIAN_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_PRESSURE_PLATE, (ModBlocks.OBSIDIAN_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_BUTTON, Blocks.OBSIDIAN, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_WALL, (Blocks.OBSIDIAN)).offerTo(exporter);

        //crying_obsidian
        ModRecipes.DoorRecipe(ModBlocks.CRYING_OBSIDIAN_DOOR, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_SLAB, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRYING_OBSIDIAN_STAIRS, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRYING_OBSIDIAN_FENCE, (Blocks.CRYING_OBSIDIAN), (ModBlocks.CRYING_OBSIDIAN_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE, (Blocks.CRYING_OBSIDIAN), (ModBlocks.CRYING_OBSIDIAN_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRYING_OBSIDIAN_TRAPDOOR, (ModBlocks.CRYING_OBSIDIAN_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE, (ModBlocks.CRYING_OBSIDIAN_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_BUTTON, Blocks.CRYING_OBSIDIAN, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_WALL, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);

        //crimson_nylium
        ModRecipes.DoorRecipe(ModBlocks.CRIMSON_NYLIUM_DOOR, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_SLAB, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.CRIMSON_NYLIUM_STAIRS, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.CRIMSON_NYLIUM_FENCE, (Blocks.CRIMSON_NYLIUM), (ModBlocks.CRIMSON_NYLIUM_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.CRIMSON_NYLIUM_FENCE_GATE, (Blocks.CRIMSON_NYLIUM), (ModBlocks.CRIMSON_NYLIUM_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.CRIMSON_NYLIUM_TRAPDOOR, (ModBlocks.CRIMSON_NYLIUM_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_PRESSURE_PLATE, (ModBlocks.CRIMSON_NYLIUM_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_BUTTON, Blocks.CRIMSON_NYLIUM, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_WALL, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);

        //warped_nylium
        ModRecipes.DoorRecipe(ModBlocks.WARPED_NYLIUM_DOOR, (Blocks.WARPED_NYLIUM)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_SLAB, (Blocks.WARPED_NYLIUM)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.WARPED_NYLIUM_STAIRS, (Blocks.WARPED_NYLIUM)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.WARPED_NYLIUM_FENCE, (Blocks.WARPED_NYLIUM), (ModBlocks.WARPED_NYLIUM_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.WARPED_NYLIUM_FENCE_GATE, (Blocks.WARPED_NYLIUM), (ModBlocks.WARPED_NYLIUM_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.WARPED_NYLIUM_TRAPDOOR, (ModBlocks.WARPED_NYLIUM_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_PRESSURE_PLATE, (ModBlocks.WARPED_NYLIUM_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_BUTTON, Blocks.WARPED_NYLIUM, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_WALL, (Blocks.WARPED_NYLIUM)).offerTo(exporter);

        //soul_sand
        ModRecipes.DoorRecipe(ModBlocks.SOUL_SAND_DOOR, (Blocks.SOUL_SAND)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_SLAB, (Blocks.SOUL_SAND)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SOUL_SAND_STAIRS, (Blocks.SOUL_SAND)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SOUL_SAND_FENCE, (Blocks.SOUL_SAND), (ModBlocks.SOUL_SAND_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SOUL_SAND_FENCE_GATE, (Blocks.SOUL_SAND), (ModBlocks.SOUL_SAND_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SOUL_SAND_TRAPDOOR, (ModBlocks.SOUL_SAND_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_PRESSURE_PLATE, (ModBlocks.SOUL_SAND_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_BUTTON, Blocks.SOUL_SAND, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_WALL, (Blocks.SOUL_SAND)).offerTo(exporter);

        //soul_soil
        ModRecipes.DoorRecipe(ModBlocks.SOUL_SOIL_DOOR, (Blocks.SOUL_SOIL)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_SLAB, (Blocks.SOUL_SOIL)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SOUL_SOIL_STAIRS, (Blocks.SOUL_SOIL)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SOUL_SOIL_FENCE, (Blocks.SOUL_SOIL), (ModBlocks.SOUL_SOIL_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SOUL_SOIL_FENCE_GATE, (Blocks.SOUL_SOIL), (ModBlocks.SOUL_SOIL_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SOUL_SOIL_TRAPDOOR, (ModBlocks.SOUL_SOIL_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_PRESSURE_PLATE, (ModBlocks.SOUL_SOIL_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_BUTTON, Blocks.SOUL_SOIL, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_WALL, (Blocks.SOUL_SOIL)).offerTo(exporter);

        //bone
        ModRecipes.DoorRecipe(ModBlocks.BONE_DOOR, (Blocks.BONE_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_SLAB, (Blocks.BONE_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BONE_STAIRS, (Blocks.BONE_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BONE_FENCE, (Blocks.BONE_BLOCK), (ModBlocks.BONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BONE_FENCE_GATE, (Blocks.BONE_BLOCK), (ModBlocks.BONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BONE_TRAPDOOR, (ModBlocks.BONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_PRESSURE_PLATE, (ModBlocks.BONE_SLAB)).offerTo(exporter);
        ModRecipes.x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_BUTTON, Blocks.BONE_BLOCK).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_WALL, (Blocks.BONE_BLOCK)).offerTo(exporter);

        //coal_ore
        ModRecipes.DoorRecipe(ModBlocks.COAL_ORE_DOOR, (Blocks.COAL_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_ORE_SLAB, (Blocks.COAL_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.COAL_ORE_STAIRS, (Blocks.COAL_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COAL_ORE_FENCE, (Blocks.COAL_ORE), (ModBlocks.COAL_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COAL_ORE_FENCE_GATE, (Blocks.COAL_ORE), (ModBlocks.COAL_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COAL_ORE_TRAPDOOR, (ModBlocks.COAL_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_ORE_PRESSURE_PLATE, (ModBlocks.COAL_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_ORE_BUTTON, Blocks.COAL_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_ORE_WALL, (Blocks.COAL_ORE)).offerTo(exporter);

        //deepslate_coal_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_COAL_ORE_DOOR, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COAL_ORE_SLAB, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_COAL_ORE_STAIRS, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_COAL_ORE_FENCE, (Blocks.DEEPSLATE_COAL_ORE), (ModBlocks.DEEPSLATE_COAL_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_COAL_ORE_FENCE_GATE, (Blocks.DEEPSLATE_COAL_ORE), (ModBlocks.DEEPSLATE_COAL_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_COAL_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_COAL_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COAL_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_COAL_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COAL_ORE_BUTTON, Blocks.DEEPSLATE_COAL_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COAL_ORE_WALL, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);

        //iron_ore
        ModRecipes.DoorRecipe(ModBlocks.IRON_ORE_DOOR, (Blocks.IRON_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_ORE_SLAB, (Blocks.IRON_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.IRON_ORE_STAIRS, (Blocks.IRON_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.IRON_ORE_FENCE, (Blocks.IRON_ORE), (ModBlocks.IRON_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.IRON_ORE_FENCE_GATE, (Blocks.IRON_ORE), (ModBlocks.IRON_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.IRON_ORE_TRAPDOOR, (ModBlocks.IRON_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_ORE_PRESSURE_PLATE, (ModBlocks.IRON_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_ORE_BUTTON, Blocks.IRON_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_ORE_WALL, (Blocks.IRON_ORE)).offerTo(exporter);

        //deepslate_iron_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_IRON_ORE_DOOR, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_IRON_ORE_SLAB, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_IRON_ORE_STAIRS, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_IRON_ORE_FENCE, (Blocks.DEEPSLATE_IRON_ORE), (ModBlocks.DEEPSLATE_IRON_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_IRON_ORE_FENCE_GATE, (Blocks.DEEPSLATE_IRON_ORE), (ModBlocks.DEEPSLATE_IRON_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_IRON_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_IRON_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_IRON_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_IRON_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_IRON_ORE_BUTTON, Blocks.DEEPSLATE_IRON_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_IRON_ORE_WALL, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);

        //copper_ore
        ModRecipes.DoorRecipe(ModBlocks.COPPER_ORE_DOOR, (Blocks.COPPER_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_ORE_SLAB, (Blocks.COPPER_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.COPPER_ORE_STAIRS, (Blocks.COPPER_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.COPPER_ORE_FENCE, (Blocks.COPPER_ORE), (ModBlocks.COPPER_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.COPPER_ORE_FENCE_GATE, (Blocks.COPPER_ORE), (ModBlocks.COPPER_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.COPPER_ORE_TRAPDOOR, (ModBlocks.COPPER_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_ORE_PRESSURE_PLATE, (ModBlocks.COPPER_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_ORE_BUTTON, Blocks.COPPER_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_ORE_WALL, (Blocks.COPPER_ORE)).offerTo(exporter);

        //deepslate_copper_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_COPPER_ORE_DOOR, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COPPER_ORE_SLAB, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_COPPER_ORE_STAIRS, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE, (Blocks.DEEPSLATE_COPPER_ORE), (ModBlocks.DEEPSLATE_COPPER_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE_GATE, (Blocks.DEEPSLATE_COPPER_ORE), (ModBlocks.DEEPSLATE_COPPER_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_COPPER_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_COPPER_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_COPPER_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COPPER_ORE_BUTTON, Blocks.DEEPSLATE_COPPER_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COPPER_ORE_WALL, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);

        //gold_ore
        ModRecipes.DoorRecipe(ModBlocks.GOLD_ORE_DOOR, (Blocks.GOLD_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_ORE_SLAB, (Blocks.GOLD_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GOLD_ORE_STAIRS, (Blocks.GOLD_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GOLD_ORE_FENCE, (Blocks.GOLD_ORE), (ModBlocks.GOLD_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GOLD_ORE_FENCE_GATE, (Blocks.GOLD_ORE), (ModBlocks.GOLD_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GOLD_ORE_TRAPDOOR, (ModBlocks.GOLD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_ORE_PRESSURE_PLATE, (ModBlocks.GOLD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_ORE_BUTTON, Blocks.GOLD_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_ORE_WALL, (Blocks.GOLD_ORE)).offerTo(exporter);

        //deepslate_gold_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_GOLD_ORE_DOOR, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_GOLD_ORE_SLAB, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_GOLD_ORE_STAIRS, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE, (Blocks.DEEPSLATE_GOLD_ORE), (ModBlocks.DEEPSLATE_GOLD_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE_GATE, (Blocks.DEEPSLATE_GOLD_ORE), (ModBlocks.DEEPSLATE_GOLD_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_GOLD_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_GOLD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_GOLD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_GOLD_ORE_BUTTON, Blocks.DEEPSLATE_GOLD_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_GOLD_ORE_WALL, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);

        //redstone_ore
        ModRecipes.DoorRecipe(ModBlocks.REDSTONE_ORE_DOOR, (Blocks.REDSTONE_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_ORE_SLAB, (Blocks.REDSTONE_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.REDSTONE_ORE_STAIRS, (Blocks.REDSTONE_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.REDSTONE_ORE_FENCE, (Blocks.REDSTONE_ORE), (ModBlocks.REDSTONE_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.REDSTONE_ORE_FENCE_GATE, (Blocks.REDSTONE_ORE), (ModBlocks.REDSTONE_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.REDSTONE_ORE_TRAPDOOR, (ModBlocks.REDSTONE_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_ORE_PRESSURE_PLATE, (ModBlocks.REDSTONE_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_ORE_BUTTON, Blocks.REDSTONE_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_ORE_WALL, (Blocks.REDSTONE_ORE)).offerTo(exporter);

        //deepslate_redstone_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_REDSTONE_ORE_DOOR, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_REDSTONE_ORE_FENCE, (Blocks.DEEPSLATE_REDSTONE_ORE), (ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_REDSTONE_ORE_FENCE_GATE, (Blocks.DEEPSLATE_REDSTONE_ORE), (ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_REDSTONE_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_REDSTONE_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_REDSTONE_ORE_BUTTON, Blocks.DEEPSLATE_REDSTONE_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_REDSTONE_ORE_WALL, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);

        //emerald_ore
        ModRecipes.DoorRecipe(ModBlocks.EMERALD_ORE_DOOR, (Blocks.EMERALD_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_ORE_SLAB, (Blocks.EMERALD_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.EMERALD_ORE_STAIRS, (Blocks.EMERALD_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.EMERALD_ORE_FENCE, (Blocks.EMERALD_ORE), (ModBlocks.EMERALD_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.EMERALD_ORE_FENCE_GATE, (Blocks.EMERALD_ORE), (ModBlocks.EMERALD_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.EMERALD_ORE_TRAPDOOR, (ModBlocks.EMERALD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_ORE_PRESSURE_PLATE, (ModBlocks.EMERALD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_ORE_BUTTON, Blocks.EMERALD_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_ORE_WALL, (Blocks.EMERALD_ORE)).offerTo(exporter);

        //deepslate_emerald_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_EMERALD_ORE_DOOR, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE, (Blocks.DEEPSLATE_EMERALD_ORE), (ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE_GATE, (Blocks.DEEPSLATE_EMERALD_ORE), (ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_EMERALD_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_EMERALD_ORE_BUTTON, Blocks.DEEPSLATE_EMERALD_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_EMERALD_ORE_WALL, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);

        //lapis_ore
        ModRecipes.DoorRecipe(ModBlocks.LAPIS_ORE_DOOR, (Blocks.LAPIS_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_ORE_SLAB, (Blocks.LAPIS_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.LAPIS_ORE_STAIRS, (Blocks.LAPIS_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.LAPIS_ORE_FENCE, (Blocks.LAPIS_ORE), (ModBlocks.LAPIS_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.LAPIS_ORE_FENCE_GATE, (Blocks.LAPIS_ORE), (ModBlocks.LAPIS_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.LAPIS_ORE_TRAPDOOR, (ModBlocks.LAPIS_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_ORE_PRESSURE_PLATE, (ModBlocks.LAPIS_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_ORE_BUTTON, Blocks.LAPIS_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_ORE_WALL, (Blocks.LAPIS_ORE)).offerTo(exporter);

        //deepslate_lapis_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_LAPIS_ORE_DOOR, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_LAPIS_ORE_STAIRS, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE, (Blocks.DEEPSLATE_LAPIS_ORE), (ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE_GATE, (Blocks.DEEPSLATE_LAPIS_ORE), (ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_LAPIS_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_LAPIS_ORE_BUTTON, Blocks.DEEPSLATE_LAPIS_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_LAPIS_ORE_WALL, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);

        //diamond_ore
        ModRecipes.DoorRecipe(ModBlocks.DIAMOND_ORE_DOOR, (Blocks.DIAMOND_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_ORE_SLAB, (Blocks.DIAMOND_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DIAMOND_ORE_STAIRS, (Blocks.DIAMOND_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DIAMOND_ORE_FENCE, (Blocks.DIAMOND_ORE), (ModBlocks.DIAMOND_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DIAMOND_ORE_FENCE_GATE, (Blocks.DIAMOND_ORE), (ModBlocks.DIAMOND_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DIAMOND_ORE_TRAPDOOR, (ModBlocks.DIAMOND_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_ORE_PRESSURE_PLATE, (ModBlocks.DIAMOND_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_ORE_BUTTON, Blocks.DIAMOND_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_ORE_WALL, (Blocks.DIAMOND_ORE)).offerTo(exporter);

        //deepslate_diamond_ore
        ModRecipes.DoorRecipe(ModBlocks.DEEPSLATE_DIAMOND_ORE_DOOR, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE, (Blocks.DEEPSLATE_DIAMOND_ORE), (ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE_GATE, (Blocks.DEEPSLATE_DIAMOND_ORE), (ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DEEPSLATE_DIAMOND_ORE_TRAPDOOR, (ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE, (ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_DIAMOND_ORE_BUTTON, Blocks.DEEPSLATE_DIAMOND_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_DIAMOND_ORE_WALL, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);

        //nether_gold_ore
        ModRecipes.DoorRecipe(ModBlocks.NETHER_GOLD_ORE_DOOR, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_GOLD_ORE_SLAB, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.NETHER_GOLD_ORE_STAIRS, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.NETHER_GOLD_ORE_FENCE, (Blocks.NETHER_GOLD_ORE), (ModBlocks.NETHER_GOLD_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.NETHER_GOLD_ORE_FENCE_GATE, (Blocks.NETHER_GOLD_ORE), (ModBlocks.NETHER_GOLD_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.NETHER_GOLD_ORE_TRAPDOOR, (ModBlocks.NETHER_GOLD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_GOLD_ORE_PRESSURE_PLATE, (ModBlocks.NETHER_GOLD_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_GOLD_ORE_BUTTON, Blocks.NETHER_GOLD_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_GOLD_ORE_WALL, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);

        //nether_quartz_ore
        ModRecipes.DoorRecipe(ModBlocks.NETHER_QUARTZ_ORE_DOOR, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_QUARTZ_ORE_SLAB, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.NETHER_QUARTZ_ORE_STAIRS, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.NETHER_QUARTZ_ORE_FENCE, (Blocks.NETHER_QUARTZ_ORE), (ModBlocks.NETHER_QUARTZ_ORE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.NETHER_QUARTZ_ORE_FENCE_GATE, (Blocks.NETHER_QUARTZ_ORE), (ModBlocks.NETHER_QUARTZ_ORE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.NETHER_QUARTZ_ORE_TRAPDOOR, (ModBlocks.NETHER_QUARTZ_ORE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_QUARTZ_ORE_PRESSURE_PLATE, (ModBlocks.NETHER_QUARTZ_ORE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_QUARTZ_ORE_BUTTON, Blocks.NETHER_QUARTZ_ORE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_QUARTZ_ORE_WALL, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);

        //ancient_debris
        ModRecipes.DoorRecipe(ModBlocks.ANCIENT_DEBRIS_DOOR, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANCIENT_DEBRIS_SLAB, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ANCIENT_DEBRIS_STAIRS, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ANCIENT_DEBRIS_FENCE, (Blocks.ANCIENT_DEBRIS), (ModBlocks.ANCIENT_DEBRIS_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ANCIENT_DEBRIS_FENCE_GATE, (Blocks.ANCIENT_DEBRIS), (ModBlocks.ANCIENT_DEBRIS_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, (ModBlocks.ANCIENT_DEBRIS_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANCIENT_DEBRIS_PRESSURE_PLATE, (ModBlocks.ANCIENT_DEBRIS_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANCIENT_DEBRIS_BUTTON, Blocks.ANCIENT_DEBRIS, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANCIENT_DEBRIS_WALL, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);

        //raw_iron_block
        ModRecipes.DoorRecipe(ModBlocks.RAW_IRON_DOOR, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_IRON_SLAB, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RAW_IRON_STAIRS, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RAW_IRON_FENCE, (Blocks.RAW_IRON_BLOCK), (ModBlocks.RAW_IRON_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RAW_IRON_FENCE_GATE, (Blocks.RAW_IRON_BLOCK), (ModBlocks.RAW_IRON_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RAW_IRON_TRAPDOOR, (ModBlocks.RAW_IRON_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_IRON_PRESSURE_PLATE, (ModBlocks.RAW_IRON_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_IRON_BUTTON, Blocks.RAW_IRON_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_IRON_WALL, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);

        //raw_copper_block
        ModRecipes.DoorRecipe(ModBlocks.RAW_COPPER_DOOR, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_COPPER_SLAB, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RAW_COPPER_STAIRS, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RAW_COPPER_FENCE, (Blocks.RAW_COPPER_BLOCK), (ModBlocks.RAW_COPPER_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RAW_COPPER_FENCE_GATE, (Blocks.RAW_COPPER_BLOCK), (ModBlocks.RAW_COPPER_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RAW_COPPER_TRAPDOOR, (ModBlocks.RAW_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_COPPER_PRESSURE_PLATE, (ModBlocks.RAW_COPPER_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_COPPER_BUTTON, Blocks.RAW_COPPER_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_COPPER_WALL, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);

        //raw_gold_block
        ModRecipes.DoorRecipe(ModBlocks.RAW_GOLD_DOOR, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_GOLD_SLAB, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.RAW_GOLD_STAIRS, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.RAW_GOLD_FENCE, (Blocks.RAW_GOLD_BLOCK), (ModBlocks.RAW_GOLD_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.RAW_GOLD_FENCE_GATE, (Blocks.RAW_GOLD_BLOCK), (ModBlocks.RAW_GOLD_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.RAW_GOLD_TRAPDOOR, (ModBlocks.RAW_GOLD_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_GOLD_PRESSURE_PLATE, (ModBlocks.RAW_GOLD_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_GOLD_BUTTON, Blocks.RAW_GOLD_BLOCK, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RAW_GOLD_WALL, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);

        //glowstone
        ModRecipes.DoorRecipe(ModBlocks.GLOWSTONE_DOOR, (Blocks.GLOWSTONE)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GLOWSTONE_SLAB, (Blocks.GLOWSTONE)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.GLOWSTONE_STAIRS, (Blocks.GLOWSTONE)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.GLOWSTONE_FENCE, (Blocks.GLOWSTONE), (ModBlocks.GLOWSTONE_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.GLOWSTONE_FENCE_GATE, (Blocks.GLOWSTONE), (ModBlocks.GLOWSTONE_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.GLOWSTONE_TRAPDOOR, (ModBlocks.GLOWSTONE_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GLOWSTONE_PRESSURE_PLATE, (ModBlocks.GLOWSTONE_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GLOWSTONE_BUTTON, Blocks.GLOWSTONE, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GLOWSTONE_WALL, (Blocks.GLOWSTONE)).offerTo(exporter);

        //oak_leaves
        ModRecipes.DoorRecipe(ModBlocks.OAK_LEAVES_DOOR, (Blocks.OAK_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_LEAVES_SLAB, (Blocks.OAK_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.OAK_LEAVES_STAIRS, (Blocks.OAK_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.OAK_LEAVES_FENCE, (Blocks.OAK_LEAVES), (ModBlocks.OAK_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.OAK_LEAVES_FENCE_GATE, (Blocks.OAK_LEAVES), (ModBlocks.OAK_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.OAK_LEAVES_TRAPDOOR, (ModBlocks.OAK_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_LEAVES_PRESSURE_PLATE, (ModBlocks.OAK_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_LEAVES_BUTTON, Blocks.OAK_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_LEAVES_WALL, (Blocks.OAK_LEAVES)).offerTo(exporter);

        //spruce_leaves
        ModRecipes.DoorRecipe(ModBlocks.SPRUCE_LEAVES_DOOR, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_LEAVES_SLAB, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.SPRUCE_LEAVES_STAIRS, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.SPRUCE_LEAVES_FENCE, (Blocks.SPRUCE_LEAVES), (ModBlocks.SPRUCE_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.SPRUCE_LEAVES_FENCE_GATE, (Blocks.SPRUCE_LEAVES), (ModBlocks.SPRUCE_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.SPRUCE_LEAVES_TRAPDOOR, (ModBlocks.SPRUCE_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_LEAVES_PRESSURE_PLATE, (ModBlocks.SPRUCE_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_LEAVES_BUTTON, Blocks.SPRUCE_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_LEAVES_WALL, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);

        //birch_leaves
        ModRecipes.DoorRecipe(ModBlocks.BIRCH_LEAVES_DOOR, (Blocks.BIRCH_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_LEAVES_SLAB, (Blocks.BIRCH_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.BIRCH_LEAVES_STAIRS, (Blocks.BIRCH_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.BIRCH_LEAVES_FENCE, (Blocks.BIRCH_LEAVES), (ModBlocks.BIRCH_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.BIRCH_LEAVES_FENCE_GATE, (Blocks.BIRCH_LEAVES), (ModBlocks.BIRCH_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.BIRCH_LEAVES_TRAPDOOR, (ModBlocks.BIRCH_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_LEAVES_PRESSURE_PLATE, (ModBlocks.BIRCH_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_LEAVES_BUTTON, Blocks.BIRCH_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_LEAVES_WALL, (Blocks.BIRCH_LEAVES)).offerTo(exporter);

        //jungle_leaves
        ModRecipes.DoorRecipe(ModBlocks.JUNGLE_LEAVES_DOOR, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_LEAVES_SLAB, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.JUNGLE_LEAVES_STAIRS, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.JUNGLE_LEAVES_FENCE, (Blocks.JUNGLE_LEAVES), (ModBlocks.JUNGLE_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.JUNGLE_LEAVES_FENCE_GATE, (Blocks.JUNGLE_LEAVES), (ModBlocks.JUNGLE_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.JUNGLE_LEAVES_TRAPDOOR, (ModBlocks.JUNGLE_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_LEAVES_PRESSURE_PLATE, (ModBlocks.JUNGLE_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_LEAVES_BUTTON, Blocks.JUNGLE_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_LEAVES_WALL, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);

        //acacia_leaves
        ModRecipes.DoorRecipe(ModBlocks.ACACIA_LEAVES_DOOR, (Blocks.ACACIA_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_LEAVES_SLAB, (Blocks.ACACIA_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.ACACIA_LEAVES_STAIRS, (Blocks.ACACIA_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.ACACIA_LEAVES_FENCE, (Blocks.ACACIA_LEAVES), (ModBlocks.ACACIA_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.ACACIA_LEAVES_FENCE_GATE, (Blocks.ACACIA_LEAVES), (ModBlocks.ACACIA_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.ACACIA_LEAVES_TRAPDOOR, (ModBlocks.ACACIA_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_LEAVES_PRESSURE_PLATE, (ModBlocks.ACACIA_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_LEAVES_BUTTON, Blocks.ACACIA_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_LEAVES_WALL, (Blocks.ACACIA_LEAVES)).offerTo(exporter);

        //dark_oak_leaves
        ModRecipes.DoorRecipe(ModBlocks.DARK_OAK_LEAVES_DOOR, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_LEAVES_SLAB, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.DARK_OAK_LEAVES_STAIRS, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.DARK_OAK_LEAVES_FENCE, (Blocks.DARK_OAK_LEAVES), (ModBlocks.DARK_OAK_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.DARK_OAK_LEAVES_FENCE_GATE, (Blocks.DARK_OAK_LEAVES), (ModBlocks.DARK_OAK_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.DARK_OAK_LEAVES_TRAPDOOR, (ModBlocks.DARK_OAK_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_LEAVES_PRESSURE_PLATE, (ModBlocks.DARK_OAK_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_LEAVES_BUTTON, Blocks.DARK_OAK_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_LEAVES_WALL, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);

        //mangrove_leaves
        ModRecipes.DoorRecipe(ModBlocks.MANGROVE_LEAVES_DOOR, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);
        ModRecipes.SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_LEAVES_SLAB, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);
        ModRecipes.StairsRecipe(ModBlocks.MANGROVE_LEAVES_STAIRS, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);
        ModRecipes.NWFenceRecipe(ModBlocks.MANGROVE_LEAVES_FENCE, (Blocks.MANGROVE_LEAVES), (ModBlocks.MANGROVE_LEAVES_SLAB), 3).offerTo(exporter);
        ModRecipes.NWFenceGateRecipe(ModBlocks.MANGROVE_LEAVES_FENCE_GATE, (Blocks.MANGROVE_LEAVES), (ModBlocks.MANGROVE_LEAVES_SLAB), 1).offerTo(exporter);
        ModRecipes.TrapdoorRecipe(ModBlocks.MANGROVE_LEAVES_TRAPDOOR, (ModBlocks.MANGROVE_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_LEAVES_PRESSURE_PLATE, (ModBlocks.MANGROVE_LEAVES_SLAB)).offerTo(exporter);
        ModRecipes.ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_LEAVES_BUTTON, Blocks.MANGROVE_LEAVES, 1).offerTo(exporter);
        ModRecipes.WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_LEAVES_WALL, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);



        
        



        //ingredients
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.COAL_BIT, Items.COAL)
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.IRON_BIT, Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.GOLD_BIT, Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.LAPIS_BIT, Items.LAPIS_LAZULI)
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.NETHERITE_BIT, Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.REDSTONE_SHARD, Items.REDSTONE)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.EMERALD_FRAGMENT, Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.DIAMOND_DUST, Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
        ModRecipes.IngredientRecipe(RecipeCategory.MISC, ModItems.COPPER_BIT, Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
    }









}


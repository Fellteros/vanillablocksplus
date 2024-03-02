package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;


import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //oak
        createStairsRecipe(ModBlocks.OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_BUTTON, Blocks.OAK_WOOD, 8);

        //str oak
        createStairsRecipe(ModBlocks.STR_OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_BUTTON, Blocks.STRIPPED_OAK_WOOD, 8);

        //spruce
        createStairsRecipe(ModBlocks.SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_SLAB, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.SPRUCE_WOOD_DOOR, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.SPRUCE_WOOD_FENCE, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.SPRUCE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.SPRUCE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.SPRUCE_WOOD))
                .criterion(hasItem(Blocks.SPRUCE_WOOD), conditionsFromItem(Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_BUTTON, Blocks.SPRUCE_WOOD, 8);

        //str spruce
        createStairsRecipe(ModBlocks.STR_SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_SPRUCE_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_SPRUCE_WOOD), conditionsFromItem(Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_BUTTON, Blocks.STRIPPED_SPRUCE_WOOD, 8);

        //birch
        createStairsRecipe(ModBlocks.BIRCH_WOOD_STAIRS, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_SLAB, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.BIRCH_WOOD_DOOR, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.BIRCH_WOOD_FENCE, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.BIRCH_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.BIRCH_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.BIRCH_WOOD))
                .criterion(hasItem(Blocks.BIRCH_WOOD), conditionsFromItem(Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_BUTTON, Blocks.BIRCH_WOOD, 8);

        //str birch
        createStairsRecipe(ModBlocks.STR_BIRCH_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_BIRCH_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_BIRCH_WOOD), conditionsFromItem(Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_BUTTON, Blocks.STRIPPED_BIRCH_WOOD, 8);

        //jungle
        createStairsRecipe(ModBlocks.JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_SLAB, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.JUNGLE_WOOD_DOOR, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.JUNGLE_WOOD_FENCE, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.JUNGLE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.JUNGLE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.JUNGLE_WOOD))
                .criterion(hasItem(Blocks.JUNGLE_WOOD), conditionsFromItem(Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_BUTTON, Blocks.JUNGLE_WOOD, 8);

        //str jungle
        createStairsRecipe(ModBlocks.STR_JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_JUNGLE_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_JUNGLE_WOOD), conditionsFromItem(Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_BUTTON, Blocks.STRIPPED_JUNGLE_WOOD, 8);

        //acacia
        createStairsRecipe(ModBlocks.ACACIA_WOOD_STAIRS, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_SLAB, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.ACACIA_WOOD_DOOR, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.ACACIA_WOOD_FENCE, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.ACACIA_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.ACACIA_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.ACACIA_WOOD))
                .criterion(hasItem(Blocks.ACACIA_WOOD), conditionsFromItem(Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_BUTTON, Blocks.ACACIA_WOOD, 8);

        //str acacia
        createStairsRecipe(ModBlocks.STR_ACACIA_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_ACACIA_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_ACACIA_WOOD), conditionsFromItem(Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_BUTTON, Blocks.STRIPPED_ACACIA_WOOD, 8);

        //dark oak
        createStairsRecipe(ModBlocks.DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.DARK_OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.DARK_OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.DARK_OAK_WOOD), conditionsFromItem(Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_BUTTON, Blocks.DARK_OAK_WOOD, 8);

        //str dark oak
        createStairsRecipe(ModBlocks.STR_DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_DARK_OAK_WOOD), conditionsFromItem(Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_BUTTON, Blocks.STRIPPED_DARK_OAK_WOOD, 8);

        //mangrove
        createStairsRecipe(ModBlocks.MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_SLAB, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.MANGROVE_WOOD_DOOR, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.MANGROVE_WOOD_FENCE, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.MANGROVE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.MANGROVE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.MANGROVE_WOOD))
                .criterion(hasItem(Blocks.MANGROVE_WOOD), conditionsFromItem(Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_BUTTON, Blocks.MANGROVE_WOOD, 8);

        //str mangrove
        createStairsRecipe(ModBlocks.STR_MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_MANGROVE_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_MANGROVE_WOOD), conditionsFromItem(Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_BUTTON, Blocks.STRIPPED_MANGROVE_WOOD, 8);

        //cherry
        createStairsRecipe(ModBlocks.CHERRY_WOOD_STAIRS, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_SLAB, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.CHERRY_WOOD_DOOR, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.CHERRY_WOOD_FENCE, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.CHERRY_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.CHERRY_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.CHERRY_WOOD))
                .criterion(hasItem(Blocks.CHERRY_WOOD), conditionsFromItem(Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_BUTTON, Blocks.CHERRY_WOOD, 8);

        //str cherry
        createStairsRecipe(ModBlocks.STR_CHERRY_WOOD_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_SLAB, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_CHERRY_WOOD_DOOR, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Blocks.STRIPPED_CHERRY_WOOD), conditionsFromItem(Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_BUTTON, Blocks.STRIPPED_CHERRY_WOOD, 8);

        //bamboo
        createStairsRecipe(ModBlocks.BAMBOO_BLOCK_STAIRS, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_SLAB, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.BAMBOO_BLOCK_DOOR, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.BAMBOO_BLOCK_FENCE, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, Ingredient.ofItems(Blocks.BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_BUTTON, Blocks.BAMBOO_BLOCK, 8);

        //bamboo
        createStairsRecipe(ModBlocks.STR_BAMBOO_BLOCK_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_SLAB, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_DOOR, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, Blocks.STRIPPED_BAMBOO_BLOCK, 8);

        //crimson hyphae
        createStairsRecipe(ModBlocks.CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_SLAB, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.CRIMSON_HYPHAE_DOOR, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.CRIMSON_HYPHAE), conditionsFromItem(Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_BUTTON, Blocks.CRIMSON_HYPHAE, 8);

        //str crimson hyphae
        createStairsRecipe(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_SLAB, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_CRIMSON_HYPHAE), conditionsFromItem(Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON, Blocks.STRIPPED_CRIMSON_HYPHAE, 8);

        //warped hyphae
        createStairsRecipe(ModBlocks.WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_SLAB, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.WARPED_HYPHAE_DOOR, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.WARPED_HYPHAE_FENCE, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.WARPED_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.WARPED_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.WARPED_HYPHAE))
                .criterion(hasItem(Blocks.WARPED_HYPHAE), conditionsFromItem(Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_BUTTON, Blocks.WARPED_HYPHAE, 8);

        //str warped hyphae
        createStairsRecipe(ModBlocks.STR_WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_SLAB, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.STR_WARPED_HYPHAE_DOOR, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR, Ingredient.ofItems(Blocks.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Blocks.STRIPPED_WARPED_HYPHAE), conditionsFromItem(Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        offer2x2ButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_BUTTON, Blocks.STRIPPED_WARPED_HYPHAE, 8);

        //stone
        createDoorRecipe(ModBlocks.STONE_DOOR, Ingredient.ofItems(Blocks.STONE))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.STONE_FENCE, Ingredient.ofItems(Blocks.STONE), Ingredient.ofItems(Blocks.STONE_SLAB), 3)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.STONE_FENCE_GATE, Ingredient.ofItems(Blocks.STONE), Ingredient.ofItems(Blocks.STONE_SLAB), 1)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STONE_TRAPDOOR, Ingredient.ofItems(Blocks.STONE_SLAB))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);

        //cobblestone
        createDoorRecipe(ModBlocks.COBBLESTONE_DOOR, Ingredient.ofItems(Blocks.COBBLESTONE))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.COBBLESTONE_FENCE, Ingredient.ofItems(Blocks.COBBLESTONE), Ingredient.ofItems(Blocks.COBBLESTONE_SLAB), 3)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.COBBLESTONE_FENCE_GATE, Ingredient.ofItems(Blocks.COBBLESTONE), Ingredient.ofItems(Blocks.COBBLESTONE_SLAB), 1)
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.COBBLESTONE_TRAPDOOR, Ingredient.ofItems(Blocks.COBBLESTONE_SLAB))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter);


        //mossy cobblestone
        createDoorRecipe(ModBlocks.MOSSY_COBBLESTONE_DOOR, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE), Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE_SLAB), 3)
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE), Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE_SLAB), 1)
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE_SLAB))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_BUTTON, Blocks.MOSSY_COBBLESTONE, 1);

        //smooth stone
        createStairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.SMOOTH_STONE_DOOR, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.SMOOTH_STONE_FENCE, Ingredient.ofItems(Blocks.SMOOTH_STONE), Ingredient.ofItems(Blocks.SMOOTH_STONE_SLAB), 3)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.SMOOTH_STONE_FENCE_GATE, Ingredient.ofItems(Blocks.SMOOTH_STONE), Ingredient.ofItems(Blocks.SMOOTH_STONE_SLAB), 1)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.SMOOTH_STONE_TRAPDOOR, Ingredient.ofItems(Blocks.SMOOTH_STONE_SLAB))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BUTTON, Blocks.SMOOTH_STONE, 1);

        //stone bricks
        createDoorRecipe(ModBlocks.STONE_BRICKS_DOOR, Ingredient.ofItems(Blocks.STONE_BRICKS))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.STONE_BRICKS_FENCE, Ingredient.ofItems(Blocks.STONE_BRICKS), Ingredient.ofItems(Blocks.STONE_BRICK_SLAB), 3)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.STONE_BRICKS_FENCE_GATE, Ingredient.ofItems(Blocks.STONE_BRICKS), Ingredient.ofItems(Blocks.STONE_BRICK_SLAB), 1)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.STONE_BRICKS_TRAPDOOR, Ingredient.ofItems(Blocks.STONE_BRICK_SLAB))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_PRESSURE_PLATE, Ingredient.ofItems(Blocks.STONE_BRICKS))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_BUTTON, Blocks.STONE_BRICKS, 1);

        //cracked stone bricks
        createDoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_DOOR, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_SLAB, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_STONE_BRICKS_SLAB), 3)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS), Ingredient.ofItems(ModBlocks.CRACKED_STONE_BRICKS_SLAB), 1)
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR, Ingredient.ofItems(ModBlocks.CRACKED_STONE_BRICKS_SLAB))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CRACKED_STONE_BRICKS), conditionsFromItem(Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_BUTTON, Blocks.CRACKED_STONE_BRICKS, 1);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_WALL, Blocks.CRACKED_STONE_BRICKS);

        //granite
        createDoorRecipe(ModBlocks.GRANITE_DOOR, Ingredient.ofItems(Blocks.GRANITE))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.GRANITE_FENCE, Ingredient.ofItems(Blocks.GRANITE), Ingredient.ofItems(Blocks.GRANITE_SLAB), 3)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.GRANITE_FENCE_GATE, Ingredient.ofItems(Blocks.GRANITE), Ingredient.ofItems(Blocks.GRANITE_SLAB), 1)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.GRANITE_TRAPDOOR, Ingredient.ofItems(Blocks.GRANITE_SLAB))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.GRANITE))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BUTTON, Blocks.GRANITE, 1);

        //polished granite
        createDoorRecipe(ModBlocks.POLISHED_GRANITE_DOOR, Ingredient.ofItems(Blocks.POLISHED_GRANITE))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.POLISHED_GRANITE_FENCE, Ingredient.ofItems(Blocks.POLISHED_GRANITE), Ingredient.ofItems(Blocks.POLISHED_GRANITE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.POLISHED_GRANITE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_GRANITE), Ingredient.ofItems(Blocks.POLISHED_GRANITE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.POLISHED_GRANITE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_GRANITE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_GRANITE))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE, 1);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

        //diorite
        createDoorRecipe(ModBlocks.DIORITE_DOOR, Ingredient.ofItems(Blocks.DIORITE))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.DIORITE_FENCE, Ingredient.ofItems(Blocks.DIORITE), Ingredient.ofItems(Blocks.DIORITE_SLAB), 3)
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.DIORITE_FENCE_GATE, Ingredient.ofItems(Blocks.DIORITE), Ingredient.ofItems(Blocks.DIORITE_SLAB), 1)
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.DIORITE_TRAPDOOR, Ingredient.ofItems(Blocks.DIORITE_SLAB))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DIORITE))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BUTTON, Blocks.DIORITE, 1);

        //polished diorite
        createDoorRecipe(ModBlocks.POLISHED_DIORITE_DOOR, Ingredient.ofItems(Blocks.POLISHED_DIORITE))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.POLISHED_DIORITE_FENCE, Ingredient.ofItems(Blocks.POLISHED_DIORITE), Ingredient.ofItems(Blocks.POLISHED_DIORITE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.POLISHED_DIORITE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_DIORITE), Ingredient.ofItems(Blocks.POLISHED_DIORITE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.POLISHED_DIORITE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_DIORITE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_DIORITE))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE, 1);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

        //andesite
        createDoorRecipe(ModBlocks.ANDESITE_DOOR, Ingredient.ofItems(Blocks.ANDESITE))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.ANDESITE_FENCE, Ingredient.ofItems(Blocks.ANDESITE), Ingredient.ofItems(Blocks.ANDESITE_SLAB), 3)
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.ANDESITE_FENCE_GATE, Ingredient.ofItems(Blocks.ANDESITE), Ingredient.ofItems(Blocks.ANDESITE_SLAB), 1)
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.ANDESITE_TRAPDOOR, Ingredient.ofItems(Blocks.ANDESITE_SLAB))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.ANDESITE))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE, 1);

        //polished andesite
        createDoorRecipe(ModBlocks.POLISHED_ANDESITE_DOOR, Ingredient.ofItems(Blocks.POLISHED_ANDESITE))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.POLISHED_ANDESITE_FENCE, Ingredient.ofItems(Blocks.POLISHED_ANDESITE), Ingredient.ofItems(Blocks.POLISHED_ANDESITE_SLAB), 3)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.POLISHED_ANDESITE_FENCE_GATE, Ingredient.ofItems(Blocks.POLISHED_ANDESITE), Ingredient.ofItems(Blocks.POLISHED_ANDESITE_SLAB), 1)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.POLISHED_ANDESITE_TRAPDOOR, Ingredient.ofItems(Blocks.POLISHED_ANDESITE_SLAB))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.POLISHED_ANDESITE))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE, 1);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

        //deepslate
        createDoorRecipe(ModBlocks.DEEPSLATE_DOOR, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_SLAB, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.DEEPSLATE_STAIRS, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        createNotWoodFenceRecipe(ModBlocks.DEEPSLATE_FENCE, Ingredient.ofItems(Blocks.DEEPSLATE), Ingredient.ofItems(ModBlocks.DEEPSLATE_SLAB), 3)
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        createNotWoodFenceGateRecipe(ModBlocks.DEEPSLATE_FENCE_GATE, Ingredient.ofItems(Blocks.DEEPSLATE), Ingredient.ofItems(ModBlocks.DEEPSLATE_SLAB), 1)
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.DEEPSLATE_TRAPDOOR, Ingredient.ofItems(ModBlocks.DEEPSLATE_SLAB))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_PRESSURE_PLATE, Ingredient.ofItems(Blocks.DEEPSLATE))
                .criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE))
                .offerTo(exporter);
        offerButtonRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE, 1);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);





    }




    public static CraftingRecipeJsonBuilder createNotWoodFenceRecipe(ItemConvertible output, Ingredient input, Ingredient likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("W#W")
                .pattern("W#W");
    }

    public static CraftingRecipeJsonBuilder createNotWoodFenceGateRecipe(ItemConvertible output, Ingredient input, Ingredient likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#");
    }


    public static void offer2x2ButtonRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
        ShapedRecipeJsonBuilder.create(category, output, outputCount)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerButtonRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
        ShapedRecipeJsonBuilder.create(category, output, outputCount)
                .input('#', input)
                .pattern(" # ")
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }



}


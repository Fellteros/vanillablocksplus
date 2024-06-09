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
        ModRecipes.createStairsRecipe(ModBlocks.OAK_WOOD_STAIRS, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_SLAB, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.OAK_WOOD_DOOR, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.OAK_WOOD_FENCE, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.OAK_WOOD_FENCE_GATE, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.OAK_WOOD_PRESSURE_PLATE, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.OAK_WOOD_TRAPDOOR, (Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_BUTTON, Blocks.OAK_WOOD)
                .offerTo(exporter);

        //str oak
        ModRecipes.createStairsRecipe(ModBlocks.STR_OAK_WOOD_STAIRS, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_SLAB, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_OAK_WOOD_DOOR, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_OAK_WOOD_FENCE, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_BUTTON, Blocks.STRIPPED_OAK_WOOD)
                .offerTo(exporter);

        //spruce
        ModRecipes.createStairsRecipe(ModBlocks.SPRUCE_WOOD_STAIRS, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_SLAB, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.SPRUCE_WOOD_DOOR, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.SPRUCE_WOOD_FENCE, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.SPRUCE_WOOD_FENCE_GATE, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SPRUCE_WOOD_TRAPDOOR, (Blocks.SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_BUTTON, Blocks.SPRUCE_WOOD)
                .offerTo(exporter);

        //str spruce
        ModRecipes.createStairsRecipe(ModBlocks.STR_SPRUCE_WOOD_STAIRS, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_SLAB, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_SPRUCE_WOOD_DOOR, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR, (Blocks.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_BUTTON, Blocks.STRIPPED_SPRUCE_WOOD)
                .offerTo(exporter);

        //birch
        ModRecipes.createStairsRecipe(ModBlocks.BIRCH_WOOD_STAIRS, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_SLAB, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.BIRCH_WOOD_DOOR, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.BIRCH_WOOD_FENCE, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.BIRCH_WOOD_FENCE_GATE, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BIRCH_WOOD_TRAPDOOR, (Blocks.BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_BUTTON, Blocks.BIRCH_WOOD)
                .offerTo(exporter);

        //str birch
        ModRecipes.createStairsRecipe(ModBlocks.STR_BIRCH_WOOD_STAIRS, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_SLAB, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_BIRCH_WOOD_DOOR, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR, (Blocks.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_BUTTON, Blocks.STRIPPED_BIRCH_WOOD)
                .offerTo(exporter);

        //jungle
        ModRecipes.createStairsRecipe(ModBlocks.JUNGLE_WOOD_STAIRS, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_SLAB, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.JUNGLE_WOOD_DOOR, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.JUNGLE_WOOD_FENCE, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.JUNGLE_WOOD_FENCE_GATE, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.JUNGLE_WOOD_TRAPDOOR, (Blocks.JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_BUTTON, Blocks.JUNGLE_WOOD)
                .offerTo(exporter);

        //str jungle
        ModRecipes.createStairsRecipe(ModBlocks.STR_JUNGLE_WOOD_STAIRS, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_SLAB, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_JUNGLE_WOOD_DOOR, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR, (Blocks.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_BUTTON, Blocks.STRIPPED_JUNGLE_WOOD)
                .offerTo(exporter);

        //acacia
        ModRecipes.createStairsRecipe(ModBlocks.ACACIA_WOOD_STAIRS, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_SLAB, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.ACACIA_WOOD_DOOR, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.ACACIA_WOOD_FENCE, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.ACACIA_WOOD_FENCE_GATE, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ACACIA_WOOD_TRAPDOOR, (Blocks.ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_BUTTON, Blocks.ACACIA_WOOD)
                .offerTo(exporter);

        //str acacia
        ModRecipes.createStairsRecipe(ModBlocks.STR_ACACIA_WOOD_STAIRS, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_SLAB, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_ACACIA_WOOD_DOOR, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR, (Blocks.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_BUTTON, Blocks.STRIPPED_ACACIA_WOOD)
                .offerTo(exporter);

        //dark oak
        ModRecipes.createStairsRecipe(ModBlocks.DARK_OAK_WOOD_STAIRS, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_SLAB, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.DARK_OAK_WOOD_DOOR, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.DARK_OAK_WOOD_FENCE, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, (Blocks.DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_BUTTON, Blocks.DARK_OAK_WOOD)
                .offerTo(exporter);

        //str dark oak
        ModRecipes.createStairsRecipe(ModBlocks.STR_DARK_OAK_WOOD_STAIRS, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_SLAB, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_DOOR, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_BUTTON, Blocks.STRIPPED_DARK_OAK_WOOD)
                .offerTo(exporter);

        //mangrove
        ModRecipes.createStairsRecipe(ModBlocks.MANGROVE_WOOD_STAIRS, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_SLAB, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.MANGROVE_WOOD_DOOR, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.MANGROVE_WOOD_FENCE, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.MANGROVE_WOOD_FENCE_GATE, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MANGROVE_WOOD_TRAPDOOR, (Blocks.MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_BUTTON, Blocks.MANGROVE_WOOD)
                .offerTo(exporter);

        //str mangrove
        ModRecipes.createStairsRecipe(ModBlocks.STR_MANGROVE_WOOD_STAIRS, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_SLAB, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_MANGROVE_WOOD_DOOR, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR, (Blocks.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_BUTTON, Blocks.STRIPPED_MANGROVE_WOOD)
                .offerTo(exporter);

        //cherry
        ModRecipes.createStairsRecipe(ModBlocks.CHERRY_WOOD_STAIRS, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_SLAB, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CHERRY_WOOD_DOOR, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.CHERRY_WOOD_FENCE, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.CHERRY_WOOD_FENCE_GATE, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CHERRY_WOOD_TRAPDOOR, (Blocks.CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_BUTTON, Blocks.CHERRY_WOOD)
                .offerTo(exporter);

        //str cherry
        ModRecipes.createStairsRecipe(ModBlocks.STR_CHERRY_WOOD_STAIRS, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_SLAB, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_CHERRY_WOOD_DOOR, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR, (Blocks.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_BUTTON, Blocks.STRIPPED_CHERRY_WOOD)
                .offerTo(exporter);

        //bamboo
        ModRecipes.createStairsRecipe(ModBlocks.BAMBOO_BLOCK_STAIRS, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_SLAB, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.BAMBOO_BLOCK_DOOR, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.BAMBOO_BLOCK_FENCE, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, (Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_BUTTON, Blocks.BAMBOO_BLOCK)
                .offerTo(exporter);

        //bamboo
        ModRecipes.createStairsRecipe(ModBlocks.STR_BAMBOO_BLOCK_STAIRS, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_SLAB, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_DOOR, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR, (Blocks.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, Blocks.STRIPPED_BAMBOO_BLOCK)
                .offerTo(exporter);

        //crimson hyphae
        ModRecipes.createStairsRecipe(ModBlocks.CRIMSON_HYPHAE_STAIRS, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_SLAB, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CRIMSON_HYPHAE_DOOR, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, (Blocks.CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_BUTTON, Blocks.CRIMSON_HYPHAE)
                .offerTo(exporter);

        //str crimson hyphae
        ModRecipes.createStairsRecipe(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_SLAB, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR, (Blocks.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON, Blocks.STRIPPED_CRIMSON_HYPHAE)
                .offerTo(exporter);

        //warped hyphae
        ModRecipes.createStairsRecipe(ModBlocks.WARPED_HYPHAE_STAIRS, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_SLAB, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.WARPED_HYPHAE_DOOR, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.WARPED_HYPHAE_FENCE, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.WARPED_HYPHAE_FENCE_GATE, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WARPED_HYPHAE_TRAPDOOR, (Blocks.WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_BUTTON, Blocks.WARPED_HYPHAE)
                .offerTo(exporter);

        //str warped hyphae
        ModRecipes.createStairsRecipe(ModBlocks.STR_WARPED_HYPHAE_STAIRS, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_SLAB, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.STR_WARPED_HYPHAE_DOOR, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createFenceGateRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS,
                ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR, (Blocks.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_BUTTON, Blocks.STRIPPED_WARPED_HYPHAE)
                .offerTo(exporter);

        //stone
        ModRecipes.createDoorRecipe(ModBlocks.STONE_DOOR, (Blocks.STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.STONE_FENCE, (Blocks.STONE), (Blocks.STONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.STONE_FENCE_GATE, (Blocks.STONE), (Blocks.STONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STONE_TRAPDOOR, (Blocks.STONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, (Blocks.STONE))
                .offerTo(exporter);

        //cobblestone
        ModRecipes.createDoorRecipe(ModBlocks.COBBLESTONE_DOOR, (Blocks.COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COBBLESTONE_FENCE, (Blocks.COBBLESTONE), (Blocks.COBBLESTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COBBLESTONE_FENCE_GATE, (Blocks.COBBLESTONE), (Blocks.COBBLESTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COBBLESTONE_TRAPDOOR, (Blocks.COBBLESTONE_SLAB))
                .offerTo(exporter);


        //mossy cobblestone
        ModRecipes.createDoorRecipe(ModBlocks.MOSSY_COBBLESTONE_DOOR, (Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE, (Blocks.MOSSY_COBBLESTONE), (Blocks.MOSSY_COBBLESTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE, (Blocks.MOSSY_COBBLESTONE), (Blocks.MOSSY_COBBLESTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR, (Blocks.MOSSY_COBBLESTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, (Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_BUTTON, Blocks.MOSSY_COBBLESTONE, 1)
                .offerTo(exporter);

        //smooth stone
        ModRecipes.createStairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, (Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_STONE_DOOR, (Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_STONE_FENCE, (Blocks.SMOOTH_STONE), (Blocks.SMOOTH_STONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_STONE_FENCE_GATE, (Blocks.SMOOTH_STONE), (Blocks.SMOOTH_STONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_STONE_TRAPDOOR, (Blocks.SMOOTH_STONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, (Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, (Blocks.SMOOTH_STONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BUTTON, Blocks.SMOOTH_STONE, 1)
                .offerTo(exporter);

        //stone bricks
        ModRecipes.createDoorRecipe(ModBlocks.STONE_BRICKS_DOOR, (Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.STONE_BRICKS_FENCE, (Blocks.STONE_BRICKS), (Blocks.STONE_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.STONE_BRICKS_FENCE_GATE, (Blocks.STONE_BRICKS), (Blocks.STONE_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.STONE_BRICKS_TRAPDOOR, (Blocks.STONE_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_PRESSURE_PLATE, (Blocks.STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_BUTTON, Blocks.STONE_BRICKS, 1)
                .offerTo(exporter);

        //cracked stone bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_DOOR, (Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_SLAB, (Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, (Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE, (Blocks.CRACKED_STONE_BRICKS), (ModBlocks.CRACKED_STONE_BRICKS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE, (Blocks.CRACKED_STONE_BRICKS), (ModBlocks.CRACKED_STONE_BRICKS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR, (ModBlocks.CRACKED_STONE_BRICKS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE, (Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_BUTTON, Blocks.CRACKED_STONE_BRICKS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_WALL, (Blocks.CRACKED_STONE_BRICKS))
                .offerTo(exporter);

        //granite
        ModRecipes.createDoorRecipe(ModBlocks.GRANITE_DOOR, (Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRANITE_FENCE, (Blocks.GRANITE), (Blocks.GRANITE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRANITE_FENCE_GATE, (Blocks.GRANITE), (Blocks.GRANITE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRANITE_TRAPDOOR, (Blocks.GRANITE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_PRESSURE_PLATE, (Blocks.GRANITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BUTTON, Blocks.GRANITE, 1)
                .offerTo(exporter);

        //polished granite
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_GRANITE_DOOR, (Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_GRANITE_FENCE, (Blocks.POLISHED_GRANITE), (Blocks.POLISHED_GRANITE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_GRANITE_FENCE_GATE, (Blocks.POLISHED_GRANITE), (Blocks.POLISHED_GRANITE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_GRANITE_TRAPDOOR, (Blocks.POLISHED_GRANITE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, (Blocks.POLISHED_GRANITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, (Blocks.POLISHED_GRANITE))
                .offerTo(exporter);

        //diorite
        ModRecipes.createDoorRecipe(ModBlocks.DIORITE_DOOR, (Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DIORITE_FENCE, (Blocks.DIORITE), (Blocks.DIORITE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DIORITE_FENCE_GATE, (Blocks.DIORITE), (Blocks.DIORITE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DIORITE_TRAPDOOR, (Blocks.DIORITE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_PRESSURE_PLATE, (Blocks.DIORITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BUTTON, Blocks.DIORITE, 1)
                .offerTo(exporter);

        //polished diorite
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_DIORITE_DOOR, (Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_DIORITE_FENCE, (Blocks.POLISHED_DIORITE), (Blocks.POLISHED_DIORITE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_DIORITE_FENCE_GATE, (Blocks.POLISHED_DIORITE), (Blocks.POLISHED_DIORITE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_DIORITE_TRAPDOOR, (Blocks.POLISHED_DIORITE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, (Blocks.POLISHED_DIORITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, (Blocks.POLISHED_DIORITE))
                .offerTo(exporter);

        //andesite
        ModRecipes.createDoorRecipe(ModBlocks.ANDESITE_DOOR, (Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ANDESITE_FENCE, (Blocks.ANDESITE), (Blocks.ANDESITE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ANDESITE_FENCE_GATE, (Blocks.ANDESITE), (Blocks.ANDESITE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ANDESITE_TRAPDOOR, (Blocks.ANDESITE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_PRESSURE_PLATE, (Blocks.ANDESITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE, 1)
                .offerTo(exporter);

        //polished andesite
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_ANDESITE_DOOR, (Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_ANDESITE_FENCE, (Blocks.POLISHED_ANDESITE), (Blocks.POLISHED_ANDESITE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_ANDESITE_FENCE_GATE, (Blocks.POLISHED_ANDESITE), (Blocks.POLISHED_ANDESITE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_ANDESITE_TRAPDOOR, (Blocks.POLISHED_ANDESITE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, (Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, (Blocks.POLISHED_ANDESITE))
                .offerTo(exporter);

        //deepslate
        ModRecipes.createDoorRecipe(ModBlocks.DEEPSLATE_DOOR, (Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_SLAB, (Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.DEEPSLATE_STAIRS, (Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DEEPSLATE_FENCE, (Blocks.DEEPSLATE), (ModBlocks.DEEPSLATE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DEEPSLATE_FENCE_GATE, (Blocks.DEEPSLATE), (ModBlocks.DEEPSLATE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DEEPSLATE_TRAPDOOR, (ModBlocks.DEEPSLATE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_PRESSURE_PLATE, (Blocks.DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, (Blocks.DEEPSLATE))
                .offerTo(exporter);

        //cobbled deepslate
        ModRecipes.createDoorRecipe(ModBlocks.COBBLED_DEEPSLATE_DOOR, (Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE, (Blocks.COBBLED_DEEPSLATE), (Blocks.COBBLED_DEEPSLATE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE, (Blocks.COBBLED_DEEPSLATE), (Blocks.COBBLED_DEEPSLATE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR, (Blocks.COBBLED_DEEPSLATE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, (Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE, 1)
                .offerTo(exporter);

        //chiseled deepslate
        ModRecipes.createDoorRecipe(ModBlocks.CHISELED_DEEPSLATE_DOOR, (Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_SLAB, (Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CHISELED_DEEPSLATE_STAIRS, (Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE, (Blocks.CHISELED_DEEPSLATE), (ModBlocks.CHISELED_DEEPSLATE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE, (Blocks.CHISELED_DEEPSLATE), (ModBlocks.CHISELED_DEEPSLATE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR, (ModBlocks.CHISELED_DEEPSLATE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE, (Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_BUTTON, Blocks.CHISELED_DEEPSLATE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_WALL, (Blocks.CHISELED_DEEPSLATE))
                .offerTo(exporter);

        //polished deepslate
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_DEEPSLATE_DOOR, (Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE, (Blocks.POLISHED_DEEPSLATE), (Blocks.POLISHED_DEEPSLATE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE, (Blocks.POLISHED_DEEPSLATE), (Blocks.POLISHED_DEEPSLATE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR, (Blocks.POLISHED_DEEPSLATE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, (Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE, 1)
                .offerTo(exporter);

        //deepslate bricks
        ModRecipes.createDoorRecipe(ModBlocks.DEEPSLATE_BRICKS_DOOR, (Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE, (Blocks.DEEPSLATE_BRICKS), (Blocks.DEEPSLATE_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE, (Blocks.DEEPSLATE_BRICKS), (Blocks.DEEPSLATE_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR, (Blocks.DEEPSLATE_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE, (Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_BUTTON, Blocks.DEEPSLATE_BRICKS, 1)
                .offerTo(exporter);

        //cracked deepslate bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR, (Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, (Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, (Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE, (Blocks.CRACKED_DEEPSLATE_BRICKS), (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE, (Blocks.CRACKED_DEEPSLATE_BRICKS), (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR, (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE, (Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON, Blocks.CRACKED_DEEPSLATE_BRICKS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL, (Blocks.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter);

        //deepslate bricks
        ModRecipes.createDoorRecipe(ModBlocks.DEEPSLATE_TILES_DOOR, (Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DEEPSLATE_TILES_FENCE, (Blocks.DEEPSLATE_TILES), (Blocks.DEEPSLATE_TILE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DEEPSLATE_TILES_FENCE_GATE, (Blocks.DEEPSLATE_TILES), (Blocks.DEEPSLATE_TILE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DEEPSLATE_TILES_TRAPDOOR, (Blocks.DEEPSLATE_TILE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE, (Blocks.DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_BUTTON, Blocks.DEEPSLATE_TILES, 1)
                .offerTo(exporter);

        //cracked deepslate tiles
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR, (Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, (Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS, (Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE, (Blocks.CRACKED_DEEPSLATE_TILES), (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE, (Blocks.CRACKED_DEEPSLATE_TILES), (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR, (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE, (Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON, Blocks.CRACKED_DEEPSLATE_TILES, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_WALL, (Blocks.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter);

        //bricks
        ModRecipes.createDoorRecipe(ModBlocks.BRICK_DOOR, (Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BRICK_FENCE, (Blocks.BRICKS), (Blocks.BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BRICK_FENCE_GATE, (Blocks.BRICKS), (Blocks.BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BRICK_TRAPDOOR, (Blocks.BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_PRESSURE_PLATE, (Blocks.BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_BUTTON, Blocks.BRICKS, 1)
                .offerTo(exporter);

        //packed mud
        ModRecipes.createDoorRecipe(ModBlocks.PACKED_MUD_DOOR, (Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_SLAB, (Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PACKED_MUD_STAIRS, (Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PACKED_MUD_FENCE, (Blocks.PACKED_MUD), (ModBlocks.PACKED_MUD_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PACKED_MUD_FENCE_GATE, (Blocks.PACKED_MUD), (ModBlocks.PACKED_MUD_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PACKED_MUD_TRAPDOOR, (ModBlocks.PACKED_MUD_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_PRESSURE_PLATE, (Blocks.PACKED_MUD))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_BUTTON, Blocks.PACKED_MUD, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, (Blocks.PACKED_MUD))
                .offerTo(exporter);

        //mud bricks
        ModRecipes.createDoorRecipe(ModBlocks.MUD_BRICK_DOOR, (Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MUD_BRICK_FENCE, (Blocks.MUD_BRICKS), (Blocks.MUD_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MUD_BRICK_FENCE_GATE, (Blocks.MUD_BRICKS), (Blocks.MUD_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MUD_BRICK_TRAPDOOR, (Blocks.MUD_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_PRESSURE_PLATE, (Blocks.MUD_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_BUTTON, Blocks.MUD_BRICKS, 1)
                .offerTo(exporter);

        //sandstone
        ModRecipes.createDoorRecipe(ModBlocks.SANDSTONE_DOOR, (Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SANDSTONE_FENCE, (Blocks.SANDSTONE), (Blocks.SANDSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SANDSTONE_FENCE_GATE, (Blocks.SANDSTONE), (Blocks.SANDSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SANDSTONE_TRAPDOOR, (Blocks.SANDSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_PRESSURE_PLATE, (Blocks.SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BUTTON, Blocks.SANDSTONE, 1)
                .offerTo(exporter);

        //smooth sandstone
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_SANDSTONE_DOOR, (Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE, (Blocks.SMOOTH_SANDSTONE), (Blocks.SMOOTH_SANDSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE, (Blocks.SMOOTH_SANDSTONE), (Blocks.SMOOTH_SANDSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR, (Blocks.SMOOTH_SANDSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, (Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_BUTTON, Blocks.SMOOTH_SANDSTONE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, (Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);

        //cut sandstone
        ModRecipes.createStairsRecipe(ModBlocks.CUT_SANDSTONE_STAIRS, (Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CUT_SANDSTONE_DOOR, (Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CUT_SANDSTONE_FENCE, (Blocks.CUT_SANDSTONE), (Blocks.CUT_SANDSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CUT_SANDSTONE_FENCE_GATE, (Blocks.CUT_SANDSTONE), (Blocks.CUT_SANDSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CUT_SANDSTONE_TRAPDOOR, (Blocks.CUT_SANDSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE, (Blocks.CUT_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_BUTTON, Blocks.CUT_SANDSTONE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, (Blocks.CUT_SANDSTONE))
                .offerTo(exporter);

        //red sandstone
        ModRecipes.createDoorRecipe(ModBlocks.RED_SANDSTONE_DOOR, (Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_SANDSTONE_FENCE, (Blocks.RED_SANDSTONE), (Blocks.RED_SANDSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_SANDSTONE_FENCE_GATE, (Blocks.RED_SANDSTONE), (Blocks.RED_SANDSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_SANDSTONE_TRAPDOOR, (Blocks.RED_SANDSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, (Blocks.RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BUTTON, Blocks.RED_SANDSTONE, 1)
                .offerTo(exporter);

        //red smooth sandstone
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR, (Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE, (Blocks.SMOOTH_RED_SANDSTONE), (Blocks.SMOOTH_RED_SANDSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE, (Blocks.SMOOTH_RED_SANDSTONE), (Blocks.SMOOTH_RED_SANDSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR, (Blocks.SMOOTH_RED_SANDSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, (Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON, Blocks.SMOOTH_RED_SANDSTONE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, (Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter);

        //red cut sandstone
        ModRecipes.createStairsRecipe(ModBlocks.CUT_RED_SANDSTONE_STAIRS, (Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createDoorRecipe(ModBlocks.CUT_RED_SANDSTONE_DOOR, (Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE, (Blocks.CUT_RED_SANDSTONE), (Blocks.CUT_RED_SANDSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE, (Blocks.CUT_RED_SANDSTONE), (Blocks.CUT_RED_SANDSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR, (Blocks.CUT_RED_SANDSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE, (Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_BUTTON, Blocks.CUT_RED_SANDSTONE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, (Blocks.CUT_RED_SANDSTONE))
                .offerTo(exporter);

        //sea lantern
        ModRecipes.createDoorRecipe(ModBlocks.SEA_LANTERN_DOOR, (Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_SLAB, (Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.SEA_LANTERN_STAIRS, (Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SEA_LANTERN_FENCE, (Blocks.SEA_LANTERN), (ModBlocks.SEA_LANTERN_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SEA_LANTERN_FENCE_GATE, (Blocks.SEA_LANTERN), (ModBlocks.SEA_LANTERN_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SEA_LANTERN_TRAPDOOR, (ModBlocks.SEA_LANTERN_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_PRESSURE_PLATE, (Blocks.SEA_LANTERN))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_BUTTON, Blocks.SEA_LANTERN, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_WALL, (Blocks.SEA_LANTERN))
                .offerTo(exporter);

        //prismarine
        ModRecipes.createDoorRecipe(ModBlocks.PRISMARINE_DOOR, (Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PRISMARINE_FENCE, (Blocks.PRISMARINE), (Blocks.PRISMARINE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PRISMARINE_FENCE_GATE, (Blocks.PRISMARINE), (Blocks.PRISMARINE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PRISMARINE_TRAPDOOR, (Blocks.PRISMARINE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_PRESSURE_PLATE, (Blocks.PRISMARINE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BUTTON, Blocks.PRISMARINE, 1)
                .offerTo(exporter);

        //prismarine bricks
        ModRecipes.createDoorRecipe(ModBlocks.PRISMARINE_BRICK_DOOR, (Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PRISMARINE_BRICK_FENCE, (Blocks.PRISMARINE_BRICKS), (Blocks.PRISMARINE_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PRISMARINE_BRICK_FENCE_GATE, (Blocks.PRISMARINE_BRICKS), (Blocks.PRISMARINE_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PRISMARINE_BRICK_TRAPDOOR, (Blocks.PRISMARINE_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE, (Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_BUTTON, Blocks.PRISMARINE_BRICKS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, (Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter);

        //prismarine
        ModRecipes.createDoorRecipe(ModBlocks.DARK_PRISMARINE_DOOR, (Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DARK_PRISMARINE_FENCE, (Blocks.DARK_PRISMARINE), (Blocks.DARK_PRISMARINE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DARK_PRISMARINE_FENCE_GATE, (Blocks.DARK_PRISMARINE), (Blocks.DARK_PRISMARINE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DARK_PRISMARINE_TRAPDOOR, (Blocks.DARK_PRISMARINE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE, (Blocks.DARK_PRISMARINE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_BUTTON, Blocks.DARK_PRISMARINE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, (Blocks.DARK_PRISMARINE))
                .offerTo(exporter);

        //netherrack
        ModRecipes.createDoorRecipe(ModBlocks.NETHERRACK_DOOR, (Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_SLAB, (Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.NETHERRACK_STAIRS, (Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.NETHERRACK_FENCE, (Blocks.NETHERRACK), (ModBlocks.NETHERRACK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.NETHERRACK_FENCE_GATE, (Blocks.NETHERRACK), (ModBlocks.NETHERRACK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.NETHERRACK_TRAPDOOR, (ModBlocks.NETHERRACK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_PRESSURE_PLATE, (Blocks.NETHERRACK))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BUTTON, Blocks.NETHERRACK, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, (Blocks.NETHERRACK))
                .offerTo(exporter);

        //nether bricks
        ModRecipes.createDoorRecipe(ModBlocks.NETHER_BRICK_DOOR, (Blocks.NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.NETHER_BRICK_FENCE_GATE, (Blocks.NETHER_BRICKS), (Blocks.NETHER_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.NETHER_BRICK_TRAPDOOR, (Blocks.NETHER_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_PRESSURE_PLATE, (Blocks.NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_BUTTON, Blocks.NETHER_BRICKS, 1)
                .offerTo(exporter);

        //cracked nether bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_DOOR, (Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, (Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, (Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE, (Blocks.CRACKED_NETHER_BRICKS), (ModBlocks.CRACKED_NETHER_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, (Blocks.CRACKED_NETHER_BRICKS), (ModBlocks.CRACKED_NETHER_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR, (ModBlocks.CRACKED_NETHER_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE, (Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_BUTTON, Blocks.CRACKED_NETHER_BRICKS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, (Blocks.CRACKED_NETHER_BRICKS))
                .offerTo(exporter);

        //red nether bricks
        ModRecipes.createDoorRecipe(ModBlocks.RED_NETHER_BRICK_DOOR, (Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_NETHER_BRICK_FENCE, (Blocks.RED_NETHER_BRICKS), (Blocks.RED_NETHER_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_NETHER_BRICK_FENCE_GATE, (Blocks.RED_NETHER_BRICKS), (Blocks.RED_NETHER_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_NETHER_BRICK_TRAPDOOR, (Blocks.RED_NETHER_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE, (Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_BUTTON, Blocks.RED_NETHER_BRICKS, 1)
                .offerTo(exporter);

        //basalt
        ModRecipes.createDoorRecipe(ModBlocks.BASALT_DOOR, (Blocks.BASALT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_SLAB, (Blocks.BASALT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BASALT_STAIRS, (Blocks.BASALT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BASALT_FENCE, (Blocks.BASALT), (ModBlocks.BASALT_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BASALT_FENCE_GATE, (Blocks.BASALT), (ModBlocks.BASALT_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BASALT_TRAPDOOR, (ModBlocks.BASALT_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_PRESSURE_PLATE, (Blocks.BASALT))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_BUTTON, Blocks.BASALT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_WALL, (Blocks.BASALT))
                .offerTo(exporter);

        //smooth basalt
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_BASALT_DOOR, (Blocks.SMOOTH_BASALT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_SLAB, (Blocks.SMOOTH_BASALT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, (Blocks.SMOOTH_BASALT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_BASALT_FENCE, (Blocks.SMOOTH_BASALT), (ModBlocks.SMOOTH_BASALT_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_BASALT_FENCE_GATE, (Blocks.SMOOTH_BASALT), (ModBlocks.SMOOTH_BASALT_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_BASALT_TRAPDOOR, (ModBlocks.SMOOTH_BASALT_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE, (Blocks.SMOOTH_BASALT))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_BUTTON, Blocks.SMOOTH_BASALT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, (Blocks.SMOOTH_BASALT))
                .offerTo(exporter);

        //polished_basalt
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_BASALT_DOOR, (Blocks.POLISHED_BASALT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_SLAB, (Blocks.POLISHED_BASALT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.POLISHED_BASALT_STAIRS, (Blocks.POLISHED_BASALT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_BASALT_FENCE, (Blocks.POLISHED_BASALT), (ModBlocks.POLISHED_BASALT_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_BASALT_FENCE_GATE, (Blocks.POLISHED_BASALT), (ModBlocks.POLISHED_BASALT_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_BASALT_TRAPDOOR, (ModBlocks.POLISHED_BASALT_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_PRESSURE_PLATE, (Blocks.POLISHED_BASALT))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_BUTTON, Blocks.POLISHED_BASALT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_WALL, (Blocks.POLISHED_BASALT))
                .offerTo(exporter);

        //blackstone
        ModRecipes.createDoorRecipe(ModBlocks.BLACKSTONE_DOOR, (Blocks.BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACKSTONE_FENCE, (Blocks.BLACKSTONE), (Blocks.BLACKSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACKSTONE_FENCE_GATE, (Blocks.BLACKSTONE), (Blocks.BLACKSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACKSTONE_TRAPDOOR, (Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_PRESSURE_PLATE, (Blocks.BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE, 1)
                .offerTo(exporter);

        //gilded_blackstone
        ModRecipes.createDoorRecipe(ModBlocks.GILDED_BLACKSTONE_DOOR, (Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_SLAB, (Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GILDED_BLACKSTONE_STAIRS, (Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GILDED_BLACKSTONE_FENCE, (Blocks.GILDED_BLACKSTONE), (ModBlocks.GILDED_BLACKSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE, (Blocks.GILDED_BLACKSTONE), (ModBlocks.GILDED_BLACKSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR, (ModBlocks.GILDED_BLACKSTONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE, (Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_BUTTON, Blocks.GILDED_BLACKSTONE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_WALL, (Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter);

        //polished blackstone
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_BLACKSTONE_DOOR, (Blocks.POLISHED_BLACKSTONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_BLACKSTONE_FENCE, (Blocks.POLISHED_BLACKSTONE), (Blocks.POLISHED_BLACKSTONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE, (Blocks.POLISHED_BLACKSTONE), (Blocks.POLISHED_BLACKSTONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR, (Blocks.POLISHED_BLACKSTONE_SLAB))
                .offerTo(exporter);

        //polished blackstone brick
        ModRecipes.createDoorRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR, (Blocks.POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE, (Blocks.POLISHED_BLACKSTONE_BRICKS), (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE, (Blocks.POLISHED_BLACKSTONE_BRICKS), (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR, (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE, (Blocks.POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON, Blocks.POLISHED_BLACKSTONE_BRICKS, 1)
                .offerTo(exporter);
        
        //cracked_polished_blackstone_bricks
        ModRecipes.createDoorRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR, (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter);
        
        //end_stone
        ModRecipes.createDoorRecipe(ModBlocks.END_STONE_DOOR, (Blocks.END_STONE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_SLAB, (Blocks.END_STONE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.END_STONE_STAIRS, (Blocks.END_STONE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.END_STONE_FENCE, (Blocks.END_STONE), (ModBlocks.END_STONE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.END_STONE_FENCE_GATE, (Blocks.END_STONE), (ModBlocks.END_STONE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.END_STONE_TRAPDOOR, (ModBlocks.END_STONE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_PRESSURE_PLATE, (Blocks.END_STONE))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BUTTON, Blocks.END_STONE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, (Blocks.END_STONE))
                .offerTo(exporter);
        
        //end_stone brick
        ModRecipes.createDoorRecipe(ModBlocks.END_STONE_BRICK_DOOR, (Blocks.END_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.END_STONE_BRICK_FENCE, (Blocks.END_STONE_BRICKS), (Blocks.END_STONE_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.END_STONE_BRICK_FENCE_GATE, (Blocks.END_STONE_BRICKS), (Blocks.END_STONE_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.END_STONE_BRICK_TRAPDOOR, (Blocks.END_STONE_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BRICK_PRESSURE_PLATE, (Blocks.END_STONE_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BRICK_BUTTON, Blocks.END_STONE_BRICKS, 1)
                .offerTo(exporter);

        //purpur 
        ModRecipes.createDoorRecipe(ModBlocks.PURPUR_DOOR, (Blocks.PURPUR_BLOCK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPUR_FENCE, (Blocks.PURPUR_BLOCK), (Blocks.PURPUR_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPUR_FENCE_GATE, (Blocks.PURPUR_BLOCK), (Blocks.PURPUR_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPUR_TRAPDOOR, (Blocks.PURPUR_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_PRESSURE_PLATE, (Blocks.PURPUR_BLOCK))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_BUTTON, Blocks.PURPUR_BLOCK, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, (Blocks.PURPUR_BLOCK))
                .offerTo(exporter);

        //coal_block
        ModRecipes.createDoorRecipe(ModBlocks.COAL_DOOR, (ModItems.COAL_BIT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_SLAB, (ModItems.COAL_BIT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.COAL_STAIRS, (ModItems.COAL_BIT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COAL_FENCE, (ModItems.COAL_BIT), (Items.COAL), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COAL_FENCE_GATE, (ModItems.COAL_BIT), (Items.COAL), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COAL_TRAPDOOR, (Items.COAL))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_PRESSURE_PLATE, (ModItems.COAL_BIT))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_BUTTON, ModItems.COAL_BIT)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_WALL, (ModItems.COAL_BIT))
                .offerTo(exporter);

        //iron_block
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_SLAB, (ModItems.IRON_BIT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.IRON_STAIRS, (ModItems.IRON_BIT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.IRON_FENCE, (ModItems.IRON_BIT), (Items.IRON_INGOT), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.IRON_FENCE_GATE, (ModItems.IRON_BIT), (Items.IRON_INGOT), 1)
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_BUTTON, ModItems.IRON_BIT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_WALL, (ModItems.IRON_BIT))
                .offerTo(exporter);

        //gold_block
        ModRecipes.createDoorRecipe(ModBlocks.GOLD_DOOR, (ModItems.GOLD_BIT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_SLAB, (ModItems.GOLD_BIT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GOLD_STAIRS, (ModItems.GOLD_BIT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GOLD_FENCE, (ModItems.GOLD_BIT), (Items.GOLD_INGOT), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GOLD_FENCE_GATE, (ModItems.GOLD_BIT), (Items.GOLD_INGOT), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GOLD_TRAPDOOR, (Items.GOLD_INGOT))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BUTTON, ModItems.GOLD_BIT)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_WALL, (ModItems.GOLD_BIT))
                .offerTo(exporter);

        //redstone_block
        ModRecipes.createDoorRecipe(ModBlocks.REDSTONE_DOOR, (ModItems.REDSTONE_SHARD))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_SLAB, (ModItems.REDSTONE_SHARD))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.REDSTONE_STAIRS, (ModItems.REDSTONE_SHARD))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.REDSTONE_FENCE, (ModItems.REDSTONE_SHARD), (Items.REDSTONE), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.REDSTONE_FENCE_GATE, (ModItems.REDSTONE_SHARD), (Items.REDSTONE), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.REDSTONE_TRAPDOOR, (Items.REDSTONE))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_PRESSURE_PLATE, (ModItems.REDSTONE_SHARD))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_BUTTON, ModItems.REDSTONE_SHARD, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_WALL, (ModItems.REDSTONE_SHARD))
                .offerTo(exporter);

        //emerald_block
        ModRecipes.createDoorRecipe(ModBlocks.EMERALD_DOOR, (ModItems.EMERALD_FRAGMENT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_SLAB, (ModItems.EMERALD_FRAGMENT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.EMERALD_STAIRS, (ModItems.EMERALD_FRAGMENT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.EMERALD_FENCE, (ModItems.EMERALD_FRAGMENT), (Items.EMERALD), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.EMERALD_FENCE_GATE, (ModItems.EMERALD_FRAGMENT), (Items.EMERALD), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.EMERALD_TRAPDOOR, (Items.EMERALD))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_PRESSURE_PLATE, (ModItems.EMERALD_FRAGMENT))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_BUTTON, ModItems.EMERALD_FRAGMENT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_WALL, (ModItems.EMERALD_FRAGMENT))
                .offerTo(exporter);

        //lapis_block
        ModRecipes.createDoorRecipe(ModBlocks.LAPIS_DOOR, (ModItems.LAPIS_BIT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_SLAB, (ModItems.LAPIS_BIT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LAPIS_STAIRS, (ModItems.LAPIS_BIT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LAPIS_FENCE, (ModItems.LAPIS_BIT), (Items.LAPIS_LAZULI), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LAPIS_FENCE_GATE, (ModItems.LAPIS_BIT), (Items.LAPIS_LAZULI), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LAPIS_TRAPDOOR, (Items.LAPIS_LAZULI))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_PRESSURE_PLATE, (ModItems.LAPIS_BIT))
                .offerTo(exporter);
        ModRecipes.create2x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_BUTTON, ModItems.LAPIS_BIT)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_WALL, (ModItems.LAPIS_BIT))
                .offerTo(exporter);

        //diamond_block
        ModRecipes.createDoorRecipe(ModBlocks.DIAMOND_DOOR, (ModItems.DIAMOND_DUST))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_SLAB, (ModItems.DIAMOND_DUST))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.DIAMOND_STAIRS, (ModItems.DIAMOND_DUST))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DIAMOND_FENCE, (ModItems.DIAMOND_DUST), (Items.DIAMOND), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DIAMOND_FENCE_GATE, (ModItems.DIAMOND_DUST), (Items.DIAMOND), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DIAMOND_TRAPDOOR, (Items.DIAMOND))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_PRESSURE_PLATE, (ModItems.DIAMOND_DUST))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_BUTTON, ModItems.DIAMOND_DUST, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_WALL, (ModItems.DIAMOND_DUST))
                .offerTo(exporter);

        //netherite_block
        ModRecipes.createDoorRecipe(ModBlocks.NETHERITE_DOOR, (ModItems.NETHERITE_BIT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_SLAB, (ModItems.NETHERITE_BIT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.NETHERITE_STAIRS, (ModItems.NETHERITE_BIT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.NETHERITE_FENCE, (ModItems.NETHERITE_BIT), (Items.NETHERITE_INGOT), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.NETHERITE_FENCE_GATE, (ModItems.NETHERITE_BIT), (Items.NETHERITE_INGOT), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.NETHERITE_TRAPDOOR, (Items.NETHERITE_INGOT))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_PRESSURE_PLATE, (ModItems.NETHERITE_BIT))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_BUTTON, ModItems.NETHERITE_BIT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_WALL, (ModItems.NETHERITE_BIT))
                .offerTo(exporter);

        //quartz
        ModRecipes.createDoorRecipe(ModBlocks.QUARTZ_DOOR, (Blocks.QUARTZ_BLOCK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.QUARTZ_FENCE, (Blocks.QUARTZ_BLOCK), (Blocks.QUARTZ_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.QUARTZ_FENCE_GATE, (Blocks.QUARTZ_BLOCK), (Blocks.QUARTZ_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.QUARTZ_TRAPDOOR, (Blocks.QUARTZ_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_PRESSURE_PLATE, (Blocks.QUARTZ_BLOCK))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BUTTON, Blocks.QUARTZ_BLOCK, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, (Blocks.QUARTZ_BLOCK))
                .offerTo(exporter);

        //quartz brick
        ModRecipes.createDoorRecipe(ModBlocks.QUARTZ_BRICK_DOOR, (Blocks.QUARTZ_BRICKS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_SLAB, (Blocks.QUARTZ_BRICKS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.QUARTZ_BRICK_STAIRS, (Blocks.QUARTZ_BRICKS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.QUARTZ_BRICK_FENCE, (Blocks.QUARTZ_BRICKS), (ModBlocks.QUARTZ_BRICK_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.QUARTZ_BRICK_FENCE_GATE, (Blocks.QUARTZ_BRICKS), (ModBlocks.QUARTZ_BRICK_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.QUARTZ_BRICK_TRAPDOOR, (ModBlocks.QUARTZ_BRICK_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE, (Blocks.QUARTZ_BRICKS))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_BUTTON, Blocks.QUARTZ_BRICKS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, (Blocks.QUARTZ_BRICKS))
                .offerTo(exporter);

        //smooth_quartz
        ModRecipes.createDoorRecipe(ModBlocks.SMOOTH_QUARTZ_DOOR, (Blocks.SMOOTH_QUARTZ))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.SMOOTH_QUARTZ_FENCE, (Blocks.SMOOTH_QUARTZ), (Blocks.SMOOTH_QUARTZ_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.SMOOTH_QUARTZ_FENCE_GATE, (Blocks.SMOOTH_QUARTZ), (Blocks.SMOOTH_QUARTZ_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR, (Blocks.SMOOTH_QUARTZ_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE, (Blocks.SMOOTH_QUARTZ))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_BUTTON, Blocks.SMOOTH_QUARTZ, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, (Blocks.SMOOTH_QUARTZ))
                .offerTo(exporter);

        //amethyst
        ModRecipes.createDoorRecipe(ModBlocks.AMETHYST_DOOR, (Blocks.AMETHYST_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_SLAB, (Blocks.AMETHYST_BLOCK))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.AMETHYST_STAIRS, (Blocks.AMETHYST_BLOCK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.AMETHYST_FENCE, (Blocks.AMETHYST_BLOCK), (ModBlocks.AMETHYST_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.AMETHYST_FENCE_GATE, (Blocks.AMETHYST_BLOCK), (ModBlocks.AMETHYST_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.AMETHYST_TRAPDOOR, (ModBlocks.AMETHYST_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_PRESSURE_PLATE, (Blocks.AMETHYST_BLOCK))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_BUTTON, Blocks.AMETHYST_BLOCK, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_WALL, (Blocks.AMETHYST_BLOCK))
                .offerTo(exporter);



        //copper
        ModRecipes.createDoorRecipe(ModBlocks.COPPER_DOOR, (ModItems.COPPER_BIT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_SLAB, (ModItems.COPPER_BIT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.COPPER_STAIRS, (ModItems.COPPER_BIT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COPPER_FENCE, (Items.COPPER_INGOT), (ModItems.COPPER_BIT), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COPPER_FENCE_GATE, (Items.COPPER_INGOT), (ModItems.COPPER_BIT), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COPPER_TRAPDOOR, (Items.COPPER_INGOT))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_PRESSURE_PLATE, (ModItems.COPPER_BIT))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_BUTTON, ModItems.COPPER_BIT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_WALL, (ModItems.COPPER_BIT))
                .offerTo(exporter);


        //exposed_copper
        ModRecipes.createDoorRecipe(ModBlocks.EXPOSED_COPPER_DOOR, (Blocks.EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_SLAB, (Blocks.EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.EXPOSED_COPPER_STAIRS, (Blocks.EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.EXPOSED_COPPER_FENCE, (Blocks.EXPOSED_COPPER), (ModBlocks.EXPOSED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.EXPOSED_COPPER_FENCE_GATE, (Blocks.EXPOSED_COPPER), (ModBlocks.EXPOSED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.EXPOSED_COPPER_TRAPDOOR, (ModBlocks.EXPOSED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, (Blocks.EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_WALL, (Blocks.EXPOSED_COPPER))
                .offerTo(exporter);

        //weathered_copper
        ModRecipes.createDoorRecipe(ModBlocks.WEATHERED_COPPER_DOOR, (Blocks.WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_SLAB, (Blocks.WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WEATHERED_COPPER_STAIRS, (Blocks.WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WEATHERED_COPPER_FENCE, (Blocks.WEATHERED_COPPER), (ModBlocks.WEATHERED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WEATHERED_COPPER_FENCE_GATE, (Blocks.WEATHERED_COPPER), (ModBlocks.WEATHERED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WEATHERED_COPPER_TRAPDOOR, (ModBlocks.WEATHERED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, (Blocks.WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_WALL, (Blocks.WEATHERED_COPPER))
                .offerTo(exporter);

        //oxidized_copper
        ModRecipes.createDoorRecipe(ModBlocks.OXIDIZED_COPPER_DOOR, (Blocks.OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_SLAB, (Blocks.OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.OXIDIZED_COPPER_STAIRS, (Blocks.OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.OXIDIZED_COPPER_FENCE, (Blocks.OXIDIZED_COPPER), (ModBlocks.OXIDIZED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, (Blocks.OXIDIZED_COPPER), (ModBlocks.OXIDIZED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.OXIDIZED_COPPER_TRAPDOOR, (ModBlocks.OXIDIZED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, (Blocks.OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_WALL, (Blocks.OXIDIZED_COPPER))
                .offerTo(exporter);

        //cut copper
        ModRecipes.createDoorRecipe(ModBlocks.CUT_COPPER_DOOR, (Blocks.CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CUT_COPPER_FENCE, (Blocks.CUT_COPPER), (Blocks.CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CUT_COPPER_FENCE_GATE, (Blocks.CUT_COPPER), (Blocks.CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CUT_COPPER_TRAPDOOR, (Blocks.CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_PRESSURE_PLATE, (Blocks.CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_BUTTON, Blocks.CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_WALL, (Blocks.CUT_COPPER))
                .offerTo(exporter);


        //cut exposed_copper
        ModRecipes.createDoorRecipe(ModBlocks.EXPOSED_CUT_COPPER_DOOR, (Blocks.EXPOSED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE, (Blocks.EXPOSED_CUT_COPPER), (Blocks.EXPOSED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, (Blocks.EXPOSED_CUT_COPPER), (Blocks.EXPOSED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, (Blocks.EXPOSED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, (Blocks.EXPOSED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_BUTTON, Blocks.EXPOSED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_WALL, (Blocks.EXPOSED_CUT_COPPER))
                .offerTo(exporter);

        //cut weathered_copper
        ModRecipes.createDoorRecipe(ModBlocks.WEATHERED_CUT_COPPER_DOOR, (Blocks.WEATHERED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE, (Blocks.WEATHERED_CUT_COPPER), (Blocks.WEATHERED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, (Blocks.WEATHERED_CUT_COPPER), (Blocks.WEATHERED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, (Blocks.WEATHERED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WEATHERED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_BUTTON, Blocks.WEATHERED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_WALL, (Blocks.WEATHERED_CUT_COPPER))
                .offerTo(exporter);

        //cut oxidized_copper
        ModRecipes.createDoorRecipe(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, (Blocks.OXIDIZED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, (Blocks.OXIDIZED_CUT_COPPER), (Blocks.OXIDIZED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, (Blocks.OXIDIZED_CUT_COPPER), (Blocks.OXIDIZED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR, (Blocks.OXIDIZED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE, (Blocks.OXIDIZED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_BUTTON, Blocks.OXIDIZED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_WALL, (Blocks.OXIDIZED_CUT_COPPER))
                .offerTo(exporter);


        //waxed copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_COPPER_DOOR, (Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_SLAB, (Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WAXED_COPPER_STAIRS, (Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_COPPER_FENCE, (Blocks.WAXED_COPPER_BLOCK), (ModBlocks.WAXED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_COPPER_FENCE_GATE, (Blocks.WAXED_COPPER_BLOCK), (ModBlocks.WAXED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_COPPER_TRAPDOOR, (ModBlocks.WAXED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_BUTTON, Blocks.WAXED_COPPER_BLOCK, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_WALL, (Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter);

        //waxed exposed_copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_EXPOSED_COPPER_DOOR, (Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_SLAB, (Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS, (Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_EXPOSED_COPPER_FENCE, (Blocks.WAXED_EXPOSED_COPPER), (ModBlocks.WAXED_EXPOSED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_COPPER), (ModBlocks.WAXED_EXPOSED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR, (ModBlocks.WAXED_EXPOSED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON, Blocks.WAXED_EXPOSED_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_WALL, (Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter);

        //waxed weathered_copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_WEATHERED_COPPER_DOOR, (Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_SLAB, (Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS, (Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_WEATHERED_COPPER_FENCE, (Blocks.WAXED_WEATHERED_COPPER), (ModBlocks.WAXED_WEATHERED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_COPPER), (ModBlocks.WAXED_WEATHERED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR, (ModBlocks.WAXED_WEATHERED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON, Blocks.WAXED_WEATHERED_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_WALL, (Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter);

        //waxed oxidized_copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR, (Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, (Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS, (Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_COPPER), (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_COPPER), (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_WALL, (Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter);

        //waxed cut copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_CUT_COPPER_DOOR, (Blocks.WAXED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_CUT_COPPER_FENCE, (Blocks.WAXED_CUT_COPPER), (Blocks.WAXED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_CUT_COPPER), (Blocks.WAXED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_BUTTON, Blocks.WAXED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_WALL, (Blocks.WAXED_CUT_COPPER))
                .offerTo(exporter);

        //waxed cut exposed_copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR, (Blocks.WAXED_EXPOSED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE, (Blocks.WAXED_EXPOSED_CUT_COPPER), (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_CUT_COPPER), (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_EXPOSED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON, Blocks.WAXED_EXPOSED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL, (Blocks.WAXED_EXPOSED_CUT_COPPER))
                .offerTo(exporter);

        //waxed cut weathered_copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR, (Blocks.WAXED_WEATHERED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE, (Blocks.WAXED_WEATHERED_CUT_COPPER), (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_CUT_COPPER), (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_WEATHERED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON, Blocks.WAXED_WEATHERED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL, (Blocks.WAXED_WEATHERED_CUT_COPPER))
                .offerTo(exporter);

        //waxed cut oxidized_copper
        ModRecipes.createDoorRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR, (Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_CUT_COPPER), (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_CUT_COPPER), (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_CUT_COPPER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL, (Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .offerTo(exporter);

        //white_wool
        ModRecipes.createDoorRecipe(ModBlocks.WHITE_WOOL_DOOR, (Blocks.WHITE_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_SLAB, (Blocks.WHITE_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WHITE_WOOL_STAIRS, (Blocks.WHITE_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WHITE_WOOL_FENCE, (Blocks.WHITE_WOOL), (ModBlocks.WHITE_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WHITE_WOOL_FENCE_GATE, (Blocks.WHITE_WOOL), (ModBlocks.WHITE_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WHITE_WOOL_TRAPDOOR, (ModBlocks.WHITE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_PRESSURE_PLATE, (ModBlocks.WHITE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_BUTTON, Blocks.WHITE_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_WALL, (Blocks.WHITE_WOOL))
                .offerTo(exporter);

        //light_gray_wool
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_GRAY_WOOL_DOOR, (Blocks.LIGHT_GRAY_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, (Blocks.LIGHT_GRAY_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, (Blocks.LIGHT_GRAY_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE, (Blocks.LIGHT_GRAY_WOOL), (ModBlocks.LIGHT_GRAY_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE, (Blocks.LIGHT_GRAY_WOOL), (ModBlocks.LIGHT_GRAY_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR, (ModBlocks.LIGHT_GRAY_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_BUTTON, Blocks.LIGHT_GRAY_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_WALL, (Blocks.LIGHT_GRAY_WOOL))
                .offerTo(exporter);

        //gray_wool
        ModRecipes.createDoorRecipe(ModBlocks.GRAY_WOOL_DOOR, (Blocks.GRAY_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_SLAB, (Blocks.GRAY_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRAY_WOOL_STAIRS, (Blocks.GRAY_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRAY_WOOL_FENCE, (Blocks.GRAY_WOOL), (ModBlocks.GRAY_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRAY_WOOL_FENCE_GATE, (Blocks.GRAY_WOOL), (ModBlocks.GRAY_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRAY_WOOL_TRAPDOOR, (ModBlocks.GRAY_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_PRESSURE_PLATE, (ModBlocks.GRAY_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_BUTTON, Blocks.GRAY_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_WALL, (Blocks.GRAY_WOOL))
                .offerTo(exporter);

        //black_wool
        ModRecipes.createDoorRecipe(ModBlocks.BLACK_WOOL_DOOR, (Blocks.BLACK_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_SLAB, (Blocks.BLACK_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLACK_WOOL_STAIRS, (Blocks.BLACK_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACK_WOOL_FENCE, (Blocks.BLACK_WOOL), (ModBlocks.BLACK_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACK_WOOL_FENCE_GATE, (Blocks.BLACK_WOOL), (ModBlocks.BLACK_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACK_WOOL_TRAPDOOR, (ModBlocks.BLACK_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_PRESSURE_PLATE, (ModBlocks.BLACK_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_BUTTON, Blocks.BLACK_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_WALL, (Blocks.BLACK_WOOL))
                .offerTo(exporter);

        //brown_wool
        ModRecipes.createDoorRecipe(ModBlocks.BROWN_WOOL_DOOR, (Blocks.BROWN_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_SLAB, (Blocks.BROWN_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BROWN_WOOL_STAIRS, (Blocks.BROWN_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BROWN_WOOL_FENCE, (Blocks.BROWN_WOOL), (ModBlocks.BROWN_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BROWN_WOOL_FENCE_GATE, (Blocks.BROWN_WOOL), (ModBlocks.BROWN_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BROWN_WOOL_TRAPDOOR, (ModBlocks.BROWN_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_PRESSURE_PLATE, (ModBlocks.BROWN_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_BUTTON, Blocks.BROWN_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_WALL, (Blocks.BROWN_WOOL))
                .offerTo(exporter);

        //red_wool
        ModRecipes.createDoorRecipe(ModBlocks.RED_WOOL_DOOR, (Blocks.RED_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_SLAB, (Blocks.RED_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.RED_WOOL_STAIRS, (Blocks.RED_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_WOOL_FENCE, (Blocks.RED_WOOL), (ModBlocks.RED_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_WOOL_FENCE_GATE, (Blocks.RED_WOOL), (ModBlocks.RED_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_WOOL_TRAPDOOR, (ModBlocks.RED_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_PRESSURE_PLATE, (ModBlocks.RED_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_BUTTON, Blocks.RED_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_WALL, (Blocks.RED_WOOL))
                .offerTo(exporter);

        //orange_wool
        ModRecipes.createDoorRecipe(ModBlocks.ORANGE_WOOL_DOOR, (Blocks.ORANGE_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_SLAB, (Blocks.ORANGE_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ORANGE_WOOL_STAIRS, (Blocks.ORANGE_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ORANGE_WOOL_FENCE, (Blocks.ORANGE_WOOL), (ModBlocks.ORANGE_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ORANGE_WOOL_FENCE_GATE, (Blocks.ORANGE_WOOL), (ModBlocks.ORANGE_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ORANGE_WOOL_TRAPDOOR, (ModBlocks.ORANGE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_PRESSURE_PLATE, (ModBlocks.ORANGE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_BUTTON, Blocks.ORANGE_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_WALL, (Blocks.ORANGE_WOOL))
                .offerTo(exporter);

        //yellow_wool
        ModRecipes.createDoorRecipe(ModBlocks.YELLOW_WOOL_DOOR, (Blocks.YELLOW_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_SLAB, (Blocks.YELLOW_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.YELLOW_WOOL_STAIRS, (Blocks.YELLOW_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.YELLOW_WOOL_FENCE, (Blocks.YELLOW_WOOL), (ModBlocks.YELLOW_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.YELLOW_WOOL_FENCE_GATE, (Blocks.YELLOW_WOOL), (ModBlocks.YELLOW_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.YELLOW_WOOL_TRAPDOOR, (ModBlocks.YELLOW_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_PRESSURE_PLATE, (ModBlocks.YELLOW_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_BUTTON, Blocks.YELLOW_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_WALL, (Blocks.YELLOW_WOOL))
                .offerTo(exporter);

        //lime_wool
        ModRecipes.createDoorRecipe(ModBlocks.LIME_WOOL_DOOR, (Blocks.LIME_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_SLAB, (Blocks.LIME_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIME_WOOL_STAIRS, (Blocks.LIME_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIME_WOOL_FENCE, (Blocks.LIME_WOOL), (ModBlocks.LIME_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIME_WOOL_FENCE_GATE, (Blocks.LIME_WOOL), (ModBlocks.LIME_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIME_WOOL_TRAPDOOR, (ModBlocks.LIME_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_PRESSURE_PLATE, (ModBlocks.LIME_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_BUTTON, Blocks.LIME_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_WALL, (Blocks.LIME_WOOL))
                .offerTo(exporter);

        //green_wool
        ModRecipes.createDoorRecipe(ModBlocks.GREEN_WOOL_DOOR, (Blocks.GREEN_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_SLAB, (Blocks.GREEN_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GREEN_WOOL_STAIRS, (Blocks.GREEN_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GREEN_WOOL_FENCE, (Blocks.GREEN_WOOL), (ModBlocks.GREEN_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GREEN_WOOL_FENCE_GATE, (Blocks.GREEN_WOOL), (ModBlocks.GREEN_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GREEN_WOOL_TRAPDOOR, (ModBlocks.GREEN_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_PRESSURE_PLATE, (ModBlocks.GREEN_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_BUTTON, Blocks.GREEN_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_WALL, (Blocks.GREEN_WOOL))
                .offerTo(exporter);

        //cyan_wool
        ModRecipes.createDoorRecipe(ModBlocks.CYAN_WOOL_DOOR, (Blocks.CYAN_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_SLAB, (Blocks.CYAN_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CYAN_WOOL_STAIRS, (Blocks.CYAN_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CYAN_WOOL_FENCE, (Blocks.CYAN_WOOL), (ModBlocks.CYAN_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CYAN_WOOL_FENCE_GATE, (Blocks.CYAN_WOOL), (ModBlocks.CYAN_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CYAN_WOOL_TRAPDOOR, (ModBlocks.CYAN_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_PRESSURE_PLATE, (ModBlocks.CYAN_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_BUTTON, Blocks.CYAN_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_WALL, (Blocks.CYAN_WOOL))
                .offerTo(exporter);

        //blue_wool
        ModRecipes.createDoorRecipe(ModBlocks.BLUE_WOOL_DOOR, (Blocks.BLUE_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_SLAB, (Blocks.BLUE_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLUE_WOOL_STAIRS, (Blocks.BLUE_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLUE_WOOL_FENCE, (Blocks.BLUE_WOOL), (ModBlocks.BLUE_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLUE_WOOL_FENCE_GATE, (Blocks.BLUE_WOOL), (ModBlocks.BLUE_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLUE_WOOL_TRAPDOOR, (ModBlocks.BLUE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_PRESSURE_PLATE, (ModBlocks.BLUE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_BUTTON, Blocks.BLUE_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_WALL, (Blocks.BLUE_WOOL))
                .offerTo(exporter);

        //light_blue_wool
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_BLUE_WOOL_DOOR, (Blocks.LIGHT_BLUE_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, (Blocks.LIGHT_BLUE_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, (Blocks.LIGHT_BLUE_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE, (Blocks.LIGHT_BLUE_WOOL), (ModBlocks.LIGHT_BLUE_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE, (Blocks.LIGHT_BLUE_WOOL), (ModBlocks.LIGHT_BLUE_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR, (ModBlocks.LIGHT_BLUE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_BUTTON, Blocks.LIGHT_BLUE_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_WALL, (Blocks.LIGHT_BLUE_WOOL))
                .offerTo(exporter);

        //purple_wool
        ModRecipes.createDoorRecipe(ModBlocks.PURPLE_WOOL_DOOR, (Blocks.PURPLE_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_SLAB, (Blocks.PURPLE_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PURPLE_WOOL_STAIRS, (Blocks.PURPLE_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPLE_WOOL_FENCE, (Blocks.PURPLE_WOOL), (ModBlocks.PURPLE_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPLE_WOOL_FENCE_GATE, (Blocks.PURPLE_WOOL), (ModBlocks.PURPLE_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPLE_WOOL_TRAPDOOR, (ModBlocks.PURPLE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_PRESSURE_PLATE, (ModBlocks.PURPLE_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_BUTTON, Blocks.PURPLE_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_WALL, (Blocks.PURPLE_WOOL))
                .offerTo(exporter);

        //magenta_wool
        ModRecipes.createDoorRecipe(ModBlocks.MAGENTA_WOOL_DOOR, (Blocks.MAGENTA_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_SLAB, (Blocks.MAGENTA_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MAGENTA_WOOL_STAIRS, (Blocks.MAGENTA_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MAGENTA_WOOL_FENCE, (Blocks.MAGENTA_WOOL), (ModBlocks.MAGENTA_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MAGENTA_WOOL_FENCE_GATE, (Blocks.MAGENTA_WOOL), (ModBlocks.MAGENTA_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MAGENTA_WOOL_TRAPDOOR, (ModBlocks.MAGENTA_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE, (ModBlocks.MAGENTA_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_BUTTON, Blocks.MAGENTA_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_WALL, (Blocks.MAGENTA_WOOL))
                .offerTo(exporter);

        //pink_wool
        ModRecipes.createDoorRecipe(ModBlocks.PINK_WOOL_DOOR, (Blocks.PINK_WOOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_SLAB, (Blocks.PINK_WOOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PINK_WOOL_STAIRS, (Blocks.PINK_WOOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PINK_WOOL_FENCE, (Blocks.PINK_WOOL), (ModBlocks.PINK_WOOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PINK_WOOL_FENCE_GATE, (Blocks.PINK_WOOL), (ModBlocks.PINK_WOOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PINK_WOOL_TRAPDOOR, (ModBlocks.PINK_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_PRESSURE_PLATE, (ModBlocks.PINK_WOOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_BUTTON, Blocks.PINK_WOOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_WALL, (Blocks.PINK_WOOL))
                .offerTo(exporter);

        //terracotta
        ModRecipes.createDoorRecipe(ModBlocks.TERRACOTTA_DOOR, (Blocks.TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_SLAB, (Blocks.TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.TERRACOTTA_STAIRS, (Blocks.TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.TERRACOTTA_FENCE, (Blocks.TERRACOTTA), (ModBlocks.TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.TERRACOTTA_FENCE_GATE, (Blocks.TERRACOTTA), (ModBlocks.TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.TERRACOTTA_TRAPDOOR, (ModBlocks.TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_PRESSURE_PLATE, (ModBlocks.TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_BUTTON, Blocks.TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, (Blocks.TERRACOTTA))
                .offerTo(exporter);

        //white_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.WHITE_TERRACOTTA_DOOR, (Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_SLAB, (Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WHITE_TERRACOTTA_STAIRS, (Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE, (Blocks.WHITE_TERRACOTTA), (ModBlocks.WHITE_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE, (Blocks.WHITE_TERRACOTTA), (ModBlocks.WHITE_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR, (ModBlocks.WHITE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.WHITE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_BUTTON, Blocks.WHITE_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_WALL, (Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter);

        //light_gray_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR, (Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, (Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, (Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE, (Blocks.LIGHT_GRAY_TERRACOTTA), (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_GRAY_TERRACOTTA), (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON, Blocks.LIGHT_GRAY_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, (Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter);

        //gray_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.GRAY_TERRACOTTA_DOOR, (Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_SLAB, (Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRAY_TERRACOTTA_STAIRS, (Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE, (Blocks.GRAY_TERRACOTTA), (ModBlocks.GRAY_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE, (Blocks.GRAY_TERRACOTTA), (ModBlocks.GRAY_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR, (ModBlocks.GRAY_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GRAY_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_BUTTON, Blocks.GRAY_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_WALL, (Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter);

        //black_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.BLACK_TERRACOTTA_DOOR, (Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_SLAB, (Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLACK_TERRACOTTA_STAIRS, (Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE, (Blocks.BLACK_TERRACOTTA), (ModBlocks.BLACK_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE, (Blocks.BLACK_TERRACOTTA), (ModBlocks.BLACK_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR, (ModBlocks.BLACK_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLACK_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_BUTTON, Blocks.BLACK_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_WALL, (Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter);

        //brown_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.BROWN_TERRACOTTA_DOOR, (Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_SLAB, (Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BROWN_TERRACOTTA_STAIRS, (Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE, (Blocks.BROWN_TERRACOTTA), (ModBlocks.BROWN_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE, (Blocks.BROWN_TERRACOTTA), (ModBlocks.BROWN_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR, (ModBlocks.BROWN_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BROWN_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_BUTTON, Blocks.BROWN_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_WALL, (Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter);

        //red_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.RED_TERRACOTTA_DOOR, (Blocks.RED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_SLAB, (Blocks.RED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.RED_TERRACOTTA_STAIRS, (Blocks.RED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_TERRACOTTA_FENCE, (Blocks.RED_TERRACOTTA), (ModBlocks.RED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_TERRACOTTA_FENCE_GATE, (Blocks.RED_TERRACOTTA), (ModBlocks.RED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_TERRACOTTA_TRAPDOOR, (ModBlocks.RED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.RED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_BUTTON, Blocks.RED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_WALL, (Blocks.RED_TERRACOTTA))
                .offerTo(exporter);

        //orange_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.ORANGE_TERRACOTTA_DOOR, (Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_SLAB, (Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ORANGE_TERRACOTTA_STAIRS, (Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE, (Blocks.ORANGE_TERRACOTTA), (ModBlocks.ORANGE_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE, (Blocks.ORANGE_TERRACOTTA), (ModBlocks.ORANGE_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR, (ModBlocks.ORANGE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.ORANGE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_BUTTON, Blocks.ORANGE_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_WALL, (Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter);

        //yellow_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.YELLOW_TERRACOTTA_DOOR, (Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_SLAB, (Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.YELLOW_TERRACOTTA_STAIRS, (Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE, (Blocks.YELLOW_TERRACOTTA), (ModBlocks.YELLOW_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE, (Blocks.YELLOW_TERRACOTTA), (ModBlocks.YELLOW_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR, (ModBlocks.YELLOW_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.YELLOW_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_BUTTON, Blocks.YELLOW_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_WALL, (Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter);

        //lime_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.LIME_TERRACOTTA_DOOR, (Blocks.LIME_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_SLAB, (Blocks.LIME_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIME_TERRACOTTA_STAIRS, (Blocks.LIME_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIME_TERRACOTTA_FENCE, (Blocks.LIME_TERRACOTTA), (ModBlocks.LIME_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIME_TERRACOTTA_FENCE_GATE, (Blocks.LIME_TERRACOTTA), (ModBlocks.LIME_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIME_TERRACOTTA_TRAPDOOR, (ModBlocks.LIME_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIME_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_BUTTON, Blocks.LIME_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_WALL, (Blocks.LIME_TERRACOTTA))
                .offerTo(exporter);

        //green_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.GREEN_TERRACOTTA_DOOR, (Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_SLAB, (Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GREEN_TERRACOTTA_STAIRS, (Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE, (Blocks.GREEN_TERRACOTTA), (ModBlocks.GREEN_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE, (Blocks.GREEN_TERRACOTTA), (ModBlocks.GREEN_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR, (ModBlocks.GREEN_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GREEN_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_BUTTON, Blocks.GREEN_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_WALL, (Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter);

        //cyan_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.CYAN_TERRACOTTA_DOOR, (Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_SLAB, (Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CYAN_TERRACOTTA_STAIRS, (Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE, (Blocks.CYAN_TERRACOTTA), (ModBlocks.CYAN_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE, (Blocks.CYAN_TERRACOTTA), (ModBlocks.CYAN_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR, (ModBlocks.CYAN_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.CYAN_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_BUTTON, Blocks.CYAN_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_WALL, (Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter);

        //blue_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.BLUE_TERRACOTTA_DOOR, (Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_SLAB, (Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLUE_TERRACOTTA_STAIRS, (Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE, (Blocks.BLUE_TERRACOTTA), (ModBlocks.BLUE_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE, (Blocks.BLUE_TERRACOTTA), (ModBlocks.BLUE_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR, (ModBlocks.BLUE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLUE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_BUTTON, Blocks.BLUE_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_WALL, (Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter);

        //light_blue_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR, (Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, (Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, (Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE, (Blocks.LIGHT_BLUE_TERRACOTTA), (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_BLUE_TERRACOTTA), (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON, Blocks.LIGHT_BLUE_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, (Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter);

        //purple_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.PURPLE_TERRACOTTA_DOOR, (Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_SLAB, (Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PURPLE_TERRACOTTA_STAIRS, (Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE, (Blocks.PURPLE_TERRACOTTA), (ModBlocks.PURPLE_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE, (Blocks.PURPLE_TERRACOTTA), (ModBlocks.PURPLE_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR, (ModBlocks.PURPLE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PURPLE_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_BUTTON, Blocks.PURPLE_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_WALL, (Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter);

        //magenta_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.MAGENTA_TERRACOTTA_DOOR, (Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, (Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, (Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE, (Blocks.MAGENTA_TERRACOTTA), (ModBlocks.MAGENTA_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE, (Blocks.MAGENTA_TERRACOTTA), (ModBlocks.MAGENTA_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR, (ModBlocks.MAGENTA_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.MAGENTA_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_BUTTON, Blocks.MAGENTA_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_WALL, (Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter);

        //pink_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.PINK_TERRACOTTA_DOOR, (Blocks.PINK_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_SLAB, (Blocks.PINK_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PINK_TERRACOTTA_STAIRS, (Blocks.PINK_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PINK_TERRACOTTA_FENCE, (Blocks.PINK_TERRACOTTA), (ModBlocks.PINK_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PINK_TERRACOTTA_FENCE_GATE, (Blocks.PINK_TERRACOTTA), (ModBlocks.PINK_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PINK_TERRACOTTA_TRAPDOOR, (ModBlocks.PINK_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PINK_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_BUTTON, Blocks.PINK_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_WALL, (Blocks.PINK_TERRACOTTA))
                .offerTo(exporter);

        //white_concrete
        ModRecipes.createDoorRecipe(ModBlocks.WHITE_CONCRETE_DOOR, (Blocks.WHITE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_SLAB, (Blocks.WHITE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WHITE_CONCRETE_STAIRS, (Blocks.WHITE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WHITE_CONCRETE_FENCE, (Blocks.WHITE_CONCRETE), (ModBlocks.WHITE_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WHITE_CONCRETE_FENCE_GATE, (Blocks.WHITE_CONCRETE), (ModBlocks.WHITE_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WHITE_CONCRETE_TRAPDOOR, (ModBlocks.WHITE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, (ModBlocks.WHITE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_WALL, (Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        //light_gray_concrete
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR, (Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, (Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, (Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, (Blocks.LIGHT_GRAY_CONCRETE), (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, (Blocks.LIGHT_GRAY_CONCRETE), (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR, (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, (Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        //gray_concrete
        ModRecipes.createDoorRecipe(ModBlocks.GRAY_CONCRETE_DOOR, (Blocks.GRAY_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_SLAB, (Blocks.GRAY_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRAY_CONCRETE_STAIRS, (Blocks.GRAY_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRAY_CONCRETE_FENCE, (Blocks.GRAY_CONCRETE), (ModBlocks.GRAY_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRAY_CONCRETE_FENCE_GATE, (Blocks.GRAY_CONCRETE), (ModBlocks.GRAY_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRAY_CONCRETE_TRAPDOOR, (ModBlocks.GRAY_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, (ModBlocks.GRAY_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_WALL, (Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        //black_concrete
        ModRecipes.createDoorRecipe(ModBlocks.BLACK_CONCRETE_DOOR, (Blocks.BLACK_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_SLAB, (Blocks.BLACK_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLACK_CONCRETE_STAIRS, (Blocks.BLACK_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACK_CONCRETE_FENCE, (Blocks.BLACK_CONCRETE), (ModBlocks.BLACK_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACK_CONCRETE_FENCE_GATE, (Blocks.BLACK_CONCRETE), (ModBlocks.BLACK_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACK_CONCRETE_TRAPDOOR, (ModBlocks.BLACK_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, (ModBlocks.BLACK_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_WALL, (Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        //brown_concrete
        ModRecipes.createDoorRecipe(ModBlocks.BROWN_CONCRETE_DOOR, (Blocks.BROWN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_SLAB, (Blocks.BROWN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BROWN_CONCRETE_STAIRS, (Blocks.BROWN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BROWN_CONCRETE_FENCE, (Blocks.BROWN_CONCRETE), (ModBlocks.BROWN_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BROWN_CONCRETE_FENCE_GATE, (Blocks.BROWN_CONCRETE), (ModBlocks.BROWN_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BROWN_CONCRETE_TRAPDOOR, (ModBlocks.BROWN_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, (ModBlocks.BROWN_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_WALL, (Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        //red_concrete
        ModRecipes.createDoorRecipe(ModBlocks.RED_CONCRETE_DOOR, (Blocks.RED_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_SLAB, (Blocks.RED_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.RED_CONCRETE_STAIRS, (Blocks.RED_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_CONCRETE_FENCE, (Blocks.RED_CONCRETE), (ModBlocks.RED_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_CONCRETE_FENCE_GATE, (Blocks.RED_CONCRETE), (ModBlocks.RED_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_CONCRETE_TRAPDOOR, (ModBlocks.RED_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, (ModBlocks.RED_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_WALL, (Blocks.RED_CONCRETE))
                .offerTo(exporter);

        //orange_concrete
        ModRecipes.createDoorRecipe(ModBlocks.ORANGE_CONCRETE_DOOR, (Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_SLAB, (Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ORANGE_CONCRETE_STAIRS, (Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ORANGE_CONCRETE_FENCE, (Blocks.ORANGE_CONCRETE), (ModBlocks.ORANGE_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ORANGE_CONCRETE_FENCE_GATE, (Blocks.ORANGE_CONCRETE), (ModBlocks.ORANGE_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ORANGE_CONCRETE_TRAPDOOR, (ModBlocks.ORANGE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, (ModBlocks.ORANGE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_WALL, (Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        //yellow_concrete
        ModRecipes.createDoorRecipe(ModBlocks.YELLOW_CONCRETE_DOOR, (Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_SLAB, (Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.YELLOW_CONCRETE_STAIRS, (Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.YELLOW_CONCRETE_FENCE, (Blocks.YELLOW_CONCRETE), (ModBlocks.YELLOW_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.YELLOW_CONCRETE_FENCE_GATE, (Blocks.YELLOW_CONCRETE), (ModBlocks.YELLOW_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.YELLOW_CONCRETE_TRAPDOOR, (ModBlocks.YELLOW_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, (ModBlocks.YELLOW_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_WALL, (Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        //lime_concrete
        ModRecipes.createDoorRecipe(ModBlocks.LIME_CONCRETE_DOOR, (Blocks.LIME_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_SLAB, (Blocks.LIME_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIME_CONCRETE_STAIRS, (Blocks.LIME_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIME_CONCRETE_FENCE, (Blocks.LIME_CONCRETE), (ModBlocks.LIME_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIME_CONCRETE_FENCE_GATE, (Blocks.LIME_CONCRETE), (ModBlocks.LIME_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIME_CONCRETE_TRAPDOOR, (ModBlocks.LIME_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIME_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_WALL, (Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        //green_concrete
        ModRecipes.createDoorRecipe(ModBlocks.GREEN_CONCRETE_DOOR, (Blocks.GREEN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_SLAB, (Blocks.GREEN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GREEN_CONCRETE_STAIRS, (Blocks.GREEN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GREEN_CONCRETE_FENCE, (Blocks.GREEN_CONCRETE), (ModBlocks.GREEN_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GREEN_CONCRETE_FENCE_GATE, (Blocks.GREEN_CONCRETE), (ModBlocks.GREEN_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GREEN_CONCRETE_TRAPDOOR, (ModBlocks.GREEN_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, (ModBlocks.GREEN_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_WALL, (Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        //cyan_concrete
        ModRecipes.createDoorRecipe(ModBlocks.CYAN_CONCRETE_DOOR, (Blocks.CYAN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_SLAB, (Blocks.CYAN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CYAN_CONCRETE_STAIRS, (Blocks.CYAN_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CYAN_CONCRETE_FENCE, (Blocks.CYAN_CONCRETE), (ModBlocks.CYAN_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CYAN_CONCRETE_FENCE_GATE, (Blocks.CYAN_CONCRETE), (ModBlocks.CYAN_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CYAN_CONCRETE_TRAPDOOR, (ModBlocks.CYAN_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, (ModBlocks.CYAN_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_WALL, (Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        //blue_concrete
        ModRecipes.createDoorRecipe(ModBlocks.BLUE_CONCRETE_DOOR, (Blocks.BLUE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_SLAB, (Blocks.BLUE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLUE_CONCRETE_STAIRS, (Blocks.BLUE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLUE_CONCRETE_FENCE, (Blocks.BLUE_CONCRETE), (ModBlocks.BLUE_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLUE_CONCRETE_FENCE_GATE, (Blocks.BLUE_CONCRETE), (ModBlocks.BLUE_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLUE_CONCRETE_TRAPDOOR, (ModBlocks.BLUE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, (ModBlocks.BLUE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_WALL, (Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        //light_blue_concrete
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR, (Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, (Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, (Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, (Blocks.LIGHT_BLUE_CONCRETE), (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, (Blocks.LIGHT_BLUE_CONCRETE), (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR, (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, (Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        //purple_concrete
        ModRecipes.createDoorRecipe(ModBlocks.PURPLE_CONCRETE_DOOR, (Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_SLAB, (Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PURPLE_CONCRETE_STAIRS, (Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPLE_CONCRETE_FENCE, (Blocks.PURPLE_CONCRETE), (ModBlocks.PURPLE_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPLE_CONCRETE_FENCE_GATE, (Blocks.PURPLE_CONCRETE), (ModBlocks.PURPLE_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPLE_CONCRETE_TRAPDOOR, (ModBlocks.PURPLE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, (ModBlocks.PURPLE_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_WALL, (Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        //magenta_concrete
        ModRecipes.createDoorRecipe(ModBlocks.MAGENTA_CONCRETE_DOOR, (Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_SLAB, (Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MAGENTA_CONCRETE_STAIRS, (Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MAGENTA_CONCRETE_FENCE, (Blocks.MAGENTA_CONCRETE), (ModBlocks.MAGENTA_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, (Blocks.MAGENTA_CONCRETE), (ModBlocks.MAGENTA_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR, (ModBlocks.MAGENTA_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, (ModBlocks.MAGENTA_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_WALL, (Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        //pink_concrete
        ModRecipes.createDoorRecipe(ModBlocks.PINK_CONCRETE_DOOR, (Blocks.PINK_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_SLAB, (Blocks.PINK_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PINK_CONCRETE_STAIRS, (Blocks.PINK_CONCRETE))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PINK_CONCRETE_FENCE, (Blocks.PINK_CONCRETE), (ModBlocks.PINK_CONCRETE_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PINK_CONCRETE_FENCE_GATE, (Blocks.PINK_CONCRETE), (ModBlocks.PINK_CONCRETE_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PINK_CONCRETE_TRAPDOOR, (ModBlocks.PINK_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, (ModBlocks.PINK_CONCRETE_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_WALL, (Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        //white_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.WHITE_CONCRETE_POWDER_DOOR, (Blocks.WHITE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_SLAB, (Blocks.WHITE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WHITE_CONCRETE_POWDER_STAIRS, (Blocks.WHITE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WHITE_CONCRETE_POWDER_FENCE, (Blocks.WHITE_CONCRETE_POWDER), (ModBlocks.WHITE_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WHITE_CONCRETE_POWDER_FENCE_GATE, (Blocks.WHITE_CONCRETE_POWDER), (ModBlocks.WHITE_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.WHITE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.WHITE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_BUTTON, Blocks.WHITE_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_WALL, (Blocks.WHITE_CONCRETE_POWDER))
                .offerTo(exporter);

        //light_gray_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR, (Blocks.LIGHT_GRAY_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, (Blocks.LIGHT_GRAY_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS, (Blocks.LIGHT_GRAY_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE, (Blocks.LIGHT_GRAY_CONCRETE_POWDER), (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIGHT_GRAY_CONCRETE_POWDER), (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON, Blocks.LIGHT_GRAY_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL, (Blocks.LIGHT_GRAY_CONCRETE_POWDER))
                .offerTo(exporter);

        //gray_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.GRAY_CONCRETE_POWDER_DOOR, (Blocks.GRAY_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_SLAB, (Blocks.GRAY_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRAY_CONCRETE_POWDER_STAIRS, (Blocks.GRAY_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRAY_CONCRETE_POWDER_FENCE, (Blocks.GRAY_CONCRETE_POWDER), (ModBlocks.GRAY_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRAY_CONCRETE_POWDER_FENCE_GATE, (Blocks.GRAY_CONCRETE_POWDER), (ModBlocks.GRAY_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.GRAY_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.GRAY_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_BUTTON, Blocks.GRAY_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_WALL, (Blocks.GRAY_CONCRETE_POWDER))
                .offerTo(exporter);

        //black_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.BLACK_CONCRETE_POWDER_DOOR, (Blocks.BLACK_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_SLAB, (Blocks.BLACK_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLACK_CONCRETE_POWDER_STAIRS, (Blocks.BLACK_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACK_CONCRETE_POWDER_FENCE, (Blocks.BLACK_CONCRETE_POWDER), (ModBlocks.BLACK_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACK_CONCRETE_POWDER_FENCE_GATE, (Blocks.BLACK_CONCRETE_POWDER), (ModBlocks.BLACK_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BLACK_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BLACK_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_BUTTON, Blocks.BLACK_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_WALL, (Blocks.BLACK_CONCRETE_POWDER))
                .offerTo(exporter);

        //brown_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.BROWN_CONCRETE_POWDER_DOOR, (Blocks.BROWN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_SLAB, (Blocks.BROWN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BROWN_CONCRETE_POWDER_STAIRS, (Blocks.BROWN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BROWN_CONCRETE_POWDER_FENCE, (Blocks.BROWN_CONCRETE_POWDER), (ModBlocks.BROWN_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BROWN_CONCRETE_POWDER_FENCE_GATE, (Blocks.BROWN_CONCRETE_POWDER), (ModBlocks.BROWN_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BROWN_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BROWN_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_BUTTON, Blocks.BROWN_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_WALL, (Blocks.BROWN_CONCRETE_POWDER))
                .offerTo(exporter);

        //red_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.RED_CONCRETE_POWDER_DOOR, (Blocks.RED_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_SLAB, (Blocks.RED_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.RED_CONCRETE_POWDER_STAIRS, (Blocks.RED_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_CONCRETE_POWDER_FENCE, (Blocks.RED_CONCRETE_POWDER), (ModBlocks.RED_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_CONCRETE_POWDER_FENCE_GATE, (Blocks.RED_CONCRETE_POWDER), (ModBlocks.RED_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.RED_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.RED_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_BUTTON, Blocks.RED_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_WALL, (Blocks.RED_CONCRETE_POWDER))
                .offerTo(exporter);

        //orange_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR, (Blocks.ORANGE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_SLAB, (Blocks.ORANGE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_STAIRS, (Blocks.ORANGE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE, (Blocks.ORANGE_CONCRETE_POWDER), (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE_GATE, (Blocks.ORANGE_CONCRETE_POWDER), (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_BUTTON, Blocks.ORANGE_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_WALL, (Blocks.ORANGE_CONCRETE_POWDER))
                .offerTo(exporter);

        //yellow_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR, (Blocks.YELLOW_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_SLAB, (Blocks.YELLOW_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_STAIRS, (Blocks.YELLOW_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE, (Blocks.YELLOW_CONCRETE_POWDER), (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE_GATE, (Blocks.YELLOW_CONCRETE_POWDER), (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_BUTTON, Blocks.YELLOW_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_WALL, (Blocks.YELLOW_CONCRETE_POWDER))
                .offerTo(exporter);

        //lime_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.LIME_CONCRETE_POWDER_DOOR, (Blocks.LIME_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_SLAB, (Blocks.LIME_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIME_CONCRETE_POWDER_STAIRS, (Blocks.LIME_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIME_CONCRETE_POWDER_FENCE, (Blocks.LIME_CONCRETE_POWDER), (ModBlocks.LIME_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIME_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIME_CONCRETE_POWDER), (ModBlocks.LIME_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIME_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIME_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_BUTTON, Blocks.LIME_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_WALL, (Blocks.LIME_CONCRETE_POWDER))
                .offerTo(exporter);

        //green_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.GREEN_CONCRETE_POWDER_DOOR, (Blocks.GREEN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_SLAB, (Blocks.GREEN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GREEN_CONCRETE_POWDER_STAIRS, (Blocks.GREEN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GREEN_CONCRETE_POWDER_FENCE, (Blocks.GREEN_CONCRETE_POWDER), (ModBlocks.GREEN_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GREEN_CONCRETE_POWDER_FENCE_GATE, (Blocks.GREEN_CONCRETE_POWDER), (ModBlocks.GREEN_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.GREEN_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.GREEN_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_BUTTON, Blocks.GREEN_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_WALL, (Blocks.GREEN_CONCRETE_POWDER))
                .offerTo(exporter);

        //cyan_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.CYAN_CONCRETE_POWDER_DOOR, (Blocks.CYAN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_SLAB, (Blocks.CYAN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CYAN_CONCRETE_POWDER_STAIRS, (Blocks.CYAN_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CYAN_CONCRETE_POWDER_FENCE, (Blocks.CYAN_CONCRETE_POWDER), (ModBlocks.CYAN_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CYAN_CONCRETE_POWDER_FENCE_GATE, (Blocks.CYAN_CONCRETE_POWDER), (ModBlocks.CYAN_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.CYAN_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.CYAN_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_BUTTON, Blocks.CYAN_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_WALL, (Blocks.CYAN_CONCRETE_POWDER))
                .offerTo(exporter);

        //blue_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.BLUE_CONCRETE_POWDER_DOOR, (Blocks.BLUE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_SLAB, (Blocks.BLUE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLUE_CONCRETE_POWDER_STAIRS, (Blocks.BLUE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLUE_CONCRETE_POWDER_FENCE, (Blocks.BLUE_CONCRETE_POWDER), (ModBlocks.BLUE_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLUE_CONCRETE_POWDER_FENCE_GATE, (Blocks.BLUE_CONCRETE_POWDER), (ModBlocks.BLUE_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BLUE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BLUE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_BUTTON, Blocks.BLUE_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_WALL, (Blocks.BLUE_CONCRETE_POWDER))
                .offerTo(exporter);

        //light_blue_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR, (Blocks.LIGHT_BLUE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, (Blocks.LIGHT_BLUE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS, (Blocks.LIGHT_BLUE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE, (Blocks.LIGHT_BLUE_CONCRETE_POWDER), (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIGHT_BLUE_CONCRETE_POWDER), (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON, Blocks.LIGHT_BLUE_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL, (Blocks.LIGHT_BLUE_CONCRETE_POWDER))
                .offerTo(exporter);

        //purple_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR, (Blocks.PURPLE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_SLAB, (Blocks.PURPLE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_STAIRS, (Blocks.PURPLE_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE, (Blocks.PURPLE_CONCRETE_POWDER), (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE_GATE, (Blocks.PURPLE_CONCRETE_POWDER), (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_BUTTON, Blocks.PURPLE_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_WALL, (Blocks.PURPLE_CONCRETE_POWDER))
                .offerTo(exporter);

        //magenta_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR, (Blocks.MAGENTA_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB, (Blocks.MAGENTA_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_STAIRS, (Blocks.MAGENTA_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE, (Blocks.MAGENTA_CONCRETE_POWDER), (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE_GATE, (Blocks.MAGENTA_CONCRETE_POWDER), (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_BUTTON, Blocks.MAGENTA_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_WALL, (Blocks.MAGENTA_CONCRETE_POWDER))
                .offerTo(exporter);

        //pink_concrete_powder
        ModRecipes.createDoorRecipe(ModBlocks.PINK_CONCRETE_POWDER_DOOR, (Blocks.PINK_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_SLAB, (Blocks.PINK_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PINK_CONCRETE_POWDER_STAIRS, (Blocks.PINK_CONCRETE_POWDER))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PINK_CONCRETE_POWDER_FENCE, (Blocks.PINK_CONCRETE_POWDER), (ModBlocks.PINK_CONCRETE_POWDER_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PINK_CONCRETE_POWDER_FENCE_GATE, (Blocks.PINK_CONCRETE_POWDER), (ModBlocks.PINK_CONCRETE_POWDER_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.PINK_CONCRETE_POWDER_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_PRESSURE_PLATE, ModBlocks.PINK_CONCRETE_POWDER_SLAB)
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_BUTTON, Blocks.PINK_CONCRETE_POWDER, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_WALL, (Blocks.PINK_CONCRETE_POWDER))
                .offerTo(exporter);

        //white_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR, (Blocks.WHITE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, (Blocks.WHITE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, (Blocks.WHITE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE, (Blocks.WHITE_GLAZED_TERRACOTTA), (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.WHITE_GLAZED_TERRACOTTA), (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON, Blocks.WHITE_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, (Blocks.WHITE_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //light_gray_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //gray_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR, (Blocks.GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, (Blocks.GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, (Blocks.GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE, (Blocks.GRAY_GLAZED_TERRACOTTA), (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.GRAY_GLAZED_TERRACOTTA), (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON, Blocks.GRAY_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, (Blocks.GRAY_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //black_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR, (Blocks.BLACK_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, (Blocks.BLACK_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, (Blocks.BLACK_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE, (Blocks.BLACK_GLAZED_TERRACOTTA), (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BLACK_GLAZED_TERRACOTTA), (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON, Blocks.BLACK_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, (Blocks.BLACK_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //brown_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR, (Blocks.BROWN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, (Blocks.BROWN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, (Blocks.BROWN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE, (Blocks.BROWN_GLAZED_TERRACOTTA), (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BROWN_GLAZED_TERRACOTTA), (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON, Blocks.BROWN_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, (Blocks.BROWN_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //red_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR, (Blocks.RED_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, (Blocks.RED_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, (Blocks.RED_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE, (Blocks.RED_GLAZED_TERRACOTTA), (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.RED_GLAZED_TERRACOTTA), (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON, Blocks.RED_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, (Blocks.RED_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //orange_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR, (Blocks.ORANGE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, (Blocks.ORANGE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, (Blocks.ORANGE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE, (Blocks.ORANGE_GLAZED_TERRACOTTA), (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.ORANGE_GLAZED_TERRACOTTA), (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON, Blocks.ORANGE_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, (Blocks.ORANGE_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //yellow_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR, (Blocks.YELLOW_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, (Blocks.YELLOW_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, (Blocks.YELLOW_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE, (Blocks.YELLOW_GLAZED_TERRACOTTA), (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.YELLOW_GLAZED_TERRACOTTA), (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON, Blocks.YELLOW_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, (Blocks.YELLOW_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //lime_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR, (Blocks.LIME_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, (Blocks.LIME_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIME_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE, (Blocks.LIME_GLAZED_TERRACOTTA), (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIME_GLAZED_TERRACOTTA), (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON, Blocks.LIME_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, (Blocks.LIME_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //green_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR, (Blocks.GREEN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, (Blocks.GREEN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, (Blocks.GREEN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE, (Blocks.GREEN_GLAZED_TERRACOTTA), (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.GREEN_GLAZED_TERRACOTTA), (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON, Blocks.GREEN_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, (Blocks.GREEN_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //cyan_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR, (Blocks.CYAN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, (Blocks.CYAN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, (Blocks.CYAN_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE, (Blocks.CYAN_GLAZED_TERRACOTTA), (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.CYAN_GLAZED_TERRACOTTA), (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON, Blocks.CYAN_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, (Blocks.CYAN_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //blue_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR, (Blocks.BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, (Blocks.BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, (Blocks.BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE, (Blocks.BLUE_GLAZED_TERRACOTTA), (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BLUE_GLAZED_TERRACOTTA), (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON, Blocks.BLUE_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, (Blocks.BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //light_blue_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //purple_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR, (Blocks.PURPLE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, (Blocks.PURPLE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, (Blocks.PURPLE_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE, (Blocks.PURPLE_GLAZED_TERRACOTTA), (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.PURPLE_GLAZED_TERRACOTTA), (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON, Blocks.PURPLE_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, (Blocks.PURPLE_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //magenta_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR, (Blocks.MAGENTA_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, (Blocks.MAGENTA_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, (Blocks.MAGENTA_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE, (Blocks.MAGENTA_GLAZED_TERRACOTTA), (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.MAGENTA_GLAZED_TERRACOTTA), (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON, Blocks.MAGENTA_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, (Blocks.MAGENTA_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //pink_glazed_terracotta
        ModRecipes.createDoorRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR, (Blocks.PINK_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, (Blocks.PINK_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, (Blocks.PINK_GLAZED_TERRACOTTA))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE, (Blocks.PINK_GLAZED_TERRACOTTA), (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.PINK_GLAZED_TERRACOTTA), (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON, Blocks.PINK_GLAZED_TERRACOTTA, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, (Blocks.PINK_GLAZED_TERRACOTTA))
                .offerTo(exporter);

        //white_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.WHITE_STAINED_GLASS_DOOR, (Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_SLAB, (Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.WHITE_STAINED_GLASS_STAIRS, (Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE, (Blocks.WHITE_STAINED_GLASS), (ModBlocks.WHITE_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE, (Blocks.WHITE_STAINED_GLASS), (ModBlocks.WHITE_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR, (ModBlocks.WHITE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.WHITE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_BUTTON, Blocks.WHITE_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_WALL, (Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        //light_gray_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR, (Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, (Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, (Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, (Blocks.LIGHT_GRAY_STAINED_GLASS), (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, (Blocks.LIGHT_GRAY_STAINED_GLASS), (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, Blocks.LIGHT_GRAY_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, (Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        //gray_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.GRAY_STAINED_GLASS_DOOR, (Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_SLAB, (Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRAY_STAINED_GLASS_STAIRS, (Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE, (Blocks.GRAY_STAINED_GLASS), (ModBlocks.GRAY_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE, (Blocks.GRAY_STAINED_GLASS), (ModBlocks.GRAY_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR, (ModBlocks.GRAY_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.GRAY_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_BUTTON, Blocks.GRAY_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_WALL, (Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        //black_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.BLACK_STAINED_GLASS_DOOR, (Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_SLAB, (Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLACK_STAINED_GLASS_STAIRS, (Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE, (Blocks.BLACK_STAINED_GLASS), (ModBlocks.BLACK_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE, (Blocks.BLACK_STAINED_GLASS), (ModBlocks.BLACK_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR, (ModBlocks.BLACK_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BLACK_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_BUTTON, Blocks.BLACK_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_WALL, (Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        //brown_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.BROWN_STAINED_GLASS_DOOR, (Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_SLAB, (Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BROWN_STAINED_GLASS_STAIRS, (Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE, (Blocks.BROWN_STAINED_GLASS), (ModBlocks.BROWN_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE, (Blocks.BROWN_STAINED_GLASS), (ModBlocks.BROWN_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR, (ModBlocks.BROWN_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BROWN_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_BUTTON, Blocks.BROWN_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_WALL, (Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        //red_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.RED_STAINED_GLASS_DOOR, (Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_SLAB, (Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.RED_STAINED_GLASS_STAIRS, (Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.RED_STAINED_GLASS_FENCE, (Blocks.RED_STAINED_GLASS), (ModBlocks.RED_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.RED_STAINED_GLASS_FENCE_GATE, (Blocks.RED_STAINED_GLASS), (ModBlocks.RED_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.RED_STAINED_GLASS_TRAPDOOR, (ModBlocks.RED_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.RED_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_BUTTON, Blocks.RED_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_WALL, (Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        //orange_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.ORANGE_STAINED_GLASS_DOOR, (Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_SLAB, (Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ORANGE_STAINED_GLASS_STAIRS, (Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE, (Blocks.ORANGE_STAINED_GLASS), (ModBlocks.ORANGE_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, (Blocks.ORANGE_STAINED_GLASS), (ModBlocks.ORANGE_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR, (ModBlocks.ORANGE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.ORANGE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_BUTTON, Blocks.ORANGE_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_WALL, (Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        //yellow_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.YELLOW_STAINED_GLASS_DOOR, (Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_SLAB, (Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.YELLOW_STAINED_GLASS_STAIRS, (Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE, (Blocks.YELLOW_STAINED_GLASS), (ModBlocks.YELLOW_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, (Blocks.YELLOW_STAINED_GLASS), (ModBlocks.YELLOW_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR, (ModBlocks.YELLOW_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.YELLOW_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_BUTTON, Blocks.YELLOW_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_WALL, (Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        //lime_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.LIME_STAINED_GLASS_DOOR, (Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_SLAB, (Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIME_STAINED_GLASS_STAIRS, (Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE, (Blocks.LIME_STAINED_GLASS), (ModBlocks.LIME_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE, (Blocks.LIME_STAINED_GLASS), (ModBlocks.LIME_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIME_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIME_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_BUTTON, Blocks.LIME_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_WALL, (Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        //green_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.GREEN_STAINED_GLASS_DOOR, (Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_SLAB, (Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GREEN_STAINED_GLASS_STAIRS, (Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE, (Blocks.GREEN_STAINED_GLASS), (ModBlocks.GREEN_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE, (Blocks.GREEN_STAINED_GLASS), (ModBlocks.GREEN_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR, (ModBlocks.GREEN_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.GREEN_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_BUTTON, Blocks.GREEN_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_WALL, (Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        //cyan_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.CYAN_STAINED_GLASS_DOOR, (Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_SLAB, (Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.CYAN_STAINED_GLASS_STAIRS, (Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE, (Blocks.CYAN_STAINED_GLASS), (ModBlocks.CYAN_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE, (Blocks.CYAN_STAINED_GLASS), (ModBlocks.CYAN_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR, (ModBlocks.CYAN_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.CYAN_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_BUTTON, Blocks.CYAN_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_WALL, (Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        //blue_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.BLUE_STAINED_GLASS_DOOR, (Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_SLAB, (Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.BLUE_STAINED_GLASS_STAIRS, (Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE, (Blocks.BLUE_STAINED_GLASS), (ModBlocks.BLUE_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE, (Blocks.BLUE_STAINED_GLASS), (ModBlocks.BLUE_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR, (ModBlocks.BLUE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BLUE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_BUTTON, Blocks.BLUE_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_WALL, (Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        //light_blue_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR, (Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, (Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, (Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, (Blocks.LIGHT_BLUE_STAINED_GLASS), (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, (Blocks.LIGHT_BLUE_STAINED_GLASS), (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, Blocks.LIGHT_BLUE_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, (Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        //purple_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.PURPLE_STAINED_GLASS_DOOR, (Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_SLAB, (Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PURPLE_STAINED_GLASS_STAIRS, (Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE, (Blocks.PURPLE_STAINED_GLASS), (ModBlocks.PURPLE_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, (Blocks.PURPLE_STAINED_GLASS), (ModBlocks.PURPLE_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR, (ModBlocks.PURPLE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.PURPLE_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_BUTTON, Blocks.PURPLE_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_WALL, (Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        //magenta_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.MAGENTA_STAINED_GLASS_DOOR, (Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_SLAB, (Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, (Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE, (Blocks.MAGENTA_STAINED_GLASS), (ModBlocks.MAGENTA_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, (Blocks.MAGENTA_STAINED_GLASS), (ModBlocks.MAGENTA_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR, (ModBlocks.MAGENTA_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.MAGENTA_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_BUTTON, Blocks.MAGENTA_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_WALL, (Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        //pink_stained_glass
        ModRecipes.createDoorRecipe(ModBlocks.PINK_STAINED_GLASS_DOOR, (Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_SLAB, (Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PINK_STAINED_GLASS_STAIRS, (Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE, (Blocks.PINK_STAINED_GLASS), (ModBlocks.PINK_STAINED_GLASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE, (Blocks.PINK_STAINED_GLASS), (ModBlocks.PINK_STAINED_GLASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR, (ModBlocks.PINK_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.PINK_STAINED_GLASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_BUTTON, Blocks.PINK_STAINED_GLASS, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_WALL, (Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        //grass_block
        ModRecipes.createDoorRecipe(ModBlocks.GRASS_DOOR, (Blocks.GRASS_BLOCK))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_SLAB, (Blocks.GRASS_BLOCK))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.GRASS_STAIRS, (Blocks.GRASS_BLOCK))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.GRASS_FENCE, (Blocks.GRASS_BLOCK), (ModBlocks.GRASS_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.GRASS_FENCE_GATE, (Blocks.GRASS_BLOCK), (ModBlocks.GRASS_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.GRASS_TRAPDOOR, (ModBlocks.GRASS_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_PRESSURE_PLATE, (ModBlocks.GRASS_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_BUTTON, Blocks.GRASS_BLOCK, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_WALL, (Blocks.GRASS_BLOCK))
                .offerTo(exporter);

        //podzol
        ModRecipes.createDoorRecipe(ModBlocks.PODZOL_DOOR, (Blocks.PODZOL))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_SLAB, (Blocks.PODZOL))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.PODZOL_STAIRS, (Blocks.PODZOL))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.PODZOL_FENCE, (Blocks.PODZOL), (ModBlocks.PODZOL_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.PODZOL_FENCE_GATE, (Blocks.PODZOL), (ModBlocks.PODZOL_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.PODZOL_TRAPDOOR, (ModBlocks.PODZOL_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_PRESSURE_PLATE, (ModBlocks.PODZOL_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_BUTTON, Blocks.PODZOL, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_WALL, (Blocks.PODZOL))
                .offerTo(exporter);

        //dirt
        ModRecipes.createDoorRecipe(ModBlocks.DIRT_DOOR, (Blocks.DIRT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_SLAB, (Blocks.DIRT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.DIRT_STAIRS, (Blocks.DIRT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DIRT_FENCE, (Blocks.DIRT), (ModBlocks.DIRT_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DIRT_FENCE_GATE, (Blocks.DIRT), (ModBlocks.DIRT_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DIRT_TRAPDOOR, (ModBlocks.DIRT_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PRESSURE_PLATE, (ModBlocks.DIRT_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_BUTTON, Blocks.DIRT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_WALL, (Blocks.DIRT))
                .offerTo(exporter);

        //mycelium
        ModRecipes.createDoorRecipe(ModBlocks.MYCELIUM_DOOR, (Blocks.MYCELIUM))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_SLAB, (Blocks.MYCELIUM))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.MYCELIUM_STAIRS, (Blocks.MYCELIUM))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.MYCELIUM_FENCE, (Blocks.MYCELIUM), (ModBlocks.MYCELIUM_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.MYCELIUM_FENCE_GATE, (Blocks.MYCELIUM), (ModBlocks.MYCELIUM_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.MYCELIUM_TRAPDOOR, (ModBlocks.MYCELIUM_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_PRESSURE_PLATE, (ModBlocks.MYCELIUM_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_BUTTON, Blocks.MYCELIUM, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_WALL, (Blocks.MYCELIUM))
                .offerTo(exporter);

        //dirt_path
        ModRecipes.createDoorRecipe(ModBlocks.DIRT_PATH_DOOR, (Blocks.DIRT_PATH))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_SLAB, (Blocks.DIRT_PATH))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.DIRT_PATH_STAIRS, (Blocks.DIRT_PATH))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.DIRT_PATH_FENCE, (Blocks.DIRT_PATH), (ModBlocks.DIRT_PATH_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.DIRT_PATH_FENCE_GATE, (Blocks.DIRT_PATH), (ModBlocks.DIRT_PATH_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.DIRT_PATH_TRAPDOOR, (ModBlocks.DIRT_PATH_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_PRESSURE_PLATE, (ModBlocks.DIRT_PATH_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_BUTTON, Blocks.DIRT_PATH, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_WALL, (Blocks.DIRT_PATH))
                .offerTo(exporter);

        //coarse_dirt
        ModRecipes.createDoorRecipe(ModBlocks.COARSE_DIRT_DOOR, (Blocks.COARSE_DIRT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_SLAB, (Blocks.COARSE_DIRT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.COARSE_DIRT_STAIRS, (Blocks.COARSE_DIRT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.COARSE_DIRT_FENCE, (Blocks.COARSE_DIRT), (ModBlocks.COARSE_DIRT_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.COARSE_DIRT_FENCE_GATE, (Blocks.COARSE_DIRT), (ModBlocks.COARSE_DIRT_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.COARSE_DIRT_TRAPDOOR, (ModBlocks.COARSE_DIRT_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_PRESSURE_PLATE, (ModBlocks.COARSE_DIRT_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_BUTTON, Blocks.COARSE_DIRT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_WALL, (Blocks.COARSE_DIRT))
                .offerTo(exporter);

        //farmland
        ModRecipes.createDoorRecipe(ModBlocks.FARMLAND_DOOR, (Blocks.FARMLAND))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_SLAB, (Blocks.FARMLAND))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.FARMLAND_STAIRS, (Blocks.FARMLAND))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.FARMLAND_FENCE, (Blocks.FARMLAND), (ModBlocks.FARMLAND_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.FARMLAND_FENCE_GATE, (Blocks.FARMLAND), (ModBlocks.FARMLAND_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.FARMLAND_TRAPDOOR, (ModBlocks.FARMLAND_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_PRESSURE_PLATE, (ModBlocks.FARMLAND_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_BUTTON, Blocks.FARMLAND, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_WALL, (Blocks.FARMLAND))
                .offerTo(exporter);

        //rooted_dirt
        ModRecipes.createDoorRecipe(ModBlocks.ROOTED_DIRT_DOOR, (Blocks.ROOTED_DIRT))
                .offerTo(exporter);
        ModRecipes.createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_SLAB, (Blocks.ROOTED_DIRT))
                .offerTo(exporter);
        ModRecipes.createStairsRecipe(ModBlocks.ROOTED_DIRT_STAIRS, (Blocks.ROOTED_DIRT))
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceRecipe(ModBlocks.ROOTED_DIRT_FENCE, (Blocks.ROOTED_DIRT), (ModBlocks.ROOTED_DIRT_SLAB), 3)
                .offerTo(exporter);
        ModRecipes.createNonWoodFenceGateRecipe(ModBlocks.ROOTED_DIRT_FENCE_GATE, (Blocks.ROOTED_DIRT), (ModBlocks.ROOTED_DIRT_SLAB), 1)
                .offerTo(exporter);
        ModRecipes.createTrapdoorRecipe(ModBlocks.ROOTED_DIRT_TRAPDOOR, (ModBlocks.ROOTED_DIRT_SLAB))
                .offerTo(exporter);
        ModRecipes.createPressurePlateModRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_PRESSURE_PLATE, (ModBlocks.ROOTED_DIRT_SLAB))
                .offerTo(exporter);
        ModRecipes.offerButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_BUTTON, Blocks.ROOTED_DIRT, 1)
                .offerTo(exporter);
        ModRecipes.createWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_WALL, (Blocks.ROOTED_DIRT))
                .offerTo(exporter);






        //ingredients
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.COAL_BIT, Items.COAL)
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.IRON_BIT, Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.GOLD_BIT, Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.LAPIS_BIT, Items.LAPIS_LAZULI)
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.NETHERITE_BIT, Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.REDSTONE_SHARD, Items.REDSTONE)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.EMERALD_FRAGMENT, Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.DIAMOND_DUST, Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ModRecipes.createIngredientRecipe(RecipeCategory.MISC, ModItems.COPPER_BIT, Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
    }









}


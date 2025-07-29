package net.fellter.vanillablocksplus.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.fellter.vanillablocksplus.item.ModItems;

import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {

            private final RegistryEntryLookup<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

            public void offerStainedGlassDyeingRecipe(RecipeExporter exporter, List<ItemConvertible> dyes, List<ItemConvertible> dyeables, String group) {
                for (int i = 0; i < dyes.size(); i++) {
                    Item item = dyes.get(i).asItem();
                    Item item2 = dyeables.get(i).asItem();
                    ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, item2, 8)
                            .input('X', Ingredient.ofItems(item)).input('#', Ingredient.ofItems(dyeables.stream().filter((dyeable) -> !dyeable.equals(item2))))
                            .pattern("###")
                            .pattern("#X#")
                            .pattern("###")
                            .group(group).criterion("has_needed_dye", conditionsFromItem(item))
                            .offerTo(exporter, getItemPath(item2) + "_from_dyeing");
                }
            }
            public void createSmeltingWithLists(RecipeExporter exporter, List<ItemConvertible> toBeSmelted, List<ItemConvertible> smelted, RecipeCategory category, float experience, int cookingTime) {
                for(int i = 0; i < toBeSmelted.size(); ++i) {
                    if (toBeSmelted.size() != smelted.size()) {
                        throw new IllegalStateException("Lists " + toBeSmelted + " and " + smelted + " aren't the same size - cannot run datagen.");
                    }
                    Item item = toBeSmelted.get(i).asItem();
                    Item item2 = smelted.get(i).asItem();
                    CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(item), category, item2, experience, cookingTime)
                            .criterion(hasItem(item), conditionsFromItem(item)).offerTo(exporter, getItemPath(item2) + "_from_smelting");
                }
            }
            public void createSmeltingWithLists(RecipeExporter exporter, List<ItemConvertible> toBeSmelted, ItemConvertible smelted, RecipeCategory category, float experience, int cookingTime) {
                for (ItemConvertible itemConvertible : toBeSmelted) {
                    CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(itemConvertible), category, smelted, experience, cookingTime)
                            .criterion(hasItem(itemConvertible), conditionsFromItem(itemConvertible)).offerTo(exporter, getItemPath(smelted) + "_from_smelting_" + getItemPath(itemConvertible));
                }
            }
            public void createBlastingWithLists(RecipeExporter exporter, List<ItemConvertible> toBeSmelted, ItemConvertible smelted, RecipeCategory category, float experience, int cookingTime) {
                for (ItemConvertible itemConvertible : toBeSmelted) {
                    CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(itemConvertible), category, smelted, experience, cookingTime)
                            .criterion(hasItem(itemConvertible), conditionsFromItem(itemConvertible)).offerTo(exporter, getItemPath(smelted) + "_from_blasting_" + getItemPath(itemConvertible));
                }
            }
            
            @Override
            public void generate() {




                generateDyeables(exporter);
                generateSmeltables(exporter);

                //offerSmelting();


                //oak
                StairsRecipe(ModBlocks.OAK_WOOD_STAIRS, (Blocks.OAK_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_SLAB, (Blocks.OAK_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.OAK_WOOD_DOOR, (Blocks.OAK_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.OAK_WOOD_FENCE, (Blocks.OAK_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.OAK_WOOD_FENCE_GATE, (Blocks.OAK_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.OAK_WOOD_PRESSURE_PLATE, (Blocks.OAK_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.OAK_WOOD_TRAPDOOR, (Blocks.OAK_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WOOD_BUTTON, Blocks.OAK_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.OAK_WOOD_WALL, Blocks.OAK_WOOD).offerTo(exporter);

                //oak
                StairsRecipe(ModBlocks2.OAK_LOG_STAIRS, (Blocks.OAK_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OAK_LOG_SLAB, (Blocks.OAK_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.OAK_LOG_DOOR, (Blocks.OAK_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.OAK_LOG_FENCE, (Blocks.OAK_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.OAK_LOG_FENCE_GATE, (Blocks.OAK_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.OAK_LOG_PRESSURE_PLATE, (Blocks.OAK_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.OAK_LOG_TRAPDOOR, (Blocks.OAK_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OAK_LOG_BUTTON, ModBlocks2.OAK_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.OAK_LOG_WALL, Blocks.OAK_LOG).offerTo(exporter);

                //str oak
                StairsRecipe(ModBlocks.STR_OAK_WOOD_STAIRS, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_SLAB, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_OAK_WOOD_DOOR, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_OAK_WOOD_FENCE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_OAK_WOOD_BUTTON, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_OAK_WOOD_WALL, Blocks.STRIPPED_OAK_WOOD).offerTo(exporter);

                //oak
                StairsRecipe(ModBlocks2.STR_OAK_LOG_STAIRS, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_OAK_LOG_SLAB, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_OAK_LOG_DOOR, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_OAK_LOG_FENCE, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_OAK_LOG_FENCE_GATE, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_OAK_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_OAK_LOG_TRAPDOOR, (Blocks.STRIPPED_OAK_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_OAK_LOG_BUTTON, ModBlocks2.STR_OAK_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_OAK_LOG_WALL, Blocks.STRIPPED_OAK_LOG).offerTo(exporter);

                //spruce
                StairsRecipe(ModBlocks.SPRUCE_WOOD_STAIRS, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_SLAB, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.SPRUCE_WOOD_DOOR, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.SPRUCE_WOOD_FENCE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.SPRUCE_WOOD_FENCE_GATE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SPRUCE_WOOD_TRAPDOOR, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WOOD_BUTTON, Blocks.SPRUCE_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.SPRUCE_WOOD_WALL, Blocks.SPRUCE_WOOD).offerTo(exporter);

                //spruce
                StairsRecipe(ModBlocks2.SPRUCE_LOG_STAIRS, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPRUCE_LOG_SLAB, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.SPRUCE_LOG_DOOR, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.SPRUCE_LOG_FENCE, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.SPRUCE_LOG_FENCE_GATE, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.SPRUCE_LOG_PRESSURE_PLATE, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.SPRUCE_LOG_TRAPDOOR, (Blocks.SPRUCE_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPRUCE_LOG_BUTTON, ModBlocks2.SPRUCE_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.SPRUCE_LOG_WALL, Blocks.SPRUCE_LOG).offerTo(exporter);

                //str spruce
                StairsRecipe(ModBlocks.STR_SPRUCE_WOOD_STAIRS, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_SLAB, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_SPRUCE_WOOD_DOOR, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_SPRUCE_WOOD_BUTTON, Blocks.STRIPPED_SPRUCE_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_SPRUCE_WOOD_WALL, Blocks.STRIPPED_SPRUCE_WOOD).offerTo(exporter);

                //spruce
                StairsRecipe(ModBlocks2.STR_SPRUCE_LOG_STAIRS, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_SPRUCE_LOG_SLAB, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_SPRUCE_LOG_DOOR, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_SPRUCE_LOG_FENCE, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_SPRUCE_LOG_FENCE_GATE, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_SPRUCE_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR, (Blocks.STRIPPED_SPRUCE_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_SPRUCE_LOG_BUTTON, ModBlocks2.STR_SPRUCE_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_SPRUCE_LOG_WALL, Blocks.STRIPPED_SPRUCE_LOG).offerTo(exporter);

                //birch
                StairsRecipe(ModBlocks.BIRCH_WOOD_STAIRS, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_SLAB, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.BIRCH_WOOD_DOOR, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.BIRCH_WOOD_FENCE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.BIRCH_WOOD_FENCE_GATE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BIRCH_WOOD_TRAPDOOR, (Blocks.BIRCH_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WOOD_BUTTON, Blocks.BIRCH_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.BIRCH_WOOD_WALL, Blocks.BIRCH_WOOD).offerTo(exporter);

                //birch
                StairsRecipe(ModBlocks2.BIRCH_LOG_STAIRS, (Blocks.BIRCH_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BIRCH_LOG_SLAB, (Blocks.BIRCH_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.BIRCH_LOG_DOOR, (Blocks.BIRCH_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.BIRCH_LOG_FENCE, (Blocks.BIRCH_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.BIRCH_LOG_FENCE_GATE, (Blocks.BIRCH_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.BIRCH_LOG_PRESSURE_PLATE, (Blocks.BIRCH_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.BIRCH_LOG_TRAPDOOR, (Blocks.BIRCH_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BIRCH_LOG_BUTTON, ModBlocks2.BIRCH_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.BIRCH_LOG_WALL, Blocks.BIRCH_LOG).offerTo(exporter);

                //str birch
                StairsRecipe(ModBlocks.STR_BIRCH_WOOD_STAIRS, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_SLAB, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_BIRCH_WOOD_DOOR, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BIRCH_WOOD_BUTTON, Blocks.STRIPPED_BIRCH_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_BIRCH_WOOD_WALL, Blocks.STRIPPED_BIRCH_WOOD).offerTo(exporter);

                //birch
                StairsRecipe(ModBlocks2.STR_BIRCH_LOG_STAIRS, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_BIRCH_LOG_SLAB, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_BIRCH_LOG_DOOR, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_BIRCH_LOG_FENCE, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_BIRCH_LOG_FENCE_GATE, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_BIRCH_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_BIRCH_LOG_TRAPDOOR, (Blocks.STRIPPED_BIRCH_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_BIRCH_LOG_BUTTON, ModBlocks2.STR_BIRCH_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_BIRCH_LOG_WALL, Blocks.STRIPPED_BIRCH_LOG).offerTo(exporter);

                //jungle
                StairsRecipe(ModBlocks.JUNGLE_WOOD_STAIRS, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_SLAB, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.JUNGLE_WOOD_DOOR, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.JUNGLE_WOOD_FENCE, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.JUNGLE_WOOD_FENCE_GATE, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.JUNGLE_WOOD_TRAPDOOR, (Blocks.JUNGLE_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WOOD_BUTTON, Blocks.JUNGLE_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.JUNGLE_WOOD_WALL, Blocks.JUNGLE_WOOD).offerTo(exporter);

                //jungle
                StairsRecipe(ModBlocks2.JUNGLE_LOG_STAIRS, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.JUNGLE_LOG_SLAB, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.JUNGLE_LOG_DOOR, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.JUNGLE_LOG_FENCE, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.JUNGLE_LOG_FENCE_GATE, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.JUNGLE_LOG_PRESSURE_PLATE, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.JUNGLE_LOG_TRAPDOOR, (Blocks.JUNGLE_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.JUNGLE_LOG_BUTTON, ModBlocks2.JUNGLE_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.JUNGLE_LOG_WALL, Blocks.JUNGLE_LOG).offerTo(exporter);

                //str jungle
                StairsRecipe(ModBlocks.STR_JUNGLE_WOOD_STAIRS, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_SLAB, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_JUNGLE_WOOD_DOOR, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR, (Blocks.STRIPPED_JUNGLE_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_JUNGLE_WOOD_BUTTON, Blocks.STRIPPED_JUNGLE_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_JUNGLE_WOOD_WALL, Blocks.STRIPPED_JUNGLE_WOOD).offerTo(exporter);

                //jungle
                StairsRecipe(ModBlocks2.STR_JUNGLE_LOG_STAIRS, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_JUNGLE_LOG_SLAB, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_JUNGLE_LOG_DOOR, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_JUNGLE_LOG_FENCE, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_JUNGLE_LOG_FENCE_GATE, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_JUNGLE_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR, (Blocks.STRIPPED_JUNGLE_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_JUNGLE_LOG_BUTTON, ModBlocks2.STR_JUNGLE_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_JUNGLE_LOG_WALL, Blocks.STRIPPED_JUNGLE_LOG).offerTo(exporter);

                //acacia
                StairsRecipe(ModBlocks.ACACIA_WOOD_STAIRS, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_SLAB, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.ACACIA_WOOD_DOOR, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.ACACIA_WOOD_FENCE, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.ACACIA_WOOD_FENCE_GATE, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ACACIA_WOOD_TRAPDOOR, (Blocks.ACACIA_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WOOD_BUTTON, Blocks.ACACIA_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.ACACIA_WOOD_WALL, Blocks.ACACIA_WOOD).offerTo(exporter);

                //acacia
                StairsRecipe(ModBlocks2.ACACIA_LOG_STAIRS, (Blocks.ACACIA_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ACACIA_LOG_SLAB, (Blocks.ACACIA_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.ACACIA_LOG_DOOR, (Blocks.ACACIA_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.ACACIA_LOG_FENCE, (Blocks.ACACIA_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.ACACIA_LOG_FENCE_GATE, (Blocks.ACACIA_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.ACACIA_LOG_PRESSURE_PLATE, (Blocks.ACACIA_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.ACACIA_LOG_TRAPDOOR, (Blocks.ACACIA_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ACACIA_LOG_BUTTON, ModBlocks2.ACACIA_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.ACACIA_LOG_WALL, Blocks.ACACIA_LOG).offerTo(exporter);

                //str acacia
                StairsRecipe(ModBlocks.STR_ACACIA_WOOD_STAIRS, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_SLAB, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_ACACIA_WOOD_DOOR, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR, (Blocks.STRIPPED_ACACIA_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_ACACIA_WOOD_BUTTON, Blocks.STRIPPED_ACACIA_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_ACACIA_WOOD_WALL, Blocks.STRIPPED_ACACIA_WOOD).offerTo(exporter);

                //acacia
                StairsRecipe(ModBlocks2.STR_ACACIA_LOG_STAIRS, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_ACACIA_LOG_SLAB, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_ACACIA_LOG_DOOR, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_ACACIA_LOG_FENCE, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_ACACIA_LOG_FENCE_GATE, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_ACACIA_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_ACACIA_LOG_TRAPDOOR, (Blocks.STRIPPED_ACACIA_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_ACACIA_LOG_BUTTON, ModBlocks2.STR_ACACIA_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_ACACIA_LOG_WALL, Blocks.STRIPPED_ACACIA_LOG).offerTo(exporter);

                //dark oak
                StairsRecipe(ModBlocks.DARK_OAK_WOOD_STAIRS, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_SLAB, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.DARK_OAK_WOOD_DOOR, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.DARK_OAK_WOOD_FENCE, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, (Blocks.DARK_OAK_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WOOD_BUTTON, Blocks.DARK_OAK_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.DARK_OAK_WOOD_WALL, Blocks.DARK_OAK_WOOD).offerTo(exporter);

                //dark_oak
                StairsRecipe(ModBlocks2.DARK_OAK_LOG_STAIRS, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DARK_OAK_LOG_SLAB, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.DARK_OAK_LOG_DOOR, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.DARK_OAK_LOG_FENCE, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.DARK_OAK_LOG_FENCE_GATE, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.DARK_OAK_LOG_PRESSURE_PLATE, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DARK_OAK_LOG_TRAPDOOR, (Blocks.DARK_OAK_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DARK_OAK_LOG_BUTTON, ModBlocks2.DARK_OAK_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.DARK_OAK_LOG_WALL, Blocks.DARK_OAK_LOG).offerTo(exporter);

                //str dark oak
                StairsRecipe(ModBlocks.STR_DARK_OAK_WOOD_STAIRS, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_SLAB, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_DOOR, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_DARK_OAK_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_DARK_OAK_WOOD_BUTTON, Blocks.STRIPPED_DARK_OAK_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_DARK_OAK_WOOD_WALL, Blocks.STRIPPED_DARK_OAK_WOOD).offerTo(exporter);

                //dark_oak
                StairsRecipe(ModBlocks2.STR_DARK_OAK_LOG_STAIRS, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_DARK_OAK_LOG_SLAB, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_DARK_OAK_LOG_DOOR, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_DARK_OAK_LOG_FENCE, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_DARK_OAK_LOG_FENCE_GATE, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_DARK_OAK_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR, (Blocks.STRIPPED_DARK_OAK_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_DARK_OAK_LOG_BUTTON, ModBlocks2.STR_DARK_OAK_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_DARK_OAK_LOG_WALL, Blocks.STRIPPED_DARK_OAK_LOG).offerTo(exporter);

                //mangrove
                StairsRecipe(ModBlocks.MANGROVE_WOOD_STAIRS, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_SLAB, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.MANGROVE_WOOD_DOOR, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.MANGROVE_WOOD_FENCE, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.MANGROVE_WOOD_FENCE_GATE, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MANGROVE_WOOD_TRAPDOOR, (Blocks.MANGROVE_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WOOD_BUTTON, Blocks.MANGROVE_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.MANGROVE_WOOD_WALL, Blocks.MANGROVE_WOOD).offerTo(exporter);

                //mangrove
                StairsRecipe(ModBlocks2.MANGROVE_LOG_STAIRS, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MANGROVE_LOG_SLAB, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.MANGROVE_LOG_DOOR, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.MANGROVE_LOG_FENCE, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.MANGROVE_LOG_FENCE_GATE, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.MANGROVE_LOG_PRESSURE_PLATE, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.MANGROVE_LOG_TRAPDOOR, (Blocks.MANGROVE_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MANGROVE_LOG_BUTTON, ModBlocks2.MANGROVE_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.MANGROVE_LOG_WALL, Blocks.MANGROVE_LOG).offerTo(exporter);

                //str mangrove
                StairsRecipe(ModBlocks.STR_MANGROVE_WOOD_STAIRS, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_SLAB, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_MANGROVE_WOOD_DOOR, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR, (Blocks.STRIPPED_MANGROVE_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_MANGROVE_WOOD_BUTTON, Blocks.STRIPPED_MANGROVE_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_MANGROVE_WOOD_WALL, Blocks.STRIPPED_MANGROVE_WOOD).offerTo(exporter);

                //mangrove
                StairsRecipe(ModBlocks2.STR_MANGROVE_LOG_STAIRS, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_MANGROVE_LOG_SLAB, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_MANGROVE_LOG_DOOR, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_MANGROVE_LOG_FENCE, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_MANGROVE_LOG_FENCE_GATE, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_MANGROVE_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_MANGROVE_LOG_TRAPDOOR, (Blocks.STRIPPED_MANGROVE_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_MANGROVE_LOG_BUTTON, ModBlocks2.STR_MANGROVE_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_MANGROVE_LOG_WALL, Blocks.STRIPPED_MANGROVE_LOG).offerTo(exporter);

                //cherry
                StairsRecipe(ModBlocks.CHERRY_WOOD_STAIRS, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_SLAB, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.CHERRY_WOOD_DOOR, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.CHERRY_WOOD_FENCE, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.CHERRY_WOOD_FENCE_GATE, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CHERRY_WOOD_TRAPDOOR, (Blocks.CHERRY_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WOOD_BUTTON, Blocks.CHERRY_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.CHERRY_WOOD_WALL, Blocks.CHERRY_WOOD).offerTo(exporter);

                //cherry
                StairsRecipe(ModBlocks2.CHERRY_LOG_STAIRS, (Blocks.CHERRY_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHERRY_LOG_SLAB, (Blocks.CHERRY_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.CHERRY_LOG_DOOR, (Blocks.CHERRY_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.CHERRY_LOG_FENCE, (Blocks.CHERRY_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.CHERRY_LOG_FENCE_GATE, (Blocks.CHERRY_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.CHERRY_LOG_PRESSURE_PLATE, (Blocks.CHERRY_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.CHERRY_LOG_TRAPDOOR, (Blocks.CHERRY_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHERRY_LOG_BUTTON, ModBlocks2.CHERRY_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.CHERRY_LOG_WALL, Blocks.CHERRY_LOG).offerTo(exporter);

                //str cherry
                StairsRecipe(ModBlocks.STR_CHERRY_WOOD_STAIRS, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_SLAB, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_CHERRY_WOOD_DOOR, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR, (Blocks.STRIPPED_CHERRY_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CHERRY_WOOD_BUTTON, Blocks.STRIPPED_CHERRY_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_CHERRY_WOOD_WALL, Blocks.STRIPPED_CHERRY_WOOD).offerTo(exporter);

                //cherry
                StairsRecipe(ModBlocks2.STR_CHERRY_LOG_STAIRS, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_CHERRY_LOG_SLAB, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_CHERRY_LOG_DOOR, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_CHERRY_LOG_FENCE, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_CHERRY_LOG_FENCE_GATE, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_CHERRY_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_CHERRY_LOG_TRAPDOOR, (Blocks.STRIPPED_CHERRY_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_CHERRY_LOG_BUTTON, ModBlocks2.STR_CHERRY_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_CHERRY_LOG_WALL, Blocks.STRIPPED_CHERRY_LOG).offerTo(exporter);

                //pale_oak
                StairsRecipe(ModBlocks.PALE_OAK_WOOD_STAIRS, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_OAK_WOOD_SLAB, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.PALE_OAK_WOOD_DOOR, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.PALE_OAK_WOOD_FENCE, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.PALE_OAK_WOOD_FENCE_GATE, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.PALE_OAK_WOOD_PRESSURE_PLATE, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PALE_OAK_WOOD_TRAPDOOR, (Blocks.PALE_OAK_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_OAK_WOOD_BUTTON, Blocks.PALE_OAK_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.PALE_OAK_WOOD_WALL, Blocks.PALE_OAK_WOOD).offerTo(exporter);

                //pale_oak
                StairsRecipe(ModBlocks2.PALE_OAK_LOG_STAIRS, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PALE_OAK_LOG_SLAB, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.PALE_OAK_LOG_DOOR, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.PALE_OAK_LOG_FENCE, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.PALE_OAK_LOG_FENCE_GATE, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.PALE_OAK_LOG_PRESSURE_PLATE, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.PALE_OAK_LOG_TRAPDOOR, (Blocks.PALE_OAK_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PALE_OAK_LOG_BUTTON, ModBlocks2.PALE_OAK_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.PALE_OAK_LOG_WALL, Blocks.PALE_OAK_LOG).offerTo(exporter);

                //str pale_oak
                StairsRecipe(ModBlocks.STR_PALE_OAK_WOOD_STAIRS, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_PALE_OAK_WOOD_SLAB, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_PALE_OAK_WOOD_DOOR, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_PALE_OAK_WOOD_FENCE, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_PALE_OAK_WOOD_FENCE_GATE, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_PALE_OAK_WOOD_PRESSURE_PLATE, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_PALE_OAK_WOOD_TRAPDOOR, (Blocks.STRIPPED_PALE_OAK_WOOD)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_PALE_OAK_WOOD_BUTTON, Blocks.STRIPPED_PALE_OAK_WOOD).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_PALE_OAK_WOOD_WALL, Blocks.STRIPPED_PALE_OAK_WOOD).offerTo(exporter);

                //pale_oak
                StairsRecipe(ModBlocks2.STR_PALE_OAK_LOG_STAIRS, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_PALE_OAK_LOG_SLAB, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_PALE_OAK_LOG_DOOR, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_PALE_OAK_LOG_FENCE, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_PALE_OAK_LOG_FENCE_GATE, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_PALE_OAK_LOG_PRESSURE_PLATE, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_PALE_OAK_LOG_TRAPDOOR, (Blocks.STRIPPED_PALE_OAK_LOG)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_PALE_OAK_LOG_BUTTON, ModBlocks2.STR_PALE_OAK_LOG_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_PALE_OAK_LOG_WALL, Blocks.STRIPPED_PALE_OAK_LOG).offerTo(exporter);

                //bamboo
                StairsRecipe(ModBlocks.BAMBOO_BLOCK_STAIRS, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_SLAB, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                DoorRecipe(ModBlocks.BAMBOO_BLOCK_DOOR, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                FenceRecipe(ModBlocks.BAMBOO_BLOCK_FENCE, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, (Blocks.BAMBOO_BLOCK)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BLOCK_BUTTON, Blocks.BAMBOO_BLOCK).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.BAMBOO_BLOCK_WALL, Blocks.BAMBOO_BLOCK).offerTo(exporter);

                //bamboo
                StairsRecipe(ModBlocks.STR_BAMBOO_BLOCK_STAIRS, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_SLAB, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_DOOR, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR, (Blocks.STRIPPED_BAMBOO_BLOCK)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, Blocks.STRIPPED_BAMBOO_BLOCK).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_BAMBOO_BLOCK_WALL, Blocks.STRIPPED_BAMBOO_BLOCK).offerTo(exporter);

                //crimson hyphae
                StairsRecipe(ModBlocks.CRIMSON_HYPHAE_STAIRS, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_SLAB, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                DoorRecipe(ModBlocks.CRIMSON_HYPHAE_DOOR, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                FenceRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, (Blocks.CRIMSON_HYPHAE)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_HYPHAE_BUTTON, Blocks.CRIMSON_HYPHAE).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.CRIMSON_HYPHAE_WALL, Blocks.CRIMSON_HYPHAE).offerTo(exporter);

                //crimson
                StairsRecipe(ModBlocks2.CRIMSON_STEM_STAIRS, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CRIMSON_STEM_SLAB, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                DoorRecipe(ModBlocks2.CRIMSON_STEM_DOOR, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                FenceRecipe(ModBlocks2.CRIMSON_STEM_FENCE, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.CRIMSON_STEM_FENCE_GATE, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.CRIMSON_STEM_PRESSURE_PLATE, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.CRIMSON_STEM_TRAPDOOR, (Blocks.CRIMSON_STEM)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CRIMSON_STEM_BUTTON, ModBlocks2.CRIMSON_STEM_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.CRIMSON_STEM_WALL, Blocks.CRIMSON_STEM).offerTo(exporter);

                //str crimson hyphae
                StairsRecipe(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_SLAB, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_DOOR, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR, (Blocks.STRIPPED_CRIMSON_HYPHAE)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON, Blocks.STRIPPED_CRIMSON_HYPHAE).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_CRIMSON_HYPHAE_WALL, Blocks.STRIPPED_CRIMSON_HYPHAE).offerTo(exporter);

                //crimson
                StairsRecipe(ModBlocks2.STR_CRIMSON_STEM_STAIRS, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_CRIMSON_STEM_SLAB, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_CRIMSON_STEM_DOOR, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_CRIMSON_STEM_FENCE, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_CRIMSON_STEM_FENCE_GATE, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_CRIMSON_STEM_PRESSURE_PLATE, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_CRIMSON_STEM_TRAPDOOR, (Blocks.STRIPPED_CRIMSON_STEM)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_CRIMSON_STEM_BUTTON, ModBlocks2.STR_CRIMSON_STEM_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_CRIMSON_STEM_WALL, Blocks.STRIPPED_CRIMSON_STEM).offerTo(exporter);

                //warped hyphae
                StairsRecipe(ModBlocks.WARPED_HYPHAE_STAIRS, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_SLAB, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                DoorRecipe(ModBlocks.WARPED_HYPHAE_DOOR, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                FenceRecipe(ModBlocks.WARPED_HYPHAE_FENCE, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.WARPED_HYPHAE_FENCE_GATE, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WARPED_HYPHAE_TRAPDOOR, (Blocks.WARPED_HYPHAE)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_HYPHAE_BUTTON, Blocks.WARPED_HYPHAE).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.WARPED_HYPHAE_WALL, Blocks.WARPED_HYPHAE).offerTo(exporter);

                //warped
                StairsRecipe(ModBlocks2.WARPED_STEM_STAIRS, (Blocks.WARPED_STEM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WARPED_STEM_SLAB, (Blocks.WARPED_STEM)).offerTo(exporter);
                DoorRecipe(ModBlocks2.WARPED_STEM_DOOR, (Blocks.WARPED_STEM)).offerTo(exporter);
                FenceRecipe(ModBlocks2.WARPED_STEM_FENCE, (Blocks.WARPED_STEM)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.WARPED_STEM_FENCE_GATE, (Blocks.WARPED_STEM)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.WARPED_STEM_PRESSURE_PLATE, (Blocks.WARPED_STEM)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WARPED_STEM_TRAPDOOR, (Blocks.WARPED_STEM)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WARPED_STEM_BUTTON, ModBlocks2.WARPED_STEM_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.WARPED_STEM_WALL, Blocks.WARPED_STEM).offerTo(exporter);

                //str warped hyphae
                StairsRecipe(ModBlocks.STR_WARPED_HYPHAE_STAIRS, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_SLAB, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                DoorRecipe(ModBlocks.STR_WARPED_HYPHAE_DOOR, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                FenceRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                FenceGateRecipe(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS,
                        ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR, (Blocks.STRIPPED_WARPED_HYPHAE)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STR_WARPED_HYPHAE_BUTTON, Blocks.STRIPPED_WARPED_HYPHAE).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks.STR_WARPED_HYPHAE_WALL, Blocks.STRIPPED_WARPED_HYPHAE).offerTo(exporter);

                //warped
                StairsRecipe(ModBlocks2.STR_WARPED_STEM_STAIRS, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_WARPED_STEM_SLAB, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                DoorRecipe(ModBlocks2.STR_WARPED_STEM_DOOR, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                FenceRecipe(ModBlocks2.STR_WARPED_STEM_FENCE, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                FenceGateRecipe(ModBlocks2.STR_WARPED_STEM_FENCE_GATE, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks2.STR_WARPED_STEM_PRESSURE_PLATE, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.STR_WARPED_STEM_TRAPDOOR, (Blocks.STRIPPED_WARPED_STEM)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.STR_WARPED_STEM_BUTTON, ModBlocks2.STR_WARPED_STEM_SLAB).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.MISC, ModBlocks2.STR_WARPED_STEM_WALL, Blocks.STRIPPED_WARPED_STEM).offerTo(exporter);

                //stone
                DoorRecipe(ModBlocks.STONE_DOOR, (Blocks.STONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.STONE_FENCE, (Blocks.STONE), (Blocks.STONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.STONE_FENCE_GATE, (Blocks.STONE), (Blocks.STONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STONE_TRAPDOOR, (Blocks.STONE_SLAB)).offerTo(exporter);
                WallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, (Blocks.STONE)).offerTo(exporter);

                //cobblestone
                DoorRecipe(ModBlocks.COBBLESTONE_DOOR, (Blocks.COBBLESTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.COBBLESTONE_FENCE, (Blocks.COBBLESTONE), (Blocks.COBBLESTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.COBBLESTONE_FENCE_GATE, (Blocks.COBBLESTONE), (Blocks.COBBLESTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.COBBLESTONE_TRAPDOOR, (Blocks.COBBLESTONE_SLAB)).offerTo(exporter);


                //mossy cobblestone
                DoorRecipe(ModBlocks.MOSSY_COBBLESTONE_DOOR, (Blocks.MOSSY_COBBLESTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE, (Blocks.MOSSY_COBBLESTONE), (Blocks.MOSSY_COBBLESTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE, (Blocks.MOSSY_COBBLESTONE), (Blocks.MOSSY_COBBLESTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR, (Blocks.MOSSY_COBBLESTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, (Blocks.MOSSY_COBBLESTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLESTONE_BUTTON, Blocks.MOSSY_COBBLESTONE, 1).offerTo(exporter);

                //smooth stone
                StairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, (Blocks.SMOOTH_STONE)).offerTo(exporter);
                DoorRecipe(ModBlocks.SMOOTH_STONE_DOOR, (Blocks.SMOOTH_STONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SMOOTH_STONE_FENCE, (Blocks.SMOOTH_STONE), (Blocks.SMOOTH_STONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SMOOTH_STONE_FENCE_GATE, (Blocks.SMOOTH_STONE), (Blocks.SMOOTH_STONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SMOOTH_STONE_TRAPDOOR, (Blocks.SMOOTH_STONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, (Blocks.SMOOTH_STONE)).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_WALL, (Blocks.SMOOTH_STONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_STONE_BUTTON, Blocks.SMOOTH_STONE, 1).offerTo(exporter);

                //stone bricks
                DoorRecipe(ModBlocks.STONE_BRICKS_DOOR, (Blocks.STONE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.STONE_BRICKS_FENCE, (Blocks.STONE_BRICKS), (Blocks.STONE_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.STONE_BRICKS_FENCE_GATE, (Blocks.STONE_BRICKS), (Blocks.STONE_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.STONE_BRICKS_TRAPDOOR, (Blocks.STONE_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_PRESSURE_PLATE, (Blocks.STONE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.STONE_BRICKS_BUTTON, Blocks.STONE_BRICKS, 1).offerTo(exporter);

                //cracked stone bricks
                DoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_DOOR, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_SLAB, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRACKED_STONE_BRICKS_STAIRS, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE, (Blocks.CRACKED_STONE_BRICKS), (ModBlocks.CRACKED_STONE_BRICKS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE, (Blocks.CRACKED_STONE_BRICKS), (ModBlocks.CRACKED_STONE_BRICKS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR, (ModBlocks.CRACKED_STONE_BRICKS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_BUTTON, Blocks.CRACKED_STONE_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_STONE_BRICKS_WALL, (Blocks.CRACKED_STONE_BRICKS)).offerTo(exporter);

                //granite
                DoorRecipe(ModBlocks.GRANITE_DOOR, (Blocks.GRANITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRANITE_FENCE, (Blocks.GRANITE), (Blocks.GRANITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRANITE_FENCE_GATE, (Blocks.GRANITE), (Blocks.GRANITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRANITE_TRAPDOOR, (Blocks.GRANITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_PRESSURE_PLATE, (Blocks.GRANITE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BUTTON, Blocks.GRANITE, 1).offerTo(exporter);

                //polished granite
                DoorRecipe(ModBlocks.POLISHED_GRANITE_DOOR, (Blocks.POLISHED_GRANITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_GRANITE_FENCE, (Blocks.POLISHED_GRANITE), (Blocks.POLISHED_GRANITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_GRANITE_FENCE_GATE, (Blocks.POLISHED_GRANITE), (Blocks.POLISHED_GRANITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_GRANITE_TRAPDOOR, (Blocks.POLISHED_GRANITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, (Blocks.POLISHED_GRANITE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_GRANITE_WALL, (Blocks.POLISHED_GRANITE)).offerTo(exporter);

                //diorite
                DoorRecipe(ModBlocks.DIORITE_DOOR, (Blocks.DIORITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DIORITE_FENCE, (Blocks.DIORITE), (Blocks.DIORITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DIORITE_FENCE_GATE, (Blocks.DIORITE), (Blocks.DIORITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DIORITE_TRAPDOOR, (Blocks.DIORITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_PRESSURE_PLATE, (Blocks.DIORITE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BUTTON, Blocks.DIORITE, 1).offerTo(exporter);

                //polished diorite
                DoorRecipe(ModBlocks.POLISHED_DIORITE_DOOR, (Blocks.POLISHED_DIORITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_DIORITE_FENCE, (Blocks.POLISHED_DIORITE), (Blocks.POLISHED_DIORITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_DIORITE_FENCE_GATE, (Blocks.POLISHED_DIORITE), (Blocks.POLISHED_DIORITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_DIORITE_TRAPDOOR, (Blocks.POLISHED_DIORITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, (Blocks.POLISHED_DIORITE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DIORITE_WALL, (Blocks.POLISHED_DIORITE)).offerTo(exporter);

                //andesite
                DoorRecipe(ModBlocks.ANDESITE_DOOR, (Blocks.ANDESITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ANDESITE_FENCE, (Blocks.ANDESITE), (Blocks.ANDESITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ANDESITE_FENCE_GATE, (Blocks.ANDESITE), (Blocks.ANDESITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ANDESITE_TRAPDOOR, (Blocks.ANDESITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_PRESSURE_PLATE, (Blocks.ANDESITE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE, 1).offerTo(exporter);

                //polished andesite
                DoorRecipe(ModBlocks.POLISHED_ANDESITE_DOOR, (Blocks.POLISHED_ANDESITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_ANDESITE_FENCE, (Blocks.POLISHED_ANDESITE), (Blocks.POLISHED_ANDESITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_ANDESITE_FENCE_GATE, (Blocks.POLISHED_ANDESITE), (Blocks.POLISHED_ANDESITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_ANDESITE_TRAPDOOR, (Blocks.POLISHED_ANDESITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, (Blocks.POLISHED_ANDESITE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_ANDESITE_WALL, (Blocks.POLISHED_ANDESITE)).offerTo(exporter);

                //deepslate
                DoorRecipe(ModBlocks.DEEPSLATE_DOOR, (Blocks.DEEPSLATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_SLAB, (Blocks.DEEPSLATE)).offerTo(exporter);
                StairsRecipe(ModBlocks.DEEPSLATE_STAIRS, (Blocks.DEEPSLATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DEEPSLATE_FENCE, (Blocks.DEEPSLATE), (ModBlocks.DEEPSLATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DEEPSLATE_FENCE_GATE, (Blocks.DEEPSLATE), (ModBlocks.DEEPSLATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DEEPSLATE_TRAPDOOR, (ModBlocks.DEEPSLATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_PRESSURE_PLATE, (Blocks.DEEPSLATE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_WALL, (Blocks.DEEPSLATE)).offerTo(exporter);

                //cobbled deepslate
                DoorRecipe(ModBlocks.COBBLED_DEEPSLATE_DOOR, (Blocks.COBBLED_DEEPSLATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE, (Blocks.COBBLED_DEEPSLATE), (Blocks.COBBLED_DEEPSLATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE, (Blocks.COBBLED_DEEPSLATE), (Blocks.COBBLED_DEEPSLATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR, (Blocks.COBBLED_DEEPSLATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, (Blocks.COBBLED_DEEPSLATE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE, 1).offerTo(exporter);

                //chiseled deepslate
                DoorRecipe(ModBlocks.CHISELED_DEEPSLATE_DOOR, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_SLAB, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
                StairsRecipe(ModBlocks.CHISELED_DEEPSLATE_STAIRS, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE, (Blocks.CHISELED_DEEPSLATE), (ModBlocks.CHISELED_DEEPSLATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE, (Blocks.CHISELED_DEEPSLATE), (ModBlocks.CHISELED_DEEPSLATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR, (ModBlocks.CHISELED_DEEPSLATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_BUTTON, Blocks.CHISELED_DEEPSLATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_DEEPSLATE_WALL, (Blocks.CHISELED_DEEPSLATE)).offerTo(exporter);

                //polished deepslate
                DoorRecipe(ModBlocks.POLISHED_DEEPSLATE_DOOR, (Blocks.POLISHED_DEEPSLATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE, (Blocks.POLISHED_DEEPSLATE), (Blocks.POLISHED_DEEPSLATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE, (Blocks.POLISHED_DEEPSLATE), (Blocks.POLISHED_DEEPSLATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR, (Blocks.POLISHED_DEEPSLATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, (Blocks.POLISHED_DEEPSLATE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE, 1).offerTo(exporter);

                //deepslate bricks
                DoorRecipe(ModBlocks.DEEPSLATE_BRICKS_DOOR, (Blocks.DEEPSLATE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE, (Blocks.DEEPSLATE_BRICKS), (Blocks.DEEPSLATE_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE, (Blocks.DEEPSLATE_BRICKS), (Blocks.DEEPSLATE_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR, (Blocks.DEEPSLATE_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE, (Blocks.DEEPSLATE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_BRICKS_BUTTON, Blocks.DEEPSLATE_BRICKS, 1).offerTo(exporter);

                //cracked deepslate bricks
                DoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE, (Blocks.CRACKED_DEEPSLATE_BRICKS), (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE, (Blocks.CRACKED_DEEPSLATE_BRICKS), (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR, (ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON, Blocks.CRACKED_DEEPSLATE_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL, (Blocks.CRACKED_DEEPSLATE_BRICKS)).offerTo(exporter);

                //deepslate bricks
                DoorRecipe(ModBlocks.DEEPSLATE_TILES_DOOR, (Blocks.DEEPSLATE_TILES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DEEPSLATE_TILES_FENCE, (Blocks.DEEPSLATE_TILES), (Blocks.DEEPSLATE_TILE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DEEPSLATE_TILES_FENCE_GATE, (Blocks.DEEPSLATE_TILES), (Blocks.DEEPSLATE_TILE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DEEPSLATE_TILES_TRAPDOOR, (Blocks.DEEPSLATE_TILE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE, (Blocks.DEEPSLATE_TILES)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_BUTTON, Blocks.DEEPSLATE_TILES, 1).offerTo(exporter);

                //cracked deepslate tiles
                DoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE, (Blocks.CRACKED_DEEPSLATE_TILES), (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE, (Blocks.CRACKED_DEEPSLATE_TILES), (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR, (ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON, Blocks.CRACKED_DEEPSLATE_TILES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_DEEPSLATE_TILES_WALL, (Blocks.CRACKED_DEEPSLATE_TILES)).offerTo(exporter);

                //bricks
                DoorRecipe(ModBlocks.BRICK_DOOR, (Blocks.BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BRICK_FENCE, (Blocks.BRICKS), (Blocks.BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BRICK_FENCE_GATE, (Blocks.BRICKS), (Blocks.BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BRICK_TRAPDOOR, (Blocks.BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_PRESSURE_PLATE, (Blocks.BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BRICK_BUTTON, Blocks.BRICKS, 1).offerTo(exporter);

                //packed mud
                DoorRecipe(ModBlocks.PACKED_MUD_DOOR, (Blocks.PACKED_MUD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_SLAB, (Blocks.PACKED_MUD)).offerTo(exporter);
                StairsRecipe(ModBlocks.PACKED_MUD_STAIRS, (Blocks.PACKED_MUD)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PACKED_MUD_FENCE, (Blocks.PACKED_MUD), (ModBlocks.PACKED_MUD_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PACKED_MUD_FENCE_GATE, (Blocks.PACKED_MUD), (ModBlocks.PACKED_MUD_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PACKED_MUD_TRAPDOOR, (ModBlocks.PACKED_MUD_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_PRESSURE_PLATE, (Blocks.PACKED_MUD)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_BUTTON, Blocks.PACKED_MUD, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_MUD_WALL, (Blocks.PACKED_MUD)).offerTo(exporter);

                //mud bricks
                DoorRecipe(ModBlocks.MUD_BRICK_DOOR, (Blocks.MUD_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MUD_BRICK_FENCE, (Blocks.MUD_BRICKS), (Blocks.MUD_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MUD_BRICK_FENCE_GATE, (Blocks.MUD_BRICKS), (Blocks.MUD_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MUD_BRICK_TRAPDOOR, (Blocks.MUD_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_PRESSURE_PLATE, (Blocks.MUD_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BRICK_BUTTON, Blocks.MUD_BRICKS, 1).offerTo(exporter);

                //resin bricks
                DoorRecipe(ModBlocks.RESIN_BRICK_DOOR, (Blocks.RESIN_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RESIN_BRICK_FENCE, (Blocks.RESIN_BRICKS), (Blocks.RESIN_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RESIN_BRICK_FENCE_GATE, (Blocks.RESIN_BRICKS), (Blocks.RESIN_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RESIN_BRICK_TRAPDOOR, (Blocks.RESIN_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RESIN_BRICK_PRESSURE_PLATE, (Blocks.RESIN_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RESIN_BRICK_BUTTON, Blocks.RESIN_BRICKS, 1).offerTo(exporter);

                //packed mud
                DoorRecipe(ModBlocks.CHISELED_RESIN_BRICK_DOOR, (Blocks.CHISELED_RESIN_BRICKS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_RESIN_BRICK_SLAB, (Blocks.CHISELED_RESIN_BRICKS)).offerTo(exporter);
                StairsRecipe(ModBlocks.CHISELED_RESIN_BRICK_STAIRS, (Blocks.CHISELED_RESIN_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CHISELED_RESIN_BRICK_FENCE, (Blocks.CHISELED_RESIN_BRICKS), (ModBlocks.CHISELED_RESIN_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CHISELED_RESIN_BRICK_FENCE_GATE, (Blocks.CHISELED_RESIN_BRICKS), (ModBlocks.CHISELED_RESIN_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CHISELED_RESIN_BRICK_TRAPDOOR, (ModBlocks.CHISELED_RESIN_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_RESIN_BRICK_PRESSURE_PLATE, (Blocks.CHISELED_RESIN_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_RESIN_BRICK_BUTTON, Blocks.CHISELED_RESIN_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHISELED_RESIN_BRICK_WALL, (Blocks.CHISELED_RESIN_BRICKS)).offerTo(exporter);

                //sandstone
                DoorRecipe(ModBlocks.SANDSTONE_DOOR, (Blocks.SANDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SANDSTONE_FENCE, (Blocks.SANDSTONE), (Blocks.SANDSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SANDSTONE_FENCE_GATE, (Blocks.SANDSTONE), (Blocks.SANDSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SANDSTONE_TRAPDOOR, (Blocks.SANDSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_PRESSURE_PLATE, (Blocks.SANDSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SANDSTONE_BUTTON, Blocks.SANDSTONE, 1).offerTo(exporter);

                //smooth sandstone
                DoorRecipe(ModBlocks.SMOOTH_SANDSTONE_DOOR, (Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE, (Blocks.SMOOTH_SANDSTONE), (Blocks.SMOOTH_SANDSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE, (Blocks.SMOOTH_SANDSTONE), (Blocks.SMOOTH_SANDSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR, (Blocks.SMOOTH_SANDSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE, (Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_BUTTON, Blocks.SMOOTH_SANDSTONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_SANDSTONE_WALL, (Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);

                //cut sandstone
                StairsRecipe(ModBlocks.CUT_SANDSTONE_STAIRS, (Blocks.CUT_SANDSTONE)).offerTo(exporter);
                DoorRecipe(ModBlocks.CUT_SANDSTONE_DOOR, (Blocks.CUT_SANDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CUT_SANDSTONE_FENCE, (Blocks.CUT_SANDSTONE), (Blocks.CUT_SANDSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CUT_SANDSTONE_FENCE_GATE, (Blocks.CUT_SANDSTONE), (Blocks.CUT_SANDSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CUT_SANDSTONE_TRAPDOOR, (Blocks.CUT_SANDSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE, (Blocks.CUT_SANDSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_BUTTON, Blocks.CUT_SANDSTONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_SANDSTONE_WALL, (Blocks.CUT_SANDSTONE)).offerTo(exporter);

                //red sandstone
                DoorRecipe(ModBlocks.RED_SANDSTONE_DOOR, (Blocks.RED_SANDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_SANDSTONE_FENCE, (Blocks.RED_SANDSTONE), (Blocks.RED_SANDSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_SANDSTONE_FENCE_GATE, (Blocks.RED_SANDSTONE), (Blocks.RED_SANDSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_SANDSTONE_TRAPDOOR, (Blocks.RED_SANDSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, (Blocks.RED_SANDSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SANDSTONE_BUTTON, Blocks.RED_SANDSTONE, 1).offerTo(exporter);

                //red smooth sandstone
                DoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR, (Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE, (Blocks.SMOOTH_RED_SANDSTONE), (Blocks.SMOOTH_RED_SANDSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE, (Blocks.SMOOTH_RED_SANDSTONE), (Blocks.SMOOTH_RED_SANDSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR, (Blocks.SMOOTH_RED_SANDSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE, (Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON, Blocks.SMOOTH_RED_SANDSTONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, (Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);

                //red cut sandstone
                StairsRecipe(ModBlocks.CUT_RED_SANDSTONE_STAIRS, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
                DoorRecipe(ModBlocks.CUT_RED_SANDSTONE_DOOR, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE, (Blocks.CUT_RED_SANDSTONE), (Blocks.CUT_RED_SANDSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE, (Blocks.CUT_RED_SANDSTONE), (Blocks.CUT_RED_SANDSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR, (Blocks.CUT_RED_SANDSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_BUTTON, Blocks.CUT_RED_SANDSTONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_RED_SANDSTONE_WALL, (Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);

                //sea lantern
                DoorRecipe(ModBlocks.SEA_LANTERN_DOOR, (Blocks.SEA_LANTERN)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_SLAB, (Blocks.SEA_LANTERN)).offerTo(exporter);
                StairsRecipe(ModBlocks.SEA_LANTERN_STAIRS, (Blocks.SEA_LANTERN)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SEA_LANTERN_FENCE, (Blocks.SEA_LANTERN), (ModBlocks.SEA_LANTERN_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SEA_LANTERN_FENCE_GATE, (Blocks.SEA_LANTERN), (ModBlocks.SEA_LANTERN_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SEA_LANTERN_TRAPDOOR, (ModBlocks.SEA_LANTERN_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_PRESSURE_PLATE, (Blocks.SEA_LANTERN)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_BUTTON, Blocks.SEA_LANTERN, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SEA_LANTERN_WALL, (Blocks.SEA_LANTERN)).offerTo(exporter);

                //prismarine
                DoorRecipe(ModBlocks.PRISMARINE_DOOR, (Blocks.PRISMARINE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PRISMARINE_FENCE, (Blocks.PRISMARINE), (Blocks.PRISMARINE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PRISMARINE_FENCE_GATE, (Blocks.PRISMARINE), (Blocks.PRISMARINE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PRISMARINE_TRAPDOOR, (Blocks.PRISMARINE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_PRESSURE_PLATE, (Blocks.PRISMARINE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BUTTON, Blocks.PRISMARINE, 1).offerTo(exporter);

                //prismarine bricks
                DoorRecipe(ModBlocks.PRISMARINE_BRICK_DOOR, (Blocks.PRISMARINE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PRISMARINE_BRICK_FENCE, (Blocks.PRISMARINE_BRICKS), (Blocks.PRISMARINE_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PRISMARINE_BRICK_FENCE_GATE, (Blocks.PRISMARINE_BRICKS), (Blocks.PRISMARINE_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PRISMARINE_BRICK_TRAPDOOR, (Blocks.PRISMARINE_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE, (Blocks.PRISMARINE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_BUTTON, Blocks.PRISMARINE_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PRISMARINE_BRICK_WALL, (Blocks.PRISMARINE_BRICKS)).offerTo(exporter);

                //prismarine
                DoorRecipe(ModBlocks.DARK_PRISMARINE_DOOR, (Blocks.DARK_PRISMARINE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DARK_PRISMARINE_FENCE, (Blocks.DARK_PRISMARINE), (Blocks.DARK_PRISMARINE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DARK_PRISMARINE_FENCE_GATE, (Blocks.DARK_PRISMARINE), (Blocks.DARK_PRISMARINE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DARK_PRISMARINE_TRAPDOOR, (Blocks.DARK_PRISMARINE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE, (Blocks.DARK_PRISMARINE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_BUTTON, Blocks.DARK_PRISMARINE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_PRISMARINE_WALL, (Blocks.DARK_PRISMARINE)).offerTo(exporter);

                //netherrack
                DoorRecipe(ModBlocks.NETHERRACK_DOOR, (Blocks.NETHERRACK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_SLAB, (Blocks.NETHERRACK)).offerTo(exporter);
                StairsRecipe(ModBlocks.NETHERRACK_STAIRS, (Blocks.NETHERRACK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.NETHERRACK_FENCE, (Blocks.NETHERRACK), (ModBlocks.NETHERRACK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.NETHERRACK_FENCE_GATE, (Blocks.NETHERRACK), (ModBlocks.NETHERRACK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.NETHERRACK_TRAPDOOR, (ModBlocks.NETHERRACK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_PRESSURE_PLATE, (Blocks.NETHERRACK)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_BUTTON, Blocks.NETHERRACK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERRACK_WALL, (Blocks.NETHERRACK)).offerTo(exporter);

                //nether bricks
                DoorRecipe(ModBlocks.NETHER_BRICK_DOOR, (Blocks.NETHER_BRICKS)).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.NETHER_BRICK_FENCE_GATE, (Blocks.NETHER_BRICKS), (Blocks.NETHER_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.NETHER_BRICK_TRAPDOOR, (Blocks.NETHER_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_PRESSURE_PLATE, (Blocks.NETHER_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHER_BRICK_BUTTON, Blocks.NETHER_BRICKS, 1).offerTo(exporter);

                //cracked nether bricks
                DoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_DOOR, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE, (Blocks.CRACKED_NETHER_BRICKS), (ModBlocks.CRACKED_NETHER_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, (Blocks.CRACKED_NETHER_BRICKS), (ModBlocks.CRACKED_NETHER_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR, (ModBlocks.CRACKED_NETHER_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_BUTTON, Blocks.CRACKED_NETHER_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_NETHER_BRICK_WALL, (Blocks.CRACKED_NETHER_BRICKS)).offerTo(exporter);

                //red nether bricks
                DoorRecipe(ModBlocks.RED_NETHER_BRICK_DOOR, (Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_NETHER_BRICK_FENCE, (Blocks.RED_NETHER_BRICKS), (Blocks.RED_NETHER_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_NETHER_BRICK_FENCE_GATE, (Blocks.RED_NETHER_BRICKS), (Blocks.RED_NETHER_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_NETHER_BRICK_TRAPDOOR, (Blocks.RED_NETHER_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE, (Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_NETHER_BRICK_BUTTON, Blocks.RED_NETHER_BRICKS, 1).offerTo(exporter);

                //basalt
                DoorRecipe(ModBlocks.BASALT_DOOR, (Blocks.BASALT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_SLAB, (Blocks.BASALT)).offerTo(exporter);
                StairsRecipe(ModBlocks.BASALT_STAIRS, (Blocks.BASALT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BASALT_FENCE, (Blocks.BASALT), (ModBlocks.BASALT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BASALT_FENCE_GATE, (Blocks.BASALT), (ModBlocks.BASALT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BASALT_TRAPDOOR, (ModBlocks.BASALT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_PRESSURE_PLATE, (Blocks.BASALT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_BUTTON, Blocks.BASALT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BASALT_WALL, (Blocks.BASALT)).offerTo(exporter);

                //smooth basalt
                DoorRecipe(ModBlocks.SMOOTH_BASALT_DOOR, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_SLAB, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
                StairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SMOOTH_BASALT_FENCE, (Blocks.SMOOTH_BASALT), (ModBlocks.SMOOTH_BASALT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SMOOTH_BASALT_FENCE_GATE, (Blocks.SMOOTH_BASALT), (ModBlocks.SMOOTH_BASALT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SMOOTH_BASALT_TRAPDOOR, (ModBlocks.SMOOTH_BASALT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE, (Blocks.SMOOTH_BASALT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_BUTTON, Blocks.SMOOTH_BASALT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_BASALT_WALL, (Blocks.SMOOTH_BASALT)).offerTo(exporter);

                //polished_basalt
                DoorRecipe(ModBlocks.POLISHED_BASALT_DOOR, (Blocks.POLISHED_BASALT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_SLAB, (Blocks.POLISHED_BASALT)).offerTo(exporter);
                StairsRecipe(ModBlocks.POLISHED_BASALT_STAIRS, (Blocks.POLISHED_BASALT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_BASALT_FENCE, (Blocks.POLISHED_BASALT), (ModBlocks.POLISHED_BASALT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_BASALT_FENCE_GATE, (Blocks.POLISHED_BASALT), (ModBlocks.POLISHED_BASALT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_BASALT_TRAPDOOR, (ModBlocks.POLISHED_BASALT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_PRESSURE_PLATE, (Blocks.POLISHED_BASALT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_BUTTON, Blocks.POLISHED_BASALT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BASALT_WALL, (Blocks.POLISHED_BASALT)).offerTo(exporter);

                //blackstone
                DoorRecipe(ModBlocks.BLACKSTONE_DOOR, (Blocks.BLACKSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACKSTONE_FENCE, (Blocks.BLACKSTONE), (Blocks.BLACKSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACKSTONE_FENCE_GATE, (Blocks.BLACKSTONE), (Blocks.BLACKSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACKSTONE_TRAPDOOR, (Blocks.BLACKSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_PRESSURE_PLATE, (Blocks.BLACKSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE, 1).offerTo(exporter);

                //gilded_blackstone
                DoorRecipe(ModBlocks.GILDED_BLACKSTONE_DOOR, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_SLAB, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
                StairsRecipe(ModBlocks.GILDED_BLACKSTONE_STAIRS, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GILDED_BLACKSTONE_FENCE, (Blocks.GILDED_BLACKSTONE), (ModBlocks.GILDED_BLACKSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE, (Blocks.GILDED_BLACKSTONE), (ModBlocks.GILDED_BLACKSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR, (ModBlocks.GILDED_BLACKSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_BUTTON, Blocks.GILDED_BLACKSTONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GILDED_BLACKSTONE_WALL, (Blocks.GILDED_BLACKSTONE)).offerTo(exporter);

                //polished blackstone
                DoorRecipe(ModBlocks.POLISHED_BLACKSTONE_DOOR, (Blocks.POLISHED_BLACKSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_BLACKSTONE_FENCE, (Blocks.POLISHED_BLACKSTONE), (Blocks.POLISHED_BLACKSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE, (Blocks.POLISHED_BLACKSTONE), (Blocks.POLISHED_BLACKSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR, (Blocks.POLISHED_BLACKSTONE_SLAB)).offerTo(exporter);

                //polished blackstone brick
                DoorRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR, (Blocks.POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE, (Blocks.POLISHED_BLACKSTONE_BRICKS), (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE, (Blocks.POLISHED_BLACKSTONE_BRICKS), (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR, (Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE, (Blocks.POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON, Blocks.POLISHED_BLACKSTONE_BRICKS, 1).offerTo(exporter);

                //cracked_polished_blackstone_bricks
                DoorRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR, (ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, (Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);

                //end_stone
                DoorRecipe(ModBlocks.END_STONE_DOOR, (Blocks.END_STONE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_SLAB, (Blocks.END_STONE)).offerTo(exporter);
                StairsRecipe(ModBlocks.END_STONE_STAIRS, (Blocks.END_STONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.END_STONE_FENCE, (Blocks.END_STONE), (ModBlocks.END_STONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.END_STONE_FENCE_GATE, (Blocks.END_STONE), (ModBlocks.END_STONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.END_STONE_TRAPDOOR, (ModBlocks.END_STONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_PRESSURE_PLATE, (Blocks.END_STONE)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BUTTON, Blocks.END_STONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_WALL, (Blocks.END_STONE)).offerTo(exporter);

                //end_stone brick
                DoorRecipe(ModBlocks.END_STONE_BRICK_DOOR, (Blocks.END_STONE_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.END_STONE_BRICK_FENCE, (Blocks.END_STONE_BRICKS), (Blocks.END_STONE_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.END_STONE_BRICK_FENCE_GATE, (Blocks.END_STONE_BRICKS), (Blocks.END_STONE_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.END_STONE_BRICK_TRAPDOOR, (Blocks.END_STONE_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BRICK_PRESSURE_PLATE, (Blocks.END_STONE_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_BRICK_BUTTON, Blocks.END_STONE_BRICKS, 1).offerTo(exporter);

                //purpur
                DoorRecipe(ModBlocks.PURPUR_DOOR, (Blocks.PURPUR_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPUR_FENCE, (Blocks.PURPUR_BLOCK), (Blocks.PURPUR_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPUR_FENCE_GATE, (Blocks.PURPUR_BLOCK), (Blocks.PURPUR_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPUR_TRAPDOOR, (Blocks.PURPUR_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_PRESSURE_PLATE, (Blocks.PURPUR_BLOCK)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_BUTTON, Blocks.PURPUR_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_WALL, (Blocks.PURPUR_BLOCK)).offerTo(exporter);

                //coal_block
                DoorRecipe(ModBlocks.COAL_DOOR, (ModItems.COAL_BIT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_SLAB, (Items.COAL)).offerTo(exporter);
                StairsRecipe(ModBlocks.COAL_STAIRS, (Items.COAL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.COAL_FENCE, (ModItems.COAL_BIT), (Items.COAL), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.COAL_FENCE_GATE, (ModItems.COAL_BIT), (Items.COAL), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.COAL_TRAPDOOR, (ModItems.COAL_BIT)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_PRESSURE_PLATE, (ModItems.COAL_BIT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_BUTTON, ModItems.COAL_BIT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COAL_WALL, (Items.COAL)).offerTo(exporter);

                //iron_block
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_SLAB, (Items.IRON_INGOT)).offerTo(exporter);
                StairsRecipe(ModBlocks.IRON_STAIRS, (Items.IRON_INGOT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.IRON_FENCE, (ModItems.IRON_BIT), (Items.IRON_INGOT), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.IRON_FENCE_GATE, (ModItems.IRON_BIT), (Items.IRON_INGOT), 1).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_BUTTON, ModItems.IRON_BIT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.IRON_WALL, (Items.IRON_INGOT)).offerTo(exporter);

                //gold_block
                DoorRecipe(ModBlocks.GOLD_DOOR, (ModItems.GOLD_BIT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_SLAB, (Items.GOLD_INGOT)).offerTo(exporter);
                StairsRecipe(ModBlocks.GOLD_STAIRS, (Items.GOLD_INGOT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GOLD_FENCE, (ModItems.GOLD_BIT), (Items.GOLD_INGOT), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GOLD_FENCE_GATE, (ModItems.GOLD_BIT), (Items.GOLD_INGOT), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GOLD_TRAPDOOR, (ModItems.GOLD_BIT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BUTTON, ModItems.GOLD_BIT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GOLD_WALL, (Items.GOLD_INGOT)).offerTo(exporter);



                //redstone_block
                DoorRecipe(ModBlocks.REDSTONE_DOOR, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_SLAB, (Items.REDSTONE)).offerTo(exporter);
                StairsRecipe(ModBlocks.REDSTONE_STAIRS, (Items.REDSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.REDSTONE_FENCE, (ModItems.REDSTONE_SHARD), (Items.REDSTONE), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.REDSTONE_FENCE_GATE, (ModItems.REDSTONE_SHARD), (Items.REDSTONE), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.REDSTONE_TRAPDOOR, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_PRESSURE_PLATE, (ModItems.REDSTONE_SHARD)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_BUTTON, ModItems.REDSTONE_SHARD, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.REDSTONE_WALL, (Items.REDSTONE)).offerTo(exporter);

                //emerald_block
                DoorRecipe(ModBlocks.EMERALD_DOOR, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_SLAB, (Items.EMERALD)).offerTo(exporter);
                StairsRecipe(ModBlocks.EMERALD_STAIRS, (Items.EMERALD)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.EMERALD_FENCE, (ModItems.EMERALD_FRAGMENT), (Items.EMERALD), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.EMERALD_FENCE_GATE, (ModItems.EMERALD_FRAGMENT), (Items.EMERALD), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.EMERALD_TRAPDOOR, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_PRESSURE_PLATE, (ModItems.EMERALD_FRAGMENT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_BUTTON, ModItems.EMERALD_FRAGMENT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EMERALD_WALL, (Items.EMERALD)).offerTo(exporter);

                //lapis_block
                DoorRecipe(ModBlocks.LAPIS_DOOR, (ModItems.LAPIS_BIT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_SLAB, (Items.LAPIS_LAZULI)).offerTo(exporter);
                StairsRecipe(ModBlocks.LAPIS_STAIRS, (Items.LAPIS_LAZULI)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LAPIS_FENCE, (ModItems.LAPIS_BIT), (Items.LAPIS_LAZULI), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LAPIS_FENCE_GATE, (ModItems.LAPIS_BIT), (Items.LAPIS_LAZULI), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LAPIS_TRAPDOOR, (ModItems.LAPIS_BIT)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_PRESSURE_PLATE, (ModItems.LAPIS_BIT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_BUTTON, ModItems.LAPIS_BIT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LAPIS_WALL, (Items.LAPIS_LAZULI)).offerTo(exporter);

                //diamond_block
                DoorRecipe(ModBlocks.DIAMOND_DOOR, (ModItems.DIAMOND_DUST)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_SLAB, (Items.DIAMOND)).offerTo(exporter);
                StairsRecipe(ModBlocks.DIAMOND_STAIRS, (Items.DIAMOND)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DIAMOND_FENCE, (ModItems.DIAMOND_DUST), (Items.DIAMOND), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DIAMOND_FENCE_GATE, (ModItems.DIAMOND_DUST), (Items.DIAMOND), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DIAMOND_TRAPDOOR, (ModItems.DIAMOND_DUST)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_PRESSURE_PLATE, (ModItems.DIAMOND_DUST)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_BUTTON, ModItems.DIAMOND_DUST, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIAMOND_WALL, (Items.DIAMOND)).offerTo(exporter);

                //netherite_block
                DoorRecipe(ModBlocks.NETHERITE_DOOR, (ModItems.NETHERITE_BIT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_SLAB, (Items.NETHERITE_INGOT)).offerTo(exporter);
                StairsRecipe(ModBlocks.NETHERITE_STAIRS, (Items.NETHERITE_INGOT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.NETHERITE_FENCE, (ModItems.NETHERITE_BIT), (Items.NETHERITE_INGOT), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.NETHERITE_FENCE_GATE, (ModItems.NETHERITE_BIT), (Items.NETHERITE_INGOT), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.NETHERITE_TRAPDOOR, (ModItems.NETHERITE_BIT)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_PRESSURE_PLATE, (ModItems.NETHERITE_BIT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_BUTTON, ModItems.NETHERITE_BIT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.NETHERITE_WALL, (Items.NETHERITE_INGOT)).offerTo(exporter);

                //quartz
                DoorRecipe(ModBlocks.QUARTZ_DOOR, (Blocks.QUARTZ_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.QUARTZ_FENCE, (Blocks.QUARTZ_BLOCK), (Blocks.QUARTZ_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.QUARTZ_FENCE_GATE, (Blocks.QUARTZ_BLOCK), (Blocks.QUARTZ_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.QUARTZ_TRAPDOOR, (Blocks.QUARTZ_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_PRESSURE_PLATE, (Blocks.QUARTZ_BLOCK)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BUTTON, Blocks.QUARTZ_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_WALL, (Blocks.QUARTZ_BLOCK)).offerTo(exporter);

                //quartz brick
                DoorRecipe(ModBlocks.QUARTZ_BRICK_DOOR, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_SLAB, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
                StairsRecipe(ModBlocks.QUARTZ_BRICK_STAIRS, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.QUARTZ_BRICK_FENCE, (Blocks.QUARTZ_BRICKS), (ModBlocks.QUARTZ_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.QUARTZ_BRICK_FENCE_GATE, (Blocks.QUARTZ_BRICKS), (ModBlocks.QUARTZ_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.QUARTZ_BRICK_TRAPDOOR, (ModBlocks.QUARTZ_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_BUTTON, Blocks.QUARTZ_BRICKS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.QUARTZ_BRICK_WALL, (Blocks.QUARTZ_BRICKS)).offerTo(exporter);

                //smooth_quartz
                DoorRecipe(ModBlocks.SMOOTH_QUARTZ_DOOR, (Blocks.SMOOTH_QUARTZ)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SMOOTH_QUARTZ_FENCE, (Blocks.SMOOTH_QUARTZ), (Blocks.SMOOTH_QUARTZ_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SMOOTH_QUARTZ_FENCE_GATE, (Blocks.SMOOTH_QUARTZ), (Blocks.SMOOTH_QUARTZ_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR, (Blocks.SMOOTH_QUARTZ_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE, (Blocks.SMOOTH_QUARTZ)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_BUTTON, Blocks.SMOOTH_QUARTZ, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SMOOTH_QUARTZ_WALL, (Blocks.SMOOTH_QUARTZ)).offerTo(exporter);

                //amethyst
                DoorRecipe(ModBlocks.AMETHYST_DOOR, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_SLAB, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.AMETHYST_STAIRS, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.AMETHYST_FENCE, (Blocks.AMETHYST_BLOCK), (ModBlocks.AMETHYST_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.AMETHYST_FENCE_GATE, (Blocks.AMETHYST_BLOCK), (ModBlocks.AMETHYST_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.AMETHYST_TRAPDOOR, (ModBlocks.AMETHYST_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_PRESSURE_PLATE, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_BUTTON, Blocks.AMETHYST_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.AMETHYST_WALL, (Blocks.AMETHYST_BLOCK)).offerTo(exporter);

                //copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_SLAB, (ModItems.COPPER_BIT)).offerTo(exporter);
                StairsRecipe(ModBlocks.COPPER_STAIRS, (ModItems.COPPER_BIT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.COPPER_FENCE, (Items.COPPER_INGOT), (ModItems.COPPER_BIT), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.COPPER_FENCE_GATE, (Items.COPPER_INGOT), (ModItems.COPPER_BIT), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_PRESSURE_PLATE, (ModItems.COPPER_BIT)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_BUTTON, ModItems.COPPER_BIT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COPPER_WALL, (ModItems.COPPER_BIT)).offerTo(exporter);


                //exposed_copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_SLAB, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks.EXPOSED_COPPER_STAIRS, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.EXPOSED_COPPER_FENCE, (Blocks.EXPOSED_COPPER), (ModBlocks.EXPOSED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.EXPOSED_COPPER_FENCE_GATE, (Blocks.EXPOSED_COPPER), (ModBlocks.EXPOSED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, (Blocks.EXPOSED_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_WALL, (Blocks.EXPOSED_COPPER)).offerTo(exporter);

                //weathered_copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_SLAB, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks.WEATHERED_COPPER_STAIRS, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WEATHERED_COPPER_FENCE, (Blocks.WEATHERED_COPPER), (ModBlocks.WEATHERED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WEATHERED_COPPER_FENCE_GATE, (Blocks.WEATHERED_COPPER), (ModBlocks.WEATHERED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, (Blocks.WEATHERED_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_WALL, (Blocks.WEATHERED_COPPER)).offerTo(exporter);

                //oxidized_copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_SLAB, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks.OXIDIZED_COPPER_STAIRS, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.OXIDIZED_COPPER_FENCE, (Blocks.OXIDIZED_COPPER), (ModBlocks.OXIDIZED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, (Blocks.OXIDIZED_COPPER), (ModBlocks.OXIDIZED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_WALL, (Blocks.OXIDIZED_COPPER)).offerTo(exporter);

                //cut copper
                DoorRecipe(ModBlocks.CUT_COPPER_DOOR, (Blocks.CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CUT_COPPER_FENCE, (Blocks.CUT_COPPER), (Blocks.CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CUT_COPPER_FENCE_GATE, (Blocks.CUT_COPPER), (Blocks.CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CUT_COPPER_TRAPDOOR, (Blocks.CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_PRESSURE_PLATE, (Blocks.CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_BUTTON, Blocks.CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CUT_COPPER_WALL, (Blocks.CUT_COPPER)).offerTo(exporter);


                //cut exposed_copper
                DoorRecipe(ModBlocks.EXPOSED_CUT_COPPER_DOOR, (Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE, (Blocks.EXPOSED_CUT_COPPER), (Blocks.EXPOSED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, (Blocks.EXPOSED_CUT_COPPER), (Blocks.EXPOSED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, (Blocks.EXPOSED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, (Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_BUTTON, Blocks.EXPOSED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CUT_COPPER_WALL, (Blocks.EXPOSED_CUT_COPPER)).offerTo(exporter);

                //cut weathered_copper
                DoorRecipe(ModBlocks.WEATHERED_CUT_COPPER_DOOR, (Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE, (Blocks.WEATHERED_CUT_COPPER), (Blocks.WEATHERED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, (Blocks.WEATHERED_CUT_COPPER), (Blocks.WEATHERED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, (Blocks.WEATHERED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_BUTTON, Blocks.WEATHERED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CUT_COPPER_WALL, (Blocks.WEATHERED_CUT_COPPER)).offerTo(exporter);

                //cut oxidized_copper
                DoorRecipe(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, (Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, (Blocks.OXIDIZED_CUT_COPPER), (Blocks.OXIDIZED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, (Blocks.OXIDIZED_CUT_COPPER), (Blocks.OXIDIZED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR, (Blocks.OXIDIZED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE, (Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_BUTTON, Blocks.OXIDIZED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CUT_COPPER_WALL, (Blocks.OXIDIZED_CUT_COPPER)).offerTo(exporter);


                //waxed copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_SLAB, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.WAXED_COPPER_STAIRS, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_COPPER_FENCE, (Blocks.WAXED_COPPER_BLOCK), (ModBlocks.WAXED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_COPPER_FENCE_GATE, (Blocks.WAXED_COPPER_BLOCK), (ModBlocks.WAXED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_BUTTON, Blocks.WAXED_COPPER_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_COPPER_WALL, (Blocks.WAXED_COPPER_BLOCK)).offerTo(exporter);

                //waxed exposed_copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_SLAB, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_EXPOSED_COPPER_FENCE, (Blocks.WAXED_EXPOSED_COPPER), (ModBlocks.WAXED_EXPOSED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_COPPER), (ModBlocks.WAXED_EXPOSED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON, Blocks.WAXED_EXPOSED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_COPPER_WALL, (Blocks.WAXED_EXPOSED_COPPER)).offerTo(exporter);

                //waxed weathered_copper
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_SLAB, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_WEATHERED_COPPER_FENCE, (Blocks.WAXED_WEATHERED_COPPER), (ModBlocks.WAXED_WEATHERED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_COPPER), (ModBlocks.WAXED_WEATHERED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON, Blocks.WAXED_WEATHERED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_COPPER_WALL, (Blocks.WAXED_WEATHERED_COPPER)).offerTo(exporter);

                //waxed oxidized_copper;
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_COPPER), (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_COPPER), (ModBlocks.WAXED_OXIDIZED_COPPER_SLAB), 1).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_COPPER_WALL, (Blocks.WAXED_OXIDIZED_COPPER)).offerTo(exporter);

                //waxed cut copper
                DoorRecipe(ModBlocks.WAXED_CUT_COPPER_DOOR, (Blocks.WAXED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_CUT_COPPER_FENCE, (Blocks.WAXED_CUT_COPPER), (Blocks.WAXED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_CUT_COPPER), (Blocks.WAXED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WAXED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_BUTTON, Blocks.WAXED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_CUT_COPPER_WALL, (Blocks.WAXED_CUT_COPPER)).offerTo(exporter);

                //waxed cut exposed_copper
                DoorRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR, (Blocks.WAXED_EXPOSED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE, (Blocks.WAXED_EXPOSED_CUT_COPPER), (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_CUT_COPPER), (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_EXPOSED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON, Blocks.WAXED_EXPOSED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL, (Blocks.WAXED_EXPOSED_CUT_COPPER)).offerTo(exporter);

                //waxed cut weathered_copper
                DoorRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR, (Blocks.WAXED_WEATHERED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE, (Blocks.WAXED_WEATHERED_CUT_COPPER), (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_CUT_COPPER), (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_WEATHERED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON, Blocks.WAXED_WEATHERED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL, (Blocks.WAXED_WEATHERED_CUT_COPPER)).offerTo(exporter);

                //waxed cut oxidized_copper
                DoorRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR, (Blocks.WAXED_OXIDIZED_CUT_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_CUT_COPPER), (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_CUT_COPPER), (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR, (Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE, (Blocks.WAXED_OXIDIZED_CUT_COPPER)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_CUT_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL, (Blocks.WAXED_OXIDIZED_CUT_COPPER)).offerTo(exporter);

                //white_wool
                DoorRecipe(ModBlocks.WHITE_WOOL_DOOR, (Blocks.WHITE_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_SLAB, (Blocks.WHITE_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.WHITE_WOOL_STAIRS, (Blocks.WHITE_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WHITE_WOOL_FENCE, (Blocks.WHITE_WOOL), (ModBlocks.WHITE_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WHITE_WOOL_FENCE_GATE, (Blocks.WHITE_WOOL), (ModBlocks.WHITE_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WHITE_WOOL_TRAPDOOR, (ModBlocks.WHITE_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_PRESSURE_PLATE, (ModBlocks.WHITE_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_BUTTON, Blocks.WHITE_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_WOOL_WALL, (Blocks.WHITE_WOOL)).offerTo(exporter);

                //light_gray_wool
                DoorRecipe(ModBlocks.LIGHT_GRAY_WOOL_DOOR, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE, (Blocks.LIGHT_GRAY_WOOL), (ModBlocks.LIGHT_GRAY_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE, (Blocks.LIGHT_GRAY_WOOL), (ModBlocks.LIGHT_GRAY_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR, (ModBlocks.LIGHT_GRAY_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_BUTTON, Blocks.LIGHT_GRAY_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_WOOL_WALL, (Blocks.LIGHT_GRAY_WOOL)).offerTo(exporter);

                //gray_wool
                DoorRecipe(ModBlocks.GRAY_WOOL_DOOR, (Blocks.GRAY_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_SLAB, (Blocks.GRAY_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAY_WOOL_STAIRS, (Blocks.GRAY_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAY_WOOL_FENCE, (Blocks.GRAY_WOOL), (ModBlocks.GRAY_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAY_WOOL_FENCE_GATE, (Blocks.GRAY_WOOL), (ModBlocks.GRAY_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAY_WOOL_TRAPDOOR, (ModBlocks.GRAY_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_PRESSURE_PLATE, (ModBlocks.GRAY_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_BUTTON, Blocks.GRAY_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_WOOL_WALL, (Blocks.GRAY_WOOL)).offerTo(exporter);

                //black_wool
                DoorRecipe(ModBlocks.BLACK_WOOL_DOOR, (Blocks.BLACK_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_SLAB, (Blocks.BLACK_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLACK_WOOL_STAIRS, (Blocks.BLACK_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACK_WOOL_FENCE, (Blocks.BLACK_WOOL), (ModBlocks.BLACK_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACK_WOOL_FENCE_GATE, (Blocks.BLACK_WOOL), (ModBlocks.BLACK_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACK_WOOL_TRAPDOOR, (ModBlocks.BLACK_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_PRESSURE_PLATE, (ModBlocks.BLACK_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_BUTTON, Blocks.BLACK_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_WOOL_WALL, (Blocks.BLACK_WOOL)).offerTo(exporter);

                //brown_wool
                DoorRecipe(ModBlocks.BROWN_WOOL_DOOR, (Blocks.BROWN_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_SLAB, (Blocks.BROWN_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.BROWN_WOOL_STAIRS, (Blocks.BROWN_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BROWN_WOOL_FENCE, (Blocks.BROWN_WOOL), (ModBlocks.BROWN_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BROWN_WOOL_FENCE_GATE, (Blocks.BROWN_WOOL), (ModBlocks.BROWN_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BROWN_WOOL_TRAPDOOR, (ModBlocks.BROWN_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_PRESSURE_PLATE, (ModBlocks.BROWN_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_BUTTON, Blocks.BROWN_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_WOOL_WALL, (Blocks.BROWN_WOOL)).offerTo(exporter);

                //red_wool
                DoorRecipe(ModBlocks.RED_WOOL_DOOR, (Blocks.RED_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_SLAB, (Blocks.RED_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_WOOL_STAIRS, (Blocks.RED_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_WOOL_FENCE, (Blocks.RED_WOOL), (ModBlocks.RED_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_WOOL_FENCE_GATE, (Blocks.RED_WOOL), (ModBlocks.RED_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_WOOL_TRAPDOOR, (ModBlocks.RED_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_PRESSURE_PLATE, (ModBlocks.RED_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_BUTTON, Blocks.RED_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_WOOL_WALL, (Blocks.RED_WOOL)).offerTo(exporter);

                //orange_wool
                DoorRecipe(ModBlocks.ORANGE_WOOL_DOOR, (Blocks.ORANGE_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_SLAB, (Blocks.ORANGE_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.ORANGE_WOOL_STAIRS, (Blocks.ORANGE_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ORANGE_WOOL_FENCE, (Blocks.ORANGE_WOOL), (ModBlocks.ORANGE_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ORANGE_WOOL_FENCE_GATE, (Blocks.ORANGE_WOOL), (ModBlocks.ORANGE_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ORANGE_WOOL_TRAPDOOR, (ModBlocks.ORANGE_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_PRESSURE_PLATE, (ModBlocks.ORANGE_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_BUTTON, Blocks.ORANGE_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_WOOL_WALL, (Blocks.ORANGE_WOOL)).offerTo(exporter);

                //yellow_wool
                DoorRecipe(ModBlocks.YELLOW_WOOL_DOOR, (Blocks.YELLOW_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_SLAB, (Blocks.YELLOW_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.YELLOW_WOOL_STAIRS, (Blocks.YELLOW_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.YELLOW_WOOL_FENCE, (Blocks.YELLOW_WOOL), (ModBlocks.YELLOW_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.YELLOW_WOOL_FENCE_GATE, (Blocks.YELLOW_WOOL), (ModBlocks.YELLOW_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.YELLOW_WOOL_TRAPDOOR, (ModBlocks.YELLOW_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_PRESSURE_PLATE, (ModBlocks.YELLOW_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_BUTTON, Blocks.YELLOW_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_WOOL_WALL, (Blocks.YELLOW_WOOL)).offerTo(exporter);

                //lime_wool
                DoorRecipe(ModBlocks.LIME_WOOL_DOOR, (Blocks.LIME_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_SLAB, (Blocks.LIME_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIME_WOOL_STAIRS, (Blocks.LIME_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIME_WOOL_FENCE, (Blocks.LIME_WOOL), (ModBlocks.LIME_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIME_WOOL_FENCE_GATE, (Blocks.LIME_WOOL), (ModBlocks.LIME_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIME_WOOL_TRAPDOOR, (ModBlocks.LIME_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_PRESSURE_PLATE, (ModBlocks.LIME_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_BUTTON, Blocks.LIME_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_WOOL_WALL, (Blocks.LIME_WOOL)).offerTo(exporter);

                //green_wool
                DoorRecipe(ModBlocks.GREEN_WOOL_DOOR, (Blocks.GREEN_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_SLAB, (Blocks.GREEN_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.GREEN_WOOL_STAIRS, (Blocks.GREEN_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GREEN_WOOL_FENCE, (Blocks.GREEN_WOOL), (ModBlocks.GREEN_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GREEN_WOOL_FENCE_GATE, (Blocks.GREEN_WOOL), (ModBlocks.GREEN_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GREEN_WOOL_TRAPDOOR, (ModBlocks.GREEN_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_PRESSURE_PLATE, (ModBlocks.GREEN_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_BUTTON, Blocks.GREEN_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_WOOL_WALL, (Blocks.GREEN_WOOL)).offerTo(exporter);

                //cyan_wool
                DoorRecipe(ModBlocks.CYAN_WOOL_DOOR, (Blocks.CYAN_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_SLAB, (Blocks.CYAN_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.CYAN_WOOL_STAIRS, (Blocks.CYAN_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CYAN_WOOL_FENCE, (Blocks.CYAN_WOOL), (ModBlocks.CYAN_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CYAN_WOOL_FENCE_GATE, (Blocks.CYAN_WOOL), (ModBlocks.CYAN_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CYAN_WOOL_TRAPDOOR, (ModBlocks.CYAN_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_PRESSURE_PLATE, (ModBlocks.CYAN_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_BUTTON, Blocks.CYAN_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_WOOL_WALL, (Blocks.CYAN_WOOL)).offerTo(exporter);

                //blue_wool
                DoorRecipe(ModBlocks.BLUE_WOOL_DOOR, (Blocks.BLUE_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_SLAB, (Blocks.BLUE_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_WOOL_STAIRS, (Blocks.BLUE_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_WOOL_FENCE, (Blocks.BLUE_WOOL), (ModBlocks.BLUE_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_WOOL_FENCE_GATE, (Blocks.BLUE_WOOL), (ModBlocks.BLUE_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_WOOL_TRAPDOOR, (ModBlocks.BLUE_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_PRESSURE_PLATE, (ModBlocks.BLUE_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_BUTTON, Blocks.BLUE_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_WOOL_WALL, (Blocks.BLUE_WOOL)).offerTo(exporter);

                //light_blue_wool
                DoorRecipe(ModBlocks.LIGHT_BLUE_WOOL_DOOR, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE, (Blocks.LIGHT_BLUE_WOOL), (ModBlocks.LIGHT_BLUE_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE, (Blocks.LIGHT_BLUE_WOOL), (ModBlocks.LIGHT_BLUE_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR, (ModBlocks.LIGHT_BLUE_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_BUTTON, Blocks.LIGHT_BLUE_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_WOOL_WALL, (Blocks.LIGHT_BLUE_WOOL)).offerTo(exporter);

                //purple_wool
                DoorRecipe(ModBlocks.PURPLE_WOOL_DOOR, (Blocks.PURPLE_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_SLAB, (Blocks.PURPLE_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.PURPLE_WOOL_STAIRS, (Blocks.PURPLE_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPLE_WOOL_FENCE, (Blocks.PURPLE_WOOL), (ModBlocks.PURPLE_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPLE_WOOL_FENCE_GATE, (Blocks.PURPLE_WOOL), (ModBlocks.PURPLE_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPLE_WOOL_TRAPDOOR, (ModBlocks.PURPLE_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_PRESSURE_PLATE, (ModBlocks.PURPLE_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_BUTTON, Blocks.PURPLE_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_WOOL_WALL, (Blocks.PURPLE_WOOL)).offerTo(exporter);

                //magenta_wool
                DoorRecipe(ModBlocks.MAGENTA_WOOL_DOOR, (Blocks.MAGENTA_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_SLAB, (Blocks.MAGENTA_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGENTA_WOOL_STAIRS, (Blocks.MAGENTA_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGENTA_WOOL_FENCE, (Blocks.MAGENTA_WOOL), (ModBlocks.MAGENTA_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGENTA_WOOL_FENCE_GATE, (Blocks.MAGENTA_WOOL), (ModBlocks.MAGENTA_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGENTA_WOOL_TRAPDOOR, (ModBlocks.MAGENTA_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE, (ModBlocks.MAGENTA_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_BUTTON, Blocks.MAGENTA_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_WOOL_WALL, (Blocks.MAGENTA_WOOL)).offerTo(exporter);

                //pink_wool
                DoorRecipe(ModBlocks.PINK_WOOL_DOOR, (Blocks.PINK_WOOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_SLAB, (Blocks.PINK_WOOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.PINK_WOOL_STAIRS, (Blocks.PINK_WOOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PINK_WOOL_FENCE, (Blocks.PINK_WOOL), (ModBlocks.PINK_WOOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PINK_WOOL_FENCE_GATE, (Blocks.PINK_WOOL), (ModBlocks.PINK_WOOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PINK_WOOL_TRAPDOOR, (ModBlocks.PINK_WOOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_PRESSURE_PLATE, (ModBlocks.PINK_WOOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_BUTTON, Blocks.PINK_WOOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_WOOL_WALL, (Blocks.PINK_WOOL)).offerTo(exporter);

                //terracotta
                DoorRecipe(ModBlocks.TERRACOTTA_DOOR, (Blocks.TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_SLAB, (Blocks.TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.TERRACOTTA_STAIRS, (Blocks.TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.TERRACOTTA_FENCE, (Blocks.TERRACOTTA), (ModBlocks.TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.TERRACOTTA_FENCE_GATE, (Blocks.TERRACOTTA), (ModBlocks.TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.TERRACOTTA_TRAPDOOR, (ModBlocks.TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_PRESSURE_PLATE, (ModBlocks.TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_BUTTON, Blocks.TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.TERRACOTTA_WALL, (Blocks.TERRACOTTA)).offerTo(exporter);

                //white_terracotta
                DoorRecipe(ModBlocks.WHITE_TERRACOTTA_DOOR, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_SLAB, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.WHITE_TERRACOTTA_STAIRS, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE, (Blocks.WHITE_TERRACOTTA), (ModBlocks.WHITE_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE, (Blocks.WHITE_TERRACOTTA), (ModBlocks.WHITE_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR, (ModBlocks.WHITE_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.WHITE_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_BUTTON, Blocks.WHITE_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_WALL, (Blocks.WHITE_TERRACOTTA)).offerTo(exporter);

                //light_gray_terracotta
                DoorRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE, (Blocks.LIGHT_GRAY_TERRACOTTA), (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_GRAY_TERRACOTTA), (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON, Blocks.LIGHT_GRAY_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, (Blocks.LIGHT_GRAY_TERRACOTTA)).offerTo(exporter);

                //gray_terracotta
                DoorRecipe(ModBlocks.GRAY_TERRACOTTA_DOOR, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_SLAB, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAY_TERRACOTTA_STAIRS, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE, (Blocks.GRAY_TERRACOTTA), (ModBlocks.GRAY_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE, (Blocks.GRAY_TERRACOTTA), (ModBlocks.GRAY_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR, (ModBlocks.GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GRAY_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_BUTTON, Blocks.GRAY_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_WALL, (Blocks.GRAY_TERRACOTTA)).offerTo(exporter);

                //black_terracotta
                DoorRecipe(ModBlocks.BLACK_TERRACOTTA_DOOR, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_SLAB, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLACK_TERRACOTTA_STAIRS, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE, (Blocks.BLACK_TERRACOTTA), (ModBlocks.BLACK_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE, (Blocks.BLACK_TERRACOTTA), (ModBlocks.BLACK_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR, (ModBlocks.BLACK_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLACK_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_BUTTON, Blocks.BLACK_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_WALL, (Blocks.BLACK_TERRACOTTA)).offerTo(exporter);

                //brown_terracotta
                DoorRecipe(ModBlocks.BROWN_TERRACOTTA_DOOR, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_SLAB, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.BROWN_TERRACOTTA_STAIRS, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE, (Blocks.BROWN_TERRACOTTA), (ModBlocks.BROWN_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE, (Blocks.BROWN_TERRACOTTA), (ModBlocks.BROWN_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR, (ModBlocks.BROWN_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BROWN_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_BUTTON, Blocks.BROWN_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_WALL, (Blocks.BROWN_TERRACOTTA)).offerTo(exporter);

                //red_terracotta
                DoorRecipe(ModBlocks.RED_TERRACOTTA_DOOR, (Blocks.RED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_SLAB, (Blocks.RED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_TERRACOTTA_STAIRS, (Blocks.RED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_TERRACOTTA_FENCE, (Blocks.RED_TERRACOTTA), (ModBlocks.RED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_TERRACOTTA_FENCE_GATE, (Blocks.RED_TERRACOTTA), (ModBlocks.RED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_TERRACOTTA_TRAPDOOR, (ModBlocks.RED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.RED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_BUTTON, Blocks.RED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_WALL, (Blocks.RED_TERRACOTTA)).offerTo(exporter);

                //orange_terracotta
                DoorRecipe(ModBlocks.ORANGE_TERRACOTTA_DOOR, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_SLAB, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.ORANGE_TERRACOTTA_STAIRS, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE, (Blocks.ORANGE_TERRACOTTA), (ModBlocks.ORANGE_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE, (Blocks.ORANGE_TERRACOTTA), (ModBlocks.ORANGE_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR, (ModBlocks.ORANGE_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.ORANGE_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_BUTTON, Blocks.ORANGE_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_WALL, (Blocks.ORANGE_TERRACOTTA)).offerTo(exporter);

                //yellow_terracotta
                DoorRecipe(ModBlocks.YELLOW_TERRACOTTA_DOOR, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_SLAB, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.YELLOW_TERRACOTTA_STAIRS, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE, (Blocks.YELLOW_TERRACOTTA), (ModBlocks.YELLOW_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE, (Blocks.YELLOW_TERRACOTTA), (ModBlocks.YELLOW_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR, (ModBlocks.YELLOW_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.YELLOW_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_BUTTON, Blocks.YELLOW_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_WALL, (Blocks.YELLOW_TERRACOTTA)).offerTo(exporter);

                //lime_terracotta
                DoorRecipe(ModBlocks.LIME_TERRACOTTA_DOOR, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_SLAB, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIME_TERRACOTTA_STAIRS, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIME_TERRACOTTA_FENCE, (Blocks.LIME_TERRACOTTA), (ModBlocks.LIME_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIME_TERRACOTTA_FENCE_GATE, (Blocks.LIME_TERRACOTTA), (ModBlocks.LIME_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIME_TERRACOTTA_TRAPDOOR, (ModBlocks.LIME_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIME_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_BUTTON, Blocks.LIME_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_WALL, (Blocks.LIME_TERRACOTTA)).offerTo(exporter);

                //green_terracotta
                DoorRecipe(ModBlocks.GREEN_TERRACOTTA_DOOR, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_SLAB, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.GREEN_TERRACOTTA_STAIRS, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE, (Blocks.GREEN_TERRACOTTA), (ModBlocks.GREEN_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE, (Blocks.GREEN_TERRACOTTA), (ModBlocks.GREEN_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR, (ModBlocks.GREEN_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GREEN_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_BUTTON, Blocks.GREEN_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_WALL, (Blocks.GREEN_TERRACOTTA)).offerTo(exporter);

                //cyan_terracotta
                DoorRecipe(ModBlocks.CYAN_TERRACOTTA_DOOR, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_SLAB, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.CYAN_TERRACOTTA_STAIRS, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE, (Blocks.CYAN_TERRACOTTA), (ModBlocks.CYAN_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE, (Blocks.CYAN_TERRACOTTA), (ModBlocks.CYAN_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR, (ModBlocks.CYAN_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.CYAN_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_BUTTON, Blocks.CYAN_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_WALL, (Blocks.CYAN_TERRACOTTA)).offerTo(exporter);

                //blue_terracotta
                DoorRecipe(ModBlocks.BLUE_TERRACOTTA_DOOR, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_SLAB, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_TERRACOTTA_STAIRS, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE, (Blocks.BLUE_TERRACOTTA), (ModBlocks.BLUE_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE, (Blocks.BLUE_TERRACOTTA), (ModBlocks.BLUE_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR, (ModBlocks.BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_BUTTON, Blocks.BLUE_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_WALL, (Blocks.BLUE_TERRACOTTA)).offerTo(exporter);

                //light_blue_terracotta
                DoorRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE, (Blocks.LIGHT_BLUE_TERRACOTTA), (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_BLUE_TERRACOTTA), (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON, Blocks.LIGHT_BLUE_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, (Blocks.LIGHT_BLUE_TERRACOTTA)).offerTo(exporter);

                //purple_terracotta
                DoorRecipe(ModBlocks.PURPLE_TERRACOTTA_DOOR, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_SLAB, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.PURPLE_TERRACOTTA_STAIRS, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE, (Blocks.PURPLE_TERRACOTTA), (ModBlocks.PURPLE_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE, (Blocks.PURPLE_TERRACOTTA), (ModBlocks.PURPLE_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR, (ModBlocks.PURPLE_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PURPLE_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_BUTTON, Blocks.PURPLE_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_WALL, (Blocks.PURPLE_TERRACOTTA)).offerTo(exporter);

                //magenta_terracotta
                DoorRecipe(ModBlocks.MAGENTA_TERRACOTTA_DOOR, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE, (Blocks.MAGENTA_TERRACOTTA), (ModBlocks.MAGENTA_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE, (Blocks.MAGENTA_TERRACOTTA), (ModBlocks.MAGENTA_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR, (ModBlocks.MAGENTA_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.MAGENTA_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_BUTTON, Blocks.MAGENTA_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_WALL, (Blocks.MAGENTA_TERRACOTTA)).offerTo(exporter);

                //pink_terracotta
                DoorRecipe(ModBlocks.PINK_TERRACOTTA_DOOR, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_SLAB, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.PINK_TERRACOTTA_STAIRS, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PINK_TERRACOTTA_FENCE, (Blocks.PINK_TERRACOTTA), (ModBlocks.PINK_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PINK_TERRACOTTA_FENCE_GATE, (Blocks.PINK_TERRACOTTA), (ModBlocks.PINK_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PINK_TERRACOTTA_TRAPDOOR, (ModBlocks.PINK_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PINK_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_BUTTON, Blocks.PINK_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_WALL, (Blocks.PINK_TERRACOTTA)).offerTo(exporter);

                //white_concrete
                DoorRecipe(ModBlocks.WHITE_CONCRETE_DOOR, (Blocks.WHITE_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_SLAB, (Blocks.WHITE_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.WHITE_CONCRETE_STAIRS, (Blocks.WHITE_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WHITE_CONCRETE_FENCE, (Blocks.WHITE_CONCRETE), (ModBlocks.WHITE_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WHITE_CONCRETE_FENCE_GATE, (Blocks.WHITE_CONCRETE), (ModBlocks.WHITE_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WHITE_CONCRETE_TRAPDOOR, (ModBlocks.WHITE_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, (ModBlocks.WHITE_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_WALL, (Blocks.WHITE_CONCRETE)).offerTo(exporter);

                //light_gray_concrete
                DoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, (Blocks.LIGHT_GRAY_CONCRETE), (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, (Blocks.LIGHT_GRAY_CONCRETE), (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR, (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, (Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter);

                //gray_concrete
                DoorRecipe(ModBlocks.GRAY_CONCRETE_DOOR, (Blocks.GRAY_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_SLAB, (Blocks.GRAY_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAY_CONCRETE_STAIRS, (Blocks.GRAY_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAY_CONCRETE_FENCE, (Blocks.GRAY_CONCRETE), (ModBlocks.GRAY_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAY_CONCRETE_FENCE_GATE, (Blocks.GRAY_CONCRETE), (ModBlocks.GRAY_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAY_CONCRETE_TRAPDOOR, (ModBlocks.GRAY_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, (ModBlocks.GRAY_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_WALL, (Blocks.GRAY_CONCRETE)).offerTo(exporter);

                //black_concrete
                DoorRecipe(ModBlocks.BLACK_CONCRETE_DOOR, (Blocks.BLACK_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_SLAB, (Blocks.BLACK_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLACK_CONCRETE_STAIRS, (Blocks.BLACK_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACK_CONCRETE_FENCE, (Blocks.BLACK_CONCRETE), (ModBlocks.BLACK_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACK_CONCRETE_FENCE_GATE, (Blocks.BLACK_CONCRETE), (ModBlocks.BLACK_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACK_CONCRETE_TRAPDOOR, (ModBlocks.BLACK_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, (ModBlocks.BLACK_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_WALL, (Blocks.BLACK_CONCRETE)).offerTo(exporter);

                //brown_concrete
                DoorRecipe(ModBlocks.BROWN_CONCRETE_DOOR, (Blocks.BROWN_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_SLAB, (Blocks.BROWN_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.BROWN_CONCRETE_STAIRS, (Blocks.BROWN_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BROWN_CONCRETE_FENCE, (Blocks.BROWN_CONCRETE), (ModBlocks.BROWN_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BROWN_CONCRETE_FENCE_GATE, (Blocks.BROWN_CONCRETE), (ModBlocks.BROWN_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BROWN_CONCRETE_TRAPDOOR, (ModBlocks.BROWN_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, (ModBlocks.BROWN_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_WALL, (Blocks.BROWN_CONCRETE)).offerTo(exporter);

                //red_concrete
                DoorRecipe(ModBlocks.RED_CONCRETE_DOOR, (Blocks.RED_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_SLAB, (Blocks.RED_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_CONCRETE_STAIRS, (Blocks.RED_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_CONCRETE_FENCE, (Blocks.RED_CONCRETE), (ModBlocks.RED_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_CONCRETE_FENCE_GATE, (Blocks.RED_CONCRETE), (ModBlocks.RED_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_CONCRETE_TRAPDOOR, (ModBlocks.RED_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, (ModBlocks.RED_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_WALL, (Blocks.RED_CONCRETE)).offerTo(exporter);

                //orange_concrete
                DoorRecipe(ModBlocks.ORANGE_CONCRETE_DOOR, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_SLAB, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.ORANGE_CONCRETE_STAIRS, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ORANGE_CONCRETE_FENCE, (Blocks.ORANGE_CONCRETE), (ModBlocks.ORANGE_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ORANGE_CONCRETE_FENCE_GATE, (Blocks.ORANGE_CONCRETE), (ModBlocks.ORANGE_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ORANGE_CONCRETE_TRAPDOOR, (ModBlocks.ORANGE_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, (ModBlocks.ORANGE_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_WALL, (Blocks.ORANGE_CONCRETE)).offerTo(exporter);

                //yellow_concrete
                DoorRecipe(ModBlocks.YELLOW_CONCRETE_DOOR, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_SLAB, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.YELLOW_CONCRETE_STAIRS, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.YELLOW_CONCRETE_FENCE, (Blocks.YELLOW_CONCRETE), (ModBlocks.YELLOW_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.YELLOW_CONCRETE_FENCE_GATE, (Blocks.YELLOW_CONCRETE), (ModBlocks.YELLOW_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.YELLOW_CONCRETE_TRAPDOOR, (ModBlocks.YELLOW_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, (ModBlocks.YELLOW_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_WALL, (Blocks.YELLOW_CONCRETE)).offerTo(exporter);

                //lime_concrete
                DoorRecipe(ModBlocks.LIME_CONCRETE_DOOR, (Blocks.LIME_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_SLAB, (Blocks.LIME_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIME_CONCRETE_STAIRS, (Blocks.LIME_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIME_CONCRETE_FENCE, (Blocks.LIME_CONCRETE), (ModBlocks.LIME_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIME_CONCRETE_FENCE_GATE, (Blocks.LIME_CONCRETE), (ModBlocks.LIME_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIME_CONCRETE_TRAPDOOR, (ModBlocks.LIME_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIME_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_WALL, (Blocks.LIME_CONCRETE)).offerTo(exporter);

                //green_concrete
                DoorRecipe(ModBlocks.GREEN_CONCRETE_DOOR, (Blocks.GREEN_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_SLAB, (Blocks.GREEN_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.GREEN_CONCRETE_STAIRS, (Blocks.GREEN_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GREEN_CONCRETE_FENCE, (Blocks.GREEN_CONCRETE), (ModBlocks.GREEN_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GREEN_CONCRETE_FENCE_GATE, (Blocks.GREEN_CONCRETE), (ModBlocks.GREEN_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GREEN_CONCRETE_TRAPDOOR, (ModBlocks.GREEN_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, (ModBlocks.GREEN_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_WALL, (Blocks.GREEN_CONCRETE)).offerTo(exporter);

                //cyan_concrete
                DoorRecipe(ModBlocks.CYAN_CONCRETE_DOOR, (Blocks.CYAN_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_SLAB, (Blocks.CYAN_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.CYAN_CONCRETE_STAIRS, (Blocks.CYAN_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CYAN_CONCRETE_FENCE, (Blocks.CYAN_CONCRETE), (ModBlocks.CYAN_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CYAN_CONCRETE_FENCE_GATE, (Blocks.CYAN_CONCRETE), (ModBlocks.CYAN_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CYAN_CONCRETE_TRAPDOOR, (ModBlocks.CYAN_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, (ModBlocks.CYAN_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_WALL, (Blocks.CYAN_CONCRETE)).offerTo(exporter);

                //blue_concrete
                DoorRecipe(ModBlocks.BLUE_CONCRETE_DOOR, (Blocks.BLUE_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_SLAB, (Blocks.BLUE_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_CONCRETE_STAIRS, (Blocks.BLUE_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_CONCRETE_FENCE, (Blocks.BLUE_CONCRETE), (ModBlocks.BLUE_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_CONCRETE_FENCE_GATE, (Blocks.BLUE_CONCRETE), (ModBlocks.BLUE_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_CONCRETE_TRAPDOOR, (ModBlocks.BLUE_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, (ModBlocks.BLUE_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_WALL, (Blocks.BLUE_CONCRETE)).offerTo(exporter);

                //light_blue_concrete
                DoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, (Blocks.LIGHT_BLUE_CONCRETE), (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, (Blocks.LIGHT_BLUE_CONCRETE), (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR, (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, (Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter);

                //purple_concrete
                DoorRecipe(ModBlocks.PURPLE_CONCRETE_DOOR, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_SLAB, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.PURPLE_CONCRETE_STAIRS, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPLE_CONCRETE_FENCE, (Blocks.PURPLE_CONCRETE), (ModBlocks.PURPLE_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPLE_CONCRETE_FENCE_GATE, (Blocks.PURPLE_CONCRETE), (ModBlocks.PURPLE_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPLE_CONCRETE_TRAPDOOR, (ModBlocks.PURPLE_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, (ModBlocks.PURPLE_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_WALL, (Blocks.PURPLE_CONCRETE)).offerTo(exporter);

                //magenta_concrete
                DoorRecipe(ModBlocks.MAGENTA_CONCRETE_DOOR, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_SLAB, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGENTA_CONCRETE_STAIRS, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGENTA_CONCRETE_FENCE, (Blocks.MAGENTA_CONCRETE), (ModBlocks.MAGENTA_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, (Blocks.MAGENTA_CONCRETE), (ModBlocks.MAGENTA_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR, (ModBlocks.MAGENTA_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, (ModBlocks.MAGENTA_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_WALL, (Blocks.MAGENTA_CONCRETE)).offerTo(exporter);

                //pink_concrete
                DoorRecipe(ModBlocks.PINK_CONCRETE_DOOR, (Blocks.PINK_CONCRETE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_SLAB, (Blocks.PINK_CONCRETE)).offerTo(exporter);
                StairsRecipe(ModBlocks.PINK_CONCRETE_STAIRS, (Blocks.PINK_CONCRETE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PINK_CONCRETE_FENCE, (Blocks.PINK_CONCRETE), (ModBlocks.PINK_CONCRETE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PINK_CONCRETE_FENCE_GATE, (Blocks.PINK_CONCRETE), (ModBlocks.PINK_CONCRETE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PINK_CONCRETE_TRAPDOOR, (ModBlocks.PINK_CONCRETE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, (ModBlocks.PINK_CONCRETE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_WALL, (Blocks.PINK_CONCRETE)).offerTo(exporter);

                //white_concrete_powder
                DoorRecipe(ModBlocks.WHITE_CONCRETE_POWDER_DOOR, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_SLAB, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.WHITE_CONCRETE_POWDER_STAIRS, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WHITE_CONCRETE_POWDER_FENCE, (Blocks.WHITE_CONCRETE_POWDER), (ModBlocks.WHITE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WHITE_CONCRETE_POWDER_FENCE_GATE, (Blocks.WHITE_CONCRETE_POWDER), (ModBlocks.WHITE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.WHITE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.WHITE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_BUTTON, Blocks.WHITE_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CONCRETE_POWDER_WALL, (Blocks.WHITE_CONCRETE_POWDER)).offerTo(exporter);

                //light_gray_concrete_powder
                DoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE, (Blocks.LIGHT_GRAY_CONCRETE_POWDER), (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIGHT_GRAY_CONCRETE_POWDER), (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON, Blocks.LIGHT_GRAY_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL, (Blocks.LIGHT_GRAY_CONCRETE_POWDER)).offerTo(exporter);

                //gray_concrete_powder
                DoorRecipe(ModBlocks.GRAY_CONCRETE_POWDER_DOOR, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_SLAB, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAY_CONCRETE_POWDER_STAIRS, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAY_CONCRETE_POWDER_FENCE, (Blocks.GRAY_CONCRETE_POWDER), (ModBlocks.GRAY_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAY_CONCRETE_POWDER_FENCE_GATE, (Blocks.GRAY_CONCRETE_POWDER), (ModBlocks.GRAY_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.GRAY_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_BUTTON, Blocks.GRAY_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_CONCRETE_POWDER_WALL, (Blocks.GRAY_CONCRETE_POWDER)).offerTo(exporter);

                //black_concrete_powder
                DoorRecipe(ModBlocks.BLACK_CONCRETE_POWDER_DOOR, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_SLAB, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLACK_CONCRETE_POWDER_STAIRS, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACK_CONCRETE_POWDER_FENCE, (Blocks.BLACK_CONCRETE_POWDER), (ModBlocks.BLACK_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACK_CONCRETE_POWDER_FENCE_GATE, (Blocks.BLACK_CONCRETE_POWDER), (ModBlocks.BLACK_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BLACK_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BLACK_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_BUTTON, Blocks.BLACK_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CONCRETE_POWDER_WALL, (Blocks.BLACK_CONCRETE_POWDER)).offerTo(exporter);

                //brown_concrete_powder
                DoorRecipe(ModBlocks.BROWN_CONCRETE_POWDER_DOOR, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_SLAB, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.BROWN_CONCRETE_POWDER_STAIRS, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BROWN_CONCRETE_POWDER_FENCE, (Blocks.BROWN_CONCRETE_POWDER), (ModBlocks.BROWN_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BROWN_CONCRETE_POWDER_FENCE_GATE, (Blocks.BROWN_CONCRETE_POWDER), (ModBlocks.BROWN_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BROWN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BROWN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_BUTTON, Blocks.BROWN_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_CONCRETE_POWDER_WALL, (Blocks.BROWN_CONCRETE_POWDER)).offerTo(exporter);

                //red_concrete_powder
                DoorRecipe(ModBlocks.RED_CONCRETE_POWDER_DOOR, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_SLAB, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_CONCRETE_POWDER_STAIRS, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_CONCRETE_POWDER_FENCE, (Blocks.RED_CONCRETE_POWDER), (ModBlocks.RED_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_CONCRETE_POWDER_FENCE_GATE, (Blocks.RED_CONCRETE_POWDER), (ModBlocks.RED_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.RED_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.RED_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_BUTTON, Blocks.RED_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_CONCRETE_POWDER_WALL, (Blocks.RED_CONCRETE_POWDER)).offerTo(exporter);

                //orange_concrete_powder
                DoorRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_SLAB, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_STAIRS, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE, (Blocks.ORANGE_CONCRETE_POWDER), (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE_GATE, (Blocks.ORANGE_CONCRETE_POWDER), (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.ORANGE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_BUTTON, Blocks.ORANGE_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_CONCRETE_POWDER_WALL, (Blocks.ORANGE_CONCRETE_POWDER)).offerTo(exporter);

                //yellow_concrete_powder
                DoorRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_SLAB, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_STAIRS, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE, (Blocks.YELLOW_CONCRETE_POWDER), (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE_GATE, (Blocks.YELLOW_CONCRETE_POWDER), (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.YELLOW_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_BUTTON, Blocks.YELLOW_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_CONCRETE_POWDER_WALL, (Blocks.YELLOW_CONCRETE_POWDER)).offerTo(exporter);

                //lime_concrete_powder
                DoorRecipe(ModBlocks.LIME_CONCRETE_POWDER_DOOR, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_SLAB, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIME_CONCRETE_POWDER_STAIRS, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIME_CONCRETE_POWDER_FENCE, (Blocks.LIME_CONCRETE_POWDER), (ModBlocks.LIME_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIME_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIME_CONCRETE_POWDER), (ModBlocks.LIME_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIME_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIME_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_BUTTON, Blocks.LIME_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_CONCRETE_POWDER_WALL, (Blocks.LIME_CONCRETE_POWDER)).offerTo(exporter);

                //green_concrete_powder
                DoorRecipe(ModBlocks.GREEN_CONCRETE_POWDER_DOOR, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_SLAB, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.GREEN_CONCRETE_POWDER_STAIRS, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GREEN_CONCRETE_POWDER_FENCE, (Blocks.GREEN_CONCRETE_POWDER), (ModBlocks.GREEN_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GREEN_CONCRETE_POWDER_FENCE_GATE, (Blocks.GREEN_CONCRETE_POWDER), (ModBlocks.GREEN_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.GREEN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.GREEN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_BUTTON, Blocks.GREEN_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_CONCRETE_POWDER_WALL, (Blocks.GREEN_CONCRETE_POWDER)).offerTo(exporter);

                //cyan_concrete_powder
                DoorRecipe(ModBlocks.CYAN_CONCRETE_POWDER_DOOR, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_SLAB, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.CYAN_CONCRETE_POWDER_STAIRS, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CYAN_CONCRETE_POWDER_FENCE, (Blocks.CYAN_CONCRETE_POWDER), (ModBlocks.CYAN_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CYAN_CONCRETE_POWDER_FENCE_GATE, (Blocks.CYAN_CONCRETE_POWDER), (ModBlocks.CYAN_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.CYAN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.CYAN_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_BUTTON, Blocks.CYAN_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_CONCRETE_POWDER_WALL, (Blocks.CYAN_CONCRETE_POWDER)).offerTo(exporter);

                //blue_concrete_powder
                DoorRecipe(ModBlocks.BLUE_CONCRETE_POWDER_DOOR, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_SLAB, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_CONCRETE_POWDER_STAIRS, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_CONCRETE_POWDER_FENCE, (Blocks.BLUE_CONCRETE_POWDER), (ModBlocks.BLUE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_CONCRETE_POWDER_FENCE_GATE, (Blocks.BLUE_CONCRETE_POWDER), (ModBlocks.BLUE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_BUTTON, Blocks.BLUE_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_CONCRETE_POWDER_WALL, (Blocks.BLUE_CONCRETE_POWDER)).offerTo(exporter);

                //light_blue_concrete_powder
                DoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE, (Blocks.LIGHT_BLUE_CONCRETE_POWDER), (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE, (Blocks.LIGHT_BLUE_CONCRETE_POWDER), (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON, Blocks.LIGHT_BLUE_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL, (Blocks.LIGHT_BLUE_CONCRETE_POWDER)).offerTo(exporter);

                //purple_concrete_powder
                DoorRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_SLAB, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_STAIRS, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE, (Blocks.PURPLE_CONCRETE_POWDER), (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE_GATE, (Blocks.PURPLE_CONCRETE_POWDER), (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.PURPLE_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_BUTTON, Blocks.PURPLE_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_CONCRETE_POWDER_WALL, (Blocks.PURPLE_CONCRETE_POWDER)).offerTo(exporter);

                //magenta_concrete_powder
                DoorRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_STAIRS, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE, (Blocks.MAGENTA_CONCRETE_POWDER), (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE_GATE, (Blocks.MAGENTA_CONCRETE_POWDER), (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE, (ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_BUTTON, Blocks.MAGENTA_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_CONCRETE_POWDER_WALL, (Blocks.MAGENTA_CONCRETE_POWDER)).offerTo(exporter);

                //pink_concrete_powder
                DoorRecipe(ModBlocks.PINK_CONCRETE_POWDER_DOOR, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_SLAB, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);
                StairsRecipe(ModBlocks.PINK_CONCRETE_POWDER_STAIRS, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PINK_CONCRETE_POWDER_FENCE, (Blocks.PINK_CONCRETE_POWDER), (ModBlocks.PINK_CONCRETE_POWDER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PINK_CONCRETE_POWDER_FENCE_GATE, (Blocks.PINK_CONCRETE_POWDER), (ModBlocks.PINK_CONCRETE_POWDER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR, (ModBlocks.PINK_CONCRETE_POWDER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_PRESSURE_PLATE, ModBlocks.PINK_CONCRETE_POWDER_SLAB).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_BUTTON, Blocks.PINK_CONCRETE_POWDER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_CONCRETE_POWDER_WALL, (Blocks.PINK_CONCRETE_POWDER)).offerTo(exporter);

                //white_glazed_terracotta
                DoorRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE, (Blocks.WHITE_GLAZED_TERRACOTTA), (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.WHITE_GLAZED_TERRACOTTA), (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON, Blocks.WHITE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, (Blocks.WHITE_GLAZED_TERRACOTTA)).offerTo(exporter);

                //light_gray_glazed_terracotta
                DoorRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, (Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);

                //gray_glazed_terracotta
                DoorRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE, (Blocks.GRAY_GLAZED_TERRACOTTA), (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.GRAY_GLAZED_TERRACOTTA), (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON, Blocks.GRAY_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, (Blocks.GRAY_GLAZED_TERRACOTTA)).offerTo(exporter);

                //black_glazed_terracotta
                DoorRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE, (Blocks.BLACK_GLAZED_TERRACOTTA), (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BLACK_GLAZED_TERRACOTTA), (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON, Blocks.BLACK_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, (Blocks.BLACK_GLAZED_TERRACOTTA)).offerTo(exporter);

                //brown_glazed_terracotta
                DoorRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE, (Blocks.BROWN_GLAZED_TERRACOTTA), (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BROWN_GLAZED_TERRACOTTA), (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON, Blocks.BROWN_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, (Blocks.BROWN_GLAZED_TERRACOTTA)).offerTo(exporter);

                //red_glazed_terracotta
                DoorRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE, (Blocks.RED_GLAZED_TERRACOTTA), (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.RED_GLAZED_TERRACOTTA), (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON, Blocks.RED_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, (Blocks.RED_GLAZED_TERRACOTTA)).offerTo(exporter);

                //orange_glazed_terracotta
                DoorRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE, (Blocks.ORANGE_GLAZED_TERRACOTTA), (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.ORANGE_GLAZED_TERRACOTTA), (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON, Blocks.ORANGE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, (Blocks.ORANGE_GLAZED_TERRACOTTA)).offerTo(exporter);

                //yellow_glazed_terracotta
                DoorRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE, (Blocks.YELLOW_GLAZED_TERRACOTTA), (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.YELLOW_GLAZED_TERRACOTTA), (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON, Blocks.YELLOW_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, (Blocks.YELLOW_GLAZED_TERRACOTTA)).offerTo(exporter);

                //lime_glazed_terracotta
                DoorRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE, (Blocks.LIME_GLAZED_TERRACOTTA), (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIME_GLAZED_TERRACOTTA), (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON, Blocks.LIME_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, (Blocks.LIME_GLAZED_TERRACOTTA)).offerTo(exporter);

                //green_glazed_terracotta
                DoorRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE, (Blocks.GREEN_GLAZED_TERRACOTTA), (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.GREEN_GLAZED_TERRACOTTA), (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON, Blocks.GREEN_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, (Blocks.GREEN_GLAZED_TERRACOTTA)).offerTo(exporter);

                //cyan_glazed_terracotta
                DoorRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE, (Blocks.CYAN_GLAZED_TERRACOTTA), (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.CYAN_GLAZED_TERRACOTTA), (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON, Blocks.CYAN_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, (Blocks.CYAN_GLAZED_TERRACOTTA)).offerTo(exporter);

                //blue_glazed_terracotta
                DoorRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE, (Blocks.BLUE_GLAZED_TERRACOTTA), (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.BLUE_GLAZED_TERRACOTTA), (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON, Blocks.BLUE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, (Blocks.BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);

                //light_blue_glazed_terracotta
                DoorRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, (Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)).offerTo(exporter);

                //purple_glazed_terracotta
                DoorRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE, (Blocks.PURPLE_GLAZED_TERRACOTTA), (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.PURPLE_GLAZED_TERRACOTTA), (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON, Blocks.PURPLE_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, (Blocks.PURPLE_GLAZED_TERRACOTTA)).offerTo(exporter);

                //magenta_glazed_terracotta
                DoorRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE, (Blocks.MAGENTA_GLAZED_TERRACOTTA), (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.MAGENTA_GLAZED_TERRACOTTA), (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON, Blocks.MAGENTA_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, (Blocks.MAGENTA_GLAZED_TERRACOTTA)).offerTo(exporter);

                //pink_glazed_terracotta
                DoorRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
                StairsRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE, (Blocks.PINK_GLAZED_TERRACOTTA), (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE, (Blocks.PINK_GLAZED_TERRACOTTA), (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR, (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE, (ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON, Blocks.PINK_GLAZED_TERRACOTTA, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, (Blocks.PINK_GLAZED_TERRACOTTA)).offerTo(exporter);

                //white_stained_glass
                DoorRecipe(ModBlocks.WHITE_STAINED_GLASS_DOOR, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_SLAB, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.WHITE_STAINED_GLASS_STAIRS, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE, (Blocks.WHITE_STAINED_GLASS), (ModBlocks.WHITE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE, (Blocks.WHITE_STAINED_GLASS), (ModBlocks.WHITE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR, (ModBlocks.WHITE_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.WHITE_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_BUTTON, Blocks.WHITE_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_GLASS_WALL, (Blocks.WHITE_STAINED_GLASS)).offerTo(exporter);

                //light_gray_stained_glass
                DoorRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE, (Blocks.LIGHT_GRAY_STAINED_GLASS), (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE, (Blocks.LIGHT_GRAY_STAINED_GLASS), (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON, Blocks.LIGHT_GRAY_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, (Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter);

                //gray_stained_glass
                DoorRecipe(ModBlocks.GRAY_STAINED_GLASS_DOOR, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_SLAB, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAY_STAINED_GLASS_STAIRS, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE, (Blocks.GRAY_STAINED_GLASS), (ModBlocks.GRAY_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE, (Blocks.GRAY_STAINED_GLASS), (ModBlocks.GRAY_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR, (ModBlocks.GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.GRAY_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_BUTTON, Blocks.GRAY_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_GLASS_WALL, (Blocks.GRAY_STAINED_GLASS)).offerTo(exporter);

                //black_stained_glass
                DoorRecipe(ModBlocks.BLACK_STAINED_GLASS_DOOR, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_SLAB, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLACK_STAINED_GLASS_STAIRS, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE, (Blocks.BLACK_STAINED_GLASS), (ModBlocks.BLACK_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE, (Blocks.BLACK_STAINED_GLASS), (ModBlocks.BLACK_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR, (ModBlocks.BLACK_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BLACK_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_BUTTON, Blocks.BLACK_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_GLASS_WALL, (Blocks.BLACK_STAINED_GLASS)).offerTo(exporter);

                //brown_stained_glass
                DoorRecipe(ModBlocks.BROWN_STAINED_GLASS_DOOR, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_SLAB, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.BROWN_STAINED_GLASS_STAIRS, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE, (Blocks.BROWN_STAINED_GLASS), (ModBlocks.BROWN_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE, (Blocks.BROWN_STAINED_GLASS), (ModBlocks.BROWN_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR, (ModBlocks.BROWN_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BROWN_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_BUTTON, Blocks.BROWN_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_GLASS_WALL, (Blocks.BROWN_STAINED_GLASS)).offerTo(exporter);

                //red_stained_glass
                DoorRecipe(ModBlocks.RED_STAINED_GLASS_DOOR, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_SLAB, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_STAINED_GLASS_STAIRS, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_STAINED_GLASS_FENCE, (Blocks.RED_STAINED_GLASS), (ModBlocks.RED_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_STAINED_GLASS_FENCE_GATE, (Blocks.RED_STAINED_GLASS), (ModBlocks.RED_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_STAINED_GLASS_TRAPDOOR, (ModBlocks.RED_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.RED_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_BUTTON, Blocks.RED_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_GLASS_WALL, (Blocks.RED_STAINED_GLASS)).offerTo(exporter);

                //orange_stained_glass
                DoorRecipe(ModBlocks.ORANGE_STAINED_GLASS_DOOR, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_SLAB, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.ORANGE_STAINED_GLASS_STAIRS, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE, (Blocks.ORANGE_STAINED_GLASS), (ModBlocks.ORANGE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, (Blocks.ORANGE_STAINED_GLASS), (ModBlocks.ORANGE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR, (ModBlocks.ORANGE_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.ORANGE_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_BUTTON, Blocks.ORANGE_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_GLASS_WALL, (Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter);

                //yellow_stained_glass
                DoorRecipe(ModBlocks.YELLOW_STAINED_GLASS_DOOR, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_SLAB, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.YELLOW_STAINED_GLASS_STAIRS, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE, (Blocks.YELLOW_STAINED_GLASS), (ModBlocks.YELLOW_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, (Blocks.YELLOW_STAINED_GLASS), (ModBlocks.YELLOW_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR, (ModBlocks.YELLOW_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.YELLOW_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_BUTTON, Blocks.YELLOW_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_GLASS_WALL, (Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter);

                //lime_stained_glass
                DoorRecipe(ModBlocks.LIME_STAINED_GLASS_DOOR, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_SLAB, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIME_STAINED_GLASS_STAIRS, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE, (Blocks.LIME_STAINED_GLASS), (ModBlocks.LIME_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE, (Blocks.LIME_STAINED_GLASS), (ModBlocks.LIME_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIME_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIME_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_BUTTON, Blocks.LIME_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_GLASS_WALL, (Blocks.LIME_STAINED_GLASS)).offerTo(exporter);

                //green_stained_glass
                DoorRecipe(ModBlocks.GREEN_STAINED_GLASS_DOOR, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_SLAB, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.GREEN_STAINED_GLASS_STAIRS, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE, (Blocks.GREEN_STAINED_GLASS), (ModBlocks.GREEN_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE, (Blocks.GREEN_STAINED_GLASS), (ModBlocks.GREEN_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR, (ModBlocks.GREEN_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.GREEN_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_BUTTON, Blocks.GREEN_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_GLASS_WALL, (Blocks.GREEN_STAINED_GLASS)).offerTo(exporter);

                //cyan_stained_glass
                DoorRecipe(ModBlocks.CYAN_STAINED_GLASS_DOOR, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_SLAB, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.CYAN_STAINED_GLASS_STAIRS, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE, (Blocks.CYAN_STAINED_GLASS), (ModBlocks.CYAN_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE, (Blocks.CYAN_STAINED_GLASS), (ModBlocks.CYAN_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR, (ModBlocks.CYAN_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.CYAN_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_BUTTON, Blocks.CYAN_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_GLASS_WALL, (Blocks.CYAN_STAINED_GLASS)).offerTo(exporter);

                //blue_stained_glass
                DoorRecipe(ModBlocks.BLUE_STAINED_GLASS_DOOR, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_SLAB, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_STAINED_GLASS_STAIRS, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE, (Blocks.BLUE_STAINED_GLASS), (ModBlocks.BLUE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE, (Blocks.BLUE_STAINED_GLASS), (ModBlocks.BLUE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR, (ModBlocks.BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_BUTTON, Blocks.BLUE_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_GLASS_WALL, (Blocks.BLUE_STAINED_GLASS)).offerTo(exporter);

                //light_blue_stained_glass
                DoorRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, (Blocks.LIGHT_BLUE_STAINED_GLASS), (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, (Blocks.LIGHT_BLUE_STAINED_GLASS), (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, Blocks.LIGHT_BLUE_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, (Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter);

                //purple_stained_glass
                DoorRecipe(ModBlocks.PURPLE_STAINED_GLASS_DOOR, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_SLAB, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.PURPLE_STAINED_GLASS_STAIRS, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE, (Blocks.PURPLE_STAINED_GLASS), (ModBlocks.PURPLE_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, (Blocks.PURPLE_STAINED_GLASS), (ModBlocks.PURPLE_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR, (ModBlocks.PURPLE_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.PURPLE_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_BUTTON, Blocks.PURPLE_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_GLASS_WALL, (Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter);

                //magenta_stained_glass
                DoorRecipe(ModBlocks.MAGENTA_STAINED_GLASS_DOOR, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_SLAB, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE, (Blocks.MAGENTA_STAINED_GLASS), (ModBlocks.MAGENTA_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, (Blocks.MAGENTA_STAINED_GLASS), (ModBlocks.MAGENTA_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR, (ModBlocks.MAGENTA_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.MAGENTA_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_BUTTON, Blocks.MAGENTA_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_GLASS_WALL, (Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter);

                //pink_stained_glass
                DoorRecipe(ModBlocks.PINK_STAINED_GLASS_DOOR, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_SLAB, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
                StairsRecipe(ModBlocks.PINK_STAINED_GLASS_STAIRS, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE, (Blocks.PINK_STAINED_GLASS), (ModBlocks.PINK_STAINED_GLASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE, (Blocks.PINK_STAINED_GLASS), (ModBlocks.PINK_STAINED_GLASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR, (ModBlocks.PINK_STAINED_GLASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE, (ModBlocks.PINK_STAINED_GLASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_BUTTON, Blocks.PINK_STAINED_GLASS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_GLASS_WALL, (Blocks.PINK_STAINED_GLASS)).offerTo(exporter);

                //grass_block
                DoorRecipe(ModBlocks.GRASS_DOOR, (Blocks.GRASS_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_SLAB, (Blocks.GRASS_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRASS_STAIRS, (Blocks.GRASS_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRASS_FENCE, (Blocks.GRASS_BLOCK), (ModBlocks.GRASS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRASS_FENCE_GATE, (Blocks.GRASS_BLOCK), (ModBlocks.GRASS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRASS_TRAPDOOR, (ModBlocks.GRASS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_PRESSURE_PLATE, (ModBlocks.GRASS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_BUTTON, Blocks.GRASS_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRASS_WALL, (Blocks.GRASS_BLOCK)).offerTo(exporter);

                //podzol
                DoorRecipe(ModBlocks.PODZOL_DOOR, (Blocks.PODZOL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_SLAB, (Blocks.PODZOL)).offerTo(exporter);
                StairsRecipe(ModBlocks.PODZOL_STAIRS, (Blocks.PODZOL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PODZOL_FENCE, (Blocks.PODZOL), (ModBlocks.PODZOL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PODZOL_FENCE_GATE, (Blocks.PODZOL), (ModBlocks.PODZOL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PODZOL_TRAPDOOR, (ModBlocks.PODZOL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_PRESSURE_PLATE, (ModBlocks.PODZOL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_BUTTON, Blocks.PODZOL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PODZOL_WALL, (Blocks.PODZOL)).offerTo(exporter);

                //dirt
                DoorRecipe(ModBlocks.DIRT_DOOR, (Blocks.DIRT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_SLAB, (Blocks.DIRT)).offerTo(exporter);
                StairsRecipe(ModBlocks.DIRT_STAIRS, (Blocks.DIRT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DIRT_FENCE, (Blocks.DIRT), (ModBlocks.DIRT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DIRT_FENCE_GATE, (Blocks.DIRT), (ModBlocks.DIRT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DIRT_TRAPDOOR, (ModBlocks.DIRT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PRESSURE_PLATE, (ModBlocks.DIRT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_BUTTON, Blocks.DIRT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_WALL, (Blocks.DIRT)).offerTo(exporter);

                //mycelium
                DoorRecipe(ModBlocks.MYCELIUM_DOOR, (Blocks.MYCELIUM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_SLAB, (Blocks.MYCELIUM)).offerTo(exporter);
                StairsRecipe(ModBlocks.MYCELIUM_STAIRS, (Blocks.MYCELIUM)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MYCELIUM_FENCE, (Blocks.MYCELIUM), (ModBlocks.MYCELIUM_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MYCELIUM_FENCE_GATE, (Blocks.MYCELIUM), (ModBlocks.MYCELIUM_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MYCELIUM_TRAPDOOR, (ModBlocks.MYCELIUM_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_PRESSURE_PLATE, (ModBlocks.MYCELIUM_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_BUTTON, Blocks.MYCELIUM, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_WALL, (Blocks.MYCELIUM)).offerTo(exporter);

                //dirt_path
                DoorRecipe(ModBlocks.DIRT_PATH_DOOR, (Blocks.DIRT_PATH)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_SLAB, (Blocks.DIRT_PATH)).offerTo(exporter);
                StairsRecipe(ModBlocks.DIRT_PATH_STAIRS, (Blocks.DIRT_PATH)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DIRT_PATH_FENCE, (Blocks.DIRT_PATH), (ModBlocks.DIRT_PATH_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DIRT_PATH_FENCE_GATE, (Blocks.DIRT_PATH), (ModBlocks.DIRT_PATH_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DIRT_PATH_TRAPDOOR, (ModBlocks.DIRT_PATH_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_PRESSURE_PLATE, (ModBlocks.DIRT_PATH_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_BUTTON, Blocks.DIRT_PATH, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DIRT_PATH_WALL, (Blocks.DIRT_PATH)).offerTo(exporter);

                //coarse_dirt
                DoorRecipe(ModBlocks.COARSE_DIRT_DOOR, (Blocks.COARSE_DIRT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_SLAB, (Blocks.COARSE_DIRT)).offerTo(exporter);
                StairsRecipe(ModBlocks.COARSE_DIRT_STAIRS, (Blocks.COARSE_DIRT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.COARSE_DIRT_FENCE, (Blocks.COARSE_DIRT), (ModBlocks.COARSE_DIRT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.COARSE_DIRT_FENCE_GATE, (Blocks.COARSE_DIRT), (ModBlocks.COARSE_DIRT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.COARSE_DIRT_TRAPDOOR, (ModBlocks.COARSE_DIRT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_PRESSURE_PLATE, (ModBlocks.COARSE_DIRT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_BUTTON, Blocks.COARSE_DIRT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.COARSE_DIRT_WALL, (Blocks.COARSE_DIRT)).offerTo(exporter);

                //farmland
                DoorRecipe(ModBlocks.FARMLAND_DOOR, (Blocks.FARMLAND)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_SLAB, (Blocks.FARMLAND)).offerTo(exporter);
                StairsRecipe(ModBlocks.FARMLAND_STAIRS, (Blocks.FARMLAND)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.FARMLAND_FENCE, (Blocks.FARMLAND), (ModBlocks.FARMLAND_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.FARMLAND_FENCE_GATE, (Blocks.FARMLAND), (ModBlocks.FARMLAND_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.FARMLAND_TRAPDOOR, (ModBlocks.FARMLAND_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_PRESSURE_PLATE, (ModBlocks.FARMLAND_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_BUTTON, Blocks.FARMLAND, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.FARMLAND_WALL, (Blocks.FARMLAND)).offerTo(exporter);

                //rooted_dirt
                DoorRecipe(ModBlocks.ROOTED_DIRT_DOOR, (Blocks.ROOTED_DIRT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_SLAB, (Blocks.ROOTED_DIRT)).offerTo(exporter);
                StairsRecipe(ModBlocks.ROOTED_DIRT_STAIRS, (Blocks.ROOTED_DIRT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ROOTED_DIRT_FENCE, (Blocks.ROOTED_DIRT), (ModBlocks.ROOTED_DIRT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ROOTED_DIRT_FENCE_GATE, (Blocks.ROOTED_DIRT), (ModBlocks.ROOTED_DIRT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ROOTED_DIRT_TRAPDOOR, (ModBlocks.ROOTED_DIRT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_PRESSURE_PLATE, (ModBlocks.ROOTED_DIRT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_BUTTON, Blocks.ROOTED_DIRT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ROOTED_DIRT_WALL, (Blocks.ROOTED_DIRT)).offerTo(exporter);

                //mud
                DoorRecipe(ModBlocks.MUD_DOOR, (Blocks.MUD)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_SLAB, (Blocks.MUD)).offerTo(exporter);
                StairsRecipe(ModBlocks.MUD_STAIRS, (Blocks.MUD)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MUD_FENCE, (Blocks.MUD), (ModBlocks.MUD_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MUD_FENCE_GATE, (Blocks.MUD), (ModBlocks.MUD_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MUD_TRAPDOOR, (ModBlocks.MUD_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_PRESSURE_PLATE, (ModBlocks.MUD_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_BUTTON, Blocks.MUD, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MUD_WALL, (Blocks.MUD)).offerTo(exporter);

                //clay
                DoorRecipe(ModBlocks.CLAY_DOOR, (Blocks.CLAY)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_SLAB, (Blocks.CLAY)).offerTo(exporter);
                StairsRecipe(ModBlocks.CLAY_STAIRS, (Blocks.CLAY)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CLAY_FENCE, (Blocks.CLAY), (ModBlocks.CLAY_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CLAY_FENCE_GATE, (Blocks.CLAY), (ModBlocks.CLAY_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CLAY_TRAPDOOR, (ModBlocks.CLAY_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_PRESSURE_PLATE, (ModBlocks.CLAY_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_BUTTON, Blocks.CLAY, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CLAY_WALL, (Blocks.CLAY)).offerTo(exporter);

                //sand
                DoorRecipe(ModBlocks.SAND_DOOR, (Blocks.SAND)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_SLAB, (Blocks.SAND)).offerTo(exporter);
                StairsRecipe(ModBlocks.SAND_STAIRS, (Blocks.SAND)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SAND_FENCE, (Blocks.SAND), (ModBlocks.SAND_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SAND_FENCE_GATE, (Blocks.SAND), (ModBlocks.SAND_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SAND_TRAPDOOR, (ModBlocks.SAND_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_PRESSURE_PLATE, (ModBlocks.SAND_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_BUTTON, Blocks.SAND, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SAND_WALL, (Blocks.SAND)).offerTo(exporter);

                //gravel
                DoorRecipe(ModBlocks.GRAVEL_DOOR, (Blocks.GRAVEL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_SLAB, (Blocks.GRAVEL)).offerTo(exporter);
                StairsRecipe(ModBlocks.GRAVEL_STAIRS, (Blocks.GRAVEL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.GRAVEL_FENCE, (Blocks.GRAVEL), (ModBlocks.GRAVEL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.GRAVEL_FENCE_GATE, (Blocks.GRAVEL), (ModBlocks.GRAVEL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.GRAVEL_TRAPDOOR, (ModBlocks.GRAVEL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_PRESSURE_PLATE, (ModBlocks.GRAVEL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_BUTTON, Blocks.GRAVEL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAVEL_WALL, (Blocks.GRAVEL)).offerTo(exporter);

                //red_sand
                DoorRecipe(ModBlocks.RED_SAND_DOOR, (Blocks.RED_SAND)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_SLAB, (Blocks.RED_SAND)).offerTo(exporter);
                StairsRecipe(ModBlocks.RED_SAND_STAIRS, (Blocks.RED_SAND)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.RED_SAND_FENCE, (Blocks.RED_SAND), (ModBlocks.RED_SAND_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.RED_SAND_FENCE_GATE, (Blocks.RED_SAND), (ModBlocks.RED_SAND_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.RED_SAND_TRAPDOOR, (ModBlocks.RED_SAND_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_PRESSURE_PLATE, (ModBlocks.RED_SAND_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_BUTTON, Blocks.RED_SAND, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_SAND_WALL, (Blocks.RED_SAND)).offerTo(exporter);

                //ice
                DoorRecipe(ModBlocks.ICE_DOOR, (Blocks.ICE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_SLAB, (Blocks.ICE)).offerTo(exporter);
                StairsRecipe(ModBlocks.ICE_STAIRS, (Blocks.ICE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.ICE_FENCE, (Blocks.ICE), (ModBlocks.ICE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.ICE_FENCE_GATE, (Blocks.ICE), (ModBlocks.ICE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.ICE_TRAPDOOR, (ModBlocks.ICE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_PRESSURE_PLATE, (ModBlocks.ICE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_BUTTON, Blocks.ICE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ICE_WALL, (Blocks.ICE)).offerTo(exporter);

                //packed_ice
                DoorRecipe(ModBlocks.PACKED_ICE_DOOR, (Blocks.PACKED_ICE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_SLAB, (Blocks.PACKED_ICE)).offerTo(exporter);
                StairsRecipe(ModBlocks.PACKED_ICE_STAIRS, (Blocks.PACKED_ICE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PACKED_ICE_FENCE, (Blocks.PACKED_ICE), (ModBlocks.PACKED_ICE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PACKED_ICE_FENCE_GATE, (Blocks.PACKED_ICE), (ModBlocks.PACKED_ICE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PACKED_ICE_TRAPDOOR, (ModBlocks.PACKED_ICE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_PRESSURE_PLATE, (ModBlocks.PACKED_ICE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_BUTTON, Blocks.PACKED_ICE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PACKED_ICE_WALL, (Blocks.PACKED_ICE)).offerTo(exporter);

                //blue_ice
                DoorRecipe(ModBlocks.BLUE_ICE_DOOR, (Blocks.BLUE_ICE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_SLAB, (Blocks.BLUE_ICE)).offerTo(exporter);
                StairsRecipe(ModBlocks.BLUE_ICE_STAIRS, (Blocks.BLUE_ICE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BLUE_ICE_FENCE, (Blocks.BLUE_ICE), (ModBlocks.BLUE_ICE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BLUE_ICE_FENCE_GATE, (Blocks.BLUE_ICE), (ModBlocks.BLUE_ICE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BLUE_ICE_TRAPDOOR, (ModBlocks.BLUE_ICE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_PRESSURE_PLATE, (ModBlocks.BLUE_ICE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_BUTTON, Blocks.BLUE_ICE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_ICE_WALL, (Blocks.BLUE_ICE)).offerTo(exporter);

                //snow_block
                DoorRecipe(ModBlocks.SNOW_DOOR, (Blocks.SNOW_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_SLAB, (Blocks.SNOW_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.SNOW_STAIRS, (Blocks.SNOW_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SNOW_FENCE, (Blocks.SNOW_BLOCK), (ModBlocks.SNOW_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SNOW_FENCE_GATE, (Blocks.SNOW_BLOCK), (ModBlocks.SNOW_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SNOW_TRAPDOOR, (ModBlocks.SNOW_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_PRESSURE_PLATE, (ModBlocks.SNOW_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_BUTTON, Blocks.SNOW_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SNOW_WALL, (Blocks.SNOW_BLOCK)).offerTo(exporter);

                //moss_block
                DoorRecipe(ModBlocks.MOSS_DOOR, (Blocks.MOSS_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_SLAB, (Blocks.MOSS_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.MOSS_STAIRS, (Blocks.MOSS_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MOSS_FENCE, (Blocks.MOSS_BLOCK), (ModBlocks.MOSS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MOSS_FENCE_GATE, (Blocks.MOSS_BLOCK), (ModBlocks.MOSS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MOSS_TRAPDOOR, (ModBlocks.MOSS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_PRESSURE_PLATE, (ModBlocks.MOSS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_BUTTON, Blocks.MOSS_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSS_WALL, (Blocks.MOSS_BLOCK)).offerTo(exporter);

                //pale_moss_block
                DoorRecipe(ModBlocks.PALE_MOSS_DOOR, (Blocks.PALE_MOSS_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSS_SLAB, (Blocks.PALE_MOSS_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.PALE_MOSS_STAIRS, (Blocks.PALE_MOSS_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.PALE_MOSS_FENCE, (Blocks.PALE_MOSS_BLOCK), (ModBlocks.PALE_MOSS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.PALE_MOSS_FENCE_GATE, (Blocks.PALE_MOSS_BLOCK), (ModBlocks.PALE_MOSS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.PALE_MOSS_TRAPDOOR, (ModBlocks.PALE_MOSS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSS_PRESSURE_PLATE, (ModBlocks.PALE_MOSS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSS_BUTTON, Blocks.PALE_MOSS_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSS_WALL, (Blocks.PALE_MOSS_BLOCK)).offerTo(exporter);

                //calcite
                DoorRecipe(ModBlocks.CALCITE_DOOR, (Blocks.CALCITE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_SLAB, (Blocks.CALCITE)).offerTo(exporter);
                StairsRecipe(ModBlocks.CALCITE_STAIRS, (Blocks.CALCITE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CALCITE_FENCE, (Blocks.CALCITE), (ModBlocks.CALCITE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CALCITE_FENCE_GATE, (Blocks.CALCITE), (ModBlocks.CALCITE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CALCITE_TRAPDOOR, (ModBlocks.CALCITE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_PRESSURE_PLATE, (ModBlocks.CALCITE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_BUTTON, Blocks.CALCITE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, (Blocks.CALCITE)).offerTo(exporter);

                //tuff
                DoorRecipe(ModBlocks.TUFF_DOOR, (Blocks.TUFF)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.TUFF_FENCE, (Blocks.TUFF), (Blocks.TUFF_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.TUFF_FENCE_GATE, (Blocks.TUFF), (Blocks.TUFF_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.TUFF_TRAPDOOR, (Blocks.TUFF_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.TUFF_PRESSURE_PLATE, (Blocks.TUFF_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.TUFF_BUTTON, Blocks.TUFF, 1).offerTo(exporter);
                //dripstone_block
                DoorRecipe(ModBlocks.DRIPSTONE_DOOR, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_SLAB, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.DRIPSTONE_STAIRS, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.DRIPSTONE_FENCE, (Blocks.DRIPSTONE_BLOCK), (ModBlocks.DRIPSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.DRIPSTONE_FENCE_GATE, (Blocks.DRIPSTONE_BLOCK), (ModBlocks.DRIPSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.DRIPSTONE_TRAPDOOR, (ModBlocks.DRIPSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_PRESSURE_PLATE, (ModBlocks.DRIPSTONE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_BUTTON, Blocks.DRIPSTONE_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DRIPSTONE_WALL, (Blocks.DRIPSTONE_BLOCK)).offerTo(exporter);

                //magma_block
                DoorRecipe(ModBlocks.MAGMA_DOOR, (Blocks.MAGMA_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_SLAB, (Blocks.MAGMA_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.MAGMA_STAIRS, (Blocks.MAGMA_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.MAGMA_FENCE, (Blocks.MAGMA_BLOCK), (ModBlocks.MAGMA_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.MAGMA_FENCE_GATE, (Blocks.MAGMA_BLOCK), (ModBlocks.MAGMA_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.MAGMA_TRAPDOOR, (ModBlocks.MAGMA_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_PRESSURE_PLATE, (ModBlocks.MAGMA_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_BUTTON, Blocks.MAGMA_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGMA_WALL, (Blocks.MAGMA_BLOCK)).offerTo(exporter);

                //obsidian
                DoorRecipe(ModBlocks.OBSIDIAN_DOOR, (Blocks.OBSIDIAN)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_SLAB, (Blocks.OBSIDIAN)).offerTo(exporter);
                StairsRecipe(ModBlocks.OBSIDIAN_STAIRS, (Blocks.OBSIDIAN)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.OBSIDIAN_FENCE, (Blocks.OBSIDIAN), (ModBlocks.OBSIDIAN_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.OBSIDIAN_FENCE_GATE, (Blocks.OBSIDIAN), (ModBlocks.OBSIDIAN_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.OBSIDIAN_TRAPDOOR, (ModBlocks.OBSIDIAN_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_PRESSURE_PLATE, (ModBlocks.OBSIDIAN_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_BUTTON, Blocks.OBSIDIAN, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_WALL, (Blocks.OBSIDIAN)).offerTo(exporter);

                //crying_obsidian
                DoorRecipe(ModBlocks.CRYING_OBSIDIAN_DOOR, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_SLAB, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRYING_OBSIDIAN_STAIRS, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRYING_OBSIDIAN_FENCE, (Blocks.CRYING_OBSIDIAN), (ModBlocks.CRYING_OBSIDIAN_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE, (Blocks.CRYING_OBSIDIAN), (ModBlocks.CRYING_OBSIDIAN_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRYING_OBSIDIAN_TRAPDOOR, (ModBlocks.CRYING_OBSIDIAN_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE, (ModBlocks.CRYING_OBSIDIAN_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_BUTTON, Blocks.CRYING_OBSIDIAN, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRYING_OBSIDIAN_WALL, (Blocks.CRYING_OBSIDIAN)).offerTo(exporter);

                //crimson_nylium
                DoorRecipe(ModBlocks.CRIMSON_NYLIUM_DOOR, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_SLAB, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);
                StairsRecipe(ModBlocks.CRIMSON_NYLIUM_STAIRS, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.CRIMSON_NYLIUM_FENCE, (Blocks.CRIMSON_NYLIUM), (ModBlocks.CRIMSON_NYLIUM_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.CRIMSON_NYLIUM_FENCE_GATE, (Blocks.CRIMSON_NYLIUM), (ModBlocks.CRIMSON_NYLIUM_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.CRIMSON_NYLIUM_TRAPDOOR, (ModBlocks.CRIMSON_NYLIUM_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_PRESSURE_PLATE, (ModBlocks.CRIMSON_NYLIUM_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_BUTTON, Blocks.CRIMSON_NYLIUM, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_NYLIUM_WALL, (Blocks.CRIMSON_NYLIUM)).offerTo(exporter);

                //warped_nylium
                DoorRecipe(ModBlocks.WARPED_NYLIUM_DOOR, (Blocks.WARPED_NYLIUM)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_SLAB, (Blocks.WARPED_NYLIUM)).offerTo(exporter);
                StairsRecipe(ModBlocks.WARPED_NYLIUM_STAIRS, (Blocks.WARPED_NYLIUM)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.WARPED_NYLIUM_FENCE, (Blocks.WARPED_NYLIUM), (ModBlocks.WARPED_NYLIUM_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.WARPED_NYLIUM_FENCE_GATE, (Blocks.WARPED_NYLIUM), (ModBlocks.WARPED_NYLIUM_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.WARPED_NYLIUM_TRAPDOOR, (ModBlocks.WARPED_NYLIUM_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_PRESSURE_PLATE, (ModBlocks.WARPED_NYLIUM_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_BUTTON, Blocks.WARPED_NYLIUM, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_NYLIUM_WALL, (Blocks.WARPED_NYLIUM)).offerTo(exporter);

                //soul_sand
                DoorRecipe(ModBlocks.SOUL_SAND_DOOR, (Blocks.SOUL_SAND)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_SLAB, (Blocks.SOUL_SAND)).offerTo(exporter);
                StairsRecipe(ModBlocks.SOUL_SAND_STAIRS, (Blocks.SOUL_SAND)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SOUL_SAND_FENCE, (Blocks.SOUL_SAND), (ModBlocks.SOUL_SAND_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SOUL_SAND_FENCE_GATE, (Blocks.SOUL_SAND), (ModBlocks.SOUL_SAND_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SOUL_SAND_TRAPDOOR, (ModBlocks.SOUL_SAND_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_PRESSURE_PLATE, (ModBlocks.SOUL_SAND_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_BUTTON, Blocks.SOUL_SAND, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SAND_WALL, (Blocks.SOUL_SAND)).offerTo(exporter);

                //soul_soil
                DoorRecipe(ModBlocks.SOUL_SOIL_DOOR, (Blocks.SOUL_SOIL)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_SLAB, (Blocks.SOUL_SOIL)).offerTo(exporter);
                StairsRecipe(ModBlocks.SOUL_SOIL_STAIRS, (Blocks.SOUL_SOIL)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.SOUL_SOIL_FENCE, (Blocks.SOUL_SOIL), (ModBlocks.SOUL_SOIL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.SOUL_SOIL_FENCE_GATE, (Blocks.SOUL_SOIL), (ModBlocks.SOUL_SOIL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.SOUL_SOIL_TRAPDOOR, (ModBlocks.SOUL_SOIL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_PRESSURE_PLATE, (ModBlocks.SOUL_SOIL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_BUTTON, Blocks.SOUL_SOIL, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SOUL_SOIL_WALL, (Blocks.SOUL_SOIL)).offerTo(exporter);

                //bone
                DoorRecipe(ModBlocks.BONE_DOOR, (Blocks.BONE_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_SLAB, (Blocks.BONE_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks.BONE_STAIRS, (Blocks.BONE_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks.BONE_FENCE, (Blocks.BONE_BLOCK), (ModBlocks.BONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks.BONE_FENCE_GATE, (Blocks.BONE_BLOCK), (ModBlocks.BONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks.BONE_TRAPDOOR, (ModBlocks.BONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_PRESSURE_PLATE, (ModBlocks.BONE_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_BUTTON, Blocks.BONE_BLOCK).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BONE_WALL, (Blocks.BONE_BLOCK)).offerTo(exporter);

                //coal_ore
                DoorRecipe(ModBlocks2.COAL_ORE_DOOR, (Blocks.COAL_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COAL_ORE_SLAB, (Blocks.COAL_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.COAL_ORE_STAIRS, (Blocks.COAL_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.COAL_ORE_FENCE, (Blocks.COAL_ORE), (ModBlocks2.COAL_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.COAL_ORE_FENCE_GATE, (Blocks.COAL_ORE), (ModBlocks2.COAL_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.COAL_ORE_TRAPDOOR, (ModBlocks2.COAL_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COAL_ORE_PRESSURE_PLATE, (ModBlocks2.COAL_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COAL_ORE_BUTTON, Blocks.COAL_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COAL_ORE_WALL, (Blocks.COAL_ORE)).offerTo(exporter);

                //deepslate_coal_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_COAL_ORE_DOOR, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COAL_ORE_SLAB, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_COAL_ORE_STAIRS, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_COAL_ORE_FENCE, (Blocks.DEEPSLATE_COAL_ORE), (ModBlocks2.DEEPSLATE_COAL_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_COAL_ORE_FENCE_GATE, (Blocks.DEEPSLATE_COAL_ORE), (ModBlocks2.DEEPSLATE_COAL_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_COAL_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_COAL_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COAL_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_COAL_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COAL_ORE_BUTTON, Blocks.DEEPSLATE_COAL_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COAL_ORE_WALL, (Blocks.DEEPSLATE_COAL_ORE)).offerTo(exporter);

                //iron_ore
                DoorRecipe(ModBlocks2.IRON_ORE_DOOR, (Blocks.IRON_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.IRON_ORE_SLAB, (Blocks.IRON_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.IRON_ORE_STAIRS, (Blocks.IRON_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.IRON_ORE_FENCE, (Blocks.IRON_ORE), (ModBlocks2.IRON_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.IRON_ORE_FENCE_GATE, (Blocks.IRON_ORE), (ModBlocks2.IRON_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.IRON_ORE_TRAPDOOR, (ModBlocks2.IRON_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.IRON_ORE_PRESSURE_PLATE, (ModBlocks2.IRON_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.IRON_ORE_BUTTON, Blocks.IRON_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.IRON_ORE_WALL, (Blocks.IRON_ORE)).offerTo(exporter);

                //deepslate_iron_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_IRON_ORE_DOOR, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_IRON_ORE_SLAB, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_IRON_ORE_STAIRS, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_IRON_ORE_FENCE, (Blocks.DEEPSLATE_IRON_ORE), (ModBlocks2.DEEPSLATE_IRON_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_IRON_ORE_FENCE_GATE, (Blocks.DEEPSLATE_IRON_ORE), (ModBlocks2.DEEPSLATE_IRON_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_IRON_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_IRON_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_IRON_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_IRON_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_IRON_ORE_BUTTON, Blocks.DEEPSLATE_IRON_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_IRON_ORE_WALL, (Blocks.DEEPSLATE_IRON_ORE)).offerTo(exporter);

                //copper_ore
                DoorRecipe(ModBlocks2.COPPER_ORE_DOOR, (Blocks.COPPER_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_ORE_SLAB, (Blocks.COPPER_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.COPPER_ORE_STAIRS, (Blocks.COPPER_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.COPPER_ORE_FENCE, (Blocks.COPPER_ORE), (ModBlocks2.COPPER_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.COPPER_ORE_FENCE_GATE, (Blocks.COPPER_ORE), (ModBlocks2.COPPER_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.COPPER_ORE_TRAPDOOR, (ModBlocks2.COPPER_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_ORE_PRESSURE_PLATE, (ModBlocks2.COPPER_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_ORE_BUTTON, Blocks.COPPER_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_ORE_WALL, (Blocks.COPPER_ORE)).offerTo(exporter);

                //deepslate_copper_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_COPPER_ORE_DOOR, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COPPER_ORE_SLAB, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_COPPER_ORE_STAIRS, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_COPPER_ORE_FENCE, (Blocks.DEEPSLATE_COPPER_ORE), (ModBlocks2.DEEPSLATE_COPPER_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_COPPER_ORE_FENCE_GATE, (Blocks.DEEPSLATE_COPPER_ORE), (ModBlocks2.DEEPSLATE_COPPER_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_COPPER_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_COPPER_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_COPPER_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COPPER_ORE_BUTTON, Blocks.DEEPSLATE_COPPER_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_COPPER_ORE_WALL, (Blocks.DEEPSLATE_COPPER_ORE)).offerTo(exporter);

                //gold_ore
                DoorRecipe(ModBlocks2.GOLD_ORE_DOOR, (Blocks.GOLD_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GOLD_ORE_SLAB, (Blocks.GOLD_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.GOLD_ORE_STAIRS, (Blocks.GOLD_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.GOLD_ORE_FENCE, (Blocks.GOLD_ORE), (ModBlocks2.GOLD_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.GOLD_ORE_FENCE_GATE, (Blocks.GOLD_ORE), (ModBlocks2.GOLD_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.GOLD_ORE_TRAPDOOR, (ModBlocks2.GOLD_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GOLD_ORE_PRESSURE_PLATE, (ModBlocks2.GOLD_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GOLD_ORE_BUTTON, Blocks.GOLD_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GOLD_ORE_WALL, (Blocks.GOLD_ORE)).offerTo(exporter);

                //deepslate_gold_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_GOLD_ORE_DOOR, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_GOLD_ORE_SLAB, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_GOLD_ORE_STAIRS, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_GOLD_ORE_FENCE, (Blocks.DEEPSLATE_GOLD_ORE), (ModBlocks2.DEEPSLATE_GOLD_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_GOLD_ORE_FENCE_GATE, (Blocks.DEEPSLATE_GOLD_ORE), (ModBlocks2.DEEPSLATE_GOLD_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_GOLD_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_GOLD_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_GOLD_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_GOLD_ORE_BUTTON, Blocks.DEEPSLATE_GOLD_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_GOLD_ORE_WALL, (Blocks.DEEPSLATE_GOLD_ORE)).offerTo(exporter);

                //redstone_ore
                DoorRecipe(ModBlocks2.REDSTONE_ORE_DOOR, (Blocks.REDSTONE_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.REDSTONE_ORE_SLAB, (Blocks.REDSTONE_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.REDSTONE_ORE_STAIRS, (Blocks.REDSTONE_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.REDSTONE_ORE_FENCE, (Blocks.REDSTONE_ORE), (ModBlocks2.REDSTONE_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.REDSTONE_ORE_FENCE_GATE, (Blocks.REDSTONE_ORE), (ModBlocks2.REDSTONE_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.REDSTONE_ORE_TRAPDOOR, (ModBlocks2.REDSTONE_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.REDSTONE_ORE_PRESSURE_PLATE, (ModBlocks2.REDSTONE_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.REDSTONE_ORE_BUTTON, Blocks.REDSTONE_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.REDSTONE_ORE_WALL, (Blocks.REDSTONE_ORE)).offerTo(exporter);

                //deepslate_redstone_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_REDSTONE_ORE_DOOR, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_REDSTONE_ORE_SLAB, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_REDSTONE_ORE_STAIRS, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_REDSTONE_ORE_FENCE, (Blocks.DEEPSLATE_REDSTONE_ORE), (ModBlocks2.DEEPSLATE_REDSTONE_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_REDSTONE_ORE_FENCE_GATE, (Blocks.DEEPSLATE_REDSTONE_ORE), (ModBlocks2.DEEPSLATE_REDSTONE_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_REDSTONE_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_REDSTONE_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_REDSTONE_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_REDSTONE_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_REDSTONE_ORE_BUTTON, Blocks.DEEPSLATE_REDSTONE_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_REDSTONE_ORE_WALL, (Blocks.DEEPSLATE_REDSTONE_ORE)).offerTo(exporter);

                //emerald_ore
                DoorRecipe(ModBlocks2.EMERALD_ORE_DOOR, (Blocks.EMERALD_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EMERALD_ORE_SLAB, (Blocks.EMERALD_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.EMERALD_ORE_STAIRS, (Blocks.EMERALD_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.EMERALD_ORE_FENCE, (Blocks.EMERALD_ORE), (ModBlocks2.EMERALD_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.EMERALD_ORE_FENCE_GATE, (Blocks.EMERALD_ORE), (ModBlocks2.EMERALD_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.EMERALD_ORE_TRAPDOOR, (ModBlocks2.EMERALD_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EMERALD_ORE_PRESSURE_PLATE, (ModBlocks2.EMERALD_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EMERALD_ORE_BUTTON, Blocks.EMERALD_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EMERALD_ORE_WALL, (Blocks.EMERALD_ORE)).offerTo(exporter);

                //deepslate_emerald_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_EMERALD_ORE_DOOR, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_EMERALD_ORE_SLAB, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_EMERALD_ORE_STAIRS, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_EMERALD_ORE_FENCE, (Blocks.DEEPSLATE_EMERALD_ORE), (ModBlocks2.DEEPSLATE_EMERALD_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_EMERALD_ORE_FENCE_GATE, (Blocks.DEEPSLATE_EMERALD_ORE), (ModBlocks2.DEEPSLATE_EMERALD_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_EMERALD_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_EMERALD_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_EMERALD_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_EMERALD_ORE_BUTTON, Blocks.DEEPSLATE_EMERALD_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_EMERALD_ORE_WALL, (Blocks.DEEPSLATE_EMERALD_ORE)).offerTo(exporter);

                //lapis_ore
                DoorRecipe(ModBlocks2.LAPIS_ORE_DOOR, (Blocks.LAPIS_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.LAPIS_ORE_SLAB, (Blocks.LAPIS_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.LAPIS_ORE_STAIRS, (Blocks.LAPIS_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.LAPIS_ORE_FENCE, (Blocks.LAPIS_ORE), (ModBlocks2.LAPIS_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.LAPIS_ORE_FENCE_GATE, (Blocks.LAPIS_ORE), (ModBlocks2.LAPIS_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.LAPIS_ORE_TRAPDOOR, (ModBlocks2.LAPIS_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.LAPIS_ORE_PRESSURE_PLATE, (ModBlocks2.LAPIS_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.LAPIS_ORE_BUTTON, Blocks.LAPIS_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.LAPIS_ORE_WALL, (Blocks.LAPIS_ORE)).offerTo(exporter);

                //deepslate_lapis_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_LAPIS_ORE_DOOR, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_LAPIS_ORE_SLAB, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_LAPIS_ORE_STAIRS, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_LAPIS_ORE_FENCE, (Blocks.DEEPSLATE_LAPIS_ORE), (ModBlocks2.DEEPSLATE_LAPIS_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_LAPIS_ORE_FENCE_GATE, (Blocks.DEEPSLATE_LAPIS_ORE), (ModBlocks2.DEEPSLATE_LAPIS_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_LAPIS_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_LAPIS_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_LAPIS_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_LAPIS_ORE_BUTTON, Blocks.DEEPSLATE_LAPIS_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_LAPIS_ORE_WALL, (Blocks.DEEPSLATE_LAPIS_ORE)).offerTo(exporter);

                //diamond_ore
                DoorRecipe(ModBlocks2.DIAMOND_ORE_DOOR, (Blocks.DIAMOND_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DIAMOND_ORE_SLAB, (Blocks.DIAMOND_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DIAMOND_ORE_STAIRS, (Blocks.DIAMOND_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DIAMOND_ORE_FENCE, (Blocks.DIAMOND_ORE), (ModBlocks2.DIAMOND_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DIAMOND_ORE_FENCE_GATE, (Blocks.DIAMOND_ORE), (ModBlocks2.DIAMOND_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DIAMOND_ORE_TRAPDOOR, (ModBlocks2.DIAMOND_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DIAMOND_ORE_PRESSURE_PLATE, (ModBlocks2.DIAMOND_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DIAMOND_ORE_BUTTON, Blocks.DIAMOND_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DIAMOND_ORE_WALL, (Blocks.DIAMOND_ORE)).offerTo(exporter);

                //deepslate_diamond_ore
                DoorRecipe(ModBlocks2.DEEPSLATE_DIAMOND_ORE_DOOR, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_DIAMOND_ORE_SLAB, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEEPSLATE_DIAMOND_ORE_STAIRS, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEEPSLATE_DIAMOND_ORE_FENCE, (Blocks.DEEPSLATE_DIAMOND_ORE), (ModBlocks2.DEEPSLATE_DIAMOND_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEEPSLATE_DIAMOND_ORE_FENCE_GATE, (Blocks.DEEPSLATE_DIAMOND_ORE), (ModBlocks2.DEEPSLATE_DIAMOND_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEEPSLATE_DIAMOND_ORE_TRAPDOOR, (ModBlocks2.DEEPSLATE_DIAMOND_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE, (ModBlocks2.DEEPSLATE_DIAMOND_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_DIAMOND_ORE_BUTTON, Blocks.DEEPSLATE_DIAMOND_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEEPSLATE_DIAMOND_ORE_WALL, (Blocks.DEEPSLATE_DIAMOND_ORE)).offerTo(exporter);

                //nether_gold_ore
                DoorRecipe(ModBlocks2.NETHER_GOLD_ORE_DOOR, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_GOLD_ORE_SLAB, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.NETHER_GOLD_ORE_STAIRS, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.NETHER_GOLD_ORE_FENCE, (Blocks.NETHER_GOLD_ORE), (ModBlocks2.NETHER_GOLD_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.NETHER_GOLD_ORE_FENCE_GATE, (Blocks.NETHER_GOLD_ORE), (ModBlocks2.NETHER_GOLD_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.NETHER_GOLD_ORE_TRAPDOOR, (ModBlocks2.NETHER_GOLD_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_GOLD_ORE_PRESSURE_PLATE, (ModBlocks2.NETHER_GOLD_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_GOLD_ORE_BUTTON, Blocks.NETHER_GOLD_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_GOLD_ORE_WALL, (Blocks.NETHER_GOLD_ORE)).offerTo(exporter);

                //nether_quartz_ore
                DoorRecipe(ModBlocks2.NETHER_QUARTZ_ORE_DOOR, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_QUARTZ_ORE_SLAB, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.NETHER_QUARTZ_ORE_STAIRS, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.NETHER_QUARTZ_ORE_FENCE, (Blocks.NETHER_QUARTZ_ORE), (ModBlocks2.NETHER_QUARTZ_ORE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.NETHER_QUARTZ_ORE_FENCE_GATE, (Blocks.NETHER_QUARTZ_ORE), (ModBlocks2.NETHER_QUARTZ_ORE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.NETHER_QUARTZ_ORE_TRAPDOOR, (ModBlocks2.NETHER_QUARTZ_ORE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_QUARTZ_ORE_PRESSURE_PLATE, (ModBlocks2.NETHER_QUARTZ_ORE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_QUARTZ_ORE_BUTTON, Blocks.NETHER_QUARTZ_ORE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_QUARTZ_ORE_WALL, (Blocks.NETHER_QUARTZ_ORE)).offerTo(exporter);

                //ancient_debris
                DoorRecipe(ModBlocks2.ANCIENT_DEBRIS_DOOR, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ANCIENT_DEBRIS_SLAB, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);
                StairsRecipe(ModBlocks2.ANCIENT_DEBRIS_STAIRS, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.ANCIENT_DEBRIS_FENCE, (Blocks.ANCIENT_DEBRIS), (ModBlocks2.ANCIENT_DEBRIS_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.ANCIENT_DEBRIS_FENCE_GATE, (Blocks.ANCIENT_DEBRIS), (ModBlocks2.ANCIENT_DEBRIS_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.ANCIENT_DEBRIS_TRAPDOOR, (ModBlocks2.ANCIENT_DEBRIS_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ANCIENT_DEBRIS_PRESSURE_PLATE, (ModBlocks2.ANCIENT_DEBRIS_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ANCIENT_DEBRIS_BUTTON, Blocks.ANCIENT_DEBRIS, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ANCIENT_DEBRIS_WALL, (Blocks.ANCIENT_DEBRIS)).offerTo(exporter);

                //raw_iron_block
                DoorRecipe(ModBlocks2.RAW_IRON_DOOR, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_IRON_SLAB, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.RAW_IRON_STAIRS, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.RAW_IRON_FENCE, (Blocks.RAW_IRON_BLOCK), (ModBlocks2.RAW_IRON_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.RAW_IRON_FENCE_GATE, (Blocks.RAW_IRON_BLOCK), (ModBlocks2.RAW_IRON_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.RAW_IRON_TRAPDOOR, (ModBlocks2.RAW_IRON_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_IRON_PRESSURE_PLATE, (ModBlocks2.RAW_IRON_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_IRON_BUTTON, Blocks.RAW_IRON_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_IRON_WALL, (Blocks.RAW_IRON_BLOCK)).offerTo(exporter);

                //raw_copper_block
                DoorRecipe(ModBlocks2.RAW_COPPER_DOOR, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_COPPER_SLAB, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.RAW_COPPER_STAIRS, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.RAW_COPPER_FENCE, (Blocks.RAW_COPPER_BLOCK), (ModBlocks2.RAW_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.RAW_COPPER_FENCE_GATE, (Blocks.RAW_COPPER_BLOCK), (ModBlocks2.RAW_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.RAW_COPPER_TRAPDOOR, (ModBlocks2.RAW_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_COPPER_PRESSURE_PLATE, (ModBlocks2.RAW_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_COPPER_BUTTON, Blocks.RAW_COPPER_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_COPPER_WALL, (Blocks.RAW_COPPER_BLOCK)).offerTo(exporter);

                //raw_gold_block
                DoorRecipe(ModBlocks2.RAW_GOLD_DOOR, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_GOLD_SLAB, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.RAW_GOLD_STAIRS, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.RAW_GOLD_FENCE, (Blocks.RAW_GOLD_BLOCK), (ModBlocks2.RAW_GOLD_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.RAW_GOLD_FENCE_GATE, (Blocks.RAW_GOLD_BLOCK), (ModBlocks2.RAW_GOLD_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.RAW_GOLD_TRAPDOOR, (ModBlocks2.RAW_GOLD_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_GOLD_PRESSURE_PLATE, (ModBlocks2.RAW_GOLD_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_GOLD_BUTTON, Blocks.RAW_GOLD_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RAW_GOLD_WALL, (Blocks.RAW_GOLD_BLOCK)).offerTo(exporter);

                //glowstone
                DoorRecipe(ModBlocks2.GLOWSTONE_DOOR, (Blocks.GLOWSTONE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GLOWSTONE_SLAB, (Blocks.GLOWSTONE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.GLOWSTONE_STAIRS, (Blocks.GLOWSTONE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.GLOWSTONE_FENCE, (Blocks.GLOWSTONE), (ModBlocks2.GLOWSTONE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.GLOWSTONE_FENCE_GATE, (Blocks.GLOWSTONE), (ModBlocks2.GLOWSTONE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.GLOWSTONE_TRAPDOOR, (ModBlocks2.GLOWSTONE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GLOWSTONE_PRESSURE_PLATE, (ModBlocks2.GLOWSTONE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GLOWSTONE_BUTTON, Blocks.GLOWSTONE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.GLOWSTONE_WALL, (Blocks.GLOWSTONE)).offerTo(exporter);

                //oak_leaves
                DoorRecipe(ModBlocks2.OAK_LEAVES_DOOR, (Blocks.OAK_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OAK_LEAVES_SLAB, (Blocks.OAK_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.OAK_LEAVES_STAIRS, (Blocks.OAK_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.OAK_LEAVES_FENCE, (Blocks.OAK_LEAVES), (ModBlocks2.OAK_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.OAK_LEAVES_FENCE_GATE, (Blocks.OAK_LEAVES), (ModBlocks2.OAK_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.OAK_LEAVES_TRAPDOOR, (ModBlocks2.OAK_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OAK_LEAVES_PRESSURE_PLATE, (ModBlocks2.OAK_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OAK_LEAVES_BUTTON, Blocks.OAK_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OAK_LEAVES_WALL, (Blocks.OAK_LEAVES)).offerTo(exporter);

                //spruce_leaves
                DoorRecipe(ModBlocks2.SPRUCE_LEAVES_DOOR, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPRUCE_LEAVES_SLAB, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.SPRUCE_LEAVES_STAIRS, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.SPRUCE_LEAVES_FENCE, (Blocks.SPRUCE_LEAVES), (ModBlocks2.SPRUCE_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.SPRUCE_LEAVES_FENCE_GATE, (Blocks.SPRUCE_LEAVES), (ModBlocks2.SPRUCE_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.SPRUCE_LEAVES_TRAPDOOR, (ModBlocks2.SPRUCE_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPRUCE_LEAVES_PRESSURE_PLATE, (ModBlocks2.SPRUCE_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPRUCE_LEAVES_BUTTON, Blocks.SPRUCE_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPRUCE_LEAVES_WALL, (Blocks.SPRUCE_LEAVES)).offerTo(exporter);

                //birch_leaves
                DoorRecipe(ModBlocks2.BIRCH_LEAVES_DOOR, (Blocks.BIRCH_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BIRCH_LEAVES_SLAB, (Blocks.BIRCH_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.BIRCH_LEAVES_STAIRS, (Blocks.BIRCH_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.BIRCH_LEAVES_FENCE, (Blocks.BIRCH_LEAVES), (ModBlocks2.BIRCH_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.BIRCH_LEAVES_FENCE_GATE, (Blocks.BIRCH_LEAVES), (ModBlocks2.BIRCH_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.BIRCH_LEAVES_TRAPDOOR, (ModBlocks2.BIRCH_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BIRCH_LEAVES_PRESSURE_PLATE, (ModBlocks2.BIRCH_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BIRCH_LEAVES_BUTTON, Blocks.BIRCH_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BIRCH_LEAVES_WALL, (Blocks.BIRCH_LEAVES)).offerTo(exporter);

                //jungle_leaves
                DoorRecipe(ModBlocks2.JUNGLE_LEAVES_DOOR, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.JUNGLE_LEAVES_SLAB, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.JUNGLE_LEAVES_STAIRS, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.JUNGLE_LEAVES_FENCE, (Blocks.JUNGLE_LEAVES), (ModBlocks2.JUNGLE_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.JUNGLE_LEAVES_FENCE_GATE, (Blocks.JUNGLE_LEAVES), (ModBlocks2.JUNGLE_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.JUNGLE_LEAVES_TRAPDOOR, (ModBlocks2.JUNGLE_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.JUNGLE_LEAVES_PRESSURE_PLATE, (ModBlocks2.JUNGLE_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.JUNGLE_LEAVES_BUTTON, Blocks.JUNGLE_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.JUNGLE_LEAVES_WALL, (Blocks.JUNGLE_LEAVES)).offerTo(exporter);

                //acacia_leaves
                DoorRecipe(ModBlocks2.ACACIA_LEAVES_DOOR, (Blocks.ACACIA_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ACACIA_LEAVES_SLAB, (Blocks.ACACIA_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.ACACIA_LEAVES_STAIRS, (Blocks.ACACIA_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.ACACIA_LEAVES_FENCE, (Blocks.ACACIA_LEAVES), (ModBlocks2.ACACIA_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.ACACIA_LEAVES_FENCE_GATE, (Blocks.ACACIA_LEAVES), (ModBlocks2.ACACIA_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.ACACIA_LEAVES_TRAPDOOR, (ModBlocks2.ACACIA_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ACACIA_LEAVES_PRESSURE_PLATE, (ModBlocks2.ACACIA_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ACACIA_LEAVES_BUTTON, Blocks.ACACIA_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.ACACIA_LEAVES_WALL, (Blocks.ACACIA_LEAVES)).offerTo(exporter);

                //dark_oak_leaves
                DoorRecipe(ModBlocks2.DARK_OAK_LEAVES_DOOR, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DARK_OAK_LEAVES_SLAB, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DARK_OAK_LEAVES_STAIRS, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DARK_OAK_LEAVES_FENCE, (Blocks.DARK_OAK_LEAVES), (ModBlocks2.DARK_OAK_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DARK_OAK_LEAVES_FENCE_GATE, (Blocks.DARK_OAK_LEAVES), (ModBlocks2.DARK_OAK_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DARK_OAK_LEAVES_TRAPDOOR, (ModBlocks2.DARK_OAK_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DARK_OAK_LEAVES_PRESSURE_PLATE, (ModBlocks2.DARK_OAK_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DARK_OAK_LEAVES_BUTTON, Blocks.DARK_OAK_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DARK_OAK_LEAVES_WALL, (Blocks.DARK_OAK_LEAVES)).offerTo(exporter);

                //mangrove_leaves
                DoorRecipe(ModBlocks2.MANGROVE_LEAVES_DOOR, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MANGROVE_LEAVES_SLAB, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.MANGROVE_LEAVES_STAIRS, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.MANGROVE_LEAVES_FENCE, (Blocks.MANGROVE_LEAVES), (ModBlocks2.MANGROVE_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.MANGROVE_LEAVES_FENCE_GATE, (Blocks.MANGROVE_LEAVES), (ModBlocks2.MANGROVE_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.MANGROVE_LEAVES_TRAPDOOR, (ModBlocks2.MANGROVE_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MANGROVE_LEAVES_PRESSURE_PLATE, (ModBlocks2.MANGROVE_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MANGROVE_LEAVES_BUTTON, Blocks.MANGROVE_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MANGROVE_LEAVES_WALL, (Blocks.MANGROVE_LEAVES)).offerTo(exporter);

                //cherry_leaves
                DoorRecipe(ModBlocks2.CHERRY_LEAVES_DOOR, (Blocks.CHERRY_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHERRY_LEAVES_SLAB, (Blocks.CHERRY_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.CHERRY_LEAVES_STAIRS, (Blocks.CHERRY_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.CHERRY_LEAVES_FENCE, (Blocks.CHERRY_LEAVES), (ModBlocks2.CHERRY_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.CHERRY_LEAVES_FENCE_GATE, (Blocks.CHERRY_LEAVES), (ModBlocks2.CHERRY_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.CHERRY_LEAVES_TRAPDOOR, (ModBlocks2.CHERRY_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHERRY_LEAVES_PRESSURE_PLATE, (ModBlocks2.CHERRY_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHERRY_LEAVES_BUTTON, Blocks.CHERRY_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHERRY_LEAVES_WALL, (Blocks.CHERRY_LEAVES)).offerTo(exporter);

                //pale_oak_leaves
                DoorRecipe(ModBlocks2.PALE_OAK_LEAVES_DOOR, (Blocks.PALE_OAK_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PALE_OAK_LEAVES_SLAB, (Blocks.PALE_OAK_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.PALE_OAK_LEAVES_STAIRS, (Blocks.PALE_OAK_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.PALE_OAK_LEAVES_FENCE, (Blocks.PALE_OAK_LEAVES), (ModBlocks2.PALE_OAK_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.PALE_OAK_LEAVES_FENCE_GATE, (Blocks.PALE_OAK_LEAVES), (ModBlocks2.PALE_OAK_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.PALE_OAK_LEAVES_TRAPDOOR, (ModBlocks2.PALE_OAK_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PALE_OAK_LEAVES_PRESSURE_PLATE, (ModBlocks2.PALE_OAK_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PALE_OAK_LEAVES_BUTTON, Blocks.PALE_OAK_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PALE_OAK_LEAVES_WALL, (Blocks.PALE_OAK_LEAVES)).offerTo(exporter);

                //azalea_leaves
                DoorRecipe(ModBlocks2.AZALEA_LEAVES_DOOR, (Blocks.AZALEA_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.AZALEA_LEAVES_SLAB, (Blocks.AZALEA_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.AZALEA_LEAVES_STAIRS, (Blocks.AZALEA_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.AZALEA_LEAVES_FENCE, (Blocks.AZALEA_LEAVES), (ModBlocks2.AZALEA_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.AZALEA_LEAVES_FENCE_GATE, (Blocks.AZALEA_LEAVES), (ModBlocks2.AZALEA_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.AZALEA_LEAVES_TRAPDOOR, (ModBlocks2.AZALEA_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.AZALEA_LEAVES_PRESSURE_PLATE, (ModBlocks2.AZALEA_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.AZALEA_LEAVES_BUTTON, Blocks.AZALEA_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.AZALEA_LEAVES_WALL, (Blocks.AZALEA_LEAVES)).offerTo(exporter);

                //flowering_azalea_leaves
                DoorRecipe(ModBlocks2.FLOWERING_AZALEA_LEAVES_DOOR, (Blocks.FLOWERING_AZALEA_LEAVES)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FLOWERING_AZALEA_LEAVES_SLAB, (Blocks.FLOWERING_AZALEA_LEAVES)).offerTo(exporter);
                StairsRecipe(ModBlocks2.FLOWERING_AZALEA_LEAVES_STAIRS, (Blocks.FLOWERING_AZALEA_LEAVES)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.FLOWERING_AZALEA_LEAVES_FENCE, (Blocks.FLOWERING_AZALEA_LEAVES), (ModBlocks2.FLOWERING_AZALEA_LEAVES_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.FLOWERING_AZALEA_LEAVES_FENCE_GATE, (Blocks.FLOWERING_AZALEA_LEAVES), (ModBlocks2.FLOWERING_AZALEA_LEAVES_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.FLOWERING_AZALEA_LEAVES_TRAPDOOR, (ModBlocks2.FLOWERING_AZALEA_LEAVES_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE, (ModBlocks2.FLOWERING_AZALEA_LEAVES_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FLOWERING_AZALEA_LEAVES_BUTTON, Blocks.FLOWERING_AZALEA_LEAVES, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FLOWERING_AZALEA_LEAVES_WALL, (Blocks.FLOWERING_AZALEA_LEAVES)).offerTo(exporter);

                //brown_mushroom
                DoorRecipe(ModBlocks2.BROWN_MUSHROOM_DOOR, (Blocks.BROWN_MUSHROOM_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BROWN_MUSHROOM_SLAB, (Blocks.BROWN_MUSHROOM_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.BROWN_MUSHROOM_STAIRS, (Blocks.BROWN_MUSHROOM_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.BROWN_MUSHROOM_FENCE, (Blocks.BROWN_MUSHROOM_BLOCK), (ModBlocks2.BROWN_MUSHROOM_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.BROWN_MUSHROOM_FENCE_GATE, (Blocks.BROWN_MUSHROOM_BLOCK), (ModBlocks2.BROWN_MUSHROOM_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.BROWN_MUSHROOM_TRAPDOOR, (ModBlocks2.BROWN_MUSHROOM_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BROWN_MUSHROOM_PRESSURE_PLATE, (ModBlocks2.BROWN_MUSHROOM_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BROWN_MUSHROOM_BUTTON, Blocks.BROWN_MUSHROOM_BLOCK).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BROWN_MUSHROOM_WALL, (Blocks.BROWN_MUSHROOM_BLOCK)).offerTo(exporter);

                //red_mushroom
                DoorRecipe(ModBlocks2.RED_MUSHROOM_DOOR, (Blocks.RED_MUSHROOM_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RED_MUSHROOM_SLAB, (Blocks.RED_MUSHROOM_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.RED_MUSHROOM_STAIRS, (Blocks.RED_MUSHROOM_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.RED_MUSHROOM_FENCE, (Blocks.RED_MUSHROOM_BLOCK), (ModBlocks2.RED_MUSHROOM_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.RED_MUSHROOM_FENCE_GATE, (Blocks.RED_MUSHROOM_BLOCK), (ModBlocks2.RED_MUSHROOM_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.RED_MUSHROOM_TRAPDOOR, (ModBlocks2.RED_MUSHROOM_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RED_MUSHROOM_PRESSURE_PLATE, (ModBlocks2.RED_MUSHROOM_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RED_MUSHROOM_BUTTON, Blocks.RED_MUSHROOM_BLOCK).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RED_MUSHROOM_WALL, (Blocks.RED_MUSHROOM_BLOCK)).offerTo(exporter);

                //nether_wart
                DoorRecipe(ModBlocks2.NETHER_WART_DOOR, (Blocks.NETHER_WART_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_WART_SLAB, (Blocks.NETHER_WART_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.NETHER_WART_STAIRS, (Blocks.NETHER_WART_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.NETHER_WART_FENCE, (Blocks.NETHER_WART_BLOCK), (ModBlocks2.NETHER_WART_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.NETHER_WART_FENCE_GATE, (Blocks.NETHER_WART_BLOCK), (ModBlocks2.NETHER_WART_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.NETHER_WART_TRAPDOOR, (ModBlocks2.NETHER_WART_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_WART_PRESSURE_PLATE, (ModBlocks2.NETHER_WART_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_WART_BUTTON, Blocks.NETHER_WART_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.NETHER_WART_WALL, (Blocks.NETHER_WART_BLOCK)).offerTo(exporter);

                //warped_wart
                DoorRecipe(ModBlocks2.WARPED_WART_DOOR, (Blocks.WARPED_WART_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WARPED_WART_SLAB, (Blocks.WARPED_WART_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WARPED_WART_STAIRS, (Blocks.WARPED_WART_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WARPED_WART_FENCE, (Blocks.WARPED_WART_BLOCK), (ModBlocks2.WARPED_WART_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WARPED_WART_FENCE_GATE, (Blocks.WARPED_WART_BLOCK), (ModBlocks2.WARPED_WART_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WARPED_WART_TRAPDOOR, (ModBlocks2.WARPED_WART_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WARPED_WART_PRESSURE_PLATE, (ModBlocks2.WARPED_WART_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WARPED_WART_BUTTON, Blocks.WARPED_WART_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WARPED_WART_WALL, (Blocks.WARPED_WART_BLOCK)).offerTo(exporter);

                //shroomlight
                DoorRecipe(ModBlocks2.SHROOMLIGHT_DOOR, (Blocks.SHROOMLIGHT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SHROOMLIGHT_SLAB, (Blocks.SHROOMLIGHT)).offerTo(exporter);
                StairsRecipe(ModBlocks2.SHROOMLIGHT_STAIRS, (Blocks.SHROOMLIGHT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.SHROOMLIGHT_FENCE, (Blocks.SHROOMLIGHT), (ModBlocks2.SHROOMLIGHT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.SHROOMLIGHT_FENCE_GATE, (Blocks.SHROOMLIGHT), (ModBlocks2.SHROOMLIGHT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.SHROOMLIGHT_TRAPDOOR, (ModBlocks2.SHROOMLIGHT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SHROOMLIGHT_PRESSURE_PLATE, (ModBlocks2.SHROOMLIGHT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SHROOMLIGHT_BUTTON, Blocks.SHROOMLIGHT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SHROOMLIGHT_WALL, (Blocks.SHROOMLIGHT)).offerTo(exporter);

                //dried_kelp
                DoorRecipe(ModBlocks2.DRIED_KELP_DOOR, (Blocks.DRIED_KELP_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DRIED_KELP_SLAB, (Blocks.DRIED_KELP_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DRIED_KELP_STAIRS, (Blocks.DRIED_KELP_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DRIED_KELP_FENCE, (Blocks.DRIED_KELP_BLOCK), (ModBlocks2.DRIED_KELP_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DRIED_KELP_FENCE_GATE, (Blocks.DRIED_KELP_BLOCK), (ModBlocks2.DRIED_KELP_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DRIED_KELP_TRAPDOOR, (ModBlocks2.DRIED_KELP_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DRIED_KELP_PRESSURE_PLATE, (ModBlocks2.DRIED_KELP_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DRIED_KELP_BUTTON, Blocks.DRIED_KELP_BLOCK).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DRIED_KELP_WALL, (Blocks.DRIED_KELP_BLOCK)).offerTo(exporter);

                //tube_coral
                DoorRecipe(ModBlocks2.TUBE_CORAL_DOOR, (Blocks.TUBE_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TUBE_CORAL_SLAB, (Blocks.TUBE_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.TUBE_CORAL_STAIRS, (Blocks.TUBE_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.TUBE_CORAL_FENCE, (Blocks.TUBE_CORAL_BLOCK), (ModBlocks2.TUBE_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.TUBE_CORAL_FENCE_GATE, (Blocks.TUBE_CORAL_BLOCK), (ModBlocks2.TUBE_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.TUBE_CORAL_TRAPDOOR, (ModBlocks2.TUBE_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TUBE_CORAL_PRESSURE_PLATE, (ModBlocks2.TUBE_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TUBE_CORAL_BUTTON, Blocks.TUBE_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TUBE_CORAL_WALL, (Blocks.TUBE_CORAL_BLOCK)).offerTo(exporter);

                //dead_tube_coral
                DoorRecipe(ModBlocks2.DEAD_TUBE_CORAL_DOOR, (Blocks.DEAD_TUBE_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_TUBE_CORAL_SLAB, (Blocks.DEAD_TUBE_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEAD_TUBE_CORAL_STAIRS, (Blocks.DEAD_TUBE_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEAD_TUBE_CORAL_FENCE, (Blocks.DEAD_TUBE_CORAL_BLOCK), (ModBlocks2.DEAD_TUBE_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEAD_TUBE_CORAL_FENCE_GATE, (Blocks.DEAD_TUBE_CORAL_BLOCK), (ModBlocks2.DEAD_TUBE_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEAD_TUBE_CORAL_TRAPDOOR, (ModBlocks2.DEAD_TUBE_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_TUBE_CORAL_PRESSURE_PLATE, (ModBlocks2.DEAD_TUBE_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_TUBE_CORAL_BUTTON, Blocks.DEAD_TUBE_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_TUBE_CORAL_WALL, (Blocks.DEAD_TUBE_CORAL_BLOCK)).offerTo(exporter);

                //brain_coral
                DoorRecipe(ModBlocks2.BRAIN_CORAL_DOOR, (Blocks.BRAIN_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BRAIN_CORAL_SLAB, (Blocks.BRAIN_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.BRAIN_CORAL_STAIRS, (Blocks.BRAIN_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.BRAIN_CORAL_FENCE, (Blocks.BRAIN_CORAL_BLOCK), (ModBlocks2.BRAIN_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.BRAIN_CORAL_FENCE_GATE, (Blocks.BRAIN_CORAL_BLOCK), (ModBlocks2.BRAIN_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.BRAIN_CORAL_TRAPDOOR, (ModBlocks2.BRAIN_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BRAIN_CORAL_PRESSURE_PLATE, (ModBlocks2.BRAIN_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BRAIN_CORAL_BUTTON, Blocks.BRAIN_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BRAIN_CORAL_WALL, (Blocks.BRAIN_CORAL_BLOCK)).offerTo(exporter);

                //dead_brain_coral
                DoorRecipe(ModBlocks2.DEAD_BRAIN_CORAL_DOOR, (Blocks.DEAD_BRAIN_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BRAIN_CORAL_SLAB, (Blocks.DEAD_BRAIN_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEAD_BRAIN_CORAL_STAIRS, (Blocks.DEAD_BRAIN_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEAD_BRAIN_CORAL_FENCE, (Blocks.DEAD_BRAIN_CORAL_BLOCK), (ModBlocks2.DEAD_BRAIN_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEAD_BRAIN_CORAL_FENCE_GATE, (Blocks.DEAD_BRAIN_CORAL_BLOCK), (ModBlocks2.DEAD_BRAIN_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEAD_BRAIN_CORAL_TRAPDOOR, (ModBlocks2.DEAD_BRAIN_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BRAIN_CORAL_PRESSURE_PLATE, (ModBlocks2.DEAD_BRAIN_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BRAIN_CORAL_BUTTON, Blocks.DEAD_BRAIN_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BRAIN_CORAL_WALL, (Blocks.DEAD_BRAIN_CORAL_BLOCK)).offerTo(exporter);

                //bubble_coral
                DoorRecipe(ModBlocks2.BUBBLE_CORAL_DOOR, (Blocks.BUBBLE_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BUBBLE_CORAL_SLAB, (Blocks.BUBBLE_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.BUBBLE_CORAL_STAIRS, (Blocks.BUBBLE_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.BUBBLE_CORAL_FENCE, (Blocks.BUBBLE_CORAL_BLOCK), (ModBlocks2.BUBBLE_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.BUBBLE_CORAL_FENCE_GATE, (Blocks.BUBBLE_CORAL_BLOCK), (ModBlocks2.BUBBLE_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.BUBBLE_CORAL_TRAPDOOR, (ModBlocks2.BUBBLE_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BUBBLE_CORAL_PRESSURE_PLATE, (ModBlocks2.BUBBLE_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BUBBLE_CORAL_BUTTON, Blocks.BUBBLE_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BUBBLE_CORAL_WALL, (Blocks.BUBBLE_CORAL_BLOCK)).offerTo(exporter);

                //dead_bubble_coral
                DoorRecipe(ModBlocks2.DEAD_BUBBLE_CORAL_DOOR, (Blocks.DEAD_BUBBLE_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BUBBLE_CORAL_SLAB, (Blocks.DEAD_BUBBLE_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEAD_BUBBLE_CORAL_STAIRS, (Blocks.DEAD_BUBBLE_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEAD_BUBBLE_CORAL_FENCE, (Blocks.DEAD_BUBBLE_CORAL_BLOCK), (ModBlocks2.DEAD_BUBBLE_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEAD_BUBBLE_CORAL_FENCE_GATE, (Blocks.DEAD_BUBBLE_CORAL_BLOCK), (ModBlocks2.DEAD_BUBBLE_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEAD_BUBBLE_CORAL_TRAPDOOR, (ModBlocks2.DEAD_BUBBLE_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BUBBLE_CORAL_PRESSURE_PLATE, (ModBlocks2.DEAD_BUBBLE_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BUBBLE_CORAL_BUTTON, Blocks.DEAD_BUBBLE_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_BUBBLE_CORAL_WALL, (Blocks.DEAD_BUBBLE_CORAL_BLOCK)).offerTo(exporter);

                //fire_coral
                DoorRecipe(ModBlocks2.FIRE_CORAL_DOOR, (Blocks.FIRE_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FIRE_CORAL_SLAB, (Blocks.FIRE_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.FIRE_CORAL_STAIRS, (Blocks.FIRE_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.FIRE_CORAL_FENCE, (Blocks.FIRE_CORAL_BLOCK), (ModBlocks2.FIRE_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.FIRE_CORAL_FENCE_GATE, (Blocks.FIRE_CORAL_BLOCK), (ModBlocks2.FIRE_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.FIRE_CORAL_TRAPDOOR, (ModBlocks2.FIRE_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FIRE_CORAL_PRESSURE_PLATE, (ModBlocks2.FIRE_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FIRE_CORAL_BUTTON, Blocks.FIRE_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.FIRE_CORAL_WALL, (Blocks.FIRE_CORAL_BLOCK)).offerTo(exporter);

                //dead_fire_coral
                DoorRecipe(ModBlocks2.DEAD_FIRE_CORAL_DOOR, (Blocks.DEAD_FIRE_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_FIRE_CORAL_SLAB, (Blocks.DEAD_FIRE_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEAD_FIRE_CORAL_STAIRS, (Blocks.DEAD_FIRE_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEAD_FIRE_CORAL_FENCE, (Blocks.DEAD_FIRE_CORAL_BLOCK), (ModBlocks2.DEAD_FIRE_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEAD_FIRE_CORAL_FENCE_GATE, (Blocks.DEAD_FIRE_CORAL_BLOCK), (ModBlocks2.DEAD_FIRE_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEAD_FIRE_CORAL_TRAPDOOR, (ModBlocks2.DEAD_FIRE_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_FIRE_CORAL_PRESSURE_PLATE, (ModBlocks2.DEAD_FIRE_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_FIRE_CORAL_BUTTON, Blocks.DEAD_FIRE_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_FIRE_CORAL_WALL, (Blocks.DEAD_FIRE_CORAL_BLOCK)).offerTo(exporter);

                //horn_coral
                DoorRecipe(ModBlocks2.HORN_CORAL_DOOR, (Blocks.HORN_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HORN_CORAL_SLAB, (Blocks.HORN_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.HORN_CORAL_STAIRS, (Blocks.HORN_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.HORN_CORAL_FENCE, (Blocks.HORN_CORAL_BLOCK), (ModBlocks2.HORN_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.HORN_CORAL_FENCE_GATE, (Blocks.HORN_CORAL_BLOCK), (ModBlocks2.HORN_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.HORN_CORAL_TRAPDOOR, (ModBlocks2.HORN_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HORN_CORAL_PRESSURE_PLATE, (ModBlocks2.HORN_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HORN_CORAL_BUTTON, Blocks.HORN_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HORN_CORAL_WALL, (Blocks.HORN_CORAL_BLOCK)).offerTo(exporter);

                //dead_horn_coral
                DoorRecipe(ModBlocks2.DEAD_HORN_CORAL_DOOR, (Blocks.DEAD_HORN_CORAL_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_HORN_CORAL_SLAB, (Blocks.DEAD_HORN_CORAL_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.DEAD_HORN_CORAL_STAIRS, (Blocks.DEAD_HORN_CORAL_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.DEAD_HORN_CORAL_FENCE, (Blocks.DEAD_HORN_CORAL_BLOCK), (ModBlocks2.DEAD_HORN_CORAL_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.DEAD_HORN_CORAL_FENCE_GATE, (Blocks.DEAD_HORN_CORAL_BLOCK), (ModBlocks2.DEAD_HORN_CORAL_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.DEAD_HORN_CORAL_TRAPDOOR, (ModBlocks2.DEAD_HORN_CORAL_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_HORN_CORAL_PRESSURE_PLATE, (ModBlocks2.DEAD_HORN_CORAL_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_HORN_CORAL_BUTTON, Blocks.DEAD_HORN_CORAL_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.DEAD_HORN_CORAL_WALL, (Blocks.DEAD_HORN_CORAL_BLOCK)).offerTo(exporter);

                //sponge
                DoorRecipe(ModBlocks2.SPONGE_DOOR, (Blocks.SPONGE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPONGE_SLAB, (Blocks.SPONGE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.SPONGE_STAIRS, (Blocks.SPONGE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.SPONGE_FENCE, (Blocks.SPONGE), (ModBlocks2.SPONGE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.SPONGE_FENCE_GATE, (Blocks.SPONGE), (ModBlocks2.SPONGE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.SPONGE_TRAPDOOR, (ModBlocks2.SPONGE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPONGE_PRESSURE_PLATE, (ModBlocks2.SPONGE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPONGE_BUTTON, Blocks.SPONGE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SPONGE_WALL, (Blocks.SPONGE)).offerTo(exporter);

                //wet_sponge
                DoorRecipe(ModBlocks2.WET_SPONGE_DOOR, (Blocks.WET_SPONGE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WET_SPONGE_SLAB, (Blocks.WET_SPONGE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WET_SPONGE_STAIRS, (Blocks.WET_SPONGE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WET_SPONGE_FENCE, (Blocks.WET_SPONGE), (ModBlocks2.WET_SPONGE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WET_SPONGE_FENCE_GATE, (Blocks.WET_SPONGE), (ModBlocks2.WET_SPONGE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WET_SPONGE_TRAPDOOR, (ModBlocks2.WET_SPONGE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WET_SPONGE_PRESSURE_PLATE, (ModBlocks2.WET_SPONGE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WET_SPONGE_BUTTON, Blocks.WET_SPONGE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WET_SPONGE_WALL, (Blocks.WET_SPONGE)).offerTo(exporter);

                //melon
                DoorRecipe(ModBlocks2.MELON_DOOR, (Blocks.MELON)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MELON_SLAB, (Blocks.MELON)).offerTo(exporter);
                StairsRecipe(ModBlocks2.MELON_STAIRS, (Blocks.MELON)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.MELON_FENCE, (Blocks.MELON), (ModBlocks2.MELON_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.MELON_FENCE_GATE, (Blocks.MELON), (ModBlocks2.MELON_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.MELON_TRAPDOOR, (ModBlocks2.MELON_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MELON_PRESSURE_PLATE, (ModBlocks2.MELON_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MELON_BUTTON, Blocks.MELON).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.MELON_WALL, (Blocks.MELON)).offerTo(exporter);

                //pumpkin
                DoorRecipe(ModBlocks2.PUMPKIN_DOOR, (Blocks.PUMPKIN)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PUMPKIN_SLAB, (Blocks.PUMPKIN)).offerTo(exporter);
                StairsRecipe(ModBlocks2.PUMPKIN_STAIRS, (Blocks.PUMPKIN)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.PUMPKIN_FENCE, (Blocks.PUMPKIN), (ModBlocks2.PUMPKIN_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.PUMPKIN_FENCE_GATE, (Blocks.PUMPKIN), (ModBlocks2.PUMPKIN_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.PUMPKIN_TRAPDOOR, (ModBlocks2.PUMPKIN_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PUMPKIN_PRESSURE_PLATE, (ModBlocks2.PUMPKIN_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PUMPKIN_BUTTON, Blocks.PUMPKIN).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PUMPKIN_WALL, (Blocks.PUMPKIN)).offerTo(exporter);

                //hay_block
                DoorRecipe(ModBlocks2.HAY_BLOCK_DOOR, (Blocks.HAY_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HAY_BLOCK_SLAB, (Blocks.HAY_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.HAY_BLOCK_STAIRS, (Blocks.HAY_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.HAY_BLOCK_FENCE, (Blocks.HAY_BLOCK), (ModBlocks2.HAY_BLOCK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.HAY_BLOCK_FENCE_GATE, (Blocks.HAY_BLOCK), (ModBlocks2.HAY_BLOCK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.HAY_BLOCK_TRAPDOOR, (ModBlocks2.HAY_BLOCK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HAY_BLOCK_PRESSURE_PLATE, (ModBlocks2.HAY_BLOCK_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HAY_BLOCK_BUTTON, Blocks.HAY_BLOCK).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HAY_BLOCK_WALL, (Blocks.HAY_BLOCK)).offerTo(exporter);

                //honeycomb
                DoorRecipe(ModBlocks2.HONEYCOMB_DOOR, (Blocks.HONEYCOMB_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEYCOMB_SLAB, (Blocks.HONEYCOMB_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.HONEYCOMB_STAIRS, (Blocks.HONEYCOMB_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.HONEYCOMB_FENCE, (Blocks.HONEYCOMB_BLOCK), (ModBlocks2.HONEYCOMB_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.HONEYCOMB_FENCE_GATE, (Blocks.HONEYCOMB_BLOCK), (ModBlocks2.HONEYCOMB_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.HONEYCOMB_TRAPDOOR, (ModBlocks2.HONEYCOMB_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEYCOMB_PRESSURE_PLATE, (ModBlocks2.HONEYCOMB_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEYCOMB_BUTTON, Blocks.HONEYCOMB_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEYCOMB_WALL, (Blocks.HONEYCOMB_BLOCK)).offerTo(exporter);

                //SLIME
                DoorRecipe(ModBlocks2.SLIME_DOOR, (Blocks.SLIME_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SLIME_SLAB, (Blocks.SLIME_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.SLIME_STAIRS, (Blocks.SLIME_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.SLIME_FENCE, (Blocks.SLIME_BLOCK), (ModBlocks2.SLIME_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.SLIME_FENCE_GATE, (Blocks.SLIME_BLOCK), (ModBlocks2.SLIME_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.SLIME_TRAPDOOR, (ModBlocks2.SLIME_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SLIME_PRESSURE_PLATE, (ModBlocks2.SLIME_SLAB)).offerTo(exporter);
                x2ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SLIME_BUTTON, Blocks.SLIME_BLOCK).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SLIME_WALL, (Blocks.SLIME_BLOCK)).offerTo(exporter);

                //HONEY
                DoorRecipe(ModBlocks2.HONEY_DOOR, (Blocks.HONEY_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEY_SLAB, (Blocks.HONEY_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.HONEY_STAIRS, (Blocks.HONEY_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.HONEY_FENCE, (Blocks.HONEY_BLOCK), (ModBlocks2.HONEY_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.HONEY_FENCE_GATE, (Blocks.HONEY_BLOCK), (ModBlocks2.HONEY_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.HONEY_TRAPDOOR, (ModBlocks2.HONEY_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEY_PRESSURE_PLATE, (ModBlocks2.HONEY_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEY_BUTTON, Blocks.HONEY_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.HONEY_WALL, (Blocks.HONEY_BLOCK)).offerTo(exporter);

                //RESIN
                DoorRecipe(ModBlocks2.RESIN_DOOR, (Blocks.RESIN_BLOCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RESIN_SLAB, (Blocks.RESIN_BLOCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.RESIN_STAIRS, (Blocks.RESIN_BLOCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.RESIN_FENCE, (Blocks.RESIN_BLOCK), (ModBlocks2.RESIN_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.RESIN_FENCE_GATE, (Blocks.RESIN_BLOCK), (ModBlocks2.RESIN_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.RESIN_TRAPDOOR, (ModBlocks2.RESIN_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RESIN_PRESSURE_PLATE, (ModBlocks2.RESIN_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RESIN_BUTTON, Blocks.RESIN_BLOCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.RESIN_WALL, (Blocks.RESIN_BLOCK)).offerTo(exporter);

                //OCHRE_FROGLIGHT
                DoorRecipe(ModBlocks2.OCHRE_FROGLIGHT_DOOR, (Blocks.OCHRE_FROGLIGHT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OCHRE_FROGLIGHT_SLAB, (Blocks.OCHRE_FROGLIGHT)).offerTo(exporter);
                StairsRecipe(ModBlocks2.OCHRE_FROGLIGHT_STAIRS, (Blocks.OCHRE_FROGLIGHT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.OCHRE_FROGLIGHT_FENCE, (Blocks.OCHRE_FROGLIGHT), (ModBlocks2.OCHRE_FROGLIGHT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.OCHRE_FROGLIGHT_FENCE_GATE, (Blocks.OCHRE_FROGLIGHT), (ModBlocks2.OCHRE_FROGLIGHT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.OCHRE_FROGLIGHT_TRAPDOOR, (ModBlocks2.OCHRE_FROGLIGHT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OCHRE_FROGLIGHT_PRESSURE_PLATE, (ModBlocks2.OCHRE_FROGLIGHT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OCHRE_FROGLIGHT_BUTTON, Blocks.OCHRE_FROGLIGHT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OCHRE_FROGLIGHT_WALL, (Blocks.OCHRE_FROGLIGHT)).offerTo(exporter);

                //VERDANT_FROGLIGHT
                DoorRecipe(ModBlocks2.VERDANT_FROGLIGHT_DOOR, (Blocks.VERDANT_FROGLIGHT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.VERDANT_FROGLIGHT_SLAB, (Blocks.VERDANT_FROGLIGHT)).offerTo(exporter);
                StairsRecipe(ModBlocks2.VERDANT_FROGLIGHT_STAIRS, (Blocks.VERDANT_FROGLIGHT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.VERDANT_FROGLIGHT_FENCE, (Blocks.VERDANT_FROGLIGHT), (ModBlocks2.VERDANT_FROGLIGHT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.VERDANT_FROGLIGHT_FENCE_GATE, (Blocks.VERDANT_FROGLIGHT), (ModBlocks2.VERDANT_FROGLIGHT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.VERDANT_FROGLIGHT_TRAPDOOR, (ModBlocks2.VERDANT_FROGLIGHT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.VERDANT_FROGLIGHT_PRESSURE_PLATE, (ModBlocks2.VERDANT_FROGLIGHT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.VERDANT_FROGLIGHT_BUTTON, Blocks.VERDANT_FROGLIGHT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.VERDANT_FROGLIGHT_WALL, (Blocks.VERDANT_FROGLIGHT)).offerTo(exporter);

                //PEARLESCENT_FROGLIGHT
                DoorRecipe(ModBlocks2.PEARLESCENT_FROGLIGHT_DOOR, (Blocks.PEARLESCENT_FROGLIGHT)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PEARLESCENT_FROGLIGHT_SLAB, (Blocks.PEARLESCENT_FROGLIGHT)).offerTo(exporter);
                StairsRecipe(ModBlocks2.PEARLESCENT_FROGLIGHT_STAIRS, (Blocks.PEARLESCENT_FROGLIGHT)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.PEARLESCENT_FROGLIGHT_FENCE, (Blocks.PEARLESCENT_FROGLIGHT), (ModBlocks2.PEARLESCENT_FROGLIGHT_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.PEARLESCENT_FROGLIGHT_FENCE_GATE, (Blocks.PEARLESCENT_FROGLIGHT), (ModBlocks2.PEARLESCENT_FROGLIGHT_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.PEARLESCENT_FROGLIGHT_TRAPDOOR, (ModBlocks2.PEARLESCENT_FROGLIGHT_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PEARLESCENT_FROGLIGHT_PRESSURE_PLATE, (ModBlocks2.PEARLESCENT_FROGLIGHT_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PEARLESCENT_FROGLIGHT_BUTTON, Blocks.PEARLESCENT_FROGLIGHT, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.PEARLESCENT_FROGLIGHT_WALL, (Blocks.PEARLESCENT_FROGLIGHT)).offerTo(exporter);

                //SCULK
                DoorRecipe(ModBlocks2.SCULK_DOOR, (Blocks.SCULK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SCULK_SLAB, (Blocks.SCULK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.SCULK_STAIRS, (Blocks.SCULK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.SCULK_FENCE, (Blocks.SCULK), (ModBlocks2.SCULK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.SCULK_FENCE_GATE, (Blocks.SCULK), (ModBlocks2.SCULK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.SCULK_TRAPDOOR, (ModBlocks2.SCULK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SCULK_PRESSURE_PLATE, (ModBlocks2.SCULK_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SCULK_BUTTON, Blocks.SCULK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.SCULK_WALL, (Blocks.SCULK)).offerTo(exporter);

                //BEDROCK
                DoorRecipe(ModBlocks2.BEDROCK_DOOR, (Blocks.BEDROCK)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BEDROCK_SLAB, (Blocks.BEDROCK)).offerTo(exporter);
                StairsRecipe(ModBlocks2.BEDROCK_STAIRS, (Blocks.BEDROCK)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.BEDROCK_FENCE, (Blocks.BEDROCK), (ModBlocks2.BEDROCK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.BEDROCK_FENCE_GATE, (Blocks.BEDROCK), (ModBlocks2.BEDROCK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.BEDROCK_TRAPDOOR, (ModBlocks2.BEDROCK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BEDROCK_PRESSURE_PLATE, (ModBlocks2.BEDROCK_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BEDROCK_BUTTON, Blocks.BEDROCK, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.BEDROCK_WALL, (Blocks.BEDROCK)).offerTo(exporter);

                //TARGET
                DoorRecipe(ModBlocks2.TARGET_DOOR, (Blocks.TARGET)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TARGET_SLAB, (Blocks.TARGET)).offerTo(exporter);
                StairsRecipe(ModBlocks2.TARGET_STAIRS, (Blocks.TARGET)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.TARGET_FENCE, (Blocks.TARGET), (ModBlocks2.TARGET_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.TARGET_FENCE_GATE, (Blocks.TARGET), (ModBlocks2.TARGET_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.TARGET_TRAPDOOR, (ModBlocks2.TARGET_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TARGET_PRESSURE_PLATE, (ModBlocks2.TARGET_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TARGET_BUTTON, Blocks.TARGET, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TARGET_WALL, (Blocks.TARGET)).offerTo(exporter);

                //chiseled_copper
                DoorRecipe(ModBlocks2.CHISELED_COPPER_DOOR, (Blocks.CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_COPPER_SLAB, (Blocks.CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.CHISELED_COPPER_STAIRS, (Blocks.CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.CHISELED_COPPER_FENCE, (Blocks.CHISELED_COPPER), (ModBlocks2.CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.CHISELED_COPPER_FENCE_GATE, (Blocks.CHISELED_COPPER), (ModBlocks2.CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.CHISELED_COPPER_TRAPDOOR, (ModBlocks2.CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_COPPER_BUTTON, Blocks.CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_COPPER_WALL, (Blocks.CHISELED_COPPER)).offerTo(exporter);

                //exposed_chiseled_copper
                DoorRecipe(ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR, (Blocks.EXPOSED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB, (Blocks.EXPOSED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS, (Blocks.EXPOSED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE, (Blocks.EXPOSED_CHISELED_COPPER), (ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE, (Blocks.EXPOSED_CHISELED_COPPER), (ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON, Blocks.EXPOSED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_CHISELED_COPPER_WALL, (Blocks.EXPOSED_CHISELED_COPPER)).offerTo(exporter);

                //weathered_chiseled_copper
                DoorRecipe(ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR, (Blocks.WEATHERED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB, (Blocks.WEATHERED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS, (Blocks.WEATHERED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE, (Blocks.WEATHERED_CHISELED_COPPER), (ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE, (Blocks.WEATHERED_CHISELED_COPPER), (ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON, Blocks.WEATHERED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_CHISELED_COPPER_WALL, (Blocks.WEATHERED_CHISELED_COPPER)).offerTo(exporter);

                //oxidized_chiseled_copper
                DoorRecipe(ModBlocks2.OXIDIZED_CHISELED_COPPER_DOOR, (Blocks.OXIDIZED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB, (Blocks.OXIDIZED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.OXIDIZED_CHISELED_COPPER_STAIRS, (Blocks.OXIDIZED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE, (Blocks.OXIDIZED_CHISELED_COPPER), (ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE_GATE, (Blocks.OXIDIZED_CHISELED_COPPER), (ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.OXIDIZED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_CHISELED_COPPER_BUTTON, Blocks.OXIDIZED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_CHISELED_COPPER_WALL, (Blocks.OXIDIZED_CHISELED_COPPER)).offerTo(exporter);

                //copper_grate
                DoorRecipe(ModBlocks2.COPPER_GRATE_DOOR, (Blocks.COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_GRATE_SLAB, (Blocks.COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.COPPER_GRATE_STAIRS, (Blocks.COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.COPPER_GRATE_FENCE, (Blocks.COPPER_GRATE), (ModBlocks2.COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.COPPER_GRATE_FENCE_GATE, (Blocks.COPPER_GRATE), (ModBlocks2.COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.COPPER_GRATE_TRAPDOOR, (ModBlocks2.COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_GRATE_BUTTON, Blocks.COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.COPPER_GRATE_WALL, (Blocks.COPPER_GRATE)).offerTo(exporter);

                //exposed_copper_grate
                DoorRecipe(ModBlocks2.EXPOSED_COPPER_GRATE_DOOR, (Blocks.EXPOSED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_COPPER_GRATE_SLAB, (Blocks.EXPOSED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS, (Blocks.EXPOSED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE, (Blocks.EXPOSED_COPPER_GRATE), (ModBlocks2.EXPOSED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE, (Blocks.EXPOSED_COPPER_GRATE), (ModBlocks2.EXPOSED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.EXPOSED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.EXPOSED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON, Blocks.EXPOSED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.EXPOSED_COPPER_GRATE_WALL, (Blocks.EXPOSED_COPPER_GRATE)).offerTo(exporter);

                //weathered_copper_grate
                DoorRecipe(ModBlocks2.WEATHERED_COPPER_GRATE_DOOR, (Blocks.WEATHERED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_COPPER_GRATE_SLAB, (Blocks.WEATHERED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS, (Blocks.WEATHERED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE, (Blocks.WEATHERED_COPPER_GRATE), (ModBlocks2.WEATHERED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE, (Blocks.WEATHERED_COPPER_GRATE), (ModBlocks2.WEATHERED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.WEATHERED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.WEATHERED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON, Blocks.WEATHERED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WEATHERED_COPPER_GRATE_WALL, (Blocks.WEATHERED_COPPER_GRATE)).offerTo(exporter);

                //oxidized_copper_grate
                DoorRecipe(ModBlocks2.OXIDIZED_COPPER_GRATE_DOOR, (Blocks.OXIDIZED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB, (Blocks.OXIDIZED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.OXIDIZED_COPPER_GRATE_STAIRS, (Blocks.OXIDIZED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE, (Blocks.OXIDIZED_COPPER_GRATE), (ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE_GATE, (Blocks.OXIDIZED_COPPER_GRATE), (ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.OXIDIZED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_COPPER_GRATE_BUTTON, Blocks.OXIDIZED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.OXIDIZED_COPPER_GRATE_WALL, (Blocks.OXIDIZED_COPPER_GRATE)).offerTo(exporter);

                //waxed_chiseled_copper
                DoorRecipe(ModBlocks2.WAXED_CHISELED_COPPER_DOOR, (Blocks.WAXED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_CHISELED_COPPER_SLAB, (Blocks.WAXED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_CHISELED_COPPER_STAIRS, (Blocks.WAXED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_CHISELED_COPPER_FENCE, (Blocks.WAXED_CHISELED_COPPER), (ModBlocks2.WAXED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_CHISELED_COPPER_FENCE_GATE, (Blocks.WAXED_CHISELED_COPPER), (ModBlocks2.WAXED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.WAXED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.WAXED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_CHISELED_COPPER_BUTTON, Blocks.WAXED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_CHISELED_COPPER_WALL, (Blocks.WAXED_CHISELED_COPPER)).offerTo(exporter);

                //waxed_exposed_chiseled_copper
                DoorRecipe(ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_DOOR, (Blocks.WAXED_EXPOSED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB, (Blocks.WAXED_EXPOSED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_STAIRS, (Blocks.WAXED_EXPOSED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_FENCE, (Blocks.WAXED_EXPOSED_CHISELED_COPPER), (ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE, (Blocks.WAXED_EXPOSED_CHISELED_COPPER), (ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_BUTTON, Blocks.WAXED_EXPOSED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_WALL, (Blocks.WAXED_EXPOSED_CHISELED_COPPER)).offerTo(exporter);

                //waxed_weathered_chiseled_copper
                DoorRecipe(ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_DOOR, (Blocks.WAXED_WEATHERED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB, (Blocks.WAXED_WEATHERED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_STAIRS, (Blocks.WAXED_WEATHERED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_FENCE, (Blocks.WAXED_WEATHERED_CHISELED_COPPER), (ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE, (Blocks.WAXED_WEATHERED_CHISELED_COPPER), (ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_BUTTON, Blocks.WAXED_WEATHERED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_WALL, (Blocks.WAXED_WEATHERED_CHISELED_COPPER)).offerTo(exporter);

                //waxed_oxidized_chiseled_copper
                DoorRecipe(ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_DOOR, (Blocks.WAXED_OXIDIZED_CHISELED_COPPER)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB, (Blocks.WAXED_OXIDIZED_CHISELED_COPPER)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS, (Blocks.WAXED_OXIDIZED_CHISELED_COPPER)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_FENCE, (Blocks.WAXED_OXIDIZED_CHISELED_COPPER), (ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE, (Blocks.WAXED_OXIDIZED_CHISELED_COPPER), (ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR, (ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE, (ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_CHISELED_COPPER, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_WALL, (Blocks.WAXED_OXIDIZED_CHISELED_COPPER)).offerTo(exporter);

                //waxed_copper_grate
                DoorRecipe(ModBlocks2.WAXED_COPPER_GRATE_DOOR, (Blocks.WAXED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_COPPER_GRATE_SLAB, (Blocks.WAXED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_COPPER_GRATE_STAIRS, (Blocks.WAXED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_COPPER_GRATE_FENCE, (Blocks.WAXED_COPPER_GRATE), (ModBlocks2.WAXED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_COPPER_GRATE_FENCE_GATE, (Blocks.WAXED_COPPER_GRATE), (ModBlocks2.WAXED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.WAXED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.WAXED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_COPPER_GRATE_BUTTON, Blocks.WAXED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_COPPER_GRATE_WALL, (Blocks.WAXED_COPPER_GRATE)).offerTo(exporter);

                //waxed_exposed_copper_grate
                DoorRecipe(ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_DOOR, (Blocks.WAXED_EXPOSED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB, (Blocks.WAXED_EXPOSED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_STAIRS, (Blocks.WAXED_EXPOSED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE, (Blocks.WAXED_EXPOSED_COPPER_GRATE), (ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE, (Blocks.WAXED_EXPOSED_COPPER_GRATE), (ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_BUTTON, Blocks.WAXED_EXPOSED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_WALL, (Blocks.WAXED_EXPOSED_COPPER_GRATE)).offerTo(exporter);

                //waxed_weathered_copper_grate
                DoorRecipe(ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_DOOR, (Blocks.WAXED_WEATHERED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB, (Blocks.WAXED_WEATHERED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_STAIRS, (Blocks.WAXED_WEATHERED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE, (Blocks.WAXED_WEATHERED_COPPER_GRATE), (ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE, (Blocks.WAXED_WEATHERED_COPPER_GRATE), (ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_BUTTON, Blocks.WAXED_WEATHERED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_WALL, (Blocks.WAXED_WEATHERED_COPPER_GRATE)).offerTo(exporter);

                //waxed_oxidized_copper_grate
                DoorRecipe(ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_DOOR, (Blocks.WAXED_OXIDIZED_COPPER_GRATE)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB, (Blocks.WAXED_OXIDIZED_COPPER_GRATE)).offerTo(exporter);
                StairsRecipe(ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_STAIRS, (Blocks.WAXED_OXIDIZED_COPPER_GRATE)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE, (Blocks.WAXED_OXIDIZED_COPPER_GRATE), (ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE, (Blocks.WAXED_OXIDIZED_COPPER_GRATE), (ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR, (ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE, (ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_BUTTON, Blocks.WAXED_OXIDIZED_COPPER_GRATE, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_WALL, (Blocks.WAXED_OXIDIZED_COPPER_GRATE)).offerTo(exporter);

                //chiseled_tuff
                DoorRecipe(ModBlocks2.CHISELED_TUFF_DOOR, (Blocks.CHISELED_TUFF)).offerTo(exporter);
                SlabRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_TUFF_SLAB, (Blocks.CHISELED_TUFF)).offerTo(exporter);
                StairsRecipe(ModBlocks2.CHISELED_TUFF_STAIRS, (Blocks.CHISELED_TUFF)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.CHISELED_TUFF_FENCE, (Blocks.CHISELED_TUFF), (ModBlocks2.CHISELED_TUFF_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.CHISELED_TUFF_FENCE_GATE, (Blocks.CHISELED_TUFF), (ModBlocks2.CHISELED_TUFF_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.CHISELED_TUFF_TRAPDOOR, (ModBlocks2.CHISELED_TUFF_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_TUFF_PRESSURE_PLATE, (ModBlocks2.CHISELED_TUFF_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_TUFF_BUTTON, Blocks.CHISELED_TUFF, 1).offerTo(exporter);
                WallRecipe(RecipeCategory.DECORATIONS, ModBlocks2.CHISELED_TUFF_WALL, (Blocks.CHISELED_TUFF)).offerTo(exporter);

                //polished_tuff
                DoorRecipe(ModBlocks2.POLISHED_TUFF_DOOR, (Blocks.POLISHED_TUFF)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.POLISHED_TUFF_FENCE, (Blocks.POLISHED_TUFF), (Blocks.POLISHED_TUFF_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.POLISHED_TUFF_FENCE_GATE, (Blocks.POLISHED_TUFF), (Blocks.POLISHED_TUFF_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.POLISHED_TUFF_TRAPDOOR, (Blocks.POLISHED_TUFF_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.POLISHED_TUFF_PRESSURE_PLATE, (Blocks.POLISHED_TUFF_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.POLISHED_TUFF_BUTTON, Blocks.POLISHED_TUFF, 1).offerTo(exporter);

                //tuff_bricks
                DoorRecipe(ModBlocks2.TUFF_BRICKS_DOOR, (Blocks.TUFF_BRICKS)).offerTo(exporter);
                NWFenceRecipe(ModBlocks2.TUFF_BRICKS_FENCE, (Blocks.TUFF_BRICKS), (Blocks.TUFF_BRICK_SLAB), 3).offerTo(exporter);
                NWFenceGateRecipe(ModBlocks2.TUFF_BRICKS_FENCE_GATE, (Blocks.TUFF_BRICKS), (Blocks.TUFF_BRICK_SLAB), 1).offerTo(exporter);
                TrapdoorRecipe(ModBlocks2.TUFF_BRICKS_TRAPDOOR, (Blocks.TUFF_BRICK_SLAB)).offerTo(exporter);
                PressPlateRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TUFF_BRICKS_PRESSURE_PLATE, (Blocks.TUFF_BRICK_SLAB)).offerTo(exporter);
                ButtonRecipe(RecipeCategory.DECORATIONS, ModBlocks2.TUFF_BRICKS_BUTTON, Blocks.TUFF_BRICKS, 1).offerTo(exporter);

                //plank_walls
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.OAK_WALL, Blocks.OAK_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_WALL, Blocks.SPRUCE_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_WALL, Blocks.BIRCH_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_WALL, Blocks.JUNGLE_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_WALL, Blocks.ACACIA_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_WALL, Blocks.DARK_OAK_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_WALL, Blocks.MANGROVE_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_WALL, Blocks.CHERRY_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_OAK_WALL, Blocks.PALE_OAK_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_WALL, Blocks.BAMBOO_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_WALL, Blocks.CRIMSON_PLANKS).offerTo(exporter);
                PlankWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.WARPED_WALL, Blocks.WARPED_PLANKS).offerTo(exporter);






                //ingredients
                IngredientRecipe(RecipeCategory.MISC, ModItems.COAL_BIT, Items.COAL)
                        .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.IRON_BIT, Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.GOLD_BIT, Items.GOLD_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.LAPIS_BIT, Items.LAPIS_LAZULI)
                        .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.NETHERITE_BIT, Items.NETHERITE_INGOT)
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.REDSTONE_SHARD, Items.REDSTONE)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.EMERALD_FRAGMENT, Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.DIAMOND_DUST, Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
                IngredientRecipe(RecipeCategory.MISC, ModItems.COPPER_BIT, Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);

            }

            public void generateDyeables(RecipeExporter exporter) {

                //DYEING
                List<Item> dyes = List.of(Items.BLACK_DYE, Items.BLUE_DYE, Items.BROWN_DYE, Items.CYAN_DYE,
                        Items.GRAY_DYE, Items.GREEN_DYE, Items.LIGHT_BLUE_DYE, Items.LIGHT_GRAY_DYE,
                        Items.LIME_DYE, Items.MAGENTA_DYE, Items.ORANGE_DYE, Items.PINK_DYE,
                        Items.PURPLE_DYE, Items.RED_DYE, Items.YELLOW_DYE, Items.WHITE_DYE);
                List<ItemConvertible> dyesIC = List.of(Items.BLACK_DYE, Items.BLUE_DYE, Items.BROWN_DYE, Items.CYAN_DYE,
                        Items.GRAY_DYE, Items.GREEN_DYE, Items.LIGHT_BLUE_DYE, Items.LIGHT_GRAY_DYE,
                        Items.LIME_DYE, Items.MAGENTA_DYE, Items.ORANGE_DYE, Items.PINK_DYE,
                        Items.PURPLE_DYE, Items.RED_DYE, Items.YELLOW_DYE, Items.WHITE_DYE);

                List<Item> wool_stairs = List.of(ModBlocks.BLACK_WOOL_STAIRS.asItem(), ModBlocks.BLUE_WOOL_STAIRS.asItem(), ModBlocks.BROWN_WOOL_STAIRS.asItem(), ModBlocks.CYAN_WOOL_STAIRS.asItem(),
                        ModBlocks.GRAY_WOOL_STAIRS.asItem(), ModBlocks.GREEN_WOOL_STAIRS.asItem(), ModBlocks.LIGHT_BLUE_WOOL_STAIRS.asItem(), ModBlocks.LIGHT_GRAY_WOOL_STAIRS.asItem(),
                        ModBlocks.LIME_WOOL_STAIRS.asItem(), ModBlocks.MAGENTA_WOOL_STAIRS.asItem(), ModBlocks.ORANGE_WOOL_STAIRS.asItem(), ModBlocks.PINK_WOOL_STAIRS.asItem(),
                        ModBlocks.PURPLE_WOOL_STAIRS.asItem(), ModBlocks.RED_WOOL_STAIRS.asItem(), ModBlocks.YELLOW_WOOL_STAIRS.asItem(), ModBlocks.WHITE_WOOL_STAIRS.asItem());
                List<Item> wool_walls = List.of(ModBlocks.BLACK_WOOL_WALL.asItem(), ModBlocks.BLUE_WOOL_WALL.asItem(), ModBlocks.BROWN_WOOL_WALL.asItem(), ModBlocks.CYAN_WOOL_WALL.asItem(),
                        ModBlocks.GRAY_WOOL_WALL.asItem(), ModBlocks.GREEN_WOOL_WALL.asItem(), ModBlocks.LIGHT_BLUE_WOOL_WALL.asItem(), ModBlocks.LIGHT_GRAY_WOOL_WALL.asItem(),
                        ModBlocks.LIME_WOOL_WALL.asItem(), ModBlocks.MAGENTA_WOOL_WALL.asItem(), ModBlocks.ORANGE_WOOL_WALL.asItem(), ModBlocks.PINK_WOOL_WALL.asItem(),
                        ModBlocks.PURPLE_WOOL_WALL.asItem(), ModBlocks.RED_WOOL_WALL.asItem(), ModBlocks.YELLOW_WOOL_WALL.asItem(), ModBlocks.WHITE_WOOL_WALL.asItem());
                List<Item> wool_trapdoors = List.of(ModBlocks.BLACK_WOOL_TRAPDOOR.asItem(), ModBlocks.BLUE_WOOL_TRAPDOOR.asItem(), ModBlocks.BROWN_WOOL_TRAPDOOR.asItem(), ModBlocks.CYAN_WOOL_TRAPDOOR.asItem(),
                        ModBlocks.GRAY_WOOL_TRAPDOOR.asItem(), ModBlocks.GREEN_WOOL_TRAPDOOR.asItem(), ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR.asItem(), ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR.asItem(),
                        ModBlocks.LIME_WOOL_TRAPDOOR.asItem(), ModBlocks.MAGENTA_WOOL_TRAPDOOR.asItem(), ModBlocks.ORANGE_WOOL_TRAPDOOR.asItem(), ModBlocks.PINK_WOOL_TRAPDOOR.asItem(),
                        ModBlocks.PURPLE_WOOL_TRAPDOOR.asItem(), ModBlocks.RED_WOOL_TRAPDOOR.asItem(), ModBlocks.YELLOW_WOOL_TRAPDOOR.asItem(), ModBlocks.WHITE_WOOL_TRAPDOOR.asItem());
                List<Item> wool_doors = List.of(ModBlocks.BLACK_WOOL_DOOR.asItem(), ModBlocks.BLUE_WOOL_DOOR.asItem(), ModBlocks.BROWN_WOOL_DOOR.asItem(), ModBlocks.CYAN_WOOL_DOOR.asItem(),
                        ModBlocks.GRAY_WOOL_DOOR.asItem(), ModBlocks.GREEN_WOOL_DOOR.asItem(), ModBlocks.LIGHT_BLUE_WOOL_DOOR.asItem(), ModBlocks.LIGHT_GRAY_WOOL_DOOR.asItem(),
                        ModBlocks.LIME_WOOL_DOOR.asItem(), ModBlocks.MAGENTA_WOOL_DOOR.asItem(), ModBlocks.ORANGE_WOOL_DOOR.asItem(), ModBlocks.PINK_WOOL_DOOR.asItem(),
                        ModBlocks.PURPLE_WOOL_DOOR.asItem(), ModBlocks.RED_WOOL_DOOR.asItem(), ModBlocks.YELLOW_WOOL_DOOR.asItem(), ModBlocks.WHITE_WOOL_DOOR.asItem());
                List<Item> wool_fence_gates = List.of(ModBlocks.BLACK_WOOL_FENCE_GATE.asItem(), ModBlocks.BLUE_WOOL_FENCE_GATE.asItem(), ModBlocks.BROWN_WOOL_FENCE_GATE.asItem(), ModBlocks.CYAN_WOOL_FENCE_GATE.asItem(),
                        ModBlocks.GRAY_WOOL_FENCE_GATE.asItem(), ModBlocks.GREEN_WOOL_FENCE_GATE.asItem(), ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE.asItem(), ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE.asItem(),
                        ModBlocks.LIME_WOOL_FENCE_GATE.asItem(), ModBlocks.MAGENTA_WOOL_FENCE_GATE.asItem(), ModBlocks.ORANGE_WOOL_FENCE_GATE.asItem(), ModBlocks.PINK_WOOL_FENCE_GATE.asItem(),
                        ModBlocks.PURPLE_WOOL_FENCE_GATE.asItem(), ModBlocks.RED_WOOL_FENCE_GATE.asItem(), ModBlocks.YELLOW_WOOL_FENCE_GATE.asItem(), ModBlocks.WHITE_WOOL_FENCE_GATE.asItem());
                List<Item> wool_fences = List.of(ModBlocks.BLACK_WOOL_FENCE.asItem(), ModBlocks.BLUE_WOOL_FENCE.asItem(), ModBlocks.BROWN_WOOL_FENCE.asItem(), ModBlocks.CYAN_WOOL_FENCE.asItem(),
                        ModBlocks.GRAY_WOOL_FENCE.asItem(), ModBlocks.GREEN_WOOL_FENCE.asItem(), ModBlocks.LIGHT_BLUE_WOOL_FENCE.asItem(), ModBlocks.LIGHT_GRAY_WOOL_FENCE.asItem(),
                        ModBlocks.LIME_WOOL_FENCE.asItem(), ModBlocks.MAGENTA_WOOL_FENCE.asItem(), ModBlocks.ORANGE_WOOL_FENCE.asItem(), ModBlocks.PINK_WOOL_FENCE.asItem(),
                        ModBlocks.PURPLE_WOOL_FENCE.asItem(), ModBlocks.RED_WOOL_FENCE.asItem(), ModBlocks.YELLOW_WOOL_FENCE.asItem(), ModBlocks.WHITE_WOOL_FENCE.asItem());
                List<Item> wool_pressure_plates = List.of(ModBlocks.BLACK_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.BLUE_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.BROWN_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.CYAN_WOOL_PRESSURE_PLATE.asItem(),
                        ModBlocks.GRAY_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.GREEN_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE.asItem(),
                        ModBlocks.LIME_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.ORANGE_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.PINK_WOOL_PRESSURE_PLATE.asItem(),
                        ModBlocks.PURPLE_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.RED_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.YELLOW_WOOL_PRESSURE_PLATE.asItem(), ModBlocks.WHITE_WOOL_PRESSURE_PLATE.asItem());
                List<Item> wool_slabs = List.of(ModBlocks.BLACK_WOOL_SLAB.asItem(), ModBlocks.BLUE_WOOL_SLAB.asItem(), ModBlocks.BROWN_WOOL_SLAB.asItem(), ModBlocks.CYAN_WOOL_SLAB.asItem(),
                        ModBlocks.GRAY_WOOL_SLAB.asItem(), ModBlocks.GREEN_WOOL_SLAB.asItem(), ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem(), ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem(),
                        ModBlocks.LIME_WOOL_SLAB.asItem(), ModBlocks.MAGENTA_WOOL_SLAB.asItem(), ModBlocks.ORANGE_WOOL_SLAB.asItem(), ModBlocks.PINK_WOOL_SLAB.asItem(),
                        ModBlocks.PURPLE_WOOL_SLAB.asItem(), ModBlocks.RED_WOOL_SLAB.asItem(), ModBlocks.YELLOW_WOOL_SLAB.asItem(), ModBlocks.WHITE_WOOL_SLAB.asItem());
                List<Item> wool_buttons = List.of(ModBlocks.BLACK_WOOL_BUTTON.asItem(), ModBlocks.BLUE_WOOL_BUTTON.asItem(), ModBlocks.BROWN_WOOL_BUTTON.asItem(), ModBlocks.CYAN_WOOL_BUTTON.asItem(),
                        ModBlocks.GRAY_WOOL_BUTTON.asItem(), ModBlocks.GREEN_WOOL_BUTTON.asItem(), ModBlocks.LIGHT_BLUE_WOOL_BUTTON.asItem(), ModBlocks.LIGHT_GRAY_WOOL_BUTTON.asItem(),
                        ModBlocks.LIME_WOOL_BUTTON.asItem(), ModBlocks.MAGENTA_WOOL_BUTTON.asItem(), ModBlocks.ORANGE_WOOL_BUTTON.asItem(), ModBlocks.PINK_WOOL_BUTTON.asItem(),
                        ModBlocks.PURPLE_WOOL_BUTTON.asItem(), ModBlocks.RED_WOOL_BUTTON.asItem(), ModBlocks.YELLOW_WOOL_BUTTON.asItem(), ModBlocks.WHITE_WOOL_BUTTON.asItem());

                List<ItemConvertible> stained_glass_stairs = List.of(ModBlocks.BLACK_STAINED_GLASS_STAIRS, ModBlocks.BLUE_STAINED_GLASS_STAIRS, ModBlocks.BROWN_STAINED_GLASS_STAIRS, ModBlocks.CYAN_STAINED_GLASS_STAIRS,
                        ModBlocks.GRAY_STAINED_GLASS_STAIRS, ModBlocks.GREEN_STAINED_GLASS_STAIRS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,
                        ModBlocks.LIME_STAINED_GLASS_STAIRS, ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, ModBlocks.ORANGE_STAINED_GLASS_STAIRS, ModBlocks.PINK_STAINED_GLASS_STAIRS,
                        ModBlocks.PURPLE_STAINED_GLASS_STAIRS, ModBlocks.RED_STAINED_GLASS_STAIRS, ModBlocks.YELLOW_STAINED_GLASS_STAIRS, ModBlocks.WHITE_STAINED_GLASS_STAIRS);
                List<ItemConvertible> stained_glass_walls = List.of(ModBlocks.BLACK_STAINED_GLASS_WALL, ModBlocks.BLUE_STAINED_GLASS_WALL, ModBlocks.BROWN_STAINED_GLASS_WALL, ModBlocks.CYAN_STAINED_GLASS_WALL,
                        ModBlocks.GRAY_STAINED_GLASS_WALL, ModBlocks.GREEN_STAINED_GLASS_WALL, ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL,
                        ModBlocks.LIME_STAINED_GLASS_WALL, ModBlocks.MAGENTA_STAINED_GLASS_WALL, ModBlocks.ORANGE_STAINED_GLASS_WALL, ModBlocks.PINK_STAINED_GLASS_WALL,
                        ModBlocks.PURPLE_STAINED_GLASS_WALL, ModBlocks.RED_STAINED_GLASS_WALL, ModBlocks.YELLOW_STAINED_GLASS_WALL, ModBlocks.WHITE_STAINED_GLASS_WALL);
                List<ItemConvertible> stained_glass_trapdoors = List.of(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR, ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR, ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR, ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR,
                        ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR, ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR, ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR,
                        ModBlocks.LIME_STAINED_GLASS_TRAPDOOR, ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR, ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR, ModBlocks.PINK_STAINED_GLASS_TRAPDOOR,
                        ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR, ModBlocks.RED_STAINED_GLASS_TRAPDOOR, ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR, ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR);
                List<ItemConvertible> stained_glass_doors = List.of(ModBlocks.BLACK_STAINED_GLASS_DOOR, ModBlocks.BLUE_STAINED_GLASS_DOOR, ModBlocks.BROWN_STAINED_GLASS_DOOR, ModBlocks.CYAN_STAINED_GLASS_DOOR,
                        ModBlocks.GRAY_STAINED_GLASS_DOOR, ModBlocks.GREEN_STAINED_GLASS_DOOR, ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR, ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR,
                        ModBlocks.LIME_STAINED_GLASS_DOOR, ModBlocks.MAGENTA_STAINED_GLASS_DOOR, ModBlocks.ORANGE_STAINED_GLASS_DOOR, ModBlocks.PINK_STAINED_GLASS_DOOR,
                        ModBlocks.PURPLE_STAINED_GLASS_DOOR, ModBlocks.RED_STAINED_GLASS_DOOR, ModBlocks.YELLOW_STAINED_GLASS_DOOR, ModBlocks.WHITE_STAINED_GLASS_DOOR);
                List<ItemConvertible> stained_glass_fence_gates = List.of(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE, ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE, ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE, ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE,
                        ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE, ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE, ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE, ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE,
                        ModBlocks.LIME_STAINED_GLASS_FENCE_GATE, ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE, ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE, ModBlocks.PINK_STAINED_GLASS_FENCE_GATE,
                        ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE, ModBlocks.RED_STAINED_GLASS_FENCE_GATE, ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE, ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
                List<ItemConvertible> stained_glass_fences = List.of(ModBlocks.BLACK_STAINED_GLASS_FENCE, ModBlocks.BLUE_STAINED_GLASS_FENCE, ModBlocks.BROWN_STAINED_GLASS_FENCE, ModBlocks.CYAN_STAINED_GLASS_FENCE,
                        ModBlocks.GRAY_STAINED_GLASS_FENCE, ModBlocks.GREEN_STAINED_GLASS_FENCE, ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE, ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE,
                        ModBlocks.LIME_STAINED_GLASS_FENCE, ModBlocks.MAGENTA_STAINED_GLASS_FENCE, ModBlocks.ORANGE_STAINED_GLASS_FENCE, ModBlocks.PINK_STAINED_GLASS_FENCE,
                        ModBlocks.PURPLE_STAINED_GLASS_FENCE, ModBlocks.RED_STAINED_GLASS_FENCE, ModBlocks.YELLOW_STAINED_GLASS_FENCE, ModBlocks.WHITE_STAINED_GLASS_FENCE);
                List<ItemConvertible> stained_glass_pressure_plates = List.of(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE,
                        ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE,
                        ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE,
                        ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE, ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
                List<ItemConvertible> stained_glass_slabs = List.of(ModBlocks.BLACK_STAINED_GLASS_SLAB, ModBlocks.BLUE_STAINED_GLASS_SLAB, ModBlocks.BROWN_STAINED_GLASS_SLAB, ModBlocks.CYAN_STAINED_GLASS_SLAB,
                        ModBlocks.GRAY_STAINED_GLASS_SLAB, ModBlocks.GREEN_STAINED_GLASS_SLAB, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,
                        ModBlocks.LIME_STAINED_GLASS_SLAB, ModBlocks.MAGENTA_STAINED_GLASS_SLAB, ModBlocks.ORANGE_STAINED_GLASS_SLAB, ModBlocks.PINK_STAINED_GLASS_SLAB,
                        ModBlocks.PURPLE_STAINED_GLASS_SLAB, ModBlocks.RED_STAINED_GLASS_SLAB, ModBlocks.YELLOW_STAINED_GLASS_SLAB, ModBlocks.WHITE_STAINED_GLASS_SLAB);
                List<ItemConvertible> stained_glass_buttons = List.of(ModBlocks.BLACK_STAINED_GLASS_BUTTON, ModBlocks.BLUE_STAINED_GLASS_BUTTON, ModBlocks.BROWN_STAINED_GLASS_BUTTON, ModBlocks.CYAN_STAINED_GLASS_BUTTON,
                        ModBlocks.GRAY_STAINED_GLASS_BUTTON, ModBlocks.GREEN_STAINED_GLASS_BUTTON, ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON, ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON,
                        ModBlocks.LIME_STAINED_GLASS_BUTTON, ModBlocks.MAGENTA_STAINED_GLASS_BUTTON, ModBlocks.ORANGE_STAINED_GLASS_BUTTON, ModBlocks.PINK_STAINED_GLASS_BUTTON,
                        ModBlocks.PURPLE_STAINED_GLASS_BUTTON, ModBlocks.RED_STAINED_GLASS_BUTTON, ModBlocks.YELLOW_STAINED_GLASS_BUTTON, ModBlocks.WHITE_STAINED_GLASS_BUTTON);



                offerDyeableRecipes(dyes, wool_stairs, "stairs", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_slabs, "slab", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_doors, "door", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_fences, "fence", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_fence_gates, "fence_gate", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_pressure_plates, "pressure_plate", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_trapdoors, "trapdoor", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_buttons, "button", RecipeCategory.DECORATIONS);
                offerDyeableRecipes(dyes, wool_walls, "wall", RecipeCategory.DECORATIONS);

                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_stairs, "stairs");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_slabs, "slab");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_doors, "door");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_fences, "fence");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_fence_gates, "fence_gate");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_pressure_plates, "pressure_plate");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_trapdoors, "trapdoor");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_buttons, "button");
                offerStainedGlassDyeingRecipe(exporter, dyesIC, stained_glass_walls, "wall");



            }

            public void generateSmeltables(RecipeExporter exporter) {

                List<ItemConvertible> clay = List.of(ModBlocks.CLAY_SLAB, ModBlocks.CLAY_STAIRS, ModBlocks.CLAY_BUTTON, ModBlocks.CLAY_PRESSURE_PLATE,
                        ModBlocks.CLAY_DOOR, ModBlocks.CLAY_TRAPDOOR, ModBlocks.CLAY_FENCE, ModBlocks.CLAY_FENCE_GATE, ModBlocks.CLAY_WALL);

                List<ItemConvertible> terracotta = List.of(ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_STAIRS, ModBlocks.TERRACOTTA_BUTTON, ModBlocks.TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.TERRACOTTA_DOOR, ModBlocks.TERRACOTTA_TRAPDOOR, ModBlocks.TERRACOTTA_FENCE, ModBlocks.TERRACOTTA_FENCE_GATE, ModBlocks.TERRACOTTA_WALL);

                List<ItemConvertible> cobbled_deepslate = List.of(Blocks.COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE_STAIRS, ModBlocks.COBBLED_DEEPSLATE_BUTTON, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE,
                        ModBlocks.COBBLED_DEEPSLATE_DOOR, ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR, ModBlocks.COBBLED_DEEPSLATE_FENCE, ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE, Blocks.COBBLED_DEEPSLATE_WALL);

                List<ItemConvertible> deepslate = List.of(ModBlocks.DEEPSLATE_SLAB, ModBlocks.DEEPSLATE_STAIRS, ModBlocks.DEEPSLATE_BUTTON, ModBlocks.DEEPSLATE_PRESSURE_PLATE,
                        ModBlocks.DEEPSLATE_DOOR, ModBlocks.DEEPSLATE_TRAPDOOR, ModBlocks.DEEPSLATE_FENCE, ModBlocks.DEEPSLATE_FENCE_GATE, ModBlocks.DEEPSLATE_WALL);

                List<ItemConvertible> basalt = List.of(ModBlocks.BASALT_SLAB, ModBlocks.BASALT_STAIRS, ModBlocks.BASALT_BUTTON, ModBlocks.BASALT_PRESSURE_PLATE,
                        ModBlocks.BASALT_DOOR, ModBlocks.BASALT_TRAPDOOR, ModBlocks.BASALT_FENCE, ModBlocks.BASALT_FENCE_GATE, ModBlocks.BASALT_WALL);

                List<ItemConvertible> smooth_basalt = List.of(ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.SMOOTH_BASALT_BUTTON, ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE,
                        ModBlocks.SMOOTH_BASALT_DOOR, ModBlocks.SMOOTH_BASALT_TRAPDOOR, ModBlocks.SMOOTH_BASALT_FENCE, ModBlocks.SMOOTH_BASALT_FENCE_GATE, ModBlocks.SMOOTH_BASALT_WALL);

                List<ItemConvertible> ancient_debris = List.of(ModBlocks2.ANCIENT_DEBRIS_SLAB, ModBlocks2.ANCIENT_DEBRIS_STAIRS, ModBlocks2.ANCIENT_DEBRIS_BUTTON, ModBlocks2.ANCIENT_DEBRIS_PRESSURE_PLATE,
                        ModBlocks2.ANCIENT_DEBRIS_DOOR, ModBlocks2.ANCIENT_DEBRIS_TRAPDOOR, ModBlocks2.ANCIENT_DEBRIS_FENCE, ModBlocks2.ANCIENT_DEBRIS_FENCE_GATE, ModBlocks2.ANCIENT_DEBRIS_WALL);



                List<ItemConvertible> black_terracotta = List.of(ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_BUTTON, ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.BLACK_TERRACOTTA_DOOR, ModBlocks.BLACK_TERRACOTTA_TRAPDOOR, ModBlocks.BLACK_TERRACOTTA_FENCE, ModBlocks.BLACK_TERRACOTTA_FENCE_GATE, ModBlocks.BLACK_TERRACOTTA_WALL);

                List<ItemConvertible> black_glazed_terracotta = List.of(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON, ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR, ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE, ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> yellow_terracotta = List.of(ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_BUTTON, ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.YELLOW_TERRACOTTA_DOOR, ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR, ModBlocks.YELLOW_TERRACOTTA_FENCE, ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE, ModBlocks.YELLOW_TERRACOTTA_WALL);

                List<ItemConvertible> yellow_glazed_terracotta = List.of(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON, ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR, ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE, ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> white_terracotta = List.of(ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_BUTTON, ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.WHITE_TERRACOTTA_DOOR, ModBlocks.WHITE_TERRACOTTA_TRAPDOOR, ModBlocks.WHITE_TERRACOTTA_FENCE, ModBlocks.WHITE_TERRACOTTA_FENCE_GATE, ModBlocks.WHITE_TERRACOTTA_WALL);

                List<ItemConvertible> white_glazed_terracotta = List.of(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON, ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR, ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE, ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> red_terracotta = List.of(ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_BUTTON, ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.RED_TERRACOTTA_DOOR, ModBlocks.RED_TERRACOTTA_TRAPDOOR, ModBlocks.RED_TERRACOTTA_FENCE, ModBlocks.RED_TERRACOTTA_FENCE_GATE, ModBlocks.RED_TERRACOTTA_WALL);

                List<ItemConvertible> red_glazed_terracotta = List.of(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON, ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.RED_GLAZED_TERRACOTTA_DOOR, ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.RED_GLAZED_TERRACOTTA_FENCE, ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> purple_terracotta = List.of(ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_BUTTON, ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.PURPLE_TERRACOTTA_DOOR, ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR, ModBlocks.PURPLE_TERRACOTTA_FENCE, ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE, ModBlocks.PURPLE_TERRACOTTA_WALL);

                List<ItemConvertible> purple_glazed_terracotta = List.of(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON, ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR, ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE, ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> pink_terracotta = List.of(ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_BUTTON, ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.PINK_TERRACOTTA_DOOR, ModBlocks.PINK_TERRACOTTA_TRAPDOOR, ModBlocks.PINK_TERRACOTTA_FENCE, ModBlocks.PINK_TERRACOTTA_FENCE_GATE, ModBlocks.PINK_TERRACOTTA_WALL);

                List<ItemConvertible> pink_glazed_terracotta = List.of(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON, ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR, ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE, ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> orange_terracotta = List.of(ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_BUTTON, ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.ORANGE_TERRACOTTA_DOOR, ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR, ModBlocks.ORANGE_TERRACOTTA_FENCE, ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE, ModBlocks.ORANGE_TERRACOTTA_WALL);

                List<ItemConvertible> orange_glazed_terracotta = List.of(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON, ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR, ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE, ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> magenta_terracotta = List.of(ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_BUTTON, ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.MAGENTA_TERRACOTTA_DOOR, ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR, ModBlocks.MAGENTA_TERRACOTTA_FENCE, ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE, ModBlocks.MAGENTA_TERRACOTTA_WALL);

                List<ItemConvertible> magenta_glazed_terracotta = List.of(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> lime_terracotta = List.of(ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_BUTTON, ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.LIME_TERRACOTTA_DOOR, ModBlocks.LIME_TERRACOTTA_TRAPDOOR, ModBlocks.LIME_TERRACOTTA_FENCE, ModBlocks.LIME_TERRACOTTA_FENCE_GATE, ModBlocks.LIME_TERRACOTTA_WALL);

                List<ItemConvertible> lime_glazed_terracotta = List.of(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON, ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR, ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE, ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> light_gray_terracotta = List.of(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON, ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR, ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR, ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE, ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

                List<ItemConvertible> light_gray_glazed_terracotta = List.of(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> light_blue_terracotta = List.of(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON, ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR, ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR, ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE, ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

                List<ItemConvertible> light_blue_glazed_terracotta = List.of(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> green_terracotta = List.of(ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_BUTTON, ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.GREEN_TERRACOTTA_DOOR, ModBlocks.GREEN_TERRACOTTA_TRAPDOOR, ModBlocks.GREEN_TERRACOTTA_FENCE, ModBlocks.GREEN_TERRACOTTA_FENCE_GATE, ModBlocks.GREEN_TERRACOTTA_WALL);

                List<ItemConvertible> green_glazed_terracotta = List.of(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON, ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR, ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE, ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> gray_terracotta = List.of(ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_BUTTON, ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.GRAY_TERRACOTTA_DOOR, ModBlocks.GRAY_TERRACOTTA_TRAPDOOR, ModBlocks.GRAY_TERRACOTTA_FENCE, ModBlocks.GRAY_TERRACOTTA_FENCE_GATE, ModBlocks.GRAY_TERRACOTTA_WALL);

                List<ItemConvertible> gray_glazed_terracotta = List.of(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON, ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR, ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE, ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> cyan_terracotta = List.of(ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_BUTTON, ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.CYAN_TERRACOTTA_DOOR, ModBlocks.CYAN_TERRACOTTA_TRAPDOOR, ModBlocks.CYAN_TERRACOTTA_FENCE, ModBlocks.CYAN_TERRACOTTA_FENCE_GATE, ModBlocks.CYAN_TERRACOTTA_WALL);

                List<ItemConvertible> cyan_glazed_terracotta = List.of(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON, ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR, ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE, ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> brown_terracotta = List.of(ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_BUTTON, ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.BROWN_TERRACOTTA_DOOR, ModBlocks.BROWN_TERRACOTTA_TRAPDOOR, ModBlocks.BROWN_TERRACOTTA_FENCE, ModBlocks.BROWN_TERRACOTTA_FENCE_GATE, ModBlocks.BROWN_TERRACOTTA_WALL);

                List<ItemConvertible> brown_glazed_terracotta = List.of(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON, ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR, ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE, ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

                List<ItemConvertible> blue_terracotta = List.of(ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_BUTTON, ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.BLUE_TERRACOTTA_DOOR, ModBlocks.BLUE_TERRACOTTA_TRAPDOOR, ModBlocks.BLUE_TERRACOTTA_FENCE, ModBlocks.BLUE_TERRACOTTA_FENCE_GATE, ModBlocks.BLUE_TERRACOTTA_WALL);

                List<ItemConvertible> blue_glazed_terracotta = List.of(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON, ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE,
                        ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR, ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR, ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE, ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);



                List<ItemConvertible> stone_bricks = List.of(Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICK_STAIRS, ModBlocks.STONE_BRICKS_BUTTON, ModBlocks.STONE_BRICKS_PRESSURE_PLATE,
                        ModBlocks.STONE_BRICKS_DOOR, ModBlocks.STONE_BRICKS_TRAPDOOR, ModBlocks.STONE_BRICKS_FENCE, ModBlocks.STONE_BRICKS_FENCE_GATE, Blocks.STONE_BRICK_WALL);

                List<ItemConvertible> cracked_stone_bricks = List.of(ModBlocks.CRACKED_STONE_BRICKS_SLAB, ModBlocks.CRACKED_STONE_BRICKS_STAIRS, ModBlocks.CRACKED_STONE_BRICKS_BUTTON, ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE,
                        ModBlocks.CRACKED_STONE_BRICKS_DOOR, ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR, ModBlocks.CRACKED_STONE_BRICKS_FENCE, ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE, ModBlocks.CRACKED_STONE_BRICKS_WALL);

                List<ItemConvertible> sandstone = List.of(Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE_STAIRS, ModBlocks.SANDSTONE_BUTTON, ModBlocks.SANDSTONE_PRESSURE_PLATE,
                        ModBlocks.SANDSTONE_DOOR, ModBlocks.SANDSTONE_TRAPDOOR, ModBlocks.SANDSTONE_FENCE, ModBlocks.SANDSTONE_FENCE_GATE, Blocks.SANDSTONE_WALL);

                List<ItemConvertible> smooth_sandstone = List.of(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE_STAIRS, ModBlocks.SMOOTH_SANDSTONE_BUTTON, ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE,
                        ModBlocks.SMOOTH_SANDSTONE_DOOR, ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR, ModBlocks.SMOOTH_SANDSTONE_FENCE, ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE, ModBlocks.SMOOTH_SANDSTONE_WALL);

                List<ItemConvertible> quartz = List.of(Blocks.QUARTZ_SLAB, Blocks.QUARTZ_STAIRS, ModBlocks.QUARTZ_BUTTON, ModBlocks.QUARTZ_PRESSURE_PLATE,
                        ModBlocks.QUARTZ_DOOR, ModBlocks.QUARTZ_TRAPDOOR, ModBlocks.QUARTZ_FENCE, ModBlocks.QUARTZ_FENCE_GATE, ModBlocks.QUARTZ_WALL);

                List<ItemConvertible> smooth_quartz = List.of(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ_STAIRS, ModBlocks.SMOOTH_QUARTZ_BUTTON, ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE,
                        ModBlocks.SMOOTH_QUARTZ_DOOR, ModBlocks.SMOOTH_QUARTZ_TRAPDOOR, ModBlocks.SMOOTH_QUARTZ_FENCE, ModBlocks.SMOOTH_QUARTZ_FENCE_GATE, ModBlocks.SMOOTH_QUARTZ_WALL);

                List<ItemConvertible> red_sandstone = List.of(Blocks.RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE_STAIRS, ModBlocks.RED_SANDSTONE_BUTTON, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE,
                        ModBlocks.RED_SANDSTONE_DOOR, ModBlocks.RED_SANDSTONE_TRAPDOOR, ModBlocks.RED_SANDSTONE_FENCE, ModBlocks.RED_SANDSTONE_FENCE_GATE, Blocks.RED_SANDSTONE_WALL);

                List<ItemConvertible> smooth_red_sandstone = List.of(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_STAIRS, ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON, ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE,
                        ModBlocks.SMOOTH_RED_SANDSTONE_DOOR, ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR, ModBlocks.SMOOTH_RED_SANDSTONE_FENCE, ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE, ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

                List<ItemConvertible> smooth_stone = List.of(Blocks.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE_STAIRS, ModBlocks.SMOOTH_STONE_BUTTON, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE,
                        ModBlocks.SMOOTH_STONE_DOOR, ModBlocks.SMOOTH_STONE_TRAPDOOR, ModBlocks.SMOOTH_STONE_FENCE, ModBlocks.SMOOTH_STONE_FENCE_GATE, ModBlocks.SMOOTH_STONE_WALL);

                List<ItemConvertible> cobblestone = List.of(Blocks.COBBLESTONE_SLAB, Blocks.COBBLESTONE_STAIRS, ModBlocks.COBBLESTONE_BUTTON, ModBlocks.COBBLESTONE_PRESSURE_PLATE,
                        ModBlocks.COBBLESTONE_DOOR, ModBlocks.COBBLESTONE_TRAPDOOR, ModBlocks.COBBLESTONE_FENCE, ModBlocks.COBBLESTONE_FENCE_GATE, Blocks.COBBLESTONE_WALL);

                List<ItemConvertible> stone = List.of(Blocks.STONE_SLAB, Blocks.STONE_STAIRS, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE,
                        ModBlocks.STONE_DOOR, ModBlocks.STONE_TRAPDOOR, ModBlocks.STONE_FENCE, ModBlocks.STONE_FENCE_GATE, ModBlocks.STONE_WALL);

                List<ItemConvertible> sponge = List.of(ModBlocks2.SPONGE_SLAB, ModBlocks2.SPONGE_STAIRS, ModBlocks2.SPONGE_BUTTON, ModBlocks2.SPONGE_PRESSURE_PLATE,
                        ModBlocks2.SPONGE_DOOR, ModBlocks2.SPONGE_TRAPDOOR, ModBlocks2.SPONGE_FENCE, ModBlocks2.SPONGE_FENCE_GATE, ModBlocks2.SPONGE_WALL);

                List<ItemConvertible> wet_sponge = List.of(ModBlocks2.WET_SPONGE_SLAB, ModBlocks2.WET_SPONGE_STAIRS, ModBlocks2.WET_SPONGE_BUTTON, ModBlocks2.WET_SPONGE_PRESSURE_PLATE,
                        ModBlocks2.WET_SPONGE_DOOR, ModBlocks2.WET_SPONGE_TRAPDOOR, ModBlocks2.WET_SPONGE_FENCE, ModBlocks2.WET_SPONGE_FENCE_GATE, ModBlocks2.WET_SPONGE_WALL);

                List<ItemConvertible> nether_quartz_ore = List.of(ModBlocks2.NETHER_QUARTZ_ORE_SLAB, ModBlocks2.NETHER_QUARTZ_ORE_STAIRS, ModBlocks2.NETHER_QUARTZ_ORE_BUTTON, ModBlocks2.NETHER_QUARTZ_ORE_PRESSURE_PLATE,
                        ModBlocks2.NETHER_QUARTZ_ORE_DOOR, ModBlocks2.NETHER_QUARTZ_ORE_TRAPDOOR, ModBlocks2.NETHER_QUARTZ_ORE_FENCE, ModBlocks2.NETHER_QUARTZ_ORE_FENCE_GATE, ModBlocks2.NETHER_QUARTZ_ORE_WALL);

                List<ItemConvertible> netherrack = List.of(ModBlocks.NETHERRACK_SLAB, ModBlocks.NETHERRACK_STAIRS, ModBlocks.NETHERRACK_BUTTON, ModBlocks.NETHERRACK_PRESSURE_PLATE,
                        ModBlocks.NETHERRACK_DOOR, ModBlocks.NETHERRACK_TRAPDOOR, ModBlocks.NETHERRACK_FENCE, ModBlocks.NETHERRACK_FENCE_GATE, ModBlocks.NETHERRACK_WALL);

                List<ItemConvertible> nether_brick = List.of(Blocks.NETHER_BRICK_SLAB, Blocks.NETHER_BRICK_STAIRS, ModBlocks.NETHER_BRICK_BUTTON, ModBlocks.NETHER_BRICK_PRESSURE_PLATE,
                        ModBlocks.NETHER_BRICK_DOOR, ModBlocks.NETHER_BRICK_TRAPDOOR, Blocks.NETHER_BRICK_FENCE, ModBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICK_WALL);


                createSmeltingWithLists(exporter, clay, terracotta, RecipeCategory.BUILDING_BLOCKS, 0.35f, 200);
                createSmeltingWithLists(exporter, netherrack, nether_brick, RecipeCategory.MISC, 0.1f, 200);
                createSmeltingWithLists(exporter, nether_quartz_ore, Items.QUARTZ, RecipeCategory.MISC, 0.1f, 200);
                createBlastingWithLists(exporter, nether_quartz_ore, Items.QUARTZ, RecipeCategory.MISC, 0.1f, 100);
                createSmeltingWithLists(exporter, wet_sponge, sponge, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, cobblestone, stone, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, stone, smooth_stone, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, sandstone, smooth_sandstone, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, red_sandstone, smooth_red_sandstone, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, quartz, smooth_quartz, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, stone_bricks, cracked_stone_bricks, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, black_terracotta, black_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, blue_terracotta, blue_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, brown_terracotta, brown_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, cyan_terracotta, cyan_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, gray_terracotta, gray_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, green_terracotta, green_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, light_blue_terracotta, light_blue_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, light_gray_terracotta, light_gray_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, lime_terracotta, lime_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, magenta_terracotta, magenta_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, orange_terracotta, orange_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, pink_terracotta, pink_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, purple_terracotta, purple_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, red_terracotta, red_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, white_terracotta, white_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                createSmeltingWithLists(exporter, yellow_terracotta, yellow_glazed_terracotta, RecipeCategory.DECORATIONS, 0.1f, 200);
                //ancient debris
                createSmeltingWithLists(exporter, ancient_debris, Items.NETHERITE_SCRAP, RecipeCategory.MISC, 2.0f, 200);
                createBlastingWithLists(exporter, ancient_debris, Items.NETHERITE_SCRAP, RecipeCategory.MISC, 2.0f, 100);
                createSmeltingWithLists(exporter, basalt, smooth_basalt, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
                createSmeltingWithLists(exporter, cobbled_deepslate, deepslate, RecipeCategory.BUILDING_BLOCKS, 0.1f, 200);
            }

            public CraftingRecipeJsonBuilder PressPlateRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output)
                        .input('#', input)
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder NWFenceRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible likeStickItem, int outputCount) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.DECORATIONS, output, outputCount)
                        .input('#', likeStickItem)
                        .input('W', input)
                        .pattern("W#W")
                        .pattern("W#W")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(likeStickItem), conditionsFromItem(likeStickItem))
                        .showNotification(true);
            }

            public CraftingRecipeJsonBuilder NWFenceGateRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible likeStickItem, int outputCount) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.DECORATIONS, output, outputCount)
                        .input('#', likeStickItem)
                        .input('W', input)
                        .pattern("#W#")
                        .pattern("#W#")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(likeStickItem), conditionsFromItem(likeStickItem))
                        .showNotification(true);
            }


            public CraftingRecipeJsonBuilder x2ButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output, 8)
                        .input('#', input)
                        .pattern("##")
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }

            public CraftingRecipeJsonBuilder IngredientRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output, 8)
                        .input('#', input)
                        .pattern("##")
                        .pattern("##")
                        .criterion(hasItem(output), conditionsFromItem(output))
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder ButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output, outputCount)
                        .input('#', input)
                        .pattern(" # ")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder SlabRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output, 6)
                        .input('#', input)
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder StairsRecipe(ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', input)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder TrapdoorRecipe(ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.REDSTONE, output, 2)
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder FenceGateRecipe(ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.REDSTONE, output)
                        .input('#', Items.STICK)
                        .input('W', input)
                        .pattern("#W#")
                        .pattern("#W#")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder FenceRecipe(ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.DECORATIONS, output, 3)
                        .input('W', input).input('#', Items.STICK)
                        .pattern("W#W")
                        .pattern("W#W")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder DoorRecipe(ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.REDSTONE, output, 3).input('#', input)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder WallRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output, 6)
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }
            public CraftingRecipeJsonBuilder PlankWallRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
                return ShapedRecipeJsonBuilder.create(itemLookup, category, output, 8)
                        .input('#', input)
                        .pattern(" # ")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .showNotification(true);
            }


        };
    }


    @Override
    public String getName() {
        return "Recipes";
    }
}


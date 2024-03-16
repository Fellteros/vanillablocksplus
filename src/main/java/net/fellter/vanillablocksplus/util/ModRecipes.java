package net.fellter.vanillablocksplus.util;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class ModRecipes {
    public static CraftingRecipeJsonBuilder createPressurePlateModRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(category, output)
                .input('#', input)
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createNonWoodFenceRecipe(ItemConvertible output, Ingredient input, Ingredient likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("W#W")
                .pattern("W#W")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }

    public static CraftingRecipeJsonBuilder createNonWoodFenceGateRecipe(ItemConvertible output, Ingredient input, Ingredient likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }


    public static CraftingRecipeJsonBuilder offer2x2ButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
        return ShapedRecipeJsonBuilder.create(category, output, outputCount)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder offerButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
        return ShapedRecipeJsonBuilder.create(category, output, outputCount)
                .input('#', input)
                .pattern(" # ")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createSlabRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createStairsRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createTrapdoorRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 2)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createFenceGateRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .input('#', Items.STICK)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createFenceRecipe(ItemConvertible output, Ingredient input) {
        int i = output == Blocks.NETHER_BRICK_FENCE ? 6 : 3;
        Item item = output == Blocks.NETHER_BRICK_FENCE ? Items.NETHER_BRICK : Items.STICK;
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, i)
                .input('W', input).input('#', item)
                .pattern("W#W")
                .pattern("W#W")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createDoorRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 3).input('#', input)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createWallRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }
}

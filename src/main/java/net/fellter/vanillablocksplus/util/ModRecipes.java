package net.fellter.vanillablocksplus.util;

import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class ModRecipes {








    public static CraftingRecipeJsonBuilder createPressurePlateModRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output)
                .input('#', input)
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createNonWoodFenceRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("W#W")
                .pattern("W#W")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(likeStickItem), conditionsFromItem(likeStickItem))
                .showNotification(true);
    }

    public static CraftingRecipeJsonBuilder createNonWoodFenceGateRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(likeStickItem), conditionsFromItem(likeStickItem))
                .showNotification(true);
    }


    public static CraftingRecipeJsonBuilder create2x2ButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 8)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }

    public static CraftingRecipeJsonBuilder createIngredientRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 8)
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
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createSlabRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createStairsRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createTrapdoorRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 2)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createFenceGateRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .input('#', Items.STICK)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createFenceRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 3)
                .input('W', input).input('#', Items.STICK)
                .pattern("W#W")
                .pattern("W#W")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createDoorRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 3).input('#', input)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createWallRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createItemConvertibleRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
        return ShapedRecipeJsonBuilder.create(category, output, outputCount)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .showNotification(true);
    }

}

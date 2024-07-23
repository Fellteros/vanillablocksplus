package net.fellter.vanillablocksplus.util;

import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class ModRecipes {








    public static CraftingRecipeJsonBuilder PressPlateRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output)
                .input('#', input)
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder NWFenceRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("W#W")
                .pattern("W#W")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(likeStickItem), conditionsFromItem(likeStickItem))
                .showNotification(true);
    }

    public static CraftingRecipeJsonBuilder NWFenceGateRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible likeStickItem, int outputCount) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input('#', likeStickItem)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(likeStickItem), conditionsFromItem(likeStickItem))
                .showNotification(true);
    }


    public static CraftingRecipeJsonBuilder x2ButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 8)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }

    public static CraftingRecipeJsonBuilder IngredientRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 8)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(output), conditionsFromItem(output))
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder ButtonRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input, int outputCount) {
        return ShapedRecipeJsonBuilder.create(category, output, outputCount)
                .input('#', input)
                .pattern(" # ")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder SlabRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder StairsRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder TrapdoorRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 2)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder FenceGateRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output)
                .input('#', Items.STICK)
                .input('W', input)
                .pattern("#W#")
                .pattern("#W#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder FenceRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 3)
                .input('W', input).input('#', Items.STICK)
                .pattern("W#W")
                .pattern("W#W")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder DoorRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 3).input('#', input)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder WallRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder PlankWallRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(category, output, 8)
                .input('#', input)
                .pattern(" # ")
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }

}

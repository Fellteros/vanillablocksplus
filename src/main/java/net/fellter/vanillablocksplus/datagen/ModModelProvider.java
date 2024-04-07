package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool oakWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strOakWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool spruceWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRUCE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strSpruceWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_SPRUCE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool birchWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIRCH_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strBirchWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_BIRCH_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool jungleWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUNGLE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strJungleWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_JUNGLE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool acaciaWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACACIA_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strAcaciaWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_ACACIA_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool darkOakWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strDarkOakWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_DARK_OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool mangroveWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strMangroveWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_MANGROVE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool cherryWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strCherryWoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_CHERRY_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool bambooBlockPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAMBOO_BLOCK_MOD);
        BlockStateModelGenerator.BlockTexturePool strBambooBlockPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_BAMBOO_BLOCK_MOD);
        BlockStateModelGenerator.BlockTexturePool crimsonHyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRIMSON_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool strCrimsonHyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_CRIMSON_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool warpedHyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WARPED_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool strWarpedHyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STR_WARPED_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool stonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool cobblestonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool mossyCobblestonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSSY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool stoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedStoneBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool dioritePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIORITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool andesitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool deepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool cobbledDeepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool chiseledDeepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHISELED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool deepslateBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedDeepslateBricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool deepslateTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackedDeepslateTilesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool brickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BRICKS);
        BlockStateModelGenerator.BlockTexturePool packedMudPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        BlockStateModelGenerator.BlockTexturePool mudBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MUD_BRICKS);
        BlockStateModelGenerator.BlockTexturePool sandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_MOD);
        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool cutSandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_SANDSTONE_MOD);
        BlockStateModelGenerator.BlockTexturePool redSandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_SANDSTONE_MOD);
        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool cutRedSandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_RED_SANDSTONE_MOD);
        BlockStateModelGenerator.BlockTexturePool seaLanternPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SEA_LANTERN);
        BlockStateModelGenerator.BlockTexturePool prismarinePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool netherrackPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool netherBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedNetherBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redNetherBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool basaltPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BASALT_MOD);
        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        BlockStateModelGenerator.BlockTexturePool polishedBasaltPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BASALT_MOD);
        BlockStateModelGenerator.BlockTexturePool blackstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool gildedBlackstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool polishedBlackstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool polishedBlackstoneBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedPolishedBlackstoneBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool endStonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        BlockStateModelGenerator.BlockTexturePool endStoneBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpurBlockPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        BlockStateModelGenerator.BlockTexturePool coalPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ironPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool goldPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool redstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.REDSTONE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool emeraldPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lapisPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LAPIS_BLOCK);
        BlockStateModelGenerator.BlockTexturePool diamondPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIAMOND_BLOCK);
        BlockStateModelGenerator.BlockTexturePool netheritePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool quartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_BLOCK_MOD);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool amethystPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        BlockStateModelGenerator.BlockTexturePool copperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cutCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposedCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposedCutCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EXPOSED_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatheredCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatheredCutCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WEATHERED_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizedCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizedCutCopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool whiteWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightGrayWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool grayWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool blackWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlockStateModelGenerator.BlockTexturePool brownWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BlockStateModelGenerator.BlockTexturePool redWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        BlockStateModelGenerator.BlockTexturePool orangeWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        BlockStateModelGenerator.BlockTexturePool yellowWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        BlockStateModelGenerator.BlockTexturePool limeWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        BlockStateModelGenerator.BlockTexturePool greenWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        BlockStateModelGenerator.BlockTexturePool cyanWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        BlockStateModelGenerator.BlockTexturePool blueWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightBlueWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool purpleWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        BlockStateModelGenerator.BlockTexturePool magentaWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        BlockStateModelGenerator.BlockTexturePool pinkWoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);
        BlockStateModelGenerator.BlockTexturePool terracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool redTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool grayConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blackConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool brownConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool redConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool orangeConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool yellowConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool limeConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool greenConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cyanConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blueConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool purpleConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool magentaConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool pinkConcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool whiteConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool grayConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool blackConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool brownConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool redConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool orangeConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool yellowConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool limeConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool greenConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool cyanConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool blueConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool purpleConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool magentaConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool pinkConcretePowderPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool whiteGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightGrayGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool grayGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blackGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brownGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool redGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orangeGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellowGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool limeGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool greenGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyanGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blueGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightBlueGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purpleGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magentaGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pinkGlazedTerracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_GLAZED_TERRACOTTA);







        //oak
        oakWoodPool.button(ModBlocks.OAK_WOOD_BUTTON);
        oakWoodPool.fence(ModBlocks.OAK_WOOD_FENCE);
        oakWoodPool.fenceGate(ModBlocks.OAK_WOOD_FENCE_GATE);
        oakWoodPool.pressurePlate(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
        oakWoodPool.slab(ModBlocks.OAK_WOOD_SLAB);
        oakWoodPool.stairs(ModBlocks.OAK_WOOD_STAIRS);
        //str oak
        strOakWoodPool.button(ModBlocks.STR_OAK_WOOD_BUTTON);
        strOakWoodPool.fence(ModBlocks.STR_OAK_WOOD_FENCE);
        strOakWoodPool.fenceGate(ModBlocks.STR_OAK_WOOD_FENCE_GATE);
        strOakWoodPool.pressurePlate(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE);
        strOakWoodPool.slab(ModBlocks.STR_OAK_WOOD_SLAB);
        strOakWoodPool.stairs(ModBlocks.STR_OAK_WOOD_STAIRS);
        //spruce
        spruceWoodPool.button(ModBlocks.SPRUCE_WOOD_BUTTON);
        spruceWoodPool.fence(ModBlocks.SPRUCE_WOOD_FENCE);
        spruceWoodPool.fenceGate(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
        spruceWoodPool.pressurePlate(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
        spruceWoodPool.slab(ModBlocks.SPRUCE_WOOD_SLAB);
        spruceWoodPool.stairs(ModBlocks.SPRUCE_WOOD_STAIRS);
        //str spruce
        strSpruceWoodPool.button(ModBlocks.STR_SPRUCE_WOOD_BUTTON);
        strSpruceWoodPool.fence(ModBlocks.STR_SPRUCE_WOOD_FENCE);
        strSpruceWoodPool.fenceGate(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE);
        strSpruceWoodPool.pressurePlate(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE);
        strSpruceWoodPool.slab(ModBlocks.STR_SPRUCE_WOOD_SLAB);
        strSpruceWoodPool.stairs(ModBlocks.STR_SPRUCE_WOOD_STAIRS);
        //birch
        birchWoodPool.button(ModBlocks.BIRCH_WOOD_BUTTON);
        birchWoodPool.fence(ModBlocks.BIRCH_WOOD_FENCE);
        birchWoodPool.fenceGate(ModBlocks.BIRCH_WOOD_FENCE_GATE);
        birchWoodPool.pressurePlate(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
        birchWoodPool.slab(ModBlocks.BIRCH_WOOD_SLAB);
        birchWoodPool.stairs(ModBlocks.BIRCH_WOOD_STAIRS);
        //str birch
        strBirchWoodPool.button(ModBlocks.STR_BIRCH_WOOD_BUTTON);
        strBirchWoodPool.fence(ModBlocks.STR_BIRCH_WOOD_FENCE);
        strBirchWoodPool.fenceGate(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE);
        strBirchWoodPool.pressurePlate(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE);
        strBirchWoodPool.slab(ModBlocks.STR_BIRCH_WOOD_SLAB);
        strBirchWoodPool.stairs(ModBlocks.STR_BIRCH_WOOD_STAIRS);
        //jungle
        jungleWoodPool.button(ModBlocks.JUNGLE_WOOD_BUTTON);
        jungleWoodPool.fence(ModBlocks.JUNGLE_WOOD_FENCE);
        jungleWoodPool.fenceGate(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
        jungleWoodPool.pressurePlate(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
        jungleWoodPool.slab(ModBlocks.JUNGLE_WOOD_SLAB);
        jungleWoodPool.stairs(ModBlocks.JUNGLE_WOOD_STAIRS);
        //str jungle
        strJungleWoodPool.button(ModBlocks.STR_JUNGLE_WOOD_BUTTON);
        strJungleWoodPool.fence(ModBlocks.STR_JUNGLE_WOOD_FENCE);
        strJungleWoodPool.fenceGate(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE);
        strJungleWoodPool.pressurePlate(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE);
        strJungleWoodPool.slab(ModBlocks.STR_JUNGLE_WOOD_SLAB);
        strJungleWoodPool.stairs(ModBlocks.STR_JUNGLE_WOOD_STAIRS);
        //acacia
        acaciaWoodPool.button(ModBlocks.ACACIA_WOOD_BUTTON);
        acaciaWoodPool.fence(ModBlocks.ACACIA_WOOD_FENCE);
        acaciaWoodPool.fenceGate(ModBlocks.ACACIA_WOOD_FENCE_GATE);
        acaciaWoodPool.pressurePlate(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
        acaciaWoodPool.slab(ModBlocks.ACACIA_WOOD_SLAB);
        acaciaWoodPool.stairs(ModBlocks.ACACIA_WOOD_STAIRS);
        //str acacia
        strAcaciaWoodPool.button(ModBlocks.STR_ACACIA_WOOD_BUTTON);
        strAcaciaWoodPool.fence(ModBlocks.STR_ACACIA_WOOD_FENCE);
        strAcaciaWoodPool.fenceGate(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE);
        strAcaciaWoodPool.pressurePlate(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE);
        strAcaciaWoodPool.slab(ModBlocks.STR_ACACIA_WOOD_SLAB);
        strAcaciaWoodPool.stairs(ModBlocks.STR_ACACIA_WOOD_STAIRS);
        //dark oak
        darkOakWoodPool.button(ModBlocks.DARK_OAK_WOOD_BUTTON);
        darkOakWoodPool.fence(ModBlocks.DARK_OAK_WOOD_FENCE);
        darkOakWoodPool.fenceGate(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
        darkOakWoodPool.pressurePlate(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
        darkOakWoodPool.slab(ModBlocks.DARK_OAK_WOOD_SLAB);
        darkOakWoodPool.stairs(ModBlocks.DARK_OAK_WOOD_STAIRS);
        //str dark oak
        strDarkOakWoodPool.button(ModBlocks.STR_DARK_OAK_WOOD_BUTTON);
        strDarkOakWoodPool.fence(ModBlocks.STR_DARK_OAK_WOOD_FENCE);
        strDarkOakWoodPool.fenceGate(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE);
        strDarkOakWoodPool.pressurePlate(ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE);
        strDarkOakWoodPool.slab(ModBlocks.STR_DARK_OAK_WOOD_SLAB);
        strDarkOakWoodPool.stairs(ModBlocks.STR_DARK_OAK_WOOD_STAIRS);
        //mangrove
        mangroveWoodPool.button(ModBlocks.MANGROVE_WOOD_BUTTON);
        mangroveWoodPool.fence(ModBlocks.MANGROVE_WOOD_FENCE);
        mangroveWoodPool.fenceGate(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
        mangroveWoodPool.pressurePlate(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
        mangroveWoodPool.slab(ModBlocks.MANGROVE_WOOD_SLAB);
        mangroveWoodPool.stairs(ModBlocks.MANGROVE_WOOD_STAIRS);
        //str mangrove
        strMangroveWoodPool.button(ModBlocks.STR_MANGROVE_WOOD_BUTTON);
        strMangroveWoodPool.fence(ModBlocks.STR_MANGROVE_WOOD_FENCE);
        strMangroveWoodPool.fenceGate(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE);
        strMangroveWoodPool.pressurePlate(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE);
        strMangroveWoodPool.slab(ModBlocks.STR_MANGROVE_WOOD_SLAB);
        strMangroveWoodPool.stairs(ModBlocks.STR_MANGROVE_WOOD_STAIRS);
        //cherry
        cherryWoodPool.button(ModBlocks.CHERRY_WOOD_BUTTON);
        cherryWoodPool.fence(ModBlocks.CHERRY_WOOD_FENCE);
        cherryWoodPool.fenceGate(ModBlocks.CHERRY_WOOD_FENCE_GATE);
        cherryWoodPool.pressurePlate(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
        cherryWoodPool.slab(ModBlocks.CHERRY_WOOD_SLAB);
        cherryWoodPool.stairs(ModBlocks.CHERRY_WOOD_STAIRS);
        //str cherry
        strCherryWoodPool.button(ModBlocks.STR_CHERRY_WOOD_BUTTON);
        strCherryWoodPool.fence(ModBlocks.STR_CHERRY_WOOD_FENCE);
        strCherryWoodPool.fenceGate(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE);
        strCherryWoodPool.pressurePlate(ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE);
        strCherryWoodPool.slab(ModBlocks.STR_CHERRY_WOOD_SLAB);
        strCherryWoodPool.stairs(ModBlocks.STR_CHERRY_WOOD_STAIRS);
        //bamboo
        bambooBlockPool.button(ModBlocks.BAMBOO_BLOCK_BUTTON);
        bambooBlockPool.fence(ModBlocks.BAMBOO_BLOCK_FENCE);
        bambooBlockPool.fenceGate(ModBlocks.BAMBOO_BLOCK_FENCE_GATE);
        bambooBlockPool.pressurePlate(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE);
        bambooBlockPool.slab(ModBlocks.BAMBOO_BLOCK_SLAB);
        bambooBlockPool.stairs(ModBlocks.BAMBOO_BLOCK_STAIRS);
        //bamboo
        strBambooBlockPool.button(ModBlocks.STR_BAMBOO_BLOCK_BUTTON);
        strBambooBlockPool.fence(ModBlocks.STR_BAMBOO_BLOCK_FENCE);
        strBambooBlockPool.fenceGate(ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE);
        strBambooBlockPool.pressurePlate(ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE);
        strBambooBlockPool.slab(ModBlocks.STR_BAMBOO_BLOCK_SLAB);
        strBambooBlockPool.stairs(ModBlocks.STR_BAMBOO_BLOCK_STAIRS);
        //crimson hyphae
        crimsonHyphaePool.button(ModBlocks.CRIMSON_HYPHAE_BUTTON);
        crimsonHyphaePool.fence(ModBlocks.CRIMSON_HYPHAE_FENCE);
        crimsonHyphaePool.fenceGate(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE);
        crimsonHyphaePool.pressurePlate(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE);
        crimsonHyphaePool.slab(ModBlocks.CRIMSON_HYPHAE_SLAB);
        crimsonHyphaePool.stairs(ModBlocks.CRIMSON_HYPHAE_STAIRS);
        //str crimson hyphae
        strCrimsonHyphaePool.button(ModBlocks.STR_CRIMSON_HYPHAE_BUTTON);
        strCrimsonHyphaePool.fence(ModBlocks.STR_CRIMSON_HYPHAE_FENCE);
        strCrimsonHyphaePool.fenceGate(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE);
        strCrimsonHyphaePool.pressurePlate(ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE);
        strCrimsonHyphaePool.slab(ModBlocks.STR_CRIMSON_HYPHAE_SLAB);
        strCrimsonHyphaePool.stairs(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS);
        //warped hyphae
        warpedHyphaePool.button(ModBlocks.WARPED_HYPHAE_BUTTON);
        warpedHyphaePool.fence(ModBlocks.WARPED_HYPHAE_FENCE);
        warpedHyphaePool.fenceGate(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
        warpedHyphaePool.pressurePlate(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE);
        warpedHyphaePool.slab(ModBlocks.WARPED_HYPHAE_SLAB);
        warpedHyphaePool.stairs(ModBlocks.WARPED_HYPHAE_STAIRS);
        //str warped hyphae
        strWarpedHyphaePool.button(ModBlocks.STR_WARPED_HYPHAE_BUTTON);
        strWarpedHyphaePool.fence(ModBlocks.STR_WARPED_HYPHAE_FENCE);
        strWarpedHyphaePool.fenceGate(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE);
        strWarpedHyphaePool.pressurePlate(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE);
        strWarpedHyphaePool.slab(ModBlocks.STR_WARPED_HYPHAE_SLAB);
        strWarpedHyphaePool.stairs(ModBlocks.STR_WARPED_HYPHAE_STAIRS);
        //stone
        stonePool.fence(ModBlocks.STONE_FENCE);
        stonePool.fenceGate(ModBlocks.STONE_FENCE_GATE);
        stonePool.wall(ModBlocks.STONE_WALL);
        //cobblestone
        cobblestonePool.fence(ModBlocks.COBBLESTONE_FENCE);
        cobblestonePool.fenceGate(ModBlocks.COBBLESTONE_FENCE_GATE);
        //mossy cobblestone
        mossyCobblestonePool.fence(ModBlocks.MOSSY_COBBLESTONE_FENCE);
        mossyCobblestonePool.fenceGate(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE);
        mossyCobblestonePool.button(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
        mossyCobblestonePool.pressurePlate(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
        //smooth stone
        smoothStonePool.button(ModBlocks.SMOOTH_STONE_BUTTON);
        smoothStonePool.fence(ModBlocks.SMOOTH_STONE_FENCE);
        smoothStonePool.fenceGate(ModBlocks.SMOOTH_STONE_FENCE_GATE);
        smoothStonePool.pressurePlate(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(ModBlocks.SMOOTH_STONE_WALL);
        //stone bricks
        stoneBricksPool.button(ModBlocks.STONE_BRICKS_BUTTON);
        stoneBricksPool.fence(ModBlocks.STONE_BRICKS_FENCE);
        stoneBricksPool.fenceGate(ModBlocks.STONE_BRICKS_FENCE_GATE);
        stoneBricksPool.pressurePlate(ModBlocks.STONE_BRICKS_PRESSURE_PLATE);
        //cracked stone bricks
        crackedStoneBricksPool.button(ModBlocks.CRACKED_STONE_BRICKS_BUTTON);
        crackedStoneBricksPool.wall(ModBlocks.CRACKED_STONE_BRICKS_WALL);
        crackedStoneBricksPool.stairs(ModBlocks.CRACKED_STONE_BRICKS_STAIRS);
        crackedStoneBricksPool.slab(ModBlocks.CRACKED_STONE_BRICKS_SLAB);
        crackedStoneBricksPool.fence(ModBlocks.CRACKED_STONE_BRICKS_FENCE);
        crackedStoneBricksPool.fenceGate(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE);
        crackedStoneBricksPool.pressurePlate(ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE);
        //granite
        granitePool.button(ModBlocks.GRANITE_BUTTON);
        granitePool.fence(ModBlocks.GRANITE_FENCE);
        granitePool.fenceGate(ModBlocks.GRANITE_FENCE_GATE);
        granitePool.pressurePlate(ModBlocks.GRANITE_PRESSURE_PLATE);
        //polished granite
        polishedGranitePool.button(ModBlocks.POLISHED_GRANITE_BUTTON);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        polishedGranitePool.fence(ModBlocks.POLISHED_GRANITE_FENCE);
        polishedGranitePool.fenceGate(ModBlocks.POLISHED_GRANITE_FENCE_GATE);
        polishedGranitePool.pressurePlate(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        //diorite
        dioritePool.button(ModBlocks.DIORITE_BUTTON);
        dioritePool.fence(ModBlocks.DIORITE_FENCE);
        dioritePool.fenceGate(ModBlocks.DIORITE_FENCE_GATE);
        dioritePool.pressurePlate(ModBlocks.DIORITE_PRESSURE_PLATE);
        //polished diorite
        polishedDioritePool.button(ModBlocks.POLISHED_DIORITE_BUTTON);
        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        polishedDioritePool.fence(ModBlocks.POLISHED_DIORITE_FENCE);
        polishedDioritePool.fenceGate(ModBlocks.POLISHED_DIORITE_FENCE_GATE);
        polishedDioritePool.pressurePlate(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        //andesite
        andesitePool.button(ModBlocks.ANDESITE_BUTTON);
        andesitePool.fence(ModBlocks.ANDESITE_FENCE);
        andesitePool.fenceGate(ModBlocks.ANDESITE_FENCE_GATE);
        andesitePool.pressurePlate(ModBlocks.ANDESITE_PRESSURE_PLATE);
        //polished andesite
        polishedAndesitePool.button(ModBlocks.POLISHED_ANDESITE_BUTTON);
        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        polishedAndesitePool.fence(ModBlocks.POLISHED_ANDESITE_FENCE);
        polishedAndesitePool.fenceGate(ModBlocks.POLISHED_ANDESITE_FENCE_GATE);
        polishedAndesitePool.pressurePlate(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        //deepslate
        deepslatePool.button(ModBlocks.DEEPSLATE_BUTTON);
        deepslatePool.wall(ModBlocks.DEEPSLATE_WALL);
        deepslatePool.stairs(ModBlocks.DEEPSLATE_STAIRS);
        deepslatePool.slab(ModBlocks.DEEPSLATE_SLAB);
        deepslatePool.fence(ModBlocks.DEEPSLATE_FENCE);
        deepslatePool.fenceGate(ModBlocks.DEEPSLATE_FENCE_GATE);
        deepslatePool.pressurePlate(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
        //cobbled deepslate
        cobbledDeepslatePool.button(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
        cobbledDeepslatePool.fence(ModBlocks.COBBLED_DEEPSLATE_FENCE);
        cobbledDeepslatePool.fenceGate(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE);
        cobbledDeepslatePool.pressurePlate(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        //chiseled deepslate
        chiseledDeepslatePool.button(ModBlocks.CHISELED_DEEPSLATE_BUTTON);
        chiseledDeepslatePool.wall(ModBlocks.CHISELED_DEEPSLATE_WALL);
        chiseledDeepslatePool.stairs(ModBlocks.CHISELED_DEEPSLATE_STAIRS);
        chiseledDeepslatePool.slab(ModBlocks.CHISELED_DEEPSLATE_SLAB);
        chiseledDeepslatePool.fence(ModBlocks.CHISELED_DEEPSLATE_FENCE);
        chiseledDeepslatePool.fenceGate(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE);
        chiseledDeepslatePool.pressurePlate(ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE);
        //polished deepslate
        polishedDeepslatePool.button(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        polishedDeepslatePool.fence(ModBlocks.POLISHED_DEEPSLATE_FENCE);
        polishedDeepslatePool.fenceGate(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE);
        polishedDeepslatePool.pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        //deepslate bricks
        deepslateBricksPool.button(ModBlocks.DEEPSLATE_BRICKS_BUTTON);
        deepslateBricksPool.fence(ModBlocks.DEEPSLATE_BRICKS_FENCE);
        deepslateBricksPool.fenceGate(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE);
        deepslateBricksPool.pressurePlate(ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE);
        //cracked deepslate bricks
        crackedDeepslateBricksPool.button(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON);
        crackedDeepslateBricksPool.wall(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL);
        crackedDeepslateBricksPool.stairs(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS);
        crackedDeepslateBricksPool.slab(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB);
        crackedDeepslateBricksPool.fence(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE);
        crackedDeepslateBricksPool.fenceGate(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE);
        crackedDeepslateBricksPool.pressurePlate(ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE);
        //deepslate tiles
        deepslateTilesPool.button(ModBlocks.DEEPSLATE_TILES_BUTTON);
        deepslateTilesPool.fence(ModBlocks.DEEPSLATE_TILES_FENCE);
        deepslateTilesPool.fenceGate(ModBlocks.DEEPSLATE_TILES_FENCE_GATE);
        deepslateTilesPool.pressurePlate(ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE);
        //cracked deepslate tiles
        crackedDeepslateTilesPool.button(ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON);
        crackedDeepslateTilesPool.wall(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL);
        crackedDeepslateTilesPool.stairs(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS);
        crackedDeepslateTilesPool.slab(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB);
        crackedDeepslateTilesPool.fence(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE);
        crackedDeepslateTilesPool.fenceGate(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE);
        crackedDeepslateTilesPool.pressurePlate(ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE);
        //brick
        brickPool.button(ModBlocks.BRICK_BUTTON);
        brickPool.fence(ModBlocks.BRICK_FENCE);
        brickPool.fenceGate(ModBlocks.BRICK_FENCE_GATE);
        brickPool.pressurePlate(ModBlocks.BRICK_PRESSURE_PLATE);
        //packed mud
        packedMudPool.button(ModBlocks.PACKED_MUD_BUTTON);
        packedMudPool.wall(ModBlocks.PACKED_MUD_WALL);
        packedMudPool.stairs(ModBlocks.PACKED_MUD_STAIRS);
        packedMudPool.slab(ModBlocks.PACKED_MUD_SLAB);
        packedMudPool.fence(ModBlocks.PACKED_MUD_FENCE);
        packedMudPool.fenceGate(ModBlocks.PACKED_MUD_FENCE_GATE);
        packedMudPool.pressurePlate(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
        //mud brick
        mudBrickPool.button(ModBlocks.MUD_BRICK_BUTTON);
        mudBrickPool.fence(ModBlocks.MUD_BRICK_FENCE);
        mudBrickPool.fenceGate(ModBlocks.MUD_BRICK_FENCE_GATE);
        mudBrickPool.pressurePlate(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
        //sandstone
        sandstonePool.button(ModBlocks.SANDSTONE_BUTTON);
        sandstonePool.fence(ModBlocks.SANDSTONE_FENCE);
        sandstonePool.fenceGate(ModBlocks.SANDSTONE_FENCE_GATE);
        sandstonePool.pressurePlate(ModBlocks.SANDSTONE_PRESSURE_PLATE);
        //smooth sandstone
        smoothSandstonePool.button(ModBlocks.SMOOTH_SANDSTONE_BUTTON);
        smoothSandstonePool.fence(ModBlocks.SMOOTH_SANDSTONE_FENCE);
        smoothSandstonePool.fenceGate(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE);
        smoothSandstonePool.pressurePlate(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);
        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        //cut sandstone
        cutSandstonePool.stairs(ModBlocks.CUT_SANDSTONE_STAIRS);
        cutSandstonePool.button(ModBlocks.CUT_SANDSTONE_BUTTON);
        cutSandstonePool.fence(ModBlocks.CUT_SANDSTONE_FENCE);
        cutSandstonePool.fenceGate(ModBlocks.CUT_SANDSTONE_FENCE_GATE);
        cutSandstonePool.pressurePlate(ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE);
        cutSandstonePool.wall(ModBlocks.CUT_SANDSTONE_WALL);
        //red sandstone
        redSandstonePool.button(ModBlocks.RED_SANDSTONE_BUTTON);
        redSandstonePool.fence(ModBlocks.RED_SANDSTONE_FENCE);
        redSandstonePool.fenceGate(ModBlocks.RED_SANDSTONE_FENCE_GATE);
        redSandstonePool.pressurePlate(ModBlocks.RED_SANDSTONE_PRESSURE_PLATE);
        //smooth red sandstone
        smoothRedSandstonePool.button(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON);
        smoothRedSandstonePool.fence(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE);
        smoothRedSandstonePool.fenceGate(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE);
        smoothRedSandstonePool.pressurePlate(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        //cut red sandstone
        cutRedSandstonePool.stairs(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        cutRedSandstonePool.button(ModBlocks.CUT_RED_SANDSTONE_BUTTON);
        cutRedSandstonePool.fence(ModBlocks.CUT_RED_SANDSTONE_FENCE);
        cutRedSandstonePool.fenceGate(ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE);
        cutRedSandstonePool.pressurePlate(ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE);
        cutRedSandstonePool.wall(ModBlocks.CUT_RED_SANDSTONE_WALL);
        //sea lantern
        seaLanternPool.button(ModBlocks.SEA_LANTERN_BUTTON);
        seaLanternPool.wall(ModBlocks.SEA_LANTERN_WALL);
        seaLanternPool.stairs(ModBlocks.SEA_LANTERN_STAIRS);
        seaLanternPool.slab(ModBlocks.SEA_LANTERN_SLAB);
        seaLanternPool.fence(ModBlocks.SEA_LANTERN_FENCE);
        seaLanternPool.fenceGate(ModBlocks.SEA_LANTERN_FENCE_GATE);
        seaLanternPool.pressurePlate(ModBlocks.SEA_LANTERN_PRESSURE_PLATE);
        //prismarine
        prismarinePool.button(ModBlocks.PRISMARINE_BUTTON);
        prismarinePool.fence(ModBlocks.PRISMARINE_FENCE);
        prismarinePool.fenceGate(ModBlocks.PRISMARINE_FENCE_GATE);
        prismarinePool.pressurePlate(ModBlocks.PRISMARINE_PRESSURE_PLATE);
        //prismarine brick
        prismarineBrickPool.button(ModBlocks.PRISMARINE_BRICK_BUTTON);
        prismarineBrickPool.fence(ModBlocks.PRISMARINE_BRICK_FENCE);
        prismarineBrickPool.fenceGate(ModBlocks.PRISMARINE_BRICK_FENCE_GATE);
        prismarineBrickPool.pressurePlate(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE);
        prismarineBrickPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
        //dark prismarine
        darkPrismarinePool.button(ModBlocks.DARK_PRISMARINE_BUTTON);
        darkPrismarinePool.fence(ModBlocks.DARK_PRISMARINE_FENCE);
        darkPrismarinePool.fenceGate(ModBlocks.DARK_PRISMARINE_FENCE_GATE);
        darkPrismarinePool.pressurePlate(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE);
        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        //netherrack
        netherrackPool.button(ModBlocks.NETHERRACK_BUTTON);
        netherrackPool.wall(ModBlocks.NETHERRACK_WALL);
        netherrackPool.stairs(ModBlocks.NETHERRACK_STAIRS);
        netherrackPool.slab(ModBlocks.NETHERRACK_SLAB);
        netherrackPool.fence(ModBlocks.NETHERRACK_FENCE);
        netherrackPool.fenceGate(ModBlocks.NETHERRACK_FENCE_GATE);
        netherrackPool.pressurePlate(ModBlocks.NETHERRACK_PRESSURE_PLATE);
        //nether bricks
        netherBrickPool.button(ModBlocks.NETHER_BRICK_BUTTON);
        netherBrickPool.fenceGate(ModBlocks.NETHER_BRICK_FENCE_GATE);
        netherBrickPool.pressurePlate(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
        //cracked nether bricks
        crackedNetherBrickPool.button(ModBlocks.CRACKED_NETHER_BRICK_BUTTON);
        crackedNetherBrickPool.wall(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        crackedNetherBrickPool.stairs(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        crackedNetherBrickPool.slab(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
        crackedNetherBrickPool.fence(ModBlocks.CRACKED_NETHER_BRICK_FENCE);
        crackedNetherBrickPool.fenceGate(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
        crackedNetherBrickPool.pressurePlate(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
        //nether bricks
        redNetherBrickPool.button(ModBlocks.RED_NETHER_BRICK_BUTTON);
        redNetherBrickPool.fence(ModBlocks.RED_NETHER_BRICK_FENCE);
        redNetherBrickPool.fenceGate(ModBlocks.RED_NETHER_BRICK_FENCE_GATE);
        redNetherBrickPool.pressurePlate(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
        //basalt
        basaltPool.button(ModBlocks.BASALT_BUTTON);
        basaltPool.wall(ModBlocks.BASALT_WALL);
        basaltPool.slab(ModBlocks.BASALT_SLAB);
        basaltPool.stairs(ModBlocks.BASALT_STAIRS);
        basaltPool.fence(ModBlocks.BASALT_FENCE);
        basaltPool.fenceGate(ModBlocks.BASALT_FENCE_GATE);
        basaltPool.pressurePlate(ModBlocks.BASALT_PRESSURE_PLATE);
        //smooth basalt
        smoothBasaltPool.button(ModBlocks.SMOOTH_BASALT_BUTTON);
        smoothBasaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);
        smoothBasaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        smoothBasaltPool.fence(ModBlocks.SMOOTH_BASALT_FENCE);
        smoothBasaltPool.fenceGate(ModBlocks.SMOOTH_BASALT_FENCE_GATE);
        smoothBasaltPool.pressurePlate(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
        //polished basalt
        polishedBasaltPool.button(ModBlocks.POLISHED_BASALT_BUTTON);
        polishedBasaltPool.wall(ModBlocks.POLISHED_BASALT_WALL);
        polishedBasaltPool.slab(ModBlocks.POLISHED_BASALT_SLAB);
        polishedBasaltPool.stairs(ModBlocks.POLISHED_BASALT_STAIRS);
        polishedBasaltPool.fence(ModBlocks.POLISHED_BASALT_FENCE);
        polishedBasaltPool.fenceGate(ModBlocks.POLISHED_BASALT_FENCE_GATE);
        polishedBasaltPool.pressurePlate(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE);
        //polished basalt
        blackstonePool.button(ModBlocks.BLACKSTONE_BUTTON);
        blackstonePool.fence(ModBlocks.BLACKSTONE_FENCE);
        blackstonePool.fenceGate(ModBlocks.BLACKSTONE_FENCE_GATE);
        blackstonePool.pressurePlate(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        //gilded blackstone
        gildedBlackstonePool.button(ModBlocks.GILDED_BLACKSTONE_BUTTON);
        gildedBlackstonePool.wall(ModBlocks.GILDED_BLACKSTONE_WALL);
        gildedBlackstonePool.slab(ModBlocks.GILDED_BLACKSTONE_SLAB);
        gildedBlackstonePool.stairs(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        gildedBlackstonePool.fence(ModBlocks.GILDED_BLACKSTONE_FENCE);
        gildedBlackstonePool.fenceGate(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE);
        gildedBlackstonePool.pressurePlate(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
        //polished blackstone
        polishedBlackstonePool.fence(ModBlocks.POLISHED_BLACKSTONE_FENCE);
        polishedBlackstonePool.fenceGate(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE);
        //polished blackstone brick
        polishedBlackstoneBrickPool.button(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON);
        polishedBlackstoneBrickPool.fence(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE);
        polishedBlackstoneBrickPool.fenceGate(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
        polishedBlackstoneBrickPool.pressurePlate(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        //cracked polished blackstone brick
        crackedPolishedBlackstoneBrickPool.button(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON);
        crackedPolishedBlackstoneBrickPool.wall(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        crackedPolishedBlackstoneBrickPool.slab(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        crackedPolishedBlackstoneBrickPool.stairs(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        crackedPolishedBlackstoneBrickPool.fence(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE);
        crackedPolishedBlackstoneBrickPool.fenceGate(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE);
        crackedPolishedBlackstoneBrickPool.pressurePlate(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        //end stone
        endStonePool.button(ModBlocks.END_STONE_BUTTON);
        endStonePool.wall(ModBlocks.END_STONE_WALL);
        endStonePool.slab(ModBlocks.END_STONE_SLAB);
        endStonePool.stairs(ModBlocks.END_STONE_STAIRS);
        endStonePool.fence(ModBlocks.END_STONE_FENCE);
        endStonePool.fenceGate(ModBlocks.END_STONE_FENCE_GATE);
        endStonePool.pressurePlate(ModBlocks.END_STONE_PRESSURE_PLATE);
        //end stone brick
        endStoneBrickPool.button(ModBlocks.END_STONE_BRICK_BUTTON);
        endStoneBrickPool.fence(ModBlocks.END_STONE_BRICK_FENCE);
        endStoneBrickPool.fenceGate(ModBlocks.END_STONE_BRICK_FENCE_GATE);
        endStoneBrickPool.pressurePlate(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE);
        //purpur block
        purpurBlockPool.button(ModBlocks.PURPUR_BUTTON);
        purpurBlockPool.wall(ModBlocks.PURPUR_WALL);
        purpurBlockPool.fence(ModBlocks.PURPUR_FENCE);
        purpurBlockPool.fenceGate(ModBlocks.PURPUR_FENCE_GATE);
        purpurBlockPool.pressurePlate(ModBlocks.PURPUR_PRESSURE_PLATE);
        //coal
        coalPool.button(ModBlocks.COAL_BUTTON);
        coalPool.wall(ModBlocks.COAL_WALL);
        coalPool.slab(ModBlocks.COAL_SLAB);
        coalPool.stairs(ModBlocks.COAL_STAIRS);
        coalPool.fence(ModBlocks.COAL_FENCE);
        coalPool.fenceGate(ModBlocks.COAL_FENCE_GATE);
        coalPool.pressurePlate(ModBlocks.COAL_PRESSURE_PLATE);
        //iron
        ironPool.button(ModBlocks.IRON_BUTTON);
        ironPool.wall(ModBlocks.IRON_WALL);
        ironPool.slab(ModBlocks.IRON_SLAB);
        ironPool.stairs(ModBlocks.IRON_STAIRS);
        ironPool.fence(ModBlocks.IRON_FENCE);
        ironPool.fenceGate(ModBlocks.IRON_FENCE_GATE);
        //gold
        goldPool.button(ModBlocks.GOLD_BUTTON);
        goldPool.wall(ModBlocks.GOLD_WALL);
        goldPool.slab(ModBlocks.GOLD_SLAB);
        goldPool.stairs(ModBlocks.GOLD_STAIRS);
        goldPool.fence(ModBlocks.GOLD_FENCE);
        goldPool.fenceGate(ModBlocks.GOLD_FENCE_GATE);
        //redstone
        redstonePool.button(ModBlocks.REDSTONE_BUTTON);
        redstonePool.wall(ModBlocks.REDSTONE_WALL);
        redstonePool.slab(ModBlocks.REDSTONE_SLAB);
        redstonePool.stairs(ModBlocks.REDSTONE_STAIRS);
        redstonePool.fence(ModBlocks.REDSTONE_FENCE);
        redstonePool.fenceGate(ModBlocks.REDSTONE_FENCE_GATE);
        redstonePool.pressurePlate(ModBlocks.REDSTONE_PRESSURE_PLATE);
        //emerald
        emeraldPool.button(ModBlocks.EMERALD_BUTTON);
        emeraldPool.wall(ModBlocks.EMERALD_WALL);
        emeraldPool.slab(ModBlocks.EMERALD_SLAB);
        emeraldPool.stairs(ModBlocks.EMERALD_STAIRS);
        emeraldPool.fence(ModBlocks.EMERALD_FENCE);
        emeraldPool.fenceGate(ModBlocks.EMERALD_FENCE_GATE);
        emeraldPool.pressurePlate(ModBlocks.EMERALD_PRESSURE_PLATE);
        //lapis
        lapisPool.button(ModBlocks.LAPIS_BUTTON);
        lapisPool.wall(ModBlocks.LAPIS_WALL);
        lapisPool.slab(ModBlocks.LAPIS_SLAB);
        lapisPool.stairs(ModBlocks.LAPIS_STAIRS);
        lapisPool.fence(ModBlocks.LAPIS_FENCE);
        lapisPool.fenceGate(ModBlocks.LAPIS_FENCE_GATE);
        lapisPool.pressurePlate(ModBlocks.LAPIS_PRESSURE_PLATE);
        //diamond
        diamondPool.button(ModBlocks.DIAMOND_BUTTON);
        diamondPool.wall(ModBlocks.DIAMOND_WALL);
        diamondPool.slab(ModBlocks.DIAMOND_SLAB);
        diamondPool.stairs(ModBlocks.DIAMOND_STAIRS);
        diamondPool.fence(ModBlocks.DIAMOND_FENCE);
        diamondPool.fenceGate(ModBlocks.DIAMOND_FENCE_GATE);
        diamondPool.pressurePlate(ModBlocks.DIAMOND_PRESSURE_PLATE);
        //netherite
        netheritePool.button(ModBlocks.NETHERITE_BUTTON);
        netheritePool.wall(ModBlocks.NETHERITE_WALL);
        netheritePool.slab(ModBlocks.NETHERITE_SLAB);
        netheritePool.stairs(ModBlocks.NETHERITE_STAIRS);
        netheritePool.fence(ModBlocks.NETHERITE_FENCE);
        netheritePool.fenceGate(ModBlocks.NETHERITE_FENCE_GATE);
        netheritePool.pressurePlate(ModBlocks.NETHERITE_PRESSURE_PLATE);
        //quartz
        quartzPool.button(ModBlocks.QUARTZ_BUTTON);
        quartzPool.wall(ModBlocks.QUARTZ_WALL);
        quartzPool.fence(ModBlocks.QUARTZ_FENCE);
        quartzPool.fenceGate(ModBlocks.QUARTZ_FENCE_GATE);
        quartzPool.pressurePlate(ModBlocks.QUARTZ_PRESSURE_PLATE);
        //quartz_brick
        quartzBrickPool.button(ModBlocks.QUARTZ_BRICK_BUTTON);
        quartzBrickPool.wall(ModBlocks.QUARTZ_BRICK_WALL);
        quartzBrickPool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        quartzBrickPool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.fence(ModBlocks.QUARTZ_BRICK_FENCE);
        quartzBrickPool.fenceGate(ModBlocks.QUARTZ_BRICK_FENCE_GATE);
        quartzBrickPool.pressurePlate(ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE);
        //smooth_quartz
        smoothQuartzPool.button(ModBlocks.SMOOTH_QUARTZ_BUTTON);
        smoothQuartzPool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
        smoothQuartzPool.fence(ModBlocks.SMOOTH_QUARTZ_FENCE);
        smoothQuartzPool.fenceGate(ModBlocks.SMOOTH_QUARTZ_FENCE_GATE);
        smoothQuartzPool.pressurePlate(ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE);
        //amethyst
        amethystPool.button(ModBlocks.AMETHYST_BUTTON);
        amethystPool.wall(ModBlocks.AMETHYST_WALL);
        amethystPool.slab(ModBlocks.AMETHYST_SLAB);
        amethystPool.stairs(ModBlocks.AMETHYST_STAIRS);
        amethystPool.fence(ModBlocks.AMETHYST_FENCE);
        amethystPool.fenceGate(ModBlocks.AMETHYST_FENCE_GATE);
        amethystPool.pressurePlate(ModBlocks.AMETHYST_PRESSURE_PLATE);
        //copper
        copperPool.button(ModBlocks.COPPER_BUTTON);
        copperPool.wall(ModBlocks.COPPER_WALL);
        copperPool.slab(ModBlocks.COPPER_SLAB);
        copperPool.stairs(ModBlocks.COPPER_STAIRS);
        copperPool.fence(ModBlocks.COPPER_FENCE);
        copperPool.fenceGate(ModBlocks.COPPER_FENCE_GATE);
        copperPool.pressurePlate(ModBlocks.COPPER_PRESSURE_PLATE);        
        //exposed Copper
        exposedCopperPool.button(ModBlocks.EXPOSED_COPPER_BUTTON);
        exposedCopperPool.wall(ModBlocks.EXPOSED_COPPER_WALL);
        exposedCopperPool.slab(ModBlocks.EXPOSED_COPPER_SLAB);
        exposedCopperPool.stairs(ModBlocks.EXPOSED_COPPER_STAIRS);
        exposedCopperPool.fence(ModBlocks.EXPOSED_COPPER_FENCE);
        exposedCopperPool.fenceGate(ModBlocks.EXPOSED_COPPER_FENCE_GATE);
        exposedCopperPool.pressurePlate(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);        
        //weathered Copper
        weatheredCopperPool.button(ModBlocks.WEATHERED_COPPER_BUTTON);
        weatheredCopperPool.wall(ModBlocks.WEATHERED_COPPER_WALL);
        weatheredCopperPool.slab(ModBlocks.WEATHERED_COPPER_SLAB);
        weatheredCopperPool.stairs(ModBlocks.WEATHERED_COPPER_STAIRS);
        weatheredCopperPool.fence(ModBlocks.WEATHERED_COPPER_FENCE);
        weatheredCopperPool.fenceGate(ModBlocks.WEATHERED_COPPER_FENCE_GATE);
        weatheredCopperPool.pressurePlate(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);        
        //weathered Copper
        oxidizedCopperPool.button(ModBlocks.OXIDIZED_COPPER_BUTTON);
        oxidizedCopperPool.wall(ModBlocks.OXIDIZED_COPPER_WALL);
        oxidizedCopperPool.slab(ModBlocks.OXIDIZED_COPPER_SLAB);
        oxidizedCopperPool.stairs(ModBlocks.OXIDIZED_COPPER_STAIRS);
        oxidizedCopperPool.fence(ModBlocks.OXIDIZED_COPPER_FENCE);
        oxidizedCopperPool.fenceGate(ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
        oxidizedCopperPool.pressurePlate(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        //waxed copper
        copperPool.button(ModBlocks.WAXED_COPPER_BUTTON);
        copperPool.wall(ModBlocks.WAXED_COPPER_WALL);
        copperPool.slab(ModBlocks.WAXED_COPPER_SLAB);
        copperPool.stairs(ModBlocks.WAXED_COPPER_STAIRS);
        copperPool.fence(ModBlocks.WAXED_COPPER_FENCE);
        copperPool.fenceGate(ModBlocks.WAXED_COPPER_FENCE_GATE);
        copperPool.pressurePlate(ModBlocks.WAXED_COPPER_PRESSURE_PLATE);        
        //waxed exposed Copper
        exposedCopperPool.button(ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        exposedCopperPool.wall(ModBlocks.WAXED_EXPOSED_COPPER_WALL);
        exposedCopperPool.slab(ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
        exposedCopperPool.stairs(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        exposedCopperPool.fence(ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
        exposedCopperPool.fenceGate(ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
        exposedCopperPool.pressurePlate(ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);        
        //waxed weathered Copper
        weatheredCopperPool.button(ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        weatheredCopperPool.wall(ModBlocks.WAXED_WEATHERED_COPPER_WALL);
        weatheredCopperPool.slab(ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
        weatheredCopperPool.stairs(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        weatheredCopperPool.fence(ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
        weatheredCopperPool.fenceGate(ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
        weatheredCopperPool.pressurePlate(ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);        
        //waxed weathered Copper
        oxidizedCopperPool.button(ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        oxidizedCopperPool.wall(ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
        oxidizedCopperPool.slab(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
        oxidizedCopperPool.stairs(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        oxidizedCopperPool.fence(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
        oxidizedCopperPool.fenceGate(ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
        oxidizedCopperPool.pressurePlate(ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        //cut Copper
        cutCopperPool.button(ModBlocks.CUT_COPPER_BUTTON);
        cutCopperPool.wall(ModBlocks.CUT_COPPER_WALL);
        cutCopperPool.fence(ModBlocks.CUT_COPPER_FENCE);
        cutCopperPool.fenceGate(ModBlocks.CUT_COPPER_FENCE_GATE);
        cutCopperPool.pressurePlate(ModBlocks.CUT_COPPER_PRESSURE_PLATE);
        //cut exposed Copper
        exposedCutCopperPool.button(ModBlocks.EXPOSED_CUT_COPPER_BUTTON);
        exposedCutCopperPool.wall(ModBlocks.EXPOSED_CUT_COPPER_WALL);
        exposedCutCopperPool.fence(ModBlocks.EXPOSED_CUT_COPPER_FENCE);
        exposedCutCopperPool.fenceGate(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE);
        exposedCutCopperPool.pressurePlate(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        //cut weathered Copper
        weatheredCutCopperPool.button(ModBlocks.WEATHERED_CUT_COPPER_BUTTON);
        weatheredCutCopperPool.wall(ModBlocks.WEATHERED_CUT_COPPER_WALL);
        weatheredCutCopperPool.fence(ModBlocks.WEATHERED_CUT_COPPER_FENCE);
        weatheredCutCopperPool.fenceGate(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE);
        weatheredCutCopperPool.pressurePlate(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        //cut weathered Copper
        oxidizedCutCopperPool.button(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON);
        oxidizedCutCopperPool.wall(ModBlocks.OXIDIZED_CUT_COPPER_WALL);
        oxidizedCutCopperPool.fence(ModBlocks.OXIDIZED_CUT_COPPER_FENCE);
        oxidizedCutCopperPool.fenceGate(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE);
        oxidizedCutCopperPool.pressurePlate(ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE);        
        //waxed cut Copper
        cutCopperPool.button(ModBlocks.WAXED_CUT_COPPER_BUTTON);
        cutCopperPool.wall(ModBlocks.WAXED_CUT_COPPER_WALL);
        cutCopperPool.fence(ModBlocks.WAXED_CUT_COPPER_FENCE);
        cutCopperPool.fenceGate(ModBlocks.WAXED_CUT_COPPER_FENCE_GATE);
        cutCopperPool.pressurePlate(ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE);
        //waxed cut exposed Copper
        exposedCutCopperPool.button(ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON);
        exposedCutCopperPool.wall(ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
        exposedCutCopperPool.fence(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE);
        exposedCutCopperPool.fenceGate(ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE);
        exposedCutCopperPool.pressurePlate(ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        //waxed cut weathered Copper
        weatheredCutCopperPool.button(ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON);
        weatheredCutCopperPool.wall(ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
        weatheredCutCopperPool.fence(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE);
        weatheredCutCopperPool.fenceGate(ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE);
        weatheredCutCopperPool.pressurePlate(ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        //waxed cut weathered Copper
        oxidizedCutCopperPool.button(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON);
        oxidizedCutCopperPool.wall(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
        oxidizedCutCopperPool.fence(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE);
        oxidizedCutCopperPool.fenceGate(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE);
        oxidizedCutCopperPool.pressurePlate(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
        //white_wool
        whiteWoolPool.button(ModBlocks.WHITE_WOOL_BUTTON);
        whiteWoolPool.wall(ModBlocks.WHITE_WOOL_WALL);
        whiteWoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        whiteWoolPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);
        whiteWoolPool.fence(ModBlocks.WHITE_WOOL_FENCE);
        whiteWoolPool.fenceGate(ModBlocks.WHITE_WOOL_FENCE_GATE);
        whiteWoolPool.pressurePlate(ModBlocks.WHITE_WOOL_PRESSURE_PLATE);
        //light_gray_wool
        lightGrayWoolPool.button(ModBlocks.LIGHT_GRAY_WOOL_BUTTON);
        lightGrayWoolPool.wall(ModBlocks.LIGHT_GRAY_WOOL_WALL);
        lightGrayWoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        lightGrayWoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        lightGrayWoolPool.fence(ModBlocks.LIGHT_GRAY_WOOL_FENCE);
        lightGrayWoolPool.fenceGate(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE);
        lightGrayWoolPool.pressurePlate(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE);
        //gray_wool
        grayWoolPool.button(ModBlocks.GRAY_WOOL_BUTTON);
        grayWoolPool.wall(ModBlocks.GRAY_WOOL_WALL);
        grayWoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        grayWoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);
        grayWoolPool.fence(ModBlocks.GRAY_WOOL_FENCE);
        grayWoolPool.fenceGate(ModBlocks.GRAY_WOOL_FENCE_GATE);
        grayWoolPool.pressurePlate(ModBlocks.GRAY_WOOL_PRESSURE_PLATE);
        //black_wool
        blackWoolPool.button(ModBlocks.BLACK_WOOL_BUTTON);
        blackWoolPool.wall(ModBlocks.BLACK_WOOL_WALL);
        blackWoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        blackWoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);
        blackWoolPool.fence(ModBlocks.BLACK_WOOL_FENCE);
        blackWoolPool.fenceGate(ModBlocks.BLACK_WOOL_FENCE_GATE);
        blackWoolPool.pressurePlate(ModBlocks.BLACK_WOOL_PRESSURE_PLATE);
        //brown_wool
        brownWoolPool.button(ModBlocks.BROWN_WOOL_BUTTON);
        brownWoolPool.wall(ModBlocks.BROWN_WOOL_WALL);
        brownWoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        brownWoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);
        brownWoolPool.fence(ModBlocks.BROWN_WOOL_FENCE);
        brownWoolPool.fenceGate(ModBlocks.BROWN_WOOL_FENCE_GATE);
        brownWoolPool.pressurePlate(ModBlocks.BROWN_WOOL_PRESSURE_PLATE);
        //red_wool
        redWoolPool.button(ModBlocks.RED_WOOL_BUTTON);
        redWoolPool.wall(ModBlocks.RED_WOOL_WALL);
        redWoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        redWoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);
        redWoolPool.fence(ModBlocks.RED_WOOL_FENCE);
        redWoolPool.fenceGate(ModBlocks.RED_WOOL_FENCE_GATE);
        redWoolPool.pressurePlate(ModBlocks.RED_WOOL_PRESSURE_PLATE);
        //orange_wool
        orangeWoolPool.button(ModBlocks.ORANGE_WOOL_BUTTON);
        orangeWoolPool.wall(ModBlocks.ORANGE_WOOL_WALL);
        orangeWoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        orangeWoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        orangeWoolPool.fence(ModBlocks.ORANGE_WOOL_FENCE);
        orangeWoolPool.fenceGate(ModBlocks.ORANGE_WOOL_FENCE_GATE);
        orangeWoolPool.pressurePlate(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE);
        //yellow_wool
        yellowWoolPool.button(ModBlocks.YELLOW_WOOL_BUTTON);
        yellowWoolPool.wall(ModBlocks.YELLOW_WOOL_WALL);
        yellowWoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        yellowWoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        yellowWoolPool.fence(ModBlocks.YELLOW_WOOL_FENCE);
        yellowWoolPool.fenceGate(ModBlocks.YELLOW_WOOL_FENCE_GATE);
        yellowWoolPool.pressurePlate(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE);
        //lime_wool
        limeWoolPool.button(ModBlocks.LIME_WOOL_BUTTON);
        limeWoolPool.wall(ModBlocks.LIME_WOOL_WALL);
        limeWoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        limeWoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);
        limeWoolPool.fence(ModBlocks.LIME_WOOL_FENCE);
        limeWoolPool.fenceGate(ModBlocks.LIME_WOOL_FENCE_GATE);
        limeWoolPool.pressurePlate(ModBlocks.LIME_WOOL_PRESSURE_PLATE);
        //green_wool
        greenWoolPool.button(ModBlocks.GREEN_WOOL_BUTTON);
        greenWoolPool.wall(ModBlocks.GREEN_WOOL_WALL);
        greenWoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        greenWoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);
        greenWoolPool.fence(ModBlocks.GREEN_WOOL_FENCE);
        greenWoolPool.fenceGate(ModBlocks.GREEN_WOOL_FENCE_GATE);
        greenWoolPool.pressurePlate(ModBlocks.GREEN_WOOL_PRESSURE_PLATE);
        //cyan_wool
        cyanWoolPool.button(ModBlocks.CYAN_WOOL_BUTTON);
        cyanWoolPool.wall(ModBlocks.CYAN_WOOL_WALL);
        cyanWoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        cyanWoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);
        cyanWoolPool.fence(ModBlocks.CYAN_WOOL_FENCE);
        cyanWoolPool.fenceGate(ModBlocks.CYAN_WOOL_FENCE_GATE);
        cyanWoolPool.pressurePlate(ModBlocks.CYAN_WOOL_PRESSURE_PLATE);
        //blue_wool
        blueWoolPool.button(ModBlocks.BLUE_WOOL_BUTTON);
        blueWoolPool.wall(ModBlocks.BLUE_WOOL_WALL);
        blueWoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        blueWoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);
        blueWoolPool.fence(ModBlocks.BLUE_WOOL_FENCE);
        blueWoolPool.fenceGate(ModBlocks.BLUE_WOOL_FENCE_GATE);
        blueWoolPool.pressurePlate(ModBlocks.BLUE_WOOL_PRESSURE_PLATE);
        //light_blue_wool
        lightBlueWoolPool.button(ModBlocks.LIGHT_BLUE_WOOL_BUTTON);
        lightBlueWoolPool.wall(ModBlocks.LIGHT_BLUE_WOOL_WALL);
        lightBlueWoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        lightBlueWoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        lightBlueWoolPool.fence(ModBlocks.LIGHT_BLUE_WOOL_FENCE);
        lightBlueWoolPool.fenceGate(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE);
        lightBlueWoolPool.pressurePlate(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE);
        //purple_wool
        purpleWoolPool.button(ModBlocks.PURPLE_WOOL_BUTTON);
        purpleWoolPool.wall(ModBlocks.PURPLE_WOOL_WALL);
        purpleWoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        purpleWoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        purpleWoolPool.fence(ModBlocks.PURPLE_WOOL_FENCE);
        purpleWoolPool.fenceGate(ModBlocks.PURPLE_WOOL_FENCE_GATE);
        purpleWoolPool.pressurePlate(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE);
        //magenta_wool
        magentaWoolPool.button(ModBlocks.MAGENTA_WOOL_BUTTON);
        magentaWoolPool.wall(ModBlocks.MAGENTA_WOOL_WALL);
        magentaWoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        magentaWoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        magentaWoolPool.fence(ModBlocks.MAGENTA_WOOL_FENCE);
        magentaWoolPool.fenceGate(ModBlocks.MAGENTA_WOOL_FENCE_GATE);
        magentaWoolPool.pressurePlate(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE);
        //pink_wool
        pinkWoolPool.button(ModBlocks.PINK_WOOL_BUTTON);
        pinkWoolPool.wall(ModBlocks.PINK_WOOL_WALL);
        pinkWoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
        pinkWoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
        pinkWoolPool.fence(ModBlocks.PINK_WOOL_FENCE);
        pinkWoolPool.fenceGate(ModBlocks.PINK_WOOL_FENCE_GATE);
        pinkWoolPool.pressurePlate(ModBlocks.PINK_WOOL_PRESSURE_PLATE);
        //terracotta
        terracottaPool.button(ModBlocks.TERRACOTTA_BUTTON);
        terracottaPool.wall(ModBlocks.TERRACOTTA_WALL);
        terracottaPool.slab(ModBlocks.TERRACOTTA_SLAB);
        terracottaPool.stairs(ModBlocks.TERRACOTTA_STAIRS);
        terracottaPool.fence(ModBlocks.TERRACOTTA_FENCE);
        terracottaPool.fenceGate(ModBlocks.TERRACOTTA_FENCE_GATE);
        terracottaPool.pressurePlate(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
        //white_terracotta
        whiteTerracottaPool.button(ModBlocks.WHITE_TERRACOTTA_BUTTON);
        whiteTerracottaPool.wall(ModBlocks.WHITE_TERRACOTTA_WALL);
        whiteTerracottaPool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);
        whiteTerracottaPool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        whiteTerracottaPool.fence(ModBlocks.WHITE_TERRACOTTA_FENCE);
        whiteTerracottaPool.fenceGate(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE);
        whiteTerracottaPool.pressurePlate(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
        //light_gray_terracotta
        lightGrayTerracottaPool.button(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);
        lightGrayTerracottaPool.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        lightGrayTerracottaPool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        lightGrayTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        lightGrayTerracottaPool.fence(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE);
        lightGrayTerracottaPool.fenceGate(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE);
        lightGrayTerracottaPool.pressurePlate(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
        //gray_terracotta
        grayTerracottaPool.button(ModBlocks.GRAY_TERRACOTTA_BUTTON);
        grayTerracottaPool.wall(ModBlocks.GRAY_TERRACOTTA_WALL);
        grayTerracottaPool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);
        grayTerracottaPool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        grayTerracottaPool.fence(ModBlocks.GRAY_TERRACOTTA_FENCE);
        grayTerracottaPool.fenceGate(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE);
        grayTerracottaPool.pressurePlate(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
        //black_terracotta
        blackTerracottaPool.button(ModBlocks.BLACK_TERRACOTTA_BUTTON);
        blackTerracottaPool.wall(ModBlocks.BLACK_TERRACOTTA_WALL);
        blackTerracottaPool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);
        blackTerracottaPool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        blackTerracottaPool.fence(ModBlocks.BLACK_TERRACOTTA_FENCE);
        blackTerracottaPool.fenceGate(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE);
        blackTerracottaPool.pressurePlate(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
        //brown_terracotta
        brownTerracottaPool.button(ModBlocks.BROWN_TERRACOTTA_BUTTON);
        brownTerracottaPool.wall(ModBlocks.BROWN_TERRACOTTA_WALL);
        brownTerracottaPool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);
        brownTerracottaPool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        brownTerracottaPool.fence(ModBlocks.BROWN_TERRACOTTA_FENCE);
        brownTerracottaPool.fenceGate(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE);
        brownTerracottaPool.pressurePlate(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
        //red_terracotta
        redTerracottaPool.button(ModBlocks.RED_TERRACOTTA_BUTTON);
        redTerracottaPool.wall(ModBlocks.RED_TERRACOTTA_WALL);
        redTerracottaPool.slab(ModBlocks.RED_TERRACOTTA_SLAB);
        redTerracottaPool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        redTerracottaPool.fence(ModBlocks.RED_TERRACOTTA_FENCE);
        redTerracottaPool.fenceGate(ModBlocks.RED_TERRACOTTA_FENCE_GATE);
        redTerracottaPool.pressurePlate(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
        //orange_terracotta
        orangeTerracottaPool.button(ModBlocks.ORANGE_TERRACOTTA_BUTTON);
        orangeTerracottaPool.wall(ModBlocks.ORANGE_TERRACOTTA_WALL);
        orangeTerracottaPool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        orangeTerracottaPool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        orangeTerracottaPool.fence(ModBlocks.ORANGE_TERRACOTTA_FENCE);
        orangeTerracottaPool.fenceGate(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE);
        orangeTerracottaPool.pressurePlate(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
        //yellow_terracotta
        yellowTerracottaPool.button(ModBlocks.YELLOW_TERRACOTTA_BUTTON);
        yellowTerracottaPool.wall(ModBlocks.YELLOW_TERRACOTTA_WALL);
        yellowTerracottaPool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        yellowTerracottaPool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellowTerracottaPool.fence(ModBlocks.YELLOW_TERRACOTTA_FENCE);
        yellowTerracottaPool.fenceGate(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE);
        yellowTerracottaPool.pressurePlate(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
        //lime_terracotta
        limeTerracottaPool.button(ModBlocks.LIME_TERRACOTTA_BUTTON);
        limeTerracottaPool.wall(ModBlocks.LIME_TERRACOTTA_WALL);
        limeTerracottaPool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);
        limeTerracottaPool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        limeTerracottaPool.fence(ModBlocks.LIME_TERRACOTTA_FENCE);
        limeTerracottaPool.fenceGate(ModBlocks.LIME_TERRACOTTA_FENCE_GATE);
        limeTerracottaPool.pressurePlate(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
        //green_terracotta
        greenTerracottaPool.button(ModBlocks.GREEN_TERRACOTTA_BUTTON);
        greenTerracottaPool.wall(ModBlocks.GREEN_TERRACOTTA_WALL);
        greenTerracottaPool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);
        greenTerracottaPool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        greenTerracottaPool.fence(ModBlocks.GREEN_TERRACOTTA_FENCE);
        greenTerracottaPool.fenceGate(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE);
        greenTerracottaPool.pressurePlate(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
        //cyan_terracotta
        cyanTerracottaPool.button(ModBlocks.CYAN_TERRACOTTA_BUTTON);
        cyanTerracottaPool.wall(ModBlocks.CYAN_TERRACOTTA_WALL);
        cyanTerracottaPool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);
        cyanTerracottaPool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        cyanTerracottaPool.fence(ModBlocks.CYAN_TERRACOTTA_FENCE);
        cyanTerracottaPool.fenceGate(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE);
        cyanTerracottaPool.pressurePlate(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
        //blue_terracotta
        blueTerracottaPool.button(ModBlocks.BLUE_TERRACOTTA_BUTTON);
        blueTerracottaPool.wall(ModBlocks.BLUE_TERRACOTTA_WALL);
        blueTerracottaPool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);
        blueTerracottaPool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        blueTerracottaPool.fence(ModBlocks.BLUE_TERRACOTTA_FENCE);
        blueTerracottaPool.fenceGate(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE);
        blueTerracottaPool.pressurePlate(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
        //light_blue_terracotta
        lightBlueTerracottaPool.button(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);
        lightBlueTerracottaPool.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        lightBlueTerracottaPool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        lightBlueTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        lightBlueTerracottaPool.fence(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE);
        lightBlueTerracottaPool.fenceGate(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE);
        lightBlueTerracottaPool.pressurePlate(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
        //purple_terracotta
        purpleTerracottaPool.button(ModBlocks.PURPLE_TERRACOTTA_BUTTON);
        purpleTerracottaPool.wall(ModBlocks.PURPLE_TERRACOTTA_WALL);
        purpleTerracottaPool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        purpleTerracottaPool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        purpleTerracottaPool.fence(ModBlocks.PURPLE_TERRACOTTA_FENCE);
        purpleTerracottaPool.fenceGate(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE);
        purpleTerracottaPool.pressurePlate(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
        //magenta_terracotta
        magentaTerracottaPool.button(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);
        magentaTerracottaPool.wall(ModBlocks.MAGENTA_TERRACOTTA_WALL);
        magentaTerracottaPool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        magentaTerracottaPool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magentaTerracottaPool.fence(ModBlocks.MAGENTA_TERRACOTTA_FENCE);
        magentaTerracottaPool.fenceGate(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE);
        magentaTerracottaPool.pressurePlate(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
        //pink_terracotta
        pinkTerracottaPool.button(ModBlocks.PINK_TERRACOTTA_BUTTON);
        pinkTerracottaPool.wall(ModBlocks.PINK_TERRACOTTA_WALL);
        pinkTerracottaPool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);
        pinkTerracottaPool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        pinkTerracottaPool.fence(ModBlocks.PINK_TERRACOTTA_FENCE);
        pinkTerracottaPool.fenceGate(ModBlocks.PINK_TERRACOTTA_FENCE_GATE);
        pinkTerracottaPool.pressurePlate(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
        //white_concrete
        whiteConcretePool.button(ModBlocks.WHITE_CONCRETE_BUTTON);
        whiteConcretePool.wall(ModBlocks.WHITE_CONCRETE_WALL);
        whiteConcretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        whiteConcretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        whiteConcretePool.fence(ModBlocks.WHITE_CONCRETE_FENCE);
        whiteConcretePool.fenceGate(ModBlocks.WHITE_CONCRETE_FENCE_GATE);
        whiteConcretePool.pressurePlate(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        //light_gray_concrete
        lightGrayConcretePool.button(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        lightGrayConcretePool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        lightGrayConcretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayConcretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayConcretePool.fence(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        lightGrayConcretePool.fenceGate(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE);
        lightGrayConcretePool.pressurePlate(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        //gray_concrete
        grayConcretePool.button(ModBlocks.GRAY_CONCRETE_BUTTON);
        grayConcretePool.wall(ModBlocks.GRAY_CONCRETE_WALL);
        grayConcretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);
        grayConcretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        grayConcretePool.fence(ModBlocks.GRAY_CONCRETE_FENCE);
        grayConcretePool.fenceGate(ModBlocks.GRAY_CONCRETE_FENCE_GATE);
        grayConcretePool.pressurePlate(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        //black_concrete
        blackConcretePool.button(ModBlocks.BLACK_CONCRETE_BUTTON);
        blackConcretePool.wall(ModBlocks.BLACK_CONCRETE_WALL);
        blackConcretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);
        blackConcretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        blackConcretePool.fence(ModBlocks.BLACK_CONCRETE_FENCE);
        blackConcretePool.fenceGate(ModBlocks.BLACK_CONCRETE_FENCE_GATE);
        blackConcretePool.pressurePlate(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        //brown_concrete
        brownConcretePool.button(ModBlocks.BROWN_CONCRETE_BUTTON);
        brownConcretePool.wall(ModBlocks.BROWN_CONCRETE_WALL);
        brownConcretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);
        brownConcretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        brownConcretePool.fence(ModBlocks.BROWN_CONCRETE_FENCE);
        brownConcretePool.fenceGate(ModBlocks.BROWN_CONCRETE_FENCE_GATE);
        brownConcretePool.pressurePlate(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        //red_concrete
        redConcretePool.button(ModBlocks.RED_CONCRETE_BUTTON);
        redConcretePool.wall(ModBlocks.RED_CONCRETE_WALL);
        redConcretePool.slab(ModBlocks.RED_CONCRETE_SLAB);
        redConcretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        redConcretePool.fence(ModBlocks.RED_CONCRETE_FENCE);
        redConcretePool.fenceGate(ModBlocks.RED_CONCRETE_FENCE_GATE);
        redConcretePool.pressurePlate(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        //orange_concrete
        orangeConcretePool.button(ModBlocks.ORANGE_CONCRETE_BUTTON);
        orangeConcretePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);
        orangeConcretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        orangeConcretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        orangeConcretePool.fence(ModBlocks.ORANGE_CONCRETE_FENCE);
        orangeConcretePool.fenceGate(ModBlocks.ORANGE_CONCRETE_FENCE_GATE);
        orangeConcretePool.pressurePlate(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        //yellow_concrete
        yellowConcretePool.button(ModBlocks.YELLOW_CONCRETE_BUTTON);
        yellowConcretePool.wall(ModBlocks.YELLOW_CONCRETE_WALL);
        yellowConcretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        yellowConcretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        yellowConcretePool.fence(ModBlocks.YELLOW_CONCRETE_FENCE);
        yellowConcretePool.fenceGate(ModBlocks.YELLOW_CONCRETE_FENCE_GATE);
        yellowConcretePool.pressurePlate(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        //lime_concrete
        limeConcretePool.button(ModBlocks.LIME_CONCRETE_BUTTON);
        limeConcretePool.wall(ModBlocks.LIME_CONCRETE_WALL);
        limeConcretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        limeConcretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        limeConcretePool.fence(ModBlocks.LIME_CONCRETE_FENCE);
        limeConcretePool.fenceGate(ModBlocks.LIME_CONCRETE_FENCE_GATE);
        limeConcretePool.pressurePlate(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        //green_concrete
        greenConcretePool.button(ModBlocks.GREEN_CONCRETE_BUTTON);
        greenConcretePool.wall(ModBlocks.GREEN_CONCRETE_WALL);
        greenConcretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);
        greenConcretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        greenConcretePool.fence(ModBlocks.GREEN_CONCRETE_FENCE);
        greenConcretePool.fenceGate(ModBlocks.GREEN_CONCRETE_FENCE_GATE);
        greenConcretePool.pressurePlate(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        //cyan_concrete
        cyanConcretePool.button(ModBlocks.CYAN_CONCRETE_BUTTON);
        cyanConcretePool.wall(ModBlocks.CYAN_CONCRETE_WALL);
        cyanConcretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        cyanConcretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        cyanConcretePool.fence(ModBlocks.CYAN_CONCRETE_FENCE);
        cyanConcretePool.fenceGate(ModBlocks.CYAN_CONCRETE_FENCE_GATE);
        cyanConcretePool.pressurePlate(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        //blue_concrete
        blueConcretePool.button(ModBlocks.BLUE_CONCRETE_BUTTON);
        blueConcretePool.wall(ModBlocks.BLUE_CONCRETE_WALL);
        blueConcretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);
        blueConcretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        blueConcretePool.fence(ModBlocks.BLUE_CONCRETE_FENCE);
        blueConcretePool.fenceGate(ModBlocks.BLUE_CONCRETE_FENCE_GATE);
        blueConcretePool.pressurePlate(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        //light_blue_concrete
        lightBlueConcretePool.button(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        lightBlueConcretePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        lightBlueConcretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBlueConcretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBlueConcretePool.fence(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        lightBlueConcretePool.fenceGate(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE);
        lightBlueConcretePool.pressurePlate(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        //purple_concrete
        purpleConcretePool.button(ModBlocks.PURPLE_CONCRETE_BUTTON);
        purpleConcretePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);
        purpleConcretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);
        purpleConcretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        purpleConcretePool.fence(ModBlocks.PURPLE_CONCRETE_FENCE);
        purpleConcretePool.fenceGate(ModBlocks.PURPLE_CONCRETE_FENCE_GATE);
        purpleConcretePool.pressurePlate(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        //magenta_concrete
        magentaConcretePool.button(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        magentaConcretePool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);
        magentaConcretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        magentaConcretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaConcretePool.fence(ModBlocks.MAGENTA_CONCRETE_FENCE);
        magentaConcretePool.fenceGate(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE);
        magentaConcretePool.pressurePlate(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        //pink_concrete
        pinkConcretePool.button(ModBlocks.PINK_CONCRETE_BUTTON);
        pinkConcretePool.wall(ModBlocks.PINK_CONCRETE_WALL);
        pinkConcretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        pinkConcretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        pinkConcretePool.fence(ModBlocks.PINK_CONCRETE_FENCE);
        pinkConcretePool.fenceGate(ModBlocks.PINK_CONCRETE_FENCE_GATE);
        pinkConcretePool.pressurePlate(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        //white_concrete
        whiteConcretePowderPool.button(ModBlocks.WHITE_CONCRETE_POWDER_BUTTON);
        whiteConcretePowderPool.wall(ModBlocks.WHITE_CONCRETE_POWDER_WALL);
        whiteConcretePowderPool.slab(ModBlocks.WHITE_CONCRETE_POWDER_SLAB);
        whiteConcretePowderPool.stairs(ModBlocks.WHITE_CONCRETE_POWDER_STAIRS);
        whiteConcretePowderPool.fence(ModBlocks.WHITE_CONCRETE_POWDER_FENCE);
        whiteConcretePowderPool.fenceGate(ModBlocks.WHITE_CONCRETE_POWDER_FENCE_GATE);
        whiteConcretePowderPool.pressurePlate(ModBlocks.WHITE_CONCRETE_POWDER_PRESSURE_PLATE);
        //light_gray_concrete
        lightGrayConcretePowderPool.button(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON);
        lightGrayConcretePowderPool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL);
        lightGrayConcretePowderPool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB);
        lightGrayConcretePowderPool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS);
        lightGrayConcretePowderPool.fence(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE);
        lightGrayConcretePowderPool.fenceGate(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE);
        lightGrayConcretePowderPool.pressurePlate(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE);
        //gray_concrete
        grayConcretePowderPool.button(ModBlocks.GRAY_CONCRETE_POWDER_BUTTON);
        grayConcretePowderPool.wall(ModBlocks.GRAY_CONCRETE_POWDER_WALL);
        grayConcretePowderPool.slab(ModBlocks.GRAY_CONCRETE_POWDER_SLAB);
        grayConcretePowderPool.stairs(ModBlocks.GRAY_CONCRETE_POWDER_STAIRS);
        grayConcretePowderPool.fence(ModBlocks.GRAY_CONCRETE_POWDER_FENCE);
        grayConcretePowderPool.fenceGate(ModBlocks.GRAY_CONCRETE_POWDER_FENCE_GATE);
        grayConcretePowderPool.pressurePlate(ModBlocks.GRAY_CONCRETE_POWDER_PRESSURE_PLATE);
        //black_concrete
        blackConcretePowderPool.button(ModBlocks.BLACK_CONCRETE_POWDER_BUTTON);
        blackConcretePowderPool.wall(ModBlocks.BLACK_CONCRETE_POWDER_WALL);
        blackConcretePowderPool.slab(ModBlocks.BLACK_CONCRETE_POWDER_SLAB);
        blackConcretePowderPool.stairs(ModBlocks.BLACK_CONCRETE_POWDER_STAIRS);
        blackConcretePowderPool.fence(ModBlocks.BLACK_CONCRETE_POWDER_FENCE);
        blackConcretePowderPool.fenceGate(ModBlocks.BLACK_CONCRETE_POWDER_FENCE_GATE);
        blackConcretePowderPool.pressurePlate(ModBlocks.BLACK_CONCRETE_POWDER_PRESSURE_PLATE);
        //brown_concrete
        brownConcretePowderPool.button(ModBlocks.BROWN_CONCRETE_POWDER_BUTTON);
        brownConcretePowderPool.wall(ModBlocks.BROWN_CONCRETE_POWDER_WALL);
        brownConcretePowderPool.slab(ModBlocks.BROWN_CONCRETE_POWDER_SLAB);
        brownConcretePowderPool.stairs(ModBlocks.BROWN_CONCRETE_POWDER_STAIRS);
        brownConcretePowderPool.fence(ModBlocks.BROWN_CONCRETE_POWDER_FENCE);
        brownConcretePowderPool.fenceGate(ModBlocks.BROWN_CONCRETE_POWDER_FENCE_GATE);
        brownConcretePowderPool.pressurePlate(ModBlocks.BROWN_CONCRETE_POWDER_PRESSURE_PLATE);
        //red_concrete
        redConcretePowderPool.button(ModBlocks.RED_CONCRETE_POWDER_BUTTON);
        redConcretePowderPool.wall(ModBlocks.RED_CONCRETE_POWDER_WALL);
        redConcretePowderPool.slab(ModBlocks.RED_CONCRETE_POWDER_SLAB);
        redConcretePowderPool.stairs(ModBlocks.RED_CONCRETE_POWDER_STAIRS);
        redConcretePowderPool.fence(ModBlocks.RED_CONCRETE_POWDER_FENCE);
        redConcretePowderPool.fenceGate(ModBlocks.RED_CONCRETE_POWDER_FENCE_GATE);
        redConcretePowderPool.pressurePlate(ModBlocks.RED_CONCRETE_POWDER_PRESSURE_PLATE);
        //orange_concrete
        orangeConcretePowderPool.button(ModBlocks.ORANGE_CONCRETE_POWDER_BUTTON);
        orangeConcretePowderPool.wall(ModBlocks.ORANGE_CONCRETE_POWDER_WALL);
        orangeConcretePowderPool.slab(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB);
        orangeConcretePowderPool.stairs(ModBlocks.ORANGE_CONCRETE_POWDER_STAIRS);
        orangeConcretePowderPool.fence(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE);
        orangeConcretePowderPool.fenceGate(ModBlocks.ORANGE_CONCRETE_POWDER_FENCE_GATE);
        orangeConcretePowderPool.pressurePlate(ModBlocks.ORANGE_CONCRETE_POWDER_PRESSURE_PLATE);
        //yellow_concrete
        yellowConcretePowderPool.button(ModBlocks.YELLOW_CONCRETE_POWDER_BUTTON);
        yellowConcretePowderPool.wall(ModBlocks.YELLOW_CONCRETE_POWDER_WALL);
        yellowConcretePowderPool.slab(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB);
        yellowConcretePowderPool.stairs(ModBlocks.YELLOW_CONCRETE_POWDER_STAIRS);
        yellowConcretePowderPool.fence(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE);
        yellowConcretePowderPool.fenceGate(ModBlocks.YELLOW_CONCRETE_POWDER_FENCE_GATE);
        yellowConcretePowderPool.pressurePlate(ModBlocks.YELLOW_CONCRETE_POWDER_PRESSURE_PLATE);
        //lime_concrete
        limeConcretePowderPool.button(ModBlocks.LIME_CONCRETE_POWDER_BUTTON);
        limeConcretePowderPool.wall(ModBlocks.LIME_CONCRETE_POWDER_WALL);
        limeConcretePowderPool.slab(ModBlocks.LIME_CONCRETE_POWDER_SLAB);
        limeConcretePowderPool.stairs(ModBlocks.LIME_CONCRETE_POWDER_STAIRS);
        limeConcretePowderPool.fence(ModBlocks.LIME_CONCRETE_POWDER_FENCE);
        limeConcretePowderPool.fenceGate(ModBlocks.LIME_CONCRETE_POWDER_FENCE_GATE);
        limeConcretePowderPool.pressurePlate(ModBlocks.LIME_CONCRETE_POWDER_PRESSURE_PLATE);
        //green_concrete
        greenConcretePowderPool.button(ModBlocks.GREEN_CONCRETE_POWDER_BUTTON);
        greenConcretePowderPool.wall(ModBlocks.GREEN_CONCRETE_POWDER_WALL);
        greenConcretePowderPool.slab(ModBlocks.GREEN_CONCRETE_POWDER_SLAB);
        greenConcretePowderPool.stairs(ModBlocks.GREEN_CONCRETE_POWDER_STAIRS);
        greenConcretePowderPool.fence(ModBlocks.GREEN_CONCRETE_POWDER_FENCE);
        greenConcretePowderPool.fenceGate(ModBlocks.GREEN_CONCRETE_POWDER_FENCE_GATE);
        greenConcretePowderPool.pressurePlate(ModBlocks.GREEN_CONCRETE_POWDER_PRESSURE_PLATE);
        //cyan_concrete
        cyanConcretePowderPool.button(ModBlocks.CYAN_CONCRETE_POWDER_BUTTON);
        cyanConcretePowderPool.wall(ModBlocks.CYAN_CONCRETE_POWDER_WALL);
        cyanConcretePowderPool.slab(ModBlocks.CYAN_CONCRETE_POWDER_SLAB);
        cyanConcretePowderPool.stairs(ModBlocks.CYAN_CONCRETE_POWDER_STAIRS);
        cyanConcretePowderPool.fence(ModBlocks.CYAN_CONCRETE_POWDER_FENCE);
        cyanConcretePowderPool.fenceGate(ModBlocks.CYAN_CONCRETE_POWDER_FENCE_GATE);
        cyanConcretePowderPool.pressurePlate(ModBlocks.CYAN_CONCRETE_POWDER_PRESSURE_PLATE);
        //blue_concrete
        blueConcretePowderPool.button(ModBlocks.BLUE_CONCRETE_POWDER_BUTTON);
        blueConcretePowderPool.wall(ModBlocks.BLUE_CONCRETE_POWDER_WALL);
        blueConcretePowderPool.slab(ModBlocks.BLUE_CONCRETE_POWDER_SLAB);
        blueConcretePowderPool.stairs(ModBlocks.BLUE_CONCRETE_POWDER_STAIRS);
        blueConcretePowderPool.fence(ModBlocks.BLUE_CONCRETE_POWDER_FENCE);
        blueConcretePowderPool.fenceGate(ModBlocks.BLUE_CONCRETE_POWDER_FENCE_GATE);
        blueConcretePowderPool.pressurePlate(ModBlocks.BLUE_CONCRETE_POWDER_PRESSURE_PLATE);
        //light_blue_concrete
        lightBlueConcretePowderPool.button(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON);
        lightBlueConcretePowderPool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL);
        lightBlueConcretePowderPool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB);
        lightBlueConcretePowderPool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS);
        lightBlueConcretePowderPool.fence(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE);
        lightBlueConcretePowderPool.fenceGate(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE);
        lightBlueConcretePowderPool.pressurePlate(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE);
        //purple_concrete
        purpleConcretePowderPool.button(ModBlocks.PURPLE_CONCRETE_POWDER_BUTTON);
        purpleConcretePowderPool.wall(ModBlocks.PURPLE_CONCRETE_POWDER_WALL);
        purpleConcretePowderPool.slab(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB);
        purpleConcretePowderPool.stairs(ModBlocks.PURPLE_CONCRETE_POWDER_STAIRS);
        purpleConcretePowderPool.fence(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE);
        purpleConcretePowderPool.fenceGate(ModBlocks.PURPLE_CONCRETE_POWDER_FENCE_GATE);
        purpleConcretePowderPool.pressurePlate(ModBlocks.PURPLE_CONCRETE_POWDER_PRESSURE_PLATE);
        //magenta_concrete
        magentaConcretePowderPool.button(ModBlocks.MAGENTA_CONCRETE_POWDER_BUTTON);
        magentaConcretePowderPool.wall(ModBlocks.MAGENTA_CONCRETE_POWDER_WALL);
        magentaConcretePowderPool.slab(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB);
        magentaConcretePowderPool.stairs(ModBlocks.MAGENTA_CONCRETE_POWDER_STAIRS);
        magentaConcretePowderPool.fence(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE);
        magentaConcretePowderPool.fenceGate(ModBlocks.MAGENTA_CONCRETE_POWDER_FENCE_GATE);
        magentaConcretePowderPool.pressurePlate(ModBlocks.MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE);
        //pink_concrete
        pinkConcretePowderPool.button(ModBlocks.PINK_CONCRETE_POWDER_BUTTON);
        pinkConcretePowderPool.wall(ModBlocks.PINK_CONCRETE_POWDER_WALL);
        pinkConcretePowderPool.slab(ModBlocks.PINK_CONCRETE_POWDER_SLAB);
        pinkConcretePowderPool.stairs(ModBlocks.PINK_CONCRETE_POWDER_STAIRS);
        pinkConcretePowderPool.fence(ModBlocks.PINK_CONCRETE_POWDER_FENCE);
        pinkConcretePowderPool.fenceGate(ModBlocks.PINK_CONCRETE_POWDER_FENCE_GATE);
        pinkConcretePowderPool.pressurePlate(ModBlocks.PINK_CONCRETE_POWDER_PRESSURE_PLATE);
        //white_terracotta
        whiteGlazedTerracottaPool.button(ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON);
        whiteGlazedTerracottaPool.wall(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);
        whiteGlazedTerracottaPool.slab(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
        whiteGlazedTerracottaPool.stairs(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
        whiteGlazedTerracottaPool.fence(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE);
        whiteGlazedTerracottaPool.fenceGate(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE);
        whiteGlazedTerracottaPool.pressurePlate(ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //light_gray_terracotta
        lightGrayGlazedTerracottaPool.button(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON);
        lightGrayGlazedTerracottaPool.wall(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);
        lightGrayGlazedTerracottaPool.slab(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
        lightGrayGlazedTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
        lightGrayGlazedTerracottaPool.fence(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE);
        lightGrayGlazedTerracottaPool.fenceGate(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
        lightGrayGlazedTerracottaPool.pressurePlate(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //gray_terracotta
        grayGlazedTerracottaPool.button(ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON);
        grayGlazedTerracottaPool.wall(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);
        grayGlazedTerracottaPool.slab(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
        grayGlazedTerracottaPool.stairs(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
        grayGlazedTerracottaPool.fence(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE);
        grayGlazedTerracottaPool.fenceGate(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE);
        grayGlazedTerracottaPool.pressurePlate(ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //black_terracotta
        blackGlazedTerracottaPool.button(ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON);
        blackGlazedTerracottaPool.wall(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);
        blackGlazedTerracottaPool.slab(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
        blackGlazedTerracottaPool.stairs(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
        blackGlazedTerracottaPool.fence(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE);
        blackGlazedTerracottaPool.fenceGate(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE);
        blackGlazedTerracottaPool.pressurePlate(ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //brown_terracotta
        brownGlazedTerracottaPool.button(ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON);
        brownGlazedTerracottaPool.wall(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);
        brownGlazedTerracottaPool.slab(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
        brownGlazedTerracottaPool.stairs(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
        brownGlazedTerracottaPool.fence(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE);
        brownGlazedTerracottaPool.fenceGate(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE);
        brownGlazedTerracottaPool.pressurePlate(ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //red_terracotta
        redGlazedTerracottaPool.button(ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON);
        redGlazedTerracottaPool.wall(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);
        redGlazedTerracottaPool.slab(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
        redGlazedTerracottaPool.stairs(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
        redGlazedTerracottaPool.fence(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE);
        redGlazedTerracottaPool.fenceGate(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE);
        redGlazedTerracottaPool.pressurePlate(ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //orange_terracotta
        orangeGlazedTerracottaPool.button(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON);
        orangeGlazedTerracottaPool.wall(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);
        orangeGlazedTerracottaPool.slab(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
        orangeGlazedTerracottaPool.stairs(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
        orangeGlazedTerracottaPool.fence(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE);
        orangeGlazedTerracottaPool.fenceGate(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE);
        orangeGlazedTerracottaPool.pressurePlate(ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //yellow_terracotta
        yellowGlazedTerracottaPool.button(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON);
        yellowGlazedTerracottaPool.wall(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);
        yellowGlazedTerracottaPool.slab(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
        yellowGlazedTerracottaPool.stairs(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
        yellowGlazedTerracottaPool.fence(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE);
        yellowGlazedTerracottaPool.fenceGate(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE);
        yellowGlazedTerracottaPool.pressurePlate(ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //lime_terracotta
        limeGlazedTerracottaPool.button(ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON);
        limeGlazedTerracottaPool.wall(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);
        limeGlazedTerracottaPool.slab(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
        limeGlazedTerracottaPool.stairs(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
        limeGlazedTerracottaPool.fence(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE);
        limeGlazedTerracottaPool.fenceGate(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE);
        limeGlazedTerracottaPool.pressurePlate(ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //green_terracotta
        greenGlazedTerracottaPool.button(ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON);
        greenGlazedTerracottaPool.wall(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);
        greenGlazedTerracottaPool.slab(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
        greenGlazedTerracottaPool.stairs(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
        greenGlazedTerracottaPool.fence(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE);
        greenGlazedTerracottaPool.fenceGate(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE);
        greenGlazedTerracottaPool.pressurePlate(ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //cyan_terracotta
        cyanGlazedTerracottaPool.button(ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON);
        cyanGlazedTerracottaPool.wall(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);
        cyanGlazedTerracottaPool.slab(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
        cyanGlazedTerracottaPool.stairs(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
        cyanGlazedTerracottaPool.fence(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE);
        cyanGlazedTerracottaPool.fenceGate(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE);
        cyanGlazedTerracottaPool.pressurePlate(ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //blue_terracotta
        blueGlazedTerracottaPool.button(ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON);
        blueGlazedTerracottaPool.wall(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);
        blueGlazedTerracottaPool.slab(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
        blueGlazedTerracottaPool.stairs(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
        blueGlazedTerracottaPool.fence(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE);
        blueGlazedTerracottaPool.fenceGate(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
        blueGlazedTerracottaPool.pressurePlate(ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //light_blue_terracotta
        lightBlueGlazedTerracottaPool.button(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON);
        lightBlueGlazedTerracottaPool.wall(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);
        lightBlueGlazedTerracottaPool.slab(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
        lightBlueGlazedTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
        lightBlueGlazedTerracottaPool.fence(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE);
        lightBlueGlazedTerracottaPool.fenceGate(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE);
        lightBlueGlazedTerracottaPool.pressurePlate(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //purple_terracotta
        purpleGlazedTerracottaPool.button(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON);
        purpleGlazedTerracottaPool.wall(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);
        purpleGlazedTerracottaPool.slab(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
        purpleGlazedTerracottaPool.stairs(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
        purpleGlazedTerracottaPool.fence(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE);
        purpleGlazedTerracottaPool.fenceGate(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE);
        purpleGlazedTerracottaPool.pressurePlate(ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //magenta_terracotta
        magentaGlazedTerracottaPool.button(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON);
        magentaGlazedTerracottaPool.wall(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);
        magentaGlazedTerracottaPool.slab(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
        magentaGlazedTerracottaPool.stairs(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
        magentaGlazedTerracottaPool.fence(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE);
        magentaGlazedTerracottaPool.fenceGate(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE);
        magentaGlazedTerracottaPool.pressurePlate(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //pink_terracotta
        pinkGlazedTerracottaPool.button(ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON);
        pinkGlazedTerracottaPool.wall(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);
        pinkGlazedTerracottaPool.slab(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
        pinkGlazedTerracottaPool.stairs(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
        pinkGlazedTerracottaPool.fence(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE);
        pinkGlazedTerracottaPool.fenceGate(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE);
        pinkGlazedTerracottaPool.pressurePlate(ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE);





        //oak
        blockStateModelGenerator.registerDoor(ModBlocks.OAK_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.OAK_WOOD_TRAPDOOR);
        //str oak
        blockStateModelGenerator.registerDoor(ModBlocks.STR_OAK_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_OAK_WOOD_TRAPDOOR);
        //spruce
        blockStateModelGenerator.registerDoor(ModBlocks.SPRUCE_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
        //str spruce
        blockStateModelGenerator.registerDoor(ModBlocks.STR_SPRUCE_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
        //birch
        blockStateModelGenerator.registerDoor(ModBlocks.BIRCH_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BIRCH_WOOD_TRAPDOOR);
        //str birch
        blockStateModelGenerator.registerDoor(ModBlocks.STR_BIRCH_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
        //jungle
        blockStateModelGenerator.registerDoor(ModBlocks.JUNGLE_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
        //str jungle
        blockStateModelGenerator.registerDoor(ModBlocks.STR_JUNGLE_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
        //acacia
        blockStateModelGenerator.registerDoor(ModBlocks.ACACIA_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ACACIA_WOOD_TRAPDOOR);
        //str acacia
        blockStateModelGenerator.registerDoor(ModBlocks.STR_ACACIA_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
        //dark oak
        blockStateModelGenerator.registerDoor(ModBlocks.DARK_OAK_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
        //str dark oak
        blockStateModelGenerator.registerDoor(ModBlocks.STR_DARK_OAK_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
        //mangrove
        blockStateModelGenerator.registerDoor(ModBlocks.MANGROVE_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
        //str mangrove
        blockStateModelGenerator.registerDoor(ModBlocks.STR_MANGROVE_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
        //cherry
        blockStateModelGenerator.registerDoor(ModBlocks.CHERRY_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CHERRY_WOOD_TRAPDOOR);
        //str cherry
        blockStateModelGenerator.registerDoor(ModBlocks.STR_CHERRY_WOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
        //bamboo
        blockStateModelGenerator.registerDoor(ModBlocks.BAMBOO_BLOCK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BAMBOO_BLOCK_TRAPDOOR);
        //str bamboo
        blockStateModelGenerator.registerDoor(ModBlocks.STR_BAMBOO_BLOCK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
        //crimson hyphae
        blockStateModelGenerator.registerDoor(ModBlocks.CRIMSON_HYPHAE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR);
        //str crimson hyphae
        blockStateModelGenerator.registerDoor(ModBlocks.STR_CRIMSON_HYPHAE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
        //warped hyphae
        blockStateModelGenerator.registerDoor(ModBlocks.WARPED_HYPHAE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WARPED_HYPHAE_TRAPDOOR);
        //str warped hyphae
        blockStateModelGenerator.registerDoor(ModBlocks.STR_WARPED_HYPHAE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
        //stone
        blockStateModelGenerator.registerDoor(ModBlocks.STONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STONE_TRAPDOOR);
        //cobblestone
        blockStateModelGenerator.registerDoor(ModBlocks.COBBLESTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.COBBLESTONE_TRAPDOOR);
        //mossy cobblestone
        blockStateModelGenerator.registerDoor(ModBlocks.MOSSY_COBBLESTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR);
        //smooth stone
        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_STONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SMOOTH_STONE_TRAPDOOR);
        //stone bricks
        blockStateModelGenerator.registerDoor(ModBlocks.STONE_BRICKS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STONE_BRICKS_TRAPDOOR);
        //cracked stone bricks
        blockStateModelGenerator.registerDoor(ModBlocks.CRACKED_STONE_BRICKS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR);
        //granite
        blockStateModelGenerator.registerDoor(ModBlocks.GRANITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GRANITE_TRAPDOOR);
        //polished granite
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_GRANITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_GRANITE_TRAPDOOR);
        //diorite
        blockStateModelGenerator.registerDoor(ModBlocks.DIORITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DIORITE_TRAPDOOR);
        //polished diorite
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_DIORITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_DIORITE_TRAPDOOR);
        //andesite
        blockStateModelGenerator.registerDoor(ModBlocks.ANDESITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ANDESITE_TRAPDOOR);
        //polished andesite
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_ANDESITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_ANDESITE_TRAPDOOR);
        //deepslate
        blockStateModelGenerator.registerDoor(ModBlocks.DEEPSLATE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_TRAPDOOR);
        //cobbled deepslate
        blockStateModelGenerator.registerDoor(ModBlocks.COBBLED_DEEPSLATE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR);
        //chiseled deepslate
        blockStateModelGenerator.registerDoor(ModBlocks.CHISELED_DEEPSLATE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR);
        //polished deepslate
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_DEEPSLATE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
        //deepslate bricks
        blockStateModelGenerator.registerDoor(ModBlocks.DEEPSLATE_BRICKS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR);
        //cracked deepslate bricks
        blockStateModelGenerator.registerDoor(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR);
        //deepslate tiles
        blockStateModelGenerator.registerDoor(ModBlocks.DEEPSLATE_TILES_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_TILES_TRAPDOOR);
        //cracked deepslate tiles
        blockStateModelGenerator.registerDoor(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR);
        //bricks
        blockStateModelGenerator.registerDoor(ModBlocks.BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BRICK_TRAPDOOR);
        //packed mud
        blockStateModelGenerator.registerDoor(ModBlocks.PACKED_MUD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PACKED_MUD_TRAPDOOR);
        //mud bricks
        blockStateModelGenerator.registerDoor(ModBlocks.MUD_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MUD_BRICK_TRAPDOOR);
        //sandstone
        blockStateModelGenerator.registerDoor(ModBlocks.SANDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SANDSTONE_TRAPDOOR);
        //smooth sandstone
        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_SANDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR);
        //cut sandstone
        blockStateModelGenerator.registerDoor(ModBlocks.CUT_SANDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CUT_SANDSTONE_TRAPDOOR);
        //red sandstone
        blockStateModelGenerator.registerDoor(ModBlocks.RED_SANDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_SANDSTONE_TRAPDOOR);
        //red smooth sandstone
        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR);
        //red cut sandstone
        blockStateModelGenerator.registerDoor(ModBlocks.CUT_RED_SANDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR);
        //sea lantern
        blockStateModelGenerator.registerDoor(ModBlocks.SEA_LANTERN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SEA_LANTERN_TRAPDOOR);
        //prismarine
        blockStateModelGenerator.registerDoor(ModBlocks.PRISMARINE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PRISMARINE_TRAPDOOR);
        //prismarine brick
        blockStateModelGenerator.registerDoor(ModBlocks.PRISMARINE_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PRISMARINE_BRICK_TRAPDOOR);
        //dark prismarine
        blockStateModelGenerator.registerDoor(ModBlocks.DARK_PRISMARINE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DARK_PRISMARINE_TRAPDOOR);
        //netherrack
        blockStateModelGenerator.registerDoor(ModBlocks.NETHERRACK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.NETHERRACK_TRAPDOOR);
        //nether brick
        blockStateModelGenerator.registerDoor(ModBlocks.NETHER_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.NETHER_BRICK_TRAPDOOR);
        //cracked nether brick
        blockStateModelGenerator.registerDoor(ModBlocks.CRACKED_NETHER_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR);
        //red nether brick
        blockStateModelGenerator.registerDoor(ModBlocks.RED_NETHER_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_NETHER_BRICK_TRAPDOOR);
        //basalt
        blockStateModelGenerator.registerDoor(ModBlocks.BASALT_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BASALT_TRAPDOOR);
        //smooth basalt
        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_BASALT_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SMOOTH_BASALT_TRAPDOOR);
        //polished basalt
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_BASALT_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_BASALT_TRAPDOOR);
        //blackstone
        blockStateModelGenerator.registerDoor(ModBlocks.BLACKSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLACKSTONE_TRAPDOOR);
        //gilded blackstone
        blockStateModelGenerator.registerDoor(ModBlocks.GILDED_BLACKSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR);
        //polished blackstone
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_BLACKSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR);
        //polished blackstone brick
        blockStateModelGenerator.registerDoor(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
        //cracked polished blackstone brick
        blockStateModelGenerator.registerDoor(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
        //end stone
        blockStateModelGenerator.registerDoor(ModBlocks.END_STONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.END_STONE_TRAPDOOR);
        //end stone brick
        blockStateModelGenerator.registerDoor(ModBlocks.END_STONE_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.END_STONE_BRICK_TRAPDOOR);
        //purpur block
        blockStateModelGenerator.registerDoor(ModBlocks.PURPUR_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPUR_TRAPDOOR);
        //coal
        blockStateModelGenerator.registerDoor(ModBlocks.COAL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.COAL_TRAPDOOR);
        //gold
        blockStateModelGenerator.registerDoor(ModBlocks.GOLD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GOLD_TRAPDOOR);
        //redstone
        blockStateModelGenerator.registerDoor(ModBlocks.REDSTONE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.REDSTONE_TRAPDOOR);
        //emerald
        blockStateModelGenerator.registerDoor(ModBlocks.EMERALD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.EMERALD_TRAPDOOR);
        //lapis
        blockStateModelGenerator.registerDoor(ModBlocks.LAPIS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LAPIS_TRAPDOOR);
        //diamond
        blockStateModelGenerator.registerDoor(ModBlocks.DIAMOND_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DIAMOND_TRAPDOOR);
        //netherite
        blockStateModelGenerator.registerDoor(ModBlocks.NETHERITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.NETHERITE_TRAPDOOR);
        //quartz
        blockStateModelGenerator.registerDoor(ModBlocks.QUARTZ_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.QUARTZ_TRAPDOOR);
        //quartz brick
        blockStateModelGenerator.registerDoor(ModBlocks.QUARTZ_BRICK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.QUARTZ_BRICK_TRAPDOOR);
        //smooth quartz
        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_QUARTZ_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR);
        //amethyst
        blockStateModelGenerator.registerDoor(ModBlocks.AMETHYST_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.AMETHYST_TRAPDOOR);
        //copper
        blockStateModelGenerator.registerDoor(ModBlocks.COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.COPPER_TRAPDOOR);
        //exposed_copper
        blockStateModelGenerator.registerDoor(ModBlocks.EXPOSED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        //weathered_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WEATHERED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        //oxidized_copper
        blockStateModelGenerator.registerDoor(ModBlocks.OXIDIZED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
        //cut copper
        blockStateModelGenerator.registerDoor(ModBlocks.CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CUT_COPPER_TRAPDOOR);
        //cut exposed_copper
        blockStateModelGenerator.registerDoor(ModBlocks.EXPOSED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR);
        //cut weathered_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WEATHERED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR);
        //cut oxidized_copper
        blockStateModelGenerator.registerDoor(ModBlocks.OXIDIZED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR);
        //waxed copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_COPPER_TRAPDOOR);
        //waxed exposed_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_EXPOSED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        //waxed weathered_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_WEATHERED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        //waxed oxidized_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
        //waxed cut copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_CUT_COPPER_TRAPDOOR);
        //waxed cut exposed_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
        //waxed cut weathered_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
        //waxed cut oxidized_copper
        blockStateModelGenerator.registerDoor(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
        //white wool
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WHITE_WOOL_TRAPDOOR);
        //light_gray_wool
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR);
        //gray_wool
        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GRAY_WOOL_TRAPDOOR);
        //black_wool
        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLACK_WOOL_TRAPDOOR);
        //brown_wool
        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BROWN_WOOL_TRAPDOOR);
        //red_wool
        blockStateModelGenerator.registerDoor(ModBlocks.RED_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_WOOL_TRAPDOOR);
        //orange_wool
        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ORANGE_WOOL_TRAPDOOR);
        //yellow_wool
        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.YELLOW_WOOL_TRAPDOOR);
        //lime_wool
        blockStateModelGenerator.registerDoor(ModBlocks.LIME_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIME_WOOL_TRAPDOOR);
        //green_wool
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GREEN_WOOL_TRAPDOOR);
        //cyan_wool
        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CYAN_WOOL_TRAPDOOR);
        //blue_wool
        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_WOOL_TRAPDOOR);
        //light_blue_wool
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR);
        //purple_wool
        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPLE_WOOL_TRAPDOOR);
        //magenta_wool
        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MAGENTA_WOOL_TRAPDOOR);
        //pink_wool
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_WOOL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PINK_WOOL_TRAPDOOR);
        //terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.TERRACOTTA_TRAPDOOR);
        //white terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR);
        //light_gray_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR);
        //gray_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR);
        //black_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR);
        //brown_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR);
        //red_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.RED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_TERRACOTTA_TRAPDOOR);
        //orange_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR);
        //yellow_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR);
        //lime_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.LIME_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIME_TERRACOTTA_TRAPDOOR);
        //green_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR);
        //cyan_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR);
        //blue_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR);
        //light_blue_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR);
        //purple_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR);
        //magenta_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR);
        //pink_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PINK_TERRACOTTA_TRAPDOOR);
        //white concrete
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WHITE_CONCRETE_TRAPDOOR);
        //light_gray_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR);
        //gray_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GRAY_CONCRETE_TRAPDOOR);
        //black_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLACK_CONCRETE_TRAPDOOR);
        //brown_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BROWN_CONCRETE_TRAPDOOR);
        //red_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.RED_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_CONCRETE_TRAPDOOR);
        //orange_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ORANGE_CONCRETE_TRAPDOOR);
        //yellow_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.YELLOW_CONCRETE_TRAPDOOR);
        //lime_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.LIME_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIME_CONCRETE_TRAPDOOR);
        //green_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GREEN_CONCRETE_TRAPDOOR);
        //cyan_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CYAN_CONCRETE_TRAPDOOR);
        //blue_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_CONCRETE_TRAPDOOR);
        //light_blue_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR);
        //purple_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPLE_CONCRETE_TRAPDOOR);
        //magenta_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR);
        //pink_concrete
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_CONCRETE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PINK_CONCRETE_TRAPDOOR);
        //white_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR);
        //light_gray_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR);
        //gray_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR);
        //black_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR);
        //brown_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR);
        //red_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.RED_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR);
        //orange_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR);
        //yellow_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR);
        //lime_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.LIME_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR);
        //green_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR);
        //cyan_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR);
        //blue_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR);
        //light_blue_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR);
        //purple_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR);
        //magenta_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR);
        //pink_concrete_powder
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_CONCRETE_POWDER_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR);
        //white glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR);
        //light_gray_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
        //gray_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
        //black_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR);
        //brown_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR);
        //red_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR);
        //orange_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR);
        //yellow_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR);
        //lime_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR);
        //green_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR);
        //cyan_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR);
        //blue_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
        //light_blue_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
        //purple_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR);
        //magenta_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR);
        //pink_glazed_terracotta
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR);






    }





    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VBP_TITLE, Models.GENERATED);

        //ingredients
        itemModelGenerator.register(ModItems.COAL_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_BIT, Models.GENERATED);

    }
}

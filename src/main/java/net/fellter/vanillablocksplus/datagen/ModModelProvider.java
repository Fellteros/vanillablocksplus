package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.test.ModTextureMap;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static net.fellter.vanillablocksplus.test.ModBlockStateModelGenerator.*;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
        

        BlockStateModelGenerator.BlockTexturePool oakWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strOakWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool spruceWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.SPRUCE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strSpruceWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_SPRUCE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool birchWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.BIRCH_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strBirchWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_BIRCH_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool jungleWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.JUNGLE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strJungleWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_JUNGLE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool acaciaWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.ACACIA_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strAcaciaWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_ACACIA_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool darkOakWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.DARK_OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strDarkOakWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_DARK_OAK_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool mangroveWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strMangroveWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_MANGROVE_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool cherryWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.CHERRY_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool strCherryWoodPool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_CHERRY_WOOD_MOD);
        BlockStateModelGenerator.BlockTexturePool crimsonHyphaePool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.CRIMSON_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool strCrimsonHyphaePool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_CRIMSON_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool warpedHyphaePool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.WARPED_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool strWarpedHyphaePool =
                bsmg.registerCubeAllModelTexturePool(ModBlocks.STR_WARPED_HYPHAE_MOD);
        BlockStateModelGenerator.BlockTexturePool stonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool cobblestonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool mossyCobblestonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MOSSY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool stoneBricksPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedStoneBricksPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool dioritePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DIORITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool andesitePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool cobbledDeepslatePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COBBLED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool chiseledDeepslatePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CHISELED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepslatePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool deepslateBricksPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedDeepslateBricksPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool deepslateTilesPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackedDeepslateTilesPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool brickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BRICKS);
        BlockStateModelGenerator.BlockTexturePool packedMudPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        BlockStateModelGenerator.BlockTexturePool mudBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MUD_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool seaLanternPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SEA_LANTERN);
        BlockStateModelGenerator.BlockTexturePool prismarinePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool netherrackPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool netherBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedNetherBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redNetherBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        BlockStateModelGenerator.BlockTexturePool gildedBlackstonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool polishedBlackstonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool polishedBlackstoneBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedPolishedBlackstoneBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool endStonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.END_STONE);
        BlockStateModelGenerator.BlockTexturePool endStoneBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.END_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpurBlockPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        BlockStateModelGenerator.BlockTexturePool coalPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ironPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool goldPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool redstonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.REDSTONE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool emeraldPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lapisPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LAPIS_BLOCK);
        BlockStateModelGenerator.BlockTexturePool diamondPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DIAMOND_BLOCK);
        BlockStateModelGenerator.BlockTexturePool netheritePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool amethystPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        BlockStateModelGenerator.BlockTexturePool copperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cutCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposedCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposedCutCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.EXPOSED_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatheredCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatheredCutCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WEATHERED_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizedCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizedCutCopperPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.OXIDIZED_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool whiteWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightGrayWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool grayWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool blackWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlockStateModelGenerator.BlockTexturePool brownWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BlockStateModelGenerator.BlockTexturePool redWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        BlockStateModelGenerator.BlockTexturePool orangeWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        BlockStateModelGenerator.BlockTexturePool yellowWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        BlockStateModelGenerator.BlockTexturePool limeWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        BlockStateModelGenerator.BlockTexturePool greenWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        BlockStateModelGenerator.BlockTexturePool cyanWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        BlockStateModelGenerator.BlockTexturePool blueWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightBlueWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool purpleWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        BlockStateModelGenerator.BlockTexturePool magentaWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        BlockStateModelGenerator.BlockTexturePool pinkWoolPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);
        BlockStateModelGenerator.BlockTexturePool terracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool redTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool grayConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blackConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool brownConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool redConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool orangeConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool yellowConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool limeConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool greenConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cyanConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blueConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool purpleConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool magentaConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool pinkConcretePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool whiteConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool grayConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool blackConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool brownConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool redConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool orangeConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool yellowConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool limeConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool greenConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool cyanConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool blueConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool purpleConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool magentaConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool pinkConcretePowderPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE_POWDER);
        BlockStateModelGenerator.BlockTexturePool whiteGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WHITE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightGrayGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool grayGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAY_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blackGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLACK_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brownGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool redGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orangeGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ORANGE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellowGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.YELLOW_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool limeGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIME_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool greenGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GREEN_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyanGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CYAN_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blueGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightBlueGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purpleGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPLE_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magentaGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGENTA_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pinkGlazedTerracottaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PINK_GLAZED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.WHITE_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool lightGrayStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool grayStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool blackStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool brownStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool redStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool orangeStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool yellowStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool limeStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool greenStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool cyanStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool blueStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool lightBlueStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool purpleStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool magentaStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS);
        BlockStateModelGenerator.BlockTexturePool pinkStainedGlassPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS);
        //GRASS BLOCKS MADE MANUALLY
        BlockStateModelGenerator.BlockTexturePool dirtPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DIRT);
        BlockStateModelGenerator.BlockTexturePool coarseDirtPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COARSE_DIRT);
        BlockStateModelGenerator.BlockTexturePool rootedDirtPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ROOTED_DIRT);
        BlockStateModelGenerator.BlockTexturePool mudPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MUD);
        BlockStateModelGenerator.BlockTexturePool clayPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CLAY);
        BlockStateModelGenerator.BlockTexturePool sandPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SAND);
        BlockStateModelGenerator.BlockTexturePool gravelPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GRAVEL);
        BlockStateModelGenerator.BlockTexturePool redSandPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.RED_SAND);
        BlockStateModelGenerator.BlockTexturePool icePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.ICE);
        BlockStateModelGenerator.BlockTexturePool packedIcePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.PACKED_ICE);
        BlockStateModelGenerator.BlockTexturePool blueIcePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.BLUE_ICE);
        BlockStateModelGenerator.BlockTexturePool snowPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SNOW_BLOCK);
        BlockStateModelGenerator.BlockTexturePool mossPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MOSS_BLOCK);
        BlockStateModelGenerator.BlockTexturePool calcitePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool tuffPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.TUFF);
        BlockStateModelGenerator.BlockTexturePool dripstonePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DRIPSTONE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool magmaPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.MAGMA_BLOCK);
        BlockStateModelGenerator.BlockTexturePool obsidianPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.OBSIDIAN);
        BlockStateModelGenerator.BlockTexturePool cryingObsidianPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.CRYING_OBSIDIAN);
        BlockStateModelGenerator.BlockTexturePool soulSandPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SOUL_SAND);
        BlockStateModelGenerator.BlockTexturePool soulSoilPool =
                bsmg.registerCubeAllModelTexturePool(Blocks.SOUL_SOIL);
        BlockStateModelGenerator.BlockTexturePool coalOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COAL_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateCoalOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_COAL_ORE);
        BlockStateModelGenerator.BlockTexturePool ironOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.IRON_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateIronOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_IRON_ORE);
        BlockStateModelGenerator.BlockTexturePool copperOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.COPPER_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateCopperOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_COPPER_ORE);
        BlockStateModelGenerator.BlockTexturePool goldOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.GOLD_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateGoldOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_GOLD_ORE);
        BlockStateModelGenerator.BlockTexturePool redstoneOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.REDSTONE_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateRedstoneOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_REDSTONE_ORE);
        BlockStateModelGenerator.BlockTexturePool emeraldOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.EMERALD_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateEmeraldOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_EMERALD_ORE);
        BlockStateModelGenerator.BlockTexturePool lapisOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.LAPIS_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateLapisOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_LAPIS_ORE);
        BlockStateModelGenerator.BlockTexturePool diamondOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DIAMOND_ORE);
        BlockStateModelGenerator.BlockTexturePool deepslateDiamondOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_DIAMOND_ORE);
        BlockStateModelGenerator.BlockTexturePool netherGoldOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.NETHER_GOLD_ORE);
        BlockStateModelGenerator.BlockTexturePool netherQuartzOrePool =
                bsmg.registerCubeAllModelTexturePool(Blocks.NETHER_QUARTZ_ORE);


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
        registerCustomButton(bsmg, ModBlocks.BAMBOO_BLOCK_BUTTON, ModTextureMap.customSTB(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.BAMBOO_BLOCK_FENCE, ModTextureMap.customSTB(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.BAMBOO_BLOCK_FENCE_GATE, ModTextureMap.customSTB(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.BAMBOO_BLOCK_SLAB, Blocks.BAMBOO_BLOCK, ModTextureMap.customSTB(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.BAMBOO_BLOCK_STAIRS, ModTextureMap.customSTB(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, "", "_top", "_top"));
        //str_bamboo
        registerCustomButton(bsmg, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, ModTextureMap.customSTB(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.STR_BAMBOO_BLOCK_FENCE, ModTextureMap.customSTB(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, ModTextureMap.customSTB(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.STR_BAMBOO_BLOCK_SLAB, Blocks.STRIPPED_BAMBOO_BLOCK, ModTextureMap.customSTB(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, "", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.STR_BAMBOO_BLOCK_STAIRS, ModTextureMap.customSTB(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, "", "_top", "_top"));
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
        registerCustomButton(bsmg, ModBlocks.DEEPSLATE_BUTTON, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.DEEPSLATE_FENCE, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.DEEPSLATE_FENCE_GATE, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.DEEPSLATE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.DEEPSLATE_STAIRS, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.DEEPSLATE_WALL, ModTextureMap.customSTB(Blocks.DEEPSLATE, Blocks.DEEPSLATE, Blocks.DEEPSLATE, "", "_top", "_top"));
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
        registerCustomButton(bsmg, ModBlocks.SANDSTONE_BUTTON, ModTextureMap.customSTB(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.SANDSTONE_FENCE, ModTextureMap.customSTB(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.SANDSTONE_FENCE_GATE, ModTextureMap.customSTB(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.SANDSTONE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        //smooth sandstone
        smoothSandstonePool.button(ModBlocks.SMOOTH_SANDSTONE_BUTTON);
        smoothSandstonePool.fence(ModBlocks.SMOOTH_SANDSTONE_FENCE);
        smoothSandstonePool.fenceGate(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE);
        smoothSandstonePool.pressurePlate(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);
        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        //cut sandstone
        registerCustomStairs(bsmg, ModBlocks.CUT_SANDSTONE_STAIRS, ModTextureMap.customSTB(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomButton(bsmg, ModBlocks.CUT_SANDSTONE_BUTTON, ModTextureMap.customSTB(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.CUT_SANDSTONE_FENCE, ModTextureMap.customSTB(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.CUT_SANDSTONE_FENCE_GATE, ModTextureMap.customSTB(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.CUT_SANDSTONE_WALL, ModTextureMap.customSTB(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        //red sandstone
        registerCustomButton(bsmg, ModBlocks.RED_SANDSTONE_BUTTON, ModTextureMap.customSTB(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.RED_SANDSTONE_FENCE, ModTextureMap.customSTB(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.RED_SANDSTONE_FENCE_GATE, ModTextureMap.customSTB(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        //smooth red sandstone
        smoothRedSandstonePool.button(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON);
        smoothRedSandstonePool.fence(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE);
        smoothRedSandstonePool.fenceGate(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE);
        smoothRedSandstonePool.pressurePlate(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        //cut red sandstone
        registerCustomStairs(bsmg, ModBlocks.CUT_RED_SANDSTONE_STAIRS, ModTextureMap.customSTB(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomButton(bsmg, ModBlocks.CUT_RED_SANDSTONE_BUTTON, ModTextureMap.customSTB(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.CUT_RED_SANDSTONE_FENCE, ModTextureMap.customSTB(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE, ModTextureMap.customSTB(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.CUT_RED_SANDSTONE_WALL, ModTextureMap.customSTB(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
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
        registerCustomButton(bsmg, ModBlocks.BASALT_BUTTON, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.BASALT_WALL, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.BASALT_SLAB, Blocks.BASALT, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.BASALT_STAIRS, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.BASALT_FENCE, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.BASALT_FENCE_GATE, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.BASALT_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.BASALT, Blocks.BASALT, Blocks.BASALT, "_side", "_top", "_top"));
        //smooth basalt
        smoothBasaltPool.button(ModBlocks.SMOOTH_BASALT_BUTTON);
        smoothBasaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);
        smoothBasaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        smoothBasaltPool.fence(ModBlocks.SMOOTH_BASALT_FENCE);
        smoothBasaltPool.fenceGate(ModBlocks.SMOOTH_BASALT_FENCE_GATE);
        smoothBasaltPool.pressurePlate(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
        //polished basalt
        registerCustomButton(bsmg, ModBlocks.POLISHED_BASALT_BUTTON, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.POLISHED_BASALT_WALL, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.POLISHED_BASALT_STAIRS, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.POLISHED_BASALT_FENCE, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.POLISHED_BASALT_FENCE_GATE, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.POLISHED_BASALT_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, Blocks.POLISHED_BASALT, "_side", "_top", "_top"));
        //polished basalt
        registerCustomButton(bsmg, ModBlocks.BLACKSTONE_BUTTON, ModTextureMap.customSTB(Blocks.BLACKSTONE, Blocks.BLACKSTONE, Blocks.BLACKSTONE, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.BLACKSTONE_FENCE, ModTextureMap.customSTB(Blocks.BLACKSTONE, Blocks.BLACKSTONE, Blocks.BLACKSTONE, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.BLACKSTONE_FENCE_GATE, ModTextureMap.customSTB(Blocks.BLACKSTONE, Blocks.BLACKSTONE, Blocks.BLACKSTONE, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.BLACKSTONE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.BLACKSTONE, Blocks.BLACKSTONE, Blocks.BLACKSTONE, "", "_top", "_top"));
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
        registerCustomButton(bsmg, ModBlocks.QUARTZ_BUTTON, ModTextureMap.customSTB(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomWall(bsmg, ModBlocks.QUARTZ_WALL, ModTextureMap.customSTB(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.QUARTZ_FENCE, ModTextureMap.customSTB(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.QUARTZ_FENCE_GATE, ModTextureMap.customSTB(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.QUARTZ_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
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
        //white_stained_glass
        whiteStainedGlassPool.button(ModBlocks.WHITE_STAINED_GLASS_BUTTON);
        whiteStainedGlassPool.wall(ModBlocks.WHITE_STAINED_GLASS_WALL);
        whiteStainedGlassPool.slab(ModBlocks.WHITE_STAINED_GLASS_SLAB);
        whiteStainedGlassPool.stairs(ModBlocks.WHITE_STAINED_GLASS_STAIRS);
        whiteStainedGlassPool.fence(ModBlocks.WHITE_STAINED_GLASS_FENCE);
        whiteStainedGlassPool.fenceGate(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE);
        whiteStainedGlassPool.pressurePlate(ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
        //light_gray_stained_glass
        lightGrayStainedGlassPool.button(ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON);
        lightGrayStainedGlassPool.wall(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);
        lightGrayStainedGlassPool.slab(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        lightGrayStainedGlassPool.stairs(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        lightGrayStainedGlassPool.fence(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
        lightGrayStainedGlassPool.fenceGate(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE);
        lightGrayStainedGlassPool.pressurePlate(ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
        //gray_stained_glass
        grayStainedGlassPool.button(ModBlocks.GRAY_STAINED_GLASS_BUTTON);
        grayStainedGlassPool.wall(ModBlocks.GRAY_STAINED_GLASS_WALL);
        grayStainedGlassPool.slab(ModBlocks.GRAY_STAINED_GLASS_SLAB);
        grayStainedGlassPool.stairs(ModBlocks.GRAY_STAINED_GLASS_STAIRS);
        grayStainedGlassPool.fence(ModBlocks.GRAY_STAINED_GLASS_FENCE);
        grayStainedGlassPool.fenceGate(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE);
        grayStainedGlassPool.pressurePlate(ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE);
        //black_stained_glass
        blackStainedGlassPool.button(ModBlocks.BLACK_STAINED_GLASS_BUTTON);
        blackStainedGlassPool.wall(ModBlocks.BLACK_STAINED_GLASS_WALL);
        blackStainedGlassPool.slab(ModBlocks.BLACK_STAINED_GLASS_SLAB);
        blackStainedGlassPool.stairs(ModBlocks.BLACK_STAINED_GLASS_STAIRS);
        blackStainedGlassPool.fence(ModBlocks.BLACK_STAINED_GLASS_FENCE);
        blackStainedGlassPool.fenceGate(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE);
        blackStainedGlassPool.pressurePlate(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE);
        //brown_stained_glass
        brownStainedGlassPool.button(ModBlocks.BROWN_STAINED_GLASS_BUTTON);
        brownStainedGlassPool.wall(ModBlocks.BROWN_STAINED_GLASS_WALL);
        brownStainedGlassPool.slab(ModBlocks.BROWN_STAINED_GLASS_SLAB);
        brownStainedGlassPool.stairs(ModBlocks.BROWN_STAINED_GLASS_STAIRS);
        brownStainedGlassPool.fence(ModBlocks.BROWN_STAINED_GLASS_FENCE);
        brownStainedGlassPool.fenceGate(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE);
        brownStainedGlassPool.pressurePlate(ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE);
        //red_stained_glass
        redStainedGlassPool.button(ModBlocks.RED_STAINED_GLASS_BUTTON);
        redStainedGlassPool.wall(ModBlocks.RED_STAINED_GLASS_WALL);
        redStainedGlassPool.slab(ModBlocks.RED_STAINED_GLASS_SLAB);
        redStainedGlassPool.stairs(ModBlocks.RED_STAINED_GLASS_STAIRS);
        redStainedGlassPool.fence(ModBlocks.RED_STAINED_GLASS_FENCE);
        redStainedGlassPool.fenceGate(ModBlocks.RED_STAINED_GLASS_FENCE_GATE);
        redStainedGlassPool.pressurePlate(ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE);
        //orange_terracotta
        orangeStainedGlassPool.button(ModBlocks.ORANGE_STAINED_GLASS_BUTTON);
        orangeStainedGlassPool.wall(ModBlocks.ORANGE_STAINED_GLASS_WALL);
        orangeStainedGlassPool.slab(ModBlocks.ORANGE_STAINED_GLASS_SLAB);
        orangeStainedGlassPool.stairs(ModBlocks.ORANGE_STAINED_GLASS_STAIRS);
        orangeStainedGlassPool.fence(ModBlocks.ORANGE_STAINED_GLASS_FENCE);
        orangeStainedGlassPool.fenceGate(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE);
        orangeStainedGlassPool.pressurePlate(ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE);
        //yellow_terracotta
        yellowStainedGlassPool.button(ModBlocks.YELLOW_STAINED_GLASS_BUTTON);
        yellowStainedGlassPool.wall(ModBlocks.YELLOW_STAINED_GLASS_WALL);
        yellowStainedGlassPool.slab(ModBlocks.YELLOW_STAINED_GLASS_SLAB);
        yellowStainedGlassPool.stairs(ModBlocks.YELLOW_STAINED_GLASS_STAIRS);
        yellowStainedGlassPool.fence(ModBlocks.YELLOW_STAINED_GLASS_FENCE);
        yellowStainedGlassPool.fenceGate(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE);
        yellowStainedGlassPool.pressurePlate(ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE);
        //lime_terracotta
        limeStainedGlassPool.button(ModBlocks.LIME_STAINED_GLASS_BUTTON);
        limeStainedGlassPool.wall(ModBlocks.LIME_STAINED_GLASS_WALL);
        limeStainedGlassPool.slab(ModBlocks.LIME_STAINED_GLASS_SLAB);
        limeStainedGlassPool.stairs(ModBlocks.LIME_STAINED_GLASS_STAIRS);
        limeStainedGlassPool.fence(ModBlocks.LIME_STAINED_GLASS_FENCE);
        limeStainedGlassPool.fenceGate(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE);
        limeStainedGlassPool.pressurePlate(ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE);
        //green_terracotta
        greenStainedGlassPool.button(ModBlocks.GREEN_STAINED_GLASS_BUTTON);
        greenStainedGlassPool.wall(ModBlocks.GREEN_STAINED_GLASS_WALL);
        greenStainedGlassPool.slab(ModBlocks.GREEN_STAINED_GLASS_SLAB);
        greenStainedGlassPool.stairs(ModBlocks.GREEN_STAINED_GLASS_STAIRS);
        greenStainedGlassPool.fence(ModBlocks.GREEN_STAINED_GLASS_FENCE);
        greenStainedGlassPool.fenceGate(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE);
        greenStainedGlassPool.pressurePlate(ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE);
        //cyan_terracotta
        cyanStainedGlassPool.button(ModBlocks.CYAN_STAINED_GLASS_BUTTON);
        cyanStainedGlassPool.wall(ModBlocks.CYAN_STAINED_GLASS_WALL);
        cyanStainedGlassPool.slab(ModBlocks.CYAN_STAINED_GLASS_SLAB);
        cyanStainedGlassPool.stairs(ModBlocks.CYAN_STAINED_GLASS_STAIRS);
        cyanStainedGlassPool.fence(ModBlocks.CYAN_STAINED_GLASS_FENCE);
        cyanStainedGlassPool.fenceGate(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE);
        cyanStainedGlassPool.pressurePlate(ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE);
        //blue_terracotta
        blueStainedGlassPool.button(ModBlocks.BLUE_STAINED_GLASS_BUTTON);
        blueStainedGlassPool.wall(ModBlocks.BLUE_STAINED_GLASS_WALL);
        blueStainedGlassPool.slab(ModBlocks.BLUE_STAINED_GLASS_SLAB);
        blueStainedGlassPool.stairs(ModBlocks.BLUE_STAINED_GLASS_STAIRS);
        blueStainedGlassPool.fence(ModBlocks.BLUE_STAINED_GLASS_FENCE);
        blueStainedGlassPool.fenceGate(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE);
        blueStainedGlassPool.pressurePlate(ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE);
        //light_blue_terracotta
        lightBlueStainedGlassPool.button(ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON);
        lightBlueStainedGlassPool.wall(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);
        lightBlueStainedGlassPool.slab(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        lightBlueStainedGlassPool.stairs(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        lightBlueStainedGlassPool.fence(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
        lightBlueStainedGlassPool.fenceGate(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE);
        lightBlueStainedGlassPool.pressurePlate(ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
        //purple_terracotta
        purpleStainedGlassPool.button(ModBlocks.PURPLE_STAINED_GLASS_BUTTON);
        purpleStainedGlassPool.wall(ModBlocks.PURPLE_STAINED_GLASS_WALL);
        purpleStainedGlassPool.slab(ModBlocks.PURPLE_STAINED_GLASS_SLAB);
        purpleStainedGlassPool.stairs(ModBlocks.PURPLE_STAINED_GLASS_STAIRS);
        purpleStainedGlassPool.fence(ModBlocks.PURPLE_STAINED_GLASS_FENCE);
        purpleStainedGlassPool.fenceGate(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE);
        purpleStainedGlassPool.pressurePlate(ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE);
        //magenta_terracotta
        magentaStainedGlassPool.button(ModBlocks.MAGENTA_STAINED_GLASS_BUTTON);
        magentaStainedGlassPool.wall(ModBlocks.MAGENTA_STAINED_GLASS_WALL);
        magentaStainedGlassPool.slab(ModBlocks.MAGENTA_STAINED_GLASS_SLAB);
        magentaStainedGlassPool.stairs(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        magentaStainedGlassPool.fence(ModBlocks.MAGENTA_STAINED_GLASS_FENCE);
        magentaStainedGlassPool.fenceGate(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE);
        magentaStainedGlassPool.pressurePlate(ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
        //pink_terracotta
        pinkStainedGlassPool.button(ModBlocks.PINK_STAINED_GLASS_BUTTON);
        pinkStainedGlassPool.wall(ModBlocks.PINK_STAINED_GLASS_WALL);
        pinkStainedGlassPool.slab(ModBlocks.PINK_STAINED_GLASS_SLAB);
        pinkStainedGlassPool.stairs(ModBlocks.PINK_STAINED_GLASS_STAIRS);
        pinkStainedGlassPool.fence(ModBlocks.PINK_STAINED_GLASS_FENCE);
        pinkStainedGlassPool.fenceGate(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE);
        pinkStainedGlassPool.pressurePlate(ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE);
        //GRASS BLOCKS MADE MANUALLY
        //dirt
        dirtPool.button(ModBlocks.DIRT_BUTTON);
        dirtPool.wall(ModBlocks.DIRT_WALL);
        dirtPool.slab(ModBlocks.DIRT_SLAB);
        dirtPool.stairs(ModBlocks.DIRT_STAIRS);
        dirtPool.fence(ModBlocks.DIRT_FENCE);
        dirtPool.fenceGate(ModBlocks.DIRT_FENCE_GATE);
        dirtPool.pressurePlate(ModBlocks.DIRT_PRESSURE_PLATE);
        //podzol
        registerCustomButton(bsmg, ModBlocks.PODZOL_BUTTON, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomWall(bsmg, ModBlocks.PODZOL_WALL, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomSlab(bsmg, ModBlocks.PODZOL_SLAB, Blocks.PODZOL, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomStairs(bsmg, ModBlocks.PODZOL_STAIRS, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomFence(bsmg, ModBlocks.PODZOL_FENCE, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomFenceGate(bsmg, ModBlocks.PODZOL_FENCE_GATE, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.PODZOL_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.PODZOL_TRAPDOOR, ModTextureMap.customSTB(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        //mycelium
        registerCustomButton(bsmg, ModBlocks.MYCELIUM_BUTTON, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomWall(bsmg, ModBlocks.MYCELIUM_WALL, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomSlab(bsmg, ModBlocks.MYCELIUM_SLAB, Blocks.MYCELIUM, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomStairs(bsmg, ModBlocks.MYCELIUM_STAIRS, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomFence(bsmg, ModBlocks.MYCELIUM_FENCE, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomFenceGate(bsmg, ModBlocks.MYCELIUM_FENCE_GATE, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.MYCELIUM_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.MYCELIUM_TRAPDOOR, ModTextureMap.customSTB(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        //dirt_path
        registerCustomButton(bsmg, ModBlocks.DIRT_PATH_BUTTON, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomWall(bsmg, ModBlocks.DIRT_PATH_WALL, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomSlab(bsmg, ModBlocks.DIRT_PATH_SLAB, Blocks.DIRT_PATH, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomStairs(bsmg, ModBlocks.DIRT_PATH_STAIRS, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomFence(bsmg, ModBlocks.DIRT_PATH_FENCE, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomFenceGate(bsmg, ModBlocks.DIRT_PATH_FENCE_GATE, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.DIRT_PATH_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.DIRT_PATH_TRAPDOOR, ModTextureMap.customSTB(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        //coarse_dirt
        coarseDirtPool.button(ModBlocks.COARSE_DIRT_BUTTON);
        coarseDirtPool.wall(ModBlocks.COARSE_DIRT_WALL);
        coarseDirtPool.slab(ModBlocks.COARSE_DIRT_SLAB);
        coarseDirtPool.stairs(ModBlocks.COARSE_DIRT_STAIRS);
        coarseDirtPool.fence(ModBlocks.COARSE_DIRT_FENCE);
        coarseDirtPool.fenceGate(ModBlocks.COARSE_DIRT_FENCE_GATE);
        coarseDirtPool.pressurePlate(ModBlocks.COARSE_DIRT_PRESSURE_PLATE);
        //farmland
        registerCustomButton(bsmg, ModBlocks.FARMLAND_BUTTON, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomWall(bsmg, ModBlocks.FARMLAND_WALL, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomSlab(bsmg, ModBlocks.FARMLAND_SLAB, Blocks.FARMLAND, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomStairs(bsmg, ModBlocks.FARMLAND_STAIRS, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomFence(bsmg, ModBlocks.FARMLAND_FENCE, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomFenceGate(bsmg, ModBlocks.FARMLAND_FENCE_GATE, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.FARMLAND_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.FARMLAND_TRAPDOOR, ModTextureMap.customSTB(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
        //rooted_dirt
        rootedDirtPool.button(ModBlocks.ROOTED_DIRT_BUTTON);
        rootedDirtPool.wall(ModBlocks.ROOTED_DIRT_WALL);
        rootedDirtPool.slab(ModBlocks.ROOTED_DIRT_SLAB);
        rootedDirtPool.stairs(ModBlocks.ROOTED_DIRT_STAIRS);
        rootedDirtPool.fence(ModBlocks.ROOTED_DIRT_FENCE);
        rootedDirtPool.fenceGate(ModBlocks.ROOTED_DIRT_FENCE_GATE);
        rootedDirtPool.pressurePlate(ModBlocks.ROOTED_DIRT_PRESSURE_PLATE);
        //mud
        mudPool.button(ModBlocks.MUD_BUTTON);
        mudPool.wall(ModBlocks.MUD_WALL);
        mudPool.slab(ModBlocks.MUD_SLAB);
        mudPool.stairs(ModBlocks.MUD_STAIRS);
        mudPool.fence(ModBlocks.MUD_FENCE);
        mudPool.fenceGate(ModBlocks.MUD_FENCE_GATE);
        mudPool.pressurePlate(ModBlocks.MUD_PRESSURE_PLATE);
        //clay
        clayPool.button(ModBlocks.CLAY_BUTTON);
        clayPool.wall(ModBlocks.CLAY_WALL);
        clayPool.slab(ModBlocks.CLAY_SLAB);
        clayPool.stairs(ModBlocks.CLAY_STAIRS);
        clayPool.fence(ModBlocks.CLAY_FENCE);
        clayPool.fenceGate(ModBlocks.CLAY_FENCE_GATE);
        clayPool.pressurePlate(ModBlocks.CLAY_PRESSURE_PLATE);
        //sand
        sandPool.button(ModBlocks.SAND_BUTTON);
        sandPool.wall(ModBlocks.SAND_WALL);
        sandPool.slab(ModBlocks.SAND_SLAB);
        sandPool.stairs(ModBlocks.SAND_STAIRS);
        sandPool.fence(ModBlocks.SAND_FENCE);
        sandPool.fenceGate(ModBlocks.SAND_FENCE_GATE);
        sandPool.pressurePlate(ModBlocks.SAND_PRESSURE_PLATE);
        //gravel
        gravelPool.button(ModBlocks.GRAVEL_BUTTON);
        gravelPool.wall(ModBlocks.GRAVEL_WALL);
        gravelPool.slab(ModBlocks.GRAVEL_SLAB);
        gravelPool.stairs(ModBlocks.GRAVEL_STAIRS);
        gravelPool.fence(ModBlocks.GRAVEL_FENCE);
        gravelPool.fenceGate(ModBlocks.GRAVEL_FENCE_GATE);
        gravelPool.pressurePlate(ModBlocks.GRAVEL_PRESSURE_PLATE);
        //red_sand
        redSandPool.button(ModBlocks.RED_SAND_BUTTON);
        redSandPool.wall(ModBlocks.RED_SAND_WALL);
        redSandPool.slab(ModBlocks.RED_SAND_SLAB);
        redSandPool.stairs(ModBlocks.RED_SAND_STAIRS);
        redSandPool.fence(ModBlocks.RED_SAND_FENCE);
        redSandPool.fenceGate(ModBlocks.RED_SAND_FENCE_GATE);
        redSandPool.pressurePlate(ModBlocks.RED_SAND_PRESSURE_PLATE);
        //ice
        icePool.button(ModBlocks.ICE_BUTTON);
        icePool.wall(ModBlocks.ICE_WALL);
        icePool.slab(ModBlocks.ICE_SLAB);
        icePool.stairs(ModBlocks.ICE_STAIRS);
        icePool.fence(ModBlocks.ICE_FENCE);
        icePool.fenceGate(ModBlocks.ICE_FENCE_GATE);
        icePool.pressurePlate(ModBlocks.ICE_PRESSURE_PLATE);
        //packed_ice
        packedIcePool.button(ModBlocks.PACKED_ICE_BUTTON);
        packedIcePool.wall(ModBlocks.PACKED_ICE_WALL);
        packedIcePool.slab(ModBlocks.PACKED_ICE_SLAB);
        packedIcePool.stairs(ModBlocks.PACKED_ICE_STAIRS);
        packedIcePool.fence(ModBlocks.PACKED_ICE_FENCE);
        packedIcePool.fenceGate(ModBlocks.PACKED_ICE_FENCE_GATE);
        packedIcePool.pressurePlate(ModBlocks.PACKED_ICE_PRESSURE_PLATE);
        //blue_ice
        blueIcePool.button(ModBlocks.BLUE_ICE_BUTTON);
        blueIcePool.wall(ModBlocks.BLUE_ICE_WALL);
        blueIcePool.slab(ModBlocks.BLUE_ICE_SLAB);
        blueIcePool.stairs(ModBlocks.BLUE_ICE_STAIRS);
        blueIcePool.fence(ModBlocks.BLUE_ICE_FENCE);
        blueIcePool.fenceGate(ModBlocks.BLUE_ICE_FENCE_GATE);
        blueIcePool.pressurePlate(ModBlocks.BLUE_ICE_PRESSURE_PLATE);
        //snow
        snowPool.button(ModBlocks.SNOW_BUTTON);
        snowPool.wall(ModBlocks.SNOW_WALL);
        snowPool.slab(ModBlocks.SNOW_SLAB);
        snowPool.stairs(ModBlocks.SNOW_STAIRS);
        snowPool.fence(ModBlocks.SNOW_FENCE);
        snowPool.fenceGate(ModBlocks.SNOW_FENCE_GATE);
        snowPool.pressurePlate(ModBlocks.SNOW_PRESSURE_PLATE);
        //moss
        mossPool.button(ModBlocks.MOSS_BUTTON);
        mossPool.wall(ModBlocks.MOSS_WALL);
        mossPool.slab(ModBlocks.MOSS_SLAB);
        mossPool.stairs(ModBlocks.MOSS_STAIRS);
        mossPool.fence(ModBlocks.MOSS_FENCE);
        mossPool.fenceGate(ModBlocks.MOSS_FENCE_GATE);
        mossPool.pressurePlate(ModBlocks.MOSS_PRESSURE_PLATE);
        //calcite
        calcitePool.button(ModBlocks.CALCITE_BUTTON);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.fence(ModBlocks.CALCITE_FENCE);
        calcitePool.fenceGate(ModBlocks.CALCITE_FENCE_GATE);
        calcitePool.pressurePlate(ModBlocks.CALCITE_PRESSURE_PLATE);
        //tuff
        tuffPool.button(ModBlocks.TUFF_BUTTON);
        tuffPool.wall(ModBlocks.TUFF_WALL);
        tuffPool.slab(ModBlocks.TUFF_SLAB);
        tuffPool.stairs(ModBlocks.TUFF_STAIRS);
        tuffPool.fence(ModBlocks.TUFF_FENCE);
        tuffPool.fenceGate(ModBlocks.TUFF_FENCE_GATE);
        tuffPool.pressurePlate(ModBlocks.TUFF_PRESSURE_PLATE);
        //dripstone
        dripstonePool.button(ModBlocks.DRIPSTONE_BUTTON);
        dripstonePool.wall(ModBlocks.DRIPSTONE_WALL);
        dripstonePool.slab(ModBlocks.DRIPSTONE_SLAB);
        dripstonePool.stairs(ModBlocks.DRIPSTONE_STAIRS);
        dripstonePool.fence(ModBlocks.DRIPSTONE_FENCE);
        dripstonePool.fenceGate(ModBlocks.DRIPSTONE_FENCE_GATE);
        dripstonePool.pressurePlate(ModBlocks.DRIPSTONE_PRESSURE_PLATE);
        //magma
        magmaPool.button(ModBlocks.MAGMA_BUTTON);
        magmaPool.wall(ModBlocks.MAGMA_WALL);
        magmaPool.slab(ModBlocks.MAGMA_SLAB);
        magmaPool.stairs(ModBlocks.MAGMA_STAIRS);
        magmaPool.fence(ModBlocks.MAGMA_FENCE);
        magmaPool.fenceGate(ModBlocks.MAGMA_FENCE_GATE);
        magmaPool.pressurePlate(ModBlocks.MAGMA_PRESSURE_PLATE);
        //obsidian
        obsidianPool.button(ModBlocks.OBSIDIAN_BUTTON);
        obsidianPool.wall(ModBlocks.OBSIDIAN_WALL);
        obsidianPool.slab(ModBlocks.OBSIDIAN_SLAB);
        obsidianPool.stairs(ModBlocks.OBSIDIAN_STAIRS);
        obsidianPool.fence(ModBlocks.OBSIDIAN_FENCE);
        obsidianPool.fenceGate(ModBlocks.OBSIDIAN_FENCE_GATE);
        obsidianPool.pressurePlate(ModBlocks.OBSIDIAN_PRESSURE_PLATE);
        //crying_obsidian
        cryingObsidianPool.button(ModBlocks.CRYING_OBSIDIAN_BUTTON);
        cryingObsidianPool.wall(ModBlocks.CRYING_OBSIDIAN_WALL);
        cryingObsidianPool.slab(ModBlocks.CRYING_OBSIDIAN_SLAB);
        cryingObsidianPool.stairs(ModBlocks.CRYING_OBSIDIAN_STAIRS);
        cryingObsidianPool.fence(ModBlocks.CRYING_OBSIDIAN_FENCE);
        cryingObsidianPool.fenceGate(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE);
        cryingObsidianPool.pressurePlate(ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE);
        //crimson_nylium
        registerCustomButton(bsmg, ModBlocks.CRIMSON_NYLIUM_BUTTON, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomWall(bsmg, ModBlocks.CRIMSON_NYLIUM_WALL, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomSlab(bsmg, ModBlocks.CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomStairs(bsmg, ModBlocks.CRIMSON_NYLIUM_STAIRS, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFence(bsmg, ModBlocks.CRIMSON_NYLIUM_FENCE, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFenceGate(bsmg, ModBlocks.CRIMSON_NYLIUM_FENCE_GATE, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.CRIMSON_NYLIUM_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.CRIMSON_NYLIUM_TRAPDOOR, ModTextureMap.customSTB(Blocks.CRIMSON_NYLIUM, ModBlocks.CRIMSON_NYLIUM_TRAPDOOR, Blocks.NETHERRACK, "_side", "", ""));
        //warped_nylium
        registerCustomButton(bsmg, ModBlocks.WARPED_NYLIUM_BUTTON, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomWall(bsmg, ModBlocks.WARPED_NYLIUM_WALL, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomSlab(bsmg, ModBlocks.WARPED_NYLIUM_SLAB, Blocks.WARPED_NYLIUM, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomStairs(bsmg, ModBlocks.WARPED_NYLIUM_STAIRS, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFence(bsmg, ModBlocks.WARPED_NYLIUM_FENCE, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFenceGate(bsmg, ModBlocks.WARPED_NYLIUM_FENCE_GATE, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.WARPED_NYLIUM_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.WARPED_NYLIUM_TRAPDOOR, ModTextureMap.customSTB(Blocks.WARPED_NYLIUM, ModBlocks.WARPED_NYLIUM_TRAPDOOR, Blocks.NETHERRACK, "_side", "", ""));
        //soul_sand
        soulSandPool.button(ModBlocks.SOUL_SAND_BUTTON);
        soulSandPool.wall(ModBlocks.SOUL_SAND_WALL);
        soulSandPool.slab(ModBlocks.SOUL_SAND_SLAB);
        soulSandPool.stairs(ModBlocks.SOUL_SAND_STAIRS);
        soulSandPool.fence(ModBlocks.SOUL_SAND_FENCE);
        soulSandPool.fenceGate(ModBlocks.SOUL_SAND_FENCE_GATE);
        soulSandPool.pressurePlate(ModBlocks.SOUL_SAND_PRESSURE_PLATE);
        //soul_soil
        soulSoilPool.button(ModBlocks.SOUL_SOIL_BUTTON);
        soulSoilPool.wall(ModBlocks.SOUL_SOIL_WALL);
        soulSoilPool.slab(ModBlocks.SOUL_SOIL_SLAB);
        soulSoilPool.stairs(ModBlocks.SOUL_SOIL_STAIRS);
        soulSoilPool.fence(ModBlocks.SOUL_SOIL_FENCE);
        soulSoilPool.fenceGate(ModBlocks.SOUL_SOIL_FENCE_GATE);
        soulSoilPool.pressurePlate(ModBlocks.SOUL_SOIL_PRESSURE_PLATE);
        //bone
        registerCustomButton(bsmg, ModBlocks.BONE_BUTTON, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.BONE_WALL, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.BONE_SLAB, Blocks.BONE_BLOCK, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.BONE_STAIRS, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.BONE_FENCE, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.BONE_FENCE_GATE, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.BONE_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomOrTrapdoor(bsmg, ModBlocks.BONE_TRAPDOOR, ModTextureMap.customSTB(Blocks.BONE_BLOCK, ModBlocks.BONE_TRAPDOOR, ModBlocks.BONE_TRAPDOOR, "_side", "", ""));
        //coal_ore
        coalOrePool.button(ModBlocks.COAL_ORE_BUTTON);
        coalOrePool.wall(ModBlocks.COAL_ORE_WALL);
        coalOrePool.slab(ModBlocks.COAL_ORE_SLAB);
        coalOrePool.stairs(ModBlocks.COAL_ORE_STAIRS);
        coalOrePool.fence(ModBlocks.COAL_ORE_FENCE);
        coalOrePool.fenceGate(ModBlocks.COAL_ORE_FENCE_GATE);
        coalOrePool.pressurePlate(ModBlocks.COAL_ORE_PRESSURE_PLATE);
        //deepslate_coal_ore
        deepslateCoalOrePool.button(ModBlocks.DEEPSLATE_COAL_ORE_BUTTON);
        deepslateCoalOrePool.wall(ModBlocks.DEEPSLATE_COAL_ORE_WALL);
        deepslateCoalOrePool.slab(ModBlocks.DEEPSLATE_COAL_ORE_SLAB);
        deepslateCoalOrePool.stairs(ModBlocks.DEEPSLATE_COAL_ORE_STAIRS);
        deepslateCoalOrePool.fence(ModBlocks.DEEPSLATE_COAL_ORE_FENCE);
        deepslateCoalOrePool.fenceGate(ModBlocks.DEEPSLATE_COAL_ORE_FENCE_GATE);
        deepslateCoalOrePool.pressurePlate(ModBlocks.DEEPSLATE_COAL_ORE_PRESSURE_PLATE);
        //iron_ore
        ironOrePool.button(ModBlocks.IRON_ORE_BUTTON);
        ironOrePool.wall(ModBlocks.IRON_ORE_WALL);
        ironOrePool.slab(ModBlocks.IRON_ORE_SLAB);
        ironOrePool.stairs(ModBlocks.IRON_ORE_STAIRS);
        ironOrePool.fence(ModBlocks.IRON_ORE_FENCE);
        ironOrePool.fenceGate(ModBlocks.IRON_ORE_FENCE_GATE);
        ironOrePool.pressurePlate(ModBlocks.IRON_ORE_PRESSURE_PLATE);
        //deepslate_iron_ore
        deepslateIronOrePool.button(ModBlocks.DEEPSLATE_IRON_ORE_BUTTON);
        deepslateIronOrePool.wall(ModBlocks.DEEPSLATE_IRON_ORE_WALL);
        deepslateIronOrePool.slab(ModBlocks.DEEPSLATE_IRON_ORE_SLAB);
        deepslateIronOrePool.stairs(ModBlocks.DEEPSLATE_IRON_ORE_STAIRS);
        deepslateIronOrePool.fence(ModBlocks.DEEPSLATE_IRON_ORE_FENCE);
        deepslateIronOrePool.fenceGate(ModBlocks.DEEPSLATE_IRON_ORE_FENCE_GATE);
        deepslateIronOrePool.pressurePlate(ModBlocks.DEEPSLATE_IRON_ORE_PRESSURE_PLATE);
        //copper_ore
        copperOrePool.button(ModBlocks.COPPER_ORE_BUTTON);
        copperOrePool.wall(ModBlocks.COPPER_ORE_WALL);
        copperOrePool.slab(ModBlocks.COPPER_ORE_SLAB);
        copperOrePool.stairs(ModBlocks.COPPER_ORE_STAIRS);
        copperOrePool.fence(ModBlocks.COPPER_ORE_FENCE);
        copperOrePool.fenceGate(ModBlocks.COPPER_ORE_FENCE_GATE);
        copperOrePool.pressurePlate(ModBlocks.COPPER_ORE_PRESSURE_PLATE);
        //deepslate_copper_ore
        deepslateCopperOrePool.button(ModBlocks.DEEPSLATE_COPPER_ORE_BUTTON);
        deepslateCopperOrePool.wall(ModBlocks.DEEPSLATE_COPPER_ORE_WALL);
        deepslateCopperOrePool.slab(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB);
        deepslateCopperOrePool.stairs(ModBlocks.DEEPSLATE_COPPER_ORE_STAIRS);
        deepslateCopperOrePool.fence(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE);
        deepslateCopperOrePool.fenceGate(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE_GATE);
        deepslateCopperOrePool.pressurePlate(ModBlocks.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE);
        //gold_ore
        goldOrePool.button(ModBlocks.GOLD_ORE_BUTTON);
        goldOrePool.wall(ModBlocks.GOLD_ORE_WALL);
        goldOrePool.slab(ModBlocks.GOLD_ORE_SLAB);
        goldOrePool.stairs(ModBlocks.GOLD_ORE_STAIRS);
        goldOrePool.fence(ModBlocks.GOLD_ORE_FENCE);
        goldOrePool.fenceGate(ModBlocks.GOLD_ORE_FENCE_GATE);
        goldOrePool.pressurePlate(ModBlocks.GOLD_ORE_PRESSURE_PLATE);
        //deepslate_gold_ore
        deepslateGoldOrePool.button(ModBlocks.DEEPSLATE_GOLD_ORE_BUTTON);
        deepslateGoldOrePool.wall(ModBlocks.DEEPSLATE_GOLD_ORE_WALL);
        deepslateGoldOrePool.slab(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB);
        deepslateGoldOrePool.stairs(ModBlocks.DEEPSLATE_GOLD_ORE_STAIRS);
        deepslateGoldOrePool.fence(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE);
        deepslateGoldOrePool.fenceGate(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE_GATE);
        deepslateGoldOrePool.pressurePlate(ModBlocks.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE);
        //redstone_ore
        redstoneOrePool.button(ModBlocks.REDSTONE_ORE_BUTTON);
        redstoneOrePool.wall(ModBlocks.REDSTONE_ORE_WALL);
        redstoneOrePool.slab(ModBlocks.REDSTONE_ORE_SLAB);
        redstoneOrePool.stairs(ModBlocks.REDSTONE_ORE_STAIRS);
        redstoneOrePool.fence(ModBlocks.REDSTONE_ORE_FENCE);
        redstoneOrePool.fenceGate(ModBlocks.REDSTONE_ORE_FENCE_GATE);
        redstoneOrePool.pressurePlate(ModBlocks.REDSTONE_ORE_PRESSURE_PLATE);
        //deepslate_redstone_ore
        deepslateRedstoneOrePool.button(ModBlocks.DEEPSLATE_REDSTONE_ORE_BUTTON);
        deepslateRedstoneOrePool.wall(ModBlocks.DEEPSLATE_REDSTONE_ORE_WALL);
        deepslateRedstoneOrePool.slab(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB);
        deepslateRedstoneOrePool.stairs(ModBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS);
        deepslateRedstoneOrePool.fence(ModBlocks.DEEPSLATE_REDSTONE_ORE_FENCE);
        deepslateRedstoneOrePool.fenceGate(ModBlocks.DEEPSLATE_REDSTONE_ORE_FENCE_GATE);
        deepslateRedstoneOrePool.pressurePlate(ModBlocks.DEEPSLATE_REDSTONE_ORE_PRESSURE_PLATE);
        //emerald_ore
        emeraldOrePool.button(ModBlocks.EMERALD_ORE_BUTTON);
        emeraldOrePool.wall(ModBlocks.EMERALD_ORE_WALL);
        emeraldOrePool.slab(ModBlocks.EMERALD_ORE_SLAB);
        emeraldOrePool.stairs(ModBlocks.EMERALD_ORE_STAIRS);
        emeraldOrePool.fence(ModBlocks.EMERALD_ORE_FENCE);
        emeraldOrePool.fenceGate(ModBlocks.EMERALD_ORE_FENCE_GATE);
        emeraldOrePool.pressurePlate(ModBlocks.EMERALD_ORE_PRESSURE_PLATE);
        //deepslate_emerald_ore
        deepslateEmeraldOrePool.button(ModBlocks.DEEPSLATE_EMERALD_ORE_BUTTON);
        deepslateEmeraldOrePool.wall(ModBlocks.DEEPSLATE_EMERALD_ORE_WALL);
        deepslateEmeraldOrePool.slab(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB);
        deepslateEmeraldOrePool.stairs(ModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS);
        deepslateEmeraldOrePool.fence(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE);
        deepslateEmeraldOrePool.fenceGate(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE_GATE);
        deepslateEmeraldOrePool.pressurePlate(ModBlocks.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE);
        //lapis_ore
        lapisOrePool.button(ModBlocks.LAPIS_ORE_BUTTON);
        lapisOrePool.wall(ModBlocks.LAPIS_ORE_WALL);
        lapisOrePool.slab(ModBlocks.LAPIS_ORE_SLAB);
        lapisOrePool.stairs(ModBlocks.LAPIS_ORE_STAIRS);
        lapisOrePool.fence(ModBlocks.LAPIS_ORE_FENCE);
        lapisOrePool.fenceGate(ModBlocks.LAPIS_ORE_FENCE_GATE);
        lapisOrePool.pressurePlate(ModBlocks.LAPIS_ORE_PRESSURE_PLATE);
        //deepslate_lapis_ore
        deepslateLapisOrePool.button(ModBlocks.DEEPSLATE_LAPIS_ORE_BUTTON);
        deepslateLapisOrePool.wall(ModBlocks.DEEPSLATE_LAPIS_ORE_WALL);
        deepslateLapisOrePool.slab(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB);
        deepslateLapisOrePool.stairs(ModBlocks.DEEPSLATE_LAPIS_ORE_STAIRS);
        deepslateLapisOrePool.fence(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE);
        deepslateLapisOrePool.fenceGate(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE_GATE);
        deepslateLapisOrePool.pressurePlate(ModBlocks.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE);
        //diamond_ore
        diamondOrePool.button(ModBlocks.DIAMOND_ORE_BUTTON);
        diamondOrePool.wall(ModBlocks.DIAMOND_ORE_WALL);
        diamondOrePool.slab(ModBlocks.DIAMOND_ORE_SLAB);
        diamondOrePool.stairs(ModBlocks.DIAMOND_ORE_STAIRS);
        diamondOrePool.fence(ModBlocks.DIAMOND_ORE_FENCE);
        diamondOrePool.fenceGate(ModBlocks.DIAMOND_ORE_FENCE_GATE);
        diamondOrePool.pressurePlate(ModBlocks.DIAMOND_ORE_PRESSURE_PLATE);
        //deepslate_diamond_ore
        deepslateDiamondOrePool.button(ModBlocks.DEEPSLATE_DIAMOND_ORE_BUTTON);
        deepslateDiamondOrePool.wall(ModBlocks.DEEPSLATE_DIAMOND_ORE_WALL);
        deepslateDiamondOrePool.slab(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB);
        deepslateDiamondOrePool.stairs(ModBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS);
        deepslateDiamondOrePool.fence(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE);
        deepslateDiamondOrePool.fenceGate(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE_GATE);
        deepslateDiamondOrePool.pressurePlate(ModBlocks.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE);
        //nether_gold_ore
        netherGoldOrePool.button(ModBlocks.NETHER_GOLD_ORE_BUTTON);
        netherGoldOrePool.wall(ModBlocks.NETHER_GOLD_ORE_WALL);
        netherGoldOrePool.slab(ModBlocks.NETHER_GOLD_ORE_SLAB);
        netherGoldOrePool.stairs(ModBlocks.NETHER_GOLD_ORE_STAIRS);
        netherGoldOrePool.fence(ModBlocks.NETHER_GOLD_ORE_FENCE);
        netherGoldOrePool.fenceGate(ModBlocks.NETHER_GOLD_ORE_FENCE_GATE);
        netherGoldOrePool.pressurePlate(ModBlocks.NETHER_GOLD_ORE_PRESSURE_PLATE);
        //nether_quartz_ore
        netherQuartzOrePool.button(ModBlocks.NETHER_QUARTZ_ORE_BUTTON);
        netherQuartzOrePool.wall(ModBlocks.NETHER_QUARTZ_ORE_WALL);
        netherQuartzOrePool.slab(ModBlocks.NETHER_QUARTZ_ORE_SLAB);
        netherQuartzOrePool.stairs(ModBlocks.NETHER_QUARTZ_ORE_STAIRS);
        netherQuartzOrePool.fence(ModBlocks.NETHER_QUARTZ_ORE_FENCE);
        netherQuartzOrePool.fenceGate(ModBlocks.NETHER_QUARTZ_ORE_FENCE_GATE);
        netherQuartzOrePool.pressurePlate(ModBlocks.NETHER_QUARTZ_ORE_PRESSURE_PLATE);
        //ancient_debris
        registerCustomButton(bsmg, ModBlocks.ANCIENT_DEBRIS_BUTTON, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.ANCIENT_DEBRIS_WALL, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.ANCIENT_DEBRIS_SLAB, Blocks.ANCIENT_DEBRIS, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.ANCIENT_DEBRIS_STAIRS, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.ANCIENT_DEBRIS_FENCE, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.ANCIENT_DEBRIS_FENCE_GATE, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.ANCIENT_DEBRIS_PRESSURE_PLATE, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomOrTrapdoor(bsmg, ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, ModTextureMap.customSTB(Blocks.ANCIENT_DEBRIS, ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, "_side", "", ""));
        //raw_iron_block
        bsmg.registerCubeAllModelTexturePool(Blocks.RAW_IRON_BLOCK)
                .button(ModBlocks.RAW_IRON_BUTTON)
                .wall(ModBlocks.RAW_IRON_WALL)
                .slab(ModBlocks.RAW_IRON_SLAB)
                .stairs(ModBlocks.RAW_IRON_STAIRS)
                .fence(ModBlocks.RAW_IRON_FENCE)
                .fenceGate(ModBlocks.RAW_IRON_FENCE_GATE)
                .pressurePlate(ModBlocks.RAW_IRON_PRESSURE_PLATE);
        //raw_copper_block
        bsmg.registerCubeAllModelTexturePool(Blocks.RAW_COPPER_BLOCK)
                .button(ModBlocks.RAW_COPPER_BUTTON)
                .wall(ModBlocks.RAW_COPPER_WALL)
                .slab(ModBlocks.RAW_COPPER_SLAB)
                .stairs(ModBlocks.RAW_COPPER_STAIRS)
                .fence(ModBlocks.RAW_COPPER_FENCE)
                .fenceGate(ModBlocks.RAW_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.RAW_COPPER_PRESSURE_PLATE);
        //raw_gold_block
        bsmg.registerCubeAllModelTexturePool(Blocks.RAW_GOLD_BLOCK)
                .button(ModBlocks.RAW_GOLD_BUTTON)
                .wall(ModBlocks.RAW_GOLD_WALL)
                .slab(ModBlocks.RAW_GOLD_SLAB)
                .stairs(ModBlocks.RAW_GOLD_STAIRS)
                .fence(ModBlocks.RAW_GOLD_FENCE)
                .fenceGate(ModBlocks.RAW_GOLD_FENCE_GATE)
                .pressurePlate(ModBlocks.RAW_GOLD_PRESSURE_PLATE);
        //glowstone
        bsmg.registerCubeAllModelTexturePool(Blocks.GLOWSTONE)
                .button(ModBlocks.GLOWSTONE_BUTTON)
                .wall(ModBlocks.GLOWSTONE_WALL)
                .slab(ModBlocks.GLOWSTONE_SLAB)
                .stairs(ModBlocks.GLOWSTONE_STAIRS)
                .fence(ModBlocks.GLOWSTONE_FENCE)
                .fenceGate(ModBlocks.GLOWSTONE_FENCE_GATE)
                .pressurePlate(ModBlocks.GLOWSTONE_PRESSURE_PLATE);
        //oak_leaves
        registerCustomButton(bsmg, ModBlocks.OAK_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.OAK_LEAVES_WALL, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.OAK_LEAVES_SLAB, Blocks.OAK_LEAVES, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.OAK_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.OAK_LEAVES_FENCE, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.OAK_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.OAK_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.OAK_LEAVES, ""));
        //spruce_leaves
        registerCustomButton(bsmg, ModBlocks.SPRUCE_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.SPRUCE_LEAVES_WALL, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.SPRUCE_LEAVES_SLAB, Blocks.SPRUCE_LEAVES, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.SPRUCE_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.SPRUCE_LEAVES_FENCE, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.SPRUCE_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.SPRUCE_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.SPRUCE_LEAVES, ""));
        //birch_leaves
        registerCustomButton(bsmg, ModBlocks.BIRCH_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.BIRCH_LEAVES_WALL, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.BIRCH_LEAVES_SLAB, Blocks.BIRCH_LEAVES, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.BIRCH_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.BIRCH_LEAVES_FENCE, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.BIRCH_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.BIRCH_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.BIRCH_LEAVES, ""));
        //jungle_leaves
        registerCustomButton(bsmg, ModBlocks.JUNGLE_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.JUNGLE_LEAVES_WALL, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.JUNGLE_LEAVES_SLAB, Blocks.JUNGLE_LEAVES, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.JUNGLE_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.JUNGLE_LEAVES_FENCE, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.JUNGLE_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.JUNGLE_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.JUNGLE_LEAVES, ""));
        //acacia_leaves
        registerCustomButton(bsmg, ModBlocks.ACACIA_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.ACACIA_LEAVES_WALL, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.ACACIA_LEAVES_SLAB, Blocks.ACACIA_LEAVES, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.ACACIA_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.ACACIA_LEAVES_FENCE, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.ACACIA_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.ACACIA_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.ACACIA_LEAVES, ""));
        //dark_oak_leaves
        registerCustomButton(bsmg, ModBlocks.DARK_OAK_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.DARK_OAK_LEAVES_WALL, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.DARK_OAK_LEAVES_SLAB, Blocks.DARK_OAK_LEAVES, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.DARK_OAK_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.DARK_OAK_LEAVES_FENCE, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.DARK_OAK_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.DARK_OAK_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.DARK_OAK_LEAVES, ""));
        //mangrove_leaves
        registerCustomButton(bsmg, ModBlocks.MANGROVE_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.MANGROVE_LEAVES_WALL, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.MANGROVE_LEAVES_SLAB, Blocks.MANGROVE_LEAVES, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.MANGROVE_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.MANGROVE_LEAVES_FENCE, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.MANGROVE_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.MANGROVE_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.MANGROVE_LEAVES, ""));
        //cherry_leaves
        registerCustomButton(bsmg, ModBlocks.CHERRY_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.CHERRY_LEAVES_WALL, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.CHERRY_LEAVES_SLAB, Blocks.CHERRY_LEAVES, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.CHERRY_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.CHERRY_LEAVES_FENCE, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.CHERRY_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.CHERRY_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.CHERRY_LEAVES, ""));
        //azalea_leaves
        registerCustomButton(bsmg, ModBlocks.AZALEA_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.AZALEA_LEAVES_WALL, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.AZALEA_LEAVES_SLAB, Blocks.AZALEA_LEAVES, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.AZALEA_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.AZALEA_LEAVES_FENCE, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.AZALEA_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.AZALEA_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.AZALEA_LEAVES, ""));
        //flowering_azalea_leaves
        registerCustomButton(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_BUTTON, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        registerCustomWall(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_WALL, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        registerCustomSlab(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB, Blocks.FLOWERING_AZALEA_LEAVES, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        registerCustomStairs(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_STAIRS, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        registerCustomFence(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        registerCustomFenceGate(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE_GATE, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        registerCustomPressurePlate(bsmg, ModBlocks.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE, ModTextureMap.customAll(Blocks.FLOWERING_AZALEA_LEAVES, ""));
        //brown_mushroom
        bsmg.registerCubeAllModelTexturePool(Blocks.BROWN_MUSHROOM_BLOCK)
                .button(ModBlocks.BROWN_MUSHROOM_BUTTON)
                .wall(ModBlocks.BROWN_MUSHROOM_WALL)
                .slab(ModBlocks.BROWN_MUSHROOM_SLAB)
                .stairs(ModBlocks.BROWN_MUSHROOM_STAIRS)
                .fence(ModBlocks.BROWN_MUSHROOM_FENCE)
                .fenceGate(ModBlocks.BROWN_MUSHROOM_FENCE_GATE)
                .pressurePlate(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE);
        //red_mushroom
        bsmg.registerCubeAllModelTexturePool(Blocks.RED_MUSHROOM_BLOCK)
                .button(ModBlocks.RED_MUSHROOM_BUTTON)
                .wall(ModBlocks.RED_MUSHROOM_WALL)
                .slab(ModBlocks.RED_MUSHROOM_SLAB)
                .stairs(ModBlocks.RED_MUSHROOM_STAIRS)
                .fence(ModBlocks.RED_MUSHROOM_FENCE)
                .fenceGate(ModBlocks.RED_MUSHROOM_FENCE_GATE)
                .pressurePlate(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE);
        //nether_wart
        bsmg.registerCubeAllModelTexturePool(Blocks.NETHER_WART_BLOCK)
                .button(ModBlocks.NETHER_WART_BUTTON)
                .wall(ModBlocks.NETHER_WART_WALL)
                .slab(ModBlocks.NETHER_WART_SLAB)
                .stairs(ModBlocks.NETHER_WART_STAIRS)
                .fence(ModBlocks.NETHER_WART_FENCE)
                .fenceGate(ModBlocks.NETHER_WART_FENCE_GATE)
                .pressurePlate(ModBlocks.NETHER_WART_PRESSURE_PLATE);
        //warped_wart
        bsmg.registerCubeAllModelTexturePool(Blocks.WARPED_WART_BLOCK)
                .button(ModBlocks.WARPED_WART_BUTTON)
                .wall(ModBlocks.WARPED_WART_WALL)
                .slab(ModBlocks.WARPED_WART_SLAB)
                .stairs(ModBlocks.WARPED_WART_STAIRS)
                .fence(ModBlocks.WARPED_WART_FENCE)
                .fenceGate(ModBlocks.WARPED_WART_FENCE_GATE)
                .pressurePlate(ModBlocks.WARPED_WART_PRESSURE_PLATE);





        //oak
        bsmg.registerDoor(ModBlocks.OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.OAK_WOOD_TRAPDOOR);
        //str oak
        bsmg.registerDoor(ModBlocks.STR_OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_OAK_WOOD_TRAPDOOR);
        //spruce
        bsmg.registerDoor(ModBlocks.SPRUCE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
        //str spruce
        bsmg.registerDoor(ModBlocks.STR_SPRUCE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
        //birch
        bsmg.registerDoor(ModBlocks.BIRCH_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BIRCH_WOOD_TRAPDOOR);
        //str birch
        bsmg.registerDoor(ModBlocks.STR_BIRCH_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
        //jungle
        bsmg.registerDoor(ModBlocks.JUNGLE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
        //str jungle
        bsmg.registerDoor(ModBlocks.STR_JUNGLE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
        //acacia
        bsmg.registerDoor(ModBlocks.ACACIA_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ACACIA_WOOD_TRAPDOOR);
        //str acacia
        bsmg.registerDoor(ModBlocks.STR_ACACIA_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
        //dark oak
        bsmg.registerDoor(ModBlocks.DARK_OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
        //str dark oak
        bsmg.registerDoor(ModBlocks.STR_DARK_OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
        //mangrove
        bsmg.registerDoor(ModBlocks.MANGROVE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
        //str mangrove
        bsmg.registerDoor(ModBlocks.STR_MANGROVE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
        //cherry
        bsmg.registerDoor(ModBlocks.CHERRY_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CHERRY_WOOD_TRAPDOOR);
        //str cherry
        bsmg.registerDoor(ModBlocks.STR_CHERRY_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
        //bamboo
        bsmg.registerDoor(ModBlocks.BAMBOO_BLOCK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BAMBOO_BLOCK_TRAPDOOR);
        //str bamboo
        bsmg.registerDoor(ModBlocks.STR_BAMBOO_BLOCK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
        //crimson hyphae
        bsmg.registerDoor(ModBlocks.CRIMSON_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR);
        //str crimson hyphae
        bsmg.registerDoor(ModBlocks.STR_CRIMSON_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
        //warped hyphae
        bsmg.registerDoor(ModBlocks.WARPED_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WARPED_HYPHAE_TRAPDOOR);
        //str warped hyphae
        bsmg.registerDoor(ModBlocks.STR_WARPED_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
        //stone
        bsmg.registerDoor(ModBlocks.STONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STONE_TRAPDOOR);
        //cobblestone
        bsmg.registerDoor(ModBlocks.COBBLESTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.COBBLESTONE_TRAPDOOR);
        //mossy cobblestone
        bsmg.registerDoor(ModBlocks.MOSSY_COBBLESTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR);
        //smooth stone
        bsmg.registerDoor(ModBlocks.SMOOTH_STONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SMOOTH_STONE_TRAPDOOR);
        //stone bricks
        bsmg.registerDoor(ModBlocks.STONE_BRICKS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STONE_BRICKS_TRAPDOOR);
        //cracked stone bricks
        bsmg.registerDoor(ModBlocks.CRACKED_STONE_BRICKS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRACKED_STONE_BRICKS_TRAPDOOR);
        //granite
        bsmg.registerDoor(ModBlocks.GRANITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRANITE_TRAPDOOR);
        //polished granite
        bsmg.registerDoor(ModBlocks.POLISHED_GRANITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_GRANITE_TRAPDOOR);
        //diorite
        bsmg.registerDoor(ModBlocks.DIORITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DIORITE_TRAPDOOR);
        //polished diorite
        bsmg.registerDoor(ModBlocks.POLISHED_DIORITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_DIORITE_TRAPDOOR);
        //andesite
        bsmg.registerDoor(ModBlocks.ANDESITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ANDESITE_TRAPDOOR);
        //polished andesite
        bsmg.registerDoor(ModBlocks.POLISHED_ANDESITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_ANDESITE_TRAPDOOR);
        //deepslate
        bsmg.registerDoor(ModBlocks.DEEPSLATE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_TRAPDOOR);
        //cobbled deepslate
        bsmg.registerDoor(ModBlocks.COBBLED_DEEPSLATE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.COBBLED_DEEPSLATE_TRAPDOOR);
        //chiseled deepslate
        bsmg.registerDoor(ModBlocks.CHISELED_DEEPSLATE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CHISELED_DEEPSLATE_TRAPDOOR);
        //polished deepslate
        bsmg.registerDoor(ModBlocks.POLISHED_DEEPSLATE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
        //deepslate bricks
        bsmg.registerDoor(ModBlocks.DEEPSLATE_BRICKS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_BRICKS_TRAPDOOR);
        //cracked deepslate bricks
        bsmg.registerDoor(ModBlocks.CRACKED_DEEPSLATE_BRICKS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TRAPDOOR);
        //deepslate tiles
        bsmg.registerDoor(ModBlocks.DEEPSLATE_TILES_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_TILES_TRAPDOOR);
        //cracked deepslate tiles
        bsmg.registerDoor(ModBlocks.CRACKED_DEEPSLATE_TILES_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRACKED_DEEPSLATE_TILES_TRAPDOOR);
        //bricks
        bsmg.registerDoor(ModBlocks.BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BRICK_TRAPDOOR);
        //packed mud
        bsmg.registerDoor(ModBlocks.PACKED_MUD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PACKED_MUD_TRAPDOOR);
        //mud bricks
        bsmg.registerDoor(ModBlocks.MUD_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MUD_BRICK_TRAPDOOR);
        //sandstone
        bsmg.registerDoor(ModBlocks.SANDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SANDSTONE_TRAPDOOR);
        //smooth sandstone
        bsmg.registerDoor(ModBlocks.SMOOTH_SANDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SMOOTH_SANDSTONE_TRAPDOOR);
        //cut sandstone
        bsmg.registerDoor(ModBlocks.CUT_SANDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CUT_SANDSTONE_TRAPDOOR);
        //red sandstone
        bsmg.registerDoor(ModBlocks.RED_SANDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_SANDSTONE_TRAPDOOR);
        //red smooth sandstone
        bsmg.registerDoor(ModBlocks.SMOOTH_RED_SANDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SMOOTH_RED_SANDSTONE_TRAPDOOR);
        //red cut sandstone
        bsmg.registerDoor(ModBlocks.CUT_RED_SANDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CUT_RED_SANDSTONE_TRAPDOOR);
        //sea lantern
        bsmg.registerDoor(ModBlocks.SEA_LANTERN_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SEA_LANTERN_TRAPDOOR);
        //prismarine
        bsmg.registerDoor(ModBlocks.PRISMARINE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PRISMARINE_TRAPDOOR);
        //prismarine brick
        bsmg.registerDoor(ModBlocks.PRISMARINE_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PRISMARINE_BRICK_TRAPDOOR);
        //dark prismarine
        bsmg.registerDoor(ModBlocks.DARK_PRISMARINE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DARK_PRISMARINE_TRAPDOOR);
        //netherrack
        bsmg.registerDoor(ModBlocks.NETHERRACK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.NETHERRACK_TRAPDOOR);
        //nether brick
        bsmg.registerDoor(ModBlocks.NETHER_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.NETHER_BRICK_TRAPDOOR);
        //cracked nether brick
        bsmg.registerDoor(ModBlocks.CRACKED_NETHER_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRACKED_NETHER_BRICK_TRAPDOOR);
        //red nether brick
        bsmg.registerDoor(ModBlocks.RED_NETHER_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_NETHER_BRICK_TRAPDOOR);
        //basalt
        bsmg.registerDoor(ModBlocks.BASALT_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BASALT_TRAPDOOR);
        //smooth basalt
        bsmg.registerDoor(ModBlocks.SMOOTH_BASALT_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SMOOTH_BASALT_TRAPDOOR);
        //polished basalt
        bsmg.registerDoor(ModBlocks.POLISHED_BASALT_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_BASALT_TRAPDOOR);
        //blackstone
        bsmg.registerDoor(ModBlocks.BLACKSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACKSTONE_TRAPDOOR);
        //gilded blackstone
        bsmg.registerDoor(ModBlocks.GILDED_BLACKSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GILDED_BLACKSTONE_TRAPDOOR);
        //polished blackstone
        bsmg.registerDoor(ModBlocks.POLISHED_BLACKSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_BLACKSTONE_TRAPDOOR);
        //polished blackstone brick
        bsmg.registerDoor(ModBlocks.POLISHED_BLACKSTONE_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
        //cracked polished blackstone brick
        bsmg.registerDoor(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR);
        //end stone
        bsmg.registerDoor(ModBlocks.END_STONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.END_STONE_TRAPDOOR);
        //end stone brick
        bsmg.registerDoor(ModBlocks.END_STONE_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.END_STONE_BRICK_TRAPDOOR);
        //purpur block
        bsmg.registerDoor(ModBlocks.PURPUR_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPUR_TRAPDOOR);
        //coal
        bsmg.registerDoor(ModBlocks.COAL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.COAL_TRAPDOOR);
        //gold
        bsmg.registerDoor(ModBlocks.GOLD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GOLD_TRAPDOOR);
        //redstone
        bsmg.registerDoor(ModBlocks.REDSTONE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.REDSTONE_TRAPDOOR);
        //emerald
        bsmg.registerDoor(ModBlocks.EMERALD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.EMERALD_TRAPDOOR);
        //lapis
        bsmg.registerDoor(ModBlocks.LAPIS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LAPIS_TRAPDOOR);
        //diamond
        bsmg.registerDoor(ModBlocks.DIAMOND_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DIAMOND_TRAPDOOR);
        //netherite
        bsmg.registerDoor(ModBlocks.NETHERITE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.NETHERITE_TRAPDOOR);
        //quartz
        bsmg.registerDoor(ModBlocks.QUARTZ_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.QUARTZ_TRAPDOOR);
        //quartz brick
        bsmg.registerDoor(ModBlocks.QUARTZ_BRICK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.QUARTZ_BRICK_TRAPDOOR);
        //smooth quartz
        bsmg.registerDoor(ModBlocks.SMOOTH_QUARTZ_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SMOOTH_QUARTZ_TRAPDOOR);
        //amethyst
        bsmg.registerDoor(ModBlocks.AMETHYST_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.AMETHYST_TRAPDOOR);
        //copper
        bsmg.registerDoor(ModBlocks.COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.COPPER_TRAPDOOR);
        //exposed_copper
        bsmg.registerDoor(ModBlocks.EXPOSED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        //weathered_copper
        bsmg.registerDoor(ModBlocks.WEATHERED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        //oxidized_copper
        bsmg.registerDoor(ModBlocks.OXIDIZED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
        //cut copper
        bsmg.registerDoor(ModBlocks.CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CUT_COPPER_TRAPDOOR);
        //cut exposed_copper
        bsmg.registerDoor(ModBlocks.EXPOSED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR);
        //cut weathered_copper
        bsmg.registerDoor(ModBlocks.WEATHERED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR);
        //cut oxidized_copper
        bsmg.registerDoor(ModBlocks.OXIDIZED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR);
        //waxed copper
        bsmg.registerDoor(ModBlocks.WAXED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_COPPER_TRAPDOOR);
        //waxed exposed_copper
        bsmg.registerDoor(ModBlocks.WAXED_EXPOSED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        //waxed weathered_copper
        bsmg.registerDoor(ModBlocks.WAXED_WEATHERED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        //waxed oxidized_copper
        bsmg.registerDoor(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
        //waxed cut copper
        bsmg.registerDoor(ModBlocks.WAXED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_CUT_COPPER_TRAPDOOR);
        //waxed cut exposed_copper
        bsmg.registerDoor(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
        //waxed cut weathered_copper
        bsmg.registerDoor(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
        //waxed cut oxidized_copper
        bsmg.registerDoor(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
        //white wool
        bsmg.registerDoor(ModBlocks.WHITE_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WHITE_WOOL_TRAPDOOR);
        //light_gray_wool
        bsmg.registerDoor(ModBlocks.LIGHT_GRAY_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_WOOL_TRAPDOOR);
        //gray_wool
        bsmg.registerDoor(ModBlocks.GRAY_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAY_WOOL_TRAPDOOR);
        //black_wool
        bsmg.registerDoor(ModBlocks.BLACK_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACK_WOOL_TRAPDOOR);
        //brown_wool
        bsmg.registerDoor(ModBlocks.BROWN_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_WOOL_TRAPDOOR);
        //red_wool
        bsmg.registerDoor(ModBlocks.RED_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_WOOL_TRAPDOOR);
        //orange_wool
        bsmg.registerDoor(ModBlocks.ORANGE_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ORANGE_WOOL_TRAPDOOR);
        //yellow_wool
        bsmg.registerDoor(ModBlocks.YELLOW_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.YELLOW_WOOL_TRAPDOOR);
        //lime_wool
        bsmg.registerDoor(ModBlocks.LIME_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIME_WOOL_TRAPDOOR);
        //green_wool
        bsmg.registerDoor(ModBlocks.GREEN_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GREEN_WOOL_TRAPDOOR);
        //cyan_wool
        bsmg.registerDoor(ModBlocks.CYAN_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CYAN_WOOL_TRAPDOOR);
        //blue_wool
        bsmg.registerDoor(ModBlocks.BLUE_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_WOOL_TRAPDOOR);
        //light_blue_wool
        bsmg.registerDoor(ModBlocks.LIGHT_BLUE_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_WOOL_TRAPDOOR);
        //purple_wool
        bsmg.registerDoor(ModBlocks.PURPLE_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPLE_WOOL_TRAPDOOR);
        //magenta_wool
        bsmg.registerDoor(ModBlocks.MAGENTA_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGENTA_WOOL_TRAPDOOR);
        //pink_wool
        bsmg.registerDoor(ModBlocks.PINK_WOOL_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PINK_WOOL_TRAPDOOR);
        //terracotta
        bsmg.registerDoor(ModBlocks.TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.TERRACOTTA_TRAPDOOR);
        //white terracotta
        bsmg.registerDoor(ModBlocks.WHITE_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WHITE_TERRACOTTA_TRAPDOOR);
        //light_gray_terracotta
        bsmg.registerDoor(ModBlocks.LIGHT_GRAY_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRAPDOOR);
        //gray_terracotta
        bsmg.registerDoor(ModBlocks.GRAY_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAY_TERRACOTTA_TRAPDOOR);
        //black_terracotta
        bsmg.registerDoor(ModBlocks.BLACK_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACK_TERRACOTTA_TRAPDOOR);
        //brown_terracotta
        bsmg.registerDoor(ModBlocks.BROWN_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_TERRACOTTA_TRAPDOOR);
        //red_terracotta
        bsmg.registerDoor(ModBlocks.RED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_TERRACOTTA_TRAPDOOR);
        //orange_terracotta
        bsmg.registerDoor(ModBlocks.ORANGE_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ORANGE_TERRACOTTA_TRAPDOOR);
        //yellow_terracotta
        bsmg.registerDoor(ModBlocks.YELLOW_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.YELLOW_TERRACOTTA_TRAPDOOR);
        //lime_terracotta
        bsmg.registerDoor(ModBlocks.LIME_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIME_TERRACOTTA_TRAPDOOR);
        //green_terracotta
        bsmg.registerDoor(ModBlocks.GREEN_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GREEN_TERRACOTTA_TRAPDOOR);
        //cyan_terracotta
        bsmg.registerDoor(ModBlocks.CYAN_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CYAN_TERRACOTTA_TRAPDOOR);
        //blue_terracotta
        bsmg.registerDoor(ModBlocks.BLUE_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_TERRACOTTA_TRAPDOOR);
        //light_blue_terracotta
        bsmg.registerDoor(ModBlocks.LIGHT_BLUE_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRAPDOOR);
        //purple_terracotta
        bsmg.registerDoor(ModBlocks.PURPLE_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPLE_TERRACOTTA_TRAPDOOR);
        //magenta_terracotta
        bsmg.registerDoor(ModBlocks.MAGENTA_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGENTA_TERRACOTTA_TRAPDOOR);
        //pink_terracotta
        bsmg.registerDoor(ModBlocks.PINK_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PINK_TERRACOTTA_TRAPDOOR);
        //white concrete
        bsmg.registerDoor(ModBlocks.WHITE_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WHITE_CONCRETE_TRAPDOOR);
        //light_gray_concrete
        bsmg.registerDoor(ModBlocks.LIGHT_GRAY_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR);
        //gray_concrete
        bsmg.registerDoor(ModBlocks.GRAY_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAY_CONCRETE_TRAPDOOR);
        //black_concrete
        bsmg.registerDoor(ModBlocks.BLACK_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACK_CONCRETE_TRAPDOOR);
        //brown_concrete
        bsmg.registerDoor(ModBlocks.BROWN_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_CONCRETE_TRAPDOOR);
        //red_concrete
        bsmg.registerDoor(ModBlocks.RED_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_CONCRETE_TRAPDOOR);
        //orange_concrete
        bsmg.registerDoor(ModBlocks.ORANGE_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ORANGE_CONCRETE_TRAPDOOR);
        //yellow_concrete
        bsmg.registerDoor(ModBlocks.YELLOW_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.YELLOW_CONCRETE_TRAPDOOR);
        //lime_concrete
        bsmg.registerDoor(ModBlocks.LIME_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIME_CONCRETE_TRAPDOOR);
        //green_concrete
        bsmg.registerDoor(ModBlocks.GREEN_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GREEN_CONCRETE_TRAPDOOR);
        //cyan_concrete
        bsmg.registerDoor(ModBlocks.CYAN_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CYAN_CONCRETE_TRAPDOOR);
        //blue_concrete
        bsmg.registerDoor(ModBlocks.BLUE_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_CONCRETE_TRAPDOOR);
        //light_blue_concrete
        bsmg.registerDoor(ModBlocks.LIGHT_BLUE_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR);
        //purple_concrete
        bsmg.registerDoor(ModBlocks.PURPLE_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPLE_CONCRETE_TRAPDOOR);
        //magenta_concrete
        bsmg.registerDoor(ModBlocks.MAGENTA_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGENTA_CONCRETE_TRAPDOOR);
        //pink_concrete
        bsmg.registerDoor(ModBlocks.PINK_CONCRETE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PINK_CONCRETE_TRAPDOOR);
        //white_concrete_powder
        bsmg.registerDoor(ModBlocks.WHITE_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WHITE_CONCRETE_POWDER_TRAPDOOR);
        //light_gray_concrete_powder
        bsmg.registerDoor(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR);
        //gray_concrete_powder
        bsmg.registerDoor(ModBlocks.GRAY_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAY_CONCRETE_POWDER_TRAPDOOR);
        //black_concrete_powder
        bsmg.registerDoor(ModBlocks.BLACK_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACK_CONCRETE_POWDER_TRAPDOOR);
        //brown_concrete_powder
        bsmg.registerDoor(ModBlocks.BROWN_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_CONCRETE_POWDER_TRAPDOOR);
        //red_concrete_powder
        bsmg.registerDoor(ModBlocks.RED_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_CONCRETE_POWDER_TRAPDOOR);
        //orange_concrete_powder
        bsmg.registerDoor(ModBlocks.ORANGE_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ORANGE_CONCRETE_POWDER_TRAPDOOR);
        //yellow_concrete_powder
        bsmg.registerDoor(ModBlocks.YELLOW_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.YELLOW_CONCRETE_POWDER_TRAPDOOR);
        //lime_concrete_powder
        bsmg.registerDoor(ModBlocks.LIME_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIME_CONCRETE_POWDER_TRAPDOOR);
        //green_concrete_powder
        bsmg.registerDoor(ModBlocks.GREEN_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GREEN_CONCRETE_POWDER_TRAPDOOR);
        //cyan_concrete_powder
        bsmg.registerDoor(ModBlocks.CYAN_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CYAN_CONCRETE_POWDER_TRAPDOOR);
        //blue_concrete_powder
        bsmg.registerDoor(ModBlocks.BLUE_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_CONCRETE_POWDER_TRAPDOOR);
        //light_blue_concrete_powder
        bsmg.registerDoor(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR);
        //purple_concrete_powder
        bsmg.registerDoor(ModBlocks.PURPLE_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPLE_CONCRETE_POWDER_TRAPDOOR);
        //magenta_concrete_powder
        bsmg.registerDoor(ModBlocks.MAGENTA_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGENTA_CONCRETE_POWDER_TRAPDOOR);
        //pink_concrete_powder
        bsmg.registerDoor(ModBlocks.PINK_CONCRETE_POWDER_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PINK_CONCRETE_POWDER_TRAPDOOR);
        //white glazed_terracotta
        bsmg.registerDoor(ModBlocks.WHITE_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WHITE_GLAZED_TERRACOTTA_TRAPDOOR);
        //light_gray_glazed_terracotta
        bsmg.registerDoor(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
        //gray_glazed_terracotta
        bsmg.registerDoor(ModBlocks.GRAY_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAY_GLAZED_TERRACOTTA_TRAPDOOR);
        //black_glazed_terracotta
        bsmg.registerDoor(ModBlocks.BLACK_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACK_GLAZED_TERRACOTTA_TRAPDOOR);
        //brown_glazed_terracotta
        bsmg.registerDoor(ModBlocks.BROWN_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_GLAZED_TERRACOTTA_TRAPDOOR);
        //red_glazed_terracotta
        bsmg.registerDoor(ModBlocks.RED_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_GLAZED_TERRACOTTA_TRAPDOOR);
        //orange_glazed_terracotta
        bsmg.registerDoor(ModBlocks.ORANGE_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TRAPDOOR);
        //yellow_glazed_terracotta
        bsmg.registerDoor(ModBlocks.YELLOW_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TRAPDOOR);
        //lime_glazed_terracotta
        bsmg.registerDoor(ModBlocks.LIME_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIME_GLAZED_TERRACOTTA_TRAPDOOR);
        //green_glazed_terracotta
        bsmg.registerDoor(ModBlocks.GREEN_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GREEN_GLAZED_TERRACOTTA_TRAPDOOR);
        //cyan_glazed_terracotta
        bsmg.registerDoor(ModBlocks.CYAN_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CYAN_GLAZED_TERRACOTTA_TRAPDOOR);
        //blue_glazed_terracotta
        bsmg.registerDoor(ModBlocks.BLUE_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
        //light_blue_glazed_terracotta
        bsmg.registerDoor(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR);
        //purple_glazed_terracotta
        bsmg.registerDoor(ModBlocks.PURPLE_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TRAPDOOR);
        //magenta_glazed_terracotta
        bsmg.registerDoor(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR);
        //pink_glazed_terracotta
        bsmg.registerDoor(ModBlocks.PINK_GLAZED_TERRACOTTA_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PINK_GLAZED_TERRACOTTA_TRAPDOOR);
        //white_stained_glass
        bsmg.registerDoor(ModBlocks.WHITE_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WHITE_STAINED_GLASS_TRAPDOOR);
        //light_gray_stained_glass
        bsmg.registerDoor(ModBlocks.LIGHT_GRAY_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
        //gray_stained_glass
        bsmg.registerDoor(ModBlocks.GRAY_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAY_STAINED_GLASS_TRAPDOOR);
        //black_stained_glass
        bsmg.registerDoor(ModBlocks.BLACK_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLACK_STAINED_GLASS_TRAPDOOR);
        //brown_stained_glass
        bsmg.registerDoor(ModBlocks.BROWN_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_STAINED_GLASS_TRAPDOOR);
        //red_stained_glass
        bsmg.registerDoor(ModBlocks.RED_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_STAINED_GLASS_TRAPDOOR);
        //orange_stained_glass
        bsmg.registerDoor(ModBlocks.ORANGE_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ORANGE_STAINED_GLASS_TRAPDOOR);
        //yellow_stained_glass
        bsmg.registerDoor(ModBlocks.YELLOW_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.YELLOW_STAINED_GLASS_TRAPDOOR);
        //lime_stained_glass
        bsmg.registerDoor(ModBlocks.LIME_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIME_STAINED_GLASS_TRAPDOOR);
        //green_stained_glass
        bsmg.registerDoor(ModBlocks.GREEN_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.GREEN_STAINED_GLASS_TRAPDOOR);
        //cyan_stained_glass
        bsmg.registerDoor(ModBlocks.CYAN_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CYAN_STAINED_GLASS_TRAPDOOR);
        //blue_stained_glass
        bsmg.registerDoor(ModBlocks.BLUE_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_STAINED_GLASS_TRAPDOOR);
        //light_blue_stained_glass
        bsmg.registerDoor(ModBlocks.LIGHT_BLUE_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
        //purple_stained_glass
        bsmg.registerDoor(ModBlocks.PURPLE_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PURPLE_STAINED_GLASS_TRAPDOOR);
        //magenta_stained_glass
        bsmg.registerDoor(ModBlocks.MAGENTA_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGENTA_STAINED_GLASS_TRAPDOOR);
        //pink_stained_glass
        bsmg.registerDoor(ModBlocks.PINK_STAINED_GLASS_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.PINK_STAINED_GLASS_TRAPDOOR);

        //GRASS BLOCKS MADE MANUALLY

        //podzol
        bsmg.registerDoor(ModBlocks.PODZOL_DOOR);
        //dirt
        bsmg.registerDoor(ModBlocks.DIRT_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DIRT_TRAPDOOR);
        //mycelium
        bsmg.registerDoor(ModBlocks.MYCELIUM_DOOR);
        //dirt_path
        bsmg.registerDoor(ModBlocks.DIRT_PATH_DOOR);
        //coarse_dirt
        bsmg.registerOrientableTrapdoor(ModBlocks.COARSE_DIRT_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.COARSE_DIRT_DOOR);
        //rooted_dirt
        bsmg.registerOrientableTrapdoor(ModBlocks.ROOTED_DIRT_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.ROOTED_DIRT_DOOR);
        //farmland
        bsmg.registerDoor(ModBlocks.FARMLAND_DOOR);
        //mud
        bsmg.registerOrientableTrapdoor(ModBlocks.MUD_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.MUD_DOOR);
        //clay
        bsmg.registerOrientableTrapdoor(ModBlocks.CLAY_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.CLAY_DOOR);
        //sand
        bsmg.registerOrientableTrapdoor(ModBlocks.SAND_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SAND_DOOR);
        //gravel
        bsmg.registerOrientableTrapdoor(ModBlocks.GRAVEL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.GRAVEL_DOOR);
        //red_sand
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_SAND_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.RED_SAND_DOOR);
        //ice
        bsmg.registerOrientableTrapdoor(ModBlocks.ICE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.ICE_DOOR);
        //packed_ice
        bsmg.registerOrientableTrapdoor(ModBlocks.PACKED_ICE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.PACKED_ICE_DOOR);
        //blue_ice
        bsmg.registerOrientableTrapdoor(ModBlocks.BLUE_ICE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.BLUE_ICE_DOOR);
        //snow
        bsmg.registerOrientableTrapdoor(ModBlocks.SNOW_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SNOW_DOOR);
        //moss
        bsmg.registerOrientableTrapdoor(ModBlocks.MOSS_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.MOSS_DOOR);
        //calcite
        bsmg.registerOrientableTrapdoor(ModBlocks.CALCITE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.CALCITE_DOOR);
        //tuff
        bsmg.registerOrientableTrapdoor(ModBlocks.TUFF_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.TUFF_DOOR);
        //dripstone
        bsmg.registerOrientableTrapdoor(ModBlocks.DRIPSTONE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DRIPSTONE_DOOR);
        //magma
        bsmg.registerOrientableTrapdoor(ModBlocks.MAGMA_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.MAGMA_DOOR);
        //obsidian
        bsmg.registerOrientableTrapdoor(ModBlocks.OBSIDIAN_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.OBSIDIAN_DOOR);
        //crying_obsidian
        bsmg.registerOrientableTrapdoor(ModBlocks.CRYING_OBSIDIAN_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.CRYING_OBSIDIAN_DOOR);
        //crimson_nylium
        bsmg.registerDoor(ModBlocks.CRIMSON_NYLIUM_DOOR);
        //warped_nylium
        bsmg.registerDoor(ModBlocks.WARPED_NYLIUM_DOOR);
        //soul_sand
        bsmg.registerOrientableTrapdoor(ModBlocks.SOUL_SAND_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SOUL_SAND_DOOR);
        //soul_soil
        bsmg.registerOrientableTrapdoor(ModBlocks.SOUL_SOIL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SOUL_SOIL_DOOR);
        //bone
        bsmg.registerDoor(ModBlocks.BONE_DOOR);
        //coal_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.COAL_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.COAL_ORE_DOOR);
        //deepslate_coal_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_COAL_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_COAL_ORE_DOOR);
        //iron_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.IRON_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.IRON_ORE_DOOR);
        //deepslate_iron_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_IRON_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_IRON_ORE_DOOR);
        //copper_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.COPPER_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.COPPER_ORE_DOOR);
        //deepslate_copper_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_COPPER_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_COPPER_ORE_DOOR);
        //gold_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.GOLD_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.GOLD_ORE_DOOR);
        //deepslate_gold_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_GOLD_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_GOLD_ORE_DOOR);
        //redstone_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.REDSTONE_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.REDSTONE_ORE_DOOR);
        //deepslate_redstone_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_REDSTONE_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_REDSTONE_ORE_DOOR);
        //emerald_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.EMERALD_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.EMERALD_ORE_DOOR);
        //deepslate_emerald_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_EMERALD_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_EMERALD_ORE_DOOR);
        //lapis_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.LAPIS_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.LAPIS_ORE_DOOR);
        //deepslate_lapis_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_LAPIS_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_LAPIS_ORE_DOOR);
        //diamond_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DIAMOND_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DIAMOND_ORE_DOOR);
        //deepslate_diamond_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.DEEPSLATE_DIAMOND_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEEPSLATE_DIAMOND_ORE_DOOR);
        //nether_gold_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.NETHER_GOLD_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.NETHER_GOLD_ORE_DOOR);
        //nether_quartz_ore
        bsmg.registerOrientableTrapdoor(ModBlocks.NETHER_QUARTZ_ORE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.NETHER_QUARTZ_ORE_DOOR);
        //ancient_debris
        bsmg.registerDoor(ModBlocks.ANCIENT_DEBRIS_DOOR);
        //raw_iron
        bsmg.registerOrientableTrapdoor(ModBlocks.RAW_IRON_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.RAW_IRON_DOOR);
        //raw_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.RAW_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.RAW_COPPER_DOOR);
        //raw_gold
        bsmg.registerOrientableTrapdoor(ModBlocks.RAW_GOLD_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.RAW_GOLD_DOOR);
        //glowstone
        bsmg.registerOrientableTrapdoor(ModBlocks.GLOWSTONE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.GLOWSTONE_DOOR);
        //oak_leaves
        registerTI0Door(bsmg, ModBlocks.OAK_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.OAK_LEAVES_TRAPDOOR);
        //spruce_leaves
        registerTI0Door(bsmg, ModBlocks.SPRUCE_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.SPRUCE_LEAVES_TRAPDOOR);
        //birch_leaves
        registerTI0Door(bsmg, ModBlocks.BIRCH_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.BIRCH_LEAVES_TRAPDOOR);
        //jungle_leaves
        registerTI0Door(bsmg, ModBlocks.JUNGLE_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.JUNGLE_LEAVES_TRAPDOOR);
        //acacia_leaves
        registerTI0Door(bsmg, ModBlocks.ACACIA_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.ACACIA_LEAVES_TRAPDOOR);
        //dark_oak_leaves
        registerTI0Door(bsmg, ModBlocks.DARK_OAK_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.DARK_OAK_LEAVES_TRAPDOOR);
        //mangrove_leaves
        registerTI0Door(bsmg, ModBlocks.MANGROVE_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.MANGROVE_LEAVES_TRAPDOOR);
        //cherry_leaves
        bsmg.registerOrientableTrapdoor(ModBlocks.CHERRY_LEAVES_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.CHERRY_LEAVES_DOOR);
        //azalea_leaves
        bsmg.registerOrientableTrapdoor(ModBlocks.AZALEA_LEAVES_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.AZALEA_LEAVES_DOOR);
        //flowering_azalea_leaves
        bsmg.registerOrientableTrapdoor(ModBlocks.FLOWERING_AZALEA_LEAVES_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.FLOWERING_AZALEA_LEAVES_DOOR);
        //brown_mushroom
        bsmg.registerOrientableTrapdoor(ModBlocks.BROWN_MUSHROOM_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.BROWN_MUSHROOM_DOOR);
        //red_mushroom
        bsmg.registerOrientableTrapdoor(ModBlocks.RED_MUSHROOM_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.RED_MUSHROOM_DOOR);
        //nether_wart
        bsmg.registerOrientableTrapdoor(ModBlocks.NETHER_WART_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.NETHER_WART_DOOR);
        //warped_wart
        bsmg.registerOrientableTrapdoor(ModBlocks.WARPED_WART_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WARPED_WART_DOOR);




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
        itemModelGenerator.register(ModItems.DIAMOND_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_BIT, Models.GENERATED);

    }
}


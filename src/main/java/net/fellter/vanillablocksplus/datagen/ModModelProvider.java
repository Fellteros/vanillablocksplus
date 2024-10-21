package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.fellter.vanillablocksplus.item.ModItems;
import net.fellter.vanillablocksplus.util.ModTextureMap;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;

import static net.fellter.vanillablocksplus.util.ModBlockStateModelGenerator.*;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {


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
        //GRASS BLOCKS MADE MANUALLY
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
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.OAK_LOG), Blocks.OAK_WOOD)
                .button(ModBlocks.OAK_WOOD_BUTTON)
                .fence(ModBlocks.OAK_WOOD_FENCE)
                .fenceGate(ModBlocks.OAK_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.OAK_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.OAK_WOOD_SLAB)
                .stairs(ModBlocks.OAK_WOOD_STAIRS)
                .wall(ModBlocks.OAK_WOOD_WALL);
        //oak
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.OAK_LOG), Blocks.OAK_LOG)
                .button(ModBlocks2.OAK_LOG_BUTTON)
                .fence(ModBlocks2.OAK_LOG_FENCE)
                .fenceGate(ModBlocks2.OAK_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.OAK_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.OAK_LOG_SLAB)
                .stairs(ModBlocks2.OAK_LOG_STAIRS)
                .wall(ModBlocks2.OAK_LOG_WALL);
        //str oak
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_OAK_LOG), Blocks.STRIPPED_OAK_WOOD)
                .button(ModBlocks.STR_OAK_WOOD_BUTTON)
                .fence(ModBlocks.STR_OAK_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_OAK_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_OAK_WOOD_SLAB)
                .stairs(ModBlocks.STR_OAK_WOOD_STAIRS)
                .wall(ModBlocks.STR_OAK_WOOD_WALL);
        //str_oak
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_OAK_LOG), Blocks.STRIPPED_OAK_LOG)
                .button(ModBlocks2.STR_OAK_LOG_BUTTON)
                .fence(ModBlocks2.STR_OAK_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_OAK_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_OAK_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_OAK_LOG_SLAB)
                .stairs(ModBlocks2.STR_OAK_LOG_STAIRS)
                .wall(ModBlocks2.STR_OAK_LOG_WALL);
        //spruce
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.SPRUCE_LOG), Blocks.SPRUCE_WOOD)
                .button(ModBlocks.SPRUCE_WOOD_BUTTON)
                .fence(ModBlocks.SPRUCE_WOOD_FENCE)
                .fenceGate(ModBlocks.SPRUCE_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.SPRUCE_WOOD_SLAB)
                .stairs(ModBlocks.SPRUCE_WOOD_STAIRS)
                .wall(ModBlocks.SPRUCE_WOOD_WALL);
        //spruce
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.SPRUCE_LOG), Blocks.SPRUCE_LOG)
                .button(ModBlocks2.SPRUCE_LOG_BUTTON)
                .fence(ModBlocks2.SPRUCE_LOG_FENCE)
                .fenceGate(ModBlocks2.SPRUCE_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.SPRUCE_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.SPRUCE_LOG_SLAB)
                .stairs(ModBlocks2.SPRUCE_LOG_STAIRS)
                .wall(ModBlocks2.SPRUCE_LOG_WALL);
        //str spruce
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG), Blocks.STRIPPED_SPRUCE_WOOD)
                .button(ModBlocks.STR_SPRUCE_WOOD_BUTTON)
                .fence(ModBlocks.STR_SPRUCE_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_SPRUCE_WOOD_SLAB)
                .stairs(ModBlocks.STR_SPRUCE_WOOD_STAIRS)
                .wall(ModBlocks.STR_SPRUCE_WOOD_WALL);
        //str_spruce
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_SPRUCE_LOG), Blocks.STRIPPED_SPRUCE_LOG)
                .button(ModBlocks2.STR_SPRUCE_LOG_BUTTON)
                .fence(ModBlocks2.STR_SPRUCE_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_SPRUCE_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_SPRUCE_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_SPRUCE_LOG_SLAB)
                .stairs(ModBlocks2.STR_SPRUCE_LOG_STAIRS)
                .wall(ModBlocks2.STR_SPRUCE_LOG_WALL);
        //birch
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.BIRCH_LOG), Blocks.BIRCH_WOOD)
                .button(ModBlocks.BIRCH_WOOD_BUTTON)
                .fence(ModBlocks.BIRCH_WOOD_FENCE)
                .fenceGate(ModBlocks.BIRCH_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.BIRCH_WOOD_SLAB)
                .stairs(ModBlocks.BIRCH_WOOD_STAIRS)
                .wall(ModBlocks.BIRCH_WOOD_WALL);
        //birch
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.BIRCH_LOG), Blocks.BIRCH_LOG)
                .button(ModBlocks2.BIRCH_LOG_BUTTON)
                .fence(ModBlocks2.BIRCH_LOG_FENCE)
                .fenceGate(ModBlocks2.BIRCH_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.BIRCH_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.BIRCH_LOG_SLAB)
                .stairs(ModBlocks2.BIRCH_LOG_STAIRS)
                .wall(ModBlocks2.BIRCH_LOG_WALL);
        //str birch
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG), Blocks.STRIPPED_BIRCH_WOOD)
                .button(ModBlocks.STR_BIRCH_WOOD_BUTTON)
                .fence(ModBlocks.STR_BIRCH_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_BIRCH_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_BIRCH_WOOD_SLAB)
                .stairs(ModBlocks.STR_BIRCH_WOOD_STAIRS)
                .wall(ModBlocks.STR_BIRCH_WOOD_WALL);
        //str_birch
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BIRCH_LOG), Blocks.STRIPPED_BIRCH_LOG)
                .button(ModBlocks2.STR_BIRCH_LOG_BUTTON)
                .fence(ModBlocks2.STR_BIRCH_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_BIRCH_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_BIRCH_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_BIRCH_LOG_SLAB)
                .stairs(ModBlocks2.STR_BIRCH_LOG_STAIRS)
                .wall(ModBlocks2.STR_BIRCH_LOG_WALL);
        //jungle
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.JUNGLE_LOG), Blocks.JUNGLE_WOOD)
                .button(ModBlocks.JUNGLE_WOOD_BUTTON)
                .fence(ModBlocks.JUNGLE_WOOD_FENCE)
                .fenceGate(ModBlocks.JUNGLE_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.JUNGLE_WOOD_SLAB)
                .stairs(ModBlocks.JUNGLE_WOOD_STAIRS)
                .wall(ModBlocks.JUNGLE_WOOD_WALL);
        //jungle
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.JUNGLE_LOG), Blocks.JUNGLE_LOG)
                .button(ModBlocks2.JUNGLE_LOG_BUTTON)
                .fence(ModBlocks2.JUNGLE_LOG_FENCE)
                .fenceGate(ModBlocks2.JUNGLE_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.JUNGLE_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.JUNGLE_LOG_SLAB)
                .stairs(ModBlocks2.JUNGLE_LOG_STAIRS)
                .wall(ModBlocks2.JUNGLE_LOG_WALL);
        //str jungle
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG), Blocks.STRIPPED_JUNGLE_WOOD)
                .button(ModBlocks.STR_JUNGLE_WOOD_BUTTON)
                .fence(ModBlocks.STR_JUNGLE_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_JUNGLE_WOOD_SLAB)
                .stairs(ModBlocks.STR_JUNGLE_WOOD_STAIRS)
                .wall(ModBlocks.STR_JUNGLE_WOOD_WALL);
        //str_jungle
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_JUNGLE_LOG), Blocks.STRIPPED_JUNGLE_LOG)
                .button(ModBlocks2.STR_JUNGLE_LOG_BUTTON)
                .fence(ModBlocks2.STR_JUNGLE_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_JUNGLE_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_JUNGLE_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_JUNGLE_LOG_SLAB)
                .stairs(ModBlocks2.STR_JUNGLE_LOG_STAIRS)
                .wall(ModBlocks2.STR_JUNGLE_LOG_WALL);
        //acacia
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.ACACIA_LOG), Blocks.ACACIA_WOOD)
                .button(ModBlocks.ACACIA_WOOD_BUTTON)
                .fence(ModBlocks.ACACIA_WOOD_FENCE)
                .fenceGate(ModBlocks.ACACIA_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.ACACIA_WOOD_SLAB)
                .stairs(ModBlocks.ACACIA_WOOD_STAIRS)
                .wall(ModBlocks.ACACIA_WOOD_WALL);
        //acacia
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.ACACIA_LOG), Blocks.ACACIA_LOG)
                .button(ModBlocks2.ACACIA_LOG_BUTTON)
                .fence(ModBlocks2.ACACIA_LOG_FENCE)
                .fenceGate(ModBlocks2.ACACIA_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.ACACIA_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.ACACIA_LOG_SLAB)
                .stairs(ModBlocks2.ACACIA_LOG_STAIRS)
                .wall(ModBlocks2.ACACIA_LOG_WALL);
        //str acacia
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG), Blocks.STRIPPED_ACACIA_WOOD)
                .button(ModBlocks.STR_ACACIA_WOOD_BUTTON)
                .fence(ModBlocks.STR_ACACIA_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_ACACIA_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_ACACIA_WOOD_SLAB)
                .stairs(ModBlocks.STR_ACACIA_WOOD_STAIRS)
                .wall(ModBlocks.STR_ACACIA_WOOD_WALL);
        //str_acacia
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_ACACIA_LOG), Blocks.STRIPPED_ACACIA_LOG)
                .button(ModBlocks2.STR_ACACIA_LOG_BUTTON)
                .fence(ModBlocks2.STR_ACACIA_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_ACACIA_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_ACACIA_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_ACACIA_LOG_SLAB)
                .stairs(ModBlocks2.STR_ACACIA_LOG_STAIRS)
                .wall(ModBlocks2.STR_ACACIA_LOG_WALL);
        //dark oak
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.DARK_OAK_LOG), Blocks.DARK_OAK_WOOD)
                .button(ModBlocks.DARK_OAK_WOOD_BUTTON)
                .fence(ModBlocks.DARK_OAK_WOOD_FENCE)
                .fenceGate(ModBlocks.DARK_OAK_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.DARK_OAK_WOOD_SLAB)
                .stairs(ModBlocks.DARK_OAK_WOOD_STAIRS)
                .wall(ModBlocks.DARK_OAK_WOOD_WALL);
        //dark_oak
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.DARK_OAK_LOG), Blocks.DARK_OAK_LOG)
                .button(ModBlocks2.DARK_OAK_LOG_BUTTON)
                .fence(ModBlocks2.DARK_OAK_LOG_FENCE)
                .fenceGate(ModBlocks2.DARK_OAK_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.DARK_OAK_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.DARK_OAK_LOG_SLAB)
                .stairs(ModBlocks2.DARK_OAK_LOG_STAIRS)
                .wall(ModBlocks2.DARK_OAK_LOG_WALL);
        //str dark oak
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG), Blocks.STRIPPED_DARK_OAK_WOOD)
                .button(ModBlocks.STR_DARK_OAK_WOOD_BUTTON)
                .fence(ModBlocks.STR_DARK_OAK_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_DARK_OAK_WOOD_SLAB)
                .stairs(ModBlocks.STR_DARK_OAK_WOOD_STAIRS)
                .wall(ModBlocks.STR_DARK_OAK_WOOD_WALL);
        //str_dark_oak
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_DARK_OAK_LOG), Blocks.STRIPPED_DARK_OAK_LOG)
                .button(ModBlocks2.STR_DARK_OAK_LOG_BUTTON)
                .fence(ModBlocks2.STR_DARK_OAK_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_DARK_OAK_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_DARK_OAK_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_DARK_OAK_LOG_SLAB)
                .stairs(ModBlocks2.STR_DARK_OAK_LOG_STAIRS)
                .wall(ModBlocks2.STR_DARK_OAK_LOG_WALL);
        //mangrove
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.MANGROVE_LOG), Blocks.MANGROVE_WOOD)
                .button(ModBlocks.MANGROVE_WOOD_BUTTON)
                .fence(ModBlocks.MANGROVE_WOOD_FENCE)
                .fenceGate(ModBlocks.MANGROVE_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.MANGROVE_WOOD_SLAB)
                .stairs(ModBlocks.MANGROVE_WOOD_STAIRS)
                .wall(ModBlocks.MANGROVE_WOOD_WALL);
        //mangrove
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.MANGROVE_LOG), Blocks.MANGROVE_LOG)
                .button(ModBlocks2.MANGROVE_LOG_BUTTON)
                .fence(ModBlocks2.MANGROVE_LOG_FENCE)
                .fenceGate(ModBlocks2.MANGROVE_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.MANGROVE_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.MANGROVE_LOG_SLAB)
                .stairs(ModBlocks2.MANGROVE_LOG_STAIRS)
                .wall(ModBlocks2.MANGROVE_LOG_WALL);
        //str mangrove
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG), Blocks.STRIPPED_MANGROVE_WOOD)
                .button(ModBlocks.STR_MANGROVE_WOOD_BUTTON)
                .fence(ModBlocks.STR_MANGROVE_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_MANGROVE_WOOD_SLAB)
                .stairs(ModBlocks.STR_MANGROVE_WOOD_STAIRS)
                .wall(ModBlocks.STR_MANGROVE_WOOD_WALL);
        //str_mangrove
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_MANGROVE_LOG), Blocks.STRIPPED_MANGROVE_LOG)
                .button(ModBlocks2.STR_MANGROVE_LOG_BUTTON)
                .fence(ModBlocks2.STR_MANGROVE_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_MANGROVE_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_MANGROVE_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_MANGROVE_LOG_SLAB)
                .stairs(ModBlocks2.STR_MANGROVE_LOG_STAIRS)
                .wall(ModBlocks2.STR_MANGROVE_LOG_WALL);
        //cherry
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.CHERRY_LOG), Blocks.CHERRY_WOOD)
                .button(ModBlocks.CHERRY_WOOD_BUTTON)
                .fence(ModBlocks.CHERRY_WOOD_FENCE)
                .fenceGate(ModBlocks.CHERRY_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.CHERRY_WOOD_SLAB)
                .stairs(ModBlocks.CHERRY_WOOD_STAIRS)
                .wall(ModBlocks.CHERRY_WOOD_WALL);
        //cherry
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.CHERRY_LOG), Blocks.CHERRY_LOG)
                .button(ModBlocks2.CHERRY_LOG_BUTTON)
                .fence(ModBlocks2.CHERRY_LOG_FENCE)
                .fenceGate(ModBlocks2.CHERRY_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.CHERRY_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.CHERRY_LOG_SLAB)
                .stairs(ModBlocks2.CHERRY_LOG_STAIRS)
                .wall(ModBlocks2.CHERRY_LOG_WALL);
        //str cherry
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG), Blocks.STRIPPED_CHERRY_WOOD)
                .button(ModBlocks.STR_CHERRY_WOOD_BUTTON)
                .fence(ModBlocks.STR_CHERRY_WOOD_FENCE)
                .fenceGate(ModBlocks.STR_CHERRY_WOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE)
                .slab(ModBlocks.STR_CHERRY_WOOD_SLAB)
                .stairs(ModBlocks.STR_CHERRY_WOOD_STAIRS)
                .wall(ModBlocks.STR_CHERRY_WOOD_WALL);
        //str_cherry
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_CHERRY_LOG), Blocks.STRIPPED_CHERRY_LOG)
                .button(ModBlocks2.STR_CHERRY_LOG_BUTTON)
                .fence(ModBlocks2.STR_CHERRY_LOG_FENCE)
                .fenceGate(ModBlocks2.STR_CHERRY_LOG_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_CHERRY_LOG_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_CHERRY_LOG_SLAB)
                .stairs(ModBlocks2.STR_CHERRY_LOG_STAIRS)
                .wall(ModBlocks2.STR_CHERRY_LOG_WALL);
        //bamboo
        registerCustomButton(bsmg, ModBlocks.BAMBOO_BLOCK_BUTTON, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerCustomFence(bsmg, ModBlocks.BAMBOO_BLOCK_FENCE, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerCustomFenceGate(bsmg, ModBlocks.BAMBOO_BLOCK_FENCE_GATE, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerCustomPressurePlate(bsmg, ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerCustomSlab(bsmg, ModBlocks.BAMBOO_BLOCK_SLAB, Blocks.BAMBOO_BLOCK, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerCustomStairs(bsmg, ModBlocks.BAMBOO_BLOCK_STAIRS, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        registerCustomWall(bsmg, ModBlocks.BAMBOO_BLOCK_WALL, ModTextureMap.blockAndTopForEnds(Blocks.BAMBOO_BLOCK));
        //str_bamboo
        registerCustomButton(bsmg, ModBlocks.STR_BAMBOO_BLOCK_BUTTON, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerCustomFence(bsmg, ModBlocks.STR_BAMBOO_BLOCK_FENCE, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerCustomFenceGate(bsmg, ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerCustomPressurePlate(bsmg, ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerCustomSlab(bsmg, ModBlocks.STR_BAMBOO_BLOCK_SLAB, Blocks.STRIPPED_BAMBOO_BLOCK, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerCustomStairs(bsmg, ModBlocks.STR_BAMBOO_BLOCK_STAIRS, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        registerCustomWall(bsmg, ModBlocks.STR_BAMBOO_BLOCK_WALL, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_BAMBOO_BLOCK));
        //crimson hyphae
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.CRIMSON_STEM), Blocks.CRIMSON_HYPHAE)
                .button(ModBlocks.CRIMSON_HYPHAE_BUTTON)
                .fence(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .fenceGate(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE)
                .pressurePlate(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE)
                .slab(ModBlocks.CRIMSON_HYPHAE_SLAB)
                .stairs(ModBlocks.CRIMSON_HYPHAE_STAIRS)
                .wall(ModBlocks.CRIMSON_HYPHAE_WALL);
        //crimson
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.CRIMSON_STEM), Blocks.CRIMSON_STEM)
                .button(ModBlocks2.CRIMSON_STEM_BUTTON)
                .fence(ModBlocks2.CRIMSON_STEM_FENCE)
                .fenceGate(ModBlocks2.CRIMSON_STEM_FENCE_GATE)
                .pressurePlate(ModBlocks2.CRIMSON_STEM_PRESSURE_PLATE)
                .slab(ModBlocks2.CRIMSON_STEM_SLAB)
                .stairs(ModBlocks2.CRIMSON_STEM_STAIRS)
                .wall(ModBlocks2.CRIMSON_STEM_WALL);
        //str crimson hyphae
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM), Blocks.STRIPPED_CRIMSON_HYPHAE)
                .button(ModBlocks.STR_CRIMSON_HYPHAE_BUTTON)
                .fence(ModBlocks.STR_CRIMSON_HYPHAE_FENCE)
                .fenceGate(ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE)
                .slab(ModBlocks.STR_CRIMSON_HYPHAE_SLAB)
                .stairs(ModBlocks.STR_CRIMSON_HYPHAE_STAIRS)
                .wall(ModBlocks.STR_CRIMSON_HYPHAE_WALL);
        //str_crimson
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_CRIMSON_STEM), Blocks.STRIPPED_CRIMSON_STEM)
                .button(ModBlocks2.STR_CRIMSON_STEM_BUTTON)
                .fence(ModBlocks2.STR_CRIMSON_STEM_FENCE)
                .fenceGate(ModBlocks2.STR_CRIMSON_STEM_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_CRIMSON_STEM_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_CRIMSON_STEM_SLAB)
                .stairs(ModBlocks2.STR_CRIMSON_STEM_STAIRS)
                .wall(ModBlocks2.STR_CRIMSON_STEM_WALL);
        //warped hyphae
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.WARPED_STEM), Blocks.WARPED_HYPHAE)
                .button(ModBlocks.WARPED_HYPHAE_BUTTON)
                .fence(ModBlocks.WARPED_HYPHAE_FENCE)
                .fenceGate(ModBlocks.WARPED_HYPHAE_FENCE_GATE)
                .pressurePlate(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE)
                .slab(ModBlocks.WARPED_HYPHAE_SLAB)
                .stairs(ModBlocks.WARPED_HYPHAE_STAIRS)
                .wall(ModBlocks.WARPED_HYPHAE_WALL);
        //warped
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.WARPED_STEM), Blocks.WARPED_STEM)
                .button(ModBlocks2.WARPED_STEM_BUTTON)
                .fence(ModBlocks2.WARPED_STEM_FENCE)
                .fenceGate(ModBlocks2.WARPED_STEM_FENCE_GATE)
                .pressurePlate(ModBlocks2.WARPED_STEM_PRESSURE_PLATE)
                .slab(ModBlocks2.WARPED_STEM_SLAB)
                .stairs(ModBlocks2.WARPED_STEM_STAIRS)
                .wall(ModBlocks2.WARPED_STEM_WALL);
        //str warped hyphae
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.STRIPPED_WARPED_STEM), Blocks.STRIPPED_WARPED_HYPHAE)
                .button(ModBlocks.STR_WARPED_HYPHAE_BUTTON)
                .fence(ModBlocks.STR_WARPED_HYPHAE_FENCE)
                .fenceGate(ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE)
                .pressurePlate(ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE)
                .slab(ModBlocks.STR_WARPED_HYPHAE_SLAB)
                .stairs(ModBlocks.STR_WARPED_HYPHAE_STAIRS)
                .wall(ModBlocks.STR_WARPED_HYPHAE_WALL);
        //str_warped
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.STRIPPED_WARPED_STEM), Blocks.STRIPPED_WARPED_STEM)
                .button(ModBlocks2.STR_WARPED_STEM_BUTTON)
                .fence(ModBlocks2.STR_WARPED_STEM_FENCE)
                .fenceGate(ModBlocks2.STR_WARPED_STEM_FENCE_GATE)
                .pressurePlate(ModBlocks2.STR_WARPED_STEM_PRESSURE_PLATE)
                .slab(ModBlocks2.STR_WARPED_STEM_SLAB)
                .stairs(ModBlocks2.STR_WARPED_STEM_STAIRS)
                .wall(ModBlocks2.STR_WARPED_STEM_WALL);
        //stone
        bsmg.registerCubeAllModelTexturePool(Blocks.STONE)
            .fence(ModBlocks.STONE_FENCE)
            .fenceGate(ModBlocks.STONE_FENCE_GATE)
            .wall(ModBlocks.STONE_WALL);
        //cobblestone
        bsmg.registerCubeAllModelTexturePool(Blocks.COBBLESTONE)
            .fence(ModBlocks.COBBLESTONE_FENCE)
            .fenceGate(ModBlocks.COBBLESTONE_FENCE_GATE)
            .pressurePlate(ModBlocks.COBBLESTONE_PRESSURE_PLATE)
            .button(ModBlocks.COBBLESTONE_BUTTON);
        //mossy cobblestone
        bsmg.registerCubeAllModelTexturePool(Blocks.MOSSY_COBBLESTONE)
            .fence(ModBlocks.MOSSY_COBBLESTONE_FENCE)
            .fenceGate(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE)
            .button(ModBlocks.MOSSY_COBBLESTONE_BUTTON)
            .pressurePlate(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
        //smooth stone
        bsmg.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE)
            .button(ModBlocks.SMOOTH_STONE_BUTTON)
            .fence(ModBlocks.SMOOTH_STONE_FENCE)
            .fenceGate(ModBlocks.SMOOTH_STONE_FENCE_GATE)
            .pressurePlate(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE)
            .stairs(ModBlocks.SMOOTH_STONE_STAIRS)
            .wall(ModBlocks.SMOOTH_STONE_WALL);
        //stone bricks
        bsmg.registerCubeAllModelTexturePool(Blocks.STONE_BRICKS)
            .button(ModBlocks.STONE_BRICKS_BUTTON)
            .fence(ModBlocks.STONE_BRICKS_FENCE)
            .fenceGate(ModBlocks.STONE_BRICKS_FENCE_GATE)
            .pressurePlate(ModBlocks.STONE_BRICKS_PRESSURE_PLATE);
        //cracked stone bricks
        bsmg.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS)
            .button(ModBlocks.CRACKED_STONE_BRICKS_BUTTON)
            .wall(ModBlocks.CRACKED_STONE_BRICKS_WALL)
            .stairs(ModBlocks.CRACKED_STONE_BRICKS_STAIRS)
            .slab(ModBlocks.CRACKED_STONE_BRICKS_SLAB)
            .fence(ModBlocks.CRACKED_STONE_BRICKS_FENCE)
            .fenceGate(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE)
            .pressurePlate(ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE);
        //granite
        bsmg.registerCubeAllModelTexturePool(Blocks.GRANITE)
            .button(ModBlocks.GRANITE_BUTTON)
            .fence(ModBlocks.GRANITE_FENCE)
            .fenceGate(ModBlocks.GRANITE_FENCE_GATE)
            .pressurePlate(ModBlocks.GRANITE_PRESSURE_PLATE);
        //polished granite
        bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE)
            .button(ModBlocks.POLISHED_GRANITE_BUTTON)
            .wall(ModBlocks.POLISHED_GRANITE_WALL)
            .fence(ModBlocks.POLISHED_GRANITE_FENCE)
            .fenceGate(ModBlocks.POLISHED_GRANITE_FENCE_GATE)
            .pressurePlate(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        //diorite
        bsmg.registerCubeAllModelTexturePool(Blocks.DIORITE)
            .button(ModBlocks.DIORITE_BUTTON)
            .fence(ModBlocks.DIORITE_FENCE)
            .fenceGate(ModBlocks.DIORITE_FENCE_GATE)
            .pressurePlate(ModBlocks.DIORITE_PRESSURE_PLATE);
        //polished diorite
        bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE)
            .button(ModBlocks.POLISHED_DIORITE_BUTTON)
            .wall(ModBlocks.POLISHED_DIORITE_WALL)
            .fence(ModBlocks.POLISHED_DIORITE_FENCE)
            .fenceGate(ModBlocks.POLISHED_DIORITE_FENCE_GATE)
            .pressurePlate(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        //andesite
        bsmg.registerCubeAllModelTexturePool(Blocks.ANDESITE)
            .button(ModBlocks.ANDESITE_BUTTON)
            .fence(ModBlocks.ANDESITE_FENCE)
            .fenceGate(ModBlocks.ANDESITE_FENCE_GATE)
            .pressurePlate(ModBlocks.ANDESITE_PRESSURE_PLATE);
        //polished andesite
        bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE)
            .button(ModBlocks.POLISHED_ANDESITE_BUTTON)
            .wall(ModBlocks.POLISHED_ANDESITE_WALL)
            .fence(ModBlocks.POLISHED_ANDESITE_FENCE)
            .fenceGate(ModBlocks.POLISHED_ANDESITE_FENCE_GATE)
            .pressurePlate(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        //deepslate
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.DEEPSLATE), Blocks.DEEPSLATE)
                .button(ModBlocks.DEEPSLATE_BUTTON)
                .fence(ModBlocks.DEEPSLATE_FENCE)
                .fenceGate(ModBlocks.DEEPSLATE_FENCE_GATE)
                .pressurePlate(ModBlocks.DEEPSLATE_PRESSURE_PLATE)
                .slab(ModBlocks.DEEPSLATE_SLAB)
                .stairs(ModBlocks.DEEPSLATE_STAIRS)
                .wall(ModBlocks.DEEPSLATE_WALL);
        //cobbled deepslate
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.COBBLED_DEEPSLATE), Blocks.COBBLED_DEEPSLATE)
                .button(ModBlocks.COBBLED_DEEPSLATE_BUTTON)
                .fence(ModBlocks.COBBLED_DEEPSLATE_FENCE)
                .fenceGate(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE)
                .pressurePlate(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        //chiseled deepslate
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.CHISELED_DEEPSLATE), Blocks.CHISELED_DEEPSLATE)
                .button(ModBlocks.CHISELED_DEEPSLATE_BUTTON)
                .fence(ModBlocks.CHISELED_DEEPSLATE_FENCE)
                .fenceGate(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE)
                .pressurePlate(ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE)
                .slab(ModBlocks.CHISELED_DEEPSLATE_SLAB)
                .stairs(ModBlocks.CHISELED_DEEPSLATE_STAIRS)
                .wall(ModBlocks.CHISELED_DEEPSLATE_WALL);
        //polished deepslate
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.POLISHED_DEEPSLATE), Blocks.POLISHED_DEEPSLATE)
        .button(ModBlocks.POLISHED_DEEPSLATE_BUTTON)
        .fence(ModBlocks.POLISHED_DEEPSLATE_FENCE)
        .fenceGate(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE)
        .pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        //deepslate bricks
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.DEEPSLATE_BRICKS), Blocks.DEEPSLATE_BRICKS)
        .button(ModBlocks.DEEPSLATE_BRICKS_BUTTON)
        .fence(ModBlocks.DEEPSLATE_BRICKS_FENCE)
        .fenceGate(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE)
        .pressurePlate(ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE);
        //cracked deepslate bricks
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.CRACKED_DEEPSLATE_BRICKS), Blocks.CRACKED_DEEPSLATE_BRICKS)
        .button(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON)
        .wall(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL)
        .stairs(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS)
        .slab(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB)
        .fence(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE)
        .fenceGate(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE)
        .pressurePlate(ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE);
        //deepslate tiles
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.DEEPSLATE_TILES), Blocks.DEEPSLATE_TILES)
        .button(ModBlocks.DEEPSLATE_TILES_BUTTON)
        .fence(ModBlocks.DEEPSLATE_TILES_FENCE)
        .fenceGate(ModBlocks.DEEPSLATE_TILES_FENCE_GATE)
        .pressurePlate(ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE);
        //cracked deepslate tiles
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.CRACKED_DEEPSLATE_TILES), Blocks.CRACKED_DEEPSLATE_TILES)
        .button(ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON)
        .wall(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL)
        .stairs(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS)
        .slab(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB)
        .fence(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE)
        .fenceGate(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE)
        .pressurePlate(ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE);
        //brick
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.BRICKS), Blocks.BRICKS)
        .button(ModBlocks.BRICK_BUTTON)
        .fence(ModBlocks.BRICK_FENCE)
        .fenceGate(ModBlocks.BRICK_FENCE_GATE)
        .pressurePlate(ModBlocks.BRICK_PRESSURE_PLATE);
        //packed mud
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.PACKED_MUD), Blocks.PACKED_MUD)
        .button(ModBlocks.PACKED_MUD_BUTTON)
        .wall(ModBlocks.PACKED_MUD_WALL)
        .stairs(ModBlocks.PACKED_MUD_STAIRS)
        .slab(ModBlocks.PACKED_MUD_SLAB)
        .fence(ModBlocks.PACKED_MUD_FENCE)
        .fenceGate(ModBlocks.PACKED_MUD_FENCE_GATE)
        .pressurePlate(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
        //mud brick
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.MUD_BRICKS), Blocks.MUD_BRICKS)
        .button(ModBlocks.MUD_BRICK_BUTTON)
        .fence(ModBlocks.MUD_BRICK_FENCE)
        .fenceGate(ModBlocks.MUD_BRICK_FENCE_GATE)
        .pressurePlate(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
        //sandstone
        registerCustomButton(bsmg, ModBlocks.SANDSTONE_BUTTON, ModTextureMap.custom(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.SANDSTONE_FENCE, ModTextureMap.custom(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.SANDSTONE_FENCE_GATE, ModTextureMap.custom(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.SANDSTONE_PRESSURE_PLATE, ModTextureMap.custom(Blocks.SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_bottom"));
        //smooth sandstone
        registerModModelTexturePool(bsmg, ModTextureMap.allWithTop(Blocks.SANDSTONE), Blocks.SMOOTH_SANDSTONE)
        .button(ModBlocks.SMOOTH_SANDSTONE_BUTTON)
        .fence(ModBlocks.SMOOTH_SANDSTONE_FENCE)
        .fenceGate(ModBlocks.SMOOTH_SANDSTONE_FENCE_GATE)
        .pressurePlate(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE)
        .wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        //cut sandstone
        registerCustomStairs(bsmg, ModBlocks.CUT_SANDSTONE_STAIRS, ModTextureMap.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomButton(bsmg, ModBlocks.CUT_SANDSTONE_BUTTON, ModTextureMap.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.CUT_SANDSTONE_FENCE, ModTextureMap.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.CUT_SANDSTONE_FENCE_GATE, ModTextureMap.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE, ModTextureMap.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.CUT_SANDSTONE_WALL, ModTextureMap.custom(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE, "", "_top", "_top"));
        //red sandstone
        registerCustomButton(bsmg, ModBlocks.RED_SANDSTONE_BUTTON, ModTextureMap.custom(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.RED_SANDSTONE_FENCE, ModTextureMap.custom(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.RED_SANDSTONE_FENCE_GATE, ModTextureMap.custom(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.RED_SANDSTONE_PRESSURE_PLATE, ModTextureMap.custom(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_bottom"));
        //smooth red sandstone
        registerModModelTexturePool(bsmg, ModTextureMap.allWithTop(Blocks.RED_SANDSTONE), Blocks.SMOOTH_RED_SANDSTONE)
        .button(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON)
        .fence(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE)
        .fenceGate(ModBlocks.SMOOTH_RED_SANDSTONE_FENCE_GATE)
        .pressurePlate(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE)
        .wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        //cut red sandstone
        registerCustomStairs(bsmg, ModBlocks.CUT_RED_SANDSTONE_STAIRS, ModTextureMap.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomButton(bsmg, ModBlocks.CUT_RED_SANDSTONE_BUTTON, ModTextureMap.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.CUT_RED_SANDSTONE_FENCE, ModTextureMap.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.CUT_RED_SANDSTONE_FENCE_GATE, ModTextureMap.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE, ModTextureMap.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.CUT_RED_SANDSTONE_WALL, ModTextureMap.custom(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, "", "_top", "_top"));
        //sea lantern
        registerModModelTexturePool(bsmg, Blocks.SEA_LANTERN)
                .buttonAll(ModBlocks.SEA_LANTERN_BUTTON)
                .wallAll(ModBlocks.SEA_LANTERN_WALL)
                .stairsAll(ModBlocks.SEA_LANTERN_STAIRS)
                .slabAll(ModBlocks.SEA_LANTERN_SLAB)
                .fenceAll(ModBlocks.SEA_LANTERN_FENCE)
                .fenceGateAll(ModBlocks.SEA_LANTERN_FENCE_GATE)
                .pressurePlateAll(ModBlocks.SEA_LANTERN_PRESSURE_PLATE);
        //prismarine
        registerModModelTexturePool(bsmg, Blocks.PRISMARINE)
        .buttonAll(ModBlocks.PRISMARINE_BUTTON)
        .fenceAll(ModBlocks.PRISMARINE_FENCE)
        .fenceGateAll(ModBlocks.PRISMARINE_FENCE_GATE)
        .pressurePlateAll(ModBlocks.PRISMARINE_PRESSURE_PLATE);
        //prismarine brick
        registerModModelTexturePool(bsmg, Blocks.PRISMARINE_BRICKS)
        .buttonAll(ModBlocks.PRISMARINE_BRICK_BUTTON)
        .fenceAll(ModBlocks.PRISMARINE_BRICK_FENCE)
        .fenceGateAll(ModBlocks.PRISMARINE_BRICK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE)
        .wallAll(ModBlocks.PRISMARINE_BRICK_WALL);
        //dark prismarine
        registerModModelTexturePool(bsmg, Blocks.DARK_PRISMARINE)
        .buttonAll(ModBlocks.DARK_PRISMARINE_BUTTON)
        .fenceAll(ModBlocks.DARK_PRISMARINE_FENCE)
        .fenceGateAll(ModBlocks.DARK_PRISMARINE_FENCE_GATE)
        .pressurePlateAll(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE)
        .wallAll(ModBlocks.DARK_PRISMARINE_WALL);
        //netherrack
        registerModModelTexturePool(bsmg, Blocks.NETHERRACK)
        .buttonAll(ModBlocks.NETHERRACK_BUTTON)
        .wallAll(ModBlocks.NETHERRACK_WALL)
        .stairsAll(ModBlocks.NETHERRACK_STAIRS)
        .slabAll(ModBlocks.NETHERRACK_SLAB)
        .fenceAll(ModBlocks.NETHERRACK_FENCE)
        .fenceGateAll(ModBlocks.NETHERRACK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.NETHERRACK_PRESSURE_PLATE);
        //nether bricks
        registerModModelTexturePool(bsmg, Blocks.NETHER_BRICKS)
        .buttonAll(ModBlocks.NETHER_BRICK_BUTTON)
        .fenceGateAll(ModBlocks.NETHER_BRICK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
        //cracked nether bricks
        registerModModelTexturePool(bsmg, Blocks.CRACKED_NETHER_BRICKS)
        .buttonAll(ModBlocks.CRACKED_NETHER_BRICK_BUTTON)
        .wallAll(ModBlocks.CRACKED_NETHER_BRICK_WALL)
        .stairsAll(ModBlocks.CRACKED_NETHER_BRICK_STAIRS)
        .slabAll(ModBlocks.CRACKED_NETHER_BRICK_SLAB)
        .fenceAll(ModBlocks.CRACKED_NETHER_BRICK_FENCE)
        .fenceGateAll(ModBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
        //nether bricks
        registerModModelTexturePool(bsmg, Blocks.RED_NETHER_BRICKS)
        .buttonAll(ModBlocks.RED_NETHER_BRICK_BUTTON)
        .fenceAll(ModBlocks.RED_NETHER_BRICK_FENCE)
        .fenceGateAll(ModBlocks.RED_NETHER_BRICK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
        //basalt
        registerModModelTexturePool(bsmg, ModTextureMap.sideAndTopForEnds(Blocks.BASALT), Blocks.BASALT)
                .button(ModBlocks.BASALT_BUTTON)
                .wall(ModBlocks.BASALT_WALL)
                .stairs(ModBlocks.BASALT_STAIRS)
                .slab(ModBlocks.BASALT_SLAB)
                .fence(ModBlocks.BASALT_FENCE)
                .fenceGate(ModBlocks.BASALT_FENCE_GATE)
                .pressurePlate(ModBlocks.BASALT_PRESSURE_PLATE);
        //smooth basalt
        registerModModelTexturePool(bsmg, Blocks.SMOOTH_BASALT)
        .buttonAll(ModBlocks.SMOOTH_BASALT_BUTTON)
        .wallAll(ModBlocks.SMOOTH_BASALT_WALL)
        .stairsAll(ModBlocks.SMOOTH_BASALT_STAIRS)
        .slabAll(ModBlocks.SMOOTH_BASALT_SLAB)
        .fenceAll(ModBlocks.SMOOTH_BASALT_FENCE)
        .fenceGateAll(ModBlocks.SMOOTH_BASALT_FENCE_GATE)
        .pressurePlateAll(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
        //polished basalt
        registerModModelTexturePool(bsmg, ModTextureMap.sideAndTopForEnds(Blocks.POLISHED_BASALT), Blocks.POLISHED_BASALT)
                .button(ModBlocks.POLISHED_BASALT_BUTTON)
                .wall(ModBlocks.POLISHED_BASALT_WALL)
                .stairs(ModBlocks.POLISHED_BASALT_STAIRS)
                .slab(ModBlocks.POLISHED_BASALT_SLAB)
                .fence(ModBlocks.POLISHED_BASALT_FENCE)
                .fenceGate(ModBlocks.POLISHED_BASALT_FENCE_GATE)
                .pressurePlate(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE);
        //polished basalt
        registerModModelTexturePool(bsmg, ModTextureMap.blockAndTopForEnds(Blocks.BLACKSTONE), Blocks.BLACKSTONE)
                .button(ModBlocks.BLACKSTONE_BUTTON)
                .fence(ModBlocks.BLACKSTONE_FENCE)
                .fenceGate(ModBlocks.BLACKSTONE_FENCE_GATE)
                .pressurePlate(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        //gilded blackstone
        registerModModelTexturePool(bsmg, Blocks.GILDED_BLACKSTONE)
        .buttonAll(ModBlocks.GILDED_BLACKSTONE_BUTTON)
        .wallAll(ModBlocks.GILDED_BLACKSTONE_WALL)
        .slabAll(ModBlocks.GILDED_BLACKSTONE_SLAB)
        .stairsAll(ModBlocks.GILDED_BLACKSTONE_STAIRS)
        .fenceAll(ModBlocks.GILDED_BLACKSTONE_FENCE)
        .fenceGateAll(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE)
        .pressurePlateAll(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
        //polished blackstone
        registerModModelTexturePool(bsmg, Blocks.POLISHED_BLACKSTONE)
        .fenceAll(ModBlocks.POLISHED_BLACKSTONE_FENCE)
        .fenceGateAll(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE);
        //polished blackstone brick
        registerModModelTexturePool(bsmg, Blocks.POLISHED_BLACKSTONE_BRICKS)
        .buttonAll(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON)
        .fenceAll(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE)
        .fenceGateAll(ModBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        //cracked polished blackstone brick
        registerModModelTexturePool(bsmg, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
        .buttonAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON)
        .wallAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL)
        .slabAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB)
        .stairsAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)
        .fenceAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE)
        .fenceGateAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE)
        .pressurePlateAll(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
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
        registerCustomButton(bsmg, ModBlocks.QUARTZ_BUTTON, ModTextureMap.custom(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomWall(bsmg, ModBlocks.QUARTZ_WALL, ModTextureMap.custom(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.QUARTZ_FENCE, ModTextureMap.custom(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.QUARTZ_FENCE_GATE, ModTextureMap.custom(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.QUARTZ_PRESSURE_PLATE, ModTextureMap.custom(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, "_side", "_top", "_bottom"));
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
        registerModModelTexturePool(bsmg, Blocks.WHITE_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //light_gray_terracotta
        registerModModelTexturePool(bsmg, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //gray_terracotta
        registerModModelTexturePool(bsmg, Blocks.GRAY_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //black_terracotta
        registerModModelTexturePool(bsmg, Blocks.BLACK_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //brown_terracotta
        registerModModelTexturePool(bsmg, Blocks.BROWN_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //red_terracotta
        registerModModelTexturePool(bsmg, Blocks.RED_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.RED_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.RED_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.RED_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.RED_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //orange_terracotta
        registerModModelTexturePool(bsmg, Blocks.ORANGE_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //yellow_terracotta
        registerModModelTexturePool(bsmg, Blocks.YELLOW_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //lime_terracotta
        registerModModelTexturePool(bsmg, Blocks.LIME_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.LIME_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.LIME_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //green_terracotta
        registerModModelTexturePool(bsmg, Blocks.GREEN_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //cyan_terracotta
        registerModModelTexturePool(bsmg, Blocks.CYAN_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //blue_terracotta
        registerModModelTexturePool(bsmg, Blocks.BLUE_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //light_blue_terracotta
        registerModModelTexturePool(bsmg, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //purple_terracotta
        registerModModelTexturePool(bsmg, Blocks.PURPLE_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //magenta_terracotta
        registerModModelTexturePool(bsmg, Blocks.MAGENTA_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //pink_terracotta
        registerModModelTexturePool(bsmg, Blocks.PINK_GLAZED_TERRACOTTA)
        .buttonAll(ModBlocks.PINK_GLAZED_TERRACOTTA_BUTTON)
        .wallAll(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL)
        .slabAll(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
        .stairsAll(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS)
        .fenceAll(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE)
        .fenceGateAll(ModBlocks.PINK_GLAZED_TERRACOTTA_FENCE_GATE)
        .pressurePlateAll(ModBlocks.PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE);
        //white_stained_glass
        registerModModelTexturePool(bsmg, Blocks.WHITE_STAINED_GLASS)
                .button(ModBlocks.WHITE_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.WHITE_STAINED_GLASS_WALL)
                .slab(ModBlocks.WHITE_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.WHITE_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.WHITE_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE);
        //light_gray_stained_glass
        registerModModelTexturePool(bsmg, Blocks.LIGHT_GRAY_STAINED_GLASS)
                .button(ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL)
                .slab(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
        //gray_stained_glass
        registerModModelTexturePool(bsmg, Blocks.GRAY_STAINED_GLASS)
                .button(ModBlocks.GRAY_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.GRAY_STAINED_GLASS_WALL)
                .slab(ModBlocks.GRAY_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.GRAY_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.GRAY_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE);
        //black_stained_glass
        registerModModelTexturePool(bsmg, Blocks.BLACK_STAINED_GLASS)
                .button(ModBlocks.BLACK_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.BLACK_STAINED_GLASS_WALL)
                .slab(ModBlocks.BLACK_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.BLACK_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.BLACK_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE);
        //brown_stained_glass
        registerModModelTexturePool(bsmg, Blocks.BROWN_STAINED_GLASS)
                .button(ModBlocks.BROWN_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.BROWN_STAINED_GLASS_WALL)
                .slab(ModBlocks.BROWN_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.BROWN_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.BROWN_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE);
        //red_stained_glass
        registerModModelTexturePool(bsmg, Blocks.RED_STAINED_GLASS)
                .button(ModBlocks.RED_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.RED_STAINED_GLASS_WALL)
                .slab(ModBlocks.RED_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.RED_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.RED_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.RED_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE);
        //orange_terracotta
        registerModModelTexturePool(bsmg, Blocks.ORANGE_STAINED_GLASS)
                .button(ModBlocks.ORANGE_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.ORANGE_STAINED_GLASS_WALL)
                .slab(ModBlocks.ORANGE_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.ORANGE_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.ORANGE_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE);
        //yellow_terracotta
        registerModModelTexturePool(bsmg, Blocks.YELLOW_STAINED_GLASS)
                .button(ModBlocks.YELLOW_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.YELLOW_STAINED_GLASS_WALL)
                .slab(ModBlocks.YELLOW_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.YELLOW_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.YELLOW_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE);
        //lime_terracotta
        registerModModelTexturePool(bsmg, Blocks.LIME_STAINED_GLASS)
                .button(ModBlocks.LIME_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.LIME_STAINED_GLASS_WALL)
                .slab(ModBlocks.LIME_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.LIME_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.LIME_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE);
        //green_terracotta
        registerModModelTexturePool(bsmg, Blocks.GREEN_STAINED_GLASS)
                .button(ModBlocks.GREEN_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.GREEN_STAINED_GLASS_WALL)
                .slab(ModBlocks.GREEN_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.GREEN_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.GREEN_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE);
        //cyan_terracotta
        registerModModelTexturePool(bsmg, Blocks.CYAN_STAINED_GLASS)
                .button(ModBlocks.CYAN_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.CYAN_STAINED_GLASS_WALL)
                .slab(ModBlocks.CYAN_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.CYAN_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.CYAN_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE);
        //blue_terracotta
        registerModModelTexturePool(bsmg, Blocks.BLUE_STAINED_GLASS)
                .button(ModBlocks.BLUE_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.BLUE_STAINED_GLASS_WALL)
                .slab(ModBlocks.BLUE_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.BLUE_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.BLUE_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE);
        //light_blue_terracotta
        registerModModelTexturePool(bsmg, Blocks.LIGHT_BLUE_STAINED_GLASS)
                .button(ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL)
                .slab(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
        //purple_terracotta
        registerModModelTexturePool(bsmg, Blocks.PURPLE_STAINED_GLASS)
                .button(ModBlocks.PURPLE_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.PURPLE_STAINED_GLASS_WALL)
                .slab(ModBlocks.PURPLE_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.PURPLE_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.PURPLE_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE);
        //magenta_terracotta
        registerModModelTexturePool(bsmg, Blocks.MAGENTA_STAINED_GLASS)
                .button(ModBlocks.MAGENTA_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.MAGENTA_STAINED_GLASS_WALL)
                .slab(ModBlocks.MAGENTA_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.MAGENTA_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
        //pink_terracotta
        registerModModelTexturePool(bsmg, Blocks.PINK_STAINED_GLASS)
                .button(ModBlocks.PINK_STAINED_GLASS_BUTTON)
                .wall(ModBlocks.PINK_STAINED_GLASS_WALL)
                .slab(ModBlocks.PINK_STAINED_GLASS_SLAB)
                .stairs(ModBlocks.PINK_STAINED_GLASS_STAIRS)
                .fence(ModBlocks.PINK_STAINED_GLASS_FENCE)
                .fenceGate(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE)
                .pressurePlate(ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE);
        //GRASS BLOCKS MADE MANUALLY
        //dirt
        registerModModelTexturePool(bsmg, Blocks.DIRT)
                .button(ModBlocks.DIRT_BUTTON)
                .wall(ModBlocks.DIRT_WALL)
                .slab(ModBlocks.DIRT_SLAB)
                .stairs(ModBlocks.DIRT_STAIRS)
                .fence(ModBlocks.DIRT_FENCE)
                .fenceGate(ModBlocks.DIRT_FENCE_GATE)
                .pressurePlate(ModBlocks.DIRT_PRESSURE_PLATE);
        //podzol
        registerModModelTexturePool(bsmg, ModTextureMap.custom(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""), Blocks.PODZOL)
                .button(ModBlocks.PODZOL_BUTTON)
                .wall(ModBlocks.PODZOL_WALL)
                .slab(ModBlocks.PODZOL_SLAB)
                .stairs(ModBlocks.PODZOL_STAIRS)
                .fence(ModBlocks.PODZOL_FENCE)
                .fenceGate(ModBlocks.PODZOL_FENCE_GATE)
                .pressurePlate(ModBlocks.PODZOL_PRESSURE_PLATE);
        registerCustomOrTrapdoor(bsmg, ModBlocks.PODZOL_TRAPDOOR, ModTextureMap.custom(Blocks.PODZOL, Blocks.PODZOL, Blocks.DIRT, "_side", "_top", ""));
        //mycelium
        registerModModelTexturePool(bsmg, ModTextureMap.custom(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""), Blocks.MYCELIUM)
                .button(ModBlocks.MYCELIUM_BUTTON)
                .wall(ModBlocks.MYCELIUM_WALL)
                .slab(ModBlocks.MYCELIUM_SLAB)
                .stairs(ModBlocks.MYCELIUM_STAIRS)
                .fence(ModBlocks.MYCELIUM_FENCE)
                .fenceGate(ModBlocks.MYCELIUM_FENCE_GATE)
                .pressurePlate(ModBlocks.MYCELIUM_PRESSURE_PLATE);
        registerCustomOrTrapdoor(bsmg, ModBlocks.MYCELIUM_TRAPDOOR, ModTextureMap.custom(Blocks.MYCELIUM, Blocks.MYCELIUM, Blocks.DIRT, "_side", "_top", ""));
        //dirt_path
        registerModModelTexturePool(bsmg, ModTextureMap.custom(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""), Blocks.DIRT_PATH)
                .button(ModBlocks.DIRT_PATH_BUTTON)
                .wall(ModBlocks.DIRT_PATH_WALL)
                .slab(ModBlocks.DIRT_PATH_SLAB)
                .stairs(ModBlocks.DIRT_PATH_STAIRS)
                .fence(ModBlocks.DIRT_PATH_FENCE)
                .fenceGate(ModBlocks.DIRT_PATH_FENCE_GATE)
                .pressurePlate(ModBlocks.DIRT_PATH_PRESSURE_PLATE);
        registerCustomOrTrapdoor(bsmg, ModBlocks.DIRT_PATH_TRAPDOOR, ModTextureMap.custom(Blocks.DIRT_PATH, Blocks.DIRT_PATH, Blocks.DIRT, "_side", "_top", ""));
        //coarse_dirt
        registerModModelTexturePool(bsmg, TextureMap.all(Blocks.COARSE_DIRT), Blocks.COARSE_DIRT)
        .button(ModBlocks.COARSE_DIRT_BUTTON)
        .wall(ModBlocks.COARSE_DIRT_WALL)
        .slab(ModBlocks.COARSE_DIRT_SLAB)
        .stairs(ModBlocks.COARSE_DIRT_STAIRS)
        .fence(ModBlocks.COARSE_DIRT_FENCE)
        .fenceGate(ModBlocks.COARSE_DIRT_FENCE_GATE)
        .pressurePlate(ModBlocks.COARSE_DIRT_PRESSURE_PLATE);
        //farmland
        registerModModelTexturePool(bsmg, ModTextureMap.custom(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""), Blocks.FARMLAND)
                .button(ModBlocks.FARMLAND_BUTTON)
                .wall(ModBlocks.FARMLAND_WALL)
                .slab(ModBlocks.FARMLAND_SLAB)
                .stairs(ModBlocks.FARMLAND_STAIRS)
                .fence(ModBlocks.FARMLAND_FENCE)
                .fenceGate(ModBlocks.FARMLAND_FENCE_GATE)
                .pressurePlate(ModBlocks.FARMLAND_PRESSURE_PLATE);
        registerCustomOrTrapdoor(bsmg, ModBlocks.FARMLAND_TRAPDOOR, ModTextureMap.custom(Blocks.DIRT, Blocks.FARMLAND, Blocks.DIRT, "", "", ""));
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
        registerCustomButton(bsmg, ModBlocks.CRIMSON_NYLIUM_BUTTON, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomWall(bsmg, ModBlocks.CRIMSON_NYLIUM_WALL, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomSlab(bsmg, ModBlocks.CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomStairs(bsmg, ModBlocks.CRIMSON_NYLIUM_STAIRS, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFence(bsmg, ModBlocks.CRIMSON_NYLIUM_FENCE, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFenceGate(bsmg, ModBlocks.CRIMSON_NYLIUM_FENCE_GATE, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.CRIMSON_NYLIUM_PRESSURE_PLATE, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.CRIMSON_NYLIUM_TRAPDOOR, ModTextureMap.custom(Blocks.CRIMSON_NYLIUM, ModBlocks.CRIMSON_NYLIUM_TRAPDOOR, Blocks.NETHERRACK, "_side", "", ""));
        //warped_nylium
        registerCustomButton(bsmg, ModBlocks.WARPED_NYLIUM_BUTTON, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomWall(bsmg, ModBlocks.WARPED_NYLIUM_WALL, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomSlab(bsmg, ModBlocks.WARPED_NYLIUM_SLAB, Blocks.WARPED_NYLIUM, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomStairs(bsmg, ModBlocks.WARPED_NYLIUM_STAIRS, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFence(bsmg, ModBlocks.WARPED_NYLIUM_FENCE, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomFenceGate(bsmg, ModBlocks.WARPED_NYLIUM_FENCE_GATE, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomPressurePlate(bsmg, ModBlocks.WARPED_NYLIUM_PRESSURE_PLATE, ModTextureMap.custom(Blocks.WARPED_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.NETHERRACK, "_side", "", ""));
        registerCustomOrTrapdoor(bsmg, ModBlocks.WARPED_NYLIUM_TRAPDOOR, ModTextureMap.custom(Blocks.WARPED_NYLIUM, ModBlocks.WARPED_NYLIUM_TRAPDOOR, Blocks.NETHERRACK, "_side", "", ""));
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
        registerCustomButton(bsmg, ModBlocks.BONE_BUTTON, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.BONE_WALL, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.BONE_SLAB, Blocks.BONE_BLOCK, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.BONE_STAIRS, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.BONE_FENCE, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.BONE_FENCE_GATE, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.BONE_PRESSURE_PLATE, ModTextureMap.custom(Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, Blocks.BONE_BLOCK, "_side", "_top", "_top"));
        registerCustomOrTrapdoor(bsmg, ModBlocks.BONE_TRAPDOOR, ModTextureMap.custom(Blocks.BONE_BLOCK, ModBlocks.BONE_TRAPDOOR, ModBlocks.BONE_TRAPDOOR, "_side", "", ""));
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
        registerCustomButton(bsmg, ModBlocks.ANCIENT_DEBRIS_BUTTON, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomWall(bsmg, ModBlocks.ANCIENT_DEBRIS_WALL, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomSlab(bsmg, ModBlocks.ANCIENT_DEBRIS_SLAB, Blocks.ANCIENT_DEBRIS, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomStairs(bsmg, ModBlocks.ANCIENT_DEBRIS_STAIRS, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomFence(bsmg, ModBlocks.ANCIENT_DEBRIS_FENCE, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomFenceGate(bsmg, ModBlocks.ANCIENT_DEBRIS_FENCE_GATE, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomPressurePlate(bsmg, ModBlocks.ANCIENT_DEBRIS_PRESSURE_PLATE, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS, "_side", "_top", "_top"));
        registerCustomOrTrapdoor(bsmg, ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, ModTextureMap.custom(Blocks.ANCIENT_DEBRIS, ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, ModBlocks.ANCIENT_DEBRIS_TRAPDOOR, "_side", "", ""));
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
        //shroomlight
        bsmg.registerCubeAllModelTexturePool(Blocks.SHROOMLIGHT)
                .button(ModBlocks.SHROOMLIGHT_BUTTON)
                .wall(ModBlocks.SHROOMLIGHT_WALL)
                .slab(ModBlocks.SHROOMLIGHT_SLAB)
                .stairs(ModBlocks.SHROOMLIGHT_STAIRS)
                .fence(ModBlocks.SHROOMLIGHT_FENCE)
                .fenceGate(ModBlocks.SHROOMLIGHT_FENCE_GATE)
                .pressurePlate(ModBlocks.SHROOMLIGHT_PRESSURE_PLATE);
        //dried_kelp
        registerCustomButton(bsmg, ModBlocks.DRIED_KELP_BUTTON, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        registerCustomWall(bsmg, ModBlocks.DRIED_KELP_WALL, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        registerCustomSlab(bsmg, ModBlocks.DRIED_KELP_SLAB, Blocks.DRIED_KELP_BLOCK, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        registerCustomStairs(bsmg, ModBlocks.DRIED_KELP_STAIRS, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        registerCustomFence(bsmg, ModBlocks.DRIED_KELP_FENCE, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        registerCustomFenceGate(bsmg, ModBlocks.DRIED_KELP_FENCE_GATE, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        registerCustomPressurePlate(bsmg, ModBlocks.DRIED_KELP_PRESSURE_PLATE, ModTextureMap.custom(Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.DRIED_KELP_BLOCK, "_side", "_top", "_bottom"));
        //tube_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.TUBE_CORAL_BLOCK)
                .button(ModBlocks.TUBE_CORAL_BUTTON)
                .wall(ModBlocks.TUBE_CORAL_WALL)
                .slab(ModBlocks.TUBE_CORAL_SLAB)
                .stairs(ModBlocks.TUBE_CORAL_STAIRS)
                .fence(ModBlocks.TUBE_CORAL_FENCE)
                .fenceGate(ModBlocks.TUBE_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.TUBE_CORAL_PRESSURE_PLATE);
        //dead_tube_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.DEAD_TUBE_CORAL_BLOCK)
                .button(ModBlocks.DEAD_TUBE_CORAL_BUTTON)
                .wall(ModBlocks.DEAD_TUBE_CORAL_WALL)
                .slab(ModBlocks.DEAD_TUBE_CORAL_SLAB)
                .stairs(ModBlocks.DEAD_TUBE_CORAL_STAIRS)
                .fence(ModBlocks.DEAD_TUBE_CORAL_FENCE)
                .fenceGate(ModBlocks.DEAD_TUBE_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.DEAD_TUBE_CORAL_PRESSURE_PLATE);
        //brain_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.BRAIN_CORAL_BLOCK)
                .button(ModBlocks.BRAIN_CORAL_BUTTON)
                .wall(ModBlocks.BRAIN_CORAL_WALL)
                .slab(ModBlocks.BRAIN_CORAL_SLAB)
                .stairs(ModBlocks.BRAIN_CORAL_STAIRS)
                .fence(ModBlocks.BRAIN_CORAL_FENCE)
                .fenceGate(ModBlocks.BRAIN_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.BRAIN_CORAL_PRESSURE_PLATE);
        //dead_brain_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.DEAD_BRAIN_CORAL_BLOCK)
                .button(ModBlocks.DEAD_BRAIN_CORAL_BUTTON)
                .wall(ModBlocks.DEAD_BRAIN_CORAL_WALL)
                .slab(ModBlocks.DEAD_BRAIN_CORAL_SLAB)
                .stairs(ModBlocks.DEAD_BRAIN_CORAL_STAIRS)
                .fence(ModBlocks.DEAD_BRAIN_CORAL_FENCE)
                .fenceGate(ModBlocks.DEAD_BRAIN_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.DEAD_BRAIN_CORAL_PRESSURE_PLATE);
        //bubble_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.BUBBLE_CORAL_BLOCK)
                .button(ModBlocks.BUBBLE_CORAL_BUTTON)
                .wall(ModBlocks.BUBBLE_CORAL_WALL)
                .slab(ModBlocks.BUBBLE_CORAL_SLAB)
                .stairs(ModBlocks.BUBBLE_CORAL_STAIRS)
                .fence(ModBlocks.BUBBLE_CORAL_FENCE)
                .fenceGate(ModBlocks.BUBBLE_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.BUBBLE_CORAL_PRESSURE_PLATE);
        //dead_bubble_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.DEAD_BUBBLE_CORAL_BLOCK)
                .button(ModBlocks.DEAD_BUBBLE_CORAL_BUTTON)
                .wall(ModBlocks.DEAD_BUBBLE_CORAL_WALL)
                .slab(ModBlocks.DEAD_BUBBLE_CORAL_SLAB)
                .stairs(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS)
                .fence(ModBlocks.DEAD_BUBBLE_CORAL_FENCE)
                .fenceGate(ModBlocks.DEAD_BUBBLE_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.DEAD_BUBBLE_CORAL_PRESSURE_PLATE);
        //fire_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.FIRE_CORAL_BLOCK)
                .button(ModBlocks.FIRE_CORAL_BUTTON)
                .wall(ModBlocks.FIRE_CORAL_WALL)
                .slab(ModBlocks.FIRE_CORAL_SLAB)
                .stairs(ModBlocks.FIRE_CORAL_STAIRS)
                .fence(ModBlocks.FIRE_CORAL_FENCE)
                .fenceGate(ModBlocks.FIRE_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.FIRE_CORAL_PRESSURE_PLATE);
        //dead_fire_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.DEAD_FIRE_CORAL_BLOCK)
                .button(ModBlocks.DEAD_FIRE_CORAL_BUTTON)
                .wall(ModBlocks.DEAD_FIRE_CORAL_WALL)
                .slab(ModBlocks.DEAD_FIRE_CORAL_SLAB)
                .stairs(ModBlocks.DEAD_FIRE_CORAL_STAIRS)
                .fence(ModBlocks.DEAD_FIRE_CORAL_FENCE)
                .fenceGate(ModBlocks.DEAD_FIRE_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.DEAD_FIRE_CORAL_PRESSURE_PLATE);
        //horn_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.HORN_CORAL_BLOCK)
                .button(ModBlocks.HORN_CORAL_BUTTON)
                .wall(ModBlocks.HORN_CORAL_WALL)
                .slab(ModBlocks.HORN_CORAL_SLAB)
                .stairs(ModBlocks.HORN_CORAL_STAIRS)
                .fence(ModBlocks.HORN_CORAL_FENCE)
                .fenceGate(ModBlocks.HORN_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.HORN_CORAL_PRESSURE_PLATE);
        //dead_horn_coral_block
        bsmg.registerCubeAllModelTexturePool(Blocks.DEAD_HORN_CORAL_BLOCK)
                .button(ModBlocks.DEAD_HORN_CORAL_BUTTON)
                .wall(ModBlocks.DEAD_HORN_CORAL_WALL)
                .slab(ModBlocks.DEAD_HORN_CORAL_SLAB)
                .stairs(ModBlocks.DEAD_HORN_CORAL_STAIRS)
                .fence(ModBlocks.DEAD_HORN_CORAL_FENCE)
                .fenceGate(ModBlocks.DEAD_HORN_CORAL_FENCE_GATE)
                .pressurePlate(ModBlocks.DEAD_HORN_CORAL_PRESSURE_PLATE);
        //sponge_block
        bsmg.registerCubeAllModelTexturePool(Blocks.SPONGE)
                .button(ModBlocks.SPONGE_BUTTON)
                .wall(ModBlocks.SPONGE_WALL)
                .slab(ModBlocks.SPONGE_SLAB)
                .stairs(ModBlocks.SPONGE_STAIRS)
                .fence(ModBlocks.SPONGE_FENCE)
                .fenceGate(ModBlocks.SPONGE_FENCE_GATE)
                .pressurePlate(ModBlocks.SPONGE_PRESSURE_PLATE);
        //wet_sponge_block
        bsmg.registerCubeAllModelTexturePool(Blocks.WET_SPONGE)
                .button(ModBlocks.WET_SPONGE_BUTTON)
                .wall(ModBlocks.WET_SPONGE_WALL)
                .slab(ModBlocks.WET_SPONGE_SLAB)
                .stairs(ModBlocks.WET_SPONGE_STAIRS)
                .fence(ModBlocks.WET_SPONGE_FENCE)
                .fenceGate(ModBlocks.WET_SPONGE_FENCE_GATE)
                .pressurePlate(ModBlocks.WET_SPONGE_PRESSURE_PLATE);
        //melon
        registerCustomButton(bsmg, ModBlocks.MELON_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomWall(bsmg, ModBlocks.MELON_WALL, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomSlab(bsmg, ModBlocks.MELON_SLAB, Blocks.MELON, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomStairs(bsmg, ModBlocks.MELON_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomFence(bsmg, ModBlocks.MELON_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomFenceGate(bsmg, ModBlocks.MELON_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomPressurePlate(bsmg, ModBlocks.MELON_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.MELON));
        registerCustomOrTrapdoor(bsmg, ModBlocks.MELON_TRAPDOOR, ModTextureMap.custom(Blocks.MELON, ModBlocks.MELON_TRAPDOOR, ModBlocks.MELON_TRAPDOOR, "_side", "", ""));
        //pumpkin
        registerCustomButton(bsmg, ModBlocks.PUMPKIN_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomWall(bsmg, ModBlocks.PUMPKIN_WALL, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomSlab(bsmg, ModBlocks.PUMPKIN_SLAB, Blocks.PUMPKIN, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomStairs(bsmg, ModBlocks.PUMPKIN_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomFence(bsmg, ModBlocks.PUMPKIN_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomFenceGate(bsmg, ModBlocks.PUMPKIN_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomPressurePlate(bsmg, ModBlocks.PUMPKIN_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.PUMPKIN));
        registerCustomOrTrapdoor(bsmg, ModBlocks.PUMPKIN_TRAPDOOR, ModTextureMap.custom(Blocks.PUMPKIN, ModBlocks.PUMPKIN_TRAPDOOR, ModBlocks.PUMPKIN_TRAPDOOR, "_side", "", ""));
        //hay_block
        registerCustomButton(bsmg, ModBlocks.HAY_BLOCK_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomWall(bsmg, ModBlocks.HAY_BLOCK_WALL, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomSlab(bsmg, ModBlocks.HAY_BLOCK_SLAB, Blocks.HAY_BLOCK, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomStairs(bsmg, ModBlocks.HAY_BLOCK_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomFence(bsmg, ModBlocks.HAY_BLOCK_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomFenceGate(bsmg, ModBlocks.HAY_BLOCK_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomPressurePlate(bsmg, ModBlocks.HAY_BLOCK_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.HAY_BLOCK));
        registerCustomOrTrapdoor(bsmg, ModBlocks.HAY_BLOCK_TRAPDOOR, ModTextureMap.custom(Blocks.HAY_BLOCK, ModBlocks.HAY_BLOCK_TRAPDOOR, ModBlocks.HAY_BLOCK_TRAPDOOR, "_side", "", ""));
        //honeycomb
        bsmg.registerCubeAllModelTexturePool(Blocks.HONEYCOMB_BLOCK)
                .button(ModBlocks.HONEYCOMB_BUTTON)
                .wall(ModBlocks.HONEYCOMB_WALL)
                .slab(ModBlocks.HONEYCOMB_SLAB)
                .stairs(ModBlocks.HONEYCOMB_STAIRS)
                .fence(ModBlocks.HONEYCOMB_FENCE)
                .fenceGate(ModBlocks.HONEYCOMB_FENCE_GATE)
                .pressurePlate(ModBlocks.HONEYCOMB_PRESSURE_PLATE);
        //slime
        bsmg.registerCubeAllModelTexturePool(Blocks.SLIME_BLOCK)
                .button(ModBlocks.SLIME_BUTTON)
                .wall(ModBlocks.SLIME_WALL)
                .slab(ModBlocks.SLIME_SLAB)
                .stairs(ModBlocks.SLIME_STAIRS)
                .fence(ModBlocks.SLIME_FENCE)
                .fenceGate(ModBlocks.SLIME_FENCE_GATE)
                .pressurePlate(ModBlocks.SLIME_PRESSURE_PLATE);
        //honey
        registerCustomButton(bsmg, ModBlocks.HONEY_BUTTON, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        registerCustomWall(bsmg, ModBlocks.HONEY_WALL, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        registerCustomSlab(bsmg, ModBlocks.HONEY_SLAB, Blocks.HONEY_BLOCK, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        registerCustomStairs(bsmg, ModBlocks.HONEY_STAIRS, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        registerCustomFence(bsmg, ModBlocks.HONEY_FENCE, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        registerCustomFenceGate(bsmg, ModBlocks.HONEY_FENCE_GATE, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        registerCustomPressurePlate(bsmg, ModBlocks.HONEY_PRESSURE_PLATE, TextureMap.sideTopBottom(Blocks.HONEY_BLOCK));
        //ochre_froglight
        registerCustomButton(bsmg, ModBlocks.OCHRE_FROGLIGHT_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomWall(bsmg, ModBlocks.OCHRE_FROGLIGHT_WALL, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomSlab(bsmg, ModBlocks.OCHRE_FROGLIGHT_SLAB, Blocks.OCHRE_FROGLIGHT, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomStairs(bsmg, ModBlocks.OCHRE_FROGLIGHT_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomFence(bsmg, ModBlocks.OCHRE_FROGLIGHT_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomFenceGate(bsmg, ModBlocks.OCHRE_FROGLIGHT_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomPressurePlate(bsmg, ModBlocks.OCHRE_FROGLIGHT_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.OCHRE_FROGLIGHT));
        registerCustomOrTrapdoor(bsmg, ModBlocks.OCHRE_FROGLIGHT_TRAPDOOR, ModTextureMap.custom(Blocks.OCHRE_FROGLIGHT, ModBlocks.OCHRE_FROGLIGHT_TRAPDOOR, ModBlocks.OCHRE_FROGLIGHT_TRAPDOOR, "_side", "", ""));
        //verdant_froglight
        registerCustomButton(bsmg, ModBlocks.VERDANT_FROGLIGHT_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomWall(bsmg, ModBlocks.VERDANT_FROGLIGHT_WALL, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomSlab(bsmg, ModBlocks.VERDANT_FROGLIGHT_SLAB, Blocks.VERDANT_FROGLIGHT, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomStairs(bsmg, ModBlocks.VERDANT_FROGLIGHT_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomFence(bsmg, ModBlocks.VERDANT_FROGLIGHT_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomFenceGate(bsmg, ModBlocks.VERDANT_FROGLIGHT_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomPressurePlate(bsmg, ModBlocks.VERDANT_FROGLIGHT_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.VERDANT_FROGLIGHT));
        registerCustomOrTrapdoor(bsmg, ModBlocks.VERDANT_FROGLIGHT_TRAPDOOR, ModTextureMap.custom(Blocks.VERDANT_FROGLIGHT, ModBlocks.VERDANT_FROGLIGHT_TRAPDOOR, ModBlocks.VERDANT_FROGLIGHT_TRAPDOOR, "_side", "", ""));
        //pearlescent_froglight
        registerCustomButton(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomWall(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_WALL, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomSlab(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomStairs(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomFence(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomFenceGate(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomPressurePlate(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.PEARLESCENT_FROGLIGHT));
        registerCustomOrTrapdoor(bsmg, ModBlocks.PEARLESCENT_FROGLIGHT_TRAPDOOR, ModTextureMap.custom(Blocks.PEARLESCENT_FROGLIGHT, ModBlocks.PEARLESCENT_FROGLIGHT_TRAPDOOR, ModBlocks.PEARLESCENT_FROGLIGHT_TRAPDOOR, "_side", "", ""));
        //sculk
        bsmg.registerCubeAllModelTexturePool(Blocks.SCULK)
                .button(ModBlocks.SCULK_BUTTON)
                .wall(ModBlocks.SCULK_WALL)
                .slab(ModBlocks.SCULK_SLAB)
                .stairs(ModBlocks.SCULK_STAIRS)
                .fence(ModBlocks.SCULK_FENCE)
                .fenceGate(ModBlocks.SCULK_FENCE_GATE)
                .pressurePlate(ModBlocks.SCULK_PRESSURE_PLATE);
        //bedrock
        bsmg.registerCubeAllModelTexturePool(Blocks.BEDROCK)
                .button(ModBlocks.BEDROCK_BUTTON)
                .wall(ModBlocks.BEDROCK_WALL)
                .slab(ModBlocks.BEDROCK_SLAB)
                .stairs(ModBlocks.BEDROCK_STAIRS)
                .fence(ModBlocks.BEDROCK_FENCE)
                .fenceGate(ModBlocks.BEDROCK_FENCE_GATE)
                .pressurePlate(ModBlocks.BEDROCK_PRESSURE_PLATE);
        //target
        registerCustomButton(bsmg, ModBlocks.TARGET_BUTTON, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomWall(bsmg, ModBlocks.TARGET_WALL, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomSlab(bsmg, ModBlocks.TARGET_SLAB, Blocks.TARGET, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomStairs(bsmg, ModBlocks.TARGET_STAIRS, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomFence(bsmg, ModBlocks.TARGET_FENCE, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomFenceGate(bsmg, ModBlocks.TARGET_FENCE_GATE, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomPressurePlate(bsmg, ModBlocks.TARGET_PRESSURE_PLATE, ModTextureMap.sideAndTopForEnds(Blocks.TARGET));
        registerCustomOrTrapdoor(bsmg, ModBlocks.TARGET_TRAPDOOR, ModTextureMap.custom(Blocks.TARGET, ModBlocks.TARGET_TRAPDOOR, ModBlocks.TARGET_TRAPDOOR, "_side", "", ""));
        //chiseled_copper
        bsmg.registerCubeAllModelTexturePool(Blocks.CHISELED_COPPER)
                .button(ModBlocks.CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.CHISELED_COPPER_WALL)
                .slab(ModBlocks.CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.CHISELED_COPPER_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.WAXED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.WAXED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.WAXED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.WAXED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.WAXED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_CHISELED_COPPER_PRESSURE_PLATE);
        //exposed_chiseled_copper
        bsmg.registerCubeAllModelTexturePool(Blocks.EXPOSED_CHISELED_COPPER)
                .button(ModBlocks.EXPOSED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.EXPOSED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.EXPOSED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.EXPOSED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.EXPOSED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
        //weathered_chiseled_copper
        bsmg.registerCubeAllModelTexturePool(Blocks.WEATHERED_CHISELED_COPPER)
                .button(ModBlocks.WEATHERED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.WEATHERED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.WEATHERED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.WEATHERED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.WEATHERED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
        //oxidized_chiseled_copper
        bsmg.registerCubeAllModelTexturePool(Blocks.OXIDIZED_CHISELED_COPPER)
                .button(ModBlocks.OXIDIZED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.OXIDIZED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.OXIDIZED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.OXIDIZED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.OXIDIZED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_BUTTON)
                .wall(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL)
                .slab(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB)
                .stairs(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS)
                .fence(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_FENCE)
                .fenceGate(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
        //copper_grate
        bsmg.registerCubeAllModelTexturePool(Blocks.COPPER_GRATE)
                .button(ModBlocks.COPPER_GRATE_BUTTON)
                .wall(ModBlocks.COPPER_GRATE_WALL)
                .slab(ModBlocks.COPPER_GRATE_SLAB)
                .stairs(ModBlocks.COPPER_GRATE_STAIRS)
                .fence(ModBlocks.COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.COPPER_GRATE_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.WAXED_COPPER_GRATE_WALL)
                .slab(ModBlocks.WAXED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.WAXED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.WAXED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.WAXED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_COPPER_GRATE_PRESSURE_PLATE);
        //exposed_copper_grate
        bsmg.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER_GRATE)
                .button(ModBlocks.EXPOSED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.EXPOSED_COPPER_GRATE_WALL)
                .slab(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.EXPOSED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.EXPOSED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.EXPOSED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.EXPOSED_COPPER_GRATE_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL)
                .slab(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
        //weathered_copper_grate
        bsmg.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER_GRATE)
                .button(ModBlocks.WEATHERED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.WEATHERED_COPPER_GRATE_WALL)
                .slab(ModBlocks.WEATHERED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.WEATHERED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.WEATHERED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.WEATHERED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.WEATHERED_COPPER_GRATE_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL)
                .slab(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
        //oxidized_copper_grate
        bsmg.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER_GRATE)
                .button(ModBlocks.OXIDIZED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.OXIDIZED_COPPER_GRATE_WALL)
                .slab(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.OXIDIZED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.OXIDIZED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.OXIDIZED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE)
                .button(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_BUTTON)
                .wall(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL)
                .slab(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB)
                .stairs(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS)
                .fence(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_FENCE)
                .fenceGate(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE)
                .pressurePlate(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
        //chiseled_tuff
        registerCustomButton(bsmg, ModBlocks2.CHISELED_TUFF_BUTTON, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        registerCustomWall(bsmg, ModBlocks2.CHISELED_TUFF_WALL, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        registerCustomSlab(bsmg, ModBlocks2.CHISELED_TUFF_SLAB, Blocks.CHISELED_TUFF, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        registerCustomStairs(bsmg, ModBlocks2.CHISELED_TUFF_STAIRS, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        registerCustomFence(bsmg, ModBlocks2.CHISELED_TUFF_FENCE, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        registerCustomFenceGate(bsmg, ModBlocks2.CHISELED_TUFF_FENCE_GATE, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        registerCustomPressurePlate(bsmg, ModBlocks2.CHISELED_TUFF_PRESSURE_PLATE, ModTextureMap.blockAndTopForEnds(Blocks.CHISELED_TUFF));
        //polished_tuff
        bsmg.registerCubeAllModelTexturePool(Blocks.POLISHED_TUFF)
                .button(ModBlocks2.POLISHED_TUFF_BUTTON)
                .fence(ModBlocks2.POLISHED_TUFF_FENCE)
                .fenceGate(ModBlocks2.POLISHED_TUFF_FENCE_GATE)
                .pressurePlate(ModBlocks2.POLISHED_TUFF_PRESSURE_PLATE);
        //tuff_bricks
        bsmg.registerCubeAllModelTexturePool(Blocks.TUFF_BRICKS)
                .button(ModBlocks2.TUFF_BRICKS_BUTTON)
                .fence(ModBlocks2.TUFF_BRICKS_FENCE)
                .fenceGate(ModBlocks2.TUFF_BRICKS_FENCE_GATE)
                .pressurePlate(ModBlocks2.TUFF_BRICKS_PRESSURE_PLATE);

        //plank_walls
        bsmg.registerCubeAllModelTexturePool(Blocks.OAK_PLANKS)
                .wall(ModBlocks.OAK_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.SPRUCE_PLANKS)
                .wall(ModBlocks.SPRUCE_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.BIRCH_PLANKS)
                .wall(ModBlocks.BIRCH_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.JUNGLE_PLANKS)
                .wall(ModBlocks.JUNGLE_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.ACACIA_PLANKS)
                .wall(ModBlocks.ACACIA_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.DARK_OAK_PLANKS)
                .wall(ModBlocks.DARK_OAK_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.MANGROVE_PLANKS)
                .wall(ModBlocks.MANGROVE_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.CHERRY_PLANKS)
                .wall(ModBlocks.CHERRY_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.BAMBOO_PLANKS)
                .wall(ModBlocks.BAMBOO_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.CRIMSON_PLANKS)
                .wall(ModBlocks.CRIMSON_WALL);
        bsmg.registerCubeAllModelTexturePool(Blocks.WARPED_PLANKS)
                .wall(ModBlocks.WARPED_WALL);


        //oak
        bsmg.registerDoor(ModBlocks.OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.OAK_WOOD_TRAPDOOR);
        //oak
        registerCustomDoor(bsmg, ModBlocks2.OAK_LOG_DOOR, Blocks.OAK_LOG, Blocks.OAK_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.OAK_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.OAK_LOG, ModBlocks2.OAK_LOG_TRAPDOOR, ModBlocks2.OAK_LOG_TRAPDOOR, "", "", ""));
        //str oak
        bsmg.registerDoor(ModBlocks.STR_OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_OAK_WOOD_TRAPDOOR);
        //oak
        registerCustomDoor(bsmg, ModBlocks2.STR_OAK_LOG_DOOR, Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_OAK_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_OAK_LOG, ModBlocks2.STR_OAK_LOG_TRAPDOOR, ModBlocks2.STR_OAK_LOG_TRAPDOOR, "", "", ""));
        //spruce
        bsmg.registerDoor(ModBlocks.SPRUCE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
        //spruce
        registerCustomDoor(bsmg, ModBlocks2.SPRUCE_LOG_DOOR, Blocks.SPRUCE_LOG, Blocks.SPRUCE_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.SPRUCE_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.SPRUCE_LOG, ModBlocks2.SPRUCE_LOG_TRAPDOOR, ModBlocks2.SPRUCE_LOG_TRAPDOOR, "", "", ""));
        //str spruce
        bsmg.registerDoor(ModBlocks.STR_SPRUCE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
        //spruce
        registerCustomDoor(bsmg, ModBlocks2.STR_SPRUCE_LOG_DOOR, Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_SPRUCE_LOG, ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR, ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR, "", "", ""));
        //birch
        bsmg.registerDoor(ModBlocks.BIRCH_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BIRCH_WOOD_TRAPDOOR);
        //birch
        registerCustomDoor(bsmg, ModBlocks2.BIRCH_LOG_DOOR, Blocks.BIRCH_LOG, Blocks.BIRCH_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.BIRCH_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.BIRCH_LOG, ModBlocks2.BIRCH_LOG_TRAPDOOR, ModBlocks2.BIRCH_LOG_TRAPDOOR, "", "", ""));
        //str birch
        bsmg.registerDoor(ModBlocks.STR_BIRCH_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
        //birch
        registerCustomDoor(bsmg, ModBlocks2.STR_BIRCH_LOG_DOOR, Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_BIRCH_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_BIRCH_LOG, ModBlocks2.STR_BIRCH_LOG_TRAPDOOR, ModBlocks2.STR_BIRCH_LOG_TRAPDOOR, "", "", ""));
        //jungle
        bsmg.registerDoor(ModBlocks.JUNGLE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
        //jungle
        registerCustomDoor(bsmg, ModBlocks2.JUNGLE_LOG_DOOR, Blocks.JUNGLE_LOG, Blocks.JUNGLE_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.JUNGLE_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.JUNGLE_LOG, ModBlocks2.JUNGLE_LOG_TRAPDOOR, ModBlocks2.JUNGLE_LOG_TRAPDOOR, "", "", ""));
        //str jungle
        bsmg.registerDoor(ModBlocks.STR_JUNGLE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
        //jungle
        registerCustomDoor(bsmg, ModBlocks2.STR_JUNGLE_LOG_DOOR, Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_JUNGLE_LOG, ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR, ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR, "", "", ""));
        //acacia
        bsmg.registerDoor(ModBlocks.ACACIA_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.ACACIA_WOOD_TRAPDOOR);
        //acacia
        registerCustomDoor(bsmg, ModBlocks2.ACACIA_LOG_DOOR, Blocks.ACACIA_LOG, Blocks.ACACIA_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.ACACIA_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.ACACIA_LOG, ModBlocks2.ACACIA_LOG_TRAPDOOR, ModBlocks2.ACACIA_LOG_TRAPDOOR, "", "", ""));
        //str acacia
        bsmg.registerDoor(ModBlocks.STR_ACACIA_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
        //acacia
        registerCustomDoor(bsmg, ModBlocks2.STR_ACACIA_LOG_DOOR, Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_ACACIA_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_ACACIA_LOG, ModBlocks2.STR_ACACIA_LOG_TRAPDOOR, ModBlocks2.STR_ACACIA_LOG_TRAPDOOR, "", "", ""));
        //dark oak
        bsmg.registerDoor(ModBlocks.DARK_OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
        //dark_oak
        registerCustomDoor(bsmg, ModBlocks2.DARK_OAK_LOG_DOOR, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.DARK_OAK_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.DARK_OAK_LOG, ModBlocks2.DARK_OAK_LOG_TRAPDOOR, ModBlocks2.DARK_OAK_LOG_TRAPDOOR, "", "", ""));
        //str dark oak
        bsmg.registerDoor(ModBlocks.STR_DARK_OAK_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
        //dark_oak
        registerCustomDoor(bsmg, ModBlocks2.STR_DARK_OAK_LOG_DOOR, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_DARK_OAK_LOG, ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR, ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR, "", "", ""));
        //mangrove
        bsmg.registerDoor(ModBlocks.MANGROVE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
        //mangrove
        registerCustomDoor(bsmg, ModBlocks2.MANGROVE_LOG_DOOR, Blocks.MANGROVE_LOG, Blocks.MANGROVE_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.MANGROVE_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.MANGROVE_LOG, ModBlocks2.MANGROVE_LOG_TRAPDOOR, ModBlocks2.MANGROVE_LOG_TRAPDOOR, "", "", ""));
        //str mangrove
        bsmg.registerDoor(ModBlocks.STR_MANGROVE_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
        //mangrove
        registerCustomDoor(bsmg, ModBlocks2.STR_MANGROVE_LOG_DOOR, Blocks.STRIPPED_MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_MANGROVE_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_MANGROVE_LOG, ModBlocks2.STR_MANGROVE_LOG_TRAPDOOR, ModBlocks2.STR_MANGROVE_LOG_TRAPDOOR, "", "", ""));
        //cherry
        bsmg.registerDoor(ModBlocks.CHERRY_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CHERRY_WOOD_TRAPDOOR);
        //cherry
        registerCustomDoor(bsmg, ModBlocks2.CHERRY_LOG_DOOR, Blocks.CHERRY_LOG, Blocks.CHERRY_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.CHERRY_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.CHERRY_LOG, ModBlocks2.CHERRY_LOG_TRAPDOOR, ModBlocks2.CHERRY_LOG_TRAPDOOR, "", "", ""));
        //str cherry
        bsmg.registerDoor(ModBlocks.STR_CHERRY_WOOD_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
        //cherry
        registerCustomDoor(bsmg, ModBlocks2.STR_CHERRY_LOG_DOOR, Blocks.STRIPPED_CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_CHERRY_LOG_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_CHERRY_LOG, ModBlocks2.STR_CHERRY_LOG_TRAPDOOR, ModBlocks2.STR_CHERRY_LOG_TRAPDOOR, "", "", ""));
        //bamboo
        bsmg.registerDoor(ModBlocks.BAMBOO_BLOCK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.BAMBOO_BLOCK_TRAPDOOR);
        //str bamboo
        bsmg.registerDoor(ModBlocks.STR_BAMBOO_BLOCK_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
        //crimson hyphae
        bsmg.registerDoor(ModBlocks.CRIMSON_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR);
        //crimson
        registerCustomDoor(bsmg, ModBlocks2.CRIMSON_STEM_DOOR, Blocks.CRIMSON_STEM, Blocks.CRIMSON_STEM, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.CRIMSON_STEM_TRAPDOOR, ModTextureMap.custom(Blocks.CRIMSON_STEM, ModBlocks2.CRIMSON_STEM_TRAPDOOR, ModBlocks2.CRIMSON_STEM_TRAPDOOR, "", "", ""));
        //str crimson hyphae
        bsmg.registerDoor(ModBlocks.STR_CRIMSON_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
        //crimson
        registerCustomDoor(bsmg, ModBlocks2.STR_CRIMSON_STEM_DOOR, Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_CRIMSON_STEM_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_CRIMSON_STEM, ModBlocks2.STR_CRIMSON_STEM_TRAPDOOR, ModBlocks2.STR_CRIMSON_STEM_TRAPDOOR, "", "", ""));
        //warped hyphae
        bsmg.registerDoor(ModBlocks.WARPED_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.WARPED_HYPHAE_TRAPDOOR);
        //warped
        registerCustomDoor(bsmg, ModBlocks2.WARPED_STEM_DOOR, Blocks.WARPED_STEM, Blocks.WARPED_STEM, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.WARPED_STEM_TRAPDOOR, ModTextureMap.custom(Blocks.WARPED_STEM, ModBlocks2.WARPED_STEM_TRAPDOOR, ModBlocks2.WARPED_STEM_TRAPDOOR, "", "", ""));
        //str warped hyphae
        bsmg.registerDoor(ModBlocks.STR_WARPED_HYPHAE_DOOR);
        bsmg.registerOrientableTrapdoor(ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
        //warped
        registerCustomDoor(bsmg, ModBlocks2.STR_WARPED_STEM_DOOR, Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_STEM, "_top", "_top");
        registerCustomOrTrapdoor(bsmg, ModBlocks2.STR_WARPED_STEM_TRAPDOOR, ModTextureMap.custom(Blocks.STRIPPED_WARPED_STEM, ModBlocks2.STR_WARPED_STEM_TRAPDOOR, ModBlocks2.STR_WARPED_STEM_TRAPDOOR, "", "", ""));
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
        registerCustomDoor(bsmg, ModBlocks.OAK_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.OAK_LEAVES_TRAPDOOR);
        //spruce_leaves
        registerCustomDoor(bsmg, ModBlocks.SPRUCE_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.SPRUCE_LEAVES_TRAPDOOR);
        //birch_leaves
        registerCustomDoor(bsmg, ModBlocks.BIRCH_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.BIRCH_LEAVES_TRAPDOOR);
        //jungle_leaves
        registerCustomDoor(bsmg, ModBlocks.JUNGLE_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.JUNGLE_LEAVES_TRAPDOOR);
        //acacia_leaves
        registerCustomDoor(bsmg, ModBlocks.ACACIA_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.ACACIA_LEAVES_TRAPDOOR);
        //dark_oak_leaves
        registerCustomDoor(bsmg, ModBlocks.DARK_OAK_LEAVES_DOOR);
        registerTI0OrTrapdoor(bsmg, ModBlocks.DARK_OAK_LEAVES_TRAPDOOR);
        //mangrove_leaves
        registerCustomDoor(bsmg, ModBlocks.MANGROVE_LEAVES_DOOR);
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
        //shroomlight
        bsmg.registerOrientableTrapdoor(ModBlocks.SHROOMLIGHT_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SHROOMLIGHT_DOOR);
        //dried_kelp
        bsmg.registerOrientableTrapdoor(ModBlocks.DRIED_KELP_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DRIED_KELP_DOOR);
        //tube_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.TUBE_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.TUBE_CORAL_DOOR);
        //dead_tube_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.DEAD_TUBE_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEAD_TUBE_CORAL_DOOR);
        //brain_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.BRAIN_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.BRAIN_CORAL_DOOR);
        //dead_brain_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.DEAD_BRAIN_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEAD_BRAIN_CORAL_DOOR);
        //bubble_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.BUBBLE_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.BUBBLE_CORAL_DOOR);
        //dead_bubble_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.DEAD_BUBBLE_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEAD_BUBBLE_CORAL_DOOR);
        //fire_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.FIRE_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.FIRE_CORAL_DOOR);
        //dead_fire_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.DEAD_FIRE_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEAD_FIRE_CORAL_DOOR);
        //horn_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.HORN_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.HORN_CORAL_DOOR);
        //dead_horn_coral_block
        bsmg.registerOrientableTrapdoor(ModBlocks.DEAD_HORN_CORAL_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.DEAD_HORN_CORAL_DOOR);
        //sponge_block
        bsmg.registerOrientableTrapdoor(ModBlocks.SPONGE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SPONGE_DOOR);
        //wet_sponge_block
        bsmg.registerOrientableTrapdoor(ModBlocks.WET_SPONGE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WET_SPONGE_DOOR);
        //melon_block
        bsmg.registerDoor(ModBlocks.MELON_DOOR);
        //pumpkin_block
        bsmg.registerDoor(ModBlocks.PUMPKIN_DOOR);
        //hay_block_block
        bsmg.registerDoor(ModBlocks.HAY_BLOCK_DOOR);
        //honeycomb_block
        bsmg.registerOrientableTrapdoor(ModBlocks.HONEYCOMB_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.HONEYCOMB_DOOR);
        //slime_block
        bsmg.registerOrientableTrapdoor(ModBlocks.SLIME_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SLIME_DOOR);
        //honey_block
        bsmg.registerOrientableTrapdoor(ModBlocks.HONEY_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.HONEY_DOOR);
        //ochre_froglight
        bsmg.registerDoor(ModBlocks.OCHRE_FROGLIGHT_DOOR);
        //verdant_froglight
        bsmg.registerDoor(ModBlocks.VERDANT_FROGLIGHT_DOOR);
        //pearlescent_froglight
        bsmg.registerDoor(ModBlocks.PEARLESCENT_FROGLIGHT_DOOR);
        //sculk
        bsmg.registerOrientableTrapdoor(ModBlocks.SCULK_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.SCULK_DOOR);
        //bedrock
        bsmg.registerOrientableTrapdoor(ModBlocks.BEDROCK_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.BEDROCK_DOOR);
        //target
        bsmg.registerDoor(ModBlocks.TARGET_DOOR);
        //chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.CHISELED_COPPER_DOOR);
        //exposed_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.EXPOSED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.EXPOSED_CHISELED_COPPER_DOOR);
        //weathered_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.WEATHERED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WEATHERED_CHISELED_COPPER_DOOR);
        //oxidized_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.OXIDIZED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.OXIDIZED_CHISELED_COPPER_DOOR);
        //copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.COPPER_GRATE_DOOR);
        //exposed_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.EXPOSED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.EXPOSED_COPPER_GRATE_DOOR);
        //weathered_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.WEATHERED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WEATHERED_COPPER_GRATE_DOOR);
        //oxidized_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.OXIDIZED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.OXIDIZED_COPPER_GRATE_DOOR);
        //waxed_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_CHISELED_COPPER_DOOR);
        //waxed_exposed_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_DOOR);
        //waxed_weathered_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_DOOR);
        //waxed_oxidized_chiseled_copper
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_DOOR);
        //waxed_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_COPPER_GRATE_DOOR);
        //waxed_exposed_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_EXPOSED_COPPER_GRATE_DOOR);
        //waxed_weathered_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_WEATHERED_COPPER_GRATE_DOOR);
        //waxed_oxidized_copper_grate
        bsmg.registerOrientableTrapdoor(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR);
        bsmg.registerDoor(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE_DOOR);
        //chiseled_tuff
        bsmg.registerOrientableTrapdoor(ModBlocks2.CHISELED_TUFF_TRAPDOOR);
        bsmg.registerDoor(ModBlocks2.CHISELED_TUFF_DOOR);
        //polished_tuff
        bsmg.registerOrientableTrapdoor(ModBlocks2.POLISHED_TUFF_TRAPDOOR);
        bsmg.registerDoor(ModBlocks2.POLISHED_TUFF_DOOR);
        //tuff_bricks
        bsmg.registerOrientableTrapdoor(ModBlocks2.TUFF_BRICKS_TRAPDOOR);
        bsmg.registerDoor(ModBlocks2.TUFF_BRICKS_DOOR);





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


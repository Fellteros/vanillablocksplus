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

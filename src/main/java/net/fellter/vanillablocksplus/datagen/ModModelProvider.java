package net.fellter.vanillablocksplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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





    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VBP_TITLE, Models.GENERATED);
    }
}

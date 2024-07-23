package net.fellter.vanillablocksplus.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModWoodType {
    public static WoodType registerModWoodTypes(String name, BlockSetType blockSetType, BlockSoundGroup blockSoundGroup) {
        return new WoodType(name, blockSetType, blockSoundGroup, BlockSoundGroup.HANGING_SIGN,
                SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    }

    public static final WoodType NETHERRACK = registerModWoodTypes("netherrack", ModBlockSetType.NETHERRACK, BlockSoundGroup.NETHERRACK);
    public static final WoodType STONE = registerModWoodTypes("stone", BlockSetType.STONE, BlockSoundGroup.STONE);
    public static final WoodType GRAVEL = registerModWoodTypes("gravel", ModBlockSetType.GRAVEL, BlockSoundGroup.GRAVEL);
    public static final WoodType GRASS = registerModWoodTypes("grass", ModBlockSetType.GRASS, BlockSoundGroup.GRASS);
    public static final WoodType GLASS = registerModWoodTypes("glass", ModBlockSetType.GLASS, BlockSoundGroup.GLASS);
    public static final WoodType WOOL = registerModWoodTypes("wool", ModBlockSetType.WOOL, BlockSoundGroup.WOOL);
    public static final WoodType SAND = registerModWoodTypes("sand", ModBlockSetType.SAND, BlockSoundGroup.SAND);
    public static final WoodType SNOW = registerModWoodTypes("snow", ModBlockSetType.SNOW, BlockSoundGroup.SNOW);
    public static final WoodType SLIME = registerModWoodTypes("slime", ModBlockSetType.SLIME, BlockSoundGroup.SLIME);
    public static final WoodType HONEY = registerModWoodTypes("honey", ModBlockSetType.HONEY, BlockSoundGroup.HONEY);
    public static final WoodType CORAL = registerModWoodTypes("coral", ModBlockSetType.CORAL, BlockSoundGroup.CORAL);
    public static final WoodType NYLIUM = registerModWoodTypes("nylium", ModBlockSetType.NYLIUM, BlockSoundGroup.NYLIUM);
    public static final WoodType FUNGUS = registerModWoodTypes("fungus", ModBlockSetType.FUNGUS, BlockSoundGroup.FUNGUS);
    public static final WoodType SHROOMLIGHT = registerModWoodTypes("shroomlight", ModBlockSetType.SHROOMLIGHT, BlockSoundGroup.SHROOMLIGHT);
    public static final WoodType SOUL_SAND = registerModWoodTypes("soul_sand", ModBlockSetType.SOUL_SAND, BlockSoundGroup.SOUL_SAND);
    public static final WoodType SOUL_SOIL = registerModWoodTypes("soul_soil", ModBlockSetType.SOUL_SOIL, BlockSoundGroup.SOUL_SOIL);
    public static final WoodType BASALT = registerModWoodTypes("basalt", ModBlockSetType.BASALT, BlockSoundGroup.BASALT);
    public static final WoodType NETHER_BRICKS = registerModWoodTypes("nether_bricks", ModBlockSetType.NETHER_BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static final WoodType NETHER_ORE = registerModWoodTypes("nether_ore", ModBlockSetType.NETHER_ORE, BlockSoundGroup.NETHER_ORE);
    public static final WoodType BONE = registerModWoodTypes("bone", ModBlockSetType.BONE, BlockSoundGroup.BONE);
    public static final WoodType NETHERITE = registerModWoodTypes("netherite", ModBlockSetType.NETHERITE, BlockSoundGroup.NETHERITE);
    public static final WoodType ANCIENT_DEBRIS = registerModWoodTypes("ancient_debris", ModBlockSetType.ANCIENT_DEBRIS, BlockSoundGroup.ANCIENT_DEBRIS);
    public static final WoodType NETHER_GOLD_ORE = registerModWoodTypes("nether_gold_ore", ModBlockSetType.NETHER_GOLD_ORE, BlockSoundGroup.NETHER_GOLD_ORE);
    public static final WoodType GILDED_BLACKSTONE = registerModWoodTypes("gilded_blackstone", ModBlockSetType.GILDED_BLACKSTONE, BlockSoundGroup.GILDED_BLACKSTONE);
    public static final WoodType AMETHYST_BLOCK = registerModWoodTypes("amethyst_block", ModBlockSetType.AMETHYST_BLOCK, BlockSoundGroup.AMETHYST_BLOCK);
    public static final WoodType TUFF = registerModWoodTypes("tuff", ModBlockSetType.TUFF, BlockSoundGroup.TUFF);
    public static final WoodType CALCITE = registerModWoodTypes("calcite", ModBlockSetType.CALCITE, BlockSoundGroup.CALCITE);
    public static final WoodType DRIPSTONE = registerModWoodTypes("dripstone", ModBlockSetType.DRIPSTONE, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final WoodType COPPER = registerModWoodTypes("copper", BlockSetType.COPPER, BlockSoundGroup.COPPER);
    public static final WoodType COPPER_GRATE = registerModWoodTypes("copper_grate", ModBlockSetType.COPPER_GRATE, BlockSoundGroup.COPPER_GRATE);
    public static final WoodType MOSS_BLOCK = registerModWoodTypes("moss", ModBlockSetType.MOSS_BLOCK, BlockSoundGroup.MOSS_BLOCK);
    public static final WoodType ROOTED_DIRT = registerModWoodTypes("rooted_dirt", ModBlockSetType.ROOTED_DIRT, BlockSoundGroup.ROOTED_DIRT);
    public static final WoodType AZALEA_LEAVES = registerModWoodTypes("azalea_leaves", ModBlockSetType.AZALEA_LEAVES, BlockSoundGroup.AZALEA_LEAVES);
    public static final WoodType SCULK_CATALYST = registerModWoodTypes("sculk_catalyst", ModBlockSetType.SCULK_CATALYST, BlockSoundGroup.SCULK_CATALYST);
    public static final WoodType SCULK = registerModWoodTypes("sculk", ModBlockSetType.SCULK, BlockSoundGroup.SCULK);
    public static final WoodType DEEPSLATE = registerModWoodTypes("deepslate", ModBlockSetType.DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final WoodType DEEPSLATE_BRICKS = registerModWoodTypes("deepslate_bricks", ModBlockSetType.DEEPSLATE_BRICKS, BlockSoundGroup.DEEPSLATE_BRICKS);
    public static final WoodType DEEPSLATE_TILES = registerModWoodTypes("deepslate_tiles", ModBlockSetType.DEEPSLATE_TILES, BlockSoundGroup.DEEPSLATE_TILES);
    public static final WoodType POLISHED_DEEPSLATE = registerModWoodTypes("polished_deepslate", ModBlockSetType.POLISHED_DEEPSLATE, BlockSoundGroup.POLISHED_DEEPSLATE);
    public static final WoodType FROGLIGHT = registerModWoodTypes("froglight", ModBlockSetType.FROGLIGHT, BlockSoundGroup.FROGLIGHT);
    public static final WoodType MANGROVE_ROOTS = registerModWoodTypes("mangrove_roots", ModBlockSetType.MANGROVE_ROOTS, BlockSoundGroup.MANGROVE_ROOTS);
    public static final WoodType MUDDY_MANGROVE_ROOTS = registerModWoodTypes("muddy_mangrove_roots", ModBlockSetType.MUDDY_MANGROVE_ROOTS, BlockSoundGroup.MUDDY_MANGROVE_ROOTS);
    public static final WoodType MUD = registerModWoodTypes("mud", ModBlockSetType.MUD, BlockSoundGroup.MUD);
    public static final WoodType MUD_BRICKS = registerModWoodTypes("mud_bricks", ModBlockSetType.MUD_BRICKS, BlockSoundGroup.MUD_BRICKS);
    public static final WoodType PACKED_MUD = registerModWoodTypes("packed_mud", ModBlockSetType.PACKED_MUD, BlockSoundGroup.PACKED_MUD);
    public static final WoodType BAMBOO_WOOD = registerModWoodTypes("bamboo_wood", ModBlockSetType.BAMBOO_WOOD, BlockSoundGroup.BAMBOO_WOOD);
    public static final WoodType NETHER_WOOD = registerModWoodTypes("nether_wood", ModBlockSetType.NETHER_WOOD, BlockSoundGroup.NETHER_WOOD);
    public static final WoodType CHERRY_WOOD = registerModWoodTypes("cherry_wood", ModBlockSetType.CHERRY_WOOD, BlockSoundGroup.CHERRY_WOOD);
    public static final WoodType CHERRY_LEAVES = registerModWoodTypes("cherry_leaves", ModBlockSetType.CHERRY_LEAVES, BlockSoundGroup.CHERRY_LEAVES);
    public static final WoodType WART_BLOCK = registerModWoodTypes("wart_block", ModBlockSetType.WART_BLOCK, BlockSoundGroup.WART_BLOCK);
    public static final WoodType WOOD = registerModWoodTypes("wood", ModBlockSetType.WOOD, BlockSoundGroup.WOOD);
    public static final WoodType SPONGE = registerModWoodTypes("sponge", ModBlockSetType.SPONGE, BlockSoundGroup.SPONGE);
    public static final WoodType WET_SPONGE = registerModWoodTypes("wet_sponge", ModBlockSetType.WET_SPONGE, BlockSoundGroup.WET_SPONGE);
}

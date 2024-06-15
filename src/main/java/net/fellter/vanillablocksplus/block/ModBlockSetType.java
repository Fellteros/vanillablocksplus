package net.fellter.vanillablocksplus.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModBlockSetType {

    public static BlockSetType registerModBlockSetType(String name, boolean canOpenByHand, BlockSoundGroup sounds) {
        return new BlockSetType(name, canOpenByHand, sounds, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN,
                SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON);
    }


    public static final BlockSetType NETHERRACK = registerModBlockSetType("netherrack", true, BlockSoundGroup.NETHERRACK);
    public static final BlockSetType GRAVEL = registerModBlockSetType("gravel", true, BlockSoundGroup.GRAVEL);
    public static final BlockSetType GRASS = registerModBlockSetType("grass", true, BlockSoundGroup.GRASS);
    public static final BlockSetType GLASS = registerModBlockSetType("glass", true, BlockSoundGroup.GLASS);
    public static final BlockSetType WOOL = registerModBlockSetType("wool", true, BlockSoundGroup.WOOL);
    public static final BlockSetType SAND = registerModBlockSetType("sand", true, BlockSoundGroup.SAND);
    public static final BlockSetType SNOW = registerModBlockSetType("snow", true, BlockSoundGroup.SNOW);
    public static final BlockSetType SLIME = registerModBlockSetType("slime", true, BlockSoundGroup.SLIME);
    public static final BlockSetType HONEY = registerModBlockSetType("honey", true, BlockSoundGroup.HONEY);
    public static final BlockSetType CORAL = registerModBlockSetType("coral", true, BlockSoundGroup.CORAL);
    public static final BlockSetType NYLIUM = registerModBlockSetType("nylium", true, BlockSoundGroup.NYLIUM);
    public static final BlockSetType FUNGUS = registerModBlockSetType("fungus", true, BlockSoundGroup.FUNGUS);
    public static final BlockSetType SHROOMLIGHT = registerModBlockSetType("shroomlight", true, BlockSoundGroup.SHROOMLIGHT);
    public static final BlockSetType SOUL_SAND = registerModBlockSetType("soul_sand", true, BlockSoundGroup.SOUL_SAND);
    public static final BlockSetType SOUL_SOIL = registerModBlockSetType("soul_soil", true, BlockSoundGroup.SOUL_SOIL);
    public static final BlockSetType BASALT = registerModBlockSetType("basalt", true, BlockSoundGroup.BASALT);
    public static final BlockSetType NETHER_BRICKS = registerModBlockSetType("nether_bricks", true, BlockSoundGroup.NETHER_BRICKS);
    public static final BlockSetType NETHER_ORE = registerModBlockSetType("nether_ore", true, BlockSoundGroup.NETHER_ORE);
    public static final BlockSetType BONE = registerModBlockSetType("bone", true, BlockSoundGroup.BONE);
    public static final BlockSetType NETHERITE = registerModBlockSetType("netherite", true, BlockSoundGroup.NETHERITE);
    public static final BlockSetType ANCIENT_DEBRIS = registerModBlockSetType("ancient_debris", true, BlockSoundGroup.ANCIENT_DEBRIS);
    public static final BlockSetType NETHER_GOLD_ORE = registerModBlockSetType("nether_gold_ore", true, BlockSoundGroup.NETHER_GOLD_ORE);
    public static final BlockSetType GILDED_BLACKSTONE = registerModBlockSetType("gilded_blackstone", true, BlockSoundGroup.GILDED_BLACKSTONE);
    public static final BlockSetType AMETHYST_BLOCK = registerModBlockSetType("amethyst_block", true, BlockSoundGroup.AMETHYST_BLOCK);
    public static final BlockSetType TUFF = registerModBlockSetType("tuff", true, BlockSoundGroup.TUFF);
    public static final BlockSetType CALCITE = registerModBlockSetType("calcite", true, BlockSoundGroup.CALCITE);
    public static final BlockSetType DRIPSTONE = registerModBlockSetType("dripstone", true, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final BlockSetType COPPER = registerModBlockSetType("copper", true, BlockSoundGroup.COPPER);
    public static final BlockSetType MOSS_BLOCK = registerModBlockSetType("moss_block", true, BlockSoundGroup.MOSS_BLOCK);
    public static final BlockSetType ROOTED_DIRT = registerModBlockSetType("rooted_dirt", true, BlockSoundGroup.ROOTED_DIRT);
    public static final BlockSetType AZALEA_LEAVES = registerModBlockSetType("azalea_leaves", true, BlockSoundGroup.AZALEA_LEAVES);
    public static final BlockSetType SCULK_CATALYST = registerModBlockSetType("sculk_catalyst", true, BlockSoundGroup.SCULK_CATALYST);
    public static final BlockSetType SCULK = registerModBlockSetType("sculk", true, BlockSoundGroup.SCULK);
    public static final BlockSetType DEEPSLATE = registerModBlockSetType("deepslate", true, BlockSoundGroup.DEEPSLATE);
    public static final BlockSetType DEEPSLATE_BRICKS = registerModBlockSetType("deepslate_bricks", true, BlockSoundGroup.DEEPSLATE_BRICKS);
    public static final BlockSetType DEEPSLATE_TILES = registerModBlockSetType("deepslate_tiles", true, BlockSoundGroup.DEEPSLATE_TILES);
    public static final BlockSetType POLISHED_DEEPSLATE = registerModBlockSetType("polished_deepslate", true, BlockSoundGroup.POLISHED_DEEPSLATE);
    public static final BlockSetType FROGLIGHT = registerModBlockSetType("froglight", true, BlockSoundGroup.FROGLIGHT);
    public static final BlockSetType MANGROVE_ROOTS = registerModBlockSetType("mangrove_roots", true, BlockSoundGroup.MANGROVE_ROOTS);
    public static final BlockSetType MUDDY_MANGROVE_ROOTS = registerModBlockSetType("muddy_mangrove_roots", true, BlockSoundGroup.MUDDY_MANGROVE_ROOTS);
    public static final BlockSetType MUD = registerModBlockSetType("mud", true, BlockSoundGroup.MUD);
    public static final BlockSetType MUD_BRICKS = registerModBlockSetType("mud_bricks", true, BlockSoundGroup.MUD_BRICKS);
    public static final BlockSetType PACKED_MUD = registerModBlockSetType("packed_mud", true, BlockSoundGroup.PACKED_MUD);
    public static final BlockSetType BAMBOO_WOOD = registerModBlockSetType("bamboo_wood", true, BlockSoundGroup.BAMBOO_WOOD);
    public static final BlockSetType NETHER_WOOD = registerModBlockSetType("nether_wood", true, BlockSoundGroup.NETHER_WOOD);
    public static final BlockSetType CHERRY_WOOD = registerModBlockSetType("cherry_wood", true, BlockSoundGroup.CHERRY_WOOD);
    public static final BlockSetType CHERRY_LEAVES = registerModBlockSetType("cherry_leaves", true, BlockSoundGroup.CHERRY_LEAVES);

}

package net.fellter.vanillablocksplus.block;

import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.fellter.vanillablocksplus.custom_blocks.copper.*;
import net.fellter.vanillablocksplus.custom_blocks.redstone_ore.*;
import net.fellter.vanillablocksplus.custom_blocks.slime.*;
import net.fellter.vanillablocksplus.custom_blocks.sponge.*;
import net.fellter.vanillablocksplus.custom_blocks.wet_sponge.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.lang.invoke.TypeDescriptor;
import java.util.function.Function;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks2 {

    //melon
    public static final Block MELON_STAIRS = registerBlock("melon_stairs", (settings) -> new StairsBlock(Blocks.MELON.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_SLAB = registerBlock("melon_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_BUTTON = registerBlock("melon_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOD, 10, settings), AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_PRESSURE_PLATE = registerBlock("melon_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_FENCE = registerBlock("melon_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_FENCE_GATE = registerBlock("melon_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_DOOR = registerBlock("melon_door", (settings) -> new DoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_TRAPDOOR = registerBlock("melon_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block MELON_WALL = registerBlock("melon_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MELON));
    //pumpkin
    public static final Block PUMPKIN_STAIRS = registerBlock("pumpkin_stairs", (settings) -> new StairsBlock(Blocks.PUMPKIN.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_SLAB = registerBlock("pumpkin_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_BUTTON = registerBlock("pumpkin_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOD, 10, settings), AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_PRESSURE_PLATE = registerBlock("pumpkin_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_FENCE = registerBlock("pumpkin_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_FENCE_GATE = registerBlock("pumpkin_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_DOOR = registerBlock("pumpkin_door", (settings) -> new DoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_TRAPDOOR = registerBlock("pumpkin_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    public static final Block PUMPKIN_WALL = registerBlock("pumpkin_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PUMPKIN));
    //hay_block
    public static final Block HAY_BLOCK_STAIRS = registerBlock("hay_block_stairs", (settings) -> new StairsBlock(Blocks.HAY_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_SLAB = registerBlock("hay_block_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_BUTTON = registerBlock("hay_block_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_PRESSURE_PLATE = registerBlock("hay_block_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_FENCE = registerBlock("hay_block_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_FENCE_GATE = registerBlock("hay_block_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_DOOR = registerBlock("hay_block_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_TRAPDOOR = registerBlock("hay_block_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    public static final Block HAY_BLOCK_WALL = registerBlock("hay_block_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK));
    //honeycomb_block
    public static final Block HONEYCOMB_STAIRS = registerBlock("honeycomb_stairs", (settings) -> new StairsBlock(Blocks.HONEYCOMB_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_SLAB = registerBlock("honeycomb_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_BUTTON = registerBlock("honeycomb_button", (settings) -> new ButtonBlock(ModBlockSetType.HONEY, 10, settings), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_PRESSURE_PLATE = registerBlock("honeycomb_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_FENCE = registerBlock("honeycomb_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_FENCE_GATE = registerBlock("honeycomb_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_DOOR = registerBlock("honeycomb_door", (settings) -> new DoorBlock(ModBlockSetType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_TRAPDOOR = registerBlock("honeycomb_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    public static final Block HONEYCOMB_WALL = registerBlock("honeycomb_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK));
    //slime_block
    public static final Block SLIME_STAIRS = registerBlock("slime_stairs", (settings) -> new SlimeStairsBlock(Blocks.SLIME_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_SLAB = registerBlock("slime_slab", SlimeSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_BUTTON = registerBlock("slime_button", (settings) -> new SlimeButtonBlock(ModBlockSetType.SLIME, 10, settings), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_PRESSURE_PLATE = registerBlock("slime_pressure_plate", (settings) -> new SlimePressurePlateBlock(ModBlockSetType.SLIME, settings), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_FENCE = registerBlock("slime_fence", SlimeFenceBlock::new, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_FENCE_GATE = registerBlock("slime_fence_gate", (settings) -> new SlimeFenceGateBlock(ModWoodType.SLIME, settings), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_DOOR = registerBlock("slime_door", (settings) -> new SlimeDoorBlock(ModBlockSetType.SLIME, settings), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_TRAPDOOR = registerBlock("slime_trapdoor", (settings) -> new SlimeTrapdoorBlock(ModBlockSetType.SLIME, settings), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    public static final Block SLIME_WALL = registerBlock("slime_wall", SlimeWallBlock::new, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));
    //honey_block
    public static final Block HONEY_STAIRS = registerBlock("honey_stairs", (settings) -> new StairsBlock(Blocks.HONEY_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_SLAB = registerBlock("honey_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_BUTTON = registerBlock("honey_button", (settings) -> new ButtonBlock(ModBlockSetType.HONEY, 10, settings), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_PRESSURE_PLATE = registerBlock("honey_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_FENCE = registerBlock("honey_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_FENCE_GATE = registerBlock("honey_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_DOOR = registerBlock("honey_door", (settings) -> new DoorBlock(ModBlockSetType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_TRAPDOOR = registerBlock("honey_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.HONEY, settings), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    public static final Block HONEY_WALL = registerBlock("honey_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK));
    //resin_block
    public static final Block RESIN_STAIRS = registerBlock("resin_stairs", (settings) -> new StairsBlock(Blocks.RESIN_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_SLAB = registerBlock("resin_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_BUTTON = registerBlock("resin_button", (settings) -> new ButtonBlock(ModBlockSetType.RESIN, 10, settings), AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_PRESSURE_PLATE = registerBlock("resin_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.RESIN, settings), AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_FENCE = registerBlock("resin_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_FENCE_GATE = registerBlock("resin_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.RESIN, settings), AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_DOOR = registerBlock("resin_door", (settings) -> new DoorBlock(ModBlockSetType.RESIN, settings), AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_TRAPDOOR = registerBlock("resin_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.RESIN, settings), AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    public static final Block RESIN_WALL = registerBlock("resin_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));
    //ochre_froglight
    public static final Block OCHRE_FROGLIGHT_STAIRS = registerBlock("ochre_froglight_stairs", (settings) -> new StairsBlock(Blocks.OCHRE_FROGLIGHT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_SLAB = registerBlock("ochre_froglight_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_BUTTON = registerBlock("ochre_froglight_button", (settings) -> new ButtonBlock(ModBlockSetType.FROGLIGHT, 10, settings), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_PRESSURE_PLATE = registerBlock("ochre_froglight_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_FENCE = registerBlock("ochre_froglight_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_FENCE_GATE = registerBlock("ochre_froglight_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_DOOR = registerBlock("ochre_froglight_door", (settings) -> new DoorBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_TRAPDOOR = registerBlock("ochre_froglight_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    public static final Block OCHRE_FROGLIGHT_WALL = registerBlock("ochre_froglight_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT));
    //verdant_froglight
    public static final Block VERDANT_FROGLIGHT_STAIRS = registerBlock("verdant_froglight_stairs", (settings) -> new StairsBlock(Blocks.VERDANT_FROGLIGHT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_SLAB = registerBlock("verdant_froglight_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_BUTTON = registerBlock("verdant_froglight_button", (settings) -> new ButtonBlock(ModBlockSetType.FROGLIGHT, 10, settings), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_PRESSURE_PLATE = registerBlock("verdant_froglight_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_FENCE = registerBlock("verdant_froglight_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_FENCE_GATE = registerBlock("verdant_froglight_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_DOOR = registerBlock("verdant_froglight_door", (settings) -> new DoorBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_TRAPDOOR = registerBlock("verdant_froglight_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    public static final Block VERDANT_FROGLIGHT_WALL = registerBlock("verdant_froglight_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT));
    //pearlescent_froglight
    public static final Block PEARLESCENT_FROGLIGHT_STAIRS = registerBlock("pearlescent_froglight_stairs", (settings) -> new StairsBlock(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_SLAB = registerBlock("pearlescent_froglight_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_BUTTON = registerBlock("pearlescent_froglight_button", (settings) -> new ButtonBlock(ModBlockSetType.FROGLIGHT, 10, settings), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_PRESSURE_PLATE = registerBlock("pearlescent_froglight_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_FENCE = registerBlock("pearlescent_froglight_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_FENCE_GATE = registerBlock("pearlescent_froglight_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_DOOR = registerBlock("pearlescent_froglight_door", (settings) -> new DoorBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_TRAPDOOR = registerBlock("pearlescent_froglight_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.FROGLIGHT, settings), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    public static final Block PEARLESCENT_FROGLIGHT_WALL = registerBlock("pearlescent_froglight_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT));
    //sculk
    public static final Block SCULK_STAIRS = registerBlock("sculk_stairs", (settings) -> new StairsBlock(Blocks.SCULK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_SLAB = registerBlock("sculk_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_BUTTON = registerBlock("sculk_button", (settings) -> new ButtonBlock(ModBlockSetType.SCULK, 10, settings), AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_PRESSURE_PLATE = registerBlock("sculk_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.SCULK, settings), AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_FENCE = registerBlock("sculk_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_FENCE_GATE = registerBlock("sculk_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.SCULK, settings), AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_DOOR = registerBlock("sculk_door", (settings) -> new DoorBlock(ModBlockSetType.SCULK, settings), AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_TRAPDOOR = registerBlock("sculk_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.SCULK, settings), AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block SCULK_WALL = registerBlock("sculk_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SCULK));
    //bedrock
    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs", (settings) -> new StairsBlock(Blocks.BEDROCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_BUTTON = registerBlock("bedrock_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_PRESSURE_PLATE = registerBlock("bedrock_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_FENCE = registerBlock("bedrock_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_FENCE_GATE = registerBlock("bedrock_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BEDROCK));
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BEDROCK));
    //target
    public static final Block TARGET_STAIRS = registerBlock("target_stairs", (settings) -> new StairsBlock(Blocks.TARGET.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_SLAB = registerBlock("target_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_BUTTON = registerBlock("target_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_PRESSURE_PLATE = registerBlock("target_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_FENCE = registerBlock("target_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_FENCE_GATE = registerBlock("target_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_DOOR = registerBlock("target_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_TRAPDOOR = registerBlock("target_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.TARGET));
    public static final Block TARGET_WALL = registerBlock("target_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.TARGET));
    //brown_mushroom
    public static final Block BROWN_MUSHROOM_STAIRS = registerBlock("brown_mushroom_stairs", (settings) -> new StairsBlock(Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_SLAB = registerBlock("brown_mushroom_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_BUTTON = registerBlock("brown_mushroom_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOD, 10, settings), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_PRESSURE_PLATE = registerBlock("brown_mushroom_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_FENCE = registerBlock("brown_mushroom_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_FENCE_GATE = registerBlock("brown_mushroom_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_DOOR = registerBlock("brown_mushroom_door", (settings) -> new DoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_TRAPDOOR = registerBlock("brown_mushroom_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    public static final Block BROWN_MUSHROOM_WALL = registerBlock("brown_mushroom_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK));
    //red_mushroom
    public static final Block RED_MUSHROOM_STAIRS = registerBlock("red_mushroom_stairs", (settings) -> new StairsBlock(Blocks.RED_MUSHROOM_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_SLAB = registerBlock("red_mushroom_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_BUTTON = registerBlock("red_mushroom_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOD, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_PRESSURE_PLATE = registerBlock("red_mushroom_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_FENCE = registerBlock("red_mushroom_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_FENCE_GATE = registerBlock("red_mushroom_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_DOOR = registerBlock("red_mushroom_door", (settings) -> new DoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_TRAPDOOR = registerBlock("red_mushroom_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOD, settings), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block RED_MUSHROOM_WALL = registerBlock("red_mushroom_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    //nether_wart
    public static final Block NETHER_WART_STAIRS = registerBlock("nether_wart_stairs", (settings) -> new StairsBlock(Blocks.NETHER_WART_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_SLAB = registerBlock("nether_wart_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_BUTTON = registerBlock("nether_wart_button", (settings) -> new ButtonBlock(ModBlockSetType.WART_BLOCK, 10, settings), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_PRESSURE_PLATE = registerBlock("nether_wart_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_FENCE = registerBlock("nether_wart_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_FENCE_GATE = registerBlock("nether_wart_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_DOOR = registerBlock("nether_wart_door", (settings) -> new DoorBlock(ModBlockSetType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_TRAPDOOR = registerBlock("nether_wart_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final Block NETHER_WART_WALL = registerBlock("nether_wart_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    //warped_wart
    public static final Block WARPED_WART_STAIRS = registerBlock("warped_wart_stairs", (settings) -> new StairsBlock(Blocks.WARPED_WART_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_SLAB = registerBlock("warped_wart_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_BUTTON = registerBlock("warped_wart_button", (settings) -> new ButtonBlock(ModBlockSetType.WART_BLOCK, 10, settings), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_PRESSURE_PLATE = registerBlock("warped_wart_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_FENCE = registerBlock("warped_wart_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_FENCE_GATE = registerBlock("warped_wart_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_DOOR = registerBlock("warped_wart_door", (settings) -> new DoorBlock(ModBlockSetType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_TRAPDOOR = registerBlock("warped_wart_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WART_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final Block WARPED_WART_WALL = registerBlock("warped_wart_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK));
    //shroomlight
    public static final Block SHROOMLIGHT_STAIRS = registerBlock("shroomlight_stairs", (settings) -> new StairsBlock(Blocks.SHROOMLIGHT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_SLAB = registerBlock("shroomlight_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_BUTTON = registerBlock("shroomlight_button", (settings) -> new ButtonBlock(ModBlockSetType.SHROOMLIGHT, 10, settings), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_PRESSURE_PLATE = registerBlock("shroomlight_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.SHROOMLIGHT, settings), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_FENCE = registerBlock("shroomlight_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_FENCE_GATE = registerBlock("shroomlight_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.SHROOMLIGHT, settings), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_DOOR = registerBlock("shroomlight_door", (settings) -> new DoorBlock(ModBlockSetType.SHROOMLIGHT, settings), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_TRAPDOOR = registerBlock("shroomlight_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.SHROOMLIGHT, settings), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    public static final Block SHROOMLIGHT_WALL = registerBlock("shroomlight_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT));
    //dried_kelp
    public static final Block DRIED_KELP_STAIRS = registerBlock("dried_kelp_stairs", (settings) -> new StairsBlock(Blocks.DRIED_KELP_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_SLAB = registerBlock("dried_kelp_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_BUTTON = registerBlock("dried_kelp_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_PRESSURE_PLATE = registerBlock("dried_kelp_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_FENCE = registerBlock("dried_kelp_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_FENCE_GATE = registerBlock("dried_kelp_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_DOOR = registerBlock("dried_kelp_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_TRAPDOOR = registerBlock("dried_kelp_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    public static final Block DRIED_KELP_WALL = registerBlock("dried_kelp_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK));
    //TUBE_CORAL
    public static final Block TUBE_CORAL_STAIRS = registerBlock("tube_coral_stairs", (settings) -> new StairsBlock(Blocks.TUBE_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_SLAB = registerBlock("tube_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_BUTTON = registerBlock("tube_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_PRESSURE_PLATE = registerBlock("tube_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_FENCE = registerBlock("tube_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_FENCE_GATE = registerBlock("tube_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_DOOR = registerBlock("tube_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_TRAPDOOR = registerBlock("tube_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    public static final Block TUBE_CORAL_WALL = registerBlock("tube_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK));
    //DEAD_TUBE_CORAL
    public static final Block DEAD_TUBE_CORAL_STAIRS = registerBlock("dead_tube_coral_stairs", (settings) -> new StairsBlock(Blocks.DEAD_TUBE_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_SLAB = registerBlock("dead_tube_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_BUTTON = registerBlock("dead_tube_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_PRESSURE_PLATE = registerBlock("dead_tube_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_FENCE = registerBlock("dead_tube_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_FENCE_GATE = registerBlock("dead_tube_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_DOOR = registerBlock("dead_tube_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_TRAPDOOR = registerBlock("dead_tube_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    public static final Block DEAD_TUBE_CORAL_WALL = registerBlock("dead_tube_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK));
    //BRAIN_CORAL
    public static final Block BRAIN_CORAL_STAIRS = registerBlock("brain_coral_stairs", (settings) -> new StairsBlock(Blocks.BRAIN_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_SLAB = registerBlock("brain_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_BUTTON = registerBlock("brain_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_PRESSURE_PLATE = registerBlock("brain_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_FENCE = registerBlock("brain_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_FENCE_GATE = registerBlock("brain_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_DOOR = registerBlock("brain_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_TRAPDOOR = registerBlock("brain_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BRAIN_CORAL_WALL = registerBlock("brain_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK));
    //DEAD_BRAIN_CORAL
    public static final Block DEAD_BRAIN_CORAL_STAIRS = registerBlock("dead_brain_coral_stairs", (settings) -> new StairsBlock(Blocks.DEAD_BRAIN_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_SLAB = registerBlock("dead_brain_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_BUTTON = registerBlock("dead_brain_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_PRESSURE_PLATE = registerBlock("dead_brain_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_FENCE = registerBlock("dead_brain_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_FENCE_GATE = registerBlock("dead_brain_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_DOOR = registerBlock("dead_brain_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_TRAPDOOR = registerBlock("dead_brain_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block DEAD_BRAIN_CORAL_WALL = registerBlock("dead_brain_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    //BUBBLE_CORAL
    public static final Block BUBBLE_CORAL_STAIRS = registerBlock("bubble_coral_stairs", (settings) -> new StairsBlock(Blocks.BUBBLE_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_SLAB = registerBlock("bubble_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_BUTTON = registerBlock("bubble_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_PRESSURE_PLATE = registerBlock("bubble_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_FENCE = registerBlock("bubble_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_FENCE_GATE = registerBlock("bubble_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_DOOR = registerBlock("bubble_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_TRAPDOOR = registerBlock("bubble_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_WALL = registerBlock("bubble_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    //DEAD_BUBBLE_CORAL
    public static final Block DEAD_BUBBLE_CORAL_STAIRS = registerBlock("dead_bubble_coral_stairs", (settings) -> new StairsBlock(Blocks.DEAD_BUBBLE_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_SLAB = registerBlock("dead_bubble_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_BUTTON = registerBlock("dead_bubble_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_PRESSURE_PLATE = registerBlock("dead_bubble_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_FENCE = registerBlock("dead_bubble_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_FENCE_GATE = registerBlock("dead_bubble_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_DOOR = registerBlock("dead_bubble_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_TRAPDOOR = registerBlock("dead_bubble_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    public static final Block DEAD_BUBBLE_CORAL_WALL = registerBlock("dead_bubble_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK));
    //FIRE_CORAL
    public static final Block FIRE_CORAL_STAIRS = registerBlock("fire_coral_stairs", (settings) -> new StairsBlock(Blocks.FIRE_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_SLAB = registerBlock("fire_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_BUTTON = registerBlock("fire_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_PRESSURE_PLATE = registerBlock("fire_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_FENCE = registerBlock("fire_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_FENCE_GATE = registerBlock("fire_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_DOOR = registerBlock("fire_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_TRAPDOOR = registerBlock("fire_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    public static final Block FIRE_CORAL_WALL = registerBlock("fire_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK));
    //DEAD_FIRE_CORAL
    public static final Block DEAD_FIRE_CORAL_STAIRS = registerBlock("dead_fire_coral_stairs", (settings) -> new StairsBlock(Blocks.DEAD_FIRE_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_SLAB = registerBlock("dead_fire_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_BUTTON = registerBlock("dead_fire_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_PRESSURE_PLATE = registerBlock("dead_fire_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_FENCE = registerBlock("dead_fire_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_FENCE_GATE = registerBlock("dead_fire_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_DOOR = registerBlock("dead_fire_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_TRAPDOOR = registerBlock("dead_fire_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    public static final Block DEAD_FIRE_CORAL_WALL = registerBlock("dead_fire_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK));
    //HORN_CORAL
    public static final Block HORN_CORAL_STAIRS = registerBlock("horn_coral_stairs", (settings) -> new StairsBlock(Blocks.HORN_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_SLAB = registerBlock("horn_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_BUTTON = registerBlock("horn_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_PRESSURE_PLATE = registerBlock("horn_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_FENCE = registerBlock("horn_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_FENCE_GATE = registerBlock("horn_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_DOOR = registerBlock("horn_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_TRAPDOOR = registerBlock("horn_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    public static final Block HORN_CORAL_WALL = registerBlock("horn_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK));
    //dead_horn_coral
    public static final Block DEAD_HORN_CORAL_STAIRS = registerBlock("dead_horn_coral_stairs", (settings) -> new StairsBlock(Blocks.DEAD_HORN_CORAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_SLAB = registerBlock("dead_horn_coral_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_BUTTON = registerBlock("dead_horn_coral_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_PRESSURE_PLATE = registerBlock("dead_horn_coral_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_FENCE = registerBlock("dead_horn_coral_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_FENCE_GATE = registerBlock("dead_horn_coral_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_DOOR = registerBlock("dead_horn_coral_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_TRAPDOOR = registerBlock("dead_horn_coral_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    public static final Block DEAD_HORN_CORAL_WALL = registerBlock("dead_horn_coral_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK));
    //sponge
    public static final Block SPONGE_STAIRS = registerBlock("sponge_stairs", (settings) -> new SpongeStairsBlock(Blocks.SPONGE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_SLAB = registerBlock("sponge_slab", SpongeSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_BUTTON = registerBlock("sponge_button", (settings) -> new SpongeButtonBlock(ModBlockSetType.SPONGE, 10, settings), AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_PRESSURE_PLATE = registerBlock("sponge_pressure_plate", (settings) -> new SpongePressurePlateBlock(ModBlockSetType.SPONGE, settings), AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_FENCE = registerBlock("sponge_fence", SpongeFenceBlock::new, AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_FENCE_GATE = registerBlock("sponge_fence_gate", (settings) -> new SpongeFenceGateBlock(ModWoodType.SPONGE, settings), AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_DOOR = registerBlock("sponge_door", (settings) -> new DoorBlock(ModBlockSetType.SPONGE, settings), AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_TRAPDOOR = registerBlock("sponge_trapdoor", (settings) -> new SpongeTrapdoorBlock(ModBlockSetType.SPONGE, settings), AbstractBlock.Settings.copy(Blocks.SPONGE));
    public static final Block SPONGE_WALL = registerBlock("sponge_wall", SpongeWallBlock::new, AbstractBlock.Settings.copy(Blocks.SPONGE));
    //wet_sponge
    public static final Block WET_SPONGE_STAIRS = registerBlock("wet_sponge_stairs", (settings) -> new WetSpongeStairsBlock(Blocks.WET_SPONGE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_SLAB = registerBlock("wet_sponge_slab", WetSpongeSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_BUTTON = registerBlock("wet_sponge_button", (settings) -> new WetSpongeButtonBlock(ModBlockSetType.WET_SPONGE, 10, settings), AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_PRESSURE_PLATE = registerBlock("wet_sponge_pressure_plate", (settings) -> new WetSpongePressurePlateBlock(ModBlockSetType.WET_SPONGE, settings), AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_FENCE = registerBlock("wet_sponge_fence", WetSpongeFenceBlock::new, AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_FENCE_GATE = registerBlock("wet_sponge_fence_gate", (settings) -> new WetSpongeFenceGateBlock(ModWoodType.WET_SPONGE, settings), AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_DOOR = registerBlock("wet_sponge_door", (settings) -> new DoorBlock(ModBlockSetType.WET_SPONGE, settings), AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_TRAPDOOR = registerBlock("wet_sponge_trapdoor", (settings) -> new WetSpongeTrapdoorBlock(ModBlockSetType.WET_SPONGE, settings), AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    public static final Block WET_SPONGE_WALL = registerBlock("wet_sponge_wall", WetSpongeWallBlock::new, AbstractBlock.Settings.copy(Blocks.WET_SPONGE));
    //coal_ore
    public static final Block COAL_ORE_STAIRS = registerBlock("coal_ore_stairs", (settings) -> new StairsBlock(Blocks.COAL_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_SLAB = registerBlock("coal_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_BUTTON = registerBlock("coal_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_PRESSURE_PLATE = registerBlock("coal_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_FENCE = registerBlock("coal_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_FENCE_GATE = registerBlock("coal_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_DOOR = registerBlock("coal_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_TRAPDOOR = registerBlock("coal_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    public static final Block COAL_ORE_WALL = registerBlock("coal_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_ORE));
    //deepslate_coal_ore
    public static final Block DEEPSLATE_COAL_ORE_STAIRS = registerBlock("deepslate_coal_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_COAL_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_SLAB = registerBlock("deepslate_coal_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_BUTTON = registerBlock("deepslate_coal_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_PRESSURE_PLATE = registerBlock("deepslate_coal_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_FENCE = registerBlock("deepslate_coal_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_FENCE_GATE = registerBlock("deepslate_coal_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_DOOR = registerBlock("deepslate_coal_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_TRAPDOOR = registerBlock("deepslate_coal_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    public static final Block DEEPSLATE_COAL_ORE_WALL = registerBlock("deepslate_coal_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE));
    //iron_ore
    public static final Block IRON_ORE_STAIRS = registerBlock("iron_ore_stairs", (settings) -> new StairsBlock(Blocks.IRON_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_SLAB = registerBlock("iron_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_BUTTON = registerBlock("iron_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_PRESSURE_PLATE = registerBlock("iron_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_FENCE = registerBlock("iron_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_FENCE_GATE = registerBlock("iron_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_DOOR = registerBlock("iron_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_TRAPDOOR = registerBlock("iron_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    public static final Block IRON_ORE_WALL = registerBlock("iron_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_ORE));
    //deepslate_iron_ore
    public static final Block DEEPSLATE_IRON_ORE_STAIRS = registerBlock("deepslate_iron_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_IRON_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_SLAB = registerBlock("deepslate_iron_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_BUTTON = registerBlock("deepslate_iron_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_PRESSURE_PLATE = registerBlock("deepslate_iron_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_FENCE = registerBlock("deepslate_iron_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_FENCE_GATE = registerBlock("deepslate_iron_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_DOOR = registerBlock("deepslate_iron_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_TRAPDOOR = registerBlock("deepslate_iron_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    public static final Block DEEPSLATE_IRON_ORE_WALL = registerBlock("deepslate_iron_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE));
    //copper_ore
    public static final Block COPPER_ORE_STAIRS = registerBlock("copper_ore_stairs", (settings) -> new StairsBlock(Blocks.COPPER_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_SLAB = registerBlock("copper_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_BUTTON = registerBlock("copper_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_PRESSURE_PLATE = registerBlock("copper_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_FENCE = registerBlock("copper_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_FENCE_GATE = registerBlock("copper_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_DOOR = registerBlock("copper_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_TRAPDOOR = registerBlock("copper_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    public static final Block COPPER_ORE_WALL = registerBlock("copper_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE));
    //deepslate_copper_ore
    public static final Block DEEPSLATE_COPPER_ORE_STAIRS = registerBlock("deepslate_copper_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_COPPER_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_SLAB = registerBlock("deepslate_copper_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_BUTTON = registerBlock("deepslate_copper_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_PRESSURE_PLATE = registerBlock("deepslate_copper_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_FENCE = registerBlock("deepslate_copper_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_FENCE_GATE = registerBlock("deepslate_copper_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_DOOR = registerBlock("deepslate_copper_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_TRAPDOOR = registerBlock("deepslate_copper_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    public static final Block DEEPSLATE_COPPER_ORE_WALL = registerBlock("deepslate_copper_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE));
    //gold_ore
    public static final Block GOLD_ORE_STAIRS = registerBlock("gold_ore_stairs", (settings) -> new StairsBlock(Blocks.GOLD_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_SLAB = registerBlock("gold_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_BUTTON = registerBlock("gold_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_PRESSURE_PLATE = registerBlock("gold_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_FENCE = registerBlock("gold_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_FENCE_GATE = registerBlock("gold_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_DOOR = registerBlock("gold_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_TRAPDOOR = registerBlock("gold_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    public static final Block GOLD_ORE_WALL = registerBlock("gold_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_ORE));
    //deepslate_gold_ore
    public static final Block DEEPSLATE_GOLD_ORE_STAIRS = registerBlock("deepslate_gold_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_GOLD_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_SLAB = registerBlock("deepslate_gold_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_BUTTON = registerBlock("deepslate_gold_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_PRESSURE_PLATE = registerBlock("deepslate_gold_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_FENCE = registerBlock("deepslate_gold_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_FENCE_GATE = registerBlock("deepslate_gold_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_DOOR = registerBlock("deepslate_gold_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_TRAPDOOR = registerBlock("deepslate_gold_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    public static final Block DEEPSLATE_GOLD_ORE_WALL = registerBlock("deepslate_gold_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE));
    //redstone_ore
    public static final Block REDSTONE_ORE_STAIRS = registerBlock("redstone_ore_stairs", (settings) -> new RedstoneOreStairsBlock(Blocks.REDSTONE_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_SLAB = registerBlock("redstone_ore_slab", RedstoneOreSlabBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_BUTTON = registerBlock("redstone_ore_button", (settings) -> new RedstoneOreButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_PRESSURE_PLATE = registerBlock("redstone_ore_pressure_plate", (settings) -> new RedstoneOrePressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_FENCE = registerBlock("redstone_ore_fence", RedstoneOreFenceBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_FENCE_GATE = registerBlock("redstone_ore_fence_gate", (settings) -> new RedstoneOreFenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_DOOR = registerBlock("redstone_ore_door", (settings) -> new RedstoneOreDoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_TRAPDOOR = registerBlock("redstone_ore_trapdoor", (settings) -> new RedstoneOreTrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE));
    public static final Block REDSTONE_ORE_WALL = registerBlock("redstone_ore_wall", WallBlock::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).ticksRandomly().strength(3.0f, 3.0f));
    //deepslate_redstone_ore
    public static final Block DEEPSLATE_REDSTONE_ORE_STAIRS = registerBlock("deepslate_redstone_ore_stairs", (settings) -> new RedstoneOreStairsBlock(Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_SLAB = registerBlock("deepslate_redstone_ore_slab", RedstoneOreSlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_BUTTON = registerBlock("deepslate_redstone_ore_button", (settings) -> new RedstoneOreButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_PRESSURE_PLATE = registerBlock("deepslate_redstone_ore_pressure_plate", (settings) -> new RedstoneOrePressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_FENCE = registerBlock("deepslate_redstone_ore_fence", RedstoneOreFenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_FENCE_GATE = registerBlock("deepslate_redstone_ore_fence_gate", (settings) -> new RedstoneOreFenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_DOOR = registerBlock("deepslate_redstone_ore_door", (settings) -> new RedstoneOreDoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_TRAPDOOR = registerBlock("deepslate_redstone_ore_trapdoor", (settings) -> new RedstoneOreTrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE));
    public static final Block DEEPSLATE_REDSTONE_ORE_WALL = registerBlock("deepslate_redstone_ore_wall", WallBlock::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).ticksRandomly().strength(3.0f, 3.0f));
    //emerald_ore
    public static final Block EMERALD_ORE_STAIRS = registerBlock("emerald_ore_stairs", (settings) -> new StairsBlock(Blocks.EMERALD_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_SLAB = registerBlock("emerald_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_BUTTON = registerBlock("emerald_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_PRESSURE_PLATE = registerBlock("emerald_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_FENCE = registerBlock("emerald_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_FENCE_GATE = registerBlock("emerald_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_DOOR = registerBlock("emerald_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_TRAPDOOR = registerBlock("emerald_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    public static final Block EMERALD_ORE_WALL = registerBlock("emerald_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE));
    //deepslate_emerald_ore
    public static final Block DEEPSLATE_EMERALD_ORE_STAIRS = registerBlock("deepslate_emerald_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_SLAB = registerBlock("deepslate_emerald_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_BUTTON = registerBlock("deepslate_emerald_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE = registerBlock("deepslate_emerald_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_FENCE = registerBlock("deepslate_emerald_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_FENCE_GATE = registerBlock("deepslate_emerald_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_DOOR = registerBlock("deepslate_emerald_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_TRAPDOOR = registerBlock("deepslate_emerald_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    public static final Block DEEPSLATE_EMERALD_ORE_WALL = registerBlock("deepslate_emerald_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE));
    //lapis_ore
    public static final Block LAPIS_ORE_STAIRS = registerBlock("lapis_ore_stairs", (settings) -> new StairsBlock(Blocks.LAPIS_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_SLAB = registerBlock("lapis_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_BUTTON = registerBlock("lapis_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_PRESSURE_PLATE = registerBlock("lapis_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_FENCE = registerBlock("lapis_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_FENCE_GATE = registerBlock("lapis_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_DOOR = registerBlock("lapis_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_TRAPDOOR = registerBlock("lapis_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    public static final Block LAPIS_ORE_WALL = registerBlock("lapis_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE));
    //deepslate_lapis_ore
    public static final Block DEEPSLATE_LAPIS_ORE_STAIRS = registerBlock("deepslate_lapis_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_SLAB = registerBlock("deepslate_lapis_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_BUTTON = registerBlock("deepslate_lapis_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE = registerBlock("deepslate_lapis_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_FENCE = registerBlock("deepslate_lapis_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_FENCE_GATE = registerBlock("deepslate_lapis_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_DOOR = registerBlock("deepslate_lapis_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_TRAPDOOR = registerBlock("deepslate_lapis_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    public static final Block DEEPSLATE_LAPIS_ORE_WALL = registerBlock("deepslate_lapis_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE));
    //diamond_ore
    public static final Block DIAMOND_ORE_STAIRS = registerBlock("diamond_ore_stairs", (settings) -> new StairsBlock(Blocks.DIAMOND_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_SLAB = registerBlock("diamond_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_BUTTON = registerBlock("diamond_ore_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_PRESSURE_PLATE = registerBlock("diamond_ore_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_FENCE = registerBlock("diamond_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_FENCE_GATE = registerBlock("diamond_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_DOOR = registerBlock("diamond_ore_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_TRAPDOOR = registerBlock("diamond_ore_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DIAMOND_ORE_WALL = registerBlock("diamond_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    //deepslate_diamond_ore
    public static final Block DEEPSLATE_DIAMOND_ORE_STAIRS = registerBlock("deepslate_diamond_ore_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_SLAB = registerBlock("deepslate_diamond_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_BUTTON = registerBlock("deepslate_diamond_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE = registerBlock("deepslate_diamond_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_FENCE = registerBlock("deepslate_diamond_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_FENCE_GATE = registerBlock("deepslate_diamond_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_DOOR = registerBlock("deepslate_diamond_ore_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_TRAPDOOR = registerBlock("deepslate_diamond_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Block DEEPSLATE_DIAMOND_ORE_WALL = registerBlock("deepslate_diamond_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    //nether_gold_ore
    public static final Block NETHER_GOLD_ORE_STAIRS = registerBlock("nether_gold_ore_stairs", (settings) -> new StairsBlock(Blocks.NETHER_GOLD_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_SLAB = registerBlock("nether_gold_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_BUTTON = registerBlock("nether_gold_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHER_GOLD_ORE, 10, settings), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_PRESSURE_PLATE = registerBlock("nether_gold_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHER_GOLD_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_FENCE = registerBlock("nether_gold_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_FENCE_GATE = registerBlock("nether_gold_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHER_GOLD_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_DOOR = registerBlock("nether_gold_ore_door", (settings) -> new DoorBlock(ModBlockSetType.NETHER_GOLD_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_TRAPDOOR = registerBlock("nether_gold_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHER_GOLD_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    public static final Block NETHER_GOLD_ORE_WALL = registerBlock("nether_gold_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE));
    //nether_quartz_ore
    public static final Block NETHER_QUARTZ_ORE_STAIRS = registerBlock("nether_quartz_ore_stairs", (settings) -> new StairsBlock(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_SLAB = registerBlock("nether_quartz_ore_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_BUTTON = registerBlock("nether_quartz_ore_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHER_ORE, 10, settings), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_PRESSURE_PLATE = registerBlock("nether_quartz_ore_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHER_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_FENCE = registerBlock("nether_quartz_ore_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_FENCE_GATE = registerBlock("nether_quartz_ore_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHER_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_DOOR = registerBlock("nether_quartz_ore_door", (settings) -> new DoorBlock(ModBlockSetType.NETHER_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_TRAPDOOR = registerBlock("nether_quartz_ore_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHER_ORE, settings), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block NETHER_QUARTZ_ORE_WALL = registerBlock("nether_quartz_ore_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    //ancient_debris
    public static final Block ANCIENT_DEBRIS_STAIRS = registerBlock("ancient_debris_stairs", (settings) -> new StairsBlock(Blocks.ANCIENT_DEBRIS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_SLAB = registerBlock("ancient_debris_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_BUTTON = registerBlock("ancient_debris_button", (settings) -> new ButtonBlock(ModBlockSetType.ANCIENT_DEBRIS, 10, settings), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_PRESSURE_PLATE = registerBlock("ancient_debris_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.ANCIENT_DEBRIS, settings), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_FENCE = registerBlock("ancient_debris_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_FENCE_GATE = registerBlock("ancient_debris_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.ANCIENT_DEBRIS, settings), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_DOOR = registerBlock("ancient_debris_door", (settings) -> new DoorBlock(ModBlockSetType.ANCIENT_DEBRIS, settings), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_TRAPDOOR = registerBlock("ancient_debris_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.ANCIENT_DEBRIS, settings), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    public static final Block ANCIENT_DEBRIS_WALL = registerBlock("ancient_debris_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS));
    //raw_iron_block
    public static final Block RAW_IRON_STAIRS = registerBlock("raw_iron_stairs", (settings) -> new StairsBlock(Blocks.RAW_IRON_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_SLAB = registerBlock("raw_iron_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_BUTTON = registerBlock("raw_iron_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_PRESSURE_PLATE = registerBlock("raw_iron_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_FENCE = registerBlock("raw_iron_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_FENCE_GATE = registerBlock("raw_iron_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_DOOR = registerBlock("raw_iron_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_TRAPDOOR = registerBlock("raw_iron_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    public static final Block RAW_IRON_WALL = registerBlock("raw_iron_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK));
    //raw_copper_block
    public static final Block RAW_COPPER_STAIRS = registerBlock("raw_copper_stairs", (settings) -> new StairsBlock(Blocks.RAW_COPPER_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_SLAB = registerBlock("raw_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_BUTTON = registerBlock("raw_copper_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_PRESSURE_PLATE = registerBlock("raw_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_FENCE = registerBlock("raw_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_FENCE_GATE = registerBlock("raw_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_DOOR = registerBlock("raw_copper_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_TRAPDOOR = registerBlock("raw_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    public static final Block RAW_COPPER_WALL = registerBlock("raw_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK));
    //raw_gold_block
    public static final Block RAW_GOLD_STAIRS = registerBlock("raw_gold_stairs", (settings) -> new StairsBlock(Blocks.RAW_GOLD_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_SLAB = registerBlock("raw_gold_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_BUTTON = registerBlock("raw_gold_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_PRESSURE_PLATE = registerBlock("raw_gold_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_FENCE = registerBlock("raw_gold_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_FENCE_GATE = registerBlock("raw_gold_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_DOOR = registerBlock("raw_gold_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_TRAPDOOR = registerBlock("raw_gold_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    public static final Block RAW_GOLD_WALL = registerBlock("raw_gold_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK));
    //glowstone
    public static final Block GLOWSTONE_STAIRS = registerBlock("glowstone_stairs", (settings) -> new StairsBlock(Blocks.GLOWSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_BUTTON = registerBlock("glowstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_PRESSURE_PLATE = registerBlock("glowstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_FENCE = registerBlock("glowstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_FENCE_GATE = registerBlock("glowstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_DOOR = registerBlock("glowstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_TRAPDOOR = registerBlock("glowstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GLOWSTONE));
    public static final Block GLOWSTONE_WALL = registerBlock("glowstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GLOWSTONE));

    //leaves_def
    static final Block LEAVES_DEF = registerBlock("leaves_def", Block::new, AbstractBlock.Settings.create().strength(0.2f).sounds(BlockSoundGroup.GRASS).nonOpaque() .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
            .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never));


    public static final Block FLOWERING_AZALEA_LEAVES_WALL = registerBlock("flowering_azalea_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_TRAPDOOR = registerBlock("flowering_azalea_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_DOOR = registerBlock("flowering_azalea_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_FENCE_GATE = registerBlock("flowering_azalea_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_FENCE = registerBlock("flowering_azalea_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE = registerBlock("flowering_azalea_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_BUTTON = registerBlock("flowering_azalea_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.AZALEA_LEAVES, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_SLAB = registerBlock("flowering_azalea_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    //flowering_azalea_leaves
    public static final Block FLOWERING_AZALEA_LEAVES_STAIRS = registerBlock("flowering_azalea_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_WALL = registerBlock("azalea_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_TRAPDOOR = registerBlock("azalea_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_DOOR = registerBlock("azalea_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_FENCE_GATE = registerBlock("azalea_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_FENCE = registerBlock("azalea_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_PRESSURE_PLATE = registerBlock("azalea_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.AZALEA_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_BUTTON = registerBlock("azalea_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.AZALEA_LEAVES, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block AZALEA_LEAVES_SLAB = registerBlock("azalea_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    //azalea_leaves
    public static final Block AZALEA_LEAVES_STAIRS = registerBlock("azalea_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block CHERRY_LEAVES_WALL = registerBlock("cherry_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_TRAPDOOR = registerBlock("cherry_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_DOOR = registerBlock("cherry_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_FENCE_GATE = registerBlock("cherry_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_FENCE = registerBlock("cherry_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_PRESSURE_PLATE = registerBlock("cherry_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_BUTTON = registerBlock("cherry_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.CHERRY_LEAVES, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block CHERRY_LEAVES_SLAB = registerBlock("cherry_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    //cherry_leaves
    public static final Block CHERRY_LEAVES_STAIRS = registerBlock("cherry_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES));
    public static final Block MANGROVE_LEAVES_WALL = registerBlock("mangrove_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_TRAPDOOR = registerBlock("mangrove_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_DOOR = registerBlock("mangrove_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_FENCE_GATE = registerBlock("mangrove_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_FENCE = registerBlock("mangrove_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_PRESSURE_PLATE = registerBlock("mangrove_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_BUTTON = registerBlock("mangrove_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block MANGROVE_LEAVES_SLAB = registerBlock("mangrove_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //mangrove_leaves
    public static final Block MANGROVE_LEAVES_STAIRS = registerBlock("mangrove_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_WALL = registerBlock("dark_oak_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_TRAPDOOR = registerBlock("dark_oak_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_DOOR = registerBlock("dark_oak_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_FENCE_GATE = registerBlock("dark_oak_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_FENCE = registerBlock("dark_oak_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_PRESSURE_PLATE = registerBlock("dark_oak_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_BUTTON = registerBlock("dark_oak_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block DARK_OAK_LEAVES_SLAB = registerBlock("dark_oak_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //dark_oak_leaves
    public static final Block DARK_OAK_LEAVES_STAIRS = registerBlock("dark_oak_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_WALL = registerBlock("acacia_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_TRAPDOOR = registerBlock("acacia_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_DOOR = registerBlock("acacia_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_FENCE_GATE = registerBlock("acacia_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_FENCE = registerBlock("acacia_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_PRESSURE_PLATE = registerBlock("acacia_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_BUTTON = registerBlock("acacia_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block ACACIA_LEAVES_SLAB = registerBlock("acacia_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //acacia_leaves
    public static final Block ACACIA_LEAVES_STAIRS = registerBlock("acacia_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_WALL = registerBlock("jungle_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_TRAPDOOR = registerBlock("jungle_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_DOOR = registerBlock("jungle_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_FENCE_GATE = registerBlock("jungle_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_FENCE = registerBlock("jungle_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_PRESSURE_PLATE = registerBlock("jungle_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_BUTTON = registerBlock("jungle_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block JUNGLE_LEAVES_SLAB = registerBlock("jungle_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //jungle_leaves
    public static final Block JUNGLE_LEAVES_STAIRS = registerBlock("jungle_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_WALL = registerBlock("birch_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_TRAPDOOR = registerBlock("birch_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_DOOR = registerBlock("birch_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_FENCE_GATE = registerBlock("birch_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_FENCE = registerBlock("birch_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_PRESSURE_PLATE = registerBlock("birch_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_BUTTON = registerBlock("birch_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block BIRCH_LEAVES_SLAB = registerBlock("birch_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //birch_leaves
    public static final Block BIRCH_LEAVES_STAIRS = registerBlock("birch_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_WALL = registerBlock("spruce_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_TRAPDOOR = registerBlock("spruce_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_DOOR = registerBlock("spruce_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_FENCE_GATE = registerBlock("spruce_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_FENCE = registerBlock("spruce_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_PRESSURE_PLATE = registerBlock("spruce_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_BUTTON = registerBlock("spruce_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block SPRUCE_LEAVES_SLAB = registerBlock("spruce_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //spruce_leaves
    public static final Block SPRUCE_LEAVES_STAIRS = registerBlock("spruce_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_WALL = registerBlock("oak_leaves_wall", WallBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_TRAPDOOR = registerBlock("oak_leaves_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_DOOR = registerBlock("oak_leaves_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_FENCE_GATE = registerBlock("oak_leaves_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_FENCE = registerBlock("oak_leaves_fence", FenceBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_PRESSURE_PLATE = registerBlock("oak_leaves_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_BUTTON = registerBlock("oak_leaves_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(LEAVES_DEF));
    public static final Block OAK_LEAVES_SLAB = registerBlock("oak_leaves_slab", SlabBlock::new, AbstractBlock.Settings.copy(LEAVES_DEF));
    //oak_leaves
    public static final Block OAK_LEAVES_STAIRS = registerBlock("oak_leaves_stairs", (settings) -> new StairsBlock(Blocks.AIR.getDefaultState(), settings), AbstractBlock.Settings.copy(LEAVES_DEF));

    //chiseled_tuff
    public static final Block CHISELED_TUFF_STAIRS = registerBlock("chiseled_tuff_stairs", (settings) -> new StairsBlock(Blocks.CHISELED_TUFF.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_SLAB = registerBlock("chiseled_tuff_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_BUTTON = registerBlock("chiseled_tuff_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_PRESSURE_PLATE = registerBlock("chiseled_tuff_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_FENCE = registerBlock("chiseled_tuff_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_FENCE_GATE = registerBlock("chiseled_tuff_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_DOOR = registerBlock("chiseled_tuff_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_TRAPDOOR = registerBlock("chiseled_tuff_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
    public static final Block CHISELED_TUFF_WALL = registerBlock("chiseled_tuff_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));

    //polished_tuff
    public static final Block POLISHED_TUFF_BUTTON = registerBlock("polished_tuff_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerBlock("polished_tuff_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block POLISHED_TUFF_FENCE = registerBlock("polished_tuff_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block POLISHED_TUFF_FENCE_GATE = registerBlock("polished_tuff_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block POLISHED_TUFF_DOOR = registerBlock("polished_tuff_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
    public static final Block POLISHED_TUFF_TRAPDOOR = registerBlock("polished_tuff_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));

    //tuff_bricks
    public static final Block TUFF_BRICKS_BUTTON = registerBlock("tuff_bricks_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_BRICKS_PRESSURE_PLATE = registerBlock("tuff_bricks_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_BRICKS_FENCE = registerBlock("tuff_bricks_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_BRICKS_FENCE_GATE = registerBlock("tuff_bricks_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_BRICKS_DOOR = registerBlock("tuff_bricks_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_BRICKS_TRAPDOOR = registerBlock("tuff_bricks_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));

    public static final Block LOG_DEF = registerBlock("log_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());

    //oak_log_set
    public static final Block OAK_LOG_STAIRS = registerBlock("oak_log_stairs", (settings) -> new StairsBlock(Blocks.OAK_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_SLAB = registerBlock("oak_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_BUTTON = registerBlock("oak_log_button", (settings) -> new ButtonBlock(BlockSetType.OAK, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_PRESSURE_PLATE = registerBlock("oak_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_FENCE = registerBlock("oak_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_FENCE_GATE = registerBlock("oak_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_DOOR = registerBlock("oak_log_door", (settings) -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_TRAPDOOR = registerBlock("oak_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block OAK_LOG_WALL = registerBlock("oak_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_oak_log_set
    public static final Block STR_OAK_LOG_STAIRS = registerBlock("str_oak_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_OAK_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_SLAB = registerBlock("str_oak_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_BUTTON = registerBlock("str_oak_log_button", (settings) -> new ButtonBlock(BlockSetType.OAK, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_PRESSURE_PLATE = registerBlock("str_oak_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_FENCE = registerBlock("str_oak_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_FENCE_GATE = registerBlock("str_oak_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_DOOR = registerBlock("str_oak_log_door", (settings) -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_TRAPDOOR = registerBlock("str_oak_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_OAK_LOG_WALL = registerBlock("str_oak_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //spruce_log_set
    public static final Block SPRUCE_LOG_STAIRS = registerBlock("spruce_log_stairs", (settings) -> new StairsBlock(Blocks.SPRUCE_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_BUTTON = registerBlock("spruce_log_button", (settings) -> new ButtonBlock(BlockSetType.SPRUCE, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_PRESSURE_PLATE = registerBlock("spruce_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_FENCE = registerBlock("spruce_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_FENCE_GATE = registerBlock("spruce_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_DOOR = registerBlock("spruce_log_door", (settings) -> new DoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_TRAPDOOR = registerBlock("spruce_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block SPRUCE_LOG_WALL = registerBlock("spruce_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_spruce_log_set
    public static final Block STR_SPRUCE_LOG_STAIRS = registerBlock("str_spruce_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_SLAB = registerBlock("str_spruce_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_BUTTON = registerBlock("str_spruce_log_button", (settings) -> new ButtonBlock(BlockSetType.SPRUCE, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_PRESSURE_PLATE = registerBlock("str_spruce_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_FENCE = registerBlock("str_spruce_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_FENCE_GATE = registerBlock("str_spruce_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_DOOR = registerBlock("str_spruce_log_door", (settings) -> new DoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_TRAPDOOR = registerBlock("str_spruce_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_SPRUCE_LOG_WALL = registerBlock("str_spruce_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //birch_log_set
    public static final Block BIRCH_LOG_STAIRS = registerBlock("birch_log_stairs", (settings) -> new StairsBlock(Blocks.BIRCH_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_SLAB = registerBlock("birch_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_BUTTON = registerBlock("birch_log_button", (settings) -> new ButtonBlock(BlockSetType.BIRCH, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_PRESSURE_PLATE = registerBlock("birch_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_FENCE = registerBlock("birch_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_FENCE_GATE = registerBlock("birch_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_DOOR = registerBlock("birch_log_door", (settings) -> new DoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_TRAPDOOR = registerBlock("birch_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block BIRCH_LOG_WALL = registerBlock("birch_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_birch_log_set
    public static final Block STR_BIRCH_LOG_STAIRS = registerBlock("str_birch_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_BIRCH_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_SLAB = registerBlock("str_birch_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_BUTTON = registerBlock("str_birch_log_button", (settings) -> new ButtonBlock(BlockSetType.BIRCH, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_PRESSURE_PLATE = registerBlock("str_birch_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_FENCE = registerBlock("str_birch_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_FENCE_GATE = registerBlock("str_birch_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_DOOR = registerBlock("str_birch_log_door", (settings) -> new DoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_TRAPDOOR = registerBlock("str_birch_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_BIRCH_LOG_WALL = registerBlock("str_birch_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //jungle_log_set
    public static final Block JUNGLE_LOG_STAIRS = registerBlock("jungle_log_stairs", (settings) -> new StairsBlock(Blocks.JUNGLE_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_BUTTON = registerBlock("jungle_log_button", (settings) -> new ButtonBlock(BlockSetType.JUNGLE, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_PRESSURE_PLATE = registerBlock("jungle_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_FENCE = registerBlock("jungle_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_FENCE_GATE = registerBlock("jungle_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_DOOR = registerBlock("jungle_log_door", (settings) -> new DoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_TRAPDOOR = registerBlock("jungle_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block JUNGLE_LOG_WALL = registerBlock("jungle_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_jungle_log_set
    public static final Block STR_JUNGLE_LOG_STAIRS = registerBlock("str_jungle_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_JUNGLE_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_SLAB = registerBlock("str_jungle_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_BUTTON = registerBlock("str_jungle_log_button", (settings) -> new ButtonBlock(BlockSetType.JUNGLE, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_PRESSURE_PLATE = registerBlock("str_jungle_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_FENCE = registerBlock("str_jungle_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_FENCE_GATE = registerBlock("str_jungle_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_DOOR = registerBlock("str_jungle_log_door", (settings) -> new DoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_TRAPDOOR = registerBlock("str_jungle_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_JUNGLE_LOG_WALL = registerBlock("str_jungle_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //acacia_log_set
    public static final Block ACACIA_LOG_STAIRS = registerBlock("acacia_log_stairs", (settings) -> new StairsBlock(Blocks.ACACIA_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_SLAB = registerBlock("acacia_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_BUTTON = registerBlock("acacia_log_button", (settings) -> new ButtonBlock(BlockSetType.ACACIA, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_PRESSURE_PLATE = registerBlock("acacia_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_FENCE = registerBlock("acacia_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_FENCE_GATE = registerBlock("acacia_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_DOOR = registerBlock("acacia_log_door", (settings) -> new DoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_TRAPDOOR = registerBlock("acacia_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block ACACIA_LOG_WALL = registerBlock("acacia_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_acacia_log_set
    public static final Block STR_ACACIA_LOG_STAIRS = registerBlock("str_acacia_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_ACACIA_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_SLAB = registerBlock("str_acacia_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_BUTTON = registerBlock("str_acacia_log_button", (settings) -> new ButtonBlock(BlockSetType.ACACIA, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_PRESSURE_PLATE = registerBlock("str_acacia_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_FENCE = registerBlock("str_acacia_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_FENCE_GATE = registerBlock("str_acacia_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_DOOR = registerBlock("str_acacia_log_door", (settings) -> new DoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_TRAPDOOR = registerBlock("str_acacia_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_ACACIA_LOG_WALL = registerBlock("str_acacia_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //dark_oak_log_set
    public static final Block DARK_OAK_LOG_STAIRS = registerBlock("dark_oak_log_stairs", (settings) -> new StairsBlock(Blocks.DARK_OAK_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_BUTTON = registerBlock("dark_oak_log_button", (settings) -> new ButtonBlock(BlockSetType.DARK_OAK, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_PRESSURE_PLATE = registerBlock("dark_oak_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_FENCE = registerBlock("dark_oak_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_FENCE_GATE = registerBlock("dark_oak_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_DOOR = registerBlock("dark_oak_log_door", (settings) -> new DoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_TRAPDOOR = registerBlock("dark_oak_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block DARK_OAK_LOG_WALL = registerBlock("dark_oak_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_dark_oak_log_set
    public static final Block STR_DARK_OAK_LOG_STAIRS = registerBlock("str_dark_oak_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_SLAB = registerBlock("str_dark_oak_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_BUTTON = registerBlock("str_dark_oak_log_button", (settings) -> new ButtonBlock(BlockSetType.DARK_OAK, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_PRESSURE_PLATE = registerBlock("str_dark_oak_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_FENCE = registerBlock("str_dark_oak_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_FENCE_GATE = registerBlock("str_dark_oak_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_DOOR = registerBlock("str_dark_oak_log_door", (settings) -> new DoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_TRAPDOOR = registerBlock("str_dark_oak_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_DARK_OAK_LOG_WALL = registerBlock("str_dark_oak_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //mangrove_log_set
    public static final Block MANGROVE_LOG_STAIRS = registerBlock("mangrove_log_stairs", (settings) -> new StairsBlock(Blocks.MANGROVE_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_BUTTON = registerBlock("mangrove_log_button", (settings) -> new ButtonBlock(BlockSetType.MANGROVE, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_PRESSURE_PLATE = registerBlock("mangrove_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_FENCE = registerBlock("mangrove_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_FENCE_GATE = registerBlock("mangrove_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_DOOR = registerBlock("mangrove_log_door", (settings) -> new DoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_TRAPDOOR = registerBlock("mangrove_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block MANGROVE_LOG_WALL = registerBlock("mangrove_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_mangrove_log_set
    public static final Block STR_MANGROVE_LOG_STAIRS = registerBlock("str_mangrove_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_MANGROVE_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_SLAB = registerBlock("str_mangrove_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_BUTTON = registerBlock("str_mangrove_log_button", (settings) -> new ButtonBlock(BlockSetType.MANGROVE, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_PRESSURE_PLATE = registerBlock("str_mangrove_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_FENCE = registerBlock("str_mangrove_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_FENCE_GATE = registerBlock("str_mangrove_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_DOOR = registerBlock("str_mangrove_log_door", (settings) -> new DoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_TRAPDOOR = registerBlock("str_mangrove_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_MANGROVE_LOG_WALL = registerBlock("str_mangrove_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //cherry_log_set
    public static final Block CHERRY_LOG_STAIRS = registerBlock("cherry_log_stairs", (settings) -> new StairsBlock(Blocks.CHERRY_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_SLAB = registerBlock("cherry_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_BUTTON = registerBlock("cherry_log_button", (settings) -> new ButtonBlock(BlockSetType.CHERRY, 10, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_PRESSURE_PLATE = registerBlock("cherry_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_FENCE = registerBlock("cherry_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_FENCE_GATE = registerBlock("cherry_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_DOOR = registerBlock("cherry_log_door", (settings) -> new DoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_TRAPDOOR = registerBlock("cherry_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CHERRY_LOG_WALL = registerBlock("cherry_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));

    //str_cherry_log_set
    public static final Block STR_CHERRY_LOG_STAIRS = registerBlock("str_cherry_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_CHERRY_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_SLAB = registerBlock("str_cherry_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_BUTTON = registerBlock("str_cherry_log_button", (settings) -> new ButtonBlock(BlockSetType.CHERRY, 10, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_PRESSURE_PLATE = registerBlock("str_cherry_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_FENCE = registerBlock("str_cherry_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_FENCE_GATE = registerBlock("str_cherry_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_DOOR = registerBlock("str_cherry_log_door", (settings) -> new DoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_TRAPDOOR = registerBlock("str_cherry_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block STR_CHERRY_LOG_WALL = registerBlock("str_cherry_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD));

    //pale_oak_log_set
    public static final Block PALE_OAK_LOG_STAIRS = registerBlock("pale_oak_log_stairs", (settings) -> new StairsBlock(Blocks.PALE_OAK_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_SLAB = registerBlock("pale_oak_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_BUTTON = registerBlock("pale_oak_log_button", (settings) -> new ButtonBlock(BlockSetType.PALE_OAK, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_PRESSURE_PLATE = registerBlock("pale_oak_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_FENCE = registerBlock("pale_oak_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_FENCE_GATE = registerBlock("pale_oak_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_DOOR = registerBlock("pale_oak_log_door", (settings) -> new DoorBlock(BlockSetType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_TRAPDOOR = registerBlock("pale_oak_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block PALE_OAK_LOG_WALL = registerBlock("pale_oak_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    //str_pale_oak_log_set
    public static final Block STR_PALE_OAK_LOG_STAIRS = registerBlock("str_pale_oak_log_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_PALE_OAK_LOG.getDefaultState(), settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_SLAB = registerBlock("str_pale_oak_log_slab", SlabBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_BUTTON = registerBlock("str_pale_oak_log_button", (settings) -> new ButtonBlock(BlockSetType.PALE_OAK, 10, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_PRESSURE_PLATE = registerBlock("str_pale_oak_log_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_FENCE = registerBlock("str_pale_oak_log_fence", FenceBlock::new, AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_FENCE_GATE = registerBlock("str_pale_oak_log_fence_gate", (settings) -> new FenceGateBlock(WoodType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_DOOR = registerBlock("str_pale_oak_log_door", (settings) -> new DoorBlock(BlockSetType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_TRAPDOOR = registerBlock("str_pale_oak_log_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.PALE_OAK, settings), AbstractBlock.Settings.copy(LOG_DEF));
    public static final Block STR_PALE_OAK_LOG_WALL = registerBlock("str_pale_oak_log_wall", WallBlock::new, AbstractBlock.Settings.copy(LOG_DEF));

    public static final Block NETHER_DEF = registerBlock("nether_def", Block::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM));

    //crimson_stem_set
    public static final Block CRIMSON_STEM_STAIRS = registerBlock("crimson_stem_stairs", (settings) -> new StairsBlock(Blocks.CRIMSON_STEM.getDefaultState(), settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab", SlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_BUTTON = registerBlock("crimson_stem_button", (settings) -> new ButtonBlock(BlockSetType.CRIMSON, 10, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_PRESSURE_PLATE = registerBlock("crimson_stem_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_FENCE = registerBlock("crimson_stem_fence", FenceBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_FENCE_GATE = registerBlock("crimson_stem_fence_gate", (settings) -> new FenceGateBlock(WoodType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_DOOR = registerBlock("crimson_stem_door", (settings) -> new DoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_TRAPDOOR = registerBlock("crimson_stem_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block CRIMSON_STEM_WALL = registerBlock("crimson_stem_wall", WallBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));

    //str_crimson_stem_set
    public static final Block STR_CRIMSON_STEM_STAIRS = registerBlock("str_crimson_stem_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_CRIMSON_STEM.getDefaultState(), settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_SLAB = registerBlock("str_crimson_stem_slab", SlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_BUTTON = registerBlock("str_crimson_stem_button", (settings) -> new ButtonBlock(BlockSetType.CRIMSON, 10, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_PRESSURE_PLATE = registerBlock("str_crimson_stem_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_FENCE = registerBlock("str_crimson_stem_fence", FenceBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_FENCE_GATE = registerBlock("str_crimson_stem_fence_gate", (settings) -> new FenceGateBlock(WoodType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_DOOR = registerBlock("str_crimson_stem_door", (settings) -> new DoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_TRAPDOOR = registerBlock("str_crimson_stem_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_CRIMSON_STEM_WALL = registerBlock("str_crimson_stem_wall", WallBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));

    //warped_stem_set
    public static final Block WARPED_STEM_STAIRS = registerBlock("warped_stem_stairs", (settings) -> new StairsBlock(Blocks.WARPED_STEM.getDefaultState(), settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_SLAB = registerBlock("warped_stem_slab", SlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_BUTTON = registerBlock("warped_stem_button", (settings) -> new ButtonBlock(BlockSetType.WARPED, 10, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_PRESSURE_PLATE = registerBlock("warped_stem_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_FENCE = registerBlock("warped_stem_fence", FenceBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_FENCE_GATE = registerBlock("warped_stem_fence_gate", (settings) -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_DOOR = registerBlock("warped_stem_door", (settings) -> new DoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_TRAPDOOR = registerBlock("warped_stem_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block WARPED_STEM_WALL = registerBlock("warped_stem_wall", WallBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));

    //str_warped_stem_set
    public static final Block STR_WARPED_STEM_STAIRS = registerBlock("str_warped_stem_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_WARPED_STEM.getDefaultState(), settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_SLAB = registerBlock("str_warped_stem_slab", SlabBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_BUTTON = registerBlock("str_warped_stem_button", (settings) -> new ButtonBlock(BlockSetType.WARPED, 10, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_PRESSURE_PLATE = registerBlock("str_warped_stem_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_FENCE = registerBlock("str_warped_stem_fence", FenceBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_FENCE_GATE = registerBlock("str_warped_stem_fence_gate", (settings) -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_DOOR = registerBlock("str_warped_stem_door", (settings) -> new DoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_TRAPDOOR = registerBlock("str_warped_stem_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(NETHER_DEF));
    public static final Block STR_WARPED_STEM_WALL = registerBlock("str_warped_stem_wall", WallBlock::new, AbstractBlock.Settings.copy(NETHER_DEF));


    //chiseled_copper
    public static final Block CHISELED_COPPER_STAIRS = registerBlock("chiseled_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_SLAB = registerBlock("chiseled_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_BUTTON = registerBlock("chiseled_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_PRESSURE_PLATE = registerBlock("chiseled_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_FENCE = registerBlock("chiseled_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_FENCE_GATE = registerBlock("chiseled_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_DOOR = registerBlock("chiseled_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_TRAPDOOR = registerBlock("chiseled_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));
    public static final Block CHISELED_COPPER_WALL = registerBlock("chiseled_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER));

    //copper_grate
    public static final Block COPPER_GRATE_STAIRS = registerBlock("copper_grate_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_SLAB = registerBlock("copper_grate_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_BUTTON = registerBlock("copper_grate_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_PRESSURE_PLATE = registerBlock("copper_grate_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_FENCE = registerBlock("copper_grate_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_FENCE_GATE = registerBlock("copper_grate_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_DOOR = registerBlock("copper_grate_door", (settings) -> new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_TRAPDOOR = registerBlock("copper_grate_trapdoor", (settings) -> new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));
    public static final Block COPPER_GRATE_WALL = registerBlock("copper_grate_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE));

    //exposed_chiseled_copper
    public static final Block EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("exposed_chiseled_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_SLAB = registerBlock("exposed_chiseled_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_BUTTON = registerBlock("exposed_chiseled_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("exposed_chiseled_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_FENCE = registerBlock("exposed_chiseled_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_FENCE_GATE = registerBlock("exposed_chiseled_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_DOOR = registerBlock("exposed_chiseled_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_TRAPDOOR = registerBlock("exposed_chiseled_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));
    public static final Block EXPOSED_CHISELED_COPPER_WALL = registerBlock("exposed_chiseled_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER));

    //exposed_copper_grate
    public static final Block EXPOSED_COPPER_GRATE_STAIRS = registerBlock("exposed_copper_grate_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_SLAB = registerBlock("exposed_copper_grate_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_BUTTON = registerBlock("exposed_copper_grate_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("exposed_copper_grate_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_FENCE = registerBlock("exposed_copper_grate_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_FENCE_GATE = registerBlock("exposed_copper_grate_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_DOOR = registerBlock("exposed_copper_grate_door", (settings) -> new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_TRAPDOOR = registerBlock("exposed_copper_grate_trapdoor", (settings) -> new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));
    public static final Block EXPOSED_COPPER_GRATE_WALL = registerBlock("exposed_copper_grate_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE));

    //weathered_chiseled_copper
    public static final Block WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("weathered_chiseled_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_SLAB = registerBlock("weathered_chiseled_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_BUTTON = registerBlock("weathered_chiseled_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("weathered_chiseled_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_FENCE = registerBlock("weathered_chiseled_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_FENCE_GATE = registerBlock("weathered_chiseled_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_DOOR = registerBlock("weathered_chiseled_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_TRAPDOOR = registerBlock("weathered_chiseled_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));
    public static final Block WEATHERED_CHISELED_COPPER_WALL = registerBlock("weathered_chiseled_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER));

    //weathered_copper_grate
    public static final Block WEATHERED_COPPER_GRATE_STAIRS = registerBlock("weathered_copper_grate_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_SLAB = registerBlock("weathered_copper_grate_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_BUTTON = registerBlock("weathered_copper_grate_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("weathered_copper_grate_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_FENCE = registerBlock("weathered_copper_grate_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_FENCE_GATE = registerBlock("weathered_copper_grate_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_DOOR = registerBlock("weathered_copper_grate_door", (settings) -> new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_TRAPDOOR = registerBlock("weathered_copper_grate_trapdoor", (settings) -> new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));
    public static final Block WEATHERED_COPPER_GRATE_WALL = registerBlock("weathered_copper_grate_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE));

    //oxidized_chiseled_copper
    public static final Block OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("oxidized_chiseled_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("oxidized_chiseled_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_BUTTON = registerBlock("oxidized_chiseled_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_chiseled_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_FENCE = registerBlock("oxidized_chiseled_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_FENCE_GATE = registerBlock("oxidized_chiseled_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_DOOR = registerBlock("oxidized_chiseled_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_TRAPDOOR = registerBlock("oxidized_chiseled_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));
    public static final Block OXIDIZED_CHISELED_COPPER_WALL = registerBlock("oxidized_chiseled_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER));

    //oxidized_copper_grate
    public static final Block OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("oxidized_copper_grate_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_SLAB = registerBlock("oxidized_copper_grate_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_BUTTON = registerBlock("oxidized_copper_grate_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("oxidized_copper_grate_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_FENCE = registerBlock("oxidized_copper_grate_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_FENCE_GATE = registerBlock("oxidized_copper_grate_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_DOOR = registerBlock("oxidized_copper_grate_door", (settings) -> new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_TRAPDOOR = registerBlock("oxidized_copper_grate_trapdoor", (settings) -> new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));
    public static final Block OXIDIZED_COPPER_GRATE_WALL = registerBlock("oxidized_copper_grate_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE));

    //waxed_chiseled_copper
    public static final Block WAXED_CHISELED_COPPER_STAIRS = registerBlock("waxed_chiseled_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_SLAB = registerBlock("waxed_chiseled_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_BUTTON = registerBlock("waxed_chiseled_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_chiseled_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_FENCE = registerBlock("waxed_chiseled_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_chiseled_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_DOOR = registerBlock("waxed_chiseled_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_chiseled_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));
    public static final Block WAXED_CHISELED_COPPER_WALL = registerBlock("waxed_chiseled_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER));

    //waxed_copper_grate
    public static final Block WAXED_COPPER_GRATE_STAIRS = registerBlock("waxed_copper_grate_stairs", (settings) -> new StairsBlock(Blocks.WAXED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_SLAB = registerBlock("waxed_copper_grate_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_BUTTON = registerBlock("waxed_copper_grate_button", (settings) -> new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_copper_grate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_FENCE = registerBlock("waxed_copper_grate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_copper_grate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_DOOR = registerBlock("waxed_copper_grate_door", (settings) -> new DoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_copper_grate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));
    public static final Block WAXED_COPPER_GRATE_WALL = registerBlock("waxed_copper_grate_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE));

    //waxed_exposed_chiseled_copper
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("waxed_exposed_chiseled_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_EXPOSED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_SLAB = registerBlock("waxed_exposed_chiseled_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_BUTTON = registerBlock("waxed_exposed_chiseled_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_chiseled_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_FENCE = registerBlock("waxed_exposed_chiseled_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_exposed_chiseled_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_DOOR = registerBlock("waxed_exposed_chiseled_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_chiseled_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_WALL = registerBlock("waxed_exposed_chiseled_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER));

    //waxed_exposed_copper_grate
    public static final Block WAXED_EXPOSED_COPPER_GRATE_STAIRS = registerBlock("waxed_exposed_copper_grate_stairs", (settings) -> new StairsBlock(Blocks.WAXED_EXPOSED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_SLAB = registerBlock("waxed_exposed_copper_grate_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_BUTTON = registerBlock("waxed_exposed_copper_grate_button", (settings) -> new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_grate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_FENCE = registerBlock("waxed_exposed_copper_grate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_exposed_copper_grate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_DOOR = registerBlock("waxed_exposed_copper_grate_door", (settings) -> new DoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_exposed_copper_grate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_WALL = registerBlock("waxed_exposed_copper_grate_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE));

    //waxed_weathered_chiseled_copper
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("waxed_weathered_chiseled_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_WEATHERED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_SLAB = registerBlock("waxed_weathered_chiseled_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_BUTTON = registerBlock("waxed_weathered_chiseled_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_chiseled_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_FENCE = registerBlock("waxed_weathered_chiseled_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_weathered_chiseled_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_DOOR = registerBlock("waxed_weathered_chiseled_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_chiseled_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_WALL = registerBlock("waxed_weathered_chiseled_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER));

    //waxed_weathered_copper_grate
    public static final Block WAXED_WEATHERED_COPPER_GRATE_STAIRS = registerBlock("waxed_weathered_copper_grate_stairs", (settings) -> new StairsBlock(Blocks.WAXED_WEATHERED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_SLAB = registerBlock("waxed_weathered_copper_grate_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_BUTTON = registerBlock("waxed_weathered_copper_grate_button", (settings) -> new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_grate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_FENCE = registerBlock("waxed_weathered_copper_grate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_weathered_copper_grate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_DOOR = registerBlock("waxed_weathered_copper_grate_door", (settings) -> new DoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_weathered_copper_grate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_WALL = registerBlock("waxed_weathered_copper_grate_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE));

    //waxed_oxidized_chiseled_copper
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("waxed_oxidized_chiseled_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_OXIDIZED_CHISELED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("waxed_oxidized_chiseled_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_BUTTON = registerBlock("waxed_oxidized_chiseled_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_chiseled_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_FENCE = registerBlock("waxed_oxidized_chiseled_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_oxidized_chiseled_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_DOOR = registerBlock("waxed_oxidized_chiseled_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_chiseled_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_WALL = registerBlock("waxed_oxidized_chiseled_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER));

    //waxed_oxidized_copper_grate
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("waxed_oxidized_copper_grate_stairs", (settings) -> new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER_GRATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_SLAB = registerBlock("waxed_oxidized_copper_grate_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_BUTTON = registerBlock("waxed_oxidized_copper_grate_button", (settings) -> new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_grate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_FENCE = registerBlock("waxed_oxidized_copper_grate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_oxidized_copper_grate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_DOOR = registerBlock("waxed_oxidized_copper_grate_door", (settings) -> new DoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_oxidized_copper_grate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_WALL = registerBlock("waxed_oxidized_copper_grate_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE));



    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
        Registry.register(Registries.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaBlocksPlus.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name));
    }
    
    public static void registerModBlocks2() {
    }
}

package net.fellter.vanillablocksplus.block;


import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.fellter.vanillablocksplus.custom_blocks.concrete_powder.*;
import net.fellter.vanillablocksplus.custom_blocks.copper.*;
import net.fellter.vanillablocksplus.custom_blocks.falling.*;
import net.fellter.vanillablocksplus.custom_blocks.glass.*;
import net.fellter.vanillablocksplus.custom_blocks.redstone.*;
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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //plank walls
    public static final Block OAK_WALL = registerBlock("oak_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_WALL = registerBlock("birch_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_WALL = registerBlock("acacia_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_WALL = registerBlock("dark_oak_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_WALL = registerBlock("mangrove_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_WALL = registerBlock("cherry_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block BAMBOO_WALL = registerBlock("bamboo_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_WALL = registerBlock("crimson_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_WALL = registerBlock("warped_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));


    //oak_wood_set
    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_BUTTON = registerBlock("oak_wood_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_DOOR = registerBlock("oak_wood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_TRAPDOOR = registerBlock("oak_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

    //str_oak_wood_set
    public static final Block STR_OAK_WOOD_STAIRS = registerBlock("str_oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_SLAB = registerBlock("str_oak_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_BUTTON = registerBlock("str_oak_wood_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_oak_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_FENCE = registerBlock("str_oak_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_FENCE_GATE = registerBlock("str_oak_wood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_DOOR = registerBlock("str_oak_wood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_TRAPDOOR = registerBlock("str_oak_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_WALL = registerBlock("str_oak_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    //spruce_wood_set
    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button",
            new ButtonBlock(BlockSetType.SPRUCE, 10, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_DOOR = registerBlock("spruce_wood_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_TRAPDOOR = registerBlock("spruce_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));

    //str_spruce_wood_set
    public static final Block STR_SPRUCE_WOOD_STAIRS = registerBlock("str_spruce_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_SLAB = registerBlock("str_spruce_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_BUTTON = registerBlock("str_spruce_wood_button",
            new ButtonBlock(BlockSetType.SPRUCE, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("str_spruce_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_FENCE = registerBlock("str_spruce_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_FENCE_GATE = registerBlock("str_spruce_wood_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_DOOR = registerBlock("str_spruce_wood_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_TRAPDOOR = registerBlock("str_spruce_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_WALL = registerBlock("str_spruce_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));

    //birch_wood_set
    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button",
            new ButtonBlock(BlockSetType.BIRCH, 10, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_DOOR = registerBlock("birch_wood_door",
            new DoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_TRAPDOOR = registerBlock("birch_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));

    //str_birch_wood_set
    public static final Block STR_BIRCH_WOOD_STAIRS = registerBlock("str_birch_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_SLAB = registerBlock("str_birch_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_BUTTON = registerBlock("str_birch_wood_button",
            new ButtonBlock(BlockSetType.BIRCH, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_PRESSURE_PLATE = registerBlock("str_birch_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_FENCE = registerBlock("str_birch_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_FENCE_GATE = registerBlock("str_birch_wood_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_DOOR = registerBlock("str_birch_wood_door",
            new DoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_TRAPDOOR = registerBlock("str_birch_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_WALL = registerBlock("str_birch_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    //jungle_wood_set
    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button",
            new ButtonBlock(BlockSetType.JUNGLE, 10, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_DOOR = registerBlock("jungle_wood_door",
            new DoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_TRAPDOOR = registerBlock("jungle_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));

    //str_jungle_wood_set
    public static final Block STR_JUNGLE_WOOD_STAIRS = registerBlock("str_jungle_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_SLAB = registerBlock("str_jungle_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_BUTTON = registerBlock("str_jungle_wood_button",
            new ButtonBlock(BlockSetType.JUNGLE, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("str_jungle_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_FENCE = registerBlock("str_jungle_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_FENCE_GATE = registerBlock("str_jungle_wood_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_DOOR = registerBlock("str_jungle_wood_door",
            new DoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_TRAPDOOR = registerBlock("str_jungle_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_WALL = registerBlock("str_jungle_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));

    //acacia_wood_set
    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button",
            new ButtonBlock(BlockSetType.ACACIA, 10, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_DOOR = registerBlock("acacia_wood_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_TRAPDOOR = registerBlock("acacia_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));

    //str_acacia_wood_set
    public static final Block STR_ACACIA_WOOD_STAIRS = registerBlock("str_acacia_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_SLAB = registerBlock("str_acacia_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_BUTTON = registerBlock("str_acacia_wood_button",
            new ButtonBlock(BlockSetType.ACACIA, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_PRESSURE_PLATE = registerBlock("str_acacia_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_FENCE = registerBlock("str_acacia_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_FENCE_GATE = registerBlock("str_acacia_wood_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_DOOR = registerBlock("str_acacia_wood_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_TRAPDOOR = registerBlock("str_acacia_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_WALL = registerBlock("str_acacia_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));

    //dark_oak_wood_set
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button",
            new ButtonBlock(BlockSetType.DARK_OAK, 10, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_DOOR = registerBlock("dark_oak_wood_door",
            new DoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_TRAPDOOR = registerBlock("dark_oak_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));

    //str_dark_oak_wood_set
    public static final Block STR_DARK_OAK_WOOD_STAIRS = registerBlock("str_dark_oak_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_SLAB = registerBlock("str_dark_oak_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_BUTTON = registerBlock("str_dark_oak_wood_button",
            new ButtonBlock(BlockSetType.DARK_OAK, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_dark_oak_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_FENCE = registerBlock("str_dark_oak_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_FENCE_GATE = registerBlock("str_dark_oak_wood_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_DOOR = registerBlock("str_dark_oak_wood_door",
            new DoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_TRAPDOOR = registerBlock("str_dark_oak_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_WALL = registerBlock("str_dark_oak_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    //mangrove_wood_set
    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button",
            new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_DOOR = registerBlock("mangrove_wood_door",
            new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_TRAPDOOR = registerBlock("mangrove_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));

    //str_mangrove_wood_set
    public static final Block STR_MANGROVE_WOOD_STAIRS = registerBlock("str_mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_SLAB = registerBlock("str_mangrove_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_BUTTON = registerBlock("str_mangrove_wood_button",
            new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("str_mangrove_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_FENCE = registerBlock("str_mangrove_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_FENCE_GATE = registerBlock("str_mangrove_wood_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_DOOR = registerBlock("str_mangrove_wood_door",
            new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_TRAPDOOR = registerBlock("str_mangrove_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_WALL = registerBlock("str_mangrove_wood_wall",
            new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //cherry_wood_set
    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button",
            new ButtonBlock(BlockSetType.CHERRY, 10, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_DOOR = registerBlock("cherry_wood_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_TRAPDOOR = registerBlock("cherry_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));

    //str_cherry_wood_set
    public static final Block STR_CHERRY_WOOD_STAIRS = registerBlock("str_cherry_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_CHERRY_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_SLAB = registerBlock("str_cherry_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_BUTTON = registerBlock("str_cherry_wood_button",
            new ButtonBlock(BlockSetType.CHERRY, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_PRESSURE_PLATE = registerBlock("str_cherry_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_FENCE = registerBlock("str_cherry_wood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_FENCE_GATE = registerBlock("str_cherry_wood_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_DOOR = registerBlock("str_cherry_wood_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_TRAPDOOR = registerBlock("str_cherry_wood_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_WALL = registerBlock("str_cherry_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));

    //bamboo_wood_set
    public static final Block BAMBOO_BLOCK_STAIRS = registerBlock("bamboo_block_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_SLAB = registerBlock("bamboo_block_slab",
            new SlabBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_BUTTON = registerBlock("bamboo_block_button",
            new ButtonBlock(ModBlockSetType.BAMBOO_WOOD, 10, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("bamboo_block_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.BAMBOO_WOOD, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_FENCE = registerBlock("bamboo_block_fence",
            new FenceBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_FENCE_GATE = registerBlock("bamboo_block_fence_gate",
            new FenceGateBlock(ModWoodType.BAMBOO_WOOD, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_DOOR = registerBlock("bamboo_block_door",
            new DoorBlock(ModBlockSetType.BAMBOO_WOOD, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_TRAPDOOR = registerBlock("bamboo_block_trapdoor",
            new TrapdoorBlock(ModBlockSetType.BAMBOO_WOOD, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block BAMBOO_BLOCK_WALL = registerBlock("bamboo_block_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));

    //str_bamboo_wood_set
    public static final Block STR_BAMBOO_BLOCK_STAIRS = registerBlock("str_bamboo_block_stairs",
            new StairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_SLAB = registerBlock("str_bamboo_block_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_BUTTON = registerBlock("str_bamboo_block_button",
            new ButtonBlock(ModBlockSetType.BAMBOO_WOOD, 10, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("str_bamboo_block_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.BAMBOO_WOOD, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_FENCE = registerBlock("str_bamboo_block_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_FENCE_GATE = registerBlock("str_bamboo_block_fence_gate",
            new FenceGateBlock(ModWoodType.BAMBOO_WOOD, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_DOOR = registerBlock("str_bamboo_block_door",
            new DoorBlock(ModBlockSetType.BAMBOO_WOOD, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_TRAPDOOR = registerBlock("str_bamboo_block_trapdoor",
            new TrapdoorBlock(ModBlockSetType.BAMBOO_WOOD, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_WALL = registerBlock("str_bamboo_block_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD)));

    //crimson_hyphae_set
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_BUTTON = registerBlock("crimson_hyphae_button",
            new ButtonBlock(BlockSetType.CRIMSON, 10, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_hyphae_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_DOOR = registerBlock("crimson_hyphae_door",
            new DoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_TRAPDOOR = registerBlock("crimson_hyphae_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));

    //str_crimson_hyphae_set
    public static final Block STR_CRIMSON_HYPHAE_STAIRS = registerBlock("str_crimson_hyphae_stairs",
            new StairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_SLAB = registerBlock("str_crimson_hyphae_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_BUTTON = registerBlock("str_crimson_hyphae_button",
            new ButtonBlock(BlockSetType.CRIMSON, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("str_crimson_hyphae_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_FENCE = registerBlock("str_crimson_hyphae_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_FENCE_GATE = registerBlock("str_crimson_hyphae_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_DOOR = registerBlock("str_crimson_hyphae_door",
            new DoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_TRAPDOOR = registerBlock("str_crimson_hyphae_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_WALL = registerBlock("str_crimson_hyphae_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));

    //warped_hyphae_set
    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_BUTTON = registerBlock("warped_hyphae_button",
            new ButtonBlock(BlockSetType.WARPED, 10, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_hyphae_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            new FenceGateBlock(WoodType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_DOOR = registerBlock("warped_hyphae_door",
            new DoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_TRAPDOOR = registerBlock("warped_hyphae_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));

    //str_warped_hyphae_set
    public static final Block STR_WARPED_HYPHAE_STAIRS = registerBlock("str_warped_hyphae_stairs",
            new StairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_SLAB = registerBlock("str_warped_hyphae_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_BUTTON = registerBlock("str_warped_hyphae_button",
            new ButtonBlock(BlockSetType.WARPED, 10, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("str_warped_hyphae_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_FENCE = registerBlock("str_warped_hyphae_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_FENCE_GATE = registerBlock("str_warped_hyphae_fence_gate",
            new FenceGateBlock(WoodType.WARPED, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_DOOR = registerBlock("str_warped_hyphae_door",
            new DoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_TRAPDOOR = registerBlock("str_warped_hyphae_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_TRAPDOOR)));
    public static final Block STR_WARPED_HYPHAE_WALL = registerBlock("str_warped_hyphae_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));

    //stone
    public static final Block STONE_FENCE = registerBlock("stone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block STONE_FENCE_GATE = registerBlock("stone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_DOOR = registerBlock("stone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));

    //cobblestone
    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));
    public static final Block COBBLESTONE_FENCE_GATE = registerBlock("cobblestone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLESTONE_DOOR = registerBlock("cobblestone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));
    public static final Block COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    //mossy_cobblestone
    public static final Block MOSSY_COBBLESTONE_FENCE = registerBlock("mossy_cobblestone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("mossy_cobblestone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_COBBLESTONE_DOOR = registerBlock("mossy_cobblestone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_TRAPDOOR = registerBlock("mossy_cobblestone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));

    //smooth_stone
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_FENCE = registerBlock("smooth_stone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_FENCE_GATE = registerBlock("smooth_stone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));

    //stone_bricks
    public static final Block STONE_BRICKS_FENCE = registerBlock("stone_bricks_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_FENCE_GATE = registerBlock("stone_bricks_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_BRICKS_DOOR = registerBlock("stone_bricks_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_TRAPDOOR = registerBlock("stone_bricks_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_BUTTON = registerBlock("stone_bricks_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_PRESSURE_PLATE = registerBlock("stone_bricks_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));

    //cracked_stone_bricks_set
    public static final Block CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs",
            new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_BUTTON = registerBlock("cracked_stone_bricks_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_stone_bricks_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_FENCE = registerBlock("cracked_stone_bricks_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_FENCE_GATE = registerBlock("cracked_stone_bricks_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_DOOR = registerBlock("cracked_stone_bricks_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_TRAPDOOR = registerBlock("cracked_stone_bricks_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));

    //granite_set
    public static final Block GRANITE_BUTTON = registerBlock("granite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_FENCE = registerBlock("granite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_FENCE_GATE = registerBlock("granite_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_DOOR = registerBlock("granite_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_TRAPDOOR = registerBlock("granite_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRANITE)));

    //polished_granite_set
    public static final Block POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_FENCE = registerBlock("polished_granite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_FENCE_GATE = registerBlock("polished_granite_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_DOOR = registerBlock("polished_granite_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_TRAPDOOR = registerBlock("polished_granite_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));

    //diorite_set
    public static final Block DIORITE_BUTTON = registerBlock("diorite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_FENCE = registerBlock("diorite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_FENCE_GATE = registerBlock("diorite_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_DOOR = registerBlock("diorite_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIORITE)));

    //polished_diorite_set
    public static final Block POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_FENCE = registerBlock("polished_diorite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_FENCE_GATE = registerBlock("polished_diorite_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_DOOR = registerBlock("polished_diorite_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_TRAPDOOR = registerBlock("polished_diorite_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));

    //andesite_set
    public static final Block ANDESITE_BUTTON = registerBlock("andesite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_FENCE = registerBlock("andesite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_FENCE_GATE = registerBlock("andesite_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_DOOR = registerBlock("andesite_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ANDESITE)));

    //polished_andesite_set
    public static final Block POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_FENCE = registerBlock("polished_andesite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_FENCE_GATE = registerBlock("polished_andesite_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_DOOR = registerBlock("polished_andesite_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_TRAPDOOR = registerBlock("polished_andesite_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));

    //deepslate_set
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_FENCE = registerBlock("deepslate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_FENCE_GATE = registerBlock("deepslate_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_DOOR = registerBlock("deepslate_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_TRAPDOOR = registerBlock("deepslate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));

    //cobbled_deepslate_set
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block COBBLED_DEEPSLATE_FENCE = registerBlock("cobbled_deepslate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block COBBLED_DEEPSLATE_FENCE_GATE = registerBlock("cobbled_deepslate_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)));

    //chiseled_deepslate_set
    public static final Block CHISELED_DEEPSLATE_STAIRS = registerBlock("chiseled_deepslate_stairs",
            new StairsBlock(Blocks.CHISELED_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_SLAB = registerBlock("chiseled_deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_BUTTON = registerBlock("chiseled_deepslate_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_PRESSURE_PLATE = registerBlock("chiseled_deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_FENCE = registerBlock("chiseled_deepslate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_FENCE_GATE = registerBlock("chiseled_deepslate_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_DOOR = registerBlock("chiseled_deepslate_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_TRAPDOOR = registerBlock("chiseled_deepslate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_WALL = registerBlock("chiseled_deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.DEEPSLATE_WALL)));

    //polished_deepslate_set
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_FENCE = registerBlock("polished_deepslate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_FENCE_GATE = registerBlock("polished_deepslate_fence_gate",
            new FenceGateBlock(ModWoodType.POLISHED_DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door",
            new DoorBlock(ModBlockSetType.POLISHED_DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.POLISHED_DEEPSLATE, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));

    //deepslate_bricks_set
    public static final Block DEEPSLATE_BRICKS_BUTTON = registerBlock("deepslate_bricks_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE_BRICKS, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("deepslate_bricks_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_FENCE = registerBlock("deepslate_bricks_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("deepslate_bricks_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_DOOR = registerBlock("deepslate_bricks_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("deepslate_bricks_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));

    //cracked_deepslate_bricks_set
    public static final Block CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("cracked_deepslate_bricks_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("cracked_deepslate_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_BUTTON = registerBlock("cracked_deepslate_bricks_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE_BRICKS, 10, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_deepslate_bricks_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE = registerBlock("cracked_deepslate_bricks_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("cracked_deepslate_bricks_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_DOOR = registerBlock("cracked_deepslate_bricks_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("cracked_deepslate_bricks_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_WALL = registerBlock("cracked_deepslate_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));

    //deepslate_tiles_set
    public static final Block DEEPSLATE_TILES_BUTTON = registerBlock("deepslate_tiles_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE_TILES, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("deepslate_tiles_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_FENCE = registerBlock("deepslate_tiles_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_FENCE_GATE = registerBlock("deepslate_tiles_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_DOOR = registerBlock("deepslate_tiles_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_TRAPDOOR = registerBlock("deepslate_tiles_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)));

    //cracked_deepslate_tiles_set
    public static final Block CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("cracked_deepslate_tiles_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("cracked_deepslate_tiles_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_BUTTON = registerBlock("cracked_deepslate_tiles_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE_TILES, 10, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("cracked_deepslate_tiles_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_FENCE = registerBlock("cracked_deepslate_tiles_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_FENCE_GATE = registerBlock("cracked_deepslate_tiles_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_DOOR = registerBlock("cracked_deepslate_tiles_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_TRAPDOOR = registerBlock("cracked_deepslate_tiles_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE_TILES, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES_WALL = registerBlock("cracked_deepslate_tiles_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));

    //bricks_set
    public static final Block BRICK_BUTTON = registerBlock("brick_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block BRICK_PRESSURE_PLATE = registerBlock("brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block BRICK_FENCE = registerBlock("brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block BRICK_FENCE_GATE = registerBlock("brick_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block BRICK_DOOR = registerBlock("brick_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block BRICK_TRAPDOOR = registerBlock("brick_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRICKS)));

    //packed_mud_set
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_BUTTON = registerBlock("packed_mud_button",
            new ButtonBlock(ModBlockSetType.PACKED_MUD, 10, AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_PRESSURE_PLATE = registerBlock("packed_mud_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.PACKED_MUD, AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_FENCE = registerBlock("packed_mud_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_FENCE_GATE = registerBlock("packed_mud_fence_gate",
            new FenceGateBlock(ModWoodType.PACKED_MUD, AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_DOOR = registerBlock("packed_mud_door",
            new DoorBlock(ModBlockSetType.PACKED_MUD, AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_TRAPDOOR = registerBlock("packed_mud_trapdoor",
            new TrapdoorBlock(ModBlockSetType.PACKED_MUD, AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));

    //mud_bricks_set
    public static final Block MUD_BRICK_BUTTON = registerBlock("mud_brick_button",
            new ButtonBlock(ModBlockSetType.MUD_BRICKS, 10, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICK_PRESSURE_PLATE = registerBlock("mud_brick_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.MUD_BRICKS, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICK_FENCE = registerBlock("mud_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICK_FENCE_GATE = registerBlock("mud_brick_fence_gate",
            new FenceGateBlock(ModWoodType.MUD_BRICKS, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICK_DOOR = registerBlock("mud_brick_door",
            new DoorBlock(ModBlockSetType.MUD_BRICKS, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICK_TRAPDOOR = registerBlock("mud_brick_trapdoor",
            new TrapdoorBlock(ModBlockSetType.MUD_BRICKS, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));

    //sandstone_set
    public static final Block SANDSTONE_BUTTON = registerBlock("sandstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_FENCE = registerBlock("sandstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_FENCE_GATE = registerBlock("sandstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_DOOR = registerBlock("sandstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_TRAPDOOR = registerBlock("sandstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SANDSTONE)));

    //smooth_sandstone_set
    public static final Block SMOOTH_SANDSTONE_BUTTON = registerBlock("smooth_sandstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_sandstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_FENCE = registerBlock("smooth_sandstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_FENCE_GATE = registerBlock("smooth_sandstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_DOOR = registerBlock("smooth_sandstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_TRAPDOOR = registerBlock("smooth_sandstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));

    //cut_sandstone_set
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_BUTTON = registerBlock("cut_sandstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_sandstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_FENCE = registerBlock("cut_sandstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_FENCE_GATE = registerBlock("cut_sandstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_DOOR = registerBlock("cut_sandstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_TRAPDOOR = registerBlock("cut_sandstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));

    //red_sandstone_set
    public static final Block RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_FENCE = registerBlock("red_sandstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_FENCE_GATE = registerBlock("red_sandstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_DOOR = registerBlock("red_sandstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TRAPDOOR = registerBlock("red_sandstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));

    //smooth_red_sandstone_set
    public static final Block SMOOTH_RED_SANDSTONE_BUTTON = registerBlock("smooth_red_sandstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_red_sandstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE = registerBlock("smooth_red_sandstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE_GATE = registerBlock("smooth_red_sandstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_DOOR = registerBlock("smooth_red_sandstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_TRAPDOOR = registerBlock("smooth_red_sandstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));

    //cut_red_sandstone_set
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_BUTTON = registerBlock("cut_red_sandstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_red_sandstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_FENCE = registerBlock("cut_red_sandstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_FENCE_GATE = registerBlock("cut_red_sandstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_DOOR = registerBlock("cut_red_sandstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_TRAPDOOR = registerBlock("cut_red_sandstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));

    //sea_lantern_set
    public static final Block SEA_LANTERN_STAIRS = registerBlock("sea_lantern_stairs",
            new StairsBlock(Blocks.SEA_LANTERN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_BUTTON = registerBlock("sea_lantern_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_PRESSURE_PLATE = registerBlock("sea_lantern_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_FENCE = registerBlock("sea_lantern_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_FENCE_GATE = registerBlock("sea_lantern_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_DOOR = registerBlock("sea_lantern_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_TRAPDOOR = registerBlock("sea_lantern_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
    public static final Block SEA_LANTERN_WALL = registerBlock("sea_lantern_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));

    //prismarine_set
    public static final Block PRISMARINE_BUTTON = registerBlock("prismarine_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_FENCE = registerBlock("prismarine_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_FENCE_GATE = registerBlock("prismarine_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_DOOR = registerBlock("prismarine_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE)));
    public static final Block PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE)));

    //prismarine_set
    public static final Block PRISMARINE_BRICK_BUTTON = registerBlock("prismarine_brick_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_PRESSURE_PLATE = registerBlock("prismarine_brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_FENCE = registerBlock("prismarine_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_FENCE_GATE = registerBlock("prismarine_brick_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_DOOR = registerBlock("prismarine_brick_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_TRAPDOOR = registerBlock("prismarine_brick_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));

    //dark_prismarine_set
    public static final Block DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_FENCE = registerBlock("dark_prismarine_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_FENCE_GATE = registerBlock("dark_prismarine_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_DOOR = registerBlock("dark_prismarine_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TRAPDOOR = registerBlock("dark_prismarine_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));

    //netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_BUTTON = registerBlock("netherrack_button",
            new ButtonBlock(ModBlockSetType.NETHERRACK, 10, AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_PRESSURE_PLATE = registerBlock("netherrack_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHERRACK, AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_FENCE = registerBlock("netherrack_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_FENCE_GATE = registerBlock("netherrack_fence_gate",
            new FenceGateBlock(ModWoodType.NETHERRACK, AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_DOOR = registerBlock("netherrack_door",
            new DoorBlock(ModBlockSetType.NETHERRACK, AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_TRAPDOOR = registerBlock("netherrack_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHERRACK, AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));

    //nether_bricks
    public static final Block NETHER_BRICK_BUTTON = registerBlock("nether_brick_button",
            new ButtonBlock(ModBlockSetType.NETHER_BRICKS, 10, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICK_PRESSURE_PLATE = registerBlock("nether_brick_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(ModWoodType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICK_DOOR = registerBlock("nether_brick_door",
            new DoorBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICK_TRAPDOOR = registerBlock("nether_brick_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));

    //cracked_nether_bricks
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            new StairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_BUTTON = registerBlock("cracked_nether_brick_button",
            new ButtonBlock(ModBlockSetType.NETHER_BRICKS, 10, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("cracked_nether_brick_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = registerBlock("cracked_nether_brick_fence_gate",
            new FenceGateBlock(ModWoodType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_DOOR = registerBlock("cracked_nether_brick_door",
            new DoorBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_TRAPDOOR = registerBlock("cracked_nether_brick_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));

    //red_nether_bricks
    public static final Block RED_NETHER_BRICK_BUTTON = registerBlock("red_nether_brick_button",
            new ButtonBlock(ModBlockSetType.NETHER_BRICKS, 10, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("red_nether_brick_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(ModWoodType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_DOOR = registerBlock("red_nether_brick_door",
            new DoorBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_TRAPDOOR = registerBlock("red_nether_brick_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHER_BRICKS, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));

    //basalt
    public static final Block BASALT_STAIRS = registerBlock("basalt_stairs",
            new StairsBlock(Blocks.BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_SLAB = registerBlock("basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_BUTTON = registerBlock("basalt_button",
            new ButtonBlock(ModBlockSetType.BASALT, 10, AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_PRESSURE_PLATE = registerBlock("basalt_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_FENCE = registerBlock("basalt_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_FENCE_GATE = registerBlock("basalt_fence_gate",
            new FenceGateBlock(ModWoodType.BASALT, AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_DOOR = registerBlock("basalt_door",
            new DoorBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_TRAPDOOR = registerBlock("basalt_trapdoor",
            new TrapdoorBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_WALL = registerBlock("basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    //smooth_basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_BUTTON = registerBlock("smooth_basalt_button",
            new ButtonBlock(ModBlockSetType.BASALT, 10, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE = registerBlock("smooth_basalt_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_FENCE_GATE = registerBlock("smooth_basalt_fence_gate",
            new FenceGateBlock(ModWoodType.BASALT, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_DOOR = registerBlock("smooth_basalt_door",
            new DoorBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_TRAPDOOR = registerBlock("smooth_basalt_trapdoor",
            new TrapdoorBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));

    //polished_basalt
    public static final Block POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            new StairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_BUTTON = registerBlock("polished_basalt_button",
            new ButtonBlock(ModBlockSetType.BASALT, 10, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_PRESSURE_PLATE = registerBlock("polished_basalt_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_FENCE = registerBlock("polished_basalt_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_FENCE_GATE = registerBlock("polished_basalt_fence_gate",
            new FenceGateBlock(ModWoodType.BASALT, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_DOOR = registerBlock("polished_basalt_door",
            new DoorBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_TRAPDOOR = registerBlock("polished_basalt_trapdoor",
            new TrapdoorBlock(ModBlockSetType.BASALT, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));

    //blackstone
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block BLACKSTONE_FENCE = registerBlock("blackstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block BLACKSTONE_FENCE_GATE = registerBlock("blackstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block BLACKSTONE_DOOR = registerBlock("blackstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));

    //gilded_blackstone
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            new ButtonBlock(ModBlockSetType.GILDED_BLACKSTONE, 10, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_PRESSURE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GILDED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_FENCE = registerBlock("gilded_blackstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_FENCE_GATE = registerBlock("gilded_blackstone_fence_gate",
            new FenceGateBlock(ModWoodType.GILDED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_DOOR = registerBlock("gilded_blackstone_door",
            new DoorBlock(ModBlockSetType.GILDED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_TRAPDOOR = registerBlock("gilded_blackstone_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GILDED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));

    //polished_blackstone
    public static final Block POLISHED_BLACKSTONE_FENCE = registerBlock("polished_blackstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_FENCE_GATE = registerBlock("polished_blackstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_DOOR = registerBlock("polished_blackstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TRAPDOOR = registerBlock("polished_blackstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));

    //gilded_blackstone
    public static final Block POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("polished_blackstone_brick_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("polished_blackstone_brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("polished_blackstone_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("polished_blackstone_brick_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_DOOR = registerBlock("polished_blackstone_brick_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_TRAPDOOR = registerBlock("polished_blackstone_brick_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));

    //cracked_polished_blackstone_bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("cracked_polished_blackstone_brick_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("cracked_polished_blackstone_brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("cracked_polished_blackstone_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("cracked_polished_blackstone_brick_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR = registerBlock("cracked_polished_blackstone_brick_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR = registerBlock("cracked_polished_blackstone_brick_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    //end_stone
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_BUTTON = registerBlock("end_stone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_PRESSURE_PLATE = registerBlock("end_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_FENCE = registerBlock("end_stone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_FENCE_GATE = registerBlock("end_stone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_DOOR = registerBlock("end_stone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));

    //end_stone_brick
    public static final Block END_STONE_BRICK_BUTTON = registerBlock("end_stone_brick_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICK_FENCE = registerBlock("end_stone_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICK_FENCE_GATE = registerBlock("end_stone_brick_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICK_DOOR = registerBlock("end_stone_brick_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICK_TRAPDOOR = registerBlock("end_stone_brick_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));

    //purpur_block
    public static final Block PURPUR_BUTTON = registerBlock("purpur_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_PRESSURE_PLATE = registerBlock("purpur_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_FENCE = registerBlock("purpur_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_FENCE_GATE = registerBlock("purpur_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_DOOR = registerBlock("purpur_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TRAPDOOR = registerBlock("purpur_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));

    //coal
    public static final Block COAL_STAIRS = registerBlock("coal_stairs",
            new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_SLAB = registerBlock("coal_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_BUTTON = registerBlock("coal_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_PRESSURE_PLATE = registerBlock("coal_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_FENCE = registerBlock("coal_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_FENCE_GATE = registerBlock("coal_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_DOOR = registerBlock("coal_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_TRAPDOOR = registerBlock("coal_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
    public static final Block COAL_WALL = registerBlock("coal_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));

    //iron
    public static final Block IRON_STAIRS = registerBlock("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_FENCE = registerBlock("iron_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_FENCE_GATE = registerBlock("iron_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_WALL = registerBlock("iron_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    //gold
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_FENCE = registerBlock("gold_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_FENCE_GATE = registerBlock("gold_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_WALL = registerBlock("gold_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

    //redstone
    public static final Block REDSTONE_STAIRS = registerBlock("redstone_stairs",
            new StairsBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_SLAB = registerBlock("redstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_BUTTON = registerBlock("redstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_PRESSURE_PLATE = registerBlock("redstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_FENCE = registerBlock("redstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_FENCE_GATE = registerBlock("redstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_DOOR = registerBlock("redstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_TRAPDOOR = registerBlock("redstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_WALL = registerBlock("redstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));

    //emerald
    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_BUTTON = registerBlock("emerald_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_PRESSURE_PLATE = registerBlock("emerald_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_FENCE = registerBlock("emerald_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_FENCE_GATE = registerBlock("emerald_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_DOOR = registerBlock("emerald_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_TRAPDOOR = registerBlock("emerald_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_WALL = registerBlock("emerald_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    //lapis
    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs",
            new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_BUTTON = registerBlock("lapis_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_PRESSURE_PLATE = registerBlock("lapis_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_FENCE = registerBlock("lapis_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_FENCE_GATE = registerBlock("lapis_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_DOOR = registerBlock("lapis_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_TRAPDOOR = registerBlock("lapis_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_WALL = registerBlock("lapis_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));

    //diamond
    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs",
            new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_BUTTON = registerBlock("diamond_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_PRESSURE_PLATE = registerBlock("diamond_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_FENCE = registerBlock("diamond_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_FENCE_GATE = registerBlock("diamond_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_DOOR = registerBlock("diamond_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_TRAPDOOR = registerBlock("diamond_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_WALL = registerBlock("diamond_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));

    //netherite
    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_BUTTON = registerBlock("netherite_button",
            new ButtonBlock(ModBlockSetType.NETHERITE, 10, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_PRESSURE_PLATE = registerBlock("netherite_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHERITE, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_FENCE = registerBlock("netherite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_FENCE_GATE = registerBlock("netherite_fence_gate",
            new FenceGateBlock(ModWoodType.NETHERITE, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_DOOR = registerBlock("netherite_door",
            new DoorBlock(ModBlockSetType.NETHERITE, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_TRAPDOOR = registerBlock("netherite_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHERITE, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));

    //quartz
    public static final Block QUARTZ_BUTTON = registerBlock("quartz_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_FENCE = registerBlock("quartz_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_FENCE_GATE = registerBlock("quartz_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_DOOR = registerBlock("quartz_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_TRAPDOOR = registerBlock("quartz_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));

    //quartz_brick
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_BUTTON = registerBlock("quartz_brick_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_PRESSURE_PLATE = registerBlock("quartz_brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_FENCE = registerBlock("quartz_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_FENCE_GATE = registerBlock("quartz_brick_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_DOOR = registerBlock("quartz_brick_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_TRAPDOOR = registerBlock("quartz_brick_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));

    //smooth_quartz
    public static final Block SMOOTH_QUARTZ_BUTTON = registerBlock("smooth_quartz_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_PRESSURE_PLATE = registerBlock("smooth_quartz_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_FENCE = registerBlock("smooth_quartz_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_FENCE_GATE = registerBlock("smooth_quartz_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_DOOR = registerBlock("smooth_quartz_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_TRAPDOOR = registerBlock("smooth_quartz_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));

    //amethyst
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BUTTON = registerBlock("amethyst_button",
            new ButtonBlock(ModBlockSetType.AMETHYST_BLOCK, 10, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.AMETHYST_BLOCK, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_FENCE = registerBlock("amethyst_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_FENCE_GATE = registerBlock("amethyst_fence_gate",
            new FenceGateBlock(ModWoodType.AMETHYST_BLOCK, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_DOOR = registerBlock("amethyst_door",
            new DoorBlock(ModBlockSetType.AMETHYST_BLOCK, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor",
            new TrapdoorBlock(ModBlockSetType.AMETHYST_BLOCK, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));

    //copper
    public static final Block COPPER_STAIRS = registerBlock("copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_SLAB = registerBlock("copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_FENCE = registerBlock("copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_FENCE_GATE = registerBlock("copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_WALL = registerBlock("copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));

    //cut_copper
    public static final Block CUT_COPPER_BUTTON = registerBlock("cut_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_PRESSURE_PLATE = registerBlock("cut_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_FENCE = registerBlock("cut_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_FENCE_GATE = registerBlock("cut_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_DOOR = registerBlock("cut_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_TRAPDOOR = registerBlock("cut_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_WALL = registerBlock("cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));

    //exposed_copper
    public static final Block EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
    public static final Block EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
    public static final Block EXPOSED_COPPER_FENCE = registerBlock("exposed_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
    public static final Block EXPOSED_COPPER_FENCE_GATE = registerBlock("exposed_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
    public static final Block EXPOSED_COPPER_WALL = registerBlock("exposed_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));

    //exposed_cut_copper
    public static final Block EXPOSED_CUT_COPPER_BUTTON = registerBlock("exposed_cut_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_PRESSURE_PLATE = registerBlock("exposed_cut_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_FENCE = registerBlock("exposed_cut_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_FENCE_GATE = registerBlock("exposed_cut_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_DOOR = registerBlock("exposed_cut_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_TRAPDOOR = registerBlock("exposed_cut_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_WALL = registerBlock("exposed_cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));

    //weathered_copper
    public static final Block WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
    public static final Block WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
    public static final Block WEATHERED_COPPER_FENCE = registerBlock("weathered_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
    public static final Block WEATHERED_COPPER_FENCE_GATE = registerBlock("weathered_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
    public static final Block WEATHERED_COPPER_WALL = registerBlock("weathered_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));

    //weathered_cut_copper
    public static final Block WEATHERED_CUT_COPPER_BUTTON = registerBlock("weathered_cut_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_PRESSURE_PLATE = registerBlock("weathered_cut_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_FENCE = registerBlock("weathered_cut_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_FENCE_GATE = registerBlock("weathered_cut_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_DOOR = registerBlock("weathered_cut_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_TRAPDOOR = registerBlock("weathered_cut_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_WALL = registerBlock("weathered_cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));

    //oxidized_copper
    public static final Block OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
    public static final Block OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
    public static final Block OXIDIZED_COPPER_FENCE = registerBlock("oxidized_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
    public static final Block OXIDIZED_COPPER_FENCE_GATE = registerBlock("oxidized_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
    public static final Block OXIDIZED_COPPER_WALL = registerBlock("oxidized_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));

    //oxidized_cut_copper
    public static final Block OXIDIZED_CUT_COPPER_BUTTON = registerBlock("oxidized_cut_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_PRESSURE_PLATE = registerBlock("oxidized_cut_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_FENCE = registerBlock("oxidized_cut_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_FENCE_GATE = registerBlock("oxidized_cut_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_DOOR = registerBlock("oxidized_cut_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_TRAPDOOR = registerBlock("oxidized_cut_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_WALL = registerBlock("oxidized_cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));

    //waxed_copper
    public static final Block WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs",
            new StairsBlock(Blocks.WAXED_COPPER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_COPPER_BUTTON = registerBlock("waxed_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_COPPER_PRESSURE_PLATE = registerBlock("waxed_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_COPPER_FENCE = registerBlock("waxed_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_COPPER_FENCE_GATE = registerBlock("waxed_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
    public static final Block WAXED_COPPER_WALL = registerBlock("waxed_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));

    //waxed_cut_copper
    public static final Block WAXED_CUT_COPPER_BUTTON = registerBlock("waxed_cut_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_cut_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_FENCE = registerBlock("waxed_cut_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_cut_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_DOOR = registerBlock("waxed_cut_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_cut_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_WALL = registerBlock("waxed_cut_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));

    //waxed_exposed_copper
    public static final Block WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs",
            new StairsBlock(Blocks.WAXED_EXPOSED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlock("waxed_exposed_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_FENCE = registerBlock("waxed_exposed_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_FENCE_GATE = registerBlock("waxed_exposed_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_WALL = registerBlock("waxed_exposed_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));

    //waxed_exposed_cut_copper
    public static final Block WAXED_EXPOSED_CUT_COPPER_BUTTON = registerBlock("waxed_exposed_cut_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_cut_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_FENCE = registerBlock("waxed_exposed_cut_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_exposed_cut_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_DOOR = registerBlock("waxed_exposed_cut_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_exposed_cut_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_WALL = registerBlock("waxed_exposed_cut_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));

    //waxed_weathered_copper
    public static final Block WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs",
            new StairsBlock(Blocks.WAXED_WEATHERED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlock("waxed_weathered_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_FENCE = registerBlock("waxed_weathered_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_FENCE_GATE = registerBlock("waxed_weathered_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_WALL = registerBlock("waxed_weathered_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));

    //waxed_weathered_cut_copper
    public static final Block WAXED_WEATHERED_CUT_COPPER_BUTTON = registerBlock("waxed_weathered_cut_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_cut_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_FENCE = registerBlock("waxed_weathered_cut_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_weathered_cut_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_DOOR = registerBlock("waxed_weathered_cut_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_weathered_cut_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_WALL = registerBlock("waxed_weathered_cut_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));

    //waxed_oxidized_copper
    public static final Block WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs",
            new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlock("waxed_oxidized_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_FENCE = registerBlock("waxed_oxidized_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_FENCE_GATE = registerBlock("waxed_oxidized_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_WALL = registerBlock("waxed_oxidized_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));


    //waxed_oxidized_cut_copper
    public static final Block WAXED_OXIDIZED_CUT_COPPER_BUTTON = registerBlock("waxed_oxidized_cut_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_cut_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_FENCE = registerBlock("waxed_oxidized_cut_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_oxidized_cut_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_DOOR = registerBlock("waxed_oxidized_cut_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_cut_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_WALL = registerBlock("waxed_oxidized_cut_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));

    //white_wool
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_BUTTON = registerBlock("white_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_PRESSURE_PLATE = registerBlock("white_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_FENCE_GATE = registerBlock("white_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_DOOR = registerBlock("white_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_TRAPDOOR = registerBlock("white_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    //light_gray_wool
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_BUTTON = registerBlock("light_gray_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_PRESSURE_PLATE = registerBlock("light_gray_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_FENCE = registerBlock("light_gray_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_FENCE_GATE = registerBlock("light_gray_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_DOOR = registerBlock("light_gray_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_TRAPDOOR = registerBlock("light_gray_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));

    //gray_wool
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_BUTTON = registerBlock("gray_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_PRESSURE_PLATE = registerBlock("gray_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_FENCE = registerBlock("gray_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_FENCE_GATE = registerBlock("gray_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_DOOR = registerBlock("gray_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_TRAPDOOR = registerBlock("gray_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));

    //black_wool
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_BUTTON = registerBlock("black_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_PRESSURE_PLATE = registerBlock("black_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_FENCE = registerBlock("black_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_FENCE_GATE = registerBlock("black_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_DOOR = registerBlock("black_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_TRAPDOOR = registerBlock("black_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));

    //brown_wool
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_BUTTON = registerBlock("brown_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_PRESSURE_PLATE = registerBlock("brown_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_FENCE = registerBlock("brown_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_FENCE_GATE = registerBlock("brown_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_DOOR = registerBlock("brown_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_TRAPDOOR = registerBlock("brown_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));

    //red_wool
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new StairsBlock(Blocks.RED_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_BUTTON = registerBlock("red_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_PRESSURE_PLATE = registerBlock("red_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_FENCE = registerBlock("red_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_FENCE_GATE = registerBlock("red_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_DOOR = registerBlock("red_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_TRAPDOOR = registerBlock("red_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));

    //orange_wool
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_BUTTON = registerBlock("orange_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_PRESSURE_PLATE = registerBlock("orange_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_FENCE_GATE = registerBlock("orange_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_DOOR = registerBlock("orange_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_TRAPDOOR = registerBlock("orange_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));

    //yellow_wool
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_BUTTON = registerBlock("yellow_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_PRESSURE_PLATE = registerBlock("yellow_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_FENCE_GATE = registerBlock("yellow_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_DOOR = registerBlock("yellow_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_TRAPDOOR = registerBlock("yellow_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));

    //lime_wool
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_BUTTON = registerBlock("lime_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_PRESSURE_PLATE = registerBlock("lime_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_FENCE = registerBlock("lime_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_FENCE_GATE = registerBlock("lime_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_DOOR = registerBlock("lime_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_TRAPDOOR = registerBlock("lime_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));

    //green_wool
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_BUTTON = registerBlock("green_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_PRESSURE_PLATE = registerBlock("green_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_FENCE = registerBlock("green_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_FENCE_GATE = registerBlock("green_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_DOOR = registerBlock("green_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_TRAPDOOR = registerBlock("green_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));

    //cyan_wool
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_BUTTON = registerBlock("cyan_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_PRESSURE_PLATE = registerBlock("cyan_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_FENCE_GATE = registerBlock("cyan_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_DOOR = registerBlock("cyan_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_TRAPDOOR = registerBlock("cyan_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));

    //blue_wool
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_BUTTON = registerBlock("blue_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_PRESSURE_PLATE = registerBlock("blue_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_FENCE = registerBlock("blue_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_FENCE_GATE = registerBlock("blue_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_DOOR = registerBlock("blue_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_TRAPDOOR = registerBlock("blue_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));

    //light_blue_wool
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_BUTTON = registerBlock("light_blue_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_PRESSURE_PLATE = registerBlock("light_blue_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_FENCE_GATE = registerBlock("light_blue_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_DOOR = registerBlock("light_blue_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_TRAPDOOR = registerBlock("light_blue_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));

    //purple_wool
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_BUTTON = registerBlock("purple_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_PRESSURE_PLATE = registerBlock("purple_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_FENCE_GATE = registerBlock("purple_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_DOOR = registerBlock("purple_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_TRAPDOOR = registerBlock("purple_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));

    //magenta_wool
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_BUTTON = registerBlock("magenta_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_PRESSURE_PLATE = registerBlock("magenta_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_FENCE = registerBlock("magenta_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_FENCE_GATE = registerBlock("magenta_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_DOOR = registerBlock("magenta_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_TRAPDOOR = registerBlock("magenta_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));

    //pink_wool
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_BUTTON = registerBlock("pink_wool_button",
            new ButtonBlock(ModBlockSetType.WOOL, 10, AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_PRESSURE_PLATE = registerBlock("pink_wool_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_FENCE = registerBlock("pink_wool_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_FENCE_GATE = registerBlock("pink_wool_fence_gate",
            new FenceGateBlock(ModWoodType.WOOL, AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_DOOR = registerBlock("pink_wool_door",
            new DoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_TRAPDOOR = registerBlock("pink_wool_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOL, AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));

    //terracotta
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_BUTTON = registerBlock("terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_PRESSURE_PLATE = registerBlock("terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_FENCE = registerBlock("terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_FENCE_GATE = registerBlock("terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_DOOR = registerBlock("terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_TRAPDOOR = registerBlock("terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));

    //white_terracotta
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_BUTTON = registerBlock("white_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_FENCE_GATE = registerBlock("white_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_DOOR = registerBlock("white_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_TRAPDOOR = registerBlock("white_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));

    //light_gray_terracotta
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BUTTON = registerBlock("light_gray_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_DOOR = registerBlock("light_gray_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TRAPDOOR = registerBlock("light_gray_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    //gray_terracotta
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BUTTON = registerBlock("gray_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_FENCE = registerBlock("gray_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_FENCE_GATE = registerBlock("gray_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_DOOR = registerBlock("gray_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_TRAPDOOR = registerBlock("gray_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));

    //black_terracotta
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BUTTON = registerBlock("black_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_FENCE_GATE = registerBlock("black_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_DOOR = registerBlock("black_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_TRAPDOOR = registerBlock("black_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));

    //brown_terracotta
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BUTTON = registerBlock("brown_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_FENCE = registerBlock("brown_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_FENCE_GATE = registerBlock("brown_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_DOOR = registerBlock("brown_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_TRAPDOOR = registerBlock("brown_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));

    //red_terracotta
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BUTTON = registerBlock("red_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_FENCE_GATE = registerBlock("red_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_DOOR = registerBlock("red_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_TRAPDOOR = registerBlock("red_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));

    //orange_terracotta
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BUTTON = registerBlock("orange_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_FENCE_GATE = registerBlock("orange_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_DOOR = registerBlock("orange_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_TRAPDOOR = registerBlock("orange_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));

    //yellow_terracotta
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BUTTON = registerBlock("yellow_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_FENCE = registerBlock("yellow_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_FENCE_GATE = registerBlock("yellow_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_DOOR = registerBlock("yellow_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_TRAPDOOR = registerBlock("yellow_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));

    //lime_terracotta
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BUTTON = registerBlock("lime_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_FENCE = registerBlock("lime_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_FENCE_GATE = registerBlock("lime_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_DOOR = registerBlock("lime_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_TRAPDOOR = registerBlock("lime_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));

    //green_terracotta
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BUTTON = registerBlock("green_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_FENCE = registerBlock("green_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_FENCE_GATE = registerBlock("green_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_DOOR = registerBlock("green_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_TRAPDOOR = registerBlock("green_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));

    //cyan_terracotta
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BUTTON = registerBlock("cyan_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_FENCE = registerBlock("cyan_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_FENCE_GATE = registerBlock("cyan_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_DOOR = registerBlock("cyan_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_TRAPDOOR = registerBlock("cyan_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));

    //blue_terracotta
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BUTTON = registerBlock("blue_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_FENCE = registerBlock("blue_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_FENCE_GATE = registerBlock("blue_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_DOOR = registerBlock("blue_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_TRAPDOOR = registerBlock("blue_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));

    //light_blue_terracotta
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BUTTON = registerBlock("light_blue_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_DOOR = registerBlock("light_blue_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TRAPDOOR = registerBlock("light_blue_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    //purple_terracotta
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BUTTON = registerBlock("purple_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_FENCE = registerBlock("purple_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_FENCE_GATE = registerBlock("purple_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_DOOR = registerBlock("purple_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_TRAPDOOR = registerBlock("purple_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));

    //magenta_terracotta
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BUTTON = registerBlock("magenta_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_FENCE = registerBlock("magenta_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_FENCE_GATE = registerBlock("magenta_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_DOOR = registerBlock("magenta_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_TRAPDOOR = registerBlock("magenta_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));

    //pink_terracotta
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BUTTON = registerBlock("pink_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_FENCE = registerBlock("pink_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_FENCE_GATE = registerBlock("pink_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_DOOR = registerBlock("pink_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_TRAPDOOR = registerBlock("pink_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));

    //white_concrete
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_DOOR = registerBlock("white_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_TRAPDOOR = registerBlock("white_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    //light_gray_concrete
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_DOOR = registerBlock("light_gray_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TRAPDOOR = registerBlock("light_gray_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    //gray_concrete
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_DOOR = registerBlock("gray_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TRAPDOOR = registerBlock("gray_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));

    //black_concrete
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_DOOR = registerBlock("black_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_TRAPDOOR = registerBlock("black_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));

    //brown_concrete
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_DOOR = registerBlock("brown_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_TRAPDOOR = registerBlock("brown_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));

    //red_concrete
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_DOOR = registerBlock("red_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_TRAPDOOR = registerBlock("red_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));

    //orange_concrete
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_DOOR = registerBlock("orange_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TRAPDOOR = registerBlock("orange_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));

    //yellow_concrete
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_DOOR = registerBlock("yellow_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TRAPDOOR = registerBlock("yellow_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));

    //lime_concrete
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_DOOR = registerBlock("lime_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_TRAPDOOR = registerBlock("lime_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));

    //green_concrete
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_DOOR = registerBlock("green_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_TRAPDOOR = registerBlock("green_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));

    //cyan_concrete
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_DOOR = registerBlock("cyan_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_TRAPDOOR = registerBlock("cyan_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));

    //blue_concrete
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_DOOR = registerBlock("blue_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_TRAPDOOR = registerBlock("blue_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));

    //light_blue_concrete
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_DOOR = registerBlock("light_blue_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TRAPDOOR = registerBlock("light_blue_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    //purple_concrete
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_DOOR = registerBlock("purple_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TRAPDOOR = registerBlock("purple_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));

    //magenta_concrete
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_DOOR = registerBlock("magenta_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TRAPDOOR = registerBlock("magenta_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));

    //pink_concrete
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_DOOR = registerBlock("pink_concrete_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_TRAPDOOR = registerBlock("pink_concrete_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    //white_concrete_powder
    public static final Block WHITE_CONCRETE_POWDER_STAIRS = registerBlock("white_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.WHITE_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_STAIRS));
    public static final Block WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_SLAB));
    public static final Block WHITE_CONCRETE_POWDER_BUTTON = registerBlock("white_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER),
                    ModBlocks.WHITE_CONCRETE_BUTTON));
    public static final Block WHITE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("white_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE));
    public static final Block WHITE_CONCRETE_POWDER_FENCE = registerBlock("white_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_FENCE));
    public static final Block WHITE_CONCRETE_POWDER_FENCE_GATE = registerBlock("white_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_FENCE_GATE));
    public static final Block WHITE_CONCRETE_POWDER_DOOR = registerBlock("white_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_DOOR));
    public static final Block WHITE_CONCRETE_POWDER_TRAPDOOR = registerBlock("white_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_TRAPDOOR));
    public static final Block WHITE_CONCRETE_POWDER_WALL = registerBlock("white_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER), ModBlocks.WHITE_CONCRETE_WALL));

    //light_gray_concrete_powder
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("light_gray_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.LIGHT_GRAY_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_BUTTON = registerBlock("light_gray_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER),
                    ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("light_gray_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_FENCE = registerBlock("light_gray_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_FENCE));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE = registerBlock("light_gray_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_DOOR = registerBlock("light_gray_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_DOOR));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR = registerBlock("light_gray_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_WALL = registerBlock("light_gray_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER), ModBlocks.LIGHT_GRAY_CONCRETE_WALL));

    //gray_concrete_powder
    public static final Block GRAY_CONCRETE_POWDER_STAIRS = registerBlock("gray_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.GRAY_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_STAIRS));
    public static final Block GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_SLAB));
    public static final Block GRAY_CONCRETE_POWDER_BUTTON = registerBlock("gray_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER),
                    ModBlocks.GRAY_CONCRETE_BUTTON));
    public static final Block GRAY_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("gray_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE));
    public static final Block GRAY_CONCRETE_POWDER_FENCE = registerBlock("gray_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_FENCE));
    public static final Block GRAY_CONCRETE_POWDER_FENCE_GATE = registerBlock("gray_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_FENCE_GATE));
    public static final Block GRAY_CONCRETE_POWDER_DOOR = registerBlock("gray_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_DOOR));
    public static final Block GRAY_CONCRETE_POWDER_TRAPDOOR = registerBlock("gray_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_TRAPDOOR));
    public static final Block GRAY_CONCRETE_POWDER_WALL = registerBlock("gray_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER), ModBlocks.GRAY_CONCRETE_WALL));

    //black_concrete_powder
    public static final Block BLACK_CONCRETE_POWDER_STAIRS = registerBlock("black_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.BLACK_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_STAIRS));
    public static final Block BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_SLAB));
    public static final Block BLACK_CONCRETE_POWDER_BUTTON = registerBlock("black_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER),
                    ModBlocks.BLACK_CONCRETE_BUTTON));
    public static final Block BLACK_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("black_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE));
    public static final Block BLACK_CONCRETE_POWDER_FENCE = registerBlock("black_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_FENCE));
    public static final Block BLACK_CONCRETE_POWDER_FENCE_GATE = registerBlock("black_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_FENCE_GATE));
    public static final Block BLACK_CONCRETE_POWDER_DOOR = registerBlock("black_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_DOOR));
    public static final Block BLACK_CONCRETE_POWDER_TRAPDOOR = registerBlock("black_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_TRAPDOOR));
    public static final Block BLACK_CONCRETE_POWDER_WALL = registerBlock("black_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER), ModBlocks.BLACK_CONCRETE_WALL));

    //brown_concrete_powder
    public static final Block BROWN_CONCRETE_POWDER_STAIRS = registerBlock("brown_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.BROWN_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_STAIRS));
    public static final Block BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_SLAB));
    public static final Block BROWN_CONCRETE_POWDER_BUTTON = registerBlock("brown_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER),
                    ModBlocks.BROWN_CONCRETE_BUTTON));
    public static final Block BROWN_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("brown_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE));
    public static final Block BROWN_CONCRETE_POWDER_FENCE = registerBlock("brown_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_FENCE));
    public static final Block BROWN_CONCRETE_POWDER_FENCE_GATE = registerBlock("brown_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_FENCE_GATE));
    public static final Block BROWN_CONCRETE_POWDER_DOOR = registerBlock("brown_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_DOOR));
    public static final Block BROWN_CONCRETE_POWDER_TRAPDOOR = registerBlock("brown_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_TRAPDOOR));
    public static final Block BROWN_CONCRETE_POWDER_WALL = registerBlock("brown_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER), ModBlocks.BROWN_CONCRETE_WALL));

    //red_concrete_powder
    public static final Block RED_CONCRETE_POWDER_STAIRS = registerBlock("red_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.RED_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_STAIRS));
    public static final Block RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_SLAB));
    public static final Block RED_CONCRETE_POWDER_BUTTON = registerBlock("red_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER),
                    ModBlocks.RED_CONCRETE_BUTTON));
    public static final Block RED_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("red_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_PRESSURE_PLATE));
    public static final Block RED_CONCRETE_POWDER_FENCE = registerBlock("red_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_FENCE));
    public static final Block RED_CONCRETE_POWDER_FENCE_GATE = registerBlock("red_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_FENCE_GATE));
    public static final Block RED_CONCRETE_POWDER_DOOR = registerBlock("red_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_DOOR));
    public static final Block RED_CONCRETE_POWDER_TRAPDOOR = registerBlock("red_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_TRAPDOOR));
    public static final Block RED_CONCRETE_POWDER_WALL = registerBlock("red_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER), ModBlocks.RED_CONCRETE_WALL));

    //orange_concrete_powder
    public static final Block ORANGE_CONCRETE_POWDER_STAIRS = registerBlock("orange_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.ORANGE_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_STAIRS));
    public static final Block ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_SLAB));
    public static final Block ORANGE_CONCRETE_POWDER_BUTTON = registerBlock("orange_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER),
                    ModBlocks.ORANGE_CONCRETE_BUTTON));
    public static final Block ORANGE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("orange_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE));
    public static final Block ORANGE_CONCRETE_POWDER_FENCE = registerBlock("orange_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_FENCE));
    public static final Block ORANGE_CONCRETE_POWDER_FENCE_GATE = registerBlock("orange_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_FENCE_GATE));
    public static final Block ORANGE_CONCRETE_POWDER_DOOR = registerBlock("orange_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_DOOR));
    public static final Block ORANGE_CONCRETE_POWDER_TRAPDOOR = registerBlock("orange_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_TRAPDOOR));
    public static final Block ORANGE_CONCRETE_POWDER_WALL = registerBlock("orange_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER), ModBlocks.ORANGE_CONCRETE_WALL));

    //yellow_concrete_powder
    public static final Block YELLOW_CONCRETE_POWDER_STAIRS = registerBlock("yellow_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.YELLOW_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_STAIRS));
    public static final Block YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_SLAB));
    public static final Block YELLOW_CONCRETE_POWDER_BUTTON = registerBlock("yellow_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER),
                    ModBlocks.YELLOW_CONCRETE_BUTTON));
    public static final Block YELLOW_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("yellow_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE));
    public static final Block YELLOW_CONCRETE_POWDER_FENCE = registerBlock("yellow_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_FENCE));
    public static final Block YELLOW_CONCRETE_POWDER_FENCE_GATE = registerBlock("yellow_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_FENCE_GATE));
    public static final Block YELLOW_CONCRETE_POWDER_DOOR = registerBlock("yellow_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_DOOR));
    public static final Block YELLOW_CONCRETE_POWDER_TRAPDOOR = registerBlock("yellow_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_TRAPDOOR));
    public static final Block YELLOW_CONCRETE_POWDER_WALL = registerBlock("yellow_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER), ModBlocks.YELLOW_CONCRETE_WALL));

    //lime_concrete_powder
    public static final Block LIME_CONCRETE_POWDER_STAIRS = registerBlock("lime_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.LIME_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_STAIRS));
    public static final Block LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_SLAB));
    public static final Block LIME_CONCRETE_POWDER_BUTTON = registerBlock("lime_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER),
                    ModBlocks.LIME_CONCRETE_BUTTON));
    public static final Block LIME_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("lime_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_PRESSURE_PLATE));
    public static final Block LIME_CONCRETE_POWDER_FENCE = registerBlock("lime_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_FENCE));
    public static final Block LIME_CONCRETE_POWDER_FENCE_GATE = registerBlock("lime_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_FENCE_GATE));
    public static final Block LIME_CONCRETE_POWDER_DOOR = registerBlock("lime_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_DOOR));
    public static final Block LIME_CONCRETE_POWDER_TRAPDOOR = registerBlock("lime_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_TRAPDOOR));
    public static final Block LIME_CONCRETE_POWDER_WALL = registerBlock("lime_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER), ModBlocks.LIME_CONCRETE_WALL));

    //green_concrete_powder
    public static final Block GREEN_CONCRETE_POWDER_STAIRS = registerBlock("green_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.GREEN_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_STAIRS));
    public static final Block GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_SLAB));
    public static final Block GREEN_CONCRETE_POWDER_BUTTON = registerBlock("green_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER),
                    ModBlocks.GREEN_CONCRETE_BUTTON));
    public static final Block GREEN_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("green_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE));
    public static final Block GREEN_CONCRETE_POWDER_FENCE = registerBlock("green_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_FENCE));
    public static final Block GREEN_CONCRETE_POWDER_FENCE_GATE = registerBlock("green_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_FENCE_GATE));
    public static final Block GREEN_CONCRETE_POWDER_DOOR = registerBlock("green_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_DOOR));
    public static final Block GREEN_CONCRETE_POWDER_TRAPDOOR = registerBlock("green_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_TRAPDOOR));
    public static final Block GREEN_CONCRETE_POWDER_WALL = registerBlock("green_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER), ModBlocks.GREEN_CONCRETE_WALL));

    //cyan_concrete_powder
    public static final Block CYAN_CONCRETE_POWDER_STAIRS = registerBlock("cyan_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.CYAN_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_STAIRS));
    public static final Block CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_SLAB));
    public static final Block CYAN_CONCRETE_POWDER_BUTTON = registerBlock("cyan_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER),
                    ModBlocks.CYAN_CONCRETE_BUTTON));
    public static final Block CYAN_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("cyan_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE));
    public static final Block CYAN_CONCRETE_POWDER_FENCE = registerBlock("cyan_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_FENCE));
    public static final Block CYAN_CONCRETE_POWDER_FENCE_GATE = registerBlock("cyan_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_FENCE_GATE));
    public static final Block CYAN_CONCRETE_POWDER_DOOR = registerBlock("cyan_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_DOOR));
    public static final Block CYAN_CONCRETE_POWDER_TRAPDOOR = registerBlock("cyan_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_TRAPDOOR));
    public static final Block CYAN_CONCRETE_POWDER_WALL = registerBlock("cyan_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER), ModBlocks.CYAN_CONCRETE_WALL));

    //blue_concrete_powder
    public static final Block BLUE_CONCRETE_POWDER_STAIRS = registerBlock("blue_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.BLUE_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_STAIRS));
    public static final Block BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_SLAB));
    public static final Block BLUE_CONCRETE_POWDER_BUTTON = registerBlock("blue_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_BUTTON));
    public static final Block BLUE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("blue_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE));
    public static final Block BLUE_CONCRETE_POWDER_FENCE = registerBlock("blue_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_FENCE));
    public static final Block BLUE_CONCRETE_POWDER_FENCE_GATE = registerBlock("blue_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_FENCE_GATE));
    public static final Block BLUE_CONCRETE_POWDER_DOOR = registerBlock("blue_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_DOOR));
    public static final Block BLUE_CONCRETE_POWDER_TRAPDOOR = registerBlock("blue_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_TRAPDOOR));
    public static final Block BLUE_CONCRETE_POWDER_WALL = registerBlock("blue_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER), ModBlocks.BLUE_CONCRETE_WALL));

    //light_blue_concrete_powder
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("light_blue_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.LIGHT_BLUE_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_BUTTON = registerBlock("light_blue_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER),
                    ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("light_blue_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), LIGHT_BLUE_CONCRETE_PRESSURE_PLATE));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_FENCE = registerBlock("light_blue_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_FENCE));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE = registerBlock("light_blue_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_DOOR = registerBlock("light_blue_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_DOOR));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR = registerBlock("light_blue_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_WALL = registerBlock("light_blue_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER), ModBlocks.LIGHT_BLUE_CONCRETE_WALL));

    //purple_concrete_powder
    public static final Block PURPLE_CONCRETE_POWDER_STAIRS = registerBlock("purple_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.PURPLE_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_STAIRS));
    public static final Block PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_SLAB));
    public static final Block PURPLE_CONCRETE_POWDER_BUTTON = registerBlock("purple_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER),
                    ModBlocks.PURPLE_CONCRETE_BUTTON));
    public static final Block PURPLE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("purple_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), PURPLE_CONCRETE_PRESSURE_PLATE));
    public static final Block PURPLE_CONCRETE_POWDER_FENCE = registerBlock("purple_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_FENCE));
    public static final Block PURPLE_CONCRETE_POWDER_FENCE_GATE = registerBlock("purple_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_FENCE_GATE));
    public static final Block PURPLE_CONCRETE_POWDER_DOOR = registerBlock("purple_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_DOOR));
    public static final Block PURPLE_CONCRETE_POWDER_TRAPDOOR = registerBlock("purple_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_TRAPDOOR));
    public static final Block PURPLE_CONCRETE_POWDER_WALL = registerBlock("purple_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER), ModBlocks.PURPLE_CONCRETE_WALL));

    //magenta_concrete_powder
    public static final Block MAGENTA_CONCRETE_POWDER_STAIRS = registerBlock("magenta_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.MAGENTA_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_STAIRS));
    public static final Block MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_SLAB));
    public static final Block MAGENTA_CONCRETE_POWDER_BUTTON = registerBlock("magenta_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER),
                    ModBlocks.MAGENTA_CONCRETE_BUTTON));
    public static final Block MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("magenta_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), MAGENTA_CONCRETE_PRESSURE_PLATE));
    public static final Block MAGENTA_CONCRETE_POWDER_FENCE = registerBlock("magenta_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_FENCE));
    public static final Block MAGENTA_CONCRETE_POWDER_FENCE_GATE = registerBlock("magenta_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_FENCE_GATE));
    public static final Block MAGENTA_CONCRETE_POWDER_DOOR = registerBlock("magenta_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_DOOR));
    public static final Block MAGENTA_CONCRETE_POWDER_TRAPDOOR = registerBlock("magenta_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_TRAPDOOR));
    public static final Block MAGENTA_CONCRETE_POWDER_WALL = registerBlock("magenta_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER), ModBlocks.MAGENTA_CONCRETE_WALL));

    //pink_concrete_powder
    public static final Block PINK_CONCRETE_POWDER_STAIRS = registerBlock("pink_concrete_powder_stairs",
            new ConcretePowderStairsBlock(Blocks.PINK_CONCRETE_POWDER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER),
                    ModBlocks.PINK_CONCRETE_STAIRS));
    public static final Block PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab",
            new ConcretePowderSlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_SLAB));
    public static final Block PINK_CONCRETE_POWDER_BUTTON = registerBlock("pink_concrete_powder_button",
            new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER),
                    ModBlocks.PINK_CONCRETE_BUTTON));
    public static final Block PINK_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("pink_concrete_powder_pressure_plate",
            new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_PRESSURE_PLATE));
    public static final Block PINK_CONCRETE_POWDER_FENCE = registerBlock("pink_concrete_powder_fence",
            new ConcretePowderFenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_FENCE));
    public static final Block PINK_CONCRETE_POWDER_FENCE_GATE = registerBlock("pink_concrete_powder_fence_gate",
            new ConcretePowderFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_FENCE_GATE));
    public static final Block PINK_CONCRETE_POWDER_DOOR = registerBlock("pink_concrete_powder_door",
            new ConcretePowderDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_DOOR));
    public static final Block PINK_CONCRETE_POWDER_TRAPDOOR = registerBlock("pink_concrete_powder_trapdoor",
            new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_TRAPDOOR));
    public static final Block PINK_CONCRETE_POWDER_WALL = registerBlock("pink_concrete_powder_wall",
            new ConcretePowderWallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER), ModBlocks.PINK_CONCRETE_WALL));

    //white_glazed_terracotta
    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_BUTTON = registerBlock("white_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_FENCE = registerBlock("white_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("white_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_DOOR = registerBlock("white_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("white_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));
    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));

    //light_gray_glazed_terracotta
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON = registerBlock("light_gray_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE = registerBlock("light_gray_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR = registerBlock("light_gray_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("light_gray_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)));

    //gray_glazed_terracotta
    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_BUTTON = registerBlock("gray_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_FENCE = registerBlock("gray_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("gray_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_DOOR = registerBlock("gray_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("gray_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));
    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA)));

    //black_glazed_terracotta
    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_BUTTON = registerBlock("black_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_FENCE = registerBlock("black_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("black_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_DOOR = registerBlock("black_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("black_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));
    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    //brown_glazed_terracotta
    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_BUTTON = registerBlock("brown_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_FENCE = registerBlock("brown_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("brown_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_DOOR = registerBlock("brown_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("brown_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));
    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)));

    //red_glazed_terracotta
    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs",
            new StairsBlock(Blocks.RED_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_BUTTON = registerBlock("red_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_FENCE = registerBlock("red_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("red_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_DOOR = registerBlock("red_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("red_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));
    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA)));

    //orange_glazed_terracotta
    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_BUTTON = registerBlock("orange_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_FENCE = registerBlock("orange_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("orange_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_DOOR = registerBlock("orange_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("orange_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA)));

    //yellow_glazed_terracotta
    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_BUTTON = registerBlock("yellow_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_FENCE = registerBlock("yellow_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("yellow_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_DOOR = registerBlock("yellow_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("yellow_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA)));

    //lime_glazed_terracotta
    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs",
            new StairsBlock(Blocks.LIME_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_BUTTON = registerBlock("lime_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_FENCE = registerBlock("lime_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("lime_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_DOOR = registerBlock("lime_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("lime_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));
    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA)));

    //green_glazed_terracotta
    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_BUTTON = registerBlock("green_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_FENCE = registerBlock("green_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("green_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_DOOR = registerBlock("green_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("green_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));
    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA)));

    //cyan_glazed_terracotta
    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_BUTTON = registerBlock("cyan_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_FENCE = registerBlock("cyan_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("cyan_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_DOOR = registerBlock("cyan_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("cyan_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));
    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA)));

    //blue_glazed_terracotta
    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_BUTTON = registerBlock("blue_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_FENCE = registerBlock("blue_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("blue_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_DOOR = registerBlock("blue_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("blue_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));
    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA)));

    //light_blue_glazed_terracotta
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON = registerBlock("light_blue_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE = registerBlock("light_blue_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR = registerBlock("light_blue_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("light_blue_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)));

    //purple_glazed_terracotta
    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_BUTTON = registerBlock("purple_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_FENCE = registerBlock("purple_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("purple_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_DOOR = registerBlock("purple_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("purple_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA)));

    //magenta_glazed_terracotta
    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_BUTTON = registerBlock("magenta_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_FENCE = registerBlock("magenta_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("magenta_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_DOOR = registerBlock("magenta_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("magenta_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA)));

    //pink_glazed_terracotta
    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs",
            new StairsBlock(Blocks.PINK_GLAZED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_BUTTON = registerBlock("pink_glazed_terracotta_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_glazed_terracotta_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_FENCE = registerBlock("pink_glazed_terracotta_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("pink_glazed_terracotta_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_DOOR = registerBlock("pink_glazed_terracotta_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("pink_glazed_terracotta_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));
    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA)));

    //white_stained_glass
    public static final Block WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            new GlassStairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_BUTTON = registerBlock("white_stained_glass_button",
            new GlassButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("white_stained_glass_pressure_plate",
            new GlassPressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_FENCE = registerBlock("white_stained_glass_fence",
            new GlassFenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_FENCE_GATE = registerBlock("white_stained_glass_fence_gate",
            new GlassFenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_DOOR = registerBlock("white_stained_glass_door",
            new GlassDoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_TRAPDOOR = registerBlock("white_stained_glass_trapdoor",
            new GlassTrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall",
            new GlassWallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));

    //light_gray_stained_glass
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            new GlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_BUTTON = registerBlock("light_gray_stained_glass_button",
            new GlassButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_gray_stained_glass_pressure_plate",
            new GlassPressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock("light_gray_stained_glass_fence",
            new GlassFenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("light_gray_stained_glass_fence_gate",
            new GlassFenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("light_gray_stained_glass_door",
            new GlassDoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("light_gray_stained_glass_trapdoor",
            new GlassTrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall",
            new GlassWallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));

    //gray_stained_glass
    public static final Block GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            new GlassStairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_BUTTON = registerBlock("gray_stained_glass_button",
            new GlassButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("gray_stained_glass_pressure_plate",
            new GlassPressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_FENCE = registerBlock("gray_stained_glass_fence",
            new GlassFenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("gray_stained_glass_fence_gate",
            new GlassFenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_DOOR = registerBlock("gray_stained_glass_door",
            new GlassDoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("gray_stained_glass_trapdoor",
            new GlassTrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall",
            new GlassWallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));

    //black_stained_glass
    public static final Block BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            new GlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_BUTTON = registerBlock("black_stained_glass_button",
            new GlassButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("black_stained_glass_pressure_plate",
            new GlassPressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_FENCE = registerBlock("black_stained_glass_fence",
            new GlassFenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_FENCE_GATE = registerBlock("black_stained_glass_fence_gate",
            new GlassFenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_DOOR = registerBlock("black_stained_glass_door",
            new GlassDoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_TRAPDOOR = registerBlock("black_stained_glass_trapdoor",
            new GlassTrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall",
            new GlassWallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));

    //brown_stained_glass
    public static final Block BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            new GlassStairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_BUTTON = registerBlock("brown_stained_glass_button",
            new GlassButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("brown_stained_glass_pressure_plate",
            new GlassPressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_FENCE = registerBlock("brown_stained_glass_fence",
            new GlassFenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_FENCE_GATE = registerBlock("brown_stained_glass_fence_gate",
            new GlassFenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_DOOR = registerBlock("brown_stained_glass_door",
            new GlassDoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_TRAPDOOR = registerBlock("brown_stained_glass_trapdoor",
            new GlassTrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall",
            new GlassWallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));

    //red_stained_glass
    public static final Block RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            new GlassStairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_BUTTON = registerBlock("red_stained_glass_button",
            new GlassButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_PRESSURE_PLATE = registerBlock("red_stained_glass_pressure_plate",
            new GlassPressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_FENCE = registerBlock("red_stained_glass_fence",
            new GlassFenceBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_FENCE_GATE = registerBlock("red_stained_glass_fence_gate",
            new GlassFenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_DOOR = registerBlock("red_stained_glass_door",
            new GlassDoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_TRAPDOOR = registerBlock("red_stained_glass_trapdoor",
            new GlassTrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall",
            new GlassWallBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));

    //orange_stained_glass
    public static final Block ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            new StairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_BUTTON = registerBlock("orange_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("orange_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_FENCE = registerBlock("orange_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_FENCE_GATE = registerBlock("orange_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_DOOR = registerBlock("orange_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = registerBlock("orange_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));

    //yellow_stained_glass
    public static final Block YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            new StairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_BUTTON = registerBlock("yellow_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_PRESSURE_PLATE = registerBlock("yellow_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_FENCE = registerBlock("yellow_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_FENCE_GATE = registerBlock("yellow_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_DOOR = registerBlock("yellow_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = registerBlock("yellow_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));

    //lime_stained_glass
    public static final Block LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            new StairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_BUTTON = registerBlock("lime_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_PRESSURE_PLATE = registerBlock("lime_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_FENCE = registerBlock("lime_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_FENCE_GATE = registerBlock("lime_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_DOOR = registerBlock("lime_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_TRAPDOOR = registerBlock("lime_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));

    //green_stained_glass
    public static final Block GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            new StairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_BUTTON = registerBlock("green_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("green_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_FENCE = registerBlock("green_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_FENCE_GATE = registerBlock("green_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_DOOR = registerBlock("green_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_TRAPDOOR = registerBlock("green_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));

    //cyan_stained_glass
    public static final Block CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            new StairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_BUTTON = registerBlock("cyan_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("cyan_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_FENCE = registerBlock("cyan_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_FENCE_GATE = registerBlock("cyan_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_DOOR = registerBlock("cyan_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_TRAPDOOR = registerBlock("cyan_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));

    //blue_stained_glass
    public static final Block BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            new StairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_BUTTON = registerBlock("blue_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("blue_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_FENCE = registerBlock("blue_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("blue_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_DOOR = registerBlock("blue_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("blue_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));

    //light_blue_stained_glass
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_BUTTON = registerBlock("light_blue_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_blue_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock("light_blue_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("light_blue_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("light_blue_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("light_blue_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));

    //purple_stained_glass
    public static final Block PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            new StairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_BUTTON = registerBlock("purple_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("purple_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_FENCE = registerBlock("purple_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_FENCE_GATE = registerBlock("purple_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_DOOR = registerBlock("purple_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = registerBlock("purple_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));

    //magenta_stained_glass
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            new StairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_BUTTON = registerBlock("magenta_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_PRESSURE_PLATE = registerBlock("magenta_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_FENCE = registerBlock("magenta_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_FENCE_GATE = registerBlock("magenta_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_DOOR = registerBlock("magenta_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = registerBlock("magenta_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));

    //pink_stained_glass
    public static final Block PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            new StairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_BUTTON = registerBlock("pink_stained_glass_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("pink_stained_glass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_FENCE = registerBlock("pink_stained_glass_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_FENCE_GATE = registerBlock("pink_stained_glass_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_DOOR = registerBlock("pink_stained_glass_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_TRAPDOOR = registerBlock("pink_stained_glass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));

    //grass_block
    public static final Block GRASS_STAIRS = registerBlock("grass_stairs",
            new StairsBlock(Blocks.GRASS_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_SLAB = registerBlock("grass_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_BUTTON = registerBlock("grass_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_PRESSURE_PLATE = registerBlock("grass_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_FENCE = registerBlock("grass_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_FENCE_GATE = registerBlock("grass_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_DOOR = registerBlock("grass_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN)));
    public static final Block GRASS_TRAPDOOR = registerBlock("grass_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).strength(0.6f).sounds(BlockSoundGroup.GRASS)));
    public static final Block GRASS_WALL = registerBlock("grass_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS)));

    //podzol_block
    public static final Block PODZOL_STAIRS = registerBlock("podzol_stairs",
            new StairsBlock(Blocks.PODZOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_SLAB = registerBlock("podzol_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_BUTTON = registerBlock("podzol_button",
            new ButtonBlock(ModBlockSetType.GRAVEL, 10, AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_PRESSURE_PLATE = registerBlock("podzol_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_FENCE = registerBlock("podzol_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_FENCE_GATE = registerBlock("podzol_fence_gate",
            new FenceGateBlock(ModWoodType.GRAVEL, AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_DOOR = registerBlock("podzol_door",
            new DoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_TRAPDOOR = registerBlock("podzol_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_WALL = registerBlock("podzol_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PODZOL)));

    //dirt_block
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs",
            new StairsBlock(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_BUTTON = registerBlock("dirt_button",
            new ButtonBlock(ModBlockSetType.GRAVEL, 10, AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_PRESSURE_PLATE = registerBlock("dirt_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_FENCE = registerBlock("dirt_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_FENCE_GATE = registerBlock("dirt_fence_gate",
            new FenceGateBlock(ModWoodType.GRAVEL, AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_DOOR = registerBlock("dirt_door",
            new DoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_TRAPDOOR = registerBlock("dirt_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_WALL = registerBlock("dirt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIRT)));

    //mycelium_block
    public static final Block MYCELIUM_STAIRS = registerBlock("mycelium_stairs",
            new StairsBlock(Blocks.MYCELIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_SLAB = registerBlock("mycelium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_BUTTON = registerBlock("mycelium_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_PRESSURE_PLATE = registerBlock("mycelium_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_FENCE = registerBlock("mycelium_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_FENCE_GATE = registerBlock("mycelium_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_DOOR = registerBlock("mycelium_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_TRAPDOOR = registerBlock("mycelium_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_WALL = registerBlock("mycelium_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MYCELIUM)));

    //dirt_path_block
    public static final Block DIRT_PATH_STAIRS = registerBlock("dirt_path_stairs",
            new StairsBlock(Blocks.DIRT_PATH.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_SLAB = registerBlock("dirt_path_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_BUTTON = registerBlock("dirt_path_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_PRESSURE_PLATE = registerBlock("dirt_path_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_FENCE = registerBlock("dirt_path_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_FENCE_GATE = registerBlock("dirt_path_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_DOOR = registerBlock("dirt_path_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_TRAPDOOR = registerBlock("dirt_path_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_WALL = registerBlock("dirt_path_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));

    //coarse_dirt_block
    public static final Block COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs",
            new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_BUTTON = registerBlock("coarse_dirt_button",
            new ButtonBlock(ModBlockSetType.GRAVEL, 10, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_PRESSURE_PLATE = registerBlock("coarse_dirt_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_FENCE = registerBlock("coarse_dirt_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_FENCE_GATE = registerBlock("coarse_dirt_fence_gate",
            new FenceGateBlock(ModWoodType.GRAVEL, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_DOOR = registerBlock("coarse_dirt_door",
            new DoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_TRAPDOOR = registerBlock("coarse_dirt_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_WALL = registerBlock("coarse_dirt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));

    //farmland_block
    public static final Block FARMLAND_STAIRS = registerBlock("farmland_stairs",
            new StairsBlock(Blocks.FARMLAND.getDefaultState(), AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_SLAB = registerBlock("farmland_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_BUTTON = registerBlock("farmland_button",
            new ButtonBlock(ModBlockSetType.GRAVEL, 10, AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_PRESSURE_PLATE = registerBlock("farmland_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_FENCE = registerBlock("farmland_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_FENCE_GATE = registerBlock("farmland_fence_gate",
            new FenceGateBlock(ModWoodType.GRAVEL, AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_DOOR = registerBlock("farmland_door",
            new DoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_TRAPDOOR = registerBlock("farmland_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.FARMLAND)));
    public static final Block FARMLAND_WALL = registerBlock("farmland_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.FARMLAND)));

    //rooted_dirt_block
    public static final Block ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs",
            new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_BUTTON = registerBlock("rooted_dirt_button",
            new ButtonBlock(ModBlockSetType.ROOTED_DIRT, 10, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_PRESSURE_PLATE = registerBlock("rooted_dirt_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.ROOTED_DIRT, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_FENCE = registerBlock("rooted_dirt_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_FENCE_GATE = registerBlock("rooted_dirt_fence_gate",
            new FenceGateBlock(ModWoodType.ROOTED_DIRT, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_DOOR = registerBlock("rooted_dirt_door",
            new DoorBlock(ModBlockSetType.ROOTED_DIRT, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_TRAPDOOR = registerBlock("rooted_dirt_trapdoor",
            new TrapdoorBlock(ModBlockSetType.ROOTED_DIRT, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_WALL = registerBlock("rooted_dirt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));

    //mud_block
    public static final Block MUD_STAIRS = registerBlock("mud_stairs",
            new StairsBlock(Blocks.MUD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_SLAB = registerBlock("mud_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_BUTTON = registerBlock("mud_button",
            new ButtonBlock(ModBlockSetType.MUD, 10, AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_PRESSURE_PLATE = registerBlock("mud_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.MUD, AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_FENCE = registerBlock("mud_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_FENCE_GATE = registerBlock("mud_fence_gate",
            new FenceGateBlock(ModWoodType.MUD, AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_DOOR = registerBlock("mud_door",
            new DoorBlock(ModBlockSetType.MUD, AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_TRAPDOOR = registerBlock("mud_trapdoor",
            new TrapdoorBlock(ModBlockSetType.MUD, AbstractBlock.Settings.copy(Blocks.MUD)));
    public static final Block MUD_WALL = registerBlock("mud_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MUD)));

    //clay_block
    public static final Block CLAY_STAIRS = registerBlock("clay_stairs",
            new StairsBlock(Blocks.CLAY.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_SLAB = registerBlock("clay_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_BUTTON = registerBlock("clay_button",
            new ButtonBlock(ModBlockSetType.GRAVEL, 10, AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_PRESSURE_PLATE = registerBlock("clay_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_FENCE = registerBlock("clay_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_FENCE_GATE = registerBlock("clay_fence_gate",
            new FenceGateBlock(ModWoodType.GRAVEL, AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_DOOR = registerBlock("clay_door",
            new DoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_TRAPDOOR = registerBlock("clay_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.CLAY)));
    public static final Block CLAY_WALL = registerBlock("clay_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CLAY)));

    //sand_block
    public static final Block SAND_STAIRS = registerBlock("sand_stairs",
            new FallingStairsBlock(Blocks.SAND.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_SLAB = registerBlock("sand_slab",
            new FallingSlabBlock(AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_BUTTON = registerBlock("sand_button",
            new FallingButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_PRESSURE_PLATE = registerBlock("sand_pressure_plate",
            new FallingPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_FENCE = registerBlock("sand_fence",
            new FallingFenceBlock(AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_FENCE_GATE = registerBlock("sand_fence_gate",
            new FallingFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_DOOR = registerBlock("sand_door",
            new FallingDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_TRAPDOOR = registerBlock("sand_trapdoor",
            new FallingTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.SAND)));
    public static final Block SAND_WALL = registerBlock("sand_wall",
            new FallingWallBlock(AbstractBlock.Settings.copy(Blocks.SAND)));

    //gravel
    public static final Block GRAVEL_STAIRS = registerBlock("gravel_stairs",
            new FallingStairsBlock(Blocks.GRAVEL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_SLAB = registerBlock("gravel_slab",
            new FallingSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_BUTTON = registerBlock("gravel_button",
            new FallingButtonBlock(ModBlockSetType.GRAVEL, 10, AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_PRESSURE_PLATE = registerBlock("gravel_pressure_plate",
            new FallingPressurePlateBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_FENCE = registerBlock("gravel_fence",
            new FallingFenceBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_FENCE_GATE = registerBlock("gravel_fence_gate",
            new FallingFenceGateBlock(ModWoodType.GRAVEL, AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_DOOR = registerBlock("gravel_door",
            new FallingDoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_TRAPDOOR = registerBlock("gravel_trapdoor",
            new FallingTrapdoorBlock(ModBlockSetType.GRAVEL, AbstractBlock.Settings.copy(Blocks.GRAVEL)));
    public static final Block GRAVEL_WALL = registerBlock("gravel_wall",
            new FallingWallBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL)));

    //red_sand
    public static final Block RED_SAND_STAIRS = registerBlock("red_sand_stairs",
            new FallingStairsBlock(Blocks.RED_SAND.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_SLAB = registerBlock("red_sand_slab",
            new FallingSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_BUTTON = registerBlock("red_sand_button",
            new FallingButtonBlock(ModBlockSetType.SAND, 10, AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_PRESSURE_PLATE = registerBlock("red_sand_pressure_plate",
            new FallingPressurePlateBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_FENCE = registerBlock("red_sand_fence",
            new FallingFenceBlock(AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_FENCE_GATE = registerBlock("red_sand_fence_gate",
            new FallingFenceGateBlock(ModWoodType.SAND, AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_DOOR = registerBlock("red_sand_door",
            new FallingDoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_TRAPDOOR = registerBlock("red_sand_trapdoor",
            new FallingTrapdoorBlock(ModBlockSetType.SAND, AbstractBlock.Settings.copy(Blocks.RED_SAND)));
    public static final Block RED_SAND_WALL = registerBlock("red_sand_wall",
            new FallingWallBlock(AbstractBlock.Settings.copy(Blocks.RED_SAND)));

    //ice
    public static final Block ICE_STAIRS = registerBlock("ice_stairs",
            new StairsBlock(Blocks.ICE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_SLAB = registerBlock("ice_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_BUTTON = registerBlock("ice_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_PRESSURE_PLATE = registerBlock("ice_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_FENCE = registerBlock("ice_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_FENCE_GATE = registerBlock("ice_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_DOOR = registerBlock("ice_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_TRAPDOOR = registerBlock("ice_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.ICE)));
    public static final Block ICE_WALL = registerBlock("ice_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ICE)));

    //packed_ice
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_BUTTON = registerBlock("packed_ice_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_PRESSURE_PLATE = registerBlock("packed_ice_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_FENCE = registerBlock("packed_ice_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_FENCE_GATE = registerBlock("packed_ice_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_DOOR = registerBlock("packed_ice_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_TRAPDOOR = registerBlock("packed_ice_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));

    //blue_ice
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_BUTTON = registerBlock("blue_ice_button",
            new ButtonBlock(ModBlockSetType.GLASS, 10, AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_PRESSURE_PLATE = registerBlock("blue_ice_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_FENCE = registerBlock("blue_ice_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_FENCE_GATE = registerBlock("blue_ice_fence_gate",
            new FenceGateBlock(ModWoodType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_DOOR = registerBlock("blue_ice_door",
            new DoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_TRAPDOOR = registerBlock("blue_ice_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GLASS, AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));

    //snow_block
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BUTTON = registerBlock("snow_button",
            new ButtonBlock(ModBlockSetType.SNOW, 10, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_PRESSURE_PLATE = registerBlock("snow_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.SNOW, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_FENCE = registerBlock("snow_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_FENCE_GATE = registerBlock("snow_fence_gate",
            new FenceGateBlock(ModWoodType.SNOW, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_DOOR = registerBlock("snow_door",
            new DoorBlock(ModBlockSetType.SNOW, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_TRAPDOOR = registerBlock("snow_trapdoor",
            new TrapdoorBlock(ModBlockSetType.SNOW, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));

    //moss
    public static final Block MOSS_STAIRS = registerBlock("moss_stairs",
            new StairsBlock(Blocks.MOSS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_SLAB = registerBlock("moss_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_BUTTON = registerBlock("moss_button",
            new ButtonBlock(ModBlockSetType.MOSS_BLOCK, 10, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_PRESSURE_PLATE = registerBlock("moss_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.MOSS_BLOCK, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_FENCE = registerBlock("moss_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_FENCE_GATE = registerBlock("moss_fence_gate",
            new FenceGateBlock(ModWoodType.MOSS_BLOCK, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_DOOR = registerBlock("moss_door",
            new DoorBlock(ModBlockSetType.MOSS_BLOCK, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_TRAPDOOR = registerBlock("moss_trapdoor",
            new TrapdoorBlock(ModBlockSetType.MOSS_BLOCK, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSS_WALL = registerBlock("moss_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));

    //calcite
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BUTTON = registerBlock("calcite_button",
            new ButtonBlock(ModBlockSetType.CALCITE, 10, AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.CALCITE, AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_FENCE = registerBlock("calcite_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_FENCE_GATE = registerBlock("calcite_fence_gate",
            new FenceGateBlock(ModWoodType.CALCITE, AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_DOOR = registerBlock("calcite_door",
            new DoorBlock(ModBlockSetType.CALCITE, AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_TRAPDOOR = registerBlock("calcite_trapdoor",
            new TrapdoorBlock(ModBlockSetType.CALCITE, AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));

    public static final Block TUFF_BUTTON = registerBlock("tuff_button",
            new ButtonBlock(ModBlockSetType.TUFF, 10, AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.TUFF, AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block TUFF_FENCE = registerBlock("tuff_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block TUFF_FENCE_GATE = registerBlock("tuff_fence_gate",
            new FenceGateBlock(ModWoodType.TUFF, AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block TUFF_DOOR = registerBlock("tuff_door",
            new DoorBlock(ModBlockSetType.TUFF, AbstractBlock.Settings.copy(Blocks.TUFF)));
    public static final Block TUFF_TRAPDOOR = registerBlock("tuff_trapdoor",
            new TrapdoorBlock(ModBlockSetType.TUFF, AbstractBlock.Settings.copy(Blocks.TUFF)));

    //dripstone_block
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BUTTON = registerBlock("dripstone_button",
            new ButtonBlock(ModBlockSetType.DRIPSTONE, 10, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_PRESSURE_PLATE = registerBlock("dripstone_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DRIPSTONE, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_FENCE = registerBlock("dripstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_FENCE_GATE = registerBlock("dripstone_fence_gate",
            new FenceGateBlock(ModWoodType.DRIPSTONE, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_DOOR = registerBlock("dripstone_door",
            new DoorBlock(ModBlockSetType.DRIPSTONE, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TRAPDOOR = registerBlock("dripstone_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DRIPSTONE, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));

    //magma_block
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new StairsBlock(Blocks.MAGMA_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_BUTTON = registerBlock("magma_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_PRESSURE_PLATE = registerBlock("magma_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_FENCE = registerBlock("magma_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_FENCE_GATE = registerBlock("magma_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_DOOR = registerBlock("magma_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_TRAPDOOR = registerBlock("magma_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));

    //obsidian
    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            new StairsBlock(Blocks.OBSIDIAN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_BUTTON = registerBlock("obsidian_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_PRESSURE_PLATE = registerBlock("obsidian_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_FENCE = registerBlock("obsidian_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_FENCE_GATE = registerBlock("obsidian_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_DOOR = registerBlock("obsidian_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));

    //crying_obsidian
    public static final Block CRYING_OBSIDIAN_STAIRS = registerBlock("crying_obsidian_stairs",
            new StairsBlock(Blocks.CRYING_OBSIDIAN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_BUTTON = registerBlock("crying_obsidian_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_PRESSURE_PLATE = registerBlock("crying_obsidian_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_FENCE = registerBlock("crying_obsidian_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_FENCE_GATE = registerBlock("crying_obsidian_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_DOOR = registerBlock("crying_obsidian_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_TRAPDOOR = registerBlock("crying_obsidian_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_WALL = registerBlock("crying_obsidian_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));

    //crimson_nylium
    public static final Block CRIMSON_NYLIUM_STAIRS = registerBlock("crimson_nylium_stairs",
            new StairsBlock(Blocks.CRIMSON_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_BUTTON = registerBlock("crimson_nylium_button",
            new ButtonBlock(ModBlockSetType.NYLIUM, 10, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_PRESSURE_PLATE = registerBlock("crimson_nylium_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NYLIUM, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_FENCE = registerBlock("crimson_nylium_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_FENCE_GATE = registerBlock("crimson_nylium_fence_gate",
            new FenceGateBlock(ModWoodType.NYLIUM, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_DOOR = registerBlock("crimson_nylium_door",
            new DoorBlock(ModBlockSetType.NYLIUM, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_TRAPDOOR = registerBlock("crimson_nylium_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NYLIUM, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_WALL = registerBlock("crimson_nylium_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));

    //warped_nylium
    public static final Block WARPED_NYLIUM_STAIRS = registerBlock("warped_nylium_stairs",
            new StairsBlock(Blocks.WARPED_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_BUTTON = registerBlock("warped_nylium_button",
            new ButtonBlock(ModBlockSetType.NYLIUM, 10, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_PRESSURE_PLATE = registerBlock("warped_nylium_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NYLIUM, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_FENCE = registerBlock("warped_nylium_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_FENCE_GATE = registerBlock("warped_nylium_fence_gate",
            new FenceGateBlock(ModWoodType.NYLIUM, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_DOOR = registerBlock("warped_nylium_door",
            new DoorBlock(ModBlockSetType.NYLIUM, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_TRAPDOOR = registerBlock("warped_nylium_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NYLIUM, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_WALL = registerBlock("warped_nylium_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));

    //soul_sand
    public static final Block SOUL_SAND_STAIRS = registerBlock("soul_sand_stairs",
            new StairsBlock(Blocks.SOUL_SAND.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_SLAB = registerBlock("soul_sand_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_BUTTON = registerBlock("soul_sand_button",
            new ButtonBlock(ModBlockSetType.SOUL_SAND, 10, AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_PRESSURE_PLATE = registerBlock("soul_sand_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.SOUL_SAND, AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_FENCE = registerBlock("soul_sand_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_FENCE_GATE = registerBlock("soul_sand_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_DOOR = registerBlock("soul_sand_door",
            new DoorBlock(ModBlockSetType.SOUL_SAND, AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_TRAPDOOR = registerBlock("soul_sand_trapdoor",
            new TrapdoorBlock(ModBlockSetType.SOUL_SAND, AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public static final Block SOUL_SAND_WALL = registerBlock("soul_sand_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));

    //soul_soil
    public static final Block SOUL_SOIL_STAIRS = registerBlock("soul_soil_stairs",
            new StairsBlock(Blocks.SOUL_SOIL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_SLAB = registerBlock("soul_soil_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_BUTTON = registerBlock("soul_soil_button",
            new ButtonBlock(ModBlockSetType.SOUL_SOIL, 10, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_PRESSURE_PLATE = registerBlock("soul_soil_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.SOUL_SOIL, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_FENCE = registerBlock("soul_soil_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_FENCE_GATE = registerBlock("soul_soil_fence_gate",
            new FenceGateBlock(ModWoodType.SOUL_SOIL, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_DOOR = registerBlock("soul_soil_door",
            new DoorBlock(ModBlockSetType.SOUL_SOIL, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_TRAPDOOR = registerBlock("soul_soil_trapdoor",
            new TrapdoorBlock(ModBlockSetType.SOUL_SOIL, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
    public static final Block SOUL_SOIL_WALL = registerBlock("soul_soil_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));

    //bone_block
    public static final Block BONE_STAIRS = registerBlock("bone_stairs",
            new StairsBlock(Blocks.BONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_SLAB = registerBlock("bone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_BUTTON = registerBlock("bone_button",
            new ButtonBlock(ModBlockSetType.BONE, 10, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_PRESSURE_PLATE = registerBlock("bone_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.BONE, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_FENCE = registerBlock("bone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_FENCE_GATE = registerBlock("bone_fence_gate",
            new FenceGateBlock(ModWoodType.BONE, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_DOOR = registerBlock("bone_door",
            new DoorBlock(ModBlockSetType.BONE, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_TRAPDOOR = registerBlock("bone_trapdoor",
            new TrapdoorBlock(ModBlockSetType.BONE, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block BONE_WALL = registerBlock("bone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));

    //coal_ore
    public static final Block COAL_ORE_STAIRS = registerBlock("coal_ore_stairs",
            new StairsBlock(Blocks.COAL_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_SLAB = registerBlock("coal_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_BUTTON = registerBlock("coal_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_PRESSURE_PLATE = registerBlock("coal_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_FENCE = registerBlock("coal_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_FENCE_GATE = registerBlock("coal_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_DOOR = registerBlock("coal_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_TRAPDOOR = registerBlock("coal_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_WALL = registerBlock("coal_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COAL_ORE)));

    //deepslate_coal_ore
    public static final Block DEEPSLATE_COAL_ORE_STAIRS = registerBlock("deepslate_coal_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_COAL_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_SLAB = registerBlock("deepslate_coal_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_BUTTON = registerBlock("deepslate_coal_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_PRESSURE_PLATE = registerBlock("deepslate_coal_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_FENCE = registerBlock("deepslate_coal_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_FENCE_GATE = registerBlock("deepslate_coal_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_DOOR = registerBlock("deepslate_coal_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_TRAPDOOR = registerBlock("deepslate_coal_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final Block DEEPSLATE_COAL_ORE_WALL = registerBlock("deepslate_coal_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));

    //iron_ore
    public static final Block IRON_ORE_STAIRS = registerBlock("iron_ore_stairs",
            new StairsBlock(Blocks.IRON_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_SLAB = registerBlock("iron_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_BUTTON = registerBlock("iron_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_PRESSURE_PLATE = registerBlock("iron_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_FENCE = registerBlock("iron_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_FENCE_GATE = registerBlock("iron_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_DOOR = registerBlock("iron_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_TRAPDOOR = registerBlock("iron_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_WALL = registerBlock("iron_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));

    //deepslate_iron_ore
    public static final Block DEEPSLATE_IRON_ORE_STAIRS = registerBlock("deepslate_iron_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_IRON_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_SLAB = registerBlock("deepslate_iron_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_BUTTON = registerBlock("deepslate_iron_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_PRESSURE_PLATE = registerBlock("deepslate_iron_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_FENCE = registerBlock("deepslate_iron_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_FENCE_GATE = registerBlock("deepslate_iron_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_DOOR = registerBlock("deepslate_iron_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_TRAPDOOR = registerBlock("deepslate_iron_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DEEPSLATE_IRON_ORE_WALL = registerBlock("deepslate_iron_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));

    //copper_ore
    public static final Block COPPER_ORE_STAIRS = registerBlock("copper_ore_stairs",
            new StairsBlock(Blocks.COPPER_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_SLAB = registerBlock("copper_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_BUTTON = registerBlock("copper_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_PRESSURE_PLATE = registerBlock("copper_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_FENCE = registerBlock("copper_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_FENCE_GATE = registerBlock("copper_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_DOOR = registerBlock("copper_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_TRAPDOOR = registerBlock("copper_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_WALL = registerBlock("copper_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));

    //deepslate_copper_ore
    public static final Block DEEPSLATE_COPPER_ORE_STAIRS = registerBlock("deepslate_copper_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_COPPER_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_SLAB = registerBlock("deepslate_copper_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_BUTTON = registerBlock("deepslate_copper_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_PRESSURE_PLATE = registerBlock("deepslate_copper_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_FENCE = registerBlock("deepslate_copper_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_FENCE_GATE = registerBlock("deepslate_copper_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_DOOR = registerBlock("deepslate_copper_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_TRAPDOOR = registerBlock("deepslate_copper_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block DEEPSLATE_COPPER_ORE_WALL = registerBlock("deepslate_copper_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));

    //gold_ore
    public static final Block GOLD_ORE_STAIRS = registerBlock("gold_ore_stairs",
            new StairsBlock(Blocks.GOLD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_SLAB = registerBlock("gold_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_BUTTON = registerBlock("gold_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_PRESSURE_PLATE = registerBlock("gold_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_FENCE = registerBlock("gold_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_FENCE_GATE = registerBlock("gold_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_DOOR = registerBlock("gold_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_TRAPDOOR = registerBlock("gold_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_WALL = registerBlock("gold_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));

    //deepslate_gold_ore
    public static final Block DEEPSLATE_GOLD_ORE_STAIRS = registerBlock("deepslate_gold_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_GOLD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_SLAB = registerBlock("deepslate_gold_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_BUTTON = registerBlock("deepslate_gold_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_PRESSURE_PLATE = registerBlock("deepslate_gold_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_FENCE = registerBlock("deepslate_gold_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_FENCE_GATE = registerBlock("deepslate_gold_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_DOOR = registerBlock("deepslate_gold_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_TRAPDOOR = registerBlock("deepslate_gold_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block DEEPSLATE_GOLD_ORE_WALL = registerBlock("deepslate_gold_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));

    //redstone_ore
    public static final Block REDSTONE_ORE_STAIRS = registerBlock("redstone_ore_stairs",
            new RedstoneStairsBlock(Blocks.REDSTONE_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_SLAB = registerBlock("redstone_ore_slab",
            new RedstoneSlabBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_BUTTON = registerBlock("redstone_ore_button",
            new RedstoneButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_PRESSURE_PLATE = registerBlock("redstone_ore_pressure_plate",
            new RedstonePressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_FENCE = registerBlock("redstone_ore_fence",
            new RedstoneFenceBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_FENCE_GATE = registerBlock("redstone_ore_fence_gate",
            new RedstoneFenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_DOOR = registerBlock("redstone_ore_door",
            new RedstoneDoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_TRAPDOOR = registerBlock("redstone_ore_trapdoor",
            new RedstoneTrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
    public static final Block REDSTONE_ORE_WALL = registerBlock("redstone_ore_wall",
            new WallBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().ticksRandomly().strength(3.0f, 3.0f)));

    //deepslate_redstone_ore
    public static final Block DEEPSLATE_REDSTONE_ORE_STAIRS = registerBlock("deepslate_redstone_ore_stairs",
            new RedstoneStairsBlock(Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_SLAB = registerBlock("deepslate_redstone_ore_slab",
            new RedstoneSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_BUTTON = registerBlock("deepslate_redstone_ore_button",
            new RedstoneButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_PRESSURE_PLATE = registerBlock("deepslate_redstone_ore_pressure_plate",
            new RedstonePressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_FENCE = registerBlock("deepslate_redstone_ore_fence",
            new RedstoneFenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_FENCE_GATE = registerBlock("deepslate_redstone_ore_fence_gate",
            new RedstoneFenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_DOOR = registerBlock("deepslate_redstone_ore_door",
            new RedstoneDoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_TRAPDOOR = registerBlock("deepslate_redstone_ore_trapdoor",
            new RedstoneTrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block DEEPSLATE_REDSTONE_ORE_WALL = registerBlock("deepslate_redstone_ore_wall",
            new WallBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().ticksRandomly().strength(3.0f, 3.0f)));

    //emerald_ore
    public static final Block EMERALD_ORE_STAIRS = registerBlock("emerald_ore_stairs",
            new StairsBlock(Blocks.EMERALD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_SLAB = registerBlock("emerald_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_BUTTON = registerBlock("emerald_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_PRESSURE_PLATE = registerBlock("emerald_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_FENCE = registerBlock("emerald_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_FENCE_GATE = registerBlock("emerald_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_DOOR = registerBlock("emerald_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_TRAPDOOR = registerBlock("emerald_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block EMERALD_ORE_WALL = registerBlock("emerald_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));

    //deepslate_emerald_ore
    public static final Block DEEPSLATE_EMERALD_ORE_STAIRS = registerBlock("deepslate_emerald_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_SLAB = registerBlock("deepslate_emerald_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_BUTTON = registerBlock("deepslate_emerald_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE = registerBlock("deepslate_emerald_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_FENCE = registerBlock("deepslate_emerald_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_FENCE_GATE = registerBlock("deepslate_emerald_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_DOOR = registerBlock("deepslate_emerald_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_TRAPDOOR = registerBlock("deepslate_emerald_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_EMERALD_ORE_WALL = registerBlock("deepslate_emerald_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));

    //lapis_ore
    public static final Block LAPIS_ORE_STAIRS = registerBlock("lapis_ore_stairs",
            new StairsBlock(Blocks.LAPIS_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_SLAB = registerBlock("lapis_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_BUTTON = registerBlock("lapis_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_PRESSURE_PLATE = registerBlock("lapis_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_FENCE = registerBlock("lapis_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_FENCE_GATE = registerBlock("lapis_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_DOOR = registerBlock("lapis_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_TRAPDOOR = registerBlock("lapis_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
    public static final Block LAPIS_ORE_WALL = registerBlock("lapis_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));

    //deepslate_lapis_ore
    public static final Block DEEPSLATE_LAPIS_ORE_STAIRS = registerBlock("deepslate_lapis_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_SLAB = registerBlock("deepslate_lapis_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_BUTTON = registerBlock("deepslate_lapis_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE = registerBlock("deepslate_lapis_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_FENCE = registerBlock("deepslate_lapis_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_FENCE_GATE = registerBlock("deepslate_lapis_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_DOOR = registerBlock("deepslate_lapis_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_TRAPDOOR = registerBlock("deepslate_lapis_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final Block DEEPSLATE_LAPIS_ORE_WALL = registerBlock("deepslate_lapis_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));

    //diamond_ore
    public static final Block DIAMOND_ORE_STAIRS = registerBlock("diamond_ore_stairs",
            new StairsBlock(Blocks.DIAMOND_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_SLAB = registerBlock("diamond_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_BUTTON = registerBlock("diamond_ore_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_PRESSURE_PLATE = registerBlock("diamond_ore_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_FENCE = registerBlock("diamond_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_FENCE_GATE = registerBlock("diamond_ore_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_DOOR = registerBlock("diamond_ore_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_TRAPDOOR = registerBlock("diamond_ore_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block DIAMOND_ORE_WALL = registerBlock("diamond_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    //deepslate_diamond_ore
    public static final Block DEEPSLATE_DIAMOND_ORE_STAIRS = registerBlock("deepslate_diamond_ore_stairs",
            new StairsBlock(Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_SLAB = registerBlock("deepslate_diamond_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_BUTTON = registerBlock("deepslate_diamond_ore_button",
            new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE = registerBlock("deepslate_diamond_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_FENCE = registerBlock("deepslate_diamond_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_FENCE_GATE = registerBlock("deepslate_diamond_ore_fence_gate",
            new FenceGateBlock(ModWoodType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_DOOR = registerBlock("deepslate_diamond_ore_door",
            new DoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_TRAPDOOR = registerBlock("deepslate_diamond_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block DEEPSLATE_DIAMOND_ORE_WALL = registerBlock("deepslate_diamond_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    //nether_gold_ore
    public static final Block NETHER_GOLD_ORE_STAIRS = registerBlock("nether_gold_ore_stairs",
            new StairsBlock(Blocks.NETHER_GOLD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_SLAB = registerBlock("nether_gold_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_BUTTON = registerBlock("nether_gold_ore_button",
            new ButtonBlock(ModBlockSetType.NETHER_GOLD_ORE, 10, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_PRESSURE_PLATE = registerBlock("nether_gold_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHER_GOLD_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_FENCE = registerBlock("nether_gold_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_FENCE_GATE = registerBlock("nether_gold_ore_fence_gate",
            new FenceGateBlock(ModWoodType.NETHER_GOLD_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_DOOR = registerBlock("nether_gold_ore_door",
            new DoorBlock(ModBlockSetType.NETHER_GOLD_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_TRAPDOOR = registerBlock("nether_gold_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHER_GOLD_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block NETHER_GOLD_ORE_WALL = registerBlock("nether_gold_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));

    //nether_quartz_ore
    public static final Block NETHER_QUARTZ_ORE_STAIRS = registerBlock("nether_quartz_ore_stairs",
            new StairsBlock(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_SLAB = registerBlock("nether_quartz_ore_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_BUTTON = registerBlock("nether_quartz_ore_button",
            new ButtonBlock(ModBlockSetType.NETHER_ORE, 10, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_PRESSURE_PLATE = registerBlock("nether_quartz_ore_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.NETHER_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_FENCE = registerBlock("nether_quartz_ore_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_FENCE_GATE = registerBlock("nether_quartz_ore_fence_gate",
            new FenceGateBlock(ModWoodType.NETHER_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_DOOR = registerBlock("nether_quartz_ore_door",
            new DoorBlock(ModBlockSetType.NETHER_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_TRAPDOOR = registerBlock("nether_quartz_ore_trapdoor",
            new TrapdoorBlock(ModBlockSetType.NETHER_ORE, AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_QUARTZ_ORE_WALL = registerBlock("nether_quartz_ore_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));

    //ancient_debris
    public static final Block ANCIENT_DEBRIS_STAIRS = registerBlock("ancient_debris_stairs",
            new StairsBlock(Blocks.ANCIENT_DEBRIS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_SLAB = registerBlock("ancient_debris_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_BUTTON = registerBlock("ancient_debris_button",
            new ButtonBlock(ModBlockSetType.ANCIENT_DEBRIS, 10, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_PRESSURE_PLATE = registerBlock("ancient_debris_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.ANCIENT_DEBRIS, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_FENCE = registerBlock("ancient_debris_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_FENCE_GATE = registerBlock("ancient_debris_fence_gate",
            new FenceGateBlock(ModWoodType.ANCIENT_DEBRIS, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_DOOR = registerBlock("ancient_debris_door",
            new DoorBlock(ModBlockSetType.ANCIENT_DEBRIS, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_TRAPDOOR = registerBlock("ancient_debris_trapdoor",
            new TrapdoorBlock(ModBlockSetType.ANCIENT_DEBRIS, AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
    public static final Block ANCIENT_DEBRIS_WALL = registerBlock("ancient_debris_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));

    //raw_iron_block
    public static final Block RAW_IRON_STAIRS = registerBlock("raw_iron_stairs",
            new StairsBlock(Blocks.RAW_IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_SLAB = registerBlock("raw_iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_BUTTON = registerBlock("raw_iron_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_PRESSURE_PLATE = registerBlock("raw_iron_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_FENCE = registerBlock("raw_iron_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_FENCE_GATE = registerBlock("raw_iron_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_DOOR = registerBlock("raw_iron_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_TRAPDOOR = registerBlock("raw_iron_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block RAW_IRON_WALL = registerBlock("raw_iron_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    //raw_copper_block
    public static final Block RAW_COPPER_STAIRS = registerBlock("raw_copper_stairs",
            new StairsBlock(Blocks.RAW_COPPER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_SLAB = registerBlock("raw_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_BUTTON = registerBlock("raw_copper_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_PRESSURE_PLATE = registerBlock("raw_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_FENCE = registerBlock("raw_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_FENCE_GATE = registerBlock("raw_copper_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_DOOR = registerBlock("raw_copper_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_TRAPDOOR = registerBlock("raw_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block RAW_COPPER_WALL = registerBlock("raw_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));

    //raw_gold_block
    public static final Block RAW_GOLD_STAIRS = registerBlock("raw_gold_stairs",
            new StairsBlock(Blocks.RAW_GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_SLAB = registerBlock("raw_gold_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_BUTTON = registerBlock("raw_gold_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_PRESSURE_PLATE = registerBlock("raw_gold_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_FENCE = registerBlock("raw_gold_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_FENCE_GATE = registerBlock("raw_gold_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_DOOR = registerBlock("raw_gold_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_TRAPDOOR = registerBlock("raw_gold_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RAW_GOLD_WALL = registerBlock("raw_gold_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));

    //glowstone
    public static final Block GLOWSTONE_STAIRS = registerBlock("glowstone_stairs",
            new StairsBlock(Blocks.GLOWSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_BUTTON = registerBlock("glowstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_PRESSURE_PLATE = registerBlock("glowstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_FENCE = registerBlock("glowstone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_FENCE_GATE = registerBlock("glowstone_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_DOOR = registerBlock("glowstone_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_TRAPDOOR = registerBlock("glowstone_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_WALL = registerBlock("glowstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));

    //leaves_def
    private static final Block LEAVES_DEF = registerBlock("leaves_def", new Block(AbstractBlock.Settings.create().strength(0.2f).sounds(BlockSoundGroup.GRASS).nonOpaque()
            .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
            .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never)));

    //oak_leaves
    public static final Block OAK_LEAVES_STAIRS = registerBlock("oak_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_SLAB = registerBlock("oak_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_BUTTON = registerBlock("oak_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_PRESSURE_PLATE = registerBlock("oak_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_FENCE = registerBlock("oak_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_FENCE_GATE = registerBlock("oak_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_DOOR = registerBlock("oak_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_TRAPDOOR = registerBlock("oak_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block OAK_LEAVES_WALL = registerBlock("oak_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //spruce_leaves
    public static final Block SPRUCE_LEAVES_STAIRS = registerBlock("spruce_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_SLAB = registerBlock("spruce_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_BUTTON = registerBlock("spruce_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_PRESSURE_PLATE = registerBlock("spruce_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_FENCE = registerBlock("spruce_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_FENCE_GATE = registerBlock("spruce_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_DOOR = registerBlock("spruce_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_TRAPDOOR = registerBlock("spruce_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block SPRUCE_LEAVES_WALL = registerBlock("spruce_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //birch_leaves
    public static final Block BIRCH_LEAVES_STAIRS = registerBlock("birch_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_SLAB = registerBlock("birch_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_BUTTON = registerBlock("birch_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_PRESSURE_PLATE = registerBlock("birch_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_FENCE = registerBlock("birch_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_FENCE_GATE = registerBlock("birch_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_DOOR = registerBlock("birch_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_TRAPDOOR = registerBlock("birch_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block BIRCH_LEAVES_WALL = registerBlock("birch_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //jungle_leaves
    public static final Block JUNGLE_LEAVES_STAIRS = registerBlock("jungle_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_SLAB = registerBlock("jungle_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_BUTTON = registerBlock("jungle_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_PRESSURE_PLATE = registerBlock("jungle_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_FENCE = registerBlock("jungle_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_FENCE_GATE = registerBlock("jungle_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_DOOR = registerBlock("jungle_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_TRAPDOOR = registerBlock("jungle_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block JUNGLE_LEAVES_WALL = registerBlock("jungle_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //acacia_leaves
    public static final Block ACACIA_LEAVES_STAIRS = registerBlock("acacia_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_SLAB = registerBlock("acacia_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_BUTTON = registerBlock("acacia_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_PRESSURE_PLATE = registerBlock("acacia_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_FENCE = registerBlock("acacia_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_FENCE_GATE = registerBlock("acacia_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_DOOR = registerBlock("acacia_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_TRAPDOOR = registerBlock("acacia_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block ACACIA_LEAVES_WALL = registerBlock("acacia_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //dark_oak_leaves
    public static final Block DARK_OAK_LEAVES_STAIRS = registerBlock("dark_oak_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_SLAB = registerBlock("dark_oak_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_BUTTON = registerBlock("dark_oak_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_PRESSURE_PLATE = registerBlock("dark_oak_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_FENCE = registerBlock("dark_oak_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_FENCE_GATE = registerBlock("dark_oak_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_DOOR = registerBlock("dark_oak_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_TRAPDOOR = registerBlock("dark_oak_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block DARK_OAK_LEAVES_WALL = registerBlock("dark_oak_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //mangrove_leaves
    public static final Block MANGROVE_LEAVES_STAIRS = registerBlock("mangrove_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_SLAB = registerBlock("mangrove_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_BUTTON = registerBlock("mangrove_leaves_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_PRESSURE_PLATE = registerBlock("mangrove_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_FENCE = registerBlock("mangrove_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_FENCE_GATE = registerBlock("mangrove_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_DOOR = registerBlock("mangrove_leaves_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_TRAPDOOR = registerBlock("mangrove_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));
    public static final Block MANGROVE_LEAVES_WALL = registerBlock("mangrove_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF)));

    //cherry_leaves
    public static final Block CHERRY_LEAVES_STAIRS = registerBlock("cherry_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_SLAB = registerBlock("cherry_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_BUTTON = registerBlock("cherry_leaves_button",
            new ButtonBlock(ModBlockSetType.CHERRY_LEAVES, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_PRESSURE_PLATE = registerBlock("cherry_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.CHERRY_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_FENCE = registerBlock("cherry_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_FENCE_GATE = registerBlock("cherry_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.CHERRY_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_DOOR = registerBlock("cherry_leaves_door",
            new DoorBlock(ModBlockSetType.CHERRY_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_TRAPDOOR = registerBlock("cherry_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.CHERRY_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CHERRY_LEAVES_WALL = registerBlock("cherry_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.CHERRY_LEAVES)));

    //azalea_leaves
    public static final Block AZALEA_LEAVES_STAIRS = registerBlock("azalea_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_SLAB = registerBlock("azalea_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_BUTTON = registerBlock("azalea_leaves_button",
            new ButtonBlock(ModBlockSetType.AZALEA_LEAVES, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_PRESSURE_PLATE = registerBlock("azalea_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_FENCE = registerBlock("azalea_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_FENCE_GATE = registerBlock("azalea_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_DOOR = registerBlock("azalea_leaves_door",
            new DoorBlock(ModBlockSetType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_TRAPDOOR = registerBlock("azalea_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block AZALEA_LEAVES_WALL = registerBlock("azalea_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));

    //flowering_azalea_leaves
    public static final Block FLOWERING_AZALEA_LEAVES_STAIRS = registerBlock("flowering_azalea_leaves_stairs",
            new StairsBlock(Blocks.AIR.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_SLAB = registerBlock("flowering_azalea_leaves_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_BUTTON = registerBlock("flowering_azalea_leaves_button",
            new ButtonBlock(ModBlockSetType.AZALEA_LEAVES, 10, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE = registerBlock("flowering_azalea_leaves_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_FENCE = registerBlock("flowering_azalea_leaves_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_FENCE_GATE = registerBlock("flowering_azalea_leaves_fence_gate",
            new FenceGateBlock(ModWoodType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_DOOR = registerBlock("flowering_azalea_leaves_door",
            new DoorBlock(ModBlockSetType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_TRAPDOOR = registerBlock("flowering_azalea_leaves_trapdoor",
            new TrapdoorBlock(ModBlockSetType.AZALEA_LEAVES, AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block FLOWERING_AZALEA_LEAVES_WALL = registerBlock("flowering_azalea_leaves_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.LEAVES_DEF).sounds(BlockSoundGroup.AZALEA_LEAVES)));

    //brown_mushroom
    public static final Block BROWN_MUSHROOM_STAIRS = registerBlock("brown_mushroom_stairs",
            new StairsBlock(Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_SLAB = registerBlock("brown_mushroom_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_BUTTON = registerBlock("brown_mushroom_button",
            new ButtonBlock(ModBlockSetType.WOOD, 10, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_PRESSURE_PLATE = registerBlock("brown_mushroom_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_FENCE = registerBlock("brown_mushroom_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_FENCE_GATE = registerBlock("brown_mushroom_fence_gate",
            new FenceGateBlock(ModWoodType.WOOD, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_DOOR = registerBlock("brown_mushroom_door",
            new DoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_TRAPDOOR = registerBlock("brown_mushroom_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block BROWN_MUSHROOM_WALL = registerBlock("brown_mushroom_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));

    //red_mushroom
    public static final Block RED_MUSHROOM_STAIRS = registerBlock("red_mushroom_stairs",
            new StairsBlock(Blocks.RED_MUSHROOM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_SLAB = registerBlock("red_mushroom_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_BUTTON = registerBlock("red_mushroom_button",
            new ButtonBlock(ModBlockSetType.WOOD, 10, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_PRESSURE_PLATE = registerBlock("red_mushroom_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_FENCE = registerBlock("red_mushroom_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_FENCE_GATE = registerBlock("red_mushroom_fence_gate",
            new FenceGateBlock(ModWoodType.WOOD, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_DOOR = registerBlock("red_mushroom_door",
            new DoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_TRAPDOOR = registerBlock("red_mushroom_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block RED_MUSHROOM_WALL = registerBlock("red_mushroom_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));

    //nether_wart
    public static final Block NETHER_WART_STAIRS = registerBlock("nether_wart_stairs",
            new StairsBlock(Blocks.NETHER_WART_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_SLAB = registerBlock("nether_wart_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_BUTTON = registerBlock("nether_wart_button",
            new ButtonBlock(ModBlockSetType.WART_BLOCK, 10, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_PRESSURE_PLATE = registerBlock("nether_wart_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_FENCE = registerBlock("nether_wart_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_FENCE_GATE = registerBlock("nether_wart_fence_gate",
            new FenceGateBlock(ModWoodType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_DOOR = registerBlock("nether_wart_door",
            new DoorBlock(ModBlockSetType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_TRAPDOOR = registerBlock("nether_wart_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block NETHER_WART_WALL = registerBlock("nether_wart_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));

    //warped_wart
    public static final Block WARPED_WART_STAIRS = registerBlock("warped_wart_stairs",
            new StairsBlock(Blocks.WARPED_WART_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_SLAB = registerBlock("warped_wart_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_BUTTON = registerBlock("warped_wart_button",
            new ButtonBlock(ModBlockSetType.WART_BLOCK, 10, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_PRESSURE_PLATE = registerBlock("warped_wart_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_FENCE = registerBlock("warped_wart_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_FENCE_GATE = registerBlock("warped_wart_fence_gate",
            new FenceGateBlock(ModWoodType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_DOOR = registerBlock("warped_wart_door",
            new DoorBlock(ModBlockSetType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_TRAPDOOR = registerBlock("warped_wart_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WART_BLOCK, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
    public static final Block WARPED_WART_WALL = registerBlock("warped_wart_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));

    //shroomlight
    public static final Block SHROOMLIGHT_STAIRS = registerBlock("shroomlight_stairs",
            new StairsBlock(Blocks.SHROOMLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_SLAB = registerBlock("shroomlight_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_BUTTON = registerBlock("shroomlight_button",
            new ButtonBlock(ModBlockSetType.SHROOMLIGHT, 10, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_PRESSURE_PLATE = registerBlock("shroomlight_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.SHROOMLIGHT, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_FENCE = registerBlock("shroomlight_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_FENCE_GATE = registerBlock("shroomlight_fence_gate",
            new FenceGateBlock(ModWoodType.SHROOMLIGHT, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_DOOR = registerBlock("shroomlight_door",
            new DoorBlock(ModBlockSetType.SHROOMLIGHT, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_TRAPDOOR = registerBlock("shroomlight_trapdoor",
            new TrapdoorBlock(ModBlockSetType.SHROOMLIGHT, AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Block SHROOMLIGHT_WALL = registerBlock("shroomlight_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));

    //dried_kelp
    public static final Block DRIED_KELP_STAIRS = registerBlock("dried_kelp_stairs",
            new StairsBlock(Blocks.DRIED_KELP_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_SLAB = registerBlock("dried_kelp_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_BUTTON = registerBlock("dried_kelp_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_PRESSURE_PLATE = registerBlock("dried_kelp_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_FENCE = registerBlock("dried_kelp_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_FENCE_GATE = registerBlock("dried_kelp_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_DOOR = registerBlock("dried_kelp_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_TRAPDOOR = registerBlock("dried_kelp_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
    public static final Block DRIED_KELP_WALL = registerBlock("dried_kelp_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));

    //TUBE_CORAL
    public static final Block TUBE_CORAL_STAIRS = registerBlock("tube_coral_stairs",
            new StairsBlock(Blocks.TUBE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_SLAB = registerBlock("tube_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_BUTTON = registerBlock("tube_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_PRESSURE_PLATE = registerBlock("tube_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_FENCE = registerBlock("tube_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_FENCE_GATE = registerBlock("tube_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_DOOR = registerBlock("tube_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_TRAPDOOR = registerBlock("tube_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Block TUBE_CORAL_WALL = registerBlock("tube_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));

    //DEAD_TUBE_CORAL
    public static final Block DEAD_TUBE_CORAL_STAIRS = registerBlock("dead_tube_coral_stairs",
            new StairsBlock(Blocks.DEAD_TUBE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_SLAB = registerBlock("dead_tube_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_BUTTON = registerBlock("dead_tube_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_PRESSURE_PLATE = registerBlock("dead_tube_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_FENCE = registerBlock("dead_tube_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_FENCE_GATE = registerBlock("dead_tube_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_DOOR = registerBlock("dead_tube_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_TRAPDOOR = registerBlock("dead_tube_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
    public static final Block DEAD_TUBE_CORAL_WALL = registerBlock("dead_tube_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));

    //BRAIN_CORAL
    public static final Block BRAIN_CORAL_STAIRS = registerBlock("brain_coral_stairs",
            new StairsBlock(Blocks.BRAIN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_SLAB = registerBlock("brain_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_BUTTON = registerBlock("brain_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_PRESSURE_PLATE = registerBlock("brain_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_FENCE = registerBlock("brain_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_FENCE_GATE = registerBlock("brain_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_DOOR = registerBlock("brain_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_TRAPDOOR = registerBlock("brain_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Block BRAIN_CORAL_WALL = registerBlock("brain_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));

    //DEAD_BRAIN_CORAL
    public static final Block DEAD_BRAIN_CORAL_STAIRS = registerBlock("dead_brain_coral_stairs",
            new StairsBlock(Blocks.DEAD_BRAIN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_SLAB = registerBlock("dead_brain_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_BUTTON = registerBlock("dead_brain_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_PRESSURE_PLATE = registerBlock("dead_brain_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_FENCE = registerBlock("dead_brain_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_FENCE_GATE = registerBlock("dead_brain_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_DOOR = registerBlock("dead_brain_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_TRAPDOOR = registerBlock("dead_brain_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block DEAD_BRAIN_CORAL_WALL = registerBlock("dead_brain_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));

    //BUBBLE_CORAL
    public static final Block BUBBLE_CORAL_STAIRS = registerBlock("bubble_coral_stairs",
            new StairsBlock(Blocks.BUBBLE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_SLAB = registerBlock("bubble_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_BUTTON = registerBlock("bubble_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_PRESSURE_PLATE = registerBlock("bubble_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_FENCE = registerBlock("bubble_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_FENCE_GATE = registerBlock("bubble_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_DOOR = registerBlock("bubble_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_TRAPDOOR = registerBlock("bubble_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Block BUBBLE_CORAL_WALL = registerBlock("bubble_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));

    //DEAD_BUBBLE_CORAL
    public static final Block DEAD_BUBBLE_CORAL_STAIRS = registerBlock("dead_bubble_coral_stairs",
            new StairsBlock(Blocks.DEAD_BUBBLE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_SLAB = registerBlock("dead_bubble_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_BUTTON = registerBlock("dead_bubble_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_PRESSURE_PLATE = registerBlock("dead_bubble_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_FENCE = registerBlock("dead_bubble_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_FENCE_GATE = registerBlock("dead_bubble_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_DOOR = registerBlock("dead_bubble_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_TRAPDOOR = registerBlock("dead_bubble_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
    public static final Block DEAD_BUBBLE_CORAL_WALL = registerBlock("dead_bubble_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));

    //FIRE_CORAL
    public static final Block FIRE_CORAL_STAIRS = registerBlock("fire_coral_stairs",
            new StairsBlock(Blocks.FIRE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_SLAB = registerBlock("fire_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_BUTTON = registerBlock("fire_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_PRESSURE_PLATE = registerBlock("fire_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_FENCE = registerBlock("fire_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_FENCE_GATE = registerBlock("fire_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_DOOR = registerBlock("fire_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_TRAPDOOR = registerBlock("fire_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Block FIRE_CORAL_WALL = registerBlock("fire_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));

    //DEAD_FIRE_CORAL
    public static final Block DEAD_FIRE_CORAL_STAIRS = registerBlock("dead_fire_coral_stairs",
            new StairsBlock(Blocks.DEAD_FIRE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_SLAB = registerBlock("dead_fire_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_BUTTON = registerBlock("dead_fire_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_PRESSURE_PLATE = registerBlock("dead_fire_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_FENCE = registerBlock("dead_fire_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_FENCE_GATE = registerBlock("dead_fire_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_DOOR = registerBlock("dead_fire_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_TRAPDOOR = registerBlock("dead_fire_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
    public static final Block DEAD_FIRE_CORAL_WALL = registerBlock("dead_fire_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));

    //HORN_CORAL
    public static final Block HORN_CORAL_STAIRS = registerBlock("horn_coral_stairs",
            new StairsBlock(Blocks.HORN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_SLAB = registerBlock("horn_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_BUTTON = registerBlock("horn_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_PRESSURE_PLATE = registerBlock("horn_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_FENCE = registerBlock("horn_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_FENCE_GATE = registerBlock("horn_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_DOOR = registerBlock("horn_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_TRAPDOOR = registerBlock("horn_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
    public static final Block HORN_CORAL_WALL = registerBlock("horn_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));

    //dead_horn_coral
    public static final Block DEAD_HORN_CORAL_STAIRS = registerBlock("dead_horn_coral_stairs",
            new StairsBlock(Blocks.DEAD_HORN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_SLAB = registerBlock("dead_horn_coral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_BUTTON = registerBlock("dead_horn_coral_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_PRESSURE_PLATE = registerBlock("dead_horn_coral_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_FENCE = registerBlock("dead_horn_coral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_FENCE_GATE = registerBlock("dead_horn_coral_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_DOOR = registerBlock("dead_horn_coral_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_TRAPDOOR = registerBlock("dead_horn_coral_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
    public static final Block DEAD_HORN_CORAL_WALL = registerBlock("dead_horn_coral_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));

    //sponge
    public static final Block SPONGE_STAIRS = registerBlock("sponge_stairs",
            new SpongeStairsBlock(Blocks.SPONGE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_SLAB = registerBlock("sponge_slab",
            new SpongeSlabBlock(AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_BUTTON = registerBlock("sponge_button",
            new SpongeButtonBlock(ModBlockSetType.SPONGE, 10, AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_PRESSURE_PLATE = registerBlock("sponge_pressure_plate",
            new SpongePressurePlateBlock(ModBlockSetType.SPONGE, AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_FENCE = registerBlock("sponge_fence",
            new SpongeFenceBlock(AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_FENCE_GATE = registerBlock("sponge_fence_gate",
            new SpongeFenceGateBlock(ModWoodType.SPONGE, AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_DOOR = registerBlock("sponge_door",
            new DoorBlock(ModBlockSetType.SPONGE, AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_TRAPDOOR = registerBlock("sponge_trapdoor",
            new SpongeTrapdoorBlock(ModBlockSetType.SPONGE, AbstractBlock.Settings.copy(Blocks.SPONGE)));
    public static final Block SPONGE_WALL = registerBlock("sponge_wall",
            new SpongeWallBlock(AbstractBlock.Settings.copy(Blocks.SPONGE)));

    //wet_sponge
    public static final Block WET_SPONGE_STAIRS = registerBlock("wet_sponge_stairs",
            new WetSpongeStairsBlock(Blocks.WET_SPONGE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_SLAB = registerBlock("wet_sponge_slab",
            new WetSpongeSlabBlock(AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_BUTTON = registerBlock("wet_sponge_button",
            new WetSpongeButtonBlock(ModBlockSetType.WET_SPONGE, 10, AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_PRESSURE_PLATE = registerBlock("wet_sponge_pressure_plate",
            new WetSpongePressurePlateBlock(ModBlockSetType.WET_SPONGE, AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_FENCE = registerBlock("wet_sponge_fence",
            new WetSpongeFenceBlock(AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_FENCE_GATE = registerBlock("wet_sponge_fence_gate",
            new WetSpongeFenceGateBlock(ModWoodType.WET_SPONGE, AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_DOOR = registerBlock("wet_sponge_door",
            new DoorBlock(ModBlockSetType.WET_SPONGE, AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_TRAPDOOR = registerBlock("wet_sponge_trapdoor",
            new WetSpongeTrapdoorBlock(ModBlockSetType.WET_SPONGE, AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));
    public static final Block WET_SPONGE_WALL = registerBlock("wet_sponge_wall",
            new WetSpongeWallBlock(AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));

    //melon
    public static final Block MELON_STAIRS = registerBlock("melon_stairs",
            new StairsBlock(Blocks.MELON.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_SLAB = registerBlock("melon_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_BUTTON = registerBlock("melon_button",
            new ButtonBlock(ModBlockSetType.WOOD, 10, AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_PRESSURE_PLATE = registerBlock("melon_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_FENCE = registerBlock("melon_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_FENCE_GATE = registerBlock("melon_fence_gate",
            new FenceGateBlock(ModWoodType.WOOD, AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_DOOR = registerBlock("melon_door",
            new DoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_TRAPDOOR = registerBlock("melon_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block MELON_WALL = registerBlock("melon_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MELON)));

    //pumpkin
    public static final Block PUMPKIN_STAIRS = registerBlock("pumpkin_stairs",
            new StairsBlock(Blocks.PUMPKIN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_SLAB = registerBlock("pumpkin_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_BUTTON = registerBlock("pumpkin_button",
            new ButtonBlock(ModBlockSetType.WOOD, 10, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_PRESSURE_PLATE = registerBlock("pumpkin_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_FENCE = registerBlock("pumpkin_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_FENCE_GATE = registerBlock("pumpkin_fence_gate",
            new FenceGateBlock(ModWoodType.WOOD, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_DOOR = registerBlock("pumpkin_door",
            new DoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_TRAPDOOR = registerBlock("pumpkin_trapdoor",
            new TrapdoorBlock(ModBlockSetType.WOOD, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block PUMPKIN_WALL = registerBlock("pumpkin_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));

    //hay_block
    public static final Block HAY_BLOCK_STAIRS = registerBlock("hay_block_stairs",
            new StairsBlock(Blocks.HAY_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_SLAB = registerBlock("hay_block_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_BUTTON = registerBlock("hay_block_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_PRESSURE_PLATE = registerBlock("hay_block_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_FENCE = registerBlock("hay_block_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_FENCE_GATE = registerBlock("hay_block_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_DOOR = registerBlock("hay_block_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_TRAPDOOR = registerBlock("hay_block_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
    public static final Block HAY_BLOCK_WALL = registerBlock("hay_block_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));

    //honeycomb_block
    public static final Block HONEYCOMB_STAIRS = registerBlock("honeycomb_stairs",
            new StairsBlock(Blocks.HONEYCOMB_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_SLAB = registerBlock("honeycomb_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_BUTTON = registerBlock("honeycomb_button",
            new ButtonBlock(ModBlockSetType.CORAL, 10, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_PRESSURE_PLATE = registerBlock("honeycomb_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.CORAL, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_FENCE = registerBlock("honeycomb_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_FENCE_GATE = registerBlock("honeycomb_fence_gate",
            new FenceGateBlock(ModWoodType.CORAL, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_DOOR = registerBlock("honeycomb_door",
            new DoorBlock(ModBlockSetType.CORAL, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_TRAPDOOR = registerBlock("honeycomb_trapdoor",
            new TrapdoorBlock(ModBlockSetType.CORAL, AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_WALL = registerBlock("honeycomb_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));

    //slime_block
    public static final Block SLIME_STAIRS = registerBlock("slime_stairs",
            new SlimeStairsBlock(Blocks.SLIME_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_SLAB = registerBlock("slime_slab",
            new SlimeSlabBlock(AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_BUTTON = registerBlock("slime_button",
            new SlimeButtonBlock(ModBlockSetType.SLIME, 10, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_PRESSURE_PLATE = registerBlock("slime_pressure_plate",
            new SlimePressurePlateBlock(ModBlockSetType.SLIME, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_FENCE = registerBlock("slime_fence",
            new SlimeFenceBlock(AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_FENCE_GATE = registerBlock("slime_fence_gate",
            new SlimeFenceGateBlock(ModWoodType.SLIME, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_DOOR = registerBlock("slime_door",
            new SlimeDoorBlock(ModBlockSetType.SLIME, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_TRAPDOOR = registerBlock("slime_trapdoor",
            new SlimeTrapdoorBlock(ModBlockSetType.SLIME, AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));
    public static final Block SLIME_WALL = registerBlock("slime_wall",
            new SlimeWallBlock(AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK)));

    //honey_block
    public static final Block HONEY_STAIRS = registerBlock("honey_stairs",
            new StairsBlock(Blocks.HONEY_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_SLAB = registerBlock("honey_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_BUTTON = registerBlock("honey_button",
            new ButtonBlock(ModBlockSetType.HONEY, 10, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_PRESSURE_PLATE = registerBlock("honey_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.HONEY, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_FENCE = registerBlock("honey_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_FENCE_GATE = registerBlock("honey_fence_gate",
            new FenceGateBlock(ModWoodType.HONEY, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_DOOR = registerBlock("honey_door",
            new DoorBlock(ModBlockSetType.HONEY, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_TRAPDOOR = registerBlock("honey_trapdoor",
            new TrapdoorBlock(ModBlockSetType.HONEY, AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));
    public static final Block HONEY_WALL = registerBlock("honey_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.HONEY_BLOCK)));

    //ochre_froglight
    public static final Block OCHRE_FROGLIGHT_STAIRS = registerBlock("ochre_froglight_stairs",
            new StairsBlock(Blocks.OCHRE_FROGLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_SLAB = registerBlock("ochre_froglight_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_BUTTON = registerBlock("ochre_froglight_button",
            new ButtonBlock(ModBlockSetType.FROGLIGHT, 10, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_PRESSURE_PLATE = registerBlock("ochre_froglight_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_FENCE = registerBlock("ochre_froglight_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_FENCE_GATE = registerBlock("ochre_froglight_fence_gate",
            new FenceGateBlock(ModWoodType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_DOOR = registerBlock("ochre_froglight_door",
            new DoorBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_TRAPDOOR = registerBlock("ochre_froglight_trapdoor",
            new TrapdoorBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
    public static final Block OCHRE_FROGLIGHT_WALL = registerBlock("ochre_froglight_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));

    //verdant_froglight
    public static final Block VERDANT_FROGLIGHT_STAIRS = registerBlock("verdant_froglight_stairs",
            new StairsBlock(Blocks.VERDANT_FROGLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_SLAB = registerBlock("verdant_froglight_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_BUTTON = registerBlock("verdant_froglight_button",
            new ButtonBlock(ModBlockSetType.FROGLIGHT, 10, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_PRESSURE_PLATE = registerBlock("verdant_froglight_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_FENCE = registerBlock("verdant_froglight_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_FENCE_GATE = registerBlock("verdant_froglight_fence_gate",
            new FenceGateBlock(ModWoodType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_DOOR = registerBlock("verdant_froglight_door",
            new DoorBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_TRAPDOOR = registerBlock("verdant_froglight_trapdoor",
            new TrapdoorBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
    public static final Block VERDANT_FROGLIGHT_WALL = registerBlock("verdant_froglight_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));

    //pearlescent_froglight
    public static final Block PEARLESCENT_FROGLIGHT_STAIRS = registerBlock("pearlescent_froglight_stairs",
            new StairsBlock(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_SLAB = registerBlock("pearlescent_froglight_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_BUTTON = registerBlock("pearlescent_froglight_button",
            new ButtonBlock(ModBlockSetType.FROGLIGHT, 10, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_PRESSURE_PLATE = registerBlock("pearlescent_froglight_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_FENCE = registerBlock("pearlescent_froglight_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_FENCE_GATE = registerBlock("pearlescent_froglight_fence_gate",
            new FenceGateBlock(ModWoodType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_DOOR = registerBlock("pearlescent_froglight_door",
            new DoorBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_TRAPDOOR = registerBlock("pearlescent_froglight_trapdoor",
            new TrapdoorBlock(ModBlockSetType.FROGLIGHT, AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
    public static final Block PEARLESCENT_FROGLIGHT_WALL = registerBlock("pearlescent_froglight_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));

    //sculk
    public static final Block SCULK_STAIRS = registerBlock("sculk_stairs",
            new StairsBlock(Blocks.SCULK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_SLAB = registerBlock("sculk_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_BUTTON = registerBlock("sculk_button",
            new ButtonBlock(ModBlockSetType.SCULK, 10, AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_PRESSURE_PLATE = registerBlock("sculk_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.SCULK, AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_FENCE = registerBlock("sculk_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_FENCE_GATE = registerBlock("sculk_fence_gate",
            new FenceGateBlock(ModWoodType.SCULK, AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_DOOR = registerBlock("sculk_door",
            new DoorBlock(ModBlockSetType.SCULK, AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_TRAPDOOR = registerBlock("sculk_trapdoor",
            new TrapdoorBlock(ModBlockSetType.SCULK, AbstractBlock.Settings.copy(Blocks.SCULK)));
    public static final Block SCULK_WALL = registerBlock("sculk_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SCULK)));

    //bedrock
    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs",
            new StairsBlock(Blocks.BEDROCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_BUTTON = registerBlock("bedrock_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_PRESSURE_PLATE = registerBlock("bedrock_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_FENCE = registerBlock("bedrock_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_FENCE_GATE = registerBlock("bedrock_fence_gate",
            new FenceGateBlock(ModWoodType.STONE, AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK)));

    //target
    public static final Block TARGET_STAIRS = registerBlock("target_stairs",
            new StairsBlock(Blocks.TARGET.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_SLAB = registerBlock("target_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_BUTTON = registerBlock("target_button",
            new ButtonBlock(ModBlockSetType.GRASS, 10, AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_PRESSURE_PLATE = registerBlock("target_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_FENCE = registerBlock("target_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_FENCE_GATE = registerBlock("target_fence_gate",
            new FenceGateBlock(ModWoodType.GRASS, AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_DOOR = registerBlock("target_door",
            new DoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_TRAPDOOR = registerBlock("target_trapdoor",
            new TrapdoorBlock(ModBlockSetType.GRASS, AbstractBlock.Settings.copy(Blocks.TARGET)));
    public static final Block TARGET_WALL = registerBlock("target_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.TARGET)));

    //chiseled_copper
    public static final Block CHISELED_COPPER_STAIRS = registerBlock("chiseled_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_SLAB = registerBlock("chiseled_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_BUTTON = registerBlock("chiseled_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_PRESSURE_PLATE = registerBlock("chiseled_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_FENCE = registerBlock("chiseled_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_FENCE_GATE = registerBlock("chiseled_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_DOOR = registerBlock("chiseled_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_TRAPDOOR = registerBlock("chiseled_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
    public static final Block CHISELED_COPPER_WALL = registerBlock("chiseled_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));

    //copper_grate
    public static final Block COPPER_GRATE_STAIRS = registerBlock("copper_grate_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_SLAB = registerBlock("copper_grate_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_BUTTON = registerBlock("copper_grate_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_PRESSURE_PLATE = registerBlock("copper_grate_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_FENCE = registerBlock("copper_grate_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_FENCE_GATE = registerBlock("copper_grate_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_DOOR = registerBlock("copper_grate_door",
            new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_TRAPDOOR = registerBlock("copper_grate_trapdoor",
            new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
    public static final Block COPPER_GRATE_WALL = registerBlock("copper_grate_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));

    //exposed_chiseled_copper
    public static final Block EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("exposed_chiseled_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_SLAB = registerBlock("exposed_chiseled_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_BUTTON = registerBlock("exposed_chiseled_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("exposed_chiseled_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_FENCE = registerBlock("exposed_chiseled_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_FENCE_GATE = registerBlock("exposed_chiseled_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_DOOR = registerBlock("exposed_chiseled_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_TRAPDOOR = registerBlock("exposed_chiseled_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
    public static final Block EXPOSED_CHISELED_COPPER_WALL = registerBlock("exposed_chiseled_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));

    //exposed_copper_grate
    public static final Block EXPOSED_COPPER_GRATE_STAIRS = registerBlock("exposed_copper_grate_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_SLAB = registerBlock("exposed_copper_grate_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_BUTTON = registerBlock("exposed_copper_grate_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("exposed_copper_grate_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_FENCE = registerBlock("exposed_copper_grate_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_FENCE_GATE = registerBlock("exposed_copper_grate_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_DOOR = registerBlock("exposed_copper_grate_door",
            new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_TRAPDOOR = registerBlock("exposed_copper_grate_trapdoor",
            new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
    public static final Block EXPOSED_COPPER_GRATE_WALL = registerBlock("exposed_copper_grate_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));

    //weathered_chiseled_copper
    public static final Block WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("weathered_chiseled_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_SLAB = registerBlock("weathered_chiseled_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_BUTTON = registerBlock("weathered_chiseled_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("weathered_chiseled_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_FENCE = registerBlock("weathered_chiseled_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_FENCE_GATE = registerBlock("weathered_chiseled_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_DOOR = registerBlock("weathered_chiseled_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_TRAPDOOR = registerBlock("weathered_chiseled_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
    public static final Block WEATHERED_CHISELED_COPPER_WALL = registerBlock("weathered_chiseled_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));

    //weathered_copper_grate
    public static final Block WEATHERED_COPPER_GRATE_STAIRS = registerBlock("weathered_copper_grate_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_SLAB = registerBlock("weathered_copper_grate_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_BUTTON = registerBlock("weathered_copper_grate_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("weathered_copper_grate_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_FENCE = registerBlock("weathered_copper_grate_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_FENCE_GATE = registerBlock("weathered_copper_grate_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_DOOR = registerBlock("weathered_copper_grate_door",
            new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_TRAPDOOR = registerBlock("weathered_copper_grate_trapdoor",
            new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
    public static final Block WEATHERED_COPPER_GRATE_WALL = registerBlock("weathered_copper_grate_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));

    //oxidized_chiseled_copper
    public static final Block OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("oxidized_chiseled_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("oxidized_chiseled_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_BUTTON = registerBlock("oxidized_chiseled_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_chiseled_copper_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_FENCE = registerBlock("oxidized_chiseled_copper_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_FENCE_GATE = registerBlock("oxidized_chiseled_copper_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_DOOR = registerBlock("oxidized_chiseled_copper_door",
            new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_TRAPDOOR = registerBlock("oxidized_chiseled_copper_trapdoor",
            new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
    public static final Block OXIDIZED_CHISELED_COPPER_WALL = registerBlock("oxidized_chiseled_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));

    //oxidized_copper_grate
    public static final Block OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("oxidized_copper_grate_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_SLAB = registerBlock("oxidized_copper_grate_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_BUTTON = registerBlock("oxidized_copper_grate_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("oxidized_copper_grate_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_FENCE = registerBlock("oxidized_copper_grate_fence",
            new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_FENCE_GATE = registerBlock("oxidized_copper_grate_fence_gate",
            new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_DOOR = registerBlock("oxidized_copper_grate_door",
            new OxidizableDoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_TRAPDOOR = registerBlock("oxidized_copper_grate_trapdoor",
            new OxidizableTrapdoorBlock(ModBlockSetType.COPPER_GRATE, Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
    public static final Block OXIDIZED_COPPER_GRATE_WALL = registerBlock("oxidized_copper_grate_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));

    //waxed_chiseled_copper
    public static final Block WAXED_CHISELED_COPPER_STAIRS = registerBlock("waxed_chiseled_copper_stairs",
            new StairsBlock(Blocks.WAXED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_SLAB = registerBlock("waxed_chiseled_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_BUTTON = registerBlock("waxed_chiseled_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_chiseled_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_FENCE = registerBlock("waxed_chiseled_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_chiseled_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_DOOR = registerBlock("waxed_chiseled_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_chiseled_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
    public static final Block WAXED_CHISELED_COPPER_WALL = registerBlock("waxed_chiseled_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));

    //waxed_copper_grate
    public static final Block WAXED_COPPER_GRATE_STAIRS = registerBlock("waxed_copper_grate_stairs",
            new StairsBlock(Blocks.WAXED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_SLAB = registerBlock("waxed_copper_grate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_BUTTON = registerBlock("waxed_copper_grate_button",
            new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_copper_grate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_FENCE = registerBlock("waxed_copper_grate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_copper_grate_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_DOOR = registerBlock("waxed_copper_grate_door",
            new DoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_copper_grate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
    public static final Block WAXED_COPPER_GRATE_WALL = registerBlock("waxed_copper_grate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));

    //waxed_exposed_chiseled_copper
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock("waxed_exposed_chiseled_copper_stairs",
            new StairsBlock(Blocks.WAXED_EXPOSED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_SLAB = registerBlock("waxed_exposed_chiseled_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_BUTTON = registerBlock("waxed_exposed_chiseled_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_chiseled_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_FENCE = registerBlock("waxed_exposed_chiseled_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_exposed_chiseled_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_DOOR = registerBlock("waxed_exposed_chiseled_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_chiseled_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER_WALL = registerBlock("waxed_exposed_chiseled_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));

    //waxed_exposed_copper_grate
    public static final Block WAXED_EXPOSED_COPPER_GRATE_STAIRS = registerBlock("waxed_exposed_copper_grate_stairs",
            new StairsBlock(Blocks.WAXED_EXPOSED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_SLAB = registerBlock("waxed_exposed_copper_grate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_BUTTON = registerBlock("waxed_exposed_copper_grate_button",
            new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_grate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_FENCE = registerBlock("waxed_exposed_copper_grate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_exposed_copper_grate_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_DOOR = registerBlock("waxed_exposed_copper_grate_door",
            new DoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_exposed_copper_grate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE_WALL = registerBlock("waxed_exposed_copper_grate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));

    //waxed_weathered_chiseled_copper
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock("waxed_weathered_chiseled_copper_stairs",
            new StairsBlock(Blocks.WAXED_WEATHERED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_SLAB = registerBlock("waxed_weathered_chiseled_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_BUTTON = registerBlock("waxed_weathered_chiseled_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_chiseled_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_FENCE = registerBlock("waxed_weathered_chiseled_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_weathered_chiseled_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_DOOR = registerBlock("waxed_weathered_chiseled_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_chiseled_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER_WALL = registerBlock("waxed_weathered_chiseled_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));

    //waxed_weathered_copper_grate
    public static final Block WAXED_WEATHERED_COPPER_GRATE_STAIRS = registerBlock("waxed_weathered_copper_grate_stairs",
            new StairsBlock(Blocks.WAXED_WEATHERED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_SLAB = registerBlock("waxed_weathered_copper_grate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_BUTTON = registerBlock("waxed_weathered_copper_grate_button",
            new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_grate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_FENCE = registerBlock("waxed_weathered_copper_grate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_weathered_copper_grate_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_DOOR = registerBlock("waxed_weathered_copper_grate_door",
            new DoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_weathered_copper_grate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE_WALL = registerBlock("waxed_weathered_copper_grate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));

    //waxed_oxidized_chiseled_copper
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock("waxed_oxidized_chiseled_copper_stairs",
            new StairsBlock(Blocks.WAXED_OXIDIZED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock("waxed_oxidized_chiseled_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_BUTTON = registerBlock("waxed_oxidized_chiseled_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_chiseled_copper_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_FENCE = registerBlock("waxed_oxidized_chiseled_copper_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE = registerBlock("waxed_oxidized_chiseled_copper_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_DOOR = registerBlock("waxed_oxidized_chiseled_copper_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_chiseled_copper_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_WALL = registerBlock("waxed_oxidized_chiseled_copper_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));

    //waxed_oxidized_copper_grate
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock("waxed_oxidized_copper_grate_stairs",
            new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_SLAB = registerBlock("waxed_oxidized_copper_grate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_BUTTON = registerBlock("waxed_oxidized_copper_grate_button",
            new ButtonBlock(ModBlockSetType.COPPER_GRATE, 10, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_grate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_FENCE = registerBlock("waxed_oxidized_copper_grate_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE = registerBlock("waxed_oxidized_copper_grate_fence_gate",
            new FenceGateBlock(ModWoodType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_DOOR = registerBlock("waxed_oxidized_copper_grate_door",
            new DoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_oxidized_copper_grate_trapdoor",
            new TrapdoorBlock(ModBlockSetType.COPPER_GRATE, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE_WALL = registerBlock("waxed_oxidized_copper_grate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaBlocksPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Blocks for " + VanillaBlocksPlus.MOD_ID);
    }
}

package net.fellter.vanillablocksplus.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    //oak wood set
    public static final Block OAK_WOOD_MOD = registerBlock("oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block OAK_WOOD_BUTTON = registerBlock("oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block OAK_WOOD_DOOR = registerBlock("oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block OAK_WOOD_TRAPDOOR = registerBlock("oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    //Striped oak wood set
    public static final Block STR_OAK_WOOD_MOD = registerBlock("str_oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STR_OAK_WOOD_STAIRS = registerBlock("str_oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block STR_OAK_WOOD_SLAB = registerBlock("str_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block STR_OAK_WOOD_BUTTON = registerBlock("str_oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block STR_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block STR_OAK_WOOD_FENCE = registerBlock("str_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block STR_OAK_WOOD_FENCE_GATE = registerBlock("str_oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block STR_OAK_WOOD_DOOR = registerBlock("str_oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block STR_OAK_WOOD_TRAPDOOR = registerBlock("str_oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    //spruce wood set
    public static final Block SPRUCE_WOOD_MOD = registerBlock("spruce_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS)));
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)));
    public static final Block SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON), BlockSetType.SPRUCE, 10, true));
    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE), BlockSetType.SPRUCE));
    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE)));
    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE), WoodType.SPRUCE));
    public static final Block SPRUCE_WOOD_DOOR = registerBlock("spruce_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final Block SPRUCE_WOOD_TRAPDOOR = registerBlock("spruce_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    //str spruce wood set
    public static final Block STR_SPRUCE_WOOD_MOD = registerBlock("str_spruce_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block STR_SPRUCE_WOOD_STAIRS = registerBlock("str_spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS)));
    public static final Block STR_SPRUCE_WOOD_SLAB = registerBlock("str_spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)));
    public static final Block STR_SPRUCE_WOOD_BUTTON = registerBlock("str_spruce_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON), BlockSetType.SPRUCE, 10, true));
    public static final Block STR_SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("str_spruce_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE), BlockSetType.SPRUCE));
    public static final Block STR_SPRUCE_WOOD_FENCE = registerBlock("str_spruce_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE)));
    public static final Block STR_SPRUCE_WOOD_FENCE_GATE = registerBlock("str_spruce_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE), WoodType.SPRUCE));
    public static final Block STR_SPRUCE_WOOD_DOOR = registerBlock("str_spruce_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final Block STR_SPRUCE_WOOD_TRAPDOOR = registerBlock("str_spruce_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    //birch wood set
    public static final Block BIRCH_WOOD_MOD = registerBlock("birch_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_STAIRS)));
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB)));
    public static final Block BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON), BlockSetType.BIRCH, 10, true));
    public static final Block BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.BIRCH_PRESSURE_PLATE), BlockSetType.BIRCH));
    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE)));
    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE_GATE), WoodType.BIRCH));
    public static final Block BIRCH_WOOD_DOOR = registerBlock("birch_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
    public static final Block BIRCH_WOOD_TRAPDOOR = registerBlock("birch_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR), BlockSetType.BIRCH));

    //str birch wood set
    public static final Block STR_BIRCH_WOOD_MOD = registerBlock("str_birch_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final Block STR_BIRCH_WOOD_STAIRS = registerBlock("str_birch_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_STAIRS)));
    public static final Block STR_BIRCH_WOOD_SLAB = registerBlock("str_birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB)));
    public static final Block STR_BIRCH_WOOD_BUTTON = registerBlock("str_birch_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON), BlockSetType.BIRCH, 10, true));
    public static final Block STR_BIRCH_WOOD_PRESSURE_PLATE = registerBlock("str_birch_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.BIRCH_PRESSURE_PLATE), BlockSetType.BIRCH));
    public static final Block STR_BIRCH_WOOD_FENCE = registerBlock("str_birch_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE)));
    public static final Block STR_BIRCH_WOOD_FENCE_GATE = registerBlock("str_birch_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE_GATE), WoodType.BIRCH));
    public static final Block STR_BIRCH_WOOD_DOOR = registerBlock("str_birch_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
    public static final Block STR_BIRCH_WOOD_TRAPDOOR = registerBlock("str_birch_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR), BlockSetType.BIRCH));

    //jungle wood set
    public static final Block JUNGLE_WOOD_MOD = registerBlock("jungle_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS)));
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB)));
    public static final Block JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON), BlockSetType.JUNGLE, 10, true));
    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE), BlockSetType.JUNGLE));
    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE)));
    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE), WoodType.JUNGLE));
    public static final Block JUNGLE_WOOD_DOOR = registerBlock("jungle_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE));
    public static final Block JUNGLE_WOOD_TRAPDOOR = registerBlock("jungle_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR), BlockSetType.JUNGLE));

    //str jungle wood set
    public static final Block STR_JUNGLE_WOOD_MOD = registerBlock("str_jungle_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final Block STR_JUNGLE_WOOD_STAIRS = registerBlock("str_jungle_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS)));
    public static final Block STR_JUNGLE_WOOD_SLAB = registerBlock("str_jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB)));
    public static final Block STR_JUNGLE_WOOD_BUTTON = registerBlock("str_jungle_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON), BlockSetType.JUNGLE, 10, true));
    public static final Block STR_JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("str_jungle_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE), BlockSetType.JUNGLE));
    public static final Block STR_JUNGLE_WOOD_FENCE = registerBlock("str_jungle_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE)));
    public static final Block STR_JUNGLE_WOOD_FENCE_GATE = registerBlock("str_jungle_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE), WoodType.JUNGLE));
    public static final Block STR_JUNGLE_WOOD_DOOR = registerBlock("str_jungle_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE));
    public static final Block STR_JUNGLE_WOOD_TRAPDOOR = registerBlock("str_jungle_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR), BlockSetType.JUNGLE));

    //acacia wood set
    public static final Block ACACIA_WOOD_MOD = registerBlock("acacia_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)));
    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_STAIRS)));
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB)));
    public static final Block ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON), BlockSetType.ACACIA, 10, true));
    public static final Block ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.ACACIA_PRESSURE_PLATE), BlockSetType.ACACIA));
    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE)));
    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE_GATE), WoodType.ACACIA));
    public static final Block ACACIA_WOOD_DOOR = registerBlock("acacia_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
    public static final Block ACACIA_WOOD_TRAPDOOR = registerBlock("acacia_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR), BlockSetType.ACACIA));

    //str acacia wood set
    public static final Block STR_ACACIA_WOOD_MOD = registerBlock("str_acacia_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final Block STR_ACACIA_WOOD_STAIRS = registerBlock("str_acacia_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_STAIRS)));
    public static final Block STR_ACACIA_WOOD_SLAB = registerBlock("str_acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB)));
    public static final Block STR_ACACIA_WOOD_BUTTON = registerBlock("str_acacia_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON), BlockSetType.ACACIA, 10, true));
    public static final Block STR_ACACIA_WOOD_PRESSURE_PLATE = registerBlock("str_acacia_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.ACACIA_PRESSURE_PLATE), BlockSetType.ACACIA));
    public static final Block STR_ACACIA_WOOD_FENCE = registerBlock("str_acacia_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE)));
    public static final Block STR_ACACIA_WOOD_FENCE_GATE = registerBlock("str_acacia_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE_GATE), WoodType.ACACIA));
    public static final Block STR_ACACIA_WOOD_DOOR = registerBlock("str_acacia_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
    public static final Block STR_ACACIA_WOOD_TRAPDOOR = registerBlock("str_acacia_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR), BlockSetType.ACACIA));

    //dark oak wood set
    public static final Block DARK_OAK_WOOD_MOD = registerBlock("dark_oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS)));
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB)));
    public static final Block DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_BUTTON), BlockSetType.DARK_OAK, 10, true));
    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_PRESSURE_PLATE), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE)));
    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE_GATE), WoodType.DARK_OAK));
    public static final Block DARK_OAK_WOOD_DOOR = registerBlock("dark_oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_WOOD_TRAPDOOR = registerBlock("dark_oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR), BlockSetType.DARK_OAK));

    //str dark oak wood set
    public static final Block STR_DARK_OAK_WOOD_MOD = registerBlock("str_dark_oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STR_DARK_OAK_WOOD_STAIRS = registerBlock("str_dark_oak_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS)));
    public static final Block STR_DARK_OAK_WOOD_SLAB = registerBlock("str_dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB)));
    public static final Block STR_DARK_OAK_WOOD_BUTTON = registerBlock("str_dark_oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_BUTTON), BlockSetType.DARK_OAK, 10, true));
    public static final Block STR_DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_dark_oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_PRESSURE_PLATE), BlockSetType.DARK_OAK));
    public static final Block STR_DARK_OAK_WOOD_FENCE = registerBlock("str_dark_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE)));
    public static final Block STR_DARK_OAK_WOOD_FENCE_GATE = registerBlock("str_dark_oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE_GATE), WoodType.DARK_OAK));
    public static final Block STR_DARK_OAK_WOOD_DOOR = registerBlock("str_dark_oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
    public static final Block STR_DARK_OAK_WOOD_TRAPDOOR = registerBlock("str_dark_oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR), BlockSetType.DARK_OAK));

    //mangrove wood set
    public static final Block MANGROVE_WOOD_MOD = registerBlock("mangrove_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_STAIRS)));
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_SLAB)));
    public static final Block MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_BUTTON), BlockSetType.MANGROVE, 10, true));
    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.MANGROVE_PRESSURE_PLATE), BlockSetType.MANGROVE));
    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE)));
    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE_GATE), WoodType.MANGROVE));
    public static final Block MANGROVE_WOOD_DOOR = registerBlock("mangrove_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
    public static final Block MANGROVE_WOOD_TRAPDOOR = registerBlock("mangrove_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_TRAPDOOR), BlockSetType.MANGROVE));

    //str mangrove wood set
    public static final Block STR_MANGROVE_WOOD_MOD = registerBlock("str_mangrove_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block STR_MANGROVE_WOOD_STAIRS = registerBlock("str_mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_STAIRS)));
    public static final Block STR_MANGROVE_WOOD_SLAB = registerBlock("str_mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_SLAB)));
    public static final Block STR_MANGROVE_WOOD_BUTTON = registerBlock("str_mangrove_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_BUTTON), BlockSetType.MANGROVE, 10, true));
    public static final Block STR_MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("str_mangrove_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.MANGROVE_PRESSURE_PLATE), BlockSetType.MANGROVE));
    public static final Block STR_MANGROVE_WOOD_FENCE = registerBlock("str_mangrove_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE)));
    public static final Block STR_MANGROVE_WOOD_FENCE_GATE = registerBlock("str_mangrove_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE_GATE), WoodType.MANGROVE));
    public static final Block STR_MANGROVE_WOOD_DOOR = registerBlock("str_mangrove_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
    public static final Block STR_MANGROVE_WOOD_TRAPDOOR = registerBlock("str_mangrove_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_TRAPDOOR), BlockSetType.MANGROVE));

    //cherry wood set
    public static final Block CHERRY_WOOD_MOD = registerBlock("cherry_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));
    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));
    public static final Block CHERRY_WOOD_DOOR = registerBlock("cherry_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block CHERRY_WOOD_TRAPDOOR = registerBlock("cherry_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    //str cherry wood set
    public static final Block STR_CHERRY_WOOD_MOD = registerBlock("str_cherry_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STR_CHERRY_WOOD_STAIRS = registerBlock("str_cherry_wood_stairs",
            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block STR_CHERRY_WOOD_SLAB = registerBlock("str_cherry_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block STR_CHERRY_WOOD_BUTTON = registerBlock("str_cherry_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block STR_CHERRY_WOOD_PRESSURE_PLATE = registerBlock("str_cherry_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));
    public static final Block STR_CHERRY_WOOD_FENCE = registerBlock("str_cherry_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block STR_CHERRY_WOOD_FENCE_GATE = registerBlock("str_cherry_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));
    public static final Block STR_CHERRY_WOOD_DOOR = registerBlock("str_cherry_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block STR_CHERRY_WOOD_TRAPDOOR = registerBlock("str_cherry_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    //bamboo wood set
    public static final Block BAMBOO_BLOCK_MOD = registerBlock("bamboo_block_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block BAMBOO_BLOCK_STAIRS = registerBlock("bamboo_block_stairs",
            new StairsBlock(Blocks.BAMBOO_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BAMBOO_STAIRS).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block BAMBOO_BLOCK_SLAB = registerBlock("bamboo_block_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block BAMBOO_BLOCK_BUTTON = registerBlock("bamboo_block_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BUTTON).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO, 10, true));
    public static final Block BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("bamboo_block_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_PRESSURE_PLATE).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block BAMBOO_BLOCK_FENCE = registerBlock("bamboo_block_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_FENCE).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block BAMBOO_BLOCK_FENCE_GATE = registerBlock("bamboo_block_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_FENCE_GATE).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), WoodType.BAMBOO));
    public static final Block BAMBOO_BLOCK_DOOR = registerBlock("bamboo_block_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block BAMBOO_BLOCK_TRAPDOOR = registerBlock("bamboo_block_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_TRAPDOOR).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));

    //str bamboo wood set
    public static final Block STR_BAMBOO_BLOCK_MOD = registerBlock("str_bamboo_block_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_STAIRS = registerBlock("str_bamboo_block_stairs",
            new StairsBlock(Blocks.STRIPPED_BAMBOO_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BAMBOO_STAIRS).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_SLAB = registerBlock("str_bamboo_block_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_BUTTON = registerBlock("str_bamboo_block_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BUTTON).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO, 10, true));
    public static final Block STR_BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("str_bamboo_block_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_PRESSURE_PLATE).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block STR_BAMBOO_BLOCK_FENCE = registerBlock("str_bamboo_block_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_FENCE).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STR_BAMBOO_BLOCK_FENCE_GATE = registerBlock("str_bamboo_block_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_FENCE_GATE).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), WoodType.BAMBOO));
    public static final Block STR_BAMBOO_BLOCK_DOOR = registerBlock("str_bamboo_block_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block STR_BAMBOO_BLOCK_TRAPDOOR = registerBlock("str_bamboo_block_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_TRAPDOOR).strength(2.0f).instrument(Instrument.BASS).burnable().sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));

    //crimson hyphae set
    public static final Block CRIMSON_HYPHAE_MOD = registerBlock("crimson_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS)));
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)));
    public static final Block CRIMSON_HYPHAE_BUTTON = registerBlock("crimson_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON), BlockSetType.CRIMSON, 10, true));
    public static final Block CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE), BlockSetType.CRIMSON));
    public static final Block CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE)));
    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE_GATE), WoodType.CRIMSON));
    public static final Block CRIMSON_HYPHAE_DOOR = registerBlock("crimson_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
    public static final Block CRIMSON_HYPHAE_TRAPDOOR = registerBlock("crimson_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR), BlockSetType.CRIMSON));

    //str crimson hyphae set
    public static final Block STR_CRIMSON_HYPHAE_MOD = registerBlock("str_crimson_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block STR_CRIMSON_HYPHAE_STAIRS = registerBlock("str_crimson_hyphae_stairs",
            new StairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS)));
    public static final Block STR_CRIMSON_HYPHAE_SLAB = registerBlock("str_crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB)));
    public static final Block STR_CRIMSON_HYPHAE_BUTTON = registerBlock("str_crimson_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON), BlockSetType.CRIMSON, 10, true));
    public static final Block STR_CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("str_crimson_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE), BlockSetType.CRIMSON));
    public static final Block STR_CRIMSON_HYPHAE_FENCE = registerBlock("str_crimson_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE)));
    public static final Block STR_CRIMSON_HYPHAE_FENCE_GATE = registerBlock("str_crimson_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE_GATE), WoodType.CRIMSON));
    public static final Block STR_CRIMSON_HYPHAE_DOOR = registerBlock("str_crimson_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
    public static final Block STR_CRIMSON_HYPHAE_TRAPDOOR = registerBlock("str_crimson_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR), BlockSetType.CRIMSON));

    //warped hyphae set
    public static final Block WARPED_HYPHAE_MOD = registerBlock("warped_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));
    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_STAIRS)));
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB)));
    public static final Block WARPED_HYPHAE_BUTTON = registerBlock("warped_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_BUTTON), BlockSetType.WARPED, 10, true));
    public static final Block WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.WARPED_PRESSURE_PLATE), BlockSetType.WARPED));
    public static final Block WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE)));
    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE), WoodType.WARPED));
    public static final Block WARPED_HYPHAE_DOOR = registerBlock("warped_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_DOOR), BlockSetType.WARPED));
    public static final Block WARPED_HYPHAE_TRAPDOOR = registerBlock("warped_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_TRAPDOOR), BlockSetType.WARPED));

    //str warped hyphae set
    public static final Block STR_WARPED_HYPHAE_MOD = registerBlock("str_warped_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static final Block STR_WARPED_HYPHAE_STAIRS = registerBlock("str_warped_hyphae_stairs",
            new StairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_STAIRS)));
    public static final Block STR_WARPED_HYPHAE_SLAB = registerBlock("str_warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB)));
    public static final Block STR_WARPED_HYPHAE_BUTTON = registerBlock("str_warped_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_BUTTON), BlockSetType.WARPED, 10, true));
    public static final Block STR_WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("str_warped_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.WARPED_PRESSURE_PLATE), BlockSetType.WARPED));
    public static final Block STR_WARPED_HYPHAE_FENCE = registerBlock("str_warped_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE)));
    public static final Block STR_WARPED_HYPHAE_FENCE_GATE = registerBlock("str_warped_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE), WoodType.WARPED));
    public static final Block STR_WARPED_HYPHAE_DOOR = registerBlock("str_warped_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_DOOR), BlockSetType.WARPED));
    public static final Block STR_WARPED_HYPHAE_TRAPDOOR = registerBlock("str_warped_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_TRAPDOOR), BlockSetType.WARPED));

    //stone
    public static final Block STONE_FENCE = registerBlock("stone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_FENCE_GATE = registerBlock("stone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE).sounds(BlockSoundGroup.STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block STONE_DOOR = registerBlock("stone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    //cobblestone
    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block COBBLESTONE_FENCE_GATE = registerBlock("cobblestone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), WoodType.OAK));
    public static final Block COBBLESTONE_DOOR = registerBlock("cobblestone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));

    //mossy cobblestone
    public static final Block MOSSY_COBBLESTONE_FENCE = registerBlock("mossy_cobblestone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("mossy_cobblestone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), WoodType.OAK));
    public static final Block MOSSY_COBBLESTONE_DOOR = registerBlock("mossy_cobblestone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block MOSSY_COBBLESTONE_TRAPDOOR = registerBlock("mossy_cobblestone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));

    //smooth stone
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block SMOOTH_STONE_FENCE = registerBlock("smooth_stone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SMOOTH_STONE_FENCE_GATE = registerBlock("smooth_stone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), WoodType.OAK));
    public static final Block SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    //stone bricks
    public static final Block STONE_BRICKS_FENCE = registerBlock("stone_bricks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_BRICKS_FENCE_GATE = registerBlock("stone_bricks_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.STONE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block STONE_BRICKS_DOOR = registerBlock("stone_bricks_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block STONE_BRICKS_TRAPDOOR = registerBlock("stone_bricks_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block STONE_BRICKS_BUTTON = registerBlock("stone_bricks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block STONE_BRICKS_PRESSURE_PLATE = registerBlock("stone_bricks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));

    //cracked stone bricks set
    public static final Block CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs",
            new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_STONE_BRICKS_BUTTON = registerBlock("cracked_stone_bricks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block CRACKED_STONE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_stone_bricks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block CRACKED_STONE_BRICKS_FENCE = registerBlock("cracked_stone_bricks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_STONE_BRICKS_FENCE_GATE = registerBlock("cracked_stone_bricks_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block CRACKED_STONE_BRICKS_DOOR = registerBlock("cracked_stone_bricks_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block CRACKED_STONE_BRICKS_TRAPDOOR = registerBlock("cracked_stone_bricks_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0F)));

    //granite set
    public static final Block GRANITE_BUTTON = registerBlock("granite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block GRANITE_FENCE = registerBlock("granite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block GRANITE_FENCE_GATE = registerBlock("granite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block GRANITE_DOOR = registerBlock("granite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block GRANITE_TRAPDOOR = registerBlock("granite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));

    //polished granite set
    public static final Block POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_GRANITE_FENCE = registerBlock("polished_granite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_FENCE_GATE = registerBlock("polished_granite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block POLISHED_GRANITE_DOOR = registerBlock("polished_granite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_GRANITE_TRAPDOOR = registerBlock("polished_granite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0F)));

    //diorite set
    public static final Block DIORITE_BUTTON = registerBlock("diorite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block DIORITE_FENCE = registerBlock("diorite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DIORITE_FENCE_GATE = registerBlock("diorite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block DIORITE_DOOR = registerBlock("diorite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));

    //polished diorite set
    public static final Block POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_DIORITE_FENCE = registerBlock("polished_diorite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_FENCE_GATE = registerBlock("polished_diorite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block POLISHED_DIORITE_DOOR = registerBlock("polished_diorite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_DIORITE_TRAPDOOR = registerBlock("polished_diorite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0F)));

    //andesite set
    public static final Block ANDESITE_BUTTON = registerBlock("andesite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block ANDESITE_FENCE = registerBlock("andesite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block ANDESITE_FENCE_GATE = registerBlock("andesite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block ANDESITE_DOOR = registerBlock("andesite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));

    //polished andesite set
    public static final Block POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_ANDESITE_FENCE = registerBlock("polished_andesite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_FENCE_GATE = registerBlock("polished_andesite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block POLISHED_ANDESITE_DOOR = registerBlock("polished_andesite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_ANDESITE_TRAPDOOR = registerBlock("polished_andesite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0F)));

    //deepslate set
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F)));
    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F), BlockSetType.STONE));
    public static final Block DEEPSLATE_FENCE = registerBlock("deepslate_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F)));
    public static final Block DEEPSLATE_FENCE_GATE = registerBlock("deepslate_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F), WoodType.OAK));
    public static final Block DEEPSLATE_DOOR = registerBlock("deepslate_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F), BlockSetType.STONE));
    public static final Block DEEPSLATE_TRAPDOOR = registerBlock("deepslate_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0F, 6.0F), BlockSetType.STONE));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0F)));













    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VanillaBlocksPlus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VanillaBlocksPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        VanillaBlocksPlus.LOGGER.info("Registering Mod Blocks for " + VanillaBlocksPlus.MOD_ID);
    }
}

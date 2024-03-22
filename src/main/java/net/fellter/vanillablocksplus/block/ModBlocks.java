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
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).burnable()));
    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).burnable()));
    public static final Block OAK_WOOD_BUTTON = registerBlock("oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).burnable(), BlockSetType.OAK, 10, true));
    public static final Block OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).burnable(), BlockSetType.OAK));
    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).burnable()));
    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).burnable(), WoodType.OAK));
    public static final Block OAK_WOOD_DOOR = registerBlock("oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).burnable(), BlockSetType.OAK));
    public static final Block OAK_WOOD_TRAPDOOR = registerBlock("oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).burnable(), BlockSetType.OAK));

    //Striped oak wood set
    public static final Block STR_OAK_WOOD_MOD = registerBlock("str_oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).burnable()));
    public static final Block STR_OAK_WOOD_STAIRS = registerBlock("str_oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).burnable()));
    public static final Block STR_OAK_WOOD_SLAB = registerBlock("str_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).burnable()));
    public static final Block STR_OAK_WOOD_BUTTON = registerBlock("str_oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).burnable(), BlockSetType.OAK, 10, true));
    public static final Block STR_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).burnable(), BlockSetType.OAK));
    public static final Block STR_OAK_WOOD_FENCE = registerBlock("str_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).burnable()));
    public static final Block STR_OAK_WOOD_FENCE_GATE = registerBlock("str_oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).burnable(), WoodType.OAK));
    public static final Block STR_OAK_WOOD_DOOR = registerBlock("str_oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).burnable(), BlockSetType.OAK));
    public static final Block STR_OAK_WOOD_TRAPDOOR = registerBlock("str_oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).burnable(), BlockSetType.OAK));

    //spruce wood set
    public static final Block SPRUCE_WOOD_MOD = registerBlock("spruce_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).burnable()));
    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS).burnable()));
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB).burnable()));
    public static final Block SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON).burnable(), BlockSetType.SPRUCE, 10, true));
    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE).burnable(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE).burnable()));
    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).burnable(), WoodType.SPRUCE));
    public static final Block SPRUCE_WOOD_DOOR = registerBlock("spruce_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).burnable(), BlockSetType.SPRUCE));
    public static final Block SPRUCE_WOOD_TRAPDOOR = registerBlock("spruce_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).burnable(), BlockSetType.SPRUCE));

    //str spruce wood set
    public static final Block STR_SPRUCE_WOOD_MOD = registerBlock("str_spruce_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).burnable()));
    public static final Block STR_SPRUCE_WOOD_STAIRS = registerBlock("str_spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS).burnable()));
    public static final Block STR_SPRUCE_WOOD_SLAB = registerBlock("str_spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB).burnable()));
    public static final Block STR_SPRUCE_WOOD_BUTTON = registerBlock("str_spruce_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON).burnable(), BlockSetType.SPRUCE, 10, true));
    public static final Block STR_SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("str_spruce_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE).burnable(), BlockSetType.SPRUCE));
    public static final Block STR_SPRUCE_WOOD_FENCE = registerBlock("str_spruce_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE).burnable()));
    public static final Block STR_SPRUCE_WOOD_FENCE_GATE = registerBlock("str_spruce_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).burnable(), WoodType.SPRUCE));
    public static final Block STR_SPRUCE_WOOD_DOOR = registerBlock("str_spruce_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).burnable(), BlockSetType.SPRUCE));
    public static final Block STR_SPRUCE_WOOD_TRAPDOOR = registerBlock("str_spruce_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).burnable(), BlockSetType.SPRUCE));

    //birch wood set
    public static final Block BIRCH_WOOD_MOD = registerBlock("birch_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).burnable()));
    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_STAIRS).burnable()));
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB).burnable()));
    public static final Block BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON).burnable(), BlockSetType.BIRCH, 10, true));
    public static final Block BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.BIRCH_PRESSURE_PLATE).burnable(), BlockSetType.BIRCH));
    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE).burnable()));
    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE_GATE).burnable(), WoodType.BIRCH));
    public static final Block BIRCH_WOOD_DOOR = registerBlock("birch_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR).burnable(), BlockSetType.BIRCH));
    public static final Block BIRCH_WOOD_TRAPDOOR = registerBlock("birch_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR).burnable(), BlockSetType.BIRCH));

    //str birch wood set
    public static final Block STR_BIRCH_WOOD_MOD = registerBlock("str_birch_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).burnable()));
    public static final Block STR_BIRCH_WOOD_STAIRS = registerBlock("str_birch_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_STAIRS).burnable()));
    public static final Block STR_BIRCH_WOOD_SLAB = registerBlock("str_birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SLAB).burnable()));
    public static final Block STR_BIRCH_WOOD_BUTTON = registerBlock("str_birch_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_BUTTON).burnable(), BlockSetType.BIRCH, 10, true));
    public static final Block STR_BIRCH_WOOD_PRESSURE_PLATE = registerBlock("str_birch_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.BIRCH_PRESSURE_PLATE).burnable(), BlockSetType.BIRCH));
    public static final Block STR_BIRCH_WOOD_FENCE = registerBlock("str_birch_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE).burnable()));
    public static final Block STR_BIRCH_WOOD_FENCE_GATE = registerBlock("str_birch_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE_GATE).burnable(), WoodType.BIRCH));
    public static final Block STR_BIRCH_WOOD_DOOR = registerBlock("str_birch_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR).burnable(), BlockSetType.BIRCH));
    public static final Block STR_BIRCH_WOOD_TRAPDOOR = registerBlock("str_birch_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR).burnable(), BlockSetType.BIRCH));

    //jungle wood set
    public static final Block JUNGLE_WOOD_MOD = registerBlock("jungle_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).burnable()));
    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS).burnable()));
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB).burnable()));
    public static final Block JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON).burnable(), BlockSetType.JUNGLE, 10, true));
    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE).burnable(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE).burnable()));
    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE).burnable(), WoodType.JUNGLE));
    public static final Block JUNGLE_WOOD_DOOR = registerBlock("jungle_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR).burnable(), BlockSetType.JUNGLE));
    public static final Block JUNGLE_WOOD_TRAPDOOR = registerBlock("jungle_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR).burnable(), BlockSetType.JUNGLE));

    //str jungle wood set
    public static final Block STR_JUNGLE_WOOD_MOD = registerBlock("str_jungle_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).burnable()));
    public static final Block STR_JUNGLE_WOOD_STAIRS = registerBlock("str_jungle_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS).burnable()));
    public static final Block STR_JUNGLE_WOOD_SLAB = registerBlock("str_jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB).burnable()));
    public static final Block STR_JUNGLE_WOOD_BUTTON = registerBlock("str_jungle_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON).burnable(), BlockSetType.JUNGLE, 10, true));
    public static final Block STR_JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("str_jungle_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE).burnable(), BlockSetType.JUNGLE));
    public static final Block STR_JUNGLE_WOOD_FENCE = registerBlock("str_jungle_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE).burnable()));
    public static final Block STR_JUNGLE_WOOD_FENCE_GATE = registerBlock("str_jungle_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE).burnable(), WoodType.JUNGLE));
    public static final Block STR_JUNGLE_WOOD_DOOR = registerBlock("str_jungle_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR).burnable(), BlockSetType.JUNGLE));
    public static final Block STR_JUNGLE_WOOD_TRAPDOOR = registerBlock("str_jungle_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR).burnable(), BlockSetType.JUNGLE));

    //acacia wood set
    public static final Block ACACIA_WOOD_MOD = registerBlock("acacia_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).burnable()));
    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_STAIRS).burnable()));
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB).burnable()));
    public static final Block ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON).burnable(), BlockSetType.ACACIA, 10, true));
    public static final Block ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.ACACIA_PRESSURE_PLATE).burnable(), BlockSetType.ACACIA));
    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE).burnable()));
    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE_GATE).burnable(), WoodType.ACACIA));
    public static final Block ACACIA_WOOD_DOOR = registerBlock("acacia_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).burnable(), BlockSetType.ACACIA));
    public static final Block ACACIA_WOOD_TRAPDOOR = registerBlock("acacia_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR).burnable(), BlockSetType.ACACIA));

    //str acacia wood set
    public static final Block STR_ACACIA_WOOD_MOD = registerBlock("str_acacia_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).burnable()));
    public static final Block STR_ACACIA_WOOD_STAIRS = registerBlock("str_acacia_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_STAIRS).burnable()));
    public static final Block STR_ACACIA_WOOD_SLAB = registerBlock("str_acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SLAB).burnable()));
    public static final Block STR_ACACIA_WOOD_BUTTON = registerBlock("str_acacia_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_BUTTON).burnable(), BlockSetType.ACACIA, 10, true));
    public static final Block STR_ACACIA_WOOD_PRESSURE_PLATE = registerBlock("str_acacia_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.ACACIA_PRESSURE_PLATE).burnable(), BlockSetType.ACACIA));
    public static final Block STR_ACACIA_WOOD_FENCE = registerBlock("str_acacia_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE).burnable()));
    public static final Block STR_ACACIA_WOOD_FENCE_GATE = registerBlock("str_acacia_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_FENCE_GATE).burnable(), WoodType.ACACIA));
    public static final Block STR_ACACIA_WOOD_DOOR = registerBlock("str_acacia_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).burnable(), BlockSetType.ACACIA));
    public static final Block STR_ACACIA_WOOD_TRAPDOOR = registerBlock("str_acacia_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR).burnable(), BlockSetType.ACACIA));

    //dark oak wood set
    public static final Block DARK_OAK_WOOD_MOD = registerBlock("dark_oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD).burnable()));
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS).burnable()));
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB).burnable()));
    public static final Block DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_BUTTON).burnable(), BlockSetType.DARK_OAK, 10, true));
    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_PRESSURE_PLATE).burnable(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE).burnable()));
    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE_GATE).burnable(), WoodType.DARK_OAK));
    public static final Block DARK_OAK_WOOD_DOOR = registerBlock("dark_oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR).burnable(), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_WOOD_TRAPDOOR = registerBlock("dark_oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR).burnable(), BlockSetType.DARK_OAK));

    //str dark oak wood set
    public static final Block STR_DARK_OAK_WOOD_MOD = registerBlock("str_dark_oak_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_WOOD).burnable()));
    public static final Block STR_DARK_OAK_WOOD_STAIRS = registerBlock("str_dark_oak_wood_stairs",
            new StairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS).burnable()));
    public static final Block STR_DARK_OAK_WOOD_SLAB = registerBlock("str_dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB).burnable()));
    public static final Block STR_DARK_OAK_WOOD_BUTTON = registerBlock("str_dark_oak_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_BUTTON).burnable(), BlockSetType.DARK_OAK, 10, true));
    public static final Block STR_DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_dark_oak_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.DARK_OAK_PRESSURE_PLATE).burnable(), BlockSetType.DARK_OAK));
    public static final Block STR_DARK_OAK_WOOD_FENCE = registerBlock("str_dark_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE).burnable()));
    public static final Block STR_DARK_OAK_WOOD_FENCE_GATE = registerBlock("str_dark_oak_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE_GATE).burnable(), WoodType.DARK_OAK));
    public static final Block STR_DARK_OAK_WOOD_DOOR = registerBlock("str_dark_oak_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR).burnable(), BlockSetType.DARK_OAK));
    public static final Block STR_DARK_OAK_WOOD_TRAPDOOR = registerBlock("str_dark_oak_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR).burnable(), BlockSetType.DARK_OAK));

    //mangrove wood set
    public static final Block MANGROVE_WOOD_MOD = registerBlock("mangrove_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD).burnable()));
    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_STAIRS).burnable()));
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_SLAB).burnable()));
    public static final Block MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_BUTTON).burnable(), BlockSetType.MANGROVE, 10, true));
    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.MANGROVE_PRESSURE_PLATE).burnable(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE).burnable()));
    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE_GATE).burnable(), WoodType.MANGROVE));
    public static final Block MANGROVE_WOOD_DOOR = registerBlock("mangrove_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR).burnable(), BlockSetType.MANGROVE));
    public static final Block MANGROVE_WOOD_TRAPDOOR = registerBlock("mangrove_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_TRAPDOOR).burnable(), BlockSetType.MANGROVE));

    //str mangrove wood set
    public static final Block STR_MANGROVE_WOOD_MOD = registerBlock("str_mangrove_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD).burnable()));
    public static final Block STR_MANGROVE_WOOD_STAIRS = registerBlock("str_mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_STAIRS).burnable()));
    public static final Block STR_MANGROVE_WOOD_SLAB = registerBlock("str_mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_SLAB).burnable()));
    public static final Block STR_MANGROVE_WOOD_BUTTON = registerBlock("str_mangrove_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_BUTTON).burnable(), BlockSetType.MANGROVE, 10, true));
    public static final Block STR_MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("str_mangrove_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.MANGROVE_PRESSURE_PLATE).burnable(), BlockSetType.MANGROVE));
    public static final Block STR_MANGROVE_WOOD_FENCE = registerBlock("str_mangrove_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE).burnable()));
    public static final Block STR_MANGROVE_WOOD_FENCE_GATE = registerBlock("str_mangrove_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_FENCE_GATE).burnable(), WoodType.MANGROVE));
    public static final Block STR_MANGROVE_WOOD_DOOR = registerBlock("str_mangrove_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR).burnable(), BlockSetType.MANGROVE));
    public static final Block STR_MANGROVE_WOOD_TRAPDOOR = registerBlock("str_mangrove_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_TRAPDOOR).burnable(), BlockSetType.MANGROVE));

    //cherry wood set
    public static final Block CHERRY_WOOD_MOD = registerBlock("cherry_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).burnable()));
    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS).burnable()));
    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB).burnable()));
    public static final Block CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON).burnable(), BlockSetType.CHERRY, 10, true));
    public static final Block CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE).burnable(), BlockSetType.CHERRY));
    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE).burnable(), WoodType.CHERRY));
    public static final Block CHERRY_WOOD_DOOR = registerBlock("cherry_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).burnable(), BlockSetType.CHERRY));
    public static final Block CHERRY_WOOD_TRAPDOOR = registerBlock("cherry_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).burnable(), BlockSetType.CHERRY));

    //str cherry wood set
    public static final Block STR_CHERRY_WOOD_MOD = registerBlock("str_cherry_wood_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).burnable()));
    public static final Block STR_CHERRY_WOOD_STAIRS = registerBlock("str_cherry_wood_stairs",
            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS).burnable()));
    public static final Block STR_CHERRY_WOOD_SLAB = registerBlock("str_cherry_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB).burnable()));
    public static final Block STR_CHERRY_WOOD_BUTTON = registerBlock("str_cherry_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON).burnable(), BlockSetType.CHERRY, 10, true));
    public static final Block STR_CHERRY_WOOD_PRESSURE_PLATE = registerBlock("str_cherry_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE).burnable(), BlockSetType.CHERRY));
    public static final Block STR_CHERRY_WOOD_FENCE = registerBlock("str_cherry_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE).burnable()));
    public static final Block STR_CHERRY_WOOD_FENCE_GATE = registerBlock("str_cherry_wood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE).burnable(), WoodType.CHERRY));
    public static final Block STR_CHERRY_WOOD_DOOR = registerBlock("str_cherry_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).burnable(), BlockSetType.CHERRY));
    public static final Block STR_CHERRY_WOOD_TRAPDOOR = registerBlock("str_cherry_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).burnable(), BlockSetType.CHERRY));

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
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).burnable()));
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS).burnable()));
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB).burnable()));
    public static final Block CRIMSON_HYPHAE_BUTTON = registerBlock("crimson_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON).burnable(), BlockSetType.CRIMSON, 10, true));
    public static final Block CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE).burnable(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE).burnable()));
    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE_GATE).burnable(), WoodType.CRIMSON));
    public static final Block CRIMSON_HYPHAE_DOOR = registerBlock("crimson_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR).burnable(), BlockSetType.CRIMSON));
    public static final Block CRIMSON_HYPHAE_TRAPDOOR = registerBlock("crimson_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR).burnable(), BlockSetType.CRIMSON));

    //str crimson hyphae set
    public static final Block STR_CRIMSON_HYPHAE_MOD = registerBlock("str_crimson_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).burnable()));
    public static final Block STR_CRIMSON_HYPHAE_STAIRS = registerBlock("str_crimson_hyphae_stairs",
            new StairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS).burnable()));
    public static final Block STR_CRIMSON_HYPHAE_SLAB = registerBlock("str_crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB).burnable()));
    public static final Block STR_CRIMSON_HYPHAE_BUTTON = registerBlock("str_crimson_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON).burnable(), BlockSetType.CRIMSON, 10, true));
    public static final Block STR_CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("str_crimson_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE).burnable(), BlockSetType.CRIMSON));
    public static final Block STR_CRIMSON_HYPHAE_FENCE = registerBlock("str_crimson_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE).burnable()));
    public static final Block STR_CRIMSON_HYPHAE_FENCE_GATE = registerBlock("str_crimson_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE_GATE).burnable(), WoodType.CRIMSON));
    public static final Block STR_CRIMSON_HYPHAE_DOOR = registerBlock("str_crimson_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR).burnable(), BlockSetType.CRIMSON));
    public static final Block STR_CRIMSON_HYPHAE_TRAPDOOR = registerBlock("str_crimson_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR).burnable(), BlockSetType.CRIMSON));

    //warped hyphae set
    public static final Block WARPED_HYPHAE_MOD = registerBlock("warped_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE).burnable()));
    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_STAIRS).burnable()));
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB).burnable()));
    public static final Block WARPED_HYPHAE_BUTTON = registerBlock("warped_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_BUTTON).burnable(), BlockSetType.WARPED, 10, true));
    public static final Block WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.WARPED_PRESSURE_PLATE).burnable(), BlockSetType.WARPED));
    public static final Block WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE).burnable()));
    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE).burnable(), WoodType.WARPED));
    public static final Block WARPED_HYPHAE_DOOR = registerBlock("warped_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_DOOR).burnable(), BlockSetType.WARPED));
    public static final Block WARPED_HYPHAE_TRAPDOOR = registerBlock("warped_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_TRAPDOOR).burnable(), BlockSetType.WARPED));

    //str warped hyphae set
    public static final Block STR_WARPED_HYPHAE_MOD = registerBlock("str_warped_hyphae_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE).burnable()));
    public static final Block STR_WARPED_HYPHAE_STAIRS = registerBlock("str_warped_hyphae_stairs",
            new StairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_STAIRS).burnable()));
    public static final Block STR_WARPED_HYPHAE_SLAB = registerBlock("str_warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SLAB).burnable()));
    public static final Block STR_WARPED_HYPHAE_BUTTON = registerBlock("str_warped_hyphae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_BUTTON).burnable(), BlockSetType.WARPED, 10, true));
    public static final Block STR_WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("str_warped_hyphae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.WARPED_PRESSURE_PLATE).burnable(), BlockSetType.WARPED));
    public static final Block STR_WARPED_HYPHAE_FENCE = registerBlock("str_warped_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE).burnable()));
    public static final Block STR_WARPED_HYPHAE_FENCE_GATE = registerBlock("str_warped_hyphae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_FENCE_GATE).burnable(), WoodType.WARPED));
    public static final Block STR_WARPED_HYPHAE_DOOR = registerBlock("str_warped_hyphae_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_DOOR).burnable(), BlockSetType.WARPED));
    public static final Block STR_WARPED_HYPHAE_TRAPDOOR = registerBlock("str_warped_hyphae_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_TRAPDOOR).burnable(), BlockSetType.WARPED));

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

    //cobbled deepslate set
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F), BlockSetType.STONE));
    public static final Block COBBLED_DEEPSLATE_FENCE = registerBlock("cobbled_deepslate_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)));
    public static final Block COBBLED_DEEPSLATE_FENCE_GATE = registerBlock("cobbled_deepslate_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F), WoodType.OAK));
    public static final Block COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F), BlockSetType.STONE));
    public static final Block COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F), BlockSetType.STONE));

    //chiseled deepslate set
    public static final Block CHISELED_DEEPSLATE_STAIRS = registerBlock("chiseled_deepslate_stairs",
            new StairsBlock(Blocks.CHISELED_DEEPSLATE.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_SLAB = registerBlock("chiseled_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_BUTTON = registerBlock("chiseled_deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE), BlockSetType.STONE, 10, false));
    public static final Block CHISELED_DEEPSLATE_PRESSURE_PLATE = registerBlock("chiseled_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE), BlockSetType.STONE));
    public static final Block CHISELED_DEEPSLATE_FENCE = registerBlock("chiseled_deepslate_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHISELED_DEEPSLATE_FENCE_GATE = registerBlock("chiseled_deepslate_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE), WoodType.OAK));
    public static final Block CHISELED_DEEPSLATE_DOOR = registerBlock("chiseled_deepslate_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE), BlockSetType.STONE));
    public static final Block CHISELED_DEEPSLATE_TRAPDOOR = registerBlock("chiseled_deepslate_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE), BlockSetType.STONE));
    public static final Block CHISELED_DEEPSLATE_WALL = registerBlock("chiseled_deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    //polished deepslate set
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.POLISHED_DEEPSLATE), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.POLISHED_DEEPSLATE), BlockSetType.STONE));
    public static final Block POLISHED_DEEPSLATE_FENCE = registerBlock("polished_deepslate_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_FENCE_GATE = registerBlock("polished_deepslate_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.POLISHED_DEEPSLATE), WoodType.OAK));
    public static final Block POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.POLISHED_DEEPSLATE), BlockSetType.STONE));
    public static final Block POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.POLISHED_DEEPSLATE), BlockSetType.STONE));

    //deepslate bricks set
    public static final Block DEEPSLATE_BRICKS_BUTTON = registerBlock("deepslate_bricks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE, 10, false));
    public static final Block DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("deepslate_bricks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE));
    public static final Block DEEPSLATE_BRICKS_FENCE = registerBlock("deepslate_bricks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("deepslate_bricks_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), WoodType.OAK));
    public static final Block DEEPSLATE_BRICKS_DOOR = registerBlock("deepslate_bricks_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE));
    public static final Block DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("deepslate_bricks_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE));

    //cracked deepslate bricks set
    public static final Block CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("cracked_deepslate_bricks_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("cracked_deepslate_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_BUTTON = registerBlock("cracked_deepslate_bricks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE, 10, false));
    public static final Block CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_deepslate_bricks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE));
    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE = registerBlock("cracked_deepslate_bricks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("cracked_deepslate_bricks_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), WoodType.OAK));
    public static final Block CRACKED_DEEPSLATE_BRICKS_DOOR = registerBlock("cracked_deepslate_bricks_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE));
    public static final Block CRACKED_DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("cracked_deepslate_bricks_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), BlockSetType.STONE));
    public static final Block CRACKED_DEEPSLATE_BRICKS_WALL = registerBlock("cracked_deepslate_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    //deepslate tiles set
    public static final Block DEEPSLATE_TILES_BUTTON = registerBlock("deepslate_tiles_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE, 10, false));
    public static final Block DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("deepslate_tiles_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE));
    public static final Block DEEPSLATE_TILES_FENCE = registerBlock("deepslate_tiles_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_TILES_FENCE_GATE = registerBlock("deepslate_tiles_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), WoodType.OAK));
    public static final Block DEEPSLATE_TILES_DOOR = registerBlock("deepslate_tiles_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE));
    public static final Block DEEPSLATE_TILES_TRAPDOOR = registerBlock("deepslate_tiles_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE));

    //cracked deepslate tiles set
    public static final Block CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("cracked_deepslate_tiles_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("cracked_deepslate_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_BUTTON = registerBlock("cracked_deepslate_tiles_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE, 10, false));
    public static final Block CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("cracked_deepslate_tiles_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE));
    public static final Block CRACKED_DEEPSLATE_TILES_FENCE = registerBlock("cracked_deepslate_tiles_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILES_FENCE_GATE = registerBlock("cracked_deepslate_tiles_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), WoodType.OAK));
    public static final Block CRACKED_DEEPSLATE_TILES_DOOR = registerBlock("cracked_deepslate_tiles_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE));
    public static final Block CRACKED_DEEPSLATE_TILES_TRAPDOOR = registerBlock("cracked_deepslate_tiles_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES), BlockSetType.STONE));
    public static final Block CRACKED_DEEPSLATE_TILES_WALL = registerBlock("cracked_deepslate_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    //bricks set
    public static final Block BRICK_BUTTON = registerBlock("brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block BRICK_PRESSURE_PLATE = registerBlock("brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block BRICK_FENCE = registerBlock("brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BRICK_FENCE_GATE = registerBlock("brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), WoodType.OAK));
    public static final Block BRICK_DOOR = registerBlock("brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block BRICK_TRAPDOOR = registerBlock("brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));

    //packed mud set
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_BUTTON = registerBlock("packed_mud_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD), BlockSetType.STONE, 10, false));
    public static final Block PACKED_MUD_PRESSURE_PLATE = registerBlock("packed_mud_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                            .sounds(BlockSoundGroup.PACKED_MUD), BlockSetType.STONE));
    public static final Block PACKED_MUD_FENCE = registerBlock("packed_mud_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_FENCE_GATE = registerBlock("packed_mud_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD), WoodType.OAK));
    public static final Block PACKED_MUD_DOOR = registerBlock("packed_mud_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD), BlockSetType.STONE));
    public static final Block PACKED_MUD_TRAPDOOR = registerBlock("packed_mud_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD), BlockSetType.STONE));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.0f, 3.0F)
                    .sounds(BlockSoundGroup.PACKED_MUD)));

    //mud bricks set
    public static final Block MUD_BRICK_BUTTON = registerBlock("mud_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS), BlockSetType.STONE, 10, false));
    public static final Block MUD_BRICK_PRESSURE_PLATE = registerBlock("mud_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F)
                            .sounds(BlockSoundGroup.MUD_BRICKS), BlockSetType.STONE));
    public static final Block MUD_BRICK_FENCE = registerBlock("mud_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_BRICK_FENCE_GATE = registerBlock("mud_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS), WoodType.OAK));
    public static final Block MUD_BRICK_DOOR = registerBlock("mud_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS), BlockSetType.STONE));
    public static final Block MUD_BRICK_TRAPDOOR = registerBlock("mud_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F)
                    .sounds(BlockSoundGroup.MUD_BRICKS), BlockSetType.STONE));

    //sandstone set
    public static final Block SANDSTONE_MOD = registerBlock("sandstone_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_BUTTON = registerBlock("sandstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE, 10, false));
    public static final Block SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block SANDSTONE_FENCE = registerBlock("sandstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));
    public static final Block SANDSTONE_FENCE_GATE = registerBlock("sandstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), WoodType.OAK));
    public static final Block SANDSTONE_DOOR = registerBlock("sandstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block SANDSTONE_TRAPDOOR = registerBlock("sandstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));

    //smooth sandstone set
    public static final Block SMOOTH_SANDSTONE_BUTTON = registerBlock("smooth_sandstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block SMOOTH_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_sandstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_SANDSTONE_FENCE = registerBlock("smooth_sandstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SMOOTH_SANDSTONE_FENCE_GATE = registerBlock("smooth_sandstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), WoodType.OAK));
    public static final Block SMOOTH_SANDSTONE_DOOR = registerBlock("smooth_sandstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_SANDSTONE_TRAPDOOR = registerBlock("smooth_sandstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    //cut sandstone set
    public static final Block CUT_SANDSTONE_MOD = registerBlock("cut_sandstone_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));
    public static final Block CUT_SANDSTONE_BUTTON = registerBlock("cut_sandstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE, 10, false));
    public static final Block CUT_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_sandstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block CUT_SANDSTONE_FENCE = registerBlock("cut_sandstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));
    public static final Block CUT_SANDSTONE_FENCE_GATE = registerBlock("cut_sandstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), WoodType.OAK));
    public static final Block CUT_SANDSTONE_DOOR = registerBlock("cut_sandstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block CUT_SANDSTONE_TRAPDOOR = registerBlock("cut_sandstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));

    //red sandstone set
    public static final Block RED_SANDSTONE_MOD = registerBlock("red_sandstone_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE, 10, false));
    public static final Block RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block RED_SANDSTONE_FENCE = registerBlock("red_sandstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));
    public static final Block RED_SANDSTONE_FENCE_GATE = registerBlock("red_sandstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), WoodType.OAK));
    public static final Block RED_SANDSTONE_DOOR = registerBlock("red_sandstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block RED_SANDSTONE_TRAPDOOR = registerBlock("red_sandstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));

    //smooth red sandstone set
    public static final Block SMOOTH_RED_SANDSTONE_BUTTON = registerBlock("smooth_red_sandstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_red_sandstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE = registerBlock("smooth_red_sandstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE_GATE = registerBlock("smooth_red_sandstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), WoodType.OAK));
    public static final Block SMOOTH_RED_SANDSTONE_DOOR = registerBlock("smooth_red_sandstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_RED_SANDSTONE_TRAPDOOR = registerBlock("smooth_red_sandstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F), BlockSetType.STONE));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    //cut red sandstone set
    public static final Block CUT_RED_SANDSTONE_MOD = registerBlock("cut_red_sandstone_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));
    public static final Block CUT_RED_SANDSTONE_BUTTON = registerBlock("cut_red_sandstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE, 10, false));
    public static final Block CUT_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_red_sandstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block CUT_RED_SANDSTONE_FENCE = registerBlock("cut_red_sandstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));
    public static final Block CUT_RED_SANDSTONE_FENCE_GATE = registerBlock("cut_red_sandstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), WoodType.OAK));
    public static final Block CUT_RED_SANDSTONE_DOOR = registerBlock("cut_red_sandstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block CUT_RED_SANDSTONE_TRAPDOOR = registerBlock("cut_red_sandstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f), BlockSetType.STONE));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.8f)));

    //sea lantern set
    public static final Block SEA_LANTERN_STAIRS = registerBlock("sea_lantern_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block SEA_LANTERN_BUTTON = registerBlock("sea_lantern_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15), BlockSetType.STONE, 10, false));
    public static final Block SEA_LANTERN_PRESSURE_PLATE = registerBlock("sea_lantern_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                            .sounds(BlockSoundGroup.GLASS).luminance(state -> 15), BlockSetType.STONE));
    public static final Block SEA_LANTERN_FENCE = registerBlock("sea_lantern_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block SEA_LANTERN_FENCE_GATE = registerBlock("sea_lantern_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15), WoodType.OAK));
    public static final Block SEA_LANTERN_DOOR = registerBlock("sea_lantern_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15), BlockSetType.STONE));
    public static final Block SEA_LANTERN_TRAPDOOR = registerBlock("sea_lantern_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15), BlockSetType.STONE));
    public static final Block SEA_LANTERN_WALL = registerBlock("sea_lantern_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.HAT).requiresTool().strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));

    //prismarine set
    public static final Block PRISMARINE_BUTTON = registerBlock("prismarine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block PRISMARINE_FENCE = registerBlock("prismarine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_FENCE_GATE = registerBlock("prismarine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block PRISMARINE_DOOR = registerBlock("prismarine_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));

    //prismarine set
    public static final Block PRISMARINE_BRICK_BUTTON = registerBlock("prismarine_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block PRISMARINE_BRICK_PRESSURE_PLATE = registerBlock("prismarine_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block PRISMARINE_BRICK_FENCE = registerBlock("prismarine_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_BRICK_FENCE_GATE = registerBlock("prismarine_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block PRISMARINE_BRICK_DOOR = registerBlock("prismarine_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block PRISMARINE_BRICK_TRAPDOOR = registerBlock("prismarine_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    //dark prismarine set
    public static final Block DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE, 10, false));
    public static final Block DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block DARK_PRISMARINE_FENCE = registerBlock("dark_prismarine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PRISMARINE_FENCE_GATE = registerBlock("dark_prismarine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), WoodType.OAK));
    public static final Block DARK_PRISMARINE_DOOR = registerBlock("dark_prismarine_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block DARK_PRISMARINE_TRAPDOOR = registerBlock("dark_prismarine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F), BlockSetType.STONE));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    //netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_BUTTON = registerBlock("netherrack_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK), ModBlockSetTypes.NETHERRACK, 10, false));
    public static final Block NETHERRACK_PRESSURE_PLATE = registerBlock("netherrack_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                            .sounds(BlockSoundGroup.NETHERRACK), ModBlockSetTypes.NETHERRACK));
    public static final Block NETHERRACK_FENCE = registerBlock("netherrack_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block NETHERRACK_FENCE_GATE = registerBlock("netherrack_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK), ModWoodTypes.NETHERRACK));
    public static final Block NETHERRACK_DOOR = registerBlock("netherrack_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK), ModBlockSetTypes.NETHERRACK));
    public static final Block NETHERRACK_TRAPDOOR = registerBlock("netherrack_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK), ModBlockSetTypes.NETHERRACK));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(0.4f)
                    .sounds(BlockSoundGroup.NETHERRACK)));

    //nether bricks
    public static final Block NETHER_BRICK_BUTTON = registerBlock("nether_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK, 10, false));
    public static final Block NETHER_BRICK_PRESSURE_PLATE = registerBlock("nether_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                            .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModWoodTypes.NETHERRACK));
    public static final Block NETHER_BRICK_DOOR = registerBlock("nether_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block NETHER_BRICK_TRAPDOOR = registerBlock("nether_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));

    //cracked nether bricks
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            new StairsBlock(Blocks.NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_BUTTON = registerBlock("cracked_nether_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK, 10, false));
    public static final Block CRACKED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("cracked_nether_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                            .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = registerBlock("cracked_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModWoodTypes.NETHERRACK));
    public static final Block CRACKED_NETHER_BRICK_DOOR = registerBlock("cracked_nether_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block CRACKED_NETHER_BRICK_TRAPDOOR = registerBlock("cracked_nether_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    //red nether bricks
    public static final Block RED_NETHER_BRICK_BUTTON = registerBlock("red_nether_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK, 10, false));
    public static final Block RED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("red_nether_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                            .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModWoodTypes.NETHERRACK));
    public static final Block RED_NETHER_BRICK_DOOR = registerBlock("red_nether_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));
    public static final Block RED_NETHER_BRICK_TRAPDOOR = registerBlock("red_nether_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS), ModBlockSetTypes.NETHERRACK));

    //basalt
    public static final Block BASALT_MOD = registerBlock("basalt_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block BASALT_STAIRS = registerBlock("basalt_stairs",
            new StairsBlock(Blocks.BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block BASALT_SLAB = registerBlock("basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block BASALT_BUTTON = registerBlock("basalt_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE, 10, false));
    public static final Block BASALT_PRESSURE_PLATE = registerBlock("basalt_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                            .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block BASALT_FENCE = registerBlock("basalt_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block BASALT_FENCE_GATE = registerBlock("basalt_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), ModWoodTypes.NETHERRACK));
    public static final Block BASALT_DOOR = registerBlock("basalt_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block BASALT_TRAPDOOR = registerBlock("basalt_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block BASALT_WALL = registerBlock("basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));

    //smooth basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_BUTTON = registerBlock("smooth_basalt_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE, 10, false));
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE = registerBlock("smooth_basalt_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                            .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_FENCE_GATE = registerBlock("smooth_basalt_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), ModWoodTypes.NETHERRACK));
    public static final Block SMOOTH_BASALT_DOOR = registerBlock("smooth_basalt_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block SMOOTH_BASALT_TRAPDOOR = registerBlock("smooth_basalt_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));

    //polished basalt
    public static final Block POLISHED_BASALT_MOD = registerBlock("polished_basalt_mod",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            new StairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block POLISHED_BASALT_BUTTON = registerBlock("polished_basalt_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_BASALT_PRESSURE_PLATE = registerBlock("polished_basalt_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                            .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block POLISHED_BASALT_FENCE = registerBlock("polished_basalt_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block POLISHED_BASALT_FENCE_GATE = registerBlock("polished_basalt_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), ModWoodTypes.NETHERRACK));
    public static final Block POLISHED_BASALT_DOOR = registerBlock("polished_basalt_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block POLISHED_BASALT_TRAPDOOR = registerBlock("polished_basalt_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT), BlockSetType.STONE));
    public static final Block POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.BASALT)));

    //blackstone
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE, 10, false));
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE));
    public static final Block BLACKSTONE_FENCE = registerBlock("blackstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)));
    public static final Block BLACKSTONE_FENCE_GATE = registerBlock("blackstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), ModWoodTypes.NETHERRACK));
    public static final Block BLACKSTONE_DOOR = registerBlock("blackstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE));
    public static final Block BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE));

    //gilded blackstone
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE), BlockSetType.STONE, 10, false));
    public static final Block GILDED_BLACKSTONE_PRESSURE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                            .sounds(BlockSoundGroup.GILDED_BLACKSTONE), BlockSetType.STONE));
    public static final Block GILDED_BLACKSTONE_FENCE = registerBlock("gilded_blackstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_FENCE_GATE = registerBlock("gilded_blackstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE), ModWoodTypes.NETHERRACK));
    public static final Block GILDED_BLACKSTONE_DOOR = registerBlock("gilded_blackstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE), BlockSetType.STONE));
    public static final Block GILDED_BLACKSTONE_TRAPDOOR = registerBlock("gilded_blackstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE), BlockSetType.STONE));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    //polished blackstone
    public static final Block POLISHED_BLACKSTONE_FENCE = registerBlock("polished_blackstone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)));
    public static final Block POLISHED_BLACKSTONE_FENCE_GATE = registerBlock("polished_blackstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), ModWoodTypes.NETHERRACK));
    public static final Block POLISHED_BLACKSTONE_DOOR = registerBlock("polished_blackstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_TRAPDOOR = registerBlock("polished_blackstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));

    //gilded blackstone
    public static final Block POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("polished_blackstone_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE, 10, false));
    public static final Block POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("polished_blackstone_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("polished_blackstone_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)));
    public static final Block POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("polished_blackstone_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), WoodType.OAK));
    public static final Block POLISHED_BLACKSTONE_BRICK_DOOR = registerBlock("polished_blackstone_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_TRAPDOOR = registerBlock("polished_blackstone_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));

    //cracked polished blackstone bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("cracked_polished_blackstone_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE, 10, false));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("cracked_polished_blackstone_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("cracked_polished_blackstone_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("cracked_polished_blackstone_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), WoodType.OAK));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR = registerBlock("cracked_polished_blackstone_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR = registerBlock("cracked_polished_blackstone_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f), BlockSetType.POLISHED_BLACKSTONE));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.25f, 6.0f)));

    //end stone
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f)));
    public static final Block END_STONE_BUTTON = registerBlock("end_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE, 10, false));
    public static final Block END_STONE_PRESSURE_PLATE = registerBlock("end_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE));
    public static final Block END_STONE_FENCE = registerBlock("end_stone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f)));
    public static final Block END_STONE_FENCE_GATE = registerBlock("end_stone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), WoodType.OAK));
    public static final Block END_STONE_DOOR = registerBlock("end_stone_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE));
    public static final Block END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f)));

    //end stone brick
    public static final Block END_STONE_BRICK_BUTTON = registerBlock("end_stone_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE, 10, false));
    public static final Block END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE));
    public static final Block END_STONE_BRICK_FENCE = registerBlock("end_stone_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f)));
    public static final Block END_STONE_BRICK_FENCE_GATE = registerBlock("end_stone_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), WoodType.OAK));
    public static final Block END_STONE_BRICK_DOOR = registerBlock("end_stone_brick_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE));
    public static final Block END_STONE_BRICK_TRAPDOOR = registerBlock("end_stone_brick_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 9.0f), BlockSetType.STONE));

    //purpur block
    public static final Block PURPUR_BUTTON = registerBlock("purpur_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE, 10, false));
    public static final Block PURPUR_PRESSURE_PLATE = registerBlock("purpur_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE));
    public static final Block PURPUR_FENCE = registerBlock("purpur_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)));
    public static final Block PURPUR_FENCE_GATE = registerBlock("purpur_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), WoodType.OAK));
    public static final Block PURPUR_DOOR = registerBlock("purpur_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE));
    public static final Block PURPUR_TRAPDOOR = registerBlock("purpur_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f), BlockSetType.STONE));
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)));

    //coal
    public static final Block COAL_STAIRS = registerBlock("coal_stairs",
            new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f)));
    public static final Block COAL_SLAB = registerBlock("coal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f)));
    public static final Block COAL_BUTTON = registerBlock("coal_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f), BlockSetType.STONE, 10, false));
    public static final Block COAL_PRESSURE_PLATE = registerBlock("coal_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f), BlockSetType.STONE));
    public static final Block COAL_FENCE = registerBlock("coal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f)));
    public static final Block COAL_FENCE_GATE = registerBlock("coal_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f), WoodType.OAK));
    public static final Block COAL_DOOR = registerBlock("coal_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_DOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f), BlockSetType.STONE));
    public static final Block COAL_TRAPDOOR = registerBlock("coal_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_TRAPDOOR)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f), BlockSetType.STONE));
    public static final Block COAL_WALL = registerBlock("coal_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f, 6.0f)));

    //iron
    public static final Block IRON_STAIRS = registerBlock("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                    .instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL).requiresTool().strength(5.0f, 6.0f)));
    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL).requiresTool().strength(5.0f, 6.0f)));
    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL)
                    .requiresTool().strength(5.0f, 6.0f), BlockSetType.STONE, 10, false));
    public static final Block IRON_FENCE = registerBlock("iron_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL)
                    .requiresTool().strength(5.0f, 6.0f)));
    public static final Block IRON_FENCE_GATE = registerBlock("iron_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_FENCE_GATE)
                    .instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL)
                    .requiresTool().strength(5.0f, 6.0f), WoodType.OAK));
    public static final Block IRON_WALL = registerBlock("iron_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)
                    .instrument(Instrument.IRON_XYLOPHONE).sounds(BlockSoundGroup.METAL)
                    .requiresTool().strength(5.0f, 6.0f)));







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

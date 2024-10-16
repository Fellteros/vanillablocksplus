package net.fellter.vanillablocksplus.block;

import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks2 extends Block {

    public ModBlocks2(Settings settings) {
        super(settings);
    }

    //chiseled_tuff
    public static final Block CHISELED_TUFF_STAIRS = registerBlock("chiseled_tuff_stairs",
            new StairsBlock(Blocks.CHISELED_TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_SLAB = registerBlock("chiseled_tuff_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_BUTTON = registerBlock("chiseled_tuff_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_PRESSURE_PLATE = registerBlock("chiseled_tuff_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_FENCE = registerBlock("chiseled_tuff_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_FENCE_GATE = registerBlock("chiseled_tuff_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_DOOR = registerBlock("chiseled_tuff_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_TRAPDOOR = registerBlock("chiseled_tuff_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
    public static final Block CHISELED_TUFF_WALL = registerBlock("chiseled_tuff_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));

    //polished_tuff
    public static final Block POLISHED_TUFF_BUTTON = registerBlock("polished_tuff_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerBlock("polished_tuff_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_FENCE = registerBlock("polished_tuff_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_FENCE_GATE = registerBlock("polished_tuff_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_DOOR = registerBlock("polished_tuff_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_TRAPDOOR = registerBlock("polished_tuff_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF)));

    //tuff_bricks
    public static final Block TUFF_BRICKS_BUTTON = registerBlock("tuff_bricks_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block TUFF_BRICKS_PRESSURE_PLATE = registerBlock("tuff_bricks_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block TUFF_BRICKS_FENCE = registerBlock("tuff_bricks_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block TUFF_BRICKS_FENCE_GATE = registerBlock("tuff_bricks_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block TUFF_BRICKS_DOOR = registerBlock("tuff_bricks_door",
            new DoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));
    public static final Block TUFF_BRICKS_TRAPDOOR = registerBlock("tuff_bricks_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS)));

    public static final Block LOG_DEF = registerBlock("log_def",
            new Block(Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //oak_log_set
    public static final Block OAK_LOG_STAIRS = registerBlock("oak_log_stairs",
            new StairsBlock(Blocks.OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_SLAB = registerBlock("oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_BUTTON = registerBlock("oak_log_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_PRESSURE_PLATE = registerBlock("oak_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_FENCE = registerBlock("oak_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_FENCE_GATE = registerBlock("oak_log_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_DOOR = registerBlock("oak_log_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_TRAPDOOR = registerBlock("oak_log_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block OAK_LOG_WALL = registerBlock("oak_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_oak_log_set
    public static final Block STR_OAK_LOG_STAIRS = registerBlock("str_oak_log_stairs",
            new StairsBlock(Blocks.STRIPPED_OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_SLAB = registerBlock("str_oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_BUTTON = registerBlock("str_oak_log_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_PRESSURE_PLATE = registerBlock("str_oak_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_FENCE = registerBlock("str_oak_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_FENCE_GATE = registerBlock("str_oak_log_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_DOOR = registerBlock("str_oak_log_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_TRAPDOOR = registerBlock("str_oak_log_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_OAK_LOG_WALL = registerBlock("str_oak_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //spruce_log_set
    public static final Block SPRUCE_LOG_STAIRS = registerBlock("spruce_log_stairs",
            new StairsBlock(Blocks.SPRUCE_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_BUTTON = registerBlock("spruce_log_button",
            new ButtonBlock(BlockSetType.SPRUCE, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_PRESSURE_PLATE = registerBlock("spruce_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_FENCE = registerBlock("spruce_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_FENCE_GATE = registerBlock("spruce_log_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_DOOR = registerBlock("spruce_log_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_TRAPDOOR = registerBlock("spruce_log_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block SPRUCE_LOG_WALL = registerBlock("spruce_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_spruce_log_set
    public static final Block STR_SPRUCE_LOG_STAIRS = registerBlock("str_spruce_log_stairs",
            new StairsBlock(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_SLAB = registerBlock("str_spruce_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_BUTTON = registerBlock("str_spruce_log_button",
            new ButtonBlock(BlockSetType.SPRUCE, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_PRESSURE_PLATE = registerBlock("str_spruce_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_FENCE = registerBlock("str_spruce_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_FENCE_GATE = registerBlock("str_spruce_log_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_DOOR = registerBlock("str_spruce_log_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_TRAPDOOR = registerBlock("str_spruce_log_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_SPRUCE_LOG_WALL = registerBlock("str_spruce_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //birch_log_set
    public static final Block BIRCH_LOG_STAIRS = registerBlock("birch_log_stairs",
            new StairsBlock(Blocks.BIRCH_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_SLAB = registerBlock("birch_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_BUTTON = registerBlock("birch_log_button",
            new ButtonBlock(BlockSetType.BIRCH, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_PRESSURE_PLATE = registerBlock("birch_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_FENCE = registerBlock("birch_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_FENCE_GATE = registerBlock("birch_log_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_DOOR = registerBlock("birch_log_door",
            new DoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_TRAPDOOR = registerBlock("birch_log_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block BIRCH_LOG_WALL = registerBlock("birch_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_birch_log_set
    public static final Block STR_BIRCH_LOG_STAIRS = registerBlock("str_birch_log_stairs",
            new StairsBlock(Blocks.STRIPPED_BIRCH_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_SLAB = registerBlock("str_birch_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_BUTTON = registerBlock("str_birch_log_button",
            new ButtonBlock(BlockSetType.BIRCH, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_PRESSURE_PLATE = registerBlock("str_birch_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_FENCE = registerBlock("str_birch_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_FENCE_GATE = registerBlock("str_birch_log_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_DOOR = registerBlock("str_birch_log_door",
            new DoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_TRAPDOOR = registerBlock("str_birch_log_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_BIRCH_LOG_WALL = registerBlock("str_birch_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //jungle_log_set
    public static final Block JUNGLE_LOG_STAIRS = registerBlock("jungle_log_stairs",
            new StairsBlock(Blocks.JUNGLE_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_BUTTON = registerBlock("jungle_log_button",
            new ButtonBlock(BlockSetType.JUNGLE, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_PRESSURE_PLATE = registerBlock("jungle_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_FENCE = registerBlock("jungle_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_FENCE_GATE = registerBlock("jungle_log_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_DOOR = registerBlock("jungle_log_door",
            new DoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_TRAPDOOR = registerBlock("jungle_log_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block JUNGLE_LOG_WALL = registerBlock("jungle_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_jungle_log_set
    public static final Block STR_JUNGLE_LOG_STAIRS = registerBlock("str_jungle_log_stairs",
            new StairsBlock(Blocks.STRIPPED_JUNGLE_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_SLAB = registerBlock("str_jungle_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_BUTTON = registerBlock("str_jungle_log_button",
            new ButtonBlock(BlockSetType.JUNGLE, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_PRESSURE_PLATE = registerBlock("str_jungle_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_FENCE = registerBlock("str_jungle_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_FENCE_GATE = registerBlock("str_jungle_log_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_DOOR = registerBlock("str_jungle_log_door",
            new DoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_TRAPDOOR = registerBlock("str_jungle_log_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_JUNGLE_LOG_WALL = registerBlock("str_jungle_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //acacia_log_set
    public static final Block ACACIA_LOG_STAIRS = registerBlock("acacia_log_stairs",
            new StairsBlock(Blocks.ACACIA_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_SLAB = registerBlock("acacia_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_BUTTON = registerBlock("acacia_log_button",
            new ButtonBlock(BlockSetType.ACACIA, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_PRESSURE_PLATE = registerBlock("acacia_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_FENCE = registerBlock("acacia_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_FENCE_GATE = registerBlock("acacia_log_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_DOOR = registerBlock("acacia_log_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_TRAPDOOR = registerBlock("acacia_log_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block ACACIA_LOG_WALL = registerBlock("acacia_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_acacia_log_set
    public static final Block STR_ACACIA_LOG_STAIRS = registerBlock("str_acacia_log_stairs",
            new StairsBlock(Blocks.STRIPPED_ACACIA_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_SLAB = registerBlock("str_acacia_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_BUTTON = registerBlock("str_acacia_log_button",
            new ButtonBlock(BlockSetType.ACACIA, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_PRESSURE_PLATE = registerBlock("str_acacia_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_FENCE = registerBlock("str_acacia_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_FENCE_GATE = registerBlock("str_acacia_log_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_DOOR = registerBlock("str_acacia_log_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_TRAPDOOR = registerBlock("str_acacia_log_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_ACACIA_LOG_WALL = registerBlock("str_acacia_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //dark_oak_log_set
    public static final Block DARK_OAK_LOG_STAIRS = registerBlock("dark_oak_log_stairs",
            new StairsBlock(Blocks.DARK_OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_BUTTON = registerBlock("dark_oak_log_button",
            new ButtonBlock(BlockSetType.DARK_OAK, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_PRESSURE_PLATE = registerBlock("dark_oak_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_FENCE = registerBlock("dark_oak_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_FENCE_GATE = registerBlock("dark_oak_log_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_DOOR = registerBlock("dark_oak_log_door",
            new DoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_TRAPDOOR = registerBlock("dark_oak_log_trapdoor",
            new TrapdoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block DARK_OAK_LOG_WALL = registerBlock("dark_oak_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_dark_oak_log_set
    public static final Block STR_DARK_OAK_LOG_STAIRS = registerBlock("str_dark_oak_log_stairs",
            new StairsBlock(Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_SLAB = registerBlock("str_dark_oak_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_BUTTON = registerBlock("str_dark_oak_log_button",
            new ButtonBlock(BlockSetType.DARK_OAK, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_PRESSURE_PLATE = registerBlock("str_dark_oak_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_FENCE = registerBlock("str_dark_oak_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_FENCE_GATE = registerBlock("str_dark_oak_log_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_DOOR = registerBlock("str_dark_oak_log_door",
            new DoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_TRAPDOOR = registerBlock("str_dark_oak_log_trapdoor",
            new TrapdoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_DARK_OAK_LOG_WALL = registerBlock("str_dark_oak_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //mangrove_log_set
    public static final Block MANGROVE_LOG_STAIRS = registerBlock("mangrove_log_stairs",
            new StairsBlock(Blocks.MANGROVE_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_BUTTON = registerBlock("mangrove_log_button",
            new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_PRESSURE_PLATE = registerBlock("mangrove_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_FENCE = registerBlock("mangrove_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_FENCE_GATE = registerBlock("mangrove_log_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_DOOR = registerBlock("mangrove_log_door",
            new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_TRAPDOOR = registerBlock("mangrove_log_trapdoor",
            new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block MANGROVE_LOG_WALL = registerBlock("mangrove_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //str_mangrove_log_set
    public static final Block STR_MANGROVE_LOG_STAIRS = registerBlock("str_mangrove_log_stairs",
            new StairsBlock(Blocks.STRIPPED_MANGROVE_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_SLAB = registerBlock("str_mangrove_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_BUTTON = registerBlock("str_mangrove_log_button",
            new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_PRESSURE_PLATE = registerBlock("str_mangrove_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_FENCE = registerBlock("str_mangrove_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_FENCE_GATE = registerBlock("str_mangrove_log_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_DOOR = registerBlock("str_mangrove_log_door",
            new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_TRAPDOOR = registerBlock("str_mangrove_log_trapdoor",
            new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(LOG_DEF)));
    public static final Block STR_MANGROVE_LOG_WALL = registerBlock("str_mangrove_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF)));

    //cherry_log_set
    public static final Block CHERRY_LOG_STAIRS = registerBlock("cherry_log_stairs",
            new StairsBlock(Blocks.CHERRY_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_SLAB = registerBlock("cherry_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_BUTTON = registerBlock("cherry_log_button",
            new ButtonBlock(BlockSetType.CHERRY, 10, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_PRESSURE_PLATE = registerBlock("cherry_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_FENCE = registerBlock("cherry_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_FENCE_GATE = registerBlock("cherry_log_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_DOOR = registerBlock("cherry_log_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_TRAPDOOR = registerBlock("cherry_log_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LOG_WALL = registerBlock("cherry_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    //str_cherry_log_set
    public static final Block STR_CHERRY_LOG_STAIRS = registerBlock("str_cherry_log_stairs",
            new StairsBlock(Blocks.STRIPPED_CHERRY_LOG.getDefaultState(), AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_SLAB = registerBlock("str_cherry_log_slab",
            new SlabBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_BUTTON = registerBlock("str_cherry_log_button",
            new ButtonBlock(BlockSetType.CHERRY, 10, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_PRESSURE_PLATE = registerBlock("str_cherry_log_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_FENCE = registerBlock("str_cherry_log_fence",
            new FenceBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_FENCE_GATE = registerBlock("str_cherry_log_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_DOOR = registerBlock("str_cherry_log_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_TRAPDOOR = registerBlock("str_cherry_log_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block STR_CHERRY_LOG_WALL = registerBlock("str_cherry_log_wall",
            new WallBlock(AbstractBlock.Settings.copy(LOG_DEF).sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block NETHER_DEF = registerBlock("nether_def",
            new Block(Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM)));

    //crimson_stem_set
    public static final Block CRIMSON_STEM_STAIRS = registerBlock("crimson_stem_stairs",
            new StairsBlock(Blocks.CRIMSON_STEM.getDefaultState(), AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_BUTTON = registerBlock("crimson_stem_button",
            new ButtonBlock(BlockSetType.CRIMSON, 10, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_PRESSURE_PLATE = registerBlock("crimson_stem_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_FENCE = registerBlock("crimson_stem_fence",
            new FenceBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_FENCE_GATE = registerBlock("crimson_stem_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_DOOR = registerBlock("crimson_stem_door",
            new DoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_TRAPDOOR = registerBlock("crimson_stem_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block CRIMSON_STEM_WALL = registerBlock("crimson_stem_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHER_DEF)));

    //str_crimson_stem_set
    public static final Block STR_CRIMSON_STEM_STAIRS = registerBlock("str_crimson_stem_stairs",
            new StairsBlock(Blocks.STRIPPED_CRIMSON_STEM.getDefaultState(), AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_SLAB = registerBlock("str_crimson_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_BUTTON = registerBlock("str_crimson_stem_button",
            new ButtonBlock(BlockSetType.CRIMSON, 10, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_PRESSURE_PLATE = registerBlock("str_crimson_stem_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_FENCE = registerBlock("str_crimson_stem_fence",
            new FenceBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_FENCE_GATE = registerBlock("str_crimson_stem_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_DOOR = registerBlock("str_crimson_stem_door",
            new DoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_TRAPDOOR = registerBlock("str_crimson_stem_trapdoor",
            new TrapdoorBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_CRIMSON_STEM_WALL = registerBlock("str_crimson_stem_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHER_DEF)));

    //warped_stem_set
    public static final Block WARPED_STEM_STAIRS = registerBlock("warped_stem_stairs",
            new StairsBlock(Blocks.WARPED_STEM.getDefaultState(), AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_SLAB = registerBlock("warped_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_BUTTON = registerBlock("warped_stem_button",
            new ButtonBlock(BlockSetType.WARPED, 10, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_PRESSURE_PLATE = registerBlock("warped_stem_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_FENCE = registerBlock("warped_stem_fence",
            new FenceBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_FENCE_GATE = registerBlock("warped_stem_fence_gate",
            new FenceGateBlock(WoodType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_DOOR = registerBlock("warped_stem_door",
            new DoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_TRAPDOOR = registerBlock("warped_stem_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block WARPED_STEM_WALL = registerBlock("warped_stem_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHER_DEF)));

    //str_warped_stem_set
    public static final Block STR_WARPED_STEM_STAIRS = registerBlock("str_warped_stem_stairs",
            new StairsBlock(Blocks.STRIPPED_WARPED_STEM.getDefaultState(), AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_SLAB = registerBlock("str_warped_stem_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_BUTTON = registerBlock("str_warped_stem_button",
            new ButtonBlock(BlockSetType.WARPED, 10, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_PRESSURE_PLATE = registerBlock("str_warped_stem_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_FENCE = registerBlock("str_warped_stem_fence",
            new FenceBlock(AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_FENCE_GATE = registerBlock("str_warped_stem_fence_gate",
            new FenceGateBlock(WoodType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_DOOR = registerBlock("str_warped_stem_door",
            new DoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_TRAPDOOR = registerBlock("str_warped_stem_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, AbstractBlock.Settings.copy(NETHER_DEF)));
    public static final Block STR_WARPED_STEM_WALL = registerBlock("str_warped_stem_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHER_DEF)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaBlocksPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks2() {
    }
}

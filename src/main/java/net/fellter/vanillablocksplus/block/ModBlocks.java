package net.fellter.vanillablocksplus.block;


import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.fellter.vanillablocksplus.custom_blocks.concrete_powder.*;
import net.fellter.vanillablocksplus.custom_blocks.copper.*;
import net.fellter.vanillablocksplus.custom_blocks.falling.*;
import net.fellter.vanillablocksplus.custom_blocks.glass.*;
import net.fellter.vanillablocksplus.custom_blocks.redstone_block.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    

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



    
    //plank walls
    public static final Block OAK_WALL = registerBlock("oak_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_WALL = registerBlock("birch_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_WALL = registerBlock("acacia_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_WALL = registerBlock("dark_oak_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_WALL = registerBlock("mangrove_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_WALL = registerBlock("cherry_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_WALL = registerBlock("bamboo_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_WALL = registerBlock("crimson_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_WALL = registerBlock("warped_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));


    //oak_wood_set
    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs", (settings) -> new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_BUTTON = registerBlock("oak_wood_button", (settings) -> new ButtonBlock(BlockSetType.OAK, 10, settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_DOOR = registerBlock("oak_wood_door", (settings) -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_TRAPDOOR = registerBlock("oak_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block OAK_WOOD_WALL = registerBlock("oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));

    //str_oak_wood_set
    public static final Block STR_OAK_WOOD_STAIRS = registerBlock("str_oak_wood_stairs", (settings) -> new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_SLAB = registerBlock("str_oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_BUTTON = registerBlock("str_oak_wood_button", (settings) -> new ButtonBlock(BlockSetType.OAK, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_oak_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_FENCE = registerBlock("str_oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_FENCE_GATE = registerBlock("str_oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_DOOR = registerBlock("str_oak_wood_door", (settings) -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_TRAPDOOR = registerBlock("str_oak_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STR_OAK_WOOD_WALL = registerBlock("str_oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    //spruce_wood_set
    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs", (settings) -> new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button", (settings) -> new ButtonBlock(BlockSetType.SPRUCE, 10, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_DOOR = registerBlock("spruce_wood_door", (settings) -> new DoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_TRAPDOOR = registerBlock("spruce_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));

    //str_spruce_wood_set
    public static final Block STR_SPRUCE_WOOD_STAIRS = registerBlock("str_spruce_wood_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_SLAB = registerBlock("str_spruce_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_BUTTON = registerBlock("str_spruce_wood_button", (settings) -> new ButtonBlock(BlockSetType.SPRUCE, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("str_spruce_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_FENCE = registerBlock("str_spruce_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_FENCE_GATE = registerBlock("str_spruce_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_DOOR = registerBlock("str_spruce_wood_door", (settings) -> new DoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_TRAPDOOR = registerBlock("str_spruce_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));
    public static final Block STR_SPRUCE_WOOD_WALL = registerBlock("str_spruce_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));

    //birch_wood_set
    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs", (settings) -> new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button", (settings) -> new ButtonBlock(BlockSetType.BIRCH, 10, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_DOOR = registerBlock("birch_wood_door", (settings) -> new DoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_TRAPDOOR = registerBlock("birch_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block BIRCH_WOOD_WALL = registerBlock("birch_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));

    //str_birch_wood_set
    public static final Block STR_BIRCH_WOOD_STAIRS = registerBlock("str_birch_wood_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_SLAB = registerBlock("str_birch_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_BUTTON = registerBlock("str_birch_wood_button", (settings) -> new ButtonBlock(BlockSetType.BIRCH, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_PRESSURE_PLATE = registerBlock("str_birch_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_FENCE = registerBlock("str_birch_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_FENCE_GATE = registerBlock("str_birch_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_DOOR = registerBlock("str_birch_wood_door", (settings) -> new DoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_TRAPDOOR = registerBlock("str_birch_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));
    public static final Block STR_BIRCH_WOOD_WALL = registerBlock("str_birch_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));

    //jungle_wood_set
    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs", (settings) -> new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button", (settings) -> new ButtonBlock(BlockSetType.JUNGLE, 10, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_DOOR = registerBlock("jungle_wood_door", (settings) -> new DoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_TRAPDOOR = registerBlock("jungle_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));
    public static final Block JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD));

    //str_jungle_wood_set
    public static final Block STR_JUNGLE_WOOD_STAIRS = registerBlock("str_jungle_wood_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_SLAB = registerBlock("str_jungle_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_BUTTON = registerBlock("str_jungle_wood_button", (settings) -> new ButtonBlock(BlockSetType.JUNGLE, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("str_jungle_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_FENCE = registerBlock("str_jungle_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_FENCE_GATE = registerBlock("str_jungle_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_DOOR = registerBlock("str_jungle_wood_door", (settings) -> new DoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_TRAPDOOR = registerBlock("str_jungle_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));
    public static final Block STR_JUNGLE_WOOD_WALL = registerBlock("str_jungle_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD));

    //acacia_wood_set
    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs", (settings) -> new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button", (settings) -> new ButtonBlock(BlockSetType.ACACIA, 10, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_DOOR = registerBlock("acacia_wood_door", (settings) -> new DoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_TRAPDOOR = registerBlock("acacia_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));
    public static final Block ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD));

    //str_acacia_wood_set
    public static final Block STR_ACACIA_WOOD_STAIRS = registerBlock("str_acacia_wood_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_SLAB = registerBlock("str_acacia_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_BUTTON = registerBlock("str_acacia_wood_button", (settings) -> new ButtonBlock(BlockSetType.ACACIA, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_PRESSURE_PLATE = registerBlock("str_acacia_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_FENCE = registerBlock("str_acacia_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_FENCE_GATE = registerBlock("str_acacia_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_DOOR = registerBlock("str_acacia_wood_door", (settings) -> new DoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_TRAPDOOR = registerBlock("str_acacia_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));
    public static final Block STR_ACACIA_WOOD_WALL = registerBlock("str_acacia_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD));

    //dark_oak_wood_set
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs", (settings) -> new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button", (settings) -> new ButtonBlock(BlockSetType.DARK_OAK, 10, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_DOOR = registerBlock("dark_oak_wood_door", (settings) -> new DoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_TRAPDOOR = registerBlock("dark_oak_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));
    public static final Block DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD));

    //str_dark_oak_wood_set
    public static final Block STR_DARK_OAK_WOOD_STAIRS = registerBlock("str_dark_oak_wood_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_SLAB = registerBlock("str_dark_oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_BUTTON = registerBlock("str_dark_oak_wood_button", (settings) -> new ButtonBlock(BlockSetType.DARK_OAK, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("str_dark_oak_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_FENCE = registerBlock("str_dark_oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_FENCE_GATE = registerBlock("str_dark_oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_DOOR = registerBlock("str_dark_oak_wood_door", (settings) -> new DoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_TRAPDOOR = registerBlock("str_dark_oak_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));
    public static final Block STR_DARK_OAK_WOOD_WALL = registerBlock("str_dark_oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD));

    //mangrove_wood_set
    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs", (settings) -> new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button", (settings) -> new ButtonBlock(BlockSetType.MANGROVE, 10, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_DOOR = registerBlock("mangrove_wood_door", (settings) -> new DoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_TRAPDOOR = registerBlock("mangrove_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));

    //str_mangrove_wood_set
    public static final Block STR_MANGROVE_WOOD_STAIRS = registerBlock("str_mangrove_wood_stairs", (settings) -> new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_SLAB = registerBlock("str_mangrove_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_BUTTON = registerBlock("str_mangrove_wood_button", (settings) -> new ButtonBlock(BlockSetType.MANGROVE, 10, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("str_mangrove_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_FENCE = registerBlock("str_mangrove_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_FENCE_GATE = registerBlock("str_mangrove_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_DOOR = registerBlock("str_mangrove_wood_door", (settings) -> new DoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_TRAPDOOR = registerBlock("str_mangrove_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STR_MANGROVE_WOOD_WALL = registerBlock("str_mangrove_wood_wall", WallBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());

    //cherry_wood_set
    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs", (settings) -> new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button", (settings) -> new ButtonBlock(BlockSetType.CHERRY, 10, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_DOOR = registerBlock("cherry_wood_door", (settings) -> new DoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_TRAPDOOR = registerBlock("cherry_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));

    //str_cherry_wood_set
    public static final Block STR_CHERRY_WOOD_STAIRS = registerBlock("str_cherry_wood_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_CHERRY_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_SLAB = registerBlock("str_cherry_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_BUTTON = registerBlock("str_cherry_wood_button", (settings) -> new ButtonBlock(BlockSetType.CHERRY, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_PRESSURE_PLATE = registerBlock("str_cherry_wood_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_FENCE = registerBlock("str_cherry_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_FENCE_GATE = registerBlock("str_cherry_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_DOOR = registerBlock("str_cherry_wood_door", (settings) -> new DoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_TRAPDOOR = registerBlock("str_cherry_wood_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));
    public static final Block STR_CHERRY_WOOD_WALL = registerBlock("str_cherry_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));

    //bamboo_wood_set
    public static final Block BAMBOO_BLOCK_STAIRS = registerBlock("bamboo_block_stairs", (settings) -> new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_SLAB = registerBlock("bamboo_block_slab", SlabBlock::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_BUTTON = registerBlock("bamboo_block_button", (settings) -> new ButtonBlock(ModBlockSetType.BAMBOO_WOOD, 10, settings), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("bamboo_block_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_FENCE = registerBlock("bamboo_block_fence", FenceBlock::new, AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_FENCE_GATE = registerBlock("bamboo_block_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_DOOR = registerBlock("bamboo_block_door", (settings) -> new DoorBlock(ModBlockSetType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_TRAPDOOR = registerBlock("bamboo_block_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable());
    public static final Block BAMBOO_BLOCK_WALL = registerBlock("bamboo_block_wall", WallBlock::new, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));

    //str_bamboo_wood_set
    public static final Block STR_BAMBOO_BLOCK_STAIRS = registerBlock("str_bamboo_block_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_SLAB = registerBlock("str_bamboo_block_slab", SlabBlock::new, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_BUTTON = registerBlock("str_bamboo_block_button", (settings) -> new ButtonBlock(ModBlockSetType.BAMBOO_WOOD, 10, settings), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("str_bamboo_block_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_FENCE = registerBlock("str_bamboo_block_fence", FenceBlock::new, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_FENCE_GATE = registerBlock("str_bamboo_block_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_DOOR = registerBlock("str_bamboo_block_door", (settings) -> new DoorBlock(ModBlockSetType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_TRAPDOOR = registerBlock("str_bamboo_block_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.BAMBOO_WOOD, settings), AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block STR_BAMBOO_BLOCK_WALL = registerBlock("str_bamboo_block_wall", WallBlock::new, AbstractBlock.Settings.create().strength(2.0f).instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.BAMBOO_WOOD));

    //crimson_hyphae_set
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs", (settings) -> new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_BUTTON = registerBlock("crimson_hyphae_button", (settings) -> new ButtonBlock(BlockSetType.CRIMSON, 10, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_hyphae_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate", (settings) -> new FenceGateBlock(WoodType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_DOOR = registerBlock("crimson_hyphae_door", (settings) -> new DoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_TRAPDOOR = registerBlock("crimson_hyphae_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));
    public static final Block CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE));

    //str_crimson_hyphae_set
    public static final Block STR_CRIMSON_HYPHAE_STAIRS = registerBlock("str_crimson_hyphae_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_SLAB = registerBlock("str_crimson_hyphae_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_BUTTON = registerBlock("str_crimson_hyphae_button", (settings) -> new ButtonBlock(BlockSetType.CRIMSON, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("str_crimson_hyphae_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_FENCE = registerBlock("str_crimson_hyphae_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_FENCE_GATE = registerBlock("str_crimson_hyphae_fence_gate", (settings) -> new FenceGateBlock(WoodType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_DOOR = registerBlock("str_crimson_hyphae_door", (settings) -> new DoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_TRAPDOOR = registerBlock("str_crimson_hyphae_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));
    public static final Block STR_CRIMSON_HYPHAE_WALL = registerBlock("str_crimson_hyphae_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE));

    //warped_hyphae_set
    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs", (settings) -> new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_BUTTON = registerBlock("warped_hyphae_button", (settings) -> new ButtonBlock(BlockSetType.WARPED, 10, settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_hyphae_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate", (settings) -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_DOOR = registerBlock("warped_hyphae_door", (settings) -> new DoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_TRAPDOOR = registerBlock("warped_hyphae_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));
    public static final Block WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE));

    //str_warped_hyphae_set
    public static final Block STR_WARPED_HYPHAE_STAIRS = registerBlock("str_warped_hyphae_stairs", (settings) -> new StairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_SLAB = registerBlock("str_warped_hyphae_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_BUTTON = registerBlock("str_warped_hyphae_button", (settings) -> new ButtonBlock(BlockSetType.WARPED, 10, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("str_warped_hyphae_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_FENCE = registerBlock("str_warped_hyphae_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_FENCE_GATE = registerBlock("str_warped_hyphae_fence_gate", (settings) -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_DOOR = registerBlock("str_warped_hyphae_door", (settings) -> new DoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));
    public static final Block STR_WARPED_HYPHAE_TRAPDOOR = registerBlock("str_warped_hyphae_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_TRAPDOOR));
    public static final Block STR_WARPED_HYPHAE_WALL = registerBlock("str_warped_hyphae_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE));

    //stone
    public static final Block STONE_FENCE = registerBlock("stone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block STONE_FENCE_GATE = registerBlock("stone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE));
    public static final Block STONE_DOOR = registerBlock("stone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block STONE_WALL = registerBlock("stone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.STONE));

    //cobblestone
    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block COBBLESTONE_BUTTON = registerBlock("cobblestone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block COBBLESTONE_FENCE_GATE = registerBlock("cobblestone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE));
    public static final Block COBBLESTONE_DOOR = registerBlock("cobblestone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COBBLESTONE));

    //mossy_cobblestone
    public static final Block MOSSY_COBBLESTONE_FENCE = registerBlock("mossy_cobblestone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("mossy_cobblestone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).sounds(BlockSoundGroup.STONE));
    public static final Block MOSSY_COBBLESTONE_DOOR = registerBlock("mossy_cobblestone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block MOSSY_COBBLESTONE_TRAPDOOR = registerBlock("mossy_cobblestone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));

    //smooth_stone
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", (settings) -> new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block SMOOTH_STONE_FENCE = registerBlock("smooth_stone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block SMOOTH_STONE_FENCE_GATE = registerBlock("smooth_stone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).sounds(BlockSoundGroup.STONE));
    public static final Block SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));

    //stone_bricks
    public static final Block STONE_BRICKS_FENCE = registerBlock("stone_bricks_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block STONE_BRICKS_FENCE_GATE = registerBlock("stone_bricks_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE));
    public static final Block STONE_BRICKS_DOOR = registerBlock("stone_bricks_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block STONE_BRICKS_TRAPDOOR = registerBlock("stone_bricks_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block STONE_BRICKS_BUTTON = registerBlock("stone_bricks_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block STONE_BRICKS_PRESSURE_PLATE = registerBlock("stone_bricks_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));

    //cracked_stone_bricks_set
    public static final Block CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs", (settings) -> new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_BUTTON = registerBlock("cracked_stone_bricks_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_stone_bricks_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_FENCE = registerBlock("cracked_stone_bricks_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_FENCE_GATE = registerBlock("cracked_stone_bricks_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_DOOR = registerBlock("cracked_stone_bricks_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_TRAPDOOR = registerBlock("cracked_stone_bricks_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));

    //granite_set
    public static final Block GRANITE_BUTTON = registerBlock("granite_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block GRANITE_FENCE = registerBlock("granite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block GRANITE_FENCE_GATE = registerBlock("granite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block GRANITE_DOOR = registerBlock("granite_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block GRANITE_TRAPDOOR = registerBlock("granite_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRANITE));

    //polished_granite_set
    public static final Block POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block POLISHED_GRANITE_FENCE = registerBlock("polished_granite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block POLISHED_GRANITE_FENCE_GATE = registerBlock("polished_granite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block POLISHED_GRANITE_DOOR = registerBlock("polished_granite_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block POLISHED_GRANITE_TRAPDOOR = registerBlock("polished_granite_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));

    //diorite_set
    public static final Block DIORITE_BUTTON = registerBlock("diorite_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block DIORITE_FENCE = registerBlock("diorite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block DIORITE_FENCE_GATE = registerBlock("diorite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block DIORITE_DOOR = registerBlock("diorite_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIORITE));

    //polished_diorite_set
    public static final Block POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block POLISHED_DIORITE_FENCE = registerBlock("polished_diorite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block POLISHED_DIORITE_FENCE_GATE = registerBlock("polished_diorite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block POLISHED_DIORITE_DOOR = registerBlock("polished_diorite_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block POLISHED_DIORITE_TRAPDOOR = registerBlock("polished_diorite_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));

    //andesite_set
    public static final Block ANDESITE_BUTTON = registerBlock("andesite_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block ANDESITE_FENCE = registerBlock("andesite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block ANDESITE_FENCE_GATE = registerBlock("andesite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block ANDESITE_DOOR = registerBlock("andesite_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ANDESITE));

    //polished_andesite_set
    public static final Block POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block POLISHED_ANDESITE_FENCE = registerBlock("polished_andesite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block POLISHED_ANDESITE_FENCE_GATE = registerBlock("polished_andesite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block POLISHED_ANDESITE_DOOR = registerBlock("polished_andesite_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block POLISHED_ANDESITE_TRAPDOOR = registerBlock("polished_andesite_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));

    //deepslate_set
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs", (settings) -> new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_FENCE = registerBlock("deepslate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_FENCE_GATE = registerBlock("deepslate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_DOOR = registerBlock("deepslate_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_TRAPDOOR = registerBlock("deepslate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE));

    //cobbled_deepslate_set
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_FENCE = registerBlock("cobbled_deepslate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_FENCE_GATE = registerBlock("cobbled_deepslate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));

    //chiseled_deepslate_set
    public static final Block CHISELED_DEEPSLATE_STAIRS = registerBlock("chiseled_deepslate_stairs", (settings) -> new StairsBlock(Blocks.CHISELED_DEEPSLATE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_SLAB = registerBlock("chiseled_deepslate_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_BUTTON = registerBlock("chiseled_deepslate_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_PRESSURE_PLATE = registerBlock("chiseled_deepslate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_FENCE = registerBlock("chiseled_deepslate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_FENCE_GATE = registerBlock("chiseled_deepslate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_DOOR = registerBlock("chiseled_deepslate_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_TRAPDOOR = registerBlock("chiseled_deepslate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block CHISELED_DEEPSLATE_WALL = registerBlock("chiseled_deepslate_wall", WallBlock::new, AbstractBlock.Settings.copy(ModBlocks.DEEPSLATE_WALL));

    //polished_deepslate_set
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button", (settings) -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 10, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_FENCE = registerBlock("polished_deepslate_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_FENCE_GATE = registerBlock("polished_deepslate_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.POLISHED_DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door", (settings) -> new DoorBlock(ModBlockSetType.POLISHED_DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.POLISHED_DEEPSLATE, settings), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));

    //deepslate_bricks_set
    public static final Block DEEPSLATE_BRICKS_BUTTON = registerBlock("deepslate_bricks_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE_BRICKS, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("deepslate_bricks_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICKS_FENCE = registerBlock("deepslate_bricks_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("deepslate_bricks_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICKS_DOOR = registerBlock("deepslate_bricks_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("deepslate_bricks_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));

    //cracked_deepslate_bricks_set
    public static final Block CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("cracked_deepslate_bricks_stairs", (settings) -> new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("cracked_deepslate_bricks_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_BUTTON = registerBlock("cracked_deepslate_bricks_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE_BRICKS, 10, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_deepslate_bricks_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE = registerBlock("cracked_deepslate_bricks_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("cracked_deepslate_bricks_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_DOOR = registerBlock("cracked_deepslate_bricks_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("cracked_deepslate_bricks_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_BRICKS_WALL = registerBlock("cracked_deepslate_bricks_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));

    //deepslate_tiles_set
    public static final Block DEEPSLATE_TILES_BUTTON = registerBlock("deepslate_tiles_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE_TILES, 10, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("deepslate_tiles_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILES_FENCE = registerBlock("deepslate_tiles_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILES_FENCE_GATE = registerBlock("deepslate_tiles_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILES_DOOR = registerBlock("deepslate_tiles_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILES_TRAPDOOR = registerBlock("deepslate_tiles_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));

    //cracked_deepslate_tiles_set
    public static final Block CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("cracked_deepslate_tiles_stairs", (settings) -> new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("cracked_deepslate_tiles_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_BUTTON = registerBlock("cracked_deepslate_tiles_button", (settings) -> new ButtonBlock(ModBlockSetType.DEEPSLATE_TILES, 10, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("cracked_deepslate_tiles_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_FENCE = registerBlock("cracked_deepslate_tiles_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_FENCE_GATE = registerBlock("cracked_deepslate_tiles_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_DOOR = registerBlock("cracked_deepslate_tiles_door", (settings) -> new DoorBlock(ModBlockSetType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_TRAPDOOR = registerBlock("cracked_deepslate_tiles_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DEEPSLATE_TILES, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES_WALL = registerBlock("cracked_deepslate_tiles_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));

    //bricks_set
    public static final Block BRICK_BUTTON = registerBlock("brick_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block BRICK_PRESSURE_PLATE = registerBlock("brick_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block BRICK_FENCE = registerBlock("brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block BRICK_FENCE_GATE = registerBlock("brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block BRICK_DOOR = registerBlock("brick_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRICKS));
    public static final Block BRICK_TRAPDOOR = registerBlock("brick_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BRICKS));

    //packed_mud_set
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", (settings) -> new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_BUTTON = registerBlock("packed_mud_button", (settings) -> new ButtonBlock(ModBlockSetType.PACKED_MUD, 10, settings), AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_PRESSURE_PLATE = registerBlock("packed_mud_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.PACKED_MUD, settings), AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_FENCE = registerBlock("packed_mud_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_FENCE_GATE = registerBlock("packed_mud_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.PACKED_MUD, settings), AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_DOOR = registerBlock("packed_mud_door", (settings) -> new DoorBlock(ModBlockSetType.PACKED_MUD, settings), AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_TRAPDOOR = registerBlock("packed_mud_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.PACKED_MUD, settings), AbstractBlock.Settings.copy(Blocks.PACKED_MUD));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_MUD));

    //mud_bricks_set
    public static final Block MUD_BRICK_BUTTON = registerBlock("mud_brick_button", (settings) -> new ButtonBlock(ModBlockSetType.MUD_BRICKS, 10, settings), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_PRESSURE_PLATE = registerBlock("mud_brick_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.MUD_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_FENCE = registerBlock("mud_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_FENCE_GATE = registerBlock("mud_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.MUD_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_DOOR = registerBlock("mud_brick_door", (settings) -> new DoorBlock(ModBlockSetType.MUD_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_TRAPDOOR = registerBlock("mud_brick_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.MUD_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.MUD_BRICKS));

    //sandstone_set
    public static final Block SANDSTONE_BUTTON = registerBlock("sandstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block SANDSTONE_FENCE = registerBlock("sandstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block SANDSTONE_FENCE_GATE = registerBlock("sandstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block SANDSTONE_DOOR = registerBlock("sandstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final Block SANDSTONE_TRAPDOOR = registerBlock("sandstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SANDSTONE));

    //smooth_sandstone_set
    public static final Block SMOOTH_SANDSTONE_BUTTON = registerBlock("smooth_sandstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_sandstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_SANDSTONE_FENCE = registerBlock("smooth_sandstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_SANDSTONE_FENCE_GATE = registerBlock("smooth_sandstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_SANDSTONE_DOOR = registerBlock("smooth_sandstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_SANDSTONE_TRAPDOOR = registerBlock("smooth_sandstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE));

    //cut_sandstone_set
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs", (settings) -> new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_BUTTON = registerBlock("cut_sandstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_sandstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_FENCE = registerBlock("cut_sandstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_FENCE_GATE = registerBlock("cut_sandstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_DOOR = registerBlock("cut_sandstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_TRAPDOOR = registerBlock("cut_sandstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE));

    //red_sandstone_set
    public static final Block RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block RED_SANDSTONE_FENCE = registerBlock("red_sandstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block RED_SANDSTONE_FENCE_GATE = registerBlock("red_sandstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block RED_SANDSTONE_DOOR = registerBlock("red_sandstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final Block RED_SANDSTONE_TRAPDOOR = registerBlock("red_sandstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));

    //smooth_red_sandstone_set
    public static final Block SMOOTH_RED_SANDSTONE_BUTTON = registerBlock("smooth_red_sandstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_red_sandstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE = registerBlock("smooth_red_sandstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block SMOOTH_RED_SANDSTONE_FENCE_GATE = registerBlock("smooth_red_sandstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block SMOOTH_RED_SANDSTONE_DOOR = registerBlock("smooth_red_sandstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block SMOOTH_RED_SANDSTONE_TRAPDOOR = registerBlock("smooth_red_sandstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE));

    //cut_red_sandstone_set
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs", (settings) -> new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_BUTTON = registerBlock("cut_red_sandstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_red_sandstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_FENCE = registerBlock("cut_red_sandstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_FENCE_GATE = registerBlock("cut_red_sandstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_DOOR = registerBlock("cut_red_sandstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_TRAPDOOR = registerBlock("cut_red_sandstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE));

    //sea_lantern_set
    public static final Block SEA_LANTERN_STAIRS = registerBlock("sea_lantern_stairs", (settings) -> new StairsBlock(Blocks.SEA_LANTERN.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_BUTTON = registerBlock("sea_lantern_button", (settings) -> new ButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_PRESSURE_PLATE = registerBlock("sea_lantern_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_FENCE = registerBlock("sea_lantern_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_FENCE_GATE = registerBlock("sea_lantern_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_DOOR = registerBlock("sea_lantern_door", (settings) -> new DoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_TRAPDOOR = registerBlock("sea_lantern_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));
    public static final Block SEA_LANTERN_WALL = registerBlock("sea_lantern_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SEA_LANTERN));

    //prismarine_set
    public static final Block PRISMARINE_BUTTON = registerBlock("prismarine_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block PRISMARINE_FENCE = registerBlock("prismarine_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block PRISMARINE_FENCE_GATE = registerBlock("prismarine_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block PRISMARINE_DOOR = registerBlock("prismarine_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE));
    public static final Block PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE));

    //prismarine_set
    public static final Block PRISMARINE_BRICK_BUTTON = registerBlock("prismarine_brick_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_BRICK_PRESSURE_PLATE = registerBlock("prismarine_brick_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_BRICK_FENCE = registerBlock("prismarine_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_BRICK_FENCE_GATE = registerBlock("prismarine_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_BRICK_DOOR = registerBlock("prismarine_brick_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_BRICK_TRAPDOOR = registerBlock("prismarine_brick_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS));

    //dark_prismarine_set
    public static final Block DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_FENCE = registerBlock("dark_prismarine_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_FENCE_GATE = registerBlock("dark_prismarine_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_DOOR = registerBlock("dark_prismarine_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_TRAPDOOR = registerBlock("dark_prismarine_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE));

    //netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs", (settings) -> new StairsBlock(Blocks.NETHERRACK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_BUTTON = registerBlock("netherrack_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHERRACK, 10, settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_PRESSURE_PLATE = registerBlock("netherrack_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHERRACK, settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_FENCE = registerBlock("netherrack_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_FENCE_GATE = registerBlock("netherrack_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHERRACK, settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_DOOR = registerBlock("netherrack_door", (settings) -> new DoorBlock(ModBlockSetType.NETHERRACK, settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_TRAPDOOR = registerBlock("netherrack_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHERRACK, settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK));

    //nether_bricks
    public static final Block NETHER_BRICK_BUTTON = registerBlock("nether_brick_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHER_BRICKS, 10, settings), AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block NETHER_BRICK_PRESSURE_PLATE = registerBlock("nether_brick_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block NETHER_BRICK_DOOR = registerBlock("nether_brick_door", (settings) -> new DoorBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block NETHER_BRICK_TRAPDOOR = registerBlock("nether_brick_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));

    //cracked_nether_bricks
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs", (settings) -> new StairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_BUTTON = registerBlock("cracked_nether_brick_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHER_BRICKS, 10, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("cracked_nether_brick_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = registerBlock("cracked_nether_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_DOOR = registerBlock("cracked_nether_brick_door", (settings) -> new DoorBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_TRAPDOOR = registerBlock("cracked_nether_brick_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS));

    //red_nether_bricks
    public static final Block RED_NETHER_BRICK_BUTTON = registerBlock("red_nether_brick_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHER_BRICKS, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("red_nether_brick_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_DOOR = registerBlock("red_nether_brick_door", (settings) -> new DoorBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_TRAPDOOR = registerBlock("red_nether_brick_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHER_BRICKS, settings), AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));

    //basalt
    public static final Block BASALT_STAIRS = registerBlock("basalt_stairs", (settings) -> new StairsBlock(Blocks.BASALT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_SLAB = registerBlock("basalt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_BUTTON = registerBlock("basalt_button", (settings) -> new ButtonBlock(ModBlockSetType.BASALT, 10, settings), AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_PRESSURE_PLATE = registerBlock("basalt_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_FENCE = registerBlock("basalt_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_FENCE_GATE = registerBlock("basalt_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_DOOR = registerBlock("basalt_door", (settings) -> new DoorBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_TRAPDOOR = registerBlock("basalt_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block BASALT_WALL = registerBlock("basalt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BASALT));

    //smooth_basalt
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", (settings) -> new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_BUTTON = registerBlock("smooth_basalt_button", (settings) -> new ButtonBlock(ModBlockSetType.BASALT, 10, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE = registerBlock("smooth_basalt_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_FENCE_GATE = registerBlock("smooth_basalt_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_DOOR = registerBlock("smooth_basalt_door", (settings) -> new DoorBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_TRAPDOOR = registerBlock("smooth_basalt_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));

    //polished_basalt
    public static final Block POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs", (settings) -> new StairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_BUTTON = registerBlock("polished_basalt_button", (settings) -> new ButtonBlock(ModBlockSetType.BASALT, 10, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_PRESSURE_PLATE = registerBlock("polished_basalt_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_FENCE = registerBlock("polished_basalt_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_FENCE_GATE = registerBlock("polished_basalt_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_DOOR = registerBlock("polished_basalt_door", (settings) -> new DoorBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_TRAPDOOR = registerBlock("polished_basalt_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.BASALT, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));
    public static final Block POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT));

    //blackstone
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block BLACKSTONE_FENCE = registerBlock("blackstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block BLACKSTONE_FENCE_GATE = registerBlock("blackstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block BLACKSTONE_DOOR = registerBlock("blackstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACKSTONE));

    //gilded_blackstone
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs", (settings) -> new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button", (settings) -> new ButtonBlock(ModBlockSetType.GILDED_BLACKSTONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_PRESSURE_PLATE = registerBlock("gilded_blackstone_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GILDED_BLACKSTONE, settings), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_FENCE = registerBlock("gilded_blackstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_FENCE_GATE = registerBlock("gilded_blackstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GILDED_BLACKSTONE, settings), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_DOOR = registerBlock("gilded_blackstone_door", (settings) -> new DoorBlock(ModBlockSetType.GILDED_BLACKSTONE, settings), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_TRAPDOOR = registerBlock("gilded_blackstone_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GILDED_BLACKSTONE, settings), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE));

    //polished_blackstone
    public static final Block POLISHED_BLACKSTONE_FENCE = registerBlock("polished_blackstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_FENCE_GATE = registerBlock("polished_blackstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_DOOR = registerBlock("polished_blackstone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_TRAPDOOR = registerBlock("polished_blackstone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));

    //gilded_blackstone
    public static final Block POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("polished_blackstone_brick_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("polished_blackstone_brick_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("polished_blackstone_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("polished_blackstone_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_DOOR = registerBlock("polished_blackstone_brick_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_BRICK_TRAPDOOR = registerBlock("polished_blackstone_brick_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE));

    //cracked_polished_blackstone_bricks
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs", (settings) -> new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("cracked_polished_blackstone_brick_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("cracked_polished_blackstone_brick_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("cracked_polished_blackstone_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("cracked_polished_blackstone_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_DOOR = registerBlock("cracked_polished_blackstone_brick_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_TRAPDOOR = registerBlock("cracked_polished_blackstone_brick_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    //end_stone
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs", (settings) -> new StairsBlock(Blocks.END_STONE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_BUTTON = registerBlock("end_stone_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_PRESSURE_PLATE = registerBlock("end_stone_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_FENCE = registerBlock("end_stone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_FENCE_GATE = registerBlock("end_stone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_DOOR = registerBlock("end_stone_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE));

    //end_stone_brick
    public static final Block END_STONE_BRICK_BUTTON = registerBlock("end_stone_brick_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_BRICK_FENCE = registerBlock("end_stone_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_BRICK_FENCE_GATE = registerBlock("end_stone_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_BRICK_DOOR = registerBlock("end_stone_brick_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_BRICK_TRAPDOOR = registerBlock("end_stone_brick_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS));

    //purpur_block
    public static final Block PURPUR_BUTTON = registerBlock("purpur_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block PURPUR_PRESSURE_PLATE = registerBlock("purpur_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block PURPUR_FENCE = registerBlock("purpur_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block PURPUR_FENCE_GATE = registerBlock("purpur_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block PURPUR_DOOR = registerBlock("purpur_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block PURPUR_TRAPDOOR = registerBlock("purpur_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final Block PURPUR_WALL = registerBlock("purpur_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK));

    //coal
    public static final Block COAL_STAIRS = registerBlock("coal_stairs", (settings) -> new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_SLAB = registerBlock("coal_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_BUTTON = registerBlock("coal_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_PRESSURE_PLATE = registerBlock("coal_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_FENCE = registerBlock("coal_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_FENCE_GATE = registerBlock("coal_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_DOOR = registerBlock("coal_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_TRAPDOOR = registerBlock("coal_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));
    public static final Block COAL_WALL = registerBlock("coal_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.COAL_BLOCK));

    //iron
    public static final Block IRON_STAIRS = registerBlock("iron_stairs", (settings) -> new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block IRON_SLAB = registerBlock("iron_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block IRON_BUTTON = registerBlock("iron_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block IRON_FENCE = registerBlock("iron_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block IRON_FENCE_GATE = registerBlock("iron_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block IRON_WALL = registerBlock("iron_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));

    //gold
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs", (settings) -> new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_SLAB = registerBlock("gold_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_BUTTON = registerBlock("gold_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_FENCE = registerBlock("gold_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_FENCE_GATE = registerBlock("gold_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_DOOR = registerBlock("gold_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block GOLD_WALL = registerBlock("gold_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));

    //redstone
    public static final Block REDSTONE_STAIRS = registerBlock("redstone_stairs", (settings) -> new RedstoneStairsBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_SLAB = registerBlock("redstone_slab", RedstoneSlabBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_BUTTON = registerBlock("redstone_button", (settings) -> new RedstoneButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_PRESSURE_PLATE = registerBlock("redstone_pressure_plate", (settings) -> new RedstonePressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_FENCE = registerBlock("redstone_fence", RedstoneFenceBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_FENCE_GATE = registerBlock("redstone_fence_gate", (settings) -> new RedstoneFenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_DOOR = registerBlock("redstone_door", (settings) -> new RedstoneDoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_TRAPDOOR = registerBlock("redstone_trapdoor", (settings) -> new RedstoneTrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));
    public static final Block REDSTONE_WALL = registerBlock("redstone_wall", RedstoneWallBlock::new, AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK));

    //emerald
    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs", (settings) -> new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_BUTTON = registerBlock("emerald_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_PRESSURE_PLATE = registerBlock("emerald_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_FENCE = registerBlock("emerald_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_FENCE_GATE = registerBlock("emerald_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_DOOR = registerBlock("emerald_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_TRAPDOOR = registerBlock("emerald_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block EMERALD_WALL = registerBlock("emerald_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));

    //lapis
    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs", (settings) -> new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_BUTTON = registerBlock("lapis_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_PRESSURE_PLATE = registerBlock("lapis_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_FENCE = registerBlock("lapis_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_FENCE_GATE = registerBlock("lapis_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_DOOR = registerBlock("lapis_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_TRAPDOOR = registerBlock("lapis_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));
    public static final Block LAPIS_WALL = registerBlock("lapis_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK));

    //diamond
    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs", (settings) -> new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_BUTTON = registerBlock("diamond_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_PRESSURE_PLATE = registerBlock("diamond_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_FENCE = registerBlock("diamond_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_FENCE_GATE = registerBlock("diamond_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_DOOR = registerBlock("diamond_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_TRAPDOOR = registerBlock("diamond_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block DIAMOND_WALL = registerBlock("diamond_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK));

    //netherite
    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs", (settings) -> new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_BUTTON = registerBlock("netherite_button", (settings) -> new ButtonBlock(ModBlockSetType.NETHERITE, 10, settings), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_PRESSURE_PLATE = registerBlock("netherite_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NETHERITE, settings), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_FENCE = registerBlock("netherite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_FENCE_GATE = registerBlock("netherite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NETHERITE, settings), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_DOOR = registerBlock("netherite_door", (settings) -> new DoorBlock(ModBlockSetType.NETHERITE, settings), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_TRAPDOOR = registerBlock("netherite_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NETHERITE, settings), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));

    //quartz
    public static final Block QUARTZ_BUTTON = registerBlock("quartz_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block QUARTZ_FENCE = registerBlock("quartz_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block QUARTZ_FENCE_GATE = registerBlock("quartz_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block QUARTZ_DOOR = registerBlock("quartz_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block QUARTZ_TRAPDOOR = registerBlock("quartz_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));

    //quartz_brick
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", (settings) -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_BUTTON = registerBlock("quartz_brick_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_PRESSURE_PLATE = registerBlock("quartz_brick_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_FENCE = registerBlock("quartz_brick_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_FENCE_GATE = registerBlock("quartz_brick_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_DOOR = registerBlock("quartz_brick_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_TRAPDOOR = registerBlock("quartz_brick_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS));

    //smooth_quartz
    public static final Block SMOOTH_QUARTZ_BUTTON = registerBlock("smooth_quartz_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block SMOOTH_QUARTZ_PRESSURE_PLATE = registerBlock("smooth_quartz_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block SMOOTH_QUARTZ_FENCE = registerBlock("smooth_quartz_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block SMOOTH_QUARTZ_FENCE_GATE = registerBlock("smooth_quartz_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block SMOOTH_QUARTZ_DOOR = registerBlock("smooth_quartz_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block SMOOTH_QUARTZ_TRAPDOOR = registerBlock("smooth_quartz_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));

    //amethyst
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs", (settings) -> new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_BUTTON = registerBlock("amethyst_button", (settings) -> new ButtonBlock(ModBlockSetType.AMETHYST_BLOCK, 10, settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.AMETHYST_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_FENCE = registerBlock("amethyst_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_FENCE_GATE = registerBlock("amethyst_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.AMETHYST_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_DOOR = registerBlock("amethyst_door", (settings) -> new DoorBlock(ModBlockSetType.AMETHYST_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.AMETHYST_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK));

    //copper
    public static final Block COPPER_STAIRS = registerBlock("copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block COPPER_SLAB = registerBlock("copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block COPPER_BUTTON = registerBlock("copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block COPPER_FENCE = registerBlock("copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block COPPER_FENCE_GATE = registerBlock("copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final Block COPPER_WALL = registerBlock("copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));

    //cut_copper
    public static final Block CUT_COPPER_BUTTON = registerBlock("cut_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block CUT_COPPER_PRESSURE_PLATE = registerBlock("cut_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block CUT_COPPER_FENCE = registerBlock("cut_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block CUT_COPPER_FENCE_GATE = registerBlock("cut_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block CUT_COPPER_DOOR = registerBlock("cut_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block CUT_COPPER_TRAPDOOR = registerBlock("cut_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));
    public static final Block CUT_COPPER_WALL = registerBlock("cut_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings), AbstractBlock.Settings.copy(Blocks.CUT_COPPER));

    //exposed_copper
    public static final Block EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block EXPOSED_COPPER_FENCE = registerBlock("exposed_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block EXPOSED_COPPER_FENCE_GATE = registerBlock("exposed_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final Block EXPOSED_COPPER_WALL = registerBlock("exposed_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));

    //exposed_cut_copper
    public static final Block EXPOSED_CUT_COPPER_BUTTON = registerBlock("exposed_cut_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block EXPOSED_CUT_COPPER_PRESSURE_PLATE = registerBlock("exposed_cut_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block EXPOSED_CUT_COPPER_FENCE = registerBlock("exposed_cut_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block EXPOSED_CUT_COPPER_FENCE_GATE = registerBlock("exposed_cut_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block EXPOSED_CUT_COPPER_DOOR = registerBlock("exposed_cut_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block EXPOSED_CUT_COPPER_TRAPDOOR = registerBlock("exposed_cut_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));
    public static final Block EXPOSED_CUT_COPPER_WALL = registerBlock("exposed_cut_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings), AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER));

    //weathered_copper
    public static final Block WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block WEATHERED_COPPER_FENCE = registerBlock("weathered_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block WEATHERED_COPPER_FENCE_GATE = registerBlock("weathered_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final Block WEATHERED_COPPER_WALL = registerBlock("weathered_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));

    //weathered_cut_copper
    public static final Block WEATHERED_CUT_COPPER_BUTTON = registerBlock("weathered_cut_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_PRESSURE_PLATE = registerBlock("weathered_cut_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_FENCE = registerBlock("weathered_cut_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_FENCE_GATE = registerBlock("weathered_cut_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_DOOR = registerBlock("weathered_cut_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_TRAPDOOR = registerBlock("weathered_cut_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_WALL = registerBlock("weathered_cut_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings), AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER));

    //oxidized_copper
    public static final Block OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs", (settings) -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab", (settings) -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block OXIDIZED_COPPER_FENCE = registerBlock("oxidized_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block OXIDIZED_COPPER_FENCE_GATE = registerBlock("oxidized_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final Block OXIDIZED_COPPER_WALL = registerBlock("oxidized_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));

    //oxidized_cut_copper
    public static final Block OXIDIZED_CUT_COPPER_BUTTON = registerBlock("oxidized_cut_copper_button", (settings) -> new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block OXIDIZED_CUT_COPPER_PRESSURE_PLATE = registerBlock("oxidized_cut_copper_pressure_plate", (settings) -> new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block OXIDIZED_CUT_COPPER_FENCE = registerBlock("oxidized_cut_copper_fence", (settings) -> new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block OXIDIZED_CUT_COPPER_FENCE_GATE = registerBlock("oxidized_cut_copper_fence_gate", (settings) -> new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block OXIDIZED_CUT_COPPER_DOOR = registerBlock("oxidized_cut_copper_door", (settings) -> new OxidizableDoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block OXIDIZED_CUT_COPPER_TRAPDOOR = registerBlock("oxidized_cut_copper_trapdoor", (settings) -> new OxidizableTrapdoorBlock(BlockSetType.COPPER, Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));
    public static final Block OXIDIZED_CUT_COPPER_WALL = registerBlock("oxidized_cut_copper_wall", (settings) -> new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER));

    //waxed_copper
    public static final Block WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_COPPER_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block WAXED_COPPER_BUTTON = registerBlock("waxed_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block WAXED_COPPER_PRESSURE_PLATE = registerBlock("waxed_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block WAXED_COPPER_FENCE = registerBlock("waxed_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block WAXED_COPPER_FENCE_GATE = registerBlock("waxed_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));
    public static final Block WAXED_COPPER_WALL = registerBlock("waxed_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK));

    //waxed_cut_copper
    public static final Block WAXED_CUT_COPPER_BUTTON = registerBlock("waxed_cut_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block WAXED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_cut_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block WAXED_CUT_COPPER_FENCE = registerBlock("waxed_cut_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block WAXED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_cut_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block WAXED_CUT_COPPER_DOOR = registerBlock("waxed_cut_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block WAXED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_cut_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));
    public static final Block WAXED_CUT_COPPER_WALL = registerBlock("waxed_cut_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER));

    //waxed_exposed_copper
    public static final Block WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_EXPOSED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlock("waxed_exposed_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER_FENCE = registerBlock("waxed_exposed_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER_FENCE_GATE = registerBlock("waxed_exposed_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER_WALL = registerBlock("waxed_exposed_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER));

    //waxed_exposed_cut_copper
    public static final Block WAXED_EXPOSED_CUT_COPPER_BUTTON = registerBlock("waxed_exposed_cut_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_cut_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_FENCE = registerBlock("waxed_exposed_cut_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_exposed_cut_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_DOOR = registerBlock("waxed_exposed_cut_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_exposed_cut_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_WALL = registerBlock("waxed_exposed_cut_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER));

    //waxed_weathered_copper
    public static final Block WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_WEATHERED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlock("waxed_weathered_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block WAXED_WEATHERED_COPPER_FENCE = registerBlock("waxed_weathered_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block WAXED_WEATHERED_COPPER_FENCE_GATE = registerBlock("waxed_weathered_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));
    public static final Block WAXED_WEATHERED_COPPER_WALL = registerBlock("waxed_weathered_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER));

    //waxed_weathered_cut_copper
    public static final Block WAXED_WEATHERED_CUT_COPPER_BUTTON = registerBlock("waxed_weathered_cut_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_cut_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_FENCE = registerBlock("waxed_weathered_cut_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_weathered_cut_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_DOOR = registerBlock("waxed_weathered_cut_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_weathered_cut_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_WALL = registerBlock("waxed_weathered_cut_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER));

    //waxed_oxidized_copper
    public static final Block WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs", (settings) -> new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlock("waxed_oxidized_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_FENCE = registerBlock("waxed_oxidized_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_FENCE_GATE = registerBlock("waxed_oxidized_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_WALL = registerBlock("waxed_oxidized_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER));


    //waxed_oxidized_cut_copper
    public static final Block WAXED_OXIDIZED_CUT_COPPER_BUTTON = registerBlock("waxed_oxidized_cut_copper_button", (settings) -> new ButtonBlock(BlockSetType.COPPER, 10, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_cut_copper_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_FENCE = registerBlock("waxed_oxidized_cut_copper_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE = registerBlock("waxed_oxidized_cut_copper_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_DOOR = registerBlock("waxed_oxidized_cut_copper_door", (settings) -> new DoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_cut_copper_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.COPPER, settings), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_WALL = registerBlock("waxed_oxidized_cut_copper_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER));

    //white_wool
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", (settings) -> new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_BUTTON = registerBlock("white_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_PRESSURE_PLATE = registerBlock("white_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_FENCE_GATE = registerBlock("white_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_DOOR = registerBlock("white_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_TRAPDOOR = registerBlock("white_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL));

    //light_gray_wool
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_BUTTON = registerBlock("light_gray_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_PRESSURE_PLATE = registerBlock("light_gray_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_FENCE = registerBlock("light_gray_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_FENCE_GATE = registerBlock("light_gray_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_DOOR = registerBlock("light_gray_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_TRAPDOOR = registerBlock("light_gray_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));
    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL));

    //gray_wool
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", (settings) -> new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_BUTTON = registerBlock("gray_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_PRESSURE_PLATE = registerBlock("gray_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_FENCE = registerBlock("gray_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_FENCE_GATE = registerBlock("gray_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_DOOR = registerBlock("gray_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_TRAPDOOR = registerBlock("gray_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));
    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL));

    //black_wool
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", (settings) -> new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_BUTTON = registerBlock("black_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_PRESSURE_PLATE = registerBlock("black_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_FENCE = registerBlock("black_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_FENCE_GATE = registerBlock("black_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_DOOR = registerBlock("black_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_TRAPDOOR = registerBlock("black_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));

    //brown_wool
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", (settings) -> new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_BUTTON = registerBlock("brown_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_PRESSURE_PLATE = registerBlock("brown_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_FENCE = registerBlock("brown_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_FENCE_GATE = registerBlock("brown_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_DOOR = registerBlock("brown_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_TRAPDOOR = registerBlock("brown_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));
    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL));

    //red_wool
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs", (settings) -> new StairsBlock(Blocks.RED_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_BUTTON = registerBlock("red_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_PRESSURE_PLATE = registerBlock("red_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_FENCE = registerBlock("red_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_FENCE_GATE = registerBlock("red_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_DOOR = registerBlock("red_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_TRAPDOOR = registerBlock("red_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.RED_WOOL));
    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_WOOL));

    //orange_wool
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", (settings) -> new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_BUTTON = registerBlock("orange_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_PRESSURE_PLATE = registerBlock("orange_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_FENCE_GATE = registerBlock("orange_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_DOOR = registerBlock("orange_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_TRAPDOOR = registerBlock("orange_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));
    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL));

    //yellow_wool
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", (settings) -> new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_BUTTON = registerBlock("yellow_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_PRESSURE_PLATE = registerBlock("yellow_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_FENCE_GATE = registerBlock("yellow_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_DOOR = registerBlock("yellow_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_TRAPDOOR = registerBlock("yellow_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));
    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL));

    //lime_wool
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", (settings) -> new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_BUTTON = registerBlock("lime_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_PRESSURE_PLATE = registerBlock("lime_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_FENCE = registerBlock("lime_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_FENCE_GATE = registerBlock("lime_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_DOOR = registerBlock("lime_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_TRAPDOOR = registerBlock("lime_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIME_WOOL));
    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_WOOL));

    //green_wool
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", (settings) -> new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_BUTTON = registerBlock("green_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_PRESSURE_PLATE = registerBlock("green_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_FENCE = registerBlock("green_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_FENCE_GATE = registerBlock("green_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_DOOR = registerBlock("green_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_TRAPDOOR = registerBlock("green_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));
    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL));

    //cyan_wool
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", (settings) -> new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_BUTTON = registerBlock("cyan_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_PRESSURE_PLATE = registerBlock("cyan_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_FENCE_GATE = registerBlock("cyan_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_DOOR = registerBlock("cyan_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_TRAPDOOR = registerBlock("cyan_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));
    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL));

    //blue_wool
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs", (settings) -> new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_BUTTON = registerBlock("blue_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_PRESSURE_PLATE = registerBlock("blue_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_FENCE = registerBlock("blue_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_FENCE_GATE = registerBlock("blue_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_DOOR = registerBlock("blue_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_TRAPDOOR = registerBlock("blue_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));
    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL));

    //light_blue_wool
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_BUTTON = registerBlock("light_blue_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_PRESSURE_PLATE = registerBlock("light_blue_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_FENCE_GATE = registerBlock("light_blue_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_DOOR = registerBlock("light_blue_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_TRAPDOOR = registerBlock("light_blue_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));
    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL));

    //purple_wool
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", (settings) -> new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_BUTTON = registerBlock("purple_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_PRESSURE_PLATE = registerBlock("purple_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_FENCE_GATE = registerBlock("purple_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_DOOR = registerBlock("purple_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_TRAPDOOR = registerBlock("purple_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));
    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL));

    //magenta_wool
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs", (settings) -> new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_BUTTON = registerBlock("magenta_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_PRESSURE_PLATE = registerBlock("magenta_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_FENCE = registerBlock("magenta_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_FENCE_GATE = registerBlock("magenta_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_DOOR = registerBlock("magenta_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_TRAPDOOR = registerBlock("magenta_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));
    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL));

    //pink_wool
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", (settings) -> new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_BUTTON = registerBlock("pink_wool_button", (settings) -> new ButtonBlock(ModBlockSetType.WOOL, 10, settings), AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_PRESSURE_PLATE = registerBlock("pink_wool_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_FENCE = registerBlock("pink_wool_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_FENCE_GATE = registerBlock("pink_wool_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_DOOR = registerBlock("pink_wool_door", (settings) -> new DoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_TRAPDOOR = registerBlock("pink_wool_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.WOOL, settings), AbstractBlock.Settings.copy(Blocks.PINK_WOOL));
    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_WOOL));

    //terracotta
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", (settings) -> new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_BUTTON = registerBlock("terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_PRESSURE_PLATE = registerBlock("terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_FENCE = registerBlock("terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_FENCE_GATE = registerBlock("terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_DOOR = registerBlock("terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_TRAPDOOR = registerBlock("terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.TERRACOTTA));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.TERRACOTTA));

    //white_terracotta
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", (settings) -> new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_BUTTON = registerBlock("white_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_FENCE_GATE = registerBlock("white_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_DOOR = registerBlock("white_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_TRAPDOOR = registerBlock("white_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA));

    //light_gray_terracotta
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_BUTTON = registerBlock("light_gray_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_DOOR = registerBlock("light_gray_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_TRAPDOOR = registerBlock("light_gray_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA));

    //gray_terracotta
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", (settings) -> new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_BUTTON = registerBlock("gray_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_FENCE = registerBlock("gray_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_FENCE_GATE = registerBlock("gray_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_DOOR = registerBlock("gray_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_TRAPDOOR = registerBlock("gray_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA));

    //black_terracotta
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", (settings) -> new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_BUTTON = registerBlock("black_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_FENCE_GATE = registerBlock("black_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_DOOR = registerBlock("black_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_TRAPDOOR = registerBlock("black_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));

    //brown_terracotta
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", (settings) -> new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_BUTTON = registerBlock("brown_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_FENCE = registerBlock("brown_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_FENCE_GATE = registerBlock("brown_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_DOOR = registerBlock("brown_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_TRAPDOOR = registerBlock("brown_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA));

    //red_terracotta
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", (settings) -> new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_BUTTON = registerBlock("red_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_FENCE_GATE = registerBlock("red_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_DOOR = registerBlock("red_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_TRAPDOOR = registerBlock("red_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA));

    //orange_terracotta
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", (settings) -> new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_BUTTON = registerBlock("orange_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_FENCE_GATE = registerBlock("orange_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_DOOR = registerBlock("orange_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_TRAPDOOR = registerBlock("orange_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA));

    //yellow_terracotta
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", (settings) -> new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_BUTTON = registerBlock("yellow_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_FENCE = registerBlock("yellow_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_FENCE_GATE = registerBlock("yellow_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_DOOR = registerBlock("yellow_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_TRAPDOOR = registerBlock("yellow_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA));

    //lime_terracotta
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", (settings) -> new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_BUTTON = registerBlock("lime_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_FENCE = registerBlock("lime_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_FENCE_GATE = registerBlock("lime_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_DOOR = registerBlock("lime_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_TRAPDOOR = registerBlock("lime_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA));

    //green_terracotta
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", (settings) -> new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_BUTTON = registerBlock("green_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_FENCE = registerBlock("green_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_FENCE_GATE = registerBlock("green_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_DOOR = registerBlock("green_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_TRAPDOOR = registerBlock("green_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA));

    //cyan_terracotta
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", (settings) -> new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_BUTTON = registerBlock("cyan_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_FENCE = registerBlock("cyan_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_FENCE_GATE = registerBlock("cyan_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_DOOR = registerBlock("cyan_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_TRAPDOOR = registerBlock("cyan_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA));

    //blue_terracotta
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", (settings) -> new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_BUTTON = registerBlock("blue_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_FENCE = registerBlock("blue_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_FENCE_GATE = registerBlock("blue_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_DOOR = registerBlock("blue_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_TRAPDOOR = registerBlock("blue_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA));

    //light_blue_terracotta
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_BUTTON = registerBlock("light_blue_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_DOOR = registerBlock("light_blue_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_TRAPDOOR = registerBlock("light_blue_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA));

    //purple_terracotta
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", (settings) -> new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_BUTTON = registerBlock("purple_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_FENCE = registerBlock("purple_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_FENCE_GATE = registerBlock("purple_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_DOOR = registerBlock("purple_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_TRAPDOOR = registerBlock("purple_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA));

    //magenta_terracotta
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", (settings) -> new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_BUTTON = registerBlock("magenta_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_FENCE = registerBlock("magenta_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_FENCE_GATE = registerBlock("magenta_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_DOOR = registerBlock("magenta_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_TRAPDOOR = registerBlock("magenta_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA));

    //pink_terracotta
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", (settings) -> new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_BUTTON = registerBlock("pink_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_FENCE = registerBlock("pink_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_FENCE_GATE = registerBlock("pink_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_DOOR = registerBlock("pink_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_TRAPDOOR = registerBlock("pink_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA));

    //white_concrete
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", (settings) -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_DOOR = registerBlock("white_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_TRAPDOOR = registerBlock("white_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));

    //light_gray_concrete
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_DOOR = registerBlock("light_gray_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_TRAPDOOR = registerBlock("light_gray_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));

    //gray_concrete
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", (settings) -> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_DOOR = registerBlock("gray_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_TRAPDOOR = registerBlock("gray_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));

    //black_concrete
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", (settings) -> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_DOOR = registerBlock("black_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_TRAPDOOR = registerBlock("black_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));

    //brown_concrete
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", (settings) -> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_DOOR = registerBlock("brown_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_TRAPDOOR = registerBlock("brown_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));

    //red_concrete
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", (settings) -> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_DOOR = registerBlock("red_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_TRAPDOOR = registerBlock("red_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));

    //orange_concrete
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", (settings) -> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_DOOR = registerBlock("orange_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_TRAPDOOR = registerBlock("orange_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));

    //yellow_concrete
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", (settings) -> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_DOOR = registerBlock("yellow_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_TRAPDOOR = registerBlock("yellow_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));

    //lime_concrete
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", (settings) -> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_DOOR = registerBlock("lime_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_TRAPDOOR = registerBlock("lime_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));

    //green_concrete
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", (settings) -> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_DOOR = registerBlock("green_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_TRAPDOOR = registerBlock("green_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));

    //cyan_concrete
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", (settings) -> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_DOOR = registerBlock("cyan_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_TRAPDOOR = registerBlock("cyan_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));

    //blue_concrete
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", (settings) -> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_DOOR = registerBlock("blue_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_TRAPDOOR = registerBlock("blue_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));

    //light_blue_concrete
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_DOOR = registerBlock("light_blue_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_TRAPDOOR = registerBlock("light_blue_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));

    //purple_concrete
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", (settings) -> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_DOOR = registerBlock("purple_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_TRAPDOOR = registerBlock("purple_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));

    //magenta_concrete
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", (settings) -> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_DOOR = registerBlock("magenta_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_TRAPDOOR = registerBlock("magenta_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));

    //pink_concrete
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", (settings) -> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_DOOR = registerBlock("pink_concrete_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_TRAPDOOR = registerBlock("pink_concrete_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));

    //white_concrete_powder
    public static final Block WHITE_CONCRETE_POWDER_STAIRS = registerBlock("white_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.WHITE_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.WHITE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.WHITE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_BUTTON = registerBlock("white_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.WHITE_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("white_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_FENCE = registerBlock("white_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.WHITE_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_FENCE_GATE = registerBlock("white_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.WHITE_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_DOOR = registerBlock("white_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.WHITE_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_TRAPDOOR = registerBlock("white_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.WHITE_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));
    public static final Block WHITE_CONCRETE_POWDER_WALL = registerBlock("white_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.WHITE_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE_POWDER));

    //light_gray_concrete_powder
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_STAIRS = registerBlock("light_gray_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.LIGHT_GRAY_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_BUTTON = registerBlock("light_gray_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("light_gray_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_FENCE = registerBlock("light_gray_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_FENCE_GATE = registerBlock("light_gray_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_DOOR = registerBlock("light_gray_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.LIGHT_GRAY_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_TRAPDOOR = registerBlock("light_gray_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.LIGHT_GRAY_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER_WALL = registerBlock("light_gray_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.LIGHT_GRAY_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER));

    //gray_concrete_powder
    public static final Block GRAY_CONCRETE_POWDER_STAIRS = registerBlock("gray_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.GRAY_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.GRAY_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.GRAY_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_BUTTON = registerBlock("gray_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.GRAY_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("gray_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_FENCE = registerBlock("gray_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.GRAY_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_FENCE_GATE = registerBlock("gray_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.GRAY_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_DOOR = registerBlock("gray_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.GRAY_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_TRAPDOOR = registerBlock("gray_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.GRAY_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));
    public static final Block GRAY_CONCRETE_POWDER_WALL = registerBlock("gray_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.GRAY_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE_POWDER));

    //black_concrete_powder
    public static final Block BLACK_CONCRETE_POWDER_STAIRS = registerBlock("black_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.BLACK_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.BLACK_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.BLACK_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_BUTTON = registerBlock("black_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.BLACK_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("black_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_FENCE = registerBlock("black_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.BLACK_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_FENCE_GATE = registerBlock("black_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.BLACK_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_DOOR = registerBlock("black_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.BLACK_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_TRAPDOOR = registerBlock("black_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.BLACK_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final Block BLACK_CONCRETE_POWDER_WALL = registerBlock("black_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.BLACK_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));

    //brown_concrete_powder
    public static final Block BROWN_CONCRETE_POWDER_STAIRS = registerBlock("brown_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.BROWN_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.BROWN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.BROWN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_BUTTON = registerBlock("brown_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.BROWN_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("brown_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_FENCE = registerBlock("brown_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.BROWN_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_FENCE_GATE = registerBlock("brown_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.BROWN_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_DOOR = registerBlock("brown_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.BROWN_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_TRAPDOOR = registerBlock("brown_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.BROWN_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));
    public static final Block BROWN_CONCRETE_POWDER_WALL = registerBlock("brown_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.BROWN_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER));

    //red_concrete_powder
    public static final Block RED_CONCRETE_POWDER_STAIRS = registerBlock("red_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.RED_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.RED_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.RED_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_BUTTON = registerBlock("red_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.RED_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("red_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.RED_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_FENCE = registerBlock("red_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.RED_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_FENCE_GATE = registerBlock("red_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.RED_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_DOOR = registerBlock("red_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.RED_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_TRAPDOOR = registerBlock("red_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.RED_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));
    public static final Block RED_CONCRETE_POWDER_WALL = registerBlock("red_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.RED_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE_POWDER));

    //orange_concrete_powder
    public static final Block ORANGE_CONCRETE_POWDER_STAIRS = registerBlock("orange_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.ORANGE_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.ORANGE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.ORANGE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_BUTTON = registerBlock("orange_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.ORANGE_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("orange_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_FENCE = registerBlock("orange_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.ORANGE_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_FENCE_GATE = registerBlock("orange_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.ORANGE_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_DOOR = registerBlock("orange_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.ORANGE_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_TRAPDOOR = registerBlock("orange_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.ORANGE_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));
    public static final Block ORANGE_CONCRETE_POWDER_WALL = registerBlock("orange_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.ORANGE_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE_POWDER));

    //yellow_concrete_powder
    public static final Block YELLOW_CONCRETE_POWDER_STAIRS = registerBlock("yellow_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.YELLOW_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.YELLOW_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.YELLOW_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_BUTTON = registerBlock("yellow_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.YELLOW_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("yellow_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_FENCE = registerBlock("yellow_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.YELLOW_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_FENCE_GATE = registerBlock("yellow_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.YELLOW_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_DOOR = registerBlock("yellow_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.YELLOW_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_TRAPDOOR = registerBlock("yellow_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.YELLOW_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));
    public static final Block YELLOW_CONCRETE_POWDER_WALL = registerBlock("yellow_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.YELLOW_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE_POWDER));

    //lime_concrete_powder
    public static final Block LIME_CONCRETE_POWDER_STAIRS = registerBlock("lime_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.LIME_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.LIME_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.LIME_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_BUTTON = registerBlock("lime_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.LIME_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("lime_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_FENCE = registerBlock("lime_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.LIME_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_FENCE_GATE = registerBlock("lime_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.LIME_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_DOOR = registerBlock("lime_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.LIME_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_TRAPDOOR = registerBlock("lime_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.LIME_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));
    public static final Block LIME_CONCRETE_POWDER_WALL = registerBlock("lime_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.LIME_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE_POWDER));

    //green_concrete_powder
    public static final Block GREEN_CONCRETE_POWDER_STAIRS = registerBlock("green_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.GREEN_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.GREEN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.GREEN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_BUTTON = registerBlock("green_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.GREEN_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("green_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_FENCE = registerBlock("green_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.GREEN_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_FENCE_GATE = registerBlock("green_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.GREEN_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_DOOR = registerBlock("green_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.GREEN_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_TRAPDOOR = registerBlock("green_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.GREEN_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));
    public static final Block GREEN_CONCRETE_POWDER_WALL = registerBlock("green_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.GREEN_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE_POWDER));

    //cyan_concrete_powder
    public static final Block CYAN_CONCRETE_POWDER_STAIRS = registerBlock("cyan_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.CYAN_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.CYAN_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.CYAN_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_BUTTON = registerBlock("cyan_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.CYAN_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("cyan_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_FENCE = registerBlock("cyan_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.CYAN_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_FENCE_GATE = registerBlock("cyan_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.CYAN_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_DOOR = registerBlock("cyan_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.CYAN_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_TRAPDOOR = registerBlock("cyan_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.CYAN_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));
    public static final Block CYAN_CONCRETE_POWDER_WALL = registerBlock("cyan_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.CYAN_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE_POWDER));

    //blue_concrete_powder
    public static final Block BLUE_CONCRETE_POWDER_STAIRS = registerBlock("blue_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.BLUE_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.BLUE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.BLUE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_BUTTON = registerBlock("blue_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.BLUE_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("blue_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_FENCE = registerBlock("blue_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.BLUE_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_FENCE_GATE = registerBlock("blue_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.BLUE_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_DOOR = registerBlock("blue_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.BLUE_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_TRAPDOOR = registerBlock("blue_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.BLUE_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));
    public static final Block BLUE_CONCRETE_POWDER_WALL = registerBlock("blue_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.BLUE_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE_POWDER));

    //light_blue_concrete_powder
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_STAIRS = registerBlock("light_blue_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.LIGHT_BLUE_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_BUTTON = registerBlock("light_blue_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("light_blue_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_FENCE = registerBlock("light_blue_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_FENCE_GATE = registerBlock("light_blue_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_DOOR = registerBlock("light_blue_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.LIGHT_BLUE_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_TRAPDOOR = registerBlock("light_blue_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.LIGHT_BLUE_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER_WALL = registerBlock("light_blue_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.LIGHT_BLUE_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER));

    //purple_concrete_powder
    public static final Block PURPLE_CONCRETE_POWDER_STAIRS = registerBlock("purple_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.PURPLE_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.PURPLE_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.PURPLE_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_BUTTON = registerBlock("purple_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.PURPLE_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("purple_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_FENCE = registerBlock("purple_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.PURPLE_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_FENCE_GATE = registerBlock("purple_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.PURPLE_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_DOOR = registerBlock("purple_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.PURPLE_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_TRAPDOOR = registerBlock("purple_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.PURPLE_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));
    public static final Block PURPLE_CONCRETE_POWDER_WALL = registerBlock("purple_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.PURPLE_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE_POWDER));

    //magenta_concrete_powder
    public static final Block MAGENTA_CONCRETE_POWDER_STAIRS = registerBlock("magenta_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.MAGENTA_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.MAGENTA_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.MAGENTA_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_BUTTON = registerBlock("magenta_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.MAGENTA_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("magenta_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_FENCE = registerBlock("magenta_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.MAGENTA_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_FENCE_GATE = registerBlock("magenta_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_DOOR = registerBlock("magenta_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.MAGENTA_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_TRAPDOOR = registerBlock("magenta_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.MAGENTA_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));
    public static final Block MAGENTA_CONCRETE_POWDER_WALL = registerBlock("magenta_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.MAGENTA_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE_POWDER));

    //pink_concrete_powder
    public static final Block PINK_CONCRETE_POWDER_STAIRS = registerBlock("pink_concrete_powder_stairs", (settings) -> new ConcretePowderStairsBlock(Blocks.PINK_CONCRETE_POWDER.getDefaultState(), settings, ModBlocks.PINK_CONCRETE_STAIRS), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab", (settings) -> new ConcretePowderSlabBlock(settings, ModBlocks.PINK_CONCRETE_SLAB), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_BUTTON = registerBlock("pink_concrete_powder_button", (settings) -> new ConcretePowderButtonBlock(ModBlockSetType.SAND, 10, settings, ModBlocks.PINK_CONCRETE_BUTTON), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_PRESSURE_PLATE = registerBlock("pink_concrete_powder_pressure_plate", (settings) -> new ConcretePowderPressurePlateBlock(ModBlockSetType.SAND, settings, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_FENCE = registerBlock("pink_concrete_powder_fence", (settings) -> new ConcretePowderFenceBlock(settings, ModBlocks.PINK_CONCRETE_FENCE), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_FENCE_GATE = registerBlock("pink_concrete_powder_fence_gate", (settings) -> new ConcretePowderFenceGateBlock(ModWoodType.SAND, settings, ModBlocks.PINK_CONCRETE_FENCE_GATE), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_DOOR = registerBlock("pink_concrete_powder_door", (settings) -> new ConcretePowderDoorBlock(ModBlockSetType.SAND, settings, ModBlocks.PINK_CONCRETE_DOOR), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_TRAPDOOR = registerBlock("pink_concrete_powder_trapdoor", (settings) -> new ConcretePowderTrapdoorBlock(ModBlockSetType.SAND, settings, ModBlocks.PINK_CONCRETE_TRAPDOOR), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));
    public static final Block PINK_CONCRETE_POWDER_WALL = registerBlock("pink_concrete_powder_wall", (settings) -> new ConcretePowderWallBlock(settings, ModBlocks.PINK_CONCRETE_WALL), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE_POWDER));

    //white_glazed_terracotta
    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.WHITE_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_BUTTON = registerBlock("white_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_FENCE = registerBlock("white_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("white_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_DOOR = registerBlock("white_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("white_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));
    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_GLAZED_TERRACOTTA));

    //light_gray_glazed_terracotta
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_BUTTON = registerBlock("light_gray_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE = registerBlock("light_gray_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_DOOR = registerBlock("light_gray_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("light_gray_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));

    //gray_glazed_terracotta
    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.GRAY_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_BUTTON = registerBlock("gray_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_FENCE = registerBlock("gray_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("gray_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_DOOR = registerBlock("gray_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("gray_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));
    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_GLAZED_TERRACOTTA));

    //black_glazed_terracotta
    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.BLACK_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_BUTTON = registerBlock("black_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_FENCE = registerBlock("black_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("black_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_DOOR = registerBlock("black_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("black_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));

    //brown_glazed_terracotta
    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.BROWN_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_BUTTON = registerBlock("brown_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_FENCE = registerBlock("brown_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("brown_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_DOOR = registerBlock("brown_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("brown_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));
    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA));

    //red_glazed_terracotta
    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.RED_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_BUTTON = registerBlock("red_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_FENCE = registerBlock("red_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("red_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_DOOR = registerBlock("red_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("red_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));
    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_GLAZED_TERRACOTTA));

    //orange_glazed_terracotta
    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.ORANGE_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_BUTTON = registerBlock("orange_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_FENCE = registerBlock("orange_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("orange_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_DOOR = registerBlock("orange_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("orange_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));
    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_GLAZED_TERRACOTTA));

    //yellow_glazed_terracotta
    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.YELLOW_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_BUTTON = registerBlock("yellow_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_FENCE = registerBlock("yellow_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("yellow_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_DOOR = registerBlock("yellow_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("yellow_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));
    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_GLAZED_TERRACOTTA));

    //lime_glazed_terracotta
    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.LIME_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_BUTTON = registerBlock("lime_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_FENCE = registerBlock("lime_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("lime_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_DOOR = registerBlock("lime_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("lime_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));
    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_GLAZED_TERRACOTTA));

    //green_glazed_terracotta
    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.GREEN_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_BUTTON = registerBlock("green_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_FENCE = registerBlock("green_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("green_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_DOOR = registerBlock("green_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("green_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));
    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_GLAZED_TERRACOTTA));

    //cyan_glazed_terracotta
    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.CYAN_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_BUTTON = registerBlock("cyan_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_FENCE = registerBlock("cyan_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("cyan_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_DOOR = registerBlock("cyan_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("cyan_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));
    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_GLAZED_TERRACOTTA));

    //blue_glazed_terracotta
    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.BLUE_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_BUTTON = registerBlock("blue_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_FENCE = registerBlock("blue_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("blue_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_DOOR = registerBlock("blue_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("blue_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));
    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_GLAZED_TERRACOTTA));

    //light_blue_glazed_terracotta
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_BUTTON = registerBlock("light_blue_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE = registerBlock("light_blue_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_DOOR = registerBlock("light_blue_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("light_blue_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));

    //purple_glazed_terracotta
    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.PURPLE_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_BUTTON = registerBlock("purple_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_FENCE = registerBlock("purple_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("purple_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_DOOR = registerBlock("purple_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("purple_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));
    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_GLAZED_TERRACOTTA));

    //magenta_glazed_terracotta
    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_BUTTON = registerBlock("magenta_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_FENCE = registerBlock("magenta_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("magenta_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_DOOR = registerBlock("magenta_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("magenta_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_GLAZED_TERRACOTTA));

    //pink_glazed_terracotta
    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs", (settings) -> new StairsBlock(Blocks.PINK_GLAZED_TERRACOTTA.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_BUTTON = registerBlock("pink_glazed_terracotta_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_glazed_terracotta_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_FENCE = registerBlock("pink_glazed_terracotta_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_FENCE_GATE = registerBlock("pink_glazed_terracotta_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_DOOR = registerBlock("pink_glazed_terracotta_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_TRAPDOOR = registerBlock("pink_glazed_terracotta_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));
    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_GLAZED_TERRACOTTA));

    //white_stained_glass
    public static final Block WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_BUTTON = registerBlock("white_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("white_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_FENCE = registerBlock("white_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_FENCE_GATE = registerBlock("white_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_DOOR = registerBlock("white_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_TRAPDOOR = registerBlock("white_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));
    public static final Block WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS));

    //light_gray_stained_glass
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_BUTTON = registerBlock("light_gray_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_gray_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock("light_gray_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("light_gray_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("light_gray_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("light_gray_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS));

    //gray_stained_glass
    public static final Block GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_BUTTON = registerBlock("gray_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("gray_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_FENCE = registerBlock("gray_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("gray_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_DOOR = registerBlock("gray_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("gray_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));
    public static final Block GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS));

    //black_stained_glass
    public static final Block BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_BUTTON = registerBlock("black_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("black_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_FENCE = registerBlock("black_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_FENCE_GATE = registerBlock("black_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_DOOR = registerBlock("black_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_TRAPDOOR = registerBlock("black_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final Block BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));

    //brown_stained_glass
    public static final Block BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_BUTTON = registerBlock("brown_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("brown_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_FENCE = registerBlock("brown_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_FENCE_GATE = registerBlock("brown_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_DOOR = registerBlock("brown_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_TRAPDOOR = registerBlock("brown_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));
    public static final Block BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS));

    //red_stained_glass
    public static final Block RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_BUTTON = registerBlock("red_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_PRESSURE_PLATE = registerBlock("red_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_FENCE = registerBlock("red_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_FENCE_GATE = registerBlock("red_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_DOOR = registerBlock("red_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_TRAPDOOR = registerBlock("red_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));
    public static final Block RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS));

    //orange_stained_glass
    public static final Block ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_BUTTON = registerBlock("orange_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("orange_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_FENCE = registerBlock("orange_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_FENCE_GATE = registerBlock("orange_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_DOOR = registerBlock("orange_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = registerBlock("orange_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));
    public static final Block ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS));

    //yellow_stained_glass
    public static final Block YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_BUTTON = registerBlock("yellow_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_PRESSURE_PLATE = registerBlock("yellow_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_FENCE = registerBlock("yellow_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_FENCE_GATE = registerBlock("yellow_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_DOOR = registerBlock("yellow_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = registerBlock("yellow_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));
    public static final Block YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS));

    //lime_stained_glass
    public static final Block LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_BUTTON = registerBlock("lime_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_PRESSURE_PLATE = registerBlock("lime_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_FENCE = registerBlock("lime_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_FENCE_GATE = registerBlock("lime_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_DOOR = registerBlock("lime_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_TRAPDOOR = registerBlock("lime_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));
    public static final Block LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS));

    //green_stained_glass
    public static final Block GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_BUTTON = registerBlock("green_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("green_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_FENCE = registerBlock("green_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_FENCE_GATE = registerBlock("green_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_DOOR = registerBlock("green_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_TRAPDOOR = registerBlock("green_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));
    public static final Block GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS));

    //cyan_stained_glass
    public static final Block CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_BUTTON = registerBlock("cyan_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("cyan_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_FENCE = registerBlock("cyan_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_FENCE_GATE = registerBlock("cyan_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_DOOR = registerBlock("cyan_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_TRAPDOOR = registerBlock("cyan_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));
    public static final Block CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS));

    //blue_stained_glass
    public static final Block BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_BUTTON = registerBlock("blue_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("blue_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_FENCE = registerBlock("blue_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("blue_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_DOOR = registerBlock("blue_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("blue_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));
    public static final Block BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS));

    //light_blue_stained_glass
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_BUTTON = registerBlock("light_blue_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_blue_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock("light_blue_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("light_blue_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("light_blue_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("light_blue_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS));

    //purple_stained_glass
    public static final Block PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_BUTTON = registerBlock("purple_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("purple_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_FENCE = registerBlock("purple_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_FENCE_GATE = registerBlock("purple_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_DOOR = registerBlock("purple_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = registerBlock("purple_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));
    public static final Block PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS));

    //magenta_stained_glass
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_BUTTON = registerBlock("magenta_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_PRESSURE_PLATE = registerBlock("magenta_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_FENCE = registerBlock("magenta_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_FENCE_GATE = registerBlock("magenta_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_DOOR = registerBlock("magenta_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = registerBlock("magenta_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Block MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS));

    //pink_stained_glass
    public static final Block PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs", (settings) -> new GlassStairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab", GlassSlabBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_BUTTON = registerBlock("pink_stained_glass_button", (settings) -> new GlassButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("pink_stained_glass_pressure_plate", (settings) -> new GlassPressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_FENCE = registerBlock("pink_stained_glass_fence", GlassFenceBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_FENCE_GATE = registerBlock("pink_stained_glass_fence_gate", (settings) -> new GlassFenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_DOOR = registerBlock("pink_stained_glass_door", (settings) -> new GlassDoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_TRAPDOOR = registerBlock("pink_stained_glass_trapdoor", (settings) -> new GlassTrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));
    public static final Block PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall", GlassWallBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS));

    //grass_block
    public static final Block GRASS_STAIRS = registerBlock("grass_stairs", (settings) -> new StairsBlock(Blocks.GRASS_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_SLAB = registerBlock("grass_slab", SlabBlock::new, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_BUTTON = registerBlock("grass_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_PRESSURE_PLATE = registerBlock("grass_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_FENCE = registerBlock("grass_fence", FenceBlock::new, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_FENCE_GATE = registerBlock("grass_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_DOOR = registerBlock("grass_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.PALE_GREEN));
    public static final Block GRASS_TRAPDOOR = registerBlock("grass_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).strength(0.6f).sounds(BlockSoundGroup.GRASS));
    public static final Block GRASS_WALL = registerBlock("grass_wall", WallBlock::new, AbstractBlock.Settings.create().strength(0.6f).sounds(BlockSoundGroup.GRASS));

    //podzol_block
    public static final Block PODZOL_STAIRS = registerBlock("podzol_stairs", (settings) -> new StairsBlock(Blocks.PODZOL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_SLAB = registerBlock("podzol_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_BUTTON = registerBlock("podzol_button", (settings) -> new ButtonBlock(ModBlockSetType.GRAVEL, 10, settings), AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_PRESSURE_PLATE = registerBlock("podzol_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_FENCE = registerBlock("podzol_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_FENCE_GATE = registerBlock("podzol_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_DOOR = registerBlock("podzol_door", (settings) -> new DoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_TRAPDOOR = registerBlock("podzol_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block PODZOL_WALL = registerBlock("podzol_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PODZOL));

    //dirt_block
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs", (settings) -> new StairsBlock(Blocks.DIRT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_BUTTON = registerBlock("dirt_button", (settings) -> new ButtonBlock(ModBlockSetType.GRAVEL, 10, settings), AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_PRESSURE_PLATE = registerBlock("dirt_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_FENCE = registerBlock("dirt_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_FENCE_GATE = registerBlock("dirt_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_DOOR = registerBlock("dirt_door", (settings) -> new DoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_TRAPDOOR = registerBlock("dirt_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block DIRT_WALL = registerBlock("dirt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT));

    //mycelium_block
    public static final Block MYCELIUM_STAIRS = registerBlock("mycelium_stairs", (settings) -> new StairsBlock(Blocks.MYCELIUM.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_SLAB = registerBlock("mycelium_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_BUTTON = registerBlock("mycelium_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_PRESSURE_PLATE = registerBlock("mycelium_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_FENCE = registerBlock("mycelium_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_FENCE_GATE = registerBlock("mycelium_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_DOOR = registerBlock("mycelium_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_TRAPDOOR = registerBlock("mycelium_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    public static final Block MYCELIUM_WALL = registerBlock("mycelium_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MYCELIUM));

    //dirt_path_block
    public static final Block DIRT_PATH_STAIRS = registerBlock("dirt_path_stairs", (settings) -> new StairsBlock(Blocks.DIRT_PATH.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_SLAB = registerBlock("dirt_path_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_BUTTON = registerBlock("dirt_path_button", (settings) -> new ButtonBlock(ModBlockSetType.GRASS, 10, settings), AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_PRESSURE_PLATE = registerBlock("dirt_path_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_FENCE = registerBlock("dirt_path_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_FENCE_GATE = registerBlock("dirt_path_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_DOOR = registerBlock("dirt_path_door", (settings) -> new DoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_TRAPDOOR = registerBlock("dirt_path_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRASS, settings), AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_PATH_WALL = registerBlock("dirt_path_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DIRT_PATH));

    //coarse_dirt_block
    public static final Block COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs", (settings) -> new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_BUTTON = registerBlock("coarse_dirt_button", (settings) -> new ButtonBlock(ModBlockSetType.GRAVEL, 10, settings), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_PRESSURE_PLATE = registerBlock("coarse_dirt_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_FENCE = registerBlock("coarse_dirt_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_FENCE_GATE = registerBlock("coarse_dirt_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_DOOR = registerBlock("coarse_dirt_door", (settings) -> new DoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_TRAPDOOR = registerBlock("coarse_dirt_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block COARSE_DIRT_WALL = registerBlock("coarse_dirt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));

    //farmland_block
    public static final Block FARMLAND_STAIRS = registerBlock("farmland_stairs", (settings) -> new StairsBlock(Blocks.FARMLAND.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_SLAB = registerBlock("farmland_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_BUTTON = registerBlock("farmland_button", (settings) -> new ButtonBlock(ModBlockSetType.GRAVEL, 10, settings), AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_PRESSURE_PLATE = registerBlock("farmland_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_FENCE = registerBlock("farmland_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_FENCE_GATE = registerBlock("farmland_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_DOOR = registerBlock("farmland_door", (settings) -> new DoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_TRAPDOOR = registerBlock("farmland_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block FARMLAND_WALL = registerBlock("farmland_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.FARMLAND));

    //rooted_dirt_block
    public static final Block ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs", (settings) -> new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_BUTTON = registerBlock("rooted_dirt_button", (settings) -> new ButtonBlock(ModBlockSetType.ROOTED_DIRT, 10, settings), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_PRESSURE_PLATE = registerBlock("rooted_dirt_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.ROOTED_DIRT, settings), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_FENCE = registerBlock("rooted_dirt_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_FENCE_GATE = registerBlock("rooted_dirt_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.ROOTED_DIRT, settings), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_DOOR = registerBlock("rooted_dirt_door", (settings) -> new DoorBlock(ModBlockSetType.ROOTED_DIRT, settings), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_TRAPDOOR = registerBlock("rooted_dirt_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.ROOTED_DIRT, settings), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));
    public static final Block ROOTED_DIRT_WALL = registerBlock("rooted_dirt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT));

    //mud_block
    public static final Block MUD_STAIRS = registerBlock("mud_stairs", (settings) -> new StairsBlock(Blocks.MUD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_SLAB = registerBlock("mud_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_BUTTON = registerBlock("mud_button", (settings) -> new ButtonBlock(ModBlockSetType.MUD, 10, settings), AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_PRESSURE_PLATE = registerBlock("mud_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.MUD, settings), AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_FENCE = registerBlock("mud_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_FENCE_GATE = registerBlock("mud_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.MUD, settings), AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_DOOR = registerBlock("mud_door", (settings) -> new DoorBlock(ModBlockSetType.MUD, settings), AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_TRAPDOOR = registerBlock("mud_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.MUD, settings), AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block MUD_WALL = registerBlock("mud_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MUD));

    //clay_block
    public static final Block CLAY_STAIRS = registerBlock("clay_stairs", (settings) -> new StairsBlock(Blocks.CLAY.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_SLAB = registerBlock("clay_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_BUTTON = registerBlock("clay_button", (settings) -> new ButtonBlock(ModBlockSetType.GRAVEL, 10, settings), AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_PRESSURE_PLATE = registerBlock("clay_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_FENCE = registerBlock("clay_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_FENCE_GATE = registerBlock("clay_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_DOOR = registerBlock("clay_door", (settings) -> new DoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_TRAPDOOR = registerBlock("clay_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block CLAY_WALL = registerBlock("clay_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CLAY));

    //sand_block
    public static final Block SAND_STAIRS = registerBlock("sand_stairs", (settings) -> new FallingStairsBlock(Blocks.SAND.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_SLAB = registerBlock("sand_slab", FallingSlabBlock::new, AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_BUTTON = registerBlock("sand_button", (settings) -> new FallingButtonBlock(ModBlockSetType.SAND, 10, settings), AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_PRESSURE_PLATE = registerBlock("sand_pressure_plate", (settings) -> new FallingPressurePlateBlock(ModBlockSetType.SAND, settings), AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_FENCE = registerBlock("sand_fence", FallingFenceBlock::new, AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_FENCE_GATE = registerBlock("sand_fence_gate", (settings) -> new FallingFenceGateBlock(ModWoodType.SAND, settings), AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_DOOR = registerBlock("sand_door", (settings) -> new FallingDoorBlock(ModBlockSetType.SAND, settings), AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_TRAPDOOR = registerBlock("sand_trapdoor", (settings) -> new FallingTrapdoorBlock(ModBlockSetType.SAND, settings), AbstractBlock.Settings.copy(Blocks.SAND));
    public static final Block SAND_WALL = registerBlock("sand_wall", FallingWallBlock::new, AbstractBlock.Settings.copy(Blocks.SAND));

    //gravel
    public static final Block GRAVEL_STAIRS = registerBlock("gravel_stairs", (settings) -> new FallingStairsBlock(Blocks.GRAVEL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_SLAB = registerBlock("gravel_slab", FallingSlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_BUTTON = registerBlock("gravel_button", (settings) -> new FallingButtonBlock(ModBlockSetType.GRAVEL, 10, settings), AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_PRESSURE_PLATE = registerBlock("gravel_pressure_plate", (settings) -> new FallingPressurePlateBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_FENCE = registerBlock("gravel_fence", FallingFenceBlock::new, AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_FENCE_GATE = registerBlock("gravel_fence_gate", (settings) -> new FallingFenceGateBlock(ModWoodType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_DOOR = registerBlock("gravel_door", (settings) -> new FallingDoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_TRAPDOOR = registerBlock("gravel_trapdoor", (settings) -> new FallingTrapdoorBlock(ModBlockSetType.GRAVEL, settings), AbstractBlock.Settings.copy(Blocks.GRAVEL));
    public static final Block GRAVEL_WALL = registerBlock("gravel_wall", FallingWallBlock::new, AbstractBlock.Settings.copy(Blocks.GRAVEL));

    //red_sand
    public static final Block RED_SAND_STAIRS = registerBlock("red_sand_stairs", (settings) -> new FallingStairsBlock(Blocks.RED_SAND.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_SLAB = registerBlock("red_sand_slab", FallingSlabBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_BUTTON = registerBlock("red_sand_button", (settings) -> new FallingButtonBlock(ModBlockSetType.SAND, 10, settings), AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_PRESSURE_PLATE = registerBlock("red_sand_pressure_plate", (settings) -> new FallingPressurePlateBlock(ModBlockSetType.SAND, settings), AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_FENCE = registerBlock("red_sand_fence", FallingFenceBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_FENCE_GATE = registerBlock("red_sand_fence_gate", (settings) -> new FallingFenceGateBlock(ModWoodType.SAND, settings), AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_DOOR = registerBlock("red_sand_door", (settings) -> new FallingDoorBlock(ModBlockSetType.SAND, settings), AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_TRAPDOOR = registerBlock("red_sand_trapdoor", (settings) -> new FallingTrapdoorBlock(ModBlockSetType.SAND, settings), AbstractBlock.Settings.copy(Blocks.RED_SAND));
    public static final Block RED_SAND_WALL = registerBlock("red_sand_wall", FallingWallBlock::new, AbstractBlock.Settings.copy(Blocks.RED_SAND));

    //ice
    public static final Block ICE_STAIRS = registerBlock("ice_stairs", (settings) -> new StairsBlock(Blocks.ICE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_SLAB = registerBlock("ice_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_BUTTON = registerBlock("ice_button", (settings) -> new ButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_PRESSURE_PLATE = registerBlock("ice_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_FENCE = registerBlock("ice_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_FENCE_GATE = registerBlock("ice_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_DOOR = registerBlock("ice_door", (settings) -> new DoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_TRAPDOOR = registerBlock("ice_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block ICE_WALL = registerBlock("ice_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ICE));

    //packed_ice
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs", (settings) -> new StairsBlock(Blocks.PACKED_ICE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_BUTTON = registerBlock("packed_ice_button", (settings) -> new ButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_PRESSURE_PLATE = registerBlock("packed_ice_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_FENCE = registerBlock("packed_ice_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_FENCE_GATE = registerBlock("packed_ice_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_DOOR = registerBlock("packed_ice_door", (settings) -> new DoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_TRAPDOOR = registerBlock("packed_ice_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PACKED_ICE));

    //blue_ice
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs", (settings) -> new StairsBlock(Blocks.BLUE_ICE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_BUTTON = registerBlock("blue_ice_button", (settings) -> new ButtonBlock(ModBlockSetType.GLASS, 10, settings), AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_PRESSURE_PLATE = registerBlock("blue_ice_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_FENCE = registerBlock("blue_ice_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_FENCE_GATE = registerBlock("blue_ice_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_DOOR = registerBlock("blue_ice_door", (settings) -> new DoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_TRAPDOOR = registerBlock("blue_ice_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.GLASS, settings), AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_ICE));

    //snow_block
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs", (settings) -> new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_SLAB = registerBlock("snow_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_BUTTON = registerBlock("snow_button", (settings) -> new ButtonBlock(ModBlockSetType.SNOW, 10, settings), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_PRESSURE_PLATE = registerBlock("snow_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.SNOW, settings), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_FENCE = registerBlock("snow_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_FENCE_GATE = registerBlock("snow_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.SNOW, settings), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_DOOR = registerBlock("snow_door", (settings) -> new DoorBlock(ModBlockSetType.SNOW, settings), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_TRAPDOOR = registerBlock("snow_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.SNOW, settings), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block SNOW_WALL = registerBlock("snow_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));

    //moss
    public static final Block MOSS_STAIRS = registerBlock("moss_stairs", (settings) -> new StairsBlock(Blocks.MOSS_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_SLAB = registerBlock("moss_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_BUTTON = registerBlock("moss_button", (settings) -> new ButtonBlock(ModBlockSetType.MOSS_BLOCK, 10, settings), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_PRESSURE_PLATE = registerBlock("moss_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.MOSS_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_FENCE = registerBlock("moss_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_FENCE_GATE = registerBlock("moss_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.MOSS_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_DOOR = registerBlock("moss_door", (settings) -> new DoorBlock(ModBlockSetType.MOSS_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_TRAPDOOR = registerBlock("moss_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.MOSS_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block MOSS_WALL = registerBlock("moss_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));

    //calcite
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs", (settings) -> new StairsBlock(Blocks.CALCITE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_BUTTON = registerBlock("calcite_button", (settings) -> new ButtonBlock(ModBlockSetType.CALCITE, 10, settings), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.CALCITE, settings), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_FENCE = registerBlock("calcite_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_FENCE_GATE = registerBlock("calcite_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.CALCITE, settings), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_DOOR = registerBlock("calcite_door", (settings) -> new DoorBlock(ModBlockSetType.CALCITE, settings), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_TRAPDOOR = registerBlock("calcite_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.CALCITE, settings), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CALCITE));

    public static final Block TUFF_BUTTON = registerBlock("tuff_button", (settings) -> new ButtonBlock(ModBlockSetType.TUFF, 10, settings), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.TUFF, settings), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_FENCE = registerBlock("tuff_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_FENCE_GATE = registerBlock("tuff_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.TUFF, settings), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_DOOR = registerBlock("tuff_door", (settings) -> new DoorBlock(ModBlockSetType.TUFF, settings), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_TRAPDOOR = registerBlock("tuff_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.TUFF, settings), AbstractBlock.Settings.copy(Blocks.TUFF));

    //dripstone_block
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", (settings) -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_BUTTON = registerBlock("dripstone_button", (settings) -> new ButtonBlock(ModBlockSetType.DRIPSTONE, 10, settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_PRESSURE_PLATE = registerBlock("dripstone_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.DRIPSTONE, settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_FENCE = registerBlock("dripstone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_FENCE_GATE = registerBlock("dripstone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.DRIPSTONE, settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_DOOR = registerBlock("dripstone_door", (settings) -> new DoorBlock(ModBlockSetType.DRIPSTONE, settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_TRAPDOOR = registerBlock("dripstone_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.DRIPSTONE, settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));

    //magma_block
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs", (settings) -> new StairsBlock(Blocks.MAGMA_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_SLAB = registerBlock("magma_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_BUTTON = registerBlock("magma_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_PRESSURE_PLATE = registerBlock("magma_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_FENCE = registerBlock("magma_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_FENCE_GATE = registerBlock("magma_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_DOOR = registerBlock("magma_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_TRAPDOOR = registerBlock("magma_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block MAGMA_WALL = registerBlock("magma_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));

    //obsidian
    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs", (settings) -> new StairsBlock(Blocks.OBSIDIAN.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_BUTTON = registerBlock("obsidian_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_PRESSURE_PLATE = registerBlock("obsidian_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_FENCE = registerBlock("obsidian_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_FENCE_GATE = registerBlock("obsidian_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_DOOR = registerBlock("obsidian_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.OBSIDIAN));
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.OBSIDIAN));

    //crying_obsidian
    public static final Block CRYING_OBSIDIAN_STAIRS = registerBlock("crying_obsidian_stairs", (settings) -> new StairsBlock(Blocks.CRYING_OBSIDIAN.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_BUTTON = registerBlock("crying_obsidian_button", (settings) -> new ButtonBlock(BlockSetType.STONE, 10, settings), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_PRESSURE_PLATE = registerBlock("crying_obsidian_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_FENCE = registerBlock("crying_obsidian_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_FENCE_GATE = registerBlock("crying_obsidian_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_DOOR = registerBlock("crying_obsidian_door", (settings) -> new DoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_TRAPDOOR = registerBlock("crying_obsidian_trapdoor", (settings) -> new TrapdoorBlock(BlockSetType.STONE, settings), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));
    public static final Block CRYING_OBSIDIAN_WALL = registerBlock("crying_obsidian_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN));

    //crimson_nylium
    public static final Block CRIMSON_NYLIUM_STAIRS = registerBlock("crimson_nylium_stairs", (settings) -> new StairsBlock(Blocks.CRIMSON_NYLIUM.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_BUTTON = registerBlock("crimson_nylium_button", (settings) -> new ButtonBlock(ModBlockSetType.NYLIUM, 10, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_PRESSURE_PLATE = registerBlock("crimson_nylium_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_FENCE = registerBlock("crimson_nylium_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_FENCE_GATE = registerBlock("crimson_nylium_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_DOOR = registerBlock("crimson_nylium_door", (settings) -> new DoorBlock(ModBlockSetType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_TRAPDOOR = registerBlock("crimson_nylium_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block CRIMSON_NYLIUM_WALL = registerBlock("crimson_nylium_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));

    //warped_nylium
    public static final Block WARPED_NYLIUM_STAIRS = registerBlock("warped_nylium_stairs", (settings) -> new StairsBlock(Blocks.WARPED_NYLIUM.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_BUTTON = registerBlock("warped_nylium_button", (settings) -> new ButtonBlock(ModBlockSetType.NYLIUM, 10, settings), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_PRESSURE_PLATE = registerBlock("warped_nylium_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_FENCE = registerBlock("warped_nylium_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_FENCE_GATE = registerBlock("warped_nylium_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_DOOR = registerBlock("warped_nylium_door", (settings) -> new DoorBlock(ModBlockSetType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_TRAPDOOR = registerBlock("warped_nylium_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.NYLIUM, settings), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block WARPED_NYLIUM_WALL = registerBlock("warped_nylium_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));

    //soul_sand
    public static final Block SOUL_SAND_STAIRS = registerBlock("soul_sand_stairs", (settings) -> new StairsBlock(Blocks.SOUL_SAND.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_SLAB = registerBlock("soul_sand_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_BUTTON = registerBlock("soul_sand_button", (settings) -> new ButtonBlock(ModBlockSetType.SOUL_SAND, 10, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_PRESSURE_PLATE = registerBlock("soul_sand_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.SOUL_SAND, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_FENCE = registerBlock("soul_sand_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_FENCE_GATE = registerBlock("soul_sand_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.STONE, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_DOOR = registerBlock("soul_sand_door", (settings) -> new DoorBlock(ModBlockSetType.SOUL_SAND, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_TRAPDOOR = registerBlock("soul_sand_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.SOUL_SAND, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SAND_WALL = registerBlock("soul_sand_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SAND));

    //soul_soil
    public static final Block SOUL_SOIL_STAIRS = registerBlock("soul_soil_stairs", (settings) -> new StairsBlock(Blocks.SOUL_SOIL.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_SLAB = registerBlock("soul_soil_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_BUTTON = registerBlock("soul_soil_button", (settings) -> new ButtonBlock(ModBlockSetType.SOUL_SOIL, 10, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_PRESSURE_PLATE = registerBlock("soul_soil_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.SOUL_SOIL, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_FENCE = registerBlock("soul_soil_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_FENCE_GATE = registerBlock("soul_soil_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.SOUL_SOIL, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_DOOR = registerBlock("soul_soil_door", (settings) -> new DoorBlock(ModBlockSetType.SOUL_SOIL, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_TRAPDOOR = registerBlock("soul_soil_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.SOUL_SOIL, settings), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block SOUL_SOIL_WALL = registerBlock("soul_soil_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));

    //bone_block
    public static final Block BONE_STAIRS = registerBlock("bone_stairs", (settings) -> new StairsBlock(Blocks.BONE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_SLAB = registerBlock("bone_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_BUTTON = registerBlock("bone_button", (settings) -> new ButtonBlock(ModBlockSetType.BONE, 10, settings), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_PRESSURE_PLATE = registerBlock("bone_pressure_plate", (settings) -> new PressurePlateBlock(ModBlockSetType.BONE, settings), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_FENCE = registerBlock("bone_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_FENCE_GATE = registerBlock("bone_fence_gate", (settings) -> new FenceGateBlock(ModWoodType.BONE, settings), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_DOOR = registerBlock("bone_door", (settings) -> new DoorBlock(ModBlockSetType.BONE, settings), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_TRAPDOOR = registerBlock("bone_trapdoor", (settings) -> new TrapdoorBlock(ModBlockSetType.BONE, settings), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));
    public static final Block BONE_WALL = registerBlock("bone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BONE_BLOCK));









    public static void registerModBlocks() {
    }
}

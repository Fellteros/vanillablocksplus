package net.fellter.vanillablocksplus.block;

import com.google.common.collect.ImmutableMap;
import net.fellter.vanillablocksplus.VanillaBlocksPlus;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaBlocksPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks2() {
        VanillaBlocksPlus.LOGGER.info("Registering Second Mod Blocks Class for " + VanillaBlocksPlus.MOD_ID);
    }
}

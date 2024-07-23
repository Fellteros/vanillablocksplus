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



//    @Override
//    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//        BlockState blockState = this.getStrippedState(state);
//        if (stack.getItem() instanceof AxeItem) {
//            world.setBlockState(pos, blockState);
//            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
//            if (!player.isCreative()) {
//                stack.damage(1, player, player.getPreferredEquipmentSlot(stack));
//            }
//            return ItemActionResult.SUCCESS;
//        } else {
//            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
//        }
//    }

//    @Override
//    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
//        Hand hand = player.getActiveHand();
//        ItemStack itemStack = player.getStackInHand(hand);
//        BlockState blockState = this.getStrippedState(state);
//        if (itemStack.getItem() instanceof AxeItem) {
//            world.setBlockState(pos, blockState);
//            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
//            if (!player.isCreative()) {
//                itemStack.damage(1, player, player.getPreferredEquipmentSlot(itemStack));
//            }
//            return ActionResult.SUCCESS;
//        } else {
//            return ActionResult.PASS;
//        }
//    }

//    private BlockState getStrippedState(BlockState state) {
//        if (state.getBlock() == ModBlocks.OAK_WOOD_STAIRS) {
//            return ModBlocks.STR_OAK_WOOD_STAIRS.getStateWithProperties(state);
//        } else {
//            return state;
//        }
//        if (block instanceof StairsBlock) {
//            block = STRIPPED_STAIRS.get(state.getBlock());
//            assert block != null;
//            return block.getDefaultState()
//                    .with(StairsBlock.FACING, state.get(StairsBlock.FACING))
//                    .with(StairsBlock.HALF, state.get(StairsBlock.HALF))
//                    .with(StairsBlock.SHAPE, state.get(StairsBlock.SHAPE))
//                    .with(StairsBlock.WATERLOGGED, state.get(StairsBlock.WATERLOGGED));
//        } else if (block instanceof ButtonBlock) {
//            block = STRIPPED_BUTTONS.get(state.getBlock());
//            assert block != null;
//            return block.getDefaultState()
//                    .with(ButtonBlock.FACING, state.get(ButtonBlock.FACING))
//                    .with(ButtonBlock.POWERED, state.get(ButtonBlock.POWERED))
//                    .with(ButtonBlock.FACE, state.get(ButtonBlock.FACE));
//        } else if (block instanceof SlabBlock) {
//            block = STRIPPED_SLABS.get(state.getBlock());
//            assert block != null;
//            return block.getDefaultState()
//                    .with(SlabBlock.TYPE, state.get(SlabBlock.TYPE))
//                    .with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED));
//        } else {
//            block = STRIPPED_PRESSURE_PLATES.get(state.getBlock());
//            assert block != null;
//            return block.getDefaultState()
//                    .with(PressurePlateBlock.POWERED, state.get(PressurePlateBlock.POWERED));
//        }
//    }
//
//
//    ImmutableMap<Block, Block> STRIPPED_BUTTONS = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_BUTTON, ModBlocks.STR_OAK_WOOD_BUTTON).build();
//    ImmutableMap<Block, Block> STRIPPED_STAIRS = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STR_OAK_WOOD_STAIRS).build();
//    ImmutableMap<Block, Block> STRIPPED_SLABS = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_SLAB, ModBlocks.STR_OAK_WOOD_SLAB).build();
//    ImmutableMap<Block, Block> STRIPPED_PRESSURE_PLATES = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_PRESSURE_PLATE, ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE).build();
//    ImmutableMap<Block, Block> STRIPPED_TRAPDOORS = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_TRAPDOOR, ModBlocks.STR_OAK_WOOD_TRAPDOOR).build();
//    ImmutableMap<Block, Block> STRIPPED_DOORS = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_DOOR, ModBlocks.STR_OAK_WOOD_DOOR).build();
//    ImmutableMap<Block, Block> STRIPPED_FENCES = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_FENCE, ModBlocks.STR_OAK_WOOD_FENCE).build();
//    ImmutableMap<Block, Block> STRIPPED_FENCE_GATES = (new ImmutableMap.Builder<Block, Block>()).put(ModBlocks.OAK_WOOD_FENCE_GATE, ModBlocks.STR_OAK_WOOD_FENCE_GATE).build();


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaBlocksPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VanillaBlocksPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks2() {
        VanillaBlocksPlus.LOGGER.info("Registering Second Mod Blocks Class for" + VanillaBlocksPlus.MOD_ID);
    }
}

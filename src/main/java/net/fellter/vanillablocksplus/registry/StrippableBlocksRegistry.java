package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.minecraft.block.Block;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class StrippableBlocksRegistry {


    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StrippableBlocksRegistry.class);

    private StrippableBlocksRegistry() {
    }

    public static void register(Block input, Block stripped) {
        Block old = getRegistry().put(input, stripped);

        if (old != null) {
            LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", input, old, stripped);
        }
    }

    @SuppressWarnings("unstable")
    private static Map<Block, Block> getRegistry() {
        return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
    }

    public static void registerStrippables() {
        //oak
        register(ModBlocks.OAK_WOOD_BUTTON, ModBlocks.STR_OAK_WOOD_BUTTON);
        register(ModBlocks.OAK_WOOD_FENCE, ModBlocks.STR_OAK_WOOD_FENCE);
        register(ModBlocks.OAK_WOOD_SLAB, ModBlocks.STR_OAK_WOOD_SLAB);
        register(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STR_OAK_WOOD_STAIRS);
        register(ModBlocks.OAK_WOOD_FENCE_GATE, ModBlocks.STR_OAK_WOOD_FENCE_GATE);
        register(ModBlocks.OAK_WOOD_DOOR, ModBlocks.STR_OAK_WOOD_DOOR);
        register(ModBlocks.OAK_WOOD_TRAPDOOR, ModBlocks.STR_OAK_WOOD_TRAPDOOR);
        register(ModBlocks.OAK_WOOD_PRESSURE_PLATE, ModBlocks.STR_OAK_WOOD_PRESSURE_PLATE);
        register(ModBlocks.OAK_WOOD_WALL, ModBlocks.STR_OAK_WOOD_WALL);
        //oak
        register(ModBlocks2.OAK_LOG_BUTTON, ModBlocks2.STR_OAK_LOG_BUTTON);
        register(ModBlocks2.OAK_LOG_FENCE, ModBlocks2.STR_OAK_LOG_FENCE);
        register(ModBlocks2.OAK_LOG_SLAB, ModBlocks2.STR_OAK_LOG_SLAB);
        register(ModBlocks2.OAK_LOG_STAIRS, ModBlocks2.STR_OAK_LOG_STAIRS);
        register(ModBlocks2.OAK_LOG_FENCE_GATE, ModBlocks2.STR_OAK_LOG_FENCE_GATE);
        register(ModBlocks2.OAK_LOG_DOOR, ModBlocks2.STR_OAK_LOG_DOOR);
        register(ModBlocks2.OAK_LOG_TRAPDOOR, ModBlocks2.STR_OAK_LOG_TRAPDOOR);
        register(ModBlocks2.OAK_LOG_PRESSURE_PLATE, ModBlocks2.STR_OAK_LOG_PRESSURE_PLATE);
        register(ModBlocks2.OAK_LOG_WALL, ModBlocks2.STR_OAK_LOG_WALL);
        //spruce
        register(ModBlocks.SPRUCE_WOOD_BUTTON, ModBlocks.STR_SPRUCE_WOOD_BUTTON);
        register(ModBlocks.SPRUCE_WOOD_FENCE, ModBlocks.STR_SPRUCE_WOOD_FENCE);
        register(ModBlocks.SPRUCE_WOOD_SLAB, ModBlocks.STR_SPRUCE_WOOD_SLAB);
        register(ModBlocks.SPRUCE_WOOD_STAIRS, ModBlocks.STR_SPRUCE_WOOD_STAIRS);
        register(ModBlocks.SPRUCE_WOOD_FENCE_GATE, ModBlocks.STR_SPRUCE_WOOD_FENCE_GATE);
        register(ModBlocks.SPRUCE_WOOD_DOOR, ModBlocks.STR_SPRUCE_WOOD_DOOR);
        register(ModBlocks.SPRUCE_WOOD_TRAPDOOR, ModBlocks.STR_SPRUCE_WOOD_TRAPDOOR);
        register(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, ModBlocks.STR_SPRUCE_WOOD_PRESSURE_PLATE);
        register(ModBlocks.SPRUCE_WOOD_WALL, ModBlocks.STR_SPRUCE_WOOD_WALL);
        //spruce
        register(ModBlocks2.SPRUCE_LOG_BUTTON, ModBlocks2.STR_SPRUCE_LOG_BUTTON);
        register(ModBlocks2.SPRUCE_LOG_FENCE, ModBlocks2.STR_SPRUCE_LOG_FENCE);
        register(ModBlocks2.SPRUCE_LOG_SLAB, ModBlocks2.STR_SPRUCE_LOG_SLAB);
        register(ModBlocks2.SPRUCE_LOG_STAIRS, ModBlocks2.STR_SPRUCE_LOG_STAIRS);
        register(ModBlocks2.SPRUCE_LOG_FENCE_GATE, ModBlocks2.STR_SPRUCE_LOG_FENCE_GATE);
        register(ModBlocks2.SPRUCE_LOG_DOOR, ModBlocks2.STR_SPRUCE_LOG_DOOR);
        register(ModBlocks2.SPRUCE_LOG_TRAPDOOR, ModBlocks2.STR_SPRUCE_LOG_TRAPDOOR);
        register(ModBlocks2.SPRUCE_LOG_PRESSURE_PLATE, ModBlocks2.STR_SPRUCE_LOG_PRESSURE_PLATE);
        register(ModBlocks2.SPRUCE_LOG_WALL, ModBlocks2.STR_SPRUCE_LOG_WALL);
        //birch
        register(ModBlocks.BIRCH_WOOD_BUTTON, ModBlocks.STR_BIRCH_WOOD_BUTTON);
        register(ModBlocks.BIRCH_WOOD_FENCE, ModBlocks.STR_BIRCH_WOOD_FENCE);
        register(ModBlocks.BIRCH_WOOD_SLAB, ModBlocks.STR_BIRCH_WOOD_SLAB);
        register(ModBlocks.BIRCH_WOOD_STAIRS, ModBlocks.STR_BIRCH_WOOD_STAIRS);
        register(ModBlocks.BIRCH_WOOD_FENCE_GATE, ModBlocks.STR_BIRCH_WOOD_FENCE_GATE);
        register(ModBlocks.BIRCH_WOOD_DOOR, ModBlocks.STR_BIRCH_WOOD_DOOR);
        register(ModBlocks.BIRCH_WOOD_TRAPDOOR, ModBlocks.STR_BIRCH_WOOD_TRAPDOOR);
        register(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, ModBlocks.STR_BIRCH_WOOD_PRESSURE_PLATE);
        register(ModBlocks.BIRCH_WOOD_WALL, ModBlocks.STR_BIRCH_WOOD_WALL);
        //birch
        register(ModBlocks2.BIRCH_LOG_BUTTON, ModBlocks2.STR_BIRCH_LOG_BUTTON);
        register(ModBlocks2.BIRCH_LOG_FENCE, ModBlocks2.STR_BIRCH_LOG_FENCE);
        register(ModBlocks2.BIRCH_LOG_SLAB, ModBlocks2.STR_BIRCH_LOG_SLAB);
        register(ModBlocks2.BIRCH_LOG_STAIRS, ModBlocks2.STR_BIRCH_LOG_STAIRS);
        register(ModBlocks2.BIRCH_LOG_FENCE_GATE, ModBlocks2.STR_BIRCH_LOG_FENCE_GATE);
        register(ModBlocks2.BIRCH_LOG_DOOR, ModBlocks2.STR_BIRCH_LOG_DOOR);
        register(ModBlocks2.BIRCH_LOG_TRAPDOOR, ModBlocks2.STR_BIRCH_LOG_TRAPDOOR);
        register(ModBlocks2.BIRCH_LOG_PRESSURE_PLATE, ModBlocks2.STR_BIRCH_LOG_PRESSURE_PLATE);
        register(ModBlocks2.BIRCH_LOG_WALL, ModBlocks2.STR_BIRCH_LOG_WALL);
        //jungle
        register(ModBlocks.JUNGLE_WOOD_BUTTON, ModBlocks.STR_JUNGLE_WOOD_BUTTON);
        register(ModBlocks.JUNGLE_WOOD_FENCE, ModBlocks.STR_JUNGLE_WOOD_FENCE);
        register(ModBlocks.JUNGLE_WOOD_SLAB, ModBlocks.STR_JUNGLE_WOOD_SLAB);
        register(ModBlocks.JUNGLE_WOOD_STAIRS, ModBlocks.STR_JUNGLE_WOOD_STAIRS);
        register(ModBlocks.JUNGLE_WOOD_FENCE_GATE, ModBlocks.STR_JUNGLE_WOOD_FENCE_GATE);
        register(ModBlocks.JUNGLE_WOOD_DOOR, ModBlocks.STR_JUNGLE_WOOD_DOOR);
        register(ModBlocks.JUNGLE_WOOD_TRAPDOOR, ModBlocks.STR_JUNGLE_WOOD_TRAPDOOR);
        register(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, ModBlocks.STR_JUNGLE_WOOD_PRESSURE_PLATE);
        register(ModBlocks.JUNGLE_WOOD_WALL, ModBlocks.STR_JUNGLE_WOOD_WALL);
        //jungle
        register(ModBlocks2.JUNGLE_LOG_BUTTON, ModBlocks2.STR_JUNGLE_LOG_BUTTON);
        register(ModBlocks2.JUNGLE_LOG_FENCE, ModBlocks2.STR_JUNGLE_LOG_FENCE);
        register(ModBlocks2.JUNGLE_LOG_SLAB, ModBlocks2.STR_JUNGLE_LOG_SLAB);
        register(ModBlocks2.JUNGLE_LOG_STAIRS, ModBlocks2.STR_JUNGLE_LOG_STAIRS);
        register(ModBlocks2.JUNGLE_LOG_FENCE_GATE, ModBlocks2.STR_JUNGLE_LOG_FENCE_GATE);
        register(ModBlocks2.JUNGLE_LOG_DOOR, ModBlocks2.STR_JUNGLE_LOG_DOOR);
        register(ModBlocks2.JUNGLE_LOG_TRAPDOOR, ModBlocks2.STR_JUNGLE_LOG_TRAPDOOR);
        register(ModBlocks2.JUNGLE_LOG_PRESSURE_PLATE, ModBlocks2.STR_JUNGLE_LOG_PRESSURE_PLATE);
        register(ModBlocks2.JUNGLE_LOG_WALL, ModBlocks2.STR_JUNGLE_LOG_WALL);
        //acacia
        register(ModBlocks.ACACIA_WOOD_BUTTON, ModBlocks.STR_ACACIA_WOOD_BUTTON);
        register(ModBlocks.ACACIA_WOOD_FENCE, ModBlocks.STR_ACACIA_WOOD_FENCE);
        register(ModBlocks.ACACIA_WOOD_SLAB, ModBlocks.STR_ACACIA_WOOD_SLAB);
        register(ModBlocks.ACACIA_WOOD_STAIRS, ModBlocks.STR_ACACIA_WOOD_STAIRS);
        register(ModBlocks.ACACIA_WOOD_FENCE_GATE, ModBlocks.STR_ACACIA_WOOD_FENCE_GATE);
        register(ModBlocks.ACACIA_WOOD_DOOR, ModBlocks.STR_ACACIA_WOOD_DOOR);
        register(ModBlocks.ACACIA_WOOD_TRAPDOOR, ModBlocks.STR_ACACIA_WOOD_TRAPDOOR);
        register(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, ModBlocks.STR_ACACIA_WOOD_PRESSURE_PLATE);
        register(ModBlocks.ACACIA_WOOD_WALL, ModBlocks.STR_ACACIA_WOOD_WALL);
        //acacia
        register(ModBlocks2.ACACIA_LOG_BUTTON, ModBlocks2.STR_ACACIA_LOG_BUTTON);
        register(ModBlocks2.ACACIA_LOG_FENCE, ModBlocks2.STR_ACACIA_LOG_FENCE);
        register(ModBlocks2.ACACIA_LOG_SLAB, ModBlocks2.STR_ACACIA_LOG_SLAB);
        register(ModBlocks2.ACACIA_LOG_STAIRS, ModBlocks2.STR_ACACIA_LOG_STAIRS);
        register(ModBlocks2.ACACIA_LOG_FENCE_GATE, ModBlocks2.STR_ACACIA_LOG_FENCE_GATE);
        register(ModBlocks2.ACACIA_LOG_DOOR, ModBlocks2.STR_ACACIA_LOG_DOOR);
        register(ModBlocks2.ACACIA_LOG_TRAPDOOR, ModBlocks2.STR_ACACIA_LOG_TRAPDOOR);
        register(ModBlocks2.ACACIA_LOG_PRESSURE_PLATE, ModBlocks2.STR_ACACIA_LOG_PRESSURE_PLATE);
        register(ModBlocks2.ACACIA_LOG_WALL, ModBlocks2.STR_ACACIA_LOG_WALL);
        //dark_oak
        register(ModBlocks.DARK_OAK_WOOD_BUTTON, ModBlocks.STR_DARK_OAK_WOOD_BUTTON);
        register(ModBlocks.DARK_OAK_WOOD_FENCE, ModBlocks.STR_DARK_OAK_WOOD_FENCE);
        register(ModBlocks.DARK_OAK_WOOD_SLAB, ModBlocks.STR_DARK_OAK_WOOD_SLAB);
        register(ModBlocks.DARK_OAK_WOOD_STAIRS, ModBlocks.STR_DARK_OAK_WOOD_STAIRS);
        register(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, ModBlocks.STR_DARK_OAK_WOOD_FENCE_GATE);
        register(ModBlocks.DARK_OAK_WOOD_DOOR, ModBlocks.STR_DARK_OAK_WOOD_DOOR);
        register(ModBlocks.DARK_OAK_WOOD_TRAPDOOR, ModBlocks.STR_DARK_OAK_WOOD_TRAPDOOR);
        register(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STR_DARK_OAK_WOOD_PRESSURE_PLATE);
        register(ModBlocks.DARK_OAK_WOOD_WALL, ModBlocks.STR_DARK_OAK_WOOD_WALL);
        //dark_oak
        register(ModBlocks2.DARK_OAK_LOG_BUTTON, ModBlocks2.STR_DARK_OAK_LOG_BUTTON);
        register(ModBlocks2.DARK_OAK_LOG_FENCE, ModBlocks2.STR_DARK_OAK_LOG_FENCE);
        register(ModBlocks2.DARK_OAK_LOG_SLAB, ModBlocks2.STR_DARK_OAK_LOG_SLAB);
        register(ModBlocks2.DARK_OAK_LOG_STAIRS, ModBlocks2.STR_DARK_OAK_LOG_STAIRS);
        register(ModBlocks2.DARK_OAK_LOG_FENCE_GATE, ModBlocks2.STR_DARK_OAK_LOG_FENCE_GATE);
        register(ModBlocks2.DARK_OAK_LOG_DOOR, ModBlocks2.STR_DARK_OAK_LOG_DOOR);
        register(ModBlocks2.DARK_OAK_LOG_TRAPDOOR, ModBlocks2.STR_DARK_OAK_LOG_TRAPDOOR);
        register(ModBlocks2.DARK_OAK_LOG_PRESSURE_PLATE, ModBlocks2.STR_DARK_OAK_LOG_PRESSURE_PLATE);
        register(ModBlocks2.DARK_OAK_LOG_WALL, ModBlocks2.STR_DARK_OAK_LOG_WALL);
        //mangrove
        register(ModBlocks.MANGROVE_WOOD_BUTTON, ModBlocks.STR_MANGROVE_WOOD_BUTTON);
        register(ModBlocks.MANGROVE_WOOD_FENCE, ModBlocks.STR_MANGROVE_WOOD_FENCE);
        register(ModBlocks.MANGROVE_WOOD_SLAB, ModBlocks.STR_MANGROVE_WOOD_SLAB);
        register(ModBlocks.MANGROVE_WOOD_STAIRS, ModBlocks.STR_MANGROVE_WOOD_STAIRS);
        register(ModBlocks.MANGROVE_WOOD_FENCE_GATE, ModBlocks.STR_MANGROVE_WOOD_FENCE_GATE);
        register(ModBlocks.MANGROVE_WOOD_DOOR, ModBlocks.STR_MANGROVE_WOOD_DOOR);
        register(ModBlocks.MANGROVE_WOOD_TRAPDOOR, ModBlocks.STR_MANGROVE_WOOD_TRAPDOOR);
        register(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, ModBlocks.STR_MANGROVE_WOOD_PRESSURE_PLATE);
        register(ModBlocks.MANGROVE_WOOD_WALL, ModBlocks.STR_MANGROVE_WOOD_WALL);
        //cherry
        register(ModBlocks.CHERRY_WOOD_BUTTON, ModBlocks.STR_CHERRY_WOOD_BUTTON);
        register(ModBlocks.CHERRY_WOOD_FENCE, ModBlocks.STR_CHERRY_WOOD_FENCE);
        register(ModBlocks.CHERRY_WOOD_SLAB, ModBlocks.STR_CHERRY_WOOD_SLAB);
        register(ModBlocks.CHERRY_WOOD_STAIRS, ModBlocks.STR_CHERRY_WOOD_STAIRS);
        register(ModBlocks.CHERRY_WOOD_FENCE_GATE, ModBlocks.STR_CHERRY_WOOD_FENCE_GATE);
        register(ModBlocks.CHERRY_WOOD_DOOR, ModBlocks.STR_CHERRY_WOOD_DOOR);
        register(ModBlocks.CHERRY_WOOD_TRAPDOOR, ModBlocks.STR_CHERRY_WOOD_TRAPDOOR);
        register(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, ModBlocks.STR_CHERRY_WOOD_PRESSURE_PLATE);
        register(ModBlocks.CHERRY_WOOD_WALL, ModBlocks.STR_CHERRY_WOOD_WALL);
        //cherry
        register(ModBlocks.BAMBOO_BLOCK_BUTTON, ModBlocks.STR_BAMBOO_BLOCK_BUTTON);
        register(ModBlocks.BAMBOO_BLOCK_FENCE, ModBlocks.STR_BAMBOO_BLOCK_FENCE);
        register(ModBlocks.BAMBOO_BLOCK_SLAB, ModBlocks.STR_BAMBOO_BLOCK_SLAB);
        register(ModBlocks.BAMBOO_BLOCK_STAIRS, ModBlocks.STR_BAMBOO_BLOCK_STAIRS);
        register(ModBlocks.BAMBOO_BLOCK_FENCE_GATE, ModBlocks.STR_BAMBOO_BLOCK_FENCE_GATE);
        register(ModBlocks.BAMBOO_BLOCK_DOOR, ModBlocks.STR_BAMBOO_BLOCK_DOOR);
        register(ModBlocks.BAMBOO_BLOCK_TRAPDOOR, ModBlocks.STR_BAMBOO_BLOCK_TRAPDOOR);
        register(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE, ModBlocks.STR_BAMBOO_BLOCK_PRESSURE_PLATE);
        register(ModBlocks.BAMBOO_BLOCK_WALL, ModBlocks.STR_BAMBOO_BLOCK_WALL);
        //cherry
        register(ModBlocks.CRIMSON_HYPHAE_BUTTON, ModBlocks.STR_CRIMSON_HYPHAE_BUTTON);
        register(ModBlocks.CRIMSON_HYPHAE_FENCE, ModBlocks.STR_CRIMSON_HYPHAE_FENCE);
        register(ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STR_CRIMSON_HYPHAE_SLAB);
        register(ModBlocks.CRIMSON_HYPHAE_STAIRS, ModBlocks.STR_CRIMSON_HYPHAE_STAIRS);
        register(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, ModBlocks.STR_CRIMSON_HYPHAE_FENCE_GATE);
        register(ModBlocks.CRIMSON_HYPHAE_DOOR, ModBlocks.STR_CRIMSON_HYPHAE_DOOR);
        register(ModBlocks.CRIMSON_HYPHAE_TRAPDOOR, ModBlocks.STR_CRIMSON_HYPHAE_TRAPDOOR);
        register(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, ModBlocks.STR_CRIMSON_HYPHAE_PRESSURE_PLATE);
        register(ModBlocks.CRIMSON_HYPHAE_WALL, ModBlocks.STR_CRIMSON_HYPHAE_WALL);
        //cherry
        register(ModBlocks.WARPED_HYPHAE_BUTTON, ModBlocks.STR_WARPED_HYPHAE_BUTTON);
        register(ModBlocks.WARPED_HYPHAE_FENCE, ModBlocks.STR_WARPED_HYPHAE_FENCE);
        register(ModBlocks.WARPED_HYPHAE_SLAB, ModBlocks.STR_WARPED_HYPHAE_SLAB);
        register(ModBlocks.WARPED_HYPHAE_STAIRS, ModBlocks.STR_WARPED_HYPHAE_STAIRS);
        register(ModBlocks.WARPED_HYPHAE_FENCE_GATE, ModBlocks.STR_WARPED_HYPHAE_FENCE_GATE);
        register(ModBlocks.WARPED_HYPHAE_DOOR, ModBlocks.STR_WARPED_HYPHAE_DOOR);
        register(ModBlocks.WARPED_HYPHAE_TRAPDOOR, ModBlocks.STR_WARPED_HYPHAE_TRAPDOOR);
        register(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, ModBlocks.STR_WARPED_HYPHAE_PRESSURE_PLATE);
        register(ModBlocks.WARPED_HYPHAE_WALL, ModBlocks.STR_WARPED_HYPHAE_WALL);
    }
}

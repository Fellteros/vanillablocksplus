package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.minecraft.block.Block;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class VBPStrippableRegistry {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(VBPStrippableRegistry.class);

    private VBPStrippableRegistry() {
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
}

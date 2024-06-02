package net.fellter.vanillablocksplus.test;

import com.google.gson.JsonElement;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModBlockStateModelGenerator {
    public static Consumer<BlockStateSupplier> blockStateCollector;
    public static BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;


    public ModBlockStateModelGenerator(Consumer<BlockStateSupplier> blockStateCollector, BiConsumer<Identifier, Supplier<JsonElement>> modelCollector) {
        ModBlockStateModelGenerator.blockStateCollector = blockStateCollector;
        ModBlockStateModelGenerator.modelCollector = modelCollector;
    }

    public static void registerParentedItemModel(Block block, Identifier parentModelId) {
        modelCollector.accept(ModelIds.getItemModelId(block.asItem()), new SimpleModelSupplier(parentModelId));
    }

    public static void registerFence(TextureMap textureMap, Block fenceBlock) {
        Identifier identifier = ModModels.FENCE_STB_POST.upload(fenceBlock, textureMap, ModBlockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.FENCE_STB_SIDE.upload(fenceBlock, textureMap, ModBlockStateModelGenerator.modelCollector);
        blockStateCollector.accept(ModBlockStateModelGenerator.createFenceBlockState(fenceBlock, identifier, identifier2));
        Identifier identifier3 = ModModels.FENCE_STB_INVENTORY.upload(fenceBlock, textureMap, ModBlockStateModelGenerator.modelCollector);
        registerParentedItemModel(fenceBlock, identifier3);
    }

    public static BlockStateSupplier createFenceBlockState(Block fenceBlock, Identifier postModelId, Identifier sideModelId) {
        return MultipartBlockStateSupplier.create(fenceBlock).with(BlockStateVariant.create().put(VariantSettings.MODEL, postModelId))
                .with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.EAST, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.SOUTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.WEST, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true));
    }
}

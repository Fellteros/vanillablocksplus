package net.fellter.vanillablocksplus.block;

import com.google.gson.JsonElement;
import net.fellter.vanillablocksplus.tests.ModModels;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BlockStateModelGeneratorMod extends net.minecraft.data.client.BlockStateModelGenerator {
    public BlockStateModelGeneratorMod(Consumer<BlockStateSupplier> blockStateCollector, BiConsumer<Identifier, Supplier<JsonElement>> modelCollector, Consumer<Item> simpleItemModelExemptionCollector, BiConsumer<Identifier, Supplier<JsonElement>> modelCollector1) {
        super(blockStateCollector, modelCollector, simpleItemModelExemptionCollector);
        this.modelCollector = modelCollector;
        this.blockStateCollector = blockStateCollector;
        this.simpleItemModelExemptionCollector = simpleItemModelExemptionCollector;
    }

    public final BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;
    public final Consumer<BlockStateSupplier> blockStateCollector;
    public final Consumer<Item> simpleItemModelExemptionCollector;


    public class BlockTexturePoolMod {
        public static TextureMap textures;

        public void BlockTexturePool(TextureMap textures) {
            BlockTexturePoolMod.textures = textures;
        }

        public void registerParentedItemModel(Block block, Identifier parentModelId) {
            BlockStateModelGeneratorMod.this.modelCollector.accept(ModelIds.getItemModelId(block.asItem()), new SimpleModelSupplier(parentModelId));
        }


        public BlockTexturePoolMod fenceTopBottom(Block fenceBlock) {
            Identifier identifier = Models.FENCE_POST.upload(fenceBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier2 = Models.FENCE_SIDE.upload(fenceBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier3 = ModModels.FENCE_BOTTOM.upload(fenceBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier4 = ModModels.FENCE_TOP.upload(fenceBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            BlockStateModelGeneratorMod.this.blockStateCollector.accept(BlockStateModelGeneratorMod.createFenceBlockStateMod(fenceBlock, identifier, identifier2, identifier3, identifier4));
            Identifier identifier5 = Models.FENCE_INVENTORY.upload(fenceBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            BlockStateModelGeneratorMod.this.registerParentedItemModel(fenceBlock, identifier5);
            return this;
        }

        public BlockTexturePoolMod fenceGateTopBottom(Block fenceGateBlock) {
            Identifier identifier = Models.TEMPLATE_FENCE_GATE.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier2 = Models.TEMPLATE_FENCE_GATE_OPEN.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier3 = Models.TEMPLATE_FENCE_GATE_WALL.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier4 = ModModels.TEMPLATE_FENCE_GATE_BOTTOM.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier5 = ModModels.TEMPLATE_FENCE_GATE_TOP.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier6 = Models.TEMPLATE_FENCE_GATE_WALL_OPEN.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier7 = ModModels.TEMPLATE_FENCE_GATE_WALL_TOP.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            Identifier identifier8 = ModModels.TEMPLATE_FENCE_GATE_WALL_BOTTOM.upload(fenceGateBlock, BlockTexturePoolMod.textures, BlockStateModelGeneratorMod.this.modelCollector);
            BlockStateModelGeneratorMod.this.blockStateCollector.accept(BlockStateModelGeneratorMod.createFenceGateBlockStateMod(fenceGateBlock, identifier, identifier2, identifier3 ,identifier4, identifier5, identifier6, identifier7, identifier8, true));
            return this;
        }
    }















    public static BlockStateSupplier createFenceBlockStateMod(Block fenceBlock, Identifier postModelId, Identifier sideModelId, Identifier topModelId, Identifier bottomModelId) {
        return MultipartBlockStateSupplier.create(fenceBlock).with(BlockStateVariant.create().put(VariantSettings.MODEL, postModelId))
                .with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.EAST, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.SOUTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.WEST, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.UVLOCK, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.UVLOCK, true));


    }    public static BlockStateSupplier createFenceGateBlockStateMod(Block fenceGateBlock, Identifier openModelId, Identifier closedModelId, Identifier openWallModelId, Identifier closedWallModelId,
                                                                       Identifier topModelId, Identifier bottomModelId, Identifier wallTopModelId, Identifier wallBottomModelId, boolean uvlock) {
        return VariantsBlockStateSupplier.create(fenceGateBlock, BlockStateVariant.create().put(VariantSettings.UVLOCK, uvlock))
                .coordinate(BlockStateModelGenerator.createSouthDefaultHorizontalRotationStates())
                .coordinate(BlockStateVariantMap.create(Properties.IN_WALL, Properties.OPEN)
                        .register(false, false, BlockStateVariant.create().put(VariantSettings.MODEL, closedModelId).put(VariantSettings.MODEL, topModelId)
                                .put(VariantSettings.MODEL, bottomModelId))
                        .register(true, false, BlockStateVariant.create().put(VariantSettings.MODEL, closedWallModelId).put(VariantSettings.MODEL, wallTopModelId)
                                .put(VariantSettings.MODEL, wallBottomModelId))
                        .register(false, true, BlockStateVariant.create().put(VariantSettings.MODEL, openModelId).put(VariantSettings.MODEL, topModelId)
                                .put(VariantSettings.MODEL, bottomModelId))
                        .register(true, true, BlockStateVariant.create().put(VariantSettings.MODEL, openWallModelId).put(VariantSettings.MODEL, wallTopModelId)
                                .put(VariantSettings.MODEL, wallBottomModelId)));
    }
    public static BlockStateSupplier createPressurePlateBlockStateMod(Block pressurePlateBlock, Identifier upModelId, Identifier downModelId) {
        return VariantsBlockStateSupplier.create(pressurePlateBlock)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.POWERED, downModelId, upModelId));
    }
}

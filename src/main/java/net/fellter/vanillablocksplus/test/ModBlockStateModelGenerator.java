package net.fellter.vanillablocksplus.test;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModBlockStateModelGenerator extends BlockStateModelGenerator {
    public final Consumer<BlockStateSupplier> blockStateCollector;
    public final BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;
    final List<Block> nonOrientableTrapdoors;
    final Map<Block, TexturedModel> texturedModels;


    @FunctionalInterface
    interface StateFactory {
        BlockStateSupplier create(Block var1, Identifier var2, TextureMap var3, BiConsumer<Identifier, Supplier<JsonElement>> var4);
    }

    public ModBlockStateModelGenerator(Consumer<BlockStateSupplier> blockStateCollector, BiConsumer<Identifier, Supplier<JsonElement>> modelCollector, Consumer<Item> simpleItemModelExemptionCollector, List<Block> nonOrientableTrapdoors, Map<Block, TexturedModel> texturedModels) {
        super(blockStateCollector, modelCollector, simpleItemModelExemptionCollector);
        this.blockStateCollector = blockStateCollector;
        this.modelCollector = modelCollector;
        this.nonOrientableTrapdoors = nonOrientableTrapdoors;
        this.texturedModels = texturedModels;
    }


    public class BlockTexturePool {
        private final TextureMap textures;
        private final Map<Model, Identifier> knownModels = Maps.newHashMap();
        @Nullable
        private BlockFamily family;
        @Nullable
        private Identifier baseModelId;

        public BlockTexturePool(TextureMap textures) {
            this.textures = textures;
        }

        public BlockTexturePool fenceSideTopBottom(Block fenceBlock) {
            Identifier identifier = ModModels.FENCE_SIDE_TOP_BOTTOM_POST.upload(fenceBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            Identifier identifier2 = ModModels.FENCE_SIDE_TOP_BOTTOM_SIDE.upload(fenceBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            ModBlockStateModelGenerator.this.blockStateCollector.accept(ModBlockStateModelGenerator.createFenceBlockState(fenceBlock, identifier, identifier2));
            Identifier identifier3 = ModModels.FENCE_SIDE_TOP_BOTTOM_INVENTORY.upload(fenceBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            ModBlockStateModelGenerator.this.registerParentedItemModel(fenceBlock, identifier3);
            return this;
        }

        public BlockTexturePool base(Block block, Model model) {
            this.baseModelId = model.upload(block, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            return this;
        }
    }

    public void registerParentedItemModel(Block block, Identifier parentModelId) {
        this.modelCollector.accept(ModelIds.getItemModelId(block.asItem()), new SimpleModelSupplier(parentModelId));
    }

    public static BlockStateSupplier createFenceBlockState(Block fenceBlock, Identifier postModelId, Identifier sideModelId) {
        return MultipartBlockStateSupplier.create(fenceBlock).with(BlockStateVariant.create().put(VariantSettings.MODEL, postModelId)).with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.UVLOCK, true)).with(When.create().set(Properties.EAST, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true)).with(When.create().set(Properties.SOUTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true)).with(When.create().set(Properties.WEST, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true));
    }





}

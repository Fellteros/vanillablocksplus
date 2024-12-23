package net.fellter.vanillablocksplus.test;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.Optional;
import java.util.function.Function;

public class Test {
//
//    /**I created two test blocks for example purposes; replace them with your own blocks.*/
//    public static final Block TEST_OVERGROWN = registerBlock("test_overgrown", Block::new, AbstractBlock.Settings.create());
//    public static final Block TEST_OVERGROWN_ORNAMENTED = registerBlock("test_overgrown_ornamented", Block::new, AbstractBlock.Settings.create());
//
//    /**These are the two example Models, that technically represent the JSON files in your code.<br>
//     * @see Models */
//    public static final Model EXAMPLE_1_OVERLAY = block("example_1_overlay", "_1_overlay", TextureKey.ALL, TextureKey.LAYER1);
//    public static final Model EXAMPLE_2_OVERLAYS = block("example_2_overlays", "_2_overlays", TextureKey.ALL, TextureKey.LAYER1, TextureKey.LAYER2);
//
//    /**This is the method creating the Models;
//     * The Identifier is the path to the JSON file: <code>Identifier.of("your_mod_id", "block/" + parent)</code> => <code>resources/assets/your_mod_id/block/parent</code>
//     * Params:
//     *      @param parent The literal name of the JSON file
//     *      @param variant The literal name of the variant;
//     *                    e.g. you have two JSONs: "test_overgrown.json" & "test_ornamented.json". "Test" is the parent, "_overgrown" & "_ornamented" are the variants.
//     *                     These will get appended to the block JSON once generated => <code>"test_overgrown<strong>_1_overlay</strong>.json"</code>
//     *      @param requiredTextureKeys These are the Texture keys your JSON file uses; <code>TextureKey.LAYER1</code> in code =>
//     *                                <code>"texture": "#layer1"</code> in the parent JSON => <code>"textures": { "layer1": "your_mod_id:block/test" }</code> in the generated JSON
//     *@see Models#block(String, String, TextureKey...) */
//    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
//        return new Model(Optional.of(Identifier.of("your_mod_id", "block/" + parent)), Optional.of(variant), requiredTextureKeys);
//    }
//
//    /**This is technically the same, just without the variant => <code>"test_overgrown.json"</code><br>
//     * @see Models#block(String, TextureKey...) */
//    private static Model block(String parent, TextureKey ... requiredTextureKeys) {
//        return new Model(Optional.of(Identifier.of("your_mod_id", "block/" + parent)), Optional.empty(), requiredTextureKeys);
//    }
//
//    /**The most crucial step - actually specify the identifiers to the generated JSON file. Here you create a new TextureMap and specify what ID goes where.<br>
//     * Let's look at this - <code>.put(TextureKey.ALL, TextureMap.getId(baseBlock))</code>:<br>
//     * You specify which to which TextureKey goes the Identifier (second param). The TextureMap class has a handy method for creating IDs just from passing a block/item.
//     * {@code TextureMap#getSubId(Block, String)} lets you append a string to the Identifier. <br>
//     * ALL TEXTUREKEYS HERE HAVE TO MATCH ALL TEXTUREKEYS IN YOUR MODEL INSTANCE! otherwise it won't work.
//     * @param baseBlock The block that makes the base texture.
//     * @param overlay1Id The path to the overlay PNG file.
//     * @see TextureMap
//     * */
//    public static TextureMap overlay1(Block baseBlock, Identifier overlay1Id) {
//        return new TextureMap()
//                .put(TextureKey.ALL, TextureMap.getId(baseBlock))
//                .put(TextureKey.LAYER1, overlay1Id);
//    }
//
//    public static TextureMap overlays2(Block baseBlock, Identifier overlay1Id, Identifier overlay2Id) {
//        return new TextureMap()
//                .put(TextureKey.ALL, TextureMap.getId(baseBlock))
//                .put(TextureKey.LAYER1, overlay1Id)
//                .put(TextureKey.LAYER2, overlay2Id);
//    }
//
//    /**This is the method that you will call in your ModelProvider. HAS to be static, so you can import it. It creates the block and item model JSONs and blockstate JSON file.
//     * @param block The {@link Block} that gets the JSONs generated
//     * @param textureMap The {@link TextureMap} specifying the identifiers
//     * @param bsmg The {@link BlockStateModelGenerator} which you have to use for all of its constants. MAKING A NEW ONE, EVEN IDENTICAL, WON'T WORK! It'll just throw a {@link NullPointerException}.
//     * @see BlockStateModelGenerator*/
//    public static void overgrownBlock(Block block, TextureMap textureMap, BlockStateModelGenerator bsmg) {
//        Identifier identifier = Test.EXAMPLE_1_OVERLAY.upload(block, textureMap, bsmg.modelCollector);
//        bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, identifier));
//        bsmg.registerParentedItemModel(block, identifier);
//    }
//
//    public static void overgrownOrnamentedBlock(Block block, TextureMap textureMap, BlockStateModelGenerator bsmg) {
//        Identifier identifier = Test.EXAMPLE_2_OVERLAYS.upload(block, textureMap, bsmg.modelCollector);
//        bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, identifier));
//        bsmg.registerParentedItemModel(block, identifier);
//    }
//
//    /**Just for example purposes. Call all methods in your properly registered ModelProvider.*/
//    public static class TestModelProvider extends FabricModelProvider {
//        public TestModelProvider(FabricDataOutput output) {
//            super(output);
//        }
//
//        /**Example of how the methods can be called. These would generate JSONs for both blocks I created earlier.*/
//        @Override
//        public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
//            overgrownBlock(
//                    TEST_OVERGROWN,
//                    overlay1(TEST_OVERGROWN, Identifier.of("your_mod_id", "path/to/the/file")),
//                    bsmg);
//            overgrownOrnamentedBlock(
//                    TEST_OVERGROWN_ORNAMENTED,
//                    overlays2(TEST_OVERGROWN_ORNAMENTED, Identifier.of("your_mod_id", "path/to/the/first/overlay"), Identifier.of("your_mod_id", "path/to/the/second/overlay")),
//                    bsmg
//            );
//        }
//
//        @Override
//        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//
//        }
//    }
//
//    /**You can ignore these, just helper methods for registering the {@linkplain Block}s*/
//    protected static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
//        Block block = function.apply(settings.registryKey(keyOfBlock(name)));
//        Registry.register(Registries.ITEM, Identifier.of("your_mod_id", name), new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(keyOfItem(name))));
//        return Registry.register(Registries.BLOCK, keyOfBlock(name), block);
//    }
//    protected static RegistryKey<Block> keyOfBlock(String name) {
//        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("your_mod_id", name));
//    }
//    protected static RegistryKey<Item> keyOfItem(String name) {
//        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of("your_mod_id", name));
//    }
}


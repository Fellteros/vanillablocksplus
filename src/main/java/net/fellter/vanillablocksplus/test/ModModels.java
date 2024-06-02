package net.fellter.vanillablocksplus.test;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {
    public static final Model BUTTON_STB = ModModels.block("button_stb", TextureKey.SIDE, TextureKey.BOTTOM, TextureKey.TOP);
    public static final Model BUTTON_STB_INVENTORY = ModModels.block("button_stb_inventory", "_inventory", TextureKey.SIDE, TextureKey.BOTTOM, TextureKey.TOP);
    public static final Model BUTTON_STB_PRESSED = ModModels.block("button_stb_pressed", "_pressed", TextureKey.SIDE, TextureKey.BOTTOM, TextureKey.TOP);
    public static final Model FENCE_STB_POST = ModModels.block("fence_stb_post", "_post", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_STB_SIDE = ModModels.block("fence_stb_side", "_side", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_STB_INVENTORY = ModModels.block("fence_stb_inventory", "_inventory", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);



    private static Model make(TextureKey... requiredTextureKeys) {
        return new Model(Optional.empty(), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("vanillablocksplus", "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model item(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("vanillablocksplus", "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("vanillablocksplus", "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}

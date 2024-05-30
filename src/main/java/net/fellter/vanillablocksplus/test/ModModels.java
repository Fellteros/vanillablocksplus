package net.fellter.vanillablocksplus.test;

import com.ibm.icu.text.Normalizer2;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {
    public static final Model FENCE_SIDE_TOP_BOTTOM_POST = ModModels.block("fence_side_top_bottom", "_post", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_SIDE_TOP_BOTTOM_SIDE = ModModels.block("fence_side_top_bottom", "_side", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_SIDE_TOP_BOTTOM_INVENTORY = ModModels.block("fence_side_top_bottom", "_inventory", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);



    private static Model make(TextureKey... requiredTextureKeys) {
        return new Model(Optional.empty(), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("minecraft", "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model item(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("minecraft", "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("minecraft", "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}

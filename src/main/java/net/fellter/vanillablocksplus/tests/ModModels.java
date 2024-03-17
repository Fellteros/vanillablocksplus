package net.fellter.vanillablocksplus.tests;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {
    public static final Model FENCE_TOP = ModModels.block("fence_top", "_top", TextureKey.TOP);
    public static final Model FENCE_BOTTOM = ModModels.block("fence_bottom", "_bottom", TextureKey.BOTTOM);
    public static final Model TEMPLATE_FENCE_GATE_BOTTOM = ModModels.block("template_fence_gate_bottom", "_bottom", TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model TEMPLATE_FENCE_GATE_TOP = ModModels.block("template_fence_gate_top", "_top", TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model TEMPLATE_FENCE_GATE_WALL_BOTTOM = ModModels.block("template_fence_gate_wall_bottom", "_bottom", TextureKey.BOTTOM, TextureKey.PARTICLE);
    public static final Model TEMPLATE_FENCE_GATE_WALL_TOP = ModModels.block("template_fence_gate_wall_top", "_top", TextureKey.TOP, TextureKey.PARTICLE);



    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("minecraft", "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}

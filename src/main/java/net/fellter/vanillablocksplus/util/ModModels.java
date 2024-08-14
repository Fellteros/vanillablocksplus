package net.fellter.vanillablocksplus.util;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {
    public static final Model BUTTON_STB = ModModels.block("button_stb", TextureKey.SIDE, TextureKey.BOTTOM, TextureKey.TOP);
    public static final Model BUTTON_STB_INVENTORY = ModModels.block("button_stb_inventory", "_inventory", TextureKey.SIDE, TextureKey.BOTTOM, TextureKey.TOP);
    public static final Model BUTTON_STB_PRESSED = ModModels.block("button_stb_pressed", "_pressed", TextureKey.SIDE, TextureKey.BOTTOM, TextureKey.TOP);
    public static final Model FENCE_GATE_STB = ModModels.block("fence_gate_stb", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_GATE_STB_OPEN = ModModels.block("fence_gate_stb_open", "_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_GATE_STB_WALL = ModModels.block("fence_gate_stb_wall", "_wall", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_GATE_STB_WALL_OPEN = ModModels.block("fence_gate_stb_wall_open", "_wall_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_STB_POST = ModModels.block("fence_stb_post", "_post", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_STB_SIDE = ModModels.block("fence_stb_side", "_side", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model FENCE_STB_INVENTORY = ModModels.block("fence_stb_inventory", "_inventory", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model PRESSURE_PLATE_STB = ModModels.block("pressure_plate_stb", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model PRESSURE_PLATE_STB_DOWN = ModModels.block("pressure_plate_stb_down", "_down", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model SLAB_STB = ModModels.block("slab_stb", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model SLAB_STB_TOP = ModModels.block("slab_stb_top", "_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model STAIRS_STB = ModModels.block("stairs_stb", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model STAIRS_STB_INNER = ModModels.block("stairs_stb_inner", "_inner", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model STAIRS_STB_INNER_TOP = ModModels.block("stairs_stb_inner_top", "_inner_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model STAIRS_STB_OUTER = ModModels.block("stairs_stb_outer", "_outer", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model STAIRS_STB_OUTER_TOP = ModModels.block("stairs_stb_outer_top", "_outer_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model STAIRS_STB_TOP = ModModels.block("stairs_stb_top", "_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model TRAPDOOR_STB_BOTTOM = ModModels.block("trapdoor_stb_bottom", "_bottom", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model TRAPDOOR_STB_OPEN = ModModels.block("trapdoor_stb_open", "_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model TRAPDOOR_STB_OPEN_TOP = ModModels.block("trapdoor_stb_open_top", "_open_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model TRAPDOOR_STB_TOP = ModModels.block("trapdoor_stb_top", "_top", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model WALL_STB_INVENTORY = ModModels.block("wall_stb_inventory", "_inventory", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model WALL_STB_POST = ModModels.block("wall_stb_post", "_post", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model WALL_STB_SIDE = ModModels.block("wall_stb_side", "_side", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model WALL_STB_SIDE_TALL = ModModels.block("wall_stb_side_tall", "_side_tall", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model WALL_STB_SIDE_SHORT = ModModels.block("wall_stb_side_short", "_side_short", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model WALL_STB_SIDE_TALL_SHORT = ModModels.block("wall_stb_side_tall_short", "_side_tall_short", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_TI0_BOTTOM_LEFT = ModModels.block("door_ti0_bottom_left", "_bottom_left", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_BOTTOM_LEFT_OPEN = ModModels.block("door_ti0_bottom_left_open", "_bottom_left_open", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_BOTTOM_RIGHT = ModModels.block("door_ti0_bottom_right", "_bottom_right", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_BOTTOM_RIGHT_OPEN = ModModels.block("door_ti0_bottom_right_open", "_bottom_right_open", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_TOP_LEFT = ModModels.block("door_ti0_top_left", "_top_left", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_TOP_LEFT_OPEN = ModModels.block("door_ti0_top_left_open", "_top_left_open", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_TOP_RIGHT = ModModels.block("door_ti0_top_right", "_top_right", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_TI0_TOP_RIGHT_OPEN = ModModels.block("door_ti0_top_right_open", "_top_right_open", TextureKey.TOP, TextureKey.BOTTOM);
    public static final Model DOOR_STB_BOTTOM_LEFT = ModModels.block("door_stb_bottom_left", "_bottom_left", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_BOTTOM_LEFT_OPEN = ModModels.block("door_stb_bottom_left_open", "_bottom_left_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_BOTTOM_RIGHT = ModModels.block("door_stb_bottom_right", "_bottom_right", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_BOTTOM_RIGHT_OPEN = ModModels.block("door_stb_bottom_right_open", "_bottom_right_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_TOP_LEFT = ModModels.block("door_stb_top_left", "_top_left", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_TOP_LEFT_OPEN = ModModels.block("door_stb_top_left_open", "_top_left_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_TOP_RIGHT = ModModels.block("door_stb_top_right", "_top_right", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);
    public static final Model DOOR_STB_TOP_RIGHT_OPEN = ModModels.block("door_stb_top_right_open", "_top_right_open", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE);




    private static Model block(String parent, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of("vanillablocksplus", "blockmodels/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of("vanillablocksplus", "blockmodels/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}

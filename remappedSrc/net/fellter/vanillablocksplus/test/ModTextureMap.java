package net.fellter.vanillablocksplus.test;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;

import java.util.Optional;

public class ModTextureMap extends TextureMap {
    //STB = side, top, bottom
    public static TextureMap customSTB(Block sideBlock, Block topBlock, Block bottomBlock, String sideSuffix, String topSuffix, String bottomSuffix) {
        return new TextureMap().put(TextureKey.SIDE, TextureMap.getSubId(sideBlock, sideSuffix))
                .put(TextureKey.TOP, TextureMap.getSubId(topBlock, topSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(bottomBlock, bottomSuffix));
    }
    //all
    public static TextureMap customAll(Block block, String suffix) {
        return new TextureMap().put(TextureKey.ALL, TextureMap.getSubId(block, suffix));
    }
    //sideAndTopForEnd
    public static TextureMap sideAndTopForEnds(Block block) {
        return new TextureMap()
                .put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_top"));
    }
}

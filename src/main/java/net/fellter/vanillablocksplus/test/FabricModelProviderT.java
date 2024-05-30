package net.fellter.vanillablocksplus.test;

import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.ModelProvider;
import net.minecraft.util.Identifier;

public abstract class FabricModelProviderT extends ModelProvider {
    public FabricModelProviderT(DataOutput output) {
        super(output);
    }


    public void generateBlockStateModels(ModBlockStateModelGenerator modBlockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool test = modBlockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRASS_BLOCK);



    }
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

}

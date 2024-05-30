package net.fellter.vanillablocksplus.test;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProviderTest extends FabricModelProviderT{
    public ModelProviderTest(DataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(ModBlockStateModelGenerator modBlockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

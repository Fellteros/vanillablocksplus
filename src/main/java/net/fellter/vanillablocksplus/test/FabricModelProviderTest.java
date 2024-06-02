package net.fellter.vanillablocksplus.test;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelProvider;

public abstract class FabricModelProviderTest extends ModelProvider {
    public FabricModelProviderTest(FabricDataOutput output) {
        super(output);
    }

    public abstract void generateBlockStateModels(ModBlockStateModelGenerator modBlockStateModelGenerator);

    public abstract void generateItemModels(ItemModelGenerator itemModelGenerator);

}

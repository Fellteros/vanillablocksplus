package net.fellter.vanillablocksplus.block;

import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModWoodTypes {
    public static WoodType NETHERRACK = new WoodType("netherrack", ModBlockSetTypes.NETHERRACK,
            BlockSoundGroup.NETHERRACK, BlockSoundGroup.NETHERRACK, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
}

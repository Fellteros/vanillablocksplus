package net.fellter.vanillablocksplus.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class MixinAxeItem {

    @Shadow @Final protected static Map<Block, Block> STRIPPED_BLOCKS;



    /**
     * @author Fellter
     * @reason Cannot add blocks without the Axis property
     */
    @Overwrite
    private Optional<BlockState> getStrippedState(BlockState blockState) {
        return Optional.ofNullable(STRIPPED_BLOCKS.get(blockState.getBlock())).map(block ->
                block.getStateWithProperties(blockState));
    }

}

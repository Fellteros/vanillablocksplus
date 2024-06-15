package net.fellter.vanillablocksplus.custom_blocks.copper;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.HoneycombItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;

import java.util.Optional;

import static net.minecraft.item.HoneycombItem.WAXED_TO_UNWAXED_BLOCKS;
import static net.minecraft.item.HoneycombItem.getWaxedState;

public class OxidizableDoorBlock extends DoorBlock implements Oxidizable {

    //huge thanks to Sn0wix_ for providing the door fix
    //https://github.com/Sn0wix/Miscellaneous-Additions/blob/master/src/main/java/net/sn0wix_/misc_additions/common/block/custom/CopperDoorBlock.java

    private final Oxidizable.OxidationLevel oxidationLevel;

    public OxidizableDoorBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings, BlockSetType blockSetType) {
        super(settings, blockSetType);
        this.oxidationLevel = oxidationLevel;
    }






    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!world.isClient() && (pos.up().equals(neighborPos) || pos.down().equals(neighborPos))) {
            if (Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent() && Oxidizable.getIncreasedOxidationBlock(state.getBlock()).get().equals(neighborState.getBlock())) {
                return neighborState.withIfExists(HALF, state.get(HALF).equals(DoubleBlockHalf.UPPER) ? DoubleBlockHalf.UPPER : DoubleBlockHalf.LOWER);
            }

            if (Oxidizable.getDecreasedOxidationBlock(state.getBlock()).isPresent() && Oxidizable.getDecreasedOxidationBlock(state.getBlock()).get().equals(neighborState.getBlock())) {
                return neighborState.withIfExists(HALF, state.get(HALF).equals(DoubleBlockHalf.UPPER) ? DoubleBlockHalf.UPPER : DoubleBlockHalf.LOWER);
            }

            if (getWaxedState(state).isPresent() && getWaxedState(state).get().getBlock().equals(neighborState.getBlock())) {
                return neighborState.withIfExists(HALF, state.get(HALF).equals(DoubleBlockHalf.UPPER) ? DoubleBlockHalf.UPPER : DoubleBlockHalf.LOWER);
            }

            if (getUnwaxedState(state).isPresent() && getUnwaxedState(state).get().getBlock().equals(neighborState.getBlock())) {
                return neighborState.withIfExists(HALF, state.get(HALF).equals(DoubleBlockHalf.UPPER) ? DoubleBlockHalf.UPPER : DoubleBlockHalf.LOWER);
            }

            if (getUnwaxedState(state).isPresent() && getUnwaxedState(state).get().getBlock().equals(neighborState.getBlock())) {
                return neighborState.withIfExists(HALF, state.get(HALF).equals(DoubleBlockHalf.LOWER) ? DoubleBlockHalf.LOWER : DoubleBlockHalf.UPPER);
            }
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public static Optional<BlockState> getUnwaxedState(BlockState state) {
        return Optional.ofNullable(HoneycombItem.WAXED_TO_UNWAXED_BLOCKS.get().get(state.getBlock())).map(block -> block.getStateWithProperties(state));
    }



    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}

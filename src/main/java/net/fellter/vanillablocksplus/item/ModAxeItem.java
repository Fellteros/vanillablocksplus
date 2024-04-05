package net.fellter.vanillablocksplus.item;

import com.google.common.collect.ImmutableMap;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    protected static final Map<Block, Block> STRIPPED_BLOCKS = new ImmutableMap.Builder<Block, Block>().put(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STR_OAK_WOOD_STAIRS).build();


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity playerEntity;
        BlockPos blockPos;
        World world = context.getWorld();
        Optional<BlockState> optional = this.tryStrip(world, blockPos = context.getBlockPos(), playerEntity = context.getPlayer(), world.getBlockState(blockPos));
        if (optional.isEmpty()) {
            return ActionResult.PASS;
        }
        ItemStack itemStack = context.getStack();
        if (playerEntity instanceof ServerPlayerEntity) {
            Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
        }
        world.setBlockState(blockPos, optional.get(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
        world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, optional.get()));
        if (playerEntity != null) {
            itemStack.damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
        }
        return ActionResult.success(world.isClient);
    }

    private Optional<BlockState> tryStrip(World world, BlockPos pos, @Nullable PlayerEntity player, BlockState state) {
        Optional<BlockState> optional = this.getStrippedState(state);
        if (optional.isPresent()) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
            return optional;
        }
    return Optional.empty();
    }

    private Optional<BlockState> getStrippedState(BlockState state) {
        return Optional.ofNullable(STRIPPED_BLOCKS.get(state.getBlock())).map(block -> block.getDefaultState()
                .with(Properties.FACING, state.get(Properties.FACING))
                .with(Properties.WATERLOGGED, state.get(Properties.WATERLOGGED)));
    }
}

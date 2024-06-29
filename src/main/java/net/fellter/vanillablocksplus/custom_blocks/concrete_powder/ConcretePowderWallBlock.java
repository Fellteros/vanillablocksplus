package net.fellter.vanillablocksplus.custom_blocks.concrete_powder;

import net.fellter.vanillablocksplus.custom_blocks.falling.FallingWallBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.WallShape;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class ConcretePowderWallBlock extends WallBlock implements LandingBlock {
    private static final VoxelShape TALL_POST_SHAPE = createCuboidShape(7, 0, 7, 9, 16, 9);
    private static final VoxelShape TALL_NORTH_SHAPE = createCuboidShape(7, 0, 0, 9, 16, 9);
    private static final VoxelShape TALL_SOUTH_SHAPE = createCuboidShape(7, 0, 7, 9, 16, 16);
    private static final VoxelShape TALL_WEST_SHAPE = createCuboidShape(0, 0, 7, 9, 16, 9);
    private static final VoxelShape TALL_EAST_SHAPE = createCuboidShape(7, 0, 7, 16, 16, 9);
    private final BlockState hardenedState;

    public ConcretePowderWallBlock(Settings settings, Block hardened) {
        super(settings);
        this.hardenedState = hardened.getDefaultState();
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        FluidState fluidState = world.getFluidState(pos);
        BlockPos northPos = pos.north();
        BlockPos eastPos = pos.east();
        BlockPos southPos = pos.south();
        BlockPos westPos = pos.west();
        BlockPos upPos = pos.up();
        BlockState northState = world.getBlockState(northPos);
        BlockState eastState = world.getBlockState(eastPos);
        BlockState southState = world.getBlockState(southPos);
        BlockState westState = world.getBlockState(westPos);
        BlockState upState = world.getBlockState(upPos);
        boolean north = this.shouldConnectTo(northState, northState.isSideSolidFullSquare(world, northPos, Direction.SOUTH), Direction.SOUTH);
        boolean south = this.shouldConnectTo(eastState, eastState.isSideSolidFullSquare(world, eastPos, Direction.WEST), Direction.WEST);
        boolean east = this.shouldConnectTo(southState, southState.isSideSolidFullSquare(world, southPos, Direction.NORTH), Direction.NORTH);
        boolean west = this.shouldConnectTo(westState, westState.isSideSolidFullSquare(world, westPos, Direction.EAST), Direction.EAST);
        BlockState state = this.getDefaultState().with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        BlockState newState = this.getStateWith(world, state, upPos, upState, north, south, east, west);

        world.setBlockState(pos, newState);

        if (shouldHarden(world, pos, newState)) {
            world.setBlockState(pos, this.hardenedState
                    .with(NORTH_SHAPE, world.getBlockState(pos).get(NORTH_SHAPE))
                    .with(SOUTH_SHAPE, world.getBlockState(pos).get(SOUTH_SHAPE))
                    .with(EAST_SHAPE, world.getBlockState(pos).get(EAST_SHAPE))
                    .with(WEST_SHAPE, world.getBlockState(pos).get(WEST_SHAPE))
                    .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED)));
        }


    }

    public boolean shouldConnectTo(BlockState state, boolean faceFullSquare, Direction side) {
        Block block = state.getBlock();
        boolean bl = block instanceof FenceGateBlock && FenceGateBlock.canWallConnect(state, side);
        return state.isIn(BlockTags.WALLS) || !cannotConnect(state) && faceFullSquare || block instanceof PaneBlock || bl;
    }

    private BlockState getStateWith(WorldView world, BlockState state, BlockPos pos, BlockState aboveState, boolean north, boolean east, boolean south, boolean west) {
        VoxelShape voxelShape = aboveState.getCollisionShape(world, pos).getFace(Direction.DOWN);
        BlockState blockState = this.getStateWith(state, north, east, south, west, voxelShape);
        return blockState.with(UP, this.shouldHavePost(blockState, aboveState, voxelShape));
    }

    private BlockState getStateWith(BlockState state, boolean north, boolean east, boolean south, boolean west, VoxelShape aboveShape) {
        return state.with(NORTH_SHAPE, this.getWallShape(north, aboveShape, TALL_NORTH_SHAPE))
                .with(EAST_SHAPE, this.getWallShape(east, aboveShape, TALL_EAST_SHAPE))
                .with(SOUTH_SHAPE, this.getWallShape(south, aboveShape, TALL_SOUTH_SHAPE))
                .with(WEST_SHAPE, this.getWallShape(west, aboveShape, TALL_WEST_SHAPE));
    }

    private WallShape getWallShape(boolean connected, VoxelShape aboveShape, VoxelShape tallShape) {
        if (connected) {
            if (shouldUseTallShape(aboveShape, tallShape)) {
                return WallShape.TALL;
            }
            return WallShape.LOW;
        }
        return WallShape.NONE;
    }

    private boolean shouldHavePost(BlockState state, BlockState aboveState, VoxelShape aboveShape) {
        boolean bl = aboveState.getBlock() instanceof WallBlock && aboveState.get(UP);
        if (bl) {
            return true;
        }
        WallShape northShape = state.get(NORTH_SHAPE);
        WallShape southShape = state.get(SOUTH_SHAPE);
        WallShape eastShape = state.get(EAST_SHAPE);
        WallShape westShape = state.get(WEST_SHAPE);
        boolean southDisconnected = southShape == WallShape.NONE;
        boolean westDisconnected = westShape == WallShape.NONE;
        boolean eastDisconnected = eastShape == WallShape.NONE;
        boolean northDisconnected = northShape == WallShape.NONE;
        boolean shouldHavePost = northDisconnected && southDisconnected && westDisconnected && eastDisconnected || northDisconnected != southDisconnected || westDisconnected != eastDisconnected;
        if (shouldHavePost) {
            return true;
        }
        boolean allTall = northShape == WallShape.TALL && southShape == WallShape.TALL || eastShape == WallShape.TALL && westShape == WallShape.TALL;
        if (allTall) {
            return false;
        }
        return aboveState.isIn(BlockTags.WALL_POST_OVERRIDE) || shouldUseTallShape(aboveShape, TALL_POST_SHAPE);
    }

    private static boolean shouldUseTallShape(VoxelShape aboveShape, VoxelShape tallShape) {
        return !VoxelShapes.matchesAnywhere(tallShape, aboveShape, BooleanBiFunction.ONLY_FIRST);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World blockView = ctx.getWorld();
        BlockState placementState = super.getPlacementState(ctx);
        if (shouldHarden(blockView, blockPos, blockView.getBlockState(blockPos))) {
            if (placementState != null) {
                return this.hardenedState
                        .with(WATERLOGGED, placementState.get(WATERLOGGED))
                        .with(NORTH_SHAPE, placementState.get(NORTH_SHAPE))
                        .with(EAST_SHAPE, placementState.get(EAST_SHAPE))
                        .with(SOUTH_SHAPE, placementState.get(SOUTH_SHAPE))
                        .with(WEST_SHAPE, placementState.get(WEST_SHAPE))
                        .with(UP, placementState.get(UP));
            }
        }
        return super.getPlacementState(ctx);
    }


    private static boolean shouldHarden(BlockView world, BlockPos pos, BlockState state) {
        return hardensIn(state) || hardensOnAnySide(world, pos);
    }

    private static boolean hardensOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction direction : Direction.values()) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction == Direction.DOWN && !hardensIn(blockState)) continue;
            mutable.set(pos, direction);
            blockState = world.getBlockState(mutable);
            if (!hardensIn(blockState) || blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    private static boolean hardensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (hardensOnAnySide(world, pos)) {
            return this.hardenedState
                    .with(WATERLOGGED, world.getBlockState(pos).get(WATERLOGGED))
                    .with(EAST_SHAPE, world.getBlockState(pos).get(EAST_SHAPE))
                    .with(WEST_SHAPE, world.getBlockState(pos).get(WEST_SHAPE))
                    .with(SOUTH_SHAPE, world.getBlockState(pos).get(SOUTH_SHAPE))
                    .with(NORTH_SHAPE, world.getBlockState(pos).get(NORTH_SHAPE))
                    .with(UP, world.getBlockState(pos).get(UP));
        }
        world.scheduleBlockTick(pos, this, this.getFallDelay());
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canFallThrough(world.getBlockState(pos.down())) || pos.getY() < world.getBottomY()) {
            return;
        }
        FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
        this.configureFallingBlockEntity(fallingBlockEntity);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
    }

    protected int getFallDelay() {
        return 2;
    }

    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.FIRE) || state.isLiquid() || state.isReplaceable();
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0 && canFallThrough(world.getBlockState(pos.down()))) {
            ParticleUtil.spawnParticle(world, pos, random, new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state));
        }
    }
}

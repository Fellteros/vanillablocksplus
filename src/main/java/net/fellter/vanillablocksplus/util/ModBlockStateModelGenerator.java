package net.fellter.vanillablocksplus.util;

import net.minecraft.block.Block;
import net.minecraft.block.enums.*;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class ModBlockStateModelGenerator {


    public ModBlockStateModelGenerator() {
    }

    public static class ModBlockTexturePool {
        private final TextureMap textureMap;
        private final BlockStateModelGenerator bsmg;
        private final Identifier baseModelId;

        public ModBlockTexturePool(TextureMap textureMap, BlockStateModelGenerator bsmg, Block block) {
            this.textureMap = textureMap;
            this.bsmg = bsmg;
             this.baseModelId = TextureMap.getId(block);
        }

        public ModBlockTexturePool button(Block buttonBlock) {
            Identifier identifier = ModModels.BUTTON_STB.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = ModModels.BUTTON_STB_PRESSED.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(createButtonBlockState(buttonBlock, identifier, identifier2));
            Identifier identifier3 = ModModels.BUTTON_STB_INVENTORY.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
            bsmg.registerParentedItemModel(buttonBlock, identifier3);
            return this;
        }
        public ModBlockTexturePool wall(Block wallBlock) {
            Identifier identifier = ModModels.WALL_STB_POST.upload(wallBlock, textureMap, bsmg.modelCollector);
            Identifier identifier2 = ModModels.WALL_STB_SIDE.upload(wallBlock, textureMap, bsmg.modelCollector);
            Identifier identifier3 = ModModels.WALL_STB_SIDE_TALL.upload(wallBlock, textureMap, bsmg.modelCollector);
            Identifier identifier4 = ModModels.WALL_STB_SIDE_SHORT.upload(wallBlock, textureMap, bsmg.modelCollector);
            Identifier identifier5 = ModModels.WALL_STB_SIDE_TALL_SHORT.upload(wallBlock, textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(createWallBlockState(wallBlock, identifier, identifier2, identifier3, identifier4, identifier5));
            Identifier identifier6 = ModModels.WALL_STB_INVENTORY.upload(wallBlock, textureMap, bsmg.modelCollector);
            bsmg.registerParentedItemModel(wallBlock, identifier6);
            return this;
        }
        public ModBlockTexturePool fence(Block fenceBlock) {
            Identifier identifier = ModModels.FENCE_STB_POST.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = ModModels.FENCE_STB_SIDE.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, identifier, identifier2));
            Identifier identifier3 = ModModels.FENCE_STB_INVENTORY.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
            bsmg.registerParentedItemModel(fenceBlock, identifier3);
            return this;
        }
        public ModBlockTexturePool fenceGate(Block fenceGateBlock) {
            Identifier identifier = ModModels.FENCE_GATE_STB_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = ModModels.FENCE_GATE_STB.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier3 = ModModels.FENCE_GATE_STB_WALL_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier4 = ModModels.FENCE_GATE_STB_WALL.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock, identifier, identifier2, identifier3, identifier4, true));
            return this;
        }
        public ModBlockTexturePool pressurePlate(Block pressurePlateBlock) {
            Identifier identifier = ModModels.PRESSURE_PLATE_STB.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = ModModels.PRESSURE_PLATE_STB_DOWN.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, identifier, identifier2));
            return this;
        }
        public ModBlockTexturePool slab(Block slabBlock) {
            if (this.baseModelId == null) {
                throw new IllegalStateException("Full block not generated yet");
            } else {
                Identifier identifier = ModModels.SLAB_STB.upload(slabBlock, this.textureMap, bsmg.modelCollector);
                Identifier identifier2 = ModModels.SLAB_STB_TOP.upload(slabBlock, textureMap, bsmg.modelCollector);
                bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, this.baseModelId));
                bsmg.registerParentedItemModel(slabBlock, identifier);
                return this;
            }
        }
        public ModBlockTexturePool stairs(Block stairBlock) {
            Identifier identifier = ModModels.STAIRS_STB.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier2 = ModModels.STAIRS_STB_INNER.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier3 = ModModels.STAIRS_STB_OUTER.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier4 = ModModels.STAIRS_STB_TOP.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier5 = ModModels.STAIRS_STB_INNER_TOP.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier6 = ModModels.STAIRS_STB_OUTER_TOP.upload(stairBlock, textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(ModBlockStateModelGenerator.createStairsBlockState(stairBlock, identifier2, identifier, identifier3, identifier5, identifier4, identifier6));
            bsmg.registerParentedItemModel(stairBlock, identifier);
            return this;
        }
        public ModBlockTexturePool buttonAll(Block buttonBlock) {
            Identifier identifier = Models.BUTTON.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = Models.BUTTON_PRESSED.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(buttonBlock, identifier, identifier2));
            Identifier identifier3 = Models.BUTTON_INVENTORY.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
            bsmg.registerParentedItemModel(buttonBlock, identifier3);
            return this;
        }
        public ModBlockTexturePool wallAll(Block wallBlock) {
            Identifier identifier = Models.TEMPLATE_WALL_POST.upload(wallBlock, textureMap, bsmg.modelCollector);
            Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textureMap, bsmg.modelCollector);
            Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3));
            Identifier identifier6 = Models.WALL_INVENTORY.upload(wallBlock, textureMap, bsmg.modelCollector);
            bsmg.registerParentedItemModel(wallBlock, identifier6);
            return this;
        }
        public ModBlockTexturePool fenceAll(Block fenceBlock) {
            Identifier identifier = Models.FENCE_POST.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = Models.FENCE_SIDE.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, identifier, identifier2));
            Identifier identifier3 = Models.FENCE_INVENTORY.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
            bsmg.registerParentedItemModel(fenceBlock, identifier3);
            return this;
        }
        public ModBlockTexturePool fenceGateAll(Block fenceGateBlock) {
            Identifier identifier = Models.TEMPLATE_FENCE_GATE_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = Models.TEMPLATE_FENCE_GATE.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier3 = Models.TEMPLATE_FENCE_GATE_WALL_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier4 = Models.TEMPLATE_FENCE_GATE_WALL.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock, identifier, identifier2, identifier3, identifier4, true));
            return this;
        }
        public ModBlockTexturePool pressurePlateAll(Block pressurePlateBlock) {
            Identifier identifier = Models.PRESSURE_PLATE_UP.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
            Identifier identifier2 = Models.PRESSURE_PLATE_DOWN.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, identifier, identifier2));
            return this;
        }
        public ModBlockTexturePool slabAll(Block slabBlock) {
            if (this.baseModelId == null) {
                throw new IllegalStateException("Full block not generated yet");
            } else {
                Identifier identifier = Models.SLAB.upload(slabBlock, this.textureMap, bsmg.modelCollector);
                Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap, bsmg.modelCollector);
                bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, this.baseModelId));
                bsmg.registerParentedItemModel(slabBlock, identifier);
                return this;
            }
        }
        public ModBlockTexturePool stairsAll(Block stairBlock) {
            Identifier identifier = Models.STAIRS.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier2 = Models.INNER_STAIRS.upload(stairBlock, textureMap, bsmg.modelCollector);
            Identifier identifier3 = Models.OUTER_STAIRS.upload(stairBlock, textureMap, bsmg.modelCollector);
            bsmg.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(stairBlock, identifier2, identifier, identifier3));
            bsmg.registerParentedItemModel(stairBlock, identifier);
            return this;
        }
    }




    public static ModBlockTexturePool registerModModelTexturePool(BlockStateModelGenerator bsmg, TextureMap textureMap, Block block) {
        return (new ModBlockTexturePool(textureMap, bsmg, block));
    }

    public static ModBlockTexturePool registerModModelTexturePool(BlockStateModelGenerator bsmg, Block block) {
        return (new ModBlockTexturePool(TextureMap.all(block), bsmg, block));
    }


    public static void registerItemModel(Item item, BlockStateModelGenerator blockStateModelGenerator) {
        Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(item), blockStateModelGenerator.modelCollector);
    }


    public static void registerCustomButton(BlockStateModelGenerator blockStateModelGenerator, Block buttonBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.BUTTON_STB.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.BUTTON_STB_PRESSED.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createButtonBlockState(buttonBlock, identifier, identifier2));
        Identifier identifier3 = ModModels.BUTTON_STB_INVENTORY.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(buttonBlock, identifier3);
    }
    public static void registerCustomFenceGate(BlockStateModelGenerator blockStateModelGenerator, Block fenceGateBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.FENCE_GATE_STB_OPEN.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.FENCE_GATE_STB.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.FENCE_GATE_STB_WALL_OPEN.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.FENCE_GATE_STB_WALL.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock, identifier, identifier2, identifier3, identifier4, true));
    }
    public static void registerCustomFence(BlockStateModelGenerator blockStateModelGenerator, Block fenceBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.FENCE_STB_POST.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.FENCE_STB_SIDE.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, identifier, identifier2));
        Identifier identifier3 = ModModels.FENCE_STB_INVENTORY.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(fenceBlock, identifier3);
    }
    public static void registerCustomPressurePlate(BlockStateModelGenerator blockStateModelGenerator, Block pressurePlateBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.PRESSURE_PLATE_STB.upload(pressurePlateBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.PRESSURE_PLATE_STB_DOWN.upload(pressurePlateBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, identifier, identifier2));
    }
    public static void registerCustomSlab(BlockStateModelGenerator blockStateModelGenerator, Block slabBlock, Block fullBlock, TextureMap textureMap) {
        Identifier name = Registries.BLOCK.getId(fullBlock).withPrefixedPath("block/");
        Identifier identifier = ModModels.SLAB_STB.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.SLAB_STB_TOP.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSlabBlockState(slabBlock, identifier, identifier2, name));
        blockStateModelGenerator.registerParentedItemModel(slabBlock, identifier);
    }
    public static void registerCustomStairs(BlockStateModelGenerator blockStateModelGenerator, Block stairBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.STAIRS_STB.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.STAIRS_STB_INNER.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.STAIRS_STB_OUTER.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.STAIRS_STB_TOP.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.STAIRS_STB_INNER_TOP.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.STAIRS_STB_OUTER_TOP.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createStairsBlockState(stairBlock, identifier2, identifier, identifier3, identifier5, identifier4, identifier6));
        blockStateModelGenerator.registerParentedItemModel(stairBlock, identifier);
    }
    public static void registerCustomOrTrapdoor(BlockStateModelGenerator blockStateModelGenerator, Block trapdoorBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.TRAPDOOR_STB_BOTTOM.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.TRAPDOOR_STB_OPEN.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.TRAPDOOR_STB_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.TRAPDOOR_STB_OPEN_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createOrientableTrapdoorBlockState(trapdoorBlock, identifier3, identifier, identifier2, identifier4));
        blockStateModelGenerator.registerParentedItemModel(trapdoorBlock, identifier);
    }
    public static void registerCustomWall(BlockStateModelGenerator blockStateModelGenerator, Block wallBlock, TextureMap textureMap) {
        Identifier identifier = ModModels.WALL_STB_POST.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.WALL_STB_SIDE.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.WALL_STB_SIDE_TALL.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.WALL_STB_SIDE_SHORT.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.WALL_STB_SIDE_TALL_SHORT.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3, identifier4, identifier5));
        Identifier identifier6 = ModModels.WALL_STB_INVENTORY.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(wallBlock, identifier6);
    }
    public static void registerCustomDoor(BlockStateModelGenerator blockStateModelGenerator, Block doorBlock, Block topBlock, Block bottomBlock, String topSuffix, String bottomSuffix) {
        TextureMap textureMap = ModTextureMap.custom(doorBlock, topBlock, bottomBlock, "_top", topSuffix, bottomSuffix);
        TextureMap textureMap2 = ModTextureMap.custom(doorBlock, topBlock, bottomBlock, "_bottom", topSuffix, bottomSuffix);
        Identifier identifier = ModModels.DOOR_STB_BOTTOM_LEFT.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.DOOR_STB_BOTTOM_LEFT_OPEN.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.DOOR_STB_BOTTOM_RIGHT.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.DOOR_STB_BOTTOM_RIGHT_OPEN.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOOR_STB_TOP_LEFT.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOOR_STB_TOP_LEFT_OPEN.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier7 = ModModels.DOOR_STB_TOP_RIGHT.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier8 = ModModels.DOOR_STB_TOP_RIGHT_OPEN.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        ModBlockStateModelGenerator.registerItemModel(doorBlock.asItem(), blockStateModelGenerator);
        blockStateModelGenerator.blockStateCollector.accept(createDoorBlockState(doorBlock, identifier, identifier2, identifier3, identifier4, identifier5, identifier6, identifier7, identifier8));
    }
    public static void registerCustomDoor(BlockStateModelGenerator blockStateModelGenerator, Block doorBlock) {
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(doorBlock, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(doorBlock, "_top"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(doorBlock, "_top"));
        TextureMap textureMap2 = new TextureMap()
                .put(TextureKey.TOP, TextureMap.getSubId(doorBlock, "_bottom"))
                .put(TextureKey.SIDE, TextureMap.getSubId(doorBlock, "_bottom"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(doorBlock, "_bottom"));
        Identifier identifier = ModModels.DOOR_STB_BOTTOM_LEFT.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.DOOR_STB_BOTTOM_LEFT_OPEN.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.DOOR_STB_BOTTOM_RIGHT.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.DOOR_STB_BOTTOM_RIGHT_OPEN.upload(doorBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier5 = ModModels.DOOR_STB_TOP_LEFT.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier6 = ModModels.DOOR_STB_TOP_LEFT_OPEN.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier7 = ModModels.DOOR_STB_TOP_RIGHT.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier8 = ModModels.DOOR_STB_TOP_RIGHT_OPEN.upload(doorBlock, textureMap, blockStateModelGenerator.modelCollector);
        ModBlockStateModelGenerator.registerItemModel(doorBlock.asItem(), blockStateModelGenerator);
        blockStateModelGenerator.blockStateCollector.accept(createDoorBlockState(doorBlock, identifier, identifier2, identifier3, identifier4, identifier5, identifier6, identifier7, identifier8));
    }
    public static void registerTI0OrTrapdoor(BlockStateModelGenerator blockStateModelGenerator, Block trapdoorBlock) {
        TextureMap textureMap = TextureMap.all(trapdoorBlock);
        Identifier identifier = ModModels.TRAPDOOR_STB_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.TRAPDOOR_STB_BOTTOM.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.TRAPDOOR_STB_OPEN.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = ModModels.TRAPDOOR_STB_OPEN_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createOrientableTrapdoorBlockState(trapdoorBlock, identifier, identifier2, identifier3, identifier4));
        blockStateModelGenerator.registerParentedItemModel(trapdoorBlock, identifier2);
    }






    public static BlockStateSupplier createDoorBlockState(Block doorBlock, Identifier bottomLeftHingeClosedModelId, Identifier bottomLeftHingeOpenModelId, Identifier bottomRightHingeClosedModelId, Identifier bottomRightHingeOpenModelId,
                                                          Identifier topLeftHingeClosedModelId, Identifier topLeftHingeOpenModelId, Identifier topRightHingeClosedModelId, Identifier topRightHingeOpenModelId) {
        return VariantsBlockStateSupplier.create(doorBlock).coordinate(BlockStateModelGenerator.fillDoorVariantMap(BlockStateModelGenerator.fillDoorVariantMap(BlockStateVariantMap
                .create(Properties.HORIZONTAL_FACING, Properties.DOUBLE_BLOCK_HALF, Properties.DOOR_HINGE, Properties.OPEN),
                        DoubleBlockHalf.LOWER, bottomLeftHingeClosedModelId, bottomLeftHingeOpenModelId, bottomRightHingeClosedModelId, bottomRightHingeOpenModelId),
                        DoubleBlockHalf.UPPER, topLeftHingeClosedModelId, topLeftHingeOpenModelId, topRightHingeClosedModelId, topRightHingeOpenModelId));
    }

    public static BlockStateSupplier createButtonBlockState(Block buttonBlock, Identifier regularModelId, Identifier pressedModelId) {
        return VariantsBlockStateSupplier.create(buttonBlock).coordinate(BlockStateVariantMap.create(Properties.POWERED).register(false, BlockStateVariant.create().put(VariantSettings.MODEL, regularModelId))
                .register(true, BlockStateVariant.create().put(VariantSettings.MODEL, pressedModelId))).coordinate(BlockStateVariantMap.create(Properties.BLOCK_FACE, Properties.HORIZONTAL_FACING)
                .register(BlockFace.FLOOR, Direction.EAST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .register(BlockFace.FLOOR, Direction.WEST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .register(BlockFace.FLOOR, Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .register(BlockFace.FLOOR, Direction.NORTH, BlockStateVariant.create())
                .register(BlockFace.WALL, Direction.EAST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(BlockFace.WALL, Direction.WEST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(BlockFace.WALL, Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(BlockFace.WALL, Direction.NORTH, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(BlockFace.CEILING, Direction.EAST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.X, VariantSettings.Rotation.R180))
                .register(BlockFace.CEILING, Direction.WEST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.X, VariantSettings.Rotation.R180))
                .register(BlockFace.CEILING, Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R180))
                .register(BlockFace.CEILING, Direction.NORTH, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.X, VariantSettings.Rotation.R180)));
    }

    public static BlockStateSupplier createSlabBlockState(Block slabBlock, Identifier bottomModelId, Identifier topModelId, Identifier fullModelId) {
        return VariantsBlockStateSupplier.create(slabBlock).coordinate(BlockStateVariantMap.create(Properties.SLAB_TYPE)
                .register(SlabType.BOTTOM, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId))
                .register(SlabType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId))
                .register(SlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullModelId)));
    }

    public static BlockStateSupplier createStairsBlockState(Block stairsBlock, Identifier innerModelId, Identifier regularModelId, Identifier outerModelId,
                                                            Identifier topInnerModelId, Identifier topRegularModelId, Identifier topOuterModelId) {
        return VariantsBlockStateSupplier.create(stairsBlock).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.STAIR_SHAPE)
                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, regularModelId))
                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, regularModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, regularModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, regularModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId))
                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId))
                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, outerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId))
                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId))
                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, innerModelId)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topRegularModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topRegularModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topRegularModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topRegularModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, topOuterModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create()
                        .put(VariantSettings.MODEL, topOuterModelId).put(VariantSettings.X, VariantSettings.Rotation.R180)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, topInnerModelId)
                        .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create()
                        .put(VariantSettings.MODEL, topInnerModelId).put(VariantSettings.X, VariantSettings.Rotation.R180)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true)));

    }

    public static BlockStateSupplier createOrientableTrapdoorBlockState(Block trapdoorBlock, Identifier topModelId, Identifier bottomModelId, Identifier openModelId, Identifier topOpenModelId) {
        return VariantsBlockStateSupplier.create(trapdoorBlock).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.OPEN)
                .register(Direction.NORTH, BlockHalf.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .register(Direction.EAST, BlockHalf.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, BlockHalf.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, BlockHalf.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId))
                .register(Direction.SOUTH, BlockHalf.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .register(Direction.EAST, BlockHalf.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, BlockHalf.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, BlockHalf.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, openModelId))
                .register(Direction.SOUTH, BlockHalf.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, openModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .register(Direction.EAST, BlockHalf.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, openModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .register(Direction.WEST, BlockHalf.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, openModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .register(Direction.NORTH, BlockHalf.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, topOpenModelId).put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .register(Direction.SOUTH, BlockHalf.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, topOpenModelId).put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R0))
                .register(Direction.EAST, BlockHalf.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, topOpenModelId).put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .register(Direction.WEST, BlockHalf.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, topOpenModelId).put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90)));
    }

    public static BlockStateSupplier createWallBlockState(Block wallBlock, Identifier postModelId, Identifier lowSideModelId, Identifier tallSideModelId, Identifier lowShortSideModelId, Identifier tallShortSideModelId) {
        return MultipartBlockStateSupplier.create(wallBlock).with(When.create().set(Properties.UP, true), BlockStateVariant.create().put(VariantSettings.MODEL, postModelId))
                .with(When.create().set(Properties.UP, true).set(Properties.NORTH_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowShortSideModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.EAST_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowShortSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.SOUTH_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowShortSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.WEST_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowShortSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.NORTH_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallShortSideModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.EAST_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallShortSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.SOUTH_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallShortSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, true).set(Properties.WEST_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallShortSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.NORTH_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowSideModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.EAST_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.SOUTH_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.WEST_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, lowSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.NORTH_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallSideModelId).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.EAST_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.SOUTH_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))
                .with(When.create().set(Properties.UP, false).set(Properties.WEST_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, tallSideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true));
    }
}

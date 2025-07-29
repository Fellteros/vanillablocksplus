package net.fellter.vanillablocksplus.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.nimbusds.jose.util.ArrayUtils;
import com.nimbusds.oauth2.sdk.util.ListUtils;

import net.minecraft.block.Block;
import net.minecraft.block.enums.*;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.client.render.model.json.MultipartModelConditionBuilder;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlockStateModelGenerator extends BlockStateModelGenerator {

	public static WeightedVariant varOf(Identifier id) {
		return BlockStateModelGenerator.createWeightedVariant(id);
	}


	public ModBlockStateModelGenerator(Consumer<BlockModelDefinitionCreator> blockStateCollector, ItemModelOutput itemModelOutput, BiConsumer<Identifier, ModelSupplier> modelCollector) {
		super(blockStateCollector, itemModelOutput, modelCollector);
	}

	public static class ModBlockTexturePool {
		private final TextureMap textureMap;
		private final BlockStateModelGenerator bsmg;
		private final Identifier baseModelId;
		private TintSource tintSource;

		public ModBlockTexturePool(TextureMap textureMap, BlockStateModelGenerator bsmg, Block block) {
			this.textureMap = textureMap;
			this.bsmg = bsmg;
			this.baseModelId = TextureMap.getId(block);
			this.tintSource = null;
		}

		private void registerItemModel(Block block, Identifier model) {
			if (tintSource == null) {
				bsmg.registerParentedItemModel(block, model);
			} else {
				bsmg.registerTintedItemModel(block, model, tintSource);
			}
		}

		public ModBlockTexturePool tintSource(TintSource tintSource) {
			this.tintSource = tintSource;
			return this;
		}

		public ModBlockTexturePool button(Block buttonBlock) {
			Identifier identifier = ModModels.BUTTON_STB.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = ModModels.BUTTON_STB_PRESSED.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(createButtonBlockState(buttonBlock, varOf(identifier), varOf(identifier2)));
			Identifier identifier3 = ModModels.BUTTON_STB_INVENTORY.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
			registerItemModel(buttonBlock, identifier3);
			return this;
		}
		public ModBlockTexturePool wall(Block wallBlock, Boolean... uvlock) {
			Boolean uv_lock;
			List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
			if (uvlock.length == 0) {
				uv_lock = true;
			} else if (bools.get(0) != null) {
				uv_lock = bools.get(0);
			} else {
				uv_lock = true;
			}

			Identifier identifier = ModModels.WALL_STB_POST.upload(wallBlock, textureMap, bsmg.modelCollector);
			Identifier identifier2 = ModModels.WALL_STB_SIDE.upload(wallBlock, textureMap, bsmg.modelCollector);
			Identifier identifier3 = ModModels.WALL_STB_SIDE_TALL.upload(wallBlock, textureMap, bsmg.modelCollector);
			Identifier identifier4 = ModModels.WALL_STB_SIDE_SHORT.upload(wallBlock, textureMap, bsmg.modelCollector);
			Identifier identifier5 = ModModels.WALL_STB_SIDE_TALL_SHORT.upload(wallBlock, textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(createWallBlockState(wallBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), uv_lock));
			Identifier identifier6 = ModModels.WALL_STB_INVENTORY.upload(wallBlock, textureMap, bsmg.modelCollector);
			registerItemModel(wallBlock, identifier6);
			return this;
		}
		public ModBlockTexturePool fence(Block fenceBlock) {
			Identifier identifier = ModModels.FENCE_STB_POST.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = ModModels.FENCE_STB_SIDE.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, varOf(identifier), varOf(identifier2)));
			Identifier identifier3 = ModModels.FENCE_STB_INVENTORY.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
			registerItemModel(fenceBlock, identifier3);
			return this;
		}
		public ModBlockTexturePool fenceGate(Block fenceGateBlock) {
			Identifier identifier = ModModels.FENCE_GATE_STB_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = ModModels.FENCE_GATE_STB.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier3 = ModModels.FENCE_GATE_STB_WALL_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier4 = ModModels.FENCE_GATE_STB_WALL.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), true));
			registerItemModel(fenceGateBlock, identifier2);
			return this;
		}
		public ModBlockTexturePool pressurePlate(Block pressurePlateBlock) {
			Identifier identifier = ModModels.PRESSURE_PLATE_STB.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = ModModels.PRESSURE_PLATE_STB_DOWN.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, varOf(identifier), varOf(identifier2)));
			registerItemModel(pressurePlateBlock, identifier);
			return this;
		}
		public ModBlockTexturePool slab(Block slabBlock) {
			if (this.baseModelId == null) {
				throw new IllegalStateException("Full block not generated yet");
			} else {
				Identifier identifier = ModModels.SLAB_STB.upload(slabBlock, this.textureMap, bsmg.modelCollector);
				Identifier identifier2 = ModModels.SLAB_STB_TOP.upload(slabBlock, textureMap, bsmg.modelCollector);
				bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, varOf(identifier), varOf(identifier2), varOf(this.baseModelId)));
				registerItemModel(slabBlock, identifier);
				return this;
			}
		}
		public ModBlockTexturePool stairs(Block stairBlock, Boolean... uvlock) {
			Boolean uv_lock;
			List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
			if (uvlock.length == 0) {
				uv_lock = true;
			} else if (bools.get(0) != null) {
				uv_lock = bools.get(0);
			} else {
				uv_lock = true;
			}
			Identifier identifier = ModModels.STAIRS_STB.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier2 = ModModels.STAIRS_STB_INNER.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier3 = ModModels.STAIRS_STB_OUTER.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier4 = ModModels.STAIRS_STB_TOP.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier5 = ModModels.STAIRS_STB_INNER_TOP.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier6 = ModModels.STAIRS_STB_OUTER_TOP.upload(stairBlock, textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(ModBlockStateModelGenerator.createStairsBlockState(stairBlock, varOf(identifier2), varOf(identifier), varOf(identifier3), varOf(identifier5), varOf(identifier4), varOf(identifier6), uv_lock));
			registerItemModel(stairBlock, identifier);
			return this;
		}
		public ModBlockTexturePool buttonAll(Block buttonBlock) {
			Identifier identifier = Models.BUTTON.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = Models.BUTTON_PRESSED.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(buttonBlock, varOf(identifier), varOf(identifier2)));
			Identifier identifier3 = Models.BUTTON_INVENTORY.upload(buttonBlock, this.textureMap, bsmg.modelCollector);
			registerItemModel(buttonBlock, identifier3);
			return this;
		}
		public ModBlockTexturePool wallAll(Block wallBlock) {
			Identifier identifier = Models.TEMPLATE_WALL_POST.upload(wallBlock, textureMap, bsmg.modelCollector);
			Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textureMap, bsmg.modelCollector);
			Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallBlock, varOf(identifier), varOf(identifier2), varOf(identifier3)));
			Identifier identifier4 = Models.WALL_INVENTORY.upload(wallBlock, textureMap, bsmg.modelCollector);
			registerItemModel(wallBlock, identifier4);
			return this;
		}
		public ModBlockTexturePool fenceAll(Block fenceBlock) {
			Identifier identifier = Models.FENCE_POST.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = Models.FENCE_SIDE.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, varOf(identifier), varOf(identifier2)));
			Identifier identifier3 = Models.FENCE_INVENTORY.upload(fenceBlock, this.textureMap, bsmg.modelCollector);
			registerItemModel(fenceBlock, identifier3);
			return this;
		}
		public ModBlockTexturePool fenceGateAll(Block fenceGateBlock, Boolean... uvlock) {
			Boolean uv_lock;
			List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
			if (uvlock.length == 0) {
				uv_lock = true;
			} else if (bools.get(0) != null) {
				uv_lock = bools.get(0);
			} else {
				uv_lock = true;
			}
			Identifier identifier = Models.TEMPLATE_FENCE_GATE_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = Models.TEMPLATE_FENCE_GATE.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier3 = Models.TEMPLATE_FENCE_GATE_WALL_OPEN.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier4 = Models.TEMPLATE_FENCE_GATE_WALL.upload(fenceGateBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), uv_lock));
			registerItemModel(fenceGateBlock, identifier2);
			return this;
		}
		public ModBlockTexturePool pressurePlateAll(Block pressurePlateBlock) {
			Identifier identifier = Models.PRESSURE_PLATE_UP.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
			Identifier identifier2 = Models.PRESSURE_PLATE_DOWN.upload(pressurePlateBlock, this.textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, varOf(identifier), varOf(identifier2)));
			registerItemModel(pressurePlateBlock, identifier);
			return this;
		}
		public ModBlockTexturePool slabAll(Block slabBlock) {
			if (this.baseModelId == null) {
				throw new IllegalStateException("Full block not generated yet");
			} else {
				Identifier identifier = Models.SLAB.upload(slabBlock, this.textureMap, bsmg.modelCollector);
				Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap, bsmg.modelCollector);
				bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, varOf(identifier), varOf(identifier2), varOf(this.baseModelId)));
				registerItemModel(slabBlock, identifier);
				return this;
			}
		}
		public ModBlockTexturePool stairsAll(Block stairBlock, Boolean... uvlock) {
			Boolean uv_lock;
			List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
			if (uvlock.length == 0) {
				uv_lock = true;
			} else if (bools.get(0) != null) {
				uv_lock = bools.get(0);
			} else {
				uv_lock = true;
			}
			Identifier identifier = Models.STAIRS.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier2 = Models.INNER_STAIRS.upload(stairBlock, textureMap, bsmg.modelCollector);
			Identifier identifier3 = Models.OUTER_STAIRS.upload(stairBlock, textureMap, bsmg.modelCollector);
			bsmg.blockStateCollector.accept(createStairsBlockState(stairBlock, varOf(identifier2), varOf(identifier), varOf(identifier3), uv_lock));
			registerItemModel(stairBlock, identifier);
			return this;
		}
	}




	public static ModBlockTexturePool registerModModelTexturePool(BlockStateModelGenerator bsmg, TextureMap textureMap, Block block) {
		return (new ModBlockTexturePool(textureMap, bsmg, block));
	}

	public static ModBlockTexturePool registerModModelTexturePool(BlockStateModelGenerator bsmg, Block textureBlock) {
		return (new ModBlockTexturePool(TextureMap.all(textureBlock), bsmg, textureBlock));
	}

	public static ModBlockTexturePool registerModModelTexturePool(BlockStateModelGenerator bsmg, Identifier textureMapID, Block textureBlock) {
		return (new ModBlockTexturePool(TextureMap.all(textureMapID), bsmg, textureBlock));
	}



	public static void registerCustomButton(BlockStateModelGenerator blockStateModelGenerator, Block buttonBlock, TextureMap textureMap) {
		Identifier identifier = ModModels.BUTTON_STB.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.BUTTON_STB_PRESSED.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createButtonBlockState(buttonBlock, varOf(identifier), varOf(identifier2)));
		Identifier identifier3 = ModModels.BUTTON_STB_INVENTORY.upload(buttonBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.registerParentedItemModel(buttonBlock, identifier3);
	}
	public static void registerCustomFenceGate(BlockStateModelGenerator blockStateModelGenerator, Block fenceGateBlock, TextureMap textureMap, Boolean... uvlock) {
		Boolean uv_lock;
		List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
		if (uvlock.length == 0) {
			uv_lock = true;
		} else if (bools.get(0) != null) {
			uv_lock = bools.get(0);
		} else {
			uv_lock = true;
		}
		Identifier identifier = ModModels.FENCE_GATE_STB_OPEN.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.FENCE_GATE_STB.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.FENCE_GATE_STB_WALL_OPEN.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier4 = ModModels.FENCE_GATE_STB_WALL.upload(fenceGateBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), uv_lock));
	}
	public static void registerCustomFence(BlockStateModelGenerator blockStateModelGenerator, Block fenceBlock, TextureMap textureMap) {
		Identifier identifier = ModModels.FENCE_STB_POST.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.FENCE_STB_SIDE.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, varOf(identifier), varOf(identifier2)));
		Identifier identifier3 = ModModels.FENCE_STB_INVENTORY.upload(fenceBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.registerParentedItemModel(fenceBlock, identifier3);
	}
	public static void registerCustomPressurePlate(BlockStateModelGenerator blockStateModelGenerator, Block pressurePlateBlock, TextureMap textureMap) {
		Identifier identifier = ModModels.PRESSURE_PLATE_STB.upload(pressurePlateBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.PRESSURE_PLATE_STB_DOWN.upload(pressurePlateBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock, varOf(identifier), varOf(identifier2)));
	}
	public static void registerCustomSlab(BlockStateModelGenerator blockStateModelGenerator, Block slabBlock, Block fullBlock, TextureMap textureMap) {
		Identifier name = Registries.BLOCK.getId(fullBlock).withPrefixedPath("block/");
		Identifier identifier = ModModels.SLAB_STB.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.SLAB_STB_TOP.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(createSlabBlockState(slabBlock, varOf(identifier), varOf(identifier2), varOf(name)));
		blockStateModelGenerator.registerParentedItemModel(slabBlock, identifier);
	}
	public static void registerCustomStairs(BlockStateModelGenerator blockStateModelGenerator, Block stairBlock, TextureMap textureMap, Boolean... uvlock) {
		Boolean uv_lock;
		List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
		if (uvlock.length == 0) {
			uv_lock = true;
		} else if (bools.get(0) != null) {
			uv_lock = bools.get(0);
		} else {
			uv_lock = true;
		}
		Identifier identifier = ModModels.STAIRS_STB.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.STAIRS_STB_INNER.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.STAIRS_STB_OUTER.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier4 = ModModels.STAIRS_STB_TOP.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier5 = ModModels.STAIRS_STB_INNER_TOP.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier6 = ModModels.STAIRS_STB_OUTER_TOP.upload(stairBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createStairsBlockState(stairBlock, varOf(identifier2), varOf(identifier), varOf(identifier3), varOf(identifier5), varOf(identifier4), varOf(identifier6), uv_lock));
		blockStateModelGenerator.registerParentedItemModel(stairBlock, identifier);
	}
	public static void registerCustomWall(BlockStateModelGenerator blockStateModelGenerator, Block wallBlock, TextureMap textureMap, Boolean... uvlock) {
		Boolean uv_lock;
		List<Boolean> bools = new ArrayList<>(Arrays.asList(uvlock));
		if (uvlock.length == 0) {
			uv_lock = true;
		} else if (bools.get(0) != null) {
			uv_lock = bools.get(0);
		} else {
			uv_lock = true;
		}
		Identifier identifier = ModModels.WALL_STB_POST.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.WALL_STB_SIDE.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.WALL_STB_SIDE_TALL.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier4 = ModModels.WALL_STB_SIDE_SHORT.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier5 = ModModels.WALL_STB_SIDE_TALL_SHORT.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createWallBlockState(wallBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), uv_lock));
		Identifier identifier6 = ModModels.WALL_STB_INVENTORY.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.registerParentedItemModel(wallBlock, identifier6);
	}
	public static void registerCustomDoor(BlockStateModelGenerator bsmg, Block doorBlock, Block topBlock, Block bottomBlock, String topSuffix, String bottomSuffix) {
		TextureMap textureMap = ModTextureMap.custom(doorBlock, topBlock, bottomBlock, "_top", topSuffix, bottomSuffix);
		TextureMap textureMap2 = ModTextureMap.custom(doorBlock, topBlock, bottomBlock, "_bottom", topSuffix, bottomSuffix);
		Identifier identifier = ModModels.DOOR_STB_BOTTOM_LEFT.upload(doorBlock, textureMap2, bsmg.modelCollector);
		Identifier identifier2 = ModModels.DOOR_STB_BOTTOM_LEFT_OPEN.upload(doorBlock, textureMap2, bsmg.modelCollector);
		Identifier identifier3 = ModModels.DOOR_STB_BOTTOM_RIGHT.upload(doorBlock, textureMap2, bsmg.modelCollector);
		Identifier identifier4 = ModModels.DOOR_STB_BOTTOM_RIGHT_OPEN.upload(doorBlock, textureMap2, bsmg.modelCollector);
		Identifier identifier5 = ModModels.DOOR_STB_TOP_LEFT.upload(doorBlock, textureMap, bsmg.modelCollector);
		Identifier identifier6 = ModModels.DOOR_STB_TOP_LEFT_OPEN.upload(doorBlock, textureMap, bsmg.modelCollector);
		Identifier identifier7 = ModModels.DOOR_STB_TOP_RIGHT.upload(doorBlock, textureMap, bsmg.modelCollector);
		Identifier identifier8 = ModModels.DOOR_STB_TOP_RIGHT_OPEN.upload(doorBlock, textureMap, bsmg.modelCollector);
		bsmg.registerItemModel(doorBlock.asItem());
		bsmg.blockStateCollector.accept(createDoorBlockState(doorBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), varOf(identifier6), varOf(identifier7), varOf(identifier8)));
	}
	public static void registerCustomOrTrapdoor(BlockStateModelGenerator blockStateModelGenerator, Block trapdoorBlock, TintSource tintSource) {
		TextureMap textureMap = TextureMap.all(trapdoorBlock);
		Identifier identifier = ModModels.TRAPDOOR_STB_BOTTOM.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.TRAPDOOR_STB_OPEN.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.TRAPDOOR_STB_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier4 = ModModels.TRAPDOOR_STB_OPEN_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createOrientableTrapdoorBlockState(trapdoorBlock, varOf(identifier3), varOf(identifier), varOf(identifier2), varOf(identifier4)));
		blockStateModelGenerator.registerTintedItemModel(trapdoorBlock, identifier, tintSource);
	}
	public static void registerCustomOrTrapdoor(BlockStateModelGenerator blockStateModelGenerator, Block trapdoorBlock, TextureMap textureMap) {
		Identifier identifier = ModModels.TRAPDOOR_STB_BOTTOM.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.TRAPDOOR_STB_OPEN.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.TRAPDOOR_STB_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		Identifier identifier4 = ModModels.TRAPDOOR_STB_OPEN_TOP.upload(trapdoorBlock, textureMap, blockStateModelGenerator.modelCollector);
		blockStateModelGenerator.blockStateCollector.accept(ModBlockStateModelGenerator.createOrientableTrapdoorBlockState(trapdoorBlock, varOf(identifier3), varOf(identifier), varOf(identifier2), varOf(identifier4)));
		blockStateModelGenerator.registerParentedItemModel(trapdoorBlock, identifier);
	}

	public static void registerCustomDoor(BlockStateModelGenerator blockStateModelGenerator, Block doorBlock, TintSource tintSource) {
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
		Identifier itemID = blockStateModelGenerator.uploadItemModel(doorBlock.asItem());
		blockStateModelGenerator.registerTintedItemModel(doorBlock, itemID, tintSource);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createDoorBlockState(doorBlock, varOf(identifier), varOf(identifier2), varOf(identifier3), varOf(identifier4), varOf(identifier5), varOf(identifier6), varOf(identifier7), varOf(identifier8)));
	}




	public static BlockModelDefinitionCreator createStairsBlockState(Block stairsBlock, WeightedVariant innerModelId, WeightedVariant regularModelId, WeightedVariant outerModelId,
																	 WeightedVariant topInnerModelId, WeightedVariant topRegularModelId, WeightedVariant topOuterModelId, boolean uvlock) {
		return VariantsBlockModelDefinitionCreator.of(stairsBlock).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.STAIR_SHAPE)
				.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.STRAIGHT, regularModelId)
				.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.STRAIGHT, regularModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, regularModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, regularModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModelId)
				.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModelId)
				.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModelId)
				.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModelId)
				.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.TOP, StairShape.STRAIGHT, topRegularModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.TOP, StairShape.STRAIGHT, topRegularModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.TOP, StairShape.STRAIGHT, topRegularModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.TOP, StairShape.STRAIGHT, topRegularModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_RIGHT, topOuterModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_RIGHT, topOuterModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, topOuterModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, topOuterModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_LEFT, topOuterModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_LEFT, topOuterModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_LEFT, topOuterModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_LEFT, topOuterModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_RIGHT, topInnerModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_RIGHT, topInnerModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_RIGHT, topInnerModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_RIGHT, topInnerModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_LEFT, topInnerModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_LEFT, topInnerModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_LEFT, topInnerModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_LEFT, topInnerModelId.apply(ROTATE_Y_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock))));

	}

	public static BlockModelDefinitionCreator createStairsBlockState(
			Block stairsBlock, WeightedVariant innerModel, WeightedVariant straightModel, WeightedVariant outerModel, boolean uvlock
	) {
		return VariantsBlockModelDefinitionCreator.of(stairsBlock)
				.with(
						BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.STAIR_SHAPE)
								.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.STRAIGHT, straightModel)
								.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.STRAIGHT, straightModel.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, straightModel.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, straightModel.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModel)
								.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModel)
								.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModel)
								.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModel.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModel.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModel)
								.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerModel.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.TOP, StairShape.STRAIGHT, straightModel.apply(ROTATE_X_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.TOP, StairShape.STRAIGHT, straightModel.apply(ROTATE_X_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.TOP, StairShape.STRAIGHT, straightModel.apply(ROTATE_X_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.TOP, StairShape.STRAIGHT, straightModel.apply(ROTATE_X_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_X_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_X_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_X_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, outerModel.apply(ROTATE_X_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_X_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_X_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_X_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_LEFT, outerModel.apply(ROTATE_X_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_X_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_X_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_X_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_RIGHT, innerModel.apply(ROTATE_X_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_LEFT, innerModel.apply(ROTATE_X_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_LEFT, innerModel.apply(ROTATE_X_180).apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_LEFT, innerModel.apply(ROTATE_X_180).apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
								.register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_LEFT, innerModel.apply(ROTATE_X_180).apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				);
	}

	public static BlockModelDefinitionCreator createOrientableTrapdoorBlockState(Block trapdoorBlock, WeightedVariant topModelId, WeightedVariant bottomModelId, WeightedVariant openModelId, WeightedVariant topOpenModelId) {
		return VariantsBlockModelDefinitionCreator.of(trapdoorBlock).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.OPEN)
				.register(Direction.NORTH, BlockHalf.BOTTOM, false, bottomModelId)
				.register(Direction.SOUTH, BlockHalf.BOTTOM, false, bottomModelId.apply(ROTATE_Y_180))
				.register(Direction.EAST, BlockHalf.BOTTOM, false, bottomModelId.apply(ROTATE_Y_90))
				.register(Direction.WEST, BlockHalf.BOTTOM, false, bottomModelId.apply(ROTATE_Y_270))
				.register(Direction.NORTH, BlockHalf.TOP, false, topModelId)
				.register(Direction.SOUTH, BlockHalf.TOP, false, topModelId.apply(ROTATE_Y_180))
				.register(Direction.EAST, BlockHalf.TOP, false, topModelId.apply(ROTATE_Y_90))
				.register(Direction.WEST, BlockHalf.TOP, false, topModelId.apply(ROTATE_Y_270))
				.register(Direction.NORTH, BlockHalf.BOTTOM, true, openModelId)
				.register(Direction.SOUTH, BlockHalf.BOTTOM, true, openModelId.apply(ROTATE_Y_180))
				.register(Direction.EAST, BlockHalf.BOTTOM, true, openModelId.apply(ROTATE_Y_90))
				.register(Direction.WEST, BlockHalf.BOTTOM, true, openModelId.apply(ROTATE_Y_270))
				.register(Direction.NORTH, BlockHalf.TOP, true, topOpenModelId.apply(ROTATE_X_180).apply(ROTATE_Y_180))
				.register(Direction.SOUTH, BlockHalf.TOP, true, topOpenModelId.apply(ROTATE_X_180))
				.register(Direction.EAST, BlockHalf.TOP, true, topOpenModelId.apply(ROTATE_X_180).apply(ROTATE_Y_270))
				.register(Direction.WEST, BlockHalf.TOP, true, topOpenModelId.apply(ROTATE_X_180).apply(ROTATE_Y_90)));
	}

	public static BlockModelDefinitionCreator createWallBlockState(Block wallBlock, WeightedVariant postModelId, WeightedVariant lowSideModelId, WeightedVariant tallSideModelId, WeightedVariant lowShortSideModelId, WeightedVariant tallShortSideModelId, boolean uvlock) {
		return MultipartBlockModelDefinitionCreator.create(wallBlock).with(new MultipartModelConditionBuilder().put(Properties.UP, true), postModelId)
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.NORTH_WALL_SHAPE, WallShape.LOW), lowShortSideModelId.apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.EAST_WALL_SHAPE, WallShape.LOW), lowShortSideModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.SOUTH_WALL_SHAPE, WallShape.LOW), lowShortSideModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.WEST_WALL_SHAPE, WallShape.LOW), lowShortSideModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.NORTH_WALL_SHAPE, WallShape.TALL), tallShortSideModelId.apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.EAST_WALL_SHAPE, WallShape.TALL), tallShortSideModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.SOUTH_WALL_SHAPE, WallShape.TALL), tallShortSideModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, true).put(Properties.WEST_WALL_SHAPE, WallShape.TALL), tallShortSideModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.NORTH_WALL_SHAPE, WallShape.LOW), lowSideModelId.apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.EAST_WALL_SHAPE, WallShape.LOW), lowSideModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.SOUTH_WALL_SHAPE, WallShape.LOW), lowSideModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.WEST_WALL_SHAPE, WallShape.LOW), lowSideModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.NORTH_WALL_SHAPE, WallShape.TALL), tallSideModelId.apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.EAST_WALL_SHAPE, WallShape.TALL), tallSideModelId.apply(ROTATE_Y_90).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.SOUTH_WALL_SHAPE, WallShape.TALL), tallSideModelId.apply(ROTATE_Y_180).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)))
				.with(new MultipartModelConditionBuilder().put(Properties.UP, false).put(Properties.WEST_WALL_SHAPE, WallShape.TALL), tallSideModelId.apply(ROTATE_Y_270).apply(ModelVariantOperator.UV_LOCK.withValue(uvlock)));
	}
}

package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fellter.vanillablocksplus.block.ModBlocks;
import net.fellter.vanillablocksplus.block.ModBlocks2;
import net.minecraft.block.Oxidizable;

public class OxidizableBlockRegistry implements Oxidizable {


    public static void registerOxidizables() {
        //copper
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.EXPOSED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WEATHERED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.OXIDIZED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.EXPOSED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.OXIDIZED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.EXPOSED_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WEATHERED_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.OXIDIZED_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_FENCE, ModBlocks.EXPOSED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE, ModBlocks.WEATHERED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE, ModBlocks.OXIDIZED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.EXPOSED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WEATHERED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.OXIDIZED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.OXIDIZED_COPPER_BUTTON);
        
        //cut copper
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.EXPOSED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WEATHERED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.OXIDIZED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_FENCE, ModBlocks.EXPOSED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE, ModBlocks.WEATHERED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE, ModBlocks.OXIDIZED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_FENCE_GATE, ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_DOOR, ModBlocks.EXPOSED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_DOOR, ModBlocks.WEATHERED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_DOOR, ModBlocks.OXIDIZED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_TRAPDOOR, ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_PRESSURE_PLATE, ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_BUTTON, ModBlocks.EXPOSED_CUT_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_BUTTON, ModBlocks.WEATHERED_CUT_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_BUTTON, ModBlocks.OXIDIZED_CUT_COPPER_BUTTON);
        
        //chiseled_copper
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_STAIRS, ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS, ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS, ModBlocks2.OXIDIZED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_SLAB, ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB, ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB, ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_WALL, ModBlocks2.EXPOSED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_WALL, ModBlocks2.WEATHERED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_WALL, ModBlocks2.OXIDIZED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE, ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE, ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE, ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE_GATE, ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_DOOR, ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR, ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR, ModBlocks2.OXIDIZED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_TRAPDOOR, ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.OXIDIZED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.CHISELED_COPPER_BUTTON, ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON, ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON, ModBlocks2.OXIDIZED_CHISELED_COPPER_BUTTON);
        
        //copper_grate
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_STAIRS, ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS, ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS, ModBlocks2.OXIDIZED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_SLAB, ModBlocks2.EXPOSED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_SLAB, ModBlocks2.WEATHERED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_SLAB, ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_WALL, ModBlocks2.EXPOSED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_WALL, ModBlocks2.WEATHERED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_WALL, ModBlocks2.OXIDIZED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_FENCE, ModBlocks2.EXPOSED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE, ModBlocks2.WEATHERED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE, ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_FENCE_GATE, ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE, ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_DOOR, ModBlocks2.EXPOSED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_DOOR, ModBlocks2.WEATHERED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_DOOR, ModBlocks2.OXIDIZED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_TRAPDOOR, ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR, ModBlocks2.OXIDIZED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.COPPER_GRATE_BUTTON, ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON, ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON, ModBlocks2.OXIDIZED_COPPER_GRATE_BUTTON);

        //wax copper
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.WAXED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.WAXED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE, ModBlocks.WAXED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.WAXED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.WAXED_COPPER_BUTTON);
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WAXED_EXPOSED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.WAXED_WEATHERED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.WAXED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_FENCE, ModBlocks.WAXED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_DOOR, ModBlocks.WAXED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_BUTTON, ModBlocks.WAXED_CUT_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_DOOR, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_DOOR, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON);

        //wax copper
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_DOOR, ModBlocks2.WAXED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_SLAB, ModBlocks2.WAXED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_WALL, ModBlocks2.WAXED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE, ModBlocks2.WAXED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_CHISELED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_DOOR, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_SLAB, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_WALL, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_EXPOSED_CHISELED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_DOOR, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_SLAB, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_WALL, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_WEATHERED_CHISELED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_STAIRS, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_DOOR, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_TRAPDOOR, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_SLAB, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_WALL, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_FENCE_GATE, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_CHISELED_COPPER_BUTTON, ModBlocks2.WAXED_OXIDIZED_CHISELED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_STAIRS, ModBlocks2.WAXED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_DOOR, ModBlocks2.WAXED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_SLAB, ModBlocks2.WAXED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_WALL, ModBlocks2.WAXED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_FENCE, ModBlocks2.WAXED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.COPPER_GRATE_BUTTON, ModBlocks2.WAXED_COPPER_GRATE_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_STAIRS, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_DOOR, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_SLAB, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_WALL, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.EXPOSED_COPPER_GRATE_BUTTON, ModBlocks2.WAXED_EXPOSED_COPPER_GRATE_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_STAIRS, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_DOOR, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_SLAB, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_WALL, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.WEATHERED_COPPER_GRATE_BUTTON, ModBlocks2.WAXED_WEATHERED_COPPER_GRATE_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_STAIRS, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_DOOR, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_TRAPDOOR, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_SLAB, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_WALL, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_FENCE_GATE, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_PRESSURE_PLATE, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks2.OXIDIZED_COPPER_GRATE_BUTTON, ModBlocks2.WAXED_OXIDIZED_COPPER_GRATE_BUTTON);

        
        
        
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return null;
    }
}

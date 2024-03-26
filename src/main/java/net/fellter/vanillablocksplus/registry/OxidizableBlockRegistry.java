package net.fellter.vanillablocksplus.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fellter.vanillablocksplus.block.ModBlocks;
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
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_DOOR, ModBlocks.EXPOSED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_DOOR, ModBlocks.WEATHERED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_DOOR, ModBlocks.OXIDIZED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_TRAPDOOR, ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_TRAPDOOR, ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_TRAPDOOR, ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
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

        //wax copper
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.WAXED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.WAXED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE, ModBlocks.WAXED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.WAXED_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_DOOR, ModBlocks.WAXED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_TRAPDOOR, ModBlocks.WAXED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.WAXED_COPPER_BUTTON);
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WAXED_EXPOSED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_DOOR, ModBlocks.WAXED_EXPOSED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_TRAPDOOR, ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.WAXED_WEATHERED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_DOOR, ModBlocks.WAXED_WEATHERED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_TRAPDOOR, ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_DOOR, ModBlocks.WAXED_OXIDIZED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_TRAPDOOR, ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.WAXED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_FENCE, ModBlocks.WAXED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_CUT_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_DOOR, ModBlocks.WAXED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_BUTTON, ModBlocks.WAXED_CUT_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_DOOR, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_EXPOSED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_DOOR, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_WEATHERED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_FENCE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_FENCE_GATE);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_DOOR, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_TRAPDOOR, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_BUTTON);

        
        
        
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return null;
    }
}

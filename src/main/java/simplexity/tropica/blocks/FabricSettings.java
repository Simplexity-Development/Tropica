package simplexity.tropica.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class FabricSettings {
    
    private static final BlockState defaultStairState = Blocks.OAK_STAIRS.getDefaultState();
    private static final FabricItemSettings fullStackItem = new FabricItemSettings().maxCount(64);
    private static final FabricItemSettings quarterStackItem = new FabricItemSettings().maxCount(16);
    
    private static final FabricBlockSettings logSettings = FabricBlockSettings.copyOf(Blocks.OAK_LOG);
    private static final FabricBlockSettings woodSettings = FabricBlockSettings.copyOf(Blocks.OAK_WOOD);
    private static final FabricBlockSettings strippedLogSettings = FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG);
    private static final FabricBlockSettings strippedWoodSettings = FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD);
    private static final FabricBlockSettings planksSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
    private static final FabricBlockSettings slabSettings = FabricBlockSettings.copyOf(Blocks.OAK_SLAB);
    private static final FabricBlockSettings stairsSettings = FabricBlockSettings.copyOf(Blocks.OAK_STAIRS);
    private static final FabricBlockSettings buttonSettings = FabricBlockSettings.copyOf(Blocks.OAK_BUTTON);
    private static final FabricBlockSettings pressurePlateSettings = FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE);
    private static final FabricBlockSettings fenceSettings = FabricBlockSettings.copyOf(Blocks.OAK_FENCE);
    private static final FabricBlockSettings fenceGateSettings = FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE);
    private static final FabricBlockSettings trapdoorSettings = FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR);
    private static final FabricBlockSettings doorSettings = FabricBlockSettings.copyOf(Blocks.OAK_DOOR);
    private static final FabricBlockSettings signSettings = FabricBlockSettings.copyOf(Blocks.OAK_SIGN);
    private static final FabricBlockSettings wallSignSettings = FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN);
    private static final FabricBlockSettings hangingSignSettings = FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN);
    private static final FabricBlockSettings wallHangingSignSettings = FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN);
    private static final FabricBlockSettings leavesSettings = FabricBlockSettings.copyOf(Blocks.OAK_LEAVES);
    
    public static BlockState getDefaultStairState() {
        return defaultStairState;
    }
    
    public static FabricItemSettings getFullStackItem() {
        return fullStackItem;
    }
    
    public static FabricItemSettings getQuarterStackItem() {
        return quarterStackItem;
    }
    
    public static FabricBlockSettings getLogSettings() {
        return logSettings;
    }
    
    public static FabricBlockSettings getWoodSettings() {
        return woodSettings;
    }
    
    public static FabricBlockSettings getStrippedLogSettings() {
        return strippedLogSettings;
    }
    
    public static FabricBlockSettings getStrippedWoodSettings() {
        return strippedWoodSettings;
    }
    
    public static FabricBlockSettings getPlanksSettings() {
        return planksSettings;
    }
    
    public static FabricBlockSettings getSlabSettings() {
        return slabSettings;
    }
    
    public static FabricBlockSettings getStairsSettings() {
        return stairsSettings;
    }
    
    public static FabricBlockSettings getButtonSettings() {
        return buttonSettings;
    }
    
    public static FabricBlockSettings getPressurePlateSettings() {
        return pressurePlateSettings;
    }
    
    public static FabricBlockSettings getFenceSettings() {
        return fenceSettings;
    }
    
    public static FabricBlockSettings getFenceGateSettings() {
        return fenceGateSettings;
    }
    
    public static FabricBlockSettings getTrapdoorSettings() {
        return trapdoorSettings;
    }
    
    public static FabricBlockSettings getDoorSettings() {
        return doorSettings;
    }
    
    public static FabricBlockSettings getSignSettings() {
        return signSettings;
    }
    
    public static FabricBlockSettings getWallSignSettings() {
        return wallSignSettings;
    }
    
    public static FabricBlockSettings getHangingSignSettings() {
        return hangingSignSettings;
    }
    
    public static FabricBlockSettings getWallHangingSignSettings() {
        return wallHangingSignSettings;
    }
    
    public static FabricBlockSettings getLeavesSettings() {
        return leavesSettings;
    }
}

package simplexity.tropica.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;

public class TropicaItem {
    
    private static final String tropica = Tropica.tropica;
    static final FabricItemSettings fullStackItem = new FabricItemSettings().maxCount(64);
    static final FabricItemSettings quarterStackItem = new FabricItemSettings().maxCount(16);
    //Items
    
    //Block Items
    //doors
    public static final Item COCONUT_DOOR = new BlockItem(TropicaBlock.COCONUT_DOOR, fullStackItem);
    public static final Item COCONUT_TRAPDOOR = new BlockItem(TropicaBlock.COCONUT_TRAPDOOR, fullStackItem);
    public static final Item BLACK_MANGROVE_DOOR = new BlockItem(TropicaBlock.BLACK_MANGROVE_DOOR, fullStackItem);
    public static final Item BLACK_MANGROVE_TRAPDOOR = new BlockItem(TropicaBlock.BLACK_MANGROVE_TRAPDOOR, fullStackItem);
    //redstone
    public static final Item COCONUT_BUTTON = new BlockItem(TropicaBlock.COCONUT_BUTTON, fullStackItem);
    public static final Item COCONUT_PRESSURE_PLATE = new BlockItem(TropicaBlock.COCONUT_PRESSURE_PLATE, fullStackItem);
    public static final Item BLACK_MANGROVE_BUTTON = new BlockItem(TropicaBlock.BLACK_MANGROVE_BUTTON, fullStackItem);
    public static final Item BLACK_MANGROVE_PRESSURE_PLATE = new BlockItem(TropicaBlock.BLACK_MANGROVE_PRESSURE_PLATE, fullStackItem);
    //signs
    public static final Item COCONUT_SIGN = new SignItem(quarterStackItem, TropicaBlock.COCONUT_SIGN, TropicaBlock.COCONUT_WALL_SIGN);
    public static final Item COCONUT_HANGING_SIGN = new HangingSignItem(TropicaBlock.COCONUT_HANGING_SIGN_BLOCK, TropicaBlock.COCONUT_WALL_HANGING_SIGN_BLOCK, quarterStackItem);
    public static final Item BLACK_MANGROVE_SIGN = new SignItem(quarterStackItem, TropicaBlock.BLACK_MANGROVE_SIGN, TropicaBlock.BLACK_MANGROVE_WALL_SIGN);
    public static final Item BLACK_MANGROVE_HANGING_SIGN = new HangingSignItem(TropicaBlock.BLACK_MANGROVE_HANGING_SIGN_BLOCK, TropicaBlock.BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK, fullStackItem);
    //fence
    public static final Item COCONUT_FENCE = new BlockItem(TropicaBlock.COCONUT_FENCE, fullStackItem);
    public static final Item COCONUT_FENCE_GATE = new BlockItem(TropicaBlock.COCONUT_FENCE_GATE, fullStackItem);
    public static final Item BLACK_MANGROVE_FENCE = new BlockItem(TropicaBlock.BLACK_MANGROVE_FENCE, fullStackItem);
    public static final Item BLACK_MANGROVE_FENCE_GATE = new BlockItem(TropicaBlock.BLACK_MANGROVE_FENCE_GATE, fullStackItem);
    //logs
    public static final Item COCONUT_LOG = new BlockItem(TropicaBlock.COCONUT_LOG, fullStackItem);
    public static final Item STRIPPED_COCONUT_LOG = new BlockItem(TropicaBlock.STRIPPED_COCONUT_LOG, fullStackItem);
    public static final Item COCONUT_SHEATH = new BlockItem(TropicaBlock.COCONUT_SHEATH, fullStackItem);
    public static final Item BLACK_MANGROVE_LOG = new BlockItem(TropicaBlock.BLACK_MANGROVE_LOG, fullStackItem);
    public static final Item STRIPPED_BLACK_MANGROVE_LOG = new BlockItem(TropicaBlock.STRIPPED_BLACK_MANGROVE_LOG, fullStackItem);
    //wood
    public static final Item COCONUT_WOOD = new BlockItem(TropicaBlock.COCONUT_WOOD, fullStackItem);
    public static final Item COCONUT_SHEATH_WOOD = new BlockItem(TropicaBlock.COCONUT_SHEATH_WOOD, fullStackItem);
    public static final Item STRIPPED_COCONUT_WOOD = new BlockItem(TropicaBlock.STRIPPED_COCONUT_WOOD, fullStackItem);
    public static final Item BLACK_MANGROVE_WOOD = new BlockItem(TropicaBlock.BLACK_MANGROVE_WOOD, fullStackItem);
    public static final Item STRIPPED_BLACK_MANGROVE_WOOD = new BlockItem(TropicaBlock.STRIPPED_BLACK_MANGROVE_WOOD, fullStackItem);
    //planks/slabs/stairs
    public static final Item COCONUT_PLANKS = new BlockItem(TropicaBlock.COCONUT_PLANKS, fullStackItem);
    public static final Item COCONUT_SLAB = new BlockItem(TropicaBlock.COCONUT_SLAB, fullStackItem);
    public static final Item COCONUT_STAIRS = new BlockItem(TropicaBlock.COCONUT_STAIRS, fullStackItem);
    public static final Item BLACK_MANGROVE_PLANKS = new BlockItem(TropicaBlock.BLACK_MANGROVE_PLANKS, fullStackItem);
    public static final Item BLACK_MANGROVE_SLAB = new BlockItem(TropicaBlock.BLACK_MANGROVE_SLAB, fullStackItem);
    public static final Item BLACK_MANGROVE_STAIRS = new BlockItem(TropicaBlock.BLACK_MANGROVE_STAIRS, fullStackItem);
    //leaves/saplings
    public static final Item COCONUT_LEAVES = new BlockItem(TropicaBlock.COCONUT_LEAVES, fullStackItem);
    public static final Item COCONUT_SHOOT = new BlockItem(TropicaBlock.COCONUT_SHOOT, fullStackItem);
    public static final Item BLACK_MANGROVE_LEAVES = new BlockItem(TropicaBlock.BLACK_MANGROVE_LEAVES, fullStackItem);
    public static final Item BLACK_MANGROVE_PROPAGULE = new BlockItem(TropicaBlock.BLACK_MANGROVE_PROPAGULE, fullStackItem);
    //tree etc
    public static final Item BLACK_MANGROVE_KNEES = new BlockItem(TropicaBlock.BLACK_MANGROVE_KNEES, fullStackItem);
    
    
    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(tropica, name), item);
    }
    
    public static void registerModItems() {
        //doors
        registerItem("coconut_door", COCONUT_DOOR);
        registerItem("coconut_trapdoor", COCONUT_TRAPDOOR);
        registerItem("black_mangrove_door", BLACK_MANGROVE_DOOR);
        registerItem("black_mangrove_trapdoor", BLACK_MANGROVE_TRAPDOOR);
        //redstone
        registerItem("coconut_button", COCONUT_BUTTON);
        registerItem("coconut_pressure_plate", COCONUT_PRESSURE_PLATE);
        registerItem("black_mangrove_button", BLACK_MANGROVE_BUTTON);
        registerItem("black_mangrove_pressure_plate", BLACK_MANGROVE_PRESSURE_PLATE);
        //signs
        registerItem("coconut_sign", COCONUT_SIGN);
        registerItem("coconut_hanging_sign", COCONUT_HANGING_SIGN);
        registerItem("black_mangrove_sign", BLACK_MANGROVE_SIGN);
        registerItem("black_mangrove_hanging_sign", BLACK_MANGROVE_HANGING_SIGN);
        //fence
        registerItem("coconut_fence", COCONUT_FENCE);
        registerItem("coconut_fence_gate", COCONUT_FENCE_GATE);
        registerItem("black_mangrove_fence", BLACK_MANGROVE_FENCE);
        registerItem("black_mangrove_fence_gate", BLACK_MANGROVE_FENCE_GATE);
        //logs
        registerItem("coconut_log", COCONUT_LOG);
        registerItem("stripped_coconut_log", STRIPPED_COCONUT_LOG);
        registerItem("coconut_sheath", COCONUT_SHEATH);
        registerItem("black_mangrove_log", BLACK_MANGROVE_LOG);
        registerItem("stripped_black_mangrove_log", STRIPPED_BLACK_MANGROVE_LOG);
        //wood
        registerItem("coconut_wood", COCONUT_WOOD);
        registerItem("coconut_sheath_wood", COCONUT_SHEATH_WOOD);
        registerItem("stripped_coconut_wood", STRIPPED_COCONUT_WOOD);
        registerItem("black_mangrove_wood", BLACK_MANGROVE_WOOD);
        registerItem("stripped_black_mangrove_wood", STRIPPED_BLACK_MANGROVE_WOOD);
        //planks/slabs/stairs
        registerItem("coconut_planks", COCONUT_PLANKS);
        registerItem("coconut_slab", COCONUT_SLAB);
        registerItem("coconut_stairs", COCONUT_STAIRS);
        registerItem("black_mangrove_planks", BLACK_MANGROVE_PLANKS);
        registerItem("black_mangrove_slab", BLACK_MANGROVE_SLAB);
        registerItem("black_mangrove_stairs", BLACK_MANGROVE_STAIRS);
        //leaves/saplings
        registerItem("coconut_leaves", COCONUT_LEAVES);
        registerItem("coconut_shoot", COCONUT_SHOOT);
        registerItem("black_mangrove_leaves", BLACK_MANGROVE_LEAVES);
        registerItem("black_mangrove_propagule", BLACK_MANGROVE_PROPAGULE);
        //tree etc
        registerItem("black_mangrove_knees", BLACK_MANGROVE_KNEES);
    }
    
    
}

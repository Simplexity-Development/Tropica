package simplexity.tropica.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;

public class BlackMangrove {
    
    private static final String tropica = Tropica.tropica;
    private static final FabricItemSettings fullStackItemSettings = FabricSettings.getFullStackItem();
    private static final FabricItemSettings quarterStackItemSettings = FabricSettings.getQuarterStackItem();
    public static final BlockSetType BLACK_MANGROVE_BLOCK_SET_TYPE = new BlockSetType("black_mangrove", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType BLACK_MANGROVE_WOOD_TYPE = new WoodType("black_mangrove", BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_LOG = new PillarBlock(FabricSettings.getLogSettings());
    public static final Block BLACK_MANGROVE_WOOD = new PillarBlock(FabricSettings.getWoodSettings());
    public static final Block STRIPPED_BLACK_MANGROVE_LOG = new PillarBlock(FabricSettings.getStrippedLogSettings());
    public static final Block STRIPPED_BLACK_MANGROVE_WOOD = new PillarBlock(FabricSettings.getStrippedWoodSettings());
    public static final Block BLACK_MANGROVE_PLANKS = new Block(FabricSettings.getPlanksSettings());
    public static final Block BLACK_MANGROVE_SLAB = new SlabBlock(FabricSettings.getSlabSettings());
    public static final Block BLACK_MANGROVE_STAIRS = new StairsBlock(FabricSettings.getDefaultStairState(), FabricSettings.getStairsSettings());
    public static final Block BLACK_MANGROVE_BUTTON = new ButtonBlock(FabricSettings.getButtonSettings(), BLACK_MANGROVE_BLOCK_SET_TYPE, 30, true);
    public static final Block BLACK_MANGROVE_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricSettings.getPressurePlateSettings(), BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_FENCE = new FenceBlock(FabricSettings.getFenceSettings());
    public static final Block BLACK_MANGROVE_FENCE_GATE = new FenceGateBlock(FabricSettings.getFenceGateSettings(), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_DOOR = new DoorBlock(FabricSettings.getDoorSettings(), BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_TRAPDOOR = new TrapdoorBlock(FabricSettings.getTrapdoorSettings(), BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_SIGN = new SignBlock(FabricSettings.getSignSettings(), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_WALL_SIGN = new WallSignBlock(FabricSettings.getWallSignSettings(), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_HANGING_SIGN_BLOCK = new HangingSignBlock(FabricSettings.getHangingSignSettings(), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK = new WallHangingSignBlock(FabricSettings.getWallHangingSignSettings(), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_KNEES = new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS));
    public static final Block BLACK_MANGROVE_LEAVES = new Block(FabricSettings.getLeavesSettings());
    public static final Block BLACK_MANGROVE_PROPAGULE = new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PROPAGULE));
    
    
    public static void registerBlackMangroveBlocks() {
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_log"), BLACK_MANGROVE_LOG);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_wood"), BLACK_MANGROVE_WOOD);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_black_mangrove_log"), STRIPPED_BLACK_MANGROVE_LOG);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_black_mangrove_wood"), STRIPPED_BLACK_MANGROVE_WOOD);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_planks"), BLACK_MANGROVE_PLANKS);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_slab"), BLACK_MANGROVE_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_stairs"), BLACK_MANGROVE_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_button"), BLACK_MANGROVE_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_pressure_plate"), BLACK_MANGROVE_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_fence"), BLACK_MANGROVE_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_fence_gate"), BLACK_MANGROVE_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_door"), BLACK_MANGROVE_DOOR);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_trapdoor"), BLACK_MANGROVE_TRAPDOOR);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_sign"), BLACK_MANGROVE_SIGN);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_wall_sign"), BLACK_MANGROVE_WALL_SIGN);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_hanging_sign"), BLACK_MANGROVE_HANGING_SIGN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_wall_hanging_sign"), BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_knees"), BLACK_MANGROVE_KNEES);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_leaves"), BLACK_MANGROVE_LEAVES);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_propagule"), BLACK_MANGROVE_PROPAGULE);
        
    }
    
    public static void registerBlackMangroveBlockItems() {
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_log"), new BlockItem(BLACK_MANGROVE_LOG, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_wood"), new BlockItem(BLACK_MANGROVE_WOOD, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "stripped_black_mangrove_log"), new BlockItem(STRIPPED_BLACK_MANGROVE_LOG, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "stripped_black_mangrove_wood"), new BlockItem(STRIPPED_BLACK_MANGROVE_WOOD, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_planks"), new BlockItem(BLACK_MANGROVE_PLANKS, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_slab"), new BlockItem(BLACK_MANGROVE_SLAB, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_stairs"), new BlockItem(BLACK_MANGROVE_STAIRS, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_button"), new BlockItem(BLACK_MANGROVE_BUTTON, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_pressure_plate"), new BlockItem(BLACK_MANGROVE_PRESSURE_PLATE, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_fence"), new BlockItem(BLACK_MANGROVE_FENCE, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_fence_gate"), new BlockItem(BLACK_MANGROVE_FENCE_GATE, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_door"), new BlockItem(BLACK_MANGROVE_DOOR, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_trapdoor"), new BlockItem(BLACK_MANGROVE_TRAPDOOR, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_sign"), new SignItem(quarterStackItemSettings, BLACK_MANGROVE_SIGN, BLACK_MANGROVE_WALL_SIGN));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_hanging_sign"), new HangingSignItem(BLACK_MANGROVE_HANGING_SIGN_BLOCK, BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_knees"), new BlockItem(BLACK_MANGROVE_KNEES, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_leaves"), new BlockItem(BLACK_MANGROVE_LEAVES, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_propagule"), new BlockItem(BLACK_MANGROVE_PROPAGULE, fullStackItemSettings));
    }
    
    public static void registerBlackMangroveCreativePlacements() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.DARK_OAK_BUTTON, BLACK_MANGROVE_LOG);
            content.addAfter(BLACK_MANGROVE_LOG, BLACK_MANGROVE_WOOD);
            content.addAfter(BLACK_MANGROVE_WOOD, STRIPPED_BLACK_MANGROVE_LOG);
            content.addAfter(STRIPPED_BLACK_MANGROVE_LOG, STRIPPED_BLACK_MANGROVE_WOOD);
            content.addAfter(STRIPPED_BLACK_MANGROVE_WOOD, BLACK_MANGROVE_PLANKS);
            content.addAfter(BLACK_MANGROVE_PLANKS, BLACK_MANGROVE_STAIRS);
            content.addAfter(BLACK_MANGROVE_STAIRS, BLACK_MANGROVE_SLAB);
            content.addAfter(BLACK_MANGROVE_SLAB, BLACK_MANGROVE_FENCE);
            content.addAfter(BLACK_MANGROVE_FENCE, BLACK_MANGROVE_FENCE_GATE);
            content.addAfter(BLACK_MANGROVE_FENCE_GATE, BLACK_MANGROVE_DOOR);
            content.addAfter(BLACK_MANGROVE_DOOR, BLACK_MANGROVE_TRAPDOOR);
            content.addAfter(BLACK_MANGROVE_TRAPDOOR, BLACK_MANGROVE_PRESSURE_PLATE);
            content.addAfter(BLACK_MANGROVE_PRESSURE_PLATE, BLACK_MANGROVE_BUTTON);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(Items.DARK_OAK_LOG, BLACK_MANGROVE_LOG);
            content.addAfter(Items.DARK_OAK_LEAVES, BLACK_MANGROVE_LEAVES);
            content.addAfter(Items.DARK_OAK_SAPLING, BLACK_MANGROVE_PROPAGULE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.DARK_OAK_HANGING_SIGN, BLACK_MANGROVE_SIGN);
            content.addAfter(BLACK_MANGROVE_SIGN, BLACK_MANGROVE_HANGING_SIGN_BLOCK);
        });
    }
}

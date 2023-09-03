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

public class Coconut {
    
    private static final String tropica = Tropica.tropica;
    private static final FabricItemSettings fullStackItemSettings = FabricSettings.getFullStackItem();
    private static final FabricItemSettings quarterStackItemSettings = FabricSettings.getQuarterStackItem();
    public static final BlockSetType COCONUT_BLOCK_SET_TYPE = new BlockSetType("coconut", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType COCONUT_WOOD_TYPE = new WoodType("coconut", COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_LOG = new PillarBlock(FabricSettings.getLogSettings());
    public static final Block COCONUT_WOOD = new PillarBlock(FabricSettings.getWoodSettings());
    public static final Block COCONUT_SHEATH = new PillarBlock(FabricSettings.getLogSettings());
    public static final Block COCONUT_SHEATH_WOOD = new PillarBlock(FabricSettings.getWoodSettings());
    public static final Block STRIPPED_COCONUT_LOG = new PillarBlock(FabricSettings.getStrippedLogSettings());
    public static final Block STRIPPED_COCONUT_WOOD = new PillarBlock(FabricSettings.getStrippedWoodSettings());
    public static final Block COCONUT_PLANKS = new Block(FabricSettings.getPlanksSettings());
    public static final Block COCONUT_SLAB = new SlabBlock(FabricSettings.getSlabSettings());
    public static final Block COCONUT_STAIRS = new StairsBlock(FabricSettings.getDefaultStairState(), FabricSettings.getStairsSettings());
    public static final Block COCONUT_BUTTON = new ButtonBlock(FabricSettings.getButtonSettings(), COCONUT_BLOCK_SET_TYPE, 30, true);
    public static final Block COCONUT_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricSettings.getPressurePlateSettings(), COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_FENCE = new FenceBlock(FabricSettings.getFenceSettings());
    public static final Block COCONUT_FENCE_GATE = new FenceGateBlock(FabricSettings.getFenceGateSettings(), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_DOOR = new DoorBlock(FabricSettings.getDoorSettings(), COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_TRAPDOOR = new TrapdoorBlock(FabricSettings.getTrapdoorSettings(), COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_SIGN = new SignBlock(FabricSettings.getSignSettings(), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_WALL_SIGN = new WallSignBlock(FabricSettings.getWallSignSettings(), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_HANGING_SIGN_BLOCK = new HangingSignBlock(FabricSettings.getHangingSignSettings(), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_WALL_HANGING_SIGN_BLOCK = new WallHangingSignBlock(FabricSettings.getWallHangingSignSettings(), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_KNEES = new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS));
    public static final Block COCONUT_LEAVES = new Block(FabricSettings.getLeavesSettings());
    public static final Block COCONUT_SHOOT = new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING));
    public static final Block BROWN_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block YELLOW_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block GREEN_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block COCONUT_BERRY = new PlantBlock(FabricBlockSettings.copyOf(Blocks.COCOA));
    public static final Block COCONUT_TUFT = new Block(FabricBlockSettings.copyOf(Blocks.HANGING_ROOTS));
    
    
    public static void registerCoconutBlocks() {
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_log"), COCONUT_LOG);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_wood"), COCONUT_WOOD);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_sheath"), COCONUT_SHEATH);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_sheath_wood"), COCONUT_SHEATH_WOOD);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_coconut_log"), STRIPPED_COCONUT_LOG);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_coconut_wood"), STRIPPED_COCONUT_WOOD);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_planks"), COCONUT_PLANKS);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_slab"), COCONUT_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_stairs"), COCONUT_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_button"), COCONUT_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_pressure_plate"), COCONUT_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_fence"), COCONUT_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_fence_gate"), COCONUT_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_door"), COCONUT_DOOR);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_trapdoor"), COCONUT_TRAPDOOR);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_sign"), COCONUT_SIGN);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_wall_sign"), COCONUT_WALL_SIGN);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_hanging_sign"), COCONUT_HANGING_SIGN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_wall_hanging_sign"), COCONUT_WALL_HANGING_SIGN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_knees"), COCONUT_KNEES);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_leaves"), COCONUT_LEAVES);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_shoot"), COCONUT_SHOOT);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "brown_coconut_block"), BROWN_COCONUT_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "yellow_coconut_block"), YELLOW_COCONUT_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "green_coconut_block"), GREEN_COCONUT_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_berry"), COCONUT_BERRY);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_tuft"), COCONUT_TUFT);
    }
    
    public static void registerCoconutBlockItems() {
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_log"), new BlockItem(COCONUT_LOG, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_wood"), new BlockItem(COCONUT_WOOD, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_sheath"), new BlockItem(COCONUT_SHEATH, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_sheath_wood"), new BlockItem(COCONUT_SHEATH_WOOD, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "stripped_coconut_log"), new BlockItem(STRIPPED_COCONUT_LOG, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "stripped_coconut_wood"), new BlockItem(STRIPPED_COCONUT_WOOD, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_planks"), new BlockItem(COCONUT_PLANKS, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_slab"), new BlockItem(COCONUT_SLAB, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_stairs"), new BlockItem(COCONUT_STAIRS, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_button"), new BlockItem(COCONUT_BUTTON, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_pressure_plate"), new BlockItem(COCONUT_PRESSURE_PLATE, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_fence"), new BlockItem(COCONUT_FENCE, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_fence_gate"), new BlockItem(COCONUT_FENCE_GATE, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_door"), new BlockItem(COCONUT_DOOR, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_trapdoor"), new BlockItem(COCONUT_TRAPDOOR, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_sign"), new SignItem(quarterStackItemSettings, COCONUT_SIGN, COCONUT_WALL_SIGN));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_hanging_sign"), new HangingSignItem(COCONUT_HANGING_SIGN_BLOCK, COCONUT_WALL_HANGING_SIGN_BLOCK, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_leaves"), new BlockItem(COCONUT_LEAVES, fullStackItemSettings));
        Registry.register(Registries.ITEM, new Identifier(tropica, "coconut_shoot"), new BlockItem(COCONUT_SHOOT, fullStackItemSettings));
    }
    
    public static void registerCoconutCreativePlacements() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.JUNGLE_BUTTON, COCONUT_LOG);
            content.addAfter(COCONUT_LOG, COCONUT_WOOD);
            content.addAfter(COCONUT_WOOD, STRIPPED_COCONUT_LOG);
            content.addAfter(STRIPPED_COCONUT_LOG, STRIPPED_COCONUT_WOOD);
            content.addAfter(STRIPPED_COCONUT_WOOD, COCONUT_SHEATH);
            content.addAfter(COCONUT_SHEATH, COCONUT_SHEATH_WOOD);
            content.addAfter(COCONUT_SHEATH_WOOD, COCONUT_PLANKS);
            content.addAfter(COCONUT_PLANKS, COCONUT_STAIRS);
            content.addAfter(COCONUT_STAIRS, COCONUT_SLAB);
            content.addAfter(COCONUT_SLAB, COCONUT_FENCE);
            content.addAfter(COCONUT_FENCE, COCONUT_FENCE_GATE);
            content.addAfter(COCONUT_FENCE_GATE, COCONUT_DOOR);
            content.addAfter(COCONUT_DOOR, COCONUT_TRAPDOOR);
            content.addAfter(COCONUT_TRAPDOOR, COCONUT_PRESSURE_PLATE);
            content.addAfter(COCONUT_PRESSURE_PLATE, COCONUT_BUTTON);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(Items.JUNGLE_LOG, COCONUT_SHEATH);
            content.addAfter(COCONUT_SHEATH, COCONUT_LOG);
            content.addAfter(Items.JUNGLE_LEAVES, COCONUT_LEAVES);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.JUNGLE_HANGING_SIGN, COCONUT_SIGN);
            content.addAfter(COCONUT_SIGN, COCONUT_HANGING_SIGN_BLOCK);
        });
    }
    
    
}

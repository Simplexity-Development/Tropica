package simplexity.tropica.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;
import simplexity.tropica.mixin.WoodTypeMixin;
import simplexity.tropica.registry.block.*;

import static simplexity.tropica.registry.TropicaItem.COCONUT_BOAT;

public class TropicaBlock {
    
    private static final String tropica = Tropica.tropica;
    private static final int logsBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_LOG).getBurnChance();
    private static final int woodenItemsBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_PLANKS).getBurnChance();
    private static final int logsFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_LOG).getSpreadChance();
    private static final int woodenItemsFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_PLANKS).getSpreadChance();
    private static final int nonBurningBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_SIGN).getBurnChance();
    private static final int nonBurningFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_SIGN).getSpreadChance();
    private static final int veryFlammableBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.HAY_BLOCK).getBurnChance();
    private static final int veryFlammableSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.HAY_BLOCK).getSpreadChance();
    private static final int leavesBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_LEAVES).getBurnChance();
    private static final int leavesFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_LEAVES).getSpreadChance();
    private static final int saplingBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_SAPLING).getBurnChance();
    private static final int saplingFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.OAK_SAPLING).getSpreadChance();
    private static final int sandstoneBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.SANDSTONE).getBurnChance();
    private static final int sandstoneFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.SANDSTONE).getSpreadChance();
    private static final int coralBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.BRAIN_CORAL_BLOCK).getBurnChance();
    private static final int coralFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.BRAIN_CORAL_BLOCK).getSpreadChance();
    private static final int coralFanBurnChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.BRAIN_CORAL_FAN).getBurnChance();
    private static final int coralFanFireSpreadChance = FlammableBlockRegistry.getDefaultInstance().get(Blocks.BRAIN_CORAL_FAN).getSpreadChance();
    public static final BlockState defaultStairState = Blocks.OAK_STAIRS.getDefaultState();
    public static final FabricBlockSettings logSettings = FabricBlockSettings.copyOf(Blocks.OAK_LOG);
    public static final FabricBlockSettings woodSettings = FabricBlockSettings.copyOf(Blocks.OAK_WOOD);
    public static final FabricBlockSettings strippedLogSettings = FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG);
    public static final FabricBlockSettings strippedWoodSettings = FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD);
    public static final FabricBlockSettings planksSettings = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
    public static final FabricBlockSettings slabSettings = FabricBlockSettings.copyOf(Blocks.OAK_SLAB);
    public static final FabricBlockSettings stairsSettings = FabricBlockSettings.copyOf(Blocks.OAK_STAIRS);
    public static final FabricBlockSettings buttonSettings = FabricBlockSettings.copyOf(Blocks.OAK_BUTTON);
    public static final FabricBlockSettings pressurePlateSettings = FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE);
    public static final FabricBlockSettings fenceSettings = FabricBlockSettings.copyOf(Blocks.OAK_FENCE);
    public static final FabricBlockSettings fenceGateSettings = FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE);
    public static final FabricBlockSettings trapdoorSettings = FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR);
    public static final FabricBlockSettings doorSettings = FabricBlockSettings.copyOf(Blocks.OAK_DOOR);
    public static final FabricBlockSettings signSettings = FabricBlockSettings.copyOf(Blocks.OAK_SIGN);
    public static final FabricBlockSettings wallSignSettings = FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN);
    public static final FabricBlockSettings hangingSignSettings = FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN);
    public static final FabricBlockSettings wallHangingSignSettings = FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN);
    public static final FabricBlockSettings leavesSettings = FabricBlockSettings.copyOf(Blocks.OAK_LEAVES);
    
    //Block Set Type and Wood Type Declarations
    public static final BlockSetType BLACK_MANGROVE_BLOCK_SET_TYPE = new BlockSetType("black_mangrove", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType COCONUT_BLOCK_SET_TYPE = new BlockSetType("coconut", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType BLACK_MANGROVE_WOOD_TYPE = new WoodType("black_mangrove", BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final WoodType COCONUT_WOOD_TYPE = new WoodType("coconut", COCONUT_BLOCK_SET_TYPE);
    //Doors
    public static final Block BLACK_MANGROVE_TRAPDOOR = new TrapdoorBlock(trapdoorSettings, BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_DOOR = new DoorBlock(doorSettings, BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block COCONUT_TRAPDOOR = new TrapdoorBlock(trapdoorSettings, COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_DOOR = new DoorBlock(doorSettings, COCONUT_BLOCK_SET_TYPE);
    
    //Redstone
    public static final Block BLACK_MANGROVE_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, pressurePlateSettings, BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_BUTTON = new ButtonBlock(buttonSettings, BLACK_MANGROVE_BLOCK_SET_TYPE, 30, true);
    public static final Block COCONUT_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, pressurePlateSettings, COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_BUTTON = new ButtonBlock(buttonSettings, COCONUT_BLOCK_SET_TYPE, 30, true);
    
    //Signs
    public static final Block BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK = new WallHangingSignBlock(wallHangingSignSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_HANGING_SIGN_BLOCK = new BlackMangroveHangingSign(hangingSignSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_WALL_SIGN = new BlackMangroveWallSign(wallSignSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_SIGN = new BlackMangroveSign(signSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block COCONUT_WALL_HANGING_SIGN_BLOCK = new WallHangingSignBlock(wallHangingSignSettings, COCONUT_WOOD_TYPE);
    public static final Block COCONUT_HANGING_SIGN_BLOCK = new CoconutHangingSign(hangingSignSettings, COCONUT_WOOD_TYPE);
    public static final Block COCONUT_WALL_SIGN = new CoconutWallSign(wallSignSettings, COCONUT_WOOD_TYPE);
    public static final Block COCONUT_SIGN = new CoconutSign(signSettings, COCONUT_WOOD_TYPE);

    //Fence
    public static final Block BLACK_MANGROVE_FENCE = new FenceBlock(fenceSettings);
    public static final Block BLACK_MANGROVE_FENCE_GATE = new FenceGateBlock(fenceGateSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block COCONUT_FENCE = new FenceBlock(fenceSettings);
    public static final Block COCONUT_FENCE_GATE = new FenceGateBlock(fenceGateSettings, COCONUT_WOOD_TYPE);
    
    //Logs
    public static final Block BLACK_MANGROVE_LOG = new PillarBlock(logSettings);
    public static final Block STRIPPED_BLACK_MANGROVE_LOG = new PillarBlock(strippedLogSettings);
    public static final Block COCONUT_LOG = new PillarBlock(logSettings);
    public static final Block COCONUT_SHEATH = new PillarBlock(logSettings);
    public static final Block STRIPPED_COCONUT_LOG = new PillarBlock(strippedLogSettings);
    //Wood
    public static final Block BLACK_MANGROVE_WOOD = new PillarBlock(woodSettings);
    public static final Block STRIPPED_BLACK_MANGROVE_WOOD = new PillarBlock(strippedWoodSettings);
    public static final Block COCONUT_WOOD = new PillarBlock(woodSettings);
    public static final Block COCONUT_SHEATH_WOOD = new PillarBlock(woodSettings);
    public static final Block STRIPPED_COCONUT_WOOD = new PillarBlock(strippedWoodSettings);
    //Planks, Slabs, Stairs
    public static final Block BLACK_MANGROVE_PLANKS = new Block(planksSettings);
    public static final Block BLACK_MANGROVE_SLAB = new SlabBlock(slabSettings);
    public static final Block BLACK_MANGROVE_STAIRS = new StairsBlock(defaultStairState, stairsSettings);
    public static final Block COCONUT_PLANKS = new Block(planksSettings);
    public static final Block COCONUT_SLAB = new SlabBlock(slabSettings);
    public static final Block COCONUT_STAIRS = new StairsBlock(defaultStairState, stairsSettings);
    
    //Leaves, Saplings
    public static final Block BLACK_MANGROVE_LEAVES = new Block(leavesSettings);
    public static final Block BLACK_MANGROVE_PROPAGULE = new PropaguleBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PROPAGULE));
    public static final Block COCONUT_LEAVES = new Block(leavesSettings);
    public static final Block COCONUT_SHOOT = new PropaguleBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING));
    //Etc
    public static final Block BLACK_MANGROVE_KNEES = new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS));
    public static final Block BROWN_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block YELLOW_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block GREEN_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block COCONUT_BERRY = new PlantBlock(FabricBlockSettings.copyOf(Blocks.COCOA));
    public static final Block COCONUT_TUFT = new Block(FabricBlockSettings.copyOf(Blocks.HANGING_ROOTS));
    //sand
    public static final Block BLACK_SAND = new SandBlock(1, FabricBlockSettings.copyOf(Blocks.SAND).mapColor(DyeColor.BLACK));
    public static final Block BLACK_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(DyeColor.BLACK));
    public static final Block BLACK_SANDSTONE_STAIRS = new StairsBlock(defaultStairState, FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS).mapColor(DyeColor.BLACK));
    public static final Block BLACK_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB).mapColor(DyeColor.BLACK));
    public static final Block BLACK_SANDSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL));
    public static final Block CUT_BLACK_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(DyeColor.BLACK));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE_SLAB).mapColor(DyeColor.BLACK));
    public static final Block SMOOTH_BLACK_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(DyeColor.BLACK));
    public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = new StairsBlock(defaultStairState, FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_STAIRS).mapColor(DyeColor.BLACK));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_SLAB).mapColor(DyeColor.BLACK));
    public static final Block CHISELED_BLACK_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(DyeColor.BLACK));
    //Coral
    public static final Block DEAD_HAMMER_CORAL_BLOCK = new DeadCoralBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block HAMMER_CORAL_BLOCK = new CoralBlockBlock(DEAD_HAMMER_CORAL_BLOCK, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block DEAD_HAMMER_CORAL = new DeadCoralFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL));
    public static final Block HAMMER_CORAL = new CoralFanBlock(DEAD_HAMMER_CORAL, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL));
    public static final Block DEAD_HAMMER_CORAL_FAN = new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_FAN));
    public static final Block HAMMER_CORAL_FAN = new CoralWallFanBlock(DEAD_HAMMER_CORAL_FAN, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_FAN));
    
    public static final Block DEAD_HAMMER_CORAL_WALL_FAN = new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_WALL_FAN));
    public static final Block HAMMER_CORAL_WALL_FAN = new CoralWallFanBlock(DEAD_HAMMER_CORAL_WALL_FAN, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_WALL_FAN));

    private static void registerBlock(String name, Block block, Integer burnChance, Integer spreadChance) {
        Registry.register(Registries.BLOCK, new Identifier(tropica, name), block);
        FlammableBlockRegistry.getDefaultInstance().add(block, burnChance, spreadChance);
        
    }

    public static void registerWoodTypes() {
        WoodTypeMixin.invokeRegister(COCONUT_WOOD_TYPE);
        WoodTypeMixin.invokeRegister(BLACK_MANGROVE_WOOD_TYPE);
    }
    
    public static void registerModBlocks() {
        //TREE STUFF
        //Doors
        registerBlock("black_mangrove_trapdoor", BLACK_MANGROVE_TRAPDOOR, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("black_mangrove_door", BLACK_MANGROVE_DOOR, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_trapdoor", COCONUT_TRAPDOOR, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_door", COCONUT_DOOR, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        //Redstone
        registerBlock("black_mangrove_pressure_plate", BLACK_MANGROVE_PRESSURE_PLATE, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("black_mangrove_button", BLACK_MANGROVE_BUTTON, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_pressure_plate", COCONUT_PRESSURE_PLATE, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_button", COCONUT_BUTTON, nonBurningBurnChance, nonBurningFireSpreadChance);
        //Signs
        registerBlock("black_mangrove_sign", BLACK_MANGROVE_SIGN, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("black_mangrove_wall_sign", BLACK_MANGROVE_WALL_SIGN, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("black_mangrove_hanging_sign", BLACK_MANGROVE_HANGING_SIGN_BLOCK, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("black_mangrove_wall_hanging_sign", BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_sign", COCONUT_SIGN, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_wall_sign", COCONUT_WALL_SIGN, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_hanging_sign", COCONUT_HANGING_SIGN_BLOCK, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_wall_hanging_sign", COCONUT_WALL_HANGING_SIGN_BLOCK, nonBurningBurnChance, nonBurningFireSpreadChance);
        //Fence
        registerBlock("black_mangrove_fence", BLACK_MANGROVE_FENCE, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("black_mangrove_fence_gate", BLACK_MANGROVE_FENCE_GATE, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_fence", COCONUT_FENCE, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_fence_gate", COCONUT_FENCE_GATE, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        //Log
        registerBlock("black_mangrove_log", BLACK_MANGROVE_LOG, logsBurnChance, logsFireSpreadChance);
        registerBlock("stripped_black_mangrove_log", STRIPPED_BLACK_MANGROVE_LOG, logsBurnChance, logsFireSpreadChance);
        registerBlock("coconut_log", COCONUT_LOG, logsBurnChance, logsFireSpreadChance);
        registerBlock("coconut_sheath", COCONUT_SHEATH, veryFlammableBurnChance, veryFlammableSpreadChance);
        registerBlock("stripped_coconut_log", STRIPPED_COCONUT_LOG, logsBurnChance, logsFireSpreadChance);
        //Wood
        registerBlock("black_mangrove_wood", BLACK_MANGROVE_WOOD, logsBurnChance, logsFireSpreadChance);
        registerBlock("stripped_black_mangrove_wood", STRIPPED_BLACK_MANGROVE_WOOD, logsBurnChance, logsFireSpreadChance);
        registerBlock("coconut_wood", COCONUT_WOOD, veryFlammableBurnChance, veryFlammableSpreadChance);
        registerBlock("coconut_sheath_wood", COCONUT_SHEATH_WOOD, logsBurnChance, logsFireSpreadChance);
        registerBlock("stripped_coconut_wood", STRIPPED_COCONUT_WOOD, logsBurnChance, logsFireSpreadChance);
        //Planks/Slabs/Stairs
        registerBlock("black_mangrove_planks", BLACK_MANGROVE_PLANKS, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("black_mangrove_slab", BLACK_MANGROVE_SLAB, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("black_mangrove_stairs", BLACK_MANGROVE_STAIRS, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_planks", COCONUT_PLANKS, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_slab", COCONUT_SLAB, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_stairs", COCONUT_STAIRS, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        //Leaves/saplings
        registerBlock("black_mangrove_leaves", BLACK_MANGROVE_LEAVES, leavesBurnChance, leavesFireSpreadChance);
        registerBlock("black_mangrove_propagule", BLACK_MANGROVE_PROPAGULE, saplingBurnChance, saplingFireSpreadChance);
        registerBlock("coconut_leaves", COCONUT_LEAVES, leavesBurnChance, leavesFireSpreadChance);
        registerBlock("coconut_shoot", COCONUT_SHOOT, saplingBurnChance, saplingFireSpreadChance);
        //Tree ETC
        registerBlock("black_mangrove_knees", BLACK_MANGROVE_KNEES, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("brown_coconut_block", BROWN_COCONUT_BLOCK, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("yellow_coconut_block", YELLOW_COCONUT_BLOCK, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("green_coconut_block", GREEN_COCONUT_BLOCK, woodenItemsBurnChance, woodenItemsFireSpreadChance);
        registerBlock("coconut_berry", COCONUT_BERRY, nonBurningBurnChance, nonBurningFireSpreadChance);
        registerBlock("coconut_tuft", COCONUT_TUFT, veryFlammableBurnChance, veryFlammableSpreadChance);
        // Sand & sandstone
        registerBlock("black_sand", BLACK_SAND, FlammableBlockRegistry.getDefaultInstance().get(Blocks.SAND).getBurnChance(), FlammableBlockRegistry.getDefaultInstance().get(Blocks.SAND).getSpreadChance());
        registerBlock("black_sandstone", BLACK_SANDSTONE, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("black_sandstone_stairs", BLACK_SANDSTONE_STAIRS, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("black_sandstone_slab", BLACK_SANDSTONE_SLAB, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("black_sandstone_wall", BLACK_SANDSTONE_WALL, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("cut_black_sandstone", CUT_BLACK_SANDSTONE, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("cut_black_sandstone_slab", CUT_BLACK_SANDSTONE_SLAB, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("smooth_black_sandstone", SMOOTH_BLACK_SANDSTONE, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("smooth_black_sandstone_stairs", SMOOTH_BLACK_SANDSTONE_STAIRS, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("smooth_black_sandstone_slab", SMOOTH_BLACK_SANDSTONE_SLAB, sandstoneBurnChance, sandstoneFireSpreadChance);
        registerBlock("chiseled_black_sandstone", CHISELED_BLACK_SANDSTONE, sandstoneBurnChance, sandstoneFireSpreadChance);
        // Coral
        registerBlock("dead_hammer_coral_block", DEAD_HAMMER_CORAL_BLOCK, coralBurnChance, coralFireSpreadChance);
        registerBlock("hammer_coral_block", HAMMER_CORAL_BLOCK, coralBurnChance, coralFireSpreadChance);
        registerBlock("dead_hammer_coral", DEAD_HAMMER_CORAL, coralFanBurnChance, coralFanFireSpreadChance);
        registerBlock("hammer_coral", HAMMER_CORAL, coralFanBurnChance, coralFanFireSpreadChance);
        registerBlock("dead_hammer_coral_fan", DEAD_HAMMER_CORAL_FAN, coralFanBurnChance, coralFanFireSpreadChance);
        registerBlock("hammer_coral_fan", HAMMER_CORAL_FAN, coralFanBurnChance, coralFanFireSpreadChance);
        registerBlock("dead_hammer_coral_wall_fan", DEAD_HAMMER_CORAL_WALL_FAN, coralFanBurnChance, coralFanFireSpreadChance);
        registerBlock("hammer_coral_wall_fan", HAMMER_CORAL_WALL_FAN, coralFanBurnChance, coralFanFireSpreadChance);
    }
    
    public static void registerCreativePlacements() {
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
            content.addAfter(Items.CUT_RED_SANDSTONE_SLAB, BLACK_SANDSTONE);
            content.addAfter(BLACK_SANDSTONE, BLACK_SANDSTONE_STAIRS);
            content.addAfter(BLACK_SANDSTONE_STAIRS, BLACK_SANDSTONE_SLAB);
            content.addAfter(BLACK_SANDSTONE_SLAB, BLACK_SANDSTONE_WALL);
            content.addAfter(BLACK_SANDSTONE_WALL, CHISELED_BLACK_SANDSTONE);
            content.addAfter(CHISELED_BLACK_SANDSTONE, SMOOTH_BLACK_SANDSTONE);
            content.addAfter(SMOOTH_BLACK_SANDSTONE, SMOOTH_BLACK_SANDSTONE_STAIRS);
            content.addAfter(SMOOTH_BLACK_SANDSTONE_STAIRS, SMOOTH_BLACK_SANDSTONE_SLAB);
            content.addAfter(SMOOTH_BLACK_SANDSTONE_SLAB, CUT_BLACK_SANDSTONE);
            content.addAfter(CUT_BLACK_SANDSTONE, CUT_BLACK_SANDSTONE_SLAB);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(Items.RED_SANDSTONE, BLACK_SAND);
            content.addAfter(BLACK_SAND, BLACK_SANDSTONE);
            content.addAfter(Items.JUNGLE_LOG, COCONUT_SHEATH);
            content.addAfter(COCONUT_SHEATH, COCONUT_LOG);
            content.addAfter(Items.JUNGLE_LEAVES, COCONUT_LEAVES);
            content.addAfter(Items.DARK_OAK_LOG, BLACK_MANGROVE_LOG);
            content.addAfter(Items.DARK_OAK_LEAVES, BLACK_MANGROVE_LEAVES);
            content.addAfter(Items.JUNGLE_SAPLING, TropicaItem.COCONUT);
            content.addAfter(Items.DARK_OAK_SAPLING, BLACK_MANGROVE_PROPAGULE);
            content.addAfter(Items.HANGING_ROOTS, TropicaBlock.COCONUT_TUFT);
            content.addAfter(Items.WET_SPONGE, TropicaItem.GREEN_COCONUT_BLOCK);
            content.addAfter(TropicaItem.GREEN_COCONUT_BLOCK, TropicaItem.YELLOW_COCONUT_BLOCK);
            content.addAfter(TropicaItem.YELLOW_COCONUT_BLOCK, TropicaItem.BROWN_COCONUT_BLOCK);
            content.addAfter(Items.HORN_CORAL_BLOCK, HAMMER_CORAL_BLOCK);
            content.addAfter(Items.DEAD_HORN_CORAL_BLOCK, DEAD_HAMMER_CORAL_BLOCK);
            content.addAfter(Items.HORN_CORAL, HAMMER_CORAL);
            content.addAfter(Items.DEAD_BRAIN_CORAL, DEAD_HAMMER_CORAL);
            content.addAfter(Items.HORN_CORAL_FAN, HAMMER_CORAL_FAN);
            content.addAfter(Items.DEAD_HORN_CORAL_FAN, DEAD_HAMMER_CORAL_FAN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.JUNGLE_HANGING_SIGN, COCONUT_SIGN);
            content.addAfter(COCONUT_SIGN, COCONUT_HANGING_SIGN_BLOCK);
            content.addAfter(Items.DARK_OAK_HANGING_SIGN, BLACK_MANGROVE_SIGN);
            content.addAfter(BLACK_MANGROVE_SIGN, BLACK_MANGROVE_HANGING_SIGN_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.JUNGLE_BOAT, COCONUT_BOAT);
        });
    }
}
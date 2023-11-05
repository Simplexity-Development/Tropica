package simplexity.tropica.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.sapling.AcaciaSaplingGenerator;
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
import simplexity.tropica.registry.block.sign.*;

import java.util.ArrayList;

import static simplexity.tropica.registry.TropicaItem.COCONUT_BOAT;

public class TropicaBlock {
    
    public static final ArrayList<Block> woodenBlocks = new ArrayList<>();
    public static final ArrayList<Block> nonBurningWoodenBlocks = new ArrayList<>();
    public static final ArrayList<Block> logBlocks = new ArrayList<>();
    public static final ArrayList<Block> highlyFlammableWoodenBlocks = new ArrayList<>();
    public static final ArrayList<Block> coralBlocks = new ArrayList<>();
    public static final ArrayList<Block> coralFans = new ArrayList<>();
    public static final ArrayList<Block> leavesBlocks = new ArrayList<>();
    public static final ArrayList<Block> saplingBlocks = new ArrayList<>();
    public static final ArrayList<Block> plantBlocks = new ArrayList<>();
    public static final ArrayList<Block> stoneBlocks = new ArrayList<>();
    public static final ArrayList<Block> sandBlocks = new ArrayList<>();
    private static final String tropica = Tropica.tropica;
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
    public static final BlockSetType AMARANTH_BLOCK_SET_TYPE = new BlockSetType("amaranth", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType BLACK_MANGROVE_WOOD_TYPE = new WoodType("black_mangrove", BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final WoodType COCONUT_WOOD_TYPE = new WoodType("coconut", COCONUT_BLOCK_SET_TYPE);
    public static final WoodType AMARANTH_WOOD_TYPE = new WoodType("amaranth", AMARANTH_BLOCK_SET_TYPE);
    //Doors
    public static final Block BLACK_MANGROVE_TRAPDOOR = new TrapdoorBlock(trapdoorSettings, BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_DOOR = new DoorBlock(doorSettings, BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block COCONUT_TRAPDOOR = new TrapdoorBlock(trapdoorSettings, COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_DOOR = new DoorBlock(doorSettings, COCONUT_BLOCK_SET_TYPE);
    public static final Block AMARANTH_TRAPDOOR = new TrapdoorBlock(trapdoorSettings, AMARANTH_BLOCK_SET_TYPE);
    public static final Block AMARANTH_DOOR = new DoorBlock(doorSettings, AMARANTH_BLOCK_SET_TYPE);
    
    //Redstone
    public static final Block BLACK_MANGROVE_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, pressurePlateSettings, BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_BUTTON = new ButtonBlock(buttonSettings, BLACK_MANGROVE_BLOCK_SET_TYPE, 30, true);
    public static final Block COCONUT_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, pressurePlateSettings, COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_BUTTON = new ButtonBlock(buttonSettings, AMARANTH_BLOCK_SET_TYPE, 30, true);
    public static final Block AMARANTH_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, pressurePlateSettings, COCONUT_BLOCK_SET_TYPE);
    public static final Block AMARANTH_BUTTON = new ButtonBlock(buttonSettings, AMARANTH_BLOCK_SET_TYPE, 30, true);
    
    //Signs
    public static final Block BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK = new BlackMangroveHangingWallSign(wallHangingSignSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_HANGING_SIGN_BLOCK = new BlackMangroveHangingSign(hangingSignSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_WALL_SIGN = new BlackMangroveWallSign(wallSignSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_SIGN = new BlackMangroveSign(signSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block COCONUT_WALL_HANGING_SIGN_BLOCK = new CoconutHangingWallSign(wallHangingSignSettings, COCONUT_WOOD_TYPE);
    public static final Block COCONUT_HANGING_SIGN_BLOCK = new CoconutHangingSign(hangingSignSettings, COCONUT_WOOD_TYPE);
    public static final Block COCONUT_WALL_SIGN = new CoconutWallSign(wallSignSettings, COCONUT_WOOD_TYPE);
    public static final Block COCONUT_SIGN = new CoconutSign(signSettings, COCONUT_WOOD_TYPE);
    public static final Block AMARANTH_WALL_HANGING_SIGN_BLOCK = new AmaranthHangingWallSign(wallHangingSignSettings, AMARANTH_WOOD_TYPE);
    public static final Block AMARANTH_HANGING_SIGN_BLOCK = new AmaranthHangingSign(hangingSignSettings, AMARANTH_WOOD_TYPE);
    public static final Block AMARANTH_WALL_SIGN = new AmaranthWallSign(wallSignSettings, AMARANTH_WOOD_TYPE);
    public static final Block AMARANTH_SIGN = new AmaranthSign(signSettings, AMARANTH_WOOD_TYPE);
    //Fence
    public static final Block BLACK_MANGROVE_FENCE = new FenceBlock(fenceSettings);
    public static final Block BLACK_MANGROVE_FENCE_GATE = new FenceGateBlock(fenceGateSettings, BLACK_MANGROVE_WOOD_TYPE);
    public static final Block COCONUT_FENCE = new FenceBlock(fenceSettings);
    public static final Block COCONUT_FENCE_GATE = new FenceGateBlock(fenceGateSettings, COCONUT_WOOD_TYPE);
    public static final Block AMARANTH_FENCE = new FenceBlock(fenceSettings);
    public static final Block AMARANTH_FENCE_GATE = new FenceGateBlock(fenceGateSettings, AMARANTH_WOOD_TYPE);
    
    //Logs
    public static final Block BLACK_MANGROVE_LOG = new PillarBlock(logSettings);
    public static final Block STRIPPED_BLACK_MANGROVE_LOG = new PillarBlock(strippedLogSettings);
    public static final Block COCONUT_LOG = new PillarBlock(logSettings);
    public static final Block COCONUT_SHEATH = new PillarBlock(logSettings);
    public static final Block STRIPPED_COCONUT_LOG = new PillarBlock(strippedLogSettings);
    public static final Block AMARANTH_LOG = new PillarBlock(logSettings);
    public static final Block STRIPPED_AMARANTH_LOG = new PillarBlock(strippedLogSettings);
    //Wood
    public static final Block BLACK_MANGROVE_WOOD = new PillarBlock(woodSettings);
    public static final Block STRIPPED_BLACK_MANGROVE_WOOD = new PillarBlock(strippedWoodSettings);
    public static final Block COCONUT_WOOD = new PillarBlock(woodSettings);
    public static final Block COCONUT_SHEATH_WOOD = new PillarBlock(woodSettings);
    public static final Block STRIPPED_COCONUT_WOOD = new PillarBlock(strippedWoodSettings);
    public static final Block AMARANTH_WOOD = new PillarBlock(woodSettings);
    public static final Block STRIPPED_AMARANTH_WOOD = new PillarBlock(strippedWoodSettings);
    //Planks, Slabs, Stairs
    public static final Block BLACK_MANGROVE_PLANKS = new Block(planksSettings);
    public static final Block BLACK_MANGROVE_SLAB = new SlabBlock(slabSettings);
    public static final Block BLACK_MANGROVE_STAIRS = new StairsBlock(defaultStairState, stairsSettings);
    public static final Block COCONUT_PLANKS = new Block(planksSettings);
    public static final Block COCONUT_SLAB = new SlabBlock(slabSettings);
    public static final Block COCONUT_STAIRS = new StairsBlock(defaultStairState, stairsSettings);
    public static final Block AMARANTH_PLANKS = new Block(planksSettings);
    public static final Block AMARANTH_SLAB = new SlabBlock(slabSettings);
    public static final Block AMARANTH_STAIRS = new StairsBlock(defaultStairState, stairsSettings);
    
    //Leaves, Saplings
    public static final Block BLACK_MANGROVE_LEAVES = new Block(leavesSettings);
    public static final Block BLACK_MANGROVE_PROPAGULE = new PropaguleBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PROPAGULE));
    public static final Block COCONUT_LEAVES = new Block(leavesSettings);
    public static final Block COCONUT_SHOOT = new PropaguleBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING));
    public static final Block AMARANTH_LEAVES = new Block(leavesSettings);
    public static final Block AMARANTH_SAPLING = new SaplingBlock(new AcaciaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING));
    
    //Etc
    public static final Block BLACK_MANGROVE_KNEES = new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS).nonOpaque());
    public static final Block BROWN_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block YELLOW_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block GREEN_COCONUT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
    public static final Block COCONUT_TUFT = new Block(FabricBlockSettings.copyOf(Blocks.COCOA).nonOpaque().breakInstantly());
    public static final Block COCONUT_0 = new Block(FabricBlockSettings.copyOf(Blocks.COCOA));
    public static final Block COCONUT_1 = new Block(FabricBlockSettings.copyOf(Blocks.COCOA));
    public static final Block COCONUT_2 = new Block(FabricBlockSettings.copyOf(Blocks.COCOA));
    //sand
    public static final Block WHITE_SAND = new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND).mapColor(DyeColor.WHITE));
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
    public static final Block DEAD_HAMMER_CORAL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_BLOCK));
    public static final Block HAMMER_CORAL_BLOCK = new CoralBlockBlock(DEAD_HAMMER_CORAL_BLOCK, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block DEAD_HAMMER_CORAL = new DeadCoralBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL));
    public static final Block HAMMER_CORAL = new CoralBlock(DEAD_HAMMER_CORAL, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL));
    public static final Block DEAD_HAMMER_CORAL_FAN = new DeadCoralFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_FAN));
    public static final Block HAMMER_CORAL_FAN = new CoralFanBlock(DEAD_HAMMER_CORAL_FAN, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_FAN));
    public static final Block DEAD_HAMMER_CORAL_WALL_FAN = new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_WALL_FAN));
    public static final Block HAMMER_CORAL_WALL_FAN = new CoralWallFanBlock(DEAD_HAMMER_CORAL_WALL_FAN, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_WALL_FAN));
    //Plants
    public static final Block TROPICAL_BUSH = new FernBlock(FabricBlockSettings.copyOf(Blocks.FERN));
    public static final Block LARGE_TROPICAL_BUSH = new TallPlantBlock(FabricBlockSettings.copyOf(Blocks.LARGE_FERN));
    public static final Block BEACH_GRASS = new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS));
    public static final Block TALL_BEACH_GRASS = new GrassBlock(FabricBlockSettings.copyOf(Blocks.TALL_GRASS));
    public static final Block HELICONIA = new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH));
    public static final Block POISONOUS_VINE = new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE));
    public static final Block RED_HIBISCUS = new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY));
    public static final Block WHITE_HIBISCUS = new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY));
    
    private static void registerBlock(String name, Block block, ArrayList<Block> arrayList) {
        Registry.register(Registries.BLOCK, new Identifier(tropica, name), block);
        arrayList.add(block);
    }
    
    public static void registerWoodTypes() {
        WoodTypeMixin.invokeRegister(COCONUT_WOOD_TYPE);
        WoodTypeMixin.invokeRegister(BLACK_MANGROVE_WOOD_TYPE);
        WoodTypeMixin.invokeRegister(AMARANTH_WOOD_TYPE);
    }
    
    public static void setFlammability(ArrayList<Block> arrayList, Block referenceBlock) {
        int burnChance = FlammableBlockRegistry.getDefaultInstance().get(referenceBlock).getBurnChance();
        int spreadChance = FlammableBlockRegistry.getDefaultInstance().get(referenceBlock).getSpreadChance();
        for (Block block : arrayList) {
            FlammableBlockRegistry.getDefaultInstance().add(block, burnChance, spreadChance);
        }
    }
    
    public static void registerBlocksFlammability() {
        setFlammability(woodenBlocks, Blocks.OAK_PLANKS);
        setFlammability(nonBurningWoodenBlocks, Blocks.OAK_BUTTON);
        setFlammability(logBlocks, Blocks.OAK_LOG);
        setFlammability(highlyFlammableWoodenBlocks, Blocks.HAY_BLOCK);
        setFlammability(coralBlocks, Blocks.BRAIN_CORAL_BLOCK);
        setFlammability(coralFans, Blocks.BRAIN_CORAL);
        setFlammability(leavesBlocks, Blocks.OAK_LEAVES);
        setFlammability(saplingBlocks, Blocks.OAK_SAPLING);
        setFlammability(plantBlocks, Blocks.SUNFLOWER);
        setFlammability(stoneBlocks, Blocks.SANDSTONE);
        setFlammability(sandBlocks, Blocks.SAND);
    }
    
    public static void registerModBlocks() {
        //TREE STUFF
        //Doors
        registerBlock("black_mangrove_trapdoor",
                BLACK_MANGROVE_TRAPDOOR,
                woodenBlocks);
        registerBlock("black_mangrove_door",
                BLACK_MANGROVE_DOOR,
                woodenBlocks);
        registerBlock("coconut_trapdoor",
                COCONUT_TRAPDOOR,
                woodenBlocks);
        registerBlock("coconut_door",
                COCONUT_DOOR,
                woodenBlocks);
        registerBlock("amaranth_trapdoor",
                AMARANTH_TRAPDOOR,
                woodenBlocks);
        registerBlock("amaranth_door",
                AMARANTH_DOOR,
                woodenBlocks);
        //Redstone
        registerBlock("black_mangrove_pressure_plate",
                BLACK_MANGROVE_PRESSURE_PLATE,
                nonBurningWoodenBlocks);
        registerBlock("black_mangrove_button",
                BLACK_MANGROVE_BUTTON,
                nonBurningWoodenBlocks);
        registerBlock("coconut_pressure_plate",
                COCONUT_PRESSURE_PLATE,
                nonBurningWoodenBlocks);
        registerBlock("coconut_button",
                COCONUT_BUTTON,
                nonBurningWoodenBlocks);
        registerBlock("amaranth_pressure_plate",
                AMARANTH_PRESSURE_PLATE,
                nonBurningWoodenBlocks);
        registerBlock("amaranth_button",
                AMARANTH_BUTTON,
                nonBurningWoodenBlocks);
        //Signs
        registerBlock("black_mangrove_sign",
                BLACK_MANGROVE_SIGN,
                nonBurningWoodenBlocks);
        registerBlock("black_mangrove_wall_sign",
                BLACK_MANGROVE_WALL_SIGN,
                nonBurningWoodenBlocks);
        registerBlock("black_mangrove_hanging_sign",
                BLACK_MANGROVE_HANGING_SIGN_BLOCK,
                nonBurningWoodenBlocks);
        registerBlock("black_mangrove_wall_hanging_sign",
                BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK,
                nonBurningWoodenBlocks);
        registerBlock("coconut_sign",
                COCONUT_SIGN,
                nonBurningWoodenBlocks);
        registerBlock("coconut_wall_sign",
                COCONUT_WALL_SIGN,
                nonBurningWoodenBlocks);
        registerBlock("coconut_hanging_sign",
                COCONUT_HANGING_SIGN_BLOCK,
                nonBurningWoodenBlocks);
        registerBlock("coconut_wall_hanging_sign",
                COCONUT_WALL_HANGING_SIGN_BLOCK,
                nonBurningWoodenBlocks);
        registerBlock("amaranth_sign",
                AMARANTH_SIGN,
                nonBurningWoodenBlocks);
        registerBlock("amaranth_wall_sign",
                AMARANTH_WALL_SIGN,
                nonBurningWoodenBlocks);
        registerBlock("amaranth_hanging_sign",
                AMARANTH_HANGING_SIGN_BLOCK,
                nonBurningWoodenBlocks);
        registerBlock("amaranth_wall_hanging_sign",
                AMARANTH_WALL_HANGING_SIGN_BLOCK,
                nonBurningWoodenBlocks);
        //Fence
        registerBlock("black_mangrove_fence",
                BLACK_MANGROVE_FENCE,
                woodenBlocks);
        registerBlock("black_mangrove_fence_gate",
                BLACK_MANGROVE_FENCE_GATE,
                woodenBlocks);
        registerBlock("coconut_fence",
                COCONUT_FENCE,
                woodenBlocks);
        registerBlock("coconut_fence_gate",
                COCONUT_FENCE_GATE,
                woodenBlocks);
        registerBlock("amaranth_fence",
                AMARANTH_FENCE,
                woodenBlocks);
        registerBlock("amaranth_fence_gate",
                AMARANTH_FENCE_GATE,
                woodenBlocks);
        //Log
        registerBlock("black_mangrove_log",
                BLACK_MANGROVE_LOG,
                logBlocks);
        registerBlock("stripped_black_mangrove_log",
                STRIPPED_BLACK_MANGROVE_LOG,
                logBlocks);
        registerBlock("coconut_log",
                COCONUT_LOG,
                logBlocks);
        registerBlock("coconut_sheath",
                COCONUT_SHEATH,
                highlyFlammableWoodenBlocks);
        registerBlock("stripped_coconut_log",
                STRIPPED_COCONUT_LOG,
                logBlocks);
        registerBlock("amaranth_log",
                AMARANTH_LOG,
                logBlocks);
        registerBlock("stripped_amaranth_log",
                STRIPPED_AMARANTH_LOG,
                logBlocks);
        //Wood
        registerBlock("black_mangrove_wood",
                BLACK_MANGROVE_WOOD,
                logBlocks);
        registerBlock("stripped_black_mangrove_wood",
                STRIPPED_BLACK_MANGROVE_WOOD,
                logBlocks);
        registerBlock("coconut_wood",
                COCONUT_WOOD,
                logBlocks);
        registerBlock("coconut_sheath_wood",
                COCONUT_SHEATH_WOOD,
                highlyFlammableWoodenBlocks);
        registerBlock("stripped_coconut_wood",
                STRIPPED_COCONUT_WOOD,
                logBlocks);
        registerBlock("amaranth_wood",
                AMARANTH_WOOD,
                logBlocks);
        registerBlock("stripped_amaranth_wood",
                STRIPPED_AMARANTH_WOOD,
                logBlocks);
        //Planks/Slabs/Stairs
        registerBlock("black_mangrove_planks",
                BLACK_MANGROVE_PLANKS,
                woodenBlocks);
        registerBlock("black_mangrove_slab",
                BLACK_MANGROVE_SLAB,
                woodenBlocks);
        registerBlock("black_mangrove_stairs",
                BLACK_MANGROVE_STAIRS,
                woodenBlocks);
        registerBlock("coconut_planks",
                COCONUT_PLANKS,
                woodenBlocks);
        registerBlock("coconut_slab",
                COCONUT_SLAB,
                woodenBlocks);
        registerBlock("coconut_stairs",
                COCONUT_STAIRS,
                woodenBlocks);
        registerBlock("amaranth_planks",
                AMARANTH_PLANKS,
                woodenBlocks);
        registerBlock("amaranth_slab",
                AMARANTH_SLAB,
                woodenBlocks);
        registerBlock("amaranth_stairs",
                AMARANTH_STAIRS,
                woodenBlocks);
        //Leaves/saplings
        registerBlock("black_mangrove_leaves",
                BLACK_MANGROVE_LEAVES,
                leavesBlocks);
        registerBlock("black_mangrove_propagule",
                BLACK_MANGROVE_PROPAGULE,
                saplingBlocks);
        registerBlock("coconut_leaves",
                COCONUT_LEAVES,
                leavesBlocks);
        registerBlock("coconut_shoot",
                COCONUT_SHOOT,
                saplingBlocks);
        registerBlock("amaranth_leaves",
                AMARANTH_LEAVES,
                leavesBlocks);
        registerBlock("amaranth_sapling",
                AMARANTH_SAPLING,
                saplingBlocks);
        //Tree ETC
        registerBlock("black_mangrove_knees",
                BLACK_MANGROVE_KNEES,
                woodenBlocks);
        registerBlock("brown_coconut_block",
                BROWN_COCONUT_BLOCK,
                woodenBlocks);
        registerBlock("yellow_coconut_block",
                YELLOW_COCONUT_BLOCK,
                woodenBlocks);
        registerBlock("green_coconut_block",
                GREEN_COCONUT_BLOCK,
                woodenBlocks);
        registerBlock("coconut_tuft",
                COCONUT_TUFT,
                plantBlocks);
        registerBlock("coconut_0",
                COCONUT_0,
                plantBlocks);
        registerBlock("coconut_1",
                COCONUT_1,
                plantBlocks);
        registerBlock("coconut_2",
                COCONUT_2,
                plantBlocks);
        // Sand & sandstone
        registerBlock("white_sand",
                WHITE_SAND,
                sandBlocks);
        registerBlock("black_sand",
                BLACK_SAND,
                sandBlocks);
        registerBlock("black_sandstone",
                BLACK_SANDSTONE,
                stoneBlocks);
        registerBlock("black_sandstone_stairs",
                BLACK_SANDSTONE_STAIRS,
                stoneBlocks);
        registerBlock("black_sandstone_slab",
                BLACK_SANDSTONE_SLAB,
                stoneBlocks);
        registerBlock("black_sandstone_wall",
                BLACK_SANDSTONE_WALL,
                stoneBlocks);
        registerBlock("cut_black_sandstone",
                CUT_BLACK_SANDSTONE,
                stoneBlocks);
        registerBlock("cut_black_sandstone_slab",
                CUT_BLACK_SANDSTONE_SLAB,
                stoneBlocks);
        registerBlock("smooth_black_sandstone",
                SMOOTH_BLACK_SANDSTONE,
                stoneBlocks);
        registerBlock("smooth_black_sandstone_stairs",
                SMOOTH_BLACK_SANDSTONE_STAIRS,
                stoneBlocks);
        registerBlock("smooth_black_sandstone_slab",
                SMOOTH_BLACK_SANDSTONE_SLAB,
                stoneBlocks);
        registerBlock("chiseled_black_sandstone",
                CHISELED_BLACK_SANDSTONE,
                stoneBlocks);
        // Coral
        registerBlock("dead_hammer_coral_block",
                DEAD_HAMMER_CORAL_BLOCK,
                coralBlocks);
        registerBlock("hammer_coral_block",
                HAMMER_CORAL_BLOCK,
                coralBlocks);
        registerBlock("dead_hammer_coral",
                DEAD_HAMMER_CORAL,
                coralFans);
        registerBlock("hammer_coral",
                HAMMER_CORAL,
                coralFans);
        registerBlock("dead_hammer_coral_fan",
                DEAD_HAMMER_CORAL_FAN,
                coralFans);
        registerBlock("hammer_coral_fan",
                HAMMER_CORAL_FAN,
                coralFans);
        registerBlock("dead_hammer_coral_wall_fan",
                DEAD_HAMMER_CORAL_WALL_FAN,
                coralFans);
        registerBlock("hammer_coral_wall_fan",
                HAMMER_CORAL_WALL_FAN,
                coralFans);
        registerBlock("tropical_bush",
                TROPICAL_BUSH,
                plantBlocks);
        registerBlock("large_tropical_bush",
                LARGE_TROPICAL_BUSH,
                plantBlocks);
        registerBlock("beach_grass",
                BEACH_GRASS,
                plantBlocks);
        registerBlock("tall_beach_grass",
                TALL_BEACH_GRASS,
                plantBlocks);
        registerBlock("heliconia",
                HELICONIA,
                plantBlocks);
        registerBlock("poisonous_vine",
                POISONOUS_VINE,
                plantBlocks);
        registerBlock("red_hibiscus",
                RED_HIBISCUS,
                plantBlocks);
        registerBlock("white_hibiscus",
                WHITE_HIBISCUS,
                plantBlocks);
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
            content.addAfter(COCONUT_BUTTON, AMARANTH_LOG);
            content.addAfter(AMARANTH_LOG, AMARANTH_WOOD);
            content.addAfter(AMARANTH_WOOD, STRIPPED_AMARANTH_LOG);
            content.addAfter(STRIPPED_AMARANTH_LOG, STRIPPED_AMARANTH_WOOD);
            content.addAfter(STRIPPED_AMARANTH_WOOD, AMARANTH_PLANKS);
            content.addAfter(AMARANTH_PLANKS, AMARANTH_STAIRS);
            content.addAfter(AMARANTH_STAIRS, AMARANTH_SLAB);
            content.addAfter(AMARANTH_SLAB, AMARANTH_FENCE);
            content.addAfter(AMARANTH_FENCE, AMARANTH_FENCE_GATE);
            content.addAfter(AMARANTH_FENCE_GATE, AMARANTH_DOOR);
            content.addAfter(AMARANTH_DOOR, AMARANTH_TRAPDOOR);
            content.addAfter(AMARANTH_TRAPDOOR, AMARANTH_PRESSURE_PLATE);
            content.addAfter(AMARANTH_PRESSURE_PLATE, AMARANTH_BUTTON);
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
            content.addAfter(Items.RED_SANDSTONE, WHITE_SAND);
            content.addAfter(WHITE_SAND, BLACK_SAND);
            content.addAfter(BLACK_SAND, BLACK_SANDSTONE);
            content.addAfter(Items.JUNGLE_LOG, COCONUT_SHEATH);
            content.addAfter(COCONUT_SHEATH, COCONUT_LOG);
            content.addAfter(Items.JUNGLE_LEAVES, COCONUT_LEAVES);
            content.addAfter(COCONUT_LEAVES, AMARANTH_LEAVES);
            content.addAfter(Items.DARK_OAK_LOG, BLACK_MANGROVE_LOG);
            content.addAfter(Items.DARK_OAK_LEAVES, BLACK_MANGROVE_LEAVES);
            content.addAfter(Items.JUNGLE_SAPLING, TropicaItem.COCONUT);
            content.addAfter(TropicaItem.COCONUT, AMARANTH_SAPLING);
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
            content.addAfter(Items.TORCHFLOWER, WHITE_HIBISCUS);
            content.addAfter(WHITE_HIBISCUS, RED_HIBISCUS);
            content.addAfter(Items.PITCHER_PLANT, HELICONIA);
            content.addAfter(Items.GRASS, BEACH_GRASS);
            content.addAfter(Items.FERN, TROPICAL_BUSH);
            content.addAfter(Items.TALL_GRASS, TALL_BEACH_GRASS);
            content.addAfter(Items.LARGE_FERN, LARGE_TROPICAL_BUSH);
            content.addAfter(Items.VINE, POISONOUS_VINE);
            
            
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.JUNGLE_HANGING_SIGN, COCONUT_SIGN);
            content.addAfter(COCONUT_SIGN, COCONUT_HANGING_SIGN_BLOCK);
            content.addAfter(COCONUT_HANGING_SIGN_BLOCK, AMARANTH_SIGN);
            content.addAfter(AMARANTH_SIGN, AMARANTH_HANGING_SIGN_BLOCK);
            content.addAfter(Items.DARK_OAK_HANGING_SIGN, BLACK_MANGROVE_SIGN);
            content.addAfter(BLACK_MANGROVE_SIGN, BLACK_MANGROVE_HANGING_SIGN_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.JUNGLE_BOAT, COCONUT_BOAT);
        });
    }
}

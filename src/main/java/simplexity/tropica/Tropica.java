package simplexity.tropica;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tropica implements ModInitializer {
    
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("tropica");
    public static final String tropica = "tropica";
    public static final FabricBlockSettings logBlockSettings = FabricBlockSettings.create()
            .resistance(2.0f).strength(2.0f).burnable().sounds(BlockSoundGroup.WOOD);
    
    //Items
//    public static final Item BLACK_MANGROVE_BOAT = new Item(new FabricItemSettings().maxCount(1));
//    public static final Item BLACK_MANGROVE_CHEST_BOAT = new Item(new FabricItemSettings().maxCount(1));
//    public static final Item BLACK_MANGROVE_DOOR_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item BLACK_MANGROVE_BUTTON_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item BLACK_MANGROVE_PRESSURE_PLATE_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item BLACK_MANGROVE_FENCE_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item BLACK_MANGROVE_FENCE_GATE_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item BLACK_MANGROVE_HANGING_SIGN = new Item(new FabricItemSettings().maxCount(16));
//    public static final Item BLACK_MANGROVE_PROPAGULE_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item BLACK_MANGROVE_SIGN = new Item(new FabricItemSettings().maxCount(16));
//    public static final Item COCONUT = new Item(new FabricItemSettings().maxCount(16));
//    public static final Item COCONUT_BOAT = new Item(new FabricItemSettings().maxCount(1));
//    public static final Item COCONUT_CHEST_BOAT = new Item(new FabricItemSettings().maxCount(1));
//    public static final Item COCONUT_DOOR_ITEM = new Item(new FabricItemSettings().maxCount(64));
//    public static final Item COCONUT_HANGING_SIGN = new Item(new FabricItemSettings().maxCount(16));
//    public static final Item COCONUT_SIGN = new Item(new FabricItemSettings().maxCount(16));
//    public static final Item COCONUT_SLICE = new Item(new FabricItemSettings().maxCount(16));
    
    // Blocks
    public static final BlockSetType BLACK_MANGROVE_BLOCK_SET_TYPE = new BlockSetType("black_mangrove", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType COCONUT_BLOCK_SET_TYPE = new BlockSetType("black_mangrove", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType COCONUT_WOOD_TYPE = new WoodType("coconut", COCONUT_BLOCK_SET_TYPE);
    public static final WoodType BLACK_MANGROVE_WOOD_TYPE = new WoodType("black_mangrove", BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_DOOR = new DoorBlock(FabricBlockSettings.create().strength(3.0f), BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().strength(0.5f), BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BLACK_MANGROVE_BUTTON = new ButtonBlock(FabricBlockSettings.create().strength(0.5f), BLACK_MANGROVE_BLOCK_SET_TYPE, 30, true);
    public static final Block BLACK_MANGROVE_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.create().strength(2.0f), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_FENCE = new FenceBlock(FabricBlockSettings.create().strength(2.0f));
    public static final Block BLACK_MANGROVE_SIGN_BLOCK = new SignBlock(FabricBlockSettings.create().strength(1.0f), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_HANGING_SIGN_BLOCK = new HangingSignBlock(FabricBlockSettings.create().strength(1.0f), BLACK_MANGROVE_WOOD_TYPE);
    public static final Block BLACK_MANGROVE_PLANKS = new Block(FabricBlockSettings.create().strength(2.0f));
    public static final Block BLACK_MANGROVE_KNEES = new Block(FabricBlockSettings.create().strength(0.7f));
    public static final Block BLACK_MANGROVE_LEAVES = new Block(FabricBlockSettings.create().strength(0.2f));
    public static final Block BLACK_MANGROVE_LOG = new PillarBlock(logBlockSettings);
    public static final Block STRIPPED_BLACK_MANGROVE_LOG = new PillarBlock(FabricBlockSettings.create().strength(2.0f));
    public static final Block STRIPPED_BLACK_MANGROVE_WOOD = new Block(FabricBlockSettings.create().strength(2.0f));
    public static final Block BLACK_MANGROVE_HANGING_PROPAGULE = new Block(FabricBlockSettings.create().strength(0.1f));
    public static final Block BLACK_MANGROVE_PROPAGULE_BLOCK = new Block(FabricBlockSettings.create().strength(0.1f));
    public static final Block BLACK_MANGROVE_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.create().strength(3.0f), BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final Block BROWN_COCONUT_BLOCK = new Block(FabricBlockSettings.create().strength(0.5f));
    public static final Block YELLOW_COCONUT_BLOCK = new Block(FabricBlockSettings.create().strength(0.5f));
    public static final Block GREEN_COCONUT_BLOCK = new Block(FabricBlockSettings.create().strength(0.5f));
    public static final Block COCONUT_BERRY = new PlantBlock(FabricBlockSettings.create().strength(0.2f));
    public static final Block COCONUT_DOOR = new DoorBlock(FabricBlockSettings.create().strength(3.0f), COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().strength(0.5f), COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_BUTTON = new ButtonBlock(FabricBlockSettings.create().strength(0.5f), COCONUT_BLOCK_SET_TYPE, 30, true);
    public static final Block COCONUT_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.create().strength(2.0f), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_FENCE = new FenceBlock(FabricBlockSettings.create().strength(2.0f));
    public static final Block COCONUT_SIGN_BLOCK = new SignBlock(FabricBlockSettings.create().strength(1.0f), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_HANGING_SIGN_BLOCK = new HangingSignBlock(FabricBlockSettings.create().strength(1.0f), COCONUT_WOOD_TYPE);
    public static final Block COCONUT_PLANKS = new Block(FabricBlockSettings.create().strength(2.0f));
    public static final Block COCONUT_LEAVES = new LeavesBlock(FabricBlockSettings.create().strength(0.2f));
    public static final Block COCONUT_LOG = new PillarBlock(FabricBlockSettings.create().strength(2.0f));
    public static final Block COCONUT_WOOD = new Block(FabricBlockSettings.create().strength(2.0f));
    public static final Block STRIPPED_COCONUT_LOG = new PillarBlock(FabricBlockSettings.create().strength(2.0f));
    public static final Block STRIPPED_COCONUT_WOOD = new Block(FabricBlockSettings.create().strength(2.0f));
    public static final Block COCONUT_SHEATH = new Block(FabricBlockSettings.create().strength(1.5f));
    public static final Block COCONUT_SHEATH_WOOD = new Block(FabricBlockSettings.create().strength(1.5f));
    public static final Block COCONUT_SHOOT = new Block(FabricBlockSettings.create().strength(0.0f));
    public static final Block COCONUT_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.create().strength(2.0f), COCONUT_BLOCK_SET_TYPE);
    public static final Block COCONUT_TUFT = new Block(FabricBlockSettings.create().strength(0.0f));
    
    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_door"), BLACK_MANGROVE_DOOR);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_pressure_plate"), BLACK_MANGROVE_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_button"), BLACK_MANGROVE_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_fence_gate"), BLACK_MANGROVE_FENCE_GATE );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_fence"), BLACK_MANGROVE_FENCE );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_sign"), BLACK_MANGROVE_SIGN_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_hanging_sign"), BLACK_MANGROVE_HANGING_SIGN_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_planks"), BLACK_MANGROVE_PLANKS );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_knees"), BLACK_MANGROVE_KNEES );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_leaves"), BLACK_MANGROVE_LEAVES );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_log"), BLACK_MANGROVE_LOG );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_black_mangrove_log"), STRIPPED_BLACK_MANGROVE_LOG );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_black_mangrove_wood"), STRIPPED_BLACK_MANGROVE_WOOD );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_hanging_propagule"), BLACK_MANGROVE_HANGING_PROPAGULE );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_propagule"), BLACK_MANGROVE_PROPAGULE_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "black_mangrove_trapdoor"), BLACK_MANGROVE_TRAPDOOR );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "brown_coconut_block"), BROWN_COCONUT_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "yellow_coconut_block"), YELLOW_COCONUT_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "green_coconut_block"), GREEN_COCONUT_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_berry"), COCONUT_BERRY );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_door"), COCONUT_DOOR);
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_pressure_plate"), COCONUT_PRESSURE_PLATE );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_button"), COCONUT_BUTTON );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_fence_gate"), COCONUT_FENCE_GATE );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_fence"), COCONUT_FENCE );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_sign_block"), COCONUT_SIGN_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_hanging_sign"), COCONUT_HANGING_SIGN_BLOCK );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_planks"), COCONUT_PLANKS );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_leaves"), COCONUT_LEAVES );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_log"), COCONUT_LOG );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_wood"), COCONUT_WOOD );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_coconut_log"), STRIPPED_COCONUT_LOG );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "stripped_coconut_wood"), STRIPPED_COCONUT_WOOD );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_sheath"), COCONUT_SHEATH );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_sheath_wood"), COCONUT_SHEATH_WOOD );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_shoot"), COCONUT_SHOOT );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_trapdoor"), COCONUT_TRAPDOOR );
        Registry.register(Registries.BLOCK, new Identifier(tropica, "coconut_tuft"), COCONUT_TUFT );

        Registry.register(Registries.ITEM, new Identifier(tropica, "black_mangrove_log"), new BlockItem(BLACK_MANGROVE_LOG, new FabricItemSettings().maxCount(64)));
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        
        LOGGER.info("Hello Fabric world!");
    }
}
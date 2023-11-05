package simplexity.tropica.registry.block.wood;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;

import java.util.concurrent.CompletableFuture;

public class TropicaWoodSetRegistry {
    
    private static final String modId = Tropica.tropica;
    //Block tags
    // log tags
    private static final TagKey<Block> COMPLETES_FIND_TREE_TUTORIAL = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:completes_find_tree_tutorial"));
    private static final TagKey<Block> LAVA_POOL_STONE_CANNOT_REPLACE = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:lava_pool_stone_cannot_replace"));
    private static final TagKey<Block> LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:logs"));
    private static final TagKey<Block> LOGS_THAT_BURN = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:logs_that_burn"));
    private static final TagKey<Block> OVERWORLD_NATURAL_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:overworld_natural_logs"));
    // Leaves tags
    private static final TagKey<Block> LEAVES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:leaves"));
    private static final TagKey<Block> PARROTS_SPAWNABLE_ON = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:parrots_spawnable_on"));
    //
    private static final TagKey<Block> SAPLINGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:saplings"));
    private static final TagKey<Block> FLOWER_POTS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:flower_pots"));
    //
    private static final TagKey<Block> BUTTONS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:buttons"));
    private static final TagKey<Block> WOODEN_BUTTONS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_buttons"));
    private static final TagKey<Block> PRESSURE_PLATES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:pressure_plates"));
    private static final TagKey<Block> WOODEN_PRESSURE_PLATES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_pressure_plates"));
    private static final TagKey<Block> DOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:doors"));
    private static final TagKey<Block> WOODEN_DOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_doors"));
    private static final TagKey<Block> PLANKS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:planks"));
    private static final TagKey<Block> SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:slabs"));
    private static final TagKey<Block> WOODEN_SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_slabs"));
    private static final TagKey<Block> STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:stairs"));
    private static final TagKey<Block> WOODEN_STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_stairs"));
    private static final TagKey<Block> FENCES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:fences"));
    private static final TagKey<Block> WOODEN_FENCES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_fences"));
    private static final TagKey<Block> FENCE_GATES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:fence_gates"));
    private static final TagKey<Block> TRAPDOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:trapdoors"));
    private static final TagKey<Block> WOODEN_TRAPDOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_trapdoors"));
    
    

    
    public static void registerWoodSet(String woodType, String saplingName) {
        // Register logs, planks, stairs, doors, saplings, and any other related blocks
        BlockSetType blockSetType = new BlockSetType(woodType, true, BlockSoundGroup.WOOD,
                SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
                SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
                SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
        WoodType minecraftWoodType = new WoodType(woodType, blockSetType);
        Block log = registerBlock((woodType + "_log"),
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
        Block strippedLog = registerBlock(("stripped_" + woodType + "_log"),
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)))
        Block wood = registerBlock((woodType + "_wood"),
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
        Block strippedWood = registerBlock(("stripped_" + woodType + "_wood"),
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)))
        Block plank = registerBlock((woodType + "_planks"),
                new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
        Block slab = registerBlock((woodType + "_slab"),
                new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));
        Block stairs = registerBlock((woodType + "_stairs"),
                new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
        Block door = registerBlock((woodType + "_door"),
                new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), blockSetType);
        Block trapdoor = registerBlock((woodType + "_trapdoor"),
                new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), blockSetType))
        Block sapling = registerBlock((woodType + saplingName),
                new Block(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
        Block button = registerBlock((woodType + "_button"),
                new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), blockSetType, 30, true));
        Block pressurePlate = registerBlock((woodType + "_pressure_plate"),
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), blockSetType));
        Block fence = registerBlock((woodType + "_fence"),
                new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
        Block fenceGate = registerBlock((woodType + "_fence_gate"),
                new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), minecraftWoodType));
        Block leaves = registerBlock((woodType + "_leaves"),
                new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
        Block pottedSapling = registerBlock(("potted_" + saplingName),
                new FlowerPotBlock(sapling, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
        
        // Register block items for blocks that should have them
        registerBlockItem(log, (woodType + "_log"));
        registerBlockItem(strippedLog, ("stripped_" + woodType + "_log"));
        registerBlockItem(wood, (woodType + "_wood"));
        registerBlockItem(strippedWood, ("stripped_" + woodType + "_wood"));
        registerBlockItem(plank, (woodType + "_planks"));
        registerBlockItem(slab, (woodType + "_slab"));
        registerBlockItem(stairs, (woodType + "_stairs"));
        registerBlockItem(door, (woodType + "_door"));
        registerBlockItem(trapdoor, (woodType + "_trapdoor"));
        registerBlockItem(sapling, saplingName);
        registerBlockItem(button, (woodType + "_button"));
        registerBlockItem(pressurePlate, (woodType + "_pressure_plate"));
        registerBlockItem(fence, (woodType + "_fence"));
        registerBlockItem(fenceGate, (woodType + "_fence_gate"));
        registerBlockItem(leaves, (woodType + "_leaves"));
    }
    
    private static Block registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(modId, name), block);
        return block;
    }
    
    private static void registerBlockItem(Block block, String name) {
        Registry.register(Registries.ITEM, new Identifier(modId, name), new BlockItem(block, new Item.Settings().maxCount(64)));
    }
    
}

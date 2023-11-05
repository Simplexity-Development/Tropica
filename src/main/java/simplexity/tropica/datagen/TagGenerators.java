package simplexity.tropica.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import simplexity.tropica.registry.TropicaBlock;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class TagGenerators extends FabricTagProvider.BlockTagProvider {
    
    private static final TagKey<Block> CEILING_HANGING_SIGNS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:ceiling_hanging_signs"));
    private static final TagKey<Block> COMPLETES_FIND_TREE_TUTORIAL = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:completes_find_tree_tutorial"));
    private static final TagKey<Block> CORAL_BLOCKS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:coral_blocks"));
    private static final TagKey<Block> CORAL_PLANTS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:coral_plants"));
    private static final TagKey<Block> CORALS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:corals"));
    private static final TagKey<Block> LAVA_POOL_STONE_CANNOT_REPLACE = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:lava_pool_stone_cannot_replace"));
    private static final TagKey<Block> LEAVES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:leaves"));
    private static final TagKey<Block> LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:logs"));
    private static final TagKey<Block> LOGS_THAT_BURN = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:logs_that_burn"));
    private static final TagKey<Block> OVERWORLD_NATURAL_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:overworld_natural_logs"));
    private static final TagKey<Block> PARROTS_SPAWNABLE_ON = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:parrots_spawnable_on"));
    private static final TagKey<Block> PLANKS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:planks"));
    private static final TagKey<Block> SAND = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:sand"));
    private static final TagKey<Block> SMELTS_TO_GLASS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:smelts_to_glass"));
    private static final TagKey<Block> SNAPS_GOAT_HORN = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:snaps_goat_horn"));
    private static final TagKey<Block> STANDING_SIGNS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:standing_signs"));
    private static final TagKey<Block> WALL_HANGING_SIGNS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wall_hanging_signs"));
    private static final TagKey<Block> WALLS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:walls"));
    private static final TagKey<Block> WALL_SIGNS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wall_signs"));
    private static final TagKey<Block> WOODEN_BUTTONS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_buttons"));
    private static final TagKey<Block> WOODEN_DOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_doors"));
    private static final TagKey<Block> WOODEN_FENCES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_fences"));
    private static final TagKey<Block> WOODEN_PRESSURE_PLATES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_pressure_plates"));
    private static final TagKey<Block> WOODEN_SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_slabs"));
    private static final TagKey<Block> WOODEN_STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_stairs"));
    private static final TagKey<Block> WOODEN_TRAPDOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:wooden_trapdoors"));
    private static final TagKey<Block> STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:stairs"));
    private static final TagKey<Block> SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:slabs"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> MINEABLE_PICKAXE = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:mineable/pickaxe"));
    private static final TagKey<Block> MINEABLE_SHOVEL = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:mineable/shovel"));
    private static final TagKey<Block> MINEABLE_HOE = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:mineable/hoe"));
    private static final TagKey<Block> COCONUT_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("tropica:coconut_logs"));
    private static final TagKey<Block> BLACK_MANGROVE_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("tropica:black_mangrove_logs"));
    private static final TagKey<Block> AMARANTH_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("tropica:amaranth_logs"));
    public TagGenerators(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(COCONUT_LOGS)
                .add(TropicaBlock.COCONUT_LOG)
                .add(TropicaBlock.STRIPPED_COCONUT_LOG)
                .add(TropicaBlock.COCONUT_WOOD)
                .add(TropicaBlock.STRIPPED_COCONUT_WOOD);
        getOrCreateTagBuilder(BLACK_MANGROVE_LOGS)
                .add(TropicaBlock.BLACK_MANGROVE_LOG)
                .add(TropicaBlock.STRIPPED_BLACK_MANGROVE_LOG)
                .add(TropicaBlock.BLACK_MANGROVE_WOOD)
                .add(TropicaBlock.STRIPPED_BLACK_MANGROVE_WOOD);
        getOrCreateTagBuilder(AMARANTH_LOGS)
                .add(TropicaBlock.AMARANTH_LOG)
                .add(TropicaBlock.STRIPPED_AMARANTH_LOG)
                .add(TropicaBlock.AMARANTH_WOOD)
                .add(TropicaBlock.STRIPPED_AMARANTH_WOOD);
        getOrCreateTagBuilder(CEILING_HANGING_SIGNS)
                .add(TropicaBlock.BLACK_MANGROVE_HANGING_SIGN_BLOCK)
                .add(TropicaBlock.COCONUT_HANGING_SIGN_BLOCK);
        getOrCreateTagBuilder(WALL_HANGING_SIGNS)
                .add(TropicaBlock.BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK)
                .add(TropicaBlock.COCONUT_WALL_HANGING_SIGN_BLOCK);
        getOrCreateTagBuilder(WALL_SIGNS)
                .add(TropicaBlock.BLACK_MANGROVE_WALL_SIGN)
                .add(TropicaBlock.COCONUT_WALL_SIGN);
        getOrCreateTagBuilder(STANDING_SIGNS)
                .add(TropicaBlock.BLACK_MANGROVE_SIGN)
                .add(TropicaBlock.COCONUT_SIGN);
        getOrCreateTagBuilder(PLANKS)
                .add(TropicaBlock.BLACK_MANGROVE_PLANKS)
                .add(TropicaBlock.COCONUT_PLANKS);
        getOrCreateTagBuilder(WOODEN_BUTTONS)
                .add(TropicaBlock.BLACK_MANGROVE_BUTTON)
                .add(TropicaBlock.COCONUT_BUTTON);
        getOrCreateTagBuilder(WOODEN_DOORS)
                .add(TropicaBlock.BLACK_MANGROVE_DOOR)
                .add(TropicaBlock.COCONUT_DOOR);
        getOrCreateTagBuilder(WOODEN_FENCES)
                .add(TropicaBlock.BLACK_MANGROVE_FENCE)
                .add(TropicaBlock.COCONUT_FENCE);
        getOrCreateTagBuilder(WOODEN_PRESSURE_PLATES)
                .add(TropicaBlock.BLACK_MANGROVE_PRESSURE_PLATE)
                .add(TropicaBlock.COCONUT_PRESSURE_PLATE);
        getOrCreateTagBuilder(WOODEN_SLABS)
                .add(TropicaBlock.BLACK_MANGROVE_SLAB)
                .add(TropicaBlock.COCONUT_SLAB);
        getOrCreateTagBuilder(WOODEN_STAIRS)
                .add(TropicaBlock.BLACK_MANGROVE_STAIRS)
                .add(TropicaBlock.COCONUT_STAIRS);
        getOrCreateTagBuilder(SLABS)
                .add(TropicaBlock.BLACK_MANGROVE_SLAB)
                .add(TropicaBlock.COCONUT_SLAB)
                .add(TropicaBlock.BLACK_MANGROVE_SLAB)
                .add(TropicaBlock.CUT_BLACK_SANDSTONE_SLAB);
        getOrCreateTagBuilder(STAIRS)
                .add(TropicaBlock.BLACK_MANGROVE_STAIRS)
                .add(TropicaBlock.COCONUT_STAIRS)
                .add(TropicaBlock.BLACK_SANDSTONE_STAIRS)
                .add(TropicaBlock.SMOOTH_BLACK_SANDSTONE_STAIRS);
        getOrCreateTagBuilder(WOODEN_TRAPDOORS)
                .add(TropicaBlock.BLACK_MANGROVE_TRAPDOOR)
                .add(TropicaBlock.COCONUT_TRAPDOOR);
        getOrCreateTagBuilder(WALLS)
                .add(TropicaBlock.BLACK_SANDSTONE_WALL);
        getOrCreateTagBuilder(OVERWORLD_NATURAL_LOGS)
                .add(TropicaBlock.COCONUT_LOG)
                .add(TropicaBlock.BLACK_MANGROVE_LOG);
        getOrCreateTagBuilder(CORAL_PLANTS)
                .add(TropicaBlock.HAMMER_CORAL);
        getOrCreateTagBuilder(CORALS)
                .add(TropicaBlock.HAMMER_CORAL)
                .add(TropicaBlock.HAMMER_CORAL_FAN);
        getOrCreateTagBuilder(CORAL_BLOCKS)
                .add(TropicaBlock.HAMMER_CORAL_BLOCK);
        getOrCreateTagBuilder(LAVA_POOL_STONE_CANNOT_REPLACE)
                .add(TropicaBlock.COCONUT_LOG)
                .add(TropicaBlock.BLACK_MANGROVE_LOG);
        getOrCreateTagBuilder(SNAPS_GOAT_HORN)
                .add(TropicaBlock.COCONUT_LOG)
                .add(TropicaBlock.BLACK_MANGROVE_LOG);
        getOrCreateTagBuilder(PARROTS_SPAWNABLE_ON)
                .add(TropicaBlock.COCONUT_LOG)
                .add(TropicaBlock.BLACK_MANGROVE_LOG);
        
        
        addArrayListBlocksToTag(TropicaBlock.leavesBlocks, PARROTS_SPAWNABLE_ON);
        addArrayListBlocksToTag(TropicaBlock.woodenBlocks, MINEABLE_AXE);
        addArrayListBlocksToTag(TropicaBlock.logBlocks, MINEABLE_AXE);
        addArrayListBlocksToTag(TropicaBlock.nonBurningWoodenBlocks, MINEABLE_AXE);
        addArrayListBlocksToTag(TropicaBlock.highlyFlammableWoodenBlocks, MINEABLE_AXE);
        addArrayListBlocksToTag(TropicaBlock.stoneBlocks, MINEABLE_PICKAXE);
        addArrayListBlocksToTag(TropicaBlock.coralBlocks, MINEABLE_PICKAXE);
        addArrayListBlocksToTag(TropicaBlock.sandBlocks, MINEABLE_SHOVEL);
        addArrayListBlocksToTag(TropicaBlock.plantBlocks, MINEABLE_HOE);
        addArrayListBlocksToTag(TropicaBlock.leavesBlocks, MINEABLE_HOE);
        addArrayListBlocksToTag(TropicaBlock.coralFans, MINEABLE_HOE);
        addArrayListBlocksToTag(TropicaBlock.logBlocks, LOGS);
        addArrayListBlocksToTag(TropicaBlock.logBlocks, LOGS_THAT_BURN);
        addArrayListBlocksToTag(TropicaBlock.logBlocks, COMPLETES_FIND_TREE_TUTORIAL);
        addArrayListBlocksToTag(TropicaBlock.leavesBlocks, LEAVES);
        addArrayListBlocksToTag(TropicaBlock.sandBlocks, SAND);
        addArrayListBlocksToTag(TropicaBlock.sandBlocks, SMELTS_TO_GLASS);
    }
    
    private void addArrayListBlocksToTag(ArrayList<Block> arrayList, TagKey<Block> blockTagKey) {
        for (Block block : arrayList) {
            getOrCreateTagBuilder(blockTagKey).add(block);
        }
    }
}

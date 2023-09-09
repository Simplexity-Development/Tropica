package simplexity.tropica.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import simplexity.tropica.Tropica;
import simplexity.tropica.entity.CoconutEntity;

public class TropicaItem {
    
    private static final String tropica = Tropica.tropica;
    static final FabricItemSettings fullStackItem = new FabricItemSettings().maxCount(64);
    static final FabricItemSettings quarterStackItem = new FabricItemSettings().maxCount(16);
    static final FabricItemSettings singleItem = new FabricItemSettings().maxCount(1);
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
    public static final Item BLACK_MANGROVE_LEAVES = new BlockItem(TropicaBlock.BLACK_MANGROVE_LEAVES, fullStackItem);
    public static final Item BLACK_MANGROVE_PROPAGULE = new BlockItem(TropicaBlock.BLACK_MANGROVE_PROPAGULE, fullStackItem);
    //tree etc
    public static final Item BLACK_MANGROVE_KNEES = new BlockItem(TropicaBlock.BLACK_MANGROVE_KNEES, fullStackItem);
    //non-tree items
    public static final Item BROWN_COCONUT_BLOCK = new BlockItem(TropicaBlock.BROWN_COCONUT_BLOCK, fullStackItem);
    public static final Item YELLOW_COCONUT_BLOCK = new BlockItem(TropicaBlock.YELLOW_COCONUT_BLOCK, fullStackItem);
    public static final Item GREEN_COCONUT_BLOCK = new BlockItem(TropicaBlock.GREEN_COCONUT_BLOCK, fullStackItem);
    public static final Item COCONUT = new BlockItem(TropicaBlock.COCONUT_SHOOT, fullStackItem) {
        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            ItemStack item = user.getStackInHand(hand);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.1f);
            if (!world.isClient) {
                CoconutEntity entity = new CoconutEntity(world, user);
                entity.setItem(item);
                entity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 0.5f, 0f);
                world.spawnEntity(entity);
            }
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!user.getAbilities().creativeMode) item.decrement(1);
            return TypedActionResult.success(item, world.isClient());
        }

        @Override
        public String getTranslationKey() {
            return "item.tropica.coconut";
        }
    };
    public static final Item COCONUT_TUFT = new BlockItem(TropicaBlock.COCONUT_TUFT, fullStackItem);
    
    // Boats
    public static final Item COCONUT_BOAT = new BoatItem(false, BoatEntity.Type.OAK, singleItem);
    // Sand & sandstone
    public static final Item BLACK_SAND = new BlockItem(TropicaBlock.BLACK_SAND, fullStackItem);
    public static final Item BLACK_SANDSTONE = new BlockItem(TropicaBlock.BLACK_SANDSTONE, fullStackItem);
    public static final Item BLACK_SANDSTONE_STAIRS = new BlockItem(TropicaBlock.BLACK_SANDSTONE_STAIRS, fullStackItem);
    public static final Item BLACK_SANDSTONE_SLAB = new BlockItem(TropicaBlock.BLACK_SANDSTONE_SLAB, fullStackItem);
    public static final Item BLACK_SANDSTONE_WALL = new BlockItem(TropicaBlock.BLACK_SANDSTONE_WALL, fullStackItem);
    public static final Item CUT_BLACK_SANDSTONE = new BlockItem(TropicaBlock.CUT_BLACK_SANDSTONE, fullStackItem);
    public static final Item CUT_BLACK_SANDSTONE_SLAB = new BlockItem(TropicaBlock.CUT_BLACK_SANDSTONE_SLAB, fullStackItem);
    public static final Item SMOOTH_BLACK_SANDSTONE = new BlockItem(TropicaBlock.SMOOTH_BLACK_SANDSTONE, fullStackItem);
    public static final Item SMOOTH_BLACK_SANDSTONE_STAIRS = new BlockItem(TropicaBlock.SMOOTH_BLACK_SANDSTONE_STAIRS, fullStackItem);
    public static final Item SMOOTH_BLACK_SANDSTONE_SLAB = new BlockItem(TropicaBlock.SMOOTH_BLACK_SANDSTONE_SLAB, fullStackItem);
    public static final Item CHISELED_BLACK_SANDSTONE = new BlockItem(TropicaBlock.CHISELED_BLACK_SANDSTONE, fullStackItem);
    //coral
    public static final Item DEAD_HAMMER_CORAL_BLOCK = new BlockItem(TropicaBlock.DEAD_HAMMER_CORAL_BLOCK, fullStackItem);
    public static final Item HAMMER_CORAL_BLOCK = new BlockItem(TropicaBlock.HAMMER_CORAL_BLOCK, fullStackItem);
    public static final Item DEAD_HAMMER_CORAL = new BlockItem(TropicaBlock.DEAD_HAMMER_CORAL, fullStackItem);
    public static final Item HAMMER_CORAL = new BlockItem(TropicaBlock.HAMMER_CORAL, fullStackItem);
    public static final Item DEAD_HAMMER_CORAL_FAN = new BlockItem(TropicaBlock.DEAD_HAMMER_CORAL_FAN, fullStackItem);
    public static final Item HAMMER_CORAL_FAN = new BlockItem(TropicaBlock.HAMMER_CORAL_FAN, fullStackItem);
    
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
        registerItem("black_mangrove_leaves", BLACK_MANGROVE_LEAVES);
        registerItem("black_mangrove_propagule", BLACK_MANGROVE_PROPAGULE);
        //tree etc
        registerItem("black_mangrove_knees", BLACK_MANGROVE_KNEES);
        //non-tree-items
        registerItem("brown_coconut_block", BROWN_COCONUT_BLOCK);
        registerItem("yellow_coconut_block", YELLOW_COCONUT_BLOCK);
        registerItem("green_coconut_block", GREEN_COCONUT_BLOCK);
        registerItem("coconut", COCONUT);
        registerItem("coconut_tuft", COCONUT_TUFT);
        
        // Boats
        registerItem("coconut_boat", COCONUT_BOAT);
        // Sand & sandstone
        registerItem("black_sand", BLACK_SAND);
        registerItem("black_sandstone", BLACK_SANDSTONE);
        registerItem("black_sandstone_stairs", BLACK_SANDSTONE_STAIRS);
        registerItem("black_sandstone_slab", BLACK_SANDSTONE_SLAB);
        registerItem("black_sandstone_wall", BLACK_SANDSTONE_WALL);
        registerItem("cut_black_sandstone", CUT_BLACK_SANDSTONE);
        registerItem("cut_black_sandstone_slab", CUT_BLACK_SANDSTONE_SLAB);
        registerItem("smooth_black_sandstone", SMOOTH_BLACK_SANDSTONE);
        registerItem("smooth_black_sandstone_stairs", SMOOTH_BLACK_SANDSTONE_STAIRS);
        registerItem("smooth_black_sandstone_slab", SMOOTH_BLACK_SANDSTONE_SLAB);
        registerItem("chiseled_black_sandstone", CHISELED_BLACK_SANDSTONE);
        //coral
        registerItem("dead_hammer_coral_block", DEAD_HAMMER_CORAL_BLOCK);
        registerItem("hammer_coral_block", HAMMER_CORAL_BLOCK);
        registerItem("dead_hammer_coral", DEAD_HAMMER_CORAL);
        registerItem("hammer_coral", HAMMER_CORAL);
        registerItem("dead_hammer_coral_fan", DEAD_HAMMER_CORAL_FAN);
        registerItem("hammer_coral_fan", HAMMER_CORAL_FAN);
    }
    
    
}

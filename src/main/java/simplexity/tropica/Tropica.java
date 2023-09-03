package simplexity.tropica;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simplexity.tropica.blocks.BlackMangrove;
import simplexity.tropica.blocks.Coconut;

public class Tropica implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("tropica");
    public static final String tropica = "tropica";
    
/*Items
    public static final Item BLACK_MANGROVE_BOAT = new Item(new FabricItemSettings().maxCount(1));
    public static final Item BLACK_MANGROVE_CHEST_BOAT = new Item(new FabricItemSettings().maxCount(1));
    public static final Item COCONUT = new Item(new FabricItemSettings().maxCount(16));
    public static final Item COCONUT_BOAT = new Item(new FabricItemSettings().maxCount(1));
    public static final Item COCONUT_CHEST_BOAT = new Item(new FabricItemSettings().maxCount(1));
    public static final Item COCONUT_SLICE = new Item(new FabricItemSettings().maxCount(16));
*/
    
    @Override
    public void onInitialize() {
        Coconut.registerCoconutBlocks();
        Coconut.registerCoconutBlockItems();
        Coconut.registerCoconutCreativePlacements();
        BlackMangrove.registerBlackMangroveBlocks();
        BlackMangrove.registerBlackMangroveBlockItems();
        BlackMangrove.registerBlackMangroveCreativePlacements();
        LOGGER.info("TROPICA IS LOADED YE");
    }
}
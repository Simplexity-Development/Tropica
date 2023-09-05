package simplexity.tropica;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simplexity.tropica.registries.TropicaBlock;
import simplexity.tropica.registries.TropicaItem;

public class Tropica implements ModInitializer {
    
    public static final Logger LOGGER = LoggerFactory.getLogger("tropica");
    public static final String tropica = "tropica";
    
    @Override
    public void onInitialize() {
        TropicaBlock.registerWoodTypes();
        TropicaBlock.registerModBlocks();
        TropicaItem.registerModItems();
        TropicaBlock.registerCreativePlacements();
        LOGGER.info("TROPICA IS LOADED YE");
    }
}
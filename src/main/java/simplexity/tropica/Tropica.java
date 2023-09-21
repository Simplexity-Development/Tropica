package simplexity.tropica;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simplexity.tropica.registry.TropicaBlock;
import simplexity.tropica.registry.TropicaBlockEntity;
import simplexity.tropica.registry.TropicaEntity;
import simplexity.tropica.registry.TropicaItem;

public class Tropica implements ModInitializer {
    
    public static final Logger LOGGER = LoggerFactory.getLogger("tropica");
    public static final String tropica = "tropica";
    
    @Override
    public void onInitialize() {
        TropicaBlock.registerWoodTypes();
        TropicaBlock.registerModBlocks();
        TropicaBlock.registerBlocksFlammability();
        TropicaItem.registerModItems();
        TropicaBlock.registerCreativePlacements();
        TropicaBlockEntity.registerBlockEntities();
        TropicaEntity.registerEntities();
        LOGGER.info("TROPICA IS LOADED YE");
    }
}
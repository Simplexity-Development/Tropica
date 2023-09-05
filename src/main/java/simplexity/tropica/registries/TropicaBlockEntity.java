package simplexity.tropica.registries;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;
import simplexity.tropica.tileentity.CoconutSignEntity;

public class TropicaBlockEntity {

    private final static String tropica = Tropica.tropica;
    public static final BlockEntityType<CoconutSignEntity> COCONUT_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutSignEntity::new, TropicaBlock.COCONUT_SIGN).build();

    public static void registerBlockEntities() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_sign_entity"), COCONUT_SIGN_ENTITY);
    }

}

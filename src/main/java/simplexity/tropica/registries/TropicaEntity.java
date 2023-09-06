package simplexity.tropica.registries;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;
import simplexity.tropica.entity.TropicaBoat;

public class TropicaEntity {

    private final static String tropica = Tropica.tropica;
    public static final EntityType<TropicaBoat> COCONUT_BOAT = FabricEntityTypeBuilder.create(SpawnGroup.MISC, TropicaBoat::new).build();

    public static void registerEntities() {
        Registry.register(Registries.ENTITY_TYPE, new Identifier(tropica, "coconut_boat"), COCONUT_BOAT);
    }

}

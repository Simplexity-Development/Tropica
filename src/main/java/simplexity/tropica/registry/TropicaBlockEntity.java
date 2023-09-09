package simplexity.tropica.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;
import simplexity.tropica.tileentity.BlackMangroveWallSignEntity;
import simplexity.tropica.tileentity.CoconutSignEntity;
import simplexity.tropica.tileentity.BlackMangroveSignEntity;
import simplexity.tropica.tileentity.CoconutWallSignEntity;

public class TropicaBlockEntity {

    private final static String tropica = Tropica.tropica;
    public static final BlockEntityType<CoconutSignEntity> COCONUT_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutSignEntity::new, TropicaBlock.COCONUT_SIGN).build();
    public static final BlockEntityType<CoconutWallSignEntity> COCONUT_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutWallSignEntity::new, TropicaBlock.COCONUT_WALL_SIGN).build();
    public static final BlockEntityType<BlackMangroveSignEntity> BLACK_MANGROVE_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(BlackMangroveSignEntity::new, TropicaBlock.BLACK_MANGROVE_SIGN).build();
    public static final BlockEntityType<BlackMangroveWallSignEntity> BLACK_MANGROVE_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(BlackMangroveWallSignEntity::new, TropicaBlock.BLACK_MANGROVE_WALL_SIGN).build();

    public static void registerBlockEntities() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_sign_entity"), COCONUT_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_wall_sign_entity"), COCONUT_WALL_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "black_mangrove_sign_entity"), BLACK_MANGROVE_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "black_mangrove_wall_sign_entity"), BLACK_MANGROVE_WALL_SIGN_ENTITY);
    }

}

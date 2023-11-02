package simplexity.tropica.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import simplexity.tropica.Tropica;
import simplexity.tropica.tileentity.*;

public class TropicaBlockEntity {

    private final static String tropica = Tropica.tropica;
    public static final BlockEntityType<CoconutSignEntity> COCONUT_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutSignEntity::new, TropicaBlock.COCONUT_SIGN).build();
    public static final BlockEntityType<CoconutWallSignEntity> COCONUT_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutWallSignEntity::new, TropicaBlock.COCONUT_WALL_SIGN).build();
    public static final BlockEntityType<CoconutHangingSignEntity> COCONUT_HANGING_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutHangingSignEntity::new, TropicaBlock.COCONUT_HANGING_SIGN_BLOCK).build();
    public static final BlockEntityType<CoconutHangingWallSignEntity> COCONUT_HANGING_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(CoconutHangingWallSignEntity::new, TropicaBlock.COCONUT_WALL_HANGING_SIGN_BLOCK).build();

    public static final BlockEntityType<BlackMangroveSignEntity> BLACK_MANGROVE_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(BlackMangroveSignEntity::new, TropicaBlock.BLACK_MANGROVE_SIGN).build();
    public static final BlockEntityType<BlackMangroveWallSignEntity> BLACK_MANGROVE_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(BlackMangroveWallSignEntity::new, TropicaBlock.BLACK_MANGROVE_WALL_SIGN).build();
    public static final BlockEntityType<BlackMangroveHangingSignEntity> BLACK_MANGROVE_HANGING_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(BlackMangroveHangingSignEntity::new, TropicaBlock.BLACK_MANGROVE_HANGING_SIGN_BLOCK).build();
    public static final BlockEntityType<BlackMangroveHangingWallSignEntity> BLACK_MANGROVE_HANGING_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(BlackMangroveHangingWallSignEntity::new, TropicaBlock.BLACK_MANGROVE_WALL_HANGING_SIGN_BLOCK).build();

    public static final BlockEntityType<AmaranthSignEntity> AMARANTH_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(AmaranthSignEntity::new, TropicaBlock.AMARANTH_SIGN).build();
    public static final BlockEntityType<AmaranthWallSignEntity> AMARANTH_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(AmaranthWallSignEntity::new, TropicaBlock.AMARANTH_WALL_SIGN).build();
    public static final BlockEntityType<AmaranthHangingSignEntity> AMARANTH_HANGING_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(AmaranthHangingSignEntity::new, TropicaBlock.AMARANTH_HANGING_SIGN_BLOCK).build();
    public static final BlockEntityType<AmaranthHangingWallSignEntity> AMARANTH_HANGING_WALL_SIGN_ENTITY = FabricBlockEntityTypeBuilder.create(AmaranthHangingWallSignEntity::new, TropicaBlock.AMARANTH_WALL_HANGING_SIGN_BLOCK).build();
    public static void registerBlockEntities() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_sign_entity"), COCONUT_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_wall_sign_entity"), COCONUT_WALL_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_hanging_sign_entity"), COCONUT_HANGING_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "coconut_hanging_wall_sign_entity"), COCONUT_HANGING_WALL_SIGN_ENTITY);

        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "black_mangrove_sign_entity"), BLACK_MANGROVE_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "black_mangrove_wall_sign_entity"), BLACK_MANGROVE_WALL_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "black_mangrove_hanging_sign_entity"), BLACK_MANGROVE_HANGING_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "black_mangrove_hanging_wall_sign_entity"), BLACK_MANGROVE_HANGING_WALL_SIGN_ENTITY);
        
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "amaranth_sign_entity"), AMARANTH_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "amaranth_wall_sign_entity"), AMARANTH_WALL_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "amaranth_hanging_sign_entity"), AMARANTH_HANGING_SIGN_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(tropica, "amaranth_hanging_wall_sign_entity"), AMARANTH_HANGING_WALL_SIGN_ENTITY);
    }

}

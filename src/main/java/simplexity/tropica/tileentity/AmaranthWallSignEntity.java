package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class AmaranthWallSignEntity extends SignBlockEntity {

    public AmaranthWallSignEntity(BlockPos pos, BlockState state) {
        super(TropicaBlockEntity.AMARANTH_WALL_SIGN_ENTITY, pos, state);
    }

}
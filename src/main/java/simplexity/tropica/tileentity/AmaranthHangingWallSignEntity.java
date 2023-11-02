package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class AmaranthHangingWallSignEntity extends TropicaHangingWallSignBlockEntity {

    public AmaranthHangingWallSignEntity(BlockPos blockPos, BlockState blockState) {
        super(TropicaBlockEntity.AMARANTH_HANGING_WALL_SIGN_ENTITY, blockPos, blockState);
    }

}

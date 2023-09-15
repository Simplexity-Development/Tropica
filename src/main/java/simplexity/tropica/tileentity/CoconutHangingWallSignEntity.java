package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class CoconutHangingWallSignEntity extends TropicaHangingWallSignBlockEntity {

    public CoconutHangingWallSignEntity(BlockPos blockPos, BlockState blockState) {
        super(TropicaBlockEntity.COCONUT_HANGING_WALL_SIGN_ENTITY, blockPos, blockState);
    }

}

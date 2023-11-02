package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class AmaranthHangingSignEntity extends TropicaHangingSignBlockEntity {

    public AmaranthHangingSignEntity(BlockPos blockPos, BlockState blockState) {
        super(TropicaBlockEntity.AMARANTH_HANGING_SIGN_ENTITY, blockPos, blockState);
    }

}

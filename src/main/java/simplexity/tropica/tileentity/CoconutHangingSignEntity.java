package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class CoconutHangingSignEntity extends TropicaHangingSignBlockEntity {

    public CoconutHangingSignEntity(BlockPos blockPos, BlockState blockState) {
        super(TropicaBlockEntity.COCONUT_HANGING_SIGN_ENTITY, blockPos, blockState);
    }

}

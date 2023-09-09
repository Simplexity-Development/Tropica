package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class BlackMangroveHangingSignEntity extends TropicaHangingSignBlockEntity {

    public BlackMangroveHangingSignEntity(BlockPos blockPos, BlockState blockState) {
        super(TropicaBlockEntity.BLACK_MANGROVE_HANGING_SIGN_ENTITY, blockPos, blockState);
    }

}

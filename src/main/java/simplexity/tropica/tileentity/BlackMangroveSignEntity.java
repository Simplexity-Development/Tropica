package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class BlackMangroveSignEntity extends SignBlockEntity {

    public BlackMangroveSignEntity(BlockPos pos, BlockState state) {
        super(TropicaBlockEntity.BLACK_MANGROVE_SIGN_ENTITY, pos, state);
    }

}
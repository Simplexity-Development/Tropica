package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class AmaranthSignEntity extends SignBlockEntity {

    public AmaranthSignEntity(BlockPos pos, BlockState state) {
        super(TropicaBlockEntity.AMARANTH_SIGN_ENTITY, pos, state);
    }

}
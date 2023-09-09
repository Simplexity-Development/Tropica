package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registry.TropicaBlockEntity;

public class CoconutWallSignEntity extends SignBlockEntity {

    public CoconutWallSignEntity(BlockPos pos, BlockState state) {
        super(TropicaBlockEntity.COCONUT_WALL_SIGN_ENTITY, pos, state);
    }

}
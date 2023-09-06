package simplexity.tropica.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.registries.TropicaBlockEntity;

public class BlackMangroveWallSignEntity extends SignBlockEntity {

    public BlackMangroveWallSignEntity(BlockPos pos, BlockState state) {
        super(TropicaBlockEntity.BLACK_MANGROVE_WALL_SIGN_ENTITY, pos, state);
    }

}
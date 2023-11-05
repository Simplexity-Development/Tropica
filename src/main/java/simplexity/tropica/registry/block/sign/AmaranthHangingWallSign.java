package simplexity.tropica.registry.block.sign;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.tileentity.AmaranthHangingWallSignEntity;

public class AmaranthHangingWallSign extends WallHangingSignBlock {
    public AmaranthHangingWallSign(Settings settings, WoodType woodType) {
        super(settings, woodType);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AmaranthHangingWallSignEntity(pos, state);
    }
}

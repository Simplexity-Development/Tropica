package simplexity.tropica.registry.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.tileentity.CoconutHangingWallSignEntity;

public class CoconutHangingWallSign extends WallHangingSignBlock {
    public CoconutHangingWallSign(Settings settings, WoodType woodType) {
        super(settings, woodType);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CoconutHangingWallSignEntity(pos, state);
    }
}

package simplexity.tropica.registries.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.tileentity.BlackMangroveWallSignEntity;

public class BlackMangroveWallSign extends WallSignBlock {
    public BlackMangroveWallSign(Settings settings, WoodType type) {
        super(settings, type);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BlackMangroveWallSignEntity(pos, state);
    }
}

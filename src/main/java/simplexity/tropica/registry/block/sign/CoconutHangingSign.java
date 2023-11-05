package simplexity.tropica.registry.block.sign;

import net.minecraft.block.BlockState;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.tileentity.CoconutHangingSignEntity;

public class CoconutHangingSign extends HangingSignBlock {
    public CoconutHangingSign(Settings settings, WoodType woodType) {
        super(settings, woodType);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CoconutHangingSignEntity(pos, state);
    }
}

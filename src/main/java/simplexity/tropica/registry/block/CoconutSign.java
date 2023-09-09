package simplexity.tropica.registry.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.tileentity.CoconutSignEntity;

public class CoconutSign extends SignBlock {
    public CoconutSign(Settings settings, WoodType type) {
        super(settings, type);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CoconutSignEntity(pos, state);
    }
}

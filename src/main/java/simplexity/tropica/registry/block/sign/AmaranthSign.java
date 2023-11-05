package simplexity.tropica.registry.block.sign;

import net.minecraft.block.BlockState;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import simplexity.tropica.tileentity.AmaranthSignEntity;

public class AmaranthSign extends SignBlock {
    public AmaranthSign(Settings settings, WoodType type) {
        super(settings, type);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AmaranthSignEntity(pos, state);
    }
}

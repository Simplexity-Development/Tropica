package simplexity.tropica.mixin;

import net.minecraft.block.WoodType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(WoodType.class)
public interface WoodTypeMixin {
    @Invoker("register")
    static WoodType invokeRegister(WoodType type) {
        throw new AssertionError();
    }
}

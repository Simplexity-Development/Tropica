package simplexity.tropica.mixin.client;

import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HangingSignEditScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import simplexity.tropica.tileentity.TropicaHangingSignBlockEntity;

@Mixin(ClientPlayerEntity.class)
public abstract class EditSignScreenMixin {

    @Inject(method = "openEditSignScreen", at = @At("HEAD"), cancellable = true)
    public void editSignScreen(SignBlockEntity sign, boolean front, CallbackInfo ci) {
        if (sign instanceof TropicaHangingSignBlockEntity) {
            MinecraftClient client = getClient();
            client.setScreen(new HangingSignEditScreen(sign, front, client.shouldFilterText()));
            ci.cancel();
        }
    }

    @Accessor("client")
    public abstract MinecraftClient getClient();

}

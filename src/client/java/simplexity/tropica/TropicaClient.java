package simplexity.tropica;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import simplexity.tropica.registries.TropicaBlockEntity;
import simplexity.tropica.renderer.TropicaSignEntityRenderer;

@Environment(EnvType.CLIENT)
public class TropicaClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_SIGN_ENTITY, TropicaSignEntityRenderer::new);
	}
}
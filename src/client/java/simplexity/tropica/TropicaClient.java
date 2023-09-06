package simplexity.tropica;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import simplexity.tropica.registries.TropicaBlockEntity;
import simplexity.tropica.registries.TropicaEntity;

@Environment(EnvType.CLIENT)
public class TropicaClient implements ClientModInitializer {

	public static final String tropica = Tropica.tropica;

	@Override
	public void onInitializeClient() {
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_WALL_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_WALL_SIGN_ENTITY, SignBlockEntityRenderer::new);

		EntityRendererRegistry.register(TropicaEntity.COCONUT_BOAT, (context) -> new BoatEntityRenderer(context, false) {
			@Override
			public Identifier getTexture(BoatEntity entity) {
				return new Identifier(tropica, "textures/entity/boat/coconut.png");
			}
		});
	}
}
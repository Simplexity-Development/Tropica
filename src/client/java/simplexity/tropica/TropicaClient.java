package simplexity.tropica;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import simplexity.tropica.registries.TropicaBlock;
import simplexity.tropica.registries.TropicaBlockEntity;
import simplexity.tropica.registries.TropicaEntity;
import simplexity.tropica.registries.TropicaItem;

@Environment(EnvType.CLIENT)
public class TropicaClient implements ClientModInitializer {

	public static final String tropica = Tropica.tropica;

	@Override
	public void onInitializeClient() {
		registerBlockEntityRenderers();
		registerEntityRenderers();
		registerBlockRenderLayerMaps();
		registerColorProviders();
	}

	public void registerBlockEntityRenderers() {
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_WALL_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_WALL_SIGN_ENTITY, SignBlockEntityRenderer::new);
	}

	public void registerEntityRenderers() {
		EntityRendererRegistry.register(TropicaEntity.COCONUT_BOAT, (context) -> new BoatEntityRenderer(context, false) {
			@Override
			public Identifier getTexture(BoatEntity entity) {
				return new Identifier(tropica, "textures/entity/boat/coconut.png");
			}
		});
		EntityRendererRegistry.register(TropicaEntity.COCONUT, FlyingItemEntityRenderer::new);
	}

	public void registerBlockRenderLayerMaps() {
		BlockRenderLayerMap.INSTANCE.putBlock(TropicaBlock.COCONUT_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(TropicaBlock.BLACK_MANGROVE_LEAVES, RenderLayer.getCutout());
	}

	public void registerColorProviders() {
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x5aed00, TropicaBlock.COCONUT_LEAVES);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x5aed00, TropicaItem.COCONUT_LEAVES);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlock.BLACK_MANGROVE_LEAVES);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaItem.BLACK_MANGROVE_LEAVES);
	}
}
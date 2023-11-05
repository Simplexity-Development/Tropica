package simplexity.tropica;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import simplexity.tropica.registry.TropicaBlock;
import simplexity.tropica.registry.TropicaBlockEntity;
import simplexity.tropica.registry.TropicaEntity;
import simplexity.tropica.registry.TropicaItem;

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
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_HANGING_SIGN_ENTITY, HangingSignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.COCONUT_HANGING_WALL_SIGN_ENTITY, HangingSignBlockEntityRenderer::new);

		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_WALL_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_HANGING_SIGN_ENTITY, HangingSignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.BLACK_MANGROVE_HANGING_WALL_SIGN_ENTITY, HangingSignBlockEntityRenderer::new);
	
		BlockEntityRendererFactories.register(TropicaBlockEntity.AMARANTH_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.AMARANTH_WALL_SIGN_ENTITY, SignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.AMARANTH_HANGING_SIGN_ENTITY, HangingSignBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(TropicaBlockEntity.AMARANTH_HANGING_WALL_SIGN_ENTITY, HangingSignBlockEntityRenderer::new);
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
		getCutOutOfBlock(TropicaBlock.COCONUT_LEAVES);
		getCutOutOfBlock(TropicaBlock.COCONUT_SHOOT);
		
		getCutOutOfBlock(TropicaBlock.BLACK_MANGROVE_LEAVES);
		getCutOutOfBlock(TropicaBlock.BLACK_MANGROVE_PROPAGULE);
		
		getCutOutOfBlock(TropicaBlock.AMARANTH_LEAVES);
		getCutOutOfBlock(TropicaBlock.AMARANTH_SAPLING);
		
		getTranslucentOfBlock(TropicaBlock.BLACK_MANGROVE_DOOR);
		getTranslucentOfBlock(TropicaBlock.BLACK_MANGROVE_TRAPDOOR);
		getCutOutOfBlock(TropicaBlock.COCONUT_DOOR);
		getCutOutOfBlock(TropicaBlock.AMARANTH_DOOR);
		getCutOutOfBlock(TropicaBlock.AMARANTH_TRAPDOOR);
		
		getCutOutOfBlock(TropicaBlock.COCONUT_TUFT);
		getCutOutOfBlock(TropicaBlock.BLACK_MANGROVE_KNEES);
		
		getCutOutOfBlock(TropicaBlock.HAMMER_CORAL);
		getCutOutOfBlock(TropicaBlock.DEAD_HAMMER_CORAL);
		getCutOutOfBlock(TropicaBlock.HAMMER_CORAL_WALL_FAN);
		getCutOutOfBlock(TropicaBlock.DEAD_HAMMER_CORAL_WALL_FAN);
		getCutOutOfBlock(TropicaBlock.HAMMER_CORAL_FAN);
		getCutOutOfBlock(TropicaBlock.DEAD_HAMMER_CORAL_FAN);
		
		getCutOutOfBlock(TropicaBlock.BEACH_GRASS);
		getCutOutOfBlock(TropicaBlock.TALL_BEACH_GRASS);
		getCutOutOfBlock(TropicaBlock.WHITE_HIBISCUS);
		getCutOutOfBlock(TropicaBlock.RED_HIBISCUS);
		getCutOutOfBlock(TropicaBlock.TROPICAL_BUSH);
		getCutOutOfBlock(TropicaBlock.LARGE_TROPICAL_BUSH);
		getCutOutOfBlock(TropicaBlock.POISONOUS_VINE);
		getCutOutOfBlock(TropicaBlock.HELICONIA);
	}
	
	private void getCutOutOfBlock(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
	}
	
	private void getTranslucentOfBlock(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
	}

	public void registerColorProviders() {
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlock.BLACK_MANGROVE_LEAVES);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaItem.BLACK_MANGROVE_LEAVES);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlock.AMARANTH_LEAVES);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaItem.AMARANTH_LEAVES);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlock.TROPICAL_BUSH);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaItem.TROPICAL_BUSH);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlock.LARGE_TROPICAL_BUSH);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaItem.LARGE_TROPICAL_BUSH);
	}
}
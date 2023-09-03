# TODOS:

Most non-block items are not implemented yet
Signs do not render yet when placed
the GUIs on signs are broken
propagule textures are broken when placed
fences are still weird
one of the pressure plates doesn't render properly in the inventory for some reason
Leaves are still grey
Sand and coral have not been touched at all yet

# Implementation Notes

coconuts can be found with both coconut blocks and singular coconuts hanging under the canopy. the only coconut block which will be able to be harvested for fruits is the dark one, which is also a storage block for coconuts (you can craft it with 4 coconuts). if you happen to break a singular ripe coconut block, it will be replaced with a coconut tuft, which can then grow back into ripe coconuts. by right clicking a coconut item on sand, stone or grass you will place a coconut shoot, which will then grow back in a coconut palm.
the gray block you see here is called a coconut sheath. it spawns under the leaf canopy and is very flammable, but can also be harvested to obtain about 4 strings.
black mangroves spawn, just like mangroves, in mangrove swamp biomes; but there are a few differences between the two. While regular mangroves are not enough cold hardy to thrive in normal swamps, black mangroves are very tolerant and will spawn in any marsh biome in small clusters (something which i call micro-biome, though the biome ID remains the same). another difference is that black mangroves do not have root blocks but instead knees. knees are scientifically known as pneumatophores, and they are pointy structures which surround semi-aquatic plants. you won't get damaged by them unless you sprint on them, and they will rarely drop sticks when broken.
the cubic items you see here are simply the item textures for each stage, though they are not really meant to stay in your inventory. you can only obtain the green stages when bone-mealing the frond blocks, otherwise they won't grow back outside of coconut tufts. you can obtain green and orange coconut blocks through silk touch, as decorational blocks.
forgot to mention; coconuts spawn on white sand beaches, which are warm lush alternatives to regular beaches. they will replace them in warm regions
Image
white sand beaches keep a similar layout to sparse jungles; there are also occasional lush stripes of grass with flowers and bush


# Other notes

`To make your block flammable (that is, can be burned in fire), you may use FlammableBlockRegistry. ` - fabric wiki

Stacktrace when placing a sign:
```
[15:09:00] [Render thread/ERROR]: Error executing task on Client
java.lang.IllegalArgumentException: No model for layer minecraft:sign/coconut#main
	at net.minecraft.client.render.entity.model.EntityModelLoader.getModelPart(EntityModelLoader.java:17) ~[client-intermediary.jar:?]
	at net.minecraft.client.render.block.entity.SignBlockEntityRenderer.createSignModel(SignBlockEntityRenderer.java:201) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.screen.ingame.SignEditScreen.init(SignEditScreen.java:32) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.screen.Screen.init(Screen.java:297) ~[client-intermediary.jar:?]
	at net.minecraft.client.MinecraftClient.setScreen(MinecraftClient.java:1080) ~[client-intermediary.jar:?]
	at net.minecraft.client.network.ClientPlayerEntity.openEditSignScreen(ClientPlayerEntity.java:596) ~[client-intermediary.jar:?]
	at net.minecraft.client.network.ClientPlayNetworkHandler.onSignEditorOpen(ClientPlayNetworkHandler.java:1254) ~[client-intermediary.jar:?]
	at net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.apply(SignEditorOpenS2CPacket.java:29) ~[client-intermediary.jar:?]
	at net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket.apply(SignEditorOpenS2CPacket.java:7) ~[client-intermediary.jar:?]
	at net.minecraft.network.NetworkThreadUtils.method_11072(NetworkThreadUtils.java:22) ~[client-intermediary.jar:?]
	at net.minecraft.util.thread.ThreadExecutor.executeTask(ThreadExecutor.java:156) ~[client-intermediary.jar:?]
	at net.minecraft.util.thread.ReentrantThreadExecutor.executeTask(ReentrantThreadExecutor.java:23) ~[client-intermediary.jar:?]
	at net.minecraft.util.thread.ThreadExecutor.runTask(ThreadExecutor.java:130) ~[client-intermediary.jar:?]
	at net.minecraft.util.thread.ThreadExecutor.runTasks(ThreadExecutor.java:115) ~[client-intermediary.jar:?]
	at net.minecraft.client.MinecraftClient.render(MinecraftClient.java:1175) ~[client-intermediary.jar:?]
	at net.minecraft.client.MinecraftClient.run(MinecraftClient.java:802) ~[client-intermediary.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:250) ~[minecraft-1.20.1-client.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:468) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) ~[fabric-loader-0.14.22.jar:?]
	at org.prismlauncher.launcher.impl.StandardLauncher.launch(StandardLauncher.java:88) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.listen(EntryPoint.java:126) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.main(EntryPoint.java:71) ~[NewLaunch.jar:?]

```

Warning when placing a sign:
```
[15:10:03] [Server thread/WARN]: Block entity minecraft:sign @ class_2338{x=46, y=63, z=298} state Block{tropica:coconut_sign}[rotation=0,waterlogged=false] invalid for ticking:
```

Stack trace when trying to place a hanging sign:

```
[15:10:56] [Render thread/WARN]: Block entity minecraft:hanging_sign @ class_2338{x=46, y=64, z=298} state Block{tropica:coconut_wall_hanging_sign}[facing=west,waterlogged=false] invalid for ticking:
[15:10:56] [Render thread/WARN]: Failed to load texture: minecraft:textures/gui/hanging_signs/coconut.png
java.io.FileNotFoundException: minecraft:textures/gui/hanging_signs/coconut.png
	at net.minecraft.resource.ResourceFactory.method_43043(ResourceFactory.java:21) ~[client-intermediary.jar:?]
	at java.util.Optional.orElseThrow(Optional.java:403) ~[?:?]
	at net.minecraft.resource.ResourceFactory.getResourceOrThrow(ResourceFactory.java:21) ~[client-intermediary.jar:?]
	at net.minecraft.client.texture.ResourceTexture$TextureData.load(ResourceTexture.java:83) ~[client-intermediary.jar:?]
	at net.minecraft.client.texture.ResourceTexture.loadTextureData(ResourceTexture.java:58) ~[client-intermediary.jar:?]
	at net.minecraft.client.texture.ResourceTexture.load(ResourceTexture.java:29) ~[client-intermediary.jar:?]
	at net.minecraft.client.texture.TextureManager.loadTexture(TextureManager.java:97) ~[client-intermediary.jar:?]
	at net.minecraft.client.texture.TextureManager.registerTexture(TextureManager.java:69) ~[client-intermediary.jar:?]
	at net.minecraft.client.texture.TextureManager.getTexture(TextureManager.java:119) ~[client-intermediary.jar:?]
	at com.mojang.blaze3d.systems.RenderSystem._setShaderTexture(RenderSystem.java:1232) ~[client-intermediary.jar:?]
	at com.mojang.blaze3d.systems.RenderSystem.setShaderTexture(RenderSystem.java:1225) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.DrawContext.drawTexturedQuad(DrawContext.java:387) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.DrawContext.drawTexture(DrawContext.java:378) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.DrawContext.drawTexture(DrawContext.java:362) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.DrawContext.drawTexture(DrawContext.java:374) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.screen.ingame.HangingSignEditScreen.renderSignBackground(HangingSignEditScreen.java:32) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen.renderSign(AbstractSignEditScreen.java:150) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen.render(AbstractSignEditScreen.java:110) ~[client-intermediary.jar:?]
	at net.minecraft.client.gui.screen.Screen.renderWithTooltip(Screen.java:110) ~[client-intermediary.jar:?]
	at net.minecraft.client.render.GameRenderer.render(GameRenderer.java:945) ~[client-intermediary.jar:?]
	at net.minecraft.client.MinecraftClient.render(MinecraftClient.java:1219) ~[client-intermediary.jar:?]
	at net.minecraft.client.MinecraftClient.run(MinecraftClient.java:802) ~[client-intermediary.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:250) ~[minecraft-1.20.1-client.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:468) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) ~[fabric-loader-0.14.22.jar:?]
	at org.prismlauncher.launcher.impl.StandardLauncher.launch(StandardLauncher.java:88) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.listen(EntryPoint.java:126) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.main(EntryPoint.java:71) ~[NewLaunch.jar:?]
[15:10:56] [Server thread/WARN]: Block entity minecraft:hanging_sign @ class_2338{x=46, y=64, z=298} state Block{tropica:coconut_wall_hanging_sign}[facing=west,waterlogged=false] invalid for ticking:


```
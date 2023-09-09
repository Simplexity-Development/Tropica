# TODOS:

the GUIs on signs are broken
propagule textures are broken when placed

# Implementation Notes

## Coconuts
* they spawn on white sand beaches and black sand beaches, as well as tropical biomes such as jungles
* they grow coconuts and coconut blocks, each with 3 stages
* coconuts will fall when hit, both block and normal form
* coconuts will “break” and spawn a coconut item when falling on the ground, coconut blocks won’t
* you can uncraft and craft back a ripe coconut block in coconut items
* coconuts will spawn with sheaths under the canopy, new fluffy and highly flammable blocks which are also a source of strings (you can put them in a crafting table and obtain 4 strings)(you can also use them as fuel or to absorb fall damage like hay bales)
* coconut items (not the split form) can be placed back into the ground as coconut shoots
* coconut items can be thrown to deal 5 health points of damage, but will be heavier than any bullet (it will also split in pieces anywhere it hits)
* coconut pieces can be eaten to gain 3 hunger points and 6 saturation points
* two coconut pieces can be put with a bucket in a crafting table to obtain milk
* coconut has its own woodset
## Black mangroves
* black mangroves are cold hardy mangroves which spawn in both mangrove swamps, regular swamps and rarely jungles
* unlike regular mangroves, they don’t have mangrove blocks but instead black mangrove knees
* black mangrove knees deal damage when you sprint on them (not regularly), they can be harvested for sticks and you can place them underwater too.
* black mangrove has its own woodset


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

## Handling Custom Boat Types

Commit [a5d0ae3](https://github.com/Simplexity-Development/Tropica/commit/a5d0ae3b06f9929eb561a361474ef9cdb2348c38) has made it clear that handling boat types will not be so simple.

**Issues**
- Boat Types currently are set up as an inner class enum, `BoatEntity.Type`.
- Mixins currently is incapable of adding an Enum value to a class.
- Most mods have a sort of manual implementation that has a fallback to the Oak Boat, and just handles everything else themselves.

**References**
- [NatureSpirit: HibiscusBoatEntity.java](https://github.com/Team-Hibiscus/NatureSpirit/blob/master/remappedSrc/net/hibiscus/naturespirit/entity/HibiscusBoatEntity.java)
- [Fabric: API for Adding Boat Types](https://github.com/FabricMC/fabric/issues/688)
  - [Terraform API](https://github.com/TerraformersMC/Terraform)
- [Fabric: Add Support for Adding Enum Constants](https://github.com/SpongePowered/Mixin/issues/387)
  - [Noteblock Expansion: NoteblockInstrumentsMixin.java](https://github.com/LudoCrypt/Noteblock-Expansion-Forge/blob/main/src/main/java/net/ludocrypt/nbexpand/mixin/NoteblockInstrumentMixin.java)
    - Has not been updated since 1.17 (Last updated July 2021), see [CurseForge: Noteblock Expansion](https://www.curseforge.com/minecraft/mc-mods/noteblock-expansion) and [Noteblock Expansion: Releases](https://github.com/LudoCrypt/Noteblock-Expansion-Forge)
    - Has a general structure of how they worked around the issue with Enum Constants.

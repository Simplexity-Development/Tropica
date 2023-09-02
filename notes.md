# CURRENTLY NOT FUNCTIONAL:

Current stacktrace when attempting to load mod:

```console
[13:57:45] [Render thread/ERROR]: Unhandled game exception
java.lang.IllegalStateException: Some intrusive holders were not registered: [Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}, Reference{null=air}]
	at net.minecraft.class_2370.method_40276(class_2370.java:364) ~[client-intermediary.jar:?]
	at net.minecraft.class_7923.method_47491(class_7923.java:239) ~[client-intermediary.jar:?]
	at net.minecraft.class_7923.method_47476(class_7923.java:223) ~[client-intermediary.jar:?]
	at net.minecraft.class_310.handler$zha001$fabric-registry-sync-v0$onStart(class_310.java:5039) ~[client-intermediary.jar:?]
	at net.minecraft.class_310.method_1514(class_310.java:781) ~[client-intermediary.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:250) ~[minecraft-1.20.1-client.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:468) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) ~[fabric-loader-0.14.22.jar:?]
	at org.prismlauncher.launcher.impl.StandardLauncher.launch(StandardLauncher.java:88) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.listen(EntryPoint.java:126) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.main(EntryPoint.java:71) ~[NewLaunch.jar:?]
[13:57:45] [Render thread/INFO]: Stopping!
[13:57:45] [Render thread/ERROR]: Shutdown failure!
java.util.ConcurrentModificationException: null
	at java.util.HashMap.forEach(HashMap.java:1424) ~[?:?]
	at net.minecraft.class_1060.close(class_1060.java:174) ~[client-intermediary.jar:?]
	at net.minecraft.class_310.close(class_310.java:1138) ~[client-intermediary.jar:?]
	at net.minecraft.class_310.method_1490(class_310.java:1113) ~[client-intermediary.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:266) ~[minecraft-1.20.1-client.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:468) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) ~[fabric-loader-0.14.22.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) ~[fabric-loader-0.14.22.jar:?]
	at org.prismlauncher.launcher.impl.StandardLauncher.launch(StandardLauncher.java:88) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.listen(EntryPoint.java:126) ~[NewLaunch.jar:?]
	at org.prismlauncher.EntryPoint.main(EntryPoint.java:71) ~[NewLaunch.jar:?]
2023-09-01 13:57:46,019 Worker-Main-3 WARN Unable to register Log4j shutdown hook because JVM is shutting down. Using SimpleLogger
Process exited with code 0.
```

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
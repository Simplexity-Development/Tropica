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
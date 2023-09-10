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
### Coconut Item/Block
* Coconut trees spawn both coconut blocks and crops. they are just different ways of obtaining them. they have different utilities gameplay-wise (coconut crops are meant to be farmable and grown back. they are the little models and consist of 3 stages, ripe ripening and unripe. you can’t obtain a coconut drop unless you break a ripe coconut, but whenever you hit a coconut of any kind it will fall and deal 5 hearts of damage if you are hit, it will then drop a coconut item. Whenever you break a coconut of any kind, it will also be replaced by a coconut tuft, which can then grow back into an unripe coconut.
Coconut blocks, on the other hand, are best seen as ores. they spawn in cubic clusters under the canopy, and they also have the 3 stages which will mature too. they also will fall when hit and you can only obtain 5-9 coconut items on the ripe stage. they will also deal 6 hearts of damage if you get hit. Furthermore, coconut blocks won’t spawn a tuft whenever broken)
* You can make a coconut fall out of a coconut tree by hitting it with a bow
* Whenever a coconut crop falls, it will drop a coconut item on impact. blocks, instead, won’t drop coconut items but you will need to break them manually to get the items
* The coconut crop has 3 ripening stages. unripe (green), ripening (orange), and ripe (brown)
* Planting a coconut spawns a tree. what i meant for crop is a situation like sweet berry bushes. the crop (little coconut models) will spawn under the tree canopy with the blocks too
* There are both crops (little coconut models) and full blocks.
## Black mangroves
* black mangroves are cold hardy mangroves which spawn in both mangrove swamps, regular swamps and rarely jungles
* unlike regular mangroves, they don’t have mangrove blocks but instead black mangrove knees
* black mangrove knees deal damage when you sprint on them (not regularly), they can be harvested for sticks and you can place them underwater too.
* black mangrove has its own woodset


# Other notes


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

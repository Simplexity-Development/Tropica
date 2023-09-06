package simplexity.tropica.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.world.World;

public class TropicaBoat extends BoatEntity {

    private final TropicaBoat boatData;

    public TropicaBoat(EntityType<? extends BoatEntity> type, World world) {
        super(type, world);
        boatData = this;
    }

    public TropicaBoat getBoatData() { return boatData; }
}

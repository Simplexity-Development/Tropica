package simplexity.tropica.entity;

import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import simplexity.tropica.registry.TropicaEntity;
import simplexity.tropica.registry.TropicaItem;
import simplexity.tropica.registry.TropicaSound;

public class CoconutEntity extends ThrownItemEntity {
    public CoconutEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public CoconutEntity(World world, LivingEntity owner) {
        super(TropicaEntity.COCONUT, owner, world);
    }

    public CoconutEntity(World world, double x, double y, double z) {
        super(TropicaEntity.COCONUT, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return TropicaItem.COCONUT;
    }

    protected void onEntityHit(EntityHitResult result) {
        super.onEntityHit(result);
        result.getEntity().damage(this.getDamageSources().thrown(this, this.getOwner()), 5.0f);
    }

    protected void onCollision(HitResult result) {
        super.onCollision(result);
        if (!this.getWorld().isClient()) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.getWorld().playSound(null, this.getBlockPos(), TropicaSound.COCONUT_BREAK_SOUND_EVENT, SoundCategory.BLOCKS, 1f, 1f);
            this.kill();
        }
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            for (int i = 0; i < 8; i++) {
                this.getWorld().addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM,
                        this.getStack()), this.getX(), this.getY(), this.getZ(),
                        ((double)this.random.nextFloat() - 0.5),
                        ((double)this.random.nextFloat() - 0.5),
                        ((double)this.random.nextFloat() - 0.5)
                );
            }
        }
    }

}

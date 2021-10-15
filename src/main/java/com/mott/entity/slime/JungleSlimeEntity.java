package com.mott.entity.slime;

import com.mott.entity.base.BaseSlimeEntity;
import com.mott.listener.EntityListener;
import com.mott.listener.ItemListener;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class JungleSlimeEntity extends BaseSlimeEntity {

    public JungleSlimeEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.4D));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0D));
        this.goalSelector.add(3, new TemptGoal(this, 1.0D, Ingredient.ofItems(new ItemConvertible[]{Items.WHEAT_SEEDS}), false));
        this.goalSelector.add(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(7, new LookAroundGoal(this));
    }

    @Override
    public void tickMovement() {
        if (!this.world.isClient && this.isAlive() && !this.isBaby() && --this.ballLayTime <= 0) {
            this.playSound(SoundEvents.ENTITY_SLIME_JUMP, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
            this.dropItem(ItemListener.JUNGLE_SLIME_BALL);
            this.ballLayTime = this.random.nextInt(6000) + 6000;
        }
        super.tickMovement();
    }

    @Nullable
    @Override
    public JungleSlimeEntity createChild(ServerWorld world, PassiveEntity entity) {
        return (JungleSlimeEntity) EntityListener.JUNGLE_SLIME.create(world);
    }

    @Override
    public void onDeath(DamageSource source) {
        if (source.isMagic()) {
            this.dropStack(ItemListener.JUNGLE_SLIME_SPAWN_EGG.getDefaultStack());
        }
        super.onDeath(source);
    }
}

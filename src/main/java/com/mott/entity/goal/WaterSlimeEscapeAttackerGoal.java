package com.mott.entity.goal;

import com.mott.entity.slime.WaterSlimeEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class WaterSlimeEscapeAttackerGoal extends Goal {

    protected final PathAwareEntity mob;
    protected final double speed;
    protected double targetX;
    protected double targetY;
    protected double targetZ;
    protected boolean active;
    private int timer;

    public WaterSlimeEscapeAttackerGoal(PathAwareEntity mob, double speed) {
        this.mob = mob;
        this.speed = speed;
        this.setControls(EnumSet.of(Control.MOVE));
    }

    @Override
    public boolean canStart() {
        this.timer = 0;
        if (this.mob.getAttacker() == null && !this.mob.isOnFire()) {
            return false;
        } else {
            if (this.mob.isTouchingWater()) {
                return this.mob.squaredDistanceTo(mob) < 100.0D;
            }
        }
        return true;
    }

    @Override
    public void tick () {
        ++this.timer;
        LivingEntity livingEntity = mob.getAttacker();
        if (livingEntity != null) {
            Vec3d vec3d = new Vec3d(mob.getX() - livingEntity.getX(), mob.getY() - livingEntity.getY(), mob.getZ() - livingEntity.getZ());
            BlockState blockState = mob.world.getBlockState(new BlockPos(mob.getX() + vec3d.x, mob.getY() + vec3d.y, mob.getZ() + vec3d.z));
            FluidState fluidState = mob.world.getFluidState(new BlockPos(mob.getX() + vec3d.x, mob.getY() + vec3d.y, mob.getZ() + vec3d.z));
            if (fluidState.isIn(FluidTags.WATER) || blockState.isAir()) {
                double d = vec3d.length();
                if (d > 0.0D) {
                    vec3d.normalize();
                    float f = 3.0F;
                    if (d > 5.0D) {
                        f = (float) ((double) f - (d - 5.0D) / 5.0D);
                    }

                    if (f > 0.0F) {
                        vec3d = vec3d.multiply((double) f);
                    }
                }
                if (blockState.isAir()) {
                    vec3d = vec3d.subtract(0.0D, vec3d.y, 0.0D);
                    }
                ((WaterSlimeEntity) mob).setSwimmingVector((float) vec3d.x / 20.0F, (float) vec3d.y / 20.0F, (float) vec3d.z / 20.0F);
                }

                if (this.timer % 10 == 5) {
                    ((WaterSlimeEntity) mob).world.addParticle(ParticleTypes.BUBBLE, mob.getX(), mob.getY(), mob.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }
    }
}


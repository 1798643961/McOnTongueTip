package com.mott.entity.goal;

import com.mott.entity.slime.WaterSlimeEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.MathHelper;

public class WaterSlimeSwimGoal extends Goal {

    private final WaterSlimeEntity waterSlime;

    public WaterSlimeSwimGoal(WaterSlimeEntity waterSlime) {
        this.waterSlime = waterSlime;
    }

    @Override
    public boolean canStart() {
        return true;
    }

    @Override
    public void tick() {
        int i = this.waterSlime.getDespawnCounter();
        if (i > 100) {
            this.waterSlime.setSwimmingVector(0.0F, 0.0F, 0.0F);
        } else if (this.waterSlime.getRandom().nextInt(50) == 0 || !this.waterSlime.isTouchingWater() || !this.waterSlime.hasSwimmingVector()) {
            float f = this.waterSlime.getRandom().nextFloat() * 6.2831855F;
            float g = MathHelper.cos(f) * 0.2F;
            float h = -0.1F + this.waterSlime.getRandom().nextFloat() * 0.2F;
            float j = MathHelper.sin(f) * 0.2F;
            this.waterSlime.setSwimmingVector(g, h, j);
        }

    }
}

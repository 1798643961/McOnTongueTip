package com.mott.mixin;

import com.mott.config.ModConfig;
import com.mott.listener.EntityListener;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class WaterSlimeSpawnMixin {

    @Inject(method = "addOceanMobs", at =@At("RETURN"))
    private static void addWaterSlimeOceanSpawn(SpawnSettings.Builder builder, int squidWeight, int squidMaxGroupSize, int codWeight, CallbackInfo ci) {
        if (ModConfig.waterSlimeSpawn) {
            builder.spawn(SpawnGroup.WATER_CREATURE, new SpawnSettings.SpawnEntry(EntityListener.WATER_SLIME, 100, 1, 6));
        }
    }

    @Inject(method = "addWarmOceanMobs", at =@At("RETURN"))
    private static void addWaterSlimeWarmOceanSpawn(SpawnSettings.Builder builder, int squidWeight, int squidMinGroupSize, CallbackInfo ci) {
        if (ModConfig.waterSlimeSpawn) {
            builder.spawn(SpawnGroup.WATER_CREATURE, new SpawnSettings.SpawnEntry(EntityListener.WATER_SLIME, 100, 1, 6));
        }
    }
}

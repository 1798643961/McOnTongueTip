package com.mott.mixin;

import com.mott.listener.EntityListener;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class MoonSlimeSpawnMixin {

    @Inject(method = "addMonsters", at = @At("RETURN"))
    private static void addMoonSlimeSpawn(SpawnSettings.Builder builder, int zombieWeight, int zombieVillagerWeight, int skeletonWeight, CallbackInfo ci) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityListener.MOON_SLIME, 12, 1, 4));
    }
}

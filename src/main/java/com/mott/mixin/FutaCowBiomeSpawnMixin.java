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
public class FutaCowBiomeSpawnMixin {

    @Inject(method = "addJungleMobs", at =@At("RETURN"))
    private static void addFutaCowJungleSpawn(SpawnSettings.Builder builder, CallbackInfo ci) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityListener.FUTA_COW, 10, 1, 4));
    }

    @Inject(method = "addPlainsMobs", at =@At("RETURN"))
    private static void adFutaCowPlainsSpawn(SpawnSettings.Builder builder, CallbackInfo ci) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityListener.FUTA_COW, 10, 1, 4));
    }
}

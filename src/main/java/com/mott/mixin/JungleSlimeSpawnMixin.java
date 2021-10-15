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
public class JungleSlimeSpawnMixin {

    @Inject(method = "addJungleMobs", at =@At("RETURN"))
    private static void addJungleSlimeSpawn(SpawnSettings.Builder builder, CallbackInfo ci) {
        if (ModConfig.jungleSlimeSpawn) {
            builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityListener.JUNGLE_SLIME, 100, 1, 6));
        }
    }
}

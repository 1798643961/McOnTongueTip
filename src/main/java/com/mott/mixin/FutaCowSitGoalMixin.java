package com.mott.mixin;

import com.mott.config.ModConfig;
import com.mott.entity.FutaCowEntity;
import net.minecraft.entity.ai.goal.SitGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.TranslatableText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SitGoal.class)
public abstract class FutaCowSitGoalMixin {

    @Shadow @Final private TameableEntity tameable;

    PlayerEntity futa_cow_owner = (PlayerEntity) tameable.getOwner();

    @Inject(method = "start", at = @At("RETURN"))
    private void onFutaCowStart(CallbackInfo ci) {
        if (this.tameable instanceof FutaCowEntity && ModConfig.showFutaCowInfo){
            futa_cow_owner.sendMessage(new TranslatableText("mott.futa_cow.1"), false);
        }
    }

    @Inject(method = "stop", at =@At("RETURN"))
    private void onFutaCowStop(CallbackInfo ci) {
        if (this.tameable instanceof FutaCowEntity && ModConfig.showFutaCowInfo) {
            futa_cow_owner.sendMessage(new TranslatableText("mott.futa_cow.2"), false);
        }
    }
}

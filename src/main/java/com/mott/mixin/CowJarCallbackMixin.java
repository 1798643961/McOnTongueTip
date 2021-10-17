package com.mott.mixin;

import com.mott.event.CowJarCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class CowJarCallbackMixin {

    @Inject(method = "damage", at = @At("RETURN"))
    private void fireCowJarCallback(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        ActionResult result = CowJarCallback.EVENT.invoker().interact((LivingEntity) (Object) this, source);

        if(result == ActionResult.FAIL) {
            cir.cancel();
        }
    }
}

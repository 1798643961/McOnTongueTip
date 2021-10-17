package com.mott.mixin;

import com.mott.listener.SoundEventListener;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerDeathMixin {


    @Shadow public abstract void playSound(SoundEvent sound, float volume, float pitch);

    @Inject(method = "getDeathSound", at = @At("TAIL"))
    private void playDeathSound(CallbackInfoReturnable<SoundEvent> cir) {
        PlayerEntity player = ((PlayerEntity) (Object) this);
        World world = player.getEntityWorld();
        world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEventListener.DEATH_SOUND, SoundCategory.PLAYERS, 0.5F, world.random.nextFloat() * 0.1F + 0.9F);
    }
}

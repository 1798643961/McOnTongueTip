package com.mott.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.ActionResult;

public interface CowJarCallback {

    Event<CowJarCallback> EVENT = EventFactory.createArrayBacked(CowJarCallback.class,
            (listeners) -> (entity, source) -> {
                for (CowJarCallback listener : listeners) {
                    ActionResult result = listener.interact(entity, source);

                    if(result != ActionResult.PASS) {
                        return result;
                    }
                }

                return ActionResult.PASS;
            });

    ActionResult interact(LivingEntity entity, DamageSource source);
}
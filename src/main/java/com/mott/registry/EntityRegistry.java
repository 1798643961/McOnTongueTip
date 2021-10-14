package com.mott.registry;

import com.mott.entity.FutaCowEntity;
import com.mott.entity.MoonSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import static com.mott.listener.EntityListener.*;

public class EntityRegistry {

    public static void registerEntities() {
        FabricDefaultAttributeRegistry.register(FUTA_COW, FutaCowEntity.createFutaCowAttributes());
        FabricDefaultAttributeRegistry.register(MOON_SLIME, MoonSlimeEntity.createMoonSlimeAttributes());
    }

}

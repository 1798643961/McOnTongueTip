package com.mott.registry;

import com.mott.entity.FutaCowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import static com.mott.listener.EntityListener.FUTA_COW;

public class EntityRegistry {

    public static void registerEntities() {
        FabricDefaultAttributeRegistry.register(FUTA_COW, FutaCowEntity.createFutaCowAttributes());
    }

}

package com.mott.registry;

import com.mott.entity.renderer.FutaCowEntityRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import static com.mott.listener.EntityListener.FUTA_COW;

public class ClientRegistry {

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        EntityRendererRegistry.register(FUTA_COW,
                context -> new FutaCowEntityRenderer(context));
    }
}

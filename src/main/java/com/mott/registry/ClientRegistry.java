package com.mott.registry;

import com.mott.entity.renderer.FutaCowEntityRenderer;
import com.mott.entity.renderer.MoonSlimeEntityRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import com.mott.listener.EntityListener;

public class ClientRegistry {

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        EntityRendererRegistry.register(EntityListener.FUTA_COW, (context) -> {
            return new FutaCowEntityRenderer(context);
        });
        EntityRendererRegistry.register(EntityListener.MOON_SLIME, (context) -> {
            return new MoonSlimeEntityRenderer(context);
        });
    }
}

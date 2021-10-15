package com.mott.registry;

import com.mott.entity.renderer.FutaCowEntityRenderer;
import com.mott.entity.renderer.JungleSlimeEntityRenderer;
import com.mott.entity.renderer.MoonSlimeEntityRenderer;
import com.mott.entity.renderer.WaterSlimeEntityRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import com.mott.listener.EntityListener;
import net.minecraft.client.render.RenderLayer;

import static com.mott.listener.CropListener.*;

public class ClientRegistry {

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RICE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TOMATO_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), GREEN_TEA_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BERRY_CROP);
        EntityRendererRegistry.register(EntityListener.FUTA_COW, (context) -> {return new FutaCowEntityRenderer(context);});
        EntityRendererRegistry.register(EntityListener.MOON_SLIME, (context) -> {return new MoonSlimeEntityRenderer(context);});
        EntityRendererRegistry.register(EntityListener.WATER_SLIME, (context) -> {return new WaterSlimeEntityRenderer(context);});
        EntityRendererRegistry.register(EntityListener.JUNGLE_SLIME, (context) -> {return new JungleSlimeEntityRenderer(context);});
    }
}

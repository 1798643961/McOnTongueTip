package com.mott.entity.renderer;

import com.mott.entity.block.SitToiletEntity;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class SitToiletRenderer extends EntityRenderer<SitToiletEntity> {

    public SitToiletRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public boolean shouldRender(SitToiletEntity entity, Frustum frustum, double d, double e, double f)
    {
        return false;
    }

    @Override
    public Identifier getTexture(SitToiletEntity entity) {
        return null;
    }
}

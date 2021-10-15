package com.mott.entity.renderer;

import com.mott.entity.slime.WaterSlimeEntity;
import com.mott.util.Reference;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.util.Identifier;

public class WaterSlimeEntityRenderer extends MobEntityRenderer<WaterSlimeEntity, SlimeEntityModel<WaterSlimeEntity>> {

    public WaterSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25F);
        this.addFeature(new SlimeOverlayFeatureRenderer(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(WaterSlimeEntity entity) {
        return new Identifier(Reference.MODID, "textures/entity/water_slime.png");
    }
}

package com.mott.entity.renderer;

import com.mott.entity.MoonSlimeEntity;
import com.mott.util.Reference;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MoonSlimeEntityRenderer extends MobEntityRenderer<MoonSlimeEntity, SlimeEntityModel<MoonSlimeEntity>> {

    public MoonSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25F);
        this.addFeature(new SlimeOverlayFeatureRenderer(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(MoonSlimeEntity entity) {
        return new Identifier(Reference.MODID, "textures/entity/moon_slime.png");
    }

    @Override
    public void render(MoonSlimeEntity slimeEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        this.shadowRadius = 0.25F * 0.25f;
        super.render(slimeEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected void scale(MoonSlimeEntity slimeEntity, MatrixStack matrixStack, float f) {
        float g = 0.999F;
        matrixStack.scale(0.999F, 0.999F, 0.999F);
        matrixStack.translate(0.0D, 0.0010000000474974513D, 0.0D);
        float h = 0.25f;
        float j = 1.0F;
        matrixStack.scale(j * h, 1.0F / j * h, j * h);
    }

}

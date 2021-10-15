package com.mott.entity.renderer;

import com.mott.entity.slime.JungleSlimeEntity;
import com.mott.util.Reference;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.util.Identifier;

public class JungleSlimeEntityRenderer extends MobEntityRenderer<JungleSlimeEntity, SlimeEntityModel<JungleSlimeEntity>> {

    public JungleSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25F);
        this.addFeature(new SlimeOverlayFeatureRenderer(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(JungleSlimeEntity entity) {
        return new Identifier(Reference.MODID, "textures/entity/jungle_slime.png");
    }
}

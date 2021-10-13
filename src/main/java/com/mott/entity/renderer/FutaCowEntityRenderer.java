package com.mott.entity.renderer;

import com.mott.entity.FutaCowEntity;
import com.mott.util.Reference;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class FutaCowEntityRenderer extends MobEntityRenderer<FutaCowEntity, CowEntityModel<FutaCowEntity>> {

    public FutaCowEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CowEntityModel(context.getPart(EntityModelLayers.COW)), 0.7F);
    }

    @Override
    public Identifier getTexture(FutaCowEntity entity) {
        return new Identifier(Reference.MODID, "textures/entity/futa_cow.png");
    }
}

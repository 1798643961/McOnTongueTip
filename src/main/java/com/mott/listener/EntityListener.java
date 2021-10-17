package com.mott.listener;

import com.mott.entity.FutaCowEntity;
import com.mott.entity.block.SitToiletEntity;
import com.mott.entity.slime.JungleSlimeEntity;
import com.mott.entity.slime.MoonSlimeEntity;
import com.mott.entity.slime.WaterSlimeEntity;
import com.mott.util.Reference;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityListener {

    public static final EntityType FUTA_COW= initEntityType("futa_cow", FutaCowEntity::new, 0.9F, 1.4F);
    public static final EntityType MOON_SLIME = initEntityType("moon_slime", MoonSlimeEntity::new, 0.51f, 0.51f);
    public static final EntityType WATER_SLIME = initEntityType("water_slime", WaterSlimeEntity::new, 0.51f, 0.51f);
    public static final EntityType JUNGLE_SLIME = initEntityType("jungle_slime", JungleSlimeEntity::new, 0.51f, 0.51f);
    public static final EntityType<SitToiletEntity> SIT_TOILET_ENTITY_TYPE = initEntityType("sit_toilet_entity", SitToiletEntity::new, 0.001F, 0.001F);

    private static EntityType initEntityType(String path, EntityType.EntityFactory factory, float width, float height) {
        return Registry.register(
                Registry.ENTITY_TYPE,
                new Identifier(Reference.MODID, path),
                FabricEntityTypeBuilder.
                create(SpawnGroup.CREATURE, factory).
                dimensions(EntityDimensions.fixed(width, height)).build());
    }
}

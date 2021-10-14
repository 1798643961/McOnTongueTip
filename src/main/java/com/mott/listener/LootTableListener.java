package com.mott.listener;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

public class LootTableListener {

    /*Blocks Loot Table*/
    public static final Identifier GRASS_LOOT_TABLE_ID = genBlockDrops(Blocks.GRASS);
    public static final Identifier TALLGRASS_LOOT_TABLE_ID = genBlockDrops(Blocks.TALL_GRASS);

    /*Entities Loot Table*/
    public static final Identifier SQUID_RAW_TABLE_ID = genEntityDrops(EntityType.SQUID);
    public static final Identifier GLOW_SQUID_RAW_TABLE_ID = genEntityDrops(EntityType.GLOW_SQUID);
    public static final Identifier BAT_WING_TABLE_ID = genEntityDrops(EntityType.BAT);
    public static final Identifier HORSE_MEAT_TABLE_ID = genEntityDrops(EntityType.HORSE);
    public static final Identifier LLAMA_MEAT_TABLE_ID = genEntityDrops(EntityType.LLAMA);
    public static final Identifier WOLF_MEAT_TABLE_ID = genEntityDrops(EntityType.WOLF);
    public static final Identifier CREEPER_HIDE_TABLE_ID = genEntityDrops(EntityType.CREEPER);

    private static Identifier genEntityDrops(EntityType type) {
        return type.getLootTableId();
    }

    private static Identifier genBlockDrops(Block block) {
        return block.getLootTableId();
    }
}

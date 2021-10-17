package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mott.listener.ItemListener.*;

public class ItemRegistry {

    public static void registerItems() {
        initItem("futa_cow_spawn_egg", FUTA_COW_SPAWN_EGG);
        initItem("moon_slime_spawn_egg", MOON_SLIME_SPAWN_EGG);
        initItem("water_slime_spawn_egg", WATER_SLIME_SPAWN_EGG);
        initItem("water_slime_ball", WATER_SLIME_BALL);
        initItem("water_slime_gel", WATER_SLIME_GEL);
        initItem("moon_slime_ball", MOON_SLIME_BALL);
        initItem("moon_slime_gel", MOON_SLIME_GEL);
        initItem("green_tea_seed", GREEN_TEA_SEED);
        initItem("rice_seed", RICE_SEED);
        initItem("tomato_seed", TOMATO_SEED);
        initItem("creeper_hide", CREEPER_HIDE);
        initItem("creeper_dust", CREEPER_DUST);
        initItem("jungle_slime_ball", JUNGLE_SLIME_BALL);
        initItem("jungle_slime_gel", JUNGLE_SLIME_GEL);
        initItem("jungle_slime_spawn_egg", JUNGLE_SLIME_SPAWN_EGG);
        initItem("green_tea_crystal", GREEN_TEA_CRYSTAl);
    }

    private static void initItem(String path, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MODID, path), item);
    }
}

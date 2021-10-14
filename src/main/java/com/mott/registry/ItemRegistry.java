package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mott.listener.ItemListener.*;

public class ItemRegistry {

    public static void registerItems() {
        /*Others*/
        initItem("futa_cow_spawn_egg", FUTA_COW_SPAWN_EGG);
        initItem("moon_slime_spawn_egg", MOON_SLIME_SPAWN_EGG);
        initItem("water_slime_spawn_egg", WATER_SLIME_SPAWN_EGG);
        initItem("water_slime_ball", WATER_SLIME_BALL);
        initItem("water_slime_gel", WATER_SLIME_GEL);
        initItem("moon_slime_ball", MOON_SLIME_BALL);
        initItem("moon_slime_gel", MOON_SLIME_GEL);
        /*Tea*/
        initItem("green_tea_seed", GREEN_TEA_SEED);
        initItem("rice_seed", RICE_SEED);
        initItem("tomato_seed", TOMATO_SEED);
    }

    private static void initItem(String path, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MODID, path), item);
    }
}

package com.mott.listener;

import com.mott.item.GreenTeaCrystal;
import com.mott.registry.ItemGroupRegistry;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

public class ItemListener {

    public static final Item FUTA_COW_SPAWN_EGG = new SpawnEggItem(EntityListener.FUTA_COW,  12895428, 11382189, ofDefaultItemSettings());
    public static final Item WATER_SLIME_SPAWN_EGG = new SpawnEggItem(EntityListener.WATER_SLIME,  12895428, 11382189, ofDefaultItemSettings());
    public static final Item MOON_SLIME_SPAWN_EGG = new SpawnEggItem(EntityListener.MOON_SLIME,  12895428, 11382189, ofDefaultItemSettings());
    public static final Item JUNGLE_SLIME_SPAWN_EGG = new SpawnEggItem(EntityListener.JUNGLE_SLIME,  12895428, 11382189, ofDefaultItemSettings());
    public static final Item MOON_SLIME_BALL = new Item(ofDefaultItemSettings());
    public static final Item MOON_SLIME_GEL = new Item(ofDefaultItemSettings());
    public static final Item WATER_SLIME_BALL = new Item(ofDefaultItemSettings());
    public static final Item WATER_SLIME_GEL = new Item(ofDefaultItemSettings());
    public static final Item RICE_SEED = new AliasedBlockItem(CropListener.RICE_CROP, ofDefaultItemSettings());
    public static final Item TOMATO_SEED = new AliasedBlockItem(CropListener.TOMATO_CROP, ofDefaultItemSettings());
    public static final Item GREEN_TEA_SEED = new AliasedBlockItem(CropListener.GREEN_TEA_CROP, ofDefaultItemSettings());
    public static final Item CREEPER_HIDE = new Item(ofDefaultItemSettings());
    public static final Item CREEPER_DUST = new Item(ofDefaultItemSettings());
    public static final Item JUNGLE_SLIME_BALL = new Item(ofDefaultItemSettings());
    public static final Item JUNGLE_SLIME_GEL = new Item(ofDefaultItemSettings());
    public static final Item GREEN_TEA_CRYSTAl = new GreenTeaCrystal();

    private static Item.Settings ofDefaultItemSettings() {
        return new Item.Settings().group(ItemGroupRegistry.COMMON_GROUP);
    }
}

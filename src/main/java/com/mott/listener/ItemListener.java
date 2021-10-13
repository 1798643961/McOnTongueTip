package com.mott.listener;

import com.mott.registry.ItemGroupRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

public class ItemListener {

    public static final Item FUTA_COW_SPAWN_EGG = new SpawnEggItem(EntityListener.FUTA_COW,  12895428, 11382189, ofDefaultItemSettings());


    private static Item.Settings ofDefaultItemSettings() {
        return new Item.Settings().group(ItemGroupRegistry.COMMON_GROUP);
    }
}

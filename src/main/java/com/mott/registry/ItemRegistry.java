package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mott.listener.ItemListener.*;

public class ItemRegistry {

    public static void registerItems() {
        initItem("futa_cow_spawn_egg", FUTA_COW_SPAWN_EGG);
    }

    private static void initItem(String path, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MODID, path), item);
    }
}

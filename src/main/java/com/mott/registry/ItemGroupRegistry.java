package com.mott.registry;

import com.mott.listener.ItemListener;
import com.mott.util.Reference;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupRegistry {

    public static final ItemGroup COMMON_GROUP =
            FabricItemGroupBuilder.build(
                    new Identifier(Reference.MODID, "common"),
                    () ->new ItemStack(ItemListener.FUTA_COW_SPAWN_EGG)
    );
}

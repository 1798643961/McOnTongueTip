package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mott.listener.BlockListener.*;

public class BlockRegistry {

    public static void registerBlocks() {
        initBlock("jar", JAR);
        initBlock("cow_jar", COW_JAR);
    }

    private static void initBlock(String path, Block block) {
        Registry.register(Registry.BLOCK,
                new Identifier(Reference.MODID, path), block);
        Registry.register(Registry.ITEM,
                new Identifier(Reference.MODID, path),
                new BlockItem(block, new Item.Settings().group(ItemGroupRegistry.COMMON_GROUP)));
    }
}

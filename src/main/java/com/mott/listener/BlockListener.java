package com.mott.listener;

import com.mott.block.CowJarBlock;
import com.mott.block.JarBlock;
import com.mott.block.ToiletBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;

public class BlockListener {

    public static final Block JAR = new JarBlock();
    public static final Block COW_JAR = new CowJarBlock();
    public static final Block TOILET_BLOCK = new ToiletBlock( () -> {
        return BlockEntityType.CHEST;
    });


}

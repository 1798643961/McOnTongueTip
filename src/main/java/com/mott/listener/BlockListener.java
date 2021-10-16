package com.mott.listener;

import com.mott.block.CowJarBlock;
import com.mott.block.JarBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlockListener {

    public static final Block JAR = new JarBlock();
    public static final Block COW_JAR = new CowJarBlock();

    private static FabricBlockSettings ofDefaultJarSettings() {
        return FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).strength(1.5F, 3.0F);
    }

}

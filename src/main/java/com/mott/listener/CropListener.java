package com.mott.listener;

import com.mott.crop.GreenTeaCrop;
import com.mott.crop.RiceCrop;
import com.mott.crop.TomatoCrop;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CropListener {

    /*Crops*/
    public static final CropBlock RICE_CROP = new RiceCrop(cropSettings());
    public static final CropBlock TOMATO_CROP = new TomatoCrop(cropSettings());
    public static final CropBlock GREEN_TEA_CROP = new GreenTeaCrop(cropSettings());

    private static AbstractBlock.Settings cropSettings() {
        return AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP);
    }
}

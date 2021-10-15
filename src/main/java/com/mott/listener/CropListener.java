package com.mott.listener;

import com.mott.crop.BerryCrop;
import com.mott.crop.GreenTeaCrop;
import com.mott.crop.RiceCrop;
import com.mott.crop.TomatoCrop;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CropListener {

    /*Crops*/
    public static final CropBlock RICE_CROP = new RiceCrop(ofCropSettings());
    public static final CropBlock TOMATO_CROP = new TomatoCrop(ofCropSettings());
    public static final CropBlock GREEN_TEA_CROP = new GreenTeaCrop(ofCropSettings());
    public static final CropBlock BERRY_CROP = new BerryCrop(ofCropSettings());

    private static AbstractBlock.Settings ofCropSettings() {
        return AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP);
    }
}

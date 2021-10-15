package com.mott.crop;

import com.mott.listener.FoodListener;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class BerryCrop extends CropBlock {


    public BerryCrop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return FoodListener.BERRY;
    }
}

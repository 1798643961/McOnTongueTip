package com.mott.crop;

import com.mott.listener.ItemListener;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class TomatoCrop extends CropBlock {

    public TomatoCrop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ItemListener.TOMATO_SEED;
    }
}

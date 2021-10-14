package com.mott.crop;

import com.mott.listener.ItemListener;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class RiceCrop extends CropBlock {

    public RiceCrop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ItemListener.RICE_SEED;
    }
}

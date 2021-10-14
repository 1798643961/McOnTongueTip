package com.mott.crop;

import com.mott.listener.ItemListener;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class GreenTeaCrop extends CropBlock {

    public GreenTeaCrop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ItemListener.GREEN_TEA_SEED;
    }
}

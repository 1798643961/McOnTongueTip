package com.mott.crop;

import com.mott.listener.FoodListener;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BerryCrop extends SweetBerryBushBlock {

    public BerryCrop(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return FoodListener.BERRY.getDefaultStack();
    }
}

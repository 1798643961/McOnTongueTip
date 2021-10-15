package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.block.CropBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mott.listener.CropListener.*;

public class CropRegistry {

    public static void registerCrop() {
        initCrop("rice_crop", RICE_CROP);
        initCrop("tomato_crop", TOMATO_CROP);
        initCrop("green_tea_crop", GREEN_TEA_CROP);
        initCrop("berry_crop", BERRY_CROP);
    }

    private static void initCrop(String path, CropBlock block) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MODID, path), block);
    }
}

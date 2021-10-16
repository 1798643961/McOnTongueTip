package com.mott;

import com.mott.config.Configuration;
import com.mott.config.ModConfig;
import com.mott.registry.*;
import com.mott.util.Reference;
import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer{

    @Override
    public void onInitialize() {
        ItemRegistry.registerItems();
        EntityRegistry.registerEntities();
        FoodRegistry.registerFood();
        CropRegistry.registerCrop();
        BlockRegistry.registerBlocks();
        LootTableRegistry.registerLootTable();
        WorldGenRgeistry.registerWorldGen();
        new Configuration(ModConfig.class, Reference.MODID);
    }
}

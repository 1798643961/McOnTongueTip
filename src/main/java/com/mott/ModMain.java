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
        FoodRegistry.registerFood();
        CropRegistry.registerCrop();
        BlockRegistry.registerBlocks();
        EntityRegistry.registerEntities();
        LootTableRegistry.registerLootTable();
        WorldGenRgeistry.registerWorldGen();
        EventRegistry.reigsterEvent();
        SoundEventRegistry.registerSoundEvents();
        new Configuration(ModConfig.class, Reference.MODID);
    }
}

package com.mott;

import com.mott.config.Configuration;
import com.mott.config.ModConfig;
import com.mott.registry.EntityRegistry;
import com.mott.registry.ItemRegistry;
import com.mott.util.Reference;
import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer{

    @Override
    public void onInitialize() {
        ItemRegistry.registerItems();
        EntityRegistry.registerEntities();
        new Configuration(ModConfig.class, Reference.MODID);
    }
}

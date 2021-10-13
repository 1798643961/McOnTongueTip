package com.mott;

import com.mott.registry.ClientRegistry;
import net.fabricmc.api.ClientModInitializer;

public class ClientModMain implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientRegistry.registerClient();
    }
}

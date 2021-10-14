package com.mott.listener;

import com.mott.util.Reference;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class WorldGenListener {

    public static final RegistryKey<Biome> MOON_BIOME_KEY = ofBiomeKey("moon_biome");

    private static RegistryKey<Biome> ofBiomeKey(String path) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(Reference.MODID, path));
    }
}

package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import static com.mott.gen.MoonBiomeFeatures.*;
import static com.mott.listener.WorldGenListener.*;

public class WorldGenRgeistry {

    public static void registerWorldGen() {
        initBiomeGen("moon_biome", MOON_BIOME_SURFACE_BUILDER, MOON_BIOME_KEY, MOON_BIOME);
    }

    private static void initBiomeGen(String path, ConfiguredSurfaceBuilder<TernarySurfaceConfig> builder, RegistryKey<Biome> key, Biome biome) {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(Reference.MODID, path), builder);
        Registry.register(BuiltinRegistries.BIOME, key.getValue(), biome);
    }
}

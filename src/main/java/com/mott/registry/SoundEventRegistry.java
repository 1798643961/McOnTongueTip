package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mott.listener.SoundEventListener.*;

public class SoundEventRegistry {

    public static void registerSoundEvents() {
        initSound("death", DEATH_SOUND);
        initSound("giegie", GIEGIE_SOUND);
    }

    private static void initSound(String path, SoundEvent sound) {
        Registry.register(Registry.SOUND_EVENT, new Identifier(Reference.MODID, path), sound);
    }
}

package com.mott.listener;

import com.mott.util.Reference;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundEventListener {

    public static SoundEvent DEATH_SOUND = new SoundEvent(new Identifier(Reference.MODID, "death"));
    public static SoundEvent GIEGIE_SOUND = new SoundEvent(new Identifier(Reference.MODID, "giegie"));
}

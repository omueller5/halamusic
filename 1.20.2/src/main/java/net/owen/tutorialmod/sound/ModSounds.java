package net.owen.tutorialmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.owen.tutorialmod.TutorialMod;

public class ModSounds {
    public static final SoundEvent METAL_DETECTOR_FOUND_ORE = registerSoundEvent("metal_detector_found_ore");
    private static final SoundEvent SOUND_BLOCK_BREAK = registerSoundEvent("sound_block_break");
    private static final SoundEvent SOUND_BLOCK_STEP = registerSoundEvent("sound_block_step");
    private static final SoundEvent SOUND_BLOCK_PLACE = registerSoundEvent("sound_block_place");
    private static final SoundEvent SOUND_BLOCK_HIT = registerSoundEvent("sound_block_hit");
    private static final SoundEvent SOUND_BLOCK_FALL = registerSoundEvent("sound_block_fall");
    public static final SoundEvent I_PROMISE = registerSoundEvent("i_promise");

    public static final BlockSoundGroup SOUND_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.SOUND_BLOCK_BREAK,
            ModSounds.SOUND_BLOCK_STEP,
            ModSounds.SOUND_BLOCK_PLACE,
            ModSounds.SOUND_BLOCK_HIT,
            ModSounds.SOUND_BLOCK_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        TutorialMod.LOGGER.info("Registering Sounds for " + TutorialMod.MOD_ID);
    }
}

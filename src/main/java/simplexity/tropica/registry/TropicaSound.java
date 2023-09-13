package simplexity.tropica.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class TropicaSound {
    public static final Identifier COCONUT_BREAK = new Identifier("tropica:coconut_break");
    public static SoundEvent COCONUT_BREAK_SOUND_EVENT = SoundEvent.of(COCONUT_BREAK);
    
    public void registerSounds(){
        Registry.register(Registries.SOUND_EVENT, COCONUT_BREAK, COCONUT_BREAK_SOUND_EVENT);
    }

}

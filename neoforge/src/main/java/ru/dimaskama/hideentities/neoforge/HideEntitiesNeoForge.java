package ru.dimaskama.hideentities.neoforge;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;

import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import ru.dimaskama.hideentities.HideEntities;

@Mod(HideEntities.MOD_ID)
public final class HideEntitiesNeoForge {

    public HideEntitiesNeoForge() {
        HideEntities.init();
    }

    @SubscribeEvent
    public static void registerKeybinds(RegisterKeyMappingsEvent event) {
        event.register(HideEntities.CHANGE_MODE_KEY);
    }

}

package ru.dimaskama.hideentities.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import ru.dimaskama.hideentities.HideEntities;

public final class HideEntitiesFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HideEntities.init();
        KeyBindingHelper.registerKeyBinding(HideEntities.CHANGE_MODE_KEY);
    }

}

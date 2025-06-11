package ru.dimaskama.hideentities;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public final class HideEntities {

    public static final String MOD_ID = "hideentities";
    public static final KeyBinding CHANGE_MODE_KEY = new KeyBinding(
            "key.hideentities.change_mode",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_H,
            MOD_ID
    );
    private static boolean entitiesHidden;

    public static void init() {

    }

    public static void handleInput(MinecraftClient client) {
        while (CHANGE_MODE_KEY.wasPressed()) {
            entitiesHidden = !entitiesHidden;
            client.player.sendMessage(Text.translatable(entitiesHidden ? "hideentities.hidden" : "hideentities.visible"), true);
        }
    }

    public static boolean areEntitiesHidden() {
        return entitiesHidden;
    }

}

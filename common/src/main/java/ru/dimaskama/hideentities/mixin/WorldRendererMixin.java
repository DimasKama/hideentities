package ru.dimaskama.hideentities.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.dimaskama.hideentities.HideEntities;

@Mixin(WorldRenderer.class)
abstract class WorldRendererMixin {

    @Inject(method = "getEntitiesToRender", at = @At("HEAD"), cancellable = true)
    private void modifyRenderedEntities(CallbackInfoReturnable<Boolean> cir) {
        if (HideEntities.areEntitiesHidden()) {
            cir.setReturnValue(false);
        }
    }

}

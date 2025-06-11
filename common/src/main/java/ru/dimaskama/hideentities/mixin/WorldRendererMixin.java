package ru.dimaskama.hideentities.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import ru.dimaskama.hideentities.HideEntities;

import java.util.List;

@Mixin(WorldRenderer.class)
abstract class WorldRendererMixin {

    @ModifyExpressionValue(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/world/ClientWorld;getEntities()Ljava/lang/Iterable;"))
    private Iterable<Entity> modifyRenderedEntities(Iterable<Entity> original) {
        return HideEntities.areEntitiesHidden() ? List.of() : original;
    }

}

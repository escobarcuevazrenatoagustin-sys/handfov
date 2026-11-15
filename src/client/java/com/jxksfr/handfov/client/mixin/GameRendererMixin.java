package com.jxksfr.handfov.client.mixin;

import com.jxksfr.handfov.client.HandFOVClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "getFov", at = @At("RETURN"), cancellable = true)
    private void handfov$modify(Camera camera, float tickProgress, boolean changingFov,
                                CallbackInfoReturnable<Float> cir) {
        if (!changingFov) { // false = FOV de la mano
            cir.setReturnValue(HandFOVClient.HAND_FOV);
        }
    }
}

/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meow.cats.mixin;

import meow.cats.Config;
import net.minecraft.client.gui.components.BossHealthOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BossHealthOverlay.class)
public abstract class MixinBossHealthOverlay {
    @Inject(method = "extractRenderState", at = @At("HEAD"), cancellable = true)
    private void onRender(CallbackInfo ci) {
        if (Config.INSTANCE.noBossBar) ci.cancel();
    }

}
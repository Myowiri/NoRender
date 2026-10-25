/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meow.cats.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import meow.cats.Config;
import net.minecraft.client.renderer.fog.environment.MobEffectFogEnvironment;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MobEffectFogEnvironment.class)
public abstract class MixinMobEffectFogEnvironment {
    @Shadow
    public abstract Holder<MobEffect> getMobEffect();

    @ModifyReturnValue(method = "isApplicable", at = @At("RETURN"))
    private boolean modifyShouldApply(boolean original) {
        if (getMobEffect() == MobEffects.BLINDNESS) return original && !Config.INSTANCE.noBlindness;
        if (getMobEffect() == MobEffects.DARKNESS) return original && !Config.INSTANCE.noBlindness;
        return original;
    }
}
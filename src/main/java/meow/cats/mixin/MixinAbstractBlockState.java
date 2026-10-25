/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meow.cats.mixin;

import meow.cats.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBehaviour.BlockStateBase.class)
public abstract class MixinAbstractBlockState {
    @Inject(method = "getOffset", at = @At("HEAD"), cancellable = true)
    private void modifyPos(BlockPos pos, CallbackInfoReturnable<Vec3> cir) {
        if (Config.INSTANCE.noTextureRotations) cir.setReturnValue(Vec3.ZERO);
    }
}
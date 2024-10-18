package com.c18h24o2.apcrcompat.mixin;

import com.c18h24o2.apcrcompat.AE2CreateCompat;

import net.minecraft.client.Minecraft;

import net.minecraft.client.main.GameConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class APCRCompatMixin {
	@Inject(method = "<init>", at = @At("TAIL"))
	private void mod$init(GameConfig gameConfig, CallbackInfo ci) {
		AE2CreateCompat.LOGGER.info("Hello from {}", AE2CreateCompat.NAME);
	}
}

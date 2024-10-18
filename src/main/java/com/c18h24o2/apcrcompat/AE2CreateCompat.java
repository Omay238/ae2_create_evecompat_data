package com.c18h24o2.apcrcompat;

import com.c18h24o2.apcrcompat.block.BlockRegistry;
import com.c18h24o2.apcrcompat.fluid.FluidRegistry;
import com.c18h24o2.apcrcompat.item.ItemRegistry;
import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AE2CreateCompat implements ModInitializer {
	public static final String ID = "apcrcompat";
	public static final String NAME = "AE2+Create Compat";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID);
	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}] and requires Applied Energistics 2!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		BlockRegistry.register();
		ItemRegistry.register();

		FluidRegistry.register();

		APCRCreativeEntry.register();

		REGISTRATE.register();
	}

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}
}

package com.c18h24o2.apcrcompat.fluid;

import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;

import static com.c18h24o2.apcrcompat.AE2CreateCompat.REGISTRATE;

public class FluidRegistry {

	public static final FluidEntry<VirtualFluid> EMPTYFLUID = REGISTRATE.virtualFluid("emptyfluid")
			.lang("")
			.register();

	public static void register() {}
}

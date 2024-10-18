package com.c18h24o2.apcrcompat;

import com.simibubi.create.AllCreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

import static com.c18h24o2.apcrcompat.item.ItemRegistry.*;
import static com.c18h24o2.apcrcompat.block.BlockRegistry.*;

public class APCRCreativeEntry {
	public static final AllCreativeModeTabs.TabInfo BASE = register("apcrcompat",
			() -> FabricItemGroup.builder()
					.title(Component.translatable("itemGroup.apcrcompat.base"))
					.icon(FLIMSY_SILICON_PRESS::asStack)
					.build());

	private static AllCreativeModeTabs.TabInfo register(String name, Supplier<CreativeModeTab> supplier) {
		ResourceLocation id = AE2CreateCompat.asResource(name);
		ResourceKey<CreativeModeTab> key = ResourceKey.create(Registries.CREATIVE_MODE_TAB, id);
		CreativeModeTab tab = supplier.get();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
		return new AllCreativeModeTabs.TabInfo(key, tab);
	}

	static {
		ItemGroupEvents.modifyEntriesEvent(APCRCreativeEntry.BASE.key()).register(content -> {
			content.accept(FLIMSY_CALCULATION_PRESS);
			content.accept(FLIMSY_ENGINEERING_PRESS);
			content.accept(FLIMSY_LOGIC_PRESS);
			content.accept(FLIMSY_SILICON_PRESS);
			content.accept(FLIMSY_NAME_PRESS);
			content.accept(CASTING_SAND);
			content.accept(CALCULATION_PRESS_CAST);
			content.accept(ENGINEERING_PRESS_CAST);
			content.accept(LOGIC_PRESS_CAST);
			content.accept(SILICON_PRESS_CAST);
			content.accept(NAME_PRESS_CAST);
		});
	}

	public static void register() {}
}

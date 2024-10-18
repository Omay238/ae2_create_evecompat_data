package com.c18h24o2.apcrcompat.item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;

import static com.c18h24o2.apcrcompat.AE2CreateCompat.REGISTRATE;

public class ItemRegistry {

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_CALCULATION_PROCESSOR = sequencedIngredient("incomplete_calculation_processor"),
	INCOMPLETE_ENGINEERING_PROCESSOR = sequencedIngredient("incomplete_engineering_processor"), INCOMPLETE_LOGIC_PROCESSOR = sequencedIngredient("incomplete_logic_processor"),
	INCOMPLETE_NAME_TAG = sequencedIngredient("incomplete_name_tag"), INCOMPLETE_PRINTED_CALCULATION_PROCESSOR = sequencedIngredient("incomplete_printed_calculation_processor"),
	INCOMPLETE_PRINTED_ENGINEERING_PROCESSOR = sequencedIngredient("incomplete_printed_engineering_processor"), INCOMPLETE_PRINTED_LOGIC_PROCESSOR = sequencedIngredient("incomplete_printed_logic_processor"),
	INCOMPLETE_PRINTED_SILICON = sequencedIngredient("incomplete_printed_silicon"), INCOMPLETE_BASIC_CARD = sequencedIngredient("incomplete_basic_card"),
	INCOMPLETE_ADVANCED_CARD = sequencedIngredient("incomplete_advanced_card"), INCOMPLETE_MEMORY_CARD = sequencedIngredient("incomplete_memory_card"), INCOMPLETE_SINGULARITY = sequencedIngredient("incomplete_singularity");

	public static final ItemEntry<Item> FLIMSY_SILICON_PRESS = ingredient("flimsy_silicon_press"), FLIMSY_CALCULATION_PRESS = ingredient("flimsy_calculation_press"),
	FLIMSY_ENGINEERING_PRESS = ingredient("flimsy_engineering_press"), FLIMSY_LOGIC_PRESS = ingredient("flimsy_logic_press"),
	FLIMSY_NAME_PRESS = ingredient("flimsy_name_press");

	// shortcuts taken from fabricators of create

	private static ItemEntry<Item> ingredient(String name) {
		return REGISTRATE.item(name, Item::new)
				.register();
	}

	private static ItemEntry<SequencedAssemblyItem> sequencedIngredient(String name) {
		return REGISTRATE.item(name, SequencedAssemblyItem::new)
				.register();
	}

	public static void register() {}
}

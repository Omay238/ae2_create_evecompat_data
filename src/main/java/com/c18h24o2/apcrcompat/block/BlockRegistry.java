package com.c18h24o2.apcrcompat.block;

import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

import static com.c18h24o2.apcrcompat.AE2CreateCompat.REGISTRATE;

public class BlockRegistry {

	public static final BlockEntry<Block>
			CASTING_SAND = sandLike("casting_sand"),
			INCOMPLETE_CALCULATION_PRESS_CAST = sandLike("incomplete_calculation_press_cast"), INCOMPLETE_ENGINEERING_PRESS_CAST = sandLike("incomplete_engineering_press_cast"),
			INCOMPLETE_LOGIC_PRESS_CAST = sandLike("incomplete_logic_press_cast"), INCOMPLETE_NAME_PRESS_CAST = sandLike("incomplete_name_press_cast"),
			INCOMPLETE_SILICON_PRESS_CAST = sandLike("incomplete_silicon_press_cast"), CALCULATION_PRESS_CAST = sandLike("calculation_press_cast"),
			ENGINEERING_PRESS_CAST = sandLike("engineering_press_cast"), LOGIC_PRESS_CAST = sandLike("logic_press_cast"), SILICON_PRESS_CAST = sandLike("silicon_press_cast"),
			NAME_PRESS_CAST = sandLike("name_press_cast");


	//shortcuts

	private static BlockEntry<Block> sandLike(String name) {
		return REGISTRATE.block(name, Block::new)
				.initialProperties(() -> Blocks.SAND)
				.properties(p -> p.mapColor(MapColor.CLAY))
				.tag(BlockTags.MINEABLE_WITH_SHOVEL)
				.simpleItem()
				.register();
	}

	public static void register() {}
}

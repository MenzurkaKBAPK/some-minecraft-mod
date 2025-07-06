package com.someshit;

import com.someshit.block.ModBlocks;
import com.someshit.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeShit implements ModInitializer {
	public static final String MOD_ID = "someshit";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Some shit I coded initializing, look!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Some shit I coded done initializing. I hate myself <3");
	}
}
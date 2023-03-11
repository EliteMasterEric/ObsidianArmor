package com.elitemastereric.obsidianarmor;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.elitemastereric.obsidianarmor.items.ModItems;

public class ObsidianArmorMod implements ModInitializer {
    public static final String MOD_ID = "obsidianarmor";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    /**
     * Runs when Minecraft is in a mod-load-ready state.
     * Some things (like resources) may still be uninitialized, so proceed with caution.
     */
    @Override
	public void onInitialize() {
		LOGGER.info("Initializing Obsidian Armor...");

        ModItems.onInitialize(); // Initialize our items.
	}
}

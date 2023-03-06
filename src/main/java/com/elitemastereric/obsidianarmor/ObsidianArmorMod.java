package com.elitemastereric.obsidianarmor;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.elitemastereric.obsidianarmor.items.Items;

public class ObsidianArmorMod implements ModInitializer {
    public static final String MOD_ID = "obsidian-armor";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Runs when Minecraft is in a mod-load-ready state.
     * Some things (like resources) may still be uninitialized, so proceed with caution.
     */
    @Override
	public void onInitialize() {
		LOGGER.info("Initializing Obsidian Armor...");

        Items.onInitialize(); // Initialize our items.
	}
}

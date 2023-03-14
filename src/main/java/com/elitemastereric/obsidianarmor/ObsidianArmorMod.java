package com.elitemastereric.obsidianarmor;

import org.slf4j.Logger;

import com.elitemastereric.obsidianarmor.items.ModItems;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(ObsidianArmorMod.MOD_ID)
public class ObsidianArmorMod {
    public static final String MOD_ID = "obsidianarmor";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ObsidianArmorMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.onInitialize(modEventBus);

        modEventBus.addListener(this::onRegister);
        modEventBus.addListener(this::onCommonSetup);
        modEventBus.addListener(ModItems::onCreativeModeTabRegister);
    }

    private void onRegister(RegisterEvent event) {
        LOGGER.info("Registering Obsidian Armor...");
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing Obsidian Armor...");
    }

    private void onCreativeModTabBuildContents(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            // Add an item to the Building Blocks tab.
        }
    }
}

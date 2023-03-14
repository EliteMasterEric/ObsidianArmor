package com.elitemastereric.obsidianarmor.items;

import com.elitemastereric.obsidianarmor.ObsidianArmorMod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.flag.FeatureFlagSet;

public class ModItems {
    // References to our items.

    // The deferred registry.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianArmorMod.MOD_ID);

    // Armor
    // public static final Item OBSIDIAN_CHESTPLATE = new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant());
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    // Creative Tab
    public static CreativeModeTab ITEM_GROUP;

    public static final ResourceLocation ITEM_GROUP_LOCATION = new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_armor");

    public static void onInitialize(IEventBus eventBus) {
        // Add our ItemRegistry to the event bus, so its items are added later.
        ITEMS.register(eventBus);
    }

    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event) {
        ITEM_GROUP = event.registerCreativeModeTab(ITEM_GROUP_LOCATION, ModItems::buildCreativeModeTab);
    }

    private static CreativeModeTab buildCreativeModeTab(CreativeModeTab.Builder builder) {
        return builder
            .title(Component.translatable("itemGroup.%s.%s".formatted(ITEM_GROUP_LOCATION.getNamespace(), ITEM_GROUP_LOCATION.getPath())))
            .icon(() -> new ItemStack(OBSIDIAN_CHESTPLATE.get()))
            .displayItems(ModItems::addCreativeModeTabItems)
            .build();
    }

    private static void addCreativeModeTabItems(FeatureFlagSet featureFlagSet, CreativeModeTab.Output output, boolean bl) {
        // Add items to the creative tab.
        output.accept(OBSIDIAN_CHESTPLATE.get());
    }
}

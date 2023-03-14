package com.elitemastereric.obsidianarmor.items;

import com.elitemastereric.obsidianarmor.ObsidianArmorMod;
import com.elitemastereric.obsidianarmor.materials.ObsidianArmorMaterial;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.flag.FeatureFlagSet;

public class ModItems {
    // References to our items.

    // The deferred registry.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianArmorMod.MOD_ID);

    // Materials
    public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = new ObsidianArmorMaterial();
    

    // Armor Items
    public static final RegistryObject<Item> OBSIDIAN_HELMET = 
        ITEMS.register("obsidian_helmet", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = 
        ITEMS.register("obsidian_chestplate", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = 
        ITEMS.register("obsidian_leggings", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = 
        ITEMS.register("obsidian_boots", () -> new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().rarity(Rarity.RARE).fireResistant()));

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
        output.accept(OBSIDIAN_HELMET.get());
        output.accept(OBSIDIAN_CHESTPLATE.get());
        output.accept(OBSIDIAN_LEGGINGS.get());
        output.accept(OBSIDIAN_BOOTS.get());
    }
}

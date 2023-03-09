package com.elitemastereric.obsidianarmor.items;

import com.elitemastereric.obsidianarmor.materials.ObsidianArmorMaterial;
import com.elitemastereric.obsidianarmor.materials.ObsidianToolMaterial;
import com.elitemastereric.obsidianarmor.ObsidianArmorMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier; // ToolMaterial
import net.minecraft.world.item.Rarity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries; // Registries
import net.minecraft.resources.ResourceLocation; // Identifier
import net.minecraft.world.item.CreativeModeTab; // ItemGroup

/**
 * A static container for all of our items.
 */
public class Items {
    // References to our items.
    // Item.Settings is used to store properties such as stack size and durability.
    // FabricItemSettings is an extension of this which allows setting an equipment slot and custom damage value handler.

    // Tools
    public static final Tier OBSIDIAN_TOOL_MATERIAL = new ObsidianToolMaterial();
    public static final Item OBSIDIAN_PICKAXE = new PickaxeItem(OBSIDIAN_TOOL_MATERIAL, 1, -2.8f, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_AXE = new AxeItem(OBSIDIAN_TOOL_MATERIAL, -6.0f, -3.0f, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_SHOVEL = new ShovelItem(OBSIDIAN_TOOL_MATERIAL, 1.5f, -3.0f, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_SWORD = new SwordItem(OBSIDIAN_TOOL_MATERIAL, 3, -2.4f, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_HOE = new HoeItem(OBSIDIAN_TOOL_MATERIAL, -2, 0.0f, new FabricItemSettings().rarity(Rarity.RARE).fireproof());

    // Armor
    public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = new ObsidianArmorMaterial();
    public static final Item OBSIDIAN_HELMET = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().rarity(Rarity.RARE).fireproof());
    public static final Item OBSIDIAN_BOOTS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().rarity(Rarity.RARE).fireproof());

    // Item Groups
    public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder(new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_armor"))
        .icon(() -> new ItemStack(OBSIDIAN_CHESTPLATE))
        .build();

    public static void onInitialize() {
        // Add each of our items to the item registry.

        // Tools
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_sword"), OBSIDIAN_SWORD);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_hoe"), OBSIDIAN_HOE);

        // Armor
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsidianArmorMod.MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.accept(OBSIDIAN_AXE);
            content.accept(OBSIDIAN_PICKAXE);
            content.accept(OBSIDIAN_SHOVEL);
            content.accept(OBSIDIAN_SWORD);
            content.accept(OBSIDIAN_HOE);

            content.accept(OBSIDIAN_HELMET);
            content.accept(OBSIDIAN_CHESTPLATE);
            content.accept(OBSIDIAN_LEGGINGS);
            content.accept(OBSIDIAN_BOOTS);
        });
    }
}

package com.elitemastereric.obsidianarmor.items;

import com.elitemastereric.obsidianarmor.ObsidianArmorMod;
import com.elitemastereric.obsidianarmor.items.tools.ModAxeItem;
import com.elitemastereric.obsidianarmor.items.tools.ModHoeItem;
import com.elitemastereric.obsidianarmor.items.tools.ModPickaxeItem;
import com.elitemastereric.obsidianarmor.materials.ObsidianArmorMaterial;
import com.elitemastereric.obsidianarmor.materials.ObsidianToolMaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial; // ToolMaterial
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * A static container for all of our items.
 */
public class ModItems {
    // References to our items.
    // Item.Settings is used to store properties such as stack size and durability.
    // FabricItemSettings is an extension of this which allows setting an equipment slot and custom damage value handler.

    // Tools
    public static final ToolMaterial OBSIDIAN_TOOL_MATERIAL = new ObsidianToolMaterial();
    public static final Item OBSIDIAN_PICKAXE = new ModPickaxeItem(OBSIDIAN_TOOL_MATERIAL, 1, -2.8f, new FabricItemSettings().fireproof().group(ModItemGroup.ITEM_GROUP));
    public static final Item OBSIDIAN_AXE = new ModAxeItem(OBSIDIAN_TOOL_MATERIAL, -6, -3.0f, new FabricItemSettings().fireproof().group(ModItemGroup.ITEM_GROUP));
    public static final Item OBSIDIAN_SHOVEL = new ShovelItem(OBSIDIAN_TOOL_MATERIAL, 1.5f, -3.0f, new FabricItemSettings().fireproof().group(ModItemGroup.ITEM_GROUP));
    public static final Item OBSIDIAN_SWORD = new SwordItem(OBSIDIAN_TOOL_MATERIAL, 3, -2.4f, new FabricItemSettings().fireproof().group(ModItemGroup.ITEM_GROUP));
    public static final Item OBSIDIAN_HOE = new ModHoeItem(OBSIDIAN_TOOL_MATERIAL, -2, 0.0f, new FabricItemSettings().fireproof().group(ModItemGroup.ITEM_GROUP));

    // Armor
    public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = new ObsidianArmorMaterial();
    public static final Item OBSIDIAN_HELMET = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP).fireproof());
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP).fireproof());
    public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP).fireproof());
    public static final Item OBSIDIAN_BOOTS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP).fireproof());

    public static void onInitialize() {
        // Add each of our items to the item registry.

        // Tools
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_sword"), OBSIDIAN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_hoe"), OBSIDIAN_HOE);

        // Armor
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);
    }
}

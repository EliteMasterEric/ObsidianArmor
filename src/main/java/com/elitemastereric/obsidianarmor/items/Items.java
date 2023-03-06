package com.elitemastereric.obsidianarmor.items;

import com.elitemastereric.obsidianarmor.materials.ObsidianArmorMaterial;
import com.elitemastereric.obsidianarmor.materials.ObsidianToolMaterial;
import com.elitemastereric.obsidianarmor.ObsidianArmorMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

/**
 * A static container for all of our items.
 */
public class Items {
    // References to our items.
    // Item.Settings is used to store properties such as stack size and durability.
    // FabricItemSettings is an extension of this which allows setting an equipment slot and custom damage value handler.

    // Tools
    public static final ToolMaterial OBSIDIAN_TOOL_MATERIAL = new ObsidianToolMaterial();
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
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_armor"))
        .icon(() -> new ItemStack(OBSIDIAN_CHESTPLATE))
        .build();

    public static void onInitialize() {
        // Add each of our items to the item registry.

        // Tools
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_sword"), OBSIDIAN_SWORD);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_hoe"), OBSIDIAN_HOE);

        // Armor
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(OBSIDIAN_AXE);
            content.add(OBSIDIAN_PICKAXE);
            content.add(OBSIDIAN_SHOVEL);
            content.add(OBSIDIAN_SWORD);
            content.add(OBSIDIAN_HOE);

            content.add(OBSIDIAN_HELMET);
            content.add(OBSIDIAN_CHESTPLATE);
            content.add(OBSIDIAN_LEGGINGS);
            content.add(OBSIDIAN_BOOTS);
        });
    }
}

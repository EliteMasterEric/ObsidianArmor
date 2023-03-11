package com.elitemastereric.obsidianarmor.items;

import com.elitemastereric.obsidianarmor.ObsidianArmorMod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup; // ItemGroup
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier; // Identifier

public class ModItemGroup {
    // Item Groups
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(ObsidianArmorMod.MOD_ID, "obsidian_armor"), () -> new ItemStack(ModItems.OBSIDIAN_CHESTPLATE));
}

package com.elitemastereric.obsidianarmor.materials;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial {
    private static final int MINING_LEVEL = MiningLevels.STONE;
    private static final int DURABILITY = 64;
    private static final float MINING_SPEED = 9.0f;
    private static final float ATTACK_DAMAGE = 1.0f;
    private static final int ENCHANTABILITY = 20;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.ofItems(Items.OBSIDIAN);
    
    @Override
    public int getDurability() {
        return DURABILITY;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return MINING_SPEED;
    }
    
    @Override
    public float getAttackDamage() {
        return ATTACK_DAMAGE;
    }
    
    @Override
    public int getMiningLevel() {
        return MINING_LEVEL;
    }

    @Override
    public int getEnchantability() {
        return ENCHANTABILITY;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return REPAIR_INGREDIENT;
    }
}
package com.elitemastereric.obsidianarmor.materials;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;

public class ObsidianToolMaterial implements Tier {
    private static final int MINING_LEVEL = Tiers.STONE.getLevel();
    private static final int DURABILITY = 64;
    private static final float MINING_SPEED = 9.0f;
    private static final float ATTACK_DAMAGE = 1.0f;
    private static final int ENCHANTABILITY = 20;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.of(Items.OBSIDIAN);
    
    @Override
    public int getUses() {
        return DURABILITY;
    }
    
    @Override
    public float getSpeed() {
        return MINING_SPEED;
    }
    
    @Override
    public float getAttackDamageBonus() {
        return ATTACK_DAMAGE;
    }
    
    @Override
    public int getLevel() {
        return MINING_LEVEL;
    }

    @Override
    public int getEnchantmentValue() {
        return ENCHANTABILITY;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return REPAIR_INGREDIENT;
    }
}
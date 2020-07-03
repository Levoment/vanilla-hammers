package com.github.draylar.vh.enchantment;

import com.github.draylar.vh.api.HammerItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class CurseOfGigantismEnchantment extends Enchantment {

    public CurseOfGigantismEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return other == Enchantments.EFFICIENCY;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof HammerItem;
    }

    @Override
    public int getMinPower(int level) {
        return 25;
    }

    @Override
    public int getMaxPower(int level) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isCursed() {
        return true;
    }
}

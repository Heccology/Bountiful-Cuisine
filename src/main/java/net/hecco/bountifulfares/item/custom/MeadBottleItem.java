package net.hecco.bountifulfares.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MeadBottleItem extends LiquidBottleItem {
    public MeadBottleItem(Settings settings) {
        super(settings);
    }
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user.getStatusEffect(StatusEffects.POISON) != null) {
            user.removeStatusEffect(StatusEffects.POISON);
        }
        return stack;
    }
}

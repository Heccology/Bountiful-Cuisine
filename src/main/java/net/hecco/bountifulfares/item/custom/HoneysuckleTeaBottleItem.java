package net.hecco.bountifulfares.item.custom;

import net.hecco.bountifulfares.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

public class HoneysuckleTeaBottleItem extends TeaBottleItem{
    public HoneysuckleTeaBottleItem(Settings settings) {
        super(settings);
    }

    @Override
    public StatusEffect[] getStatusEffectsToRemove() {
        return new StatusEffect[] {StatusEffects.WITHER, StatusEffects.WEAKNESS, ModEffects.ACIDIC};
    }
}

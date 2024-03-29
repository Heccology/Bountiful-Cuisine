package net.hecco.bountifulfares.block.custom;

import net.fabricmc.loader.api.FabricLoader;
import net.hecco.bountifulfares.BountifulFares;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ElsAndLsJackOStrawBlock extends JackOStrawBlock{
    public ElsAndLsJackOStrawBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (!FabricLoader.getInstance().isModLoaded(BountifulFares.ELS_AND_LS_DYES_MOD_ID)) {
            tooltip.add(Text.translatable("tooltip." + BountifulFares.MOD_ID + ".els_and_ls_dye_mod_warning"));
        }
    }
}

package net.matsulen.lemonhornor.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpareItem extends HoeItem {

    public SpareItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }




    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.spare.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.spare.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.spare.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));

        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.spare.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.spare.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

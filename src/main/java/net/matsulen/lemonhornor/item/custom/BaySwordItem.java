package net.matsulen.lemonhornor.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class BaySwordItem extends HoeItem {

    public BaySwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }




    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.baysword.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.baysword.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.baysword.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));

        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.baysword.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.baysword.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

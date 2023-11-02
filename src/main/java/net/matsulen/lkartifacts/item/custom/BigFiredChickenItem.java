package net.matsulen.lkartifacts.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class BigFiredChickenItem extends SwordItem {

    public BigFiredChickenItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().stacksTo(1)
                .food(new FoodProperties.Builder().alwaysEat().nutrition(4).saturationMod(0.25f).build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.EAT;
    }
    private static boolean random(double probability) {
        Random r = new Random();
        double randomValue = r.nextDouble();
        if (randomValue < probability) {
            return true;
        }
        return false;
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (!world.isClientSide) {
            if ((stack.getMaxDamage() - stack.getDamageValue()) > 1) {
                stack.setDamageValue(stack.getDamageValue() + 30); // 减少30点耐久度
                entity.playSound(SoundEvents.PLAYER_BURP); //打嗝
                entity.eat(world, new ItemStack(Items.CARROT));  //吃鸡

                if (random(0.3)){ //随机中毒
                    entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1), entity);
                }

            } else {
                // 如果耐久度不足10点，可以选择执行一些其他操作，例如播放声音或者将物品置为空
                if (stack.getCount() <= 1) {
                    entity.setItemInHand(entity.getUsedItemHand(), ItemStack.EMPTY);
                }
            }
        }
        return stack;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.legendary.tooltip.shift").withStyle(ChatFormatting.GOLD));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.big_fired_chicken.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.big_fired_chicken.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.big_fired_chicken.tooltip.shift4").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.big_fired_chicken.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.big_fired_chicken.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

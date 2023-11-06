package net.matsulen.lkartifacts.item.useitem;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SmallHealBottleItem extends Item {
    public SmallHealBottleItem(Properties properties) {
        super(new Properties().stacksTo(10).food(new FoodProperties.Builder()
                .alwaysEat().nutrition(0).saturationMod(0)
                .build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (!world.isClientSide) {
            // 这里可以添加恢复 HP 的逻辑
            entity.heal(8.0f);
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 30,2), entity);
            // 如果只有一个物品，移除它
            if (stack.getCount() <= 1) {
                entity.setItemInHand(entity.getUsedItemHand(), ItemStack.EMPTY);
            } else if (stack.getCount() > 1) {
                // 创建一个新的 ItemStack，并减少堆叠数量
                stack.shrink(1);
            }
        }
        return stack;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.small_heal_bottle.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.small_heal_bottle.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.small_heal_bottle.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.small_heal_bottle.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.small_heal_bottle.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.healitem.tooltip").withStyle(ChatFormatting.RED));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

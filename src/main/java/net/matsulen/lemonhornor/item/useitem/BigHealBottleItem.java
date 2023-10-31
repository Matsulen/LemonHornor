package net.matsulen.lemonhornor.item.useitem;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BigHealBottleItem extends Item {
    public BigHealBottleItem(Properties properties) {
        super(new Properties().stacksTo(10).food(new FoodProperties.Builder().alwaysEat().nutrition(0).saturationMod(0).build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (!world.isClientSide) {
            int currentUses = getUses(stack);

            if (currentUses > 1) {
                setUses(stack, currentUses - 1);
            } else {
                // 如果只有一个物品，移除它
                if (stack.getCount() <= 1) {
                    entity.setItemInHand(entity.getUsedItemHand(), ItemStack.EMPTY);
                } else if (stack.getCount() > 1){
                    // 创建一个新的 ItemStack，并设置使用次数
                    stack.shrink(1);
                    ItemStack newStack = stack.copy();
                    setUses(newStack, getMaxUses());
                    entity.setItemInHand(entity.getUsedItemHand(), newStack);
                }
            }

            entity.heal(4.0f);
        }
        return stack;
    }

    @Override
    public int getBarColor(ItemStack stack) {
        int currentUses = getUses(stack);

        if (currentUses > 0) {
            float progress = (float) currentUses / getMaxUses();
            int red = (int)(255 * (1.0f - progress));
            int green = (int)(255 * progress);
            return (red << 16) + (green << 8);
        }

        return 0x00000000; // 当没有使用次数时，状态条不可见
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return getUses(stack) > 0;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        int currentUses = getUses(stack);

        if (currentUses > 0) {
            float progress = (float) currentUses / getMaxUses();
            return Math.round(13 * progress);
        }

        return 0;
    }

    private int getUses(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("uses")) {
            return tag.getInt("uses");
        }
        return getMaxUses();
    }

    private void setUses(ItemStack stack, int uses) {
        stack.getOrCreateTag().putInt("uses", uses);
    }

    private int getMaxUses() {
        return 6; // 设置总使用次数
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){

            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.big_heal_bottle.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.big_heal_bottle.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.big_heal_bottle.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.big_heal_bottle.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.big_heal_bottle.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.healitem.tooltip").withStyle(ChatFormatting.RED));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default2"));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
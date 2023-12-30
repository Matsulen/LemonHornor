package net.matsulen.lkartifacts.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HealingWandItem extends SwordItem {

    public HealingWandItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }


    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1,1), player);
            livingEntity.playSound(SoundEvents.WOOD_BREAK);
            stack.hurtAndBreak(10, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
        }
        return super.onLeftClickEntity(stack, player, entity);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        pPlayer.getCooldowns().addCooldown(this, 400);
        if (!pLevel.isClientSide()) {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100,2),pPlayer);
        }
        pPlayer.playSound(SoundEvents.ENCHANTMENT_TABLE_USE);
        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemstack.hurtAndBreak(20, pPlayer, p -> p.broadcastBreakEvent(pUsedHand));
        }
        return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.legendary.tooltip.shift").withStyle(ChatFormatting.GOLD));
        if (Screen.hasShiftDown()){

            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.healing_wand.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.healing_wand.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.healing_wand.tooltip.shift4").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.healing_wand.tooltip.control1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.healing_wand.tooltip.control2").withStyle(ChatFormatting.DARK_GRAY));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

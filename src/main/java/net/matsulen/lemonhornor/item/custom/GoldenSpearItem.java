package net.matsulen.lemonhornor.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.matsulen.lemonhornor.item.custom.DistanceItem.BLOCK_REACH_MODIFIER;
import static net.matsulen.lemonhornor.item.custom.DistanceItem.ENTITY_RANGE_MODIFIER;

public class GoldenSpearItem extends SwordItem {

    public GoldenSpearItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }
    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> attributeBuilder = ImmutableMultimap.builder();
        attributeBuilder.putAll(super.getDefaultAttributeModifiers(slot));
        attributeBuilder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(BLOCK_REACH_MODIFIER, "Reach modifier", 1.2, AttributeModifier.Operation.ADDITION));
        attributeBuilder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(ENTITY_RANGE_MODIFIER, "Range modifier", 1.2, AttributeModifier.Operation.ADDITION));
        return slot == EquipmentSlot.MAINHAND ? attributeBuilder.build() : super.getDefaultAttributeModifiers(slot);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        pPlayer.getCooldowns().addCooldown(this, 800);
        if (!pLevel.isClientSide()) {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK, 400,1),pPlayer);
        }
        pPlayer.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP);
        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemstack.hurtAndBreak(10, pPlayer, p -> p.broadcastBreakEvent(pUsedHand));
        }
        return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.legendary.tooltip.shift").withStyle(ChatFormatting.GOLD));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.golden_spear.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.golden_spear.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.golden_spear.tooltip.shift4").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.golden_spear.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.golden_spear.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lemonhornor.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

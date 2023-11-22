package net.matsulen.lkartifacts.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlintHandItem extends PickaxeItem implements DistanceItem{

    public FlintHandItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);

    }
//    @Override
//    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
//        ImmutableMultimap.Builder<Attribute, AttributeModifier> attributeBuilder = ImmutableMultimap.builder();
//        attributeBuilder.putAll(super.getDefaultAttributeModifiers(slot));
//        attributeBuilder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(BLOCK_REACH_MODIFIER, "Reach modifier", 2.5, AttributeModifier.Operation.ADDITION));
//        attributeBuilder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(ENTITY_RANGE_MODIFIER, "Range modifier", 2.5, AttributeModifier.Operation.ADDITION));
//        attributeBuilder.put(Attributes.MAX_HEALTH, new AttributeModifier(EXTRA_HEALTH, "Range modifier", 10, AttributeModifier.Operation.ADDITION));
//        return slot == EquipmentSlot.MAINHAND ? attributeBuilder.build() : super.getDefaultAttributeModifiers(slot);
//    }
    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40,1), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.legendary.tooltip.shift").withStyle(ChatFormatting.GOLD));
        if (Screen.hasShiftDown()){

            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.flint_hand.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.flint_hand.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.flint_hand.tooltip.shift4").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.flint_hand.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.flint_hand.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

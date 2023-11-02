package net.matsulen.lkartifacts.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
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
import java.util.Random;

public class IronSickleItem extends SwordItem {

    public IronSickleItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {

        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    int currentBleedingValue = 0;


        @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            if (random(0.1)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HARM, 20, 3), player);
            }
        }

        return super.onLeftClickEntity(stack, player, entity);
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
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.iron_sickle.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.iron_sickle.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.iron_sickle.tooltip.control1").withStyle(ChatFormatting.LIGHT_PURPLE));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.iron_sickle.tooltip.control2").withStyle(ChatFormatting.LIGHT_PURPLE));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

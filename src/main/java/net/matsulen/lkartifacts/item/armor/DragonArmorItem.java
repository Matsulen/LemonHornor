package net.matsulen.lkartifacts.item.armor;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.matsulen.lkartifacts.item.ModArmorMaterials;
import net.matsulen.lkartifacts.item.custom.AllArmorItem;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

import static net.matsulen.lkartifacts.item.custom.DistanceItem.BLOCK_REACH_MODIFIER;
import static net.matsulen.lkartifacts.item.custom.DistanceItem.ENTITY_RANGE_MODIFIER;

public class DragonArmorItem extends AllArmorItem {
    UUID STEP_HEIGHT_ADDITION_MODIFIER = UUID.randomUUID();
    public DragonArmorItem(ModArmorMaterials material, Type type, Properties settings) {
        super(material, type, settings);
    }
    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (this.type.equals(Type.BOOTS) && slot.equals(EquipmentSlot.FEET)){
            ImmutableMultimap.Builder<Attribute, AttributeModifier> attributeBuilder = ImmutableMultimap.builder();
            attributeBuilder.putAll(super.getDefaultAttributeModifiers(slot));
            attributeBuilder.put(ForgeMod.STEP_HEIGHT_ADDITION.get(), new AttributeModifier(STEP_HEIGHT_ADDITION_MODIFIER, "Step modifier", 1, AttributeModifier.Operation.ADDITION));
            return attributeBuilder.build();
        }else {
            return super.getDefaultAttributeModifiers(slot);
        }
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.dragon_armor.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.dragon_armor.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.dragon_armor.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
        } else if (Screen.hasControlDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.dragon_armor.tooltip.control1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.dragon_armor.tooltip.control2").withStyle(ChatFormatting.DARK_GRAY));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

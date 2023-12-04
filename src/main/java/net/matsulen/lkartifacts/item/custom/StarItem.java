package net.matsulen.lkartifacts.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StarItem extends Item {
//    private final List<ResourceLocation> additionalSlotEmptyIcons;


    public StarItem(Properties pProperties) {
        super(pProperties);
//        this.additionalSlotEmptyIcons = additionalSlotEmptyIcons;
    }
//    public static StarItem createStarUpgrateList() {
//        return new StarItem(createStarUpgradeIconList());
//    }
//    private static List<ResourceLocation> createStarUpgradeIconList() {
//        return List.of(EMPTY_SLOT_SMALL_STAR,
//                EMPTY_SLOT_SMALL_LONG, EMPTY_SLOT_SMALL_BIG, EMPTY_SLOT_STAR);
//    }
//    public List<ResourceLocation> getAdditionalSlotEmptyIcons() {
//        return this.additionalSlotEmptyIcons;
//    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.epic").withStyle(ChatFormatting.LIGHT_PURPLE));
        if (Screen.hasShiftDown()){
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.star_item.tooltip.shift1").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.star_item.tooltip.shift2").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.star_item.tooltip.shift3").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.star_item.tooltip.shift4").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.star_item.tooltip.shift5").withStyle(ChatFormatting.DARK_GRAY));
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.star_item.tooltip.shift6").withStyle(ChatFormatting.DARK_GRAY));
//        } else if (Screen.hasControlDown()) {
//            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.iron_sickle.tooltip.control1").withStyle(ChatFormatting.Purple));

        } else {
            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default1"));
//            pTooltipComponents.add(Component.translatable("tooltip.lkartifacts.tooltip.default2"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}

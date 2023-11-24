package net.matsulen.lkartifacts.item.templates;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class ModTemplates  extends  SmithingTemplateItem{
    private static final ChatFormatting TITLE_FORMAT;
    private static final ChatFormatting DESCRIPTION_FORMAT;
    private static final String DESCRIPTION_ID;
    private static final Component INGREDIENTS_TITLE;
    private static final Component APPLIES_TO_TITLE;
    private static final Component EVOLVE_UPGRADE;
    private static final Component EVOLVE_UPGRADE_APPLIES_TO;
    private static final Component EVOLVE_UPGRADE_INGREDIENTS;
    private static final Component EVOLVE_UPGRADE_BASE_SLOT_DESCRIPTION;
    private static final Component EVOLVE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION;
    private static final ResourceLocation EMPTY_SLOT_HELMET;
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE;
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS;
    private static final ResourceLocation EMPTY_SLOT_BOOTS;
    private static final ResourceLocation EMPTY_SLOT_INGOT;

    public ModTemplates(Component pAppliesTo, Component pIngredients, Component pUpdradeDescription,
                        Component pBaseSlotDescription, Component pAdditionsSlotDescription,
                        List<ResourceLocation> pBaseSlotEmptyIcons, List<ResourceLocation> pAdditonalSlotEmptyIcons) {
        super(pAppliesTo, pIngredients, pUpdradeDescription, pBaseSlotDescription, pAdditionsSlotDescription, pBaseSlotEmptyIcons, pAdditonalSlotEmptyIcons);
    }
    //少了个神秘方法，可能会导致问题

    public static ModTemplates createEvolveTemplate() {
        return new ModTemplates(EVOLVE_UPGRADE_APPLIES_TO,
                EVOLVE_UPGRADE_INGREDIENTS, EVOLVE_UPGRADE,
                EVOLVE_UPGRADE_BASE_SLOT_DESCRIPTION, EVOLVE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createEvolveIconList(), createEvolveMaterialList());
    }
    public static ModTemplates createKnightTemplate() {
        return new ModTemplates(Component.translatable("item.lkaritifacts.knight_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.knight_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.knight_upgrade.name").withStyle(TITLE_FORMAT),
                Component.translatable("item.lkaritifacts.knight_upgrade.base_slot"),
                Component.translatable("item.lkaritifacts.knight_upgrade.additions_slot"),
                createEvolveIconList(), createEvolveMaterialList());
    }

    public static ModTemplates createSlayerTemplate() {
        return new ModTemplates(Component.translatable("item.lkaritifacts.slayer_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.slayer_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.slayer_upgrade.name").withStyle(TITLE_FORMAT),
                Component.translatable("item.lkaritifacts.slayer_upgrade.base_slot"),
                Component.translatable("item.lkaritifacts.slayer_upgrade.additions_slot"),
                createEvolveIconList(), createEvolveMaterialList());
    }

    public static ModTemplates createLavaTemplate() {
        return new ModTemplates(Component.translatable("item.lkaritifacts.lava_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.lava_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.lava_upgrade.name").withStyle(TITLE_FORMAT),
                Component.translatable("item.lkaritifacts.lava_upgrade.base_slot"),
                Component.translatable("item.lkaritifacts.lava_upgrade.additions_slot"),
                createEvolveIconList(), createEvolveMaterialList());
    }
    public static ModTemplates createDragonTemplate() {
        return new ModTemplates(Component.translatable("item.lkaritifacts.dragon_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.dragon_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT),
                Component.translatable("item.lkaritifacts.dragon_upgrade.name").withStyle(TITLE_FORMAT),
                Component.translatable("item.lkaritifacts.dragon_upgrade.base_slot"),
                Component.translatable("item.lkaritifacts.dragon_upgrade.additions_slot"),
                createEvolveIconList(), createEvolveMaterialList());
    }

    private static List<ResourceLocation> createEvolveIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    private static List<ResourceLocation> createEvolveMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }


    static {
        TITLE_FORMAT = ChatFormatting.GRAY;
        DESCRIPTION_FORMAT = ChatFormatting.BLUE;
        //描述ID 原版
        DESCRIPTION_ID = Util.makeDescriptionId("item", new ResourceLocation("smithing_template"));
        //Tooltip所需原材料
        INGREDIENTS_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ingredients"))).withStyle(TITLE_FORMAT);
        //Tooltip应用于什么盔甲
        APPLIES_TO_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.applies_to"))).withStyle(TITLE_FORMAT);
        //名字
        EVOLVE_UPGRADE = Component.translatable("item.lkaritifacts.evolve_upgrade.name").withStyle(TITLE_FORMAT);
        //Tooltip应用于什么盔甲
        EVOLVE_UPGRADE_APPLIES_TO = Component.translatable("item.lkaritifacts.evolve_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
        //Tooltip所需原材料
        EVOLVE_UPGRADE_INGREDIENTS = Component.translatable("item.lkaritifacts.evolve_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
        //放入模板后 盔甲槽提示
        EVOLVE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item.lkaritifacts.evolve_upgrade.base_slot");
        //放入模板后 原材料提示
        EVOLVE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item.lkaritifacts.evolve_upgrade.additions_slot");

        EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
        EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
        EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
        EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
        EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");
    }
}

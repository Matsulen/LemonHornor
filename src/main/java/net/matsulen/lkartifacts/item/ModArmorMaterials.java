package net.matsulen.lkartifacts.item;

import net.matsulen.lkartifacts.LKArtifacts;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Map;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    KNIGHT("knight", 27, new int[]{ 3, 7, 5, 3 }, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.05f, () -> Ingredient.of(ModItems.DIAMOND_DUST.get()),
            Map.of(Attributes.MAX_HEALTH, new AttributeModifier("MAX_HEALTH", 2.5,AttributeModifier.Operation.ADDITION)));
//    DIAMOND_DUST("Knight", 26, new int[]{ 5, 7, 5, 4 }, 25,
//    SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.5f, () -> Ingredient.of(ModItems.DIAMOND_DUST.get())),
//    DIAMOND_DUST("Knight", 26, new int[]{ 5, 7, 5, 4 }, 25,
//    SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.5f, () -> Ingredient.of(ModItems.DIAMOND_DUST.get()));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;
    private final Map<Attribute, AttributeModifier> additionalAttributes;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, Map<Attribute, AttributeModifier> additionalAttributes) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
        this.additionalAttributes = additionalAttributes;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public Map<Attribute, AttributeModifier> getAdditionalAttributes() {
        return additionalAttributes;
    }
    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return LKArtifacts.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
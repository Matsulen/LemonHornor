package net.matsulen.lkartifacts.datagen;

import net.matsulen.lkartifacts.LKArtifacts;
import net.matsulen.lkartifacts.block.ModBlocks;
import net.matsulen.lkartifacts.item.ModItems;
import net.matsulen.lkartifacts.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = LKArtifacts.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LKArtifacts.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BROKEN_STAR_SMALL);
        simpleItem(ModItems.BROKEN_STAR_LONG);
        simpleItem(ModItems.BROKEN_STAR_BIG);
        simpleItem(ModItems.MYSTERY_AMETHYST);
        simpleItem(ModItems.STAR);
        simpleItem(ModItems.MYSTERY_PLATE);
        simpleItem(ModItems.DIAMOND_DUST);
        simpleItem(ModItems.DRAGON_BREATH_POWDER);
        simpleItem(ModItems.SMITHING_HAMMER);
        simpleItem(ModItems.SMALL_HEAL_BOTTLE);
        simpleItem(ModItems.BIG_HEAL_BOTTLE);
        simpleItem(ModItems.EVOLVE_TEMPLATE);
        simpleItem(ModItems.KNIGHT_TEMPLATE);
        simpleItem(ModItems.SLAYER_TEMPLATE);
        simpleItem(ModItems.LAVA_TEMPLATE);
        simpleItem(ModItems.DRAGON_TEMPLATE);

        trimmedArmorItem(ModItems.KNIGHT_HELMET);
        trimmedArmorItem(ModItems.KNIGHT_CHESTPLATE);
        trimmedArmorItem(ModItems.KNIGHT_LEGGINGS);
        trimmedArmorItem(ModItems.KNIGHT_BOOTS);

        trimmedArmorItem(ModItems.SLAYER_HELMET);
        trimmedArmorItem(ModItems.SLAYER_CHESTPLATE);
        trimmedArmorItem(ModItems.SLAYER_LEGGINGS);
        trimmedArmorItem(ModItems.SLAYER_BOOTS);

        trimmedArmorItem(ModItems.LAVA_HELMET);
        trimmedArmorItem(ModItems.LAVA_CHESTPLATE);
        trimmedArmorItem(ModItems.LAVA_LEGGINGS);
        trimmedArmorItem(ModItems.LAVA_BOOTS);
        
        trimmedArmorItem(ModItems.DRAGON_HELMET);
        trimmedArmorItem(ModItems.DRAGON_CHESTPLATE);
        trimmedArmorItem(ModItems.DRAGON_ELYTRA_CHESTPLATE);
        trimmedArmorItem(ModItems.DRAGON_LEGGINGS);
        trimmedArmorItem(ModItems.DRAGON_BOOTS);

        tagWeaponItem(ModItems.IRON_SICKLE, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_1, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_2, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_3, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_4, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_5, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_6, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_7, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_8, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_9, ModTags.Items.IRON_SICKLE_TAG);
        tagWeaponItem(ModItems.IRON_SICKLE_10, ModTags.Items.IRON_SICKLE_TAG);

        tagWeaponItem(ModItems.IRON_BLADE, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_1, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_2, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_3, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_4, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_5, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_6, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_7, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_8, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_9, ModTags.Items.IRON_BLADE_TAG);
        tagWeaponItem(ModItems.IRON_BLADE_10, ModTags.Items.IRON_BLADE_TAG);

        tagWeaponItem(ModItems.BAYSWORD, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_1, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_2, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_3, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_4, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_5, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_6, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_7, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_8, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_9, ModTags.Items.BAYSWORD_TAG);
        tagWeaponItem(ModItems.BAYSWORD_10, ModTags.Items.BAYSWORD_TAG);

        tagWeaponItem(ModItems.SPARE, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_1, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_2, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_3, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_4, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_5, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_6, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_7, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_8, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_9, ModTags.Items.SPARE_TAG);
        tagWeaponItem(ModItems.SPARE_10, ModTags.Items.SPARE_TAG);

        tagWeaponItem(ModItems.CAMP_FIRE_SWORD, ModTags.Items.CAMP_FIRE_SWORD_TAG);
        tagWeaponItem(ModItems.CAMP_FIRE_SWORD_1, ModTags.Items.CAMP_FIRE_SWORD_TAG);
        tagWeaponItem(ModItems.CAMP_FIRE_SWORD_2, ModTags.Items.CAMP_FIRE_SWORD_TAG);
        tagWeaponItem(ModItems.CAMP_FIRE_SWORD_3, ModTags.Items.CAMP_FIRE_SWORD_TAG);
        tagWeaponItem(ModItems.CAMP_FIRE_SWORD_4, ModTags.Items.CAMP_FIRE_SWORD_TAG);
        tagWeaponItem(ModItems.CAMP_FIRE_SWORD_5, ModTags.Items.CAMP_FIRE_SWORD_TAG);

        tagWeaponItem(ModItems.DRAGON_TEAR, ModTags.Items.DRAGON_TEAR_TAG);
        tagWeaponItem(ModItems.DRAGON_TEAR_1, ModTags.Items.DRAGON_TEAR_TAG);
        tagWeaponItem(ModItems.DRAGON_TEAR_2, ModTags.Items.DRAGON_TEAR_TAG);
        tagWeaponItem(ModItems.DRAGON_TEAR_3, ModTags.Items.DRAGON_TEAR_TAG);
        tagWeaponItem(ModItems.DRAGON_TEAR_4, ModTags.Items.DRAGON_TEAR_TAG);
        tagWeaponItem(ModItems.DRAGON_TEAR_5, ModTags.Items.DRAGON_TEAR_TAG);
        
        tagWeaponItem(ModItems.SOUL_FIRE, ModTags.Items.SOUL_FIRE_TAG);
        tagWeaponItem(ModItems.SOUL_FIRE_1, ModTags.Items.SOUL_FIRE_TAG);
        tagWeaponItem(ModItems.SOUL_FIRE_2, ModTags.Items.SOUL_FIRE_TAG);
        tagWeaponItem(ModItems.SOUL_FIRE_3, ModTags.Items.SOUL_FIRE_TAG);
        tagWeaponItem(ModItems.SOUL_FIRE_4, ModTags.Items.SOUL_FIRE_TAG);
        tagWeaponItem(ModItems.SOUL_FIRE_5, ModTags.Items.SOUL_FIRE_TAG);

        tagWeaponItem(ModItems.MEAT_KNIFE, ModTags.Items.MEAT_KNIFE_TAG);
        tagWeaponItem(ModItems.MEAT_KNIFE_1, ModTags.Items.MEAT_KNIFE_TAG);
        tagWeaponItem(ModItems.MEAT_KNIFE_2, ModTags.Items.MEAT_KNIFE_TAG);
        tagWeaponItem(ModItems.MEAT_KNIFE_3, ModTags.Items.MEAT_KNIFE_TAG);
        tagWeaponItem(ModItems.MEAT_KNIFE_4, ModTags.Items.MEAT_KNIFE_TAG);
        tagWeaponItem(ModItems.MEAT_KNIFE_5, ModTags.Items.MEAT_KNIFE_TAG);

        tagWeaponItem(ModItems.HORN_OF_GOAT, ModTags.Items.HORN_OF_GOAT_TAG);
        tagWeaponItem(ModItems.HORN_OF_GOAT_1, ModTags.Items.HORN_OF_GOAT_TAG);
        tagWeaponItem(ModItems.HORN_OF_GOAT_2, ModTags.Items.HORN_OF_GOAT_TAG);
        tagWeaponItem(ModItems.HORN_OF_GOAT_3, ModTags.Items.HORN_OF_GOAT_TAG);
        tagWeaponItem(ModItems.HORN_OF_GOAT_4, ModTags.Items.HORN_OF_GOAT_TAG);
        tagWeaponItem(ModItems.HORN_OF_GOAT_5, ModTags.Items.HORN_OF_GOAT_TAG);

        tagWeaponItem(ModItems.EFFECTED_SWORD, ModTags.Items.EFFECTED_SWORD_TAG);
        tagWeaponItem(ModItems.EFFECTED_SWORD_1, ModTags.Items.EFFECTED_SWORD_TAG);
        tagWeaponItem(ModItems.EFFECTED_SWORD_2, ModTags.Items.EFFECTED_SWORD_TAG);
        tagWeaponItem(ModItems.EFFECTED_SWORD_3, ModTags.Items.EFFECTED_SWORD_TAG);
        tagWeaponItem(ModItems.EFFECTED_SWORD_4, ModTags.Items.EFFECTED_SWORD_TAG);
        tagWeaponItem(ModItems.EFFECTED_SWORD_5, ModTags.Items.EFFECTED_SWORD_TAG);
        
        tagWeaponItem(ModItems.KNIGHT_HORNOR, ModTags.Items.KNIGHT_HORNOR_TAG);
        tagWeaponItem(ModItems.KNIGHT_HORNOR_1, ModTags.Items.KNIGHT_HORNOR_TAG);
        tagWeaponItem(ModItems.KNIGHT_HORNOR_2, ModTags.Items.KNIGHT_HORNOR_TAG);
        tagWeaponItem(ModItems.KNIGHT_HORNOR_3, ModTags.Items.KNIGHT_HORNOR_TAG);
        tagWeaponItem(ModItems.KNIGHT_HORNOR_4, ModTags.Items.KNIGHT_HORNOR_TAG);
        tagWeaponItem(ModItems.KNIGHT_HORNOR_5, ModTags.Items.KNIGHT_HORNOR_TAG);

        tagWeaponItem(ModItems.SAMON_SWORD, ModTags.Items.SAMON_SWORD_TAG);
        tagWeaponItem(ModItems.SAMON_SWORD_1, ModTags.Items.SAMON_SWORD_TAG);
        tagWeaponItem(ModItems.SAMON_SWORD_2, ModTags.Items.SAMON_SWORD_TAG);
        tagWeaponItem(ModItems.SAMON_SWORD_3, ModTags.Items.SAMON_SWORD_TAG);
        tagWeaponItem(ModItems.SAMON_SWORD_4, ModTags.Items.SAMON_SWORD_TAG);
        tagWeaponItem(ModItems.SAMON_SWORD_5, ModTags.Items.SAMON_SWORD_TAG);

        tagWeaponItem(ModItems.TOTEM_SWORD, ModTags.Items.TOTEM_SWORD_TAG);
        tagWeaponItem(ModItems.TOTEM_SWORD_1, ModTags.Items.TOTEM_SWORD_TAG);
        tagWeaponItem(ModItems.TOTEM_SWORD_2, ModTags.Items.TOTEM_SWORD_TAG);
        tagWeaponItem(ModItems.TOTEM_SWORD_3, ModTags.Items.TOTEM_SWORD_TAG);
        tagWeaponItem(ModItems.TOTEM_SWORD_4, ModTags.Items.TOTEM_SWORD_TAG);
        tagWeaponItem(ModItems.TOTEM_SWORD_5, ModTags.Items.TOTEM_SWORD_TAG);

        tagWeaponItem(ModItems.ROUND_SWORD, ModTags.Items.ROUND_SWORD_TAG);
        tagWeaponItem(ModItems.ROUND_SWORD_1, ModTags.Items.ROUND_SWORD_TAG);
        tagWeaponItem(ModItems.ROUND_SWORD_2, ModTags.Items.ROUND_SWORD_TAG);
        tagWeaponItem(ModItems.ROUND_SWORD_3, ModTags.Items.ROUND_SWORD_TAG);
        tagWeaponItem(ModItems.ROUND_SWORD_4, ModTags.Items.ROUND_SWORD_TAG);
        tagWeaponItem(ModItems.ROUND_SWORD_5, ModTags.Items.ROUND_SWORD_TAG);
        
        tagWeaponItem(ModItems.SHAPED_AMETHYST, ModTags.Items.SHAPED_AMETHYST_TAG);
        tagWeaponItem(ModItems.SHAPED_AMETHYST_1, ModTags.Items.SHAPED_AMETHYST_TAG);
        tagWeaponItem(ModItems.SHAPED_AMETHYST_2, ModTags.Items.SHAPED_AMETHYST_TAG);
        tagWeaponItem(ModItems.SHAPED_AMETHYST_3, ModTags.Items.SHAPED_AMETHYST_TAG);
        tagWeaponItem(ModItems.SHAPED_AMETHYST_4, ModTags.Items.SHAPED_AMETHYST_TAG);
        tagWeaponItem(ModItems.SHAPED_AMETHYST_5, ModTags.Items.SHAPED_AMETHYST_TAG);

//        tagWeaponItem(ModItems.FLINT_HAND, ModTags.Items.FLINT_HAND_TAG);
//        tagWeaponItem(ModItems.FLINT_HAND_1, ModTags.Items.FLINT_HAND_TAG);
//        tagWeaponItem(ModItems.FLINT_HAND_2, ModTags.Items.FLINT_HAND_TAG);
//        tagWeaponItem(ModItems.FLINT_HAND_3, ModTags.Items.FLINT_HAND_TAG);
//        tagWeaponItem(ModItems.FLINT_HAND_4, ModTags.Items.FLINT_HAND_TAG);
//        tagWeaponItem(ModItems.FLINT_HAND_5, ModTags.Items.FLINT_HAND_TAG);

        tagWeaponItem(ModItems.LAVA_SWORD, ModTags.Items.LAVA_SWORD_TAG);
        tagWeaponItem(ModItems.LAVA_SWORD_1, ModTags.Items.LAVA_SWORD_TAG);
        tagWeaponItem(ModItems.LAVA_SWORD_2, ModTags.Items.LAVA_SWORD_TAG);
        tagWeaponItem(ModItems.LAVA_SWORD_3, ModTags.Items.LAVA_SWORD_TAG);
        tagWeaponItem(ModItems.LAVA_SWORD_4, ModTags.Items.LAVA_SWORD_TAG);
        tagWeaponItem(ModItems.LAVA_SWORD_5, ModTags.Items.LAVA_SWORD_TAG);

        tagWeaponItem(ModItems.WITHER_SWORD, ModTags.Items.WITHER_SWORD_TAG);
        tagWeaponItem(ModItems.WITHER_SWORD_1, ModTags.Items.WITHER_SWORD_TAG);
        tagWeaponItem(ModItems.WITHER_SWORD_2, ModTags.Items.WITHER_SWORD_TAG);
        tagWeaponItem(ModItems.WITHER_SWORD_3, ModTags.Items.WITHER_SWORD_TAG);
        tagWeaponItem(ModItems.WITHER_SWORD_4, ModTags.Items.WITHER_SWORD_TAG);
        tagWeaponItem(ModItems.WITHER_SWORD_5, ModTags.Items.WITHER_SWORD_TAG);

        tagWeaponItem(ModItems.KING_AXE, ModTags.Items.KING_AXE_TAG);
        tagWeaponItem(ModItems.KING_AXE_1, ModTags.Items.KING_AXE_TAG);
        tagWeaponItem(ModItems.KING_AXE_2, ModTags.Items.KING_AXE_TAG);
        tagWeaponItem(ModItems.KING_AXE_3, ModTags.Items.KING_AXE_TAG);
        tagWeaponItem(ModItems.KING_AXE_4, ModTags.Items.KING_AXE_TAG);
        tagWeaponItem(ModItems.KING_AXE_5, ModTags.Items.KING_AXE_TAG);

        tagWeaponItem(ModItems.STORM_AXE, ModTags.Items.STORM_AXE_TAG);
        tagWeaponItem(ModItems.STORM_AXE_1, ModTags.Items.STORM_AXE_TAG);
        tagWeaponItem(ModItems.STORM_AXE_2, ModTags.Items.STORM_AXE_TAG);
        tagWeaponItem(ModItems.STORM_AXE_3, ModTags.Items.STORM_AXE_TAG);
        tagWeaponItem(ModItems.STORM_AXE_4, ModTags.Items.STORM_AXE_TAG);
        tagWeaponItem(ModItems.STORM_AXE_5, ModTags.Items.STORM_AXE_TAG);
        
        tagWeaponItem(ModItems.BIG_FIRED_CHICKEN, ModTags.Items.BIG_FIRED_CHICKEN_TAG);
        tagWeaponItem(ModItems.BIG_FIRED_CHICKEN_1, ModTags.Items.BIG_FIRED_CHICKEN_TAG);
        tagWeaponItem(ModItems.BIG_FIRED_CHICKEN_2, ModTags.Items.BIG_FIRED_CHICKEN_TAG);
        tagWeaponItem(ModItems.BIG_FIRED_CHICKEN_3, ModTags.Items.BIG_FIRED_CHICKEN_TAG);
        tagWeaponItem(ModItems.BIG_FIRED_CHICKEN_4, ModTags.Items.BIG_FIRED_CHICKEN_TAG);
        tagWeaponItem(ModItems.BIG_FIRED_CHICKEN_5, ModTags.Items.BIG_FIRED_CHICKEN_TAG);

        tagWeaponItem(ModItems.GOLDEN_SPEAR, ModTags.Items.GOLDEN_SPEAR_TAG);
        tagWeaponItem(ModItems.GOLDEN_SPEAR_1, ModTags.Items.GOLDEN_SPEAR_TAG);
        tagWeaponItem(ModItems.GOLDEN_SPEAR_2, ModTags.Items.GOLDEN_SPEAR_TAG);
        tagWeaponItem(ModItems.GOLDEN_SPEAR_3, ModTags.Items.GOLDEN_SPEAR_TAG);
        tagWeaponItem(ModItems.GOLDEN_SPEAR_4, ModTags.Items.GOLDEN_SPEAR_TAG);
        tagWeaponItem(ModItems.GOLDEN_SPEAR_5, ModTags.Items.GOLDEN_SPEAR_TAG);

        tagWeaponItem(ModItems.BAMBOO_SWORD, ModTags.Items.BAMBOO_SWORD_TAG);
        tagWeaponItem(ModItems.BAMBOO_SWORD_1, ModTags.Items.BAMBOO_SWORD_TAG);
        tagWeaponItem(ModItems.BAMBOO_SWORD_2, ModTags.Items.BAMBOO_SWORD_TAG);
        tagWeaponItem(ModItems.BAMBOO_SWORD_3, ModTags.Items.BAMBOO_SWORD_TAG);
        tagWeaponItem(ModItems.BAMBOO_SWORD_4, ModTags.Items.BAMBOO_SWORD_TAG);
        tagWeaponItem(ModItems.BAMBOO_SWORD_5, ModTags.Items.BAMBOO_SWORD_TAG);

        tagWeaponItem(ModItems.LANTERN_SWORD, ModTags.Items.LANTERN_SWORD_TAG);
        tagWeaponItem(ModItems.LANTERN_SWORD_1, ModTags.Items.LANTERN_SWORD_TAG);
        tagWeaponItem(ModItems.LANTERN_SWORD_2, ModTags.Items.LANTERN_SWORD_TAG);
        tagWeaponItem(ModItems.LANTERN_SWORD_3, ModTags.Items.LANTERN_SWORD_TAG);
        tagWeaponItem(ModItems.LANTERN_SWORD_4, ModTags.Items.LANTERN_SWORD_TAG);
        tagWeaponItem(ModItems.LANTERN_SWORD_5, ModTags.Items.LANTERN_SWORD_TAG);

        tagWeaponItem(ModItems.CHAINSAW_SWORD, ModTags.Items.CHAINSAW_SWORD_TAG);
        tagWeaponItem(ModItems.CHAINSAW_SWORD_1, ModTags.Items.CHAINSAW_SWORD_TAG);
        tagWeaponItem(ModItems.CHAINSAW_SWORD_2, ModTags.Items.CHAINSAW_SWORD_TAG);
        tagWeaponItem(ModItems.CHAINSAW_SWORD_3, ModTags.Items.CHAINSAW_SWORD_TAG);
        tagWeaponItem(ModItems.CHAINSAW_SWORD_4, ModTags.Items.CHAINSAW_SWORD_TAG);
        tagWeaponItem(ModItems.CHAINSAW_SWORD_5, ModTags.Items.CHAINSAW_SWORD_TAG);


        tagWeaponItem(ModItems.LIVING_WOOD, ModTags.Items.LIVING_WOOD_TAG);
        tagWeaponItem(ModItems.LIVING_WOOD_1, ModTags.Items.LIVING_WOOD_TAG);
        tagWeaponItem(ModItems.LIVING_WOOD_2, ModTags.Items.LIVING_WOOD_TAG);
        tagWeaponItem(ModItems.LIVING_WOOD_3, ModTags.Items.LIVING_WOOD_TAG);
        tagWeaponItem(ModItems.LIVING_WOOD_4, ModTags.Items.LIVING_WOOD_TAG);
        tagWeaponItem(ModItems.LIVING_WOOD_5, ModTags.Items.LIVING_WOOD_TAG);

        tagWeaponItem(ModItems.RECOVERY_BLADE, ModTags.Items.RECOVERY_BLADE_TAG);
        tagWeaponItem(ModItems.RECOVERY_BLADE_1, ModTags.Items.RECOVERY_BLADE_TAG);
        tagWeaponItem(ModItems.RECOVERY_BLADE_2, ModTags.Items.RECOVERY_BLADE_TAG);
        tagWeaponItem(ModItems.RECOVERY_BLADE_3, ModTags.Items.RECOVERY_BLADE_TAG);
        tagWeaponItem(ModItems.RECOVERY_BLADE_4, ModTags.Items.RECOVERY_BLADE_TAG);
        tagWeaponItem(ModItems.RECOVERY_BLADE_5, ModTags.Items.RECOVERY_BLADE_TAG);
        
        tagWeaponItem(ModItems.BROOM, ModTags.Items.BROOM_TAG);
        tagWeaponItem(ModItems.BROOM_1, ModTags.Items.BROOM_TAG);
        tagWeaponItem(ModItems.BROOM_2, ModTags.Items.BROOM_TAG);
        tagWeaponItem(ModItems.BROOM_3, ModTags.Items.BROOM_TAG);
        tagWeaponItem(ModItems.BROOM_4, ModTags.Items.BROOM_TAG);
        tagWeaponItem(ModItems.BROOM_5, ModTags.Items.BROOM_TAG);
        
        tagWeaponItem(ModItems.HEALING_WAND, ModTags.Items.HEALING_WAND_TAG);
        tagWeaponItem(ModItems.HEALING_WAND_1, ModTags.Items.HEALING_WAND_TAG);
        tagWeaponItem(ModItems.HEALING_WAND_2, ModTags.Items.HEALING_WAND_TAG);
        tagWeaponItem(ModItems.HEALING_WAND_3, ModTags.Items.HEALING_WAND_TAG);
        tagWeaponItem(ModItems.HEALING_WAND_4, ModTags.Items.HEALING_WAND_TAG);
        tagWeaponItem(ModItems.HEALING_WAND_5, ModTags.Items.HEALING_WAND_TAG);

        complexBlock(ModBlocks.EVOLVE_ANVIL.get());

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LKArtifacts.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(LKArtifacts.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(LKArtifacts.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    //手持物品的方法
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
        new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(LKArtifacts.MOD_ID,"item/"+ item.getId().getPath()));
    }
    private ItemModelBuilder tagWeaponItem(RegistryObject<Item> item, TagKey tags) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(LKArtifacts.MOD_ID,"item/"+ tags.location().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LKArtifacts.MOD_ID,"item/" + item.getId().getPath()));
    }
}

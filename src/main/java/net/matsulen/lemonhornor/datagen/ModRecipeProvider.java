package net.matsulen.lemonhornor.datagen;

import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.block.ModBlocks;
import net.matsulen.lemonhornor.datagen.custom.EvolveTableRecipe;
import net.matsulen.lemonhornor.item.ModItems;
import net.matsulen.lemonhornor.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SICKLE.get())
//                        .pattern("III")
//                        .pattern("IW ")
//                        .pattern(" W ")
//                        .define('I', Items.IRON_INGOT)
//                        .define('W',Items.STICK)
//                        .unlockedBy(getHasName(Items.IRON_INGOT),has(Items.STICK))
//                        .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.EMERALD, 50)
                .requires(ModTags.Items.TOTEM_SWORD_TAG)
                .unlockedBy(getHasName(ModItems.TOTEM_SWORD.get()), has(ModTags.Items.TOTEM_SWORD_TAG))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_DUST.get(), 4)
                .requires(Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("DD")
                .pattern("DD")
                .define('D',ModItems.DIAMOND_DUST.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_DUST.get()), has(ModItems.DIAMOND_DUST.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SMITHING_HAMMER.get())
                .pattern("  N")
                .pattern(" S ")
                .pattern("S  ")
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EVOLVE_ANVIL.get())
                .pattern("H ")
                .pattern("A ")
                .define('H', ModItems.SMITHING_HAMMER.get())
                .define('A', Items.ANVIL)
                .unlockedBy(getHasName(ModItems.SMITHING_HAMMER.get()), has(ModItems.SMITHING_HAMMER.get()))
                .save(pWriter);

        new EvolveTableRecipe(ModItems.IRON_SICKLE.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_SICKLE_1.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_SICKLE_2.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_SICKLE_3.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_SICKLE_4.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_SICKLE_5.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_4.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_SICKLE_6.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_5.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_SICKLE_7.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_6.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_SICKLE_8.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_7.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_SICKLE_9.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_8.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_SICKLE_9.get(), ModItems.STAR.get(), ModItems.IRON_SICKLE_10.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_9.get())).save(pWriter);
        
        new EvolveTableRecipe(ModItems.IRON_BLADE.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_BLADE_1.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_BLADE_2.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_BLADE_3.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_BLADE_4.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_BLADE_5.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_4.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_BLADE_6.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_5.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_BLADE_7.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_6.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_BLADE_8.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_7.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_BLADE_9.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_8.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.IRON_BLADE_9.get(), ModItems.STAR.get(), ModItems.IRON_BLADE_10.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_9.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.SPARE.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.SPARE_1.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.SPARE_2.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.SPARE_3.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.SPARE_4.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.SPARE_5.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_4.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.SPARE_6.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_5.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.SPARE_7.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_6.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.SPARE_8.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_7.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.SPARE_9.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_8.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SPARE_9.get(), ModItems.STAR.get(), ModItems.SPARE_10.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_9.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.BAYSWORD.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.BAYSWORD_1.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.BAYSWORD_2.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.BAYSWORD_3.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.BAYSWORD_4.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.BAYSWORD_5.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_4.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.BAYSWORD_6.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_5.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.BAYSWORD_7.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_6.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.BAYSWORD_8.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_7.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.BAYSWORD_9.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_8.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.BAYSWORD_9.get(), ModItems.STAR.get(), ModItems.BAYSWORD_10.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_9.get())).save(pWriter);



        new EvolveTableRecipe(ModItems.CAMP_FIRE_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_1.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.CAMP_FIRE_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_2.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.CAMP_FIRE_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_3.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.CAMP_FIRE_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_4.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.CAMP_FIRE_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.CAMP_FIRE_SWORD_5.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.DRAGON_TEAR.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_1.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.DRAGON_TEAR_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_2.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.DRAGON_TEAR_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_3.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.DRAGON_TEAR_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_4.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.DRAGON_TEAR_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.DRAGON_TEAR_5.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.SOUL_FIRE.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_1.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SOUL_FIRE_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_2.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SOUL_FIRE_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_3.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SOUL_FIRE_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_4.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SOUL_FIRE_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.SOUL_FIRE_5.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.MEAT_KNIFE.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_1.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.MEAT_KNIFE_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_2.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.MEAT_KNIFE_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_3.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.MEAT_KNIFE_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_4.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.MEAT_KNIFE_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.MEAT_KNIFE_5.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.HORN_OF_GOAT.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_1.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.HORN_OF_GOAT_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_2.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.HORN_OF_GOAT_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_3.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.HORN_OF_GOAT_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_4.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.HORN_OF_GOAT_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.HORN_OF_GOAT_5.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.EFFECTED_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_1.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.EFFECTED_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_2.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.EFFECTED_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_3.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.EFFECTED_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_4.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.EFFECTED_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.EFFECTED_SWORD_5.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.KNIGHT_HORNOR.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_1.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.KNIGHT_HORNOR_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_2.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.KNIGHT_HORNOR_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_3.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.KNIGHT_HORNOR_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_4.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.KNIGHT_HORNOR_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.KNIGHT_HORNOR_5.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.SAMON_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_1.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SAMON_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_2.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SAMON_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_3.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SAMON_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_4.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SAMON_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.SAMON_SWORD_5.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.TOTEM_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_1.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.TOTEM_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_2.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.TOTEM_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_3.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.TOTEM_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_4.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.TOTEM_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.TOTEM_SWORD_5.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.ROUND_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_1.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.ROUND_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_2.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.ROUND_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_3.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.ROUND_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_4.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.ROUND_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.ROUND_SWORD_5.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipe(ModItems.FLINT_HAND.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_1.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.FLINT_HAND_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_2.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.FLINT_HAND_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_3.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.FLINT_HAND_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_4.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.FLINT_HAND_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.FLINT_HAND_5.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_4.get())).save(pWriter);


        new EvolveTableRecipe(ModItems.SHAPED_AMETHYST.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_1.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SHAPED_AMETHYST_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_2.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_1.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SHAPED_AMETHYST_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_3.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_2.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SHAPED_AMETHYST_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_4.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_3.get())).save(pWriter);
        new EvolveTableRecipe(ModItems.SHAPED_AMETHYST_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.SHAPED_AMETHYST_5.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_4.get())).save(pWriter);
    }

}

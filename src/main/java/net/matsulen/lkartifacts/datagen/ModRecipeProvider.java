package net.matsulen.lkartifacts.datagen;

import net.matsulen.lkartifacts.block.ModBlocks;
import net.matsulen.lkartifacts.datagen.custom.EvolveTableRecipeProvider;
import net.matsulen.lkartifacts.item.ModItems;
import net.matsulen.lkartifacts.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

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

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.KNIGHT_TEMPLATE.get()),
               Ingredient.of(Items.IRON_HELMET),Ingredient.of(ModItems.BROKEN_STAR_SMALL.get()),RecipeCategory.MISC,ModItems.KNIGHT_HELMET.get())
                .unlocks(getHasName(ModItems.KNIGHT_TEMPLATE.get()), has(ModItems.KNIGHT_TEMPLATE.get()))
                        .save(pWriter, "knight_helmet_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.KNIGHT_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_CHESTPLATE),Ingredient.of(ModItems.BROKEN_STAR_SMALL.get()),RecipeCategory.MISC,ModItems.KNIGHT_CHESTPLATE.get())
                .unlocks(getHasName(ModItems.KNIGHT_TEMPLATE.get()), has(ModItems.KNIGHT_TEMPLATE.get()))
                .save(pWriter, "knight_chestplate_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.KNIGHT_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_LEGGINGS),Ingredient.of(ModItems.BROKEN_STAR_SMALL.get()),RecipeCategory.MISC,ModItems.KNIGHT_LEGGINGS.get())
                .unlocks(getHasName(ModItems.KNIGHT_TEMPLATE.get()), has(ModItems.KNIGHT_TEMPLATE.get()))
                .save(pWriter, "knight_leggings_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.KNIGHT_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_BOOTS),Ingredient.of(ModItems.BROKEN_STAR_SMALL.get()),RecipeCategory.MISC,ModItems.KNIGHT_BOOTS.get())
                .unlocks(getHasName(ModItems.KNIGHT_TEMPLATE.get()), has(ModItems.KNIGHT_TEMPLATE.get()))
                .save(pWriter, "knight_boots_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.SLAYER_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_HELMET),Ingredient.of(ModItems.BROKEN_STAR_LONG.get()),RecipeCategory.MISC,ModItems.SLAYER_HELMET.get())
                .unlocks(getHasName(ModItems.SLAYER_TEMPLATE.get()), has(ModItems.SLAYER_TEMPLATE.get()))
                .save(pWriter, "slayer_helmet_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.SLAYER_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_CHESTPLATE),Ingredient.of(ModItems.BROKEN_STAR_LONG.get()),RecipeCategory.MISC,ModItems.SLAYER_CHESTPLATE.get())
                .unlocks(getHasName(ModItems.SLAYER_TEMPLATE.get()), has(ModItems.SLAYER_TEMPLATE.get()))
                .save(pWriter, "slayer_chestplate_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.SLAYER_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_LEGGINGS),Ingredient.of(ModItems.BROKEN_STAR_LONG.get()),RecipeCategory.MISC,ModItems.SLAYER_LEGGINGS.get())
                .unlocks(getHasName(ModItems.SLAYER_TEMPLATE.get()), has(ModItems.SLAYER_TEMPLATE.get()))
                .save(pWriter, "slayer_leggings_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.SLAYER_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_BOOTS),Ingredient.of(ModItems.BROKEN_STAR_LONG.get()),RecipeCategory.MISC,ModItems.SLAYER_BOOTS.get())
                .unlocks(getHasName(ModItems.SLAYER_TEMPLATE.get()), has(ModItems.SLAYER_TEMPLATE.get()))
                .save(pWriter, "slayer_boots_from_smithing_table");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.LAVA_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_HELMET),Ingredient.of(ModItems.BROKEN_STAR_BIG.get()),RecipeCategory.MISC,ModItems.LAVA_HELMET.get())
                .unlocks(getHasName(ModItems.LAVA_TEMPLATE.get()), has(ModItems.LAVA_TEMPLATE.get()))
                .save(pWriter, "lava_helmet_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.LAVA_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_CHESTPLATE),Ingredient.of(ModItems.BROKEN_STAR_BIG.get()),RecipeCategory.MISC,ModItems.LAVA_CHESTPLATE.get())
                .unlocks(getHasName(ModItems.LAVA_TEMPLATE.get()), has(ModItems.LAVA_TEMPLATE.get()))
                .save(pWriter, "lava_chestplate_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.LAVA_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_LEGGINGS),Ingredient.of(ModItems.BROKEN_STAR_BIG.get()),RecipeCategory.MISC,ModItems.LAVA_LEGGINGS.get())
                .unlocks(getHasName(ModItems.LAVA_TEMPLATE.get()), has(ModItems.LAVA_TEMPLATE.get()))
                .save(pWriter, "lava_leggings_from_smithing_table");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.LAVA_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_BOOTS),Ingredient.of(ModItems.BROKEN_STAR_BIG.get()),RecipeCategory.MISC,ModItems.LAVA_BOOTS.get())
                .unlocks(getHasName(ModItems.LAVA_TEMPLATE.get()), has(ModItems.LAVA_TEMPLATE.get()))
                .save(pWriter, "lava_boots_from_smithing_table");
        

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KNIGHT_TEMPLATE.get(),2)
                .pattern("DTD")
                .pattern("DSD")
                .pattern("DDD")
                .define('T', ModItems.KNIGHT_TEMPLATE.get())
                .define('D', Items.DIAMOND)
                .define('S', Items.STONE)
                .unlockedBy(getHasName(ModItems.KNIGHT_TEMPLATE.get()), has(ModItems.KNIGHT_TEMPLATE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LAVA_TEMPLATE.get(),2)
                .pattern("DTD")
                .pattern("DSD")
                .pattern("DDD")
                .define('T', ModItems.LAVA_TEMPLATE.get())
                .define('D', Items.DIAMOND)
                .define('S', Items.STONE)
                .unlockedBy(getHasName(ModItems.LAVA_TEMPLATE.get()), has(ModItems.LAVA_TEMPLATE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLAYER_TEMPLATE.get(),2)
                .pattern("DTD")
                .pattern("DSD")
                .pattern("DDD")
                .define('T', ModItems.SLAYER_TEMPLATE.get())
                .define('D', Items.DIAMOND)
                .define('S', Items.STONE)
                .unlockedBy(getHasName(ModItems.SLAYER_TEMPLATE.get()), has(ModItems.SLAYER_TEMPLATE.get()))
                .save(pWriter);

        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_SICKLE_1.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_SICKLE_2.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_SICKLE_3.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_SICKLE_4.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_SICKLE_5.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_4.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_SICKLE_6.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_5.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_SICKLE_7.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_6.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_SICKLE_8.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_7.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_SICKLE_9.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_8.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_SICKLE_9.get(), ModItems.STAR.get(), ModItems.IRON_SICKLE_10.get(), 1)
                .unlockedBy("has_iron_sickle", has(ModItems.IRON_SICKLE_9.get())).save(pWriter);
        
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_BLADE_1.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_BLADE_2.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.IRON_BLADE_3.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_BLADE_4.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_BLADE_5.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_4.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.IRON_BLADE_6.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_5.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_BLADE_7.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_6.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_BLADE_8.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_7.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.IRON_BLADE_9.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_8.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.IRON_BLADE_9.get(), ModItems.STAR.get(), ModItems.IRON_BLADE_10.get(), 1)
                .unlockedBy("has_iron_blade", has(ModItems.IRON_BLADE_9.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.SPARE.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.SPARE_1.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.SPARE_2.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.SPARE_3.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.SPARE_4.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.SPARE_5.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_4.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.SPARE_6.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_5.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.SPARE_7.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_6.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.SPARE_8.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_7.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.SPARE_9.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_8.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SPARE_9.get(), ModItems.STAR.get(), ModItems.SPARE_10.get(), 1)
                .unlockedBy("has_SPARE", has(ModItems.SPARE_9.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.BAYSWORD.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.BAYSWORD_1.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_1.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.BAYSWORD_2.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_2.get(), ModItems.BROKEN_STAR_SMALL.get(), ModItems.BAYSWORD_3.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_3.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.BAYSWORD_4.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_4.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.BAYSWORD_5.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_4.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_5.get(), ModItems.BROKEN_STAR_LONG.get(), ModItems.BAYSWORD_6.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_5.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_6.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.BAYSWORD_7.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_6.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_7.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.BAYSWORD_8.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_7.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_8.get(), ModItems.BROKEN_STAR_BIG.get(), ModItems.BAYSWORD_9.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_8.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAYSWORD_9.get(), ModItems.STAR.get(), ModItems.BAYSWORD_10.get(), 1)
                .unlockedBy("has_baysword", has(ModItems.BAYSWORD_9.get())).save(pWriter);



        new EvolveTableRecipeProvider(ModItems.CAMP_FIRE_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_1.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CAMP_FIRE_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_2.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CAMP_FIRE_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_3.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CAMP_FIRE_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CAMP_FIRE_SWORD_4.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CAMP_FIRE_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.CAMP_FIRE_SWORD_5.get(), 1)
                .unlockedBy("has_camp_fire_sword", has(ModItems.CAMP_FIRE_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.DRAGON_TEAR.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_1.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.DRAGON_TEAR_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_2.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.DRAGON_TEAR_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_3.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.DRAGON_TEAR_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.DRAGON_TEAR_4.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.DRAGON_TEAR_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.DRAGON_TEAR_5.get(), 1)
                .unlockedBy("has_dragon_tear", has(ModItems.DRAGON_TEAR_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.SOUL_FIRE.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_1.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SOUL_FIRE_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_2.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SOUL_FIRE_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_3.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SOUL_FIRE_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SOUL_FIRE_4.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SOUL_FIRE_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.SOUL_FIRE_5.get(), 1)
                .unlockedBy("has_soul_fire", has(ModItems.SOUL_FIRE_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.MEAT_KNIFE.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_1.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.MEAT_KNIFE_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_2.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.MEAT_KNIFE_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_3.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.MEAT_KNIFE_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.MEAT_KNIFE_4.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.MEAT_KNIFE_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.MEAT_KNIFE_5.get(), 1)
                .unlockedBy("has_meat_knife", has(ModItems.MEAT_KNIFE_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.HORN_OF_GOAT.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_1.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.HORN_OF_GOAT_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_2.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.HORN_OF_GOAT_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_3.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.HORN_OF_GOAT_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.HORN_OF_GOAT_4.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.HORN_OF_GOAT_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.HORN_OF_GOAT_5.get(), 1)
                .unlockedBy("has_horn_of_goat", has(ModItems.HORN_OF_GOAT_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.EFFECTED_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_1.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.EFFECTED_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_2.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.EFFECTED_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_3.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.EFFECTED_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.EFFECTED_SWORD_4.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.EFFECTED_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.EFFECTED_SWORD_5.get(), 1)
                .unlockedBy("has_effected_sword", has(ModItems.EFFECTED_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.KNIGHT_HORNOR.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_1.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KNIGHT_HORNOR_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_2.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KNIGHT_HORNOR_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_3.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KNIGHT_HORNOR_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KNIGHT_HORNOR_4.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KNIGHT_HORNOR_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.KNIGHT_HORNOR_5.get(), 1)
                .unlockedBy("has_knight_hornor", has(ModItems.KNIGHT_HORNOR_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.SAMON_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_1.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SAMON_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_2.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SAMON_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_3.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SAMON_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SAMON_SWORD_4.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SAMON_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.SAMON_SWORD_5.get(), 1)
                .unlockedBy("has_samon_sword", has(ModItems.SAMON_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.TOTEM_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_1.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.TOTEM_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_2.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.TOTEM_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_3.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.TOTEM_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.TOTEM_SWORD_4.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.TOTEM_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.TOTEM_SWORD_5.get(), 1)
                .unlockedBy("has_totem_sword", has(ModItems.TOTEM_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.ROUND_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_1.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.ROUND_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_2.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.ROUND_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_3.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.ROUND_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.ROUND_SWORD_4.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.ROUND_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.ROUND_SWORD_5.get(), 1)
                .unlockedBy("has_round_sword", has(ModItems.ROUND_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.FLINT_HAND.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_1.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.FLINT_HAND_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_2.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.FLINT_HAND_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_3.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.FLINT_HAND_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.FLINT_HAND_4.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.FLINT_HAND_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.FLINT_HAND_5.get(), 1)
                .unlockedBy("has_flint_hand", has(ModItems.FLINT_HAND_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.LAVA_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LAVA_SWORD_1.get(), 1)
                .unlockedBy("has_lava_sword", has(ModItems.LAVA_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LAVA_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LAVA_SWORD_2.get(), 1)
                .unlockedBy("has_lava_sword", has(ModItems.LAVA_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LAVA_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LAVA_SWORD_3.get(), 1)
                .unlockedBy("has_lava_sword", has(ModItems.LAVA_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LAVA_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LAVA_SWORD_4.get(), 1)
                .unlockedBy("has_lava_sword", has(ModItems.LAVA_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LAVA_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.LAVA_SWORD_5.get(), 1)
                .unlockedBy("has_lava_sword", has(ModItems.LAVA_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.WITHER_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.WITHER_SWORD_1.get(), 1)
                .unlockedBy("has_wither_sword", has(ModItems.WITHER_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.WITHER_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.WITHER_SWORD_2.get(), 1)
                .unlockedBy("has_wither_sword", has(ModItems.WITHER_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.WITHER_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.WITHER_SWORD_3.get(), 1)
                .unlockedBy("has_wither_sword", has(ModItems.WITHER_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.WITHER_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.WITHER_SWORD_4.get(), 1)
                .unlockedBy("has_wither_sword", has(ModItems.WITHER_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.WITHER_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.WITHER_SWORD_5.get(), 1)
                .unlockedBy("has_wither_sword", has(ModItems.WITHER_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.KING_AXE.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KING_AXE_1.get(), 1)
                .unlockedBy("has_king_axe", has(ModItems.KING_AXE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KING_AXE_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KING_AXE_2.get(), 1)
                .unlockedBy("has_king_axe", has(ModItems.KING_AXE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KING_AXE_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KING_AXE_3.get(), 1)
                .unlockedBy("has_king_axe", has(ModItems.KING_AXE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KING_AXE_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.KING_AXE_4.get(), 1)
                .unlockedBy("has_king_axe", has(ModItems.KING_AXE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.KING_AXE_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.KING_AXE_5.get(), 1)
                .unlockedBy("has_king_axe", has(ModItems.KING_AXE_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.STORM_AXE.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.STORM_AXE_1.get(), 1)
                .unlockedBy("has_storm_axe", has(ModItems.STORM_AXE.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.STORM_AXE_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.STORM_AXE_2.get(), 1)
                .unlockedBy("has_storm_axe", has(ModItems.STORM_AXE_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.STORM_AXE_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.STORM_AXE_3.get(), 1)
                .unlockedBy("has_storm_axe", has(ModItems.STORM_AXE_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.STORM_AXE_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.STORM_AXE_4.get(), 1)
                .unlockedBy("has_storm_axe", has(ModItems.STORM_AXE_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.STORM_AXE_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.STORM_AXE_5.get(), 1)
                .unlockedBy("has_storm_axe", has(ModItems.STORM_AXE_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.BIG_FIRED_CHICKEN.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BIG_FIRED_CHICKEN_1.get(), 1)
                .unlockedBy("has_big_fired_chicken", has(ModItems.BIG_FIRED_CHICKEN.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BIG_FIRED_CHICKEN_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BIG_FIRED_CHICKEN_2.get(), 1)
                .unlockedBy("has_big_fired_chicken", has(ModItems.BIG_FIRED_CHICKEN_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BIG_FIRED_CHICKEN_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BIG_FIRED_CHICKEN_3.get(), 1)
                .unlockedBy("has_big_fired_chicken", has(ModItems.BIG_FIRED_CHICKEN_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BIG_FIRED_CHICKEN_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BIG_FIRED_CHICKEN_4.get(), 1)
                .unlockedBy("has_big_fired_chicken", has(ModItems.BIG_FIRED_CHICKEN_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BIG_FIRED_CHICKEN_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.BIG_FIRED_CHICKEN_5.get(), 1)
                .unlockedBy("has_big_fired_chicken", has(ModItems.BIG_FIRED_CHICKEN_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.GOLDEN_SPEAR.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.GOLDEN_SPEAR_1.get(), 1)
                .unlockedBy("has_golden_spear", has(ModItems.GOLDEN_SPEAR.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.GOLDEN_SPEAR_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.GOLDEN_SPEAR_2.get(), 1)
                .unlockedBy("has_golden_spear", has(ModItems.GOLDEN_SPEAR_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.GOLDEN_SPEAR_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.GOLDEN_SPEAR_3.get(), 1)
                .unlockedBy("has_golden_spear", has(ModItems.GOLDEN_SPEAR_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.GOLDEN_SPEAR_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.GOLDEN_SPEAR_4.get(), 1)
                .unlockedBy("has_golden_spear", has(ModItems.GOLDEN_SPEAR_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.GOLDEN_SPEAR_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.GOLDEN_SPEAR_5.get(), 1)
                .unlockedBy("has_golden_spear", has(ModItems.GOLDEN_SPEAR_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.BAMBOO_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BAMBOO_SWORD_1.get(), 1)
                .unlockedBy("has_bamboo_sword", has(ModItems.BAMBOO_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAMBOO_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BAMBOO_SWORD_2.get(), 1)
                .unlockedBy("has_bamboo_sword", has(ModItems.BAMBOO_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAMBOO_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BAMBOO_SWORD_3.get(), 1)
                .unlockedBy("has_bamboo_sword", has(ModItems.BAMBOO_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAMBOO_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.BAMBOO_SWORD_4.get(), 1)
                .unlockedBy("has_bamboo_sword", has(ModItems.BAMBOO_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.BAMBOO_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.BAMBOO_SWORD_5.get(), 1)
                .unlockedBy("has_bamboo_sword", has(ModItems.BAMBOO_SWORD_4.get())).save(pWriter);

        new EvolveTableRecipeProvider(ModItems.LANTERN_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LANTERN_SWORD_1.get(), 1)
                .unlockedBy("has_lantern_sword", has(ModItems.LANTERN_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LANTERN_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LANTERN_SWORD_2.get(), 1)
                .unlockedBy("has_lantern_sword", has(ModItems.LANTERN_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LANTERN_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LANTERN_SWORD_3.get(), 1)
                .unlockedBy("has_lantern_sword", has(ModItems.LANTERN_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LANTERN_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.LANTERN_SWORD_4.get(), 1)
                .unlockedBy("has_lantern_sword", has(ModItems.LANTERN_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.LANTERN_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.LANTERN_SWORD_5.get(), 1)
                .unlockedBy("has_lantern_sword", has(ModItems.LANTERN_SWORD_4.get())).save(pWriter);
        
        new EvolveTableRecipeProvider(ModItems.CHAINSAW_SWORD.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CHAINSAW_SWORD_1.get(), 1)
                .unlockedBy("has_CHAINSAW_SWORD", has(ModItems.CHAINSAW_SWORD.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CHAINSAW_SWORD_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CHAINSAW_SWORD_2.get(), 1)
                .unlockedBy("has_CHAINSAW_SWORD", has(ModItems.CHAINSAW_SWORD_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CHAINSAW_SWORD_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CHAINSAW_SWORD_3.get(), 1)
                .unlockedBy("has_CHAINSAW_SWORD", has(ModItems.CHAINSAW_SWORD_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CHAINSAW_SWORD_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.CHAINSAW_SWORD_4.get(), 1)
                .unlockedBy("has_CHAINSAW_SWORD", has(ModItems.CHAINSAW_SWORD_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.CHAINSAW_SWORD_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.CHAINSAW_SWORD_5.get(), 1)
                .unlockedBy("has_CHAINSAW_SWORD", has(ModItems.CHAINSAW_SWORD_4.get())).save(pWriter);


        new EvolveTableRecipeProvider(ModItems.SHAPED_AMETHYST.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_1.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SHAPED_AMETHYST_1.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_2.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_1.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SHAPED_AMETHYST_2.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_3.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_2.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SHAPED_AMETHYST_3.get(), ModItems.MYSTERY_AMETHYST.get(), ModItems.SHAPED_AMETHYST_4.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_3.get())).save(pWriter);
        new EvolveTableRecipeProvider(ModItems.SHAPED_AMETHYST_4.get(), ModItems.MYSTERY_PLATE.get(), ModItems.SHAPED_AMETHYST_5.get(), 1)
                .unlockedBy("has_shaped_amethyst", has(ModItems.SHAPED_AMETHYST_4.get())).save(pWriter);
    }

}

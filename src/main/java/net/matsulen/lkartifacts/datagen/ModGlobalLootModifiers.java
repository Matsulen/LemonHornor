package net.matsulen.lkartifacts.datagen;

import net.matsulen.lkartifacts.LKArtifacts;
import net.matsulen.lkartifacts.item.ModItems;
import net.matsulen.lkartifacts.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiers extends GlobalLootModifierProvider {
    public ModGlobalLootModifiers(PackOutput output) {
        super(output, LKArtifacts.MOD_ID);
    }

    @Override
    protected void start() {
        //给modifier取名字
//        add("broken_star_small_from_village", new AddItemModifier(new LootItemCondition[]{
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
//                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.BROKEN_STAR_SMALL.get()));
//        //35%概率
//
//        // External library   client extra data minecraft/loot_tables/entities
//        add("broken_star_small_from_village", new AddItemModifier(new LootItemCondition[]{
//                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build()
//        }, ModItems.BROKEN_STAR_SMALL.get()));
//
//        add("broken_star_small_from_village", new AddItemModifier(new LootItemCondition[]{
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build()
//        }, ModItems.BROKEN_STAR_SMALL.get()));
//


        add("broken_star_small_from_betterdungeons_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/common")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/middle")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:small_dungeon/chests/loot_piles")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:small_nether_dungeon/chests/common")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:spider_dungeon/chests/egg_room")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/common")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/special")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterdungeons_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/tombstone")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));

        add("broken_star_long_from_betterdungeons_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/tombstone")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_betterdungeons_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:spider_dungeon/chests/egg_room")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_betterdungeons_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/middle")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));

        add("broken_star_big_from_betterdungeons_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/tombstone")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_betterdungeons_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:spider_dungeon/chests/egg_room")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_betterdungeons_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/middle")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));

        add("mystery_amethyst_from_betterdungeons_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/tombstone")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_betterdungeons_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:spider_dungeon/chests/egg_room")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_betterdungeons_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/middle")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));

        add("weapon_from_betterdungeons_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/special")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SPARE.get()));
        add("weapon_from_betterdungeons_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/tombstone")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("weapon_from_betterdungeons_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:spider_dungeon/chests/egg_room")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("weapon_from_betterdungeons_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/middle")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BAYSWORD.get()));
        add("weapon_from_betterdungeons_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/special")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("weapon_from_betterdungeons_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:zombie_dungeon/chests/tombstone")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("weapon_from_betterdungeons_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:spider_dungeon/chests/egg_room")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("weapon_from_betterdungeons_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdungeons:skeleton_dungeon/chests/middle")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));

        //============================================================================================================

        add("broken_star_small_from_betterfortresses_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/hall")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/obsidian")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/beacon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/puzzle")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/quarters")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/storage")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_betterfortresses_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/worship")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));

        add("broken_star_long_from_betterfortresses_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_betterfortresses_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/obsidian")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_betterfortresses_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/puzzle")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));

        add("broken_star_big_from_betterfortresses_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/keep")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_betterfortresses_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/worship")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_betterfortresses_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/storage")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));

        add("mystery_amethyst_from_betterfortresses_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/obsidian")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_betterfortresses_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/puzzle")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_betterfortresses_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));

        add("weapon_from_betterfortresses_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/beacon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SPARE.get()));
        add("weapon_from_betterfortresses_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SPARE.get()));
        add("weapon_from_betterfortresses_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/hall")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SPARE.get()));
        add("weapon_from_betterfortresses_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/quarters")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SPARE.get()));
        add("weapon_from_betterfortresses_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/beacon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("weapon_from_betterfortresses_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("weapon_from_betterfortresses_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/hall")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("weapon_from_betterfortresses_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/quarters")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("weapon_from_betterfortresses_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/beacon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("weapon_from_betterfortresses_10", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("weapon_from_betterfortresses_11", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/hall")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("weapon_from_betterfortresses_12", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/quarters")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("weapon_from_betterfortresses_13", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/beacon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BAYSWORD.get()));
        add("weapon_from_betterfortresses_14", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/extra")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BAYSWORD.get()));
        add("weapon_from_betterfortresses_15", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/hall")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BAYSWORD.get()));
        add("weapon_from_betterfortresses_16", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/quarters")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BAYSWORD.get()));
        add("weapon_from_betterfortresses_17", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/obsidian")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("weapon_from_betterfortresses_18", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterfortresses:/chests/keep")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SOUL_FIRE.get()));
//=======================================================================
        add("material_from_betterwitchhuts_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterwitchhuts:/chests/hut_0")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_betterwitchhuts_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterwitchhuts:/chests/hut_0")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_betterwitchhuts_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterwitchhuts:/chests/hut_0")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.MEAT_KNIFE.get()));
//=========================================================================
        add("material_from_betterdeserttemples_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/food_storage")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/lab")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/library")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/pot")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/statue")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/storage")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/tomb")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/wardrobe")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterdeserttemples_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/library")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_betterdeserttemples_10", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/statue")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_betterdeserttemples_11", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/pharaoh_hidden")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));

        add("material_from_betterdeserttemples_12", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/pharaoh_hidden")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_betterdeserttemples_13", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/tomb_pharaoh")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_betterdeserttemples_14", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/pharaoh_hidden")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_betterdeserttemples_15", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/tomb_pharaoh")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));

        add("weapon_from_betterdeserttemples_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/pharaoh_hidden")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        add("weapon_from_betterdeserttemples_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterdeserttemples:/chests/tomb_pharaoh")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        //=============================================================================
        add("material_from_cataclysm_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ender_golem")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_cataclysm_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ignited_revenant")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_cataclysm_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/coralssus")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_cataclysm_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/amethyst_crab")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_cataclysm_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ender_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_PLATE.get()));
        add("material_from_cataclysm_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ignis")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_PLATE.get()));
        add("material_from_cataclysm_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/netherite_monstrosity")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_PLATE.get()));
        add("material_from_cataclysm_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/the_harbinger")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_PLATE.get()));
        add("material_from_cataclysm_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/the_leviathan")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_PLATE.get()));
        add("starmaterial_from_cataclysm_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ender_golem")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ignited_revenant")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/coralssus")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/amethyst_crab")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ender_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/ignis")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/netherite_monstrosity")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/the_harbinger")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.STAR.get()));
        add("starmaterial_from_cataclysm_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("cataclysm:/entities/the_leviathan")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.STAR.get()));
        // ==========================================================================================
        add("material_from_betterstrongholds_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/armoury")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/common")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/crypt")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/grand_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/library_md")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/mess")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/prison_lg")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/trap")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_betterstrongholds_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/library_md")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_betterstrongholds_10", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/armoury")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_betterstrongholds_11", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/mess")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));

        add("material_from_betterstrongholds_12", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/grand_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_betterstrongholds_13", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/crypt")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_betterstrongholds_14", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));

        add("weapon_from_betterstrongholds_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/prison_lg")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("weapon_from_betterstrongholds_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("normal_weapon_from_betterstrongholds_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/common")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("normal_weapon_from_betterstrongholds_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/prison_lg")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("normal_weapon_from_betterstrongholds_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/grand_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("normal_weapon_from_betterstrongholds_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/crypt")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SPARE.get()));
        add("normal_weapon_from_betterstrongholds_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/library_md")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SPARE.get()));
        add("normal_weapon_from_betterstrongholds_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betterstrongholds:/chests/mess")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SPARE.get()));
        //==========================================================================================
        add("material_from_betteroceanmonuments_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betteroceanmonuments:/chests/upper_side_chamber")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.STAR.get()));
        add("material_from_betteroceanmonuments_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betteroceanmonuments:/chests/upper_side_chamber")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_betteroceanmonuments_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("betteroceanmonuments:/chests/upper_side_chamber")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.ROUND_SWORD.get()));
        //============================================================================================
        add("material_from_wda_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/abandoned_temple/abandoned_temple_top")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_wda_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/abandoned_temple/abandoned_temple_top")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/abandoned_temple/abandoned_temple_entrance")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/abandoned_temple/abandoned_temple_map")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/aviary/aviary_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/aviary/aviary_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/aviary/aviary_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/aviary/aviary_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_wda_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bandit_towers/bandit_towers_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_10", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bandit_towers/bandit_towers_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_11", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bandit_towers/bandit_towers_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_12", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bandit_towers/bandit_towers_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_wda_13", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bathhouse/bathhouse_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_14", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bathhouse/bathhouse_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_15", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bathhouse/bathhouse_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_16", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/foundry/foundry_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_17", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/foundry/foundry_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_18", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/foundry/foundry_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_19", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/foundry/foundry_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_wda_20", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/greenwood_pub/greenwood_pub_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_21", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/greenwood_pub/greenwood_pub_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_22", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/greenwood_pub/greenwood_pub_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_23", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_challenger/heavenly_challenger_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_24", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_challenger/heavenly_challenger_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_25", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_challenger/heavenly_challenger_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_26", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_challenger/heavenly_challenger_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_from_wda_27", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_conqueror/heavenly_conqueror_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_from_wda_28", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_conqueror/heavenly_conqueror_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_from_wda_29", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_conqueror/heavenly_conqueror_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_from_wda_30", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_conqueror/heavenly_conqueror_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_heavenly_rider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_rider/heavenly_rider_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_heavenly_rider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_rider/heavenly_rider_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_heavenly_rider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_rider/heavenly_rider_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_heavenly_rider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_rider/heavenly_rider_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_illager_fort", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/illager_fort/illager_fort_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_illager_fort", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/illager_fort/illager_fort_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_illager_fort", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/illager_fort/illager_fort_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_illager_fort", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/illager_fort/illager_fort_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_infested_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/infested_temple/infested_temple_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_infested_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/infested_temple/infested_temple_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_infested_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/infested_temple/infested_temple_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_infested_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/infested_temple/infested_temple_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_jungle_tree_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/jungle_tree_house/jungle_tree_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_jungle_tree_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/jungle_tree_house/jungle_tree_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_jungle_tree_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/jungle_tree_house/jungle_tree_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_jungle_tree_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/jungle_tree_house/jungle_tree_house_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));

        add("material_s_from_wda_keep_kayra", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/keep_kayra/keep_kayra_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_keep_kayra", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/keep_kayra/keep_kayra_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_keep_kayra", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/keep_kayra/keep_kayra_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_keep_kayra", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/keep_kayra/keep_kayra_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_mechanical_nest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mechanical_nest/mechanical_nest_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_mechanical_nest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mechanical_nest/mechanical_nest_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_mechanical_nest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mechanical_nest/mechanical_nest_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_mechanical_nest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mechanical_nest/mechanical_nest_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_mushroom_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_house/mushroom_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_mushroom_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_house/mushroom_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_mushroom_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_house/mushroom_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_mushroom_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_house/mushroom_house_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_plague_asylum", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/plague_asylum/plague_asylum_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_plague_asylum", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/plague_asylum/plague_asylum_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_plague_asylum", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/plague_asylum/plague_asylum_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_plague_asylum", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/plague_asylum/plague_asylum_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_scorched_mines", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/scorched_mines/scorched_mines_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_scorched_mines", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/scorched_mines/scorched_mines_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_scorched_mines", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/scorched_mines/scorched_mines_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_scorched_mines", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/scorched_mines/scorched_mines_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_shiraz_palace", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/shiraz_palace/shiraz_palace_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_shiraz_palace", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/shiraz_palace/shiraz_palace_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_shiraz_palace", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/shiraz_palace/shiraz_palace_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_shiraz_palace", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/shiraz_palace/shiraz_palace_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("material_s_from_wda_small_prairie_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/small_prairie_house/small_prairie_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("material_l_from_wda_small_prairie_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/small_prairie_house/small_prairie_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("material_b_from_wda_small_prairie_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/small_prairie_house/small_prairie_house_normal")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("material_a_from_wda_small_prairie_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/small_prairie_house/small_prairie_house_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));

        add("weapon_from_wda_1", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/abandoned_temple/abandoned_temple_top")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("material_from_wda_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/aviary/aviary_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_2", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/aviary/aviary_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        add("material_from_wda_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bandit_towers/bandit_towers_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_3", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/bandit_towers/bandit_towers_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.FLINT_HAND.get()));
        add("material_from_wda_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/ceryneian_hind/ceryneian_hind_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_4", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/ceryneian_hind/ceryneian_hind_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.TOTEM_SWORD.get()));
        add("material_from_wda_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/foundry/foundry_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_5", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/foundry/foundry_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));
        add("material_from_wda_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_challenger/heavenly_challenger_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_6", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_challenger/heavenly_challenger_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.DRAGON_TEAR.get()));
        add("material_from_wda_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_conqueror/heavenly_conqueror_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_7", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_conqueror/heavenly_conqueror_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.DRAGON_TEAR.get()));
        add("material_from_wda_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_rider/heavenly_rider_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("weapon_from_wda_8", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/heavenly_rider/heavenly_rider_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.DRAGON_TEAR.get()));
        add("weapon_from_wda_9", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/undead_pirate_ship/undead_pirate_ship_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.LAVA_SWORD.get()));
        add("weapon_from_wda_10", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/shiraz_palace/shiraz_palace_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.WITHER_SWORD.get()));
        add("weapon_from_wda_11", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/scorched_mines/scorched_mines_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.KING_AXE.get()));
        add("weapon_from_wda_12", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/plague_asylum/plague_asylum_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.STORM_AXE.get()));
        add("weapon_from_wda_13", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_house/mushroom_house_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build(),
        }, ModItems.BIG_FIRED_CHICKEN.get()));
        add("weapon_from_wda_14", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_mines/mushroom_mines_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build(),
        }, ModItems.GOLDEN_SPEAR.get()));
        add("weapon_from_wda_15", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/mushroom_village/mushroom_village_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.BAMBOO_SWORD.get()));
        add("weapon_from_wda_15", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/thornborn_towers/thornborn_towers_top_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.LANTERN_SWORD.get()));
        add("weapon_from_wda_16", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("dungeons_arise:chests/lighthouse/lighthouse_top")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build(),
        }, ModItems.LANTERN_SWORD.get()));

        //================================================================================

        add("broken_star_small_from_village_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_fisher", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fisher")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_village_mason", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_mason")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_village_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_village_plains_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_village_savanna_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_village_taiga_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_woodland_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));

        add("broken_star_small_from_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_zombie_villager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie_villager")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_spider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));

        
        add("broken_star_long_from_village", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_village_armorer", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_fisher", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fisher")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_village_mason", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_mason")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_village_toolsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_village_plains_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_village_savanna_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_village_taiga_house", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_woodland_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));

        add("broken_star_long_from_wither_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither_skeleton")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_witch", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/witch")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_piglin_brute", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin_brute")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_ravager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ravager")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_vindicator", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/vindicator")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_long_from_blaze", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/blaze")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));


        add("broken_star_big_from_end_city_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_ancient_city", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_desert_pyramid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_stronghold_library", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_jungle_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("broken_star_big_from_woodland_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));

        add("star_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.STAR.get()));
        add("star_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.STAR.get()));
        add("star_from_bastion_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build()
        }, ModItems.STAR.get()));
        add("star_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build()
        }, ModItems.STAR.get()));
        add("star_from_bastion_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build()
        }, ModItems.STAR.get()));

        add("mystery_amethyst_from_armorer_gift", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/hero_of_the_village/armorer_gift")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_elder_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_wither", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_ender_dragon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_bastion_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_bastion_bridge", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));

        // LEGENDARY WEAPON=======================================

        add("effected_sword_from_ancient_city", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.EFFECTED_SWORD.get()));

        add("totem_sword_from_village_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.TOTEM_SWORD.get()));
        add("totem_sword_from_village_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.TOTEM_SWORD.get()));

        add("samon_sword_from_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.SAMON_SWORD.get()));

        add("knight_hornor_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        add("knight_hornor_from_underwater_ruin_small", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));


        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.HORN_OF_GOAT.get()));


        add("meat_knife_from_pillager_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("meat_knife_from_jungle_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("meat_knife_from_ruined_portal", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.MEAT_KNIFE.get()));


        add("soul_fire_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("soul_fire_from_bastion_other", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("soul_fire_from_ancient_city_ice_box", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure_ice_box")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.SOUL_FIRE.get()));


        add("dragon_tear_from_end_city_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.DRAGON_TEAR.get()));

        add("camp_fire_sword_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("camp_fire_sword_from_igloo_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));

        add("round_sword_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.ROUND_SWORD.get()));
        add("round_sword_from_shipwreck_map", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.ROUND_SWORD.get()));
        add("round_sword_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.ROUND_SWORD.get()));

        add("lava_sword_from_ruined_portal", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.LAVA_SWORD.get()));

        add("storm_axe_from_desert_pyramid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.STORM_AXE.get()));

        add("flint_hand_from_stronghold_corridor", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.FLINT_HAND.get()));
        add("king_axe_from_woodland_mansion", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.KING_AXE.get()));
        add("bamboo_sword_from_simple_dungeon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.BAMBOO_SWORD.get()));
        add("lantern_sword_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build(),
        }, ModItems.LANTERN_SWORD.get()));

        add("big_fired_chicken_from_chicken", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/chicken")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build(),
        }, ModItems.BIG_FIRED_CHICKEN.get()));

        add("golden_spear_from_elder_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build(),
        }, ModItems.GOLDEN_SPEAR.get()));

        add("wither_sword_from_wither", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build(),
        }, ModItems.WITHER_SWORD.get()));

        add("shaped_amethyst_from_buried_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));
        add("shaped_amethyst_from_simple_dungeon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));


        // NORMAL WEAPON =====================================================================

        add("iron_blade_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("iron_blade_from_simple_dungeon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.IRON_BLADE.get()));

        add("iron_sickle_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("iron_sickle_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build(),
        }, ModItems.IRON_SICKLE.get()));

    }
}

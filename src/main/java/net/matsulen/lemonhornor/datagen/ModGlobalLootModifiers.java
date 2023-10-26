package net.matsulen.lemonhornor.datagen;

import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.item.ModItems;
import net.matsulen.lemonhornor.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiers extends GlobalLootModifierProvider {
    public ModGlobalLootModifiers(PackOutput output) {
        super(output, LemonHornor.MOD_ID);
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
        add("broken_star_small_from_village", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_butcher")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_snowy_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_SMALL.get()));
        add("broken_star_small_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie_villager")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/slime")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build(),
                LootItemRandomChanceCondition.randomChance(0.02f).build()
        }, ModItems.BROKEN_STAR_SMALL.get()));


        add("broken_star_long_from_village", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_butcher")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_snowy_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.03f).build(),
        }, ModItems.BROKEN_STAR_LONG.get()));

        add("broken_star_long_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither_skeleton")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/witch")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/piglin_brute")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ravager")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/vindicator")).build(),
                LootItemRandomChanceCondition.randomChance(0.02f).build()
        }, ModItems.BROKEN_STAR_LONG.get()));
        add("broken_star_big_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.BROKEN_STAR_BIG.get()));
        add("star_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.STAR.get()));

        // LEGENDARY WEAPON=======================================

        add("effected_sword_from_ancient_city", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build(),
        }, ModItems.EFFECTED_SWORD.get()));

        add("totem_sword_from_village_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.TOTEM_SWORD.get()));
        add("totem_sword_from_village_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.TOTEM_SWORD.get()));

        add("samon_sword_from_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SAMON_SWORD.get()));

        add("knight_hornor_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        add("knight_hornor_from_underwater_ruin_small", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build(),
               new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("meat_knife_from_pillager_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("meat_knife_from_jungle_temples", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temples")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("soul_fire_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("soul_fire_from_bastion_other", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("soul_fire_from_ancient_city_ice_box", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure_ice_box")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("dragon_tear_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.DRAGON_TEAR.get()));
        add("camp_fire_sword_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("camp_fire_sword_from_jungle_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("round_sword_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
        }, ModItems.ROUND_SWORD.get()));
        add("shaped_amethyst_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));
        add("shaped_amethyst_from_chest_rare", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));


        // NORMAL WEAPON =====================================================================

        add("iron_blade_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_BLADE.get()));

        add("iron_sickle_from_jungle_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.2f).build(),
        }, ModItems.IRON_SICKLE.get()));

    }
}

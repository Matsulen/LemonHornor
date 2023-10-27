package net.matsulen.lemonhornor.datagen;

import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.item.ModItems;
import net.matsulen.lemonhornor.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
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


        add("star_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.STAR.get()));
        add("star_from_entities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wither")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.STAR.get()));

        add("mystery_amethyst_from_armorer_gift", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/hero_of_the_village/armorer_gift")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));
        add("mystery_amethyst_from_elder_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/elder_guardian")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()
        }, ModItems.MYSTERY_AMETHYST.get()));

        // LEGENDARY WEAPON=======================================

        add("effected_sword_from_ancient_city", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.EFFECTED_SWORD.get()));

        add("totem_sword_from_village_weaponsmith", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.TOTEM_SWORD.get()));
        add("totem_sword_from_village_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.TOTEM_SWORD.get()));

        add("samon_sword_from_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.SAMON_SWORD.get()));

        add("knight_hornor_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));
        add("knight_hornor_from_underwater_ruin_small", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.KNIGHT_HORNOR.get()));


        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.HORN_OF_GOAT.get()));
        add("horn_of_goat_from_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.HORN_OF_GOAT.get()));


        add("meat_knife_from_pillager_outpost", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("meat_knife_from_jungle_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.MEAT_KNIFE.get()));
        add("meat_knife_from_ruined_portal", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.MEAT_KNIFE.get()));


        add("soul_fire_from_bastion_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("soul_fire_from_bastion_other", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.SOUL_FIRE.get()));
        add("soul_fire_from_ancient_city_ice_box", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure_ice_box")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.SOUL_FIRE.get()));


        add("dragon_tear_from_end_city_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build(),
        }, ModItems.DRAGON_TEAR.get()));

        add("camp_fire_sword_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));
        add("camp_fire_sword_from_igloo_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build(),
        }, ModItems.CAMP_FIRE_SWORD.get()));

        add("round_sword_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.ROUND_SWORD.get()));
        add("round_sword_from_shipwreck_map", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.ROUND_SWORD.get()));
        add("round_sword_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.ROUND_SWORD.get()));



        add("shaped_amethyst_from_buried_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));
        add("shaped_amethyst_from_simple_dungeon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build(),
        }, ModItems.SHAPED_AMETHYST.get()));


        // NORMAL WEAPON =====================================================================

        add("iron_blade_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build(),
        }, ModItems.IRON_BLADE.get()));
        add("iron_blade_from_simple_dungeon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build(),
        }, ModItems.IRON_BLADE.get()));

        add("iron_sickle_from_shipwreck_supply", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build(),
        }, ModItems.IRON_SICKLE.get()));
        add("iron_sickle_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build(),
        }, ModItems.IRON_SICKLE.get()));

    }
}

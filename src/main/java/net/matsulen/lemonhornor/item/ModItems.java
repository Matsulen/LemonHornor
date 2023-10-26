package net.matsulen.lemonhornor.item;


import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LemonHornor.MOD_ID);

    public static final RegistryObject<Item> BROKEN_STAR_SMALL = ITEMS.register("broken_star_small",
            () -> new StarItem(new Item.Properties()));
    public static final RegistryObject<Item> BROKEN_STAR_LONG = ITEMS.register("broken_star_long",
            () -> new StarItem(new Item.Properties()));
    public static final RegistryObject<Item> BROKEN_STAR_BIG = ITEMS.register("broken_star_big",
            () -> new StarItem(new Item.Properties()));
    public static final RegistryObject<Item> STAR = ITEMS.register("star",
            () -> new StarItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MYSTERY_AMETHYST = ITEMS.register("mystery_amethyst",
            () -> new AmethystItem(new Item.Properties().stacksTo(5)));
    public static final RegistryObject<Item> MYSTERY_PLATE = ITEMS.register("mystery_plate",
            () -> new AmethystItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SMITHING_HAMMER = ITEMS.register("smithing_hammer",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle",
            () -> new IronSickleItem(ModToolTiers.Evolve, 4,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_1 = ITEMS.register("iron_sickle_1",
            () -> new IronSickleItem(ModToolTiers.Evolve, 5,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_2 = ITEMS.register("iron_sickle_2",
            () -> new IronSickleItem(ModToolTiers.Evolve, 6,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_3 = ITEMS.register("iron_sickle_3",
            () -> new IronSickleItem(ModToolTiers.Evolve, 8,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_4 = ITEMS.register("iron_sickle_4",
            () -> new IronSickleItem(ModToolTiers.Evolve, 10,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_5 = ITEMS.register("iron_sickle_5",
            () -> new IronSickleItem(ModToolTiers.Evolve, 12,-2.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_6 = ITEMS.register("iron_sickle_6",
            () -> new IronSickleItem(ModToolTiers.Evolve, 15,-2.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_7 = ITEMS.register("iron_sickle_7",
            () -> new IronSickleItem(ModToolTiers.Evolve, 18,-2.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_8 = ITEMS.register("iron_sickle_8",
            () -> new IronSickleItem(ModToolTiers.Evolve, 21,-2.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_9 = ITEMS.register("iron_sickle_9",
            () -> new IronSickleItem(ModToolTiers.Evolve, 24,-2.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE_10 = ITEMS.register("iron_sickle_10",
            () -> new IronSickleItem(ModToolTiers.Evolve, 26,-2.2f
                    , new Item.Properties()));

    public static final RegistryObject<Item> IRON_BLADE = ITEMS.register("iron_blade",
            () -> new IronBladeItem(ModToolTiers.Evolve, 2,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_1 = ITEMS.register("iron_blade_1",
            () -> new IronBladeItem(ModToolTiers.Evolve, 3,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_2 = ITEMS.register("iron_blade_2",
            () -> new IronBladeItem(ModToolTiers.Evolve, 4,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_3 = ITEMS.register("iron_blade_3",
            () -> new IronBladeItem(ModToolTiers.Evolve, 7,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_4 = ITEMS.register("iron_blade_4",
            () -> new IronBladeItem(ModToolTiers.Evolve, 9,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_5 = ITEMS.register("iron_blade_5",
            () -> new IronBladeItem(ModToolTiers.Evolve, 12,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_6 = ITEMS.register("iron_blade_6",
            () -> new IronBladeItem(ModToolTiers.Evolve, 15,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_7 = ITEMS.register("iron_blade_7",
            () -> new IronBladeItem(ModToolTiers.Evolve, 18,-2.2f
                    , new Item.Properties()));

    public static final RegistryObject<Item> IRON_BLADE_8 = ITEMS.register("iron_blade_8",
            () -> new IronBladeItem(ModToolTiers.Evolve, 21,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_9 = ITEMS.register("iron_blade_9",
            () -> new IronBladeItem(ModToolTiers.Evolve, 23,-2.0f
                    , new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE_10 = ITEMS.register("iron_blade_10",
            () -> new IronBladeItem(ModToolTiers.Evolve, 24,-1.8f
                    , new Item.Properties()));

    public static final RegistryObject<Item> CAMP_FIRE_SWORD = ITEMS.register("camp_fire_sword",
            () -> new CampFireSwordItem(ModToolTiers.Evolve, 3,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> CAMP_FIRE_SWORD_1 = ITEMS.register("camp_fire_sword_1",
            () -> new CampFireSwordItem(ModToolTiers.Evolve, 7,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> CAMP_FIRE_SWORD_2 = ITEMS.register("camp_fire_sword_2",
            () -> new CampFireSwordItem(ModToolTiers.Evolve, 11,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> CAMP_FIRE_SWORD_3 = ITEMS.register("camp_fire_sword_3",
            () -> new CampFireSwordItem(ModToolTiers.Evolve, 16,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> CAMP_FIRE_SWORD_4 = ITEMS.register("camp_fire_sword_4",
            () -> new CampFireSwordItem(ModToolTiers.Evolve, 21,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> CAMP_FIRE_SWORD_5 = ITEMS.register("camp_fire_sword_5",
            () -> new CampFireSwordItem(ModToolTiers.Evolve, 24,-1.5f
                    , new Item.Properties()));

    public static final RegistryObject<Item> DRAGON_TEAR = ITEMS.register("dragon_tear",
            () -> new DragonTearItem(ModToolTiers.Evolve, 2,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_TEAR_1 = ITEMS.register("dragon_tear_1",
            () -> new DragonTearItem(ModToolTiers.Evolve, 6,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_TEAR_2 = ITEMS.register("dragon_tear_2",
            () -> new DragonTearItem(ModToolTiers.Evolve, 10,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_TEAR_3 = ITEMS.register("dragon_tear_3",
            () -> new DragonTearItem(ModToolTiers.Evolve, 16,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_TEAR_4 = ITEMS.register("dragon_tear_4",
            () -> new DragonTearItem(ModToolTiers.Evolve, 21,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_TEAR_5 = ITEMS.register("dragon_tear_5",
            () -> new DragonTearItem(ModToolTiers.Evolve, 27,-2.2f
                    , new Item.Properties()));

    public static final RegistryObject<Item> SOUL_FIRE = ITEMS.register("soul_fire",
            () -> new SoulFireItem(ModToolTiers.Evolve, 3,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIRE_1 = ITEMS.register("soul_fire_1",
            () -> new SoulFireItem(ModToolTiers.Evolve, 7,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIRE_2 = ITEMS.register("soul_fire_2",
            () -> new SoulFireItem(ModToolTiers.Evolve, 11,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIRE_3 = ITEMS.register("soul_fire_3",
            () -> new SoulFireItem(ModToolTiers.Evolve, 16,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIRE_4 = ITEMS.register("soul_fire_4",
            () -> new SoulFireItem(ModToolTiers.Evolve, 20,-1.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIRE_5 = ITEMS.register("soul_fire_5",
            () -> new SoulFireItem(ModToolTiers.Evolve, 24,-1.5f
                    , new Item.Properties()));

    public static final RegistryObject<Item> MEAT_KNIFE = ITEMS.register("meat_knife",
            () -> new MeatKnifeItem(ModToolTiers.Evolve, 9,-3.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> MEAT_KNIFE_1 = ITEMS.register("meat_knife_1",
            () -> new MeatKnifeItem(ModToolTiers.Evolve, 15,-3.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> MEAT_KNIFE_2 = ITEMS.register("meat_knife_2",
            () -> new MeatKnifeItem(ModToolTiers.Evolve, 21,-3.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> MEAT_KNIFE_3 = ITEMS.register("meat_knife_3",
            () -> new MeatKnifeItem(ModToolTiers.Evolve, 27,-3.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> MEAT_KNIFE_4 = ITEMS.register("meat_knife_4",
            () -> new MeatKnifeItem(ModToolTiers.Evolve, 32,-3.5f
                    , new Item.Properties()));
    public static final RegistryObject<Item> MEAT_KNIFE_5 = ITEMS.register("meat_knife_5",
            () -> new MeatKnifeItem(ModToolTiers.Evolve, 38,-3.5f
                    , new Item.Properties()));

    public static final RegistryObject<Item> HORN_OF_GOAT = ITEMS.register("horn_of_goat",
            () -> new HornOfGoatItem(ModToolTiers.Evolve, 11,-3.65f
                    , new Item.Properties()));
    public static final RegistryObject<Item> HORN_OF_GOAT_1 = ITEMS.register("horn_of_goat_1",
            () -> new HornOfGoatItem(ModToolTiers.Evolve, 19,-3.65f
                    , new Item.Properties()));
    public static final RegistryObject<Item> HORN_OF_GOAT_2 = ITEMS.register("horn_of_goat_2",
            () -> new HornOfGoatItem(ModToolTiers.Evolve, 26,-3.65f
                    , new Item.Properties()));
    public static final RegistryObject<Item> HORN_OF_GOAT_3 = ITEMS.register("horn_of_goat_3",
            () -> new HornOfGoatItem(ModToolTiers.Evolve, 32,-3.65f
                    , new Item.Properties()));
    public static final RegistryObject<Item> HORN_OF_GOAT_4 = ITEMS.register("horn_of_goat_4",
            () -> new HornOfGoatItem(ModToolTiers.Evolve, 38,-3.65f
                    , new Item.Properties()));
    public static final RegistryObject<Item> HORN_OF_GOAT_5 = ITEMS.register("horn_of_goat_5",
            () -> new HornOfGoatItem(ModToolTiers.Evolve, 45,-3.6f
                    , new Item.Properties()));

    public static final RegistryObject<Item> EFFECTED_SWORD = ITEMS.register("effected_sword",
            () -> new EffectedSwordItem(ModToolTiers.Evolve, 2,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> EFFECTED_SWORD_1 = ITEMS.register("effected_sword_1",
            () -> new EffectedSwordItem(ModToolTiers.Evolve, 6,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> EFFECTED_SWORD_2 = ITEMS.register("effected_sword_2",
            () -> new EffectedSwordItem(ModToolTiers.Evolve, 10,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> EFFECTED_SWORD_3 = ITEMS.register("effected_sword_3",
            () -> new EffectedSwordItem(ModToolTiers.Evolve, 15,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> EFFECTED_SWORD_4 = ITEMS.register("effected_sword_4",
            () -> new EffectedSwordItem(ModToolTiers.Evolve, 20,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> EFFECTED_SWORD_5 = ITEMS.register("effected_sword_5",
            () -> new EffectedSwordItem(ModToolTiers.Evolve, 25,-2.4f
                    , new Item.Properties()));

    public static final RegistryObject<Item> KNIGHT_HORNOR = ITEMS.register("knight_hornor",
            () -> new KnightHornorItem(ModToolTiers.Evolve, 3,-2.7f
                    , new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_HORNOR_1 = ITEMS.register("knight_hornor_1",
            () -> new KnightHornorItem(ModToolTiers.Evolve, 7,-2.7f
                    , new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_HORNOR_2 = ITEMS.register("knight_hornor_2",
            () -> new KnightHornorItem(ModToolTiers.Evolve, 11,-2.7f
                    , new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_HORNOR_3 = ITEMS.register("knight_hornor_3",
            () -> new KnightHornorItem(ModToolTiers.Evolve, 16,-2.7f
                    , new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_HORNOR_4 = ITEMS.register("knight_hornor_4",
            () -> new KnightHornorItem(ModToolTiers.Evolve, 21,-2.7f
                    , new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_HORNOR_5 = ITEMS.register("knight_hornor_5",
            () -> new KnightHornorItem(ModToolTiers.Evolve, 26,-2.7f
                    , new Item.Properties()));

    public static final RegistryObject<Item> SAMON_SWORD = ITEMS.register("samon_sword",
            () -> new SamonSwordItem(ModToolTiers.Evolve, 2,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SAMON_SWORD_1 = ITEMS.register("samon_sword_1",
            () -> new SamonSwordItem(ModToolTiers.Evolve, 6,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SAMON_SWORD_2 = ITEMS.register("samon_sword_2",
            () -> new SamonSwordItem(ModToolTiers.Evolve, 10,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SAMON_SWORD_3 = ITEMS.register("samon_sword_3",
            () -> new SamonSwordItem(ModToolTiers.Evolve, 15,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SAMON_SWORD_4 = ITEMS.register("samon_sword_4",
            () -> new SamonSwordItem(ModToolTiers.Evolve, 19,-2.2f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SAMON_SWORD_5 = ITEMS.register("samon_sword_5",
            () -> new SamonSwordItem(ModToolTiers.Evolve, 25,-2.2f
                    , new Item.Properties()));

    public static final RegistryObject<Item> TOTEM_SWORD = ITEMS.register("totem_sword",
            () -> new TotemSwordItem(ModToolTiers.Totem, 1,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_SWORD_1 = ITEMS.register("totem_sword_1",
            () -> new TotemSwordItem(ModToolTiers.Totem, 5,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_SWORD_2 = ITEMS.register("totem_sword_2",
            () -> new TotemSwordItem(ModToolTiers.Totem, 9,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_SWORD_3 = ITEMS.register("totem_sword_3",
            () -> new TotemSwordItem(ModToolTiers.Totem, 14,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_SWORD_4 = ITEMS.register("totem_sword_4",
            () -> new TotemSwordItem(ModToolTiers.Totem, 19,-2.4f
                    , new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_SWORD_5 = ITEMS.register("totem_sword_5",
            () -> new TotemSwordItem(ModToolTiers.Totem, 23,-2.4f
                    , new Item.Properties()));

    public static final RegistryObject<Item> ROUND_SWORD = ITEMS.register("round_sword",
            () -> new RoundSwordItem(ModToolTiers.Evolve, 4,-3f
                    , new Item.Properties()));
    public static final RegistryObject<Item> ROUND_SWORD_1 = ITEMS.register("round_sword_1",
            () -> new RoundSwordItem(ModToolTiers.Evolve, 8,-3f
                    , new Item.Properties()));
    public static final RegistryObject<Item> ROUND_SWORD_2 = ITEMS.register("round_sword_2",
            () -> new RoundSwordItem(ModToolTiers.Evolve, 12,-3f
                    , new Item.Properties()));
    public static final RegistryObject<Item> ROUND_SWORD_3 = ITEMS.register("round_sword_3",
            () -> new RoundSwordItem(ModToolTiers.Evolve, 17,-3f
                    , new Item.Properties()));
    public static final RegistryObject<Item> ROUND_SWORD_4 = ITEMS.register("round_sword_4",
            () -> new RoundSwordItem(ModToolTiers.Evolve, 22,-3f
                    , new Item.Properties()));
    public static final RegistryObject<Item> ROUND_SWORD_5 = ITEMS.register("round_sword_5",
            () -> new RoundSwordItem(ModToolTiers.Evolve, 28,-3f
                    , new Item.Properties()));

    public static final RegistryObject<Item> SHAPED_AMETHYST = ITEMS.register("shaped_amethyst",
            () -> new ShapedAmethystItem(ModToolTiers.Evolve, 2,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SHAPED_AMETHYST_1 = ITEMS.register("shaped_amethyst_1",
            () -> new ShapedAmethystItem(ModToolTiers.Evolve, 6,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SHAPED_AMETHYST_2 = ITEMS.register("shaped_amethyst_2",
            () -> new ShapedAmethystItem(ModToolTiers.Evolve, 10,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SHAPED_AMETHYST_3 = ITEMS.register("shaped_amethyst_3",
            () -> new ShapedAmethystItem(ModToolTiers.Evolve, 15,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SHAPED_AMETHYST_4 = ITEMS.register("shaped_amethyst_4",
            () -> new ShapedAmethystItem(ModToolTiers.Evolve, 20,-2.8f
                    , new Item.Properties()));
    public static final RegistryObject<Item> SHAPED_AMETHYST_5 = ITEMS.register("shaped_amethyst_5",
            () -> new ShapedAmethystItem(ModToolTiers.Evolve, 24,-2.8f
                    , new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

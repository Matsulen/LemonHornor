package net.matsulen.lemonhornor.item;


import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LemonHornor.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEMON_KINDOM_ITEM = CREATIVE_MODE_TABS.register("lemon_kindom_item",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MYSTERY_AMETHYST.get()))
                    .title(Component.translatable("creativetab.lemon_kindom_item"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SMITHING_HAMMER.get());
                        pOutput.accept(ModBlocks.EVOLVE_ANVIL.get());

                        pOutput.accept(ModItems.BROKEN_STAR_SMALL.get());
                        pOutput.accept(ModItems.BROKEN_STAR_LONG.get());
                        pOutput.accept(ModItems.BROKEN_STAR_BIG.get());
                        pOutput.accept(ModItems.STAR.get());

                        pOutput.accept(ModItems.MYSTERY_AMETHYST.get());
                        pOutput.accept(ModItems.MYSTERY_PLATE.get());

                        pOutput.accept(ModItems.KNIGHT_HELMET.get());
                        pOutput.accept(ModItems.KNIGHT_CHESTPLATE.get());
                        pOutput.accept(ModItems.KNIGHT_LEGGINGS.get());
                        pOutput.accept(ModItems.KNIGHT_BOOTS.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> LEMON_KINDOM_WEAPON = CREATIVE_MODE_TABS.register("lemon_kindom_weapon",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CAMP_FIRE_SWORD.get()))
                    .title(Component.translatable("creativetab.lemon_kindom_weapon"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.IRON_SICKLE.get());
                        pOutput.accept(ModItems.IRON_SICKLE_1.get());
                        pOutput.accept(ModItems.IRON_SICKLE_2.get());
                        pOutput.accept(ModItems.IRON_SICKLE_3.get());
                        pOutput.accept(ModItems.IRON_SICKLE_4.get());
                        pOutput.accept(ModItems.IRON_SICKLE_5.get());
                        pOutput.accept(ModItems.IRON_SICKLE_6.get());
                        pOutput.accept(ModItems.IRON_SICKLE_7.get());
                        pOutput.accept(ModItems.IRON_SICKLE_8.get());
                        pOutput.accept(ModItems.IRON_SICKLE_9.get());
                        pOutput.accept(ModItems.IRON_SICKLE_10.get());

                        pOutput.accept(ModItems.IRON_BLADE.get());
                        pOutput.accept(ModItems.IRON_BLADE_1.get());
                        pOutput.accept(ModItems.IRON_BLADE_2.get());
                        pOutput.accept(ModItems.IRON_BLADE_3.get());
                        pOutput.accept(ModItems.IRON_BLADE_4.get());
                        pOutput.accept(ModItems.IRON_BLADE_5.get());
                        pOutput.accept(ModItems.IRON_BLADE_6.get());
                        pOutput.accept(ModItems.IRON_BLADE_7.get());
                        pOutput.accept(ModItems.IRON_BLADE_8.get());
                        pOutput.accept(ModItems.IRON_BLADE_9.get());
                        pOutput.accept(ModItems.IRON_BLADE_10.get());

                        pOutput.accept(ModItems.BAYSWORD.get());
                        pOutput.accept(ModItems.BAYSWORD_1.get());
                        pOutput.accept(ModItems.BAYSWORD_2.get());
                        pOutput.accept(ModItems.BAYSWORD_3.get());
                        pOutput.accept(ModItems.BAYSWORD_4.get());
                        pOutput.accept(ModItems.BAYSWORD_5.get());
                        pOutput.accept(ModItems.BAYSWORD_6.get());
                        pOutput.accept(ModItems.BAYSWORD_7.get());
                        pOutput.accept(ModItems.BAYSWORD_8.get());
                        pOutput.accept(ModItems.BAYSWORD_9.get());
                        pOutput.accept(ModItems.BAYSWORD_10.get());

                        pOutput.accept(ModItems.SPARE.get());
                        pOutput.accept(ModItems.SPARE_1.get());
                        pOutput.accept(ModItems.SPARE_2.get());
                        pOutput.accept(ModItems.SPARE_3.get());
                        pOutput.accept(ModItems.SPARE_4.get());
                        pOutput.accept(ModItems.SPARE_5.get());
                        pOutput.accept(ModItems.SPARE_6.get());
                        pOutput.accept(ModItems.SPARE_7.get());
                        pOutput.accept(ModItems.SPARE_8.get());
                        pOutput.accept(ModItems.SPARE_9.get());
                        pOutput.accept(ModItems.SPARE_10.get());

                        pOutput.accept(ModItems.CAMP_FIRE_SWORD.get());
                        pOutput.accept(ModItems.CAMP_FIRE_SWORD_1.get());
                        pOutput.accept(ModItems.CAMP_FIRE_SWORD_2.get());
                        pOutput.accept(ModItems.CAMP_FIRE_SWORD_3.get());
                        pOutput.accept(ModItems.CAMP_FIRE_SWORD_4.get());
                        pOutput.accept(ModItems.CAMP_FIRE_SWORD_5.get());

                        pOutput.accept(ModItems.DRAGON_TEAR.get());
                        pOutput.accept(ModItems.DRAGON_TEAR_1.get());
                        pOutput.accept(ModItems.DRAGON_TEAR_2.get());
                        pOutput.accept(ModItems.DRAGON_TEAR_3.get());
                        pOutput.accept(ModItems.DRAGON_TEAR_4.get());
                        pOutput.accept(ModItems.DRAGON_TEAR_5.get());

                        pOutput.accept(ModItems.SOUL_FIRE.get());
                        pOutput.accept(ModItems.SOUL_FIRE_1.get());
                        pOutput.accept(ModItems.SOUL_FIRE_2.get());
                        pOutput.accept(ModItems.SOUL_FIRE_3.get());
                        pOutput.accept(ModItems.SOUL_FIRE_4.get());
                        pOutput.accept(ModItems.SOUL_FIRE_5.get());

                        pOutput.accept(ModItems.MEAT_KNIFE.get());
                        pOutput.accept(ModItems.MEAT_KNIFE_1.get());
                        pOutput.accept(ModItems.MEAT_KNIFE_2.get());
                        pOutput.accept(ModItems.MEAT_KNIFE_3.get());
                        pOutput.accept(ModItems.MEAT_KNIFE_4.get());
                        pOutput.accept(ModItems.MEAT_KNIFE_5.get());

                        pOutput.accept(ModItems.HORN_OF_GOAT.get());
                        pOutput.accept(ModItems.HORN_OF_GOAT_1.get());
                        pOutput.accept(ModItems.HORN_OF_GOAT_2.get());
                        pOutput.accept(ModItems.HORN_OF_GOAT_3.get());
                        pOutput.accept(ModItems.HORN_OF_GOAT_4.get());
                        pOutput.accept(ModItems.HORN_OF_GOAT_5.get());
                        
                        pOutput.accept(ModItems.EFFECTED_SWORD.get());
                        pOutput.accept(ModItems.EFFECTED_SWORD_1.get());
                        pOutput.accept(ModItems.EFFECTED_SWORD_2.get());
                        pOutput.accept(ModItems.EFFECTED_SWORD_3.get());
                        pOutput.accept(ModItems.EFFECTED_SWORD_4.get());
                        pOutput.accept(ModItems.EFFECTED_SWORD_5.get());
                        
                        pOutput.accept(ModItems.KNIGHT_HORNOR.get());
                        pOutput.accept(ModItems.KNIGHT_HORNOR_1.get());
                        pOutput.accept(ModItems.KNIGHT_HORNOR_2.get());
                        pOutput.accept(ModItems.KNIGHT_HORNOR_3.get());
                        pOutput.accept(ModItems.KNIGHT_HORNOR_4.get());
                        pOutput.accept(ModItems.KNIGHT_HORNOR_5.get());
                        
                        pOutput.accept(ModItems.SAMON_SWORD.get());
                        pOutput.accept(ModItems.SAMON_SWORD_1.get());
                        pOutput.accept(ModItems.SAMON_SWORD_2.get());
                        pOutput.accept(ModItems.SAMON_SWORD_3.get());
                        pOutput.accept(ModItems.SAMON_SWORD_4.get());
                        pOutput.accept(ModItems.SAMON_SWORD_5.get());
                        
                        pOutput.accept(ModItems.TOTEM_SWORD.get());
                        pOutput.accept(ModItems.TOTEM_SWORD_1.get());
                        pOutput.accept(ModItems.TOTEM_SWORD_2.get());
                        pOutput.accept(ModItems.TOTEM_SWORD_3.get());
                        pOutput.accept(ModItems.TOTEM_SWORD_4.get());
                        pOutput.accept(ModItems.TOTEM_SWORD_5.get());
                        
                        pOutput.accept(ModItems.SHAPED_AMETHYST.get());
                        pOutput.accept(ModItems.SHAPED_AMETHYST_1.get());
                        pOutput.accept(ModItems.SHAPED_AMETHYST_2.get());
                        pOutput.accept(ModItems.SHAPED_AMETHYST_3.get());
                        pOutput.accept(ModItems.SHAPED_AMETHYST_4.get());
                        pOutput.accept(ModItems.SHAPED_AMETHYST_5.get());
                        
                        pOutput.accept(ModItems.ROUND_SWORD.get());
                        pOutput.accept(ModItems.ROUND_SWORD_1.get());
                        pOutput.accept(ModItems.ROUND_SWORD_2.get());
                        pOutput.accept(ModItems.ROUND_SWORD_3.get());
                        pOutput.accept(ModItems.ROUND_SWORD_4.get());
                        pOutput.accept(ModItems.ROUND_SWORD_5.get());
                        
                        pOutput.accept(ModItems.FLINT_HAND.get());
                        pOutput.accept(ModItems.FLINT_HAND_1.get());
                        pOutput.accept(ModItems.FLINT_HAND_2.get());
                        pOutput.accept(ModItems.FLINT_HAND_3.get());
                        pOutput.accept(ModItems.FLINT_HAND_4.get());
                        pOutput.accept(ModItems.FLINT_HAND_5.get());
                        
                        
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

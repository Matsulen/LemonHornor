package net.matsulen.lemonhornor.datagen;

import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.item.ModItems;
import net.matsulen.lemonhornor.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, LemonHornor.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ModTags.Items.IRON_SICKLE_TAG)
                .add(ModItems.IRON_SICKLE.get(),
                        ModItems.IRON_SICKLE_1.get(),
                        ModItems.IRON_SICKLE_2.get(),
                        ModItems.IRON_SICKLE_3.get(),
                        ModItems.IRON_SICKLE_4.get(),
                        ModItems.IRON_SICKLE_5.get(),
                        ModItems.IRON_SICKLE_6.get(),
                        ModItems.IRON_SICKLE_7.get(),
                        ModItems.IRON_SICKLE_8.get(),
                        ModItems.IRON_SICKLE_9.get(),
                        ModItems.IRON_SICKLE_10.get()
                        );

        this.tag(ModTags.Items.IRON_BLADE_TAG)
                .add(ModItems.IRON_BLADE.get(),
                        ModItems.IRON_BLADE_1.get(),
                        ModItems.IRON_BLADE_2.get(),
                        ModItems.IRON_BLADE_3.get(),
                        ModItems.IRON_BLADE_4.get(),
                        ModItems.IRON_BLADE_5.get(),
                        ModItems.IRON_BLADE_6.get(),
                        ModItems.IRON_BLADE_7.get(),
                        ModItems.IRON_BLADE_8.get(),
                        ModItems.IRON_BLADE_9.get(),
                        ModItems.IRON_BLADE_10.get()
                );
        this.tag(ModTags.Items.CAMP_FIRE_SWORD_TAG)
                .add(ModItems.CAMP_FIRE_SWORD.get(),
                        ModItems.CAMP_FIRE_SWORD_1.get(),
                        ModItems.CAMP_FIRE_SWORD_2.get(),
                        ModItems.CAMP_FIRE_SWORD_3.get(),
                        ModItems.CAMP_FIRE_SWORD_4.get(),
                        ModItems.CAMP_FIRE_SWORD_5.get()
                );
        this.tag(ModTags.Items.DRAGON_TEAR_TAG)
                .add(ModItems.DRAGON_TEAR.get(),
                        ModItems.DRAGON_TEAR_1.get(),
                        ModItems.DRAGON_TEAR_2.get(),
                        ModItems.DRAGON_TEAR_3.get(),
                        ModItems.DRAGON_TEAR_4.get(),
                        ModItems.DRAGON_TEAR_5.get()
                );
        this.tag(ModTags.Items.SOUL_FIRE_TAG)
                .add(ModItems.SOUL_FIRE.get(),
                        ModItems.SOUL_FIRE_1.get(),
                        ModItems.SOUL_FIRE_2.get(),
                        ModItems.SOUL_FIRE_3.get(),
                        ModItems.SOUL_FIRE_4.get(),
                        ModItems.SOUL_FIRE_5.get()
                );
        this.tag(ModTags.Items.MEAT_KNIFE_TAG)
                .add(ModItems.MEAT_KNIFE.get(),
                        ModItems.MEAT_KNIFE_1.get(),
                        ModItems.MEAT_KNIFE_2.get(),
                        ModItems.MEAT_KNIFE_3.get(),
                        ModItems.MEAT_KNIFE_4.get(),
                        ModItems.MEAT_KNIFE_5.get()
                );
        this.tag(ModTags.Items.HORN_OF_GOAT_TAG)
                .add(ModItems.HORN_OF_GOAT.get(),
                        ModItems.HORN_OF_GOAT_1.get(),
                        ModItems.HORN_OF_GOAT_2.get(),
                        ModItems.HORN_OF_GOAT_3.get(),
                        ModItems.HORN_OF_GOAT_4.get(),
                        ModItems.HORN_OF_GOAT_5.get()
                );
        this.tag(ModTags.Items.EFFECTED_SWORD_TAG)
                .add(ModItems.EFFECTED_SWORD.get(),
                        ModItems.EFFECTED_SWORD_1.get(),
                        ModItems.EFFECTED_SWORD_2.get(),
                        ModItems.EFFECTED_SWORD_3.get(),
                        ModItems.EFFECTED_SWORD_4.get(),
                        ModItems.EFFECTED_SWORD_5.get()
                );
        this.tag(ModTags.Items.KNIGHT_HORNOR_TAG)
                .add(ModItems.KNIGHT_HORNOR.get(),
                        ModItems.KNIGHT_HORNOR_1.get(),
                        ModItems.KNIGHT_HORNOR_2.get(),
                        ModItems.KNIGHT_HORNOR_3.get(),
                        ModItems.KNIGHT_HORNOR_4.get(),
                        ModItems.KNIGHT_HORNOR_5.get()
                );
        this.tag(ModTags.Items.SAMON_SWORD_TAG)
                .add(ModItems.SAMON_SWORD.get(),
                        ModItems.SAMON_SWORD_1.get(),
                        ModItems.SAMON_SWORD_2.get(),
                        ModItems.SAMON_SWORD_3.get(),
                        ModItems.SAMON_SWORD_4.get(),
                        ModItems.SAMON_SWORD_5.get()
                );
        this.tag(ModTags.Items.TOTEM_SWORD_TAG)
                .add(ModItems.TOTEM_SWORD.get(),
                        ModItems.TOTEM_SWORD_1.get(),
                        ModItems.TOTEM_SWORD_2.get(),
                        ModItems.TOTEM_SWORD_3.get(),
                        ModItems.TOTEM_SWORD_4.get(),
                        ModItems.TOTEM_SWORD_5.get()
                );
        this.tag(ModTags.Items.ROUND_SWORD_TAG)
                .add(ModItems.ROUND_SWORD.get(),
                        ModItems.ROUND_SWORD_1.get(),
                        ModItems.ROUND_SWORD_2.get(),
                        ModItems.ROUND_SWORD_3.get(),
                        ModItems.ROUND_SWORD_4.get(),
                        ModItems.ROUND_SWORD_5.get()
                );
        this.tag(ModTags.Items.SHAPED_AMETHYST_TAG)
                .add(ModItems.SHAPED_AMETHYST.get(),
                        ModItems.SHAPED_AMETHYST_1.get(),
                        ModItems.SHAPED_AMETHYST_2.get(),
                        ModItems.SHAPED_AMETHYST_3.get(),
                        ModItems.SHAPED_AMETHYST_4.get(),
                        ModItems.SHAPED_AMETHYST_5.get()
                );
    }
}

package net.matsulen.lkartifacts.item;

import net.matsulen.lkartifacts.LKArtifacts;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier Evolve = TierSortingRegistry.registerTier(
            new ForgeTier(3,800,1f,2f,15,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.DIAMOND_DUST.get())),
            new ResourceLocation(LKArtifacts.MOD_ID,"evolve"), List.of(), List.of());
    public static final Tier BAMBOO = TierSortingRegistry.registerTier(
            new ForgeTier(2,300,1f,2f,20,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.DIAMOND_DUST.get())),
            new ResourceLocation(LKArtifacts.MOD_ID,"bamboo"), List.of(), List.of());
    public static final Tier Totem = TierSortingRegistry.registerTier(
            new ForgeTier(3,1800,1f,2f,30,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(LKArtifacts.MOD_ID,"totem"), List.of(), List.of());

}

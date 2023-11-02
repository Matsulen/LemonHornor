package net.matsulen.lkartifacts.recipe;

import net.matsulen.lkartifacts.LKArtifacts;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipe {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, LKArtifacts.MOD_ID);

    public static final RegistryObject<RecipeSerializer<EvolveAnvilRecipe>> EVOLVE_ANVIL_SERIALIZER =
            SERIALIZERS.register("evolve_anvil", () -> EvolveAnvilRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}


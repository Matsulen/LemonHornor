package net.matsulen.lkartifacts;

import com.mojang.logging.LogUtils;
import net.matsulen.lkartifacts.block.ModBlocks;
import net.matsulen.lkartifacts.block.entity.ModBlockEntities;
import net.matsulen.lkartifacts.event.ModEvents;
import net.matsulen.lkartifacts.item.ModCreativeModTabs;
import net.matsulen.lkartifacts.item.ModItems;
import net.matsulen.lkartifacts.loot.ModLootModifiers;
import net.matsulen.lkartifacts.recipe.ModRecipe;
import net.matsulen.lkartifacts.screen.EvolveAnvilScreen;
import net.matsulen.lkartifacts.screen.ModMenuTypes;
import net.matsulen.lkartifacts.world.ModWorld;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LKArtifacts.MOD_ID)
public class LKArtifacts {
    public static final String MOD_ID = "lkartifacts";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LKArtifacts() {


        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        ModRecipe.register(modEventBus);

        ModEvents modEvents = new ModEvents();
        MinecraftForge.EVENT_BUS.register(modEvents);

        modEventBus.addListener(this::commonSetup);

        // For registration and init stuff.
        ModWorld.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                MenuScreens.register(ModMenuTypes.EVOLVE_ANVIL_MENU.get(), EvolveAnvilScreen::new);

            });
        }
    }
}

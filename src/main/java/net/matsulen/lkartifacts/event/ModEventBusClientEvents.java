package net.matsulen.lkartifacts.event;

import net.matsulen.lkartifacts.LKArtifacts;
import net.matsulen.lkartifacts.block.entity.ModBlockEntities;
import net.matsulen.lkartifacts.block.entity.renderer.EvolveAnvilBlockEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LKArtifacts.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.EVOLVE_ANVIL_BE.get(), EvolveAnvilBlockEntityRenderer::new);
    }
}

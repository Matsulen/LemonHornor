package net.matsulen.lemonhornor.block.entity;

import net.matsulen.lemonhornor.LemonHornor;
import net.matsulen.lemonhornor.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LemonHornor.MOD_ID);

    public static final RegistryObject<BlockEntityType<EvolveAnvilBlockEntity>> EVOLVE_ANVIL_BE =
            BLOCK_ENTITIES.register("evolve_anvil_be", () ->
                    BlockEntityType.Builder.of(EvolveAnvilBlockEntity::new,
                            ModBlocks.EVOLVE_ANVIL.get()).build(null));

    public static void register (IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

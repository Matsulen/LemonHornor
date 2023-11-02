package net.matsulen.lkartifacts.event;

import net.matsulen.lkartifacts.LKArtifacts;
import net.matsulen.lkartifacts.item.custom.FlintHandItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = LKArtifacts.MOD_ID)
public class ModEvents {
    private static final AttributeModifier FIVE_HEART = new AttributeModifier(UUID.randomUUID(), "5 Health", 10.0, AttributeModifier.Operation.ADDITION);
    private static final AttributeModifier DISTANCE = new AttributeModifier(UUID.randomUUID(), "2.5 Distance", 2.5, AttributeModifier.Operation.ADDITION);


    @SubscribeEvent
    public static void ExtraHealthEquipmentChange(LivingEquipmentChangeEvent event) {
        if (event.getEntity() instanceof Player && event.getSlot() == EquipmentSlot.MAINHAND) {
            Player player = (Player) event.getEntity();
            ItemStack mainHandItem = player.getItemBySlot(EquipmentSlot.MAINHAND);

            if (mainHandItem.getItem() instanceof FlintHandItem) {
                // 如果物品是你的特定物品，为玩家添加额外生命值属性标签
//                player.getAttribute(Attributes.MAX_HEALTH).addTransientModifier(FIVE_HEART);
//                player.getAttribute(ForgeMod.ENTITY_REACH.get()).addTransientModifier(DISTANCE);
            } else {
                // 如果物品不是你的特定物品，移除额外生命值属性标签
//                player.getAttribute(Attributes.MAX_HEALTH).removeModifier(FIVE_HEART);
//                player.getAttribute(ForgeMod.ENTITY_REACH.get()).removeModifier(DISTANCE);
            }
        }
    }
}

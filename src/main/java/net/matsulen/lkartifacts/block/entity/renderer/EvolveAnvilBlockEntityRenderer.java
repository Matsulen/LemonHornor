package net.matsulen.lkartifacts.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.matsulen.lkartifacts.block.entity.EvolveAnvilBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;

import static net.matsulen.lkartifacts.block.custom.EvolveAnvilBlock.FACING;


public class EvolveAnvilBlockEntityRenderer implements BlockEntityRenderer<EvolveAnvilBlockEntity> {
    public EvolveAnvilBlockEntityRenderer(BlockEntityRendererProvider.Context context) {

    }
    @Override
    public void render(EvolveAnvilBlockEntity pBlockEntity, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBuffer,
                       int pPackedLight, int pPackedOverlay) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack itemStack = pBlockEntity.getRenderStack();

        pPoseStack.pushPose();
        pPoseStack.translate(0.5f,0.94f,0.5f);
        pPoseStack.scale(0.5f,0.5f,0.5f);
        // 获取方块的方向
        // 获取方块的方向
        Direction blockFacing = pBlockEntity.getBlockState().getValue(FACING);

        // 根据方块的方向计算旋转角度
        float yaw = 0.0f;
        float pitch = 0.0f;

        switch (blockFacing) {
            case NORTH:
                yaw = 0.0f;
                break;
            case SOUTH:
                yaw = 180.0f;
                break;
            case WEST:
                yaw = 90.0f;
                break;
            case EAST:
                yaw = 270.0f;
                break;
            default:
                // Handle any other potential directions here
                break;
        }

        // 如果是东或西方向，旋转物品实体绕X轴90度
        if (blockFacing == Direction.EAST || blockFacing == Direction.WEST) {
            pitch = 90.0f;
        }
        if (blockFacing == Direction.NORTH || blockFacing == Direction.SOUTH) {
            pitch = 270.0f;
            yaw += 90.0f;
        }

        pPoseStack.mulPose(Axis.YP.rotationDegrees(yaw + 45f));
        pPoseStack.mulPose(Axis.XP.rotationDegrees(pitch));

        itemRenderer.renderStatic(itemStack, ItemDisplayContext.FIXED,getLightLevel(pBlockEntity.getLevel(),pBlockEntity.getBlockPos()),
                OverlayTexture.NO_OVERLAY, pPoseStack, pBuffer, pBlockEntity.getLevel(), 1);
        pPoseStack.popPose();
    }


    private int getLightLevel(Level level, BlockPos pos) {
        int bLight = level.getBrightness(LightLayer.BLOCK,pos);
        int sLight = level.getBrightness(LightLayer.SKY,pos);
        return LightTexture.pack(bLight,sLight);
    }
}

package net.matsulen.lkartifacts.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.matsulen.lkartifacts.LKArtifacts;
import net.matsulen.lkartifacts.util.MouseUtil;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;
public class EvolveAnvilScreen extends AbstractContainerScreen<EvolveAnvilMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(LKArtifacts.MOD_ID,"textures/gui/evolve_anvil_gui.png");

    public EvolveAnvilScreen(EvolveAnvilMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        //改变标题和背包名字的位置
        this.inventoryLabelY = 10000;
        this.titleLabelX = 8;
        this.titleLabelY = 7;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        //绘制gui
        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressArrow(guiGraphics, x, y);


    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isCrafting()) {
            //        定义需要绘制的材质    在x轴这里   y轴这里          宽度                              这里应该是高度     根据进度绘制箭头
            guiGraphics.blit(TEXTURE, x + 85, y + 30, 176, 0, 8, menu.getScaledProgress());
        }
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        //背景和tooltip
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
        renderOnboardingTooltips(guiGraphics, mouseX, mouseY, x, y);
    }

    private void renderOnboardingTooltips(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, int x, int y) {
        Optional<Component> optional = Optional.empty();
        if (this.hoveredSlot != null) {
            ItemStack itemStack = this.hoveredSlot.getItem();
            if (isMouseAboveArea(pMouseX,pMouseY,x,y,80,11,16,16)) {
                    if (itemStack.isEmpty()) {
                    optional = Optional.of(Component.translatable("tooltip.lkartifacts.missing_weapon"));
                }
            } else if (isMouseAboveArea(pMouseX,pMouseY,x,y,57,34,16,16)){
                    if (itemStack.isEmpty()) {
                            optional = Optional.of(Component.translatable("tooltip.lkartifacts.missing_star"));
                    }
            }
        }
        optional.ifPresent((p_280863_) -> {
            pGuiGraphics.renderTooltip(this.font, this.font.split(p_280863_, 115), pMouseX, pMouseY);
        });
    }
    private boolean isMouseAboveArea(int pMouseX, int pMouseY, int x, int y, int offsetX, int offsetY, int width, int height) {
        return MouseUtil.isMouseOver(pMouseX, pMouseY, x + offsetX, y + offsetY, width, height);
    }
}

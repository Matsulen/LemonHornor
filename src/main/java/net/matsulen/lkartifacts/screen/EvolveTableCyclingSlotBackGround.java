package net.matsulen.lkartifacts.screen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;
@OnlyIn(Dist.CLIENT)
public class EvolveTableCyclingSlotBackGround {
    private static final int ICON_CHANGE_TICK_RATE = 30;
    private static final int ICON_SIZE = 16;
    private static final int ICON_TRANSITION_TICK_DURATION = 4;
    private final int slotIndex;
    private List<ResourceLocation> icons = List.of();
    private int tick;
    private int iconIndex;

    public EvolveTableCyclingSlotBackGround(int pSlotIndex) {
        this.slotIndex = pSlotIndex;
    }

    public void tick(List<ResourceLocation> pIcons) {
        if (!this.icons.equals(pIcons)) {
            this.icons = pIcons;
            this.iconIndex = 0;
        }

        if (!this.icons.isEmpty() && ++this.tick % 30 == 0) {
            this.iconIndex = (this.iconIndex + 1) % this.icons.size();
        }

    }

    public void render(GuiGraphics pGuiGraphics, int pX, int pY,float pPartialTick) {
        if (!this.icons.isEmpty()) {
            boolean flag = this.icons.size() > 1 && this.tick >= 30;
            float f = flag ? this.getIconTransitionTransparency(pPartialTick) : 1.0F;
            if (f < 1.0F) {
                int i = Math.floorMod(this.iconIndex - 1, this.icons.size());
                this.renderIcon(this.icons.get(i), 1.0F - f, pGuiGraphics, pX, pY);
            }

            this.renderIcon(this.icons.get(this.iconIndex), f, pGuiGraphics, pX, pY);
        }
    }

    private void renderIcon(ResourceLocation pIcon, float pAlpha, GuiGraphics pGuiGraphics, int pX, int pY) {
        TextureAtlasSprite textureatlassprite = Minecraft.getInstance().getTextureAtlas(TextureAtlas.LOCATION_BLOCKS).apply(pIcon);
        pGuiGraphics.blit(pX, pY, 0, 16, 16, textureatlassprite, 1.0F, 1.0F, 1.0F, pAlpha);
    }
    private float getIconTransitionTransparency(float pPartialTick) {
        float f = (float)(this.tick % 30) + pPartialTick;
        return Math.min(f, 4.0F) / 4.0F;
    }
}

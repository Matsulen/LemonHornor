package net.matsulen.lemonhornor.block.entity;

import net.matsulen.lemonhornor.recipe.EvolveAnvilRecipe;
import net.matsulen.lemonhornor.screen.EvolveAnvilMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class EvolveAnvilBlockEntity extends BlockEntity implements MenuProvider {

    //存储空间
    private final ItemStackHandler itemStackHandler = new ItemStackHandler(3);
    private static final int INPUT_SLOT = 0;

    private static final int OUTPUT_SLOT = 1;
    private static final int MATERIAL_SLOT = 2;
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;

    //构造函数
    public EvolveAnvilBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.EVOLVE_ANVIL_BE.get(), pPos, pBlockState);
        //可以通过服务器同步进度和最大进度，告诉客户端该怎么做
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> EvolveAnvilBlockEntity.this.progress;
                    case 1 -> EvolveAnvilBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> EvolveAnvilBlockEntity.this.progress = pValue;
                    case 1 -> EvolveAnvilBlockEntity.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                //上面有两个状态
                return 2;
            }
        };
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        //告诉游戏这个方块有特殊效果
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    //可以处理接受的物品
    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemStackHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemStackHandler.getSlots());
        for (int i = 0; i < itemStackHandler.getSlots(); i++) {
            inventory.setItem(i, itemStackHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.lemonhornor.evolve_anvil");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new EvolveAnvilMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    //CompoundTag用于在游戏结束时保存和在游戏加载时加载
    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemStackHandler.serializeNBT());
        pTag.putInt("evolve_anvil.progress", progress);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        //                                                      这个key必须和前面保持一致
        itemStackHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("evolve_anvil.progress");
    }

    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
        //在台子上制作物品 逻辑
        if (hasRecipe()) {
            increaseCraftingProgress();
            setChanged(pLevel, pPos, pState); //用于记录变化

            if (hasProgressFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void resetProgress() {
        progress = 0;
    }

    private void craftItem() {

        Optional<EvolveAnvilRecipe> recipe = getCurrentRecipe();
        ItemStack result = recipe.get().getResultItem(null);

        this.itemStackHandler.extractItem(INPUT_SLOT, 1, false);
        this.itemStackHandler.extractItem(MATERIAL_SLOT, 1, false);

        this.itemStackHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(result.getItem(),
                this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).getCount() + result.getCount()));
        playSound();

    }


    private boolean hasProgressFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftingProgress() {
        progress++;
    }

    private boolean hasRecipe() {
//        boolean hasCraftingItem = this.itemStackHandler.getStackInSlot(INPUT_SLOT).getItem() == ModItems.RAW_SAPPHIRE.get();
//        ItemStack result = new ItemStack(ModItems.SAPPHIRE.get());

        Optional<EvolveAnvilRecipe> recipe = getCurrentRecipe();

        if (recipe.isEmpty()) {
            return false;
        }
        ItemStack result = recipe.get().getResultItem(null);
        //也能做一些事情 但不必须
//        ItemStack result = recipe.get().getResultItem(getLevel().registryAccess());

        return canInsertAmountIntoOutputSlot(result.getCount()) && canInsertItemIntoOutputSlot(result.getItem());

    }

    private Optional<EvolveAnvilRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(this.itemStackHandler.getSlots());
        for (int i = 0; i < itemStackHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemStackHandler.getStackInSlot(i));
        }
        return this.level.getRecipeManager().getRecipeFor(EvolveAnvilRecipe.Type.INSTANCE, inventory, level);
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).is(item);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count <= this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
    }

    private void playSound() {
        BlockPos pos = this.getBlockPos();
        Level level = this.getLevel();

        if (level != null) {
            level.playSound(null, pos, SoundEvents.SMITHING_TABLE_USE, SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }
}
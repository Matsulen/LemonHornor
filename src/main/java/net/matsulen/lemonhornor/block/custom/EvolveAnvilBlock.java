package net.matsulen.lemonhornor.block.custom;

import net.matsulen.lemonhornor.block.entity.EvolveAnvilBlockEntity;
import net.matsulen.lemonhornor.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class EvolveAnvilBlock extends BaseEntityBlock {

    //创建完该页面之后注册方块, 修改datagen内的掉落表和ModelProvider。添加模型时json放在model/block,texture放texture/block,gui放gui文件夹下
    //方块大小为16*16, 此处规定为16*16*12，防止准星没有在方框大小上的时候也触发界面
    public static final VoxelShape SHAPE = Block.box(0,0,0,16,12,16);

    public EvolveAnvilBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    //很重要
    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL; //不这样物品方框会无法被看到（透明）
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        //检测状态已经变了，不再是方块实体，就掉落并且删除内容储存物
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof EvolveAnvilBlockEntity) {
                ((EvolveAnvilBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if (entity instanceof EvolveAnvilBlockEntity) {
                NetworkHooks.openScreen(((ServerPlayer) pPlayer),(EvolveAnvilBlockEntity)entity, pPos);

                //只在1.20.1中能这样运行
            } else {
                throw new IllegalStateException("Container Provider缺失!");
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        //每秒20tick调用实体
        if (pLevel.isClientSide()) {
            return null;
        }
        return createTickerHelper(pBlockEntityType, ModBlockEntities.EVOLVE_ANVIL_BE.get(),
                (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {

        //别忘了添加物品实体
        return new EvolveAnvilBlockEntity(pPos, pState);
    }
}

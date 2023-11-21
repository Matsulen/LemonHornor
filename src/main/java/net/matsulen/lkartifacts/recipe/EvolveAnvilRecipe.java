package net.matsulen.lkartifacts.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.matsulen.lkartifacts.LKArtifacts;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class EvolveAnvilRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;

    //                                     json里面的物品
    private final ItemStack output;
    private final ResourceLocation id;

    public EvolveAnvilRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.id = id;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        //重要
        if (pLevel.isClientSide()){
            return false;
        }
        //判定是否匹配配方
        //                                           获取0号插槽物品
        //    读取recipe的ingredients
        return inputItems.get(0).test(pContainer.getItem(0)) && inputItems.get(1).test(pContainer.getItem(1));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
        // not work
        ItemStack itemstack = this.output.copy();
        return itemstack;

    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        return output;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return inputItems;
    }
    
    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }
    public static class Type implements RecipeType<EvolveAnvilRecipe> {
        public static final Type INSTANCE = new Type();
        //创建的合成表的id
        public static final String ID = "evolve_anvil";

    }
    public static class Serializer implements RecipeSerializer<EvolveAnvilRecipe> {

        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(LKArtifacts.MOD_ID,"evolve_anvil");



        @Override
        public EvolveAnvilRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            //读取json文件获得配方
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe,"output"));
                                                //查找result

            JsonArray ingredients = GsonHelper.getAsJsonArray(pSerializedRecipe,"ingredients");
                    //查找ingredients

                                                                //如果只有一个输入槽
            NonNullList<Ingredient> inputs = NonNullList.withSize(2,Ingredient.EMPTY);

            for (int i = 0; i<inputs.size();i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new EvolveAnvilRecipe(inputs, output, pRecipeId);
        }

        @Override
        public @Nullable EvolveAnvilRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {

            NonNullList<Ingredient> inputs = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);
            for (int i = 0; i < inputs.size() ; i++) {
                inputs.set(i, Ingredient.fromNetwork(pBuffer));
            }
            ItemStack output = pBuffer.readItem();

            return new EvolveAnvilRecipe(inputs, output, pRecipeId);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, EvolveAnvilRecipe pRecipe) {
            //写入，以及缓冲区
            pBuffer.writeInt(pRecipe.getIngredients().size());
            for (Ingredient ingredient : pRecipe.getIngredients()) {
                ingredient.toNetwork(pBuffer);
            }
            pBuffer.writeItemStack(pRecipe.getResultItem(null), false);

        }
    }
}

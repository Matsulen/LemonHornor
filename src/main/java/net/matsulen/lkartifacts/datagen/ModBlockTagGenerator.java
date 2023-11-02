package net.matsulen.lkartifacts.datagen;

import net.matsulen.lkartifacts.LKArtifacts;
import net.matsulen.lkartifacts.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LKArtifacts.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.EVOLVE_ANVIL.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.EVOLVE_ANVIL.get());

//        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
//                .add(ModBlocks.EVOLVE_ANVIL.get());
//
//        this.tag(BlockTags.NEEDS_STONE_TOOL)
//                .add(ModBlocks.EVOLVE_ANVIL.get());
//
//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(ModBlocks.EVOLVE_ANVIL.get());
//
//        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
//                .add(ModBlocks.EVOLVE_ANVIL.get());



    }
}

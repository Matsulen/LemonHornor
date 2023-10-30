package net.matsulen.lemonhornor.world.structure;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.matsulen.lemonhornor.world.ModWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pools.JigsawPlacement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class SkyStructures extends Structure {

    // 自定义编解码器，用于修改 code_structure_sky_fan.json 配置的大小上限，不再限制在 7。
    // 有了这个编解码器，我们可以将结构的大小上限提高到 30，以便创建非常长的结构分支。
    public static final Codec<SkyStructures> CODEC = RecordCodecBuilder.<SkyStructures>mapCodec(instance ->
            instance.group(SkyStructures.settingsCodec(instance),
                    StructureTemplatePool.CODEC.fieldOf("start_pool").forGetter(structure -> structure.startPool),
                    ResourceLocation.CODEC.optionalFieldOf("start_jigsaw_name").forGetter(structure -> structure.startJigsawName),
                    Codec.intRange(0, 30).fieldOf("size").forGetter(structure -> structure.size),
                    HeightProvider.CODEC.fieldOf("start_height").forGetter(structure -> structure.startHeight),
                    Heightmap.Types.CODEC.optionalFieldOf("project_start_to_heightmap").forGetter(structure -> structure.projectStartToHeightmap),
                    Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter(structure -> structure.maxDistanceFromCenter)
            ).apply(instance, SkyStructures::new)).codec();

    private final Holder<StructureTemplatePool> startPool;
    private final Optional<ResourceLocation> startJigsawName;
    private final int size;
    private final HeightProvider startHeight;
    private final Optional<Heightmap.Types> projectStartToHeightmap;
    private final int maxDistanceFromCenter;

    public SkyStructures(Structure.StructureSettings config,
                         Holder<StructureTemplatePool> startPool,
                         Optional<ResourceLocation> startJigsawName,
                         int size,
                         HeightProvider startHeight,
                         Optional<Heightmap.Types> projectStartToHeightmap,
                         int maxDistanceFromCenter)
    {
        super(config);
        this.startPool = startPool;
        this.startJigsawName = startJigsawName;
        this.size = size;
        this.startHeight = startHeight;
        this.projectStartToHeightmap = projectStartToHeightmap;
        this.maxDistanceFromCenter = maxDistanceFromCenter;
    }

    /*
     * 这里可以执行额外的检查以确定结构是否可以生成。
     * 只有在添加额外的生成条件时才需要重写此方法。
     *
     * 有趣的是，如果将结构的分离/间距设置为0/1，您可以使用 extraSpawningChecks
     * 仅在特定区块坐标时返回true，从而允许仅在世界的特定坐标生成结构。
     *
     * 基本上，此方法用于确定地形是否在合适的高度，
     * 是否有其他结构太近或其他限制条件。
     *
     * 例如，掠夺者哨所添加了一个检查，以确保其不会在村庄的10块区块内生成。
     * （基岩版似乎没有相同的检查）
     *
     * 如果您要生成地狱中的结构，您可能希望在岩架顶部生成。
     * 最好的方法是使用 getBaseColumn 获取结构的 x/z 位置的方块列。
     * 然后循环遍历并查找地面上面的空气，将 blockpos 的 Y 值设置为该值。
     * 请确保在 JigsawPlacement.addPieces 的最后将 boolean 设置为 false，
     * 这样结构将生成在 blockpos 的 Y 值上，而不是在基岩屋顶上放置结构！
     *
     * 另外，请不要在此处进行维度检查。
     * 如果您这样做，而其他模组的维度正在尝试生成您的结构，
     * 定位命令将使Minecraft永远卡住并破坏游戏。
     * 使用生物群系标签来确定结构的生成位置，用户可以通过数据包将其生成在不喜欢的维度中的特定生物群系中。
     */
    private static boolean extraSpawningChecks(Structure.GenerationContext context) {
        // 获取我们所在的区块坐标
        ChunkPos chunkpos = context.chunkPos();

        // 检查以确保我们的结构不会生成在高于 y = 150 的地方，演示了如何使用此方法来检查生成的额外条件
        return context.chunkGenerator().getFirstOccupiedHeight(
                chunkpos.getMinBlockX(),
                chunkpos.getMinBlockZ(),
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                context.heightAccessor(),
                context.randomState()) < 150;
    }

    @Override
    public Optional<Structure.GenerationStub> findGenerationPoint(Structure.GenerationContext context) {

        // 检查此位置是否适合生成我们的结构，这只是为了代码的整洁性。
        // 返回一个空的 Optional 告诉游戏跳过此位置，因为它不会生成结构。
        if (!SkyStructures.extraSpawningChecks(context)) {
            return Optional.empty();
        }

        // 将生成块的 Y 偏移设置为60块高。
        // 因为我们将在下面设置高度图/地形高度生成为 true，这将使结构在地形上方生成60个方块。
        // 如果我们想在海底生成，我们将设置高度图/地形高度生成为 false，然后使用 OCEAN_FLOOR_WG 高度图获取地形的 Y 值。
        int startY = this.startHeight.sample(context.random(), new WorldGenerationContext(context.chunkGenerator(), context.heightAccessor()));

        // 将区块坐标转换为可以使用的实际坐标（获取该区块的角落）
        ChunkPos chunkPos = context.chunkPos();
        BlockPos blockPos = new BlockPos(chunkPos.getMinBlockX(), startY, chunkPos.getMinBlockZ());

        Optional<Structure.GenerationStub> structurePiecesGenerator =
                JigsawPlacement.addPieces(
                        context, // 用于执行所有适当的行为的 JigsawPlacement
                        this.startPool, // 用于从中创建结构布局的起始池
                        this.startJigsawName, // 可以用于仅从一个拼图块生成，但我们不需要担心这个
                        this.size, // 分支可以离中心拼块多远的深度（5 意味着分支不能超过中心拼块 5 个拼块）
                        blockPos, // 结构生成的位置
                        false, // "useExpansionHack" 这是为了使遗留村庄正常生成。您应该始终保持这个值为 false。
                        this.projectStartToHeightmap, // 将地形高度的 Y 值添加到传入的 blockpos 的 Y 值中（这使用 WORLD_SURFACE_WG 高度图，它也会在水表顶停止）
                        // 在这里，blockpos 的 Y 值为60，这意味着结构生成在地形高度之上60个方块。
                        // 将其设置为 false 以便结构仅生成在传入 blockpos 的 Y 值上。
                        // 在将结构放置在地狱中时，一定要将其设置为 false，否则高度图放置将使结构放在基岩屋顶上。
                        this.maxDistanceFromCenter); // 深度结构离中心可以生成的最大限制。不能将此设置得大于 128，否则拼块将被截断。

        /*
         * 请注意，您可以随时创建自己的 JigsawPlacement 类和生成结构的实现方式。
         * 这很棘手，但如果您要做一些基岩拼块系统无法执行的事情，它非常强大。
         * 比如，强制每次生成 3 个拼块，限制拼块生成的频率，或移除拼块的交叉限制。
         */

        // 返回现在已设置好的拼块生成器，以便游戏在需要创建结构拼块布局时运行它。
        return structurePiecesGenerator;
    }

    @Override
    public StructureType<?> type() {
        return ModWorld.SKY_STRUCTURES.get(); // 帮助游戏了解如何将此结构转换回 JSON 以保存到区块中
    }
}

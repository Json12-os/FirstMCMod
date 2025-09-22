package ide.ls.firstmodlss.block;

import ide.ls.firstmodlss.FirstModLSs;
import ide.ls.firstmodlss.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FirstModLSs.MOD_ID);

    public static final DeferredBlock<Block> JOB_MASON_BLOCK = registerBlock("job_mason_block",
            () -> new Block(BlockBehaviour.Properties.of()
            // . & meno of properties
            ));
    public static final DeferredBlock<Block> CRACKED_STONE = registerBlock("cracked_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    // . & meno of properties
                    .strength(1.5F, 6F)
                    .mapColor(MapColor.STONE)
            ));
    public static final DeferredBlock<Block> CRACKED_GRANITE = registerBlock("cracked_granite",
            () -> new Block(BlockBehaviour.Properties.of()
                    // . & meno of properties
                    .strength(1.5F, 6F)
                    .mapColor(MapColor.STONE)
            ));
    public static final DeferredBlock<Block> CRACKED_ANDESITE = registerBlock("cracked_andesite",
            () -> new Block(BlockBehaviour.Properties.of()
                    // . & meno of properties
                    .strength(1.5F, 6F)
                    .mapColor(MapColor.STONE)
            ));
    public static final DeferredBlock<Block> CRACKED_DIORITE = registerBlock("cracked_diorite",
            () -> new Block(BlockBehaviour.Properties.of()
                    // . & meno of properties
                    .strength(1.5F, 6F)
                    .mapColor(MapColor.STONE)
            ));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE = registerBlock("cracked_deepslate",
            () -> new Block(BlockBehaviour.Properties.of()
                    // . & meno of properties
                    .strength(1.5F, 6F)
                    .mapColor(MapColor.STONE)
            ));


    private static <T extends Block> DeferredBlock<T> registerBlock (String name, Supplier<T> block ) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}

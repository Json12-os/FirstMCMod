package ide.ls.firstmodlss;

import ide.ls.firstmodlss.block.ModBlocks;
import ide.ls.firstmodlss.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstModLSs.MOD_ID);

    public static final Supplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TAB.register("prva_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.MONEY2.get()))
            .title(Component.translatable("first_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.MONEY0);
                output.accept(ModItems.MONEY1);
                output.accept(ModItems.MONEY2);
                output.accept(ModItems.CHISEL_TOOL);
                output.accept(ModBlocks.JOB_MASON_BLOCK);
                output.accept(ModBlocks.CRACKED_STONE);
                output.accept(ModBlocks.CRACKED_ANDESITE);
                output.accept(ModBlocks.CRACKED_GRANITE);
                output.accept(ModBlocks.CRACKED_DIORITE);
                output.accept(ModBlocks.CRACKED_DEEPSLATE);
                output.accept(ModItems.STONE_BRICK);
                output.accept(ModItems.DEEPSLATE_BRICK);
                output.accept(ModItems.ANDESITE_BRICK);
                output.accept(ModItems.DIORITE_BRICK);
                output.accept(ModItems.GRANITE_BRICK);
            })
            .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TAB.register(eventbus);
    }
}

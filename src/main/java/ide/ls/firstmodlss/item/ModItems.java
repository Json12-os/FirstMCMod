package ide.ls.firstmodlss.item;

import ide.ls.firstmodlss.FirstModLSs;
import ide.ls.firstmodlss.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstModLSs.MOD_ID);


    public static final DeferredItem<Item> MONEY1 = ITEMS.register("moneyone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONEY0 = ITEMS.register("moneyzero",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONEY2 = ITEMS.register("moneytwo",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_BRICK = ITEMS.register("stone_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRANITE_BRICK = ITEMS.register("granite_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANDESITE_BRICK = ITEMS.register("andesite_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIORITE_BRICK = ITEMS.register("diorite_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_BRICK = ITEMS.register("deepslate_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<ChiselItem> CHISEL_TOOL = ITEMS.register("chisel_tool",
            () -> new ChiselItem(new Item.Properties().durability(500)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

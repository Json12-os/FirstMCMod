package ide.ls.firstmodlss.item;

import ide.ls.firstmodlss.FirstModLSs;
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


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

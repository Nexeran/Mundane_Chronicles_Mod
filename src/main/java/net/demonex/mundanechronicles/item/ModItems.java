package net.demonex.mundanechronicles.item;

import net.demonex.mundanechronicles.MundaneChronicles;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MundaneChronicles.MOD_ID);
    // Zircon
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Raw Zircon
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

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

    // Black Opal
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Chocolate Diamond
    public static final RegistryObject<Item> CHOCOLATE_DIAMOND = ITEMS.register("chocolate_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));
    // Dark Chocolate Diamond
    public static final RegistryObject<Item> DARK_CHOCOLATE_DIAMOND = ITEMS.register("dark_chocolate_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Dioptase
    public static final RegistryObject<Item> DIOPTASE = ITEMS.register("dioptase",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Kunzite
    public static final RegistryObject<Item> KUNZITE = ITEMS.register("kunzite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Raw Kunzite
    public static final RegistryObject<Item> RAW_KUNZITE = ITEMS.register("raw_kunzite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Topaz
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Moonstone
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Selenite
    public static final RegistryObject<Item> SELENITE = ITEMS.register("selenite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Heliodor
    public static final RegistryObject<Item> HELIODOR = ITEMS.register("heliodor",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Raw Heliodor
    public static final RegistryObject<Item> RAW_HELIODOR = ITEMS.register("raw_heliodor",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Jade
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Raw Jade
    public static final RegistryObject<Item> RAW_JADE = ITEMS.register("raw_jade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Opal
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Fluorite
    public static final RegistryObject<Item> FLUORITE = ITEMS.register("fluorite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Rainbow Fluorite
    public static final RegistryObject<Item> RAINBOW_FLUORITE = ITEMS.register("rainbow_fluorite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Aquamarine
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Tanzanite
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Jet
    public static final RegistryObject<Item> JET = ITEMS.register("jet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Raw Jet
    public static final RegistryObject<Item> RAW_JET = ITEMS.register("raw_jet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Tourmaline
    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));

    // Fire Opal
    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("fire_opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUNDANE_CHRONICLES_TAB)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

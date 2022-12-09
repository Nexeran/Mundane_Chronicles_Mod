package net.demonex.mundanechronicles.block;

import net.demonex.mundanechronicles.MundaneChronicles;
import net.demonex.mundanechronicles.item.ModCreativeModeTab;
import net.demonex.mundanechronicles.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MundaneChronicles.MOD_ID);

    // Zircon Block
    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Zircon Ore
    public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Deepslate Zircon Ore
    public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Endstone Zircon Ore
    public static final RegistryObject<Block> ENDSTONE_ZIRCON_ORE = registerBlock("endstone_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Netherrack Zircon Ore
    public static final RegistryObject<Block> NETHERRACK_ZIRCON_ORE = registerBlock("netherrack_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Selenite Block
    public static final RegistryObject<Block> SELENITE_BLOCK = registerBlock("selenite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Selenite Ore
    public static final RegistryObject<Block> SELENITE_ORE = registerBlock("selenite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Moonstone Block
    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Moonstone Ore
    public static final RegistryObject<Block> MOONSTONE_ORE = registerBlock("moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Kunzite Block
    public static final RegistryObject<Block> KUNZITE_BLOCK = registerBlock("kunzite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Kunzite Ore
    public static final RegistryObject<Block> KUNZITE_ORE = registerBlock("kunzite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Chocolate Diamond Block
    public static final RegistryObject<Block> CHOCOLATE_DIAMOND_BLOCK = registerBlock("chocolate_diamond_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Chocolate Diamond Ore
    public static final RegistryObject<Block> CHOCOLATE_DIAMOND_ORE = registerBlock("chocolate_diamond_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Dark Chocolate Diamond Block
    public static final RegistryObject<Block> DARK_CHOCOLATE_DIAMOND_BLOCK = registerBlock("dark_chocolate_diamond_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Fluorite Ore
    public static final RegistryObject<Block> FLUORITE_ORE = registerBlock("fluorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Fluorite Block
    public static final RegistryObject<Block> FLUORITE_BLOCK = registerBlock("fluorite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);
    // Rainbow Fluorite Block
    public static final RegistryObject<Block> RAINBOW_FLUORITE_BLOCK = registerBlock("rainbow_fluorite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MUNDANE_CHRONICLES_TAB);





    //Block helpers Start
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, (() -> new BlockItem(block.get(), new Item.Properties().tab(tab))));
    }
    //Block helpers End

    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}

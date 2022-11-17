package net.demonex.zirconmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ZIRCON_TAB = new CreativeModeTab("zircontab") {
        @Override
        public ItemStack makeIcon() {
            // Sets image of tab in game
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}

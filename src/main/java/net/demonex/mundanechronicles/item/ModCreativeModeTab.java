package net.demonex.mundanechronicles.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MUNDANE_CHRONICLES_TAB = new CreativeModeTab("mundanechroniclestab") {
        @Override
        public ItemStack makeIcon() {
            // Sets image of tab in game
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}

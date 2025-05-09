package net.treefugger.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.treefugger.tutorialmod.TutorialMod;
import net.treefugger.tutorialmod.item.custom.ChiselItem;

public class ModItems {

    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    public static final Item BRONZE_CHISEL = registerItem("bronze_chisel", new ChiselItem(new Item.Settings().maxDamage(200)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("registering mod items for " + TutorialMod.MOD_ID);
    }
}

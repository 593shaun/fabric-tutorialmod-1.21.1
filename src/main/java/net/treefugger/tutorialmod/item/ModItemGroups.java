package net.treefugger.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.treefugger.tutorialmod.TutorialMod;
import net.treefugger.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup RUBY_RED_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "ruby_red_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.tutorialmod.ruby_red_items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    })).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("registering item groups for " + TutorialMod.MOD_ID);
    }
}

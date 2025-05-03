package net.treefugger.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.treefugger.tutorialmod.TutorialMod;

public class ModBlocks {

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("registering mod blocks for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RUBY_BLOCK);
            entries.add(ModBlocks.TIN_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.NETHER_RUBY_ORE);
            entries.add(ModBlocks.END_RUBY_ORE);
            entries.add(ModBlocks.TIN_ORE);
            entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
        });
    }
}

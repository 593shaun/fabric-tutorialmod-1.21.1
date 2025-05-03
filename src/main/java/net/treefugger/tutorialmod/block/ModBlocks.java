package net.treefugger.tutorialmod.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.treefugger.tutorialmod.TutorialMod;

public class ModBlocks {

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED)
                    .requiresTool().strength(3.5f, 3.0f)
                    .sounds(BlockSoundGroup.NETHER_ORE)));

    public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 9), AbstractBlock.Settings.copy(NETHER_RUBY_ORE)
                    .mapColor(MapColor.PALE_YELLOW).strength(4.5f, 9.0f)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DULL_PINK)));

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(TIN_ORE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f,3.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE_GRAY)));



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
    }
}

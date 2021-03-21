package com.vertinode.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {

	public static final String MOD_ID = "vertinode";

	public static final Item GROTESQUE_MEMBRANE = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Block GROTESQUE_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).strength(1F, 1F)
			.sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.HOES));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grotesque_membrane"), GROTESQUE_MEMBRANE);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "grotesque_block"), GROTESQUE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grotesque_block"),
				new BlockItem(GROTESQUE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
	}
}

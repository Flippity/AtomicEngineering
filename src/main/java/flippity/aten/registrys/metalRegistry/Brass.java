package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.brass.brassBlock;
import flippity.aten.items.brass.brassDust;
import flippity.aten.items.brass.brassIngot;
import flippity.aten.items.brass.brassPipe;
import flippity.aten.items.brass.brassPlate;
import flippity.aten.items.brass.brassRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Brass {
	public static Block brassBlock;
	public static Item brassIngot;
	public static Item brassDust;
	public static Item brassPipe;
	public static Item brassPlate;
	public static Item brassRod;
	public static Item brassMold;
	public static Item brassHardMold;

	public static void initItems() {
		brassIngot = new brassIngot();
		GameRegistry.registerItem(brassIngot, "brassIngot");
		brassDust = new brassDust();
		GameRegistry.registerItem(brassDust, "brassDust");
		brassPipe = new brassPipe();
		GameRegistry.registerItem(brassPipe, "brassPipe");
		brassPlate = new brassPlate();
		GameRegistry.registerItem(brassPlate, "brassPlate");
		brassRod = new brassRod();
		GameRegistry.registerItem(brassRod, "brassRod");

	}

	public static void initBlocks() {
		brassBlock = new brassBlock(Material.iron);
		GameRegistry.registerBlock(brassBlock, "brassBlock");

	}

}

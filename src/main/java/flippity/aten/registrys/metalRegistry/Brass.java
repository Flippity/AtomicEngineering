package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.brass.BlockBrass;
import flippity.aten.items.brass.BrassDust;
import flippity.aten.items.brass.BrassIngot;
import flippity.aten.items.brass.BrassPipe;
import flippity.aten.items.brass.BrassPlate;
import flippity.aten.items.brass.BrassRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Brass {
	public static Block BlockBrass;
	public static Item brassIngot;
	public static Item brassDust;
	public static Item brassPipe;
	public static Item brassPlate;
	public static Item brassRod;
	public static Item brassMold;
	public static Item brassHardMold;

	public static void initItems() {
		brassIngot = new BrassIngot();
		GameRegistry.registerItem(brassIngot, "brassIngot");
		brassDust = new BrassDust();
		GameRegistry.registerItem(brassDust, "brassDust");
		brassPipe = new BrassPipe();
		GameRegistry.registerItem(brassPipe, "brassPipe");
		brassPlate = new BrassPlate();
		GameRegistry.registerItem(brassPlate, "brassPlate");
		brassRod = new BrassRod();
		GameRegistry.registerItem(brassRod, "brassRod");

	}

	public static void initBlocks() {
		BlockBrass = new BlockBrass(Material.iron);
		GameRegistry.registerBlock(BlockBrass, "BlockBrass");

	}

}

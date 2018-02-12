package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.aluminum.aluminumIngot;
import flippity.aten.items.aluminum.aluminumDust;
import flippity.aten.items.aluminum.aluminumPipe;
import flippity.aten.items.aluminum.aluminumPlate;
import flippity.aten.items.aluminum.aluminumRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import flippity.aten.blocks.aluminum.aluminumBlock;
import flippity.aten.blocks.aluminum.aluminumOre;

public class Aluminum {
	public static Block aluminumBlock;
	public static Block aluminumOre;
	public static Item aluminumIngot;
	public static Item aluminumDust;
	public static Item aluminumPipe;
	public static Item aluminumPlate;
	public static Item aluminumRod;
	public static Item aluminumMold;
	public static Item aluminumHardMold;

	public static void initItems() {
		aluminumIngot = new aluminumIngot();
		GameRegistry.registerItem(aluminumIngot, "aluminumIngot");
		aluminumDust = new aluminumDust();
		GameRegistry.registerItem(aluminumDust, "aluminumDust");
		aluminumPipe = new aluminumPipe();
		GameRegistry.registerItem(aluminumPipe, "aluminumPipe");
		aluminumPlate = new aluminumPlate();
		GameRegistry.registerItem(aluminumPlate, "aluminumPlate");
		aluminumRod = new aluminumRod();
		GameRegistry.registerItem(aluminumRod, "aluminumRod");


	}

	public static void initBlocks() {
		aluminumBlock = new aluminumBlock(Material.iron);
		GameRegistry.registerBlock(aluminumBlock, "aluminumBlock");
		aluminumOre = new aluminumOre(Material.rock);
		GameRegistry.registerBlock(aluminumOre, "aluminumOre");

	}
}

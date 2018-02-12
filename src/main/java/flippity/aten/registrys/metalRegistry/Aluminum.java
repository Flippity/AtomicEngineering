package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.aluminum.AluminumIngot;
import flippity.aten.items.aluminum.AluminumDust;
import flippity.aten.items.aluminum.AluminumPipe;
import flippity.aten.items.aluminum.AluminumPlate;
import flippity.aten.items.aluminum.AluminumRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import flippity.aten.blocks.aluminum.BlockAluminum;
import flippity.aten.blocks.aluminum.OreAluminum;

public class Aluminum {
	public static Block BlockAluminum;
	public static Block OreAluminum;
	public static Item aluminumIngot;
	public static Item aluminumDust;
	public static Item aluminumPipe;
	public static Item aluminumPlate;
	public static Item aluminumRod;
	public static Item aluminumMold;
	public static Item aluminumHardMold;

	public static void initItems() {
		aluminumIngot = new AluminumIngot();
		GameRegistry.registerItem(aluminumIngot, "aluminumIngot");
		aluminumDust = new AluminumDust();
		GameRegistry.registerItem(aluminumDust, "aluminumDust");
		aluminumPipe = new AluminumPipe();
		GameRegistry.registerItem(aluminumPipe, "aluminumPipe");
		aluminumPlate = new AluminumPlate();
		GameRegistry.registerItem(aluminumPlate, "aluminumPlate");
		aluminumRod = new AluminumRod();
		GameRegistry.registerItem(aluminumRod, "aluminumRod");


	}

	public static void initBlocks() {
		BlockAluminum = new BlockAluminum(Material.iron);
		GameRegistry.registerBlock(BlockAluminum, "BlockAluminum");
		OreAluminum = new OreAluminum(Material.rock);
		GameRegistry.registerBlock(OreAluminum, "OreAluminum");

	}
}

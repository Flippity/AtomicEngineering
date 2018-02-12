package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.copper.BlockCopper;
import flippity.aten.blocks.copper.OreCopper;
import flippity.aten.items.copper.CopperDust;
import flippity.aten.items.copper.CopperIngot;
import flippity.aten.items.copper.CopperPipe;
import flippity.aten.items.copper.CopperPlate;
import flippity.aten.items.copper.CopperRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Copper {
	public static Block copperBlock;
	public static Block copperOre;
	public static Item copperIngot;
	public static Item copperDust;
	public static Item copperPipe;
	public static Item copperPlate;
	public static Item copperRod;
	public static Item copperMold;
	public static Item copperHardMold;

	public static void initItems() {
		copperIngot = new CopperIngot();
		GameRegistry.registerItem(copperIngot, "copperIngot");
		copperDust = new CopperDust();
		GameRegistry.registerItem(copperDust, "copperDust");
		copperPipe = new CopperPipe();
		GameRegistry.registerItem(copperPipe, "copperPipe");
		copperPlate = new CopperPlate();
		GameRegistry.registerItem(copperPlate, "copperPlate");
		copperRod = new CopperRod();
		GameRegistry.registerItem(copperRod, "copperRod");


	}

	public static void initBlocks() {
		copperBlock = new BlockCopper(Material.iron);
		GameRegistry.registerBlock(copperBlock, "copperBlock");
		copperOre = new OreCopper(Material.rock);
		GameRegistry.registerBlock(copperOre, "copperOre");

	}
}

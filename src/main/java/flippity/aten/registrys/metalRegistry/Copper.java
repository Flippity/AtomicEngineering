package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.copper.copperBlock;
import flippity.aten.blocks.copper.copperOre;
import flippity.aten.items.copper.copperDust;
import flippity.aten.items.copper.copperIngot;
import flippity.aten.items.copper.copperPipe;
import flippity.aten.items.copper.copperPlate;
import flippity.aten.items.copper.copperRod;
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
		copperIngot = new copperIngot();
		GameRegistry.registerItem(copperIngot, "copperIngot");
		copperDust = new copperDust();
		GameRegistry.registerItem(copperDust, "copperDust");
		copperPipe = new copperPipe();
		GameRegistry.registerItem(copperPipe, "copperPipe");
		copperPlate = new copperPlate();
		GameRegistry.registerItem(copperPlate, "copperPlate");
		copperRod = new copperRod();
		GameRegistry.registerItem(copperRod, "copperRod");


	}

	public static void initBlocks() {
		copperBlock = new copperBlock(Material.iron);
		GameRegistry.registerBlock(copperBlock, "copperBlock");
		copperOre = new copperOre(Material.rock);
		GameRegistry.registerBlock(copperOre, "copperOre");

	}
}

package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.building_mats.concrete.concrete;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import flippity.aten.blocks.building_mats.concrete.concreteOrange;
import flippity.aten.blocks.building_mats.concrete.concreteMagenta;
import flippity.aten.blocks.building_mats.concrete.concreteLightBlue;
import flippity.aten.blocks.building_mats.concrete.concreteYellow;
import flippity.aten.blocks.building_mats.concrete.concreteLime;
import flippity.aten.blocks.building_mats.concrete.concretePink;
import flippity.aten.blocks.building_mats.concrete.concreteGray;
import flippity.aten.blocks.building_mats.concrete.concreteLightGray;
import flippity.aten.blocks.building_mats.concrete.concreteCyan;
import flippity.aten.blocks.building_mats.concrete.concretePurple;
import flippity.aten.blocks.building_mats.concrete.concreteBlue;
import flippity.aten.blocks.building_mats.concrete.concreteBrown;
import flippity.aten.blocks.building_mats.concrete.concreteGreen;
import flippity.aten.blocks.building_mats.concrete.concreteRed;
import flippity.aten.blocks.building_mats.concrete.concreteBlack;

public class concreteBlock {

	public static Block concrete;
	public static Block concreteOrange;
	public static Block concreteMagenta;
	public static Block concreteLightBlue;
	public static Block concreteYellow;
	public static Block concreteLime;
	public static Block concretePink;
	public static Block concreteGray;
	public static Block concreteLightGray;
	public static Block concreteCyan;
	public static Block concretePurple;
	public static Block concreteBlue;
	public static Block concreteBrown;
	public static Block concreteGreen;
	public static Block concreteRed;
	public static Block concreteBlack;



	// public static Block

	public static void initBlocks() {
		concrete = new concrete(Material.rock);
		GameRegistry.registerBlock(concrete, "concrete");
		concreteOrange = new concreteOrange(Material.rock);
		GameRegistry.registerBlock(concreteOrange, "concreteOrange");
		concreteMagenta = new concreteMagenta(Material.rock);
		GameRegistry.registerBlock(concreteMagenta, "concreteMagenta");
		concreteLightBlue = new concreteLightBlue(Material.rock);
		GameRegistry.registerBlock(concreteLightBlue, "concreteLightBlue");
		concreteYellow = new concreteYellow(Material.rock);
		GameRegistry.registerBlock(concreteYellow, "concreteYellow");
		concreteLime = new concreteLime(Material.rock);
		GameRegistry.registerBlock(concreteLime, "concreteLime");
		concretePink = new concretePink(Material.rock);
		GameRegistry.registerBlock(concretePink, "concretePink");
		concreteGray = new concreteGray(Material.rock);
		GameRegistry.registerBlock(concreteGray, "concreteGray");
		concreteLightGray = new concreteLightGray(Material.rock);
		GameRegistry.registerBlock(concreteLightGray, "concreteLightGray");
		concreteCyan = new concreteCyan(Material.rock);
		GameRegistry.registerBlock(concreteCyan, "concreteCyan");
		concretePurple = new concretePurple(Material.rock);
		GameRegistry.registerBlock(concretePurple, "concretePurple");
		concreteBlue = new concreteBlue(Material.rock);
		GameRegistry.registerBlock(concreteBlue, "concreteBlue");
		concreteBrown = new concreteBrown(Material.rock);
		GameRegistry.registerBlock(concreteBrown, "concreteBrown");
		concreteGreen = new concreteGreen(Material.rock);
		GameRegistry.registerBlock(concreteGreen, "concreteGreen");
		concreteRed = new concreteRed(Material.rock);
		GameRegistry.registerBlock(concreteRed, "concreteRed");
		concreteBlack = new concreteBlack(Material.rock);
		GameRegistry.registerBlock(concreteBlack, "concreteBlack");
	}

	public static void initItems() {

	}

}

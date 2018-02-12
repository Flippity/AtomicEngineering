package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.buildingMaterials.concrete.Concrete;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteBlack;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteBlue;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteBrown;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteCyan;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteGray;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteGreen;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteLightBlue;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteLightGray;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteLime;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteMagenta;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteOrange;
import flippity.aten.blocks.buildingMaterials.concrete.ConcretePink;
import flippity.aten.blocks.buildingMaterials.concrete.ConcretePurple;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteRed;
import flippity.aten.blocks.buildingMaterials.concrete.ConcreteYellow;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ConcreteBlock {

	public static Block Concrete;
	public static Block ConcreteOrange;
	public static Block ConcreteMagenta;
	public static Block ConcreteLightBlue;
	public static Block ConcreteYellow;
	public static Block ConcreteLime;
	public static Block ConcretePink;
	public static Block ConcreteGray;
	public static Block ConcreteLightGray;
	public static Block ConcreteCyan;
	public static Block ConcretePurple;
	public static Block ConcreteBlue;
	public static Block ConcreteBrown;
	public static Block ConcreteGreen;
	public static Block ConcreteRed;
	public static Block ConcreteBlack;



	// public static Block

	public static void initBlocks() {
		Concrete = new Concrete(Material.rock);
		GameRegistry.registerBlock(Concrete, "Concrete");
		ConcreteOrange = new ConcreteOrange(Material.rock);
		GameRegistry.registerBlock(ConcreteOrange, "ConcreteOrange");
		ConcreteMagenta = new ConcreteMagenta(Material.rock);
		GameRegistry.registerBlock(ConcreteMagenta, "ConcreteMagenta");
		ConcreteLightBlue = new ConcreteLightBlue(Material.rock);
		GameRegistry.registerBlock(ConcreteLightBlue, "ConcreteLightBlue");
		ConcreteYellow = new ConcreteYellow(Material.rock);
		GameRegistry.registerBlock(ConcreteYellow, "ConcreteYellow");
		ConcreteLime = new ConcreteLime(Material.rock);
		GameRegistry.registerBlock(ConcreteLime, "ConcreteLime");
		ConcretePink = new ConcretePink(Material.rock);
		GameRegistry.registerBlock(ConcretePink, "ConcretePink");
		ConcreteGray = new ConcreteGray(Material.rock);
		GameRegistry.registerBlock(ConcreteGray, "ConcreteGray");
		ConcreteLightGray = new ConcreteLightGray(Material.rock);
		GameRegistry.registerBlock(ConcreteLightGray, "ConcreteLightGray");
		ConcreteCyan = new ConcreteCyan(Material.rock);
		GameRegistry.registerBlock(ConcreteCyan, "ConcreteCyan");
		ConcretePurple = new ConcretePurple(Material.rock);
		GameRegistry.registerBlock(ConcretePurple, "ConcretePurple");
		ConcreteBlue = new ConcreteBlue(Material.rock);
		GameRegistry.registerBlock(ConcreteBlue, "ConcreteBlue");
		ConcreteBrown = new ConcreteBrown(Material.rock);
		GameRegistry.registerBlock(ConcreteBrown, "ConcreteBrown");
		ConcreteGreen = new ConcreteGreen(Material.rock);
		GameRegistry.registerBlock(ConcreteGreen, "ConcreteGreen");
		ConcreteRed = new ConcreteRed(Material.rock);
		GameRegistry.registerBlock(ConcreteRed, "ConcreteRed");
		ConcreteBlack = new ConcreteBlack(Material.rock);
		GameRegistry.registerBlock(ConcreteBlack, "ConcreteBlack");
	}

	public static void initItems() {

	}

}

package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.iron.ironDust;
import flippity.aten.items.iron.ironPipe;
import flippity.aten.items.iron.ironPlate;
import flippity.aten.items.iron.ironRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Iron {
	public static Item ironDust;
	public static Item ironPipe;
	public static Item ironPlate;
	public static Item ironRod;
	public static Item ironMold;
	public static Item ironHardMold;

	public static void initItems() {
		ironDust = new ironDust();
		GameRegistry.registerItem(ironDust, "ironDust");
		ironPipe = new ironPipe();
		GameRegistry.registerItem(ironPipe, "ironPipe");
		ironPlate = new ironPlate();
		GameRegistry.registerItem(ironPlate, "ironPlate");
		ironRod = new ironRod();
		GameRegistry.registerItem(ironRod, "ironRod");

	}
}

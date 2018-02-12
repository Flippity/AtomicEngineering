package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.iron.IronDust;
import flippity.aten.items.iron.IronPipe;
import flippity.aten.items.iron.IronPlate;
import flippity.aten.items.iron.IronRod;
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
		ironDust = new IronDust();
		GameRegistry.registerItem(ironDust, "ironDust");
		ironPipe = new IronPipe();
		GameRegistry.registerItem(ironPipe, "ironPipe");
		ironPlate = new IronPlate();
		GameRegistry.registerItem(ironPlate, "ironPlate");
		ironRod = new IronRod();
		GameRegistry.registerItem(ironRod, "ironRod");

	}
}

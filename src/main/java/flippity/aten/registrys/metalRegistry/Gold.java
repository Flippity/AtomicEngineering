package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.gold.goldDust;
import flippity.aten.items.gold.goldPipe;
import flippity.aten.items.gold.goldPlate;
import flippity.aten.items.gold.goldRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Gold {
	public static Item goldDust;
	public static Item goldPipe;
	public static Item goldPlate;
	public static Item goldRod;
	public static Item goldMold;
	public static Item goldHardMold;

	public static void initItems() {
		goldDust = new goldDust();
		GameRegistry.registerItem(goldDust, "goldDust");
		goldPipe = new goldPipe();
		GameRegistry.registerItem(goldPipe, "bronzePipe");
		goldPlate = new goldPlate();
		GameRegistry.registerItem(goldPlate, "goldPlate");
		goldRod = new goldRod();
		GameRegistry.registerItem(goldRod, "goldRod");

	}
}

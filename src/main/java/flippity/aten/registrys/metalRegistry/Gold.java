package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.gold.GoldDust;
import flippity.aten.items.gold.GoldPipe;
import flippity.aten.items.gold.GoldPlate;
import flippity.aten.items.gold.GoldRod;
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
		goldDust = new GoldDust();
		GameRegistry.registerItem(goldDust, "goldDust");
		goldPipe = new GoldPipe();
		GameRegistry.registerItem(goldPipe, "bronzePipe");
		goldPlate = new GoldPlate();
		GameRegistry.registerItem(goldPlate, "goldPlate");
		goldRod = new GoldRod();
		GameRegistry.registerItem(goldRod, "goldRod");

	}
}

package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.bronze.bronzeBlock;
import flippity.aten.items.bronze.bronzeDust;
import flippity.aten.items.bronze.bronzeIngot;
import flippity.aten.items.bronze.bronzePipe;
import flippity.aten.items.bronze.bronzePlate;
import flippity.aten.items.bronze.bronzeRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Bronze {
	public static Block bronzeBlock;
	public static Item bronzeIngot;
	public static Item bronzeDust;
	public static Item bronzePipe;
	public static Item bronzePlate;
	public static Item bronzeRod;
	public static Item bronzeMold;
	public static Item bronzeHardMold;

	public static void initItems() {
		bronzeIngot = new bronzeIngot();
		GameRegistry.registerItem(bronzeIngot, "bronzeIngot");
		bronzeDust = new bronzeDust();
		GameRegistry.registerItem(bronzeDust, "bronzeDust");
		bronzePipe = new bronzePipe();
		GameRegistry.registerItem(bronzePipe, "bronzePipe");
		bronzePlate = new bronzePlate();
		GameRegistry.registerItem(bronzePlate, "bronzePlate");
		bronzeRod = new bronzeRod();
		GameRegistry.registerItem(bronzeRod, "bronzeRod");

	}

	public static void initBlocks() {
		bronzeBlock = new bronzeBlock(Material.iron);
		GameRegistry.registerBlock(bronzeBlock, "bronzeBlock");

	}

}

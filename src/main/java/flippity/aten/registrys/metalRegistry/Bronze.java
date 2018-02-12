package flippity.aten.registrys.metalRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.bronze.BlockBronze;
import flippity.aten.items.bronze.BronzeDust;
import flippity.aten.items.bronze.BronzeIngot;
import flippity.aten.items.bronze.BronzePipe;
import flippity.aten.items.bronze.BronzePlate;
import flippity.aten.items.bronze.BronzeRod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Bronze {
	public static Block BlockBronze;
	public static Item bronzeIngot;
	public static Item bronzeDust;
	public static Item bronzePipe;
	public static Item bronzePlate;
	public static Item bronzeRod;
	public static Item bronzeMold;
	public static Item bronzeHardMold;

	public static void initItems() {
		bronzeIngot = new BronzeIngot();
		GameRegistry.registerItem(bronzeIngot, "bronzeIngot");
		bronzeDust = new BronzeDust();
		GameRegistry.registerItem(bronzeDust, "bronzeDust");
		bronzePipe = new BronzePipe();
		GameRegistry.registerItem(bronzePipe, "bronzePipe");
		bronzePlate = new BronzePlate();
		GameRegistry.registerItem(bronzePlate, "bronzePlate");
		bronzeRod = new BronzeRod();
		GameRegistry.registerItem(bronzeRod, "bronzeRod");

	}

	public static void initBlocks() {
		BlockBronze = new BlockBronze(Material.iron);
		GameRegistry.registerBlock(BlockBronze, "BlockBronze");

	}

}

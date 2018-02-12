package flippity.aten.registrys.recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.ItemsBlocks;
import flippity.aten.registrys.metalRegistry.Aluminum;
import flippity.aten.registrys.metalRegistry.Copper;
import net.minecraft.item.ItemStack;

public class Smelting {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Smelting recipes
		// Aluminum
		GameRegistry.addSmelting(Aluminum.OreAluminum, new ItemStack(Aluminum.aluminumIngot), 1.0F);
		// Copper
		GameRegistry.addSmelting(Copper.copperOre, new ItemStack(Copper.copperIngot), 1.0F);
		// Lead
		GameRegistry.addSmelting(ItemsBlocks.leadOre, new ItemStack(ItemsBlocks.leadIngot), 1.0F);
		// nickel
		GameRegistry.addSmelting(ItemsBlocks.nickelOre, new ItemStack(ItemsBlocks.nickelIngot), 1.0F);
		// osmium
		GameRegistry.addSmelting(ItemsBlocks.osmiumOre, new ItemStack(ItemsBlocks.osmiumIngot), 1.0F);
		// platinum
		GameRegistry.addSmelting(ItemsBlocks.platinumOre, new ItemStack(ItemsBlocks.platinumIngot), 1.0F);
		// silver
		GameRegistry.addSmelting(ItemsBlocks.silverOre, new ItemStack(ItemsBlocks.silverIngot), 1.0F);
		// tin
		GameRegistry.addSmelting(ItemsBlocks.tinOre, new ItemStack(ItemsBlocks.tinIngot), 1.0F);
		// zinc
		GameRegistry.addSmelting(ItemsBlocks.zincOre, new ItemStack(ItemsBlocks.zincIngot), 1.0F);
	}
}

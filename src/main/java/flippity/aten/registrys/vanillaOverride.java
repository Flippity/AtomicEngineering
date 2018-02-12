package flippity.aten.registrys;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import flippity.aten.lib.Reference;
import net.minecraft.init.Items;

public class VanillaOverride {
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/*
		 * itemRemover.removeCraftingRecipe(Items.wooden_axe);
		 * itemRemover.removeCraftingRecipe(Items.wooden_hoe);
		 * itemRemover.removeCraftingRecipe(Items.wooden_pickaxe);
		 * itemRemover.removeCraftingRecipe(Items.wooden_shovel);
		 * itemRemover.removeCraftingRecipe(Items.wooden_sword);
		 * itemRemover.removeCraftingRecipe(Items.stone_axe);
		 * itemRemover.removeCraftingRecipe(Items.stone_hoe);
		 * itemRemover.removeCraftingRecipe(Items.stone_pickaxe);
		 * itemRemover.removeCraftingRecipe(Items.stone_shovel);
		 * itemRemover.removeCraftingRecipe(Items.stone_sword);
		 * itemRemover.removeCraftingRecipe(Items.iron_axe);
		 * itemRemover.removeCraftingRecipe(Items.iron_hoe);
		 * itemRemover.removeCraftingRecipe(Items.iron_pickaxe);
		 * itemRemover.removeCraftingRecipe(Items.iron_shovel);
		 * itemRemover.removeCraftingRecipe(Items.iron_sword);
		 * itemRemover.removeCraftingRecipe(Items.golden_axe);
		 * itemRemover.removeCraftingRecipe(Items.golden_hoe);
		 * itemRemover.removeCraftingRecipe(Items.golden_pickaxe);
		 * itemRemover.removeCraftingRecipe(Items.golden_shovel);
		 * itemRemover.removeCraftingRecipe(Items.golden_sword);
		 * itemRemover.removeCraftingRecipe(Items.diamond_axe);
		 * itemRemover.removeCraftingRecipe(Items.diamond_hoe);
		 * itemRemover.removeCraftingRecipe(Items.diamond_pickaxe);
		 * itemRemover.removeCraftingRecipe(Items.diamond_shovel);
		 * itemRemover.removeCraftingRecipe(Items.diamond_sword);
		 * itemRemover.removeCraftingRecipe(Item.getItemFromBlock(Blocks.planks));
		 * itemRemover.removeCraftingRecipe(Items.stick);
		 */

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		// Blocks.log.setHardness(80.0F);
		// Blocks.log2.setHardness(75.0F);
		Items.iron_axe.setTextureName(Reference.MOD_ID + ":Ironaxe");
		Items.iron_pickaxe.setTextureName(Reference.MOD_ID + ":Ironpickaxe");
		Items.iron_sword.setTextureName(Reference.MOD_ID + ":Ironsword");
		Items.iron_hoe.setTextureName(Reference.MOD_ID + ":Ironhoe");
		Items.iron_shovel.setTextureName(Reference.MOD_ID + ":Ironshovel");
	}
}

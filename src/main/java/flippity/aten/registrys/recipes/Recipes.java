package flippity.aten.registrys.recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.ItemsBlocks;
import flippity.aten.registrys.metalRegistry.Aluminum;
import flippity.aten.registrys.metalRegistry.Brass;
import flippity.aten.registrys.metalRegistry.Bronze;
import flippity.aten.registrys.metalRegistry.Copper;
import flippity.aten.registrys.metalRegistry.Gold;
import flippity.aten.registrys.metalRegistry.Iron;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {

	public static void initRecipes() {
		// Shaped recipes

		// GameRegistry.addRecipe(new ItemStack(ItemsBlocks.hardBrick), new Object[]
		// {"##", "##", '#', ItemsBlocks.hardbrick});
		// ===================================================================\\
		// ==============================Blocks================================\\
		// =====================================================================\\
		// Blocks
		// Aluminum
		GameRegistry.addRecipe(new ItemStack(Aluminum.BlockAluminum),
				new Object[] { "bbb", "bbb", "bbb", 'b', Aluminum.aluminumIngot });
		GameRegistry.addRecipe(new ItemStack(Brass.BlockBrass),
				new Object[] { "bbb", "bbb", "bbb", 'b', Brass.brassIngot });
		GameRegistry.addRecipe(new ItemStack(Bronze.BlockBronze),
				new Object[] { "bbb", "bbb", "bbb", 'b', Bronze.bronzeIngot });
		GameRegistry.addRecipe(new ItemStack(Copper.copperBlock),
				new Object[] { "bbb", "bbb", "bbb", 'b', Copper.copperIngot });
		// Shapeless recipes

		/*
		 * GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new
		 * ItemStack(Blocks.log, 1, 0), new ItemStack(ItemsBlocks.RockAxe, 1,
		 * OreDictionary.WILDCARD_VALUE)); GameRegistry.addShapelessRecipe(new
		 * ItemStack(Blocks.planks, 2, 1), new ItemStack(Blocks.log, 1, 1), new
		 * ItemStack(ItemsBlocks.RockAxe, 1, OreDictionary.WILDCARD_VALUE));
		 * GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), new
		 * ItemStack(Blocks.log, 1, 2), new ItemStack(ItemsBlocks.RockAxe, 1,
		 * OreDictionary.WILDCARD_VALUE)); GameRegistry.addShapelessRecipe(new
		 * ItemStack(Blocks.planks, 2, 3), new ItemStack(Blocks.log, 1, 3), new
		 * ItemStack(ItemsBlocks.RockAxe, 1, OreDictionary.WILDCARD_VALUE));
		 * GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), new
		 * ItemStack(Blocks.log2, 1, 0), new ItemStack(ItemsBlocks.RockAxe, 1,
		 * OreDictionary.WILDCARD_VALUE)); GameRegistry.addShapelessRecipe(new
		 * ItemStack(Blocks.planks, 2, 5), new ItemStack(Blocks.log2, 1, 1), new
		 * ItemStack(ItemsBlocks.RockAxe, 1, OreDictionary.WILDCARD_VALUE));
		 * GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 0), new
		 * ItemStack(Blocks.log, 1, 0), new ItemStack(ItemsBlocks.RockSaw, 1,
		 * OreDictionary.WILDCARD_VALUE)); GameRegistry.addShapelessRecipe(new
		 * ItemStack(Blocks.planks, 6, 1), new ItemStack(Blocks.log, 1, 1), new
		 * ItemStack(ItemsBlocks.RockSaw, 1, OreDictionary.WILDCARD_VALUE));
		 * GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 2), new
		 * ItemStack(Blocks.log, 1, 2), new ItemStack(ItemsBlocks.RockSaw, 1,
		 * OreDictionary.WILDCARD_VALUE)); GameRegistry.addShapelessRecipe(new
		 * ItemStack(Blocks.planks, 6, 3), new ItemStack(Blocks.log, 1, 3), new
		 * ItemStack(ItemsBlocks.RockSaw, 1, OreDictionary.WILDCARD_VALUE));
		 * GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 6, 4), new
		 * ItemStack(Blocks.log2, 1, 0), new ItemStack(ItemsBlocks.RockSaw, 1,
		 * OreDictionary.WILDCARD_VALUE)); GameRegistry.addShapelessRecipe(new
		 * ItemStack(Blocks.planks, 6, 5), new ItemStack(Blocks.log2, 1, 1), new
		 * ItemStack(ItemsBlocks.RockSaw, 1, OreDictionary.WILDCARD_VALUE));
		 */

		// ===================================================================\\
		// ==============================Plates================================\\
		// =====================================================================\\
		// Bronze
		GameRegistry.addShapelessRecipe(new ItemStack(Bronze.bronzePlate), new ItemStack(Bronze.bronzeIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Brass
		GameRegistry.addShapelessRecipe(new ItemStack(Brass.brassPlate), new ItemStack(Brass.brassIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Aluminum
		GameRegistry.addShapelessRecipe(new ItemStack(Aluminum.aluminumPlate), new ItemStack(Aluminum.aluminumIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Copper
		GameRegistry.addShapelessRecipe(new ItemStack(Copper.copperPlate), new ItemStack(Copper.copperIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Gold
		GameRegistry.addShapelessRecipe(new ItemStack(Gold.goldPlate), new ItemStack(Items.gold_ingot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Iron
		GameRegistry.addShapelessRecipe(new ItemStack(Iron.ironPlate), new ItemStack(Items.iron_ingot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Lead
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.leadPlate), new ItemStack(ItemsBlocks.leadIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Nickel
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.nickelPlate), new ItemStack(ItemsBlocks.nickelIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Osmium
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.osmiumPlate), new ItemStack(ItemsBlocks.osmiumIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Platinum
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.platinumPlate),
				new ItemStack(ItemsBlocks.platinumIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Tin
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.tinPlate), new ItemStack(ItemsBlocks.tinIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Zinc
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.zincPlate), new ItemStack(ItemsBlocks.zincIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		// Silver
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsBlocks.silverPlate), new ItemStack(ItemsBlocks.silverIngot),
				new ItemStack(ItemsBlocks.Rockhammer, 1, OreDictionary.WILDCARD_VALUE));
		//
		// ===================================================================\\
		// ==============================Molds=================================\\
		// =====================================================================\\


	}

}

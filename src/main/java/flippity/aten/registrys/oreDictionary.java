package flippity.aten.registrys;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import flippity.aten.ItemsBlocks;
import flippity.aten.registrys.metalRegistry.Aluminum;
import flippity.aten.registrys.metalRegistry.Brass;
import flippity.aten.registrys.metalRegistry.Bronze;
import flippity.aten.registrys.metalRegistry.Copper;
import flippity.aten.registrys.metalRegistry.Gold;
import flippity.aten.registrys.metalRegistry.Iron;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class oreDictionary {
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		// ores
		OreDictionary.registerOre("oreCopper", new ItemStack(Copper.copperOre, 1, 0));
		OreDictionary.registerOre("oreOsmium", new ItemStack(ItemsBlocks.osmiumOre, 1, 0));
		OreDictionary.registerOre("oreNickel", new ItemStack(ItemsBlocks.nickelOre, 1, 0));
		OreDictionary.registerOre("orePlatinum", new ItemStack(ItemsBlocks.platinumOre, 1, 0));
		OreDictionary.registerOre("oreAluminum", new ItemStack(Aluminum.aluminumOre, 1, 0));
		OreDictionary.registerOre("oreLead", new ItemStack(ItemsBlocks.leadOre, 1, 0));
		OreDictionary.registerOre("oreTin", new ItemStack(ItemsBlocks.tinOre, 1, 0));
		OreDictionary.registerOre("oreZinc", new ItemStack(ItemsBlocks.zincOre, 1, 0));
		OreDictionary.registerOre("oreSilver", new ItemStack(ItemsBlocks.silverOre, 1, 0));
		OreDictionary.registerOre("oreUranium", new ItemStack(ItemsBlocks.uraniumOre, 1, 0));
		// ingots
		OreDictionary.registerOre("ingotCopper", new ItemStack(Copper.copperIngot, 1, 0));
		OreDictionary.registerOre("ingotOsmium", new ItemStack(ItemsBlocks.osmiumIngot, 1, 0));
		OreDictionary.registerOre("ingotNickel", new ItemStack(ItemsBlocks.nickelIngot, 1, 0));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(ItemsBlocks.platinumIngot, 1, 0));
		OreDictionary.registerOre("ingotAluminum", new ItemStack(Aluminum.aluminumIngot, 1, 0));
		OreDictionary.registerOre("ingotLead", new ItemStack(ItemsBlocks.leadIngot, 1, 0));
		OreDictionary.registerOre("ingotBrass", new ItemStack(Brass.brassIngot, 1, 0));
		OreDictionary.registerOre("ingotBronze", new ItemStack(Bronze.bronzeIngot, 1, 0));
		OreDictionary.registerOre("ingotTin", new ItemStack(ItemsBlocks.tinIngot, 1, 0));
		OreDictionary.registerOre("ingotZinc", new ItemStack(ItemsBlocks.zincIngot, 1, 0));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ItemsBlocks.silverIngot, 1, 0));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ItemsBlocks.steelIngot, 1, 0));

		// dusts
		OreDictionary.registerOre("dustCopper", new ItemStack(Copper.copperDust, 1, 0));
		OreDictionary.registerOre("dustOsmium", new ItemStack(ItemsBlocks.osmiumDust, 1, 0));
		OreDictionary.registerOre("dustNickel", new ItemStack(ItemsBlocks.nickelDust, 1, 0));
		OreDictionary.registerOre("dustPlatinum", new ItemStack(ItemsBlocks.platinumDust, 1, 0));
		OreDictionary.registerOre("dustAluminum", new ItemStack(Aluminum.aluminumDust, 1, 0));
		OreDictionary.registerOre("dustLead", new ItemStack(ItemsBlocks.leadDust, 1, 0));
		OreDictionary.registerOre("dustGold", new ItemStack(Gold.goldDust, 1, 0));
		OreDictionary.registerOre("dustIron", new ItemStack(Iron.ironDust, 1, 0));
		OreDictionary.registerOre("dustBrass", new ItemStack(Brass.brassDust, 1, 0));
		OreDictionary.registerOre("dustBronze", new ItemStack(Bronze.bronzeDust, 1, 0));
		OreDictionary.registerOre("dustTin", new ItemStack(ItemsBlocks.tinDust, 1, 0));
		OreDictionary.registerOre("dustZinc", new ItemStack(ItemsBlocks.zincDust, 1, 0));
		OreDictionary.registerOre("dustSilver", new ItemStack(ItemsBlocks.silverDust, 1, 0));
		OreDictionary.registerOre("dustSteel", new ItemStack(ItemsBlocks.steelDust, 1, 0));

		// plates
		OreDictionary.registerOre("plateCopper", new ItemStack(Copper.copperPlate, 1, 0));
		OreDictionary.registerOre("plateOsmium", new ItemStack(ItemsBlocks.osmiumPlate, 1, 0));
		OreDictionary.registerOre("plateNickel", new ItemStack(ItemsBlocks.nickelPlate, 1, 0));
		OreDictionary.registerOre("platePlatinum", new ItemStack(ItemsBlocks.platinumPlate, 1, 0));
		OreDictionary.registerOre("plateAluminum", new ItemStack(Aluminum.aluminumPlate, 1, 0));
		OreDictionary.registerOre("plateLead", new ItemStack(ItemsBlocks.leadPlate, 1, 0));
		OreDictionary.registerOre("plateGold", new ItemStack(Gold.goldPlate, 1, 0));
		OreDictionary.registerOre("plateIron", new ItemStack(Iron.ironPlate, 1, 0));
		OreDictionary.registerOre("plateBrass", new ItemStack(Brass.brassPlate, 1, 0));
		OreDictionary.registerOre("plateBronze", new ItemStack(Bronze.bronzePlate, 1, 0));
		OreDictionary.registerOre("plateTin", new ItemStack(ItemsBlocks.tinPlate, 1, 0));
		OreDictionary.registerOre("plateZinc", new ItemStack(ItemsBlocks.zincPlate, 1, 0));
		OreDictionary.registerOre("plateSilver", new ItemStack(ItemsBlocks.silverPlate, 1, 0));
		OreDictionary.registerOre("plateSteel", new ItemStack(ItemsBlocks.steelPlate, 1, 0));

		// rods
		OreDictionary.registerOre("rodCopper", new ItemStack(Copper.copperRod, 1, 0));
		OreDictionary.registerOre("rodOsmium", new ItemStack(ItemsBlocks.osmiumRod, 1, 0));
		OreDictionary.registerOre("rodNickel", new ItemStack(ItemsBlocks.nickelRod, 1, 0));
		OreDictionary.registerOre("rodPlatinum", new ItemStack(ItemsBlocks.platinumRod, 1, 0));
		OreDictionary.registerOre("rodAluminum", new ItemStack(Aluminum.aluminumRod, 1, 0));
		OreDictionary.registerOre("rodLead", new ItemStack(ItemsBlocks.leadRod, 1, 0));
		OreDictionary.registerOre("rodGold", new ItemStack(Gold.goldRod, 1, 0));
		OreDictionary.registerOre("rodIron", new ItemStack(Iron.ironRod, 1, 0));
		OreDictionary.registerOre("rodBrass", new ItemStack(Brass.brassRod, 1, 0));
		OreDictionary.registerOre("rodBronze", new ItemStack(Bronze.bronzeRod, 1, 0));
		OreDictionary.registerOre("rodTin", new ItemStack(ItemsBlocks.tinRod, 1, 0));
		OreDictionary.registerOre("rodZinc", new ItemStack(ItemsBlocks.zincRod, 1, 0));
		OreDictionary.registerOre("rodSilver", new ItemStack(ItemsBlocks.silverRod, 1, 0));
		OreDictionary.registerOre("rodSteel", new ItemStack(ItemsBlocks.steelRod, 1, 0));

		// pipes
		OreDictionary.registerOre("pipeCopper", new ItemStack(Copper.copperPipe, 1, 0));
		OreDictionary.registerOre("pipeOsmium", new ItemStack(ItemsBlocks.osmiumPipe, 1, 0));
		OreDictionary.registerOre("pipeNickel", new ItemStack(ItemsBlocks.nickelPipe, 1, 0));
		OreDictionary.registerOre("pipePlatinum", new ItemStack(ItemsBlocks.platinumPipe, 1, 0));
		OreDictionary.registerOre("pipeAluminum", new ItemStack(Aluminum.aluminumPipe, 1, 0));
		OreDictionary.registerOre("pipeLead", new ItemStack(ItemsBlocks.leadPipe, 1, 0));
		OreDictionary.registerOre("pipeGold", new ItemStack(Gold.goldPipe, 1, 0));
		OreDictionary.registerOre("pipeIron", new ItemStack(Iron.ironPipe, 1, 0));
		OreDictionary.registerOre("pipeBrass", new ItemStack(Brass.brassPipe, 1, 0));
		OreDictionary.registerOre("pipeBronze", new ItemStack(Bronze.bronzePipe, 1, 0));
		OreDictionary.registerOre("pipeTin", new ItemStack(ItemsBlocks.tinPipe, 1, 0));
		OreDictionary.registerOre("pipeZinc", new ItemStack(ItemsBlocks.zincPipe, 1, 0));
		OreDictionary.registerOre("pipeSilver", new ItemStack(ItemsBlocks.silverPipe, 1, 0));
		OreDictionary.registerOre("pipeSteel", new ItemStack(ItemsBlocks.steelPipe, 1, 0));

	}
}

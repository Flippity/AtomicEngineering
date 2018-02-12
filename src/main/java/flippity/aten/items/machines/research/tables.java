package flippity.aten.items.machines.research;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.aluminum.aluminumBlock;
import flippity.aten.blocks.researchTables.researchTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class tables {
	public static Block researchTableMK1;
	public static void initBlocks() {
		researchTableMK1 = new researchTable();
		GameRegistry.registerBlock(researchTableMK1, "researchTableMK1");
	}
}

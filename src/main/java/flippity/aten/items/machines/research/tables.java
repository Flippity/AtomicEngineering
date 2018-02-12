package flippity.aten.items.machines.research;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.researchTables.ResearchTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Tables {
	public static Block researchTableMK1;
	public static void initBlocks() {
		researchTableMK1 = new ResearchTable();
		GameRegistry.registerBlock(researchTableMK1, "researchTableMK1");
	}
}

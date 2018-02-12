package flippity.aten.blocks.lead;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class leadOre extends Block {

	public leadOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":lead_ore");
		this.setResistance(2);
		this.setHardness(4);
		this.setStepSound(soundTypeStone);
		this.setBlockName("leadOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 1);
	}
}
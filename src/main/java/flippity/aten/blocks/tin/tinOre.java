package flippity.aten.blocks.tin;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class tinOre extends Block {

	public tinOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":tin_ore");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeStone);
		this.setBlockName("tinOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 1);
	}

}

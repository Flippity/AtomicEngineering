package flippity.aten.blocks.aluminum;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class aluminumBlock extends Block {

	public aluminumBlock(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":aluminum_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("aluminumBlock");
		this.setCreativeTab(tabs.tabAtomBlocks);
	}

}

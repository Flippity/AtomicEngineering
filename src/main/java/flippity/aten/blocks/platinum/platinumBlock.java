package flippity.aten.blocks.platinum;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class platinumBlock extends Block {

	public platinumBlock(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":platinum_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("platinumBlock");
		this.setCreativeTab(tabs.tabAtomBlocks);
	}

}

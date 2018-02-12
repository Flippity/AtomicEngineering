package flippity.aten.blocks.bronze;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class bronzeBlock extends Block {

	public bronzeBlock(Material material) {
		super(material);
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":bronze_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("bronzeBlock");
	}

}

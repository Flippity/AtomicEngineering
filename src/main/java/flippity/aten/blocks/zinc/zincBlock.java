package flippity.aten.blocks.zinc;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class zincBlock extends Block {

	public zincBlock(Material material) {
		super(material);
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":zinc_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("zincBlock");
	}

}

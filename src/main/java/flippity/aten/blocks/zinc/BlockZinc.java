package flippity.aten.blocks.zinc;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockZinc extends Block {

	public BlockZinc(Material material) {
		super(material);
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":zinc_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("zincBlock");
	}

}

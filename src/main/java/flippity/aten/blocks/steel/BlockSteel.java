package flippity.aten.blocks.steel;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteel extends Block {

	public BlockSteel(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":steel_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("steelBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

package flippity.aten.blocks.tin;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTin extends Block {

	public BlockTin(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":tin_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("tinBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

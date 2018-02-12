package flippity.aten.blocks.aluminum;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAluminum extends Block {

	public BlockAluminum(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":aluminum_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("aluminumBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

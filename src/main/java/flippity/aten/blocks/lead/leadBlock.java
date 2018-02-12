package flippity.aten.blocks.lead;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class leadBlock extends Block {

	public leadBlock(Material material) {
		super(material);
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":lead_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("leadBlock");
	}

}

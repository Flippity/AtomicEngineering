package flippity.aten.blocks.lead;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLead extends Block {

	public BlockLead(Material material) {
		super(material);
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":lead_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("leadBlock");
	}

}

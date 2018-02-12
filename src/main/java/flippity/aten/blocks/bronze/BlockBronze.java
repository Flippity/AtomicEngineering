package flippity.aten.blocks.bronze;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBronze extends Block {

	public BlockBronze(Material material) {
		super(material);
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":bronze_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("bronzeBlock");
	}

}

package flippity.aten.blocks.brass;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBrass extends Block {
	public BlockBrass(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":brass_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("brassBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);

	}

}

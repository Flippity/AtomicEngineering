package flippity.aten.blocks.silver;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilver extends Block {

	public BlockSilver(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":silver_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("silverBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

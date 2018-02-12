package flippity.aten.blocks.osmium;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOsmium extends Block {

	public BlockOsmium(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":osmium_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("osmiumBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

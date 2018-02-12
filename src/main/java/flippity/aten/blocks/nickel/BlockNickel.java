package flippity.aten.blocks.nickel;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNickel extends Block {

	public BlockNickel(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":nickel_block");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("nickelBlock");
		this.setCreativeTab(Tabs.tabAtomBlocks);

	}

}

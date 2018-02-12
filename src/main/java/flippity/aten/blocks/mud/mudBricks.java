package flippity.aten.blocks.mud;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class mudBricks extends Block {

	public mudBricks(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":mudBricks");
		this.setResistance(2);
		this.setHardness(4);
		this.setStepSound(soundTypeStone);
		this.setBlockName("mudBrick");
		this.setCreativeTab(tabs.tabAtomBlocks);
	}

}

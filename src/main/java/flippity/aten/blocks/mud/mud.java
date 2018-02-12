package flippity.aten.blocks.mud;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Mud extends Block {

	public Mud(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":mud");
		this.setResistance(1);
		this.setHardness(3);
		this.setStepSound(soundTypeSand);
		this.setBlockName("mud");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

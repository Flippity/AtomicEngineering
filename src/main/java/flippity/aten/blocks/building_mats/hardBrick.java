package flippity.aten.blocks.building_mats;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class hardBrick extends Block {

	public hardBrick(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":hardbricks");
		this.setResistance(-1);
		this.setHardness(9);
		this.setStepSound(soundTypeStone);
		this.setBlockName("hardBrick");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

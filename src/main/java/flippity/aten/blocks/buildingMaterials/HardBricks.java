package flippity.aten.blocks.buildingMaterials;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HardBricks extends Block {

	public HardBricks(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":hardbricks");
		this.setResistance(-1);
		this.setHardness(9);
		this.setStepSound(soundTypeStone);
		this.setBlockName("hardBrick");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

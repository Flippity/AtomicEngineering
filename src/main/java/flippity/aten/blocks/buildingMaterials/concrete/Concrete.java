package flippity.aten.blocks.buildingMaterials.concrete;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Concrete extends Block {

	public Concrete(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":concrete");
		this.setResistance(6);
		this.setHardness(8);
		this.setStepSound(soundTypeStone);
		this.setBlockName("concrete");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

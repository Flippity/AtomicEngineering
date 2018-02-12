package flippity.aten.blocks.building_mats.concrete;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class concreteGray extends Block {

	public concreteGray(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":concreteGray");
		this.setResistance(6);
		this.setHardness(8);
		this.setStepSound(soundTypeStone);
		this.setBlockName("concreteGray");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

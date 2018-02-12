package flippity.aten.blocks.building_mats.concrete;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class concreteBlue extends Block {

	public concreteBlue(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":concreteBlue");
		this.setResistance(6);
		this.setHardness(8);
		this.setStepSound(soundTypeStone);
		this.setBlockName("concreteBlue");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

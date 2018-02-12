package flippity.aten.blocks.buildingMaterials.concrete;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ConcreteLightGray extends Block {

	public ConcreteLightGray(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":concreteLightGray");
		this.setResistance(6);
		this.setHardness(8);
		this.setStepSound(soundTypeStone);
		this.setBlockName("concreteLightGray");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

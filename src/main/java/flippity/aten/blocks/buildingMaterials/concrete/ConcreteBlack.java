package flippity.aten.blocks.buildingMaterials.concrete;

import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ConcreteBlack extends Block {

	public ConcreteBlack(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":concreteBlack");
		this.setResistance(6);
		this.setHardness(8);
		this.setStepSound(soundTypeStone);
		this.setBlockName("concreteBlack");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("itemPickaxe", 2);
	}

}

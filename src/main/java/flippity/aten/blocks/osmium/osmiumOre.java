package flippity.aten.blocks.osmium;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class osmiumOre extends Block {

	public osmiumOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":osmium_ore");
		this.setResistance(3);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("osmiumOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 1);

	}

}

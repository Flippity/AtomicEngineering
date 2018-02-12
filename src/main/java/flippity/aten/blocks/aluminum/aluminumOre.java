package flippity.aten.blocks.aluminum;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class aluminumOre extends Block {

	public aluminumOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":aluminum_ore");
		this.setResistance(3);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("aluminumOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 2);

	}

}

package flippity.aten.blocks.platinum;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrePlatinum extends Block {

	public OrePlatinum(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":platinum_ore");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeStone);
		this.setBlockName("platinumOre");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 3);
	}

}

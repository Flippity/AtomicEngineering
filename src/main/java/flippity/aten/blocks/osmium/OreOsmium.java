package flippity.aten.blocks.osmium;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreOsmium extends Block {

	public OreOsmium(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":osmium_ore");
		this.setResistance(3);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("osmiumOre");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 1);

	}

}

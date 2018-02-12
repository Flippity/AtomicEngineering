package flippity.aten.blocks.zinc;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreZinc extends Block {

	public OreZinc(Material material) {
		super(material);
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":zinc_ore");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("zincOre");
		this.setHarvestLevel("pickaxe", 1);
	}

}

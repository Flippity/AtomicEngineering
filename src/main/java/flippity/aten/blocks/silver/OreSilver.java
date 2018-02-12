package flippity.aten.blocks.silver;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreSilver extends Block {

	public OreSilver(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":silver_ore");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeStone);
		this.setBlockName("silverOre");
		this.setCreativeTab(Tabs.tabAtomBlocks);
	}

}

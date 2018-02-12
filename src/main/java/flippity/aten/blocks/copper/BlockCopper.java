package flippity.aten.blocks.copper;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopper extends Block {

	public BlockCopper(Material material) {
		super(material);
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHardness(5F);
		this.setResistance(7F);
		this.setBlockTextureName(Reference.MOD_ID + ":copper_block");
		this.setStepSound(soundTypeMetal);
		this.setBlockName("copperBlock");
	}

}

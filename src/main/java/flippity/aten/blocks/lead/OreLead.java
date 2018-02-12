package flippity.aten.blocks.lead;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreLead extends Block {

	public OreLead(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":lead_ore");
		this.setResistance(2);
		this.setHardness(4);
		this.setStepSound(soundTypeStone);
		this.setBlockName("leadOre");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 1);
	}
}
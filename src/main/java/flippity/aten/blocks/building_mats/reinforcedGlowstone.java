package flippity.aten.blocks.building_mats;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class reinforcedGlowstone extends Block {

	public reinforcedGlowstone(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":reinforced_glowstone");
		this.setResistance(5);
		this.setHardness(5);
		this.setStepSound(soundTypeStone);
		this.setBlockName("reinforcedGlowstone");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setLightLevel(0.935F);

	}

}

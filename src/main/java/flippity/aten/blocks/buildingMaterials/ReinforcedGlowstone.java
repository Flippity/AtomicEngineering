package flippity.aten.blocks.buildingMaterials;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ReinforcedGlowstone extends Block {

	public ReinforcedGlowstone(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":reinforced_glowstone");
		this.setResistance(5);
		this.setHardness(5);
		this.setStepSound(soundTypeStone);
		this.setBlockName("reinforcedGlowstone");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setLightLevel(0.935F);

	}

}

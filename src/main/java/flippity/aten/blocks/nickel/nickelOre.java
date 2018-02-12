package flippity.aten.blocks.nickel;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.AtomicEngineering;
import flippity.aten.lib.AluminumGen;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class nickelOre extends Block {

	public nickelOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":nickel_ore");
		this.setResistance(3);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("nickelOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 2);

	}

}

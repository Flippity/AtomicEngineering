package flippity.aten.blocks.copper;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class copperOre extends Block {

	public copperOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":copper_ore");
		this.setResistance(3);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("copperOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 1);

	}

}

package flippity.aten.blocks.nickel;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.AtomicEngineering;
import flippity.aten.lib.AluminumGen;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreNickel extends Block {

	public OreNickel(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":nickel_ore");
		this.setResistance(3);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("nickelOre");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setHarvestLevel("pickaxe", 2);

	}

}

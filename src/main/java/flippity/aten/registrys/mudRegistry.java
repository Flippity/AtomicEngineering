package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.blocks.building_mats.concrete.concrete;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import flippity.aten.blocks.mud.mud;
import flippity.aten.blocks.mud.mudBricks;

public class mudRegistry {
	public static Block mud;
	public static Block mudBricks;
	public static void initBlocks() {
		mud = new mud(Material.sand);
		GameRegistry.registerBlock(mud, "mud");
		mudBricks = new mudBricks(Material.rock);
		GameRegistry.registerBlock(mudBricks, "mudBricks");
	}
}

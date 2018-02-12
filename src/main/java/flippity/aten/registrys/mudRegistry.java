package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import flippity.aten.blocks.mud.Mud;
import flippity.aten.blocks.mud.MudBricks;

public class MudRegistry {
	public static Block mud;
	public static Block mudBricks;
	public static void initBlocks() {
		mud = new Mud(Material.sand);
		GameRegistry.registerBlock(mud, "mud");
		mudBricks = new MudBricks(Material.rock);
		GameRegistry.registerBlock(mudBricks, "mudBricks");
	}
}

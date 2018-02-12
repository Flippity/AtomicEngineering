package flippity.aten.utils;

import flippity.aten.ItemsBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class blockBreak {
	public static void breakBlock(Block block) {
		Blocks.log.setHarvestLevel("axe", 1);

	}
}

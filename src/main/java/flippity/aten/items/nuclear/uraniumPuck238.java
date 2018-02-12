package flippity.aten.items.nuclear;

import flippity.aten.AtomicEngineering;
import flippity.aten.ItemsBlocks;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import ibxm.Player;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class uraniumPuck238 extends Item {

	public uraniumPuck238() {
		super();
		this.setCreativeTab(tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":uraniumPuck");
		this.setUnlocalizedName("uraniumPuck238");

	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		{
			EntityPlayer player = (EntityPlayer) entity;
			boolean Radiation = player.inventory.hasItemStack(stack);

			if (Radiation == true) {
				player.addPotionEffect(new PotionEffect(ItemsBlocks.Radiation.getId(), 1500, 0));
			}
		}
	}
}
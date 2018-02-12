package flippity.aten.items.tools;

import flippity.aten.AtomicEngineering;
import flippity.aten.ItemsBlocks;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class antidote extends ItemFood {

	public antidote(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName("antidote");
		this.setTextureName(Reference.MOD_ID + ":antidote");
		this.setCreativeTab(tabs.tabAtomItems);
		this.setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		player.removePotionEffectClient(ItemsBlocks.Radiation.getId());
	}

}

package flippity.aten.utils;

import flippity.aten.ItemsBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Damage {
	Damage dam = new Damage();

	private void Damage(ItemStack itemStack, boolean equals, int damage, EntityPlayer player) {
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ItemsBlocks.hazmatHelmet)) {
			this.setDamage(itemStack, 50);
		}
		if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ItemsBlocks.hazmatChest)) {
			this.setDamage(itemStack, 50);
		}
		if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ItemsBlocks.hazmatPants)) {
			this.setDamage(itemStack, 50);
		}
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ItemsBlocks.hazmatBoots)) {
			this.setDamage(itemStack, 50);
		}
	}

	private void setDamage(ItemStack itemStack, int i) {

	}

}

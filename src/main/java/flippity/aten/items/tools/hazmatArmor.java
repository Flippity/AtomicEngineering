package flippity.aten.items.tools;

import org.lwjgl.util.Timer;

import flippity.aten.AtomicEngineering;
import flippity.aten.ItemsBlocks;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class hazmatArmor extends ItemArmor {
	public String textureName;

	public hazmatArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
		this.setCreativeTab(tabs.tabAtomItems);
		this.setMaxStackSize(1);
		this.setNoRepair();
		this.setMaxDamage(100000);
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String layer) {
		if ((itemstack.getItem() == ItemsBlocks.hazmatHelmet) || (itemstack.getItem() == ItemsBlocks.hazmatChest)
				|| (itemstack.getItem() == ItemsBlocks.hazmatBoots)) {
			return "aten:textures/armor/textureName_1.png";
		}
		if (itemstack.getItem() == ItemsBlocks.hazmatPants) {
			return "aten:textures/armor/textureName_2.png";
		}
		return null;
	}

	{
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ItemsBlocks.hazmatHelmet)
				&& player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(2).getItem().equals(ItemsBlocks.hazmatChest)
				&& player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(1).getItem().equals(ItemsBlocks.hazmatPants)
				&& player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem().equals(ItemsBlocks.hazmatBoots)) {
			if(player.isPotionActive(ItemsBlocks.Radiation) == true) {
				int duration = player.getActivePotionEffect(ItemsBlocks.Radiation).getDuration();
				if(duration > 0) {
					player.getCurrentArmor(3).damageItem(10, player);
					player.getCurrentArmor(2).damageItem(10, player);
					player.getCurrentArmor(1).damageItem(10, player);
					player.getCurrentArmor(0).damageItem(10, player);
					duration --;
				}
				player.removePotionEffectClient(ItemsBlocks.Radiation.getId());
			}
		}
	}
}

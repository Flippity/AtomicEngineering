package flippity.aten.lib;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import flippity.aten.ItemsBlocks;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class PotionEvent {
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent e) {
		if (e.entityLiving.isPotionActive(ItemsBlocks.Radiation)) {
			if (e.entityLiving.getActivePotionEffect(ItemsBlocks.Radiation).getDuration() == 0) {
				e.entityLiving.removePotionEffect(ItemsBlocks.Radiation.id);
				return;
			}

			else if (e.entityLiving.worldObj.rand.nextInt(10) == 0) {
				e.entityLiving.attackEntityFrom(DamageSource.generic, 2);
			}
		}
	}
}

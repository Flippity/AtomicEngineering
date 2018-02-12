package flippity.aten.items;

import flippity.aten.AtomicEngineering;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	public ItemBase(String registry) {
		this.setRegistryName(registry);
		this.setUnlocalizedName(AtomicEngineering.MOD_ID + ":" + registry);
	}
}

package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.aluminum.aluminumIngot;
import flippity.aten.items.magnets.magnetT1;
import flippity.aten.items.magnets.magnetT2;
import flippity.aten.items.magnets.magnetT3;
import net.minecraft.item.Item;

public class magnetRegistry {
	public static Item magnetTier1;
	public static Item magnetTier2;
	public static Item magnetTier3;

	public static void initItems() {
		magnetTier1 = new magnetT1();
		GameRegistry.registerItem(magnetTier1, "magnetTier1");
		magnetTier2 = new magnetT2();
		GameRegistry.registerItem(magnetTier2, "magnetTier2");
		magnetTier3 = new magnetT3();
		GameRegistry.registerItem(magnetTier3, "magnetTier3");
	}
}

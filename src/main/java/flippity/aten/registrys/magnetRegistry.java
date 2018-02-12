package flippity.aten.registrys;

import cpw.mods.fml.common.registry.GameRegistry;
import flippity.aten.items.aluminum.AluminumIngot;
import flippity.aten.items.magnets.MagnetT1;
import flippity.aten.items.magnets.MagnetT2;
import flippity.aten.items.magnets.MagnetT3;
import net.minecraft.item.Item;

public class MagnetRegistry {
	public static Item magnetTier1;
	public static Item magnetTier2;
	public static Item magnetTier3;

	public static void initItems() {
		magnetTier1 = new MagnetT1();
		GameRegistry.registerItem(magnetTier1, "magnetTier1");
		magnetTier2 = new MagnetT2();
		GameRegistry.registerItem(magnetTier2, "magnetTier2");
		magnetTier3 = new MagnetT3();
		GameRegistry.registerItem(magnetTier3, "magnetTier3");
	}
}

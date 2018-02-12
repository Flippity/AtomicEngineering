package flippity.aten.registrys;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class autoOreDict {
	public static boolean isItemStackOreDictionaryCompatible(ItemStack itemStack, String... names) {
		if (itemStack != null && names != null && names.length > 0) {
			String name = OreDictionary.getOreName(OreDictionary.getOreID(itemStack));

			for (String compareName : names) {
				if (name.equals(compareName)) {
					return true;
				}
			}
		}

		return false;
	}
}

package flippity.aten.registrys;

import flippity.aten.ItemsBlocks;
import flippity.aten.registrys.metalRegistry.Copper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs {
	public static CreativeTabs tabAtomItems = new CreativeTabs("Atomic Engineering Items") {
		@Override
		public Item getTabIconItem() {
			return Copper.copperDust;
		}
	};




	public static CreativeTabs tabAtomBlocks = new CreativeTabs("Atomic Engineering Blocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Copper.copperBlock);
		}
	};

}

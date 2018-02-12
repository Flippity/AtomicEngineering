package flippity.aten.items.misc.building_mats;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.item.Item;

public class hardbrick extends Item {

	public hardbrick() {
		super();
		this.setCreativeTab(tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":hard_brick");
		this.setUnlocalizedName("hardbrick");
	}

}

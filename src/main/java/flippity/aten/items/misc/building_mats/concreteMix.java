package flippity.aten.items.misc.building_mats;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.item.Item;

public class concreteMix extends Item {

	public concreteMix() {
		super();
		this.setCreativeTab(tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":concretemix");
		this.setUnlocalizedName("concreteMix");
	}

}

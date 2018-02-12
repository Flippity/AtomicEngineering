package flippity.aten.items.misc.buildingMaterials;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.item.Item;

public class ConcreteMix extends Item {

	public ConcreteMix() {
		super();
		this.setCreativeTab(Tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":concretemix");
		this.setUnlocalizedName("concreteMix");
	}

}

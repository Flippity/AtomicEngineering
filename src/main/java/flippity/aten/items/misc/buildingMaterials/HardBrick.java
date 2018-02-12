package flippity.aten.items.misc.buildingMaterials;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.item.Item;

public class HardBrick extends Item {

	public HardBrick() {
		super();
		this.setCreativeTab(Tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":hard_brick");
		this.setUnlocalizedName("hardbrick");
	}

}

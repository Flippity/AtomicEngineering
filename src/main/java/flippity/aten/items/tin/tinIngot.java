package flippity.aten.items.tin;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.constants.MetalColors;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TinIngot extends Item {

	public TinIngot() {
		super();
		this.setCreativeTab(Tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":ingot");
		this.setUnlocalizedName("tinIngot");
	}
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = MetalColors.tin;
    	return colorA;
    }
}

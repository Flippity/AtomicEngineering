package flippity.aten.items.aluminum;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.constants.metalColors;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class aluminumIngot extends Item {

	public aluminumIngot() {
		super();
		this.setCreativeTab(tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":ingot");
		this.setUnlocalizedName("aluminumIngot");
	}
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = metalColors.aluminum;
    	return colorA;
    }
}

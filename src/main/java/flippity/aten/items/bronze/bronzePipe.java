package flippity.aten.items.bronze;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.constants.MetalColors;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BronzePipe extends Item {

	public BronzePipe() {
		super();
		this.setCreativeTab(Tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":pipe");
		this.setUnlocalizedName("bronzePipe");
	}
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = MetalColors.bronze;
    	return colorA;
    }
}

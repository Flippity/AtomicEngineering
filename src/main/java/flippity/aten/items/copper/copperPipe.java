package flippity.aten.items.copper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.constants.MetalColors;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CopperPipe extends Item {

	public CopperPipe() {
		super();
		this.setCreativeTab(Tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":pipe");
		this.setUnlocalizedName("copperPipe");
	}
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = MetalColors.copper;
    	return colorA;
    }
}

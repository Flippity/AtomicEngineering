package flippity.aten.items.lead;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.constants.MetalColors;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LeadPlate extends Item {

	public LeadPlate() {
		super();
		this.setCreativeTab(Tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":plate");
		this.setUnlocalizedName("leadPlate");
	}
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = MetalColors.lead;
    	return colorA;
    }
}

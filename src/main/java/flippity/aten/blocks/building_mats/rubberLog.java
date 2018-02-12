package flippity.aten.blocks.building_mats;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class rubberLog extends Block {

	public rubberLog(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":log_rubber_empty");
		this.setResistance(2);
		this.setHardness(4);
		this.setStepSound(soundTypeWood);
		this.setBlockName("rubberLog");
		this.setCreativeTab(tabs.tabAtomBlocks);

	}
}
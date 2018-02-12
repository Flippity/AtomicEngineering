package flippity.aten.blocks.nuclear;

import flippity.aten.AtomicEngineering;
import flippity.aten.ItemsBlocks;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class uraniumOre extends Block {
	public uraniumOre(Material material) {
		super(material);
		this.setBlockTextureName(Reference.MOD_ID + ":uranium_ore");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeStone);
		this.setBlockName("uraniumOre");
		this.setCreativeTab(tabs.tabAtomBlocks);
	}
	
	  public void onEntityWalking(World world, int x, int y, int z, Entity entity){
	  ((EntityLivingBase) entity).addPotionEffect(new
	  PotionEffect(ItemsBlocks.Radiation.id, 300, 0, false));
	  
	  super.onEntityWalking(world, x, y, z, entity); }
	 
}
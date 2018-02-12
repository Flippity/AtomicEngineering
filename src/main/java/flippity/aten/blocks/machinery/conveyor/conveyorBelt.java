package flippity.aten.blocks.machinery.conveyor;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flippity.aten.AtomicEngineering;
import flippity.aten.ItemsBlocks;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.Tabs;
import flippity.aten.blocks.researchTables.ResearchTableEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ConveyorBelt extends BlockContainer{
	public ConveyorBelt() {
		super(Material.iron);
		this.setBlockName("conveyor");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setBlockTextureName(Reference.MOD_ID + ":conveyorParticles.png");
		this.setHardness(1F);
		this.setStepSound(soundTypeMetal);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 2.0F / 16F, 1F);
		this.setLightOpacity(0);
	}
	
	int dir;
	
	
	@Override
	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean isNormalCube() {
		return false;
	}
	
	
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    
   public void onUpdate(Entity entity){
    	if(entity instanceof EntityItem){
    		((EntityItem) entity).age = -32768;
    		if(dir == 0) {
    			((EntityItem) entity).motionZ = .1F;
    		}
    		if(dir == 1) {
    			((EntityItem) entity).motionX = -.1F;
    		}
    		if(dir == 2) {
    			((EntityItem) entity).motionZ = -.1F;
    		}
    		if(dir == 3) {
    			((EntityItem) entity).motionX = .1F;
    		}
    		
        	if(entity instanceof EntityPlayer){
        		if(dir == 0) {
        			((EntityPlayer) entity).motionZ = .1F;
        		}
        		if(dir == 1) {
        			((EntityPlayer) entity).motionX = -.1F;
        		}
        		if(dir == 2) {
        			((EntityPlayer) entity).motionZ = -.1F;
        		}
        		if(dir == 3) {
        			((EntityPlayer) entity).motionX = .1F;
        		}
        	}
    	}
    }
   
	  public void onEntityWalking(World world, int x, int y, int z, Entity entity){
		    if(entity instanceof EntityLivingBase){
		  		int meta = world.getBlockMetadata(x, y, z);
		  		if(meta == 0) {
		  			((EntityLivingBase) entity).moveFlying(x, y, z + -.2F/16);
		  		}
		  		if(meta == 1) {
		  			((EntityLivingBase) entity).moveFlying(x +.2F/16, y, z);
		  		}
		  		if(meta == 2) {
		  			((EntityLivingBase) entity).moveFlying(x, y, z +.2F/16);
		  		}
		  		if(meta == 3) {
		  			((EntityLivingBase) entity).moveFlying(x + -.2F/16, y, z);
		  		}
		  	}
	  super.onEntityWalking(world, x, y, z, entity);
}    
	  
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){


    	
    	//when mod collides
    	if(entity instanceof EntityItem){
    		int meta = world.getBlockMetadata(x, y, z);
    		((EntityItem) entity).age = -32768;
    		System.out.println(meta);
    		if(meta == 0) {
    			((EntityItem) entity).motionZ = .2F;
    		}
    		if(meta == 1) {
    			((EntityItem) entity).motionX = -.2F;
    		}
    		if(meta == 2) {
    			((EntityItem) entity).motionZ = -.2F;
    		}
    		if(meta == 3) {
    			((EntityItem) entity).motionX = .2F;
    		}
    		
    	}
      	if(entity instanceof EntityLivingBase){
    		int meta = world.getBlockMetadata(x, y, z);
	  		if(meta == 0) {
	  			((EntityLivingBase) entity).moveFlying(x, y, z + -.2F/16);
	  		}
	  		if(meta == 1) {
	  			((EntityLivingBase) entity).moveFlying(x +.2F/16, y, z);
	  		}
	  		if(meta == 2) {
	  			((EntityLivingBase) entity).moveFlying(x, y, z +.2F/16);
	  		}
	  		if(meta == 3) {
	  			((EntityLivingBase) entity).moveFlying(x + -.2F/16, y, z);
	  		}
    	}
    }
	  
	  
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new ConveyorBeltEntity();
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack)
    {
		//This gets the direction the player is facing as an int from 0 to 3
		dir = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
		System.out.println(dir);
		//You can use the block metadata to save the direction
		world.setBlockMetadataWithNotify(x, y, z, dir, 3);
		
		//Or you can save it in a tile entity if you are using one
		createNewTileEntity(world, world.getBlockMetadata(x, y, z));	
    }
}

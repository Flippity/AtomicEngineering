package flippity.aten.blocks.machinery.energy.turbine;

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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Turbine extends BlockContainer{
	public Turbine() {
		super(Material.iron);
		this.setBlockName("turbine");
		this.setCreativeTab(Tabs.tabAtomBlocks);
		this.setBlockTextureName(Reference.MOD_ID + ":turbineBlock");
		this.setHardness(2F);
		this.setStepSound(soundTypeMetal);
		this.setLightOpacity(0);
	}
	
	
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
	
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TurbineEntity();
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack)
    {
		//This gets the direction the player is facing as an int from 0 to 3
		int dir = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
		
		//You can use the block metadata to save the direction
		world.setBlockMetadataWithNotify(x, y, z, dir, 3);
		
		//Or you can save it in a tile entity if you are using one
		createNewTileEntity(world, world.getBlockMetadata(x, y, z));	
    }
}

package flippity.aten.blocks.machinery.energy.turbine;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class turbineRender extends TileEntitySpecialRenderer {

    //The model of your block
    public final turbineModel model;
    private static final ResourceLocation resourceloc = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/turbineBlock.png");

    public turbineRender() {
        this.model = new turbineModel();
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
    	
        ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
    	
    	
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y - 0.5F, (float) z + 0.5F);
		GL11.glPopMatrix();

		
		float time = 0;
		if(Minecraft.getMinecraft().theWorld != null)
		{
			time = (float)Minecraft.getMinecraft().theWorld.getWorldTime();
		}

		float mult = 5F; //adjust this value to get the desired rotation speed
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 7.0F/16F, (float) z + 0.5F);
		//if(steam.steam == true) {
		//	GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);
		//}
		GL11.glTranslatef(0, -15.0F/16F, 0);
		this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
    	
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();

        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!    
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);

        adjustLightFixture(te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord, te.blockType, null);

        //A reference to your Model file. Again, very important.
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    //Set the lighting stuff, so it changes it's brightness properly.       
    private void adjustLightFixture(World world, int i, int j, int k, Block block, Blocks blocks) {
        //  the if statement checking for if the world is null or not if not renders the block if null renders the item model
        // != means not equal
        if (world != null) {
            int dir = world.getBlockMetadata(i, j, k);
    		//steam.calculate(world, block, blocks, i, j, k);
            GL11.glPushMatrix();
            //This line actually rotates the renderer.
            GL11.glRotatef(dir * (90F), 0F, 1F, 0F);

            //this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            /*
             * Place your rendering code here.
             */

            GL11.glPopMatrix();
        }

    }
    
}

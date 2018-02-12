package flippity.aten.blocks.machinery.conveyor;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import flippity.aten.lib.proxies.ClientProxy;
import ibxm.Player;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class conveyorBeltRender extends TileEntitySpecialRenderer {
    //The model of your block
    public final conveyorBeltModel model;
    static int part = 0;
    public conveyorBeltRender() {
        this.model = new conveyorBeltModel();
    }

    public static void onUpdate() {
    		part ++;
        	if(part <= 15) {
        		ResourceLocation resourceloc = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor1.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
        	}
        	if(part <= 30 && part > 15) {
        		ResourceLocation resourceloc3 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor2.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc3);
        	}
        	if(part <= 45 && part > 30) {
        		ResourceLocation resourceloc4 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor3.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc4);
        	}
        	if(part <= 60 && part > 45) {
        		ResourceLocation resourceloc5 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor4.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc5);
        	}
        	if(part <= 75 && part > 60) {
        		ResourceLocation resourceloc6 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor5.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc6);
        	}
        	if(part <= 90 && part > 75) {
        		ResourceLocation resourceloc7 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor6.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc7);
        	}
        	if(part <= 105 && part > 90) {
        		ResourceLocation resourceloc8 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor7.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc8);
        	}
        	if(part <= 120 && part > 105) {
        		ResourceLocation resourceloc9 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor8.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc9);
        	}
        	if(part <= 135 && part > 120) {
        		ResourceLocation resourceloc10 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor9.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc10);
        	}
        	if(part <= 150 && part > 135) {
        		ResourceLocation resourceloc11 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor10.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc11);
        	}
        	if(part <= 165 && part > 150) {
        		ResourceLocation resourceloc12 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor11.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc12);
        	}
        	if(part <= 180 && part > 165) {
        		ResourceLocation resourceloc13 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor12.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc13);
        	}
        	if(part <= 195 && part > 180) {
        		ResourceLocation resourceloc14 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor13.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc14);
        	}
        	if(part <= 210 && part > 195) {
        		ResourceLocation resourceloc15 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor14.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc15);
        	}
        	if(part <= 225 && part > 210) {
        		ResourceLocation resourceloc16 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor15.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc16);

        	}
        	if(part <= 240 && part > 225) {
        		ResourceLocation resourceloc17 = new ResourceLocation(flippity.aten.lib.Reference.MOD_ID + ":" + "textures/blocks/conveyor16.png");
                ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc17);
                part = 0;
        	}
    	}

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {    	
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();
        onUpdate();
		float time = 0;
		if(Minecraft.getMinecraft().theWorld != null)
		{
			time = (float)Minecraft.getMinecraft().theWorld.getWorldTime();
		}
        

        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //This is the texture of your block. It's pathed to be the same place as your other blocks here.
        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!

        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);

        adjustLightFixture(te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord, te.blockType);

        //A reference to your Model file. Again, very important.
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
		}

    //Set the lighting stuff, so it changes it's brightness properly.       
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        //  the if statement checking for if the world is null or not if not renders the block if null renders the item model
        // != means not equal
        if (world != null) {
            int dir = world.getBlockMetadata(i, j, k);

            GL11.glPushMatrix();
            //This line actually rotates the renderer.
            GL11.glRotatef(dir * (90F), 0F, 1F, 0F);

            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            /*
             * Place your rendering code here.
             */

            GL11.glPopMatrix();
            
          //Stuff to get the dir int, from the block metadata or the tile or whatever
          //Check the dir and apply rotations

                  if (dir == 0)
                  {
                      GL11.glRotatef(-180F, 0.0F, 1.0F, 0.0F);
                  }

                  if (dir % 2 != 0)
                  {
                      GL11.glRotatef(dir * (-90F), 0.0F, 1.0F, 0.0F);
                  }

                  if (dir % 2 == 0)
                  {
                      GL11.glRotatef(dir * (-180F), 0.0F, 1.0F, 0.0F);
                  }
        }
        else {
            GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        }

    }
    
}

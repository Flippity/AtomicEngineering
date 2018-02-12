package flippity.aten.items.magnets;

import java.util.List;

import flippity.aten.AtomicEngineering;
import flippity.aten.lib.Reference;
import flippity.aten.registrys.tabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class magnetT3 extends Item {

	public magnetT3() {
		super();
		this.setCreativeTab(tabs.tabAtomItems);
		this.setTextureName(Reference.MOD_ID + ":magnetTier3");
		this.setUnlocalizedName("magnetT3");
	}

	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer ep)
    {
            double radius = 12;
            List<EntityItem> items = world.getEntitiesWithinAABB(EntityItem.class, ep.boundingBox.expand(radius, radius, radius));
            for(EntityItem it : items){
                double distX = ep.posX - it.posX;
                double distZ = ep.posZ - it.posZ;
                double distY = it.posY+1.5D - ep.posY;
                double dir = Math.atan2(distZ, distX);
                double speed = 5F / it.getDistanceToEntity(ep) * 0.5;

                if (distY<0)
                {
                    it.motionY += speed;
                }

                it.motionX = Math.cos(dir) * speed;
                it.motionZ = Math.sin(dir) * speed;
            }

        return is;
    }
	
}


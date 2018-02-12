package flippity.aten.lib;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class RadiationEffect extends Potion {
	public static final ResourceLocation icon = new ResourceLocation(Reference.MOD_ID + ":/textures/gui/inventory.png");

	public RadiationEffect(int id, boolean bad, int amp) {
		super(id, bad, amp);
	}

	public Potion setIconIndex(int x, int y) {
		super.setIconIndex(6, 0);
		return (Potion) this;
	}

	public int getStatusIconIndex() {
		ITextureObject texture = Minecraft.getMinecraft().renderEngine.getTexture(icon);
		Minecraft.getMinecraft().renderEngine.bindTexture(icon);

		return super.getStatusIconIndex();
	}

	public boolean isBadEffect() {
		return true;
	}

}

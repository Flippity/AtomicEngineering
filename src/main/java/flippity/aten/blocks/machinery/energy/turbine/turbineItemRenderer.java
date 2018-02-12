package flippity.aten.blocks.machinery.energy.turbine;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class TurbineItemRenderer implements IItemRenderer {

    private TurbineModel turbineModel;

    public TurbineItemRenderer() {
        turbineModel = new TurbineModel();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TurbineEntity(), 0.0D, 0.0D, 0.0D, 0.0f);
    }

}

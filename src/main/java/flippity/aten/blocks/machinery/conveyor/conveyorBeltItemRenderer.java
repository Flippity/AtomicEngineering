package flippity.aten.blocks.machinery.conveyor;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class conveyorBeltItemRenderer implements IItemRenderer {

    private conveyorBeltModel conveyorBeltModel;

    public conveyorBeltItemRenderer() {
        conveyorBeltModel = new conveyorBeltModel();
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
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new conveyorBeltEntity(), 0.0D, 0.0D, 0.0D, 1.0f);
    }

}

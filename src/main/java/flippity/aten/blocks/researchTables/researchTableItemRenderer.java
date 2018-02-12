package flippity.aten.blocks.researchTables;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class researchTableItemRenderer implements IItemRenderer {

    private researchTableModel researchTableModel;

    public researchTableItemRenderer() {
        researchTableModel = new researchTableModel();
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
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new researchTableEntity(), 0.0D, 0.0D, 0.0D, 0.0f);
    }

}

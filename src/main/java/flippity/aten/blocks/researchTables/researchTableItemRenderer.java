package flippity.aten.blocks.researchTables;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ResearchTableItemRenderer implements IItemRenderer {

    private ResearchTableModel researchTableModel;

    public ResearchTableItemRenderer() {
        researchTableModel = new ResearchTableModel();
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
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new ResearchTableEntity(), 0.0D, 0.0D, 0.0D, 0.0f);
    }

}

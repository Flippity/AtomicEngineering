package flippity.aten.blocks.machinery.conveyor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * conveyorBelt - Flippity
 * Created using Tabula 7.0.0
 */
public class ConveyorBeltModel extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape6;

    public ConveyorBeltModel() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.shape1 = new ModelRenderer(this, 11, 27);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(-8.0F, 23.0F, -8.0F, 16, 1, 16, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape2.addBox(-8.0F, 22.0F, -8.0F, 1, 1, 16, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape3.addBox(7.0F, 22.0F, -8.0F, 1, 1, 16, 0.0F);
        this.shape6 = new ModelRenderer(this, 37, 0);
        this.shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape6.addBox(-6.0F, 22.0F, -8.0F, 12, 1, 16, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape3.render(f5);
        this.shape6.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

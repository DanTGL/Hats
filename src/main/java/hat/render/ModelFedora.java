package hat.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

/**
 * ModelFedora - PixelEyeStudios
 * Created using Tabula 7.0.0
 */
public class ModelFedora extends ModelBiped {
    public ModelRenderer top;
    public ModelRenderer bottom;

    public ModelFedora() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.bottom = new ModelRenderer(this, 0, 8);
        this.bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottom.addBox(-5.0F, 0.0F, -5.0F, 10, 1, 10, 0.0F);
        this.top = new ModelRenderer(this, 0, 0);
        this.top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.top.addBox(-3.0F, -2.0F, -3.0F, 6, 2, 6, 0.0F);
        this.bipedHead.addChild(this.bottom);
        this.bipedHead.addChild(this.top);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        //this.top.rotateAngleX = f4;
        //this.top.rotateAngleY = this.bipedHead.rotateAngleY;
        //this.top.rotateAngleZ = this.bipedHead.rotateAngleZ;
        //this.top.rotateAngleY = entity.rotationYaw / 180.0f;
    	//this.copyModelAngles(this.bipedHead, this.top);
    	//this.top.render(f5);
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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

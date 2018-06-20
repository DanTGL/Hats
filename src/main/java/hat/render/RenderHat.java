package hat.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelSquid;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHat extends RenderLivingBase<EntityPlayerSP> {

	public RenderHat() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelSquid(), 1.0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPlayerSP entity) {
		return new ResourceLocation("textures/entity/squid.png");
	}
	
}

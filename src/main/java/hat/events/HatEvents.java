package hat.events;

import hat.render.ModelFedora;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class HatEvents {
	
	private static ModelFedora model;
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void renderHat(RenderPlayerEvent.Post event) {
		if (model == null) model = new ModelFedora();
		
		/*if (event.getEntityPlayer().isSneaking()) {
			model.doRender((EntityPlayerSP)event.getEntity(), event.getX(), event.getY() + 1.0f, event.getZ(), event.getEntityPlayer().rotationYaw, event.getPartialRenderTick());
		}*/
		
		//model.setRotationAngles(0.0f, 0.0f, 0.0f, event.getEntity().getRotationYawHead(), event.getEntity().rotationPitch, 1.0f, event.getEntity());
		//model.render(event.getEntity(), (float) event.getX(), (float) event.getY(), (float) event.getZ(), (float) event.getEntity().getLookVec().x, (float) event.getEntity().getLookVec().y, (float) event.getEntity().getLookVec().z);
		//model.render(event.getEntity(), (float) event.getX(), (float) event.getY(), (float) event.getZ(), (float) event.getEntity().getPositionEyes(event.getPartialRenderTick()).x, (float) event.getEntity().getPositionEyes(event.getPartialRenderTick()).y, (float) event.getEntity().getPositionEyes(event.getPartialRenderTick()).z);
		
		//model.doRender((EntityPlayerSP)event.getEntity(), event.getX(), event.getY() + 1.25f, event.getZ(), event.getEntity().getRotationYawHead(), event.getPartialRenderTick());
	}
	
}

package hat.handlers;

import hat.armor.ArmorHat;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class HatItems {
	
	public static Item hat;
	
	public static void init() {
		hat = new ArmorHat();
	}
	
	@SubscribeEvent
	public static void registryEvent(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(hat);
	}
	
}

package hat;

import hat.handlers.HatItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "hats", name = "Hats mod", version = "1.0 ALPHA")
public class HatMod {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		HatItems.init();
	}
	
}

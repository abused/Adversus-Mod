package proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import guiHandler.ModGuiHandler;
import net.emportex.magic.MagicMod;

public class CommonProxy {
	
	public void registerRenderThings() {
		
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}

	public void init(FMLInitializationEvent e) {
	    NetworkRegistry.INSTANCE.registerGuiHandler(MagicMod.instance, new ModGuiHandler());
	}

}
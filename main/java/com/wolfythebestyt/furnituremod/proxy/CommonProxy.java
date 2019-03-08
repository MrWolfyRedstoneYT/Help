package com.wolfythebestyt.furnituremod.proxy;

import com.wolfythebestyt.furnituremod.Main;
import com.wolfythebestyt.furnituremod.util.handlers.GuiHandler;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id) {}
	
	public void init(FMLInitializationEvent event) 
	{
	    NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
}

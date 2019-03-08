package com.wolfythebestyt.furnituremod.util.handlers;

import com.wolfythebestyt.furnituremod.blocks.TileEntityIronContainer;
import com.wolfythebestyt.furnituremod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityIronContainer.class, new ResourceLocation(Reference.MOD_ID + ":iron_container"));
	}
}

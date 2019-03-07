package com.wolfythebestyt.furnituremod.util.handlers;

import com.wolfythebestyt.furnituremod.blocks.GuiContainerBlock;
import com.wolfythebestyt.furnituremod.blocks.IronContainerBlock;
import com.wolfythebestyt.furnituremod.blocks.TileEntityIronContainer;
import com.wolfythebestyt.furnituremod.blocks.container.ContainerIronContainerBlock;
import com.wolfythebestyt.furnituremod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_IRON_CONTAINER) return new ContainerIronContainerBlock(player.inventory, (TileEntityIronContainer)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_IRON_CONTAINER) return new GuiContainerBlock(player.inventory, (TileEntityIronContainer)world.getTileEntity(new BlockPos(x,y,z)), player);

		return null;
	}
	
	public static void registerGUIs()
	{
	}
	
}

package com.wolfythebestyt.furnituremod.items;

import com.wolfythebestyt.furnituremod.Main;
import com.wolfythebestyt.furnituremod.init.ModItems;
import com.wolfythebestyt.furnituremod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.furnituretab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

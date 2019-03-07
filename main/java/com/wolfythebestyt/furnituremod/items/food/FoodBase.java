package com.wolfythebestyt.furnituremod.items.food;

import com.wolfythebestyt.furnituremod.Main;
import com.wolfythebestyt.furnituremod.init.ModItems;
import com.wolfythebestyt.furnituremod.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
	
	public FoodBase(String name, int amount, float saturation, boolean isPlayerFood) 
	{
		super(amount, saturation, isPlayerFood);
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

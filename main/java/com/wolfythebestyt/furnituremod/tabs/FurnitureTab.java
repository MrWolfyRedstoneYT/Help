package com.wolfythebestyt.furnituremod.tabs;

import com.wolfythebestyt.furnituremod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FurnitureTab extends CreativeTabs
{
	public FurnitureTab(String label) { super("furnituretab");
	this.setBackgroundImageName("knife.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.KNIFE);}
	}

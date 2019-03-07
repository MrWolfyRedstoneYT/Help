package com.wolfythebestyt.furnituremod.init;

import java.util.ArrayList;
import java.util.List;

import com.wolfythebestyt.furnituremod.items.ItemBase;
import com.wolfythebestyt.furnituremod.items.food.FoodBase;
import com.wolfythebestyt.furnituremod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_KNIFE = EnumHelper.addToolMaterial("material_knife", 2, 250, 6.0F, 2.0F, 14);
	
	//Items
	public static final Item BOTTLE_OF_MILK = new ItemBase("bottle_of_milk");
	public static final Item FLOUR = new ItemBase("flour");
	public static final Item CANDLE = new ItemBase("candle");
	
	//Food
	public static final Item CHERRY = new FoodBase("cherry", 4, 2.4f, false);
	
	//Tools
	public static final Item KNIFE = new ToolSword("knife", MATERIAL_KNIFE);
	}

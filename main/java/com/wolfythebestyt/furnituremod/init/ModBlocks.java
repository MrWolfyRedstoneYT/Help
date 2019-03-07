package com.wolfythebestyt.furnituremod.init;

import java.util.ArrayList;
import java.util.List;

import com.wolfythebestyt.furnituremod.blocks.BlockBase;
import com.wolfythebestyt.furnituremod.blocks.BlockDoorBase;
import com.wolfythebestyt.furnituremod.blocks.ChandelierBlock;
import com.wolfythebestyt.furnituremod.blocks.IronContainerBlock;
import com.wolfythebestyt.furnituremod.Main;
import com.wolfythebestyt.furnituremod.blocks.BirthdayCakeBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block BIRTHDAY_CAKE_BLOCK = new BirthdayCakeBlock("birthday_cake_block", Material.CAKE);
	public static final Block WHITE_COUCH = new BlockBase("white_couch", Material.CARPET);
	public static final Block BLACK_COUCH = new BlockBase("black_couch", Material.CARPET);
	public static final Block RED_COUCH = new BlockBase("red_couch", Material.CARPET);
	public static final Block STONE_CHAIR = new BlockBase("stone_chair", Material.ROCK);
	public static final Block MODERN_GlASS = new BlockBase("modern_glass", Material.GLASS);
	public static final Block IRON_TABLE = new BlockBase("iron_table", Material.IRON);
	public static final Block RED_CABINET = new BlockBase("red_cabinet", Material.CARPET);
	public static final Block GLASS_DOOR = new BlockDoorBase("glass_door", Material.GLASS, Main.furnituretab);
	public static final Block CHANDELIER = new ChandelierBlock("chandelier", Material.IRON);
	public static final Block Iron_Container = new IronContainerBlock("iron_container");
}

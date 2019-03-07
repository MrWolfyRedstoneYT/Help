package com.wolfythebestyt.furnituremod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BirthdayCakeBlock extends BlockBase 	
{

	public BirthdayCakeBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.CLOTH);
		setHardness(1.0F);
		setResistance(3.0F);
		setHarvestLevel("sword", 0);
		setLightLevel(2.0F);
		setLightOpacity(1);
		setBlockUnbreakable();
		
		
	}

}

package com.ciam.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class vgitter extends BlockPane{

	public vgitter() {
		super(Material.iron, true);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		//this.setBlockUnbreakable();
		this.setHardness(10000F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
	}

}

package com.ciam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class festerblock extends Block{

	public festerblock() {
		
		super(Material.rock);
		this.setUnlocalizedName("festerblock");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		//this.setBlockUnbreakable();
		this.setHardness(10000F);
	}

}

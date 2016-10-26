package com.CIAM.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Festerblock extends Block{

	public Festerblock() {
		
		super(Material.rock);
		this.setUnlocalizedName("festerblock");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setBlockUnbreakable();
	}

}

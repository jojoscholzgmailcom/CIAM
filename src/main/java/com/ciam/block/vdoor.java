package com.ciam.block;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

public class vdoor extends BlockDoor{

	public vdoor() {
		
		super(Material.iron);
		this.setHardness(10000F);
		this.setUnlocalizedName("vdoor");
	}
	
}
package com.ciam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class dienstmarke extends Item{
	
	public dienstmarke() {
		this.setUnlocalizedName("dienstmarke");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setMaxStackSize(65);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		
		
		return super.onItemRightClick(itemStackIn, worldIn, playerIn);
	}
}

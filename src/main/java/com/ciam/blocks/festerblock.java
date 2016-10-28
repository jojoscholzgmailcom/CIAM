package com.ciam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class festerblock extends Block{

	public festerblock() {
		
		super(Material.rock);
		this.setUnlocalizedName("festerblock");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		//this.setBlockUnbreakable();
		this.setHardness(10000F);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		if(!worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), -1).capabilities.isCreativeMode){
		worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), -1).addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Wow, du hast echt lange durch gehalten."));
		}
		super.onBlockDestroyedByPlayer(worldIn, pos, state);
	}
}

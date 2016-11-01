package com.ciam.tools;

import com.ciam.main.ciam;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class stock extends ItemSword {

	public stock() {
		super(ToolMaterial.WOOD);
		this.setUnlocalizedName("stock");
		this.setMaxDamage(1000);
		this.setDamage(new ItemStack(ciam.stock), 5);
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		player.setHealth(player.getHealth()+4);
		return super.onLeftClickEntity(stack, player, entity);
	}
}

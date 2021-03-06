package com.ciam.entity;

import com.ciam.main.ciam;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entitydieb extends EntityMob{
	ciam myCiam = new ciam();
	public Entitydieb(World worldIn) {
		super(worldIn);
		
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(2, this.field_175455_a);
        this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, Entitywache.class, 8.0F));
        this.tasks.addTask(15, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(14, new EntityAIWatchClosest(this, EntityVillager.class, 8.0F));
        this.tasks.addTask(16, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIAttackOnCollide(this, EntityIronGolem.class, 1.0D, true));
        this.tasks.addTask(13, new EntityAIAttackOnCollide(this, Entitywache.class, 1.0D, true));
        if(myCiam.getStimmung() > 25){
        	this.tasks.addTask(17, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        }
        this.tasks.addTask(8, new EntityAIMoveThroughVillage(this, 1.0D, false));
        if(myCiam.getStimmung() > 50){
        	this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        }
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, Entitywache.class, true));
        
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1D);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(45);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.33000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3);
		
		
	}
	@Override
	public void onDeath(DamageSource cause) {
		
			myCiam.setStimmung(25);
		
		super.onDeath(cause);
	}
}

package com.ciam.main;

import com.ciam.blocks.festerblock;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CIAM.MODID, version = CIAM.VERSION)
public class CIAM
{
    public static final String MODID = "CIAM";
    public static final String VERSION = "1.0";
    
    //Items
    
    //Blocks
    public static Block festerblock = new festerblock();
    @EventHandler
    public void preinit(FMLPreInitializationEvent preevent)
    {
		
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	//Block Registry
    	GameRegistry.registerBlock(festerblock, "festerblock");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(festerblock), 0, new ModelResourceLocation("CIAM:festerblock","inventory"));
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent postevent)
    {
		
    }
}

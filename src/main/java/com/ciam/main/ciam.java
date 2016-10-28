package com.ciam.main;

import com.ciam.block.*;
import com.ciam.items.*;
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

@Mod(modid = ciam.MODID, version = ciam.VERSION)
public class ciam
{
    public static final String MODID = "ciam";
    public static final String VERSION = "1.0";
    
    //Items
    public static Item dienstmarke = new dienstmarke();
    //Blocks
    public static Block festerblock = new festerblock();
    public static Block vgitter = new vgitter();
    @EventHandler
    public void preinit(FMLPreInitializationEvent preevent)
    {
		
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Item Registy
    	GameRegistry.registerItem(dienstmarke, "dienstmarke");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dienstmarke, 0, new ModelResourceLocation("ciam:dienstmarke","inventory"));
    	
    	//Block Registry
    	GameRegistry.registerBlock(festerblock, "festerblock");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(festerblock), 0, new ModelResourceLocation("ciam:festerblock","inventory"));
    	GameRegistry.registerBlock(vgitter, "vgitter");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(vgitter), 0, new ModelResourceLocation("ciam:vgitter","inventory"));
    	
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent postevent)
    {
		
    }
}

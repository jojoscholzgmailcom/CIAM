package com.ciam.main;

import com.ciam.block.*;
import com.ciam.items.*;
import com.ciam.render.*;
import com.ciam.tools.stock;
import com.ciam.util.EntityCreator;
import com.ciam.util.Events;
import com.ciam.blocks.festerblock;
import com.ciam.entity.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ciam.MODID, version = ciam.VERSION)
public class ciam
{
    public static final String MODID = "ciam";
    public static final String VERSION = "1.0";
    
    private int stimmung = 0;
    public int getStimmung() {
    	
		return stimmung;
	}

	public void setStimmung(int stimmung) {
		
		this.stimmung = stimmung;
	}

	@Instance
    public static ciam instance;
    //Items
    public static Item dienstmarke = new dienstmarke();
    
    //Blocks
    public static Block festerblock = new festerblock();
    public static Block vgitter = new vgitter();
    
    //Waffen
    public static Item stock = new stock();
    
    
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
    	GameRegistry.registerItem(stock, "stock");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(stock, 0, new ModelResourceLocation("ciam:stock","inventory"));
    	
    	
    	//Block Registry
    	GameRegistry.registerBlock(festerblock, "festerblock");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(festerblock), 0, new ModelResourceLocation("ciam:festerblock","inventory"));
    	GameRegistry.registerBlock(vgitter, "vgitter");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(vgitter), 0, new ModelResourceLocation("ciam:vgitter","inventory"));
    	//GameRegistry.registerBlock(vdoor, "vdoor");
    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(vdoor), 0, new ModelResourceLocation("ciam:vdoor","inventory"));
    	
    	
    	EntityCreator.createEntity(Entitydieb.class, new Renderdieb(), "dieb", EnumCreatureType.MONSTER, 1, 0, 0, new BiomeGenBase[]{}, 0x000000, 0xFFFFFF, true);
    	EntityCreator.createEntity(Entitywache.class, new Renderwache(), "wache", EnumCreatureType.CREATURE, 1, 0, 0, new BiomeGenBase[]{}, 0xFFFFF, 0x000000, true);
    	
    	
    	MinecraftForge.EVENT_BUS.register(new Events());
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent postevent)
    {
		
    }
}

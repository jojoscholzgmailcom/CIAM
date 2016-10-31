package com.ciam.util;

import com.ciam.main.ciam;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityCreator {
	
	public static final void createEntity(Class entityClass, Render render, String entityName,EnumCreatureType type, int probability, int minspawn, int maxspawn, BiomeGenBase[] biomes, int solidcolor, int spotcolor, boolean hasspawnegg){
		int id = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityRegistry.registerModEntity(entityClass, entityName, id, ciam.instance, 64, 1, true);
		EntityRegistry.addSpawn(entityName, probability, minspawn, maxspawn, type, biomes);
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
		if(hasspawnegg){
			EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidcolor, spotcolor));
		}
	}
}

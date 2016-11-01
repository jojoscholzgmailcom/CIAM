package com.ciam.render;

import com.ciam.main.ciam;
import com.ciam.model.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class Renderwache extends RenderLiving{

	public Renderwache() {
		super(Minecraft.getMinecraft().getRenderManager(),new Modelwache(),0);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return new ResourceLocation("ciam", "textures/entity/wache.png");
	}

}

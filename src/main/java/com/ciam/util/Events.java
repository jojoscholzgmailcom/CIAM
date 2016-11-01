package com.ciam.util;

import com.ciam.main.ciam;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {

	public Events() {
		
	}

	@SubscribeEvent
	public void onplayersleep(PlayerSleepInBedEvent event){
		if(!event.entityPlayer.worldObj.provider.isDaytime() && !event.entityPlayer.worldObj.isRemote){
			event.entityPlayer.addChatComponentMessage(new ChatComponentText("Gute Nacht"));
		}
	}
	
	@SubscribeEvent
	public void onRenderGameOverlay(RenderGameOverlayEvent event){
		if(!event.isCancelable() && event.type == ElementType.EXPERIENCE){
			Minecraft mc = Minecraft.getMinecraft();
			ciam myCiam = new ciam();
			if(!mc.thePlayer.capabilities.isCreativeMode){
				int posx = event.resolution.getScaledWidth()/2 - 220;
				int posy = event.resolution.getScaledHeight()- 250;
				
				mc.renderEngine.bindTexture(new ResourceLocation("ciam:textures/gui/Stimmung.png"));
				if(myCiam.getStimmung()< 25){
					mc.ingameGUI.drawTexturedModalRect(posx, posy, 0, 0, 35, 40);
				}
				if(myCiam.getStimmung()>= 25 && myCiam.getStimmung() < 50){
					mc.ingameGUI.drawTexturedModalRect(posx, posy, 35, 0, 35, 40);
				}
				if(myCiam.getStimmung()>= 50 && myCiam.getStimmung() < 75){
					mc.ingameGUI.drawTexturedModalRect(posx, posy, 70, 0, 35, 40);
				}
				if(myCiam.getStimmung()>= 75){
					mc.ingameGUI.drawTexturedModalRect(posx, posy, 102, 0, 35, 40);
				}
				
				//mc.ingameGUI.drawTexturedModalRect(posx, posy, 0, 0, 83, 6);
				//mc.ingameGUI.drawTexturedModalRect(posx+1, posy+1, 0, 7, myCiam.getStimmung() , 3);
			}
		}
	}
}

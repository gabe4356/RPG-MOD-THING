package com.gabe.rpg;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.gabe.rpg.init.RPGBlocks;
import com.gabe.rpg.init.RPGCrafting;
import com.gabe.rpg.init.RPGItems;
import com.gabe.rpg.items.ItemRubyPlant;
import com.gabe.rpg.proxy.CommonProxy;
import com.gabe.rpg.world.RPGWorldGen;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ServerRPGMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final RPGTab tabRPG = new RPGTab("tabRPG");
	public static final MONEYTab tabMONEY = new MONEYTab("tabMONEY");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RPGBlocks.init();
		RPGBlocks.register();
		RPGItems.init();
		RPGItems.register();
	    RPGCrafting.initCrafting();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	    GameRegistry.registerWorldGenerator(new RPGWorldGen(), 0);
	    
	  	if(event.getSide() == Side.CLIENT) 
	  	{
		    RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		    //Ruby Seeds
		    renderItem.getItemModelMesher().register(RPGItems.ItemRubyPlant, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((ItemRubyPlant) RPGItems.ItemRubyPlant).getName(), "inventory"));
	     
		    //Copper Seeds
		    renderItem.getItemModelMesher().register(RPGItems.ItemCopperPlant, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((ItemRubyPlant) RPGItems.ItemCopperPlant).getName(), "inventory"));
	     
	      }    
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}

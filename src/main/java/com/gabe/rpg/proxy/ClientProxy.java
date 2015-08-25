package com.gabe.rpg.proxy;


import com.gabe.rpg.init.RPGBlocks;
import com.gabe.rpg.init.RPGItems;

public class ClientProxy extends CommonProxy
{
	public static int renderPass;

	@Override
	public void registerRenders()
	{
		RPGItems.registerRenders();
		RPGBlocks.registerRenders();
	}

}
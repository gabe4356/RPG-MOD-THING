package com.gabe.rpg.items;

import net.minecraft.item.ItemSpade;

import com.gabe.rpg.ServerRPGMod;

public class ItemRPGShovel extends ItemSpade {

	public ItemRPGShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ServerRPGMod.tabRPG);
		this.setUnlocalizedName(unlocalizedName);
	}
}

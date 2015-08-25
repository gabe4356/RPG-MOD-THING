package com.gabe.rpg.items;

import net.minecraft.item.ItemHoe;

import com.gabe.rpg.ServerRPGMod;

public class ItemRPGHoe extends ItemHoe {

	public ItemRPGHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ServerRPGMod.tabRPG);
		this.setUnlocalizedName(unlocalizedName);
	}
}

package com.gabe.rpg.items;

import net.minecraft.item.ItemAxe;

import com.gabe.rpg.ServerRPGMod;

public class ItemRPGAxe extends ItemAxe {

	public ItemRPGAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ServerRPGMod.tabRPG);
		this.setUnlocalizedName(unlocalizedName);
	}
}

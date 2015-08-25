package com.gabe.rpg.items;

import net.minecraft.item.ItemPickaxe;

import com.gabe.rpg.ServerRPGMod;

public class ItemRPGPickaxe extends ItemPickaxe {

	public ItemRPGPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ServerRPGMod.tabRPG);
		this.setUnlocalizedName(unlocalizedName);
	}
}

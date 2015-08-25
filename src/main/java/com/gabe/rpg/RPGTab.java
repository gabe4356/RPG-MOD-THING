package com.gabe.rpg;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class RPGTab extends CreativeTabs {
	
	public RPGTab(String label) {
		super(label);
		this.setBackgroundImageName("RPG.png");
		this.hasSearchBar();
	}
	
	@Override
	public Item getTabIconItem() {
		return Items.diamond;
	}

}

package com.gabe.rpg;

import com.gabe.rpg.init.RPGItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MONEYTab extends CreativeTabs {
	
	public MONEYTab(String label) {
		super(label);
		this.setBackgroundImageName("RPG.png");
		this.hasSearchBar();
	}
	
	@Override
	public Item getTabIconItem() {
		return RPGItems.$1;
	}

}

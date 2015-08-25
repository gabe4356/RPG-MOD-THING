package com.gabe.rpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gabe.rpg.Reference;

public class AmethystOre extends Block {
	public AmethystOre(){
		super(Material.iron);
		setHarvestLevel("pickaxe",3);
	}
}
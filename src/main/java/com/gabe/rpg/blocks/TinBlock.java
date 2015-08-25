package com.gabe.rpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gabe.rpg.Reference;

public class TinBlock extends Block {
	public TinBlock(){
		super(Material.iron);
		setHarvestLevel("pickaxe",1);
	}
}
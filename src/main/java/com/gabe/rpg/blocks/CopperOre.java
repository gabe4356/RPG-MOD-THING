package com.gabe.rpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gabe.rpg.Reference;

public class CopperOre extends Block {
	public CopperOre(){
		super(Material.iron);
		setHarvestLevel("pickaxe",2);
	}
}
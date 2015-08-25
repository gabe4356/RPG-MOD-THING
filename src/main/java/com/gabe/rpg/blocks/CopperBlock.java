package com.gabe.rpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gabe.rpg.Reference;

public class CopperBlock extends Block {
	public CopperBlock(){
		super(Material.iron);
		setHarvestLevel("pickaxe",1);
	}
}
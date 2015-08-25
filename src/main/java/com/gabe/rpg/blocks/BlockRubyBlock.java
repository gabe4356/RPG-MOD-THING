package com.gabe.rpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gabe.rpg.Reference;

public class BlockRubyBlock extends Block {
	public BlockRubyBlock(){
		super(Material.iron);
		setHarvestLevel("pickaxe",2);
	}
}
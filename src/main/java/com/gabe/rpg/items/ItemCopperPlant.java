package com.gabe.rpg.items;
  
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gabe.rpg.Reference;
import com.gabe.rpg.ServerRPGMod;

public class ItemCopperPlant extends Item implements IPlantable
{ 
    
    /**
     * The type of block this seed turns into (wheat or pumpkin stems for instance)
     */
    private Block crops;

    /** BlockID of the block the seeds can be planted on. */
    private Block soilBlockID;
    
    private String name = "CopperSeeds";
    
    public ItemCopperPlant(Block par2, Block par3)
    {
  		setUnlocalizedName("CopperSeeds");
  		this.setCreativeTab(ServerRPGMod.tabRPG); 
  		
  		this.crops = par2;
  		this.soilBlockID = par3;
  		
  		GameRegistry.registerItem(this, name);
    }     

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (side != EnumFacing.UP)
        {
            return false;
        }
        else if (!playerIn.canPlayerEdit(pos.offset(side), side, stack))
        {
            return false;
        }
        else if (worldIn.getBlockState(pos).getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
        {
            worldIn.setBlockState(pos.up(), this.crops.getDefaultState());
            --stack.stackSize;
            return true;
        }
        else
        {
            return false;
        }
    }


    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return this.crops == net.minecraft.init.Blocks.nether_wart ? net.minecraftforge.common.EnumPlantType.Nether : net.minecraftforge.common.EnumPlantType.Crop;
    }

    @Override
    public net.minecraft.block.state.IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return this.crops.getDefaultState();
    }
    
  	public String getName()
  	{
  		return name;
  	}  
  
}
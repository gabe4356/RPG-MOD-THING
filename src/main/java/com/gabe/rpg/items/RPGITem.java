package com.gabe.rpg.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.gabe.rpg.ServerRPGMod;
import com.gabe.rpg.util.NBTTagHelper;

public class RPGITem<World> extends Item {

	private static final ItemStack Orgrinite = null;

	public RPGITem(String unlocalizedName) {
        this.setMaxStackSize(1);
		this.setCreativeTab(ServerRPGMod.tabRPG);
		this.setUnlocalizedName(unlocalizedName);
		EntityPlayer playerIn = null;
		boolean advanced = false;

			
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
		if(stack.getTagCompound() != null && stack.getTagCompound().hasKey("SummonEntry")) {
			tooltip.add(EnumChatFormatting.GOLD + "Summons a ");
		}
	}



	private void addInformation(ItemStack orgrinite2, EntityPlayer playerIn,
			String string, boolean advanced) {
		// TODO Auto-generated method stub
		
	}
}

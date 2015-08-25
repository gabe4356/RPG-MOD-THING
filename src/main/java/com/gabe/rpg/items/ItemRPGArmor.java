package com.gabe.rpg.items;

import net.minecraft.item.ItemArmor;

import com.gabe.rpg.ServerRPGMod;


public class ItemRPGArmor extends ItemArmor {

	public ItemRPGArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(ServerRPGMod.tabRPG);
		this.setUnlocalizedName(unlocalizedName);
	}

//	@Override
//	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
//		if (itemStack.getItem() == RPGItems.RubyHelmet) {
////			this.effectPlayer(player, Potion.nightVision, 0);
//		}
//		if (itemStack.getItem() == RPGItems.RubyChestplate) {
////			this.effectPlayer(player, Potion.digSpeed, 0);
//		}
//		if (itemStack.getItem() == RPGItems.RubyLeggings) {
////			this.effectPlayer(player, Potion.moveSpeed, 0);
//		}
//		if (itemStack.getItem() == RPGItems.RubyBoots) {
////			this.effectPlayer(player, Potion.jump, 1);
//		}
//
//		if (this.isWearingFullSet(player, RPGItems.RubyHelmet, RPGItems.RubyChestplate, RPGItems.RubyLeggings, RPGItems.RubyBoots)) {
////			this.effectPlayer(player, Potion.regeneration, 1);

//	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
//		//Always effect for 8 seconds, then refresh
//		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
//			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
//	}
//
//	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
//		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
//				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
//				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
//				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
//	}
}

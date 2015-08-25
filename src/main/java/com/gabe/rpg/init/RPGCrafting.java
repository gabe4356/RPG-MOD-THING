package com.gabe.rpg.init;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public final class RPGCrafting {

	public static void initCrafting() {
		/** FIRST RELEASE **/
		//CRAFTING
				GameRegistry.addRecipe(new ItemStack(RPGBlocks.RubyBlock),"###","###","###", '#', RPGItems.Ruby);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyAxe), "## ", "#X ", " X ", '#', RPGItems.Ruby, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyPickaxe), "###", " X ", " X ", '#', RPGItems.Ruby, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubySpade), " # ", " X ", " X ", '#', RPGItems.Ruby, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyHoe), "## ", " X ", " X ", '#', RPGItems.Ruby, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubySword), " # ", " # ", " X ", '#', RPGItems.Ruby, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyHelmet), "###", "# #", '#', RPGItems.Ruby);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyChestplate), "# #", "###", "###", '#', RPGItems.Ruby);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyLeggings), "###", "# #", "# #", '#', RPGItems.Ruby);
				GameRegistry.addRecipe(new ItemStack(RPGItems.RubyBoots), "# #", "# #", '#', RPGItems.Ruby);
				GameRegistry.addRecipe(new ItemStack(RPGBlocks.OrgriniteBlock),"###","###","###", '#', RPGItems.Orgrinite);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgAxe), "## ", "#X ", " X ", '#', RPGItems.Orgrinite, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgPickaxe), "###", " X ", " X ", '#', RPGItems.Orgrinite, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgSpade), " # ", " X ", " X ", '#', RPGItems.Orgrinite, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgHoe), "## ", " X ", " X ", '#', RPGItems.Orgrinite, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgSword), " # ", " # ", " X ", '#', RPGItems.Orgrinite, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgHelmet), "###", "# #", '#', RPGItems.Orgrinite);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgChestplate), "# #", "###", "###", '#', RPGItems.Orgrinite);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgLeggings), "###", "# #", "# #", '#', RPGItems.Orgrinite);
				GameRegistry.addRecipe(new ItemStack(RPGItems.OrgBoots), "# #", "# #", '#', RPGItems.Orgrinite);
				GameRegistry.addRecipe(new ItemStack(RPGItems.Build), "X#X", "X#X", "TTT", 'X', Blocks.log, '#', RPGItems.Ruby, 'T', Items.diamond);
				GameRegistry.addRecipe(new ItemStack(RPGItems.IBuild), "X#X", "X#X", "TTT", 'X', Blocks.iron_block, '#', RPGItems.Ruby, 'T', Items.diamond);
				GameRegistry.addRecipe(new ItemStack(RPGBlocks.CopperBlock),"## ", "## ", '#', RPGItems.Copper);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperAxe), "## ", "#X ", " X ", '#', RPGItems.Copper, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperPickaxe), "###", " X ", " X ", '#', RPGItems.Copper, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperSpade), " # ", " X ", " X ", '#', RPGItems.Copper, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperHoe), "## ", " X ", " X ", '#', RPGItems.Copper, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperSword), " # ", " # ", " X ", '#', RPGItems.Copper, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperHelmet), "###", "# #", '#', RPGItems.Copper);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperChestplate), "# #", "###", "###", '#', RPGItems.Copper);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperLeggings), "###", "# #", "# #", '#', RPGItems.Copper);
				GameRegistry.addRecipe(new ItemStack(RPGItems.CopperBoots), "# #", "# #", '#', RPGItems.Copper);
				GameRegistry.addRecipe(new ItemStack(RPGItems.Penny), " # ", '#', RPGItems.Copper);
				GameRegistry.addRecipe(new ItemStack(RPGItems.Nickel), "##", '#', RPGItems.Penny);
				GameRegistry.addRecipe(new ItemStack(RPGItems.Dime), "##", '#', RPGItems.Nickel);
				GameRegistry.addRecipe(new ItemStack(RPGItems.Quarter), "##X", '#', RPGItems.Dime, 'X', RPGItems.Nickel);
				GameRegistry.addRecipe(new ItemStack(RPGItems.DollarCoin), "###", " # ", '#', RPGItems.Quarter);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$1), " # ", '#', RPGItems.DollarCoin);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$2), "##", '#', RPGItems.$1);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$5), "###", "## ", '#', RPGItems.$1);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$10), "##", '#', RPGItems.$5);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$20), "##", '#', RPGItems.$10);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$50), "##X", '#', RPGItems.$20, 'X', RPGItems.$10);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$100), "XX", 'X', RPGItems.$50);
				GameRegistry.addRecipe(new ItemStack(RPGItems.$500), "XXX", "XX ", 'X', RPGItems.$100);
				GameRegistry.addRecipe(new ItemStack(RPGBlocks.AmethystBlock),"###", "###", "###", '#', RPGItems.Amethyst);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystAxe), "## ", "#X ", " X ", '#', RPGItems.Amethyst, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystPickaxe), "###", " X ", " X ", '#', RPGItems.Amethyst, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystSpade), " # ", " X ", " X ", '#', RPGItems.Amethyst, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystHoe), "## ", " X ", " X ", '#', RPGItems.Amethyst, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystSword), " # ", " # ", " X ", '#', RPGItems.Amethyst, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystHelmet), "###", "# #", '#', RPGItems.Amethyst);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystChestplate), "# #", "###", "###", '#', RPGItems.Amethyst);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystLeggings), "###", "# #", "# #", '#', RPGItems.Amethyst);
				GameRegistry.addRecipe(new ItemStack(RPGItems.AmethystBoots), "# #", "# #", '#', RPGItems.Amethyst);
				GameRegistry.addRecipe(new ItemStack(RPGItems.WoodHelmet), "###", "# #", '#', Blocks.log);
				GameRegistry.addRecipe(new ItemStack(RPGItems.WoodChestplate), "# #", "###", "###", '#', Blocks.log);
				GameRegistry.addRecipe(new ItemStack(RPGItems.WoodLeggings), "###", "# #", "# #", '#',Blocks.log);
				GameRegistry.addRecipe(new ItemStack(RPGItems.WoodBoots), "# #", "# #", '#', Blocks.log);
				GameRegistry.addRecipe(new ItemStack(RPGBlocks.TinBlock),"###", "###", "###", '#', RPGItems.Tin);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinAxe), "## ", "#X ", " X ", '#', RPGItems.Tin, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinPickaxe), "###", " X ", " X ", '#', RPGItems.Tin, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinSpade), " # ", " X ", " X ", '#', RPGItems.Tin, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinHoe), "## ", " X ", " X ", '#', RPGItems.Tin, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinSword), " # ", " # ", " X ", '#', RPGItems.Tin, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinHelmet), "###", "# #", '#', RPGItems.Tin);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinChestplate), "# #", "###", "###", '#', RPGItems.Tin);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinLeggings), "###", "# #", "# #", '#', RPGItems.Tin);
				GameRegistry.addRecipe(new ItemStack(RPGItems.TinBoots), "# #", "# #", '#', RPGItems.Tin);
				GameRegistry.addRecipe(new ItemStack(RPGBlocks.BronzeBlock),"###", "###", "###", '#', RPGItems.Bronze);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeAxe), "## ", "#X ", " X ", '#', RPGItems.Bronze, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzePickaxe), "###", " X ", " X ", '#', RPGItems.Bronze, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeSpade), " # ", " X ", " X ", '#', RPGItems.Bronze, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeHoe), "## ", " X ", " X ", '#', RPGItems.Bronze, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeSword), " # ", " # ", " X ", '#', RPGItems.Bronze, 'X', Items.stick);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeHelmet), "###", "# #", '#', RPGItems.Bronze);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeChestplate), "# #", "###", "###", '#', RPGItems.Bronze);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeLeggings), "###", "# #", "# #", '#', RPGItems.Bronze);
				GameRegistry.addRecipe(new ItemStack(RPGItems.BronzeBoots), "# #", "# #", '#', RPGItems.Bronze);
				GameRegistry.addRecipe(new ItemStack(RPGItems.ItemRubyPlant), "#X#", "YYY", "###", '#', RPGItems.Ruby, 'X', Items.wheat_seeds, 'Y', RPGItems.Orgrinite);
			
				
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Ruby, 9), RPGBlocks.RubyBlock);
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Orgrinite, 9), RPGBlocks.OrgriniteBlock);
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Copper, 4), RPGBlocks.CopperBlock);
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Amethyst, 9), RPGBlocks.AmethystBlock);
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Tin, 9), RPGBlocks.TinBlock);
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Bronze), RPGItems.Tin, RPGItems.Copper);
				GameRegistry.addShapelessRecipe(new ItemStack(RPGItems.Bronze, 9), RPGBlocks.CopperBlock);
				
				//or: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});
//FURNACE
				GameRegistry.addSmelting(RPGBlocks.OrgriniteOre, new ItemStack(RPGItems.Orgrinite), 10.0f);
				GameRegistry.addSmelting(RPGBlocks.RubyOre, new ItemStack(RPGItems.Ruby), 3.0f);
				GameRegistry.addSmelting(RPGBlocks.CopperOre, new ItemStack(RPGItems.Copper), 1.0f);
				GameRegistry.addSmelting(RPGBlocks.AmethystOre, new ItemStack(RPGItems.Amethyst), 5.0f);
				GameRegistry.addSmelting(RPGBlocks.TinBlock, new ItemStack(RPGItems.Tin), 2.0f);
	}
}

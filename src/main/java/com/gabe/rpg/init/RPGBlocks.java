package com.gabe.rpg.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gabe.rpg.Reference;
import com.gabe.rpg.ServerRPGMod;
import com.gabe.rpg.blocks.AmethystBlock;
import com.gabe.rpg.blocks.AmethystOre;
import com.gabe.rpg.blocks.BlockRubyBlock;
import com.gabe.rpg.blocks.BlockRubyOre;
import com.gabe.rpg.blocks.BronzeBlock;
import com.gabe.rpg.blocks.CopperBlock;
import com.gabe.rpg.blocks.CopperOre;
import com.gabe.rpg.blocks.OrgriniteBlock;
import com.gabe.rpg.blocks.OrgriniteOre;
import com.gabe.rpg.blocks.TinBlock;
import com.gabe.rpg.blocks.TinOre;
import com.gabe.rpg.items.CopperPlant;
import com.gabe.rpg.items.RubyPlant;

public class RPGBlocks {
	
	public static Block RubyBlock;
	public static Block RubyOre;
	public static Block OrgriniteBlock;
	public static Block OrgriniteOre;
	public static Block CopperBlock;
	public static Block CopperOre;
	public static Block AmethystBlock;
	public static Block AmethystOre;
	public static Block TinBlock;
	public static Block TinOre;
	public static Block BronzeBlock;
    public static com.gabe.rpg.items.RubyPlant RubyPlant;  
    public static com.gabe.rpg.items.CopperPlant CopperPlant;
//	public static Block teleporter;
	
	public static Fluid Flarinite = new Fluid("Flarinite");
	
	public static void init()
	{
		// First Release:
		RubyBlock = new BlockRubyBlock().setStepSound(Block.soundTypeMetal).setUnlocalizedName("RubyBlock").setCreativeTab(ServerRPGMod.tabRPG).setHardness(3);
		RubyOre = new BlockRubyOre().setStepSound(Block.soundTypeStone).setUnlocalizedName("RubyOre").setCreativeTab(ServerRPGMod.tabRPG).setHardness(4);
		OrgriniteBlock = new OrgriniteBlock().setStepSound(Block.soundTypeMetal).setUnlocalizedName("OrgBlock").setCreativeTab(ServerRPGMod.tabRPG).setHardness(6);
		OrgriniteOre = new OrgriniteOre().setStepSound(Block.soundTypeStone).setUnlocalizedName("OrgOre").setCreativeTab(ServerRPGMod.tabRPG).setHardness(5);
		CopperBlock = new CopperBlock().setStepSound(Block.soundTypeMetal).setUnlocalizedName("CopperBlock").setCreativeTab(ServerRPGMod.tabRPG).setHardness(3);
		CopperOre = new CopperOre().setStepSound(Block.soundTypeStone).setUnlocalizedName("CopperOre").setCreativeTab(ServerRPGMod.tabRPG).setHardness(4);
		AmethystBlock = new AmethystBlock().setStepSound(Block.soundTypeMetal).setUnlocalizedName("AmethystBlock").setCreativeTab(ServerRPGMod.tabRPG).setHardness(4);
		AmethystOre = new AmethystOre().setStepSound(Block.soundTypeStone).setUnlocalizedName("AmethystOre").setCreativeTab(ServerRPGMod.tabRPG).setHardness(4);
		TinBlock = new TinBlock().setStepSound(Block.soundTypeMetal).setUnlocalizedName("TinBlock").setCreativeTab(ServerRPGMod.tabRPG).setHardness(4);
		TinOre = new TinOre().setStepSound(Block.soundTypeMetal).setUnlocalizedName("TinOre").setCreativeTab(ServerRPGMod.tabRPG).setHardness(5);
		BronzeBlock = new BronzeBlock().setStepSound(Block.soundTypeMetal).setUnlocalizedName("BronzeBlock").setCreativeTab(ServerRPGMod.tabRPG).setHardness(6);
        RubyPlant = new RubyPlant();   
        CopperPlant = new CopperPlant();
//		teleporter = new BlockTeleporter(Material.cloth).setUnlocalizedName("coord_transporter").setCreativeTab(ServerRPGMod.tabRPG);
	}
	
	
	public static void register()
	{
		/** FIRST RELEASE **/
		GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(OrgriniteBlock, OrgriniteBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(OrgriniteOre, OrgriniteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CopperBlock, CopperBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CopperOre, CopperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(AmethystBlock, AmethystBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(AmethystOre, AmethystOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TinBlock, TinBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TinOre, TinOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BronzeBlock, BronzeBlock.getUnlocalizedName().substring(5));
//		GameRegistry.registerBlock(teleporter, teleporter.getUnlocalizedName().substring(5));
		
		FluidRegistry.registerFluid(Flarinite);
		
	}
	
	public static void registerRenders()
	{
		// First Release:
		registerRender(RubyBlock);
		registerRender(RubyOre);
		registerRender(OrgriniteBlock);
		registerRender(OrgriniteOre);
		registerRender(CopperBlock);
		registerRender(CopperOre);
		registerRender(AmethystBlock);
		registerRender(AmethystOre);
		registerRender(TinBlock);
		registerRender(TinOre);
		registerRender(BronzeBlock);
//		registerRender(teleporter);
	}
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}


		
	}
	
	
	

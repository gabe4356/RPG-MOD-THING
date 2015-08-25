package com.gabe.rpg.world;

import java.util.Random;

import com.gabe.rpg.init.RPGBlocks;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class RPGWorldGen implements IWorldGenerator {
	//@formatter:off

	private WorldGenerator RubyOre; 	// Generates Sapphire Ore (used in Overworld)
	private WorldGenerator OrgOre;
	private WorldGenerator CopperOre;
	private WorldGenerator AmethystOre;
	private WorldGenerator TinOre;
//	private WorldGenerator BlueMatterOre;
//	private WorldGenerator IlluminiteOre;

	//@formatter:on

	public RPGWorldGen() {

		this.RubyOre = new WorldGenMinable(RPGBlocks.RubyOre.getDefaultState(), 3);
		this.OrgOre = new WorldGenMinable(RPGBlocks.OrgriniteOre.getDefaultState(), 4);
		this.CopperOre = new WorldGenMinable(RPGBlocks.CopperOre.getDefaultState(), 20);
		this.AmethystOre = new WorldGenMinable(RPGBlocks.AmethystOre.getDefaultState(), 3);
		this.TinOre = new WorldGenMinable(RPGBlocks.TinOre.getDefaultState(), 10);
//		this.BlueMatterOre = new WorldGenSingleMineable(SSMBlocks.BlueMatterOre.getDefaultState());
//		this.IlluminiteOre = new WorldGenMinable(SSMBlocks.IlluminiteOre.getDefaultState(), 5, BlockHelper.forBlock(Blocks.end_stone));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			// Numbers: Amount per Chunk, min Height, Max Height
			this.runGenerator(this.RubyOre, world, random, chunkX, chunkZ, 10, 0, 10);
			this.runGenerator(this.OrgOre, world, random, chunkX, chunkZ, 8, 0, 10);
			this.runGenerator(this.CopperOre, world, random, chunkX, chunkZ, 17, 0, 57);
			this.runGenerator(this.AmethystOre, world, random, chunkX, chunkZ, 9, 0, 15);
			this.runGenerator(this.TinOre, world, random, chunkX, chunkZ, 15, 0, 47);
//			this.runGenerator(this.BlueMatterOre, world, random, chunkX, chunkZ, 10, 0, 20);
			break;
		case -1: // Nether
			break;
		case 1: // End
//			this.runGenerator(this.IlluminiteOre, world, random, chunkX, chunkZ, 10, 0, 80);
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}

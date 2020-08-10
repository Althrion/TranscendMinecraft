package com.althrion.mod.classes.world.dimension.first;

import com.althrion.mod.classes.world.gen.DimOneChunks;
import com.althrion.mod.init.BiomeInit;
import com.althrion.mod.init.DimensionInit;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class Shadowlands extends WorldProvider {

	@Override
	protected void init() {
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.SHADOW_BIOME);
		this.doesWaterVaporize = true;
		this.hasSkyLight = false;
		
	}
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionInit.SHADOWLANDS;
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}
	
	@Override
	public boolean canCoordinateBeSpawn(int x, int z) {
		return super.canCoordinateBeSpawn(x, z);
	}
	
	@Override
	public WorldSleepResult canSleepAt(EntityPlayer player, BlockPos pos) {
		return WorldSleepResult.DENY;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new DimOneChunks(world, false, this.getSeed());
	}
	
}

package com.althrion.mod.classes.world.biome;

import com.althrion.mod.init.BlockInit;

import net.minecraft.world.biome.Biome;

public class ShadowBiome extends Biome {

	public ShadowBiome() {
		super(new BiomeProperties("Shadowlands").setBaseHeight(0.12f).setHeightVariation(0.1f).setTemperature(-1.0f).setRainDisabled());
		
		topBlock = BlockInit.S_GRASS.getDefaultState();
		fillerBlock = BlockInit.S_DIRT.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
	}

	@Override
	public boolean canRain() {
		return false;
	}
	
	@Override
	public boolean getEnableSnow() {
		return false;
	}
	
}

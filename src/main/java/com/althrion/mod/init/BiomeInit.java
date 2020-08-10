package com.althrion.mod.init;

import com.althrion.mod.classes.world.biome.ShadowBiome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {

	public static final Biome SHADOW_BIOME = new ShadowBiome();
	
	public static void registerBiomes() {
		
		initBiome(SHADOW_BIOME, "Shadowlands", BiomeType.ICY, Type.COLD, Type.DEAD);
		
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 0));
		BiomeManager.addSpawnBiome(biome);
		
		return biome;
	}
	
}

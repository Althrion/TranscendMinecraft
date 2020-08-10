package com.althrion.mod.init;

import com.althrion.mod.classes.world.dimension.first.Shadowlands;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
		public static final DimensionType SHADOWLANDS = DimensionType.register("Shadowlands", "_shadowlands", 2556113, Shadowlands.class, false);
		
		public static void registerDimensions() {
			DimensionManager.registerDimension(2556113, SHADOWLANDS);			
		}
}

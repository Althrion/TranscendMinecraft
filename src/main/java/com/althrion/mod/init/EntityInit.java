package com.althrion.mod.init;

import com.althrion.mod.Main;
import com.althrion.mod.util.Ref;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	public static void registerEntities() {
		
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range) {
		EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID+":"+name), entity, name, id, Main.instance, range, 1, true);
	}
	
}

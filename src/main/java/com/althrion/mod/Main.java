package com.althrion.mod;


import com.althrion.mod.proxy.CommonProxy;
import com.althrion.mod.util.Ref;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	
	
	@SidedProxy(clientSide = Ref.CLIENT, serverSide = Ref.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {}
	
}

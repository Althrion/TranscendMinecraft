package com.althrion.mod.classes.items.amethystine;

import com.althrion.mod.Main;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Glaciem extends Item implements IHasModel{

	public Glaciem() {
		setUnlocalizedName("glaciem");
		setRegistryName("glaciem");
		setCreativeTab(CreativeTabs.MATERIALS);
		
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
}

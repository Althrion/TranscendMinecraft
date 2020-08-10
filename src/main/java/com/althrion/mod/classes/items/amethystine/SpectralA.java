package com.althrion.mod.classes.items.amethystine;

import com.althrion.mod.Main;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpectralA extends Item implements IHasModel{

	public SpectralA() {
		setUnlocalizedName("amethyst_1");
		setRegistryName("amethist_1");
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}

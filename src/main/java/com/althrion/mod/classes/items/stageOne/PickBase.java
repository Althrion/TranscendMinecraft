package com.althrion.mod.classes.items.stageOne;

import com.althrion.mod.Main;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class PickBase extends ItemPickaxe implements IHasModel {

	public PickBase(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

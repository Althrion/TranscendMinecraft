package com.althrion.mod.classes.items.stageOne;

import java.util.Set;

import com.althrion.mod.Main;
import com.althrion.mod.init.BlockInit;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

public class AxeBase extends ItemTool implements IHasModel{

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(BlockInit.DED_WOOD);
	
	public AxeBase(String name, ToolMaterial material) {
		super(material, EFFECTIVE_ON);
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

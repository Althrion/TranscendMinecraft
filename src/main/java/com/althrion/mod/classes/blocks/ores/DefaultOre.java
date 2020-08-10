package com.althrion.mod.classes.blocks.ores;

import com.althrion.mod.Main;
import com.althrion.mod.init.BlockInit;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class DefaultOre extends Block implements IHasModel{

	public DefaultOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");		
	}

}

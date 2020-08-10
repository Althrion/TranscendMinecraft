package com.althrion.mod.classes.blocks.solid;

import java.util.Random;

import com.althrion.mod.Main;
import com.althrion.mod.init.BlockInit;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;

public class StageOne extends Block implements IHasModel{

	public StageOne(String name, Material materialIn, int x, String tool) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel(tool, x);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this.getUnlocalizedName() == "s_grass" ? Item.getItemFromBlock(BlockInit.S_DIRT) : Item.getItemFromBlock(this);
	}
		
}

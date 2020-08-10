package com.althrion.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.althrion.mod.classes.blocks.solid.StageOne;
import com.althrion.mod.classes.blocks.unobtainable.DimOnePortal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	
	
	//Building
	public static final Block DED_WOOD = new StageOne("ded_wood", Material.WOOD, 2, "axe");
	public static final Block S_DIRT = new StageOne("s_dirt", Material.GROUND, 0, "spade");
	public static final Block S_GRASS = new StageOne("s_grass", Material.GROUND, 1, "spade");
	public static final Block S_STONE = new StageOne("s_stone", Material.GROUND, 2, "pickaxe");
	
	//Drops
	
	
	//Unobtainable
	public static DimOnePortal PORTAL_1 = new DimOnePortal();
	
}

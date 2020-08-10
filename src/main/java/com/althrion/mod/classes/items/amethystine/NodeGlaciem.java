package com.althrion.mod.classes.items.amethystine;

import com.althrion.mod.Main;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class NodeGlaciem extends Item implements IHasModel {

	private int y;
	
	public NodeGlaciem(String name, int x) {
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.MISC);
		y = x;
				
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack item = playerIn.getHeldItem(handIn);
		for(int i=0 ; i<y ; i++) {
		playerIn.addItemStackToInventory(new ItemStack(ItemInit.GLACIEM));
		item.setCount(item.getCount()-1);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
}

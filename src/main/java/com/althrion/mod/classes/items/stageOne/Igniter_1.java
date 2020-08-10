package com.althrion.mod.classes.items.stageOne;

import com.althrion.mod.Main;
import com.althrion.mod.init.BlockInit;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Igniter_1 extends Item implements IHasModel{

	public Igniter_1() {
		setUnlocalizedName("igniter_1");
		setRegistryName("igniter_1");
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		int x = pos.getX(), y = pos.getY(), z = pos.getZ();
		int side = facing.getIndex();
		
		switch(side) {
		case 0:
		default:
			y--;
			break;
		case 1:
			y++;
			break;
		case 2:
			z--;
			break;
		case 3:
			z++;
			break;
		case 4:
			x--;
			break;
		case 5:
			x++;
			break;
		}
		
		if(!player.canPlayerEdit(new BlockPos(x, y, z), facing, player.getHeldItem(hand))) {
			return EnumActionResult.FAIL;
		}
		
		IBlockState location = worldIn.getBlockState(new BlockPos(x, y, z));
		if(location == Blocks.AIR.getDefaultState()) {
			BlockInit.PORTAL_1.trySpawnPortal(worldIn, new BlockPos(x, y, z));
		}
		player.getHeldItem(hand).shrink(1);
		return EnumActionResult.SUCCESS;
	}
	
}

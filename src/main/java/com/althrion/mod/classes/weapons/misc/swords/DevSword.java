package com.althrion.mod.classes.weapons.misc.swords;

import com.althrion.mod.Main;
import com.althrion.mod.init.ItemInit;
import com.althrion.mod.util.IHasModel;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class DevSword extends ItemSword implements IHasModel {

	public DevSword() {
		super(new EnumHelper().addToolMaterial("dev", 9000, 1, 500.0f, 99999999999.9f, 1337));
		setUnlocalizedName("devsword");
		setRegistryName("devsword");
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}

package com.althrion.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.althrion.mod.classes.items.amethystine.Glaciem;
import com.althrion.mod.classes.items.amethystine.NodeGlaciem;
import com.althrion.mod.classes.items.amethystine.SpectralA;
import com.althrion.mod.classes.items.stageOne.AxeBase;
import com.althrion.mod.classes.items.stageOne.Igniter_1;
import com.althrion.mod.classes.items.stageOne.PickBase;
import com.althrion.mod.classes.weapons.misc.swords.DevSword;
import com.althrion.mod.util.Ref;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Ingots
	public static final Item AMETHYST_1 = new SpectralA();
	public static final Item GLACIEM = new Glaciem();
	public static final Item GLACIEM_S = new NodeGlaciem("glaciem_s", 10);
	public static final Item GLACIEM_M = new NodeGlaciem("glaciem_m", 40);
	public static final Item GLACIEM_L = new NodeGlaciem("glaciem_l", 100);
	
	//OtherMaterials
	public static final ToolMaterial DED = new EnumHelper().addToolMaterial("ded", 2, 120, 5.3f, 2.5f, 18);
	public static final ArmorMaterial DEED = new EnumHelper().addArmorMaterial("deed", Ref.MODID + ":deed", 20, new int[] {2, 6, 6, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0f);
		
	//Tools
	public static final Item PICK_1 = new PickBase("pick_1", DED);
	public static final Item AXE_1 = new AxeBase("axe_1", DED);
	
	//Weapons
	public static final Item DEV_SWORD = new DevSword();
		
	//Misc
	public static final Item IGNITER_1 = new Igniter_1();
	

	//Armor
	
	
}

package sam54123.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import sam54123.mod.objects.armor.ArmorBase;
import sam54123.mod.objects.items.ItemBase;
import sam54123.mod.objects.tools.ToolAxe;
import sam54123.mod.objects.tools.ToolHoe;
import sam54123.mod.objects.tools.ToolPickaxe;
import sam54123.mod.objects.tools.ToolShovel;
import sam54123.mod.objects.tools.ToolSword;
import sam54123.mod.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID+":copper", 13, new int[]{2, 5, 5, 2}, 1, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	//tools
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER);
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER);
	
	//armor
	public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", ARMOR_COPPER, 1,EntityEquipmentSlot.FEET);
	
}

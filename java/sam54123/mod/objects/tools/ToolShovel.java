package sam54123.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import sam54123.mod.Main;
import sam54123.mod.init.ItemInit;
import sam54123.mod.util.IHasModel;

public class ToolShovel extends ItemSpade implements IHasModel 
{
	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

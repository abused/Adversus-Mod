package net.emportex.magic;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemGodpic extends ItemPickaxe {

	protected ItemGodpic(ToolMaterial material) {
		super(material);
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("§aThey say this was the God's most Powerful Tool");
	}
 }


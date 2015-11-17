package net.emportex.magic;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWizfly extends Item {

	public ItemWizfly(){
		this.setMaxStackSize(1);
		this.setFull3D();
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Creative Flight When in inventory!");
	par3List.add("Right Click to Activate");
	par3List.add("Deactivates on signout/leaving world");
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	par3EntityPlayer.capabilities.allowFlying = true;
		 return par1ItemStack;
	}
}

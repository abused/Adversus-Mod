package net.emportex.magic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Bedrockingot extends Item {

	public Bedrockingot(){
		this.setMaxStackSize(18);
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2000, 0));
			 return par1ItemStack;
	}
	
}

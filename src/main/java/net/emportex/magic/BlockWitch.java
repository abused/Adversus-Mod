package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWitch extends Block {

	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;
	
	protected BlockWitch(Material material) {
		super(material);
	    this.setCreativeTab(MagicMod.tabDecoration);
	    this.setHardness(4.0F);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	    
	public void registerBlockIcons(IIconRegister icon){
		Side0 = icon.registerIcon("mm:bottom0");
		Side1 = icon.registerIcon("mm:top1");
		Side2 = icon.registerIcon("mm:sideall");
		Side3 = icon.registerIcon("mm:sideall");
		Side4 = icon.registerIcon("mm:sideall");
		Side5 = icon.registerIcon("mm:sideall");
	}
	
	public IIcon getIcon(int side, int meta){
		if(side == 0){
			return Side0;
		}else if(side == 1){
			return Side1;
		}else if(side == 2){
			return Side2;
		}else if(side == 3){
			return Side3;
		}else if(side == 4){
			return Side4;
		}else if(side == 5){
			return Side5;
		}
		return null;
	}
	
}

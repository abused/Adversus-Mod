package TileEntity;

import java.util.List;

import net.emportex.magic.MagicMod;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class StoneBlock extends BlockContainer {

	private final String textureLocation = "mm:stone"; 

	public StoneBlock()
	{
	super(Material.rock);
	this.setCreativeTab(MagicMod.tabMagic);
	this.setCreativeTab(MagicMod.tabDecoration);
	this.setHardness(3.0F);
	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}	

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
	int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

	if (l == 0)
	{
	par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
	}

	if (l == 1)
	{
	par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
	}

	if (l == 2)
	{
	par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
	}

	if (l == 3)
	{
	par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
	}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var1)
	{
	return new StoneBlockEntity();
	}

	@Override
	public int getRenderType()
	{
	return -1;
	}

	@Override
	public boolean isOpaqueCube()
	{
	return false;
	}

	public boolean renderAsNormalBlock()
	{
	return false;
	}

	public void registerBlockIcons(IIconRegister icon)
	{
	this.blockIcon = icon.registerIcon(textureLocation);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("�aFeatures will be addes soon");
	}
}

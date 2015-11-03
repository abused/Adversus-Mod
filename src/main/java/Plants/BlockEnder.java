package Plants;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.emportex.magic.MagicMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockEnder extends RecipeBlockCrops
{
	
	public BlockEnder()
    {
        this.setBlockName("BlockEnder");
        this.setBlockTextureName("mm:enderseeds");
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
     // DEBUG
     System.out.println("BlockEnder getItemDropped()");
        return (MagicMod.EnderDust);
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want

          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon("mm:plant1");
          iIcon[1] = parIIconRegister.registerIcon("mm:plant1");
          iIcon[2] = parIIconRegister.registerIcon("mm:ender2");
          iIcon[3] = parIIconRegister.registerIcon("mm:ender2");  
          iIcon[4] = parIIconRegister.registerIcon("mm:plant3");  
          iIcon[5] = parIIconRegister.registerIcon("mm:plant3");  
          iIcon[6] = parIIconRegister.registerIcon("mm:plant3");  
          iIcon[7] = parIIconRegister.registerIcon("mm:ender1");  


    }
}

package Plants;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.emportex.magic.MagicMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockShinre extends RecipeBlockCrops 
{
	
	public BlockShinre()
    {
        this.setBlockName("BlockShinre");
        this.setBlockTextureName("mm:shinre");
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
     System.out.println("BlockShinre getItemDropped()");
        return (MagicMod.Shinrebansho);
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want

          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon("mm:shinre");
          iIcon[1] = parIIconRegister.registerIcon("mm:shinre_stage_1");
          iIcon[2] = parIIconRegister.registerIcon("mm:shinre_stage_2");
          iIcon[3] = parIIconRegister.registerIcon("mm:shinre_stage_3");
          iIcon[4] = parIIconRegister.registerIcon("mm:shinre_stage_3");
          iIcon[5] = parIIconRegister.registerIcon("mm:shinre_stage_5");
          iIcon[6] = parIIconRegister.registerIcon("mm:shinre_stage_6");
          iIcon[7] = parIIconRegister.registerIcon("mm:shinre_stage_7");
    }
}

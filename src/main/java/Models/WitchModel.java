package Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WitchModel extends ModelBase
{
  //fields
    ModelRenderer bottom1;
    ModelRenderer bottom2;
    ModelRenderer base;
    ModelRenderer top_1;
    ModelRenderer top_2;
    ModelRenderer top_3;
  
  public WitchModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      bottom1 = new ModelRenderer(this, 0, 0);
      bottom1.addBox(0F, 0F, 0F, 16, 1, 16);
      bottom1.setRotationPoint(-8F, 23F, -8F);
      bottom1.setTextureSize(64, 64);
      bottom1.mirror = true;
      setRotation(bottom1, 0F, 0F, 0F);
      bottom2 = new ModelRenderer(this, 0, 0);
      bottom2.addBox(0F, 0F, 0F, 16, 1, 16);
      bottom2.setRotationPoint(-8F, 22F, -8F);
      bottom2.setTextureSize(64, 64);
      bottom2.mirror = true;
      setRotation(bottom2, 0F, 0F, 0F);
      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 10, 12, 10);
      base.setRotationPoint(-5F, 10F, -5F);
      base.setTextureSize(64, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      top_1 = new ModelRenderer(this, 0, 0);
      top_1.addBox(0F, 0F, 0F, 16, 1, 16);
      top_1.setRotationPoint(-8F, 9F, -8F);
      top_1.setTextureSize(64, 64);
      top_1.mirror = true;
      setRotation(top_1, 0F, 0F, 0F);
      top_2 = new ModelRenderer(this, 0, 0);
      top_2.addBox(0F, 0F, 0F, 16, 1, 16);
      top_2.setRotationPoint(-8F, 8F, -8F);
      top_2.setTextureSize(64, 64);
      top_2.mirror = true;
      setRotation(top_2, 0F, 0F, 0F);
      top_3 = new ModelRenderer(this, 0, 0);
      top_3.addBox(0F, 0F, 0F, 4, 1, 4);
      top_3.setRotationPoint(-2F, 7F, -2F);
      top_3.setTextureSize(64, 64);
      top_3.mirror = true;
      setRotation(top_3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    bottom1.render(f5);
    bottom2.render(f5);
    base.render(f5);
    top_1.render(f5);
    top_2.render(f5);
    top_3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

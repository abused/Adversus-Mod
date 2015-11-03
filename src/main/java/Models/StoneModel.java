package Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StoneModel extends ModelBase
{
  //fields
    ModelRenderer middle;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
  
  public StoneModel()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      middle = new ModelRenderer(this, 0, 0);
      middle.addBox(0F, 0F, 0F, 3, 12, 3);
      middle.setRotationPoint(-1F, 12F, -1F);
      middle.setTextureSize(32, 32);
      middle.mirror = true;
      setRotation(middle, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 12, 4);
      Shape1.setRotationPoint(-6F, 13F, -5F);
      Shape1.setTextureSize(32, 32);
      Shape1.mirror = true;
      setRotation(Shape1, -0.0879894F, 2.342252F, 0.6320364F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 12, 4);
      Shape2.setRotationPoint(6F, 14F, 8F);
      Shape2.setTextureSize(32, 32);
      Shape2.mirror = true;
      setRotation(Shape2, -0.0879894F, 2.342252F, -0.669215F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 12, 4);
      Shape3.setRotationPoint(0F, 4F, 0F);
      Shape3.setTextureSize(32, 32);
      Shape3.mirror = true;
      setRotation(Shape3, -0.0879894F, 2.342252F, -0.669215F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 12, 4);
      Shape4.setRotationPoint(1F, 4F, 2F);
      Shape4.setTextureSize(32, 32);
      Shape4.mirror = true;
      setRotation(Shape4, -0.0879894F, 2.342252F, 0.6320364F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    middle.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
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

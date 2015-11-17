package TileEntity.Mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelClam extends ModelBase
{
  //fields
    ModelRenderer bottom1;
    ModelRenderer bottom2;
    ModelRenderer bottom3;
    ModelRenderer top1;
    ModelRenderer top2;
    ModelRenderer top3;
    ModelRenderer Shape1;
  
  public ModelClam()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      bottom1 = new ModelRenderer(this, 0, 0);
      bottom1.addBox(0F, 0F, 0F, 4, 1, 9);
      bottom1.setRotationPoint(-2F, 23F, -4F);
      bottom1.setTextureSize(64, 32);
      bottom1.mirror = true;
      setRotation(bottom1, 0F, 0F, 0F);
      bottom2 = new ModelRenderer(this, 0, 0);
      bottom2.addBox(0F, 0F, 0F, 2, 1, 9);
      bottom2.setRotationPoint(-3F, 23F, 5F);
      bottom2.setTextureSize(64, 32);
      bottom2.mirror = true;
      setRotation(bottom2, 3.141593F, 0.2230717F, 0.5948578F);
      bottom3 = new ModelRenderer(this, 0, 0);
      bottom3.addBox(0F, 0F, 0F, 2, 1, 9);
      bottom3.setRotationPoint(3F, 22F, 5F);
      bottom3.setTextureSize(64, 32);
      bottom3.mirror = true;
      setRotation(bottom3, -3.141593F, -0.1904371F, 2.67686F);
      top1 = new ModelRenderer(this, 0, 0);
      top1.addBox(0F, 0F, 0F, 4, 1, 9);
      top1.setRotationPoint(-2F, 18F, -3F);
      top1.setTextureSize(64, 32);
      top1.mirror = true;
      setRotation(top1, -0.5091404F, 0F, 0F);
      top2 = new ModelRenderer(this, 0, 0);
      top2.addBox(0F, 0F, 0F, 2, 1, 9);
      top2.setRotationPoint(1F, 23F, 5F);
      top2.setTextureSize(64, 32);
      top2.mirror = true;
      setRotation(top2, 2.658271F, -0.0371786F, 0.2974289F);
      top3 = new ModelRenderer(this, 0, 0);
      top3.addBox(0F, 0F, 0F, 2, 1, 9);
      top3.setRotationPoint(-1F, 22F, 5F);
      top3.setTextureSize(64, 32);
      top3.mirror = true;
      setRotation(top3, -2.621092F, 0.0698132F, 2.788396F);
      Shape1 = new ModelRenderer(this, 31, 0);
      Shape1.addBox(0F, 0F, 0F, 4, 2, 2);
      Shape1.setRotationPoint(-2F, 21F, -1F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    bottom1.render(f5);
    bottom2.render(f5);
    bottom3.render(f5);
    top1.render(f5);
    top2.render(f5);
    top3.render(f5);
    Shape1.render(f5);
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

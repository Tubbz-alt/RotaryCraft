/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 15/05/2013 6:22:44 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Engine;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelWind extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape3a;
	ModelRenderer Shape4;
	ModelRenderer Shape4a;
	ModelRenderer Shape5;
	ModelRenderer Shape1a;
	ModelRenderer Shape6;
	ModelRenderer Shape6a;
	ModelRenderer Shape7;
	ModelRenderer Shape7a;
	ModelRenderer Shape8c;
	ModelRenderer Shape8b;
	ModelRenderer Shape8a;
	ModelRenderer Shape8;
	ModelRenderer Shape9h;
	ModelRenderer Shape9g;
	ModelRenderer Shape9f;
	ModelRenderer Shape9e;
	ModelRenderer Shape9d;
	ModelRenderer Shape9c;
	ModelRenderer Shape9b;
	ModelRenderer Shape9a;

	public ModelWind()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 95, 0);
		Shape1.addBox(0F, 0F, 0F, 14, 14, 2);
		Shape1.setRotationPoint(-7F, 9F, -7F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 37, 0);
		Shape2.addBox(0F, 0F, 0F, 16, 16, 12);
		Shape2.setRotationPoint(-8F, 8F, -6F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 36);
		Shape3.addBox(0F, 0F, 0F, 16, 1, 2);
		Shape3.setRotationPoint(-8F, 8F, 6F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 41);
		Shape3a.addBox(0F, 0F, 0F, 16, 1, 2);
		Shape3a.setRotationPoint(-8F, 23F, 6F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 38, 29);
		Shape4.addBox(0F, 0F, 0F, 1, 14, 2);
		Shape4.setRotationPoint(7F, 9F, 6F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new ModelRenderer(this, 46, 29);
		Shape4a.addBox(0F, 0F, 0F, 1, 14, 2);
		Shape4a.setRotationPoint(-8F, 9F, 6F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 9, 20);
		Shape5.addBox(0F, 0F, 0F, 12, 12, 1);
		Shape5.setRotationPoint(-6F, 10F, 6F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape1a = new ModelRenderer(this, 9, 5);
		Shape1a.addBox(0F, 0F, 0F, 12, 12, 1);
		Shape1a.setRotationPoint(-6F, 10F, -8F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 54, 30);
		Shape6.addBox(-1F, -1F, 0F, 2, 2, 2);
		Shape6.setRotationPoint(0F, 15F, 6.5F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0.7853982F);
		Shape6a = new ModelRenderer(this, 54, 30);
		Shape6a.addBox(-1F, -1F, 0F, 2, 2, 2);
		Shape6a.setRotationPoint(0F, 15F, 6.5F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 54, 36);
		Shape7.addBox(-1F, -1F, 0F, 2, 2, 3);
		Shape7.setRotationPoint(0F, 16F, -10.5F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0.7853982F);
		Shape7a = new ModelRenderer(this, 54, 36);
		Shape7a.addBox(-1F, -1F, 0F, 2, 2, 3);
		Shape7a.setRotationPoint(0F, 16F, -10.5F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape8c = new ModelRenderer(this, 0, 0);
		Shape8c.addBox(-1F, -16F, 0F, 2, 32, 1);
		Shape8c.setRotationPoint(0F, 16F, -10F);
		Shape8c.setTextureSize(128, 128);
		Shape8c.mirror = true;
		this.setRotation(Shape8c, 0F, 0F, 2.748893F);
		Shape8b = new ModelRenderer(this, 0, 0);
		Shape8b.addBox(-1F, -16F, 0F, 2, 32, 1);
		Shape8b.setRotationPoint(0F, 16F, -10F);
		Shape8b.setTextureSize(128, 128);
		Shape8b.mirror = true;
		this.setRotation(Shape8b, 0F, 0F, 1.963495F);
		Shape8a = new ModelRenderer(this, 0, 0);
		Shape8a.addBox(-1F, -16F, 0F, 2, 32, 1);
		Shape8a.setRotationPoint(0F, 16F, -10F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 1.178097F);
		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(-1F, -16F, 0F, 2, 32, 1);
		Shape8.setRotationPoint(0F, 16F, -10F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0.3926991F);
		Shape9h = new ModelRenderer(this, 0, 0);
		Shape9h.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9h.setRotationPoint(0F, 16F, -11F);
		Shape9h.setTextureSize(128, 128);
		Shape9h.mirror = true;
		this.setRotation(Shape9h, 0F, 0F, 0.3926991F);
		Shape9g = new ModelRenderer(this, 0, 0);
		Shape9g.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9g.setRotationPoint(0F, 16F, -11F);
		Shape9g.setTextureSize(128, 128);
		Shape9g.mirror = true;
		this.setRotation(Shape9g, 0F, 0F, -1.19555F);
		Shape9f = new ModelRenderer(this, 0, 0);
		Shape9f.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9f.setRotationPoint(0F, 16F, -11F);
		Shape9f.setTextureSize(128, 128);
		Shape9f.mirror = true;
		this.setRotation(Shape9f, 0F, 0F, 1.963495F);
		Shape9e = new ModelRenderer(this, 0, 0);
		Shape9e.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9e.setRotationPoint(0F, 16F, -11F);
		Shape9e.setTextureSize(128, 128);
		Shape9e.mirror = true;
		this.setRotation(Shape9e, 0F, 0F, 2.748893F);
		Shape9d = new ModelRenderer(this, 0, 0);
		Shape9d.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9d.setRotationPoint(0F, 16F, -11F);
		Shape9d.setTextureSize(128, 128);
		Shape9d.mirror = true;
		this.setRotation(Shape9d, 0F, 0F, 1.178097F);
		Shape9c = new ModelRenderer(this, 0, 0);
		Shape9c.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9c.setRotationPoint(0F, 16F, -11F);
		Shape9c.setTextureSize(128, 128);
		Shape9c.mirror = true;
		this.setRotation(Shape9c, 0F, 0F, -1.980949F);
		Shape9b = new ModelRenderer(this, 0, 0);
		Shape9b.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9b.setRotationPoint(0F, 16F, -11F);
		Shape9b.setTextureSize(128, 128);
		Shape9b.mirror = true;
		this.setRotation(Shape9b, 0F, 0F, -2.766347F);
		Shape9a = new ModelRenderer(this, 0, 0);
		Shape9a.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape9a.setRotationPoint(0F, 16F, -11F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, -0.4101524F);
	}

	@Override
	public void renderAll(List li, float phi)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape3a.render(f5);
		Shape4.render(f5);
		Shape4a.render(f5);
		Shape5.render(f5);
		Shape1a.render(f5);
		Shape6.render(f5);
		Shape6a.render(f5);
		Shape7.render(f5);
		Shape7a.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);
		Shape8c.render(f5);
		Shape8b.render(f5);
		Shape8a.render(f5);
		Shape8.render(f5);
		Shape9h.render(f5);
		Shape9g.render(f5);
		Shape9f.render(f5);
		Shape9e.render(f5);
		Shape9d.render(f5);
		Shape9c.render(f5);
		Shape9b.render(f5);
		Shape9a.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f6)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 23/12/2013 7:07:49 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelHydraulicPump extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape1a;
	ModelRenderer Shape3a;
	ModelRenderer Shape3b;
	ModelRenderer Shape3c;
	ModelRenderer Shape4;
	ModelRenderer Shape4a;
	ModelRenderer Shape4b;
	ModelRenderer Shape4c;
	ModelRenderer Shape4d;
	ModelRenderer Shape4e;
	ModelRenderer Shape5;
	ModelRenderer Shape5a;
	ModelRenderer Shape6;
	ModelRenderer Shape1b;
	ModelRenderer Shape1c;
	ModelRenderer Shape2a;
	ModelRenderer Shape2b;
	ModelRenderer Shape7;
	ModelRenderer Shape7a;
	ModelRenderer Shape1d;
	ModelRenderer Shape1e;
	ModelRenderer Shape5b;
	ModelRenderer Shape5c;
	ModelRenderer Shape5d;
	ModelRenderer Shape3d;
	ModelRenderer Shape3e;
	ModelRenderer Shape3f;
	ModelRenderer Shape3g;
	ModelRenderer Shape1f;
	ModelRenderer Shape1g;
	ModelRenderer Shape8;
	ModelRenderer Shape8a;
	ModelRenderer Shape9;
	ModelRenderer Shape9a;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape11a;
	ModelRenderer Shape11b;
	ModelRenderer Shape11c;
	ModelRenderer Shape11d;
	ModelRenderer Shape12;

	public ModelHydraulicPump()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 62);
		Shape1.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape1.setRotationPoint(0F, 15F, -6F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0.7853982F);
		Shape2 = new ModelRenderer(this, 0, 69);
		Shape2.addBox(0F, 0F, 0F, 16, 2, 2);
		Shape2.setRotationPoint(-8F, 21F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 32);
		Shape3.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		Shape3.setRotationPoint(-3F, 16F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0.3926991F, 0F);
		Shape1a = new ModelRenderer(this, 0, 18);
		Shape1a.addBox(-1F, -1F, 0F, 2, 2, 3);
		Shape1a.setRotationPoint(0F, 15F, -8.5F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 32);
		Shape3a.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		Shape3a.setRotationPoint(-3F, 16F, 0F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 1.178097F, 0F);
		Shape3b = new ModelRenderer(this, 0, 99);
		Shape3b.addBox(-1F, 0F, -1F, 2, 1, 2);
		Shape3b.setRotationPoint(-3F, 15.5F, 0F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0.7853982F, 0F);
		Shape3c = new ModelRenderer(this, 0, 32);
		Shape3c.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		Shape3c.setRotationPoint(3F, 16F, 0F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 66, 12);
		Shape4.addBox(-1F, 0F, -3F, 1, 6, 3);
		Shape4.setRotationPoint(-7.5F, 15F, 2F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, -2.356194F, 0F);
		Shape4a = new ModelRenderer(this, 66, 0);
		Shape4a.addBox(0F, 0F, 0F, 1, 6, 4);
		Shape4a.setRotationPoint(-7.5F, 15F, -2F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new ModelRenderer(this, 66, 12);
		Shape4b.addBox(-1F, 0F, 0F, 1, 6, 3);
		Shape4b.setRotationPoint(-7.5F, 15F, -2F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 2.356194F, 0F);
		Shape4c = new ModelRenderer(this, 80, 0);
		Shape4c.addBox(0F, 0F, 0F, 1, 6, 4);
		Shape4c.setRotationPoint(6.5F, 15F, -2F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape4d = new ModelRenderer(this, 80, 12);
		Shape4d.addBox(0F, 0F, 0F, 1, 6, 3);
		Shape4d.setRotationPoint(7.5F, 15F, -2F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, -2.356194F, 0F);
		Shape4e = new ModelRenderer(this, 80, 12);
		Shape4e.addBox(0F, 0F, -3F, 1, 6, 3);
		Shape4e.setRotationPoint(7.5F, 15F, 2F);
		Shape4e.setTextureSize(128, 128);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 2.356194F, 0F);
		Shape5 = new ModelRenderer(this, 10, 43);
		Shape5.addBox(0F, 0F, 0F, 3, 6, 1);
		Shape5.setRotationPoint(2.3F, 15F, 3.1F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new ModelRenderer(this, 20, 43);
		Shape5a.addBox(0F, 0F, 0F, 3, 6, 1);
		Shape5a.setRotationPoint(-5.3F, 15F, 3.1F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 51);
		Shape6.addBox(0F, 0F, 0F, 8, 8, 1);
		Shape6.setRotationPoint(-4F, 13F, -5F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape1b = new ModelRenderer(this, 0, 18);
		Shape1b.addBox(-1F, -1F, 0F, 2, 2, 3);
		Shape1b.setRotationPoint(0F, 15F, -8.5F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0.7853982F);
		Shape1c = new ModelRenderer(this, 11, 62);
		Shape1c.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Shape1c.setRotationPoint(0F, 20F, -6.5F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0.3926991F);
		Shape2a = new ModelRenderer(this, 0, 0);
		Shape2a.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape2a.setRotationPoint(-8F, 23F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new ModelRenderer(this, 0, 75);
		Shape2b.addBox(0F, 0F, 0F, 16, 2, 13);
		Shape2b.setRotationPoint(-8F, 21F, -5F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 95);
		Shape7.addBox(0F, 0F, 0F, 4, 2, 1);
		Shape7.setRotationPoint(4F, 21F, -6F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new ModelRenderer(this, 0, 91);
		Shape7a.addBox(0F, 0F, 0F, 4, 2, 1);
		Shape7a.setRotationPoint(-8F, 21F, -6F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape1d = new ModelRenderer(this, 0, 62);
		Shape1d.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape1d.setRotationPoint(0F, 15F, -6F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 0F, 0F);
		Shape1e = new ModelRenderer(this, 0, 62);
		Shape1e.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape1e.setRotationPoint(0F, 20F, -6F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0F, 0.3926991F);
		Shape5b = new ModelRenderer(this, 0, 43);
		Shape5b.addBox(0F, 0F, 0F, 3, 6, 1);
		Shape5b.setRotationPoint(2.3F, 15F, -4.1F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0F);
		Shape5c = new ModelRenderer(this, 29, 43);
		Shape5c.addBox(0F, 0F, 0F, 3, 6, 1);
		Shape5c.setRotationPoint(-5.3F, 15F, -4.1F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 0F);
		Shape5d = new ModelRenderer(this, 0, 43);
		Shape5d.addBox(0F, 0F, 0F, 3, 6, 1);
		Shape5d.setRotationPoint(-5.3F, 15F, 3.1F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape3d = new ModelRenderer(this, 0, 32);
		Shape3d.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
		Shape3d.setRotationPoint(3F, 16F, 0F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 0.7853982F, 0F);
		Shape3e = new ModelRenderer(this, 0, 99);
		Shape3e.addBox(-1F, 0F, -1F, 2, 1, 2);
		Shape3e.setRotationPoint(3F, 15.5F, 0F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 0.7853982F, 0F);
		Shape3f = new ModelRenderer(this, 0, 99);
		Shape3f.addBox(-1F, 0F, -1F, 2, 1, 2);
		Shape3f.setRotationPoint(3F, 15.5F, 0F);
		Shape3f.setTextureSize(128, 128);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, 0F, 0F);
		Shape3g = new ModelRenderer(this, 0, 99);
		Shape3g.addBox(-1F, 0F, -1F, 2, 1, 2);
		Shape3g.setRotationPoint(-3F, 15.5F, 0F);
		Shape3g.setTextureSize(128, 128);
		Shape3g.mirror = true;
		this.setRotation(Shape3g, 0F, 0F, 0F);
		Shape1f = new ModelRenderer(this, 0, 62);
		Shape1f.addBox(-2F, -2F, 0F, 4, 4, 1);
		Shape1f.setRotationPoint(0F, 20F, -6F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, 0F, 1.178097F);
		Shape1g = new ModelRenderer(this, 11, 62);
		Shape1g.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Shape1g.setRotationPoint(0F, 20F, -6.5F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 0F, 1.178097F);
		Shape8 = new ModelRenderer(this, 0, 114);
		Shape8.addBox(-3F, -3F, 0F, 6, 4, 1);
		Shape8.setRotationPoint(0F, 15F, 4F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape8a = new ModelRenderer(this, 0, 103);
		Shape8a.addBox(-3F, -3F, 0F, 6, 9, 1);
		Shape8a.setRotationPoint(0F, 15F, 7F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 12, 18);
		Shape9.addBox(0F, 0F, 0F, 1, 9, 4);
		Shape9.setRotationPoint(3F, 12F, 4F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape9a = new ModelRenderer(this, 12, 18);
		Shape9a.addBox(0F, 0F, 0F, 1, 9, 4);
		Shape9a.setRotationPoint(-4F, 12F, 4F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 25, 18);
		Shape10.addBox(0F, 0F, 0F, 6, 1, 2);
		Shape10.setRotationPoint(-3F, 12F, 5F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 68, 120);
		Shape11.addBox(0F, 0F, 0F, 11, 1, 1);
		Shape11.setRotationPoint(-5.5F, 14F, 3F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape11a = new ModelRenderer(this, 0, 120);
		Shape11a.addBox(0F, 0F, 0F, 15, 1, 4);
		Shape11a.setRotationPoint(-7.5F, 14F, -2F);
		Shape11a.setTextureSize(128, 128);
		Shape11a.mirror = true;
		this.setRotation(Shape11a, 0F, 0F, 0F);
		Shape11b = new ModelRenderer(this, 39, 120);
		Shape11b.addBox(0F, 0F, 0F, 13, 1, 1);
		Shape11b.setRotationPoint(-6.5F, 14F, 2F);
		Shape11b.setTextureSize(128, 128);
		Shape11b.mirror = true;
		this.setRotation(Shape11b, 0F, 0F, 0F);
		Shape11c = new ModelRenderer(this, 39, 123);
		Shape11c.addBox(0F, 0F, 0F, 13, 1, 1);
		Shape11c.setRotationPoint(-6.5F, 14F, -3F);
		Shape11c.setTextureSize(128, 128);
		Shape11c.mirror = true;
		this.setRotation(Shape11c, 0F, 0F, 0F);
		Shape11d = new ModelRenderer(this, 68, 123);
		Shape11d.addBox(0F, 0F, 0F, 11, 1, 1);
		Shape11d.setRotationPoint(-5.5F, 14F, -4F);
		Shape11d.setTextureSize(128, 128);
		Shape11d.mirror = true;
		this.setRotation(Shape11d, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 93, 0);
		Shape12.addBox(0F, 0F, 0F, 3, 8, 1);
		Shape12.setRotationPoint(-1.5F, 13F, -8F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		GL11.glTranslated(0, 0.9375, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -0.9375, 0);
		Shape1.render(f5);
		Shape1a.render(f5);
		Shape1b.render(f5);
		Shape1d.render(f5);
		GL11.glTranslated(0, 0.9375, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -0.9375, 0);

		double d = 1.25;
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);
		Shape1e.render(f5);
		Shape1f.render(f5);
		Shape1c.render(f5);
		Shape1g.render(f5);
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);

		d = 0.1875;
		GL11.glTranslated(d, 0, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(-d, 0, 0);
		Shape3c.render(f5);
		Shape3d.render(f5);
		Shape3e.render(f5);
		Shape3f.render(f5);
		GL11.glTranslated(d, 0, 0);
		GL11.glRotatef(-phi, 0, 1, 0);
		GL11.glTranslated(-d, 0, 0);

		d = -0.1875;
		GL11.glTranslated(d, 0, 0);
		GL11.glRotatef(-phi, 0, 1, 0);
		GL11.glTranslated(-d, 0, 0);
		Shape3.render(f5);
		Shape3a.render(f5);
		Shape3b.render(f5);
		Shape3g.render(f5);
		GL11.glTranslated(d, 0, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(-d, 0, 0);

		Shape2.render(f5);

		Shape4.render(f5);
		Shape4a.render(f5);
		Shape4b.render(f5);
		Shape4c.render(f5);
		Shape4d.render(f5);
		Shape4e.render(f5);
		Shape5.render(f5);
		Shape5a.render(f5);
		Shape6.render(f5);
		Shape2a.render(f5);
		Shape2b.render(f5);
		Shape7.render(f5);
		Shape7a.render(f5);
		Shape5b.render(f5);
		Shape5c.render(f5);
		Shape5d.render(f5);

		Shape8.render(f5);
		Shape8a.render(f5);
		Shape9.render(f5);
		Shape9a.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape11a.render(f5);
		Shape11b.render(f5);
		Shape11c.render(f5);
		Shape11d.render(f5);
		Shape12.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}

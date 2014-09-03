/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 28/08/2013 11:39:06 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelMultiClutch extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape4R;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape5R;
	LODModelPart Shape6;
	LODModelPart Shape6R;
	LODModelPart Shape6RR;
	LODModelPart Shape6RRR;
	LODModelPart Shape5RR;
	LODModelPart Shape5RRR;
	LODModelPart Shape4RRR;
	LODModelPart Shape4RR;
	LODModelPart Shape5UR;
	LODModelPart Shape5URR;
	LODModelPart Shape5URRR;
	LODModelPart Shape5RU;
	LODModelPart Shape6UR;
	LODModelPart Shape6URR;
	LODModelPart Shape6URRR;
	LODModelPart Shape6RU;
	LODModelPart Shape4UR;
	LODModelPart Shape4URR;
	LODModelPart Shape4URRR;
	LODModelPart Shape4RU;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape7d;
	LODModelPart Shape7e;
	LODModelPart Shape7;

	public ModelMultiClutch()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 57);
		Shape1.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1.setRotationPoint(7F, 8F, 7F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 57);
		Shape1a.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1a.setRotationPoint(-8F, 8F, 7F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 0, 57);
		Shape1b.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1b.setRotationPoint(7F, 8F, -8F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 0, 57);
		Shape1c.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1c.setRotationPoint(-8F, 8F, -8F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 69, 17);
		Shape2.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2.setRotationPoint(-7F, 8F, 7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 69, 17);
		Shape2a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2a.setRotationPoint(-7F, 23F, 7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 69, 17);
		Shape2b.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2b.setRotationPoint(-7F, 8F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 69, 17);
		Shape2c.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2c.setRotationPoint(-7F, 23F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 69, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3.setRotationPoint(-8F, 8F, -7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 69, 0);
		Shape3a.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3a.setRotationPoint(7F, 8F, -7F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 69, 0);
		Shape3b.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3b.setRotationPoint(-8F, 23F, -7F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 69, 0);
		Shape3c.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3c.setRotationPoint(7F, 23F, -7F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape4R = new LODModelPart(this, 0, 0);
		Shape4R.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
		Shape4R.setRotationPoint(0F, 16F, -4F);
		Shape4R.setTextureSize(128, 128);
		Shape4R.mirror = true;
		this.setRotation(Shape4R, 0F, 0F, 1.178097F);
		Shape4 = new LODModelPart(this, 0, 77);
		Shape4.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape4.setRotationPoint(0F, 16F, -8.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0.7853982F);
		Shape5 = new LODModelPart(this, 0, 12);
		Shape5.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5.setRotationPoint(3.5F, 16F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0.7853982F, 0F, 0F);
		Shape5R = new LODModelPart(this, 0, 12);
		Shape5R.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5R.setRotationPoint(-8.5F, 16F, 0F);
		Shape5R.setTextureSize(128, 128);
		Shape5R.mirror = true;
		this.setRotation(Shape5R, 0.7853982F, 0F, 0F);
		Shape6 = new LODModelPart(this, 16, 10);
		Shape6.addBox(-1F, 0F, -1F, 2, 5, 2);
		Shape6.setRotationPoint(0F, 19.5F, 0F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0.7853982F, 0F);
		Shape6R = new LODModelPart(this, 16, 10);
		Shape6R.addBox(-1F, 0F, -1F, 2, 5, 2);
		Shape6R.setRotationPoint(0F, 7.5F, 0F);
		Shape6R.setTextureSize(128, 128);
		Shape6R.mirror = true;
		this.setRotation(Shape6R, 0F, 0.7853982F, 0F);
		Shape6RR = new LODModelPart(this, 16, 10);
		Shape6RR.addBox(-1F, 0F, -1F, 2, 5, 2);
		Shape6RR.setRotationPoint(0F, 7.5F, 0F);
		Shape6RR.setTextureSize(128, 128);
		Shape6RR.mirror = true;
		this.setRotation(Shape6RR, 0F, 0F, 0F);
		Shape6RRR = new LODModelPart(this, 0, 0);
		Shape6RRR.addBox(-2.5F, 0F, -2.5F, 5, 1, 5);
		Shape6RRR.setRotationPoint(0F, 12F, 0F);
		Shape6RRR.setTextureSize(128, 128);
		Shape6RRR.mirror = true;
		this.setRotation(Shape6RRR, 0F, 1.178097F, 0F);
		Shape5RR = new LODModelPart(this, 0, 0);
		Shape5RR.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
		Shape5RR.setRotationPoint(3F, 16F, 0F);
		Shape5RR.setTextureSize(128, 128);
		Shape5RR.mirror = true;
		this.setRotation(Shape5RR, 0.7853982F, 0F, 0F);
		Shape5RRR = new LODModelPart(this, 0, 12);
		Shape5RRR.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5RRR.setRotationPoint(3.5F, 16F, 0F);
		Shape5RRR.setTextureSize(128, 128);
		Shape5RRR.mirror = true;
		this.setRotation(Shape5RRR, 0F, 0F, 0F);
		Shape4RRR = new LODModelPart(this, 0, 77);
		Shape4RRR.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape4RRR.setRotationPoint(0F, 16F, -8.5F);
		Shape4RRR.setTextureSize(128, 128);
		Shape4RRR.mirror = true;
		this.setRotation(Shape4RRR, 0F, 0F, 0F);
		Shape4RR = new LODModelPart(this, 0, 77);
		Shape4RR.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape4RR.setRotationPoint(0F, 16F, 3.5F);
		Shape4RR.setTextureSize(128, 128);
		Shape4RR.mirror = true;
		this.setRotation(Shape4RR, 0F, 0F, 0F);
		Shape5UR = new LODModelPart(this, 0, 12);
		Shape5UR.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5UR.setRotationPoint(-8.5F, 16F, 0F);
		Shape5UR.setTextureSize(128, 128);
		Shape5UR.mirror = true;
		this.setRotation(Shape5UR, 0F, 0F, 0F);
		Shape5URR = new LODModelPart(this, 0, 0);
		Shape5URR.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
		Shape5URR.setRotationPoint(3F, 16F, 0F);
		Shape5URR.setTextureSize(128, 128);
		Shape5URR.mirror = true;
		this.setRotation(Shape5URR, 0F, 0F, 0F);
		Shape5URRR = new LODModelPart(this, 0, 0);
		Shape5URRR.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
		Shape5URRR.setRotationPoint(-4F, 16F, 0F);
		Shape5URRR.setTextureSize(128, 128);
		Shape5URRR.mirror = true;
		this.setRotation(Shape5URRR, 0F, 0F, 0F);
		Shape5RU = new LODModelPart(this, 0, 0);
		Shape5RU.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
		Shape5RU.setRotationPoint(-4F, 16F, 0F);
		Shape5RU.setTextureSize(128, 128);
		Shape5RU.mirror = true;
		this.setRotation(Shape5RU, 0.7853982F, 0F, 0F);
		Shape6UR = new LODModelPart(this, 16, 10);
		Shape6UR.addBox(-1F, 0F, -1F, 2, 5, 2);
		Shape6UR.setRotationPoint(0F, 19.5F, 0F);
		Shape6UR.setTextureSize(128, 128);
		Shape6UR.mirror = true;
		this.setRotation(Shape6UR, 0F, 0F, 0F);
		Shape6URR = new LODModelPart(this, 0, 0);
		Shape6URR.addBox(-2.5F, 0F, -2.5F, 5, 1, 5);
		Shape6URR.setRotationPoint(0F, 12F, 0F);
		Shape6URR.setTextureSize(128, 128);
		Shape6URR.mirror = true;
		this.setRotation(Shape6URR, 0F, 0.3926991F, 0F);
		Shape6URRR = new LODModelPart(this, 0, 0);
		Shape6URRR.addBox(-2.5F, 0F, -2.5F, 5, 1, 5);
		Shape6URRR.setRotationPoint(0F, 19F, 0F);
		Shape6URRR.setTextureSize(128, 128);
		Shape6URRR.mirror = true;
		this.setRotation(Shape6URRR, 0F, 1.178097F, 0F);
		Shape6RU = new LODModelPart(this, 0, 0);
		Shape6RU.addBox(-2.5F, 0F, -2.5F, 5, 1, 5);
		Shape6RU.setRotationPoint(0F, 19F, 0F);
		Shape6RU.setTextureSize(128, 128);
		Shape6RU.mirror = true;
		this.setRotation(Shape6RU, 0F, 0.3926991F, 0F);
		Shape4UR = new LODModelPart(this, 0, 77);
		Shape4UR.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape4UR.setRotationPoint(0F, 16F, 3.5F);
		Shape4UR.setTextureSize(128, 128);
		Shape4UR.mirror = true;
		this.setRotation(Shape4UR, 0F, 0F, 0.7853982F);
		Shape4URR = new LODModelPart(this, 0, 0);
		Shape4URR.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
		Shape4URR.setRotationPoint(0F, 16F, -4F);
		Shape4URR.setTextureSize(128, 128);
		Shape4URR.mirror = true;
		this.setRotation(Shape4URR, 0F, 0F, 0.3926991F);
		Shape4URRR = new LODModelPart(this, 0, 0);
		Shape4URRR.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
		Shape4URRR.setRotationPoint(0F, 16F, 3F);
		Shape4URRR.setTextureSize(128, 128);
		Shape4URRR.mirror = true;
		this.setRotation(Shape4URRR, 0F, 0F, 0.3926991F);
		Shape4RU = new LODModelPart(this, 0, 0);
		Shape4RU.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
		Shape4RU.setRotationPoint(0F, 16F, 3F);
		Shape4RU.setTextureSize(128, 128);
		Shape4RU.mirror = true;
		this.setRotation(Shape4RU, 0F, 0F, 1.178097F);
		Shape7a = new LODModelPart(this, 0, 38);
		Shape7a.addBox(0F, 0F, 0F, 1, 4, 14);
		Shape7a.setRotationPoint(7F, 14F, -7F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new LODModelPart(this, 32, 7);
		Shape7b.addBox(0F, 0F, 0F, 14, 1, 4);
		Shape7b.setRotationPoint(-7F, 23F, -2F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new LODModelPart(this, 0, 19);
		Shape7c.addBox(0F, 0F, 0F, 1, 4, 14);
		Shape7c.setRotationPoint(-8F, 14F, -7F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape7d = new LODModelPart(this, 32, 21);
		Shape7d.addBox(0F, 0F, 0F, 14, 4, 1);
		Shape7d.setRotationPoint(-7F, 14F, -8F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 0F, 0F, 0F);
		Shape7e = new LODModelPart(this, 32, 14);
		Shape7e.addBox(0F, 0F, 0F, 14, 4, 1);
		Shape7e.setRotationPoint(-7F, 14F, 7F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 32, 0);
		Shape7.addBox(0F, 0F, 0F, 14, 1, 4);
		Shape7.setRotationPoint(-7F, 8F, -2F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		Shape4R.render(te, f5);
		Shape4.render(te, f5);
		Shape4RRR.render(te, f5);
		Shape4RR.render(te, f5);
		Shape4UR.render(te, f5);
		Shape4URR.render(te, f5);
		Shape4URRR.render(te, f5);
		Shape4RU.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		Shape5.render(te, f5);
		Shape5R.render(te, f5);
		Shape5RR.render(te, f5);
		Shape5RRR.render(te, f5);
		Shape5UR.render(te, f5);
		Shape5URR.render(te, f5);
		Shape5URRR.render(te, f5);
		Shape5RU.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);

		Shape6UR.render(te, f5);
		Shape6URR.render(te, f5);
		Shape6URRR.render(te, f5);
		Shape6RU.render(te, f5);
		Shape6.render(te, f5);
		Shape6R.render(te, f5);
		Shape6RR.render(te, f5);
		Shape6RRR.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);

		Shape7a.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);
		Shape7d.render(te, f5);
		Shape7e.render(te, f5);
		Shape7.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}

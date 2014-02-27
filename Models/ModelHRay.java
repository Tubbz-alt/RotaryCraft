/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 12/02/2013 11:10:16 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelHRay extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;

	public ModelHRay()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 74, 14);
		Shape2.addBox(0F, 0F, 0F, 1, 4, 3);
		Shape2.setRotationPoint(-2F, 15F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 74, 14);
		Shape3.addBox(0F, 0F, 0F, 1, 4, 3);
		Shape3.setRotationPoint(1F, 15F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 64, 14);
		Shape4.addBox(0F, 0F, 0F, 2, 1, 3);
		Shape4.setRotationPoint(-1F, 15F, -8F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 64, 14);
		Shape5.addBox(0F, 0F, 0F, 2, 1, 3);
		Shape5.setRotationPoint(-1F, 18F, -8F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 64, 8);
		Shape6.addBox(0F, 0F, 0F, 4, 1, 5);
		Shape6.setRotationPoint(-2F, 14F, -5F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 64, 8);
		Shape7.addBox(0F, 0F, 0F, 4, 1, 5);
		Shape7.setRotationPoint(-2F, 19F, -5F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 106, 7);
		Shape8.addBox(0F, 0F, 0F, 1, 6, 5);
		Shape8.setRotationPoint(-3F, 14F, -5F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 106, 7);
		Shape9.addBox(0F, 0F, 0F, 1, 6, 5);
		Shape9.setRotationPoint(2F, 14F, -5F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 64, 0);
		Shape10.addBox(0F, 0F, 0F, 6, 1, 7);
		Shape10.setRotationPoint(-3F, 13F, 0F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 64, 0);
		Shape11.addBox(0F, 0F, 0F, 6, 1, 7);
		Shape11.setRotationPoint(-3F, 20F, 0F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 90, 0);
		Shape12.addBox(0F, 0F, 0F, 1, 6, 7);
		Shape12.setRotationPoint(-4F, 14F, 0F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 90, 0);
		Shape13.addBox(0F, 0F, 0F, 1, 6, 7);
		Shape13.setRotationPoint(3F, 14F, 0F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 106, 0);
		Shape14.addBox(0F, 0F, 0F, 6, 6, 1);
		Shape14.setRotationPoint(-3F, 14F, 7F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 17);
		Shape15.addBox(0F, 0F, 0F, 14, 3, 4);
		Shape15.setRotationPoint(-7F, 20F, 2F);
		Shape15.setTextureSize(128, 128);
		Shape15.mirror = true;
		this.setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 0, 24);
		Shape16.addBox(0F, 0F, 0F, 12, 1, 2);
		Shape16.setRotationPoint(-6F, 19F, 3F);
		Shape16.setTextureSize(128, 128);
		Shape16.mirror = true;
		this.setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 36, 17);
		Shape17.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape17.setRotationPoint(1F, 18F, -7F);
		Shape17.setTextureSize(128, 128);
		Shape17.mirror = true;
		this.setRotation(Shape17, 0F, 0F, -0.5235988F);
		Shape18 = new ModelRenderer(this, 36, 17);
		Shape18.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape18.setRotationPoint(-2F, 18F, -7F);
		Shape18.setTextureSize(128, 128);
		Shape18.mirror = true;
		this.setRotation(Shape18, 0F, 0F, 0.5235988F);
		Shape19 = new ModelRenderer(this, 0, 27);
		Shape19.addBox(0F, 0F, 0F, 2, 2, 1);
		Shape19.setRotationPoint(-1F, 16F, -5F);
		Shape19.setTextureSize(128, 128);
		Shape19.mirror = true;
		this.setRotation(Shape19, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
	}

}

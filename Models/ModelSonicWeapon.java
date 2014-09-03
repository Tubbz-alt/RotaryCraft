/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 06/04/2013 1:43:41 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelSonicWeapon extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape2aA;
	LODModelPart Shape3cA;
	LODModelPart Shape3cB;
	LODModelPart Shape3aA;
	LODModelPart Shape3A;
	LODModelPart Shape2A;
	LODModelPart Shape2bA;
	LODModelPart Shape4;
	LODModelPart Shape4e;
	LODModelPart Shape4d;
	LODModelPart Shape4c;
	LODModelPart Shape4b;
	LODModelPart Shape4a;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape5d;
	LODModelPart Shape6;
	LODModelPart Shape6c;
	LODModelPart Shape6b;
	LODModelPart Shape6a;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape5df;
	LODModelPart Shape5dA;
	LODModelPart Shape5bf;
	LODModelPart Shape5bA;
	LODModelPart Shape6bA;
	LODModelPart Shape6bB;
	LODModelPart Shape6aC;
	LODModelPart Shape6aD;
	LODModelPart Shape6bE;
	LODModelPart Shape6bF;
	LODModelPart Shape6bG;
	LODModelPart Shape6bH;
	LODModelPart Shape5dI;
	LODModelPart Shape5dJ;
	LODModelPart Shape5dK;
	LODModelPart Shape5dL;
	LODModelPart Shape5dM;
	LODModelPart Shape5dN;
	LODModelPart Shape5dO;
	LODModelPart Shape5dP;
	LODModelPart Shape6bQ;
	LODModelPart Shape6bR;
	LODModelPart Shape6bS;
	LODModelPart Shape6bT;
	LODModelPart Shape8aaa;
	LODModelPart Shape8aa;

	public ModelSonicWeapon()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 40, 0);
		Shape1.addBox(0F, 0F, 0F, 8, 16, 8);
		Shape1.setRotationPoint(-4F, 8F, -4F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 106);
		Shape2.addBox(0F, 0F, 0F, 16, 2, 4);
		Shape2.setRotationPoint(-8F, 15F, 4F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 72, 5);
		Shape2a.addBox(0F, 0F, 0F, 16, 1, 4);
		Shape2a.setRotationPoint(-8F, 8F, 4F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 78);
		Shape2b.addBox(0F, 0F, 0F, 16, 1, 4);
		Shape2b.setRotationPoint(-8F, 23F, 4F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 36);
		Shape3.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3.setRotationPoint(-8F, 17F, 3F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 47);
		Shape3a.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3a.setRotationPoint(3F, 17F, 3F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 0, 36);
		Shape3b.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3b.setRotationPoint(-8F, 9F, 3F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 0, 47);
		Shape3c.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3c.setRotationPoint(3F, 9F, 3F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape2aA = new LODModelPart(this, 72, 0);
		Shape2aA.addBox(0F, 0F, 0F, 16, 1, 4);
		Shape2aA.setRotationPoint(-8F, 8F, -8F);
		Shape2aA.setTextureSize(128, 128);
		Shape2aA.mirror = true;
		this.setRotation(Shape2aA, 0F, 0F, 0F);
		Shape3cA = new LODModelPart(this, 0, 14);
		Shape3cA.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3cA.setRotationPoint(-8F, 9F, -8F);
		Shape3cA.setTextureSize(128, 128);
		Shape3cA.mirror = true;
		this.setRotation(Shape3cA, 0F, 0F, 0F);
		Shape3cB = new LODModelPart(this, 0, 25);
		Shape3cB.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3cB.setRotationPoint(3F, 9F, -8F);
		Shape3cB.setTextureSize(128, 128);
		Shape3cB.mirror = true;
		this.setRotation(Shape3cB, 0F, 0F, 0F);
		Shape3aA = new LODModelPart(this, 0, 25);
		Shape3aA.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3aA.setRotationPoint(3F, 17F, -8F);
		Shape3aA.setTextureSize(128, 128);
		Shape3aA.mirror = true;
		this.setRotation(Shape3aA, 0F, 0F, 0F);
		Shape3A = new LODModelPart(this, 0, 14);
		Shape3A.addBox(0F, 0F, 0F, 5, 6, 5);
		Shape3A.setRotationPoint(-8F, 17F, -8F);
		Shape3A.setTextureSize(128, 128);
		Shape3A.mirror = true;
		this.setRotation(Shape3A, 0F, 0F, 0F);
		Shape2A = new LODModelPart(this, 0, 112);
		Shape2A.addBox(0F, 0F, 0F, 16, 2, 4);
		Shape2A.setRotationPoint(-8F, 15F, -8F);
		Shape2A.setTextureSize(128, 128);
		Shape2A.mirror = true;
		this.setRotation(Shape2A, 0F, 0F, 0F);
		Shape2bA = new LODModelPart(this, 0, 83);
		Shape2bA.addBox(0F, 0F, 0F, 16, 1, 4);
		Shape2bA.setRotationPoint(-8F, 23F, -8F);
		Shape2bA.setTextureSize(128, 128);
		Shape2bA.mirror = true;
		this.setRotation(Shape2bA, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 24, 88);
		Shape4.addBox(0F, 0F, 0F, 4, 2, 8);
		Shape4.setRotationPoint(-8F, 15F, -4F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4e = new LODModelPart(this, 96, 10);
		Shape4e.addBox(0F, 0F, 0F, 4, 1, 8);
		Shape4e.setRotationPoint(-8F, 8F, -4F);
		Shape4e.setTextureSize(128, 128);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 0F, 0F);
		Shape4d = new LODModelPart(this, 0, 88);
		Shape4d.addBox(0F, 0F, 0F, 4, 1, 8);
		Shape4d.setRotationPoint(-8F, 23F, -4F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 72, 10);
		Shape4c.addBox(0F, 0F, 0F, 4, 1, 8);
		Shape4c.setRotationPoint(4F, 8F, -4F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 48, 88);
		Shape4b.addBox(0F, 0F, 0F, 4, 2, 8);
		Shape4b.setRotationPoint(4F, 15F, -4F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 97);
		Shape4a.addBox(0F, 0F, 0F, 4, 1, 8);
		Shape4a.setRotationPoint(4F, 23F, -4F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 0);
		Shape5.addBox(0F, 0F, 0F, 5, 1, 6);
		Shape5.setRotationPoint(-8F, 23F, -3F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, -0.5235988F);
		Shape5a = new LODModelPart(this, 0, 0);
		Shape5a.addBox(0F, -1F, 0F, 5, 1, 6);
		Shape5a.setRotationPoint(-8F, 17F, -3F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0.5235988F);
		Shape5b = new LODModelPart(this, 0, 0);
		Shape5b.addBox(0F, -1F, 0F, 5, 1, 6);
		Shape5b.setRotationPoint(8F, 23F, -3F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, -2.617994F);
		Shape5d = new LODModelPart(this, 0, 0);
		Shape5d.addBox(0F, 0F, 0F, 5, 1, 6);
		Shape5d.setRotationPoint(8F, 17F, -3F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 2.617994F);
		Shape6 = new LODModelPart(this, 0, 0);
		Shape6.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6.setRotationPoint(-8F, 17F, 3F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0.5235988F, 0F);
		Shape6c = new LODModelPart(this, 0, 0);
		Shape6c.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6c.setRotationPoint(-8F, 17F, -3F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, -0.5235988F, 0F);
		Shape6b = new LODModelPart(this, 0, 0);
		Shape6b.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6b.setRotationPoint(8F, 17F, 3F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 2.617994F, 0F);
		Shape6a = new LODModelPart(this, 0, 0);
		Shape6a.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6a.setRotationPoint(8F, 17F, -3F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, -2.617994F, 0F);
		Shape7 = new LODModelPart(this, 0, 60);
		Shape7.addBox(0F, 0F, 0F, 12, 2, 2);
		Shape7.setRotationPoint(-6F, 19F, -1F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 0, 60);
		Shape7a.addBox(0F, 0F, 0F, 12, 2, 2);
		Shape7a.setRotationPoint(-6F, 11F, -1F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape5df = new LODModelPart(this, 0, 0);
		Shape5df.addBox(0F, -1F, 0F, 6, 1, 5);
		Shape5df.setRotationPoint(-3F, 17F, -8F);
		Shape5df.setTextureSize(128, 128);
		Shape5df.mirror = true;
		this.setRotation(Shape5df, -0.5235988F, 0F, 0F);
		Shape5dA = new LODModelPart(this, 0, 0);
		Shape5dA.addBox(0F, 0F, 0F, 5, 1, 6);
		Shape5dA.setRotationPoint(8F, 9F, -3F);
		Shape5dA.setTextureSize(128, 128);
		Shape5dA.mirror = true;
		this.setRotation(Shape5dA, 0F, 0F, 2.617994F);
		Shape5bf = new LODModelPart(this, 0, 0);
		Shape5bf.addBox(0F, 0F, 0F, 5, 1, 6);
		Shape5bf.setRotationPoint(-8F, 15F, -3F);
		Shape5bf.setTextureSize(128, 128);
		Shape5bf.mirror = true;
		this.setRotation(Shape5bf, 0F, 0F, -0.5235988F);
		Shape5bA = new LODModelPart(this, 0, 0);
		Shape5bA.addBox(0F, -1F, 0F, 5, 1, 6);
		Shape5bA.setRotationPoint(8F, 15F, -3F);
		Shape5bA.setTextureSize(128, 128);
		Shape5bA.mirror = true;
		this.setRotation(Shape5bA, 0F, 0F, -2.617994F);
		Shape6bA = new LODModelPart(this, 0, 0);
		Shape6bA.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6bA.setRotationPoint(-3F, 17F, -8F);
		Shape6bA.setTextureSize(128, 128);
		Shape6bA.mirror = true;
		this.setRotation(Shape6bA, 0F, -1.047198F, 0F);
		Shape6bB = new LODModelPart(this, 0, 0);
		Shape6bB.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6bB.setRotationPoint(8F, 9F, 3F);
		Shape6bB.setTextureSize(128, 128);
		Shape6bB.mirror = true;
		this.setRotation(Shape6bB, 0F, 2.617994F, 0F);
		Shape6aC = new LODModelPart(this, 0, 0);
		Shape6aC.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6aC.setRotationPoint(-8F, 9F, -3F);
		Shape6aC.setTextureSize(128, 128);
		Shape6aC.mirror = true;
		this.setRotation(Shape6aC, 0F, -0.5235988F, 0F);
		Shape6aD = new LODModelPart(this, 0, 0);
		Shape6aD.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6aD.setRotationPoint(8F, 9F, -3F);
		Shape6aD.setTextureSize(128, 128);
		Shape6aD.mirror = true;
		this.setRotation(Shape6aD, 0F, -2.617994F, 0F);
		Shape6bE = new LODModelPart(this, 0, 0);
		Shape6bE.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6bE.setRotationPoint(-8F, 9F, 3F);
		Shape6bE.setTextureSize(128, 128);
		Shape6bE.mirror = true;
		this.setRotation(Shape6bE, 0F, 0.5235988F, 0F);
		Shape6bF = new LODModelPart(this, 0, 0);
		Shape6bF.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6bF.setRotationPoint(3F, 17F, -8F);
		Shape6bF.setTextureSize(128, 128);
		Shape6bF.mirror = true;
		this.setRotation(Shape6bF, 0F, -2.094395F, 0F);
		Shape6bG = new LODModelPart(this, 0, 0);
		Shape6bG.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6bG.setRotationPoint(-3F, 17F, 8F);
		Shape6bG.setTextureSize(128, 128);
		Shape6bG.mirror = true;
		this.setRotation(Shape6bG, 0F, 1.047198F, 0F);
		Shape6bH = new LODModelPart(this, 0, 0);
		Shape6bH.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6bH.setRotationPoint(3F, 17F, 8F);
		Shape6bH.setTextureSize(128, 128);
		Shape6bH.mirror = true;
		this.setRotation(Shape6bH, 0F, 2.094395F, 0F);
		Shape5dI = new LODModelPart(this, 0, 0);
		Shape5dI.addBox(0F, -1F, 0F, 5, 1, 6);
		Shape5dI.setRotationPoint(-8F, 9F, -3F);
		Shape5dI.setTextureSize(128, 128);
		Shape5dI.mirror = true;
		this.setRotation(Shape5dI, 0F, 0F, 0.5235988F);
		Shape5dJ = new LODModelPart(this, 0, 0);
		Shape5dJ.addBox(0F, 0F, 0F, 6, 1, 5);
		Shape5dJ.setRotationPoint(-3F, 23F, -8F);
		Shape5dJ.setTextureSize(128, 128);
		Shape5dJ.mirror = true;
		this.setRotation(Shape5dJ, 0.5235988F, 0F, 0F);
		Shape5dK = new LODModelPart(this, 0, 0);
		Shape5dK.addBox(0F, 0F, 0F, 6, 1, 5);
		Shape5dK.setRotationPoint(-3F, 17F, 8F);
		Shape5dK.setTextureSize(128, 128);
		Shape5dK.mirror = true;
		this.setRotation(Shape5dK, -2.617994F, 0F, 0F);
		Shape5dL = new LODModelPart(this, 0, 0);
		Shape5dL.addBox(0F, -1F, 0F, 6, 1, 5);
		Shape5dL.setRotationPoint(-3F, 23F, 8F);
		Shape5dL.setTextureSize(128, 128);
		Shape5dL.mirror = true;
		this.setRotation(Shape5dL, 2.617994F, 0F, 0F);
		Shape5dM = new LODModelPart(this, 0, 0);
		Shape5dM.addBox(0F, -1F, 0F, 6, 1, 5);
		Shape5dM.setRotationPoint(-3F, 9F, -8F);
		Shape5dM.setTextureSize(128, 128);
		Shape5dM.mirror = true;
		this.setRotation(Shape5dM, -0.5235988F, 0F, 0F);
		Shape5dN = new LODModelPart(this, 0, 0);
		Shape5dN.addBox(0F, 0F, 0F, 6, 1, 5);
		Shape5dN.setRotationPoint(-3F, 9F, 8F);
		Shape5dN.setTextureSize(128, 128);
		Shape5dN.mirror = true;
		this.setRotation(Shape5dN, -2.617994F, 0F, 0F);
		Shape5dO = new LODModelPart(this, 0, 0);
		Shape5dO.addBox(0F, 0F, 0F, 6, 1, 5);
		Shape5dO.setRotationPoint(-3F, 15F, -8F);
		Shape5dO.setTextureSize(128, 128);
		Shape5dO.mirror = true;
		this.setRotation(Shape5dO, 0.5235988F, 0F, 0F);
		Shape5dP = new LODModelPart(this, 0, 0);
		Shape5dP.addBox(0F, -1F, 0F, 6, 1, 5);
		Shape5dP.setRotationPoint(-3F, 15F, 8F);
		Shape5dP.setTextureSize(128, 128);
		Shape5dP.mirror = true;
		this.setRotation(Shape5dP, 2.617994F, 0F, 0F);
		Shape6bQ = new LODModelPart(this, 0, 0);
		Shape6bQ.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6bQ.setRotationPoint(3F, 9F, -8F);
		Shape6bQ.setTextureSize(128, 128);
		Shape6bQ.mirror = true;
		this.setRotation(Shape6bQ, 0F, -2.094395F, 0F);
		Shape6bR = new LODModelPart(this, 0, 0);
		Shape6bR.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6bR.setRotationPoint(3F, 9F, 8F);
		Shape6bR.setTextureSize(128, 128);
		Shape6bR.mirror = true;
		this.setRotation(Shape6bR, 0F, 2.094395F, 0F);
		Shape6bS = new LODModelPart(this, 0, 0);
		Shape6bS.addBox(0F, 0F, 0F, 5, 6, 1);
		Shape6bS.setRotationPoint(-3F, 9F, -8F);
		Shape6bS.setTextureSize(128, 128);
		Shape6bS.mirror = true;
		this.setRotation(Shape6bS, 0F, -1.047198F, 0F);
		Shape6bT = new LODModelPart(this, 0, 0);
		Shape6bT.addBox(0F, 0F, -1F, 5, 6, 1);
		Shape6bT.setRotationPoint(-3F, 9F, 8F);
		Shape6bT.setTextureSize(128, 128);
		Shape6bT.mirror = true;
		this.setRotation(Shape6bT, 0F, 1.047198F, 0F);
		Shape8aaa = new LODModelPart(this, 0, 64);
		Shape8aaa.addBox(0F, 0F, 0F, 2, 2, 12);
		Shape8aaa.setRotationPoint(-1F, 19F, -6F);
		Shape8aaa.setTextureSize(128, 128);
		Shape8aaa.mirror = true;
		this.setRotation(Shape8aaa, 0F, 0F, 0F);
		Shape8aa = new LODModelPart(this, 0, 64);
		Shape8aa.addBox(0F, 0F, 0F, 2, 2, 12);
		Shape8aa.setRotationPoint(-1F, 11F, -6F);
		Shape8aa.setTextureSize(128, 128);
		Shape8aa.mirror = true;
		this.setRotation(Shape8aa, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape2aA.render(te, f5);
		Shape3cA.render(te, f5);
		Shape3cB.render(te, f5);
		Shape3aA.render(te, f5);
		Shape3A.render(te, f5);
		Shape2A.render(te, f5);
		Shape2bA.render(te, f5);
		Shape4.render(te, f5);
		Shape4e.render(te, f5);
		Shape4d.render(te, f5);
		Shape4c.render(te, f5);
		Shape4b.render(te, f5);
		Shape4a.render(te, f5);
		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape5b.render(te, f5);
		Shape5d.render(te, f5);
		Shape6.render(te, f5);
		Shape6c.render(te, f5);
		Shape6b.render(te, f5);
		Shape6a.render(te, f5);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape5df.render(te, f5);
		Shape5dA.render(te, f5);
		Shape5bf.render(te, f5);
		Shape5bA.render(te, f5);
		Shape6bA.render(te, f5);
		Shape6bB.render(te, f5);
		Shape6aC.render(te, f5);
		Shape6aD.render(te, f5);
		Shape6bE.render(te, f5);
		Shape6bF.render(te, f5);
		Shape6bG.render(te, f5);
		Shape6bH.render(te, f5);
		Shape5dI.render(te, f5);
		Shape5dJ.render(te, f5);
		Shape5dK.render(te, f5);
		Shape5dL.render(te, f5);
		Shape5dM.render(te, f5);
		Shape5dN.render(te, f5);
		Shape5dO.render(te, f5);
		Shape5dP.render(te, f5);
		Shape6bQ.render(te, f5);
		Shape6bR.render(te, f5);
		Shape6bS.render(te, f5);
		Shape6bT.render(te, f5);
		Shape8aaa.render(te, f5);
		Shape8aa.render(te, f5);
	}

}

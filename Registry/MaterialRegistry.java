/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Registry;

import java.util.Locale;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;

import Reika.DragonAPI.Libraries.MathSci.ReikaEngLibrary;
import Reika.DragonAPI.ModInteract.ItemHandlers.MekToolHandler;
import Reika.DragonAPI.ModInteract.ItemHandlers.RedstoneArsenalHandler;
import Reika.DragonAPI.ModInteract.ItemHandlers.TinkerToolHandler;
import Reika.RotaryCraft.Auxiliary.RotaryAux;

public enum MaterialRegistry {

	WOOD(	-1, ReikaEngLibrary.Ewood, 		ReikaEngLibrary.Gwood, 		ReikaEngLibrary.Twood, 		ReikaEngLibrary.Swood, 		ReikaEngLibrary.rhowood),
	STONE(	0, ReikaEngLibrary.Estone, 		ReikaEngLibrary.Gstone, 	ReikaEngLibrary.Tstone, 	ReikaEngLibrary.Sstone, 	ReikaEngLibrary.rhorock),
	STEEL(	1, ReikaEngLibrary.Esteel, 		ReikaEngLibrary.Gsteel, 	ReikaEngLibrary.Tsteel, 	ReikaEngLibrary.Ssteel, 	ReikaEngLibrary.rhoiron),
	TUNGSTEN(1, ReikaEngLibrary.Etungsten, 	ReikaEngLibrary.Gtungsten, 	ReikaEngLibrary.Ttungsten, 	ReikaEngLibrary.Stungsten, 	RotaryAux.tungstenDensity),
	DIAMOND(2, ReikaEngLibrary.Ediamond, 	ReikaEngLibrary.Gdiamond, 	ReikaEngLibrary.Tdiamond, 	ReikaEngLibrary.Sdiamond, 	ReikaEngLibrary.rhodiamond),
	BEDROCK(3, Double.POSITIVE_INFINITY, 	Double.POSITIVE_INFINITY, 	Double.POSITIVE_INFINITY, 	Double.POSITIVE_INFINITY, 	ReikaEngLibrary.rhorock);

	private double Emod;
	private double Smod;
	private double tensile;
	private double shear;
	private double rho;

	public final int harvestLevel;

	public static final MaterialRegistry[] matList = values();

	private MaterialRegistry(int h, double E, double G, double TS, double S, double den) {
		Emod = E;
		Smod = G;
		tensile = TS;
		shear = S;
		rho = den;
		harvestLevel = h;
	}

	public double getElasticModulus() {
		return Emod;
	}

	public double getShearModulus() {
		return Smod;
	}

	public double getTensileStrength() {
		return tensile;
	}

	public double getShearStrength() {
		return shear;
	}

	public double getDensity() {
		return rho;
	}

	public boolean isInfiniteStrength() {
		return this == BEDROCK;
	}

	public boolean isFlammable() {
		return this == WOOD;
	}

	public String getDamageNoise() {
		if (this == WOOD)
			return "dig.wood";
		if (this == STONE)
			return "dig.stone";
		return "mob.blaze.hit";
	}

	public String getBaseShaftTexture() {
		String tex = "shafttex";
		switch(this) {
			case BEDROCK:
				tex = tex+"b";
				break;
			case DIAMOND:
				tex = tex+"d";
				break;
			case STONE:
				tex = tex+"s";
				break;
			case TUNGSTEN:
				tex = tex+"t";
				break;
			case WOOD:
				tex = tex+"w";
				break;
			default:
				break;
		}
		return tex+".png";
	}

	public boolean isHarvestablePickaxe(ItemStack tool) {
		if (harvestLevel < 0)
			return true;
		if (tool == null)
			return false;
		Item item = tool.getItem();
		if (item == ItemRegistry.BEDPICK.getItemInstance())
			return true;
		if (item == ItemRegistry.STEELPICK.getItemInstance())
			return this != BEDROCK;
		if (item instanceof ItemPickaxe) {
			switch(this) {
				case STONE:
					return true;
				case STEEL:
					return item.canHarvestBlock(Blocks.iron_ore, tool);
				case DIAMOND:
					return item.canHarvestBlock(Blocks.diamond_ore, tool);
				case BEDROCK:
					return item.canHarvestBlock(Blocks.obsidian, tool);
				default:
					return false;
			}
		}
		if (TinkerToolHandler.getInstance().isPick(tool)) {
			switch(this) {
				case STONE:
					return true;
				case STEEL:
					return TinkerToolHandler.getInstance().isStoneOrBetter(tool);
				case DIAMOND:
					return TinkerToolHandler.getInstance().isIronOrBetter(tool);
				case BEDROCK:
					return TinkerToolHandler.getInstance().isDiamondOrBetter(tool);
				default:
					return false;
			}
		}
		if (MekToolHandler.getInstance().isPickTypeTool(tool)) {
			switch(this) {
				case STONE:
					return true;
				case STEEL:
					return item.canHarvestBlock(Blocks.iron_ore, tool);
				case DIAMOND:
					return item.canHarvestBlock(Blocks.diamond_ore, tool);
				case BEDROCK:
					return item.canHarvestBlock(Blocks.obsidian, tool);
				default:
					return false;
			}
		}
		if (item == RedstoneArsenalHandler.getInstance().pickID) {
			return RedstoneArsenalHandler.getInstance().pickLevel >= harvestLevel;
		}
		switch(this) {
			case STONE:
				return item.canHarvestBlock(Blocks.stone, tool);
			case STEEL:
				return item.canHarvestBlock(Blocks.iron_ore, tool);
			case DIAMOND:
				return item.canHarvestBlock(Blocks.diamond_ore, tool);
			case BEDROCK:
				return item.canHarvestBlock(Blocks.obsidian, tool);
			default:
				break;
		}
		return false;
	}

	public String getName() {
		return StatCollector.translateToLocal("material."+this.name().toLowerCase(Locale.ENGLISH));
	}

	public double getMaxShaftTorque() {
		if (this.isInfiniteStrength())
			return Double.POSITIVE_INFINITY;
		double r = 0.0625;
		double tau = this.getShearStrength();
		return 0.5*Math.PI*r*r*r*tau/16D;
	}

	public double getMaxShaftSpeed() {
		if (this.isInfiniteStrength())
			return Double.POSITIVE_INFINITY;
		double f = 1D/this.getSpeedForceExponent();
		double rho = this.getDensity();
		double r = 0.0625;
		double sigma = this.getTensileStrength();
		double base = Math.sqrt(2*sigma/(rho*r*r));
		return Math.pow(base, f);
	}

	public static int[] getAllLimitLoads() {
		int[] loads = new int[matList.length*2-2];
		for (int i = 0; i < loads.length; i += 2) {
			int j = i/2;
			MaterialRegistry m = matList[j];
			loads[i] = (int)m.getMaxShaftTorque();
			loads[i+1] = (int)m.getMaxShaftSpeed();
		}
		return loads;
	}

	public ItemStack getShaftItem() {
		;//return MachineRegistry.SHAFT.getCraftedMetadataProduct(this.INDEX());
		ItemStack is = MachineRegistry.SHAFT.getCraftedProduct();
		is.stackTagCompound = new NBTTagCompound();
		is.stackTagCompound.setString("material", this.name());
		return is;
	}

	public static MaterialRegistry getMaterialFromShaftItem(ItemStack is) {
		if (is.stackTagCompound != null && is.stackTagCompound.hasKey("material"))
			return MaterialRegistry.valueOf(is.stackTagCompound.getString("material"));
		return MaterialRegistry.matList[is.getItemDamage()];
	}

	public double getSpeedForceExponent() {
		return 1-(0.11D*this.ordinal());
	}

	public String getShaftUnlocName() {
		return "material."+this.name().toLowerCase(Locale.ENGLISH);
	}
}

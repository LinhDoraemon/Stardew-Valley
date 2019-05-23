package com.LinhDoraemon.cooking;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewFish;
import com.LinhDoraemon.SpecialItem.StardewFoods;
import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.cropstype.Corn;
import com.LinhDoraemon.cropstype.Cranberries;
import com.LinhDoraemon.cropstype.EggPlant;
import com.LinhDoraemon.cropstype.Pumpkin;
import com.LinhDoraemon.cropstype.RedCabbage;
import com.LinhDoraemon.ocean.OceanItems;

public enum FoodRecipes {

	COOKIE(new ItemStack[] {StardewItems.FLOUR(), StardewItems.SUGAR(), StardewItems.EGG()}, StardewFoods.COOKIE()),
	CHOWDER(new ItemStack[] {StardewItems.CLAM(), StardewItems.MILK()}, StardewFoods.CHOWDER()),
	PUMPKIN_PIE(new ItemStack[] {Pumpkin.getPumpkin()}, StardewFoods.PUMPKIN_PIE()),
	FRIED_CALAMARI(new ItemStack[] {StardewFish.SQUID(), StardewItems.FLOUR(), StardewItems.OIL()}, StardewFoods.FRIED_CALAMARI()),
	FRIED_MUSHROOM(new ItemStack[] {StardewItems.COMMON_MUSHROOM(), StardewItems.RED_MUSHROOM(), StardewItems.OIL()}, StardewFoods.FRIED_MUSHROOM()),
	TOM_KHA_SOUP(new ItemStack[] {StardewItems.COCONUT(), OceanItems.getItem(OceanItems.SHRIMP), StardewItems.COMMON_MUSHROOM()}, StardewFoods.TOM_KHA_SOUP()),
	FISH_TACO(new ItemStack[] {StardewFish.TUNA(), StardewFoods.TORTILLA(), RedCabbage.getRedCabbage(), StardewItems.MAYONNAISE()}, StardewFoods.FISH_TACO()),
	TORTILLA(new ItemStack[] {Corn.getCorn()}, StardewFoods.TORTILLA()),
	CRANBERRY_SAUCE(new ItemStack[] {Cranberries.getCranberries(), StardewItems.SUGAR()}, StardewFoods.CRANBERRY_SAUCE()),
	BREAD(new ItemStack[] {StardewItems.FLOUR()}, StardewFoods.BREAD()),
	SURVIVAL_HAMBURGER(new ItemStack[] {StardewFoods.BREAD(), StardewItems.CAVE_CARROT(), EggPlant.getEggPlant()}, StardewFoods.SURVIVAL_HAMBURGER());
	
	private ItemStack[] ingredients;
	private ItemStack result;
	
	FoodRecipes(ItemStack[] ingredients, ItemStack result){
		this.ingredients = ingredients;
		this.result = result;
	}
	
	public static List<ItemStack> getAllIngredients(){
		List<ItemStack> l = new ArrayList<ItemStack>();
		for (FoodRecipes rc : FoodRecipes.values()) {
			for(ItemStack i : rc.getIngredients()) {
				l.add(i);
			}
		}
		return l;
	}
	
	public static FoodRecipes getRecipe(String resultname) {
		for (FoodRecipes rc : FoodRecipes.values()) {
			ItemStack i = rc.getItemStack();
			if(i.hasItemMeta() && i.getItemMeta().hasDisplayName() && 
					i.getItemMeta().getDisplayName().equalsIgnoreCase(resultname)) {
				return rc;
			}else {
				continue;
			}
		}
		return null;
	}
	
	public ItemStack[] getIngredients() {
		return ingredients;
	}
	
	public ItemStack getItemStack() {
		return result;
	}
	
	public void removeAllIngredients(Inventory inv) {
		ItemStack one = inv.getItem(1);
		ItemStack two = inv.getItem(2);
		ItemStack three = inv.getItem(3);
		ItemStack four = inv.getItem(10);

		if(getIngredients().length == 1) {
			int o = one.getAmount(); 
	
			one.setAmount(o - 1);
			return;
		}
		
		if(getIngredients().length == 2) {
			int o = one.getAmount(); 
			int tw = two.getAmount(); 
			
			one.setAmount(o - 1);
			two.setAmount(tw - 1);
			return;
		}
		
		if(getIngredients().length == 3) {
			int o = one.getAmount(); 
			int tw = two.getAmount(); 
			int th = three.getAmount(); 
	
			one.setAmount(o - 1);
			two.setAmount(tw - 1);
			three.setAmount(th - 1);
			return;
		}
		
		if(getIngredients().length == 4) {
			int o = one.getAmount(); 
			int tw = two.getAmount(); 
			int th = three.getAmount(); 
			int f = four.getAmount(); 
			one.setAmount(o - 1);
			two.setAmount(tw - 1);
			three.setAmount(th - 1);
			four.setAmount(f - 1);
			return;
		}
	}
	//3,4,5,12
	public boolean isShaped(Inventory inv) {
		if(getIngredients().length == 1) {
			if(inv.getItem(1).hasItemMeta() && inv.getItem(1).getItemMeta().hasDisplayName()
					&& inv.getItem(1).getItemMeta().getDisplayName().equals(getIngredients()[0].getItemMeta().getDisplayName())) {
				return true;
			}else {
				return false;
			}
		}
		
		if(getIngredients().length == 2) {
			if(checkImt(inv.getItem(1)) && checkImt(inv.getItem(2))
					&& inv.getItem(1).getItemMeta().getDisplayName().equals(getIngredients()[0].getItemMeta().getDisplayName())
					&& inv.getItem(2).getItemMeta().getDisplayName().equals(getIngredients()[1].getItemMeta().getDisplayName())) {
				return true;
			}else {
				return false;
			}
		}
		
		if(getIngredients().length == 3) {
			if(checkImt(inv.getItem(1)) && checkImt(inv.getItem(2)) && checkImt(inv.getItem(3))
					&& inv.getItem(1).getItemMeta().getDisplayName().equals(getIngredients()[0].getItemMeta().getDisplayName())
					&& inv.getItem(3).getItemMeta().getDisplayName().equals(getIngredients()[2].getItemMeta().getDisplayName())
					&& inv.getItem(2).getItemMeta().getDisplayName().equals(getIngredients()[1].getItemMeta().getDisplayName())) {
				return true;
			}else {
				return false;
			}
		}
		
		if(getIngredients().length == 4) {
			if(checkImt(inv.getItem(1)) && checkImt(inv.getItem(2)) && checkImt(inv.getItem(3)) && checkImt(inv.getItem(10))
					&& inv.getItem(1).getItemMeta().getDisplayName().equals(getIngredients()[0].getItemMeta().getDisplayName())
					&& inv.getItem(3).getItemMeta().getDisplayName().equals(getIngredients()[2].getItemMeta().getDisplayName())
					&& inv.getItem(10).getItemMeta().getDisplayName().equals(getIngredients()[3].getItemMeta().getDisplayName())
					&& inv.getItem(2).getItemMeta().getDisplayName().equals(getIngredients()[1].getItemMeta().getDisplayName())) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}
	
	private boolean checkImt(ItemStack i) {
		if(i.hasItemMeta() && i.getItemMeta().hasDisplayName()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static List<ItemStack> getAllResults() {
		List<ItemStack> l = new ArrayList<ItemStack>();
		for(FoodRecipes rc : FoodRecipes.values()) {
			l.add(rc.getItemStack());
		}
		return l;
	}
}

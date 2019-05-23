package com.LinhDoraemon.mining;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

public enum SmeltRecipe {

	COPPER_ORE(StardewItems.COPPER_BAR(), StardewItems.COPPER_CLUSTER()),
	IRON_ORE(StardewItems.IRON_BAR(), StardewItems.IRON_CLUSTER()),
	GOLD_ORE(StardewItems.GOLD_BAR(), StardewItems.GOLD_CLUSTER()),
	IRIDIUM_ORE(StardewItems.IRIDIUM_BAR(), StardewItems.IRIDIUM_CLUSTER());
	
	private ItemStack result;
	private ItemStack source;
	
	SmeltRecipe(ItemStack result, ItemStack source) {
		this.result = result;
		this.source = source;
	}
	
	public ItemStack getResult() {
		return result;
	}
	
	public ItemStack getSource() {
		return source;
	}
	
	public static List<String> getAllSources(){
		List<String> l = new ArrayList<String>();
		for(SmeltRecipe rc : SmeltRecipe.values()) {
			l.add(rc.getSource().getItemMeta().getDisplayName());
		}
		return l;
	}
	
	public static List<ItemStack> getAllResults(){
		List<ItemStack> l = new ArrayList<ItemStack>();
		for(SmeltRecipe rc : SmeltRecipe.values()) {
			l.add(rc.getResult());
		}
		return l;
	}
	
	public static void register() {
		FurnaceRecipe rc1 = new FurnaceRecipe(StardewItems.COPPER_BAR(), StardewItems.COPPER_CLUSTER().getData());
		Bukkit.addRecipe(rc1);
		
		FurnaceRecipe rc2 = new FurnaceRecipe(StardewItems.IRON_BAR(), StardewItems.IRON_CLUSTER().getData());
		Bukkit.addRecipe(rc2);
		
		FurnaceRecipe rc3 = new FurnaceRecipe(StardewItems.GOLD_BAR(), StardewItems.GOLD_CLUSTER().getData());
		Bukkit.addRecipe(rc3);
		
		FurnaceRecipe rc4 = new FurnaceRecipe(StardewItems.IRIDIUM_BAR(), StardewItems.IRIDIUM_CLUSTER().getData());
		Bukkit.addRecipe(rc4);
	}
}

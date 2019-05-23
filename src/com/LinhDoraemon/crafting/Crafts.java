package com.LinhDoraemon.crafting;

import org.bukkit.inventory.ItemStack;

public class Crafts {

	private ItemStack item;
	private int amount;
	
	public Crafts(ItemStack item, int amount) {
		this.item = item;
		this.amount = amount;
	}
	
	public ItemStack getItemStack() {
		return item;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public boolean hasItemMeta() {
		return item.hasItemMeta();
	}

	public boolean hasDisplayName() {
		return item.getItemMeta().hasDisplayName();
	}
	
	public String getDisplayName() {
		if(hasItemMeta() && item.getItemMeta().hasDisplayName()) {
			return item.getItemMeta().getDisplayName();
		}else {
			return null;
		}
	}
	
}

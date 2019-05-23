package com.LinhDoraemon.utils;

import java.util.ArrayList;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SimpleItem {

	public static void addLore(ItemMeta mt, String... l) {
		ArrayList<String> lore = new ArrayList<String>();
		for (String hihi : l) {
			lore.add(hihi);
		}

		mt.setLore(lore);

	}
	
	public static void replaceLore(ItemStack i, int lore, String replace) {
		i.getItemMeta().getLore().remove(lore);
		i.getItemMeta().getLore().set(lore, replace);
	}

	public static String isHealth(double mau) {

		return "§a§l✙ §6" + mau;
		
	}
	
	public static String isFood(double food) {

		return "§c§l✙ §e" + food;
		
	}

	public static boolean consumeItem(Player player, int count, Material mat) {
	    Map<Integer, ? extends ItemStack> ammo = player.getInventory().all(mat);

	    int found = 0;
	    for (ItemStack stack : ammo.values())
	        found += stack.getAmount();
	    if (count > found)
	        return false;

	    for (Integer index : ammo.keySet()) {
	        ItemStack stack = ammo.get(index);

	        int removed = Math.min(count, stack.getAmount());
	        count -= removed;

	        if (stack.getAmount() == removed)
	            player.getInventory().setItem(index, null);
	        else
	            stack.setAmount(stack.getAmount() - removed);

	        if (count <= 0)
	            break;
	    }

	    player.updateInventory();
	    return true;
	}
	
}

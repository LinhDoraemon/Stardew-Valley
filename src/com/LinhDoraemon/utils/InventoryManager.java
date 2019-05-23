package com.LinhDoraemon.utils;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InventoryManager {

	private static HashMap<String, ItemStack[]> inventoryContents = new HashMap<String, ItemStack[]>();

	public static void saveInventory(Player player) {
		inventoryContents.put(player.getName(), player.getInventory().getContents());
		player.getInventory().clear();
	}

	public static void restoreInventory(Player player) {
		player.getInventory().clear();

		player.getInventory().setContents(inventoryContents.get(player.getName()));

		inventoryContents.remove(player.getName());
	}

}

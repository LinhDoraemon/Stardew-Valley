package com.LinhDoraemon.machines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class BeeHouse {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> BEE_HOUSE_LIST = new ArrayList<Location>();

	public static void addBeeHouse(Block b) {
		Location loc = b.getLocation();
		BEE_HOUSE_LIST.add(loc);
		getBeeInventory(loc);
	}

	public static void removeBeeHouse(Block b) {
		Location loc = b.getLocation();
		BEE_HOUSE_LIST.remove(loc);
		inventories.remove(b);
	}

	public static Inventory getBeeInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 9, "§0§lTổ nuôi ong - BEE HOUSE");
			i.clear();
			i.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			i.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			inventories.put(loc, i);
		}
		return i;

	}

	public static void startProduceHoney() {

		for (Location loc : inventories.keySet()) {
			getBeeInventory(loc).addItem(StardewItems.HONEY());
		}

	}

}

package com.LinhDoraemon.cooking;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FoodGUI {

	private static HashMap<String, Inventory> inventories = new HashMap<>();
	private static HashMap<String, Inventory> inventoriess = new HashMap<>();

	private static Inventory recipes = Bukkit.createInventory(null, 27, "§0§lCông thức nấu ăn");

	public static Inventory getCookGUI(Player p) {
		Inventory i = inventories.get(p.getName());

		if (i == null) {
			i = Bukkit.createInventory(null, 27, "§0§lNhà bếp");
			
			ItemStack pane1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
			ItemStack pane2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 2);
			
			ItemStack redstone = new ItemStack(Material.REDSTONE);
			ItemMeta mt = redstone.getItemMeta();
			mt.setDisplayName("§c§lCHẾ BIẾN");
			redstone.setItemMeta(mt);

			ItemStack item = new ItemStack(Material.BOOK);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName("§a§lCÁC CÔNG THỨC NẤU ĂN");
			item.setItemMeta(meta);
			
			i.setItem(0, pane1);
			i.setItem(9, pane1);
			i.setItem(18, pane1);
			i.setItem(4, pane1);
			i.setItem(13, pane1);
			i.setItem(22, pane1);

			i.setItem(5, redstone);
			i.setItem(14, item);

			i.setItem(6, pane2);
			i.setItem(15, pane2);
			i.setItem(24, pane2);
			i.setItem(7, pane2);
			i.setItem(8, pane2);
			i.setItem(17, pane2);
			i.setItem(26, pane2);
			i.setItem(25, pane2);

			inventories.put(p.getName(), i);
		}

		return i;

	}

	public static Inventory getRecipeChooseGUI() {

		recipes.clear();

		for (ItemStack item : FoodRecipes.getAllResults()) {
			recipes.addItem(item);
		}

		return recipes;
	}
	
	public static Inventory getRecipeCookGUI(Player p, FoodRecipes rc) {
		Inventory i = inventoriess.get(p.getName());

		if (i == null) {
			i = Bukkit.createInventory(null, 27, "§0§lNấu ăn");

			ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 6);
			for(int so = 0; so < i.getSize(); so++) {
				i.setItem(so, pane);
			}

			i.setItem(3, null);
			i.setItem(4, null);
			i.setItem(5, null);
			i.setItem(12, null);
			i.setItem(13, null);
			i.setItem(14, null);
			i.setItem(21, null);
			i.setItem(22, null);
			i.setItem(23, null);
			
			ItemStack menu = new ItemStack(Material.ARROW);
			ItemMeta mt = menu.getItemMeta();
			mt.setDisplayName("§eQuay về trang trước");
			menu.setItemMeta(mt);
			
			i.setItem(0, menu);
			
			for(ItemStack it : rc.getIngredients()) {
				i.addItem(it);
			}
			
			inventoriess.put(p.getName(), i);
		}

		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 6);
		for(int so = 0; so < i.getSize(); so++) {
			i.setItem(so, pane);
		}

		i.setItem(3, null);
		i.setItem(4, null);
		i.setItem(5, null);
		i.setItem(12, null);
		i.setItem(13, null);
		i.setItem(14, null);
		i.setItem(21, null);
		i.setItem(22, null);
		i.setItem(23, null);
		
		ItemStack menu = new ItemStack(Material.ARROW);
		ItemMeta mt = menu.getItemMeta();
		mt.setDisplayName("§eQuay về trang trước");
		menu.setItemMeta(mt);
		
		for(ItemStack it : rc.getIngredients()) {
			i.addItem(it);
		}
		
		return i;
	}
	

}

package com.LinhDoraemon.ring;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RingGUI implements Listener {

	private static HashMap<String, Inventory> inventories = new HashMap<String, Inventory>();

	public static Inventory getRingGUI(String player) {
		Inventory i = inventories.get(player);

		if (i == null) {
			i = Bukkit.createInventory(null, 9, "§0§lGUI trang bị nhẫn >>");
			i.clear();

			ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);

			for(int so = 0; so < i.getSize(); so++) {
				i.setItem(so, pane);
			}
			
			i.setItem(4, null);
			
			inventories.put(player, i);
		}
		return i;
	}
	
	@EventHandler
	public void openringguingaydi(InventoryClickEvent e) {
		
		ItemStack i = e.getCurrentItem();
		
		if(i == null) {
			return;
		}
		
		if(e.getClickedInventory().getTitle() != "§0§lGUI trang bị nhẫn >>") {
			return;
		}
		
		if(i.getType() == Material.STAINED_GLASS_PANE) {
		
			e.setCancelled(true);
			return;
		}
		
	}
	
}

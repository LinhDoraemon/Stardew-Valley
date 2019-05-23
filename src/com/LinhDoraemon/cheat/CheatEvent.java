package com.LinhDoraemon.cheat;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CheatEvent implements Listener {

	public static Inventory cheat = Bukkit.createInventory(null, 54, "§4Cheat Inventory For Admin");

	public int page = 1;

	public static void open(Player p) {
		cheat.clear();
		cheat.setItem(53, next());
		cheat.setItem(45, previous());
		for (ItemStack item : CheatItem.PAGE_1) {
			cheat.addItem(item);
		}
		p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
		p.openInventory(cheat);
	}

	@EventHandler
	public void CHEAT_EVENT(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getName().equalsIgnoreCase("§4Cheat Inventory For Admin") == false) {
			return;
		}

		if (i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}

		e.setCancelled(true);

		if (i.getType() == Material.STAINED_GLASS_PANE) {

		} else {
			p.getInventory().addItem(i);
		}

		if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§aNext Page")) {
			if (page == 1) {
				cheat.clear();
				for (ItemStack item : CheatItem.PAGE_2) {
					cheat.setItem(53, next());
					cheat.setItem(45, previous());
					cheat.addItem(item);
				}
				page = 2;
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				return;
			}

			if (page == 2) {
				cheat.clear();
				for (ItemStack item : CheatItem.PAGE_3) {
					cheat.setItem(53, next());
					cheat.setItem(45, previous());
					cheat.addItem(item);
				}
				page = 3;
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				return;
			}
		}

		if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§cPrevious Page")) {
			if (page == 2) {
				cheat.clear();
				for (ItemStack item : CheatItem.PAGE_1) {
					cheat.setItem(53, next());
					cheat.setItem(45, previous());
					cheat.addItem(item);
				}
				page = 1;
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				return;
			}

			if (page == 3) {
				cheat.clear();
				for (ItemStack item : CheatItem.PAGE_2) {
					cheat.setItem(53, next());
					cheat.setItem(45, previous());
					cheat.addItem(item);
				}
				page = 2;
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				return;
			}
		}
	}

	private static ItemStack next() {
		ItemStack i = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§aNext Page");
		i.setItemMeta(mt);
		return i;
	}

	private static ItemStack previous() {
		ItemStack i = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§cPrevious Page");
		i.setItemMeta(mt);
		return i;
	}

}

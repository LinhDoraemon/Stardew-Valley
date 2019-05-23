package com.LinhDoraemon.machenics;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.DataStorage;

public class Backpack implements Listener {

	public static ItemStack BACKPACK_LEVEL_2() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0d" + "HA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3Rle"
						+ "HR1cmUvODVlNGY5ZGE2OGM4MWZhNDgxZWVjZGNhN" + "DhhMTM4Y2VjZGUyY2RkZmZlZWFlODRhYjFhZmQyNG"
						+ "EzNjNlMDI4In19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§l[§c§k|§c§l| LEVEL 2 |§c§k|§f§l]");
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack BACKPACK_LEVEL_3() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
						+ "ZnQubmV0L3RleHR1cmUvYTNjMTUzYzM5M" + "WMzNGUyZDMyOGE2MDgzOWU2ODNhOWY4MmF"
						+ "kMzA0ODI5OWQ4YmM2YTM5ZTZmOTE1Y2M1YSJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§l[§b§k|§b§l| LEVEL 3 |§b§k|§f§l]");
		item.setItemMeta(mt);
		return item;
	}

	private static HashMap<String, Inventory> inventories2 = new HashMap<String, Inventory>();
	private static HashMap<String, Inventory> inventories3 = new HashMap<String, Inventory>();

	public static Inventory getBackPack2(String playername) {
		Inventory i = inventories2.get(playername);
		if (i == null) {
			i = Bukkit.createInventory(null, 9, "§9§l" + playername + " §0- " + "§0§lBalô cấp 2");
			inventories2.put(playername, i);
		}
		return i;
	}

	public static Inventory getBackPack3(String playername) {
		Inventory i = inventories3.get(playername);
		if (i == null) {
			i = Bukkit.createInventory(null, 18, "§9§l" + playername + " §0- " + "§0§lBalô cấp 3");
			inventories3.put(playername, i);
		}
		return i;
	}

	public static Inventory chon = Bukkit.createInventory(null, 9, "§0§lChọn ba lô >>");

	public static boolean openChonBackPack(Player p) {

		chon.setItem(3, BACKPACK_LEVEL_2());
		chon.setItem(5, BACKPACK_LEVEL_3());

		for (int i = 0; i < chon.getSize(); i++) {
			if (chon.getItem(i) == null) {
				chon.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
			}
		}

		p.openInventory(chon);
		return true;
	}

	@EventHandler
	public void mochonbackpackchonkac(InventoryClickEvent e) {

		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lChế tạo - CRAFTING") {
			return;
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§f§lMở ba lô")) {
			e.setCancelled(true);
			p.closeInventory();
			openChonBackPack(p);
			return;
		}
	}

	public static void saveBackpack() {
		DataStorage.saveHashMap1(inventories2);
		DataStorage.saveHashMap2(inventories3);
	}
	
	public static void loadBackpack() {
		DataStorage.loadHashMap1();
		DataStorage.loadHashMap2();
	}

	@EventHandler
	public void mobakpackradiemyeu(InventoryClickEvent e) {

		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lChọn ba lô >>") {
			return;
		}

		e.setCancelled(true);

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
				.equalsIgnoreCase(BACKPACK_LEVEL_2().getItemMeta().getDisplayName())) {
			if (PlayerData.getPlayerInventoryLevel(p.getName()) == 2
					|| PlayerData.getPlayerInventoryLevel(p.getName()) == 3) {
				p.openInventory(getBackPack2(p.getName()));
				return;
			} else {
				p.closeInventory();
				p.sendMessage("§c§lBạn chưa nâng cấp ba lô lên cấp độ §f§l2");
				return;
			}
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
				.equalsIgnoreCase(BACKPACK_LEVEL_3().getItemMeta().getDisplayName())) {
			if (PlayerData.getPlayerInventoryLevel(p.getName()) == 3) {
				p.openInventory(getBackPack3(p.getName()));
				return;
			} else {
				p.closeInventory();
				p.sendMessage("§c§lBạn chưa nâng cấp ba lô lên cấp độ §f§l3");
				return;
			}
		}

	}

}

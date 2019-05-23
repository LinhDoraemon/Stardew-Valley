package com.LinhDoraemon.machines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class Loom implements Listener {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> CHEESE_PRESS_LIST = new ArrayList<Location>();

	public static void addLoomMachine(Block b) {
		Location loc = b.getLocation();
		CHEESE_PRESS_LIST.add(loc);
		getLoomInventory(loc);
	}

	public static void removeLoomMachine(Block b) {

		Location loc = b.getLocation();
		CHEESE_PRESS_LIST.remove(b.getLocation());
		inventories.remove(loc);

	}

	public static void registerLoom() {
		Bukkit.getPluginManager().registerEvents(new Loom(),
				Bukkit.getPluginManager().getPlugin("StardewValley"));
	}

	public static Inventory getLoomInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 18, "§0§lMáy dệt - LOOM");

			ItemStack done = new ItemStack(Material.REDSTONE);
			ItemMeta mt = done.getItemMeta();
			mt.setDisplayName("§a§l§nChế biến");
			done.setItemMeta(mt);

			i.clear();
			i.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE));

			i.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(10, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(11, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(12, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(13, done);
			i.setItem(14, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(15, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(16, new ItemStack(Material.STAINED_GLASS_PANE));
			i.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE));

			inventories.put(loc, i);
		}
		return i;

	}

	public static void startProdudeCloth(Inventory inv) {

		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						ItemStack done = new ItemStack(Material.REDSTONE);
						ItemMeta mt = done.getItemMeta();
						mt.setDisplayName("§a§l§nChế biến");
						done.setItemMeta(mt);

						inv.setItem(4, null);
						inv.setItem(13, done);

						inv.addItem(StardewItems.CLOTH());

					}

				}, 200L);

	}

	@EventHandler
	public void batdausanxuatloom(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lMáy dệt - LOOM") {
			return;
		}

		if (i.getType() == Material.STAINED_GLASS_PANE || i.getType() == Material.REDSTONE) {
			e.setCancelled(true);
		}

		if (i.getType() == Material.REDSTONE) {

			e.setCancelled(true);

			if (e.getClickedInventory().getItem(4) == null) {
				return;
			} else {
				ItemStack item = e.getClickedInventory().getItem(4);
				if (item.getItemMeta() != null && item.getItemMeta().getDisplayName() != null
						&& item.getItemMeta().getDisplayName().startsWith("§f§lLông cừu")) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProdudeCloth(e.getClickedInventory());
					return;
				}

			}

		}

	}

	private static ItemStack IN_PROGRESS() {

		ItemStack i = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lĐANG CHẾ BIẾN...");
		i.setItemMeta(mt);
		return i;
	}

}

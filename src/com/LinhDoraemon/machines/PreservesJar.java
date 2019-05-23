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
import com.LinhDoraemon.utils.HashTag;

public class PreservesJar implements Listener {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> PRESERVES_LIST = new ArrayList<Location>();

	public static void addPreservesMachine(Block b) {
		Location loc = b.getLocation();
		PRESERVES_LIST.add(loc);
		getPreservesInventory(loc);
	}

	public static void removePreservesMachine(Block b) {

		Location loc = b.getLocation();
		PRESERVES_LIST.remove(b.getLocation());
		inventories.remove(loc);

	}

	public static void registerCheese() {
		Bukkit.getPluginManager().registerEvents(new CheesePress(),
				Bukkit.getPluginManager().getPlugin("StardewValley"));
	}

	public static Inventory getPreservesInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 18, "§0§lThùng lên men - §7§l§oPRESERVES JAR");

			ItemStack done = new ItemStack(Material.REDSTONE);
			ItemMeta mt = done.getItemMeta();
			mt.setDisplayName("§a§l§nChế biến");
			done.setItemMeta(mt);

			i.clear();
			i.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));

			i.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(10, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(11, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(12, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(13, done);
			i.setItem(14, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(15, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(16, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));
			i.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 1));

			inventories.put(loc, i);
		}
		return i;

	}

	private static int task;
	private static int task1;

	public static void startProduceJam(Inventory inv) {

		task1 = Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						ItemStack done = new ItemStack(Material.REDSTONE);
						ItemMeta mt = done.getItemMeta();
						mt.setDisplayName("§a§l§nChế biến");
						done.setItemMeta(mt);

						inv.setItem(4, null);
						inv.setItem(13, done);

						inv.addItem(StardewItems.JAM());

						Bukkit.getScheduler().cancelTask(task1);

					}

				}, 200L);

	}

	public static void startProducePickles(Inventory inv) {

		task = Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						ItemStack done = new ItemStack(Material.REDSTONE);
						ItemMeta mt = done.getItemMeta();
						mt.setDisplayName("§a§l§nChế biến");
						done.setItemMeta(mt);

						inv.setItem(4, null);
						inv.setItem(13, done);

						inv.addItem(StardewItems.PICKLES());

						Bukkit.getScheduler().cancelTask(task);

					}

				}, 200L);

	}

	@EventHandler
	public void batdausanxuatcheese(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lThùng lên men - §7§l§oPRESERVES JAR") {
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
				if (item.getItemMeta() != null && item.getItemMeta().getLore() != null
						&& (item.getItemMeta().getLore().contains(HashTag.TYPE_FRUIT)
								|| item.getItemMeta().getLore().contains(HashTag.TYPE_WILD_PLANT))) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProduceJam(e.getClickedInventory());
					return;
				}
				if (item.getItemMeta() != null && item.getItemMeta().getLore() != null
						&& item.getItemMeta().getLore().contains(HashTag.TYPE_CROPS)) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProducePickles(e.getClickedInventory());
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

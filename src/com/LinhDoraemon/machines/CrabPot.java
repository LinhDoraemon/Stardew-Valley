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
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.ocean.OceanItems;
import com.LinhDoraemon.utils.HashTag;

public class CrabPot implements Listener {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> CRAB_POT_LIST = new ArrayList<Location>();

	public static void addCrabPot(Block b) {
		Location loc = b.getLocation();
		CRAB_POT_LIST.add(loc);
		getCrabPotInventory(loc);
	}

	public static void registerCrabPot() {
		Bukkit.getPluginManager().registerEvents(new CrabPot(), Bukkit.getPluginManager().getPlugin("StardewValley"));
	}

	public static void removeCrabPot(Block b) {
		Location loc = b.getLocation();
		CRAB_POT_LIST.remove(loc);
		inventories.remove(b);
	}

	public static Inventory getCrabPotInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 27, "§0§lBẫy cua - CRAB POT");
			i.clear();
			i.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 13));
			i.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 13));
			i.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			
			i.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(10, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(11, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(12, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 13));
			i.setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 13));
			i.setItem(14, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 13));
			i.setItem(15, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(16, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			
			i.setItem(18, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(19, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(20, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(21, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(23, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(24, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(25, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			i.setItem(26, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14));
			inventories.put(loc, i);
		}
		return i;

	}

	public static void resultCrabPot() {

		for (Location loc : CRAB_POT_LIST) {

			if (getCrabPotInventory(loc).getItem(22) != null
					&& getCrabPotInventory(loc).getItem(22).getItemMeta().getLore().contains(HashTag.TYPE_BAIT)) {
				getCrabPotInventory(loc).addItem(OceanItems.getRandomItem());
				getCrabPotInventory(loc).getItem(22).setAmount(getCrabPotInventory(loc).getItem(22).getAmount() - 1);
			}

		}

	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void datbaycuaxuong(BlockPlaceEvent e) {

		Block b = e.getBlock();
		Player p = e.getPlayer();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.STAINED_CLAY) {
			return;
		}

		if (b.getData() != 14) {
			return;
		}


		Block up = b.getWorld().getBlockAt(b.getLocation().getBlockX(), b.getLocation().getBlockY() + 1,
				b.getLocation().getBlockZ());

		if (up.getType() == Material.STATIONARY_WATER) {
			return;
		} else {
			e.setCancelled(true);
			p.sendMessage("§cBạn phải đặt ở nông trại của mình hoặc đặt BẪY CUA sâu dưới nước.");
		}
	}
	
	@EventHandler
	public void batdausanxuatmayonnaise(InventoryClickEvent e) {

		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lBẫy cua - CRAB POT") {
			return;
		}
		
		if(i.getType() == Material.STAINED_GLASS_PANE) {
			e.setCancelled(true);
			return;
		}
	}

}

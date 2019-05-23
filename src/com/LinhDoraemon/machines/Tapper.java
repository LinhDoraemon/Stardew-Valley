package com.LinhDoraemon.machines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.season.DaysAndTimes;

public class Tapper implements Listener {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> TAPPER_LIST = new ArrayList<Location>();

	private static int songay = 0;

	public static void addTapper(Block b) {
		Location loc = b.getLocation();
		TAPPER_LIST.add(loc);
		getBeeInventory(loc);
	}

	public static void removeTapper(Block b) {
		Location loc = b.getLocation();
		TAPPER_LIST.remove(loc);
		inventories.remove(b);
	}

	public static Inventory getBeeInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 9, "§0§lMáy lấy nhựa cây - TAPPER");
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

	public static void startProduceSyrup() {

		songay = songay + 1;
		Bukkit.getConsoleSender().sendMessage("VALUES 'songay' AT CLASS 'tapper' NOW IS " + songay + " !");
		
		if (songay == 3 && DaysAndTimes.isWinter() == false) {
			songay = 0;
			Bukkit.getConsoleSender().sendMessage("VALUES 'songay' AT CLASS 'tapper' HAS BEEN RESETED !");
			for (Location loc : inventories.keySet()) {
				Random rand = new Random();
				int so = rand.nextInt(3);

				switch (so) {	
				case 1:
					inventories.get(loc).addItem(StardewItems.OAK_RESIN()); // Nhựa cây gỗ sồi | 26%
					break;
				case 2:
					inventories.get(loc).addItem(StardewItems.MAPLE_SYRUP()); //Nhựa cây thông | 24%
					break;
				default:
					inventories.get(loc).addItem(StardewItems.PINE_TAR()); // Sirô phong | 45%
					break;
				}
			}
		}
	}
	
	public static void registerTapper() {
		Bukkit.getPluginManager().registerEvents(new Tapper(), Bukkit.getPluginManager().getPlugin("StardewValley"));
	}
	
	@EventHandler
	public void batdausanxuatmayonnaise(InventoryClickEvent e) {

		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lMáy lấy nhựa cây - TAPPER") {
			return;
		}
		
		if(i.getType() == Material.STAINED_GLASS_PANE) {
			e.setCancelled(true);
			return;
		}
	}
	
}

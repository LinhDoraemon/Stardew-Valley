package com.LinhDoraemon.machines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

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

import com.LinhDoraemon.SpecialItem.StardewSeeds;
import com.LinhDoraemon.cropstype.Artichoke;
import com.LinhDoraemon.cropstype.BlueBerry;
import com.LinhDoraemon.cropstype.BlueJazz;
import com.LinhDoraemon.cropstype.Cauliflower;
import com.LinhDoraemon.cropstype.CoffeeBean;
import com.LinhDoraemon.cropstype.Corn;
import com.LinhDoraemon.cropstype.Cranberries;
import com.LinhDoraemon.cropstype.EggPlant;
import com.LinhDoraemon.cropstype.Garlic;
import com.LinhDoraemon.cropstype.Grape;
import com.LinhDoraemon.cropstype.Kale;
import com.LinhDoraemon.cropstype.Melon;
import com.LinhDoraemon.cropstype.Parsnip;
import com.LinhDoraemon.cropstype.Poppy;
import com.LinhDoraemon.cropstype.Potato;
import com.LinhDoraemon.cropstype.Pumpkin;
import com.LinhDoraemon.cropstype.Radish;
import com.LinhDoraemon.cropstype.RedCabbage;
import com.LinhDoraemon.cropstype.Strawberry;
import com.LinhDoraemon.cropstype.Sunflower;
import com.LinhDoraemon.cropstype.Tomato;
import com.LinhDoraemon.ocean.OceanItems;

public class SeedMaker implements Listener {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> CHEESE_PRESS_LIST = new ArrayList<Location>();

	public static void addSeedMachine(Block b) {
		Location loc = b.getLocation();
		CHEESE_PRESS_LIST.add(loc);
		getSeedInventory(loc);
	}

	public static void removeSeedMachine(Block b) {

		Location loc = b.getLocation();
		CHEESE_PRESS_LIST.remove(b.getLocation());
		inventories.remove(loc);

	}

	public static void registerSeed() {
		Bukkit.getPluginManager().registerEvents(new SeedMaker(),
				Bukkit.getPluginManager().getPlugin("StardewValley"));
	}

	public static Inventory getSeedInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 18, "§0§lMáy làm hạt giống - SEED MAKER");

			ItemStack done = new ItemStack(Material.REDSTONE);
			ItemMeta mt = done.getItemMeta();
			mt.setDisplayName("§a§l§nChế biến");
			done.setItemMeta(mt);

			i.clear();
			i.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));

			i.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(10, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(11, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(12, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(13, done);
			i.setItem(14, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(15, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(16, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			i.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));

			inventories.put(loc, i);
		}
		return i;

	}

	private static void addRandomAmount(Inventory inv, ItemStack i, int maxamount) {

		Random rand = new Random();
		int so = rand.nextInt(maxamount) + 1;
		
		i.setAmount(so);
		inv.setItem(4, i);

	}

	public static void startProdudeCloth(Inventory inv, ItemStack i) {

		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						ItemStack done = new ItemStack(Material.REDSTONE);
						ItemMeta mt = done.getItemMeta();
						mt.setDisplayName("§a§l§nChế biến");
						done.setItemMeta(mt);

						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
										.equalsIgnoreCase(Artichoke.getArtichoke().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.ATICHOKE_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(BlueBerry.getBlueBerry().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.BLUEBERRY_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(BlueJazz.getBlueJazz().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.BLUE_JAZZ_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Cauliflower.getCauliflower().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.CAULIFLOWER_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(CoffeeBean.getCoffeeBean().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.COFFEE_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Corn.getCorn().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.CORN_SEED(), 3);inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Cranberries.getCranberries().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.CRANBERRIES_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(EggPlant.getEggPlant().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.EGGPLANT_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Garlic.getGarlic().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.GARLIC_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Grape.getGrape().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.GRAPE_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Kale.getKale().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.KALE_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Melon.getMelon().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.MELON_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Parsnip.getParsnip().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.PARSNIP_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Poppy.getPoppy().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.POPPY_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Potato.getPotato().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.POTATO_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Pumpkin.getPumpkin().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.PUMPKIN_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Radish.getRadish().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.RADISH_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(RedCabbage.getRedCabbage().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.RED_CABBAGE_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Strawberry.getStrawberry().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.STRAWBERRY_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Sunflower.getSunflower().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.SUNFLOWER_SEED(), 3);
							inv.setItem(13, done);
							return;
						}
						if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
								&& i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(Tomato.getTomato().getItemMeta().getDisplayName())) {
							addRandomAmount(inv, StardewSeeds.TOMATO_SEED(), 3);
							inv.setItem(13, done);
							return;
						}

						inv.setItem(4, OceanItems.getItem(OceanItems.TRASH));
						inv.setItem(13, done);
						return;
						

					}

				}, 620L);

	}

	@EventHandler
	public void batdausanxuatSeed(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lMáy làm hạt giống - SEED MAKER") {
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
				if (item != null) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProdudeCloth(e.getClickedInventory(), item);
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

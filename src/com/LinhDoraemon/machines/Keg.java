package com.LinhDoraemon.machines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.utils.HashTag;

public class Keg implements Listener {

	private static HashMap<Location, Inventory> inventories = new HashMap<Location, Inventory>();
	private static List<Location> Keg_LIST = new ArrayList<Location>();

	public static void addKegMachine(Block b) {
		Location loc = b.getLocation();
		Keg_LIST.add(loc);
		getKegInventory(loc);
	}

	public static void removeKegMachine(Block b) {

		Location loc = b.getLocation();
		Keg_LIST.remove(b.getLocation());
		inventories.remove(loc);

	}

	public static void registerKeg() {
		Bukkit.getPluginManager().registerEvents(new Keg(), Bukkit.getPluginManager().getPlugin("StardewValley"));
	}

	public static Inventory getKegInventory(Location loc) {

		Inventory i = inventories.get(loc);

		if (i == null) {
			i = Bukkit.createInventory(null, 18, "§0§lThùng ủ - §7§l§oKEG");

			ItemStack done = new ItemStack(Material.REDSTONE);
			ItemMeta mt = done.getItemMeta();
			mt.setDisplayName("§a§l§nChế biến");
			done.setItemMeta(mt);

			i.clear();
			i.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));

			i.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(10, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(11, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(12, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(13, done);
			i.setItem(14, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(15, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(16, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));
			i.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 10));

			inventories.put(loc, i);
		}
		return i;

	}

	public static void startProduceBeer(Inventory inv) {

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

						inv.addItem(StardewItems.BEER());

					}

				}, 200L);

	}

	public static void startProduceCoffee(Inventory inv) {

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

						inv.addItem(StardewItems.COFFEE());

					}

				}, 200L);

	}

	public static void startProduceWine(Inventory inv) {

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

						inv.addItem(StardewItems.WINE());

					}

				}, 200L);

	}
	
	public static void startProduceJuice(Inventory inv) {

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

						inv.addItem(StardewItems.JUICE());

					}

				}, 200L);

	}

	@EventHandler
	public void uongruoudianhem(PlayerInteractEvent e) {

		Player p = e.getPlayer();
		ItemStack i = e.getItem();

		if (i == null) {
			return;
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& (i.getItemMeta().getDisplayName()
						.equalsIgnoreCase(StardewItems.JUICE().getItemMeta().getDisplayName())
						|| i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(StardewItems.COFFEE().getItemMeta().getDisplayName()))) {

			if (i.getItemMeta().getDisplayName()
					.equalsIgnoreCase(StardewItems.COFFEE().getItemMeta().getDisplayName())) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 83 * 20, 1));
			}

			e.setCancelled(true);

			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30 * 20, 2));

			String maulore = i.getItemMeta().getLore().get(3);
			String foodlore = i.getItemMeta().getLore().get(4);

			String maui = Character.toString(maulore.charAt(8));
			String foodi = Character.toString(foodlore.charAt(8));

			p.sendMessage(maulore);
			p.sendMessage(foodlore);

			int mau = Integer.parseInt(maui);
			int food = Integer.parseInt(foodi);

			if (20 - p.getHealth() >= mau) {
				p.setHealth(p.getHealth() + mau);
				i.setAmount(i.getAmount() - 1);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			} else {
				p.setHealth(20);
				i.setAmount(i.getAmount() - 1);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			}

			if (20 - p.getFoodLevel() >= food) {
				p.setFoodLevel(p.getFoodLevel() + food);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			} else {
				p.setFoodLevel(20);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			}

		}
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& (i.getItemMeta().getDisplayName()
						.equalsIgnoreCase(StardewItems.WINE().getItemMeta().getDisplayName())
						|| i.getItemMeta().getDisplayName()
								.equalsIgnoreCase(StardewItems.BEER().getItemMeta().getDisplayName()))) {

			e.setCancelled(true);

			i.setAmount(i.getAmount() - 1);
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30 * 20, 2));

			String maulore = i.getItemMeta().getLore().get(3);
			String foodlore = i.getItemMeta().getLore().get(4);

			String maui = Character.toString(maulore.charAt(8));
			String foodi = Character.toString(foodlore.charAt(8));

			p.sendMessage(maulore);
			p.sendMessage(foodlore);

			int mau = Integer.parseInt(maui);
			int food = Integer.parseInt(foodi);

			if (20 - p.getHealth() >= mau) {
				p.setHealth(p.getHealth() + mau);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			} else {
				p.setHealth(20);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			}

			if (20 - p.getFoodLevel() >= food) {
				p.setFoodLevel(p.getFoodLevel() + food);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			} else {
				p.setFoodLevel(20);
				p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 1, 1);
			}

		}

	}

	@EventHandler
	public void batdausanxuatmayonnaise(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lThùng ủ - §7§l§oKEG") {
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

				if (item.getType() == Material.WHEAT) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProduceBeer(e.getClickedInventory());
					return;
				}

				if (item.getItemMeta() != null && item.getItemMeta().getDisplayName() != null
						&& item.getItemMeta().getDisplayName().contains("§6§lHạt cà phê")
						&& e.getClickedInventory().getItem(4).getAmount() == 5) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProduceCoffee(e.getClickedInventory());
					return;
				}

				if (item.getItemMeta() != null && item.getItemMeta().getDisplayName() != null
						&& item.getItemMeta().getDisplayName().contains("§5§lNho")) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProduceWine(e.getClickedInventory());
					return;
				}
				
				if (item.getItemMeta() != null && item.getItemMeta().getLore() != null
						&& item.getItemMeta().getLore().contains(HashTag.TYPE_CROPS)) {
					e.getClickedInventory().setItem(4, IN_PROGRESS());
					e.getClickedInventory().setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
					p.closeInventory();

					startProduceJuice(e.getClickedInventory());
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

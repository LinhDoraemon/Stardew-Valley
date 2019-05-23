package com.LinhDoraemon.Shops;

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

import com.LinhDoraemon.SpecialItem.StardewFruits;
import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.SpecialItem.StardewSeeds;
import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.fruit.FruitTreeAPI;
import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.SimpleItem;

public class PierreShop implements Listener {

	static Inventory pshop = Bukkit.createInventory(null, 36, "§0§lCửa hàng của Piere - Giá rẻ bất ngờ");
	static Inventory upgra = Bukkit.createInventory(null, 9, "§0§lCửa hàng của Piere - Giá rẻ bất ngờ");

	public static void openPiereSpringShop(Player p) {

		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
		ItemStack air = new ItemStack(Material.STAINED_GLASS_PANE);

		pshop.setItem(0, StardewSeeds.BLUE_JAZZ_SEED());
		pshop.setItem(1, StardewSeeds.CAULIFLOWER_SEED());
		pshop.setItem(2, StardewSeeds.GARLIC_SEED());
		pshop.setItem(3, StardewSeeds.KALE_SEED());
		pshop.setItem(4, StardewSeeds.PARSNIP_SEED());
		pshop.setItem(5, StardewSeeds.POTATO_SEED());
		pshop.setItem(6, StardewSeeds.STRAWBERRY_SEED());
		pshop.setItem(7, StardewItems.FLOUR());
		pshop.setItem(8, StardewItems.RICE());
		pshop.setItem(9, StardewItems.OIL());
		pshop.setItem(10, StardewItems.ACORN());
		pshop.setItem(11, StardewItems.MAPLE_SEED());
		pshop.setItem(12, StardewItems.DELUXE_SPEED_GROW());
		pshop.setItem(13, StardewFruits.CHERRY_SEED());

		pshop.setItem(31, UPGRADE_INVENTORY());

		for (int i = 0; i < pshop.getSize(); i++) {
			if (pshop.getItem(i) == null) {
				pshop.setItem(i, air);
			}
		}

		pshop.setItem(18, pane);
		pshop.setItem(19, pane);
		pshop.setItem(20, pane);
		pshop.setItem(21, pane);
		pshop.setItem(22, pane);
		pshop.setItem(23, pane);
		pshop.setItem(24, pane);
		pshop.setItem(25, pane);
		pshop.setItem(26, pane);

		p.openInventory(pshop);

	}

	public static void openPiereSummerShop(Player p) {

		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
		ItemStack air = new ItemStack(Material.STAINED_GLASS_PANE);

		pshop.setItem(0, StardewSeeds.BLUEBERRY_SEED());
		pshop.setItem(1, StardewSeeds.CORN_SEED());
		pshop.setItem(2, StardewSeeds.MELON_SEED());
		pshop.setItem(3, StardewSeeds.RED_CABBAGE_SEED());
		pshop.setItem(4, StardewSeeds.POPPY_SEED());
		pshop.setItem(5, StardewSeeds.TOMATO_SEED());
		pshop.setItem(6, StardewSeeds.RADISH_SEED());
		pshop.setItem(7, StardewSeeds.SUNFLOWER_SEED());
		pshop.setItem(7, StardewItems.FLOUR());
		pshop.setItem(8, StardewItems.RICE());
		pshop.setItem(9, StardewItems.OIL());
		pshop.setItem(10, StardewItems.ACORN());
		pshop.setItem(11, StardewItems.MAPLE_SEED());
		pshop.setItem(12, StardewItems.DELUXE_SPEED_GROW());
		pshop.setItem(13, StardewFruits.ORANGE_SEED());
		pshop.setItem(14, StardewFruits.PEACH_SEED());

		pshop.setItem(31, UPGRADE_INVENTORY());

		for (int i = 0; i < pshop.getSize(); i++) {
			if (pshop.getItem(i) == null) {
				pshop.setItem(i, air);
			}
		}

		pshop.setItem(18, pane);
		pshop.setItem(19, pane);
		pshop.setItem(20, pane);
		pshop.setItem(21, pane);
		pshop.setItem(22, pane);
		pshop.setItem(23, pane);
		pshop.setItem(24, pane);
		pshop.setItem(25, pane);
		pshop.setItem(26, pane);

		p.openInventory(pshop);

	}

	public static void openPiereFallShop(Player p) {

		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
		ItemStack air = new ItemStack(Material.STAINED_GLASS_PANE);

		pshop.setItem(0, StardewSeeds.ATICHOKE_SEED());
		pshop.setItem(1, StardewSeeds.CRANBERRIES_SEED());
		pshop.setItem(2, StardewSeeds.PUMPKIN_SEED());
		pshop.setItem(3, StardewSeeds.GRAPE_SEED());
		pshop.setItem(4, StardewSeeds.EGGPLANT_SEED());
		pshop.setItem(5, StardewItems.FLOUR());
		pshop.setItem(6, StardewItems.RICE());
		pshop.setItem(7, StardewItems.OIL());
		pshop.setItem(8, StardewItems.ACORN());
		pshop.setItem(9, StardewItems.MAPLE_SEED());
		pshop.setItem(10, StardewItems.DELUXE_SPEED_GROW());
		pshop.setItem(11, StardewFruits.POMEGRANATE_SEED());
		pshop.setItem(12, StardewFruits.APPLE_SEED());

		pshop.setItem(31, UPGRADE_INVENTORY());

		for (int i = 0; i < pshop.getSize(); i++) {
			if (pshop.getItem(i) == null) {
				pshop.setItem(i, air);
			}
		}

		pshop.setItem(18, pane);
		pshop.setItem(19, pane);
		pshop.setItem(20, pane);
		pshop.setItem(21, pane);
		pshop.setItem(22, pane);
		pshop.setItem(23, pane);
		pshop.setItem(24, pane);
		pshop.setItem(25, pane);
		pshop.setItem(26, pane);

		p.openInventory(pshop);

	}

	public static ItemStack UPGRADE_INVENTORY() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
						+ "ZnQubmV0L3RleHR1cmUvNWNkMjg3NzI3Z" + "DMzOTY3NTkyNjM3Yjk1M2Q1NzM1NTg2ZWM"
						+ "0ZDAxYjFiNTE2MGMwYWRiMzQ5YzQ2NzVkYjQifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lNâng cấp túi đồ");
		SimpleItem.addLore(mt, "", "§fClick để mở GUI nâng cấp >>");
		item.setItemMeta(mt);
		return item;
	}

	private static boolean enoughMoney(Player p, int amount) {
		if (PlayerData.getPlayerMoney(p.getName()) >= amount) {
			return true;
		} else {
			return false;
		}
	}

	public Inventory getUpgradeInventory() {

		upgra.setItem(3, getLevel2Backpack());
		upgra.setItem(5, getLevel3Backpack());

		return upgra;
	}

	public ItemStack getLevel2Backpack() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0d" + "HA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3Rle"
						+ "HR1cmUvODVlNGY5ZGE2OGM4MWZhNDgxZWVjZGNhN" + "DhhMTM4Y2VjZGUyY2RkZmZlZWFlODRhYjFhZmQyNG"
						+ "EzNjNlMDI4In19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§l[§c§k|§c§l| LEVEL 2 |§c§k|§f§l]");
		SimpleItem.addLore(mt, "", "§fClick để mua !", "");
		item.setItemMeta(mt);
		return item;

	}

	public ItemStack getLevel3Backpack() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
						+ "ZnQubmV0L3RleHR1cmUvYTNjMTUzYzM5M" + "WMzNGUyZDMyOGE2MDgzOWU2ODNhOWY4MmF"
						+ "kMzA0ODI5OWQ4YmM2YTM5ZTZmOTE1Y2M1YSJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§l[§b§k|§b§l| LEVEL 3 |§b§k|§f§l]");
		SimpleItem.addLore(mt, "", "§fClick để mua !", "");
		item.setItemMeta(mt);
		return item;

	}

	@EventHandler
	public void muadoochopieSpring(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lCửa hàng của Piere - Giá rẻ bất ngờ") {
			return;
		}

		e.setCancelled(true);

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null) {
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.BLUE_JAZZ_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 30)) {
					PlayerData.removePlayerMoney(p.getName(), 30);
					p.getInventory().addItem(StardewSeeds.BLUE_JAZZ_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.CAULIFLOWER_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 80)) {
					PlayerData.removePlayerMoney(p.getName(), 80);
					p.getInventory().addItem(StardewSeeds.CAULIFLOWER_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.GARLIC_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 40)) {
					PlayerData.removePlayerMoney(p.getName(), 40);
					p.getInventory().addItem(StardewSeeds.GARLIC_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.KALE_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 70)) {
					PlayerData.removePlayerMoney(p.getName(), 70);
					p.getInventory().addItem(StardewSeeds.KALE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.PARSNIP_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 20)) {
					PlayerData.removePlayerMoney(p.getName(), 20);
					p.getInventory().addItem(StardewSeeds.PARSNIP_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.POTATO_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 50)) {
					PlayerData.removePlayerMoney(p.getName(), 50);
					p.getInventory().addItem(StardewSeeds.POTATO_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.STRAWBERRY_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 100)) {
					PlayerData.removePlayerMoney(p.getName(), 100);
					p.getInventory().addItem(StardewSeeds.STRAWBERRY_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}
			
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(FruitTreeAPI.CHERRY.getName())) {
				if (enoughMoney(p, 6000)) {
					PlayerData.removePlayerMoney(p.getName(), 6000);
					p.getInventory().addItem(StardewFruits.CHERRY_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}
			
		}

	}

	@EventHandler
	public void muadolinhtinhpierre(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lCửa hàng của Piere - Giá rẻ bất ngờ") {
			return;
		}

		e.setCancelled(true);

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null) {
			if (i.getItemMeta().getDisplayName().equalsIgnoreCase(StardewItems.ACORN().getItemMeta().getDisplayName())
					|| i.getItemMeta().getDisplayName()
							.equalsIgnoreCase(StardewItems.MAPLE_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 50)) {
					p.getInventory().addItem(i);
					PlayerData.removePlayerMoney(p.getName(), 50);
					return;
				} else {
					p.closeInventory();
					p.sendMessage("§c§lBạn không đủ §f§l50đ");
					return;
				}
			}

			if (i.getItemMeta().getDisplayName()
					.equalsIgnoreCase(StardewItems.DELUXE_SPEED_GROW().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 5500)) {
					p.getInventory().addItem(i);
					PlayerData.removePlayerMoney(p.getName(), 5500);
					return;
				} else {
					p.closeInventory();
					p.sendMessage("§c§lBạn không đủ §f§l5500đ");
					return;
				}
			}
		}

	}

	@EventHandler
	public void muadoochopieSummer(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lCửa hàng của Piere - Giá rẻ bất ngờ") {
			return;
		}

		e.setCancelled(true);

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null) {
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.BLUEBERRY_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 80)) {
					PlayerData.removePlayerMoney(p.getName(), 80);
					p.getInventory().addItem(StardewSeeds.BLUEBERRY_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.CORN_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 150)) {
					PlayerData.removePlayerMoney(p.getName(), 150);
					p.getInventory().addItem(StardewSeeds.CORN_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.MELON_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 80)) {
					PlayerData.removePlayerMoney(p.getName(), 80);
					p.getInventory().addItem(StardewSeeds.MELON_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.POPPY_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 100)) {
					PlayerData.removePlayerMoney(p.getName(), 100);
					p.getInventory().addItem(StardewSeeds.POPPY_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.TOMATO_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 50)) {
					PlayerData.removePlayerMoney(p.getName(), 50);
					p.getInventory().addItem(StardewSeeds.TOMATO_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.RADISH_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 40)) {
					PlayerData.removePlayerMoney(p.getName(), 40);
					p.getInventory().addItem(StardewSeeds.RADISH_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.SUNFLOWER_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 200)) {
					PlayerData.removePlayerMoney(p.getName(), 200);
					p.getInventory().addItem(StardewSeeds.SUNFLOWER_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.RED_CABBAGE_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 100)) {
					PlayerData.removePlayerMoney(p.getName(), 100);
					p.getInventory().addItem(StardewSeeds.RED_CABBAGE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}
			
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(FruitTreeAPI.PEACH.getName())) {
				if (enoughMoney(p, 6000)) {
					PlayerData.removePlayerMoney(p.getName(), 6000);
					p.getInventory().addItem(StardewFruits.PEACH_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}
			
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(FruitTreeAPI.ORANGE.getName())) {
				if (enoughMoney(p, 6000)) {
					PlayerData.removePlayerMoney(p.getName(), 6000);
					p.getInventory().addItem(StardewFruits.ORANGE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}
			
		}

	}

	@EventHandler
	public void muadoochopieFall(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getTitle() != "§0§lCửa hàng của Piere - Giá rẻ bất ngờ") {
			return;
		}

		e.setCancelled(true);

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null) {
			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.ATICHOKE_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 30)) {
					PlayerData.removePlayerMoney(p.getName(), 30);
					p.getInventory().addItem(StardewSeeds.ATICHOKE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.CRANBERRIES_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 240)) {
					PlayerData.removePlayerMoney(p.getName(), 240);
					p.getInventory().addItem(StardewSeeds.CRANBERRIES_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.EGGPLANT_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 20)) {
					PlayerData.removePlayerMoney(p.getName(), 20);
					p.getInventory().addItem(StardewSeeds.EGGPLANT_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.GRAPE_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 60)) {
					PlayerData.removePlayerMoney(p.getName(), 60);
					p.getInventory().addItem(StardewSeeds.GRAPE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(StardewSeeds.PUMPKIN_SEED().getItemMeta().getDisplayName())) {
				if (enoughMoney(p, 100)) {
					PlayerData.removePlayerMoney(p.getName(), 100);
					p.getInventory().addItem(StardewSeeds.PUMPKIN_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(FruitTreeAPI.POMEGRANATE.getName())) {
				if (enoughMoney(p, 6000)) {
					PlayerData.removePlayerMoney(p.getName(), 6000);
					p.getInventory().addItem(StardewFruits.POMEGRANATE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}

			if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta().getDisplayName()
					.equals(FruitTreeAPI.APPLE.getName())) {
				if (enoughMoney(p, 6000)) {
					PlayerData.removePlayerMoney(p.getName(), 6000);
					p.getInventory().addItem(StardewFruits.APPLE_SEED());
				} else {
					p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				}
			}
			
		}

	}

}

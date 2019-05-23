package com.LinhDoraemon.wiki;

import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.SpecialItem.StardewFruits;
import com.LinhDoraemon.SpecialItem.StardewItems;
import com.LinhDoraemon.crops.Crops;
import com.LinhDoraemon.fishing.FishType;
import com.LinhDoraemon.ocean.OceanItems;
import com.LinhDoraemon.season.Season;

public class WikiGUI {

	private static HashMap<String, Inventory> wiki = new HashMap<>();
	private static Inventory FISH_WIKI = Bukkit.createInventory(null, 27, "§0§lCá trong mùa này");
	private static Inventory CROP_WIKI = Bukkit.createInventory(null, 27, "§0§lCây trồng trong mùa này");

	public static void openFishWIKI(Player p) {
		FISH_WIKI.clear();
		if (Season.getSeason() == Season.SPRING) {
			for (FishType i : FishType.getSprings()) {
				FISH_WIKI.addItem(i.getItemStack());
			}
		}
		if (Season.getSeason() == Season.SUMMER) {
			for (FishType i : FishType.getSummers()) {
				FISH_WIKI.addItem(i.getItemStack());
			}
		}
		if (Season.getSeason() == Season.FALL) {
			for (FishType i : FishType.getFalls()) {
				FISH_WIKI.addItem(i.getItemStack());
			}
		}
		if (Season.getSeason() == Season.WINTER) {
			for (FishType i : FishType.getWinters()) {
				FISH_WIKI.addItem(i.getItemStack());
			}
		}
		for (ItemStack item : OceanItems.getAll()) {
			FISH_WIKI.addItem(item);
		}
		p.openInventory(FISH_WIKI);
	}

	public static void openCropWIKI(Player p) {
		CROP_WIKI.clear();
		if (Season.getSeason() == Season.SPRING) {
			for (Crops i : Crops.getSprings()) {
				CROP_WIKI.addItem(i.getItemStack());
			}
			CROP_WIKI.addItem(StardewFruits.CHERRY_SEED());
		}
		if (Season.getSeason() == Season.SUMMER) {
			for (Crops i : Crops.getSummers()) {
				CROP_WIKI.addItem(i.getItemStack());
			}
			CROP_WIKI.addItem(StardewFruits.ORANGE_SEED());
			CROP_WIKI.addItem(StardewFruits.PEACH_SEED());
		}
		if (Season.getSeason() == Season.FALL) {
			for (Crops i : Crops.getFalls()) {
				CROP_WIKI.addItem(i.getItemStack());
			}
			CROP_WIKI.addItem(StardewFruits.APPLE_SEED());
			CROP_WIKI.addItem(StardewFruits.POMEGRANATE_SEED());
		}
		CROP_WIKI.addItem(StardewItems.ACORN());
		CROP_WIKI.addItem(StardewItems.MAPLE_SEED());
		p.openInventory(CROP_WIKI);
	}

	public static void openWikiGUI(Player p) {
		Inventory i = wiki.get(p.getName());

		if (i == null) {
			i = Bukkit.createInventory(null, 54, "§0§lWIKI HỖ TRỢ");
			int[] border = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 48, 49, 50, 51, 52,
					53 };

			for (int so : border) {
				i.setItem(so, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3));
			}

			for (int soo = 0; soo < i.getSize(); soo++) {
				if (i.getItem(soo) == null) {
					i.setItem(soo, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8));
				}
			}

			wiki.put(p.getName(), i);
		}

		i.setItem(20, FISH());
		i.setItem(21, CROP());

		p.openInventory(i);
	}

	private static ItemStack FISH() {
		ItemStack i = new ItemStack(Material.RAW_FISH, 1, (byte) 2);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lCá trong mùa §a§l" + Season.getSeason().toString());
		mt.setLore(Arrays.asList("", "§fTìm kiếm thêm một số thông tin về", "§fcác loài cá xuất hiện trong mùa này,",
				"§fgiúp bạn câu cá tốt hơn.", ""));
		i.setItemMeta(mt);
		return i;
	}

	private static ItemStack CROP() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lHạt giống trong mùa §a§l" + Season.getSeason().toString());
		mt.setLore(Arrays.asList("", "§fTìm kiếm thêm một số thông tin về", "§fcác loại cây trồng được trong mùa này,",
				"§fgiúp bạn trồng trọt tốt hơn.", ""));
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack WIKI_ITEM() {
		ItemStack i = new ItemStack(Material.BOOK);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lWIKI HỖ TRỢ");
		mt.setLore(Arrays.asList("", "§fClick để tìm gì đó có ích...", ""));
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CRAFTING_ITEM() {
		ItemStack i = new ItemStack(Material.WORKBENCH);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lCHẾ TẠO");
		mt.setLore(Arrays.asList("", "§fSẵn sàng chế tạo các đồ vật chưa ?", "§fClick để mở GUI §e§lChế tạo", ""));
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack QUEST() {
		ItemStack i = new ItemStack(Material.SAPLING);
		i.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		ItemMeta mt = i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		mt.setDisplayName("§a§lNHIỆM VỤ");
		mt.setLore(Arrays.asList("", "§fHoàn thành một số nhiệm vụ để", "§fkiếm vài đồng trang trải cuộc sống.", ""));
		i.setItemMeta(mt);
		return i;
	}

}

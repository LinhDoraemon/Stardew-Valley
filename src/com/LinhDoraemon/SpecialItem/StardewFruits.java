package com.LinhDoraemon.SpecialItem;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.fruit.FruitTreeAPI;
import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class StardewFruits {

	public static ItemStack POMEGRANATE_SEED() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(FruitTreeAPI.POMEGRANATE.getName());
		SimpleItem.addLore(mt, "", "§fLoại cây cho quả vào mùa thu.", "", "§6§l6000G", "", "§a§l[Cây ăn quả]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack APPLE_SEED() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(FruitTreeAPI.APPLE.getName());
		SimpleItem.addLore(mt, "", "§fLoại cây cho quả vào mùa thu.", "", "§6§l6000G", "", "§a§l[Cây ăn quả]");
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack PEACH_SEED() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(FruitTreeAPI.PEACH.getName());
		SimpleItem.addLore(mt, "", "§fLoại cây cho quả vào mùa hè.", "", "§6§l6000G", "", "§a§l[Cây ăn quả]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CHERRY_SEED() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(FruitTreeAPI.CHERRY.getName());
		SimpleItem.addLore(mt, "", "§fLoại cây cho quả vào mùa xuân.", "", "§6§l6000G", "", "§a§l[Cây ăn quả]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack ORANGE_SEED() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(FruitTreeAPI.ORANGE.getName());
		SimpleItem.addLore(mt, "", "§fLoại cây cho quả vào mùa hè.", "", "§6§l6000G", "", "§a§l[Cây ăn quả]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack APPLE() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMz"
						+ "VlMmUwOTU5NzEyZGNkMzM1N2NjM2NlYTg1Zjk5YjNmZD"
						+ "gwOTc4NTVjNzU0YjliMTcxZjk2MzUxNDIyNWQifX19");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lTrái táo " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loại trái cây được sử dụng", "§fcho nước trái cây và rượu táo.", "",
				SimpleItem.isHealth(1), SimpleItem.isFood(2), "", HashTag.TYPE_FRUIT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack POMEGRANATE() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7I" + "nVybCI6Imh0dHA6Ly90ZXh0dXJlcy" + "5taW5lY3JhZnQubmV0L3RleHR1cmUvM"
						+ "mQ5ZDNkZGQxZWJkOTQ0OGE2ZGM0ZWU0Z" + "mI5MTgzZDhmYzY4ZDQzNDY4ODE4OW"
						+ "E3MzU2MWZkNmZmODVmMDRiIn19fQ==");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lTrái lựu " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fTrong quả là những chùm hạt", "§fngon ngọt.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(2), "", HashTag.TYPE_FRUIT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack ORANGE() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dH" + "A6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1"
						+ "cmUvOWZkMGUzMzBhNjg4ZDhiYjk1MTliZWZlMWJmY" + "zM0MzM3YjM3MWFjNzUxNTAyMTZmZGQwMzk1OWViN2"
						+ "I0NCJ9fX0=");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lTrái cam " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fNgon, mọng, và bùng nổ với hương", "§fthơm mùa hè ngọt ngào.", "",
				SimpleItem.isHealth(1), SimpleItem.isFood(2), "", HashTag.TYPE_FRUIT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CHERRY() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly" + "90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUy"
						+ "NTcwNzY5NmJjZDE1YTE3MzA1NmZhMzkyOTZlODBmZjQxMT"
						+ "Y4YmIwYWRkNTUyZjQ1MjNlMjU1OGEzMTE5In19fQ==");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§d§lTrái sơ-ri " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fNó phổ biến, và chín sớm hơn hầu", "§fhết các loại trái cây khác..", "",
				SimpleItem.isHealth(1), SimpleItem.isFood(2), "", HashTag.TYPE_FRUIT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack PEACH() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6" + "Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQ"
						+ "ubmV0L3RleHR1cmUvOWJkMjgzNDA1MmZlZm" + "RiYTdiMTlkMDFkODYzNDI5YjI3MTVjNzExNG"
						+ "QzZjlmODFjZGI3ZTgyNjE3ZTdlOTgifX19");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§d§lTrái đào " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fNó rất mềm mại khi chạm vào.", "", SimpleItem.isHealth(1), SimpleItem.isFood(2),
				"", HashTag.TYPE_FRUIT);
		i.setItemMeta(mt);
		return i;
	}

}

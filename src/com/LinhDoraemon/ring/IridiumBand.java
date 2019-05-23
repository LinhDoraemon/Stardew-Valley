package com.LinhDoraemon.ring;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class IridiumBand {

	private static List<String> getIridiumList = new ArrayList<String>();

	public static ItemStack getIridiumBand() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Im" + "h0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc3"
						+ "YzljNjM4YmYzZGNkYTM0OGVkZWE0NGU5YTNkYjRhYmMxZTIzOTU1O" + "DY2MTYxMWY4MGMxMTA0NzJhZCJ9fX0=");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§5§lNhẫn Iriđium");
		SimpleItem.addLore(mt, "", "§fPhát sáng, hút đồ (shift), và tăng 10% sát thương.", "", HashTag.TYPE_RING);
		i.setItemMeta(mt);
		return i;
	}

	public static boolean loadIridiumBandData() {

		Bukkit.getConsoleSender().sendMessage("Loading Iridium Band's Data.......");

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "ring" + File.separator
				+ "IridiumBand.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		for (String s : config.getStringList("Data")) {
			getIridiumList.add(s);
		}

		for (String player : getIridiumList) {
			RingGUI.getRingGUI(player);
			RingGUI.getRingGUI(player).setItem(4, getIridiumBand());
		}

		Bukkit.getConsoleSender().sendMessage("Loading Iridium Band's Data Finished !");

		return true;
	}

	public static boolean saveIridiumBandData() {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "ring" + File.separator
				+ "IridiumBand.yml");
		try {
			FileConfiguration config = YamlConfiguration.loadConfiguration(file);
			config.set("Data", getIridiumList);
			PlayerData.saveConfig(config, file);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return true;

	}

	public static String getName = "§5§lNhẫn Iriđium";

	public static boolean isIridiumBand(ItemStack i) {

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(getName)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean addIridiumBandEffect(String playername) {
		Player p = Bukkit.getPlayerExact(playername);

		if (!(p.isOnline())) {
			return false;
		} else {
			p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999, 1));
			p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 999999, 1));
			RingListener.getMagetedPlayers.add(p);
			getIridiumList.add(p.getName());
			return true;
		}

	}

	public static boolean removeIridiumBandEffect(String playername) {
		Player p = Bukkit.getPlayerExact(playername);

		if (!(p.isOnline()) && RingListener.getMagetedPlayers.contains(p)) {
			return false;
		} else {
			p.removePotionEffect(PotionEffectType.NIGHT_VISION);
			;
			p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
			;
			RingListener.getMagetedPlayers.remove(p);
			getIridiumList.remove(p.getName());
			return true;
		}
	}

}

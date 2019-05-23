package com.LinhDoraemon.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class DataStorage {

	private static File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "Backpack.yml");
	private static FileConfiguration config = YamlConfiguration.loadConfiguration(file);

	public static void saveHashMap1(HashMap<?, ?> hm) {
		for (Object key : hm.keySet()) {
			config.set("Data." + key, hm.get(key));
		}
		saveConfig();
	}

	public static HashMap<?, ?> loadHashMap1() {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		for (String key : config.getConfigurationSection("Data").getKeys(false)) {
			hm.put(key, config.get("Data." + key));
		}
		return hm;
	}
	
	public static void saveHashMap2(HashMap<?, ?> hm) {
		for (Object key : hm.keySet()) {
			config.set("Data2." + key, hm.get(key));
		}
		saveConfig();
	}

	public static HashMap<?, ?> loadHashMap2() {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		for (String key : config.getConfigurationSection("Data2").getKeys(false)) {
			hm.put(key, config.get("Data2." + key));
		}
		return hm;
	}

	public static void saveConfig() {
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

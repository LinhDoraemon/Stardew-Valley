package com.LinhDoraemon.season;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public enum Season {

	SPRING, SUMMER, FALL, WINTER;
	
	static File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "seasons.yml");
	static FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
	public static boolean isSpring() {
		if (config.getBoolean("isSpring")) {
			return true;
		} else {

			return false;
		}
	}

	public static boolean isSummer() {
		if (config.getBoolean("isSummer")) {
			return true;
		} else {

			return false;
		}
	}

	public static boolean isFall() {
		if (config.getBoolean("isFall")) {
			return true;
		} else {

			return false;
		}
	}

	public static boolean isWinter() {
		if (config.getBoolean("isWinter")) {
			return true;
		} else {

			return false;
		}
	}
	
	public static Season getSeason() {
		String season = config.getString("Season");
		return Season.valueOf(season.toUpperCase());
	}
	
}

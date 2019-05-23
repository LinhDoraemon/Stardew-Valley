package com.LinhDoraemon.data;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class PlayerData {

	public static void saveConfig(FileConfiguration config, File file) {

		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int getPlayerInventoryLevel(String playername) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		int money = config.getInt("BackpackLevel");
		return money;

	}

	public static int getPlayerMoney(String playername) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		int money = config.getInt("Money");
		return money;

	}

	public static boolean hasData(String playername) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");

		if (file.exists()) {
			return true;
		} else {
			return false;
		}

	}

	public static FileConfiguration getData(String playername) {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		return config;
	}
	
	public static void createPlayerData(String playername) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");

		if (hasData(playername)) {
			return;
		} else {
			Bukkit.getConsoleSender().sendMessage("Creating data for player " + playername + ".....");
			try {
				file.createNewFile();
				FileConfiguration config = YamlConfiguration.loadConfiguration(file);
				config.set("Money", 500);
				config.set("Farm.HAS_FARM", false);
				saveConfig(config, file);
				Bukkit.getConsoleSender().sendMessage("Creating data for player " + playername + " successfully.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void addPlayerMoney(String playername, int amount) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		int money = config.getInt("Money");
		config.set("Money", money + amount);
		saveConfig(config, file);

	}

	public static boolean removePlayerMoney(String playername, int amount) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		int money = config.getInt("Money");

		if (money - amount >= 0) {

			config.set("Money", money - amount);
			saveConfig(config, file);
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkCookingRecipe(String playername, String food) {

		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (config.getBoolean("Cooking." + food) == true) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean checkCraftingRecipe(String playername, String item) {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (config.getBoolean("Crafting." + item) == true) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isMarried(String playername) {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (config.getBoolean("Marrige") == true) {
			return false;
		} else {
			return true;
		}
	}

	public static String getPlayerMarrier(String playername) {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "PlayersData"
				+ File.separator + playername + ".yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		if (config.getString("MarrigeName").equals("None") == false) {
			String mr = config.getString("MarrigeName");
			return mr;
		} else {
			return "None";
		}
	}
}

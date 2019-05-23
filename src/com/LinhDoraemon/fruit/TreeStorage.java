package com.LinhDoraemon.fruit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class TreeStorage {

	public static List<Location> POMEGRANATE = new ArrayList<Location>();
	public static List<Location> CHERRY = new ArrayList<Location>();
	public static List<Location> ORANGE = new ArrayList<Location>();
	public static List<Location> PEACH = new ArrayList<Location>();
	public static List<Location> APPLE = new ArrayList<Location>();
	
	public static void loadAll() {
		try {
			loadPomegranate();
			loadCheery();
			loadOrange();
			loadPeach();
			loadApple();
			Bukkit.getConsoleSender().sendMessage("Loaded all fruit trees' datas successfully.....");	
		} catch (Exception e) {
			Bukkit.getConsoleSender().sendMessage("Loaded all fruit trees' datas unsuccessfully.....");	
		}	
	}
	
	public static void saveAll() {
		try {
			savePomegranate();
			saveCheery();
			saveOrange();
			savePeach();
			saveApple();
			Bukkit.getConsoleSender().sendMessage("Saved all fruit trees' datas successfully.....");	
		} catch (Exception e) {
			Bukkit.getConsoleSender().sendMessage("Saved all fruit trees' datas unsuccessfully.....");	
		}
	}
	
	private static void savePeach() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "PEACH.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		config.set("Locations", PEACH);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void saveApple() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "APPLE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		config.set("Locations", APPLE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void saveOrange() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "ORANGE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		config.set("Locations", ORANGE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void saveCheery() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "CHERRY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		config.set("Locations", CHERRY);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void savePomegranate() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "POMEGRANATE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		config.set("Locations", POMEGRANATE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void loadPomegranate() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "POMEGRANATE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	
		POMEGRANATE.addAll((List<Location>) config.getList("Locations"));
		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void loadApple() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "APPLE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		APPLE.addAll((List<Location>) config.getList("Locations"));
		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void loadCheery() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "CHERRY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		ORANGE.addAll((List<Location>) config.getList("Locations"));
		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void loadPeach() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "PEACH.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		PEACH.addAll((List<Location>) config.getList("Locations"));
		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void loadOrange() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "fruits" + File.separator + "ORANGE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		
		ORANGE.addAll((List<Location>) config.getList("Locations"));
		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

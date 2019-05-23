package com.LinhDoraemon.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.LinhDoraemon.crops.CropsData;
import com.LinhDoraemon.crops.CropsMeta;
import com.LinhDoraemon.fruit.TreeStorage;

public class CropStorage implements CommandExecutor {

	public static List<String> BLUE_JAZZ = new ArrayList<>();
	public static List<String> BLUE_BERRY = new ArrayList<>();
	public static List<String> CAULIFLOWER = new ArrayList<>();
	public static List<String> COFFEE_BEAN = new ArrayList<>();
	public static List<String> CORN = new ArrayList<>();
	public static List<String> GARLIC = new ArrayList<>();
	public static List<String> KALE = new ArrayList<>();
	public static List<String> MELON = new ArrayList<>();
	public static List<String> PARSNIP = new ArrayList<>();
	public static List<String> POPPY = new ArrayList<>();
	public static List<String> POTATO = new ArrayList<>();
	public static List<String> RADISH = new ArrayList<>();
	public static List<String> RED_CABBAGE = new ArrayList<>();
	public static List<String> STRAWBERRY = new ArrayList<>();
	public static List<String> SUNFLOWER = new ArrayList<>();
	public static List<String> TOMATO = new ArrayList<>();
	public static List<String> ARTICHOKE = new ArrayList<>();
	public static List<String> CRANBERRIES = new ArrayList<>();
	public static List<String> EGGPLANT = new ArrayList<>();
	public static List<String> PUMPKIN = new ArrayList<>();
	public static List<String> GRAPE = new ArrayList<>();

	public static List<List<String>> getAlls(){
		List<List<String>> l = new ArrayList<>();
		l.add(ARTICHOKE);
		l.add(BLUE_JAZZ);
		l.add(BLUE_BERRY);
		l.add(CAULIFLOWER);
		l.add(COFFEE_BEAN);
		l.add(CORN);
		l.add(GARLIC);
		l.add(KALE);
		l.add(MELON);
		l.add(PARSNIP);
		l.add(POPPY);
		l.add(POTATO);
		l.add(RADISH);
		l.add(RED_CABBAGE);
		l.add(STRAWBERRY);
		l.add(SUNFLOWER);
		l.add(TOMATO);
		l.add(CRANBERRIES);
		l.add(EGGPLANT);
		l.add(PUMPKIN);
		l.add(GRAPE);
		return l;
	}
	
	public static boolean checkGrowing() {
		for(List<String> list : getAlls()) {
			for(String )
		}
		for (String s : BLUE_JAZZ) {
			CropManager m = CropManager.get(new CropsMeta(s).getLocation(), CropsData.BLUE_JAZZ);
			m.update();
		}
		for (String s : BLUE_BERRY) {

		}
		for (String s : CAULIFLOWER) {

		}
		for (String s : COFFEE_BEAN) {

		}
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equals("savedata") && sender instanceof ConsoleCommandSender) {
			saveAllCropsData();
			TreeStorage.saveAll();
		} else {
			sender.sendMessage("§cYou can not do this in-game !");
		}

		return true;
	}

	public static void saveAllCropsData() {
		try {
			saveArtichokeData();
			saveBlueBerryData();
			saveBlueJazzData();
			saveCauliflowerData();
			saveCoffeeBeanData();
			saveCornData();
			saveGarlicData();
			saveKaleData();
			saveMelonData();
			saveParsnipData();
			savePoppyData();
			saveRadishData();
			savePotatoData();
			saveRedCabbageData();
			saveStrawberryData();
			saveSunflowerData();
			saveTomatoData();
			saveCranberriesData();
			saveEggplantData();
			savePumpkin();
			saveGrape();
			Bukkit.getConsoleSender().sendMessage("Saved all crops data successfully......");
		} catch (Exception e) {
			// TODO: handle exception
			Bukkit.getConsoleSender().sendMessage("Saved all crops data unsuccessfully......");
		}

	}

	public static void loadAllCropsData() {

		try {
			loadGrape();
			loadCranbierres();
			loadArtichoke();
			loadBlueBerry();
			loadBlueJazz();
			loadCauliflower();
			loadCoffeeBean();
			loadCorn();
			loadGarlic();
			loadKale();
			loadMelon();
			loadParsnip();
			loadPoppy();
			loadPotato();
			loadRadish();
			loadRedCabbage();
			loadStrawberry();
			loadSunflower();
			loadTomato();
			loadEggplant();
			loadPumpkin();
			Bukkit.getConsoleSender().sendMessage("Loaded all crops data successfully......");
		} catch (Exception e) {
			// TODO: handle exception
			Bukkit.getConsoleSender().sendMessage("Loaded all crops data unsuccessfully......");
		}

	}

	public static void saveGrape() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "GRAPE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", GRAPE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void savePumpkin() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "PUMPKIN.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", PUMPKIN);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveCranberriesData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "CRANBERRIES.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", CRANBERRIES);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveArtichokeData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "ARTICHOKE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", ARTICHOKE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveBlueJazzData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "BLUE_JAZZ.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", BLUE_JAZZ);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveBlueBerryData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "BLUE_BERRY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", BLUE_BERRY);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveCauliflowerData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "CAULIFLOWER.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", CAULIFLOWER);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveCoffeeBeanData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "COFFEE_BEAN.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", COFFEE_BEAN);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveCornData() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "CORN.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", CORN);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveGarlicData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "GARLIC.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", GARLIC);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveKaleData() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "KALE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", KALE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveMelonData() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "MELON.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", MELON);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveParsnipData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "PARSNIP.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", PARSNIP);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void savePoppyData() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "POPPY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", POPPY);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void savePotatoData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "POTATO.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", POTATO);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveRadishData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "RADISH.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", RADISH);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveRedCabbageData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "RED_CABBAGE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", RED_CABBAGE);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveStrawberryData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "STRAWBERRY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", STRAWBERRY);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveSunflowerData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "SUNFLOWER.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", SUNFLOWER);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveTomatoData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "TOMATO.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", TOMATO);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveEggplantData() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "EGGPLANT.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		config.set("Locations", EGGPLANT);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// |-----------------|
	// | LOADING |
	// |-----------------|

	public static void loadBlueBerry() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "BLUE_BERRY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		BLUE_BERRY.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadBlueJazz() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "BLUE_JAZZ.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		BLUE_JAZZ.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadCauliflower() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "CAULIFLOWER.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		CAULIFLOWER.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadCoffeeBean() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "COFFEE_BEAN.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		COFFEE_BEAN.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadCorn() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "CORN.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		CORN.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadGarlic() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "GARLIC.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		GARLIC.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadKale() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "KALE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		KALE.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadMelon() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "MELON.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		MELON.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadParsnip() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "PARSNIP.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		PARSNIP.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadPoppy() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "POPPY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		POPPY.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadArtichoke() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "ARTICHOKE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		ARTICHOKE.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadPotato() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "POTATO.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		POTATO.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadRadish() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "RADISH.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		RADISH.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadRedCabbage() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "RED_CABBAGE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		RED_CABBAGE.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadStrawberry() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "STRAWBERRY.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		STRAWBERRY.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadSunflower() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "SUNFLOWER.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		SUNFLOWER.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadTomato() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "TOMATO.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		TOMATO.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadCranbierres() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "CRANBERRIES.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		CRANBERRIES.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadEggplant() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "EGGPLANT.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		EGGPLANT.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadPumpkin() {
		File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator
				+ "PUMPKIN.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		PUMPKIN.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadGrape() {
		File file = new File(
				"plugins" + File.separator + "StardewValley" + File.separator + "crops" + File.separator + "GRAPE.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);

		GRAPE.addAll((List<String>) config.getList("Locations"));

		config.set("Locations", null);
		try {
			config.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

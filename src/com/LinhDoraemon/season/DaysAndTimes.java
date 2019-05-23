package com.LinhDoraemon.season;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.LinhDoraemon.animals.Chicken;
import com.LinhDoraemon.animals.Cow;
import com.LinhDoraemon.animals.Sheep;
import com.LinhDoraemon.machines.BeeHouse;
import com.LinhDoraemon.machines.CrabPot;
import com.LinhDoraemon.machines.Tapper;
import com.LinhDoraemon.quest.QuestHall;
import com.LinhDoraemon.shipping.ShippingListener;
import com.LinhDoraemon.television.FortuneTeller;
import com.LinhDoraemon.television.LivingOfTheLand;
import com.LinhDoraemon.television.WeatherReport;
import com.LinhDoraemon.television.WeatherType;

public class DaysAndTimes implements Listener {

	static File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "seasons.yml");
	static FileConfiguration config = YamlConfiguration.loadConfiguration(file);

	public static boolean CAN_SLEEP = true;

	public static void newDayComes(Player p) {

		if (currentDay() == 28) {
			switch (config.getString("Season")) {
			case "SPRING":

				config.set("Season", "SUMMER");
				config.set("Day", 1);
				config.set("isSpring", false);
				config.set("isFall", false);
				config.set("isSummer", true);
				config.set("isWinter", false);

				try {
					config.save(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case "SUMMER":

				config.set("Season", "FALL");
				config.set("Day", 1);
				config.set("isSpring", false);
				config.set("isFall", true);
				config.set("isSummer", false);
				config.set("isWinter", false);
				try {
					config.save(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case "FALL":

				config.set("Season", "WINTER");
				config.set("Day", 1);
				config.set("isSpring", false);
				config.set("isFall", false);
				config.set("isSummer", false);
				config.set("isWinter", true);
				try {
					config.save(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			default:
				config.set("Season", "SPRING");
				config.set("Day", 1);
				config.set("isSpring", true);
				config.set("isFall", false);
				config.set("isSummer", false);
				config.set("isWinter", false);
				try {
					config.save(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}
		} else {
			config.set("Day", currentDay() + 1);
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (Player all : Bukkit.getOnlinePlayers()) {

			all.sendTitle("§6§lＳｔａｒｄｅｗ §e§lＶａｌｌｅｙ",
					"§eNgày : §f§l" + currentDay() + " §f- §bMùa : §a§l" + currentSeason());

			all.sendMessage("");
			all.sendMessage("");
			all.sendMessage("§b§l" + p.getName() + " §2vừa có giấc ngủ ngon !");

		}

	}

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

	public static int currentDay() {

		int day = config.getInt("Day");
		return day;

	}

	public static String currentSeason() {

		String season = config.getString("Season");
		return season;
	}

	@EventHandler
	public void nguoichoiocchodingu(PlayerBedEnterEvent e) {

		if (CAN_SLEEP == false) {
			return;
		}
		CAN_SLEEP = false;
		e.setCancelled(true);
		for (World world : Bukkit.getWorlds()) {
			world.setTime(0);
		}

		Chicken.resetBreading();
		Cow.resetBreading();
		Sheep.resetBreading();

		QuestHall.setRandomQuest();
		QuestHall.update();
		
		e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 99999));

		BeeHouse.startProduceHoney();
		Tapper.startProduceSyrup();

		WeatherType.setWeather();

		newDayComes(e.getPlayer());

		changeThu();
		CrabPot.resultCrabPot();

		for (World w : Bukkit.getWorlds()) {
			WeatherType.setWeatherForcast(w);
		}

		FortuneTeller.reset();
		LivingOfTheLand.reset();
		WeatherReport.reset();
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {
						CAN_SLEEP = true;

					}

				}, 800L);

	}

	/*
	 * public void checkDay() { if (currentDay() == 13 && isSpring()) { EggFestival
	 * fes = new EggFestival(); fes.cooldownEggFestival(); return; }
	 * 
	 * if (currentDay() == 24 && isSpring()) { FlowerDance fes = new FlowerDance();
	 * fes.cooldownEggFestival(); return; } }
	 */

	int dingunao;

	public static void changeThu() {
		if (isMonday()) {
			config.set("Thu", "Tuesday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		if (isTuesday()) {
			config.set("Thu", "Wednesday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		if (isWedDay()) {
			config.set("Thu", "Thursday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		if (isThursday()) {
			config.set("Thu", "Friday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		if (isFriday()) {
			config.set("Thu", "Saturday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		if (isSaturday()) {
			config.set("Thu", "Sunday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		if (isSunday()) {
			config.set("Thu", "Monday");
			try {
				config.save(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
	}

	public static boolean isMonday() {
		if (config.getString("Thu").equals("Monday")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isTuesday() {
		if (config.getString("Thu").equals("Tuesday")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isWedDay() {
		if (config.getString("Thu").equals("Wednesday")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isThursday() {
		if (config.getString("Thu").equals("Thursday")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isFriday() {
		if (config.getString("Thu").equals("Friday")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isSaturday() {
		if (config.getString("Thu").equals("Saturday")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isSunday() {
		if (config.getString("Thu").equals("Sunday")) {
			return true;
		} else {
			return false;
		}
	}

	public static String getThu() {

		switch (config.getString("Thu")) {
		case "Monday":
			return "Thứ hai";
		case "Tuesday":
			return "Thứ ba";
		case "Wednesday":
			return "Thứ tư";
		case "Thursday":
			return "Thứ năm";
		case "Friday":
			return "Thứ sáu";
		case "Saturday":
			return "Thứ bảy";
		case "Sunday":
		default:
			return "Chủ nhật";
		}
	}

	// @EventHandler
	public void dingudithanglonkiamaykhongdingua(PlayerMoveEvent e) {
		Player p = e.getPlayer();

		if (CAN_SLEEP == false) {
			return;
		}

		if (p.getWorld().getTime() > 19000) {
			CAN_SLEEP = false;
			for (Player all : Bukkit.getOnlinePlayers()) {

				for (int i = 0; i < 12; i++) {
					all.sendMessage("");
				}

				all.sendMessage("§c§l*Bạn cảm thấy kiệt sức và cơ thể nặng trĩu...... Bạn dần gục xuống !*");
				CAN_SLEEP = false;
				e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 99999));

				WeatherType.setWeather();

				e.setCancelled(true);
				CAN_SLEEP = true;
				newDayComes(e.getPlayer());

				changeThu();
				CrabPot.resultCrabPot();

				for (World w : Bukkit.getWorlds()) {
					WeatherType.setWeatherForcast(w);
				}

				ShippingListener.sellAllItems();

			}
		}

	}

}

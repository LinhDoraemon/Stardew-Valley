package com.LinhDoraemon.television;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class WeatherReport {

	private static List<String> LISTS = new ArrayList<>();

	public static void add(Player p) {
		if (LISTS.contains(p.getName()) == false) {
			LISTS.add(p.getName());
		}
	}

	public static void remove(Player p) {
		if(LISTS.contains(p.getName())) {
			LISTS.remove(p.getName());
		}
	}
	
	public static boolean hasWatched(Player p) {
		return LISTS.contains(p.getName());
	}
	
	public static void reset() {
		LISTS.clear();
	}
	
	public static void runWeatherReport(Player p) {
		String WR_PREFIX = "§f§l< §6§lPhóng viên §f§l> §e";

		p.sendTitle("§e§lDự báo thời tiết", "");

		p.sendMessage(WR_PREFIX + "Chào mừng bạn đến với bản tin dự báo thời tiết !");
		p.sendMessage("");

		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {
						switch (WeatherType.getWeather()) {
						case SUNNY:
							p.sendMessage(WR_PREFIX + "Bầu trời ngày mai khá là trong lành và nắng ấm cả ngày.");
							break;
						case RAINY:
							p.sendMessage(WR_PREFIX + "Ngày mai thời tiết không tốt lắm ! Sẽ mưa cả ngày !");
							break;
						case THUNDER:
							p.sendMessage(
									WR_PREFIX + "Có vẻ như một cơn bão đang đến gần. Sấm sét khá là được mong đợi.");
							break;
						}

					}

				}, 60L);

	}
}

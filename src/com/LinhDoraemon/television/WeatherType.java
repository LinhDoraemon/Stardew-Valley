package com.LinhDoraemon.television;

import java.util.Random;

import org.bukkit.World;

import com.LinhDoraemon.season.DaysAndTimes;

public enum WeatherType {

	SUNNY, RAINY, THUNDER;

	private static WeatherType wea = SUNNY;

	public static void setWeatherForcast(World w) {

		if (wea == SUNNY) {
			w.setStorm(false);
		}
		if (wea == RAINY) {
			w.setStorm(true);
		}
		if (wea == THUNDER) {
			w.setStorm(false);
			w.setThundering(true);
		}

	}

	public static WeatherType getWeather() {
		return wea;
	}

	public static void setWeather() {
		Random rand = new Random();
		int so = rand.nextInt(7);

		switch (so) {
		case 1:
		case 3:
		case 5:
		case 7:
			WeatherType.wea = SUNNY;
			break;
		case 2:
			WeatherType.wea = RAINY;
			break;
		default:
			if (DaysAndTimes.isSummer()) {
				WeatherType.wea = THUNDER;
			} else {
				WeatherType.wea = SUNNY;
			}
			break;
		}

	}

}

package com.LinhDoraemon.utils;

import org.bukkit.World;

public enum Time {

	MORNING, NOON, AFTERNOON, NIGHT, MIDNIGHT;
	
	public static Time getPart(World world_time) {
		long time = world_time.getFullTime();
		if(time >= 0 && time <= 4283) {
			return MORNING;
		}
		if(time > 4283 && time <= 6000) {
			return NOON;
		}
		if(time > 6000 && time <= 12566 ) {
			return AFTERNOON;
		}
		if(time > 12566 && time <= 13800) {
			return NIGHT;
		}
		if(time > 13800) {
			return MIDNIGHT;
		}
		return null;
	}

}

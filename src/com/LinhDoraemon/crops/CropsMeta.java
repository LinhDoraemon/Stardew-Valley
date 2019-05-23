package com.LinhDoraemon.crops;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

abstract class CropsInterface {

	public abstract String getMetaData();

	public abstract CropsData getData();

	public abstract Crops getCrops();

	public abstract Location getLocation();

}

public class CropsMeta extends CropsInterface {

	private Location loc;

	public CropsMeta(Location loc) {
		this.loc = loc;
	}
	
	public CropsMeta(String data) {
		String[] strings_1 = getMetaData().split("[");
		String[] of = strings_1[1].split(",");
		int x = Integer.parseInt(of[0]);
		int y = Integer.parseInt(of[1]);
		int z = Integer.parseInt(of[2]);
		World world = Bukkit.getWorld(of[3]);
		Location loc = new Location(world, x, y, z);
		this.loc = loc;
	}

	@Override
	public String getMetaData() {
		return "CropsMeta{Location=:[" + loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ() + ","
				+ loc.getWorld().getName() + "]}";
	}

	@Override
	public CropsData getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crops getCrops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation() {
		String[] strings_1 = getMetaData().split("[");
		String[] of = strings_1[1].split(",");
		int x = Integer.parseInt(of[0]);
		int y = Integer.parseInt(of[1]);
		int z = Integer.parseInt(of[2]);
		World world = Bukkit.getWorld(of[3]);
		return new Location(world, x, y, z);
	}

}

package com.LinhDoraemon.fishing;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.World;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.season.Season;
import com.LinhDoraemon.utils.Time;

public enum FishType {

	SHAD(Season.SPRING, Season.FALL, Time.MORNING, Fishes.SHAD()),
	DORADO(Season.SUMMER, Time.AFTERNOON, Fishes.DORADO()),
	SQUID(Season.WINTER, Time.AFTERNOON, Fishes.SQUID()),
	OCTOPUS(Season.SUMMER, Time.MORNING, Fishes.OCTOPUS()),
	HERRING(Season.SPRING, Season.WINTER, Fishes.HERRING()),
	RED_MULLET(Season.SUMMER, Season.WINTER, Fishes.RED_MULLET()),
	CARP(Fishes.CARP()),
	SALMON(Season.FALL, Time.AFTERNOON, Fishes.SALMON()),
	BREAM(Time.NIGHT, Fishes.BREAM()),
	SARDINE(Season.SPRING, Season.FALL, Time.AFTERNOON, Fishes.SARDINE()),
	TUNA(Season.SUMMER, Season.WINTER, Time.AFTERNOON, Fishes.TUNA()),
	ANCHOVY(Season.SPRING, Season.FALL, Fishes.ANCHOVY()),
	PUFFERFISH(Season.FALL, Season.SUMMER, Time.NOON, Fishes.PUFFERFISH());
	
	private Season season;
	private Time time;
	private Season season_add;
	
	private ItemStack item;
	
	FishType(ItemStack item){
		this.season = null;
		this.season_add = null;
		this.time = null;
		this.item = item;
	}
	
	FishType(Time time, ItemStack item){
		this.season = null;
		this.season_add = null;
		this.time = time;
		this.item = item;
	}
	
	FishType(Season season, Season season_add, Time time, ItemStack item){
		this.season = season;
		this.season_add = season_add;
		this.time = time;
		this.item = item;
	}
	
	FishType(Season season, Season season_add, ItemStack item){
		this.season = season;
		this.season_add = season_add;
		this.time = null;
		this.item = item;
	}
	
	FishType(Season season, ItemStack item){
		this.season = season;
		this.season_add = null;
		this.time = null;
		this.item = item;
	}
	
	FishType(Season season, Time time, ItemStack item) {
		this.season = season;
		this.time = time;
		this.season_add = null;
		this.item = item;
	}
	
	public boolean isTimed(World world_time) {
		if(time == null) {
			return true;
		}else {
			if(Time.getPart(world_time) == time) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public ItemStack getItemStack() {
		return item;
	}
	
	public static List<FishType> getSprings(){
		List<FishType> l = new ArrayList<>();
		l.add(SHAD);
		l.add(HERRING);
		l.add(SARDINE);
		l.add(ANCHOVY);
		l.add(CARP);
		return l;
	}
	
	public static List<FishType> getSummers(){
		List<FishType> l = new ArrayList<>();
		l.add(DORADO);
		l.add(OCTOPUS);
		l.add(RED_MULLET);
		l.add(TUNA);
		l.add(PUFFERFISH);
		l.add(CARP);
		return l;
	}
	
	public static List<FishType> getWinters(){
		List<FishType> l = new ArrayList<>();
		l.add(SQUID);
		l.add(HERRING);
		l.add(RED_MULLET);
		l.add(TUNA);
		l.add(CARP);
		return l;
	}
	
	public static List<FishType> getFalls(){
		List<FishType> l = new ArrayList<>();
		l.add(SHAD);
		l.add(SALMON);
		l.add(SARDINE);
		l.add(ANCHOVY);
		l.add(PUFFERFISH);
		l.add(CARP);
		return l;
	}
}

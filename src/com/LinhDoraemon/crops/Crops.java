package com.LinhDoraemon.crops;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.cropstype.Artichoke;
import com.LinhDoraemon.cropstype.BlueBerry;
import com.LinhDoraemon.cropstype.BlueJazz;
import com.LinhDoraemon.cropstype.Cauliflower;
import com.LinhDoraemon.cropstype.CoffeeBean;
import com.LinhDoraemon.cropstype.Corn;
import com.LinhDoraemon.cropstype.Cranberries;
import com.LinhDoraemon.cropstype.EggPlant;
import com.LinhDoraemon.cropstype.Garlic;
import com.LinhDoraemon.cropstype.Grape;
import com.LinhDoraemon.cropstype.Kale;
import com.LinhDoraemon.cropstype.Melon;
import com.LinhDoraemon.cropstype.Parsnip;
import com.LinhDoraemon.cropstype.Poppy;
import com.LinhDoraemon.cropstype.Potato;
import com.LinhDoraemon.cropstype.Pumpkin;
import com.LinhDoraemon.cropstype.Radish;
import com.LinhDoraemon.cropstype.RedCabbage;
import com.LinhDoraemon.cropstype.Strawberry;
import com.LinhDoraemon.cropstype.Sunflower;
import com.LinhDoraemon.cropstype.Tomato;

public enum Crops {

	ARTICHOKE(Artichoke.getArtichoke(), 4),
	BLUE_BERRY(BlueBerry.getBlueBerry(), 6),
	BLUE_JAZZ(BlueJazz.getBlueJazz(), 3),
	CAULIFLOWER(Cauliflower.getCauliflower(), 6),
	COFFEE_BEAN(CoffeeBean.getCoffeeBean(), 5),
	CORN(Corn.getCorn(), 7),
	CRANBERRIES(Cranberries.getCranberries(), 3),
	EGGPLANT(EggPlant.getEggPlant(), 2),
	GARLIC(Garlic.getGarlic(), 2),
	GRAPE(Grape.getGrape(), 5),
	KALE(Kale.getKale(), 3),
	MELON(Melon.getMelon(), 6),
	PARSNIP(Parsnip.getParsnip(), 2),
	POPPY(Poppy.getPoppy(), 3),
	POTATO(Potato.getPotato(), 3),
	PUMPKIN(Pumpkin.getPumpkin(), 6),
	RADISH(Radish.getRadish(), 3),
	RED_CABBAGE(RedCabbage.getRedCabbage(), 4),
	STRAWBERRY(Strawberry.getStrawberry(), 4),
	SUNFLOWER(Sunflower.getSunflower(), 4),
	TOMATO(Tomato.getTomato(), 5);
	
	private ItemStack item;
	private int growing_time;
	
	Crops(ItemStack item, int growing_time){
		this.item = item;
		this.growing_time = growing_time;
	}
	
	public ItemStack getItemStack() {
		return item;
	}
	
	public int getGrowingDay() {
		return growing_time;
	}
	
	public static List<Crops> getSprings(){
		List<Crops> l = new ArrayList<>();
		l.add(BLUE_JAZZ);
		l.add(CAULIFLOWER);
		l.add(COFFEE_BEAN);
		l.add(GARLIC);
		l.add(KALE);
		l.add(PARSNIP);
		l.add(POTATO);
		l.add(STRAWBERRY);
		return l;
	}
	
	public static List<Crops> getSummers(){
		List<Crops> l = new ArrayList<>();
		l.add(BLUE_BERRY);
		l.add(CORN);
		l.add(MELON);
		l.add(POPPY);
		l.add(RADISH);
		l.add(SUNFLOWER);
		l.add(RED_CABBAGE);
		l.add(TOMATO);
		return l;
	}
	
	public static List<Crops> getFalls(){
		List<Crops> l = new ArrayList<>();
		l.add(CRANBERRIES);
		l.add(EGGPLANT);
		l.add(PUMPKIN);
		l.add(ARTICHOKE);
		l.add(GRAPE);
		return l;
	}
	
}

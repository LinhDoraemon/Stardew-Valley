package com.LinhDoraemon.utils;

import java.util.Random;

public class HashTag {
	
	public static final String RESOURCES = "§9§l[Khoáng sản]";
	public static final String TYPE_MONSTER = "§5§l[Phần thưởng quái vật]";
	public static final String TYPE_RING = "§e§l[Nhẫn]";
	public static final String TYPE_WILD_PLANT = "§a§l[Cây dại]";
	public static final String TYPE_FRUIT = "§a§l[Trái cây]";	
	public static final String TYPE_FORAGING = "§a§l[Hái lượm]";
	public static String TYPE_FURNITURE = "§9§l[Đồ trang trí]";
	public static String TRASH = "§7§l[Rác rưởi]";
	public static String TYPE_TREASURE = "§a§l[Báu vật]";
	public static String TYPE_FISH = "§b§l[Các loài cá]";
	public static String TYPE_FOOD_AND_DRINK = "§d§l[Đồ ăn thức uống]";
	public static String TYPE_MAIL = "§d§l[Hòm thư]";
	public static String TYPE_FESTIVAL = "§e§l[Đồ của lễ hội]";
	public static String TYPE_SEED = "§a§l[Hạt giống]";
	public static String TYPE_CROPS = "§a§l[Nông sản]";
	public static String TYPE_PRODUCT = "§e§l[Đồ thủ công]";
	public static String TYPE_CRAFTING = "§9§l[Đồ chế tạo]";
	public static String TYPE_BAIT = "§d§l[Mồi câu]";
	public static String IRON_QUALITY = "§f§l✭";
	public static String GOLD_QUALITY = "§e§l✭";
	public static String IDIRIUM_QUALITY = "§5§l✭";
	public static String OCEAN_ITEM = "§b§l[Đồ ở bãi biển]";
	public static String TYPE_ANIMALS_EGG = "§2§l[Trứng động vật]";
	public static String FOOTWEAR = "§6§l[Giày dép]";
	
	public static String addQuality() {	
		
		Random rand = new Random();
		int so = rand.nextInt(70) + 1;
		switch (so) {
		case 15:
			return IRON_QUALITY;
		case 45:
			return GOLD_QUALITY;
		case 69:
			return IDIRIUM_QUALITY;
		default:
			return "";
		}
		
	}
}

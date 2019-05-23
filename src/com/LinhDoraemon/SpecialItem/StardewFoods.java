package com.LinhDoraemon.SpecialItem;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class StardewFoods {

	public static ItemStack TOM_KHA_SOUP() {
		ItemStack i = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lSúp tôm kha");
		SimpleItem.addLore(mt, "", "§fMùi vị của món Thái này thật tuyệt.", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(6), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack BREAD() {
		ItemStack i = new ItemStack(Material.BREAD);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lBánh mì");
		SimpleItem.addLore(mt, "", "§fMang đậm hương vị Sài Gòn những năm 1945", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(5), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack TORTILLA() {
		ItemStack i = new ItemStack(Material.GOLDEN_CARROT);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lBánh tráng bột ngô");
		SimpleItem.addLore(mt, "", "§fĂn kèm với các món ăn khác hoặc có", "§fthể ăn riêng đều được cả.", "",
				SimpleItem.isHealth(0), SimpleItem.isFood(6), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack FISH_TACO() {
		ItemStack i = new ItemStack(Material.COOKED_FISH, 1, (byte) 0);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lTaco cá");
		SimpleItem.addLore(mt, "", "§fNó có hương vị thật tuyệt.", "", SimpleItem.isHealth(0), SimpleItem.isFood(5), "",
				HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SURVIVAL_HAMBURGER() {
		ItemStack i = new ItemStack(Material.COOKED_BEEF);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§a§lHamburger");
		SimpleItem.addLore(mt, "", "§fLoại đồ ăn tiện lợi cho mấy ", "§fnhà thám hiểm.", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(8), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CRANBERRY_SAUCE() {
		ItemStack i = new ItemStack(Material.BEETROOT_SOUP);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lSốt nam việt quất");
		SimpleItem.addLore(mt, "", "§fMang đậm hương vị của các lễ hội.", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(6), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack FRIED_MUSHROOM() {
		ItemStack i = new ItemStack(Material.COOKED_MUTTON);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lNấm nướng");
		SimpleItem.addLore(mt, "", "§fĐậm hương vị đất và rất thơm.", "", SimpleItem.isHealth(0), SimpleItem.isFood(6),
				"", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack FRIED_CALAMARI() {
		ItemStack i = new ItemStack(Material.BAKED_POTATO);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lMực nướng");
		SimpleItem.addLore(mt, "", "§fHơi dai một chút nhưng rất ngon.", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(5), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack PUMPKIN_PIE() {
		ItemStack i = new ItemStack(Material.PUMPKIN_PIE);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lBánh bí ngô");
		SimpleItem.addLore(mt, "", "§fChất chứa kem bí ngô trong một", "§flớp vỏ mịn.", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(8), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CHOWDER() {
		ItemStack i = new ItemStack(Material.RABBIT_STEW);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§9§lCanh hải sản");
		SimpleItem.addLore(mt, "", "§fMột cách tuyệt vời để làm ấm cơ thể", "§fbạn sau một chuyến ra biển dài.", "", 
				SimpleItem.isHealth(0), SimpleItem.isFood(10), "", HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack COOKIE() {
		ItemStack i = new ItemStack(Material.COOKIE);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lBánh quy");
		SimpleItem.addLore(mt, "", "§fGiòn tan và thơm mùi trứng.", "", SimpleItem.isHealth(0), SimpleItem.isFood(1), "",
				HashTag.TYPE_FOOD_AND_DRINK);
		i.setItemMeta(mt);
		return i;
	}

}

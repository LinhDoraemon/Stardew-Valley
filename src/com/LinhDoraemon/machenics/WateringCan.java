package com.LinhDoraemon.machenics;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.SimpleItem;

public class WateringCan {

	public static boolean useWateringCan(Player p) {

		ItemStack i = p.getInventory().getItemInMainHand();

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(getWateringCan().getItemMeta().getDisplayName()) && i.getDurability() < 24) {
			i.setDurability((short) (i.getDurability() + 2.5));
			return true;
		}else {
			return false;
		}

	}
	
	public static boolean isRanoutOfWater(Player p) {
		ItemStack i = p.getInventory().getItemInMainHand();

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(getWateringCan().getItemMeta().getDisplayName()) && i.getDurability() >= 24) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean setFullDurability(Player p) {
		ItemStack i = p.getInventory().getItemInMainHand();

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(getWateringCan().getItemMeta().getDisplayName()) && i.getDurability() < 26) {
			i.setDurability((short) 0);
			return true;
		}else {
			return false;
		}

	}
	
	public static ItemStack getWateringCan() {
		ItemStack i = new ItemStack(Material.CARROT_STICK);
		ItemMeta mt = i.getItemMeta();

		mt.setDisplayName("§f§l[§a§l Bình tưới nước §f§l]");
		SimpleItem.addLore(mt, "", "§fDùng để tưới nước cho cây.", "");
		i.setItemMeta(mt);
		return i;
	}

}

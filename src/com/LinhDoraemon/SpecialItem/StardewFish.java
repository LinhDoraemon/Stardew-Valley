package com.LinhDoraemon.SpecialItem;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class StardewFish {

	public static ItemStack TUNA() {
		ItemStack i = new ItemStack(Material.RAW_FISH);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCá ngừ " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá lớn sống ở biển.", "", "§e§oPhải chuột để ăn", "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SQUID() {
		ItemStack i = new ItemStack(Material.RAW_FISH);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lMực " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột sinh vật biển sâu có thể phát", "§ftriển đến kích thước khổng lồ.", "",
				"§e§oPhải chuột để ăn", "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

}

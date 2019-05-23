package com.LinhDoraemon.fishing;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class Fishes {

	public static ItemStack PUFFERFISH() {
		ItemStack i = new ItemStack(Material.RAW_FISH, 1, (byte) 3);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lCá nóc " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fThổi phồng lên mỗi khi bị đe dọa.", "", SimpleItem.isHealth(0),
				SimpleItem.isFood(0), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack ANCHOVY() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.ANCHOVY);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCá cơm " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá bạc sống ở biển.", "", SimpleItem.isHealth(2), SimpleItem.isFood(2),
				"", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack TUNA() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.TUNA);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCá ngừ " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột cá lớn sống ngoài đại dương.", "", SimpleItem.isHealth(2),
				SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SARDINE() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.SARDINE);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCá mòi " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá biển phổ biên.", "", SimpleItem.isHealth(2), SimpleItem.isFood(2), "",
				HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack BREAM() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.BREAM);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCá mè " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá bạc sống ở biển, hoạt", "§fđộng chủ yếu về đêm.", "",
				SimpleItem.isHealth(2), SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SALMON() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.SALMON);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§9§lCá hồi " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fThích bơi ngược dòng để đẻ trứng.", "", SimpleItem.isHealth(2),
				SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CARP() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.CARP);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lCá chép " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá nước lợ phổ biến.", "", SimpleItem.isHealth(2), SimpleItem.isFood(2),
				"", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack RED_MULLET() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.RED_MULLET);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lCá đối đỏ " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fThường được nuôi như thú cưng.", "", SimpleItem.isHealth(2), SimpleItem.isFood(2),
				"", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack HERRING() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.HERRING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§5§lCá trích " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá biển phổ biến.", "", SimpleItem.isHealth(2), SimpleItem.isFood(2), "",
				HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack DORADO() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.DORADO);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§d§lCá hồng " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài cá ăn thịt có màu vảy", "§fvô cùng rực rỡ.", "", SimpleItem.isHealth(2),
				SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack OCTOPUS() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.OCTOPUS);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lBạch tuộc " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột sinh vật bí ẩn và thông minh.", "", SimpleItem.isHealth(2),
				SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SQUID() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.SQUID);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§9§lMực ống " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột sinh vật biển sâu có thể phát", "§ftriển đến kích thước khổng lồ.", "",
				SimpleItem.isHealth(2), SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SHAD() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i, CSkull.SHAD);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCá bóng " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fSống ở biển nhưng thường sinh sản", "§fở sông.", "", SimpleItem.isHealth(2),
				SimpleItem.isFood(2), "", HashTag.TYPE_FISH);
		i.setItemMeta(mt);
		return i;
	}

}

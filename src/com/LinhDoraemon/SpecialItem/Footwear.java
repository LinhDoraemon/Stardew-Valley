package com.LinhDoraemon.SpecialItem;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class Footwear {

	public static ItemStack SNEAKERS() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§c§lGiày thể thao");
		SimpleItem.addLore(mt, "", "§fCó một chút mỏng manh nhưng vẫn thời trang.", "", "§a+ 1 sức phòng thủ", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.RED);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack RUBBER_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§a§lỦng cao su");
		SimpleItem.addLore(mt, "", "§fBảo vệ khỏi các yếu tố.", "", "§a+ 1 kháng làm chậm", "§a+ 1 sức phòng thủ", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.GREEN);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack LEATHER_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§6§lGiày da");
		SimpleItem.addLore(mt, "", "§fLàm từ da nên rất dẻo dai.", "", "§a+ 1 kháng làm chậm", "§a+ 1 sức phòng thủ", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.OLIVE);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack WORK_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§6§lGiày cao cổ");
		SimpleItem.addLore(mt, "", "§fBảo vệ thêm một phần của đôi chân.", "", "§a+ 2 sức phòng thủ", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.ORANGE);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack COMBAT_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§b§lGiày chiến đấu");
		SimpleItem.addLore(mt, "", "§fBảo vệ chân khỏi mấy đứa thích đùa.", "", "§a+ 3 sức phòng thủ", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.BLUE);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack THERMAL_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§e§lGiày chịu nhiệt");
		SimpleItem.addLore(mt, "", "§fTên thế thôi chứ vào nhiệt cũng nát.", "", "§a+ 4 sức phòng thủ", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.TEAL);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack DARK_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§9§lGiày tối màu");
		SimpleItem.addLore(mt, "", "§fĐược làm từ da đen, dày.", "", "§a+ 4 sức phòng thủ", "§a+ 1 kháng bật lùi", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.BLACK);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack GENIE_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§5§lGiày thần kỳ");
		SimpleItem.addLore(mt, "", "§fBị yểm bởi một năng lượng kỳ bí.", "", "§a+ 5 sức phòng thủ", "§a+ 3 kháng bật lùi", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.PURPLE);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack SPACE_BOOT() {
		ItemStack i = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta mt = (LeatherArmorMeta) i.getItemMeta();
		mt.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		mt.setDisplayName("§d§lGiày "
				+ "không gian");
		SimpleItem.addLore(mt, "", "§fMột loại vải mang lại ánh sáng tím.", "", "§a+ 4 sức phòng thủ", "§a+ 4 kháng hiệu ứng", "",
				HashTag.FOOTWEAR);
		mt.setColor(Color.NAVY);
		mt.setUnbreakable(true);
		i.setItemMeta(mt);
		return i;
	}
	
	

}

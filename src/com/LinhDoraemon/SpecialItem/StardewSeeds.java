package com.LinhDoraemon.SpecialItem;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.crops.CropsTag;
import com.LinhDoraemon.utils.SimpleItem;

public class StardewSeeds {

	public static List<ItemStack> getAllSeeds() {
		List<ItemStack> i = new ArrayList<ItemStack>();
		i.add(BLUE_JAZZ_SEED());
		i.add(CAULIFLOWER_SEED());
		i.add(COFFEE_SEED());
		i.add(GARLIC_SEED());
		i.add(CORN_SEED());
		i.add(KALE_SEED());
		i.add(MELON_SEED());
		i.add(PARSNIP_SEED());
		i.add(POTATO_SEED());
		i.add(STRAWBERRY_SEED());

		i.add(BLUEBERRY_SEED());
		i.add(POPPY_SEED());
		i.add(RED_CABBAGE_SEED());
		i.add(RADISH_SEED());
		i.add(TOMATO_SEED());
		i.add(SUNFLOWER_SEED());

		return i;
	}

	public static ItemStack BLUE_JAZZ_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lHạt giống hoa cẩm tú cầu");
		SimpleItem.addLore(mt, "", "§fMột loài hoa hình cầu, thu hút", "§frất nhiều ong bướm.", "", "§6Ⓖ 30", "",
				CropsTag.BLUE_JAZZ);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack CAULIFLOWER_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§f§lHạt giống súp lơ trắng");
		SimpleItem.addLore(mt, "", "§fRất có giá trị nhưng mọc lâu. Mặc dù có màu", "§fkhông đẹp nhưng có đủ vitamin",
				"", "§6Ⓖ 80", "", CropsTag.CAULIFLOWER);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack COFFEE_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lHạt giống cà phê");
		SimpleItem.addLore(mt, "", "§fTrồng vào mùa xuân để thu hoạch cà phê",
				"§fvà bỏ vào thùng ủ để tạo ra cà phê uống", "", CropsTag.COFFEE_BEAN);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack GARLIC_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§f§lHạt giống tỏi");
		SimpleItem.addLore(mt, "", "§fHãy thêm một nguyên liệu tuyệt vời vào", "§fcác món ăn của bạn", "", "§6Ⓖ 40", "",
				CropsTag.GARLIC);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack KALE_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§a§lHạt giống cải xoăn");
		SimpleItem.addLore(mt, "", "§fLoại là rất tuyệt vời cho các", "§fmón súp và xào.", "", "§6Ⓖ 70", "",
				CropsTag.KALE);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack PARSNIP_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lHạt giống củ cải vàng");
		SimpleItem.addLore(mt, "", "§fMột loại rau củ có họ gần với cà rốt,", "§fcó vị đất và đầy đủ vitamin.", "",
				"§6Ⓖ 20", "", CropsTag.PARSNIP);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack POTATO_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lHạt giống khoai tây");
		SimpleItem.addLore(mt, "", "§fMột loại củ được trồng rộng rãi", "", "§6Ⓖ 50", "", CropsTag.POTATO);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack STRAWBERRY_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§d§lHạt giống dâu tây");
		SimpleItem.addLore(mt, "", "§fMột hương vị ngọt ngào với màu", "§fđỏ hấp dẫn.", "", "§6Ⓖ  100", "",
				CropsTag.STRAWBERRY);
		i.setItemMeta(mt);
		return i;

	}

	// TODO SUMMER

	public static ItemStack BLUEBERRY_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§9§lHạt giống quả mọng xanh");
		SimpleItem.addLore(mt, "", "§fMột loại quả mọng phổ biến được cho", "§flà có nhiều lợi ích sức khỏe.", "",
				"§6Ⓖ  80", "", CropsTag.BLUE_BERRY);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack CORN_SEED() {

		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lHạt giống bắp ngô");
		SimpleItem.addLore(mt, "", "§fMột loại ngũ cốc phổ biến nhất. Các",
				"§floại bắp ngọt, tươi rất tuyệt vào mùa hè.", "", "§6Ⓖ  150", "", CropsTag.CORN);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack MELON_SEED() {

		ItemStack i = new ItemStack(Material.MELON_SEEDS);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§d§lHạt giống dưa hấu");
		SimpleItem.addLore(mt, "", "§fMột loại hoa quả mát mẻ và ngọt", "§fngào vào mùa hè", "", "§6Ⓖ  80", "",
				CropsTag.MELON);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack RED_CABBAGE_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lHạt giống cải bắp đỏ");
		SimpleItem.addLore(mt, "", "§fThường được sử dụng trong món", "§fsalad và xà lách trộn.", "", "§6Ⓖ  100", "",
				CropsTag.RED_CABBAGE);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack POPPY_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lHạt giống hoa anh túc");
		SimpleItem.addLore(mt, "", "§fNgoài là một hoa đầy màu sắc, nó còn ", "§fcó công dụng về ẩm thực và dược liệu",
				"", "§6Ⓖ  100", "", CropsTag.POPPY);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack RADISH_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lHạt giống củ dền");
		SimpleItem.addLore(mt, "", "§fMột loại rau củ giòn và tươi mát,", "§dăn với hạt tiêu khi ăn sống.", "",
				"§6Ⓖ  40", "", CropsTag.RADISH);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack TOMATO_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lHạt giống cà chua");
		SimpleItem.addLore(mt, "", "§fGiàu hương vị, cà chua có nhiều", "§fcách sử dụng trong ẩm thực.", "", "§6Ⓖ  50",
				"", CropsTag.TOMATO);
		i.setItemMeta(mt);

		return i;
	}

	public static ItemStack SUNFLOWER_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lHạt giống hoa hướng dương");
		SimpleItem.addLore(mt, "", "§fMột quan niệm sai lầm phổ biến là", "§fhoa luôn quay về hướng mặt trời.", "",
				"§6Ⓖ  200", "", CropsTag.SUNFLOWER);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack ATICHOKE_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§a§lHạt giống a ti sô");
		SimpleItem.addLore(mt, "", "§fNhững chiếc lá bên ngoài có gai che", "§fgiấu một phần thịt, lấp đầy bên trong.",
				"", "§6Ⓖ  30", "", CropsTag.ARTICHOKE);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CRANBERRIES_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lHạt giống nam việt quất");
		SimpleItem.addLore(mt, "", "§fMột loại quả phổ biến vào mùa rét.", "", "§6Ⓖ  240", "", CropsTag.CRANBERRIES);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack EGGPLANT_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§5§lHạt giống cà tím");
		SimpleItem.addLore(mt, "", "§fMột loại quả phổ biến vào mùa rét.", "", "§6Ⓖ  20", "", CropsTag.EGGPLANT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack PUMPKIN_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lHạt giống bí ngô");
		SimpleItem.addLore(mt, "", "§fMột loại quả yêu thích vào mùa thu, cho",
				"§fhạt giòn và thịt có hương vị tinh tế.", "", "§6Ⓖ  100", "", CropsTag.PUMPKIN);
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack GRAPE_SEED() {
		ItemStack i = new ItemStack(Material.PAPER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§5§lHạt giống cây nho");
		SimpleItem.addLore(mt, "", "§fMột chùm quả ngọt.", "", "§6Ⓖ  60", "", CropsTag.GRAPE);
		i.setItemMeta(mt);
		return i;
	}

}

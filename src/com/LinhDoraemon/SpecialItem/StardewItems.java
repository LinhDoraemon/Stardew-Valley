package com.LinhDoraemon.SpecialItem;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

import net.md_5.bungee.api.ChatColor;

public class StardewItems {

	public static ItemStack FESTIVE_EGG() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM);
		SkullMeta mt = (SkullMeta) item.getItemMeta();

		mt.setDisplayName("§a§lTrứng của Lễ Hội Tìm Trứng");
		mt.setOwner("AdolfJohannes");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("Tuy gọi là trứng nhưng thực ra được làm từ đá");
		lore.add(HashTag.TYPE_FESTIVAL);
		mt.setLore(lore);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack MILK() {
		ItemStack i = new ItemStack(Material.MILK_BUCKET);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§f§lSữa " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột bịch sữa tươi nguyên chất.", "", HashTag.TYPE_PRODUCT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SHEARS() {
		ItemStack i = new ItemStack(Material.SHEARS);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§9§lKéo tỉa");
		SimpleItem.addLore(mt, "", "§fDùng để kiếm len từ bọn cừu.", "");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack WOOL() {
		ItemStack i = new ItemStack(Material.WOOL);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§f§lLông cừu " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột miếng len mềm và mịn.", "", HashTag.TYPE_PRODUCT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CLOTH() {
		ItemStack i = new ItemStack(Material.LEATHER);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§f§lVải " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột cuộn vải làm từ lông cừu.", "", HashTag.TYPE_PRODUCT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack MILK_PAIL() {
		ItemStack i = new ItemStack(Material.BUCKET);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§9§lBình vắt sữa");
		SimpleItem.addLore(mt, "", "§fThu thập sữa từ động vật của bạn.", "");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack HAY() {
		ItemStack item = new ItemStack(Material.WHEAT);
		ItemMeta mt3 = item.getItemMeta();
		mt3.setDisplayName("§e§lLúa mì");
		SimpleItem.addLore(mt3, "", "§fSử dụng như thức ăn cho động vật.", "");
		item.setItemMeta(mt3);
		return item;
	}

	public static ItemStack TOTEM_MOUNTAIN() {
		ItemStack i = new ItemStack(Material.TOTEM);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§a§lBÙA CHÚ DỊCH CHUYỂN : §6§lNúi cao");
		SimpleItem.addLore(mt, "", "§fClick để dịch chuyển lên §2§lKHU NÚI CAO");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack EGG() {
		ItemStack i = new ItemStack(Material.EGG);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§f§lTrứng gà " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột quả trứng trắng bình thường.", "", HashTag.TYPE_PRODUCT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack TOTEM_BEACH() {
		ItemStack i = new ItemStack(Material.TOTEM);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§a§lBÙA CHÚ DỊCH CHUYỂN : §b§lBãi biển");
		SimpleItem.addLore(mt, "", "§fClick để dịch chuyển lên §9§lKHU BÃI BIỂN");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack BAIT() {
		ItemStack i = new ItemStack(Material.SPIDER_EYE);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§5§lMồi câu");
		SimpleItem.addLore(mt, "", "§fNhớp nhớp và dinh dính...", "", HashTag.TYPE_BAIT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CROCUS() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.itemWithUrl(item, "42deb033db326a433ad8e932e5355d4adf1729f466cfac9ffbb3732351812da4");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§5§lCây diên vĩ");
		SimpleItem.addLore(mt, "", "§fMột loài hoa nở vào mùa đông.", "", SimpleItem.isHealth(1), SimpleItem.isFood(1),
				"", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack SUGAR() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.itemWithUrl(item, "d980d16ed2f1dbf9a1d54fabde91661e462f8e9faceb69a75813fab87cedfcff");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§lĐường");
		SimpleItem.addLore(mt, "", "§fThêm chút vị ngọt vào bánh kẹo.", "", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack CRYSTAL_FRUIT() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.itemWithUrl(item, "cef094f3104fdc9da47b8688e1845966d79ef19a84e832d2d467353ca78ccde");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§b§lTrái pha lê");
		SimpleItem.addLore(mt, "", "§fMột loại trái cây mỏng manh từ tuyết.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack WINTER_ROOT() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.itemWithUrl(item, "e134b38ccb3ec17c5ff74e45ba0191ae06c670514ddf075165a9f5d507eb66d1");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lRễ mùa đông");
		SimpleItem.addLore(mt, "", "§fChắc phải lẫn trong cỏ cả năm rồi.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack SALMONBERRY() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh" + "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0"
						+ "L3RleHR1cmUvZWM0NWY0NjhjZjlmMDdiN2YxO" + "Tk4N2RhNDk0YzQ5MGRkODdkNGQzODYyODQ5MW"
						+ "M4NGY0OTVmNDVhZTdmYjY0In19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lQuả mâm xôi");
		SimpleItem.addLore(mt, "", "§fMột loại quả mọng chứa hương vị", "§fcủa khu rừng.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack PINE_TAR() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6L" + "y90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUv"
						+ "ZjIxZDdiMTU1ZWRmNDQwY2I4N2VjOTQ0ODdjYmE2NGU"
						+ "4ZDEyODE3MWViMTE4N2MyNmQ1ZmZlNThiZDc5NGMifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§9§lNhựa cây thông");
		SimpleItem.addLore(mt, "", "§fMột chất cay có nguồn gốc từ", "§fnhựa thông.", "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack SPICE_BERRY() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6L" + "y90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZ"
						+ "TJiMzViZGE1ZWJkZjEzNWY0ZTcxY2U0OTcyN" + "mZiZWM1NzM5ZjBhZGVkZjAxYzUxOWUyYWVh"
						+ "N2Y1MTk1MWVhMiJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lQuả mọng cay " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fHương thơm của nó tỏa khắp không gian.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack GRAPE() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L"
						+ "3RleHR1cmUvZWU1OTM1ODYzYzUzYTk5NmY1MzM0ZTkwZ" + "jU1ZGU1MzhlODNmZmM1ZjZiMGI4ZTgzYTRkYz"
						+ "RmNmU2YjEyMDgifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§5§lNho dại " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fLoại hoa quả có nhiều mùi vị đặc trưng.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack SWEET_PEA() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly9" + "0ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmU"
						+ "vYmZiMGIwOWU4Y2E5ZWI3ZDUwMTA5YmE5MjA5MjM1ZT"
						+ "QxMTczZDhkMGY4MTZiMzgxOTM1ZDNkMjk1MWIzZTMifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§d§lTrái đậu ngọt " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loại củ ngọt, thơm mát vào mùa hè.", "", SimpleItem.isHealth(1),
				SimpleItem.isFood(1), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack HAZELNUT() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
						+ "ZnQubmV0L3RleHR1cmUvNjc4Nzg0NzAzZmE1" + "OWNkMTUzZmNhYmUzY2NkOWQ0NGM0NjlhOGQ2M"
						+ "2U2ZDQzODYyNmFkOWViYzcwNzA3ZmMzIn19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lHạt dẻ");
		SimpleItem.addLore(mt, "", "§fĐó là một hạt dẻ lớn !", "", SimpleItem.isHealth(1), SimpleItem.isFood(1), "",
				HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack PURPLE_MUSHROOM() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3"
						+ "RleHR1cmUvZmJhOGRmZTBhZWJlOGY1YmJiZGNjMWY5Y" + "jg4OGQzNzQ4NTVjNzE5MDk5YWI1NzE3Yjc1NT"
						+ "kyYjEzODU0M2IifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§5§lNấm tím");
		SimpleItem.addLore(mt, "", "§fMột loại nấm quý hiếm được tìm", "§fthấy sâu trong hang động.", "",
				HashTag.TYPE_FORAGING);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack AQUAMARINE() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly9" + "0ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjkxYW"
						+ "VjYTdjMTdlNjZkODY3MjMxYjM2ZDk2ZTgzYzFlZGU3NWVh"
						+ "ZjY3Y2NmM2E4OGRjYTE1ZDQxMTRhZTE2NyJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§b§lThủy ngọc");
		SimpleItem.addLore(mt, "", "§fMột loại ngọc màu xanh biển lấp", "§flánh ánh lung linh.", "", HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack COMMON_MUSHROOM() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZ"
						+ "nQubmV0L3RleHR1cmUvNmY5MmQ0ZTMxMjYwMT" + "cyNjRjNTM2NDc4MTYxNzVmNWQ4ZmIxOGVkMT"
						+ "g1Zjc1N2MxNDhlYTg0Nzc4ODdhMSJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lNấm thường");
		SimpleItem.addLore(mt, "", "§fCó mùi hơi giống hạt dẻ, ", "§fbề ngoài cũng khá tốt.", "",
				HashTag.TYPE_FORAGING);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack WILD_HORSERADISH() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVyb" + "CI6Imh0dHA6Ly90ZXh0dXJlcy5taW5l"
						+ "Y3JhZnQubmV0L3RleHR1cmUvNDg1MzY" + "1MmJlYjQ4YmNlMTdlZDFmMzY4ZDliOD"
						+ "k4OTNiNjJjMjQ5MWM4NjVkYmI2ZWI4Z" + "TUyNTgyYzQ4ZTM4In19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§2§lCải ngựa dại");
		SimpleItem.addLore(mt, "", "§fMột loại rau củ có vị cay được", "§ftìm thấy vào mùa xuân.", "",
				SimpleItem.isHealth(1), SimpleItem.isFood(1.5), "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack HOLLY() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVy" + "bCI6Imh0dHA6Ly90ZXh0dXJlcy5taW" + "5lY3JhZnQubmV0L3RleHR1cmUvMWI0"
						+ "NjI3MWZmNDFhZWMzZmQ4NGU2NGU0NW" + "VkNjlhOGM1MzViMTRhZDRjMTMzYWZi"
						+ "MWE1YjM2ZTQzNjcxYjkifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lCây ô rô");
		SimpleItem.addLore(mt, "", "§fLoại cây có quả màu đỏ tươi, thường", "§fđược dùng để trang trí trong dịp Noel.",
				"", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack RICE() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZX" + "h0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUv"
						+ "Y2I3MGYyZmI1ZWJmNDlmNzlmZjNlODczNjE2OD" + "YzYWU1ZDM2MmZiYmZjMzFhZWYyZGZiOTNkN"
						+ "mUxN2RiZjIifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§lGạo");
		SimpleItem.addLore(mt, "", "§fMột trong những loại ngũ cốc cơ bản.", "", HashTag.TYPE_FOOD_AND_DRINK);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack QUARTZ() {

		ItemStack item = new ItemStack(Material.QUARTZ);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§lThạch anh");
		SimpleItem.addLore(mt, "", "§fMột tinh thể trong suốt thường được", "§ftìm thấy trong hang động và khu mỏ.", "",
				HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack PICKLES() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7" + "InVybCI6Imh0dHA6Ly90ZXh0dX" + "Jlcy5taW5lY3JhZnQubmV0L3Rle"
						+ "HR1cmUvNGZlNzZlZmFjMTQ4ZmM3" + "ZTczNzMzOTcyOWI0NzNkYWU4MmM" + "2YmFkYTRmNzYwNzk0NWVlZjRmNz"
						+ "gyYzViY2U2In19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§2§lDưa muối");
		SimpleItem.addLore(mt, "", "§fMột hũ dưa chua nhà làm.", "", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack SAP() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybC" + "I6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3"
						+ "JhZnQubmV0L3RleHR1cmUvMjJhYWIwMm" + "I4YjQ2YTIyYjk4Zjg1NjkzYzcwMDViMT"
						+ "M3Mjk1MThiNDkxYjlkZTcyN2UzYTU2ZTE" + "5NzJmYzdjMSJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§eNhựa cây");
		SimpleItem.addLore(mt, "", "§fChất nhờn kiếm được từ thân cây.", "", "§6§l[Tài nguyên]");
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack JAM() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90" + "ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQ3Mj"
						+ "kyNzNhYjdlZjM0MDllMjQzZThkYTc0YzFiZjM4NjNkMzE1"
						+ "OTIxYmJkYWMzNGM0NmRkMTI2NzVkMzAyMSJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lMứt");
		SimpleItem.addLore(mt, "", "§fTrông nó thật lộn xộn.", "", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack PUPPER_FISH() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		SkullMeta mt = (SkullMeta) item.getItemMeta();
		mt.setDisplayName("§e§lCá nóc " + HashTag.addQuality());
		mt.setOwner("Dewbious");

		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("Một loài cá cực kì độc, không thể ăn");
		lore.add("");
		lore.add("§a§l✙ §60");
		lore.add("§c§l✙ §b§oChoáng và đói");
		lore.add("§b§l[Các loài cá]");

		mt.setLore(lore);
		item.setItemMeta(mt);

		return item;

	}

	public static ItemStack GRASS_PATH() {
		ItemStack item = new ItemStack(Material.GRASS_PATH);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lLối mòn bằng cỏ");
		SimpleItem.addLore(mt, "", "Đặt xuống đất để tạo đường đi", "hoặc làm nổi bật nhà bạn", "",
				HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack WOOD_PATH() {
		ItemStack item = new ItemStack(Material.WOOD_PLATE);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lLối mòn bằng gỗ");
		SimpleItem.addLore(mt, "", "Đặt xuống đất để tạo đường đi", "hoặc làm nổi bật nhà bạn", "",
				HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack STAIRCASE() {
		ItemStack i = new ItemStack(Material.IRON_TRAPDOOR);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lCầu thang đi xuống");
		SimpleItem.addLore(mt, "", "§fSử dụng nó vào một cục đá nền ở", "§fkhu mine để đi xuống tầng kế tiếp.", "",
				HashTag.TYPE_CRAFTING);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack STONE_PATH() {
		ItemStack item = new ItemStack(Material.STONE_PLATE);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§3§lLối mòn bằng đá");
		SimpleItem.addLore(mt, "", "Đặt xuống đất để tạo đường đi", "hoặc làm nổi bật nhà bạn", "",
				HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack WOOD_FENCE() {
		ItemStack item = new ItemStack(Material.FENCE);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lHàng rào bằng gỗ");
		SimpleItem.addLore(mt, "", "§fGiữ cỏ và các con vật bên trong", "", HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack GATE() {

		ItemStack i = new ItemStack(Material.FENCE_GATE);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lCổng bằng gỗ");
		SimpleItem.addLore(mt, "", "§fCho phép bạn đi qua các hàng rào", "", HashTag.TYPE_FURNITURE);
		i.setItemMeta(mt);
		return i;

	}

	public static ItemStack STARTER_WATERING_CAN() {

		ItemStack item = new ItemStack(Material.BUCKET);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lBình tưới nước");
		SimpleItem.addLore(mt, "", "§9Mức nước :", "§b§l::::::::::");
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack STARTER_PICKAXE() {
		ItemStack pick = new ItemStack(Material.STONE_PICKAXE);
		ItemMeta mt = pick.getItemMeta();
		mt.setDisplayName("§f§l[ §a§lCúp Khởi Đầu §f§l]");
		pick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		pick.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		mt.spigot().setUnbreakable(true);
		pick.setItemMeta(mt);
		return pick;
	}

	public static ItemStack STARTER_SCYTHE() {
		ItemStack pick = new ItemStack(Material.STONE_SPADE);
		ItemMeta mt = pick.getItemMeta();
		mt.setDisplayName("§f§l[ §a§lLiềm Khởi Đầu §f§l]");
		pick.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		mt.spigot().setUnbreakable(true);
		pick.setItemMeta(mt);
		return pick;
	}

	public static ItemStack STARTER_AXE() {
		ItemStack pick = new ItemStack(Material.STONE_AXE);
		ItemMeta mt = pick.getItemMeta();
		mt.setDisplayName("§f§l[ §a§lRìu Khởi Đầu §f§l]");
		pick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		pick.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		mt.spigot().setUnbreakable(true);
		pick.setItemMeta(mt);

		return pick;
	}

	public static ItemStack STARTER_HOE() {
		ItemStack pick = new ItemStack(Material.STONE_HOE);
		ItemMeta mt = pick.getItemMeta();
		mt.setDisplayName("§f§l[ §a§lCuốc/Lưỡi Hái Khởi Đầu §f§l]");
		mt.spigot().setUnbreakable(true);
		pick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		pick.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		pick.setItemMeta(mt);
		return pick;
	}

	public static ItemStack FIBER() {
		ItemStack pallet = new ItemStack(Material.LONG_GRASS, 1, (byte) 2);
		ItemMeta meta = pallet.getItemMeta();
		meta.setDisplayName("§2§lCỏ tươi");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§5§oNguồn tài nguyên phổ thông");
		lore.add("");
		lore.add("§6§l[Tài nguyên]");
		meta.setLore(lore);
		pallet.setItemMeta(meta);
		return pallet;
	}

	public static ItemStack WOOD() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA" + "6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cm"
						+ "UvNWFlODI2ZTdkYjg0NDdmYmQ2Mjk4OGZlZTBlODNiY"
						+ "mRkNjk0Mzc4YWVmMTJkMjU3MmU5NzVmMDU5YTU0OTkwIn19fQ==");
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6§lGỗ");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fNguồn tài nguyên phổ thông");
		lore.add("");
		lore.add("§6§l[Tài nguyên]");
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack STONE() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0" + "dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L"
						+ "3RleHR1cmUvZGMxNzU0ODUxZTM2N2U4YmViYTJ" + "hNmQ4ZjdjMmZlZGU4N2FlNzkzYWM1NDZiMGYyO"
						+ "TlkNjczMjE1YjI5MyJ9fX0=");
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§7§lĐá");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fNguồn tài nguyên phổ thông");
		lore.add("");
		lore.add("§6§l[Tài nguyên]");
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack FURNACE() {
		ItemStack i = new ItemStack(Material.FURNACE);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§b§lLò nung");
		SimpleItem.addLore(mt, "", "§fNung quặng thành các thỏi tương ứng.", "", HashTag.TYPE_CRAFTING);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack STARTER_PACK_CHEST() {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§l[ §a§lGói Khởi Đầu §f§l]");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fĐặt xuống mở gói hỗ trợ này.");
		lore.add("");
		lore.add("§a§l[Gói hỗ trợ]");
		mt.setLore(lore);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack IRON_CLUSTER() {
		ItemStack item = new ItemStack(Material.IRON_NUGGET);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§f§lQuặng sắt");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fCó thể dùng lò nấu nung ");
		lore.add("§f5 mảnh này lên thành thỏi.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack GOLD_CLUSTER() {
		ItemStack item = new ItemStack(Material.GOLD_NUGGET);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§e§lQuặng vàng");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fCó thể dùng lò nấu nung ");
		lore.add("§f5 mảnh này lên thành thỏi.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack RUBY() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp" + "7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY" + "3JhZnQubmV0L3RleHR1cmUvYj"
						+ "MxNzUyODZjZDNiYTFhM2E5YzkwODI5" + "NzdkMDlkZDM3YjE3N2FiZjM3YTQ2NjU"
						+ "4MGMyN2QxZGVlNzJiM2MxOCJ9fX0=");
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§d§lHồng ngọc");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fMột loại đá quý có sắc");
		lore.add("§fđỏ mịn và đẹp");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack COPPER_CLUSTER() {
		ItemStack item = new ItemStack(Material.CLAY_BALL);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6§lQuặng đồng");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fCó thể dùng lò nấu nung ");
		lore.add("§f5 mảnh này lên thành thỏi.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack DIAMOND() {
		ItemStack item = new ItemStack(Material.DIAMOND);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§b§lKim cương");
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fMột loại hiếm và có giá");
		lore.add("§ftrị cao.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack IRIDIUM_CLUSTER() {
		ItemStack item = new ItemStack(Material.PRISMARINE_SHARD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§5§lQuặng Iriđium");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fMột loại quặng kỳ lạ và bí ẩn");
		lore.add("§fCó thể dùng lò nấu nung");
		lore.add("§f5 mảnh này lên thành thỏi.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack EMERALD() {
		ItemStack item = new ItemStack(Material.EMERALD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§a§lNgọc lục bảo");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fMột viên đá quý với màu");
		lore.add("§fxanh rực rỡ.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack AMETHYST() {
		ItemStack item = new ItemStack(Material.INK_SACK, 1, (byte) 5);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§5§lThạch anh tím");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fMột biến thể màu tím");
		lore.add("§fcủa thạch anh.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack TOPAZ() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7In" + "VybCI6Imh0dHA6Ly90ZXh0dXJlcy5" + "taW5lY3JhZnQubmV0L3RleHR1cmU"
						+ "vZTc0MTJhZTc1YjgyMmNlOWM5YWQ0Y" + "2JhZTg3NTA2MWI2YmYzZGUyMzMzYWI"
						+ "xMzdjODJkNjYxZGQ5YmVmIn19fQ==");
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6§lHoàng ngọc");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fKhá phổ biến nhưng vẫn được");
		lore.add("§fđánh giá cao vì vẻ đẹp của nó.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack CLAM() {
		ItemStack i = new ItemStack(Material.PRISMARINE_CRYSTALS);
		ItemMeta mt = i.getItemMeta();

		mt.setDisplayName("§b§lVỏ sò " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fDường như có ai đó đã từng ở đây...", "", HashTag.OCEAN_ITEM);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack LEEK() {
		ItemStack i = new ItemStack(Material.SUGAR_CANE);
		ItemMeta mt = i.getItemMeta();

		mt.setDisplayName("§f§lTỏi tây" + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMang hương vị đặc trưng của tỏi tây..", "", HashTag.TYPE_WILD_PLANT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack DAFFODIL() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0" + "dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1c"
						+ "mUvOWZlOGRlZDNjNzRlYWNkNzg0MTJhOTAzYjkwNGY1"
						+ "NTc3ODUwZDFlMjBkMzQ4NzhmZDc3NTk3YWQxNjMzYmY3NCJ9fX0=");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lHoa thủy tiên " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài hoa vào mùa xuân, thích", "§fhợp cho việc tặng quà.", "",
				HashTag.TYPE_WILD_PLANT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack CORAL() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0" + "dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1c"
						+ "mUvOWZlOGRlZDNjNzRlYWNkNzg0MTJhOTAzYjkwNGY1"
						+ "NTc3ODUwZDFlMjBkMzQ4NzhmZDc3NTk3YWQxNjMzYmY3NCJ9fX0=");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lSan hô " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loài động vật ăn các sinh vật", "§fphù du dưới biển.", "",
				HashTag.OCEAN_ITEM);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SPRING_ONION() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7I" + "nVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZn"
						+ "QubmV0L3RleHR1cmUvNmNlMDM2Z" + "TMyN2NiOWQ0ZDhmZWYzNjg5N2E4" + "OTYyNGI1ZDliMThmNzA1Mzg0Y"
						+ "2UwZDdlZDFlMWZjN2Y1NiJ9fX0=");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§5§lHành ta " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fNhững củ hành này mọc dại trong suốt", "§fmùa xuân.", "",
				HashTag.TYPE_WILD_PLANT);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack COPPER_PICKAXE() {
		ItemStack i = new ItemStack(Material.WOOD_PICKAXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §6§lCuốc chim đồng §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack COPPER_AXE() {
		ItemStack i = new ItemStack(Material.WOOD_AXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §6§lRìu đồng §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack COPPER_HOE() {
		ItemStack i = new ItemStack(Material.WOOD_HOE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §6§lCuốc đồng §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack IRON_PICKAXE() {
		ItemStack i = new ItemStack(Material.IRON_PICKAXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §f§lCuốc chim sắt §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack IRON_AXE() {
		ItemStack i = new ItemStack(Material.IRON_AXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §f§lRìu sắt §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack IRON_HOE() {
		ItemStack i = new ItemStack(Material.IRON_HOE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §f§lCuốc sắt §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack GOLD_PICKAXE() {
		ItemStack i = new ItemStack(Material.GOLD_PICKAXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §e§lCuốc chim vàng §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack GOLD_AXE() {
		ItemStack i = new ItemStack(Material.GOLD_AXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §e§lRìu vàng §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack GOLD_HOE() {
		ItemStack i = new ItemStack(Material.GOLD_HOE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §e§lCuốc vàng §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack IRIDIUM_PICKAXE() {
		ItemStack i = new ItemStack(Material.DIAMOND_PICKAXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §5§lCuốc chim Iriđium §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack IRIDIUM_AXE() {
		ItemStack i = new ItemStack(Material.DIAMOND_AXE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §5§lRìu Iriđium §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack IRIDIUM_HOE() {
		ItemStack i = new ItemStack(Material.DIAMOND_HOE);
		i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
		ItemMeta mt = i.getItemMeta();
		mt.setUnbreakable(true);
		mt.setDisplayName("§f§l[ §5§lCuốc Iriđium §f§l]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack ACORN() {
		ItemStack i = new ItemStack(Material.SAPLING);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lMầm cây sồi");
		SimpleItem.addLore(mt, "", "§fĐặt xuống đất để trồng cây sồi.", "", HashTag.TYPE_FORAGING);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack DELUXE_SPEED_GROW() {
		ItemStack i = new ItemStack(Material.INK_SACK, 1, (byte) 15);
		i.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§d§lPhân bón tăng trưởng §f§l[§b§l HÀNG HIỆU §f§l]");
		SimpleItem.addLore(mt, "", "§ePhải chuột vào một loại cây trồng", "§eđể kích thích tăng trưởng.", "");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack MAPLE_SEED() {
		ItemStack i = new ItemStack(Material.SAPLING, 1, (byte) 1);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lHạt giống cây phong");
		SimpleItem.addLore(mt, "", "§fĐặt xuống đất để trồng cây phong.", "", HashTag.TYPE_FORAGING);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack COPPER_BAR() {
		ItemStack item = new ItemStack(Material.getMaterial(336));
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6§lThỏi đồng");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fMột thanh đồng nguyên chất.");
		lore.add("");
		lore.add(HashTag.RESOURCES);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack HONEY() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJ" + "TS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlc"
						+ "y5taW5lY3JhZnQubmV0L3RleHR1cmUvY2QyN2I" + "yYmEyZGY1ZDNjNzYyMjBmODViYmZmN2M5NmE4Z"
						+ "TU1MTQ2N2RlZGZmYTdhYWQ5ZDNkNzk0NDk3OGE" + "ifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lMật ong " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột loại siro ngọt được sản", "§fxuất bởi những con ong.", "",
				HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack OMNI_ORE() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0" + "dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3"
						+ "RleHR1cmUvYmRmMDk1MGE4MDdmZGQzNjNlOGNk" + "MWJmZjE3ODIzYjJkMWNhM2E3ZWZiZTM3YWNiNm"
						+ "Q4MDk3NThhMzJkNjYifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§b§lTinh thể Omni");
		SimpleItem.addLore(mt, "", "§fĐem đến chỗ thợ rèn, ông ta sẽ", "§fđập giúp bạn.", "", HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack MAYONNAISE() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJT" + "S0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5"
						+ "taW5lY3JhZnQubmV0L3RleHR1cmUvNjJmZDQ4MW" + "U2OTNmYzgyNTRmZDYyNWI1ZDE2NjMwYTA2YTZmZ"
						+ "GY2MTIwZDA2YjIzNDVlM2U2ZGRiNTE0N2Y5YSJ9" + "fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§lSốt Ma-yo-ne " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fNó nhìn có vẻ đặc sệt.", "", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack MILK_CHEESE() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh" + "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0"
						+ "L3RleHR1cmUvMzZjMDFiZmZlY2ZkYWI2ZDNjM" + "GYxYTdjNmRmNmFhMTkzNmYyYWE3YTUxYjU0YT"
						+ "RkMzIzZTFjYWNiYzUzOSJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lPhô mai " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fChỉ đơn giản là một miếng phô mai.", "", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack OIL() {
		ItemStack item = new ItemStack(Material.POTION);
		PotionMeta mt = (PotionMeta) item.getItemMeta();
		mt.setColor(Color.YELLOW);
		mt.setDisplayName("§e§lDầu thực vật");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fDùng trong hầu hết các món ăn.");
		mt.setLore(lore);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack WINE() {
		ItemStack item = new ItemStack(Material.POTION);
		PotionMeta mt = (PotionMeta) item.getItemMeta();
		mt.setColor(Color.PURPLE);
		mt.setDisplayName("§5§lRượu vang " + HashTag.addQuality());
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fUống cái này có chừng mực.");
		lore.add("");
		lore.add(SimpleItem.isHealth(1));
		lore.add(SimpleItem.isFood(2.5));
		lore.add("");
		lore.add(HashTag.TYPE_PRODUCT);
		mt.setLore(lore);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack JUICE() {
		ItemStack item = new ItemStack(Material.POTION);
		PotionMeta mt = (PotionMeta) item.getItemMeta();
		mt.setColor(Color.GREEN);
		mt.setDisplayName("§a§lNước ép trái cây " + HashTag.addQuality());
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§fĐồ uống ngon và bổ dưỡng.");
		lore.add("");
		lore.add(SimpleItem.isHealth(1.5));
		lore.add(SimpleItem.isFood(2));
		lore.add("");
		lore.add(HashTag.TYPE_PRODUCT);
		mt.setLore(lore);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack BEER() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDA1M2UyNjg2N2JiNTc1MzhlOTc4OTEzN2RiYmI1Mzc3NGUxOGVkYTZmZWY1MWNiMmVkZjQyNmIzNzI2NCJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lBia " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fUống cái này có chừng mực.", "", SimpleItem.isHealth(1), SimpleItem.isFood(2.5),
				"", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack SUNFLOWER() {

		ItemStack item = new ItemStack(Material.DOUBLE_PLANT);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lHoa hướng dương " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột quan niệm sai lầm phổ biến là", "§fhoa luôn quay về hướng mặt trời.", "",
				HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack COFFEE() {

		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVyb" + "CI6Imh0dHA6Ly90ZXh0dXJlcy5taW5l"
						+ "Y3JhZnQubmV0L3RleHR1cmUvN2VhMGY" + "3NzU3MTg1YmU5ZGY1YjJmYzlkODVkND"
						+ "A2NDJlYTRmZGI0NTE1ZjMxNGRhMThmN" + "TljNjk2ZTViZTkifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lCà phê");
		SimpleItem.addLore(mt, "", "§fCó mùi thơm và sảng khoái tinh thần.", "", SimpleItem.isHealth(0.5),
				SimpleItem.isFood(0.5), "", HashTag.TYPE_PRODUCT);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack IRON_BAR() {
		ItemStack item = new ItemStack(Material.IRON_INGOT);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§lThỏi sắt");
		SimpleItem.addLore(mt, "", "§fMột thanh sắt nguyên chất.", "", HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack GOLD_BAR() {
		ItemStack item = new ItemStack(Material.GOLD_INGOT);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lThỏi vàng");
		SimpleItem.addLore(mt, "", "§fMột thanh vàng nguyên chất.", "", HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack IRIDIUM_BAR() {
		ItemStack item = new ItemStack(Material.getMaterial(405));
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§5§lThỏi Iriđium");
		SimpleItem.addLore(mt, "", "§fMột thanh iriđium nguyên chất.", "", HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack CAVE_CARROT() {

		ItemStack item = new ItemStack(Material.CARROT_ITEM);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§3§lCà rốt trong hang");
		SimpleItem.addLore(mt, "", "§fMột loại củ chứa nhiều tinh bột trong",
				"§fhang động. Ăn nó sẽ giúp bạn hoạt động ", "§flâu hơn trong hầm mỏ.", "",
				HashTag.TYPE_FOOD_AND_DRINK);
		item.setItemMeta(mt);
		return item;

	}

	public static ItemStack HARDWOOD() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6" + "Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3R"
						+ "leHR1cmUvZmRlZjFlZjc4ODFkYTQzOWUzM2Z" + "jMTg3MzBjMzkxNWJhY2VlODVjNDEwNWU2OGQ"
						+ "xYjQxMGEyNDk5ZDViYjJkYiJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lGỗ cứng");
		SimpleItem.addLore(mt, "", "§fMột loại gỗ đặc biệt, khá cứng", "§fvà có mùi thơm dịu.", "§6§l[Không thể đặt]");
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack TORCH() {
		ItemStack item = new ItemStack(Material.TORCH);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lĐuốc");
		SimpleItem.addLore(mt, "", "§fCung cấp một lượng ánh sáng", "§fvừa phải", "", HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack WOOD_SIGN() {
		ItemStack item = new ItemStack(Material.SIGN);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§3§lBảng gỗ");
		SimpleItem.addLore(mt, "", "§fGhi chú và đánh dấu những gì", "§fbạn thích", "", HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack COAL() {
		ItemStack item = new ItemStack(Material.COAL);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§7§lThan");
		SimpleItem.addLore(mt, "", "§fMột loại đá dễ cháy rất hữu ích ", "§fcho việc chế tạo và nung.", "",
				HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack CRAB_POT() {
		ItemStack item = new ItemStack(Material.HARD_CLAY, 1, (byte) 14);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lBẫy cua");
		SimpleItem.addLore(mt, "", "§fĐặt sâu dưới nước và bỏ mồi vào, ", "§fchờ đến sáng hôm sau thu hoạch.");
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack BUG_MEAT() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6" + "Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3R"
						+ "leHR1cmUvZmRlZjFlZjc4ODFkYTQzOWUzM2Z" + "jMTg3MzBjMzkxNWJhY2VlODVjNDEwNWU2OGQ"
						+ "xYjQxMGEyNDk5ZDViYjJkYiJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§d§lThịt thối rữa");
		SimpleItem.addLore(mt, "", "§fMột miếng thịt bọ xít ngon ngọt.", "", HashTag.TYPE_MONSTER);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack SOLAR_ESSENCE() {
		ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§e§lTinh thể mặt trời");
		SimpleItem.addLore(mt, "", "§fNó phát sáng và ấm áp khi chạm vào.", "", HashTag.TYPE_MONSTER);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack VOID_ESSENCE() {
		ItemStack item = new ItemStack(Material.NETHER_STAR);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§5§lTinh thể hư không");
		SimpleItem.addLore(mt, "", "§fNó xoay chuyển với năng lượng tối.", "", HashTag.TYPE_MONSTER);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack EARTH_CRYSTAL() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybC" + "I6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3J"
						+ "hZnQubmV0L3RleHR1cmUvYzUyNmZiMGFiZ" + "jAyYWZiZGYyMWYxZGM4OWE4MzI2NWQ2Y2E5MzM"
						+ "2NTQ4ZDUzMThlMmMxYjZjNGUxNjE0YzE5In19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lTinh thể đất");
		SimpleItem.addLore(mt, "", "§fMột tinh thể quý, tìm được ở gần mặt đất.", "", HashTag.RESOURCES);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack MAPLE_SYRUP() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI" + "6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3Jh"
						+ "ZnQubmV0L3RleHR1cmUvNmJlNTRiMjIyN" + "2QxNGE3NjhmNjAwZGQ1MmM2N2U4YmI2M2"
						+ "U5MDdiOWI4MGJhZThkZDg5MGM2NjBiOW" + "YxNjNjYyJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§6§lXi rô cây phong");
		SimpleItem.addLore(mt, "", "§fMột loại sirô ngọt với hương vị độc đáo.", "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack STARTER_FISHING_ROD() {
		ItemStack i = new ItemStack(Material.FISHING_ROD);
		ItemMeta mt = i.getItemMeta();
		mt.spigot().setUnbreakable(true);
		mt.setDisplayName("§6§lCần câu gỗ");
		SimpleItem.addLore(mt, "", "§fMột chiếc cần câu có cán bằng tre.", "", "§a§l[Dụng cụ]");
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack OAK_RESIN() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVy" + "bCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5"
						+ "lY3JhZnQubmV0L3RleHR1cmUvZWJhZmVmMT" + "dlYzA4NWIyMDAyODRjNzU3OTNhM2JjNTk3Z"
						+ "jU1ZGQ4NTI1NzJiMjc0YmE0OGU3MjQwMmY0OTU5OCJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§a§lNhựa cây gỗ sồi");
		SimpleItem.addLore(mt, "", "§fMột chất dính, thơm có nguồn gốc", "§ftừ nhựa cây sồi.", "", HashTag.TYPE_CROPS);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack WILD_PLUM() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5" + "lY3JhZnQubmV0L3RleHR1cmUvYmY3NWZlY"
						+ "2IzNmFiODc0OGM5NDdjMjEzOWEzZDIwZmYy" + "MjMxOTk3ODMwMWEyN2E2ODgzNjQwM2NjNjlhMzNmNiJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§5§lTrái mận dại " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fNgon ngọt với một mùi thơm cay nồng.", "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack BLACKBERRY() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5" + "lY3JhZnQubmV0L3RleHR1cmUvYmY3NWZlY"
						+ "2IzNmFiODc0OGM5NDdjMjEzOWEzZDIwZmYy" + "MjMxOTk3ODMwMWEyN2E2ODgzNjQwM2NjNjlhMzNmNiJ9fX0=");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§9§lViệt quất đen " + HashTag.addQuality());
		SimpleItem.addLore(mt, "", "§fMột món quà đầu mùa thu.", "", HashTag.TYPE_WILD_PLANT);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack FLOUR() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0" + "dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3R"
						+ "leHR1cmUvNjA2YmUyZGYyMTIyMzQ0YmRhNDc5ZmV" + "lY2UzNjVlZTBlOWQ1ZGEyNzZhZmEwZThjZThk"
						+ "ODQ4ZjM3M2RkMTMxIn19fQ==");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§f§lBột mì");
		SimpleItem.addLore(mt, "", "§fMột nguyên liệu nấu ăn phổ biến, được", "§flàm từ lúa mì nghiền cực nhỏ.", "",
				HashTag.TYPE_FOOD_AND_DRINK);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack SLIME() {
		ItemStack item = new ItemStack(Material.SLIME_BALL);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lBóng chất nhờn"));
		SimpleItem.addLore(mt, "", "§fMột quả cầu lung linh,", "§fsền sệt không có mùi.", "", HashTag.TYPE_MONSTER);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack RED_MUSHROOM() {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(item,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh" + "0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0"
						+ "L3RleHR1cmUvNGNlMGEyMzBhY2Q2NDM2YWJjO" + "DZmMTNiZTcyZTliYTk0NTM3ZWU1NGYwMzI1Ym"
						+ "I4NjI1NzdhMWUwNjJmMzcifX19");
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName("§c§lNấm đỏ");
		SimpleItem.addLore(mt, "", "§fMột loại nấm dễ tìm thấy ở mùa", "§fhè hoặc trong hang động.", "",
				HashTag.TYPE_FORAGING);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack JACK_O_LANTERN() {
		ItemStack item = new ItemStack(Material.JACK_O_LANTERN);
		ItemMeta mt = item.getItemMeta();
		mt.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lĐèn bí ngô"));
		SimpleItem.addLore(mt, "", "§fMột thứ tuyệt vời để trang trí vào mùa thu.", "", HashTag.TYPE_FURNITURE);
		item.setItemMeta(mt);
		return item;
	}

	public static ItemStack COCONUT() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.itemWithUrl(i, "531f24d1b5e6cebb65a67ad3b2f3f2fc9ca29fb0737aa62b5d73bf338d2141f5");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lDừa");
		SimpleItem.addLore(mt, "", "§fRớt từ một cây dừa. Dùng nhiều trong", "§fcác nguyên liệu nấu ăn.", "",
				HashTag.TYPE_FORAGING);
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack BED() {
		ItemStack i = new ItemStack(Material.BED);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lGiường ngủ");
		mt.setLore(Arrays.asList("", "§fLàm từ những sợi lông cừu mềm mại.", "", HashTag.TYPE_FURNITURE));
		i.setItemMeta(mt);
		return i;
	}

	public static ItemStack SHIPPING_BIN() {
		ItemStack i = new ItemStack(Material.TRAPPED_CHEST);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§6§lThùng bán đồ");
		mt.setLore(Arrays.asList("", "§fBán đi tất cả những gì bạn không cần,", "§fsau đó thu tiền về.", ""));
		i.setItemMeta(mt);
		return i;
	}

}

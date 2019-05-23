package com.LinhDoraemon.television;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public enum LivingOfTheLand {

	SPRING_ONION, CRANBERRY, BLACKBERRY, INVENTORIES, FISHING, OCEAN_ITEM, BATTERY;

	public static LivingOfTheLand living = FISHING;

	public static LivingOfTheLand getLiving() {
		return living;
	}

	public static void setLiving(LivingOfTheLand living) {
		LivingOfTheLand.living = living;
	}

	private static List<String> LISTS = new ArrayList<>();

	public static void add(Player p) {
		if (LISTS.contains(p.getName()) == false) {
			LISTS.add(p.getName());
		}
	}
	
	public static void reset() {
		LISTS.clear();
	}

	public static void remove(Player p) {
		if(LISTS.contains(p.getName())) {
			LISTS.remove(p.getName());
		}
	}
	
	public static boolean hasWatched(Player p) {
		return LISTS.contains(p.getName());
	}
	
	public static void runLivinOfTheLand(Player p) {

		String LOTL_PREFIX = "§f§l<§a§lNông dân§f§l> §b";

		p.sendTitle("§a§lSống trong thung lũng", "");

		switch (living) {
		case SPRING_ONION:
			// SPRING ONION
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn có biết ? Mùa xuân là mùa của những cây §d§lHành tím §b? Bạn không thể trồng loại cây này được đâu !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn chỉ có thể tìm thấy chúng khi đập cỏ mà thôi ! Kiếm một chút về để đi bán nhé !");
			break;
		case CRANBERRY:
			// CRANBERRY
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn có biết ? Mùa hè là mùa của những cây §d§lViệt quất đỏ §b? Bạn không thể trồng loại cây này được đâu !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn chỉ có thể tìm thấy chúng khi đập cỏ §Bmà thôi ! Kiếm một chút về để đi bán nhé !");
			break;
		case BLACKBERRY:

			// BLACKBERRY
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn có biết ? Mùa thu là mùa của những cây §3§lViệt quất đen §b? Bạn không thể trồng loại cây này được đâu !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn chỉ có thể tìm thấy chúng khi đập cỏ §Bmà thôi ! Kiếm một chút về để đi bán nhé !");
			break;
		case INVENTORIES:

			// INVENTORIES
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Hãy nói về túi đồ nhé ! Bạn có thấy túi đồ của mình bị §cGiới hạn §bkhông ? Việc mở rộng túi đồ sẽ khiến bạn có thêm không gian để chứa những vật phẩm khác đấy !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX + "Để mở rộng túi đồ, liên hệ §6Piere §bnhé ! Giá cả cũng hơi mắc đấy !");
			break;
		case FISHING:
			// FISHING
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn có 1 cái cần câu chưa ? Cần câu mua ở §eCửa hàng cá §bấy ? Nếu chưa có thì bạn nên mua ngay đi !");
			p.sendMessage("");
			p.sendMessage(
					LOTL_PREFIX + "Đi câu để kiếm 1 vài con cá về bán lấy tiền nhé ! §a25đ §b1 con đó, không ít đâu !");
			break;
		case OCEAN_ITEM:

			// OCEAN ITEMS
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Hôm nay hãy nói về một số đồ của biển ! Chúng có thể được tìm thấy khi §6đập cát §b!");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Bạn có thể Kiếm rất nhiều thứ như là cua, ốc sên, vỏ sò, v...v... Kiếm một chút về để đi bán nhé !");
			break;

		case BATTERY:
			// BATTERY
			p.sendMessage(LOTL_PREFIX + "Chào mừng đến với Living of The Land !");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Mùa hè được biết tới là mùa của những cơn mưa sấm sét. Bạn biết đấy, sấm sét là nguồn năng lượng vô cùng lớn. Chúng có thể ép thành những §9Khối pin năng lượng");
			p.sendMessage("");
			p.sendMessage(LOTL_PREFIX
					+ "Lựa chọn một ngày có sấm sét, đặt §e§lCột thu lôi §bra. Đợi khoảng §610 §bgiây. Sét sẽ đánh xuống và cho bạn 1 cục pin. Chú ý là bạn sẽ mất tiêu §e§lCột thu lôi !");
			p.sendMessage("");
			break;
		}

	}

}

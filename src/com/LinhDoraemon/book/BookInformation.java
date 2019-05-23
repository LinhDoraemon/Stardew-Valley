package com.LinhDoraemon.book;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class BookInformation {

	public static ItemStack JOIN_GUIDE() {

		ItemStack i = new ItemStack(Material.WRITTEN_BOOK);
		BookMeta mt = (BookMeta) i.getItemMeta();
		mt.setAuthor("Stardew Valley");
		mt.setTitle("Hướng dẫn cho người chơi");
		List<String> l = new ArrayList<String>();
		l.add(0, "§2§lHướng dẫn cho người chơi mới \n" + "\n" + "§01. Lấy sách chế tạo bằng §6§l/congthuc \n"
				+ "§02. Lệnh về nông trại ? Dùng §1§l/nongtrai\n" + "§03. Nâng cấp công cụ ra chỗ §9§lThợ rèn \n"
				+ "§04. Sử dụng §d§lSÁCH CƯỜNG HÓA §0để nâng \n" + "§0thêm các §5phù phép §0vào vật phẩm");
		l.add("§05. Dùng §c§l/khudathoang §0để ra khu vực trống");
		mt.setPages(l);
		i.setItemMeta(mt);
		return i;

	}

}

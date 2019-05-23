package com.LinhDoraemon.npc;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.LinhDoraemon.Shops.MarnieShop;
import com.LinhDoraemon.Shops.PierreShop;
import com.LinhDoraemon.season.DaysAndTimes;
import com.LinhDoraemon.season.Season;
import com.LinhDoraemon.utils.Messenger;
import com.LinhDoraemon.utils.Time;

public class NPCEvent implements Listener {

	@EventHandler
	public void NPC_EVENT_LISTENER(PlayerInteractEntityEvent e) {

		Player p = e.getPlayer();
		Entity en = e.getRightClicked();

		if (en == null) {
			return;
		}

		String name = en.getCustomName();
		Time time = Time.getPart(en.getWorld());

		if (name.equalsIgnoreCase("§e§lPierre")) {
			
			if (time == Time.NOON || time == Time.AFTERNOON) {
				if (DaysAndTimes.isWedDay()) {
					Messenger.sendActionBar(p, "§c§lKhông mở cửa vào THỨ 4");
				} else {
					switch (Season.getSeason()) {
					case SPRING:
						PierreShop.openPiereSpringShop(p);
						break;
					case SUMMER:
						PierreShop.openPiereSummerShop(p);
						break;
					case FALL:
						PierreShop.openPiereFallShop(p);
						break;
					case WINTER:
						break;
					}
				}
			} else {
				Messenger.sendActionBar(p, "§c§lChỉ mở cửa hàng từ 10:18 - 18:34");
			}
		}

		if (name.equalsIgnoreCase("§6§lMarnie")) {
			if (time == Time.NOON || time == Time.AFTERNOON) {
				MarnieShop.openMarnieShop(p);
			} else {
				Messenger.sendActionBar(p, "§c§lChỉ mở cửa hàng từ 10:18 - 18:34");
			}
		}

		if (name.equals("§a§lNewbie")) {
			p.sendMessage("");
			p.sendMessage("§eChào mừng §a§l" + p.getName() + " §eđã đến với §e§lThung lũng Stardew");
			p.sendMessage("");
			p.sendMessage(
					"§bBạn được ông nội tin tưởng giao phó cho một trang trại ở vùng thung lũng yên bình này ! Hãy cố gắng dùng hết sức lực và trí tuệ của mình để phát triển nên một nông trại vô cùng phồn vinh nhé !");
			p.sendMessage("");
			p.sendMessage("§c§lMột số lệnh cơ bản :");
			p.sendMessage("§a/is : Các lệnh về nông trại");
			p.sendMessage("§a/kit : Nhận gói hỗ trợ người chơi mới bao gồm dụng cụ và 5 hạt giống cải vàng");
			p.sendMessage("§a/thongtin : Xem một số thông tin cần thiết");
			p.sendMessage("");
			return;
		}

	}

}

package com.LinhDoraemon.data;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent.Status;

public class LoadingData implements Listener {

	@EventHandler
	public void loadingdatacuanguoichoi(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		PlayerData.createPlayerData(p.getName());

		e.setJoinMessage("§7[§2+§7] §a§l" + e.getPlayer().getName());
		p.sendTitle("§a§lĐang cài gói tài nguyên...", "");
		p.sendMessage("§eVui lòng chờ để cài đặt gói tài nguyên Stardew Valley của chúng tôi.");
		p.setResourcePack("https://download1510.mediafire.com/8dt2nnhjwrcg/8uautuulrj8obk7/pack.zip");
		p.sendMessage("");
		Bukkit.getScheduler().scheduleAsyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"), new Runnable() {

			@Override
			public void run() {
				p.sendMessage("§eNếu gói tài nguyên không tự động cài, hãy thử cài thủ công bằng cách tải ở đường dẫn sau :");
				p.sendMessage("§bhttps://download1510.mediafire.com/8dt2nnhjwrcg/8uautuulrj8obk7/pack.zip");
			}
			
		}, 2*20);
	}

	@EventHandler
	public void removebaralpha(PlayerQuitEvent e) {

		e.setQuitMessage("§7[§4-§7] §6§l" + e.getPlayer().getName());

	}

	@EventHandler
	public void trangthaicaipack(PlayerResourcePackStatusEvent e) {

		Player p = e.getPlayer();

		if (e.getStatus() == Status.SUCCESSFULLY_LOADED) {
			p.sendTitle("§a§lCÀI ĐẶT THÀNH CÔNG", "§e§lChúc bạn chơi vui vẻ");
			p.sendMessage("§aCài đặt gói tài nguyên thành công. Bạn đã có thể bắt đầu trò chơi.");
			return;
		}

	}

}

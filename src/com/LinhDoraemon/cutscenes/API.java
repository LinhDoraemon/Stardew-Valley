package com.LinhDoraemon.cutscenes;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class API {

	public static void sendMessage(Player p, String msg, int delay) {
		Bukkit.getScheduler().scheduleAsyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						p.sendMessage(msg);

					}

				}, delay * 40);
	}

	public static void playSound(Player p, SoundType type) {
		type.play(p);
		p.sendTitle("", type.getTitle());
	}

	public static void startScenes(Player p) {
		p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 9999, 255));
		p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999, 255));

		p.sendMessage("");
		p.sendMessage("§6§oBạn đang tham gia vào một đoạn hội thoại.");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
	}

	public static void endScenes(Player p, int delay) {
		Bukkit.getScheduler().scheduleAsyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.sendMessage("");
						p.sendMessage("§6§oCuộc hội thoại đã kết thúc.");
						p.sendMessage("");
						p.sendMessage("");
						p.sendMessage("");
						
					}
				}, delay * 40);
	}

}

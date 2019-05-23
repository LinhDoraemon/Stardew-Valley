package com.LinhDoraemon.television;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public enum FortuneTeller {

	NEUTRAL, RATHER_UNLUCK, VERY_UNLUCK, RATHER_LUCK, VERY_LUCK;

	public static FortuneTeller teller = NEUTRAL;

	public static FortuneTeller getTeller() {
		return teller;
	}

	public static void setTeller(FortuneTeller teller) {
		FortuneTeller.teller = teller;
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
	
	public static void runLuckTeller(Player p) {

		String FT_PREFIX = "§f§l<§9§lTiên tri§f§l> §c§l";

		p.sendTitle("§b§lDự báo vận mệnh", "");

		p.sendMessage(
				FT_PREFIX + "Chào mừng bạn đến với 'Dự báo vận mệnh'. Để xem hôm nay thần linh phán gì về bạn nào ?");

		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {

						switch (teller) {
						case NEUTRAL:
							p.sendMessage(FT_PREFIX
									+ "Hừm, thật là hiếm đấy ! Thần linh hôm nay khá là ôn hòa, ngươi sẽ chẳng bị thay đổi gì cả !");

							p.playSound(p.getLocation(), Sound.BLOCK_CLOTH_BREAK, 1, 1);
							break;
						case RATHER_UNLUCK:
							p.sendMessage(FT_PREFIX
									+ "Các linh hồn có phần hơi khó chịu trong ngày hôm nay. May mắn sẽ không mỉm cười với bạn.");
							p.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 9600, 1));
							p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_DEATH, 1, 1);
							break;

						case VERY_UNLUCK:
							p.sendMessage(FT_PREFIX
									+ "Thần linh cực kì không hài lòng với ngày hôm nay. Vận cực kì xui sẽ đeo bám ngươi !");
							p.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 9600, 3));
							p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_SCREAM, 1, 1);
							break;
						case RATHER_LUCK:
							p.sendMessage(FT_PREFIX
									+ "Bữa tiệc tối qua làm các thần linh thấy hài hước ! Ngươi sẽ có 1 chút may mắn");
							p.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 9600, 1));
							p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
							break;

						case VERY_LUCK:
							p.sendMessage(
									FT_PREFIX + "Woa, các linh hồn hôm nay vô cùng hạnh phúc. Họ sẽ phù hộ cho ngươi");
							p.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 9600, 3));
							p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
							break;
						}

					}

				}, 60L);

	}

}

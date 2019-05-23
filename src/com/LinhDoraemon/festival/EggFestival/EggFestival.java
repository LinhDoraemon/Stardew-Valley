package com.LinhDoraemon.festival.EggFestival;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitTask;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.Messenger;

public class EggFestival {
	private static BossBar bar = Bukkit.createBossBar("§b§l🥚 §a§lLỄ HỘI TÌM TRỨNG §7§o(Egg Festival)", BarColor.PINK,
			BarStyle.SEGMENTED_6, BarFlag.PLAY_BOSS_MUSIC);

	public static File file = new File("plugins" + File.separator + "StardewValley" + File.separator + "festival"
			+ File.separator + "EGG_FESTIVAL.yml");
	public static FileConfiguration config = YamlConfiguration.loadConfiguration(file);

	private static HashMap<String, Integer> map = new HashMap<>();

	public static boolean isEggFestival = false;

	public static BossBar getInformationBar() {
		return bar;
	}

	public static void sendMessage(Player p) {
		p.sendMessage("");
		p.sendMessage("§b§l🥚 §a§lLỄ HỘI TÌM TRỨNG §7§o(Egg Festival)");
		p.sendMessage("");
		p.sendMessage("§fNgày hôm nay là lễ hội tìm trứng truyền thống của "
				+ "thung lũng Stardew ! Mỗi 2 phút, một quả trứng sẽ được thả "
				+ "ngẫu nhiên ở thị trấn §6§o(/spawn) §f, bạn chỉ cần đến nhặt"
				+ " về lập tức sẽ nhận được §a+1 điểm lễ hội §f. Sang ngày tiếp "
				+ "theo, ai là người dành được nhiều trứng nhất sẽ được tặng thưởng"
				+ " một phần quà từ thị trưởng §a§lLewis");
		p.sendMessage("");
		p.sendMessage("§6§lTHỜI GIAN : §cNgày 13 mùa xuân hằng năm");
		p.sendMessage("§6§lĐỊA ĐIỂM : §bThị trấn Pelican §6§o(/spawn)");
		p.sendMessage("");
		return;
	}

	public static List<Location> getEggsLocation() {
		return (List<Location>) config.getList("LOCATIONS");
	}

	public static ItemStack getReward() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTFkMmQ1MzI2M2U2MjRlNzU0MjRlZjMzZWQ2OTZkMThlNWNiOTQ2ZmVmZjZhZjgxZDY1YTYxNTQyNDgyMzY0In19fQ==");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lMũ rơm");
		mt.setLore(Arrays.asList("", "§fChỉ kiếm được từ §a§lLễ hội tìm trứng", "", HashTag.TYPE_FESTIVAL));
		i.setItemMeta(mt);
		return i;
	}
	
	public static ItemStack getEgg() {
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTdkYWZmNDIzOWU1NjBmN2Y1M2IxY2NiY2ViYzYxNGYwZGRmMzU4MWE2ZmFkNWJkODE1NjcyOTFlY2Y0NTcxIn19fQ==");
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§e§lTrứng phục sinh");
		mt.setLore(Arrays.asList("", "§fChỉ kiếm được từ §a§lLễ hội tìm trứng", "", HashTag.TYPE_FESTIVAL));
		i.setItemMeta(mt);
		return i;
	}

	public static void updateFestival() {
		Location loc = getEggsLocation().get(new Random().nextInt(getEggsLocation().size()));
		loc.getWorld().dropItemNaturally(loc, getEgg());
		Messenger.sendAllMessages("");
		Messenger.sendAllMessages("§aMột quả trứng vừa rơi ở thị trấn ! Nhanh chóng ra nhặt nào !");
		Messenger.sendAllMessages("");
		Messenger.sendAllMessages("§2§lBẢNG XẾP HẠNG HIỆN TẠI :");
		getTop3();
		Messenger.sendAllMessages("");
		return;
	}

	private static BukkitTask task;

	public static void START() {

		isEggFestival = true;

		for (Player player : Bukkit.getOnlinePlayers()) {
			getInformationBar().addPlayer(player);
			map.put(player.getName(), 0);
		}

		updateFestival();
		
		task = Bukkit.getScheduler().runTaskLaterAsynchronously(Bukkit.getPluginManager().getPlugin("StardewValley"),
				new Runnable() {

					@Override
					public void run() {
						if (isEggFestival == false) {
						} else {
							updateFestival();
						}

					}

				}, 120 * 20);

		
		Bukkit.getScheduler().scheduleAsyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"), new Runnable() {

			@Override
			public void run() {
				task.cancel();
				
				isEggFestival = false;
				
				for (Player p : Bukkit.getOnlinePlayers()) {
					p.sendTitle("§f§l" + getWinner(), "§e§lCHIẾN THẮNG : §a§lLễ hội tìm trứng");
					p.sendMessage("");
					p.sendMessage("§ePhần thưởng của §a§l" + getWinner() + " §alà một chiếc §6§lMũ rơm");
					p.sendMessage("");
				}
				
				map.clear();
				
				Player player = (Player) Bukkit.getOfflinePlayer(UUID.fromString(getWinner()));
				player.getInventory().addItem(getReward());
				player.playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
				
				Messenger.sendAllActionBar("§c§lLỄ HỘI KẾT THÚC !");
				getInformationBar().removeAll();
				return;
			}
			
		}, 10*60*20);
		
	}

	public static String getWinner() {
		Map<String, Integer> TOP = new TreeMap<>(map);
		Set set2 = TOP.entrySet();
		Iterator iterator2 = set2.iterator();
		Map.Entry me2 = (Map.Entry) iterator2.next();
		return (String) me2.getKey();
		/*
		 * if(Bukkit.getOfflinePlayer(UUID.fromString((String)
		 * me2.getKey())).isOnline()) { return
		 * Bukkit.getOfflinePlayer(UUID.fromString((String) me2.getKey())); }
		 */
	}

	public static void getTop3() {
		Map<String, Integer> TOP = new TreeMap<>(map);
		Set set2 = TOP.entrySet();
		Iterator iterator2 = set2.iterator();
		for (int so = 0; so < 3; so++) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			Messenger.sendAllMessages("§a§l" + me2.getKey() + " §7: §e" + me2.getValue() + " điểm lễ hội");
		}
	}

}

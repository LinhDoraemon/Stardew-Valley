package com.LinhDoraemon.energy;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import com.LinhDoraemon.utils.Messenger;

public class EnergyAPI {

	private static HashMap<String, BossBar> manas = new HashMap<>();

	public static BossBar getEnergyBar(Player p) {
		BossBar i = manas.get(p.getName());

		if (i == null) {
			i = Bukkit.createBossBar("§a§l✚ §7[§c" + 100 + "§7/§6100§7]", BarColor.GREEN, BarStyle.SOLID, BarFlag.PLAY_BOSS_MUSIC);
			i.addPlayer(p);
			i.setVisible(true);
			manas.put(p.getName(), i);
		}

		if (i.getPlayers().contains(p)) {
		} else {
			i.addPlayer(p);
		}

		return i;
	}
	
	public static void clear() {
		for(String s : manas.keySet()) {
			manas.get(s).getPlayers().clear();
		}
	}
	
	public static void load() {
		manas.clear();
		for(Player p : Bukkit.getOnlinePlayers()) {
			getEnergyBar(p);
		}
	}
	
	public static boolean hide(Player p) {
		try {
			getEnergyBar(p).getPlayers().remove(p);		
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	public static double getEnergy(Player p) {
		return getEnergyBar(p).getProgress() * 100;
	}

	public static void addEnergy(Player p, double amount) {
		double phanthem = amount / 100;
		getEnergyBar(p).setProgress(getEnergyBar(p).getProgress() + phanthem);
		update(p);
		return;
	}

	public static boolean removeEnergy(Player p, double amount) {
		double phanthem = amount / 100;
		if (getEnergyBar(p).getProgress() > phanthem) {
			getEnergyBar(p).setProgress(getEnergyBar(p).getProgress() - phanthem);
			update(p);
		} else {
			return false;
		}
		return true;
	}

	public static void resetEnergy(Player p) {
		getEnergyBar(p).setProgress(1);
		update(p);
	}

	private static void update(Player p) {
		Double d = new Double(getEnergyBar(p).getProgress() * 100);
		int n = d.intValue();
		getEnergyBar(p).setTitle("§a§l✚ §7[§c" + n + "§7/§6100§7]");
		if (getEnergy(p) > 20) {
			getEnergyBar(p).setColor(BarColor.GREEN);
		}
		if (getEnergy(p) <= 20) {
			getEnergyBar(p).setColor(BarColor.RED);
			Messenger.sendActionBar(p, "§7§lCHÚ Ý : §2Năng lượng của bạn sắp hết, vui lòng bổ sung !");
		}
	}

}

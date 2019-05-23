package com.LinhDoraemon.season;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.utils.TimeConvert;

public class InfoScoreboard implements Listener {
	@EventHandler
	public void taobangchonguoichoihihi(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		Bukkit.getServer().getScheduler()
				.scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("StardewValley"), new Runnable() {
					public void run() {
						ScoreboardManager manager = Bukkit.getScoreboardManager();

						Scoreboard board = manager.getNewScoreboard();

						Objective objective = board.registerNewObjective("stardewboard", "dummy");
						objective.setDisplaySlot(DisplaySlot.SIDEBAR);

						objective.setDisplayName("§6§lSTAR§e§lDEW VA§f§lLLEY");
						Score score = objective.getScore("§a§l● Tên người chơi :");
						score.setScore(10);

						Score score1 = objective.getScore("§f§l§o" + p.getName());
						score1.setScore(9);

						Score score2 = objective.getScore("§a§l● Tài sản :");
						score2.setScore(8);

						Score score3 = objective
								.getScore(PlayerData.getPlayerMoney(p.getName()) + "§6§lⒼ §7/§b0 points");
						score3.setScore(7);

						Score score4 = objective.getScore("§a§l● Thời gian :");
						score4.setScore(6);

						Score score5 = objective
								.getScore("§e§l" + DaysAndTimes.getThu() + " §7- §b§l" + DaysAndTimes.currentDay());
						score5.setScore(5);

						Score score6 = objective
								.getScore("§c§l" + TimeConvert.MCTime(p.getWorld().getTime())
										+ " §7- §e§l" + DaysAndTimes.currentSeason());
						score6.setScore(4);

						Score score7 = objective.getScore("§a§l● TPS :");
						score7.setScore(3);

						Score score8 = objective.getScore("§720.0");
						score8.setScore(2);

						Score score9 = objective.getScore("§a§l● Group :");
						score9.setScore(1);

						Score score10 = objective.getScore("§ffb.com/groups/textserver");
						score10.setScore(0);

						p.setScoreboard(board);
					}
				}, 60L, 60L);

	}

}

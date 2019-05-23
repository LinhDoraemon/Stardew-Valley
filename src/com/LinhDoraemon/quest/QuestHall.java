package com.LinhDoraemon.quest;

import java.util.Arrays;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuestHall implements Listener {

	private static Inventory QUEST_HALL = Bukkit.createInventory(null, 27, "§0§lNhiệm vụ hằng ngày >>");

	public static QuestManager quest = new QuestManager().getQuest("Khởi đầu");

	public static void setRandomQuest() {
		Random rand = new Random();
		QuestManager q = new QuestManager().getQuest(QuestManager.QUESTS.get(rand.nextInt(QuestManager.QUESTS.size())));
		quest = q;
	}
	
	public static Inventory update() {

		ItemStack i = new ItemStack(Material.BOOK);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§a§lNHIỆM VỤ HÔM NAY");
		mt.setLore(Arrays.asList("", "§6• §6§lTên nhiệm vụ : §b§l§o" + quest.getName(), "§6• §6§lVật phẩm yêu cầu : " + quest.getRequire(),
				"§6• §6§lTiền thưởng : §e§l" + quest.getRewardMoney() + "G", ""));
		i.setItemMeta(mt);
		
		ItemStack accept = new ItemStack(Material.WOOL, 1, (byte) DyeColor.LIME.getWoolData());
		ItemMeta acc_mt = accept.getItemMeta();
		acc_mt.setDisplayName("§2§lCHẤP NHẬN");
		acc_mt.setLore(Arrays.asList("", "§fĐồng ý làm nhiệm vụ §6§l" + quest.getName(), ""));
		accept.setItemMeta(acc_mt);
		
		ItemStack deny = new ItemStack(Material.WOOL, 1, (byte) DyeColor.RED.getWoolData());
		ItemMeta dn_mt = deny.getItemMeta();
		dn_mt.setDisplayName("§c§lTỪ CHỐI");
		dn_mt.setLore(Arrays.asList("", "§fTừ chối nhiệm vụ §6§l" + quest.getName()));
		deny.setItemMeta(dn_mt);
		
		QUEST_HALL.setItem(4, i);
		QUEST_HALL.setItem(12, accept);
		QUEST_HALL.setItem(14, deny);
		
		for(int so = 0; so < QUEST_HALL.getSize(); so++) {
			if(QUEST_HALL.getItem(so) == null) {
				QUEST_HALL.setItem(so, new ItemStack(Material.STAINED_GLASS_PANE));
			}
		}
		
		return QUEST_HALL;
	}

	@EventHandler
	public void OPEN_QUEST_WALL(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.STONE_BUTTON) {
			return;
		}

		Location loc = new Location(Bukkit.getWorld("world"), -718, 4, 1093);

		if (b.getLocation().equals(loc)) {
			p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1, 1);
			p.openInventory(QUEST_HALL);
			return;
		}

	}
	
	@EventHandler
	public void CLICK_QUEST_HALL(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();
		
		if(i == null) {
			return;
		}
		
		if(e.getClickedInventory().getTitle() != QUEST_HALL.getTitle()) {
			return;
		}
	
		if(i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}
		
		e.setCancelled(true);
		
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§2§lCHẤP NHẬN")) {
			QuestStatus.addQuests(p, quest);
			p.closeInventory();
			p.sendTitle("§6§l" + quest.getName(), "§c§lĐÃ NHẬN NHIỆM VỤ");
			p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HARP, 1, 1);
			p.sendMessage("");
			p.sendMessage("§a• §a§lTên nhiệm vụ : §6§l§o" + quest.getName());
			p.sendMessage("§a• §a§lLoại nhiệm vụ : §d§l" + quest.getType().toString() + "§7§o (" + quest.getType().getName()
					+ "§7§o)");
			p.sendMessage("§a• §a§lVật phẩm yêu cầu : " + quest.getRequire());
			p.sendMessage("§a• §a§lPhần thưởng : §e§l" + quest.getRewardMoney() + "G");
			p.sendMessage("§a• §a§lChi tiết :");
			p.sendMessage("");
			for (String s : quest.getContent()) {
				p.sendMessage("§f" + s);
			}
			p.sendMessage("");
			p.sendMessage("§6§oShift-click vào biểu tượng của nhiệm vụ này trong GUI để "
					+ "hoàn thành nếu bạn đã có sẵn vật phẩm yêu cầu §6§o§lđang cầm sẵn trên tay !");
			p.sendMessage("");
			return;
		}
		
		if(i.getItemMeta().getDisplayName().equals("§c§lTỪ CHỐI")) {
			p.closeInventory();
			return;
		}
	}
	
	

}

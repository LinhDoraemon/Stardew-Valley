package com.LinhDoraemon.quest;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.data.PlayerData;
import com.LinhDoraemon.utils.Messenger;

public class QuestEvent implements Listener {

	@EventHandler
	public void PLAYER_QUESTING_EVENT(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getName().equalsIgnoreCase("§0§lNHIỆM VỤ") == false) {
			return;
		}

		if (i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}

		if (i.getType() != Material.JUKEBOX) {
			return;
		}

		e.setCancelled(true);
		
		if (e.getClick() == ClickType.LEFT) {
			e.setCancelled(true);
			p.closeInventory();

			String name = i.getItemMeta().getDisplayName();
			QuestManager q = new QuestManager().getQuest(name);

			p.sendMessage("");
			p.sendMessage("§a• §a§lTên nhiệm vụ : §6§l§o" + name);
			p.sendMessage("§a• §a§lLoại nhiệm vụ : §d§l" + q.getType().toString() + "§7§o (" + q.getType().getName()
					+ "§7§o)");
			p.sendMessage("§a• §a§lVật phẩm yêu cầu : " + q.getRequire());
			p.sendMessage("§a• §a§lPhần thưởng : §e§l" + q.getRewardMoney() + "G");
			p.sendMessage("§a• §a§lChi tiết :");
			p.sendMessage("");
			for (String s : q.getContent()) {
				p.sendMessage("§f" + s);
			}
			p.sendMessage("");
			p.sendMessage("§6§oShift-click vào biểu tượng của nhiệm vụ này trong GUI để "
					+ "hoàn thành nếu bạn đã có sẵn vật phẩm yêu cầu §6§o§lđang cầm sẵn trên tay !");
			p.sendMessage("");
			return;
		}

		if (e.getClick() == ClickType.SHIFT_LEFT) {
			e.setCancelled(true);

			String name = i.getItemMeta().getDisplayName();
			QuestManager q = new QuestManager().getQuest(name);

			if (check(p, q.getRequire())) {
				if (getname(p, q.getRequire()).getAmount() > 1) {
					p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
				} else {
					p.getInventory().removeItem(getname(p, q.getRequire()));
				}
				p.closeInventory();
				p.sendTitle("§6§l" + q.getName(), "§a§lHOÀN THÀNH NHIỆM VỤ");
				p.sendMessage("");
				p.sendMessage("§aChúc mừng bạn vừa hoàn thành nhiệm vụ §6§l" + q.getName()
						+ " §a! Phần thưởng của bạn là §e§l" + q.getRewardMoney() + "G");
				p.sendMessage("");
				Messenger.sendAllMessages("§8§l<§c§lNhiệm vụ§8§l> §bNgười chơi §a§l" + p.getName()
						+ " §bvừa hoàn thành nhiệm vụ §6§l" + q.getName());
				PlayerData.addPlayerMoney(p.getName(), q.getRewardMoney());
				QuestStatus.removeQuests(p, q);
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
			} else {
				p.closeInventory();
				p.sendMessage("§c§lBạn chưa có vật phẩm yêu cầu trên tay ! Đó là " + q.getRequire() + " §7(x1)");
				return;
			}

			return;
		}

	}

	private ItemStack getname(Player p, String name) {
		ItemStack i = p.getInventory().getItemInMainHand();
		if (i.hasItemMeta() && i.getItemMeta().hasDisplayName() && i.getItemMeta().getDisplayName().startsWith(name)) {
			return i;
		}
		return null;
	}

	private boolean check(Player p, String name) {
		ItemStack i = p.getInventory().getItemInMainHand();
		if (i.hasItemMeta() && i.getItemMeta().hasDisplayName() && i.getItemMeta().getDisplayName().startsWith(name)) {
			return true;
		}
		return false;
	}

}

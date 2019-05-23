package com.LinhDoraemon.KitPack;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class OpenPackListener implements Listener {

	@EventHandler
	public void openPackListener(BlockPlaceEvent e) {

		Player p = e.getPlayer();
		ItemStack i = e.getItemInHand();

		if (i != null && i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null && i.getItemMeta()
				.getDisplayName().equals(StardewItems.STARTER_PACK_CHEST().getItemMeta().getDisplayName())) {
			if (StarterPack.data.contains(p.getName()) == false) {
				e.setCancelled(true);
				p.getInventory().getItemInMainHand().setType(Material.AIR);
				StarterPack.openStarterPack(p);
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 2, 2);
				p.getInventory().setItemInMainHand(null);
			} else {
				e.setCancelled(true);
				p.sendMessage("§c§lBạn đã mở gói hỗ trợ này rồi ! Nếu nghĩ đây là lỗi ? Liên hệ admin");
			}
			return;
		} else {
			e.setCancelled(true);
			return;
		}

	}

}

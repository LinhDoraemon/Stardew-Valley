package com.LinhDoraemon.antithings;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.wiki.WikiGUI;

public class AntiDropItem implements Listener {

	@EventHandler
	public void khinguoichoiquangitemra(PlayerDropItemEvent e) {

		ItemStack i = e.getItemDrop().getItemStack();

		if (i == null) {
			return;
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(WikiGUI.CRAFTING_ITEM().getItemMeta().getDisplayName())) {
			e.setCancelled(true);
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(WikiGUI.QUEST().getItemMeta().getDisplayName())) {
			e.setCancelled(true);
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equals(WikiGUI.WIKI_ITEM().getItemMeta().getDisplayName())) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void interactuseshovel(PlayerInteractEvent e) {
		ItemStack i = e.getPlayer().getInventory().getItemInMainHand();

		if (i == null) {
			return;
		}

		if (i.getType() == Material.STONE_SPADE && e.getClickedBlock().getType() == Material.GRASS) {
			e.setCancelled(true);
			return;
		}
	}

}

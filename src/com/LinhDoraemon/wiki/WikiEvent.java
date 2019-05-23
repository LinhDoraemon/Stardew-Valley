package com.LinhDoraemon.wiki;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.crafting.CraftingManager;
import com.LinhDoraemon.quest.QuestStatus;

public class WikiEvent implements Listener {

	@EventHandler
	public void PLAYER_OPEN_WIKI(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		p.getInventory().setItem(17, WikiGUI.WIKI_ITEM());
		p.getInventory().setItem(16, WikiGUI.CRAFTING_ITEM());
		p.getInventory().setItem(15, WikiGUI.QUEST());
		
	}
	
	@EventHandler
	public void ON_WIKI_EVENT(InventoryClickEvent e) {
		
		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();
		
		if(i == null) {
			return;
		}
		
		if(e.getClickedInventory().getName().equalsIgnoreCase("§0§lCá trong mùa này")) {
			e.setCancelled(true);
		}
		
		if(e.getClickedInventory().getName().equalsIgnoreCase("§0§lCây trồng trong mùa này")) {
			e.setCancelled(true);
		}
		
		if(e.getClickedInventory().getName() != "§0§lWIKI HỖ TRỢ") {
			return;
		}
		
		e.setCancelled(true);
		
		if(i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}
		
		if(i.getItemMeta().getDisplayName().startsWith("§e§lCá trong mùa §a§l")) {
			WikiGUI.openFishWIKI(p);
			p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
			return;
		}
		
		if(i.getItemMeta().getDisplayName().startsWith("§e§lHạt giống trong mùa §a§l")) {
			WikiGUI.openCropWIKI(p);
			p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
			return;
		}
		
	}
	
	@EventHandler
	public void OPEN_WIKI_EVENT(InventoryClickEvent e) {
		
		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();
		
		if(i == null) {
			return;
		}
		
		if(i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}
		
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§c§lWIKI HỖ TRỢ")) {
			e.setCancelled(true);
			WikiGUI.openWikiGUI(p);
		}
		
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§6§lCHẾ TẠO")) {
			e.setCancelled(true);
			CraftingManager.openCrafting(p);
		}
		
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§a§lNHIỆM VỤ")) {
			e.setCancelled(true);
			p.openInventory(QuestStatus.getQuestsGUI(p));
		}
		
	}
	
}

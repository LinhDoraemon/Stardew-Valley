package com.LinhDoraemon.quest;

import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuestStatus {

	private static HashMap<String, Inventory> QUEST_DATA = new HashMap<>(); 
	
	public static Inventory getQuestsGUI(Player p) {
		Inventory i = QUEST_DATA.get(p.getName());
		
		if(i == null) {
			i = Bukkit.createInventory(null, 54, "§0§lNHIỆM VỤ");
			QUEST_DATA.put(p.getName(), i);
		}
		
		return i;
	}
	
	public static void addQuests(Player p, QuestManager quest) {
		getQuestsGUI(p);
		getQuestsGUI(p).addItem(quest(quest));
	}
	
	public static void removeQuests(Player p, QuestManager quest) {
		getQuestsGUI(p).removeItem(quest(quest));
	}

	private static ItemStack quest(QuestManager quest) {
		ItemStack i = new ItemStack(Material.JUKEBOX);
		i.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName(quest.getName());
		mt.setLore(Arrays.asList("", "§aClick để xem thông tin chi tiết", "§avề nhiệm vụ này !", "", "§6§oShift-click để hoàn thành nhiệm vụ"));
		i.setItemMeta(mt);
		return i;
	}
	
	
	
}

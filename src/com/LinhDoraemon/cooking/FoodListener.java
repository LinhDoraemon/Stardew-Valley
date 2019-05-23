package com.LinhDoraemon.cooking;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class FoodListener implements Listener {

	@EventHandler
	public void PLAYER_OPEN_KITCHEN_EVENT(PlayerInteractEvent e) {

		Block b = e.getClickedBlock();
		Player p = e.getPlayer();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.DISPENSER) {
			return;
		}

		e.setCancelled(true);
		p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 8, 8);
		p.openInventory(FoodGUI.getCookGUI(p));
	}
	
	@EventHandler
	public void PLAYER_OPEN_FOOD_RECIPE(InventoryClickEvent e) {
		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();

		if (i == null) {
			return;
		}

		if (!(e.getClickedInventory().getTitle() == "§0§lNấu ăn")) {
			return;
		}

		e.setCancelled(true);
		
		if(i.hasItemMeta() && i.getItemMeta().hasDisplayName() &&
				i.getItemMeta().getDisplayName().equals("§eQuay về trang trước")) {
			p.closeInventory();
			p.openInventory(FoodGUI.getRecipeChooseGUI());
			p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
			return;
		}
	}

	@EventHandler
	public void PLAYER_CHON_CONG_THUC(InventoryClickEvent e) {
		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();

		if (i == null) {
			return;
		}

		if (!(e.getClickedInventory().getTitle() == "§0§lCông thức nấu ăn")) {
			return;
		}

		e.setCancelled(true);
		
		p.openInventory(FoodGUI.getRecipeCookGUI(p, FoodRecipes.getRecipe(i.getItemMeta().getDisplayName())));
		p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
		return;
	}
	
	@EventHandler
	public void PLAYER_COOK_ITEMS_EVENT(InventoryClickEvent e) {

		ItemStack i = e.getCurrentItem();
		Player p = (Player) e.getWhoClicked();

		if (i == null) {
			return;
		}

		if (!(e.getClickedInventory().getTitle() == "§0§lNhà bếp")) {
			return;
		}

		if (i.getType() == Material.STAINED_GLASS_PANE || i.getType() == Material.REDSTONE || i.getType() == Material.BOOK) {

			e.setCancelled(true);

			if(i.getType() == Material.BOOK) {
				p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
				p.openInventory(FoodGUI.getRecipeChooseGUI());
				return;
			}
			
			if (i.getType() == Material.REDSTONE) {
				for (FoodRecipes rc : FoodRecipes.values()) {
					if (rc.isShaped(e.getClickedInventory())) {
						rc.removeAllIngredients(e.getClickedInventory());
						e.getClickedInventory().setItem(16, rc.getItemStack());
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
						return;
					}
				}

				p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1, 1);
				p.sendMessage(
						"§cKhông có công thức nấu ăn nào như thế này cả !");
				return;
			}
		}
	}

}

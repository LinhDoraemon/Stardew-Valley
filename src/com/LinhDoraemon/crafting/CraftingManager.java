package com.LinhDoraemon.crafting;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.utils.Messenger;

public class CraftingManager implements Listener {

	private static Inventory CRAFTING = Bukkit.createInventory(null, 54, "§0§lChế tạo >>");

	public static void openCrafting(Player player) {
		CRAFTING.clear();
		for (RecipeType r : RecipeType.values()) {
			CRAFTING.addItem(r.getResult());
		}
		player.openInventory(CRAFTING);
	}

	@EventHandler
	public void CRAFTING_MANAGER_EVENT(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		ItemStack i = e.getCurrentItem();

		if (i == null) {
			return;
		}

		if (e.getClickedInventory().getName().equals(CRAFTING.getTitle()) == false) {
			return;
		}

		if (i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}

		e.setCancelled(true);

		RecipeType c = RecipeType.getByResultName(i);

		if (c.hasEnough(p)) {
			c.removeItems(p);
			p.getInventory().addItem(c.getResult());
			p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			Messenger.sendActionBar(p, "§a§lChế tạo thành công " + c.getResult().getItemMeta().getDisplayName());
			return;
		} else {
			p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 2, 2);
			p.sendMessage("§c§lBạn chưa đủ nguyên liệu ! " + c.getResult().getItemMeta().getDisplayName()
					+ " §c§lcần các nguyên liệu sau :");
			for (Crafts craft : c.getIngredients()) {
				p.sendMessage("§c- " + craft.getDisplayName() + " §7(x" + craft.getAmount() + ")");
			}
			return;
		}
	}
}

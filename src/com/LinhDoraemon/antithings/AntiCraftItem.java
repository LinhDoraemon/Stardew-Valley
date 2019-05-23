package com.LinhDoraemon.antithings;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class AntiCraftItem implements Listener {

	@EventHandler
	public void anticraft(CraftItemEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void PREVENT_ANIMALS_FROM_GET_ITEM(ItemSpawnEvent e) {
		Item item = e.getEntity();

		if (item == null) {
			return;
		}

		ItemStack i = item.getItemStack();
		Location loc = e.getLocation().getBlock().getRelative(BlockFace.UP).getLocation();

		if (i.getItemMeta() != null || i.getItemMeta().getDisplayName() != null) {
			return;
		}

		if (i.getType() == Material.EGG) {
			e.setCancelled(true);
			loc.getWorld().dropItemNaturally(loc, StardewItems.EGG());
			return;
		}

		if (i.getType() == Material.WOOL) {
			e.setCancelled(true);
			loc.getWorld().dropItemNaturally(loc, StardewItems.WOOL());
			return;
		}
	}

	@EventHandler
	public void nganchanxaicommandme(PlayerCommandPreprocessEvent e) {

		Player p = e.getPlayer();

		if (e.getMessage().equals("me")) {
			e.setCancelled(true);
			p.kickPlayer("§e§lSTARDEW §6§lVALLEY \n §f§lBạn không được phép xài lệnh này ở máy chủ !");
			return;
		}

	}

	@EventHandler
	public void nganchanuongsua(PlayerItemConsumeEvent e) {
		ItemStack i = e.getItem();

		if (i == null) {
			return;
		}

		if (i.getType() == Material.MILK_BUCKET) {
			e.setCancelled(true);
			int am = i.getAmount();
			i.setAmount(am - 1);

			if (e.getPlayer().getHealth() > 18) {
				e.getPlayer().setHealth(20);
			} else {
				e.getPlayer().setHealth(e.getPlayer().getHealth() + 2);
			}

			e.getPlayer().setFoodLevel(e.getPlayer().getFoodLevel() + 1);
		}
	}

	@EventHandler
	public void nganchannemtrung(ProjectileLaunchEvent e) {

		if (e.getEntity() == null) {
			return;
		}

		if (e.getEntityType() == org.bukkit.entity.EntityType.EGG) {
			e.setCancelled(true);
		}
	}

}

package com.LinhDoraemon.antithings;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import com.LinhDoraemon.machines.StardewMachines;
import com.LinhDoraemon.utils.HashTag;

public class AntiPlaceBlock implements Listener {

	@EventHandler
	public void antiplaceblock(BlockPlaceEvent e) {

		Player p = e.getPlayer();
		Block b = e.getBlock();

		if (b.getType() == Material.LONG_GRASS) {
			e.setCancelled(true);
		}

		if(b.getType() == Material.SUGAR_CANE_BLOCK) {
			e.setCancelled(true);
		}
		
		if (b.getType() == Material.WOOL) {
			if (b.getData() == 0) {
				e.setCancelled(true);
				return;
			}
		}

		if (b.getType() == Material.SKULL) {

			if (p.getGameMode() != GameMode.CREATIVE) {
				if (p.getItemInHand() != null && p.getItemInHand().getItemMeta() != null
						&& ((p.getItemInHand().getItemMeta().getLore() != null
								&& (p.getItemInHand().getItemMeta().getLore().contains(HashTag.TYPE_FURNITURE)
										|| p.getItemInHand().getItemMeta().getLore().contains("§e§l[Thú nuôi]")))
								|| (p.getItemInHand().getItemMeta().getDisplayName() != null
										&& p.getItemInHand().getItemMeta().getDisplayName()
												.equals(StardewMachines.TAPPER.getDisplayName())))) {

				} else {
					e.setCancelled(true);
					return;
				}
			}

		}

	}

}

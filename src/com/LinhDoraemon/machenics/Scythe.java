package com.LinhDoraemon.machenics;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.antithings.AntiBreakBlock;

public class Scythe implements Listener {

	@EventHandler
	public void BREAK_WITH_SCYTHE(BlockBreakEvent e) {
		Block b = e.getBlock();
		ItemStack i = e.getPlayer().getInventory().getItemInMainHand();

		if (b== null || i == null) {
			return;
		}

		if (b.getType() != Material.LONG_GRASS) {
			return;
		}

		if (i.hasItemMeta() == false || i.getItemMeta().hasDisplayName() == false) {
			return;
		}

		if (i.getType() == Material.STONE_SPADE) {
			Block block;
			for (int xOff = -1; xOff <= 1; ++xOff) {
				for (int yOff = -1; yOff <= 1; ++yOff) {
					for (int zOff = -1; zOff <= 1; ++zOff) {
						block = b.getRelative(xOff, yOff, zOff);
						if (block.getType() == Material.LONG_GRASS) {
							block.breakNaturally();
							block.getWorld().playEffect(block.getLocation(), Effect.STEP_SOUND, Material.LONG_GRASS);
							AntiBreakBlock.check(block);
						}
					}
				}
			}
		}
	}

}

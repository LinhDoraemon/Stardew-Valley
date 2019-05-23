package com.LinhDoraemon.machenics;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.LinhDoraemon.ocean.OceanItems;

public class DropThings implements Listener {

	@EventHandler
	public void DROP_THING_LISTENER_SAND(BlockBreakEvent e) {

		Block b = e.getBlock();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.SAND) {
			return;
		}

		Location loc = b.getRelative(BlockFace.UP).getLocation();

		Random rand = new Random();
		int so = rand.nextInt(40) + 1;

		if (so == 15) {
			loc.getWorld().dropItemNaturally(loc, OceanItems.getRandomItem());
			e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			return;
		}

	}

}

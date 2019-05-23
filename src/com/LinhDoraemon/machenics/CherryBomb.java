package com.LinhDoraemon.machenics;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.LinhDoraemon.utils.CSkull;
import com.LinhDoraemon.utils.HashTag;
import com.LinhDoraemon.utils.SimpleItem;

public class CherryBomb implements Listener {

	public static ItemStack CHERRY_BOMB() {

		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		CSkull.skullWithBase64(i,
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InV" + "ybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3"
						+ "RleHR1cmUvMWY1MzU0Y2EyZWUxYjhmZGM5NTViYjQzN2JiM"
						+ "jYxOTU3NWZjNzk4M2YzNjlhZmEzYTFmN2QxYjk3NTY3ZWE4In19fQ==");

		ItemMeta mt = i.getItemMeta();
		mt.setDisplayName("§c§lBomb Cherry");
		SimpleItem.addLore(mt, "", "§fTạo ra vùng nổ nhỏ ! Lùi lại đi !", "", HashTag.TYPE_CRAFTING);
		i.setItemMeta(mt);
		return i;

	}

	@EventHandler
	public void datcherrybombxuongdiem(BlockPlaceEvent e) {

		Block b = e.getBlock();
		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();

		if (b == null || i == null) {
			return;
		}

		if (b.getType() != Material.SKULL) {
			return;
		}

		if (i.hasItemMeta() && i.getItemMeta().hasDisplayName()
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase("§c§lBomb Cherry")) {

			Location loc = b.getLocation();

			e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_TNT_PRIMED, 1, 1);

			Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("StardewValley"),
					new Runnable() {

						@Override
						public void run() {
							b.setType(Material.AIR);
							b.getWorld().createExplosion(loc, 1f);
						}

					}, 60L);

		} else {
			return;
		}

	}

}

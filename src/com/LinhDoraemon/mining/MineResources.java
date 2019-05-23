package com.LinhDoraemon.mining;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

public class MineResources implements Listener {

	@EventHandler
	public void MINING_ORE_CORE_EVENT(ItemSpawnEvent e) {
		Item item = e.getEntity();
	
		if (item == null) {
			return;
		}

		ItemStack i = item.getItemStack();
		
		if (i.getType() == Material.COAL_ORE) {
			item.setItemStack(StardewItems.COAL());
			return;
		}
		
		if (i.getType() == Material.COAL) {
			item.setItemStack(StardewItems.COAL());
			return;
		}
		if (i.getType() == Material.IRON_ORE) {
			item.setItemStack(StardewItems.IRON_CLUSTER());
			return;
		}
		if (i.getType() == Material.GOLD_ORE) {
			item.setItemStack(StardewItems.GOLD_CLUSTER());
			return;
		}
		
	}

	@EventHandler
	public void CHANGE_ORE_DROP_LISTENER(BlockBreakEvent e) {

		Block i = e.getBlock();

		if (i == null) {
			return;
		}

		Location loc = i.getLocation();

		if (i.getType() == Material.LAPIS_ORE) {
			e.setCancelled(true);
			i.setType(Material.AIR);
			loc.getWorld().dropItemNaturally(loc, StardewItems.AQUAMARINE());
			return;
		}
		if (i.getType() == Material.EMERALD_ORE) {
			e.setCancelled(true);
			i.setType(Material.AIR);
			loc.getWorld().dropItemNaturally(loc, StardewItems.EMERALD());
			return;
		}
		if (i.getType() == Material.DIAMOND_ORE) {
			e.setCancelled(true);
			i.setType(Material.AIR);
			loc.getWorld().dropItemNaturally(loc, StardewItems.DIAMOND());
			return;
		}
		if (i.getType() == Material.REDSTONE_ORE) {
			e.setCancelled(true);
			i.setType(Material.AIR);
			loc.getWorld().dropItemNaturally(loc, StardewItems.RUBY());
			return;
		}

	}

	@EventHandler
	public void RESOURCE_DROP_LISTENER(BlockBreakEvent e) {

		Block b = e.getBlock();
		Player p = e.getPlayer();

		if (b == null) {
			return;
		}

		if (b.getType() == Material.STONE) {

			Random rand = new Random();
			int so = rand.nextInt(250) + 1;

			switch (so) {
			case 5:
				p.getInventory().addItem(StardewItems.AMETHYST());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.AMETHYST().getItemMeta().getDisplayName());
				break;
			case 15:
				p.getInventory().addItem(StardewItems.AQUAMARINE());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.AQUAMARINE().getItemMeta().getDisplayName());
				break;
			case 25:
				p.getInventory().addItem(StardewItems.RUBY());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.RUBY().getItemMeta().getDisplayName());
				break;
			case 35:
				p.getInventory().addItem(StardewItems.TOPAZ());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.TOPAZ().getItemMeta().getDisplayName());
				break;
			case 45:
				p.getInventory().addItem(StardewItems.QUARTZ());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.QUARTZ().getItemMeta().getDisplayName());
				break;
			case 46:
				p.getInventory().addItem(StardewItems.EARTH_CRYSTAL());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.EARTH_CRYSTAL().getItemMeta().getDisplayName());
				break;
			case 47:
				p.getInventory().addItem(StardewItems.OMNI_ORE());
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
				p.sendMessage("§aBạn vừa đào được " + StardewItems.OMNI_ORE().getItemMeta().getDisplayName());
				break;
			default:
				break;
			}
			return;
		}

		if (b.getType().toString().toLowerCase().contains("ore")) {
			Random rand = new Random();
			int soo = rand.nextInt(20);
			switch (soo) {
			case 5:
			case 6:
			case 7:
				b.getLocation().getWorld().dropItemNaturally(b.getRelative(BlockFace.UP).getLocation(),
						StardewItems.COPPER_CLUSTER());
				break;

			default:
				break;
			}
		}
	}

	public static void drop(Location loc, ItemStack item, int max) {
		Random rand = new Random();
		int so = rand.nextInt(max) + 1;

		for (int i = 0; i < so; i++) {
			loc.getWorld().dropItemNaturally(loc, item);
		}

	}

}

package com.LinhDoraemon.ring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;

public class RingListener implements Listener {

	public static List<Player> getMagetedPlayers = new ArrayList<Player>();

	
	@EventHandler
	public void iridiumbanduse(PlayerToggleSneakEvent e) {

		Player p = e.getPlayer();

		World world = p.getWorld();

		for (Iterator i$ = Bukkit.getServer().getWorlds().iterator(); i$.hasNext();) {
			world = (World) i$.next();
			for (Entity entity : world.getEntities()) {
				if ((entity instanceof Item)) {
					Item item = (Item) entity;
					ItemStack stack = item.getItemStack();
					Location location = item.getLocation();
					if ((stack.getAmount() > 0) && (!item.isDead())
							&& (item.getPickupDelay() <= item.getTicksLived())) {
						Player closestPlayer = null;
						double distanceSmall = 5;
						for (Player player : getMagetedPlayers) {
							if ((player != null) && (player.getWorld().getName().equals(world.getName()))) {
								double playerDistance = player.getLocation().distance(location);
								if (playerDistance < distanceSmall) {
									distanceSmall = playerDistance;
									closestPlayer = player;
								}
							}
						}
						if (closestPlayer != null) {
							item.setVelocity(closestPlayer.getLocation().toVector()
									.subtract(item.getLocation().toVector()).normalize());
						}
					}
				}
			}
		}

	}

	@EventHandler
	public void nguoinguoisetringdiem(InventoryCloseEvent e) {
		
		Player p = (Player) e.getPlayer();
		ItemStack i = e.getInventory().getItem(4);
		
		if(e.getInventory().getTitle() != "§0§lGUI trang bị nhẫn >>") {
			return;
		}
	
		if(i == null) {
			IridiumBand.removeIridiumBandEffect(p.getName());
			return;
		}
		
		if(IridiumBand.isIridiumBand(i)) {
			IridiumBand.addIridiumBandEffect(p.getName());
			return;
		}
		
		
		
	}
	
}

package com.LinhDoraemon.shipping;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShippingListener implements Listener {

	private static HashMap<String, Inventory> inventories = new HashMap<String, Inventory>();

	private static Inventory getShippingBin(Player player) {
		Inventory i = inventories.get(player.getName());

		if (i == null) {
			i = Bukkit.createInventory(null, InventoryType.CHEST, "§0§lThùng bán đồ >>");
			inventories.put(player.getName(), i);
		}
		return i;
	}

	@EventHandler
	public void playerinteractmoshippingbinra(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}

		if (b.getType() != Material.TRAPPED_CHEST) {
			return;
		}
		
		if(e.getAction() != Action.RIGHT_CLICK_BLOCK) {
			return;
		}

		e.setCancelled(true);
		e.getPlayer().closeInventory();
		e.getPlayer().openInventory(getShippingBin(e.getPlayer()));
		e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_CHEST_OPEN, 2, 2);
		return;
	}

	@EventHandler
	public void bandongaylaptuckhongcandingu(InventoryCloseEvent e) {
		
		Player p = (Player) e.getPlayer();
		Inventory inv = e.getInventory();
		
		if(inv == null) {
			return;
		}
		
		if(inv.getTitle() != "§0§lThùng bán đồ >>") {
			return;
		}
		
		shipAllItems(p);
		
	}
	
	public static void shipAllItems(Player p) {

		Inventory inv = getShippingBin(p);

		for (ItemStack i : inv.getContents()) {
			ShippingType.sellAllCrops(p, i);
			ShippingType.sellAllOceans(p, i);
			ShippingType.sellAllArtisan(p, i);
			ShippingType.sellAllResources(p, i);
			ShippingType.sellAllLinhtinh(p, i);
			ShippingType.sellAllBuildingResource(p, i);
			ShippingType.sellAllAnimals(p, i);
			ShippingType.sellFruits(p, i);
		}
		
		inventories.remove(p.getName());

	}

	public static void sellAllItems() {
		for (Player p : Bukkit.getOnlinePlayers()) {
			shipAllItems(p);
			inventories.remove(p.getName());
		}
	}

}

package com.LinhDoraemon.fruit;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.inventory.ItemStack;

import com.LinhDoraemon.SpecialItem.StardewItems;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

public class FruitListener implements Listener {

	@EventHandler
	public void cayantraimocqua(StructureGrowEvent e) {

		if (TreeStorage.POMEGRANATE.contains(e.getLocation())) {
			e.setCancelled(true);
			FruitTreeAPI.POMEGRANATE.plant(e.getLocation().getBlock());
			TreeStorage.POMEGRANATE.remove(e.getLocation());
			return;
		}
		
		if (TreeStorage.CHERRY.contains(e.getLocation())) {
			e.setCancelled(true);
			FruitTreeAPI.CHERRY.plant(e.getLocation().getBlock());
			TreeStorage.CHERRY.remove(e.getLocation());
			return;
		}

		if (TreeStorage.APPLE.contains(e.getLocation())) {
			e.setCancelled(true);
			FruitTreeAPI.APPLE.plant(e.getLocation().getBlock());
			TreeStorage.APPLE.remove(e.getLocation());
			return;
		}
		
		if (TreeStorage.ORANGE.contains(e.getLocation())) {
			e.setCancelled(true);
			FruitTreeAPI.ORANGE.plant(e.getLocation().getBlock());
			TreeStorage.ORANGE.remove(e.getLocation());
			return;
		}
		
		if (TreeStorage.PEACH.contains(e.getLocation())) {
			e.setCancelled(true);
			FruitTreeAPI.PEACH.plant(e.getLocation().getBlock());
			TreeStorage.PEACH.remove(e.getLocation());
			return;
		}
		
	}

	@EventHandler
	public void trongcayanqua(BlockPlaceEvent e) {

		Block b = e.getBlock();
		ItemStack i = e.getItemInHand();

		if (b == null || i == null) {
			return;
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase(FruitTreeAPI.POMEGRANATE.getName())) {
			TreeStorage.POMEGRANATE.add(b.getLocation());
			return;
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase(FruitTreeAPI.CHERRY.getName())) {
			TreeStorage.CHERRY.add(b.getLocation());
			return;
		}

		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase(FruitTreeAPI.ORANGE.getName())) {
			TreeStorage.ORANGE.add(b.getLocation());
			return;
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase(FruitTreeAPI.APPLE.getName())) {
			TreeStorage.APPLE.add(b.getLocation());
			return;
		}
		
		if (i.getItemMeta() != null && i.getItemMeta().getDisplayName() != null
				&& i.getItemMeta().getDisplayName().equalsIgnoreCase(FruitTreeAPI.PEACH.getName())) {
			TreeStorage.PEACH.add(b.getLocation());
			return;
		}
	}
	
	@EventHandler
	public void dapmefruittreera(BlockBreakEvent e) {
		
		Block b = e.getBlock();
		
		if(b == null) {
			return;
		}

		if(TreeStorage.POMEGRANATE.contains(b.getLocation())) {
			e.setCancelled(true);
			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.ACORN());
			TreeStorage.POMEGRANATE.remove(b.getLocation());
			return;
		}
		
		if(TreeStorage.CHERRY.contains(b.getLocation())) {
			e.setCancelled(true);
			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.ACORN());
			TreeStorage.CHERRY.remove(b.getLocation());
			return;
		}
		
		if(TreeStorage.PEACH.contains(b.getLocation())) {
			e.setCancelled(true);
			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.ACORN());
			TreeStorage.PEACH.remove(b.getLocation());
			return;
		}
		
		if(TreeStorage.ORANGE.contains(b.getLocation())) {
			e.setCancelled(true);
			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.ACORN());
			TreeStorage.ORANGE.remove(b.getLocation());
			return;
		}
		
		if(TreeStorage.APPLE.contains(b.getLocation())) {
			e.setCancelled(true);
			b.getWorld().dropItemNaturally(b.getLocation(), StardewItems.ACORN());
			TreeStorage.APPLE.remove(b.getLocation());
			return;
		}
		
	}

	@EventHandler
	public void thuhoachcayantrai(PlayerInteractEvent e) {

		Block b = e.getClickedBlock();

		if (b == null) {
			return;
		}
		
		if(b.getType() != Material.SKULL) {
			return;
		}

		try {
			
			if(CustomSkull.getTexture(b) == null) {
				return;
			}
			
			if (CustomSkull.getTexture(b).equals(FruitTreeAPI.POMEGRANATE.getData())) {
				e.setCancelled(true);
				FruitTreeAPI.POMEGRANATE.harvest(b);
				return;
			}
			
			if (CustomSkull.getTexture(b).equals(FruitTreeAPI.CHERRY.getData())) {
				e.setCancelled(true);
				FruitTreeAPI.CHERRY.harvest(b);
				return;
			}
			
			if (CustomSkull.getTexture(b).equals(FruitTreeAPI.PEACH.getData())) {
				e.setCancelled(true);
				FruitTreeAPI.PEACH.harvest(b);
				return;
			}
			
			if (CustomSkull.getTexture(b).equals(FruitTreeAPI.ORANGE.getData())) {
				e.setCancelled(true);
				FruitTreeAPI.ORANGE.harvest(b);
				return;
			}
			
			if (CustomSkull.getTexture(b).equals(FruitTreeAPI.APPLE.getData())) {
				e.setCancelled(true);
				FruitTreeAPI.APPLE.harvest(b);
				return;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

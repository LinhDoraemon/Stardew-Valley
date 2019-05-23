package com.LinhDoraemon.energy;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EnergyEvent implements Listener {

	@EventHandler
	public void ENG_BLOCK_BREAK(BlockBreakEvent e) {
		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();
		
		if(i == null) {
			return;
		}
		
		if(i.getType().toString().toLowerCase().contains("axe")) {
			if(EnergyAPI.getEnergy(p) == 0) {
				e.setCancelled(true);
				p.sendMessage("§cHết năng lượng.");
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 2));
				return;
			}
			EnergyAPI.removeEnergy(p, 2);
		}
		
	}
	
	@EventHandler
	public void ADD_JOIN(PlayerJoinEvent e) {
		EnergyAPI.getEnergyBar(e.getPlayer());
	}
	
	@EventHandler
	public void REMOVE_QUIT(PlayerQuitEvent e) {
		EnergyAPI.hide(e.getPlayer());
	}
	
	@EventHandler
	public void ENG_USING_HOE(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		Block b = e.getClickedBlock();
		ItemStack i = p.getInventory().getItemInMainHand();
		
		if(i == null || b == null) {
			return;
		}
		
		if(i.getType().toString().toLowerCase().contains("hoe") == false) {
			return;
		}
		
		if(b.getType() != Material.DIRT) {
			return;
		}
		if(EnergyAPI.getEnergy(p) == 0) {
			e.setCancelled(true);
			p.sendMessage("§cHết năng lượng.");
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 2));
			return;
		}
		
		EnergyAPI.removeEnergy(p, 2);
		
	}
	
}
